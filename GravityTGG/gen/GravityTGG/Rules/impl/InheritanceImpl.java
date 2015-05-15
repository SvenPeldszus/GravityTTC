/**
 */
package GravityTGG.Rules.impl;

import GravityTGG.ClassToTClass;

import GravityTGG.Rules.Inheritance;
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
import TypeGraphBasic.TypeGraph;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.emftext.language.java.classifiers.Classifier;

import org.emftext.language.java.types.ClassifierReference;
import org.emftext.language.java.types.NamespaceClassifierReference;
import org.emftext.language.java.types.TypesFactory;
// <-- [user defined imports]
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;

// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inheritance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InheritanceImpl extends AbstractRuleImpl implements Inheritance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InheritanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getInheritance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			ClassifierReference classifierReference,
			org.emftext.language.java.classifiers.Class jClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			NamespaceClassifierReference nameSpace) {
		// initial bindings
		Object[] result1_black = InheritanceImpl
				.pattern_Inheritance_0_1_blackBBBBBB(this, match,
						classifierReference, jClass, jParentClass, nameSpace);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = InheritanceImpl
				.pattern_Inheritance_0_2_bindingAndBlackFBBBBBB(this, match,
						classifierReference, jClass, jParentClass, nameSpace);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (InheritanceImpl.pattern_Inheritance_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = InheritanceImpl
					.pattern_Inheritance_0_4_blackBBBBB(match,
							classifierReference, jClass, jParentClass,
							nameSpace);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			InheritanceImpl.pattern_Inheritance_0_4_greenBBBBBFFF(match,
					classifierReference, jClass, jParentClass, nameSpace);
			// EMoflonEdge classifierReference__jParentClass____target = (EMoflonEdge) result4_green[5];
			// EMoflonEdge jClass__nameSpace____extends = (EMoflonEdge) result4_green[6];
			// EMoflonEdge nameSpace__classifierReference____classifierReferences = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = InheritanceImpl
					.pattern_Inheritance_0_5_blackBBBBB(match,
							classifierReference, jClass, jParentClass,
							nameSpace);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			InheritanceImpl.pattern_Inheritance_0_5_greenBBB(match, jClass,
					jParentClass);

			// register objects to match
			InheritanceImpl
					.pattern_Inheritance_0_6_expressionBBBBBB(this, match,
							classifierReference, jClass, jParentClass,
							nameSpace);
			return InheritanceImpl.pattern_Inheritance_0_7_expressionF();
		} else {
			return InheritanceImpl.pattern_Inheritance_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = InheritanceImpl
				.pattern_Inheritance_1_1_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ClassifierReference classifierReference = (ClassifierReference) result1_bindingAndBlack[0];
		org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result1_bindingAndBlack[1];
		ClassToTClass jClassToTClass = (ClassToTClass) result1_bindingAndBlack[2];
		org.emftext.language.java.classifiers.Class jParentClass = (org.emftext.language.java.classifiers.Class) result1_bindingAndBlack[3];
		ClassToTClass jParentClassToTParentClass = (ClassToTClass) result1_bindingAndBlack[4];
		NamespaceClassifierReference nameSpace = (NamespaceClassifierReference) result1_bindingAndBlack[5];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[6];
		TClass tClass = (TClass) result1_bindingAndBlack[7];
		TClass tParentClass = (TClass) result1_bindingAndBlack[8];
		// CSP csp = (CSP) result1_bindingAndBlack[9];
		InheritanceImpl.pattern_Inheritance_1_1_greenBB(tClass, tParentClass);

		// collect translated elements
		Object[] result2_black = InheritanceImpl
				.pattern_Inheritance_1_2_blackBB(classifierReference, nameSpace);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = InheritanceImpl
				.pattern_Inheritance_1_2_greenFBB(classifierReference,
						nameSpace);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = InheritanceImpl
				.pattern_Inheritance_1_3_blackBBBBBBBBBB(ruleresult,
						classifierReference, jClass, jClassToTClass,
						jParentClass, jParentClassToTParentClass, nameSpace,
						pg, tClass, tParentClass);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		InheritanceImpl.pattern_Inheritance_1_3_greenBBBBBBBFFFFF(ruleresult,
				classifierReference, jClass, jParentClass, nameSpace, tClass,
				tParentClass);
		// EMoflonEdge classifierReference__jParentClass____target = (EMoflonEdge) result3_green[7];
		// EMoflonEdge jClass__nameSpace____extends = (EMoflonEdge) result3_green[8];
		// EMoflonEdge nameSpace__classifierReference____classifierReferences = (EMoflonEdge) result3_green[9];
		// EMoflonEdge tParentClass__tClass____childClasses = (EMoflonEdge) result3_green[10];
		// EMoflonEdge tClass__tParentClass____parentClass = (EMoflonEdge) result3_green[11];

		// perform postprocessing story node is empty
		// register objects
		InheritanceImpl.pattern_Inheritance_1_5_expressionBBBBBBBBBBB(this,
				ruleresult, classifierReference, jClass, jClassToTClass,
				jParentClass, jParentClassToTParentClass, nameSpace, pg,
				tClass, tParentClass);
		return InheritanceImpl.pattern_Inheritance_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = InheritanceImpl
				.pattern_Inheritance_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InheritanceImpl
				.pattern_Inheritance_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = InheritanceImpl
				.pattern_Inheritance_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		ClassifierReference classifierReference = (ClassifierReference) result2_binding[0];
		org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result2_binding[1];
		org.emftext.language.java.classifiers.Class jParentClass = (org.emftext.language.java.classifiers.Class) result2_binding[2];
		NamespaceClassifierReference nameSpace = (NamespaceClassifierReference) result2_binding[3];
		for (Object[] result2_black : InheritanceImpl
				.pattern_Inheritance_2_2_blackBBFBFBFFB(classifierReference,
						jClass, jParentClass, nameSpace, match)) {
			ClassToTClass jClassToTClass = (ClassToTClass) result2_black[2];
			ClassToTClass jParentClassToTParentClass = (ClassToTClass) result2_black[4];
			TClass tClass = (TClass) result2_black[6];
			TClass tParentClass = (TClass) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : InheritanceImpl
					.pattern_Inheritance_2_3_blackBBBBBBFBB(
							classifierReference, jClass, jClassToTClass,
							jParentClass, jParentClassToTParentClass,
							nameSpace, tClass, tParentClass)) {
				TypeGraph pg = (TypeGraph) result3_black[6];
				Object[] result3_green = InheritanceImpl
						.pattern_Inheritance_2_3_greenBBBBBBBBBFFFFFFFFFF(
								classifierReference, jClass, jClassToTClass,
								jParentClass, jParentClassToTParentClass,
								nameSpace, pg, tClass, tParentClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge classifierReference__jParentClass____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge jClass__nameSpace____extends = (EMoflonEdge) result3_green[11];
				// EMoflonEdge jClassToTClass__tClass____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge jClassToTClass__jClass____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge jParentClassToTParentClass__tParentClass____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge jParentClassToTParentClass__jParentClass____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge nameSpace__classifierReference____classifierReferences = (EMoflonEdge) result3_green[16];
				// EMoflonEdge pg__tParentClass____classes = (EMoflonEdge) result3_green[17];
				// EMoflonEdge pg__tClass____classes = (EMoflonEdge) result3_green[18];

				// solve CSP
				Object[] result4_bindingAndBlack = InheritanceImpl
						.pattern_Inheritance_2_4_bindingAndBlackFBBBBBBBBBBB(
								this, isApplicableMatch, classifierReference,
								jClass, jClassToTClass, jParentClass,
								jParentClassToTParentClass, nameSpace, pg,
								tClass, tParentClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (InheritanceImpl.pattern_Inheritance_2_5_expressionFBB(this,
						csp)) {

					// add match to rule result
					Object[] result6_black = InheritanceImpl
							.pattern_Inheritance_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					InheritanceImpl.pattern_Inheritance_2_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return InheritanceImpl.pattern_Inheritance_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			ClassifierReference classifierReference,
			org.emftext.language.java.classifiers.Class jClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			NamespaceClassifierReference nameSpace) {
		match.registerObject("classifierReference", classifierReference);
		match.registerObject("jClass", jClass);
		match.registerObject("jParentClass", jParentClass);
		match.registerObject("nameSpace", nameSpace);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			ClassifierReference classifierReference,
			org.emftext.language.java.classifiers.Class jClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			NamespaceClassifierReference nameSpace) {// Create CSP
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
			ClassifierReference classifierReference,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			ClassToTClass jParentClassToTParentClass,
			NamespaceClassifierReference nameSpace, TypeGraph pg,
			TClass tClass, TClass tParentClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("classifierReference",
				classifierReference);
		isApplicableMatch.registerObject("jClass", jClass);
		isApplicableMatch.registerObject("jClassToTClass", jClassToTClass);
		isApplicableMatch.registerObject("jParentClass", jParentClass);
		isApplicableMatch.registerObject("jParentClassToTParentClass",
				jParentClassToTParentClass);
		isApplicableMatch.registerObject("nameSpace", nameSpace);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("tParentClass", tParentClass);
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
			EObject classifierReference, EObject jClass,
			EObject jClassToTClass, EObject jParentClass,
			EObject jParentClassToTParentClass, EObject nameSpace, EObject pg,
			EObject tClass, EObject tParentClass) {
		ruleresult.registerObject("classifierReference", classifierReference);
		ruleresult.registerObject("jClass", jClass);
		ruleresult.registerObject("jClassToTClass", jClassToTClass);
		ruleresult.registerObject("jParentClass", jParentClass);
		ruleresult.registerObject("jParentClassToTParentClass",
				jParentClassToTParentClass);
		ruleresult.registerObject("nameSpace", nameSpace);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("tParentClass", tParentClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("classifierReference")
						.eClass()
						.equals(org.emftext.language.java.types.TypesPackage.eINSTANCE
								.getClassifierReference())
				&& match.getObject("nameSpace")
						.eClass()
						.equals(org.emftext.language.java.types.TypesPackage.eINSTANCE
								.getNamespaceClassifierReference());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TypeGraph pg, TClass tClass,
			TClass tParentClass) {
		// initial bindings
		Object[] result1_black = InheritanceImpl
				.pattern_Inheritance_10_1_blackBBBBB(this, match, pg, tClass,
						tParentClass);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = InheritanceImpl
				.pattern_Inheritance_10_2_bindingAndBlackFBBBBB(this, match,
						pg, tClass, tParentClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (InheritanceImpl.pattern_Inheritance_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = InheritanceImpl
					.pattern_Inheritance_10_4_blackBBBB(match, pg, tClass,
							tParentClass);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			InheritanceImpl.pattern_Inheritance_10_4_greenBBBFF(match, tClass,
					tParentClass);
			// EMoflonEdge tParentClass__tClass____childClasses = (EMoflonEdge) result4_green[3];
			// EMoflonEdge tClass__tParentClass____parentClass = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = InheritanceImpl
					.pattern_Inheritance_10_5_blackBBBB(match, pg, tClass,
							tParentClass);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			InheritanceImpl.pattern_Inheritance_10_5_greenBBBBFF(match, pg,
					tClass, tParentClass);
			// EMoflonEdge pg__tParentClass____classes = (EMoflonEdge) result5_green[4];
			// EMoflonEdge pg__tClass____classes = (EMoflonEdge) result5_green[5];

			// register objects to match
			InheritanceImpl.pattern_Inheritance_10_6_expressionBBBBB(this,
					match, pg, tClass, tParentClass);
			return InheritanceImpl.pattern_Inheritance_10_7_expressionF();
		} else {
			return InheritanceImpl.pattern_Inheritance_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = InheritanceImpl
				.pattern_Inheritance_11_1_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result1_bindingAndBlack[0];
		ClassToTClass jClassToTClass = (ClassToTClass) result1_bindingAndBlack[1];
		org.emftext.language.java.classifiers.Class jParentClass = (org.emftext.language.java.classifiers.Class) result1_bindingAndBlack[2];
		ClassToTClass jParentClassToTParentClass = (ClassToTClass) result1_bindingAndBlack[3];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[4];
		TClass tClass = (TClass) result1_bindingAndBlack[5];
		TClass tParentClass = (TClass) result1_bindingAndBlack[6];
		// CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = InheritanceImpl
				.pattern_Inheritance_11_1_greenFBBF(jClass, jParentClass);
		ClassifierReference classifierReference = (ClassifierReference) result1_green[0];
		NamespaceClassifierReference nameSpace = (NamespaceClassifierReference) result1_green[3];

		// collect translated elements
		Object[] result2_black = InheritanceImpl
				.pattern_Inheritance_11_2_blackBB(classifierReference,
						nameSpace);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = InheritanceImpl
				.pattern_Inheritance_11_2_greenFBB(classifierReference,
						nameSpace);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = InheritanceImpl
				.pattern_Inheritance_11_3_blackBBBBBBBBBB(ruleresult,
						classifierReference, jClass, jClassToTClass,
						jParentClass, jParentClassToTParentClass, nameSpace,
						pg, tClass, tParentClass);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		InheritanceImpl.pattern_Inheritance_11_3_greenBBBBBBBFFFFF(ruleresult,
				classifierReference, jClass, jParentClass, nameSpace, tClass,
				tParentClass);
		// EMoflonEdge classifierReference__jParentClass____target = (EMoflonEdge) result3_green[7];
		// EMoflonEdge jClass__nameSpace____extends = (EMoflonEdge) result3_green[8];
		// EMoflonEdge nameSpace__classifierReference____classifierReferences = (EMoflonEdge) result3_green[9];
		// EMoflonEdge tParentClass__tClass____childClasses = (EMoflonEdge) result3_green[10];
		// EMoflonEdge tClass__tParentClass____parentClass = (EMoflonEdge) result3_green[11];

		// perform postprocessing story node is empty
		// register objects
		InheritanceImpl.pattern_Inheritance_11_5_expressionBBBBBBBBBBB(this,
				ruleresult, classifierReference, jClass, jClassToTClass,
				jParentClass, jParentClassToTParentClass, nameSpace, pg,
				tClass, tParentClass);
		return InheritanceImpl
				.pattern_Inheritance_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = InheritanceImpl
				.pattern_Inheritance_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InheritanceImpl
				.pattern_Inheritance_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = InheritanceImpl
				.pattern_Inheritance_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		TypeGraph pg = (TypeGraph) result2_binding[0];
		TClass tClass = (TClass) result2_binding[1];
		TClass tParentClass = (TClass) result2_binding[2];
		for (Object[] result2_black : InheritanceImpl
				.pattern_Inheritance_12_2_blackFFFFBBBB(pg, tClass,
						tParentClass, match)) {
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result2_black[0];
			ClassToTClass jClassToTClass = (ClassToTClass) result2_black[1];
			org.emftext.language.java.classifiers.Class jParentClass = (org.emftext.language.java.classifiers.Class) result2_black[2];
			ClassToTClass jParentClassToTParentClass = (ClassToTClass) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : InheritanceImpl
					.pattern_Inheritance_12_3_blackBBBBBBB(jClass,
							jClassToTClass, jParentClass,
							jParentClassToTParentClass, pg, tClass,
							tParentClass)) {
				Object[] result3_green = InheritanceImpl
						.pattern_Inheritance_12_3_greenBBBBBBBFFFFFFFFF(jClass,
								jClassToTClass, jParentClass,
								jParentClassToTParentClass, pg, tClass,
								tParentClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge jClassToTClass__tClass____target = (EMoflonEdge) result3_green[8];
				// EMoflonEdge jClassToTClass__jClass____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge jParentClassToTParentClass__tParentClass____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge jParentClassToTParentClass__jParentClass____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge pg__tParentClass____classes = (EMoflonEdge) result3_green[12];
				// EMoflonEdge pg__tClass____classes = (EMoflonEdge) result3_green[13];
				// EMoflonEdge tParentClass__tClass____childClasses = (EMoflonEdge) result3_green[14];
				// EMoflonEdge tClass__tParentClass____parentClass = (EMoflonEdge) result3_green[15];

				// solve CSP
				Object[] result4_bindingAndBlack = InheritanceImpl
						.pattern_Inheritance_12_4_bindingAndBlackFBBBBBBBBB(
								this, isApplicableMatch, jClass,
								jClassToTClass, jParentClass,
								jParentClassToTParentClass, pg, tClass,
								tParentClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (InheritanceImpl.pattern_Inheritance_12_5_expressionFBB(
						this, csp)) {

					// add match to rule result
					Object[] result6_black = InheritanceImpl
							.pattern_Inheritance_12_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					InheritanceImpl.pattern_Inheritance_12_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InheritanceImpl
				.pattern_Inheritance_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TypeGraph pg,
			TClass tClass, TClass tParentClass) {
		match.registerObject("pg", pg);
		match.registerObject("tClass", tClass);
		match.registerObject("tParentClass", tParentClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph pg,
			TClass tClass, TClass tParentClass) {// Create CSP
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
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			ClassToTClass jParentClassToTParentClass, TypeGraph pg,
			TClass tClass, TClass tParentClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jClass", jClass);
		isApplicableMatch.registerObject("jClassToTClass", jClassToTClass);
		isApplicableMatch.registerObject("jParentClass", jParentClass);
		isApplicableMatch.registerObject("jParentClassToTParentClass",
				jParentClassToTParentClass);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("tParentClass", tParentClass);
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
			EObject classifierReference, EObject jClass,
			EObject jClassToTClass, EObject jParentClass,
			EObject jParentClassToTParentClass, EObject nameSpace, EObject pg,
			EObject tClass, EObject tParentClass) {
		ruleresult.registerObject("classifierReference", classifierReference);
		ruleresult.registerObject("jClass", jClass);
		ruleresult.registerObject("jClassToTClass", jClassToTClass);
		ruleresult.registerObject("jParentClass", jParentClass);
		ruleresult.registerObject("jParentClassToTParentClass",
				jParentClassToTParentClass);
		ruleresult.registerObject("nameSpace", nameSpace);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("tParentClass", tParentClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_10(
			EMoflonEdge _edge_target) {
		// prepare return value
		Object[] result1_bindingAndBlack = InheritanceImpl
				.pattern_Inheritance_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InheritanceImpl
				.pattern_Inheritance_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : InheritanceImpl
				.pattern_Inheritance_20_2_blackFFFFB(_edge_target)) {
			ClassifierReference classifierReference = (ClassifierReference) result2_black[0];
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result2_black[1];
			org.emftext.language.java.classifiers.Class jParentClass = (org.emftext.language.java.classifiers.Class) result2_black[2];
			NamespaceClassifierReference nameSpace = (NamespaceClassifierReference) result2_black[3];
			Object[] result2_green = InheritanceImpl
					.pattern_Inheritance_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (InheritanceImpl.pattern_Inheritance_20_3_expressionFBBBBBB(
					this, match, classifierReference, jClass, jParentClass,
					nameSpace)) {
				// Ensure that the correct types of elements are matched
				if (InheritanceImpl.pattern_Inheritance_20_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = InheritanceImpl
							.pattern_Inheritance_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					InheritanceImpl.pattern_Inheritance_20_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return InheritanceImpl.pattern_Inheritance_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_11(
			EMoflonEdge _edge_extends) {
		// prepare return value
		Object[] result1_bindingAndBlack = InheritanceImpl
				.pattern_Inheritance_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InheritanceImpl
				.pattern_Inheritance_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : InheritanceImpl
				.pattern_Inheritance_21_2_blackFFFFB(_edge_extends)) {
			ClassifierReference classifierReference = (ClassifierReference) result2_black[0];
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result2_black[1];
			org.emftext.language.java.classifiers.Class jParentClass = (org.emftext.language.java.classifiers.Class) result2_black[2];
			NamespaceClassifierReference nameSpace = (NamespaceClassifierReference) result2_black[3];
			Object[] result2_green = InheritanceImpl
					.pattern_Inheritance_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (InheritanceImpl.pattern_Inheritance_21_3_expressionFBBBBBB(
					this, match, classifierReference, jClass, jParentClass,
					nameSpace)) {
				// Ensure that the correct types of elements are matched
				if (InheritanceImpl.pattern_Inheritance_21_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = InheritanceImpl
							.pattern_Inheritance_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					InheritanceImpl.pattern_Inheritance_21_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return InheritanceImpl.pattern_Inheritance_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_12(
			EMoflonEdge _edge_classifierReferences) {
		// prepare return value
		Object[] result1_bindingAndBlack = InheritanceImpl
				.pattern_Inheritance_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InheritanceImpl
				.pattern_Inheritance_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : InheritanceImpl
				.pattern_Inheritance_22_2_blackFFFFB(_edge_classifierReferences)) {
			ClassifierReference classifierReference = (ClassifierReference) result2_black[0];
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result2_black[1];
			org.emftext.language.java.classifiers.Class jParentClass = (org.emftext.language.java.classifiers.Class) result2_black[2];
			NamespaceClassifierReference nameSpace = (NamespaceClassifierReference) result2_black[3];
			Object[] result2_green = InheritanceImpl
					.pattern_Inheritance_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (InheritanceImpl.pattern_Inheritance_22_3_expressionFBBBBBB(
					this, match, classifierReference, jClass, jParentClass,
					nameSpace)) {
				// Ensure that the correct types of elements are matched
				if (InheritanceImpl.pattern_Inheritance_22_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = InheritanceImpl
							.pattern_Inheritance_22_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					InheritanceImpl.pattern_Inheritance_22_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return InheritanceImpl.pattern_Inheritance_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_16(
			EMoflonEdge _edge_childClasses) {
		// prepare return value
		Object[] result1_bindingAndBlack = InheritanceImpl
				.pattern_Inheritance_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InheritanceImpl
				.pattern_Inheritance_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : InheritanceImpl
				.pattern_Inheritance_23_2_blackFFFB(_edge_childClasses)) {
			TypeGraph pg = (TypeGraph) result2_black[0];
			TClass tClass = (TClass) result2_black[1];
			TClass tParentClass = (TClass) result2_black[2];
			Object[] result2_green = InheritanceImpl
					.pattern_Inheritance_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (InheritanceImpl.pattern_Inheritance_23_3_expressionFBBBBB(this,
					match, pg, tClass, tParentClass)) {
				// Ensure that the correct types of elements are matched
				if (InheritanceImpl.pattern_Inheritance_23_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = InheritanceImpl
							.pattern_Inheritance_23_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					InheritanceImpl.pattern_Inheritance_23_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return InheritanceImpl.pattern_Inheritance_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_17(
			EMoflonEdge _edge_parentClass) {
		// prepare return value
		Object[] result1_bindingAndBlack = InheritanceImpl
				.pattern_Inheritance_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InheritanceImpl
				.pattern_Inheritance_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : InheritanceImpl
				.pattern_Inheritance_24_2_blackFFFB(_edge_parentClass)) {
			TypeGraph pg = (TypeGraph) result2_black[0];
			TClass tClass = (TClass) result2_black[1];
			TClass tParentClass = (TClass) result2_black[2];
			Object[] result2_green = InheritanceImpl
					.pattern_Inheritance_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (InheritanceImpl.pattern_Inheritance_24_3_expressionFBBBBB(this,
					match, pg, tClass, tParentClass)) {
				// Ensure that the correct types of elements are matched
				if (InheritanceImpl.pattern_Inheritance_24_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = InheritanceImpl
							.pattern_Inheritance_24_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					InheritanceImpl.pattern_Inheritance_24_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return InheritanceImpl.pattern_Inheritance_24_6_expressionFB(__result);
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
		case RulesPackage.INHERITANCE___IS_APPROPRIATE_FWD__MATCH_CLASSIFIERREFERENCE_CLASS_CLASS_NAMESPACECLASSIFIERREFERENCE:
			return isAppropriate_FWD((Match) arguments.get(0),
					(ClassifierReference) arguments.get(1),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(2),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(3),
					(NamespaceClassifierReference) arguments.get(4));
		case RulesPackage.INHERITANCE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INHERITANCE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.INHERITANCE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSIFIERREFERENCE_CLASS_CLASS_NAMESPACECLASSIFIERREFERENCE:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(ClassifierReference) arguments.get(1),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(2),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(3),
					(NamespaceClassifierReference) arguments.get(4));
			return null;
		case RulesPackage.INHERITANCE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSIFIERREFERENCE_CLASS_CLASS_NAMESPACECLASSIFIERREFERENCE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(ClassifierReference) arguments.get(1),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(2),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(3),
					(NamespaceClassifierReference) arguments.get(4));
		case RulesPackage.INHERITANCE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INHERITANCE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASSIFIERREFERENCE_CLASS_CLASSTOTCLASS_CLASS_CLASSTOTCLASS_NAMESPACECLASSIFIERREFERENCE_TYPEGRAPH_TCLASS_TCLASS:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(ClassifierReference) arguments.get(1),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(2), (ClassToTClass) arguments.get(3),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(4), (ClassToTClass) arguments.get(5),
					(NamespaceClassifierReference) arguments.get(6),
					(TypeGraph) arguments.get(7), (TClass) arguments.get(8),
					(TClass) arguments.get(9));
		case RulesPackage.INHERITANCE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INHERITANCE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9));
			return null;
		case RulesPackage.INHERITANCE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.INHERITANCE___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TCLASS_TCLASS:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TypeGraph) arguments.get(1), (TClass) arguments.get(2),
					(TClass) arguments.get(3));
		case RulesPackage.INHERITANCE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INHERITANCE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.INHERITANCE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TCLASS_TCLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TypeGraph) arguments.get(1), (TClass) arguments.get(2),
					(TClass) arguments.get(3));
			return null;
		case RulesPackage.INHERITANCE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TCLASS_TCLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TypeGraph) arguments.get(1), (TClass) arguments.get(2),
					(TClass) arguments.get(3));
		case RulesPackage.INHERITANCE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INHERITANCE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASS_CLASSTOTCLASS_CLASS_CLASSTOTCLASS_TYPEGRAPH_TCLASS_TCLASS:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(1), (ClassToTClass) arguments.get(2),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(3), (ClassToTClass) arguments.get(4),
					(TypeGraph) arguments.get(5), (TClass) arguments.get(6),
					(TClass) arguments.get(7));
		case RulesPackage.INHERITANCE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INHERITANCE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9));
			return null;
		case RulesPackage.INHERITANCE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.INHERITANCE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_10__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_10((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.INHERITANCE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_11__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_11((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.INHERITANCE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_12__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_12((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.INHERITANCE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_16__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_16((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.INHERITANCE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_17__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_17((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.INHERITANCE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.INHERITANCE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Inheritance_0_1_blackBBBBBB(
			Inheritance _this, Match match,
			ClassifierReference classifierReference,
			org.emftext.language.java.classifiers.Class jClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			NamespaceClassifierReference nameSpace) {
		if (!jClass.equals(jParentClass)) {
			return new Object[] { _this, match, classifierReference, jClass,
					jParentClass, nameSpace };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_0_2_bindingFBBBBBB(
			Inheritance _this, Match match,
			ClassifierReference classifierReference,
			org.emftext.language.java.classifiers.Class jClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			NamespaceClassifierReference nameSpace) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				classifierReference, jClass, jParentClass, nameSpace);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, classifierReference,
					jClass, jParentClass, nameSpace };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Inheritance_0_2_bindingAndBlackFBBBBBB(
			Inheritance _this, Match match,
			ClassifierReference classifierReference,
			org.emftext.language.java.classifiers.Class jClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			NamespaceClassifierReference nameSpace) {
		Object[] result_pattern_Inheritance_0_2_binding = pattern_Inheritance_0_2_bindingFBBBBBB(
				_this, match, classifierReference, jClass, jParentClass,
				nameSpace);
		if (result_pattern_Inheritance_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_Inheritance_0_2_binding[0];

			Object[] result_pattern_Inheritance_0_2_black = pattern_Inheritance_0_2_blackB(csp);
			if (result_pattern_Inheritance_0_2_black != null) {

				return new Object[] { csp, _this, match, classifierReference,
						jClass, jParentClass, nameSpace };
			}
		}
		return null;
	}

	public static final boolean pattern_Inheritance_0_3_expressionFBB(
			Inheritance _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Inheritance_0_4_blackBBBBB(
			Match match, ClassifierReference classifierReference,
			org.emftext.language.java.classifiers.Class jClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			NamespaceClassifierReference nameSpace) {
		if (!jClass.equals(jParentClass)) {
			return new Object[] { match, classifierReference, jClass,
					jParentClass, nameSpace };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_0_4_greenBBBBBFFF(
			Match match, ClassifierReference classifierReference,
			org.emftext.language.java.classifiers.Class jClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			NamespaceClassifierReference nameSpace) {
		EMoflonEdge classifierReference__jParentClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClass__nameSpace____extends = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge nameSpace__classifierReference____classifierReferences = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(classifierReference);
		match.getToBeTranslatedNodes().add(nameSpace);
		String classifierReference__jParentClass____target_name_prime = "target";
		String jClass__nameSpace____extends_name_prime = "extends";
		String nameSpace__classifierReference____classifierReferences_name_prime = "classifierReferences";
		classifierReference__jParentClass____target.setSrc(classifierReference);
		classifierReference__jParentClass____target.setTrg(jParentClass);
		match.getToBeTranslatedEdges().add(
				classifierReference__jParentClass____target);
		jClass__nameSpace____extends.setSrc(jClass);
		jClass__nameSpace____extends.setTrg(nameSpace);
		match.getToBeTranslatedEdges().add(jClass__nameSpace____extends);
		nameSpace__classifierReference____classifierReferences
				.setSrc(nameSpace);
		nameSpace__classifierReference____classifierReferences
				.setTrg(classifierReference);
		match.getToBeTranslatedEdges().add(
				nameSpace__classifierReference____classifierReferences);
		classifierReference__jParentClass____target
				.setName(classifierReference__jParentClass____target_name_prime);
		jClass__nameSpace____extends
				.setName(jClass__nameSpace____extends_name_prime);
		nameSpace__classifierReference____classifierReferences
				.setName(nameSpace__classifierReference____classifierReferences_name_prime);
		return new Object[] { match, classifierReference, jClass, jParentClass,
				nameSpace, classifierReference__jParentClass____target,
				jClass__nameSpace____extends,
				nameSpace__classifierReference____classifierReferences };
	}

	public static final Object[] pattern_Inheritance_0_5_blackBBBBB(
			Match match, ClassifierReference classifierReference,
			org.emftext.language.java.classifiers.Class jClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			NamespaceClassifierReference nameSpace) {
		if (!jClass.equals(jParentClass)) {
			return new Object[] { match, classifierReference, jClass,
					jParentClass, nameSpace };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_0_5_greenBBB(Match match,
			org.emftext.language.java.classifiers.Class jClass,
			org.emftext.language.java.classifiers.Class jParentClass) {
		match.getContextNodes().add(jClass);
		match.getContextNodes().add(jParentClass);
		return new Object[] { match, jClass, jParentClass };
	}

	public static final void pattern_Inheritance_0_6_expressionBBBBBB(
			Inheritance _this, Match match,
			ClassifierReference classifierReference,
			org.emftext.language.java.classifiers.Class jClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			NamespaceClassifierReference nameSpace) {
		_this.registerObjectsToMatch_FWD(match, classifierReference, jClass,
				jParentClass, nameSpace);

	}

	public static final boolean pattern_Inheritance_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Inheritance_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Inheritance_1_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("classifierReference");
		EObject _localVariable_1 = isApplicableMatch.getObject("jClass");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("jClassToTClass");
		EObject _localVariable_3 = isApplicableMatch.getObject("jParentClass");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("jParentClassToTParentClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("nameSpace");
		EObject _localVariable_6 = isApplicableMatch.getObject("pg");
		EObject _localVariable_7 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_8 = isApplicableMatch.getObject("tParentClass");
		EObject tmpClassifierReference = _localVariable_0;
		EObject tmpJClass = _localVariable_1;
		EObject tmpJClassToTClass = _localVariable_2;
		EObject tmpJParentClass = _localVariable_3;
		EObject tmpJParentClassToTParentClass = _localVariable_4;
		EObject tmpNameSpace = _localVariable_5;
		EObject tmpPg = _localVariable_6;
		EObject tmpTClass = _localVariable_7;
		EObject tmpTParentClass = _localVariable_8;
		if (tmpClassifierReference instanceof ClassifierReference) {
			ClassifierReference classifierReference = (ClassifierReference) tmpClassifierReference;
			if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
				org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
				if (tmpJClassToTClass instanceof ClassToTClass) {
					ClassToTClass jClassToTClass = (ClassToTClass) tmpJClassToTClass;
					if (tmpJParentClass instanceof org.emftext.language.java.classifiers.Class) {
						org.emftext.language.java.classifiers.Class jParentClass = (org.emftext.language.java.classifiers.Class) tmpJParentClass;
						if (tmpJParentClassToTParentClass instanceof ClassToTClass) {
							ClassToTClass jParentClassToTParentClass = (ClassToTClass) tmpJParentClassToTParentClass;
							if (tmpNameSpace instanceof NamespaceClassifierReference) {
								NamespaceClassifierReference nameSpace = (NamespaceClassifierReference) tmpNameSpace;
								if (tmpPg instanceof TypeGraph) {
									TypeGraph pg = (TypeGraph) tmpPg;
									if (tmpTClass instanceof TClass) {
										TClass tClass = (TClass) tmpTClass;
										if (tmpTParentClass instanceof TClass) {
											TClass tParentClass = (TClass) tmpTParentClass;
											return new Object[] {
													classifierReference,
													jClass, jClassToTClass,
													jParentClass,
													jParentClassToTParentClass,
													nameSpace, pg, tClass,
													tParentClass,
													isApplicableMatch };
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

	public static final Object[] pattern_Inheritance_1_1_blackBBBBBBBBBFBB(
			ClassifierReference classifierReference,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			ClassToTClass jParentClassToTParentClass,
			NamespaceClassifierReference nameSpace, TypeGraph pg,
			TClass tClass, TClass tParentClass, Inheritance _this,
			IsApplicableMatch isApplicableMatch) {
		if (!jClass.equals(jParentClass)) {
			if (!jClassToTClass.equals(jParentClassToTParentClass)) {
				if (!tClass.equals(tParentClass)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { classifierReference, jClass,
									jClassToTClass, jParentClass,
									jParentClassToTParentClass, nameSpace, pg,
									tClass, tParentClass, csp, _this,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_1_1_bindingAndBlackFFFFFFFFFFBB(
			Inheritance _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Inheritance_1_1_binding = pattern_Inheritance_1_1_bindingFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_Inheritance_1_1_binding != null) {
			ClassifierReference classifierReference = (ClassifierReference) result_pattern_Inheritance_1_1_binding[0];
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result_pattern_Inheritance_1_1_binding[1];
			ClassToTClass jClassToTClass = (ClassToTClass) result_pattern_Inheritance_1_1_binding[2];
			org.emftext.language.java.classifiers.Class jParentClass = (org.emftext.language.java.classifiers.Class) result_pattern_Inheritance_1_1_binding[3];
			ClassToTClass jParentClassToTParentClass = (ClassToTClass) result_pattern_Inheritance_1_1_binding[4];
			NamespaceClassifierReference nameSpace = (NamespaceClassifierReference) result_pattern_Inheritance_1_1_binding[5];
			TypeGraph pg = (TypeGraph) result_pattern_Inheritance_1_1_binding[6];
			TClass tClass = (TClass) result_pattern_Inheritance_1_1_binding[7];
			TClass tParentClass = (TClass) result_pattern_Inheritance_1_1_binding[8];

			Object[] result_pattern_Inheritance_1_1_black = pattern_Inheritance_1_1_blackBBBBBBBBBFBB(
					classifierReference, jClass, jClassToTClass, jParentClass,
					jParentClassToTParentClass, nameSpace, pg, tClass,
					tParentClass, _this, isApplicableMatch);
			if (result_pattern_Inheritance_1_1_black != null) {
				CSP csp = (CSP) result_pattern_Inheritance_1_1_black[9];

				return new Object[] { classifierReference, jClass,
						jClassToTClass, jParentClass,
						jParentClassToTParentClass, nameSpace, pg, tClass,
						tParentClass, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_1_1_greenBB(TClass tClass,
			TClass tParentClass) {
		tParentClass.getChildClasses().add(tClass);
		return new Object[] { tClass, tParentClass };
	}

	public static final Object[] pattern_Inheritance_1_2_blackBB(
			ClassifierReference classifierReference,
			NamespaceClassifierReference nameSpace) {
		return new Object[] { classifierReference, nameSpace };
	}

	public static final Object[] pattern_Inheritance_1_2_greenFBB(
			ClassifierReference classifierReference,
			NamespaceClassifierReference nameSpace) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(classifierReference);
		ruleresult.getTranslatedElements().add(nameSpace);
		return new Object[] { ruleresult, classifierReference, nameSpace };
	}

	public static final Object[] pattern_Inheritance_1_3_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject classifierReference,
			EObject jClass, EObject jClassToTClass, EObject jParentClass,
			EObject jParentClassToTParentClass, EObject nameSpace, EObject pg,
			EObject tClass, EObject tParentClass) {
		if (!classifierReference.equals(jClass)) {
			if (!classifierReference.equals(jClassToTClass)) {
				if (!classifierReference.equals(jParentClass)) {
					if (!classifierReference.equals(jParentClassToTParentClass)) {
						if (!classifierReference.equals(nameSpace)) {
							if (!classifierReference.equals(pg)) {
								if (!classifierReference.equals(tClass)) {
									if (!classifierReference
											.equals(tParentClass)) {
										if (!jClass.equals(jClassToTClass)) {
											if (!jClass.equals(jParentClass)) {
												if (!jClass
														.equals(jParentClassToTParentClass)) {
													if (!jClass
															.equals(nameSpace)) {
														if (!jClass.equals(pg)) {
															if (!jClass
																	.equals(tClass)) {
																if (!jClass
																		.equals(tParentClass)) {
																	if (!jClassToTClass
																			.equals(jParentClass)) {
																		if (!jClassToTClass
																				.equals(jParentClassToTParentClass)) {
																			if (!jClassToTClass
																					.equals(nameSpace)) {
																				if (!jClassToTClass
																						.equals(pg)) {
																					if (!jClassToTClass
																							.equals(tClass)) {
																						if (!jClassToTClass
																								.equals(tParentClass)) {
																							if (!jParentClass
																									.equals(jParentClassToTParentClass)) {
																								if (!jParentClass
																										.equals(nameSpace)) {
																									if (!jParentClass
																											.equals(pg)) {
																										if (!jParentClass
																												.equals(tClass)) {
																											if (!jParentClass
																													.equals(tParentClass)) {
																												if (!jParentClassToTParentClass
																														.equals(nameSpace)) {
																													if (!jParentClassToTParentClass
																															.equals(pg)) {
																														if (!jParentClassToTParentClass
																																.equals(tClass)) {
																															if (!jParentClassToTParentClass
																																	.equals(tParentClass)) {
																																if (!nameSpace
																																		.equals(pg)) {
																																	if (!nameSpace
																																			.equals(tClass)) {
																																		if (!nameSpace
																																				.equals(tParentClass)) {
																																			if (!pg.equals(tClass)) {
																																				if (!pg.equals(tParentClass)) {
																																					if (!tClass
																																							.equals(tParentClass)) {
																																						return new Object[] {
																																								ruleresult,
																																								classifierReference,
																																								jClass,
																																								jClassToTClass,
																																								jParentClass,
																																								jParentClassToTParentClass,
																																								nameSpace,
																																								pg,
																																								tClass,
																																								tParentClass };
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

	public static final Object[] pattern_Inheritance_1_3_greenBBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject classifierReference,
			EObject jClass, EObject jParentClass, EObject nameSpace,
			EObject tClass, EObject tParentClass) {
		EMoflonEdge classifierReference__jParentClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClass__nameSpace____extends = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge nameSpace__classifierReference____classifierReferences = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tParentClass__tClass____childClasses = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tClass__tParentClass____parentClass = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Inheritance";
		String classifierReference__jParentClass____target_name_prime = "target";
		String jClass__nameSpace____extends_name_prime = "extends";
		String nameSpace__classifierReference____classifierReferences_name_prime = "classifierReferences";
		String tParentClass__tClass____childClasses_name_prime = "childClasses";
		String tClass__tParentClass____parentClass_name_prime = "parentClass";
		classifierReference__jParentClass____target.setSrc(classifierReference);
		classifierReference__jParentClass____target.setTrg(jParentClass);
		ruleresult.getTranslatedEdges().add(
				classifierReference__jParentClass____target);
		jClass__nameSpace____extends.setSrc(jClass);
		jClass__nameSpace____extends.setTrg(nameSpace);
		ruleresult.getTranslatedEdges().add(jClass__nameSpace____extends);
		nameSpace__classifierReference____classifierReferences
				.setSrc(nameSpace);
		nameSpace__classifierReference____classifierReferences
				.setTrg(classifierReference);
		ruleresult.getTranslatedEdges().add(
				nameSpace__classifierReference____classifierReferences);
		tParentClass__tClass____childClasses.setSrc(tParentClass);
		tParentClass__tClass____childClasses.setTrg(tClass);
		ruleresult.getCreatedEdges().add(tParentClass__tClass____childClasses);
		tClass__tParentClass____parentClass.setSrc(tClass);
		tClass__tParentClass____parentClass.setTrg(tParentClass);
		ruleresult.getCreatedEdges().add(tClass__tParentClass____parentClass);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		classifierReference__jParentClass____target
				.setName(classifierReference__jParentClass____target_name_prime);
		jClass__nameSpace____extends
				.setName(jClass__nameSpace____extends_name_prime);
		nameSpace__classifierReference____classifierReferences
				.setName(nameSpace__classifierReference____classifierReferences_name_prime);
		tParentClass__tClass____childClasses
				.setName(tParentClass__tClass____childClasses_name_prime);
		tClass__tParentClass____parentClass
				.setName(tClass__tParentClass____parentClass_name_prime);
		return new Object[] { ruleresult, classifierReference, jClass,
				jParentClass, nameSpace, tClass, tParentClass,
				classifierReference__jParentClass____target,
				jClass__nameSpace____extends,
				nameSpace__classifierReference____classifierReferences,
				tParentClass__tClass____childClasses,
				tClass__tParentClass____parentClass };
	}

	public static final void pattern_Inheritance_1_5_expressionBBBBBBBBBBB(
			Inheritance _this, PerformRuleResult ruleresult,
			EObject classifierReference, EObject jClass,
			EObject jClassToTClass, EObject jParentClass,
			EObject jParentClassToTParentClass, EObject nameSpace, EObject pg,
			EObject tClass, EObject tParentClass) {
		_this.registerObjects_FWD(ruleresult, classifierReference, jClass,
				jClassToTClass, jParentClass, jParentClassToTParentClass,
				nameSpace, pg, tClass, tParentClass);

	}

	public static final PerformRuleResult pattern_Inheritance_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Inheritance_2_1_bindingFB(
			Inheritance _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_2_1_blackFBB(
			EClass eClass, Inheritance _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Inheritance_2_1_bindingAndBlackFFB(
			Inheritance _this) {
		Object[] result_pattern_Inheritance_2_1_binding = pattern_Inheritance_2_1_bindingFB(_this);
		if (result_pattern_Inheritance_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Inheritance_2_1_binding[0];

			Object[] result_pattern_Inheritance_2_1_black = pattern_Inheritance_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_Inheritance_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Inheritance_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Inheritance";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Inheritance_2_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("classifierReference");
		EObject _localVariable_1 = match.getObject("jClass");
		EObject _localVariable_2 = match.getObject("jParentClass");
		EObject _localVariable_3 = match.getObject("nameSpace");
		EObject tmpClassifierReference = _localVariable_0;
		EObject tmpJClass = _localVariable_1;
		EObject tmpJParentClass = _localVariable_2;
		EObject tmpNameSpace = _localVariable_3;
		if (tmpClassifierReference instanceof ClassifierReference) {
			ClassifierReference classifierReference = (ClassifierReference) tmpClassifierReference;
			if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
				org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
				if (tmpJParentClass instanceof org.emftext.language.java.classifiers.Class) {
					org.emftext.language.java.classifiers.Class jParentClass = (org.emftext.language.java.classifiers.Class) tmpJParentClass;
					if (tmpNameSpace instanceof NamespaceClassifierReference) {
						NamespaceClassifierReference nameSpace = (NamespaceClassifierReference) tmpNameSpace;
						return new Object[] { classifierReference, jClass,
								jParentClass, nameSpace, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Inheritance_2_2_blackBBFBFBFFB(
			ClassifierReference classifierReference,
			org.emftext.language.java.classifiers.Class jClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			NamespaceClassifierReference nameSpace, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!jClass.equals(jParentClass)) {
			for (ClassToTClass jClassToTClass : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(jClass, ClassToTClass.class,
							"source")) {
				TClass tClass = jClassToTClass.getTarget();
				if (tClass != null) {
					for (ClassToTClass jParentClassToTParentClass : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(jParentClass,
									ClassToTClass.class, "source")) {
						if (!jClassToTClass.equals(jParentClassToTParentClass)) {
							TClass tParentClass = jParentClassToTParentClass
									.getTarget();
							if (tParentClass != null) {
								if (!tClass.equals(tParentClass)) {
									_result.add(new Object[] {
											classifierReference, jClass,
											jClassToTClass, jParentClass,
											jParentClassToTParentClass,
											nameSpace, tClass, tParentClass,
											match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Inheritance_2_3_blackBBBBBBFBB(
			ClassifierReference classifierReference,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			ClassToTClass jParentClassToTParentClass,
			NamespaceClassifierReference nameSpace, TClass tClass,
			TClass tParentClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!jClass.equals(jParentClass)) {
			if (!jClassToTClass.equals(jParentClassToTParentClass)) {
				if (!tClass.equals(tParentClass)) {
					if (jParentClass.equals(classifierReference.getTarget())) {
						if (nameSpace.equals(jClass.getExtends())) {
							if (tClass.equals(jClassToTClass.getTarget())) {
								if (jClass.equals(jClassToTClass.getSource())) {
									if (tParentClass
											.equals(jParentClassToTParentClass
													.getTarget())) {
										if (jParentClass
												.equals(jParentClassToTParentClass
														.getSource())) {
											if (nameSpace
													.getClassifierReferences()
													.contains(
															classifierReference)) {
												for (TypeGraph pg : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																tParentClass,
																TypeGraph.class,
																"classes")) {
													if (pg.getClasses()
															.contains(tClass)) {
														_result.add(new Object[] {
																classifierReference,
																jClass,
																jClassToTClass,
																jParentClass,
																jParentClassToTParentClass,
																nameSpace, pg,
																tClass,
																tParentClass });
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
		return _result;
	}

	public static final Object[] pattern_Inheritance_2_3_greenBBBBBBBBBFFFFFFFFFF(
			ClassifierReference classifierReference,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			ClassToTClass jParentClassToTParentClass,
			NamespaceClassifierReference nameSpace, TypeGraph pg,
			TClass tClass, TClass tParentClass) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge classifierReference__jParentClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClass__nameSpace____extends = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClassToTClass__tClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClassToTClass__jClass____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParentClassToTParentClass__tParentClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParentClassToTParentClass__jParentClass____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge nameSpace__classifierReference____classifierReferences = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tParentClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String classifierReference__jParentClass____target_name_prime = "target";
		String jClass__nameSpace____extends_name_prime = "extends";
		String jClassToTClass__tClass____target_name_prime = "target";
		String jClassToTClass__jClass____source_name_prime = "source";
		String jParentClassToTParentClass__tParentClass____target_name_prime = "target";
		String jParentClassToTParentClass__jParentClass____source_name_prime = "source";
		String nameSpace__classifierReference____classifierReferences_name_prime = "classifierReferences";
		String pg__tParentClass____classes_name_prime = "classes";
		String pg__tClass____classes_name_prime = "classes";
		isApplicableMatch.getAllContextElements().add(classifierReference);
		isApplicableMatch.getAllContextElements().add(jClass);
		isApplicableMatch.getAllContextElements().add(jClassToTClass);
		isApplicableMatch.getAllContextElements().add(jParentClass);
		isApplicableMatch.getAllContextElements().add(
				jParentClassToTParentClass);
		isApplicableMatch.getAllContextElements().add(nameSpace);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(tParentClass);
		classifierReference__jParentClass____target.setSrc(classifierReference);
		classifierReference__jParentClass____target.setTrg(jParentClass);
		isApplicableMatch.getAllContextElements().add(
				classifierReference__jParentClass____target);
		jClass__nameSpace____extends.setSrc(jClass);
		jClass__nameSpace____extends.setTrg(nameSpace);
		isApplicableMatch.getAllContextElements().add(
				jClass__nameSpace____extends);
		jClassToTClass__tClass____target.setSrc(jClassToTClass);
		jClassToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(
				jClassToTClass__tClass____target);
		jClassToTClass__jClass____source.setSrc(jClassToTClass);
		jClassToTClass__jClass____source.setTrg(jClass);
		isApplicableMatch.getAllContextElements().add(
				jClassToTClass__jClass____source);
		jParentClassToTParentClass__tParentClass____target
				.setSrc(jParentClassToTParentClass);
		jParentClassToTParentClass__tParentClass____target.setTrg(tParentClass);
		isApplicableMatch.getAllContextElements().add(
				jParentClassToTParentClass__tParentClass____target);
		jParentClassToTParentClass__jParentClass____source
				.setSrc(jParentClassToTParentClass);
		jParentClassToTParentClass__jParentClass____source.setTrg(jParentClass);
		isApplicableMatch.getAllContextElements().add(
				jParentClassToTParentClass__jParentClass____source);
		nameSpace__classifierReference____classifierReferences
				.setSrc(nameSpace);
		nameSpace__classifierReference____classifierReferences
				.setTrg(classifierReference);
		isApplicableMatch.getAllContextElements().add(
				nameSpace__classifierReference____classifierReferences);
		pg__tParentClass____classes.setSrc(pg);
		pg__tParentClass____classes.setTrg(tParentClass);
		isApplicableMatch.getAllContextElements().add(
				pg__tParentClass____classes);
		pg__tClass____classes.setSrc(pg);
		pg__tClass____classes.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(pg__tClass____classes);
		classifierReference__jParentClass____target
				.setName(classifierReference__jParentClass____target_name_prime);
		jClass__nameSpace____extends
				.setName(jClass__nameSpace____extends_name_prime);
		jClassToTClass__tClass____target
				.setName(jClassToTClass__tClass____target_name_prime);
		jClassToTClass__jClass____source
				.setName(jClassToTClass__jClass____source_name_prime);
		jParentClassToTParentClass__tParentClass____target
				.setName(jParentClassToTParentClass__tParentClass____target_name_prime);
		jParentClassToTParentClass__jParentClass____source
				.setName(jParentClassToTParentClass__jParentClass____source_name_prime);
		nameSpace__classifierReference____classifierReferences
				.setName(nameSpace__classifierReference____classifierReferences_name_prime);
		pg__tParentClass____classes
				.setName(pg__tParentClass____classes_name_prime);
		pg__tClass____classes.setName(pg__tClass____classes_name_prime);
		return new Object[] { classifierReference, jClass, jClassToTClass,
				jParentClass, jParentClassToTParentClass, nameSpace, pg,
				tClass, tParentClass, isApplicableMatch,
				classifierReference__jParentClass____target,
				jClass__nameSpace____extends, jClassToTClass__tClass____target,
				jClassToTClass__jClass____source,
				jParentClassToTParentClass__tParentClass____target,
				jParentClassToTParentClass__jParentClass____source,
				nameSpace__classifierReference____classifierReferences,
				pg__tParentClass____classes, pg__tClass____classes };
	}

	public static final Object[] pattern_Inheritance_2_4_bindingFBBBBBBBBBBB(
			Inheritance _this, IsApplicableMatch isApplicableMatch,
			ClassifierReference classifierReference,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			ClassToTClass jParentClassToTParentClass,
			NamespaceClassifierReference nameSpace, TypeGraph pg,
			TClass tClass, TClass tParentClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, classifierReference, jClass, jClassToTClass,
				jParentClass, jParentClassToTParentClass, nameSpace, pg,
				tClass, tParentClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					classifierReference, jClass, jClassToTClass, jParentClass,
					jParentClassToTParentClass, nameSpace, pg, tClass,
					tParentClass };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Inheritance_2_4_bindingAndBlackFBBBBBBBBBBB(
			Inheritance _this, IsApplicableMatch isApplicableMatch,
			ClassifierReference classifierReference,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			ClassToTClass jParentClassToTParentClass,
			NamespaceClassifierReference nameSpace, TypeGraph pg,
			TClass tClass, TClass tParentClass) {
		Object[] result_pattern_Inheritance_2_4_binding = pattern_Inheritance_2_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, classifierReference, jClass,
				jClassToTClass, jParentClass, jParentClassToTParentClass,
				nameSpace, pg, tClass, tParentClass);
		if (result_pattern_Inheritance_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_Inheritance_2_4_binding[0];

			Object[] result_pattern_Inheritance_2_4_black = pattern_Inheritance_2_4_blackB(csp);
			if (result_pattern_Inheritance_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						classifierReference, jClass, jClassToTClass,
						jParentClass, jParentClassToTParentClass, nameSpace,
						pg, tClass, tParentClass };
			}
		}
		return null;
	}

	public static final boolean pattern_Inheritance_2_5_expressionFBB(
			Inheritance _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Inheritance_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Inheritance_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Inheritance";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Inheritance_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Inheritance_10_1_blackBBBBB(
			Inheritance _this, Match match, TypeGraph pg, TClass tClass,
			TClass tParentClass) {
		if (!tClass.equals(tParentClass)) {
			return new Object[] { _this, match, pg, tClass, tParentClass };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_10_2_bindingFBBBBB(
			Inheritance _this, Match match, TypeGraph pg, TClass tClass,
			TClass tParentClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, pg,
				tClass, tParentClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, pg, tClass, tParentClass };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Inheritance_10_2_bindingAndBlackFBBBBB(
			Inheritance _this, Match match, TypeGraph pg, TClass tClass,
			TClass tParentClass) {
		Object[] result_pattern_Inheritance_10_2_binding = pattern_Inheritance_10_2_bindingFBBBBB(
				_this, match, pg, tClass, tParentClass);
		if (result_pattern_Inheritance_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_Inheritance_10_2_binding[0];

			Object[] result_pattern_Inheritance_10_2_black = pattern_Inheritance_10_2_blackB(csp);
			if (result_pattern_Inheritance_10_2_black != null) {

				return new Object[] { csp, _this, match, pg, tClass,
						tParentClass };
			}
		}
		return null;
	}

	public static final boolean pattern_Inheritance_10_3_expressionFBB(
			Inheritance _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Inheritance_10_4_blackBBBB(
			Match match, TypeGraph pg, TClass tClass, TClass tParentClass) {
		if (!tClass.equals(tParentClass)) {
			return new Object[] { match, pg, tClass, tParentClass };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_10_4_greenBBBFF(
			Match match, TClass tClass, TClass tParentClass) {
		EMoflonEdge tParentClass__tClass____childClasses = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tClass__tParentClass____parentClass = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tParentClass__tClass____childClasses_name_prime = "childClasses";
		String tClass__tParentClass____parentClass_name_prime = "parentClass";
		tParentClass__tClass____childClasses.setSrc(tParentClass);
		tParentClass__tClass____childClasses.setTrg(tClass);
		match.getToBeTranslatedEdges()
				.add(tParentClass__tClass____childClasses);
		tClass__tParentClass____parentClass.setSrc(tClass);
		tClass__tParentClass____parentClass.setTrg(tParentClass);
		match.getToBeTranslatedEdges().add(tClass__tParentClass____parentClass);
		tParentClass__tClass____childClasses
				.setName(tParentClass__tClass____childClasses_name_prime);
		tClass__tParentClass____parentClass
				.setName(tClass__tParentClass____parentClass_name_prime);
		return new Object[] { match, tClass, tParentClass,
				tParentClass__tClass____childClasses,
				tClass__tParentClass____parentClass };
	}

	public static final Object[] pattern_Inheritance_10_5_blackBBBB(
			Match match, TypeGraph pg, TClass tClass, TClass tParentClass) {
		if (!tClass.equals(tParentClass)) {
			return new Object[] { match, pg, tClass, tParentClass };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_10_5_greenBBBBFF(
			Match match, TypeGraph pg, TClass tClass, TClass tParentClass) {
		EMoflonEdge pg__tParentClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(pg);
		match.getContextNodes().add(tClass);
		match.getContextNodes().add(tParentClass);
		String pg__tParentClass____classes_name_prime = "classes";
		String pg__tClass____classes_name_prime = "classes";
		pg__tParentClass____classes.setSrc(pg);
		pg__tParentClass____classes.setTrg(tParentClass);
		match.getContextEdges().add(pg__tParentClass____classes);
		pg__tClass____classes.setSrc(pg);
		pg__tClass____classes.setTrg(tClass);
		match.getContextEdges().add(pg__tClass____classes);
		pg__tParentClass____classes
				.setName(pg__tParentClass____classes_name_prime);
		pg__tClass____classes.setName(pg__tClass____classes_name_prime);
		return new Object[] { match, pg, tClass, tParentClass,
				pg__tParentClass____classes, pg__tClass____classes };
	}

	public static final void pattern_Inheritance_10_6_expressionBBBBB(
			Inheritance _this, Match match, TypeGraph pg, TClass tClass,
			TClass tParentClass) {
		_this.registerObjectsToMatch_BWD(match, pg, tClass, tParentClass);

	}

	public static final boolean pattern_Inheritance_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Inheritance_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Inheritance_11_1_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jClass");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("jClassToTClass");
		EObject _localVariable_2 = isApplicableMatch.getObject("jParentClass");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("jParentClassToTParentClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("pg");
		EObject _localVariable_5 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_6 = isApplicableMatch.getObject("tParentClass");
		EObject tmpJClass = _localVariable_0;
		EObject tmpJClassToTClass = _localVariable_1;
		EObject tmpJParentClass = _localVariable_2;
		EObject tmpJParentClassToTParentClass = _localVariable_3;
		EObject tmpPg = _localVariable_4;
		EObject tmpTClass = _localVariable_5;
		EObject tmpTParentClass = _localVariable_6;
		if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
			if (tmpJClassToTClass instanceof ClassToTClass) {
				ClassToTClass jClassToTClass = (ClassToTClass) tmpJClassToTClass;
				if (tmpJParentClass instanceof org.emftext.language.java.classifiers.Class) {
					org.emftext.language.java.classifiers.Class jParentClass = (org.emftext.language.java.classifiers.Class) tmpJParentClass;
					if (tmpJParentClassToTParentClass instanceof ClassToTClass) {
						ClassToTClass jParentClassToTParentClass = (ClassToTClass) tmpJParentClassToTParentClass;
						if (tmpPg instanceof TypeGraph) {
							TypeGraph pg = (TypeGraph) tmpPg;
							if (tmpTClass instanceof TClass) {
								TClass tClass = (TClass) tmpTClass;
								if (tmpTParentClass instanceof TClass) {
									TClass tParentClass = (TClass) tmpTParentClass;
									return new Object[] { jClass,
											jClassToTClass, jParentClass,
											jParentClassToTParentClass, pg,
											tClass, tParentClass,
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

	public static final Object[] pattern_Inheritance_11_1_blackBBBBBBBFBB(
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			ClassToTClass jParentClassToTParentClass, TypeGraph pg,
			TClass tClass, TClass tParentClass, Inheritance _this,
			IsApplicableMatch isApplicableMatch) {
		if (!jClass.equals(jParentClass)) {
			if (!jClassToTClass.equals(jParentClassToTParentClass)) {
				if (!tClass.equals(tParentClass)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { jClass, jClassToTClass,
									jParentClass, jParentClassToTParentClass,
									pg, tClass, tParentClass, csp, _this,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_11_1_bindingAndBlackFFFFFFFFBB(
			Inheritance _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Inheritance_11_1_binding = pattern_Inheritance_11_1_bindingFFFFFFFB(isApplicableMatch);
		if (result_pattern_Inheritance_11_1_binding != null) {
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result_pattern_Inheritance_11_1_binding[0];
			ClassToTClass jClassToTClass = (ClassToTClass) result_pattern_Inheritance_11_1_binding[1];
			org.emftext.language.java.classifiers.Class jParentClass = (org.emftext.language.java.classifiers.Class) result_pattern_Inheritance_11_1_binding[2];
			ClassToTClass jParentClassToTParentClass = (ClassToTClass) result_pattern_Inheritance_11_1_binding[3];
			TypeGraph pg = (TypeGraph) result_pattern_Inheritance_11_1_binding[4];
			TClass tClass = (TClass) result_pattern_Inheritance_11_1_binding[5];
			TClass tParentClass = (TClass) result_pattern_Inheritance_11_1_binding[6];

			Object[] result_pattern_Inheritance_11_1_black = pattern_Inheritance_11_1_blackBBBBBBBFBB(
					jClass, jClassToTClass, jParentClass,
					jParentClassToTParentClass, pg, tClass, tParentClass,
					_this, isApplicableMatch);
			if (result_pattern_Inheritance_11_1_black != null) {
				CSP csp = (CSP) result_pattern_Inheritance_11_1_black[7];

				return new Object[] { jClass, jClassToTClass, jParentClass,
						jParentClassToTParentClass, pg, tClass, tParentClass,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_11_1_greenFBBF(
			org.emftext.language.java.classifiers.Class jClass,
			org.emftext.language.java.classifiers.Class jParentClass) {
		ClassifierReference classifierReference = TypesFactory.eINSTANCE
				.createClassifierReference();
		NamespaceClassifierReference nameSpace = TypesFactory.eINSTANCE
				.createNamespaceClassifierReference();
		classifierReference.setTarget(jParentClass);
		jClass.setExtends(nameSpace);
		nameSpace.getClassifierReferences().add(classifierReference);
		return new Object[] { classifierReference, jClass, jParentClass,
				nameSpace };
	}

	public static final Object[] pattern_Inheritance_11_2_blackBB(
			ClassifierReference classifierReference,
			NamespaceClassifierReference nameSpace) {
		return new Object[] { classifierReference, nameSpace };
	}

	public static final Object[] pattern_Inheritance_11_2_greenFBB(
			ClassifierReference classifierReference,
			NamespaceClassifierReference nameSpace) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(classifierReference);
		ruleresult.getCreatedElements().add(nameSpace);
		return new Object[] { ruleresult, classifierReference, nameSpace };
	}

	public static final Object[] pattern_Inheritance_11_3_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject classifierReference,
			EObject jClass, EObject jClassToTClass, EObject jParentClass,
			EObject jParentClassToTParentClass, EObject nameSpace, EObject pg,
			EObject tClass, EObject tParentClass) {
		if (!classifierReference.equals(jClass)) {
			if (!classifierReference.equals(jClassToTClass)) {
				if (!classifierReference.equals(jParentClass)) {
					if (!classifierReference.equals(jParentClassToTParentClass)) {
						if (!classifierReference.equals(nameSpace)) {
							if (!classifierReference.equals(pg)) {
								if (!classifierReference.equals(tClass)) {
									if (!classifierReference
											.equals(tParentClass)) {
										if (!jClass.equals(jClassToTClass)) {
											if (!jClass.equals(jParentClass)) {
												if (!jClass
														.equals(jParentClassToTParentClass)) {
													if (!jClass
															.equals(nameSpace)) {
														if (!jClass.equals(pg)) {
															if (!jClass
																	.equals(tClass)) {
																if (!jClass
																		.equals(tParentClass)) {
																	if (!jClassToTClass
																			.equals(jParentClass)) {
																		if (!jClassToTClass
																				.equals(jParentClassToTParentClass)) {
																			if (!jClassToTClass
																					.equals(nameSpace)) {
																				if (!jClassToTClass
																						.equals(pg)) {
																					if (!jClassToTClass
																							.equals(tClass)) {
																						if (!jClassToTClass
																								.equals(tParentClass)) {
																							if (!jParentClass
																									.equals(jParentClassToTParentClass)) {
																								if (!jParentClass
																										.equals(nameSpace)) {
																									if (!jParentClass
																											.equals(pg)) {
																										if (!jParentClass
																												.equals(tClass)) {
																											if (!jParentClass
																													.equals(tParentClass)) {
																												if (!jParentClassToTParentClass
																														.equals(nameSpace)) {
																													if (!jParentClassToTParentClass
																															.equals(pg)) {
																														if (!jParentClassToTParentClass
																																.equals(tClass)) {
																															if (!jParentClassToTParentClass
																																	.equals(tParentClass)) {
																																if (!nameSpace
																																		.equals(pg)) {
																																	if (!nameSpace
																																			.equals(tClass)) {
																																		if (!nameSpace
																																				.equals(tParentClass)) {
																																			if (!pg.equals(tClass)) {
																																				if (!pg.equals(tParentClass)) {
																																					if (!tClass
																																							.equals(tParentClass)) {
																																						return new Object[] {
																																								ruleresult,
																																								classifierReference,
																																								jClass,
																																								jClassToTClass,
																																								jParentClass,
																																								jParentClassToTParentClass,
																																								nameSpace,
																																								pg,
																																								tClass,
																																								tParentClass };
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

	public static final Object[] pattern_Inheritance_11_3_greenBBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject classifierReference,
			EObject jClass, EObject jParentClass, EObject nameSpace,
			EObject tClass, EObject tParentClass) {
		EMoflonEdge classifierReference__jParentClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClass__nameSpace____extends = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge nameSpace__classifierReference____classifierReferences = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tParentClass__tClass____childClasses = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tClass__tParentClass____parentClass = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Inheritance";
		String classifierReference__jParentClass____target_name_prime = "target";
		String jClass__nameSpace____extends_name_prime = "extends";
		String nameSpace__classifierReference____classifierReferences_name_prime = "classifierReferences";
		String tParentClass__tClass____childClasses_name_prime = "childClasses";
		String tClass__tParentClass____parentClass_name_prime = "parentClass";
		classifierReference__jParentClass____target.setSrc(classifierReference);
		classifierReference__jParentClass____target.setTrg(jParentClass);
		ruleresult.getCreatedEdges().add(
				classifierReference__jParentClass____target);
		jClass__nameSpace____extends.setSrc(jClass);
		jClass__nameSpace____extends.setTrg(nameSpace);
		ruleresult.getCreatedEdges().add(jClass__nameSpace____extends);
		nameSpace__classifierReference____classifierReferences
				.setSrc(nameSpace);
		nameSpace__classifierReference____classifierReferences
				.setTrg(classifierReference);
		ruleresult.getCreatedEdges().add(
				nameSpace__classifierReference____classifierReferences);
		tParentClass__tClass____childClasses.setSrc(tParentClass);
		tParentClass__tClass____childClasses.setTrg(tClass);
		ruleresult.getTranslatedEdges().add(
				tParentClass__tClass____childClasses);
		tClass__tParentClass____parentClass.setSrc(tClass);
		tClass__tParentClass____parentClass.setTrg(tParentClass);
		ruleresult.getTranslatedEdges()
				.add(tClass__tParentClass____parentClass);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		classifierReference__jParentClass____target
				.setName(classifierReference__jParentClass____target_name_prime);
		jClass__nameSpace____extends
				.setName(jClass__nameSpace____extends_name_prime);
		nameSpace__classifierReference____classifierReferences
				.setName(nameSpace__classifierReference____classifierReferences_name_prime);
		tParentClass__tClass____childClasses
				.setName(tParentClass__tClass____childClasses_name_prime);
		tClass__tParentClass____parentClass
				.setName(tClass__tParentClass____parentClass_name_prime);
		return new Object[] { ruleresult, classifierReference, jClass,
				jParentClass, nameSpace, tClass, tParentClass,
				classifierReference__jParentClass____target,
				jClass__nameSpace____extends,
				nameSpace__classifierReference____classifierReferences,
				tParentClass__tClass____childClasses,
				tClass__tParentClass____parentClass };
	}

	public static final void pattern_Inheritance_11_5_expressionBBBBBBBBBBB(
			Inheritance _this, PerformRuleResult ruleresult,
			EObject classifierReference, EObject jClass,
			EObject jClassToTClass, EObject jParentClass,
			EObject jParentClassToTParentClass, EObject nameSpace, EObject pg,
			EObject tClass, EObject tParentClass) {
		_this.registerObjects_BWD(ruleresult, classifierReference, jClass,
				jClassToTClass, jParentClass, jParentClassToTParentClass,
				nameSpace, pg, tClass, tParentClass);

	}

	public static final PerformRuleResult pattern_Inheritance_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Inheritance_12_1_bindingFB(
			Inheritance _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_12_1_blackFBB(
			EClass eClass, Inheritance _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Inheritance_12_1_bindingAndBlackFFB(
			Inheritance _this) {
		Object[] result_pattern_Inheritance_12_1_binding = pattern_Inheritance_12_1_bindingFB(_this);
		if (result_pattern_Inheritance_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Inheritance_12_1_binding[0];

			Object[] result_pattern_Inheritance_12_1_black = pattern_Inheritance_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_Inheritance_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Inheritance_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Inheritance";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Inheritance_12_2_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("pg");
		EObject _localVariable_1 = match.getObject("tClass");
		EObject _localVariable_2 = match.getObject("tParentClass");
		EObject tmpPg = _localVariable_0;
		EObject tmpTClass = _localVariable_1;
		EObject tmpTParentClass = _localVariable_2;
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				if (tmpTParentClass instanceof TClass) {
					TClass tParentClass = (TClass) tmpTParentClass;
					return new Object[] { pg, tClass, tParentClass, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Inheritance_12_2_blackFFFFBBBB(
			TypeGraph pg, TClass tClass, TClass tParentClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tClass.equals(tParentClass)) {
			for (ClassToTClass jClassToTClass : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tClass, ClassToTClass.class,
							"target")) {
				org.emftext.language.java.classifiers.Class jClass = jClassToTClass
						.getSource();
				if (jClass != null) {
					for (ClassToTClass jParentClassToTParentClass : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tParentClass,
									ClassToTClass.class, "target")) {
						if (!jClassToTClass.equals(jParentClassToTParentClass)) {
							org.emftext.language.java.classifiers.Class jParentClass = jParentClassToTParentClass
									.getSource();
							if (jParentClass != null) {
								if (!jClass.equals(jParentClass)) {
									_result.add(new Object[] { jClass,
											jClassToTClass, jParentClass,
											jParentClassToTParentClass, pg,
											tClass, tParentClass, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Inheritance_12_3_blackBBBBBBB(
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			ClassToTClass jParentClassToTParentClass, TypeGraph pg,
			TClass tClass, TClass tParentClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!jClass.equals(jParentClass)) {
			if (!jClassToTClass.equals(jParentClassToTParentClass)) {
				if (!tClass.equals(tParentClass)) {
					if (tClass.equals(jClassToTClass.getTarget())) {
						if (jClass.equals(jClassToTClass.getSource())) {
							if (tParentClass.equals(jParentClassToTParentClass
									.getTarget())) {
								if (jParentClass
										.equals(jParentClassToTParentClass
												.getSource())) {
									if (pg.getClasses().contains(tParentClass)) {
										if (pg.getClasses().contains(tClass)) {
											if (tParentClass.getChildClasses()
													.contains(tClass)) {
												_result.add(new Object[] {
														jClass,
														jClassToTClass,
														jParentClass,
														jParentClassToTParentClass,
														pg, tClass,
														tParentClass });
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

	public static final Object[] pattern_Inheritance_12_3_greenBBBBBBBFFFFFFFFF(
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			ClassToTClass jParentClassToTParentClass, TypeGraph pg,
			TClass tClass, TClass tParentClass) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge jClassToTClass__tClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClassToTClass__jClass____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParentClassToTParentClass__tParentClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParentClassToTParentClass__jParentClass____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tParentClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tParentClass__tClass____childClasses = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tClass__tParentClass____parentClass = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jClassToTClass__tClass____target_name_prime = "target";
		String jClassToTClass__jClass____source_name_prime = "source";
		String jParentClassToTParentClass__tParentClass____target_name_prime = "target";
		String jParentClassToTParentClass__jParentClass____source_name_prime = "source";
		String pg__tParentClass____classes_name_prime = "classes";
		String pg__tClass____classes_name_prime = "classes";
		String tParentClass__tClass____childClasses_name_prime = "childClasses";
		String tClass__tParentClass____parentClass_name_prime = "parentClass";
		isApplicableMatch.getAllContextElements().add(jClass);
		isApplicableMatch.getAllContextElements().add(jClassToTClass);
		isApplicableMatch.getAllContextElements().add(jParentClass);
		isApplicableMatch.getAllContextElements().add(
				jParentClassToTParentClass);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(tParentClass);
		jClassToTClass__tClass____target.setSrc(jClassToTClass);
		jClassToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(
				jClassToTClass__tClass____target);
		jClassToTClass__jClass____source.setSrc(jClassToTClass);
		jClassToTClass__jClass____source.setTrg(jClass);
		isApplicableMatch.getAllContextElements().add(
				jClassToTClass__jClass____source);
		jParentClassToTParentClass__tParentClass____target
				.setSrc(jParentClassToTParentClass);
		jParentClassToTParentClass__tParentClass____target.setTrg(tParentClass);
		isApplicableMatch.getAllContextElements().add(
				jParentClassToTParentClass__tParentClass____target);
		jParentClassToTParentClass__jParentClass____source
				.setSrc(jParentClassToTParentClass);
		jParentClassToTParentClass__jParentClass____source.setTrg(jParentClass);
		isApplicableMatch.getAllContextElements().add(
				jParentClassToTParentClass__jParentClass____source);
		pg__tParentClass____classes.setSrc(pg);
		pg__tParentClass____classes.setTrg(tParentClass);
		isApplicableMatch.getAllContextElements().add(
				pg__tParentClass____classes);
		pg__tClass____classes.setSrc(pg);
		pg__tClass____classes.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(pg__tClass____classes);
		tParentClass__tClass____childClasses.setSrc(tParentClass);
		tParentClass__tClass____childClasses.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(
				tParentClass__tClass____childClasses);
		tClass__tParentClass____parentClass.setSrc(tClass);
		tClass__tParentClass____parentClass.setTrg(tParentClass);
		isApplicableMatch.getAllContextElements().add(
				tClass__tParentClass____parentClass);
		jClassToTClass__tClass____target
				.setName(jClassToTClass__tClass____target_name_prime);
		jClassToTClass__jClass____source
				.setName(jClassToTClass__jClass____source_name_prime);
		jParentClassToTParentClass__tParentClass____target
				.setName(jParentClassToTParentClass__tParentClass____target_name_prime);
		jParentClassToTParentClass__jParentClass____source
				.setName(jParentClassToTParentClass__jParentClass____source_name_prime);
		pg__tParentClass____classes
				.setName(pg__tParentClass____classes_name_prime);
		pg__tClass____classes.setName(pg__tClass____classes_name_prime);
		tParentClass__tClass____childClasses
				.setName(tParentClass__tClass____childClasses_name_prime);
		tClass__tParentClass____parentClass
				.setName(tClass__tParentClass____parentClass_name_prime);
		return new Object[] { jClass, jClassToTClass, jParentClass,
				jParentClassToTParentClass, pg, tClass, tParentClass,
				isApplicableMatch, jClassToTClass__tClass____target,
				jClassToTClass__jClass____source,
				jParentClassToTParentClass__tParentClass____target,
				jParentClassToTParentClass__jParentClass____source,
				pg__tParentClass____classes, pg__tClass____classes,
				tParentClass__tClass____childClasses,
				tClass__tParentClass____parentClass };
	}

	public static final Object[] pattern_Inheritance_12_4_bindingFBBBBBBBBB(
			Inheritance _this, IsApplicableMatch isApplicableMatch,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			ClassToTClass jParentClassToTParentClass, TypeGraph pg,
			TClass tClass, TClass tParentClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, jClass, jClassToTClass, jParentClass,
				jParentClassToTParentClass, pg, tClass, tParentClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jClass,
					jClassToTClass, jParentClass, jParentClassToTParentClass,
					pg, tClass, tParentClass };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Inheritance_12_4_bindingAndBlackFBBBBBBBBB(
			Inheritance _this, IsApplicableMatch isApplicableMatch,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			ClassToTClass jParentClassToTParentClass, TypeGraph pg,
			TClass tClass, TClass tParentClass) {
		Object[] result_pattern_Inheritance_12_4_binding = pattern_Inheritance_12_4_bindingFBBBBBBBBB(
				_this, isApplicableMatch, jClass, jClassToTClass, jParentClass,
				jParentClassToTParentClass, pg, tClass, tParentClass);
		if (result_pattern_Inheritance_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_Inheritance_12_4_binding[0];

			Object[] result_pattern_Inheritance_12_4_black = pattern_Inheritance_12_4_blackB(csp);
			if (result_pattern_Inheritance_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jClass,
						jClassToTClass, jParentClass,
						jParentClassToTParentClass, pg, tClass, tParentClass };
			}
		}
		return null;
	}

	public static final boolean pattern_Inheritance_12_5_expressionFBB(
			Inheritance _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Inheritance_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Inheritance_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Inheritance";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Inheritance_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Inheritance_20_1_bindingFB(
			Inheritance _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_20_1_blackFBB(
			EClass __eClass, Inheritance _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Inheritance_20_1_bindingAndBlackFFB(
			Inheritance _this) {
		Object[] result_pattern_Inheritance_20_1_binding = pattern_Inheritance_20_1_bindingFB(_this);
		if (result_pattern_Inheritance_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Inheritance_20_1_binding[0];

			Object[] result_pattern_Inheritance_20_1_black = pattern_Inheritance_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Inheritance_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Inheritance_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Inheritance_20_2_black_nac_0BB(
			ClassifierReference classifierReference,
			NamespaceClassifierReference nameSpace) {
		for (NamespaceClassifierReference __DEC_classifierReference_classifierReferences_909882 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(classifierReference,
						NamespaceClassifierReference.class,
						"classifierReferences")) {
			if (!nameSpace
					.equals(__DEC_classifierReference_classifierReferences_909882)) {
				return new Object[] { classifierReference, nameSpace };
			}
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_20_2_black_nac_1BB(
			NamespaceClassifierReference nameSpace,
			ClassifierReference classifierReference) {
		for (ClassifierReference __DEC_nameSpace_classifierReferences_67349 : nameSpace
				.getClassifierReferences()) {
			if (!classifierReference
					.equals(__DEC_nameSpace_classifierReferences_67349)) {
				return new Object[] { nameSpace, classifierReference };
			}
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_20_2_black_nac_2BB(
			org.emftext.language.java.classifiers.Class jClass,
			ClassifierReference classifierReference) {
		if (classifierReference.equals(jClass.getExtends())) {
			return new Object[] { jClass, classifierReference };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_20_2_black_nac_3BB(
			org.emftext.language.java.classifiers.Class jParentClass,
			ClassifierReference classifierReference) {
		if (classifierReference.equals(jParentClass.getExtends())) {
			return new Object[] { jParentClass, classifierReference };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_20_2_black_nac_4BB(
			org.emftext.language.java.classifiers.Class jParentClass,
			NamespaceClassifierReference nameSpace) {
		if (nameSpace.equals(jParentClass.getExtends())) {
			return new Object[] { jParentClass, nameSpace };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Inheritance_20_2_blackFFFFB(
			EMoflonEdge _edge_target) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpClassifierReference = _edge_target.getSrc();
		if (tmpClassifierReference instanceof ClassifierReference) {
			ClassifierReference classifierReference = (ClassifierReference) tmpClassifierReference;
			EObject tmpJParentClass = _edge_target.getTrg();
			if (tmpJParentClass instanceof org.emftext.language.java.classifiers.Class) {
				org.emftext.language.java.classifiers.Class jParentClass = (org.emftext.language.java.classifiers.Class) tmpJParentClass;
				if (jParentClass.equals(classifierReference.getTarget())) {
					if (pattern_Inheritance_20_2_black_nac_3BB(jParentClass,
							classifierReference) == null) {
						for (NamespaceClassifierReference nameSpace : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(classifierReference,
										NamespaceClassifierReference.class,
										"classifierReferences")) {
							if (pattern_Inheritance_20_2_black_nac_0BB(
									classifierReference, nameSpace) == null) {
								if (pattern_Inheritance_20_2_black_nac_1BB(
										nameSpace, classifierReference) == null) {
									if (pattern_Inheritance_20_2_black_nac_4BB(
											jParentClass, nameSpace) == null) {
										for (org.emftext.language.java.classifiers.Class jClass : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														nameSpace,
														org.emftext.language.java.classifiers.Class.class,
														"extends")) {
											if (!jClass.equals(jParentClass)) {
												if (pattern_Inheritance_20_2_black_nac_2BB(
														jClass,
														classifierReference) == null) {
													_result.add(new Object[] {
															classifierReference,
															jClass,
															jParentClass,
															nameSpace,
															_edge_target });
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

		return _result;
	}

	public static final Object[] pattern_Inheritance_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Inheritance_20_3_expressionFBBBBBB(
			Inheritance _this, Match match,
			ClassifierReference classifierReference,
			org.emftext.language.java.classifiers.Class jClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			NamespaceClassifierReference nameSpace) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				classifierReference, jClass, jParentClass, nameSpace);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Inheritance_20_4_expressionFBB(
			Inheritance _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Inheritance_20_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Inheritance_20_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Inheritance_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Inheritance_21_1_bindingFB(
			Inheritance _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_21_1_blackFBB(
			EClass __eClass, Inheritance _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Inheritance_21_1_bindingAndBlackFFB(
			Inheritance _this) {
		Object[] result_pattern_Inheritance_21_1_binding = pattern_Inheritance_21_1_bindingFB(_this);
		if (result_pattern_Inheritance_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Inheritance_21_1_binding[0];

			Object[] result_pattern_Inheritance_21_1_black = pattern_Inheritance_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Inheritance_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Inheritance_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Inheritance_21_2_black_nac_0BB(
			ClassifierReference classifierReference,
			NamespaceClassifierReference nameSpace) {
		for (NamespaceClassifierReference __DEC_classifierReference_classifierReferences_99453 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(classifierReference,
						NamespaceClassifierReference.class,
						"classifierReferences")) {
			if (!nameSpace
					.equals(__DEC_classifierReference_classifierReferences_99453)) {
				return new Object[] { classifierReference, nameSpace };
			}
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_21_2_black_nac_1BB(
			NamespaceClassifierReference nameSpace,
			ClassifierReference classifierReference) {
		for (ClassifierReference __DEC_nameSpace_classifierReferences_538523 : nameSpace
				.getClassifierReferences()) {
			if (!classifierReference
					.equals(__DEC_nameSpace_classifierReferences_538523)) {
				return new Object[] { nameSpace, classifierReference };
			}
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_21_2_black_nac_2BB(
			org.emftext.language.java.classifiers.Class jClass,
			ClassifierReference classifierReference) {
		if (classifierReference.equals(jClass.getExtends())) {
			return new Object[] { jClass, classifierReference };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_21_2_black_nac_3BB(
			org.emftext.language.java.classifiers.Class jParentClass,
			ClassifierReference classifierReference) {
		if (classifierReference.equals(jParentClass.getExtends())) {
			return new Object[] { jParentClass, classifierReference };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_21_2_black_nac_4BB(
			org.emftext.language.java.classifiers.Class jParentClass,
			NamespaceClassifierReference nameSpace) {
		if (nameSpace.equals(jParentClass.getExtends())) {
			return new Object[] { jParentClass, nameSpace };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Inheritance_21_2_blackFFFFB(
			EMoflonEdge _edge_extends) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJClass = _edge_extends.getSrc();
		if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
			EObject tmpNameSpace = _edge_extends.getTrg();
			if (tmpNameSpace instanceof NamespaceClassifierReference) {
				NamespaceClassifierReference nameSpace = (NamespaceClassifierReference) tmpNameSpace;
				if (nameSpace.equals(jClass.getExtends())) {
					for (ClassifierReference classifierReference : nameSpace
							.getClassifierReferences()) {
						Classifier tmpJParentClass = classifierReference
								.getTarget();
						if (tmpJParentClass instanceof org.emftext.language.java.classifiers.Class) {
							org.emftext.language.java.classifiers.Class jParentClass = (org.emftext.language.java.classifiers.Class) tmpJParentClass;
							if (!jClass.equals(jParentClass)) {
								if (pattern_Inheritance_21_2_black_nac_0BB(
										classifierReference, nameSpace) == null) {
									if (pattern_Inheritance_21_2_black_nac_1BB(
											nameSpace, classifierReference) == null) {
										if (pattern_Inheritance_21_2_black_nac_2BB(
												jClass, classifierReference) == null) {
											if (pattern_Inheritance_21_2_black_nac_3BB(
													jParentClass,
													classifierReference) == null) {
												if (pattern_Inheritance_21_2_black_nac_4BB(
														jParentClass, nameSpace) == null) {
													_result.add(new Object[] {
															classifierReference,
															jClass,
															jParentClass,
															nameSpace,
															_edge_extends });
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

		return _result;
	}

	public static final Object[] pattern_Inheritance_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Inheritance_21_3_expressionFBBBBBB(
			Inheritance _this, Match match,
			ClassifierReference classifierReference,
			org.emftext.language.java.classifiers.Class jClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			NamespaceClassifierReference nameSpace) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				classifierReference, jClass, jParentClass, nameSpace);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Inheritance_21_4_expressionFBB(
			Inheritance _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Inheritance_21_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Inheritance_21_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Inheritance_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Inheritance_22_1_bindingFB(
			Inheritance _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_22_1_blackFBB(
			EClass __eClass, Inheritance _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Inheritance_22_1_bindingAndBlackFFB(
			Inheritance _this) {
		Object[] result_pattern_Inheritance_22_1_binding = pattern_Inheritance_22_1_bindingFB(_this);
		if (result_pattern_Inheritance_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Inheritance_22_1_binding[0];

			Object[] result_pattern_Inheritance_22_1_black = pattern_Inheritance_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Inheritance_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Inheritance_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Inheritance_22_2_black_nac_0BB(
			ClassifierReference classifierReference,
			NamespaceClassifierReference nameSpace) {
		for (NamespaceClassifierReference __DEC_classifierReference_classifierReferences_525138 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(classifierReference,
						NamespaceClassifierReference.class,
						"classifierReferences")) {
			if (!nameSpace
					.equals(__DEC_classifierReference_classifierReferences_525138)) {
				return new Object[] { classifierReference, nameSpace };
			}
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_22_2_black_nac_1BB(
			NamespaceClassifierReference nameSpace,
			ClassifierReference classifierReference) {
		for (ClassifierReference __DEC_nameSpace_classifierReferences_947355 : nameSpace
				.getClassifierReferences()) {
			if (!classifierReference
					.equals(__DEC_nameSpace_classifierReferences_947355)) {
				return new Object[] { nameSpace, classifierReference };
			}
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_22_2_black_nac_2BB(
			org.emftext.language.java.classifiers.Class jClass,
			ClassifierReference classifierReference) {
		if (classifierReference.equals(jClass.getExtends())) {
			return new Object[] { jClass, classifierReference };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_22_2_black_nac_3BB(
			org.emftext.language.java.classifiers.Class jParentClass,
			ClassifierReference classifierReference) {
		if (classifierReference.equals(jParentClass.getExtends())) {
			return new Object[] { jParentClass, classifierReference };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_22_2_black_nac_4BB(
			org.emftext.language.java.classifiers.Class jParentClass,
			NamespaceClassifierReference nameSpace) {
		if (nameSpace.equals(jParentClass.getExtends())) {
			return new Object[] { jParentClass, nameSpace };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Inheritance_22_2_blackFFFFB(
			EMoflonEdge _edge_classifierReferences) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpNameSpace = _edge_classifierReferences.getSrc();
		if (tmpNameSpace instanceof NamespaceClassifierReference) {
			NamespaceClassifierReference nameSpace = (NamespaceClassifierReference) tmpNameSpace;
			EObject tmpClassifierReference = _edge_classifierReferences
					.getTrg();
			if (tmpClassifierReference instanceof ClassifierReference) {
				ClassifierReference classifierReference = (ClassifierReference) tmpClassifierReference;
				if (nameSpace.getClassifierReferences().contains(
						classifierReference)) {
					Classifier tmpJParentClass = classifierReference
							.getTarget();
					if (tmpJParentClass instanceof org.emftext.language.java.classifiers.Class) {
						org.emftext.language.java.classifiers.Class jParentClass = (org.emftext.language.java.classifiers.Class) tmpJParentClass;
						if (pattern_Inheritance_22_2_black_nac_0BB(
								classifierReference, nameSpace) == null) {
							if (pattern_Inheritance_22_2_black_nac_1BB(
									nameSpace, classifierReference) == null) {
								if (pattern_Inheritance_22_2_black_nac_3BB(
										jParentClass, classifierReference) == null) {
									if (pattern_Inheritance_22_2_black_nac_4BB(
											jParentClass, nameSpace) == null) {
										for (org.emftext.language.java.classifiers.Class jClass : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														nameSpace,
														org.emftext.language.java.classifiers.Class.class,
														"extends")) {
											if (!jClass.equals(jParentClass)) {
												if (pattern_Inheritance_22_2_black_nac_2BB(
														jClass,
														classifierReference) == null) {
													_result.add(new Object[] {
															classifierReference,
															jClass,
															jParentClass,
															nameSpace,
															_edge_classifierReferences });
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

		return _result;
	}

	public static final Object[] pattern_Inheritance_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Inheritance_22_3_expressionFBBBBBB(
			Inheritance _this, Match match,
			ClassifierReference classifierReference,
			org.emftext.language.java.classifiers.Class jClass,
			org.emftext.language.java.classifiers.Class jParentClass,
			NamespaceClassifierReference nameSpace) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				classifierReference, jClass, jParentClass, nameSpace);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Inheritance_22_4_expressionFBB(
			Inheritance _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Inheritance_22_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Inheritance_22_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Inheritance_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Inheritance_23_1_bindingFB(
			Inheritance _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_23_1_blackFBB(
			EClass __eClass, Inheritance _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Inheritance_23_1_bindingAndBlackFFB(
			Inheritance _this) {
		Object[] result_pattern_Inheritance_23_1_binding = pattern_Inheritance_23_1_bindingFB(_this);
		if (result_pattern_Inheritance_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Inheritance_23_1_binding[0];

			Object[] result_pattern_Inheritance_23_1_black = pattern_Inheritance_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Inheritance_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Inheritance_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Inheritance_23_2_blackFFFB(
			EMoflonEdge _edge_childClasses) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTParentClass = _edge_childClasses.getSrc();
		if (tmpTParentClass instanceof TClass) {
			TClass tParentClass = (TClass) tmpTParentClass;
			EObject tmpTClass = _edge_childClasses.getTrg();
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				if (!tClass.equals(tParentClass)) {
					if (tParentClass.getChildClasses().contains(tClass)) {
						for (TypeGraph pg : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tParentClass,
										TypeGraph.class, "classes")) {
							if (pg.getClasses().contains(tClass)) {
								_result.add(new Object[] { pg, tClass,
										tParentClass, _edge_childClasses });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Inheritance_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Inheritance_23_3_expressionFBBBBB(
			Inheritance _this, Match match, TypeGraph pg, TClass tClass,
			TClass tParentClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, pg, tClass,
				tParentClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Inheritance_23_4_expressionFBB(
			Inheritance _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Inheritance_23_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Inheritance_23_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Inheritance_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Inheritance_24_1_bindingFB(
			Inheritance _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_24_1_blackFBB(
			EClass __eClass, Inheritance _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Inheritance_24_1_bindingAndBlackFFB(
			Inheritance _this) {
		Object[] result_pattern_Inheritance_24_1_binding = pattern_Inheritance_24_1_bindingFB(_this);
		if (result_pattern_Inheritance_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Inheritance_24_1_binding[0];

			Object[] result_pattern_Inheritance_24_1_black = pattern_Inheritance_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Inheritance_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Inheritance_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Inheritance_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Inheritance_24_2_blackFFFB(
			EMoflonEdge _edge_parentClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTClass = _edge_parentClass.getSrc();
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			EObject tmpTParentClass = _edge_parentClass.getTrg();
			if (tmpTParentClass instanceof TClass) {
				TClass tParentClass = (TClass) tmpTParentClass;
				if (!tClass.equals(tParentClass)) {
					if (tParentClass.getChildClasses().contains(tClass)) {
						for (TypeGraph pg : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tClass,
										TypeGraph.class, "classes")) {
							if (pg.getClasses().contains(tParentClass)) {
								_result.add(new Object[] { pg, tClass,
										tParentClass, _edge_parentClass });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Inheritance_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Inheritance_24_3_expressionFBBBBB(
			Inheritance _this, Match match, TypeGraph pg, TClass tClass,
			TClass tParentClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, pg, tClass,
				tParentClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Inheritance_24_4_expressionFBB(
			Inheritance _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Inheritance_24_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Inheritance_24_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Inheritance_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //InheritanceImpl
