package arte;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import ttc.gravity.TTCSolutionGravity;
import ttc.testdsl.tTCTest.Classes;
import ttc.testdsl.tTCTest.Create_Superclass_Refactoring;
import ttc.testdsl.tTCTest.Java_Class;
import ttc.testdsl.tTCTest.Java_Method;
import ttc.testdsl.tTCTest.Pull_Up_Refactoring;
import ttc.testdsl.tTCTest.TTCTestFactory;

public class ARTE {

	private TTCSolutionGravity solution;

	@Before
	public void before(){
		solution = new TTCSolutionGravity();
		solution.eclipseMode();
	}
	
	@Test
	public void pub_csc1_1() {
		solution.setTmpPath(new File("out/tmp/pub_csc1_1"));
		solution.createProgramGraph("testfiles/arte/paper-example04");
		
		Java_Class 	child1 = TTCTestFactory.eINSTANCE.createJava_Class();
					child1.setClass_name("ChildClass1");
					child1.setPackage("example04");
					
		Java_Class 	child2 = TTCTestFactory.eINSTANCE.createJava_Class();
					child2.setClass_name("ChildClass2");
					child2.setPackage("example04");
		
		Java_Class 	parent = TTCTestFactory.eINSTANCE.createJava_Class();
					parent.setClass_name("Parent");
					parent.setPackage("example04");			
					
		Classes child = TTCTestFactory.eINSTANCE.createClasses();
				child.getClasses().add(child1);
				child.getClasses().add(child2);
		
		Create_Superclass_Refactoring	csc = TTCTestFactory.eINSTANCE.createCreate_Superclass_Refactoring();
										csc.setChild(child);
										csc.setTarget(parent);
		
		assertTrue(solution.applyCreateSuperclass(csc));
		
		assertTrue(solution.synchronizeChanges(new File("out/tmp/pub_csc1_1")));
	}
	
	@Test
	public void pub_csc1_2() {
		solution.setTmpPath(new File("out/tmp/pub_csc1_2"));
		solution.createProgramGraph("testfiles/arte/paper-example04");
		
		Java_Class 	child1 = TTCTestFactory.eINSTANCE.createJava_Class();
					child1.setClass_name("ChildClass1");
					child1.setPackage("example04");
					
		Java_Class 	child2 = TTCTestFactory.eINSTANCE.createJava_Class();
					child2.setClass_name("ChildClass2");
					child2.setPackage("example04");
		
		Java_Class 	parent = TTCTestFactory.eINSTANCE.createJava_Class();
					parent.setClass_name("Foo");
					parent.setPackage("foo");			
					
		Classes child = TTCTestFactory.eINSTANCE.createClasses();
				child.getClasses().add(child1);
				child.getClasses().add(child2);
		
		Create_Superclass_Refactoring	csc = TTCTestFactory.eINSTANCE.createCreate_Superclass_Refactoring();
										csc.setChild(child);
										csc.setTarget(parent);
		
		assertTrue(solution.applyCreateSuperclass(csc));
		
		assertTrue(solution.synchronizeChanges(new File("out/tmp/pub_csc1_2")));
	}
	
	@Test
	public void pub_pum1_1() {
		solution.setTmpPath(new File("out/tmp/pub_pum1_1"));
		solution.createProgramGraph("testfiles/arte/paper-example01");
		
		Java_Class 	parent = TTCTestFactory.eINSTANCE.createJava_Class();
					parent.setClass_name("ParentClass");
					parent.setPackage("example01");
					
		Java_Class 	p_int = TTCTestFactory.eINSTANCE.createJava_Class();
					p_int.setClass_name("int");
		
		Java_Class 	p_String = TTCTestFactory.eINSTANCE.createJava_Class();
					p_String.setClass_name("String");
					p_String.setPackage("java.lang");
					
		Java_Method method = TTCTestFactory.eINSTANCE.createJava_Method();
					method.setMethod_name("method");
					method.getParams().add(p_String);
					method.getParams().add(p_int);
		
		Pull_Up_Refactoring	pum = TTCTestFactory.eINSTANCE.createPull_Up_Refactoring();
							pum.setParent(parent);
							pum.setMethod(method);
		
		assertTrue(solution.applyPullUpMethod(pum));
		
		assertTrue(solution.synchronizeChanges(new File("out/tmp/pub_pum1_1")));
	}
	
