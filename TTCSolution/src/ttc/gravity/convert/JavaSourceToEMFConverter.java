package ttc.gravity.convert;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emftext.language.java.JavaClasspath;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.imports.ClassifierImport;
import org.emftext.language.java.imports.Import;
import org.emftext.language.java.imports.ImportsFactory;
import org.emftext.language.java.members.ClassMethod;
import org.emftext.language.java.modifiers.AnnotationInstanceOrModifier;
import org.emftext.language.java.modifiers.ModifiersFactory;
import org.emftext.language.java.modifiers.Private;
import org.emftext.language.java.modifiers.Protected;
import org.emftext.language.java.modifiers.Public;
import org.emftext.language.java.parameters.Parameter;
import org.emftext.language.java.references.MethodCall;
import org.emftext.language.java.references.ReferenceableElement;
import org.emftext.language.java.resource.JaMoPPUtil;
import org.emftext.language.java.resource.java.IJavaOptions;
import org.emftext.language.java.resource.java.mopp.JavaResource;
import org.emftext.language.java.types.ClassifierReference;
import org.emftext.language.java.types.PrimitiveType;
import org.emftext.language.java.types.Type;
import org.emftext.language.java.types.TypeReference;
import org.moflon.tgg.algorithm.datastructures.SynchronizationProtocol;
import org.moflon.tie.GravityTGGSync;
import org.moflon.tie.GravityTGGTrafo;
import org.moflon.util.eMoflonEMFUtil;

import ExtendedJamopp.ExtendedClassMethod;
import ExtendedJamopp.ExtendedJamoppFactory;
import ExtendedJamopp.ExtendedJamoppJavaContainer;
import ExtendedJamopp.ExtendedJamoppPackageElement;
import ExtendedJamopp.ExtendedMethodName;
import ExtendedJamopp.ExtendedParameter;
import ExtendedJamopp.ExtendedParameterList;
import ExtendedJamopp.ExtendedType;
import GravityTGG.ClassMethodToTMethodDefinition;
import GravityTGG.FieldToTFieldDefinition;
import GravityTGG.Postprocessing.MemberCorrespondence;
import GravityTGG.Postprocessing.PostprocessingFactory;
import GravityTGG.Postprocessing.TGGPostprocessing;
import Refactorings.Containers.TClassContainer;
import TGGRuntime.CorrespondenceModel;
import TypeGraphBasic.TClass;
import TypeGraphBasic.TPackage;
import TypeGraphBasic.TypeGraph;


public class JavaSourceToEMFConverter {
	private File testInputFolder;
	
	private HashSet<String> ignore;
	private HashSet<String> userdefined;
	private HashSet<String> changed;
	private ResourceSet rs;

	File tggProject;

	private GravityTGGTrafo tgg;

	private TypeGraph pg;

	private CorrespondenceModel corr;

	private EObject src;

	private EObject trg;

	private SynchronizationProtocol protocol;

	private File tmp;

	public JavaSourceToEMFConverter(File tmp, boolean eclipseMode) throws IOException {
		this.tmp = tmp;
		
		//Init JaMoPP
		rs = new ResourceSetImpl();
		rs.getLoadOptions().put(IJavaOptions.DISABLE_LAYOUT_INFORMATION_RECORDING, Boolean.TRUE);
		rs.getLoadOptions().put(JavaClasspath.OPTION_USE_LOCAL_CLASSPATH,Boolean.TRUE);

		JaMoPPUtil.initialize();
		
		//Init Moflon
		if(eclipseMode){
			File working_dir = new File(JavaSourceToEMFConverter.class.getProtectionDomain().getCodeSource().getLocation().getFile());
			tggProject = working_dir.getParentFile().getParentFile();
		}
		else{
			tggProject = tmp;
		}
		
		BasicConfigurator.configure();
		
		tgg = new GravityTGGTrafo(tggProject.toString());
		
	}


