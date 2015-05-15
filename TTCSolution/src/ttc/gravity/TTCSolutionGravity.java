package ttc.gravity;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.moflon.core.utilities.eMoflonEMFUtil;

import ttc.gravity.convert.JavaSourceToEMFConverter;
import ttc.testdsl.tTCTest.Create_Superclass_Refactoring;
import ttc.testdsl.tTCTest.Java_Class;
import ttc.testdsl.tTCTest.Java_Method;
import ttc.testdsl.tTCTest.Pull_Up_Refactoring;
import ttc.testsuite.interfaces.TestInterface;
import Refactorings.Refactoring;
import Refactorings.RefactoringsFactory;
import Refactorings.Containers.ContainersFactory;
import Refactorings.Containers.TClassContainer;
import TypeGraphBasic.TClass;
import TypeGraphBasic.TMethod;
import TypeGraphBasic.TMethodSignature;
import TypeGraphBasic.TPackage;
import TypeGraphBasic.TParameterList;
import TypeGraphBasic.TypeGraph;
import TypeGraphBasic.TypeGraphBasicFactory;


public class TTCSolutionGravity implements TestInterface{

	TypeGraph pg_copy;
	Refactoring refactoringSDM;
	
	private File programPath;
	private File logPath;
	private File tmpPath;
	private JavaSourceToEMFConverter conv;
	private List<ttc.testdsl.tTCTest.Refactoring> bookkeeping;
	private boolean eclipseMode = false;
	
	public TTCSolutionGravity() {
		
	}
	
	public void eclipseMode(){
		eclipseMode  = true;
	}
	
	public static void main(String[] args){
		
	}
	
