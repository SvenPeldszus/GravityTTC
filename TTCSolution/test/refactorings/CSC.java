package refactorings;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import ttc.gravity.TTCSolutionGravity;
import ttc.testdsl.tTCTest.Classes;
import ttc.testdsl.tTCTest.Create_Superclass_Refactoring;
import ttc.testdsl.tTCTest.Java_Class;
import ttc.testdsl.tTCTest.TTCTestFactory;

public class CSC {

	private TTCSolutionGravity solution;

	@Before
	public void before(){
		solution = new TTCSolutionGravity();
		solution.eclipseMode();
		solution.setTmpPath(new File("out"));
	}

	@Test
	public void csc_pub1(){
		TTCTestFactory dsl = TTCTestFactory.eINSTANCE;
		
		Java_Class 	new_parent = dsl.createJava_Class();
					new_parent.setClass_name("parent");
					new_parent.setPackage("example04");
					
		Java_Class 	c1 = dsl.createJava_Class();
					c1.setClass_name("ChildClass1");
					c1.setPackage("example04");		
		
		Java_Class 	c2 = dsl.createJava_Class();
					c2.setClass_name("ChildClass2");
					c2.setPackage("example04");	
					
		Classes child = dsl.createClasses();
				child.getClasses().add(c1);
				child.getClasses().add(c2);
		
		Create_Superclass_Refactoring 	r = dsl.createCreate_Superclass_Refactoring();
										r.setName("example_csc");
										r.setChild(child);
										r.setTarget(new_parent);
										
		solution.createProgramGraph("testfiles/paper-example04");
		
		solution.saveJaMoPP("out/jamopp.xmi");
		solution.savePG("out/pg.xmi");
		
		boolean succ = solution.applyCreateSuperclass(r);
		System.out.println("SUCCESS?? "+succ);
		solution.savePG("out/csc.xmi");
		
		solution.synchronizeChanges();
		solution.saveJaMoPP("out/jamopp_csc.xmi");
	}
	
	@Test
	public void csc_package1(){
		TTCTestFactory dsl = TTCTestFactory.eINSTANCE;
		
		Java_Class 	new_parent = dsl.createJava_Class();
					new_parent.setClass_name("XX");
					new_parent.setPackage("foo.bar");
					
		Java_Class 	c1 = dsl.createJava_Class();
					c1.setClass_name("Bar");
					c1.setPackage("foo.bar");		
		
		Java_Class 	c2 = dsl.createJava_Class();
					c2.setClass_name("Qux");
					c2.setPackage("foo.bar");	
					
		Classes child = dsl.createClasses();
				child.getClasses().add(c1);
				child.getClasses().add(c2);
		
		Create_Superclass_Refactoring 	r = dsl.createCreate_Superclass_Refactoring();
										r.setName("example_csc");
										r.setChild(child);
										r.setTarget(new_parent);
										
		solution.createProgramGraph("testfiles/csc");
		solution.savePG("out/pg.xmi");
		boolean succ = solution.applyCreateSuperclass(r);
		System.out.println("SUCCESS?? "+succ);
		
		solution.synchronizeChanges();
		solution.saveJaMoPP("out/jamopp_csc.xmi");
	}
	
	@Test
	public void csc_package2(){
		TTCTestFactory dsl = TTCTestFactory.eINSTANCE;
		
		Java_Class 	new_parent = dsl.createJava_Class();
					new_parent.setClass_name("XX");
					new_parent.setPackage("foo");
					
		Java_Class 	c1 = dsl.createJava_Class();
					c1.setClass_name("Bar");
					c1.setPackage("foo.bar");		
		
		Java_Class 	c2 = dsl.createJava_Class();
					c2.setClass_name("Qux");
					c2.setPackage("foo.bar");	
					
		Classes child = dsl.createClasses();
				child.getClasses().add(c1);
				child.getClasses().add(c2);
		
		Create_Superclass_Refactoring 	r = dsl.createCreate_Superclass_Refactoring();
										r.setName("example_csc");
										r.setChild(child);
										r.setTarget(new_parent);
										
		solution.createProgramGraph("testfiles/csc");
		
		boolean succ = solution.applyCreateSuperclass(r);
		System.out.println("SUCCESS?? "+succ);
		
		solution.synchronizeChanges();
	}
	
	@Test
	public void csc_package3(){
		TTCTestFactory dsl = TTCTestFactory.eINSTANCE;
		
		Java_Class 	new_parent = dsl.createJava_Class();
					new_parent.setClass_name("XX");
					new_parent.setPackage("foo.bar.qux");
					
		Java_Class 	c1 = dsl.createJava_Class();
					c1.setClass_name("Bar");
					c1.setPackage("foo.bar");		
		
		Java_Class 	c2 = dsl.createJava_Class();
					c2.setClass_name("Qux");
					c2.setPackage("foo.bar");	
					
		Classes child = dsl.createClasses();
				child.getClasses().add(c1);
				child.getClasses().add(c2);
		
		Create_Superclass_Refactoring 	r = dsl.createCreate_Superclass_Refactoring();
										r.setName("example_csc");
										r.setChild(child);
										r.setTarget(new_parent);
										
		solution.createProgramGraph("testfiles/csc");
		
		boolean succ = solution.applyCreateSuperclass(r);
		System.out.println("SUCCESS?? "+succ);
		
		solution.synchronizeChanges();
	}
	
	@Test
	public void csc_package4(){
		TTCTestFactory dsl = TTCTestFactory.eINSTANCE;
		
		Java_Class 	new_parent = dsl.createJava_Class();
					new_parent.setClass_name("XX");
					new_parent.setPackage("x.xx.xxx");
					
		Java_Class 	c1 = dsl.createJava_Class();
					c1.setClass_name("Bar");
					c1.setPackage("foo.bar");		
		
		Java_Class 	c2 = dsl.createJava_Class();
					c2.setClass_name("Qux");
					c2.setPackage("foo.bar");	
					
		Classes child = dsl.createClasses();
				child.getClasses().add(c1);
				child.getClasses().add(c2);
		
		Create_Superclass_Refactoring 	r = dsl.createCreate_Superclass_Refactoring();
										r.setName("example_csc");
										r.setChild(child);
										r.setTarget(new_parent);
										
		solution.createProgramGraph("testfiles/csc");
		
		boolean succ = solution.applyCreateSuperclass(r);
		System.out.println("SUCCESS?? "+succ);
		
		solution.synchronizeChanges();
	}

}
