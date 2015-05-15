package basics;

import static org.junit.Assert.*;

import java.io.File;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.junit.Before;
import org.junit.Test;

import ExtendedJamopp.ExtendedJamoppJavaContainer;
import ttc.gravity.TTCSolutionGravity;
import ttc.testdsl.tTCTest.Classes;
import ttc.testdsl.tTCTest.Create_Superclass_Refactoring;
import ttc.testdsl.tTCTest.Java_Class;
import ttc.testdsl.tTCTest.Java_Method;
import ttc.testdsl.tTCTest.Pull_Up_Refactoring;
import ttc.testdsl.tTCTest.TTCTestFactory;


public class BasicTest {
	
	private TTCSolutionGravity solution;

	@Before
	public void before(){
		solution = new TTCSolutionGravity();
		solution.eclipseMode();
		solution.setTmpPath(new File("out"));
	}

	@Test
	public void hiddenProgram1() {
		solution.createProgramGraph("testfiles/hiddenProgram1");
		//solution.synchronizeChanges();
	}
	
	@Test
	public void fields() {
		solution.createProgramGraph("testfiles/fields");
		System.out.println("TRAFO: done");
		solution.saveJaMoPP("out/jamopp.xmi");
		System.out.println("Saved src as \"jamopp.xmi\"");
		solution.savePG("out/pg.xmi");
		System.out.println("Saved trg as \"pg.xmi\"");
		//solution.synchronizeChanges();
	}
	
	@Test
	public void sample() {
		solution.createProgramGraph("testfiles/sample");
		System.out.println("TRAFO: done");
		solution.saveJaMoPP("out/jamopp.xmi");
		System.out.println("Saved src as \"jamopp.xmi\"");
		solution.savePG("out/pg.xmi");
		System.out.println("Saved trg as \"pg.xmi\"");
		solution.synchronizeChanges();
		solution.saveJaMoPP("out/jamopp_sync.xmi");
		System.out.println("Saved src as \"jamopp_sync.xmi\"");
	}
	
	@Test
	public void pum(){
		TTCTestFactory dsl = TTCTestFactory.eINSTANCE;
		
		Java_Class 	parent = dsl.createJava_Class();
					parent.setClass_name("Foo");
					parent.setPackage("foo");
					
		Java_Method method = dsl.createJava_Method();
					method.setMethod_name("m");
					
		Pull_Up_Refactoring r = dsl.createPull_Up_Refactoring();
							r.setMethod(method);
							r.setParent(parent);
							
		boolean succ = solution.applyPullUpMethod(r);
		System.out.println("SUCCESS?? "+succ);
		
	}
	
	

}