	public boolean createProgramGraph(String path) {
		try{
			conv = new JavaSourceToEMFConverter(tmpPath, eclipseMode);
			programPath = new File(path);
			conv.setTestInputPath(programPath);
			
			conv.codeToModel(programPath, tmpPath);
			pg_copy = EcoreUtil.copy(conv.getPG());
			refactoringSDM = RefactoringsFactory.eINSTANCE.createRefactoring();
			refactoringSDM.setPg(pg_copy);
			
			bookkeeping = new ArrayList<ttc.testdsl.tTCTest.Refactoring>();
			
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean applyPullUpMethod(Pull_Up_Refactoring refactoring) {
		TClass 	parent = null;
		String[] namespaces = refactoring.getParent().getPackage().split(Pattern.quote("."));
		for(TPackage p : pg_copy.getPackages()){
			if(p.getTName().compareTo(namespaces[0])==0){
				TPackage current = p;
				for(int i =1; i< namespaces.length; i++){
					String name = namespaces[i];
					boolean found = false;
					for(TPackage child_package : current.getSubpackage()){
						if(child_package.getTName().compareTo(name)==0){
							current = child_package;
							found = true;
						}
					}
					if(!found){
						return false;
					}
				}
				boolean found = false;
				for(TClass tClass : current.getContainedClasses()){
					if(tClass.getTName().compareTo(refactoring.getParent().getClass_name())==0){
						parent = tClass;
						found = true;
					}
				}
				if(!found){
					return false;
				}
			}
		}
		if(parent==null){
			return false;
		}
		 //Search Method Signature
		 TMethod name;
		 for(TMethod m : pg_copy.getMethods()){
			 Java_Method java_method = refactoring.getMethod();
			 if(m.getTName().compareTo(java_method.getMethod_name())==0){
				 name = m;
				 EList<Java_Class> dsl_params = java_method.getParams();
				 for(TMethodSignature s : name.getSignatures()){
					 TParameterList pg_params = s.getParamList();
					 if(gravity.Support.compareParamList(dsl_params, pg_params)){
						 boolean pum_isApplicable = refactoringSDM.pum_isApplicable(s, parent);
						 if(pum_isApplicable){
							 conv.addChange(refactoringSDM.pum_Perform(s, parent));
							 bookkeeping.add(refactoring);
						 }
						 return pum_isApplicable; 
					 }
				 }
			 }
		 }
		return false;
	}

	public boolean applyCreateSuperclass(Create_Superclass_Refactoring refactoring) {
		TClassContainer tClasses = ContainersFactory.eINSTANCE.createTClassContainer();
		for(Java_Class c : refactoring.getChild().getClasses()){
			String[] namespaces = c.getPackage().split(Pattern.quote("."));
			for(TPackage p : pg_copy.getPackages()){
				if(p.getTName().compareTo(namespaces[0])==0){
					TPackage current = p;
					for(int i =1; i< namespaces.length; i++){
						String name = namespaces[i];
						boolean found = false;
						for(TPackage child_package : current.getSubpackage()){
							if(child_package.getTName().compareTo(name)==0){
								current = child_package;
								found = true;
							}
						}
						if(!found){
							System.out.println("DID NOT FOUND PACKAGE OF CHILD CLASS");
							return false;
						}
					}
					boolean found = false;
					for(TClass tClass : current.getContainedClasses()){
						if(tClass.getTName().compareTo(c.getClass_name())==0){
								tClasses.getTClass().add(tClass);
								found = true;
							}
						}
						if(!found){
							System.out.println("DID NOT FOUND CHILD CLASS");
							return false;
						}
					}
				}
			}	
			if(tClasses.getTClass().size()!=refactoring.getChild().getClasses().size()){
				System.out.println("DID NOT FOUND ALL CHILD CLASSES");
				return false;
			}
			TClass 	new_parent =TypeGraphBasicFactory.eINSTANCE.createTClass();
					new_parent.setTName(refactoring.getTarget().getClass_name());
					
			TPackage leaf = null;
			for(String s : refactoring.getTarget().getPackage().split(Pattern.quote("."))){
				TPackage 	p = TypeGraphBasicFactory.eINSTANCE.createTPackage();
							p.setTName(s);
				if(leaf!=null){
					p.setParent(leaf);
				}
				leaf = p;
			}
			if(leaf!=null){
				new_parent.setPackage(leaf);
				leaf.getContainedClasses().add(new_parent);
			}
			
			boolean csc_isApplicable = refactoringSDM.csc_isApplicable(tClasses, new_parent);
			if(csc_isApplicable){
				bookkeeping.add(refactoring);
				conv.addChange(refactoringSDM.csc_Perform(tClasses, new_parent));
			}
			
			return csc_isApplicable;
		}

	public boolean synchronizeChanges(File out) {
		try {
			conv.modelToCode(new File(tmpPath,"refactored_progam"), bookkeeping);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean synchronizeChanges() {
		try {
			conv.modelToCode(programPath, bookkeeping);
		} catch (IOException e) {
			return false;
		}
		return true;
	}

	public boolean usesProgramGraph() {
		return true;
	}

	public String getPluginName() {
		return "GraViTY";
	}

	public void setPermanentStoragePath(File path) {
		programPath = path;
	}

	public void setLogPath(File path) {
		logPath = path;
	}

	public void setTmpPath(File path) {
		tmpPath = path;
		if(!eclipseMode){
			try{
				File models = new File(new File(tmpPath, "GravityTGG"),"model");
				models.mkdirs();
				File rules = new File(models,"GravityTGG.sma.xmi");
				if(rules.exists()){
					rules.delete();
				}
				InputStream link = (getClass().getResourceAsStream("/GravityTGG/model/GravityTGG.sma.xmi"));
				Files.copy(link, rules.getAbsoluteFile().toPath());
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	public void setProgramLocation(String path) {
		programPath = new File(path);
	}

	public void savePG(String string) {
		eMoflonEMFUtil.saveModel(EcoreUtil.copy(pg_copy), string);
	}

	public void saveJaMoPP(String string) {
		conv.saveJaMoPP(string);
	}

}
