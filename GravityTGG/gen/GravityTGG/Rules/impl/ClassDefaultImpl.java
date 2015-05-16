/**
 */
package GravityTGG.Rules.impl;

import ExtendedJamopp.ExtendedJamoppJavaContainer;
import ExtendedJamopp.ExtendedJamoppPackageElement;

import GravityTGG.ClassToTClass;
import GravityTGG.CompilationUnitToTClass;
import GravityTGG.ExtendedJamoppJavaContainerToTypeGraph;
import GravityTGG.ExtendedJamoppPackageElementToTPackage;
import GravityTGG.GravityTGGFactory;

import GravityTGG.Rules.ClassDefault;
import GravityTGG.Rules.RulesPackage;

import TGGLanguage.csp.CSP;

import TGGRuntime.EMoflonEdge;
import TGGRuntime.EObjectContainer;
import TGGRuntime.IsApplicableMatch;
import TGGRuntime.IsApplicableRuleResult;
import TGGRuntime.Match;
import TGGRuntime.PerformRuleResult;
import TGGRuntime.RuleResult;
import TGGRuntime.TGGRuntimeFactory;
import TGGRuntime.TripleMatch;

import TGGRuntime.impl.AbstractRuleImpl;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TPackage;
import TypeGraphBasic.TypeGraph;
import TypeGraphBasic.TypeGraphBasicFactory;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.emftext.language.java.classifiers.ClassifiersFactory;
import org.emftext.language.java.classifiers.ConcreteClassifier;

import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.containers.ContainersFactory;
// <-- [user defined imports]
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;

// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Default</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ClassDefaultImpl extends AbstractRuleImpl implements ClassDefault {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDefaultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getClassDefault();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage) {
		// initial bindings
		Object[] result1_black = ClassDefaultImpl
				.pattern_ClassDefault_0_1_blackBBBBBB(this, match,
						compilationUnit, jClass, jContainer, jPackage);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ClassDefaultImpl
				.pattern_ClassDefault_0_2_bindingAndBlackFBBBBBB(this, match,
						compilationUnit, jClass, jContainer, jPackage);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ClassDefaultImpl.pattern_ClassDefault_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ClassDefaultImpl
					.pattern_ClassDefault_0_4_blackBBBBB(match,
							compilationUnit, jClass, jContainer, jPackage);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ClassDefaultImpl.pattern_ClassDefault_0_4_greenBBBBBFFF(match,
					compilationUnit, jClass, jContainer, jPackage);
			// EMoflonEdge compilationUnit__jClass____classifiers = (EMoflonEdge) result4_green[5];
			// EMoflonEdge jContainer__compilationUnit____compilationUnit = (EMoflonEdge) result4_green[6];
			// EMoflonEdge jPackage__compilationUnit____compilationUnit = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = ClassDefaultImpl
					.pattern_ClassDefault_0_5_blackBBBBB(match,
							compilationUnit, jClass, jContainer, jPackage);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ClassDefaultImpl.pattern_ClassDefault_0_5_greenBBBF(match,
					jContainer, jPackage);
			// EMoflonEdge jContainer__jPackage____extendedJamoppPackageElement = (EMoflonEdge) result5_green[3];

			// register objects to match
			ClassDefaultImpl.pattern_ClassDefault_0_6_expressionBBBBBB(this,
					match, compilationUnit, jClass, jContainer, jPackage);
			return ClassDefaultImpl.pattern_ClassDefault_0_7_expressionF();
		} else {
			return ClassDefaultImpl.pattern_ClassDefault_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ClassDefaultImpl
				.pattern_ClassDefault_1_1_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		CompilationUnit compilationUnit = (CompilationUnit) result1_bindingAndBlack[0];
		org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result1_bindingAndBlack[1];
		ExtendedJamoppJavaContainer jContainer = (ExtendedJamoppJavaContainer) result1_bindingAndBlack[2];
		ExtendedJamoppPackageElement jPackage = (ExtendedJamoppPackageElement) result1_bindingAndBlack[3];
		ExtendedJamoppPackageElementToTPackage jPackageToTPackage = (ExtendedJamoppPackageElementToTPackage) result1_bindingAndBlack[4];
		TPackage tPackage = (TPackage) result1_bindingAndBlack[5];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[6];
		ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer = (ExtendedJamoppJavaContainerToTypeGraph) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = ClassDefaultImpl
				.pattern_ClassDefault_1_1_greenBFBFFBBB(compilationUnit,
						jClass, tPackage, typeGraph, csp);
		CompilationUnitToTClass compilationUnitToTClass = (CompilationUnitToTClass) result1_green[1];
		ClassToTClass jClassToTClass = (ClassToTClass) result1_green[3];
		TClass tClass = (TClass) result1_green[4];

		// collect translated elements
		Object[] result2_black = ClassDefaultImpl
				.pattern_ClassDefault_1_2_blackBBBBB(compilationUnit,
						compilationUnitToTClass, jClass, jClassToTClass, tClass);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ClassDefaultImpl
				.pattern_ClassDefault_1_2_greenFBBBBB(compilationUnit,
						compilationUnitToTClass, jClass, jClassToTClass, tClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ClassDefaultImpl
				.pattern_ClassDefault_1_3_blackBBBBBBBBBBBB(ruleresult,
						compilationUnit, compilationUnitToTClass, jClass,
						jClassToTClass, jContainer, jPackage,
						jPackageToTPackage, tClass, tPackage, typeGraph,
						typeGraphToJContainer);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ClassDefaultImpl.pattern_ClassDefault_1_3_greenBBBBBBBBBBFFFFFFFFFF(
				ruleresult, compilationUnit, compilationUnitToTClass, jClass,
				jClassToTClass, jContainer, jPackage, tClass, tPackage,
				typeGraph);
		// EMoflonEdge compilationUnit__jClass____classifiers = (EMoflonEdge) result3_green[10];
		// EMoflonEdge compilationUnitToTClass__tClass____target = (EMoflonEdge) result3_green[11];
		// EMoflonEdge compilationUnitToTClass__compilationUnit____source = (EMoflonEdge) result3_green[12];
		// EMoflonEdge jClassToTClass__tClass____target = (EMoflonEdge) result3_green[13];
		// EMoflonEdge jClassToTClass__jClass____source = (EMoflonEdge) result3_green[14];
		// EMoflonEdge jContainer__compilationUnit____compilationUnit = (EMoflonEdge) result3_green[15];
		// EMoflonEdge jPackage__compilationUnit____compilationUnit = (EMoflonEdge) result3_green[16];
		// EMoflonEdge tPackage__tClass____containedClasses = (EMoflonEdge) result3_green[17];
		// EMoflonEdge tClass__tPackage____package = (EMoflonEdge) result3_green[18];
		// EMoflonEdge typeGraph__tClass____classes = (EMoflonEdge) result3_green[19];

		// perform postprocessing story node is empty
		// register objects
		ClassDefaultImpl.pattern_ClassDefault_1_5_expressionBBBBBBBBBBBBB(this,
				ruleresult, compilationUnit, compilationUnitToTClass, jClass,
				jClassToTClass, jContainer, jPackage, jPackageToTPackage,
				tClass, tPackage, typeGraph, typeGraphToJContainer);
		return ClassDefaultImpl
				.pattern_ClassDefault_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ClassDefaultImpl
				.pattern_ClassDefault_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassDefaultImpl
				.pattern_ClassDefault_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ClassDefaultImpl
				.pattern_ClassDefault_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		CompilationUnit compilationUnit = (CompilationUnit) result2_binding[0];
		org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result2_binding[1];
		ExtendedJamoppJavaContainer jContainer = (ExtendedJamoppJavaContainer) result2_binding[2];
		ExtendedJamoppPackageElement jPackage = (ExtendedJamoppPackageElement) result2_binding[3];
		for (Object[] result2_black : ClassDefaultImpl
				.pattern_ClassDefault_2_2_blackBBBBFFFFB(compilationUnit,
						jClass, jContainer, jPackage, match)) {
			ExtendedJamoppPackageElementToTPackage jPackageToTPackage = (ExtendedJamoppPackageElementToTPackage) result2_black[4];
			TPackage tPackage = (TPackage) result2_black[5];
			TypeGraph typeGraph = (TypeGraph) result2_black[6];
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer = (ExtendedJamoppJavaContainerToTypeGraph) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : ClassDefaultImpl
					.pattern_ClassDefault_2_3_blackBBBBBBBB(compilationUnit,
							jClass, jContainer, jPackage, jPackageToTPackage,
							tPackage, typeGraph, typeGraphToJContainer)) {
				Object[] result3_green = ClassDefaultImpl
						.pattern_ClassDefault_2_3_greenBBBBBBBBFFFFFFFFF(
								compilationUnit, jClass, jContainer, jPackage,
								jPackageToTPackage, tPackage, typeGraph,
								typeGraphToJContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge compilationUnit__jClass____classifiers = (EMoflonEdge) result3_green[9];
				// EMoflonEdge jContainer__jPackage____extendedJamoppPackageElement = (EMoflonEdge) result3_green[10];
				// EMoflonEdge jContainer__compilationUnit____compilationUnit = (EMoflonEdge) result3_green[11];
				// EMoflonEdge jPackage__compilationUnit____compilationUnit = (EMoflonEdge) result3_green[12];
				// EMoflonEdge jPackageToTPackage__tPackage____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge jPackageToTPackage__jPackage____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge typeGraphToJContainer__typeGraph____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge typeGraphToJContainer__jContainer____source = (EMoflonEdge) result3_green[16];

				// solve CSP
				Object[] result4_bindingAndBlack = ClassDefaultImpl
						.pattern_ClassDefault_2_4_bindingAndBlackFBBBBBBBBBB(
								this, isApplicableMatch, compilationUnit,
								jClass, jContainer, jPackage,
								jPackageToTPackage, tPackage, typeGraph,
								typeGraphToJContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ClassDefaultImpl.pattern_ClassDefault_2_5_expressionFBB(
						this, csp)) {

					// add match to rule result
					Object[] result6_black = ClassDefaultImpl
							.pattern_ClassDefault_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ClassDefaultImpl.pattern_ClassDefault_2_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ClassDefaultImpl
				.pattern_ClassDefault_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage) {
		match.registerObject("compilationUnit", compilationUnit);
		match.registerObject("jClass", jClass);
		match.registerObject("jContainer", jContainer);
		match.registerObject("jPackage", jPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage,
			ExtendedJamoppPackageElementToTPackage jPackageToTPackage,
			TPackage tPackage, TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_jClass_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"jClass.name", true, csp);
		var_jClass_name.setValue(jClass.getName());
		var_jClass_name.setType("String");

		// Create unbound variables
		Variable var_tClass_tName = CSPFactoryHelper.eINSTANCE.createVariable(
				"tClass.tName", csp);
		var_tClass_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_jClass_name, var_tClass_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("compilationUnit", compilationUnit);
		isApplicableMatch.registerObject("jClass", jClass);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("jPackage", jPackage);
		isApplicableMatch.registerObject("jPackageToTPackage",
				jPackageToTPackage);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("typeGraphToJContainer",
				typeGraphToJContainer);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult,
			EObject compilationUnit, EObject compilationUnitToTClass,
			EObject jClass, EObject jClassToTClass, EObject jContainer,
			EObject jPackage, EObject jPackageToTPackage, EObject tClass,
			EObject tPackage, EObject typeGraph, EObject typeGraphToJContainer) {
		ruleresult.registerObject("compilationUnit", compilationUnit);
		ruleresult.registerObject("compilationUnitToTClass",
				compilationUnitToTClass);
		ruleresult.registerObject("jClass", jClass);
		ruleresult.registerObject("jClassToTClass", jClassToTClass);
		ruleresult.registerObject("jContainer", jContainer);
		ruleresult.registerObject("jPackage", jPackage);
		ruleresult.registerObject("jPackageToTPackage", jPackageToTPackage);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("typeGraphToJContainer",
				typeGraphToJContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("compilationUnit")
						.eClass()
						.equals(org.emftext.language.java.containers.ContainersPackage.eINSTANCE
								.getCompilationUnit())
				&& match.getObject("jClass")
						.eClass()
						.equals(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE
								.getClass_());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TClass tClass,
			TPackage tPackage, TypeGraph typeGraph) {
		// initial bindings
		Object[] result1_black = ClassDefaultImpl
				.pattern_ClassDefault_10_1_blackBBBBB(this, match, tClass,
						tPackage, typeGraph);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ClassDefaultImpl
				.pattern_ClassDefault_10_2_bindingAndBlackFBBBBB(this, match,
						tClass, tPackage, typeGraph);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ClassDefaultImpl.pattern_ClassDefault_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ClassDefaultImpl
					.pattern_ClassDefault_10_4_blackBBBB(match, tClass,
							tPackage, typeGraph);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ClassDefaultImpl.pattern_ClassDefault_10_4_greenBBBBFFF(match,
					tClass, tPackage, typeGraph);
			// EMoflonEdge tPackage__tClass____containedClasses = (EMoflonEdge) result4_green[4];
			// EMoflonEdge tClass__tPackage____package = (EMoflonEdge) result4_green[5];
			// EMoflonEdge typeGraph__tClass____classes = (EMoflonEdge) result4_green[6];

			// collect context elements
			Object[] result5_black = ClassDefaultImpl
					.pattern_ClassDefault_10_5_blackBBBB(match, tClass,
							tPackage, typeGraph);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ClassDefaultImpl.pattern_ClassDefault_10_5_greenBBB(match,
					tPackage, typeGraph);

			// register objects to match
			ClassDefaultImpl.pattern_ClassDefault_10_6_expressionBBBBB(this,
					match, tClass, tPackage, typeGraph);
			return ClassDefaultImpl.pattern_ClassDefault_10_7_expressionF();
		} else {
			return ClassDefaultImpl.pattern_ClassDefault_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ClassDefaultImpl
				.pattern_ClassDefault_11_1_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedJamoppJavaContainer jContainer = (ExtendedJamoppJavaContainer) result1_bindingAndBlack[0];
		ExtendedJamoppPackageElement jPackage = (ExtendedJamoppPackageElement) result1_bindingAndBlack[1];
		ExtendedJamoppPackageElementToTPackage jPackageToTPackage = (ExtendedJamoppPackageElementToTPackage) result1_bindingAndBlack[2];
		TClass tClass = (TClass) result1_bindingAndBlack[3];
		TPackage tPackage = (TPackage) result1_bindingAndBlack[4];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[5];
		ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer = (ExtendedJamoppJavaContainerToTypeGraph) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = ClassDefaultImpl
				.pattern_ClassDefault_11_1_greenFFFFBBBB(jContainer, jPackage,
						tClass, csp);
		CompilationUnit compilationUnit = (CompilationUnit) result1_green[0];
		CompilationUnitToTClass compilationUnitToTClass = (CompilationUnitToTClass) result1_green[1];
		org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result1_green[2];
		ClassToTClass jClassToTClass = (ClassToTClass) result1_green[3];

		// collect translated elements
		Object[] result2_black = ClassDefaultImpl
				.pattern_ClassDefault_11_2_blackBBBBB(compilationUnit,
						compilationUnitToTClass, jClass, jClassToTClass, tClass);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ClassDefaultImpl
				.pattern_ClassDefault_11_2_greenFBBBBB(compilationUnit,
						compilationUnitToTClass, jClass, jClassToTClass, tClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ClassDefaultImpl
				.pattern_ClassDefault_11_3_blackBBBBBBBBBBBB(ruleresult,
						compilationUnit, compilationUnitToTClass, jClass,
						jClassToTClass, jContainer, jPackage,
						jPackageToTPackage, tClass, tPackage, typeGraph,
						typeGraphToJContainer);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ClassDefaultImpl.pattern_ClassDefault_11_3_greenBBBBBBBBBBFFFFFFFFFF(
				ruleresult, compilationUnit, compilationUnitToTClass, jClass,
				jClassToTClass, jContainer, jPackage, tClass, tPackage,
				typeGraph);
		// EMoflonEdge compilationUnit__jClass____classifiers = (EMoflonEdge) result3_green[10];
		// EMoflonEdge compilationUnitToTClass__tClass____target = (EMoflonEdge) result3_green[11];
		// EMoflonEdge compilationUnitToTClass__compilationUnit____source = (EMoflonEdge) result3_green[12];
		// EMoflonEdge jClassToTClass__tClass____target = (EMoflonEdge) result3_green[13];
		// EMoflonEdge jClassToTClass__jClass____source = (EMoflonEdge) result3_green[14];
		// EMoflonEdge jContainer__compilationUnit____compilationUnit = (EMoflonEdge) result3_green[15];
		// EMoflonEdge jPackage__compilationUnit____compilationUnit = (EMoflonEdge) result3_green[16];
		// EMoflonEdge tPackage__tClass____containedClasses = (EMoflonEdge) result3_green[17];
		// EMoflonEdge tClass__tPackage____package = (EMoflonEdge) result3_green[18];
		// EMoflonEdge typeGraph__tClass____classes = (EMoflonEdge) result3_green[19];

		// perform postprocessing story node is empty
		// register objects
		ClassDefaultImpl.pattern_ClassDefault_11_5_expressionBBBBBBBBBBBBB(
				this, ruleresult, compilationUnit, compilationUnitToTClass,
				jClass, jClassToTClass, jContainer, jPackage,
				jPackageToTPackage, tClass, tPackage, typeGraph,
				typeGraphToJContainer);
		return ClassDefaultImpl
				.pattern_ClassDefault_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ClassDefaultImpl
				.pattern_ClassDefault_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassDefaultImpl
				.pattern_ClassDefault_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ClassDefaultImpl
				.pattern_ClassDefault_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		TClass tClass = (TClass) result2_binding[0];
		TPackage tPackage = (TPackage) result2_binding[1];
		TypeGraph typeGraph = (TypeGraph) result2_binding[2];
		for (Object[] result2_black : ClassDefaultImpl
				.pattern_ClassDefault_12_2_blackFFFBBBFB(tClass, tPackage,
						typeGraph, match)) {
			ExtendedJamoppJavaContainer jContainer = (ExtendedJamoppJavaContainer) result2_black[0];
			ExtendedJamoppPackageElement jPackage = (ExtendedJamoppPackageElement) result2_black[1];
			ExtendedJamoppPackageElementToTPackage jPackageToTPackage = (ExtendedJamoppPackageElementToTPackage) result2_black[2];
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer = (ExtendedJamoppJavaContainerToTypeGraph) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : ClassDefaultImpl
					.pattern_ClassDefault_12_3_blackBBBBBBB(jContainer,
							jPackage, jPackageToTPackage, tClass, tPackage,
							typeGraph, typeGraphToJContainer)) {
				Object[] result3_green = ClassDefaultImpl
						.pattern_ClassDefault_12_3_greenBBBBBBBFFFFFFFFF(
								jContainer, jPackage, jPackageToTPackage,
								tClass, tPackage, typeGraph,
								typeGraphToJContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge jContainer__jPackage____extendedJamoppPackageElement = (EMoflonEdge) result3_green[8];
				// EMoflonEdge jPackageToTPackage__tPackage____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge jPackageToTPackage__jPackage____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge tPackage__tClass____containedClasses = (EMoflonEdge) result3_green[11];
				// EMoflonEdge tClass__tPackage____package = (EMoflonEdge) result3_green[12];
				// EMoflonEdge typeGraph__tClass____classes = (EMoflonEdge) result3_green[13];
				// EMoflonEdge typeGraphToJContainer__typeGraph____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge typeGraphToJContainer__jContainer____source = (EMoflonEdge) result3_green[15];

				// solve CSP
				Object[] result4_bindingAndBlack = ClassDefaultImpl
						.pattern_ClassDefault_12_4_bindingAndBlackFBBBBBBBBB(
								this, isApplicableMatch, jContainer, jPackage,
								jPackageToTPackage, tClass, tPackage,
								typeGraph, typeGraphToJContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ClassDefaultImpl.pattern_ClassDefault_12_5_expressionFBB(
						this, csp)) {

					// add match to rule result
					Object[] result6_black = ClassDefaultImpl
							.pattern_ClassDefault_12_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ClassDefaultImpl.pattern_ClassDefault_12_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ClassDefaultImpl
				.pattern_ClassDefault_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TClass tClass,
			TPackage tPackage, TypeGraph typeGraph) {
		match.registerObject("tClass", tClass);
		match.registerObject("tPackage", tPackage);
		match.registerObject("typeGraph", typeGraph);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TClass tClass,
			TPackage tPackage, TypeGraph typeGraph) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage,
			ExtendedJamoppPackageElementToTPackage jPackageToTPackage,
			TClass tClass, TPackage tPackage, TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tClass_tName = CSPFactoryHelper.eINSTANCE.createVariable(
				"tClass.tName", true, csp);
		var_tClass_tName.setValue(tClass.getTName());
		var_tClass_tName.setType("String");

		// Create unbound variables
		Variable var_jClass_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"jClass.name", csp);
		var_jClass_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_jClass_name, var_tClass_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("jPackage", jPackage);
		isApplicableMatch.registerObject("jPackageToTPackage",
				jPackageToTPackage);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("typeGraphToJContainer",
				typeGraphToJContainer);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult,
			EObject compilationUnit, EObject compilationUnitToTClass,
			EObject jClass, EObject jClassToTClass, EObject jContainer,
			EObject jPackage, EObject jPackageToTPackage, EObject tClass,
			EObject tPackage, EObject typeGraph, EObject typeGraphToJContainer) {
		ruleresult.registerObject("compilationUnit", compilationUnit);
		ruleresult.registerObject("compilationUnitToTClass",
				compilationUnitToTClass);
		ruleresult.registerObject("jClass", jClass);
		ruleresult.registerObject("jClassToTClass", jClassToTClass);
		ruleresult.registerObject("jContainer", jContainer);
		ruleresult.registerObject("jPackage", jPackage);
		ruleresult.registerObject("jPackageToTPackage", jPackageToTPackage);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("typeGraphToJContainer",
				typeGraphToJContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("tClass")
				.eClass()
				.equals(TypeGraphBasic.TypeGraphBasicPackage.eINSTANCE
						.getTClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_0(
			EMoflonEdge _edge_classifiers) {
		// prepare return value
		Object[] result1_bindingAndBlack = ClassDefaultImpl
				.pattern_ClassDefault_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassDefaultImpl
				.pattern_ClassDefault_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ClassDefaultImpl
				.pattern_ClassDefault_20_2_blackFFFFB(_edge_classifiers)) {
			CompilationUnit compilationUnit = (CompilationUnit) result2_black[0];
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result2_black[1];
			ExtendedJamoppJavaContainer jContainer = (ExtendedJamoppJavaContainer) result2_black[2];
			ExtendedJamoppPackageElement jPackage = (ExtendedJamoppPackageElement) result2_black[3];
			Object[] result2_green = ClassDefaultImpl
					.pattern_ClassDefault_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ClassDefaultImpl.pattern_ClassDefault_20_3_expressionFBBBBBB(
					this, match, compilationUnit, jClass, jContainer, jPackage)) {
				// Ensure that the correct types of elements are matched
				if (ClassDefaultImpl.pattern_ClassDefault_20_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = ClassDefaultImpl
							.pattern_ClassDefault_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ClassDefaultImpl.pattern_ClassDefault_20_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ClassDefaultImpl
				.pattern_ClassDefault_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1(
			EMoflonEdge _edge_compilationUnit) {
		// prepare return value
		Object[] result1_bindingAndBlack = ClassDefaultImpl
				.pattern_ClassDefault_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassDefaultImpl
				.pattern_ClassDefault_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ClassDefaultImpl
				.pattern_ClassDefault_21_2_blackFFFFB(_edge_compilationUnit)) {
			CompilationUnit compilationUnit = (CompilationUnit) result2_black[0];
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result2_black[1];
			ExtendedJamoppJavaContainer jContainer = (ExtendedJamoppJavaContainer) result2_black[2];
			ExtendedJamoppPackageElement jPackage = (ExtendedJamoppPackageElement) result2_black[3];
			Object[] result2_green = ClassDefaultImpl
					.pattern_ClassDefault_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ClassDefaultImpl.pattern_ClassDefault_21_3_expressionFBBBBBB(
					this, match, compilationUnit, jClass, jContainer, jPackage)) {
				// Ensure that the correct types of elements are matched
				if (ClassDefaultImpl.pattern_ClassDefault_21_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = ClassDefaultImpl
							.pattern_ClassDefault_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ClassDefaultImpl.pattern_ClassDefault_21_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ClassDefaultImpl
				.pattern_ClassDefault_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_2(
			EMoflonEdge _edge_compilationUnit) {
		// prepare return value
		Object[] result1_bindingAndBlack = ClassDefaultImpl
				.pattern_ClassDefault_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassDefaultImpl
				.pattern_ClassDefault_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ClassDefaultImpl
				.pattern_ClassDefault_22_2_blackFFFFB(_edge_compilationUnit)) {
			CompilationUnit compilationUnit = (CompilationUnit) result2_black[0];
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result2_black[1];
			ExtendedJamoppJavaContainer jContainer = (ExtendedJamoppJavaContainer) result2_black[2];
			ExtendedJamoppPackageElement jPackage = (ExtendedJamoppPackageElement) result2_black[3];
			Object[] result2_green = ClassDefaultImpl
					.pattern_ClassDefault_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ClassDefaultImpl.pattern_ClassDefault_22_3_expressionFBBBBBB(
					this, match, compilationUnit, jClass, jContainer, jPackage)) {
				// Ensure that the correct types of elements are matched
				if (ClassDefaultImpl.pattern_ClassDefault_22_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = ClassDefaultImpl
							.pattern_ClassDefault_22_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ClassDefaultImpl.pattern_ClassDefault_22_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ClassDefaultImpl
				.pattern_ClassDefault_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_0(
			EMoflonEdge _edge_containedClasses) {
		// prepare return value
		Object[] result1_bindingAndBlack = ClassDefaultImpl
				.pattern_ClassDefault_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassDefaultImpl
				.pattern_ClassDefault_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ClassDefaultImpl
				.pattern_ClassDefault_23_2_blackFFFB(_edge_containedClasses)) {
			TClass tClass = (TClass) result2_black[0];
			TPackage tPackage = (TPackage) result2_black[1];
			TypeGraph typeGraph = (TypeGraph) result2_black[2];
			Object[] result2_green = ClassDefaultImpl
					.pattern_ClassDefault_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ClassDefaultImpl.pattern_ClassDefault_23_3_expressionFBBBBB(
					this, match, tClass, tPackage, typeGraph)) {
				// Ensure that the correct types of elements are matched
				if (ClassDefaultImpl.pattern_ClassDefault_23_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = ClassDefaultImpl
							.pattern_ClassDefault_23_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ClassDefaultImpl.pattern_ClassDefault_23_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ClassDefaultImpl
				.pattern_ClassDefault_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_1(
			EMoflonEdge _edge_package) {
		// prepare return value
		Object[] result1_bindingAndBlack = ClassDefaultImpl
				.pattern_ClassDefault_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassDefaultImpl
				.pattern_ClassDefault_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ClassDefaultImpl
				.pattern_ClassDefault_24_2_blackFFFB(_edge_package)) {
			TClass tClass = (TClass) result2_black[0];
			TPackage tPackage = (TPackage) result2_black[1];
			TypeGraph typeGraph = (TypeGraph) result2_black[2];
			Object[] result2_green = ClassDefaultImpl
					.pattern_ClassDefault_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ClassDefaultImpl.pattern_ClassDefault_24_3_expressionFBBBBB(
					this, match, tClass, tPackage, typeGraph)) {
				// Ensure that the correct types of elements are matched
				if (ClassDefaultImpl.pattern_ClassDefault_24_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = ClassDefaultImpl
							.pattern_ClassDefault_24_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ClassDefaultImpl.pattern_ClassDefault_24_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ClassDefaultImpl
				.pattern_ClassDefault_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_2(
			EMoflonEdge _edge_classes) {
		// prepare return value
		Object[] result1_bindingAndBlack = ClassDefaultImpl
				.pattern_ClassDefault_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassDefaultImpl
				.pattern_ClassDefault_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ClassDefaultImpl
				.pattern_ClassDefault_25_2_blackFFFB(_edge_classes)) {
			TClass tClass = (TClass) result2_black[0];
			TPackage tPackage = (TPackage) result2_black[1];
			TypeGraph typeGraph = (TypeGraph) result2_black[2];
			Object[] result2_green = ClassDefaultImpl
					.pattern_ClassDefault_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ClassDefaultImpl.pattern_ClassDefault_25_3_expressionFBBBBB(
					this, match, tClass, tPackage, typeGraph)) {
				// Ensure that the correct types of elements are matched
				if (ClassDefaultImpl.pattern_ClassDefault_25_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = ClassDefaultImpl
							.pattern_ClassDefault_25_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ClassDefaultImpl.pattern_ClassDefault_25_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ClassDefaultImpl
				.pattern_ClassDefault_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult checkAttributes_FWD(TripleMatch tripleMatch) {
		throw new UnsupportedOperationException(
				"developments on attribute synchronization with eMoflon not yet completed");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult checkAttributes_BWD(TripleMatch tripleMatch) {
		throw new UnsupportedOperationException(
				"developments on attribute synchronization with eMoflon not yet completed");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.CLASS_DEFAULT___IS_APPROPRIATE_FWD__MATCH_COMPILATIONUNIT_CLASS_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT:
			return isAppropriate_FWD((Match) arguments.get(0),
					(CompilationUnit) arguments.get(1),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(2),
					(ExtendedJamoppJavaContainer) arguments.get(3),
					(ExtendedJamoppPackageElement) arguments.get(4));
		case RulesPackage.CLASS_DEFAULT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_DEFAULT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_DEFAULT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_COMPILATIONUNIT_CLASS_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(CompilationUnit) arguments.get(1),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(2),
					(ExtendedJamoppJavaContainer) arguments.get(3),
					(ExtendedJamoppPackageElement) arguments.get(4));
			return null;
		case RulesPackage.CLASS_DEFAULT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_COMPILATIONUNIT_CLASS_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(CompilationUnit) arguments.get(1),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(2),
					(ExtendedJamoppJavaContainer) arguments.get(3),
					(ExtendedJamoppPackageElement) arguments.get(4));
		case RulesPackage.CLASS_DEFAULT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_DEFAULT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_COMPILATIONUNIT_CLASS_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT_EXTENDEDJAMOPPPACKAGEELEMENTTOTPACKAGE_TPACKAGE_TYPEGRAPH_EXTENDEDJAMOPPJAVACONTAINERTOTYPEGRAPH:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(CompilationUnit) arguments.get(1),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(2),
					(ExtendedJamoppJavaContainer) arguments.get(3),
					(ExtendedJamoppPackageElement) arguments.get(4),
					(ExtendedJamoppPackageElementToTPackage) arguments.get(5),
					(TPackage) arguments.get(6), (TypeGraph) arguments.get(7),
					(ExtendedJamoppJavaContainerToTypeGraph) arguments.get(8));
		case RulesPackage.CLASS_DEFAULT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_DEFAULT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.CLASS_DEFAULT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_DEFAULT___IS_APPROPRIATE_BWD__MATCH_TCLASS_TPACKAGE_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TClass) arguments.get(1), (TPackage) arguments.get(2),
					(TypeGraph) arguments.get(3));
		case RulesPackage.CLASS_DEFAULT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_DEFAULT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_DEFAULT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TPACKAGE_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TClass) arguments.get(1), (TPackage) arguments.get(2),
					(TypeGraph) arguments.get(3));
			return null;
		case RulesPackage.CLASS_DEFAULT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TPACKAGE_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TClass) arguments.get(1), (TPackage) arguments.get(2),
					(TypeGraph) arguments.get(3));
		case RulesPackage.CLASS_DEFAULT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_DEFAULT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT_EXTENDEDJAMOPPPACKAGEELEMENTTOTPACKAGE_TCLASS_TPACKAGE_TYPEGRAPH_EXTENDEDJAMOPPJAVACONTAINERTOTYPEGRAPH:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedJamoppJavaContainer) arguments.get(1),
					(ExtendedJamoppPackageElement) arguments.get(2),
					(ExtendedJamoppPackageElementToTPackage) arguments.get(3),
					(TClass) arguments.get(4), (TPackage) arguments.get(5),
					(TypeGraph) arguments.get(6),
					(ExtendedJamoppJavaContainerToTypeGraph) arguments.get(7));
		case RulesPackage.CLASS_DEFAULT___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_DEFAULT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.CLASS_DEFAULT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_DEFAULT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_0((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CLASS_DEFAULT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CLASS_DEFAULT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_2((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CLASS_DEFAULT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_0__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_0((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CLASS_DEFAULT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_1((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CLASS_DEFAULT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_2((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CLASS_DEFAULT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_DEFAULT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ClassDefault_0_1_blackBBBBBB(
			ClassDefault _this, Match match, CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage) {
		return new Object[] { _this, match, compilationUnit, jClass,
				jContainer, jPackage };
	}

	public static final Object[] pattern_ClassDefault_0_2_bindingFBBBBBB(
			ClassDefault _this, Match match, CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				compilationUnit, jClass, jContainer, jPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, compilationUnit, jClass,
					jContainer, jPackage };
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassDefault_0_2_bindingAndBlackFBBBBBB(
			ClassDefault _this, Match match, CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage) {
		Object[] result_pattern_ClassDefault_0_2_binding = pattern_ClassDefault_0_2_bindingFBBBBBB(
				_this, match, compilationUnit, jClass, jContainer, jPackage);
		if (result_pattern_ClassDefault_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ClassDefault_0_2_binding[0];

			Object[] result_pattern_ClassDefault_0_2_black = pattern_ClassDefault_0_2_blackB(csp);
			if (result_pattern_ClassDefault_0_2_black != null) {

				return new Object[] { csp, _this, match, compilationUnit,
						jClass, jContainer, jPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassDefault_0_3_expressionFBB(
			ClassDefault _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassDefault_0_4_blackBBBBB(
			Match match, CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage) {
		return new Object[] { match, compilationUnit, jClass, jContainer,
				jPackage };
	}

	public static final Object[] pattern_ClassDefault_0_4_greenBBBBBFFF(
			Match match, CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage) {
		EMoflonEdge compilationUnit__jClass____classifiers = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jContainer__compilationUnit____compilationUnit = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jPackage__compilationUnit____compilationUnit = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(compilationUnit);
		match.getToBeTranslatedNodes().add(jClass);
		String compilationUnit__jClass____classifiers_name_prime = "classifiers";
		String jContainer__compilationUnit____compilationUnit_name_prime = "compilationUnit";
		String jPackage__compilationUnit____compilationUnit_name_prime = "compilationUnit";
		compilationUnit__jClass____classifiers.setSrc(compilationUnit);
		compilationUnit__jClass____classifiers.setTrg(jClass);
		match.getToBeTranslatedEdges().add(
				compilationUnit__jClass____classifiers);
		jContainer__compilationUnit____compilationUnit.setSrc(jContainer);
		jContainer__compilationUnit____compilationUnit.setTrg(compilationUnit);
		match.getToBeTranslatedEdges().add(
				jContainer__compilationUnit____compilationUnit);
		jPackage__compilationUnit____compilationUnit.setSrc(jPackage);
		jPackage__compilationUnit____compilationUnit.setTrg(compilationUnit);
		match.getToBeTranslatedEdges().add(
				jPackage__compilationUnit____compilationUnit);
		compilationUnit__jClass____classifiers
				.setName(compilationUnit__jClass____classifiers_name_prime);
		jContainer__compilationUnit____compilationUnit
				.setName(jContainer__compilationUnit____compilationUnit_name_prime);
		jPackage__compilationUnit____compilationUnit
				.setName(jPackage__compilationUnit____compilationUnit_name_prime);
		return new Object[] { match, compilationUnit, jClass, jContainer,
				jPackage, compilationUnit__jClass____classifiers,
				jContainer__compilationUnit____compilationUnit,
				jPackage__compilationUnit____compilationUnit };
	}

	public static final Object[] pattern_ClassDefault_0_5_blackBBBBB(
			Match match, CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage) {
		return new Object[] { match, compilationUnit, jClass, jContainer,
				jPackage };
	}

	public static final Object[] pattern_ClassDefault_0_5_greenBBBF(
			Match match, ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage) {
		EMoflonEdge jContainer__jPackage____extendedJamoppPackageElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(jContainer);
		match.getContextNodes().add(jPackage);
		String jContainer__jPackage____extendedJamoppPackageElement_name_prime = "extendedJamoppPackageElement";
		jContainer__jPackage____extendedJamoppPackageElement.setSrc(jContainer);
		jContainer__jPackage____extendedJamoppPackageElement.setTrg(jPackage);
		match.getContextEdges().add(
				jContainer__jPackage____extendedJamoppPackageElement);
		jContainer__jPackage____extendedJamoppPackageElement
				.setName(jContainer__jPackage____extendedJamoppPackageElement_name_prime);
		return new Object[] { match, jContainer, jPackage,
				jContainer__jPackage____extendedJamoppPackageElement };
	}

	public static final void pattern_ClassDefault_0_6_expressionBBBBBB(
			ClassDefault _this, Match match, CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage) {
		_this.registerObjectsToMatch_FWD(match, compilationUnit, jClass,
				jContainer, jPackage);

	}

	public static final boolean pattern_ClassDefault_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassDefault_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ClassDefault_1_1_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("compilationUnit");
		EObject _localVariable_1 = isApplicableMatch.getObject("jClass");
		EObject _localVariable_2 = isApplicableMatch.getObject("jContainer");
		EObject _localVariable_3 = isApplicableMatch.getObject("jPackage");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("jPackageToTPackage");
		EObject _localVariable_5 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_6 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_7 = isApplicableMatch
				.getObject("typeGraphToJContainer");
		EObject tmpCompilationUnit = _localVariable_0;
		EObject tmpJClass = _localVariable_1;
		EObject tmpJContainer = _localVariable_2;
		EObject tmpJPackage = _localVariable_3;
		EObject tmpJPackageToTPackage = _localVariable_4;
		EObject tmpTPackage = _localVariable_5;
		EObject tmpTypeGraph = _localVariable_6;
		EObject tmpTypeGraphToJContainer = _localVariable_7;
		if (tmpCompilationUnit instanceof CompilationUnit) {
			CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
			if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
				org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
				if (tmpJContainer instanceof ExtendedJamoppJavaContainer) {
					ExtendedJamoppJavaContainer jContainer = (ExtendedJamoppJavaContainer) tmpJContainer;
					if (tmpJPackage instanceof ExtendedJamoppPackageElement) {
						ExtendedJamoppPackageElement jPackage = (ExtendedJamoppPackageElement) tmpJPackage;
						if (tmpJPackageToTPackage instanceof ExtendedJamoppPackageElementToTPackage) {
							ExtendedJamoppPackageElementToTPackage jPackageToTPackage = (ExtendedJamoppPackageElementToTPackage) tmpJPackageToTPackage;
							if (tmpTPackage instanceof TPackage) {
								TPackage tPackage = (TPackage) tmpTPackage;
								if (tmpTypeGraph instanceof TypeGraph) {
									TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
									if (tmpTypeGraphToJContainer instanceof ExtendedJamoppJavaContainerToTypeGraph) {
										ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer = (ExtendedJamoppJavaContainerToTypeGraph) tmpTypeGraphToJContainer;
										return new Object[] { compilationUnit,
												jClass, jContainer, jPackage,
												jPackageToTPackage, tPackage,
												typeGraph,
												typeGraphToJContainer,
												isApplicableMatch };
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_1_1_blackBBBBBBBBFBB(
			CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage,
			ExtendedJamoppPackageElementToTPackage jPackageToTPackage,
			TPackage tPackage, TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer,
			ClassDefault _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { compilationUnit, jClass, jContainer,
						jPackage, jPackageToTPackage, tPackage, typeGraph,
						typeGraphToJContainer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_1_1_bindingAndBlackFFFFFFFFFBB(
			ClassDefault _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassDefault_1_1_binding = pattern_ClassDefault_1_1_bindingFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ClassDefault_1_1_binding != null) {
			CompilationUnit compilationUnit = (CompilationUnit) result_pattern_ClassDefault_1_1_binding[0];
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result_pattern_ClassDefault_1_1_binding[1];
			ExtendedJamoppJavaContainer jContainer = (ExtendedJamoppJavaContainer) result_pattern_ClassDefault_1_1_binding[2];
			ExtendedJamoppPackageElement jPackage = (ExtendedJamoppPackageElement) result_pattern_ClassDefault_1_1_binding[3];
			ExtendedJamoppPackageElementToTPackage jPackageToTPackage = (ExtendedJamoppPackageElementToTPackage) result_pattern_ClassDefault_1_1_binding[4];
			TPackage tPackage = (TPackage) result_pattern_ClassDefault_1_1_binding[5];
			TypeGraph typeGraph = (TypeGraph) result_pattern_ClassDefault_1_1_binding[6];
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer = (ExtendedJamoppJavaContainerToTypeGraph) result_pattern_ClassDefault_1_1_binding[7];

			Object[] result_pattern_ClassDefault_1_1_black = pattern_ClassDefault_1_1_blackBBBBBBBBFBB(
					compilationUnit, jClass, jContainer, jPackage,
					jPackageToTPackage, tPackage, typeGraph,
					typeGraphToJContainer, _this, isApplicableMatch);
			if (result_pattern_ClassDefault_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ClassDefault_1_1_black[8];

				return new Object[] { compilationUnit, jClass, jContainer,
						jPackage, jPackageToTPackage, tPackage, typeGraph,
						typeGraphToJContainer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_1_1_greenBFBFFBBB(
			CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			TPackage tPackage, TypeGraph typeGraph, CSP csp) {
		CompilationUnitToTClass compilationUnitToTClass = GravityTGGFactory.eINSTANCE
				.createCompilationUnitToTClass();
		ClassToTClass jClassToTClass = GravityTGGFactory.eINSTANCE
				.createClassToTClass();
		TClass tClass = TypeGraphBasicFactory.eINSTANCE.createTClass();
		Object _localVariable_0 = csp.getValue("tClass", "tName");
		compilationUnitToTClass.setSource(compilationUnit);
		jClassToTClass.setSource(jClass);
		compilationUnitToTClass.setTarget(tClass);
		jClassToTClass.setTarget(tClass);
		tPackage.getContainedClasses().add(tClass);
		typeGraph.getClasses().add(tClass);
		String tClass_tName_prime = (String) _localVariable_0;
		tClass.setTName(tClass_tName_prime);
		return new Object[] { compilationUnit, compilationUnitToTClass, jClass,
				jClassToTClass, tClass, tPackage, typeGraph, csp };
	}

	public static final Object[] pattern_ClassDefault_1_2_blackBBBBB(
			CompilationUnit compilationUnit,
			CompilationUnitToTClass compilationUnitToTClass,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass, TClass tClass) {
		return new Object[] { compilationUnit, compilationUnitToTClass, jClass,
				jClassToTClass, tClass };
	}

	public static final Object[] pattern_ClassDefault_1_2_greenFBBBBB(
			CompilationUnit compilationUnit,
			CompilationUnitToTClass compilationUnitToTClass,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass, TClass tClass) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(compilationUnit);
		ruleresult.getCreatedLinkElements().add(compilationUnitToTClass);
		ruleresult.getTranslatedElements().add(jClass);
		ruleresult.getCreatedLinkElements().add(jClassToTClass);
		ruleresult.getCreatedElements().add(tClass);
		return new Object[] { ruleresult, compilationUnit,
				compilationUnitToTClass, jClass, jClassToTClass, tClass };
	}

	public static final Object[] pattern_ClassDefault_1_3_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject compilationUnit,
			EObject compilationUnitToTClass, EObject jClass,
			EObject jClassToTClass, EObject jContainer, EObject jPackage,
			EObject jPackageToTPackage, EObject tClass, EObject tPackage,
			EObject typeGraph, EObject typeGraphToJContainer) {
		if (!compilationUnit.equals(compilationUnitToTClass)) {
			if (!compilationUnit.equals(jClass)) {
				if (!compilationUnit.equals(jClassToTClass)) {
					if (!compilationUnit.equals(jContainer)) {
						if (!compilationUnit.equals(jPackage)) {
							if (!compilationUnit.equals(jPackageToTPackage)) {
								if (!compilationUnit.equals(tClass)) {
									if (!compilationUnit.equals(tPackage)) {
										if (!compilationUnit.equals(typeGraph)) {
											if (!compilationUnit
													.equals(typeGraphToJContainer)) {
												if (!compilationUnitToTClass
														.equals(jClass)) {
													if (!compilationUnitToTClass
															.equals(jClassToTClass)) {
														if (!compilationUnitToTClass
																.equals(jContainer)) {
															if (!compilationUnitToTClass
																	.equals(jPackage)) {
																if (!compilationUnitToTClass
																		.equals(jPackageToTPackage)) {
																	if (!compilationUnitToTClass
																			.equals(tClass)) {
																		if (!compilationUnitToTClass
																				.equals(tPackage)) {
																			if (!compilationUnitToTClass
																					.equals(typeGraph)) {
																				if (!compilationUnitToTClass
																						.equals(typeGraphToJContainer)) {
																					if (!jClass
																							.equals(jClassToTClass)) {
																						if (!jClass
																								.equals(jContainer)) {
																							if (!jClass
																									.equals(jPackage)) {
																								if (!jClass
																										.equals(jPackageToTPackage)) {
																									if (!jClass
																											.equals(tClass)) {
																										if (!jClass
																												.equals(tPackage)) {
																											if (!jClass
																													.equals(typeGraph)) {
																												if (!jClass
																														.equals(typeGraphToJContainer)) {
																													if (!jClassToTClass
																															.equals(jContainer)) {
																														if (!jClassToTClass
																																.equals(jPackage)) {
																															if (!jClassToTClass
																																	.equals(jPackageToTPackage)) {
																																if (!jClassToTClass
																																		.equals(tClass)) {
																																	if (!jClassToTClass
																																			.equals(tPackage)) {
																																		if (!jClassToTClass
																																				.equals(typeGraph)) {
																																			if (!jClassToTClass
																																					.equals(typeGraphToJContainer)) {
																																				if (!jContainer
																																						.equals(jPackage)) {
																																					if (!jContainer
																																							.equals(jPackageToTPackage)) {
																																						if (!jContainer
																																								.equals(tClass)) {
																																							if (!jContainer
																																									.equals(tPackage)) {
																																								if (!jContainer
																																										.equals(typeGraph)) {
																																									if (!jContainer
																																											.equals(typeGraphToJContainer)) {
																																										if (!jPackage
																																												.equals(jPackageToTPackage)) {
																																											if (!jPackage
																																													.equals(tClass)) {
																																												if (!jPackage
																																														.equals(tPackage)) {
																																													if (!jPackage
																																															.equals(typeGraph)) {
																																														if (!jPackage
																																																.equals(typeGraphToJContainer)) {
																																															if (!jPackageToTPackage
																																																	.equals(tClass)) {
																																																if (!jPackageToTPackage
																																																		.equals(tPackage)) {
																																																	if (!jPackageToTPackage
																																																			.equals(typeGraph)) {
																																																		if (!jPackageToTPackage
																																																				.equals(typeGraphToJContainer)) {
																																																			if (!tClass
																																																					.equals(tPackage)) {
																																																				if (!tClass
																																																						.equals(typeGraph)) {
																																																					if (!tClass
																																																							.equals(typeGraphToJContainer)) {
																																																						if (!tPackage
																																																								.equals(typeGraph)) {
																																																							if (!tPackage
																																																									.equals(typeGraphToJContainer)) {
																																																								if (!typeGraph
																																																										.equals(typeGraphToJContainer)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											compilationUnit,
																																																											compilationUnitToTClass,
																																																											jClass,
																																																											jClassToTClass,
																																																											jContainer,
																																																											jPackage,
																																																											jPackageToTPackage,
																																																											tClass,
																																																											tPackage,
																																																											typeGraph,
																																																											typeGraphToJContainer };
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_1_3_greenBBBBBBBBBBFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject compilationUnit,
			EObject compilationUnitToTClass, EObject jClass,
			EObject jClassToTClass, EObject jContainer, EObject jPackage,
			EObject tClass, EObject tPackage, EObject typeGraph) {
		EMoflonEdge compilationUnit__jClass____classifiers = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge compilationUnitToTClass__tClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge compilationUnitToTClass__compilationUnit____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClassToTClass__tClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClassToTClass__jClass____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jContainer__compilationUnit____compilationUnit = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jPackage__compilationUnit____compilationUnit = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tPackage__tClass____containedClasses = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tClass__tPackage____package = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge typeGraph__tClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassDefault";
		String compilationUnit__jClass____classifiers_name_prime = "classifiers";
		String compilationUnitToTClass__tClass____target_name_prime = "target";
		String compilationUnitToTClass__compilationUnit____source_name_prime = "source";
		String jClassToTClass__tClass____target_name_prime = "target";
		String jClassToTClass__jClass____source_name_prime = "source";
		String jContainer__compilationUnit____compilationUnit_name_prime = "compilationUnit";
		String jPackage__compilationUnit____compilationUnit_name_prime = "compilationUnit";
		String tPackage__tClass____containedClasses_name_prime = "containedClasses";
		String tClass__tPackage____package_name_prime = "package";
		String typeGraph__tClass____classes_name_prime = "classes";
		compilationUnit__jClass____classifiers.setSrc(compilationUnit);
		compilationUnit__jClass____classifiers.setTrg(jClass);
		ruleresult.getTranslatedEdges().add(
				compilationUnit__jClass____classifiers);
		compilationUnitToTClass__tClass____target
				.setSrc(compilationUnitToTClass);
		compilationUnitToTClass__tClass____target.setTrg(tClass);
		ruleresult.getCreatedEdges().add(
				compilationUnitToTClass__tClass____target);
		compilationUnitToTClass__compilationUnit____source
				.setSrc(compilationUnitToTClass);
		compilationUnitToTClass__compilationUnit____source
				.setTrg(compilationUnit);
		ruleresult.getCreatedEdges().add(
				compilationUnitToTClass__compilationUnit____source);
		jClassToTClass__tClass____target.setSrc(jClassToTClass);
		jClassToTClass__tClass____target.setTrg(tClass);
		ruleresult.getCreatedEdges().add(jClassToTClass__tClass____target);
		jClassToTClass__jClass____source.setSrc(jClassToTClass);
		jClassToTClass__jClass____source.setTrg(jClass);
		ruleresult.getCreatedEdges().add(jClassToTClass__jClass____source);
		jContainer__compilationUnit____compilationUnit.setSrc(jContainer);
		jContainer__compilationUnit____compilationUnit.setTrg(compilationUnit);
		ruleresult.getTranslatedEdges().add(
				jContainer__compilationUnit____compilationUnit);
		jPackage__compilationUnit____compilationUnit.setSrc(jPackage);
		jPackage__compilationUnit____compilationUnit.setTrg(compilationUnit);
		ruleresult.getTranslatedEdges().add(
				jPackage__compilationUnit____compilationUnit);
		tPackage__tClass____containedClasses.setSrc(tPackage);
		tPackage__tClass____containedClasses.setTrg(tClass);
		ruleresult.getCreatedEdges().add(tPackage__tClass____containedClasses);
		tClass__tPackage____package.setSrc(tClass);
		tClass__tPackage____package.setTrg(tPackage);
		ruleresult.getCreatedEdges().add(tClass__tPackage____package);
		typeGraph__tClass____classes.setSrc(typeGraph);
		typeGraph__tClass____classes.setTrg(tClass);
		ruleresult.getCreatedEdges().add(typeGraph__tClass____classes);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		compilationUnit__jClass____classifiers
				.setName(compilationUnit__jClass____classifiers_name_prime);
		compilationUnitToTClass__tClass____target
				.setName(compilationUnitToTClass__tClass____target_name_prime);
		compilationUnitToTClass__compilationUnit____source
				.setName(compilationUnitToTClass__compilationUnit____source_name_prime);
		jClassToTClass__tClass____target
				.setName(jClassToTClass__tClass____target_name_prime);
		jClassToTClass__jClass____source
				.setName(jClassToTClass__jClass____source_name_prime);
		jContainer__compilationUnit____compilationUnit
				.setName(jContainer__compilationUnit____compilationUnit_name_prime);
		jPackage__compilationUnit____compilationUnit
				.setName(jPackage__compilationUnit____compilationUnit_name_prime);
		tPackage__tClass____containedClasses
				.setName(tPackage__tClass____containedClasses_name_prime);
		tClass__tPackage____package
				.setName(tClass__tPackage____package_name_prime);
		typeGraph__tClass____classes
				.setName(typeGraph__tClass____classes_name_prime);
		return new Object[] { ruleresult, compilationUnit,
				compilationUnitToTClass, jClass, jClassToTClass, jContainer,
				jPackage, tClass, tPackage, typeGraph,
				compilationUnit__jClass____classifiers,
				compilationUnitToTClass__tClass____target,
				compilationUnitToTClass__compilationUnit____source,
				jClassToTClass__tClass____target,
				jClassToTClass__jClass____source,
				jContainer__compilationUnit____compilationUnit,
				jPackage__compilationUnit____compilationUnit,
				tPackage__tClass____containedClasses,
				tClass__tPackage____package, typeGraph__tClass____classes };
	}

	public static final void pattern_ClassDefault_1_5_expressionBBBBBBBBBBBBB(
			ClassDefault _this, PerformRuleResult ruleresult,
			EObject compilationUnit, EObject compilationUnitToTClass,
			EObject jClass, EObject jClassToTClass, EObject jContainer,
			EObject jPackage, EObject jPackageToTPackage, EObject tClass,
			EObject tPackage, EObject typeGraph, EObject typeGraphToJContainer) {
		_this.registerObjects_FWD(ruleresult, compilationUnit,
				compilationUnitToTClass, jClass, jClassToTClass, jContainer,
				jPackage, jPackageToTPackage, tClass, tPackage, typeGraph,
				typeGraphToJContainer);

	}

	public static final PerformRuleResult pattern_ClassDefault_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassDefault_2_1_bindingFB(
			ClassDefault _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_2_1_blackFBB(
			EClass eClass, ClassDefault _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_2_1_bindingAndBlackFFB(
			ClassDefault _this) {
		Object[] result_pattern_ClassDefault_2_1_binding = pattern_ClassDefault_2_1_bindingFB(_this);
		if (result_pattern_ClassDefault_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassDefault_2_1_binding[0];

			Object[] result_pattern_ClassDefault_2_1_black = pattern_ClassDefault_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ClassDefault_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassDefault_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ClassDefault";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassDefault_2_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("compilationUnit");
		EObject _localVariable_1 = match.getObject("jClass");
		EObject _localVariable_2 = match.getObject("jContainer");
		EObject _localVariable_3 = match.getObject("jPackage");
		EObject tmpCompilationUnit = _localVariable_0;
		EObject tmpJClass = _localVariable_1;
		EObject tmpJContainer = _localVariable_2;
		EObject tmpJPackage = _localVariable_3;
		if (tmpCompilationUnit instanceof CompilationUnit) {
			CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
			if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
				org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
				if (tmpJContainer instanceof ExtendedJamoppJavaContainer) {
					ExtendedJamoppJavaContainer jContainer = (ExtendedJamoppJavaContainer) tmpJContainer;
					if (tmpJPackage instanceof ExtendedJamoppPackageElement) {
						ExtendedJamoppPackageElement jPackage = (ExtendedJamoppPackageElement) tmpJPackage;
						return new Object[] { compilationUnit, jClass,
								jContainer, jPackage, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassDefault_2_2_blackBBBBFFFFB(
			CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ExtendedJamoppPackageElementToTPackage jPackageToTPackage : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(jPackage,
						ExtendedJamoppPackageElementToTPackage.class, "source")) {
			TPackage tPackage = jPackageToTPackage.getTarget();
			if (tPackage != null) {
				for (ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(jContainer,
								ExtendedJamoppJavaContainerToTypeGraph.class,
								"source")) {
					TypeGraph typeGraph = typeGraphToJContainer.getTarget();
					if (typeGraph != null) {
						_result.add(new Object[] { compilationUnit, jClass,
								jContainer, jPackage, jPackageToTPackage,
								tPackage, typeGraph, typeGraphToJContainer,
								match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassDefault_2_3_blackBBBBBBBB(
			CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage,
			ExtendedJamoppPackageElementToTPackage jPackageToTPackage,
			TPackage tPackage, TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (compilationUnit.getClassifiers().contains(jClass)) {
			if (jContainer.getExtendedJamoppPackageElement().contains(jPackage)) {
				if (jContainer.getCompilationUnit().contains(compilationUnit)) {
					if (jPackage.getCompilationUnit().contains(compilationUnit)) {
						if (tPackage.equals(jPackageToTPackage.getTarget())) {
							if (jPackage.equals(jPackageToTPackage.getSource())) {
								if (typeGraph.equals(typeGraphToJContainer
										.getTarget())) {
									if (jContainer.equals(typeGraphToJContainer
											.getSource())) {
										_result.add(new Object[] {
												compilationUnit, jClass,
												jContainer, jPackage,
												jPackageToTPackage, tPackage,
												typeGraph,
												typeGraphToJContainer });
									}
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ClassDefault_2_3_greenBBBBBBBBFFFFFFFFF(
			CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage,
			ExtendedJamoppPackageElementToTPackage jPackageToTPackage,
			TPackage tPackage, TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge compilationUnit__jClass____classifiers = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jContainer__jPackage____extendedJamoppPackageElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jContainer__compilationUnit____compilationUnit = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jPackage__compilationUnit____compilationUnit = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jPackageToTPackage__tPackage____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jPackageToTPackage__jPackage____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge typeGraphToJContainer__typeGraph____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge typeGraphToJContainer__jContainer____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String compilationUnit__jClass____classifiers_name_prime = "classifiers";
		String jContainer__jPackage____extendedJamoppPackageElement_name_prime = "extendedJamoppPackageElement";
		String jContainer__compilationUnit____compilationUnit_name_prime = "compilationUnit";
		String jPackage__compilationUnit____compilationUnit_name_prime = "compilationUnit";
		String jPackageToTPackage__tPackage____target_name_prime = "target";
		String jPackageToTPackage__jPackage____source_name_prime = "source";
		String typeGraphToJContainer__typeGraph____target_name_prime = "target";
		String typeGraphToJContainer__jContainer____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(compilationUnit);
		isApplicableMatch.getAllContextElements().add(jClass);
		isApplicableMatch.getAllContextElements().add(jContainer);
		isApplicableMatch.getAllContextElements().add(jPackage);
		isApplicableMatch.getAllContextElements().add(jPackageToTPackage);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(typeGraphToJContainer);
		compilationUnit__jClass____classifiers.setSrc(compilationUnit);
		compilationUnit__jClass____classifiers.setTrg(jClass);
		isApplicableMatch.getAllContextElements().add(
				compilationUnit__jClass____classifiers);
		jContainer__jPackage____extendedJamoppPackageElement.setSrc(jContainer);
		jContainer__jPackage____extendedJamoppPackageElement.setTrg(jPackage);
		isApplicableMatch.getAllContextElements().add(
				jContainer__jPackage____extendedJamoppPackageElement);
		jContainer__compilationUnit____compilationUnit.setSrc(jContainer);
		jContainer__compilationUnit____compilationUnit.setTrg(compilationUnit);
		isApplicableMatch.getAllContextElements().add(
				jContainer__compilationUnit____compilationUnit);
		jPackage__compilationUnit____compilationUnit.setSrc(jPackage);
		jPackage__compilationUnit____compilationUnit.setTrg(compilationUnit);
		isApplicableMatch.getAllContextElements().add(
				jPackage__compilationUnit____compilationUnit);
		jPackageToTPackage__tPackage____target.setSrc(jPackageToTPackage);
		jPackageToTPackage__tPackage____target.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(
				jPackageToTPackage__tPackage____target);
		jPackageToTPackage__jPackage____source.setSrc(jPackageToTPackage);
		jPackageToTPackage__jPackage____source.setTrg(jPackage);
		isApplicableMatch.getAllContextElements().add(
				jPackageToTPackage__jPackage____source);
		typeGraphToJContainer__typeGraph____target
				.setSrc(typeGraphToJContainer);
		typeGraphToJContainer__typeGraph____target.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(
				typeGraphToJContainer__typeGraph____target);
		typeGraphToJContainer__jContainer____source
				.setSrc(typeGraphToJContainer);
		typeGraphToJContainer__jContainer____source.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(
				typeGraphToJContainer__jContainer____source);
		compilationUnit__jClass____classifiers
				.setName(compilationUnit__jClass____classifiers_name_prime);
		jContainer__jPackage____extendedJamoppPackageElement
				.setName(jContainer__jPackage____extendedJamoppPackageElement_name_prime);
		jContainer__compilationUnit____compilationUnit
				.setName(jContainer__compilationUnit____compilationUnit_name_prime);
		jPackage__compilationUnit____compilationUnit
				.setName(jPackage__compilationUnit____compilationUnit_name_prime);
		jPackageToTPackage__tPackage____target
				.setName(jPackageToTPackage__tPackage____target_name_prime);
		jPackageToTPackage__jPackage____source
				.setName(jPackageToTPackage__jPackage____source_name_prime);
		typeGraphToJContainer__typeGraph____target
				.setName(typeGraphToJContainer__typeGraph____target_name_prime);
		typeGraphToJContainer__jContainer____source
				.setName(typeGraphToJContainer__jContainer____source_name_prime);
		return new Object[] { compilationUnit, jClass, jContainer, jPackage,
				jPackageToTPackage, tPackage, typeGraph, typeGraphToJContainer,
				isApplicableMatch, compilationUnit__jClass____classifiers,
				jContainer__jPackage____extendedJamoppPackageElement,
				jContainer__compilationUnit____compilationUnit,
				jPackage__compilationUnit____compilationUnit,
				jPackageToTPackage__tPackage____target,
				jPackageToTPackage__jPackage____source,
				typeGraphToJContainer__typeGraph____target,
				typeGraphToJContainer__jContainer____source };
	}

	public static final Object[] pattern_ClassDefault_2_4_bindingFBBBBBBBBBB(
			ClassDefault _this, IsApplicableMatch isApplicableMatch,
			CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage,
			ExtendedJamoppPackageElementToTPackage jPackageToTPackage,
			TPackage tPackage, TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, compilationUnit, jClass, jContainer,
				jPackage, jPackageToTPackage, tPackage, typeGraph,
				typeGraphToJContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					compilationUnit, jClass, jContainer, jPackage,
					jPackageToTPackage, tPackage, typeGraph,
					typeGraphToJContainer };
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassDefault_2_4_bindingAndBlackFBBBBBBBBBB(
			ClassDefault _this, IsApplicableMatch isApplicableMatch,
			CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage,
			ExtendedJamoppPackageElementToTPackage jPackageToTPackage,
			TPackage tPackage, TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer) {
		Object[] result_pattern_ClassDefault_2_4_binding = pattern_ClassDefault_2_4_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, compilationUnit, jClass, jContainer,
				jPackage, jPackageToTPackage, tPackage, typeGraph,
				typeGraphToJContainer);
		if (result_pattern_ClassDefault_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ClassDefault_2_4_binding[0];

			Object[] result_pattern_ClassDefault_2_4_black = pattern_ClassDefault_2_4_blackB(csp);
			if (result_pattern_ClassDefault_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						compilationUnit, jClass, jContainer, jPackage,
						jPackageToTPackage, tPackage, typeGraph,
						typeGraphToJContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassDefault_2_5_expressionFBB(
			ClassDefault _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassDefault_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassDefault_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassDefault";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassDefault_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassDefault_10_1_blackBBBBB(
			ClassDefault _this, Match match, TClass tClass, TPackage tPackage,
			TypeGraph typeGraph) {
		return new Object[] { _this, match, tClass, tPackage, typeGraph };
	}

	public static final Object[] pattern_ClassDefault_10_2_bindingFBBBBB(
			ClassDefault _this, Match match, TClass tClass, TPackage tPackage,
			TypeGraph typeGraph) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tClass,
				tPackage, typeGraph);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tClass, tPackage,
					typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassDefault_10_2_bindingAndBlackFBBBBB(
			ClassDefault _this, Match match, TClass tClass, TPackage tPackage,
			TypeGraph typeGraph) {
		Object[] result_pattern_ClassDefault_10_2_binding = pattern_ClassDefault_10_2_bindingFBBBBB(
				_this, match, tClass, tPackage, typeGraph);
		if (result_pattern_ClassDefault_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ClassDefault_10_2_binding[0];

			Object[] result_pattern_ClassDefault_10_2_black = pattern_ClassDefault_10_2_blackB(csp);
			if (result_pattern_ClassDefault_10_2_black != null) {

				return new Object[] { csp, _this, match, tClass, tPackage,
						typeGraph };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassDefault_10_3_expressionFBB(
			ClassDefault _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassDefault_10_4_blackBBBB(
			Match match, TClass tClass, TPackage tPackage, TypeGraph typeGraph) {
		return new Object[] { match, tClass, tPackage, typeGraph };
	}

	public static final Object[] pattern_ClassDefault_10_4_greenBBBBFFF(
			Match match, TClass tClass, TPackage tPackage, TypeGraph typeGraph) {
		EMoflonEdge tPackage__tClass____containedClasses = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tClass__tPackage____package = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge typeGraph__tClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tClass);
		String tPackage__tClass____containedClasses_name_prime = "containedClasses";
		String tClass__tPackage____package_name_prime = "package";
		String typeGraph__tClass____classes_name_prime = "classes";
		tPackage__tClass____containedClasses.setSrc(tPackage);
		tPackage__tClass____containedClasses.setTrg(tClass);
		match.getToBeTranslatedEdges()
				.add(tPackage__tClass____containedClasses);
		tClass__tPackage____package.setSrc(tClass);
		tClass__tPackage____package.setTrg(tPackage);
		match.getToBeTranslatedEdges().add(tClass__tPackage____package);
		typeGraph__tClass____classes.setSrc(typeGraph);
		typeGraph__tClass____classes.setTrg(tClass);
		match.getToBeTranslatedEdges().add(typeGraph__tClass____classes);
		tPackage__tClass____containedClasses
				.setName(tPackage__tClass____containedClasses_name_prime);
		tClass__tPackage____package
				.setName(tClass__tPackage____package_name_prime);
		typeGraph__tClass____classes
				.setName(typeGraph__tClass____classes_name_prime);
		return new Object[] { match, tClass, tPackage, typeGraph,
				tPackage__tClass____containedClasses,
				tClass__tPackage____package, typeGraph__tClass____classes };
	}

	public static final Object[] pattern_ClassDefault_10_5_blackBBBB(
			Match match, TClass tClass, TPackage tPackage, TypeGraph typeGraph) {
		return new Object[] { match, tClass, tPackage, typeGraph };
	}

	public static final Object[] pattern_ClassDefault_10_5_greenBBB(
			Match match, TPackage tPackage, TypeGraph typeGraph) {
		match.getContextNodes().add(tPackage);
		match.getContextNodes().add(typeGraph);
		return new Object[] { match, tPackage, typeGraph };
	}

	public static final void pattern_ClassDefault_10_6_expressionBBBBB(
			ClassDefault _this, Match match, TClass tClass, TPackage tPackage,
			TypeGraph typeGraph) {
		_this.registerObjectsToMatch_BWD(match, tClass, tPackage, typeGraph);

	}

	public static final boolean pattern_ClassDefault_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassDefault_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ClassDefault_11_1_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jContainer");
		EObject _localVariable_1 = isApplicableMatch.getObject("jPackage");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("jPackageToTPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_5 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("typeGraphToJContainer");
		EObject tmpJContainer = _localVariable_0;
		EObject tmpJPackage = _localVariable_1;
		EObject tmpJPackageToTPackage = _localVariable_2;
		EObject tmpTClass = _localVariable_3;
		EObject tmpTPackage = _localVariable_4;
		EObject tmpTypeGraph = _localVariable_5;
		EObject tmpTypeGraphToJContainer = _localVariable_6;
		if (tmpJContainer instanceof ExtendedJamoppJavaContainer) {
			ExtendedJamoppJavaContainer jContainer = (ExtendedJamoppJavaContainer) tmpJContainer;
			if (tmpJPackage instanceof ExtendedJamoppPackageElement) {
				ExtendedJamoppPackageElement jPackage = (ExtendedJamoppPackageElement) tmpJPackage;
				if (tmpJPackageToTPackage instanceof ExtendedJamoppPackageElementToTPackage) {
					ExtendedJamoppPackageElementToTPackage jPackageToTPackage = (ExtendedJamoppPackageElementToTPackage) tmpJPackageToTPackage;
					if (tmpTClass instanceof TClass) {
						TClass tClass = (TClass) tmpTClass;
						if (tmpTPackage instanceof TPackage) {
							TPackage tPackage = (TPackage) tmpTPackage;
							if (tmpTypeGraph instanceof TypeGraph) {
								TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
								if (tmpTypeGraphToJContainer instanceof ExtendedJamoppJavaContainerToTypeGraph) {
									ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer = (ExtendedJamoppJavaContainerToTypeGraph) tmpTypeGraphToJContainer;
									return new Object[] { jContainer, jPackage,
											jPackageToTPackage, tClass,
											tPackage, typeGraph,
											typeGraphToJContainer,
											isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_11_1_blackBBBBBBBFBB(
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage,
			ExtendedJamoppPackageElementToTPackage jPackageToTPackage,
			TClass tClass, TPackage tPackage, TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer,
			ClassDefault _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jContainer, jPackage, jPackageToTPackage,
						tClass, tPackage, typeGraph, typeGraphToJContainer,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_11_1_bindingAndBlackFFFFFFFFBB(
			ClassDefault _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassDefault_11_1_binding = pattern_ClassDefault_11_1_bindingFFFFFFFB(isApplicableMatch);
		if (result_pattern_ClassDefault_11_1_binding != null) {
			ExtendedJamoppJavaContainer jContainer = (ExtendedJamoppJavaContainer) result_pattern_ClassDefault_11_1_binding[0];
			ExtendedJamoppPackageElement jPackage = (ExtendedJamoppPackageElement) result_pattern_ClassDefault_11_1_binding[1];
			ExtendedJamoppPackageElementToTPackage jPackageToTPackage = (ExtendedJamoppPackageElementToTPackage) result_pattern_ClassDefault_11_1_binding[2];
			TClass tClass = (TClass) result_pattern_ClassDefault_11_1_binding[3];
			TPackage tPackage = (TPackage) result_pattern_ClassDefault_11_1_binding[4];
			TypeGraph typeGraph = (TypeGraph) result_pattern_ClassDefault_11_1_binding[5];
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer = (ExtendedJamoppJavaContainerToTypeGraph) result_pattern_ClassDefault_11_1_binding[6];

			Object[] result_pattern_ClassDefault_11_1_black = pattern_ClassDefault_11_1_blackBBBBBBBFBB(
					jContainer, jPackage, jPackageToTPackage, tClass, tPackage,
					typeGraph, typeGraphToJContainer, _this, isApplicableMatch);
			if (result_pattern_ClassDefault_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ClassDefault_11_1_black[7];

				return new Object[] { jContainer, jPackage, jPackageToTPackage,
						tClass, tPackage, typeGraph, typeGraphToJContainer,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_11_1_greenFFFFBBBB(
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage, TClass tClass, CSP csp) {
		CompilationUnit compilationUnit = ContainersFactory.eINSTANCE
				.createCompilationUnit();
		CompilationUnitToTClass compilationUnitToTClass = GravityTGGFactory.eINSTANCE
				.createCompilationUnitToTClass();
		org.emftext.language.java.classifiers.Class jClass = ClassifiersFactory.eINSTANCE
				.createClass();
		ClassToTClass jClassToTClass = GravityTGGFactory.eINSTANCE
				.createClassToTClass();
		Object _localVariable_0 = csp.getValue("jClass", "name");
		jContainer.getCompilationUnit().add(compilationUnit);
		jPackage.getCompilationUnit().add(compilationUnit);
		compilationUnitToTClass.setTarget(tClass);
		compilationUnitToTClass.setSource(compilationUnit);
		compilationUnit.getClassifiers().add(jClass);
		jClassToTClass.setTarget(tClass);
		jClassToTClass.setSource(jClass);
		String jClass_name_prime = (String) _localVariable_0;
		jClass.setName(jClass_name_prime);
		return new Object[] { compilationUnit, compilationUnitToTClass, jClass,
				jClassToTClass, jContainer, jPackage, tClass, csp };
	}

	public static final Object[] pattern_ClassDefault_11_2_blackBBBBB(
			CompilationUnit compilationUnit,
			CompilationUnitToTClass compilationUnitToTClass,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass, TClass tClass) {
		return new Object[] { compilationUnit, compilationUnitToTClass, jClass,
				jClassToTClass, tClass };
	}

	public static final Object[] pattern_ClassDefault_11_2_greenFBBBBB(
			CompilationUnit compilationUnit,
			CompilationUnitToTClass compilationUnitToTClass,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass, TClass tClass) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(compilationUnit);
		ruleresult.getCreatedLinkElements().add(compilationUnitToTClass);
		ruleresult.getCreatedElements().add(jClass);
		ruleresult.getCreatedLinkElements().add(jClassToTClass);
		ruleresult.getTranslatedElements().add(tClass);
		return new Object[] { ruleresult, compilationUnit,
				compilationUnitToTClass, jClass, jClassToTClass, tClass };
	}

	public static final Object[] pattern_ClassDefault_11_3_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject compilationUnit,
			EObject compilationUnitToTClass, EObject jClass,
			EObject jClassToTClass, EObject jContainer, EObject jPackage,
			EObject jPackageToTPackage, EObject tClass, EObject tPackage,
			EObject typeGraph, EObject typeGraphToJContainer) {
		if (!compilationUnit.equals(compilationUnitToTClass)) {
			if (!compilationUnit.equals(jClass)) {
				if (!compilationUnit.equals(jClassToTClass)) {
					if (!compilationUnit.equals(jContainer)) {
						if (!compilationUnit.equals(jPackage)) {
							if (!compilationUnit.equals(jPackageToTPackage)) {
								if (!compilationUnit.equals(tClass)) {
									if (!compilationUnit.equals(tPackage)) {
										if (!compilationUnit.equals(typeGraph)) {
											if (!compilationUnit
													.equals(typeGraphToJContainer)) {
												if (!compilationUnitToTClass
														.equals(jClass)) {
													if (!compilationUnitToTClass
															.equals(jClassToTClass)) {
														if (!compilationUnitToTClass
																.equals(jContainer)) {
															if (!compilationUnitToTClass
																	.equals(jPackage)) {
																if (!compilationUnitToTClass
																		.equals(jPackageToTPackage)) {
																	if (!compilationUnitToTClass
																			.equals(tClass)) {
																		if (!compilationUnitToTClass
																				.equals(tPackage)) {
																			if (!compilationUnitToTClass
																					.equals(typeGraph)) {
																				if (!compilationUnitToTClass
																						.equals(typeGraphToJContainer)) {
																					if (!jClass
																							.equals(jClassToTClass)) {
																						if (!jClass
																								.equals(jContainer)) {
																							if (!jClass
																									.equals(jPackage)) {
																								if (!jClass
																										.equals(jPackageToTPackage)) {
																									if (!jClass
																											.equals(tClass)) {
																										if (!jClass
																												.equals(tPackage)) {
																											if (!jClass
																													.equals(typeGraph)) {
																												if (!jClass
																														.equals(typeGraphToJContainer)) {
																													if (!jClassToTClass
																															.equals(jContainer)) {
																														if (!jClassToTClass
																																.equals(jPackage)) {
																															if (!jClassToTClass
																																	.equals(jPackageToTPackage)) {
																																if (!jClassToTClass
																																		.equals(tClass)) {
																																	if (!jClassToTClass
																																			.equals(tPackage)) {
																																		if (!jClassToTClass
																																				.equals(typeGraph)) {
																																			if (!jClassToTClass
																																					.equals(typeGraphToJContainer)) {
																																				if (!jContainer
																																						.equals(jPackage)) {
																																					if (!jContainer
																																							.equals(jPackageToTPackage)) {
																																						if (!jContainer
																																								.equals(tClass)) {
																																							if (!jContainer
																																									.equals(tPackage)) {
																																								if (!jContainer
																																										.equals(typeGraph)) {
																																									if (!jContainer
																																											.equals(typeGraphToJContainer)) {
																																										if (!jPackage
																																												.equals(jPackageToTPackage)) {
																																											if (!jPackage
																																													.equals(tClass)) {
																																												if (!jPackage
																																														.equals(tPackage)) {
																																													if (!jPackage
																																															.equals(typeGraph)) {
																																														if (!jPackage
																																																.equals(typeGraphToJContainer)) {
																																															if (!jPackageToTPackage
																																																	.equals(tClass)) {
																																																if (!jPackageToTPackage
																																																		.equals(tPackage)) {
																																																	if (!jPackageToTPackage
																																																			.equals(typeGraph)) {
																																																		if (!jPackageToTPackage
																																																				.equals(typeGraphToJContainer)) {
																																																			if (!tClass
																																																					.equals(tPackage)) {
																																																				if (!tClass
																																																						.equals(typeGraph)) {
																																																					if (!tClass
																																																							.equals(typeGraphToJContainer)) {
																																																						if (!tPackage
																																																								.equals(typeGraph)) {
																																																							if (!tPackage
																																																									.equals(typeGraphToJContainer)) {
																																																								if (!typeGraph
																																																										.equals(typeGraphToJContainer)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											compilationUnit,
																																																											compilationUnitToTClass,
																																																											jClass,
																																																											jClassToTClass,
																																																											jContainer,
																																																											jPackage,
																																																											jPackageToTPackage,
																																																											tClass,
																																																											tPackage,
																																																											typeGraph,
																																																											typeGraphToJContainer };
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_11_3_greenBBBBBBBBBBFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject compilationUnit,
			EObject compilationUnitToTClass, EObject jClass,
			EObject jClassToTClass, EObject jContainer, EObject jPackage,
			EObject tClass, EObject tPackage, EObject typeGraph) {
		EMoflonEdge compilationUnit__jClass____classifiers = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge compilationUnitToTClass__tClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge compilationUnitToTClass__compilationUnit____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClassToTClass__tClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClassToTClass__jClass____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jContainer__compilationUnit____compilationUnit = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jPackage__compilationUnit____compilationUnit = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tPackage__tClass____containedClasses = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tClass__tPackage____package = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge typeGraph__tClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassDefault";
		String compilationUnit__jClass____classifiers_name_prime = "classifiers";
		String compilationUnitToTClass__tClass____target_name_prime = "target";
		String compilationUnitToTClass__compilationUnit____source_name_prime = "source";
		String jClassToTClass__tClass____target_name_prime = "target";
		String jClassToTClass__jClass____source_name_prime = "source";
		String jContainer__compilationUnit____compilationUnit_name_prime = "compilationUnit";
		String jPackage__compilationUnit____compilationUnit_name_prime = "compilationUnit";
		String tPackage__tClass____containedClasses_name_prime = "containedClasses";
		String tClass__tPackage____package_name_prime = "package";
		String typeGraph__tClass____classes_name_prime = "classes";
		compilationUnit__jClass____classifiers.setSrc(compilationUnit);
		compilationUnit__jClass____classifiers.setTrg(jClass);
		ruleresult.getCreatedEdges()
				.add(compilationUnit__jClass____classifiers);
		compilationUnitToTClass__tClass____target
				.setSrc(compilationUnitToTClass);
		compilationUnitToTClass__tClass____target.setTrg(tClass);
		ruleresult.getCreatedEdges().add(
				compilationUnitToTClass__tClass____target);
		compilationUnitToTClass__compilationUnit____source
				.setSrc(compilationUnitToTClass);
		compilationUnitToTClass__compilationUnit____source
				.setTrg(compilationUnit);
		ruleresult.getCreatedEdges().add(
				compilationUnitToTClass__compilationUnit____source);
		jClassToTClass__tClass____target.setSrc(jClassToTClass);
		jClassToTClass__tClass____target.setTrg(tClass);
		ruleresult.getCreatedEdges().add(jClassToTClass__tClass____target);
		jClassToTClass__jClass____source.setSrc(jClassToTClass);
		jClassToTClass__jClass____source.setTrg(jClass);
		ruleresult.getCreatedEdges().add(jClassToTClass__jClass____source);
		jContainer__compilationUnit____compilationUnit.setSrc(jContainer);
		jContainer__compilationUnit____compilationUnit.setTrg(compilationUnit);
		ruleresult.getCreatedEdges().add(
				jContainer__compilationUnit____compilationUnit);
		jPackage__compilationUnit____compilationUnit.setSrc(jPackage);
		jPackage__compilationUnit____compilationUnit.setTrg(compilationUnit);
		ruleresult.getCreatedEdges().add(
				jPackage__compilationUnit____compilationUnit);
		tPackage__tClass____containedClasses.setSrc(tPackage);
		tPackage__tClass____containedClasses.setTrg(tClass);
		ruleresult.getTranslatedEdges().add(
				tPackage__tClass____containedClasses);
		tClass__tPackage____package.setSrc(tClass);
		tClass__tPackage____package.setTrg(tPackage);
		ruleresult.getTranslatedEdges().add(tClass__tPackage____package);
		typeGraph__tClass____classes.setSrc(typeGraph);
		typeGraph__tClass____classes.setTrg(tClass);
		ruleresult.getTranslatedEdges().add(typeGraph__tClass____classes);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		compilationUnit__jClass____classifiers
				.setName(compilationUnit__jClass____classifiers_name_prime);
		compilationUnitToTClass__tClass____target
				.setName(compilationUnitToTClass__tClass____target_name_prime);
		compilationUnitToTClass__compilationUnit____source
				.setName(compilationUnitToTClass__compilationUnit____source_name_prime);
		jClassToTClass__tClass____target
				.setName(jClassToTClass__tClass____target_name_prime);
		jClassToTClass__jClass____source
				.setName(jClassToTClass__jClass____source_name_prime);
		jContainer__compilationUnit____compilationUnit
				.setName(jContainer__compilationUnit____compilationUnit_name_prime);
		jPackage__compilationUnit____compilationUnit
				.setName(jPackage__compilationUnit____compilationUnit_name_prime);
		tPackage__tClass____containedClasses
				.setName(tPackage__tClass____containedClasses_name_prime);
		tClass__tPackage____package
				.setName(tClass__tPackage____package_name_prime);
		typeGraph__tClass____classes
				.setName(typeGraph__tClass____classes_name_prime);
		return new Object[] { ruleresult, compilationUnit,
				compilationUnitToTClass, jClass, jClassToTClass, jContainer,
				jPackage, tClass, tPackage, typeGraph,
				compilationUnit__jClass____classifiers,
				compilationUnitToTClass__tClass____target,
				compilationUnitToTClass__compilationUnit____source,
				jClassToTClass__tClass____target,
				jClassToTClass__jClass____source,
				jContainer__compilationUnit____compilationUnit,
				jPackage__compilationUnit____compilationUnit,
				tPackage__tClass____containedClasses,
				tClass__tPackage____package, typeGraph__tClass____classes };
	}

	public static final void pattern_ClassDefault_11_5_expressionBBBBBBBBBBBBB(
			ClassDefault _this, PerformRuleResult ruleresult,
			EObject compilationUnit, EObject compilationUnitToTClass,
			EObject jClass, EObject jClassToTClass, EObject jContainer,
			EObject jPackage, EObject jPackageToTPackage, EObject tClass,
			EObject tPackage, EObject typeGraph, EObject typeGraphToJContainer) {
		_this.registerObjects_BWD(ruleresult, compilationUnit,
				compilationUnitToTClass, jClass, jClassToTClass, jContainer,
				jPackage, jPackageToTPackage, tClass, tPackage, typeGraph,
				typeGraphToJContainer);

	}

	public static final PerformRuleResult pattern_ClassDefault_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassDefault_12_1_bindingFB(
			ClassDefault _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_12_1_blackFBB(
			EClass eClass, ClassDefault _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_12_1_bindingAndBlackFFB(
			ClassDefault _this) {
		Object[] result_pattern_ClassDefault_12_1_binding = pattern_ClassDefault_12_1_bindingFB(_this);
		if (result_pattern_ClassDefault_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassDefault_12_1_binding[0];

			Object[] result_pattern_ClassDefault_12_1_black = pattern_ClassDefault_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ClassDefault_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassDefault_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ClassDefault";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassDefault_12_2_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("tClass");
		EObject _localVariable_1 = match.getObject("tPackage");
		EObject _localVariable_2 = match.getObject("typeGraph");
		EObject tmpTClass = _localVariable_0;
		EObject tmpTPackage = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpTPackage instanceof TPackage) {
				TPackage tPackage = (TPackage) tmpTPackage;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					return new Object[] { tClass, tPackage, typeGraph, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassDefault_12_2_blackFFFBBBFB(
			TClass tClass, TPackage tPackage, TypeGraph typeGraph, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ExtendedJamoppPackageElementToTPackage jPackageToTPackage : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tPackage,
						ExtendedJamoppPackageElementToTPackage.class, "target")) {
			ExtendedJamoppPackageElement jPackage = jPackageToTPackage
					.getSource();
			if (jPackage != null) {
				for (ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(typeGraph,
								ExtendedJamoppJavaContainerToTypeGraph.class,
								"target")) {
					ExtendedJamoppJavaContainer jContainer = typeGraphToJContainer
							.getSource();
					if (jContainer != null) {
						_result.add(new Object[] { jContainer, jPackage,
								jPackageToTPackage, tClass, tPackage,
								typeGraph, typeGraphToJContainer, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassDefault_12_3_blackBBBBBBB(
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage,
			ExtendedJamoppPackageElementToTPackage jPackageToTPackage,
			TClass tClass, TPackage tPackage, TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (jContainer.getExtendedJamoppPackageElement().contains(jPackage)) {
			if (tPackage.equals(jPackageToTPackage.getTarget())) {
				if (jPackage.equals(jPackageToTPackage.getSource())) {
					if (tPackage.getContainedClasses().contains(tClass)) {
						if (typeGraph.getClasses().contains(tClass)) {
							if (typeGraph.equals(typeGraphToJContainer
									.getTarget())) {
								if (jContainer.equals(typeGraphToJContainer
										.getSource())) {
									_result.add(new Object[] { jContainer,
											jPackage, jPackageToTPackage,
											tClass, tPackage, typeGraph,
											typeGraphToJContainer });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ClassDefault_12_3_greenBBBBBBBFFFFFFFFF(
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage,
			ExtendedJamoppPackageElementToTPackage jPackageToTPackage,
			TClass tClass, TPackage tPackage, TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge jContainer__jPackage____extendedJamoppPackageElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jPackageToTPackage__tPackage____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jPackageToTPackage__jPackage____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tPackage__tClass____containedClasses = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tClass__tPackage____package = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge typeGraph__tClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge typeGraphToJContainer__typeGraph____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge typeGraphToJContainer__jContainer____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jContainer__jPackage____extendedJamoppPackageElement_name_prime = "extendedJamoppPackageElement";
		String jPackageToTPackage__tPackage____target_name_prime = "target";
		String jPackageToTPackage__jPackage____source_name_prime = "source";
		String tPackage__tClass____containedClasses_name_prime = "containedClasses";
		String tClass__tPackage____package_name_prime = "package";
		String typeGraph__tClass____classes_name_prime = "classes";
		String typeGraphToJContainer__typeGraph____target_name_prime = "target";
		String typeGraphToJContainer__jContainer____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(jContainer);
		isApplicableMatch.getAllContextElements().add(jPackage);
		isApplicableMatch.getAllContextElements().add(jPackageToTPackage);
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(typeGraphToJContainer);
		jContainer__jPackage____extendedJamoppPackageElement.setSrc(jContainer);
		jContainer__jPackage____extendedJamoppPackageElement.setTrg(jPackage);
		isApplicableMatch.getAllContextElements().add(
				jContainer__jPackage____extendedJamoppPackageElement);
		jPackageToTPackage__tPackage____target.setSrc(jPackageToTPackage);
		jPackageToTPackage__tPackage____target.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(
				jPackageToTPackage__tPackage____target);
		jPackageToTPackage__jPackage____source.setSrc(jPackageToTPackage);
		jPackageToTPackage__jPackage____source.setTrg(jPackage);
		isApplicableMatch.getAllContextElements().add(
				jPackageToTPackage__jPackage____source);
		tPackage__tClass____containedClasses.setSrc(tPackage);
		tPackage__tClass____containedClasses.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(
				tPackage__tClass____containedClasses);
		tClass__tPackage____package.setSrc(tClass);
		tClass__tPackage____package.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(
				tClass__tPackage____package);
		typeGraph__tClass____classes.setSrc(typeGraph);
		typeGraph__tClass____classes.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(
				typeGraph__tClass____classes);
		typeGraphToJContainer__typeGraph____target
				.setSrc(typeGraphToJContainer);
		typeGraphToJContainer__typeGraph____target.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(
				typeGraphToJContainer__typeGraph____target);
		typeGraphToJContainer__jContainer____source
				.setSrc(typeGraphToJContainer);
		typeGraphToJContainer__jContainer____source.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(
				typeGraphToJContainer__jContainer____source);
		jContainer__jPackage____extendedJamoppPackageElement
				.setName(jContainer__jPackage____extendedJamoppPackageElement_name_prime);
		jPackageToTPackage__tPackage____target
				.setName(jPackageToTPackage__tPackage____target_name_prime);
		jPackageToTPackage__jPackage____source
				.setName(jPackageToTPackage__jPackage____source_name_prime);
		tPackage__tClass____containedClasses
				.setName(tPackage__tClass____containedClasses_name_prime);
		tClass__tPackage____package
				.setName(tClass__tPackage____package_name_prime);
		typeGraph__tClass____classes
				.setName(typeGraph__tClass____classes_name_prime);
		typeGraphToJContainer__typeGraph____target
				.setName(typeGraphToJContainer__typeGraph____target_name_prime);
		typeGraphToJContainer__jContainer____source
				.setName(typeGraphToJContainer__jContainer____source_name_prime);
		return new Object[] { jContainer, jPackage, jPackageToTPackage, tClass,
				tPackage, typeGraph, typeGraphToJContainer, isApplicableMatch,
				jContainer__jPackage____extendedJamoppPackageElement,
				jPackageToTPackage__tPackage____target,
				jPackageToTPackage__jPackage____source,
				tPackage__tClass____containedClasses,
				tClass__tPackage____package, typeGraph__tClass____classes,
				typeGraphToJContainer__typeGraph____target,
				typeGraphToJContainer__jContainer____source };
	}

	public static final Object[] pattern_ClassDefault_12_4_bindingFBBBBBBBBB(
			ClassDefault _this, IsApplicableMatch isApplicableMatch,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage,
			ExtendedJamoppPackageElementToTPackage jPackageToTPackage,
			TClass tClass, TPackage tPackage, TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, jContainer, jPackage, jPackageToTPackage,
				tClass, tPackage, typeGraph, typeGraphToJContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jContainer,
					jPackage, jPackageToTPackage, tClass, tPackage, typeGraph,
					typeGraphToJContainer };
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassDefault_12_4_bindingAndBlackFBBBBBBBBB(
			ClassDefault _this, IsApplicableMatch isApplicableMatch,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage,
			ExtendedJamoppPackageElementToTPackage jPackageToTPackage,
			TClass tClass, TPackage tPackage, TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer) {
		Object[] result_pattern_ClassDefault_12_4_binding = pattern_ClassDefault_12_4_bindingFBBBBBBBBB(
				_this, isApplicableMatch, jContainer, jPackage,
				jPackageToTPackage, tClass, tPackage, typeGraph,
				typeGraphToJContainer);
		if (result_pattern_ClassDefault_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ClassDefault_12_4_binding[0];

			Object[] result_pattern_ClassDefault_12_4_black = pattern_ClassDefault_12_4_blackB(csp);
			if (result_pattern_ClassDefault_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						jContainer, jPackage, jPackageToTPackage, tClass,
						tPackage, typeGraph, typeGraphToJContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassDefault_12_5_expressionFBB(
			ClassDefault _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassDefault_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassDefault_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassDefault";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassDefault_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassDefault_20_1_bindingFB(
			ClassDefault _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_20_1_blackFBB(
			EClass __eClass, ClassDefault _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_20_1_bindingAndBlackFFB(
			ClassDefault _this) {
		Object[] result_pattern_ClassDefault_20_1_binding = pattern_ClassDefault_20_1_bindingFB(_this);
		if (result_pattern_ClassDefault_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassDefault_20_1_binding[0];

			Object[] result_pattern_ClassDefault_20_1_black = pattern_ClassDefault_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ClassDefault_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassDefault_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ClassDefault_20_2_black_nac_0BB(
			CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass) {
		for (ConcreteClassifier __DEC_compilationUnit_classifiers_652623 : compilationUnit
				.getClassifiers()) {
			if (!jClass.equals(__DEC_compilationUnit_classifiers_652623)) {
				return new Object[] { compilationUnit, jClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_20_2_black_nac_1BB(
			CompilationUnit compilationUnit,
			ExtendedJamoppJavaContainer jContainer) {
		for (ExtendedJamoppJavaContainer __DEC_compilationUnit_compilationUnit_239748 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(compilationUnit,
						ExtendedJamoppJavaContainer.class, "compilationUnit")) {
			if (!jContainer
					.equals(__DEC_compilationUnit_compilationUnit_239748)) {
				return new Object[] { compilationUnit, jContainer };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_20_2_black_nac_2BB(
			CompilationUnit compilationUnit,
			ExtendedJamoppPackageElement jPackage) {
		for (ExtendedJamoppPackageElement __DEC_compilationUnit_compilationUnit_782153 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(compilationUnit,
						ExtendedJamoppPackageElement.class, "compilationUnit")) {
			if (!jPackage.equals(__DEC_compilationUnit_compilationUnit_782153)) {
				return new Object[] { compilationUnit, jPackage };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassDefault_20_2_blackFFFFB(
			EMoflonEdge _edge_classifiers) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCompilationUnit = _edge_classifiers.getSrc();
		if (tmpCompilationUnit instanceof CompilationUnit) {
			CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
			EObject tmpJClass = _edge_classifiers.getTrg();
			if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
				org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
				if (compilationUnit.getClassifiers().contains(jClass)) {
					if (pattern_ClassDefault_20_2_black_nac_0BB(
							compilationUnit, jClass) == null) {
						for (ExtendedJamoppJavaContainer jContainer : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(compilationUnit,
										ExtendedJamoppJavaContainer.class,
										"compilationUnit")) {
							if (pattern_ClassDefault_20_2_black_nac_1BB(
									compilationUnit, jContainer) == null) {
								for (ExtendedJamoppPackageElement jPackage : jContainer
										.getExtendedJamoppPackageElement()) {
									if (jPackage.getCompilationUnit().contains(
											compilationUnit)) {
										if (pattern_ClassDefault_20_2_black_nac_2BB(
												compilationUnit, jPackage) == null) {
											_result.add(new Object[] {
													compilationUnit, jClass,
													jContainer, jPackage,
													_edge_classifiers });
										}
									}
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ClassDefault_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassDefault_20_3_expressionFBBBBBB(
			ClassDefault _this, Match match, CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				compilationUnit, jClass, jContainer, jPackage);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassDefault_20_4_expressionFBB(
			ClassDefault _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassDefault_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ClassDefault_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ClassDefault_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassDefault_21_1_bindingFB(
			ClassDefault _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_21_1_blackFBB(
			EClass __eClass, ClassDefault _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_21_1_bindingAndBlackFFB(
			ClassDefault _this) {
		Object[] result_pattern_ClassDefault_21_1_binding = pattern_ClassDefault_21_1_bindingFB(_this);
		if (result_pattern_ClassDefault_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassDefault_21_1_binding[0];

			Object[] result_pattern_ClassDefault_21_1_black = pattern_ClassDefault_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ClassDefault_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassDefault_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ClassDefault_21_2_black_nac_0BB(
			CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass) {
		for (ConcreteClassifier __DEC_compilationUnit_classifiers_826456 : compilationUnit
				.getClassifiers()) {
			if (!jClass.equals(__DEC_compilationUnit_classifiers_826456)) {
				return new Object[] { compilationUnit, jClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_21_2_black_nac_1BB(
			CompilationUnit compilationUnit,
			ExtendedJamoppJavaContainer jContainer) {
		for (ExtendedJamoppJavaContainer __DEC_compilationUnit_compilationUnit_110974 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(compilationUnit,
						ExtendedJamoppJavaContainer.class, "compilationUnit")) {
			if (!jContainer
					.equals(__DEC_compilationUnit_compilationUnit_110974)) {
				return new Object[] { compilationUnit, jContainer };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_21_2_black_nac_2BB(
			CompilationUnit compilationUnit,
			ExtendedJamoppPackageElement jPackage) {
		for (ExtendedJamoppPackageElement __DEC_compilationUnit_compilationUnit_968703 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(compilationUnit,
						ExtendedJamoppPackageElement.class, "compilationUnit")) {
			if (!jPackage.equals(__DEC_compilationUnit_compilationUnit_968703)) {
				return new Object[] { compilationUnit, jPackage };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassDefault_21_2_blackFFFFB(
			EMoflonEdge _edge_compilationUnit) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJContainer = _edge_compilationUnit.getSrc();
		if (tmpJContainer instanceof ExtendedJamoppJavaContainer) {
			ExtendedJamoppJavaContainer jContainer = (ExtendedJamoppJavaContainer) tmpJContainer;
			EObject tmpCompilationUnit = _edge_compilationUnit.getTrg();
			if (tmpCompilationUnit instanceof CompilationUnit) {
				CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
				if (jContainer.getCompilationUnit().contains(compilationUnit)) {
					if (pattern_ClassDefault_21_2_black_nac_1BB(
							compilationUnit, jContainer) == null) {
						for (ExtendedJamoppPackageElement jPackage : jContainer
								.getExtendedJamoppPackageElement()) {
							if (jPackage.getCompilationUnit().contains(
									compilationUnit)) {
								if (pattern_ClassDefault_21_2_black_nac_2BB(
										compilationUnit, jPackage) == null) {
									for (ConcreteClassifier tmpJClass : compilationUnit
											.getClassifiers()) {
										if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
											org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
											if (pattern_ClassDefault_21_2_black_nac_0BB(
													compilationUnit, jClass) == null) {
												_result.add(new Object[] {
														compilationUnit,
														jClass, jContainer,
														jPackage,
														_edge_compilationUnit });
											}
										}
									}
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ClassDefault_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassDefault_21_3_expressionFBBBBBB(
			ClassDefault _this, Match match, CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				compilationUnit, jClass, jContainer, jPackage);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassDefault_21_4_expressionFBB(
			ClassDefault _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassDefault_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ClassDefault_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ClassDefault_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassDefault_22_1_bindingFB(
			ClassDefault _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_22_1_blackFBB(
			EClass __eClass, ClassDefault _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_22_1_bindingAndBlackFFB(
			ClassDefault _this) {
		Object[] result_pattern_ClassDefault_22_1_binding = pattern_ClassDefault_22_1_bindingFB(_this);
		if (result_pattern_ClassDefault_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassDefault_22_1_binding[0];

			Object[] result_pattern_ClassDefault_22_1_black = pattern_ClassDefault_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ClassDefault_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassDefault_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ClassDefault_22_2_black_nac_0BB(
			CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass) {
		for (ConcreteClassifier __DEC_compilationUnit_classifiers_393733 : compilationUnit
				.getClassifiers()) {
			if (!jClass.equals(__DEC_compilationUnit_classifiers_393733)) {
				return new Object[] { compilationUnit, jClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_22_2_black_nac_1BB(
			CompilationUnit compilationUnit,
			ExtendedJamoppJavaContainer jContainer) {
		for (ExtendedJamoppJavaContainer __DEC_compilationUnit_compilationUnit_675367 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(compilationUnit,
						ExtendedJamoppJavaContainer.class, "compilationUnit")) {
			if (!jContainer
					.equals(__DEC_compilationUnit_compilationUnit_675367)) {
				return new Object[] { compilationUnit, jContainer };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_22_2_black_nac_2BB(
			CompilationUnit compilationUnit,
			ExtendedJamoppPackageElement jPackage) {
		for (ExtendedJamoppPackageElement __DEC_compilationUnit_compilationUnit_589641 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(compilationUnit,
						ExtendedJamoppPackageElement.class, "compilationUnit")) {
			if (!jPackage.equals(__DEC_compilationUnit_compilationUnit_589641)) {
				return new Object[] { compilationUnit, jPackage };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassDefault_22_2_blackFFFFB(
			EMoflonEdge _edge_compilationUnit) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJPackage = _edge_compilationUnit.getSrc();
		if (tmpJPackage instanceof ExtendedJamoppPackageElement) {
			ExtendedJamoppPackageElement jPackage = (ExtendedJamoppPackageElement) tmpJPackage;
			EObject tmpCompilationUnit = _edge_compilationUnit.getTrg();
			if (tmpCompilationUnit instanceof CompilationUnit) {
				CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
				if (jPackage.getCompilationUnit().contains(compilationUnit)) {
					if (pattern_ClassDefault_22_2_black_nac_2BB(
							compilationUnit, jPackage) == null) {
						for (ConcreteClassifier tmpJClass : compilationUnit
								.getClassifiers()) {
							if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
								org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
								if (pattern_ClassDefault_22_2_black_nac_0BB(
										compilationUnit, jClass) == null) {
									for (ExtendedJamoppJavaContainer jContainer : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(
													jPackage,
													ExtendedJamoppJavaContainer.class,
													"extendedJamoppPackageElement")) {
										if (jContainer.getCompilationUnit()
												.contains(compilationUnit)) {
											if (pattern_ClassDefault_22_2_black_nac_1BB(
													compilationUnit, jContainer) == null) {
												_result.add(new Object[] {
														compilationUnit,
														jClass, jContainer,
														jPackage,
														_edge_compilationUnit });
											}
										}
									}
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ClassDefault_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassDefault_22_3_expressionFBBBBBB(
			ClassDefault _this, Match match, CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				compilationUnit, jClass, jContainer, jPackage);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassDefault_22_4_expressionFBB(
			ClassDefault _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassDefault_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ClassDefault_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ClassDefault_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassDefault_23_1_bindingFB(
			ClassDefault _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_23_1_blackFBB(
			EClass __eClass, ClassDefault _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_23_1_bindingAndBlackFFB(
			ClassDefault _this) {
		Object[] result_pattern_ClassDefault_23_1_binding = pattern_ClassDefault_23_1_bindingFB(_this);
		if (result_pattern_ClassDefault_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassDefault_23_1_binding[0];

			Object[] result_pattern_ClassDefault_23_1_black = pattern_ClassDefault_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ClassDefault_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassDefault_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ClassDefault_23_2_black_nac_0BB(
			TClass tClass, TPackage tPackage) {
		TPackage __DEC_tClass_containedClasses_161949 = tClass.getPackage();
		if (__DEC_tClass_containedClasses_161949 != null) {
			if (!tPackage.equals(__DEC_tClass_containedClasses_161949)) {
				return new Object[] { tClass, tPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassDefault_23_2_black_nac_1BB(
			TClass tClass, TypeGraph typeGraph) {
		for (TypeGraph __DEC_tClass_classes_478803 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeGraph.class, "classes")) {
			if (!typeGraph.equals(__DEC_tClass_classes_478803)) {
				return new Object[] { tClass, typeGraph };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassDefault_23_2_blackFFFB(
			EMoflonEdge _edge_containedClasses) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTPackage = _edge_containedClasses.getSrc();
		if (tmpTPackage instanceof TPackage) {
			TPackage tPackage = (TPackage) tmpTPackage;
			EObject tmpTClass = _edge_containedClasses.getTrg();
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				if (tPackage.getContainedClasses().contains(tClass)) {
					if (pattern_ClassDefault_23_2_black_nac_0BB(tClass,
							tPackage) == null) {
						for (TypeGraph typeGraph : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tClass,
										TypeGraph.class, "classes")) {
							if (pattern_ClassDefault_23_2_black_nac_1BB(tClass,
									typeGraph) == null) {
								_result.add(new Object[] { tClass, tPackage,
										typeGraph, _edge_containedClasses });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ClassDefault_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassDefault_23_3_expressionFBBBBB(
			ClassDefault _this, Match match, TClass tClass, TPackage tPackage,
			TypeGraph typeGraph) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tClass,
				tPackage, typeGraph);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassDefault_23_4_expressionFBB(
			ClassDefault _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassDefault_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ClassDefault_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ClassDefault_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassDefault_24_1_bindingFB(
			ClassDefault _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_24_1_blackFBB(
			EClass __eClass, ClassDefault _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_24_1_bindingAndBlackFFB(
			ClassDefault _this) {
		Object[] result_pattern_ClassDefault_24_1_binding = pattern_ClassDefault_24_1_bindingFB(_this);
		if (result_pattern_ClassDefault_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassDefault_24_1_binding[0];

			Object[] result_pattern_ClassDefault_24_1_black = pattern_ClassDefault_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ClassDefault_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassDefault_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ClassDefault_24_2_black_nac_0BB(
			TClass tClass, TPackage tPackage) {
		TPackage __DEC_tClass_containedClasses_788059 = tClass.getPackage();
		if (__DEC_tClass_containedClasses_788059 != null) {
			if (!tPackage.equals(__DEC_tClass_containedClasses_788059)) {
				return new Object[] { tClass, tPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassDefault_24_2_black_nac_1BB(
			TClass tClass, TypeGraph typeGraph) {
		for (TypeGraph __DEC_tClass_classes_63514 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeGraph.class, "classes")) {
			if (!typeGraph.equals(__DEC_tClass_classes_63514)) {
				return new Object[] { tClass, typeGraph };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassDefault_24_2_blackFFFB(
			EMoflonEdge _edge_package) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTClass = _edge_package.getSrc();
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			EObject tmpTPackage = _edge_package.getTrg();
			if (tmpTPackage instanceof TPackage) {
				TPackage tPackage = (TPackage) tmpTPackage;
				if (tPackage.getContainedClasses().contains(tClass)) {
					if (pattern_ClassDefault_24_2_black_nac_0BB(tClass,
							tPackage) == null) {
						for (TypeGraph typeGraph : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tClass,
										TypeGraph.class, "classes")) {
							if (pattern_ClassDefault_24_2_black_nac_1BB(tClass,
									typeGraph) == null) {
								_result.add(new Object[] { tClass, tPackage,
										typeGraph, _edge_package });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ClassDefault_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassDefault_24_3_expressionFBBBBB(
			ClassDefault _this, Match match, TClass tClass, TPackage tPackage,
			TypeGraph typeGraph) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tClass,
				tPackage, typeGraph);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassDefault_24_4_expressionFBB(
			ClassDefault _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassDefault_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ClassDefault_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ClassDefault_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassDefault_25_1_bindingFB(
			ClassDefault _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_25_1_blackFBB(
			EClass __eClass, ClassDefault _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_25_1_bindingAndBlackFFB(
			ClassDefault _this) {
		Object[] result_pattern_ClassDefault_25_1_binding = pattern_ClassDefault_25_1_bindingFB(_this);
		if (result_pattern_ClassDefault_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassDefault_25_1_binding[0];

			Object[] result_pattern_ClassDefault_25_1_black = pattern_ClassDefault_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ClassDefault_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassDefault_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDefault_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ClassDefault_25_2_black_nac_0BB(
			TClass tClass, TPackage tPackage) {
		TPackage __DEC_tClass_containedClasses_813381 = tClass.getPackage();
		if (__DEC_tClass_containedClasses_813381 != null) {
			if (!tPackage.equals(__DEC_tClass_containedClasses_813381)) {
				return new Object[] { tClass, tPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassDefault_25_2_black_nac_1BB(
			TClass tClass, TypeGraph typeGraph) {
		for (TypeGraph __DEC_tClass_classes_985250 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeGraph.class, "classes")) {
			if (!typeGraph.equals(__DEC_tClass_classes_985250)) {
				return new Object[] { tClass, typeGraph };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassDefault_25_2_blackFFFB(
			EMoflonEdge _edge_classes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTypeGraph = _edge_classes.getSrc();
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			EObject tmpTClass = _edge_classes.getTrg();
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				if (typeGraph.getClasses().contains(tClass)) {
					TPackage tPackage = tClass.getPackage();
					if (tPackage != null) {
						if (pattern_ClassDefault_25_2_black_nac_1BB(tClass,
								typeGraph) == null) {
							if (pattern_ClassDefault_25_2_black_nac_0BB(tClass,
									tPackage) == null) {
								_result.add(new Object[] { tClass, tPackage,
										typeGraph, _edge_classes });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ClassDefault_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassDefault_25_3_expressionFBBBBB(
			ClassDefault _this, Match match, TClass tClass, TPackage tPackage,
			TypeGraph typeGraph) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tClass,
				tPackage, typeGraph);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassDefault_25_4_expressionFBB(
			ClassDefault _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassDefault_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ClassDefault_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ClassDefault_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ClassDefaultImpl