	public void codeToModel(File in, File out) throws IOException {
		
		ignore = new HashSet<String>();
		userdefined = new HashSet<String>();
		changed = new HashSet<String>();
		
		File source_folder = new File(in,"src");
		
		JavaClasspath 	cp = JavaClasspath.get(rs);
						cp.registerSourceOrClassFileFolder(URI.createFileURI(source_folder.getAbsolutePath()));
		
		Set<CompilationUnit> cus = searchJavaFiles(in);	
		
		
		resolveAllProxies(0);
				
		Stack<CompilationUnit> 	stack = new Stack<CompilationUnit>();
								stack.addAll(cus);
								
		ExtendedJamoppJavaContainer ejjc = createExtendedJamoppContainer(source_folder, cus);
		
		//TODO: Remove save
		File trafo_folder = new File(tmp,"trafo");
		if(!trafo_folder.exists()){
			trafo_folder.mkdirs();
		}
		File extended_jamopp = new File(trafo_folder,"fwd_ext_jamopp.xmi");
		eMoflonEMFUtil.saveModel(ejjc, extended_jamopp.toString());
		//TODO: END
			
		ExtendedJamoppJavaContainer processed_ejjc = collectParameters(replaceClassMethods(extended_jamopp, new File(extended_jamopp.getParent(), "fwd_ext_jamopp_processed.xmi")), cus);	
		
		tgg.performForward(processed_ejjc);
			
		
		corr = tgg.getCorr();
		src= tgg.getSrc();
		trg = tgg.getTrg();
		protocol = tgg.getSynchronizationProtocol();
		
		pg =(TypeGraph) tgg.getTrg();
		
		Set<ClassMethodToTMethodDefinition> methods = new HashSet<ClassMethodToTMethodDefinition>();
		
		TGGPostprocessing 	postprocessing = PostprocessingFactory.eINSTANCE.createTGGPostprocessing();
							postprocessing.setPg(pg);
		
		for(EObject correspondence : corr.getCorrespondences()){
			if(correspondence instanceof FieldToTFieldDefinition){
				MemberCorrespondence 	c = PostprocessingFactory.eINSTANCE.createMemberCorrespondence();
								c.setSource(((FieldToTFieldDefinition) correspondence).getSource());
								c.setTarget(((FieldToTFieldDefinition) correspondence).getTarget());
				postprocessing.getMemberCorrespondences().add(c);
			}
			else if(correspondence instanceof ClassMethodToTMethodDefinition){
				MemberCorrespondence 	c = PostprocessingFactory.eINSTANCE.createMemberCorrespondence();
								c.setSource(((ClassMethodToTMethodDefinition) correspondence).getSource());
								c.setTarget(((ClassMethodToTMethodDefinition) correspondence).getTarget());
				postprocessing.getMemberCorrespondences().add(c);
				
				methods.add((ClassMethodToTMethodDefinition) correspondence);
			}
		}
		
		for(ClassMethodToTMethodDefinition correspondence : methods){
			postprocessing.createAccessEdgesForMethod(correspondence);
		}
			
	}


	public ExtendedJamoppJavaContainer replaceClassMethods(File in, File out)
			throws FileNotFoundException, IOException {
		BufferedReader reader = new  BufferedReader(new FileReader(in));
		
		if(out.exists()){
			out.delete();
		}
		out.createNewFile();
					
		BufferedWriter writer = new BufferedWriter(new FileWriter(out));
		
		String line =reader.readLine();
		while(line!=null){
			writer.write(line.replace("members:ClassMethod", "ExtendedJamopp:ExtendedClassMethod").concat("\n"));
			line = reader.readLine();
		}
		reader.close();
		writer.close();
		
		ExtendedJamoppJavaContainer processed_ejjc = (ExtendedJamoppJavaContainer) eMoflonEMFUtil.loadModel(out.toString());
		
		return processed_ejjc;
	}