	@Test
	public void pub_pum1_2() {
		solution.setTmpPath(new File("out/tmp/pub_pum1_2"));
		solution.createProgramGraph("testfiles/arte/paper-example01");
		
		Java_Class 	parent = TTCTestFactory.eINSTANCE.createJava_Class();
					parent.setClass_name("Foo");
					parent.setPackage("example01");
					
		Java_Class 	p_int = TTCTestFactory.eINSTANCE.createJava_Class();
					p_int.setClass_name("int");
		
		Java_Class 	p_String = TTCTestFactory.eINSTANCE.createJava_Class();
					p_String.setClass_name("String");
					p_String.setPackage("java.lang");
					
		Java_Method method = TTCTestFactory.eINSTANCE.createJava_Method();
					method.setMethod_name("method");
					method.getParams().add(p_String);
					method.getParams().add(p_int);
		
		Pull_Up_Refactoring	pum = TTCTestFactory.eINSTANCE.createPull_Up_Refactoring();
							pum.setParent(parent);
							pum.setMethod(method);
		
		assertFalse(solution.applyPullUpMethod(pum));
		
		assertTrue(solution.synchronizeChanges(new File("out/tmp/pub_pum1_2")));
	}
	
	@Test
	public void pub_pum2_1() {
		solution.setTmpPath(new File("out/tmp/pub_pum2_1"));
		solution.createProgramGraph("testfiles/arte/paper-example02");
		
		Java_Class 	parent = TTCTestFactory.eINSTANCE.createJava_Class();
					parent.setClass_name("ParentClass");
					parent.setPackage("example02");
					
		Java_Method method = TTCTestFactory.eINSTANCE.createJava_Method();
					method.setMethod_name("method");
		
		Pull_Up_Refactoring	pum = TTCTestFactory.eINSTANCE.createPull_Up_Refactoring();
							pum.setParent(parent);
							pum.setMethod(method);
		
		assertFalse(solution.applyPullUpMethod(pum));
		
		assertTrue(solution.synchronizeChanges(new File("out/tmp/pub_pum2_1")));
	}
	
	@Test
	public void pub_pum3_1() {
		solution.setTmpPath(new File("out/tmp/pub_pum3_1"));
		solution.createProgramGraph("testfiles/arte/paper-example03");
		
		Java_Class 	parent = TTCTestFactory.eINSTANCE.createJava_Class();
					parent.setClass_name("ParentClass");
					parent.setPackage("example03");
					
		Java_Method method = TTCTestFactory.eINSTANCE.createJava_Method();
					method.setMethod_name("method");
		
		Pull_Up_Refactoring	pum = TTCTestFactory.eINSTANCE.createPull_Up_Refactoring();
							pum.setParent(parent);
							pum.setMethod(method);
		
		assertFalse(solution.applyPullUpMethod(pum));
		
		assertTrue(solution.synchronizeChanges(new File("out/tmp/pub_pum3_1")));
	}
	
	@Test
	public void hidden_csc1_1() {
		solution.setTmpPath(new File("out/tmp/hidden_csc1_1"));
		solution.createProgramGraph("testfiles/arte/hiddenProgram1");
		
		Java_Class 	parent = TTCTestFactory.eINSTANCE.createJava_Class();
					parent.setClass_name("NewParent");
					parent.setPackage("hidden.program.one");
		
		Java_Class 	child1 = TTCTestFactory.eINSTANCE.createJava_Class();
					child1.setClass_name("ChildClass1");
					child1.setPackage("hidden.program.one");
					
		Java_Class 	child2 = TTCTestFactory.eINSTANCE.createJava_Class();
					child2.setClass_name("ChildClass2");
					child2.setPackage("hidden.program.one");
					
		Classes	child = TTCTestFactory.eINSTANCE.createClasses();
				child.getClasses().add(child1);
				child.getClasses().add(child2);
		
		Create_Superclass_Refactoring	csc = TTCTestFactory.eINSTANCE.createCreate_Superclass_Refactoring();
										csc.setTarget(parent);
										csc.setChild(child);
							
		assertTrue(solution.applyCreateSuperclass(csc));
		
		assertTrue(solution.synchronizeChanges(new File("out/tmp/hidden_csc1_1")));
	}

