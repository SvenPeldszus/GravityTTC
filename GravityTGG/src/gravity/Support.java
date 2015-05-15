package gravity;

import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;

import ttc.testdsl.tTCTest.Java_Class;
import TypeGraphBasic.TClass;
import TypeGraphBasic.TPackage;
import TypeGraphBasic.TParameter;
import TypeGraphBasic.TParameterList;

public class Support {
	public static boolean compareParamList(EList<Java_Class> dsl_params, TParameterList pg_params) {
		TParameter pg_param = pg_params.getFirst();
		for(int j=0; j<dsl_params.size();j++){
			if(pg_param == null){
				return false;
			}
			if(!compareClass(pg_param.getTClass(), dsl_params.get(j))){
				 return false;
			}
			pg_param = pg_param.getNext();
		}
		if(pg_param!=null){
			return false;
		}
		 return true;
	}

	private static boolean compareClass(TClass pg_p, Java_Class dsl_p) {
		if(pg_p.getTName().toLowerCase().endsWith(dsl_p.getClass_name().toLowerCase())){
			 String dsl_package_string = dsl_p.getPackage();
			 String[] dsl_namespaces;
			 if(dsl_package_string!=null){
				 dsl_namespaces= dsl_package_string.split(Pattern.quote("."));
			 }
			 else{
				 dsl_namespaces = new String[0];
			 }
			 TPackage pg_package = pg_p.getPackage();
			 
			 if(pg_package!=null){
				 return compareNamespace(dsl_namespaces,pg_package);
			 }
			 else{
				 String[] pg_namespaces = pg_p.getTName().split("\\.");
				 if(pg_namespaces.length-1 == dsl_namespaces.length){
					 boolean equal = true;
					 for(int i = 0; i< dsl_namespaces.length; i++){
						 equal &= dsl_namespaces[i].compareTo(pg_namespaces[i])==0;
					 }
					 return equal;
				 }
			 }
		 }
		return false;
	}

	private static boolean compareNamespace(String[] dsl_namespaces, TPackage leaf_package) {
		int k=0;
		 while(leaf_package!=null){
			 if(leaf_package.getTName().compareTo(dsl_namespaces[k++])!=0){
				 return false;
			 }
			 leaf_package = leaf_package.getParent();
		 }
		
		 return (k==dsl_namespaces.length);
	}
}