	public ExtendedJamoppJavaContainer collectParameters(ExtendedJamoppJavaContainer ejjc, Set<CompilationUnit> cus){
		
		Hashtable<ExtendedClassMethod, TreeNode> methods = new Hashtable<ExtendedClassMethod, TreeNode>();
		
		Hashtable<String, Hashtable<String, TreeNode>> method_signatures = new Hashtable<String, Hashtable<String,TreeNode>>();
		
		TreeIterator<EObject> contents = ejjc.eAllContents();
		while(contents.hasNext()){
			EObject next = contents.next();
			if(next instanceof ExtendedClassMethod){
				ExtendedClassMethod ecm = (ExtendedClassMethod) next;		
				Hashtable<String, TreeNode> currentTreeElements;
				TreeNode currentTreeElement = null;
				if(method_signatures.containsKey(ecm.getName())){
					currentTreeElements = method_signatures.get(ecm.getName());
				}
				else{
					currentTreeElements = new Hashtable<String, TreeNode>();
				}
				EList<Parameter> parameters = ((ExtendedClassMethod) next).getParameters();
				if(parameters.size()>0){
					for(Parameter param : parameters){
						TypeReference typeReference = param.getTypeReference();
						Type type = null;
						if(typeReference instanceof TypeReference){
							type = typeReference.getTarget();
						}
						else if(typeReference instanceof PrimitiveType){
							type = (PrimitiveType) typeReference;
						}
						String key;
						if(type instanceof ConcreteClassifier){
							key = ((ConcreteClassifier) type).getContainingCompilationUnit().getName();
							key = key.substring(0, key.length()-5);
						}
						else if(type instanceof Type){
							String name = type.getClass().getName();
							key = type.getClass().getName().substring(37, name.length()-4);
						}
						else{
							throw new RuntimeException();
						}
						
						if(currentTreeElements.containsKey(key)){
							currentTreeElement = currentTreeElements.get(key);
							currentTreeElements = currentTreeElement.child;
						}
						else{
							TreeNode newTreeNode = new TreeNode(type, currentTreeElement);
							currentTreeElements.put(key, newTreeNode);
							if(currentTreeElement==null){
								method_signatures.put(ecm.getName(), currentTreeElements);
							}
							else{
								currentTreeElement.child.put(key, newTreeNode);
							}
							currentTreeElement = newTreeNode;
							currentTreeElements = currentTreeElement.child;
						}
						
					}
				}
				else{
					if(currentTreeElements.containsKey("")){
						currentTreeElement = currentTreeElements.get("");
					}
					else{
						currentTreeElement = new TreeNode(null, null);
						currentTreeElements.put("",currentTreeElement);
					}
					method_signatures.put(ecm.getName(), currentTreeElements);
				}
				currentTreeElement.methods.add(ecm);
				methods.put(ecm, currentTreeElement);
			}
		}
		
		Hashtable<TreeNode, ExtendedParameterList> created_lists = new Hashtable<TreeNode, ExtendedParameterList>();
		
		Hashtable<String, ExtendedMethodName> method_names = new Hashtable<String, ExtendedMethodName>();
		
		for(String method_name : method_signatures.keySet()){
			ExtendedMethodName 	mn = ExtendedJamoppFactory.eINSTANCE.createExtendedMethodName();
								mn.setName(method_name);
								
			ejjc.getExtendedMethodName().add(mn);
			method_names.put(method_name, mn);
		}
		
		for(ExtendedClassMethod ecm : methods.keySet()){
			ExtendedMethodName mn = method_names.get(ecm.getName());
			mn.getExtendedClassMethod().add(ecm);
			ecm.setExtendedMethodName(mn);
			
			TreeNode node = methods.get(ecm);
			if(created_lists.containsKey(node)){
				ecm.setParameter_list(created_lists.get(node));
			}
			else{
				ExtendedParameterList list = ExtendedJamoppFactory.eINSTANCE.createExtendedParameterList();
				ecm.setParameter_list(list);
				
				ExtendedParameter next_param = null;
				while(node!=null){
					if(node.type!=null){
						ExtendedType 	extendedType = ExtendedJamoppFactory.eINSTANCE.createExtendedType();				
										extendedType.setTypeName(node.key);
										extendedType.setIsFromLib(
												!userdefined.contains(node.type.getContainingCompilationUnit().getName())
												|| (node.type instanceof PrimitiveType));
										if(!extendedType.isIsFromLib()){
											extendedType.setType(node.type);
										}
										
						ExtendedParameter 	param = ExtendedJamoppFactory.eINSTANCE.createExtendedParameter();
											param.setExtendedParameterType(extendedType);
						if(next_param!=null){
							param.setNext(next_param);
							next_param.setPrevious(param);
						}
						list.getValues().add(param);
						next_param=param;
					}
					node = node.parent;
				}
				list.setFirst(next_param);
				ecm.setParameter_list(list);
				ejjc.getExtendedParameterList().add(list);
				created_lists.put(methods.get(ecm), list);
			}
		
			TypeReference typeReference = ecm.getTypeReference();
			Type returnType = null;
			if(typeReference instanceof TypeReference){
				returnType = typeReference.getTarget();
			}
			else if(typeReference instanceof PrimitiveType){
				returnType = (PrimitiveType) typeReference;
			}
			String returnTypeName = "";
			if(returnType instanceof ConcreteClassifier){
				returnTypeName = ((ConcreteClassifier) returnType).getContainingCompilationUnit().getName();
				returnTypeName = returnTypeName.substring(0, returnTypeName.length()-5);
			}
			else if(returnType instanceof Type && !(returnType instanceof org.emftext.language.java.types.Void)){
				String name = returnType.getClass().getName();
				returnTypeName = returnType.getClass().getName().substring(37, name.length()-4);
			}
			
			ExtendedType extendedReturnType = ExtendedJamoppFactory.eINSTANCE.createExtendedType();				
			extendedReturnType.setTypeName(returnTypeName);
			extendedReturnType.setIsFromLib(
					!userdefined.contains(returnType.getContainingCompilationUnit().getName())
					|| (returnType instanceof PrimitiveType));
			if(!extendedReturnType.isIsFromLib()){
				extendedReturnType.setType(returnType);
			}
			ecm.setExtendedReturnType(extendedReturnType);
		}
		return ejjc;
	}
	