	@Test
	public void hidden_csc1_2() {
		solution.setTmpPath(new File("out/tmp/hidden_csc1_2"));
		solution.createProgramGraph("testfiles/arte/hiddenProgram1");
		
		Java_Class 	parent = TTCTestFactory.eINSTANCE.createJava_Class();
					parent.setClass_name("ExistingClass");
					parent.setPackage("hidden.program.one");
		
		Java_Class 	child1 = TTCTestFactory.eINSTANCE.createJava_Class();
					child1.setClass_name("ChildClass1");
					child1.setPackage("hidden.program.one");
					
		Java_Class 	child2 = TTCTestFactory.eINSTANCE.createJava_Class();
					child2.setClass_name("ChildClass2");
					child2.setPackage("hidden.program.one");
					
		Classes	child = TTCTestFactory.eINSTANCE.createClasses();
				child.getClasses().add(child1);
				child.getClasses().add(child2);
		
		Create_Superclass_Refactoring	csc = TTCTestFactory.eINSTANCE.createCreate_Superclass_Refactoring();
										csc.setTarget(parent);
										csc.setChild(child);
							
		assertFalse(solution.applyCreateSuperclass(csc));
		
		assertTrue(solution.synchronizeChanges(new File("out/tmp/hidden_csc1_2")));
	}
	
	@Test
	public void hidden_pum1_1() {
		solution.setTmpPath(new File("out/tmp/hidden_pum1_1"));
		solution.createProgramGraph("testfiles/arte/hiddenProgram1");
		
		Java_Class 	parent = TTCTestFactory.eINSTANCE.createJava_Class();
					parent.setClass_name("ParentClass");
					parent.setPackage("hidden.program.one");
					
		Java_Method method = TTCTestFactory.eINSTANCE.createJava_Method();
					method.setMethod_name("method");
		
		Pull_Up_Refactoring	pum = TTCTestFactory.eINSTANCE.createPull_Up_Refactoring();
							pum.setParent(parent);
							pum.setMethod(method);
		
		assertFalse(solution.applyPullUpMethod(pum));
		
		assertTrue(solution.synchronizeChanges(new File("out/tmp/hidden_pum1_1")));
	}
	
	@Test
	public void hidden_pum1_2() {
		solution.setTmpPath(new File("out/tmp/hidden_pum1_2"));
		solution.createProgramGraph("testfiles/arte/hiddenProgram1");
		
		Java_Class 	parent = TTCTestFactory.eINSTANCE.createJava_Class();
					parent.setClass_name("ParentClass");
					parent.setPackage("hidden.program.one");
					
		Java_Method method = TTCTestFactory.eINSTANCE.createJava_Method();
					method.setMethod_name("iDontExist");
		
		Pull_Up_Refactoring	pum = TTCTestFactory.eINSTANCE.createPull_Up_Refactoring();
							pum.setParent(parent);
							pum.setMethod(method);
		
		assertFalse(solution.applyPullUpMethod(pum));
		
		assertTrue(solution.synchronizeChanges(new File("out/tmp/hidden_pum1_2")));
	}
	
	@Test
	public void hidden_csc2_1() {
		solution.setTmpPath(new File("out/tmp/hidden_csc2_1"));
		solution.createProgramGraph("testfiles/arte/hiddenProgram2");
		
		Java_Class 	parent = TTCTestFactory.eINSTANCE.createJava_Class();
					parent.setClass_name("NewParent");
					parent.setPackage("hidden.program.two");
		
		Java_Class 	child1 = TTCTestFactory.eINSTANCE.createJava_Class();
					child1.setClass_name("ChildClass1");
					child1.setPackage("hidden.program.two");
					
		Java_Class 	child2 = TTCTestFactory.eINSTANCE.createJava_Class();
					child2.setClass_name("ChildClass2");
					child2.setPackage("hidden.program.two");
					
		Classes	child = TTCTestFactory.eINSTANCE.createClasses();
				child.getClasses().add(child1);
				child.getClasses().add(child2);
		
		Create_Superclass_Refactoring	csc = TTCTestFactory.eINSTANCE.createCreate_Superclass_Refactoring();
										csc.setTarget(parent);
										csc.setChild(child);
							
		assertFalse(solution.applyCreateSuperclass(csc));
		
		assertTrue(solution.synchronizeChanges(new File("out/tmp/hidden_csc2_1")));
	}
	
	@Test
	public void hidden_pum2_1() {
		solution.setTmpPath(new File("out/tmp/hidden_pum2_1"));
		solution.createProgramGraph("testfiles/arte/hiddenProgram2");
		
		Java_Class 	parent = TTCTestFactory.eINSTANCE.createJava_Class();
					parent.setClass_name("ParentClass");
					parent.setPackage("hidden.program.two");
					
		Java_Method method = TTCTestFactory.eINSTANCE.createJava_Method();
					method.setMethod_name("method");
		
		Pull_Up_Refactoring	pum = TTCTestFactory.eINSTANCE.createPull_Up_Refactoring();
							pum.setParent(parent);
							pum.setMethod(method);
		
		assertTrue(solution.applyPullUpMethod(pum));
		
		assertTrue(solution.synchronizeChanges(new File("out/tmp/hidden_pum2_1")));
	}
	
