package org.moflon.tie;

import java.io.IOException;









import java.util.List;








import java.util.regex.Pattern;

import org.apache.log4j.BasicConfigurator;
import org.moflon.tgg.algorithm.datastructures.SynchronizationProtocol;
import org.moflon.util.eMoflonEMFUtil;
import org.moflon.ide.debug.DebugSynchronizationHelper;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;













import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.JavaPackage;

import ttc.testdsl.tTCTest.Classes;
import ttc.testdsl.tTCTest.Create_Superclass_Refactoring;
import ttc.testdsl.tTCTest.Java_Class;
import ttc.testdsl.tTCTest.Java_Method;
import ttc.testdsl.tTCTest.Pull_Up_Refactoring;
import ttc.testdsl.tTCTest.TTCTestFactory;
import GravityTGG.GravityTGGPackage;
import Refactorings.Refactoring;
import Refactorings.RefactoringsFactory;
import Refactorings.Containers.ContainersFactory;
import Refactorings.Containers.TClassContainer;
import TGGRuntime.CorrespondenceModel;
import TypeGraphBasic.TClass;
import TypeGraphBasic.TMethod;
import TypeGraphBasic.TMethodSignature;
import TypeGraphBasic.TPackage;
import TypeGraphBasic.TParameterList;
import TypeGraphBasic.TypeGraph;
import TypeGraphBasic.TypeGraphBasicFactory;


public class GravityTGGSync extends DebugSynchronizationHelper {

	private TClass csc_new_parent;
	private TClassContainer csc_child;
	private TClass pum_parent;
	private TMethodSignature pum_method;

	public GravityTGGSync() throws IOException {
		// Register packages
		eMoflonEMFUtil.init(GravityTGGPackage.eINSTANCE);
                
        // Load rules and set correspondence
		setCorrPackage(GravityTGGPackage.eINSTANCE);
		loadRulesFromProject("..");
	}
	
	public GravityTGGSync(String project_path) throws IOException {
		// Register packages
		eMoflonEMFUtil.init(GravityTGGPackage.eINSTANCE);
		eMoflonEMFUtil.init(JavaPackage.eINSTANCE);
                
        // Load rules and set correspondence
		setCorrPackage(GravityTGGPackage.eINSTANCE);
		loadRulesFromProject(project_path);
	}

	public void syncBackward(EObject src, EObject corr, EObject trg, SynchronizationProtocol protocol, List<ttc.testdsl.tTCTest.Refactoring> bookkeeping) {
		setSrc(src);
		setTrg(trg);
		setCorr(corr);
		setSynchronizationProtocol(protocol);
		
		setChangeTrg(root -> {
			Refactoring refactoring = RefactoringsFactory.eINSTANCE.createRefactoring();
						refactoring.setPg((TypeGraph) getTrg());
						
			for(ttc.testdsl.tTCTest.Refactoring c : bookkeeping){
				if(c instanceof Create_Superclass_Refactoring){
					calculateCSC((TypeGraph)getTrg(),(Create_Superclass_Refactoring)c);
					refactoring.csc_Perform(csc_child, csc_new_parent);
				}
				else if(c instanceof Pull_Up_Refactoring){
					calculatePUM((TypeGraph)getTrg(),(Pull_Up_Refactoring)c);
					refactoring.pum_Perform(pum_method, pum_parent);
				}
			}
			bookkeeping.clear();
			
		});
		integrateBackward();
	}

	private void calculatePUM(TypeGraph pg_copy, Pull_Up_Refactoring refactoring) {
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
						return;
					}
				}
				boolean found = false;
				for(TClass tClass : current.getContainedClasses()){
					if(tClass.getTName().compareTo(refactoring.getParent().getClass_name())==0){
						pum_parent = tClass;
						found = true;
					}
				}
				if(!found){
					return;
				}
			}
		}
		if(pum_parent==null){
			return;
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
						pum_method = s;
						return;
					 }
				 }
			 }
		 }
	}

	private void calculateCSC(TypeGraph pg,
			Create_Superclass_Refactoring refactoring) {
		csc_child = ContainersFactory.eINSTANCE.createTClassContainer();
		
		for(Java_Class c : refactoring.getChild().getClasses()){
			String[] namespaces = c.getPackage().split(Pattern.quote("."));
											
			for(TPackage p : pg.getPackages()){
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
							return;
						}
					}
					boolean found = false;
					for(TClass tClass : current.getContainedClasses()){
						if(tClass.getTName().compareTo(c.getClass_name())==0){
							csc_child.getTClass().add(tClass);
							found = true;
						}
					}
					if(!found){
						return;
					}
				}
			}
		}	
		if(csc_child.getTClass().size()!=refactoring.getChild().getClasses().size()){
			return;
		}
		csc_new_parent = TypeGraphBasicFactory.eINSTANCE.createTClass();
				csc_new_parent.setTName(refactoring.getTarget().getClass_name());
										
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
			csc_new_parent.setPackage(leaf);
			leaf.getContainedClasses().add(csc_new_parent);
		}
	}
	
	private void loadTriple(String corr){ 
		try {
			loadCorr(corr);
			CorrespondenceModel corrModel = (CorrespondenceModel) getCorr();
			setSrc(corrModel.getSource());
			setTrg(corrModel.getTarget());
		} catch (IllegalArgumentException iae) {
			System.err.println("Unable to load input triple for " + corr
					+ ", " + iae.getMessage());
		}
	}
}