	private ExtendedJamoppJavaContainer createExtendedJamoppContainer(File input_program_location,	Set<CompilationUnit> jamopp_resource) {
		ExtendedJamoppJavaContainer ejjc;
		ExtendedJamoppFactory factory = ExtendedJamoppFactory.eINSTANCE;
		
		ejjc = factory.createExtendedJamoppJavaContainer();
		
		List<ExtendedJamoppPackageElement> roots = new ArrayList<ExtendedJamoppPackageElement>();
		
		ExtendedJamoppPackageElement active = null;						
		
		for(CompilationUnit compilationUnit : jamopp_resource){
			userdefined.add(compilationUnit.getName());
			ejjc.getCompilationUnit().add(compilationUnit);
			EList<String> namespaces = compilationUnit.getNamespaces();
			File file = new File(input_program_location, namespaces.get(0));
			if(!(file.exists())){
				ignore.add(compilationUnit.getName());
			}
			for(String name : namespaces){
				boolean change = false;
				List<ExtendedJamoppPackageElement> successor;
				if(active!=null){
					successor = active.getSuccessor();
				}
				else{
					successor = roots;
				}
					
				for(ExtendedJamoppPackageElement suc: successor){
					if(suc.getName().equals(name)){
						active = suc;
						change = true;
					}
				}
				if(!change){
					ExtendedJamoppPackageElement node = factory.createExtendedJamoppPackageElement();
												 node.setName(name);
												 node.setPredessor(active);
					ejjc.getExtendedJamoppPackageElement().add(node);
					if(active!=null){
						successor.add(node);
					}
					else{
						roots.add(node);
					}
					active = node;
				}
			}
			active.getCompilationUnit().add(compilationUnit);
			active = null;
		}
		ejjc.getRoots().addAll(roots);
		return ejjc;
	}