	@Test
	public void hidden_pum2_2() {
		solution.setTmpPath(new File("out/tmp/hidden_pum2_2"));
		solution.createProgramGraph("testfiles/arte/hiddenProgram2");
		
		Java_Class 	parent = TTCTestFactory.eINSTANCE.createJava_Class();
					parent.setClass_name("NewParent");
					parent.setPackage("hidden.program.two");
					
		Java_Method method = TTCTestFactory.eINSTANCE.createJava_Method();
					method.setMethod_name("second");
		
		Pull_Up_Refactoring	pum = TTCTestFactory.eINSTANCE.createPull_Up_Refactoring();
							pum.setParent(parent);
							pum.setMethod(method);

		assertFalse(solution.applyPullUpMethod(pum));
		
		assertTrue(solution.synchronizeChanges(new File("out/tmp/hidden_pum2_2")));
	}
	
	@Test
	public void hidden_csc3_1() {
		solution.setTmpPath(new File("out/tmp/hidden_csc3_1"));
		solution.createProgramGraph("testfiles/arte/hiddenProgram3");
		
		Java_Class 	child1 = TTCTestFactory.eINSTANCE.createJava_Class();
					child1.setClass_name("ChildClass1");
					child1.setPackage("hidden.program.three");

		Java_Class 	child2 = TTCTestFactory.eINSTANCE.createJava_Class();
					child2.setClass_name("ChildClass2");
					child2.setPackage("hidden.program.three");
		
		Classes	child = TTCTestFactory.eINSTANCE.createClasses();
				child.getClasses().add(child1);
				child.getClasses().add(child2);
	
		Java_Class 	parent = TTCTestFactory.eINSTANCE.createJava_Class();
					parent.setClass_name("NewParent");
					parent.setPackage("hidden.program.three");
		
		Java_Method method = TTCTestFactory.eINSTANCE.createJava_Method();
					method.setMethod_name("method");

		Create_Superclass_Refactoring 	csc = TTCTestFactory.eINSTANCE.createCreate_Superclass_Refactoring();
										csc.setChild(child);
										csc.setTarget(parent);
		
		Pull_Up_Refactoring	pum = TTCTestFactory.eINSTANCE.createPull_Up_Refactoring();
							pum.setParent(parent);
							pum.setMethod(method);

		assertTrue(solution.applyCreateSuperclass(csc));
		
		assertTrue(solution.synchronizeChanges(new File("out/tmp/hidden_csc3_1")));
		
		assertTrue(solution.applyPullUpMethod(pum));
		
		assertTrue(solution.synchronizeChanges(new File("out/tmp/hidden_csc3_1")));
	}
	
	@Test
	public void hidden_csc3_1a() {
		solution.setTmpPath(new File("out/tmp/hidden_csc3_1a"));
		solution.createProgramGraph("testfiles/arte/hiddenProgram3");
		
		Java_Class 	child1 = TTCTestFactory.eINSTANCE.createJava_Class();
					child1.setClass_name("ChildClass1");
					child1.setPackage("hidden.program.three");

		Java_Class 	child2 = TTCTestFactory.eINSTANCE.createJava_Class();
					child2.setClass_name("ChildClass2");
					child2.setPackage("hidden.program.three");
		
		Classes	child = TTCTestFactory.eINSTANCE.createClasses();
				child.getClasses().add(child1);
				child.getClasses().add(child2);
	
		Java_Class 	parent = TTCTestFactory.eINSTANCE.createJava_Class();
					parent.setClass_name("NewParent");
					parent.setPackage("hidden.program.three");
		
		Java_Method method = TTCTestFactory.eINSTANCE.createJava_Method();
					method.setMethod_name("method");

		Create_Superclass_Refactoring 	csc = TTCTestFactory.eINSTANCE.createCreate_Superclass_Refactoring();
										csc.setChild(child);
										csc.setTarget(parent);
		
		Pull_Up_Refactoring	pum = TTCTestFactory.eINSTANCE.createPull_Up_Refactoring();
							pum.setParent(parent);
							pum.setMethod(method);

		assertTrue(solution.applyCreateSuperclass(csc));
		assertTrue(solution.applyPullUpMethod(pum));
		
		assertTrue(solution.synchronizeChanges(new File("out/tmp/hidden_csc3_1a")));
	}
}