	public void modelToCode(File out, List<ttc.testdsl.tTCTest.Refactoring> bookkeeping) throws IOException{
		GravityTGGSync 	sync = new GravityTGGSync(tggProject.toString());
						sync.syncBackward(src, corr, trg, protocol, bookkeeping);
		
		ExtendedJamoppJavaContainer model = (ExtendedJamoppJavaContainer) sync.getSrc();
		
		File src_folder = null;
		if(out.getName().equals("src") && out.isDirectory()){
			src_folder=out;
		}
		else{
			boolean found = false;
			File[] listFiles = out.listFiles();
			if(listFiles!=null){
				for(File f : listFiles){
					if(f.getName().equals("src") && f.isDirectory()){
						src_folder = f;
						found = true;
						break;
					}
				}
			}
			if(!found){
				src_folder = new File(out, "src");
			}
		}
		if(!src_folder.exists()){
			src_folder.mkdirs();
		}
		
		List<CompilationUnit> leaves = new ArrayList<CompilationUnit>();
		List<ExtendedJamoppPackageElement> packages = new ArrayList<ExtendedJamoppPackageElement>();
		for(ExtendedJamoppPackageElement ejpe : model.getRoots()){
			Stack<ExtendedJamoppPackageElement> stackEJPE = new Stack<ExtendedJamoppPackageElement>();
			stackEJPE.push(ejpe);
		
			while(!stackEJPE.isEmpty()){
				ExtendedJamoppPackageElement parent = stackEJPE.pop();
				EList<CompilationUnit> contained = parent.getCompilationUnit();
				if(contained.size()>0){
					for(CompilationUnit cu : contained){
						String name = cu.getName();
						if(!ignore.contains(name)){
							leaves.add(cu);
							packages.add(parent);
						}
					}
				}
				stackEJPE.addAll(parent.getSuccessor());
			}
		}
		
		for(int i=leaves.size()-1; i>=0; i--){
			CompilationUnit cu = leaves.remove(i);
			ConcreteClassifier jClass = cu.getClassifiers().get(0);
			
			EList<Import> 	imports = cu.getImports();
			
			Set<ConcreteClassifier> classifiers = new HashSet<ConcreteClassifier>();
			
			for(Import existing_import : imports){
				classifiers.addAll(existing_import.getImportedClassifiers());
			}
			
			TreeIterator<EObject> eAllContents = jClass.eAllContents();
			while(eAllContents.hasNext()){
				EObject e = eAllContents.next();
				if(e instanceof ClassifierReference){
					Classifier target = ((ClassifierReference) e).getTarget();
					if(target instanceof ConcreteClassifier && !classifiers.contains(target)){
						ConcreteClassifier concrete_target = (ConcreteClassifier) target;
						
						ClassifierImport 	new_import = ImportsFactory.eINSTANCE.createClassifierImport();
											new_import.setClassifier(concrete_target);
											new_import.getNamespaces().addAll(concrete_target.getContainingPackageName());
											
						imports.add(new_import);											
						classifiers.add(concrete_target);
					}
				}
			}
			
			ArrayList<String> namespaces = new ArrayList<String>();
			ExtendedJamoppPackageElement parent = packages.get(i);
			while(parent!=null){
				namespaces.add(0, parent.getName());
				parent = parent.getPredessor();
			}
		
			cu.setName(jClass.getName()+".java");
			
			EList<String> namespaces_cu = cu.getNamespaces();
			namespaces_cu.clear();
			namespaces_cu.addAll(namespaces);
			
			String fully_qualified_name = cu.getName();
			String[] names = fully_qualified_name.split("\\.");
			if(names.length<=2){
				String tmp = "";
				for(String s : cu.getNamespaces()){
					tmp = tmp.concat(s).concat(".");
				}
				fully_qualified_name = tmp.concat(fully_qualified_name);
			}
			if(changed.contains(fully_qualified_name)){
				for(ConcreteClassifier c : cu.getClassifiers()){
					boolean has_access_modifier = false;
					EList<AnnotationInstanceOrModifier> annotationsAndModifiers = c.getAnnotationsAndModifiers();
					for(AnnotationInstanceOrModifier m :annotationsAndModifiers){
						has_access_modifier |= (m instanceof Private || m instanceof Protected || m instanceof Public);
					}
					if(!has_access_modifier){
						annotationsAndModifiers.add(ModifiersFactory.eINSTANCE.createPublic());
					}
				}
				
				URI javaFile = URI.createFileURI(cu.getName());
				Resource javaRes = rs.createResource(javaFile);
				javaRes.getContents().add(cu);
				File search_file = src_folder;
				for(String ns : namespaces_cu){
					search_file = new File(search_file, ns);
				}
				search_file.mkdirs();
				search_file = new File(search_file, cu.getName());
				if(search_file.exists() && search_file.isFile()){
					search_file.delete();
				}
				try {
					javaRes.save(new FileOutputStream(search_file), Collections.emptyMap());
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		changed = new HashSet<String>();
	}


	public Set<CompilationUnit> searchJavaFiles(File path){
		Set<CompilationUnit> cus = new HashSet<CompilationUnit>();
		Stack<File> files = new Stack<File>();
					files.push(path);
		while(files.size()>0){
			File[] listFiles = files.pop().listFiles();
			if(listFiles!=null){
				for(File f : listFiles){
					if(f.isDirectory()){
						files.push(f);
					}
					else{
						if(f.getName().endsWith("java")){
							URI uri = URI.createFileURI(f.getAbsolutePath());
							JavaResource resource = (JavaResource) rs.getResource(uri, true);
							cus.add((CompilationUnit)resource.getContents().get(0));
						}
					}
				}
			}
		}
		return cus;
	}
	
	protected boolean resolveAllProxies(int resourcesProcessedBefore) {
		boolean failure = false;
		List<EObject> eobjects = new LinkedList<EObject>();
		for (Iterator<Notifier> i = rs.getAllContents(); i.hasNext();) {
			Notifier next = i.next();
			if (next instanceof EObject) {
				eobjects.add((EObject) next);
			}
		}
		int resourcesProcessed = rs.getResources().size();
		if (resourcesProcessed == resourcesProcessedBefore) {
			return true;
		}

		for (EObject next : eobjects) {
			InternalEObject nextElement = (InternalEObject) next;
			for (EObject crElement : nextElement.eCrossReferences()) {
				crElement = EcoreUtil.resolve(crElement, rs);
				if (crElement.eIsProxy()) {
					failure = true;
				} else {
				}
			}
		}
		return !failure && resolveAllProxies(resourcesProcessed);
	}
	
	public void setTestInputPath(File testInputFolder){
		this.testInputFolder = testInputFolder;
	}
	
	protected File getTestInputPath(){
		return testInputFolder;
	}
	
	public TypeGraph getPG(){
		return pg;
	}
	
	public void setPG(TypeGraph pg){
		this.pg = pg;
	}
	
	public void saveJaMoPP(String string) {
		eMoflonEMFUtil.saveModel(EcoreUtil.copy(src), string);
	}


	public void addChange(TClassContainer container) {
		for(TClass c : container.getTClass()){
			String name = c.getTName()+".java";
			TPackage p = c.getPackage();
			while(p!=null){
				name = p.getTName()+"."+name;
				p = p.getParent();
			}
			if(!changed.contains(name)){
				changed.add(name);
			}
		}
	}
}
