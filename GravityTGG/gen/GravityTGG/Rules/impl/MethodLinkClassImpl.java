/**
 */
package GravityTGG.Rules.impl;

import ExtendedJamopp.ExtendedClassMethod;
import ExtendedJamopp.ExtendedParameterList;

import GravityTGG.ClassMethodToTMethodDefinition;
import GravityTGG.ClassMethodToTMethodSignature;
import GravityTGG.ClassToTClass;
import GravityTGG.ExtendedParameterListToTMethodSignature;

import GravityTGG.Rules.MethodLinkClass;
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
import TypeGraphBasic.TMember;
import TypeGraphBasic.TMethodDefinition;
import TypeGraphBasic.TMethodSignature;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
// <-- [user defined imports]
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;

// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Link Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodLinkClassImpl extends AbstractRuleImpl implements
		MethodLinkClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodLinkClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodLinkClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ExtendedClassMethod jMethod,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedParameterList jParamList) {
		// initial bindings
		Object[] result1_black = MethodLinkClassImpl
				.pattern_MethodLinkClass_0_1_blackBBBBB(this, match, jMethod,
						jClass, jParamList);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodLinkClassImpl
				.pattern_MethodLinkClass_0_2_bindingAndBlackFBBBBB(this, match,
						jMethod, jClass, jParamList);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodLinkClassImpl.pattern_MethodLinkClass_0_3_expressionFBB(this,
				csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodLinkClassImpl
					.pattern_MethodLinkClass_0_4_blackBBBB(match, jMethod,
							jClass, jParamList);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			MethodLinkClassImpl.pattern_MethodLinkClass_0_4_greenBBBF(match,
					jMethod, jClass);
			// EMoflonEdge jClass__jMethod____members = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = MethodLinkClassImpl
					.pattern_MethodLinkClass_0_5_blackBBBB(match, jMethod,
							jClass, jParamList);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			MethodLinkClassImpl.pattern_MethodLinkClass_0_5_greenBBBBFF(match,
					jMethod, jClass, jParamList);
			// EMoflonEdge jParamList__jMethod____methods = (EMoflonEdge) result5_green[4];
			// EMoflonEdge jMethod__jParamList____parameter_list = (EMoflonEdge) result5_green[5];

			// register objects to match
			MethodLinkClassImpl.pattern_MethodLinkClass_0_6_expressionBBBBB(
					this, match, jMethod, jClass, jParamList);
			return MethodLinkClassImpl
					.pattern_MethodLinkClass_0_7_expressionF();
		} else {
			return MethodLinkClassImpl
					.pattern_MethodLinkClass_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodLinkClassImpl
				.pattern_MethodLinkClass_1_1_bindingAndBlackFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result1_bindingAndBlack[0];
		ExtendedClassMethod jMethod = (ExtendedClassMethod) result1_bindingAndBlack[1];
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[2];
		ClassMethodToTMethodSignature jMethodToTMethodSignature = (ClassMethodToTMethodSignature) result1_bindingAndBlack[3];
		ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result1_bindingAndBlack[4];
		org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result1_bindingAndBlack[5];
		TClass tClass = (TClass) result1_bindingAndBlack[6];
		ClassToTClass jClassToTClass = (ClassToTClass) result1_bindingAndBlack[7];
		ExtendedParameterList jParamList = (ExtendedParameterList) result1_bindingAndBlack[8];
		ExtendedParameterListToTMethodSignature jParamListToTMethodSignature = (ExtendedParameterListToTMethodSignature) result1_bindingAndBlack[9];
		// CSP csp = (CSP) result1_bindingAndBlack[10];
		MethodLinkClassImpl.pattern_MethodLinkClass_1_1_greenBBB(
				tMethodDefinition, tMethodSignature, tClass);

		// collect translated elements
		Object[] result2_green = MethodLinkClassImpl
				.pattern_MethodLinkClass_1_2_greenF();
		if (result2_green == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodLinkClassImpl
				.pattern_MethodLinkClass_1_3_blackBBBBBBBBBBB(ruleresult,
						tMethodDefinition, jMethod, tMethodSignature,
						jMethodToTMethodSignature, jMethodToTMethodDefinition,
						jClass, tClass, jClassToTClass, jParamList,
						jParamListToTMethodSignature);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		MethodLinkClassImpl.pattern_MethodLinkClass_1_3_greenBBBBBBFFF(
				ruleresult, tMethodDefinition, jMethod, tMethodSignature,
				jClass, tClass);
		// EMoflonEdge jClass__jMethod____members = (EMoflonEdge) result3_green[6];
		// EMoflonEdge tClass__tMethodDefinition____defines = (EMoflonEdge) result3_green[7];
		// EMoflonEdge tClass__tMethodSignature____signature = (EMoflonEdge) result3_green[8];

		// perform postprocessing story node is empty
		// register objects
		MethodLinkClassImpl.pattern_MethodLinkClass_1_5_expressionBBBBBBBBBBBB(
				this, ruleresult, tMethodDefinition, jMethod, tMethodSignature,
				jMethodToTMethodSignature, jMethodToTMethodDefinition, jClass,
				tClass, jClassToTClass, jParamList,
				jParamListToTMethodSignature);
		return MethodLinkClassImpl
				.pattern_MethodLinkClass_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodLinkClassImpl
				.pattern_MethodLinkClass_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodLinkClassImpl
				.pattern_MethodLinkClass_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodLinkClassImpl
				.pattern_MethodLinkClass_2_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		ExtendedClassMethod jMethod = (ExtendedClassMethod) result2_binding[0];
		org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result2_binding[1];
		ExtendedParameterList jParamList = (ExtendedParameterList) result2_binding[2];
		for (Object[] result2_black : MethodLinkClassImpl
				.pattern_MethodLinkClass_2_2_blackFBFFFBFFBFB(jMethod, jClass,
						jParamList, match)) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_black[0];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[2];
			ClassMethodToTMethodSignature jMethodToTMethodSignature = (ClassMethodToTMethodSignature) result2_black[3];
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result2_black[4];
			TClass tClass = (TClass) result2_black[6];
			ClassToTClass jClassToTClass = (ClassToTClass) result2_black[7];
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature = (ExtendedParameterListToTMethodSignature) result2_black[9];
			// ForEach find context
			for (Object[] result3_black : MethodLinkClassImpl
					.pattern_MethodLinkClass_2_3_blackBBBBBBBBBB(
							tMethodDefinition, jMethod, tMethodSignature,
							jMethodToTMethodSignature,
							jMethodToTMethodDefinition, jClass, tClass,
							jClassToTClass, jParamList,
							jParamListToTMethodSignature)) {
				Object[] result3_green = MethodLinkClassImpl
						.pattern_MethodLinkClass_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFF(
								tMethodDefinition, jMethod, tMethodSignature,
								jMethodToTMethodSignature,
								jMethodToTMethodDefinition, jClass, tClass,
								jClassToTClass, jParamList,
								jParamListToTMethodSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge tMethodSignature__tMethodDefinition____definitions = (EMoflonEdge) result3_green[11];
				// EMoflonEdge tMethodDefinition__tMethodSignature____signature = (EMoflonEdge) result3_green[12];
				// EMoflonEdge jMethodToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge jMethodToTMethodSignature__jMethod____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge jMethodToTMethodDefinition__jMethod____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge jMethodToTMethodDefinition__tMethodDefinition____target = (EMoflonEdge) result3_green[16];
				// EMoflonEdge jClass__jMethod____members = (EMoflonEdge) result3_green[17];
				// EMoflonEdge jClassToTClass__jClass____source = (EMoflonEdge) result3_green[18];
				// EMoflonEdge jClassToTClass__tClass____target = (EMoflonEdge) result3_green[19];
				// EMoflonEdge jParamList__jMethod____methods = (EMoflonEdge) result3_green[20];
				// EMoflonEdge jMethod__jParamList____parameter_list = (EMoflonEdge) result3_green[21];
				// EMoflonEdge jParamListToTMethodSignature__jParamList____source = (EMoflonEdge) result3_green[22];
				// EMoflonEdge jParamListToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[23];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodLinkClassImpl
						.pattern_MethodLinkClass_2_4_bindingAndBlackFBBBBBBBBBBBB(
								this, isApplicableMatch, tMethodDefinition,
								jMethod, tMethodSignature,
								jMethodToTMethodSignature,
								jMethodToTMethodDefinition, jClass, tClass,
								jClassToTClass, jParamList,
								jParamListToTMethodSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodLinkClassImpl
						.pattern_MethodLinkClass_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = MethodLinkClassImpl
							.pattern_MethodLinkClass_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					MethodLinkClassImpl.pattern_MethodLinkClass_2_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodLinkClassImpl
				.pattern_MethodLinkClass_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			ExtendedClassMethod jMethod,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedParameterList jParamList) {
		match.registerObject("jMethod", jMethod);
		match.registerObject("jClass", jClass);
		match.registerObject("jParamList", jParamList);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			ExtendedClassMethod jMethod,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedParameterList jParamList) {// Create CSP
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
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch
				.registerObject("tMethodDefinition", tMethodDefinition);
		isApplicableMatch.registerObject("jMethod", jMethod);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("jMethodToTMethodSignature",
				jMethodToTMethodSignature);
		isApplicableMatch.registerObject("jMethodToTMethodDefinition",
				jMethodToTMethodDefinition);
		isApplicableMatch.registerObject("jClass", jClass);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("jClassToTClass", jClassToTClass);
		isApplicableMatch.registerObject("jParamList", jParamList);
		isApplicableMatch.registerObject("jParamListToTMethodSignature",
				jParamListToTMethodSignature);
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
			EObject tMethodDefinition, EObject jMethod,
			EObject tMethodSignature, EObject jMethodToTMethodSignature,
			EObject jMethodToTMethodDefinition, EObject jClass, EObject tClass,
			EObject jClassToTClass, EObject jParamList,
			EObject jParamListToTMethodSignature) {
		ruleresult.registerObject("tMethodDefinition", tMethodDefinition);
		ruleresult.registerObject("jMethod", jMethod);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("jMethodToTMethodSignature",
				jMethodToTMethodSignature);
		ruleresult.registerObject("jMethodToTMethodDefinition",
				jMethodToTMethodDefinition);
		ruleresult.registerObject("jClass", jClass);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("jClassToTClass", jClassToTClass);
		ruleresult.registerObject("jParamList", jParamList);
		ruleresult.registerObject("jParamListToTMethodSignature",
				jParamListToTMethodSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match,
			TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TClass tClass) {
		// initial bindings
		Object[] result1_black = MethodLinkClassImpl
				.pattern_MethodLinkClass_10_1_blackBBBBB(this, match,
						tMethodDefinition, tMethodSignature, tClass);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodLinkClassImpl
				.pattern_MethodLinkClass_10_2_bindingAndBlackFBBBBB(this,
						match, tMethodDefinition, tMethodSignature, tClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodLinkClassImpl.pattern_MethodLinkClass_10_3_expressionFBB(
				this, csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodLinkClassImpl
					.pattern_MethodLinkClass_10_4_blackBBBB(match,
							tMethodDefinition, tMethodSignature, tClass);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			MethodLinkClassImpl.pattern_MethodLinkClass_10_4_greenBBBBFF(match,
					tMethodDefinition, tMethodSignature, tClass);
			// EMoflonEdge tClass__tMethodDefinition____defines = (EMoflonEdge) result4_green[4];
			// EMoflonEdge tClass__tMethodSignature____signature = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = MethodLinkClassImpl
					.pattern_MethodLinkClass_10_5_blackBBBB(match,
							tMethodDefinition, tMethodSignature, tClass);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			MethodLinkClassImpl.pattern_MethodLinkClass_10_5_greenBBBBFF(match,
					tMethodDefinition, tMethodSignature, tClass);
			// EMoflonEdge tMethodSignature__tMethodDefinition____definitions = (EMoflonEdge) result5_green[4];
			// EMoflonEdge tMethodDefinition__tMethodSignature____signature = (EMoflonEdge) result5_green[5];

			// register objects to match
			MethodLinkClassImpl.pattern_MethodLinkClass_10_6_expressionBBBBB(
					this, match, tMethodDefinition, tMethodSignature, tClass);
			return MethodLinkClassImpl
					.pattern_MethodLinkClass_10_7_expressionF();
		} else {
			return MethodLinkClassImpl
					.pattern_MethodLinkClass_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodLinkClassImpl
				.pattern_MethodLinkClass_11_1_bindingAndBlackFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result1_bindingAndBlack[0];
		ExtendedClassMethod jMethod = (ExtendedClassMethod) result1_bindingAndBlack[1];
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[2];
		ClassMethodToTMethodSignature jMethodToTMethodSignature = (ClassMethodToTMethodSignature) result1_bindingAndBlack[3];
		ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result1_bindingAndBlack[4];
		org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result1_bindingAndBlack[5];
		TClass tClass = (TClass) result1_bindingAndBlack[6];
		ClassToTClass jClassToTClass = (ClassToTClass) result1_bindingAndBlack[7];
		ExtendedParameterList jParamList = (ExtendedParameterList) result1_bindingAndBlack[8];
		ExtendedParameterListToTMethodSignature jParamListToTMethodSignature = (ExtendedParameterListToTMethodSignature) result1_bindingAndBlack[9];
		// CSP csp = (CSP) result1_bindingAndBlack[10];
		MethodLinkClassImpl.pattern_MethodLinkClass_11_1_greenBB(jMethod,
				jClass);

		// collect translated elements
		Object[] result2_green = MethodLinkClassImpl
				.pattern_MethodLinkClass_11_2_greenF();
		if (result2_green == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodLinkClassImpl
				.pattern_MethodLinkClass_11_3_blackBBBBBBBBBBB(ruleresult,
						tMethodDefinition, jMethod, tMethodSignature,
						jMethodToTMethodSignature, jMethodToTMethodDefinition,
						jClass, tClass, jClassToTClass, jParamList,
						jParamListToTMethodSignature);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		MethodLinkClassImpl.pattern_MethodLinkClass_11_3_greenBBBBBBFFF(
				ruleresult, tMethodDefinition, jMethod, tMethodSignature,
				jClass, tClass);
		// EMoflonEdge jClass__jMethod____members = (EMoflonEdge) result3_green[6];
		// EMoflonEdge tClass__tMethodDefinition____defines = (EMoflonEdge) result3_green[7];
		// EMoflonEdge tClass__tMethodSignature____signature = (EMoflonEdge) result3_green[8];

		// perform postprocessing story node is empty
		// register objects
		MethodLinkClassImpl
				.pattern_MethodLinkClass_11_5_expressionBBBBBBBBBBBB(this,
						ruleresult, tMethodDefinition, jMethod,
						tMethodSignature, jMethodToTMethodSignature,
						jMethodToTMethodDefinition, jClass, tClass,
						jClassToTClass, jParamList,
						jParamListToTMethodSignature);
		return MethodLinkClassImpl
				.pattern_MethodLinkClass_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodLinkClassImpl
				.pattern_MethodLinkClass_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodLinkClassImpl
				.pattern_MethodLinkClass_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodLinkClassImpl
				.pattern_MethodLinkClass_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_binding[0];
		TMethodSignature tMethodSignature = (TMethodSignature) result2_binding[1];
		TClass tClass = (TClass) result2_binding[2];
		for (Object[] result2_black : MethodLinkClassImpl
				.pattern_MethodLinkClass_12_2_blackBFBFFFBFFFB(
						tMethodDefinition, tMethodSignature, tClass, match)) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result2_black[1];
			ClassMethodToTMethodSignature jMethodToTMethodSignature = (ClassMethodToTMethodSignature) result2_black[3];
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result2_black[4];
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result2_black[5];
			ClassToTClass jClassToTClass = (ClassToTClass) result2_black[7];
			ExtendedParameterList jParamList = (ExtendedParameterList) result2_black[8];
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature = (ExtendedParameterListToTMethodSignature) result2_black[9];
			// ForEach find context
			for (Object[] result3_black : MethodLinkClassImpl
					.pattern_MethodLinkClass_12_3_blackBBBBBBBBBB(
							tMethodDefinition, jMethod, tMethodSignature,
							jMethodToTMethodSignature,
							jMethodToTMethodDefinition, jClass, tClass,
							jClassToTClass, jParamList,
							jParamListToTMethodSignature)) {
				Object[] result3_green = MethodLinkClassImpl
						.pattern_MethodLinkClass_12_3_greenBBBBBBBBBBFFFFFFFFFFFFFFF(
								tMethodDefinition, jMethod, tMethodSignature,
								jMethodToTMethodSignature,
								jMethodToTMethodDefinition, jClass, tClass,
								jClassToTClass, jParamList,
								jParamListToTMethodSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge tMethodSignature__tMethodDefinition____definitions = (EMoflonEdge) result3_green[11];
				// EMoflonEdge tMethodDefinition__tMethodSignature____signature = (EMoflonEdge) result3_green[12];
				// EMoflonEdge jMethodToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge jMethodToTMethodSignature__jMethod____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge jMethodToTMethodDefinition__jMethod____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge jMethodToTMethodDefinition__tMethodDefinition____target = (EMoflonEdge) result3_green[16];
				// EMoflonEdge tClass__tMethodDefinition____defines = (EMoflonEdge) result3_green[17];
				// EMoflonEdge tClass__tMethodSignature____signature = (EMoflonEdge) result3_green[18];
				// EMoflonEdge jClassToTClass__jClass____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge jClassToTClass__tClass____target = (EMoflonEdge) result3_green[20];
				// EMoflonEdge jParamList__jMethod____methods = (EMoflonEdge) result3_green[21];
				// EMoflonEdge jMethod__jParamList____parameter_list = (EMoflonEdge) result3_green[22];
				// EMoflonEdge jParamListToTMethodSignature__jParamList____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge jParamListToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[24];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodLinkClassImpl
						.pattern_MethodLinkClass_12_4_bindingAndBlackFBBBBBBBBBBBB(
								this, isApplicableMatch, tMethodDefinition,
								jMethod, tMethodSignature,
								jMethodToTMethodSignature,
								jMethodToTMethodDefinition, jClass, tClass,
								jClassToTClass, jParamList,
								jParamListToTMethodSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodLinkClassImpl
						.pattern_MethodLinkClass_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = MethodLinkClassImpl
							.pattern_MethodLinkClass_12_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					MethodLinkClassImpl.pattern_MethodLinkClass_12_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodLinkClassImpl
				.pattern_MethodLinkClass_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TClass tClass) {
		match.registerObject("tMethodDefinition", tMethodDefinition);
		match.registerObject("tMethodSignature", tMethodSignature);
		match.registerObject("tClass", tClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TClass tClass) {// Create CSP
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
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch
				.registerObject("tMethodDefinition", tMethodDefinition);
		isApplicableMatch.registerObject("jMethod", jMethod);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("jMethodToTMethodSignature",
				jMethodToTMethodSignature);
		isApplicableMatch.registerObject("jMethodToTMethodDefinition",
				jMethodToTMethodDefinition);
		isApplicableMatch.registerObject("jClass", jClass);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("jClassToTClass", jClassToTClass);
		isApplicableMatch.registerObject("jParamList", jParamList);
		isApplicableMatch.registerObject("jParamListToTMethodSignature",
				jParamListToTMethodSignature);
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
			EObject tMethodDefinition, EObject jMethod,
			EObject tMethodSignature, EObject jMethodToTMethodSignature,
			EObject jMethodToTMethodDefinition, EObject jClass, EObject tClass,
			EObject jClassToTClass, EObject jParamList,
			EObject jParamListToTMethodSignature) {
		ruleresult.registerObject("tMethodDefinition", tMethodDefinition);
		ruleresult.registerObject("jMethod", jMethod);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("jMethodToTMethodSignature",
				jMethodToTMethodSignature);
		ruleresult.registerObject("jMethodToTMethodDefinition",
				jMethodToTMethodDefinition);
		ruleresult.registerObject("jClass", jClass);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("jClassToTClass", jClassToTClass);
		ruleresult.registerObject("jParamList", jParamList);
		ruleresult.registerObject("jParamListToTMethodSignature",
				jParamListToTMethodSignature);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_9(
			EMoflonEdge _edge_members) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodLinkClassImpl
				.pattern_MethodLinkClass_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodLinkClassImpl
				.pattern_MethodLinkClass_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodLinkClassImpl
				.pattern_MethodLinkClass_20_2_blackFFFB(_edge_members)) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result2_black[0];
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result2_black[1];
			ExtendedParameterList jParamList = (ExtendedParameterList) result2_black[2];
			Object[] result2_green = MethodLinkClassImpl
					.pattern_MethodLinkClass_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodLinkClassImpl
					.pattern_MethodLinkClass_20_3_expressionFBBBBB(this, match,
							jMethod, jClass, jParamList)) {
				// Ensure that the correct types of elements are matched
				if (MethodLinkClassImpl
						.pattern_MethodLinkClass_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = MethodLinkClassImpl
							.pattern_MethodLinkClass_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					MethodLinkClassImpl.pattern_MethodLinkClass_20_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return MethodLinkClassImpl
				.pattern_MethodLinkClass_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_14(
			EMoflonEdge _edge_defines) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodLinkClassImpl
				.pattern_MethodLinkClass_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodLinkClassImpl
				.pattern_MethodLinkClass_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodLinkClassImpl
				.pattern_MethodLinkClass_21_2_blackFFFB(_edge_defines)) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_black[0];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[1];
			TClass tClass = (TClass) result2_black[2];
			Object[] result2_green = MethodLinkClassImpl
					.pattern_MethodLinkClass_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodLinkClassImpl
					.pattern_MethodLinkClass_21_3_expressionFBBBBB(this, match,
							tMethodDefinition, tMethodSignature, tClass)) {
				// Ensure that the correct types of elements are matched
				if (MethodLinkClassImpl
						.pattern_MethodLinkClass_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = MethodLinkClassImpl
							.pattern_MethodLinkClass_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					MethodLinkClassImpl.pattern_MethodLinkClass_21_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return MethodLinkClassImpl
				.pattern_MethodLinkClass_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_15(
			EMoflonEdge _edge_signature) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodLinkClassImpl
				.pattern_MethodLinkClass_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodLinkClassImpl
				.pattern_MethodLinkClass_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodLinkClassImpl
				.pattern_MethodLinkClass_22_2_blackFFFB(_edge_signature)) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_black[0];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[1];
			TClass tClass = (TClass) result2_black[2];
			Object[] result2_green = MethodLinkClassImpl
					.pattern_MethodLinkClass_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodLinkClassImpl
					.pattern_MethodLinkClass_22_3_expressionFBBBBB(this, match,
							tMethodDefinition, tMethodSignature, tClass)) {
				// Ensure that the correct types of elements are matched
				if (MethodLinkClassImpl
						.pattern_MethodLinkClass_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = MethodLinkClassImpl
							.pattern_MethodLinkClass_22_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					MethodLinkClassImpl.pattern_MethodLinkClass_22_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return MethodLinkClassImpl
				.pattern_MethodLinkClass_22_6_expressionFB(__result);
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
		case RulesPackage.METHOD_LINK_CLASS___IS_APPROPRIATE_FWD__MATCH_EXTENDEDCLASSMETHOD_CLASS_EXTENDEDPARAMETERLIST:
			return isAppropriate_FWD((Match) arguments.get(0),
					(ExtendedClassMethod) arguments.get(1),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(2), (ExtendedParameterList) arguments.get(3));
		case RulesPackage.METHOD_LINK_CLASS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_LINK_CLASS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_LINK_CLASS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDCLASSMETHOD_CLASS_EXTENDEDPARAMETERLIST:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(ExtendedClassMethod) arguments.get(1),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(2), (ExtendedParameterList) arguments.get(3));
			return null;
		case RulesPackage.METHOD_LINK_CLASS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDCLASSMETHOD_CLASS_EXTENDEDPARAMETERLIST:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(ExtendedClassMethod) arguments.get(1),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(2), (ExtendedParameterList) arguments.get(3));
		case RulesPackage.METHOD_LINK_CLASS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_LINK_CLASS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TMETHODDEFINITION_EXTENDEDCLASSMETHOD_TMETHODSIGNATURE_CLASSMETHODTOTMETHODSIGNATURE_CLASSMETHODTOTMETHODDEFINITION_CLASS_TCLASS_CLASSTOTCLASS_EXTENDEDPARAMETERLIST_EXTENDEDPARAMETERLISTTOTMETHODSIGNATURE:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(TMethodDefinition) arguments.get(1),
					(ExtendedClassMethod) arguments.get(2),
					(TMethodSignature) arguments.get(3),
					(ClassMethodToTMethodSignature) arguments.get(4),
					(ClassMethodToTMethodDefinition) arguments.get(5),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(6), (TClass) arguments.get(7),
					(ClassToTClass) arguments.get(8),
					(ExtendedParameterList) arguments.get(9),
					(ExtendedParameterListToTMethodSignature) arguments.get(10));
		case RulesPackage.METHOD_LINK_CLASS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_LINK_CLASS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.METHOD_LINK_CLASS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_LINK_CLASS___IS_APPROPRIATE_BWD__MATCH_TMETHODDEFINITION_TMETHODSIGNATURE_TCLASS:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TMethodDefinition) arguments.get(1),
					(TMethodSignature) arguments.get(2),
					(TClass) arguments.get(3));
		case RulesPackage.METHOD_LINK_CLASS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_LINK_CLASS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_LINK_CLASS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODDEFINITION_TMETHODSIGNATURE_TCLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TMethodDefinition) arguments.get(1),
					(TMethodSignature) arguments.get(2),
					(TClass) arguments.get(3));
			return null;
		case RulesPackage.METHOD_LINK_CLASS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODDEFINITION_TMETHODSIGNATURE_TCLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TMethodDefinition) arguments.get(1),
					(TMethodSignature) arguments.get(2),
					(TClass) arguments.get(3));
		case RulesPackage.METHOD_LINK_CLASS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_LINK_CLASS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMETHODDEFINITION_EXTENDEDCLASSMETHOD_TMETHODSIGNATURE_CLASSMETHODTOTMETHODSIGNATURE_CLASSMETHODTOTMETHODDEFINITION_CLASS_TCLASS_CLASSTOTCLASS_EXTENDEDPARAMETERLIST_EXTENDEDPARAMETERLISTTOTMETHODSIGNATURE:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(TMethodDefinition) arguments.get(1),
					(ExtendedClassMethod) arguments.get(2),
					(TMethodSignature) arguments.get(3),
					(ClassMethodToTMethodSignature) arguments.get(4),
					(ClassMethodToTMethodDefinition) arguments.get(5),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(6), (TClass) arguments.get(7),
					(ClassToTClass) arguments.get(8),
					(ExtendedParameterList) arguments.get(9),
					(ExtendedParameterListToTMethodSignature) arguments.get(10));
		case RulesPackage.METHOD_LINK_CLASS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_LINK_CLASS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.METHOD_LINK_CLASS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_LINK_CLASS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_9__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_9((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.METHOD_LINK_CLASS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_14__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_14((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.METHOD_LINK_CLASS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_15__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_15((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.METHOD_LINK_CLASS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_LINK_CLASS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodLinkClass_0_1_blackBBBBB(
			MethodLinkClass _this, Match match, ExtendedClassMethod jMethod,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedParameterList jParamList) {
		return new Object[] { _this, match, jMethod, jClass, jParamList };
	}

	public static final Object[] pattern_MethodLinkClass_0_2_bindingFBBBBB(
			MethodLinkClass _this, Match match, ExtendedClassMethod jMethod,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedParameterList jParamList) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, jMethod,
				jClass, jParamList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jMethod, jClass,
					jParamList };
		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodLinkClass_0_2_bindingAndBlackFBBBBB(
			MethodLinkClass _this, Match match, ExtendedClassMethod jMethod,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedParameterList jParamList) {
		Object[] result_pattern_MethodLinkClass_0_2_binding = pattern_MethodLinkClass_0_2_bindingFBBBBB(
				_this, match, jMethod, jClass, jParamList);
		if (result_pattern_MethodLinkClass_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_MethodLinkClass_0_2_binding[0];

			Object[] result_pattern_MethodLinkClass_0_2_black = pattern_MethodLinkClass_0_2_blackB(csp);
			if (result_pattern_MethodLinkClass_0_2_black != null) {

				return new Object[] { csp, _this, match, jMethod, jClass,
						jParamList };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodLinkClass_0_3_expressionFBB(
			MethodLinkClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodLinkClass_0_4_blackBBBB(
			Match match, ExtendedClassMethod jMethod,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedParameterList jParamList) {
		return new Object[] { match, jMethod, jClass, jParamList };
	}

	public static final Object[] pattern_MethodLinkClass_0_4_greenBBBF(
			Match match, ExtendedClassMethod jMethod,
			org.emftext.language.java.classifiers.Class jClass) {
		EMoflonEdge jClass__jMethod____members = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jClass__jMethod____members_name_prime = "members";
		jClass__jMethod____members.setSrc(jClass);
		jClass__jMethod____members.setTrg(jMethod);
		match.getToBeTranslatedEdges().add(jClass__jMethod____members);
		jClass__jMethod____members
				.setName(jClass__jMethod____members_name_prime);
		return new Object[] { match, jMethod, jClass,
				jClass__jMethod____members };
	}

	public static final Object[] pattern_MethodLinkClass_0_5_blackBBBB(
			Match match, ExtendedClassMethod jMethod,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedParameterList jParamList) {
		return new Object[] { match, jMethod, jClass, jParamList };
	}

	public static final Object[] pattern_MethodLinkClass_0_5_greenBBBBFF(
			Match match, ExtendedClassMethod jMethod,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedParameterList jParamList) {
		EMoflonEdge jParamList__jMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__jParamList____parameter_list = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(jMethod);
		match.getContextNodes().add(jClass);
		match.getContextNodes().add(jParamList);
		String jParamList__jMethod____methods_name_prime = "methods";
		String jMethod__jParamList____parameter_list_name_prime = "parameter_list";
		jParamList__jMethod____methods.setSrc(jParamList);
		jParamList__jMethod____methods.setTrg(jMethod);
		match.getContextEdges().add(jParamList__jMethod____methods);
		jMethod__jParamList____parameter_list.setSrc(jMethod);
		jMethod__jParamList____parameter_list.setTrg(jParamList);
		match.getContextEdges().add(jMethod__jParamList____parameter_list);
		jParamList__jMethod____methods
				.setName(jParamList__jMethod____methods_name_prime);
		jMethod__jParamList____parameter_list
				.setName(jMethod__jParamList____parameter_list_name_prime);
		return new Object[] { match, jMethod, jClass, jParamList,
				jParamList__jMethod____methods,
				jMethod__jParamList____parameter_list };
	}

	public static final void pattern_MethodLinkClass_0_6_expressionBBBBB(
			MethodLinkClass _this, Match match, ExtendedClassMethod jMethod,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedParameterList jParamList) {
		_this.registerObjectsToMatch_FWD(match, jMethod, jClass, jParamList);

	}

	public static final boolean pattern_MethodLinkClass_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodLinkClass_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodLinkClass_1_1_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("tMethodDefinition");
		EObject _localVariable_1 = isApplicableMatch.getObject("jMethod");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("tMethodSignature");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("jMethodToTMethodSignature");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("jMethodToTMethodDefinition");
		EObject _localVariable_5 = isApplicableMatch.getObject("jClass");
		EObject _localVariable_6 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_7 = isApplicableMatch
				.getObject("jClassToTClass");
		EObject _localVariable_8 = isApplicableMatch.getObject("jParamList");
		EObject _localVariable_9 = isApplicableMatch
				.getObject("jParamListToTMethodSignature");
		EObject tmpTMethodDefinition = _localVariable_0;
		EObject tmpJMethod = _localVariable_1;
		EObject tmpTMethodSignature = _localVariable_2;
		EObject tmpJMethodToTMethodSignature = _localVariable_3;
		EObject tmpJMethodToTMethodDefinition = _localVariable_4;
		EObject tmpJClass = _localVariable_5;
		EObject tmpTClass = _localVariable_6;
		EObject tmpJClassToTClass = _localVariable_7;
		EObject tmpJParamList = _localVariable_8;
		EObject tmpJParamListToTMethodSignature = _localVariable_9;
		if (tmpTMethodDefinition instanceof TMethodDefinition) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
			if (tmpJMethod instanceof ExtendedClassMethod) {
				ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
				if (tmpTMethodSignature instanceof TMethodSignature) {
					TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
					if (tmpJMethodToTMethodSignature instanceof ClassMethodToTMethodSignature) {
						ClassMethodToTMethodSignature jMethodToTMethodSignature = (ClassMethodToTMethodSignature) tmpJMethodToTMethodSignature;
						if (tmpJMethodToTMethodDefinition instanceof ClassMethodToTMethodDefinition) {
							ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) tmpJMethodToTMethodDefinition;
							if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
								org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
								if (tmpTClass instanceof TClass) {
									TClass tClass = (TClass) tmpTClass;
									if (tmpJClassToTClass instanceof ClassToTClass) {
										ClassToTClass jClassToTClass = (ClassToTClass) tmpJClassToTClass;
										if (tmpJParamList instanceof ExtendedParameterList) {
											ExtendedParameterList jParamList = (ExtendedParameterList) tmpJParamList;
											if (tmpJParamListToTMethodSignature instanceof ExtendedParameterListToTMethodSignature) {
												ExtendedParameterListToTMethodSignature jParamListToTMethodSignature = (ExtendedParameterListToTMethodSignature) tmpJParamListToTMethodSignature;
												return new Object[] {
														tMethodDefinition,
														jMethod,
														tMethodSignature,
														jMethodToTMethodSignature,
														jMethodToTMethodDefinition,
														jClass,
														tClass,
														jClassToTClass,
														jParamList,
														jParamListToTMethodSignature,
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
		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_1_1_blackBBBBBBBBBBFBB(
			TMethodDefinition tMethodDefinition,
			ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			org.emftext.language.java.classifiers.Class jClass,
			TClass tClass,
			ClassToTClass jClassToTClass,
			ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature,
			MethodLinkClass _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tMethodDefinition, jMethod,
						tMethodSignature, jMethodToTMethodSignature,
						jMethodToTMethodDefinition, jClass, tClass,
						jClassToTClass, jParamList,
						jParamListToTMethodSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_1_1_bindingAndBlackFFFFFFFFFFFBB(
			MethodLinkClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodLinkClass_1_1_binding = pattern_MethodLinkClass_1_1_bindingFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_MethodLinkClass_1_1_binding != null) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result_pattern_MethodLinkClass_1_1_binding[0];
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result_pattern_MethodLinkClass_1_1_binding[1];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_MethodLinkClass_1_1_binding[2];
			ClassMethodToTMethodSignature jMethodToTMethodSignature = (ClassMethodToTMethodSignature) result_pattern_MethodLinkClass_1_1_binding[3];
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result_pattern_MethodLinkClass_1_1_binding[4];
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result_pattern_MethodLinkClass_1_1_binding[5];
			TClass tClass = (TClass) result_pattern_MethodLinkClass_1_1_binding[6];
			ClassToTClass jClassToTClass = (ClassToTClass) result_pattern_MethodLinkClass_1_1_binding[7];
			ExtendedParameterList jParamList = (ExtendedParameterList) result_pattern_MethodLinkClass_1_1_binding[8];
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature = (ExtendedParameterListToTMethodSignature) result_pattern_MethodLinkClass_1_1_binding[9];

			Object[] result_pattern_MethodLinkClass_1_1_black = pattern_MethodLinkClass_1_1_blackBBBBBBBBBBFBB(
					tMethodDefinition, jMethod, tMethodSignature,
					jMethodToTMethodSignature, jMethodToTMethodDefinition,
					jClass, tClass, jClassToTClass, jParamList,
					jParamListToTMethodSignature, _this, isApplicableMatch);
			if (result_pattern_MethodLinkClass_1_1_black != null) {
				CSP csp = (CSP) result_pattern_MethodLinkClass_1_1_black[10];

				return new Object[] { tMethodDefinition, jMethod,
						tMethodSignature, jMethodToTMethodSignature,
						jMethodToTMethodDefinition, jClass, tClass,
						jClassToTClass, jParamList,
						jParamListToTMethodSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_1_1_greenBBB(
			TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TClass tClass) {
		tClass.getDefines().add(tMethodDefinition);
		tClass.getSignature().add(tMethodSignature);
		return new Object[] { tMethodDefinition, tMethodSignature, tClass };
	}

	public static final Object[] pattern_MethodLinkClass_1_2_greenF() {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_MethodLinkClass_1_3_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tMethodDefinition,
			EObject jMethod, EObject tMethodSignature,
			EObject jMethodToTMethodSignature,
			EObject jMethodToTMethodDefinition, EObject jClass, EObject tClass,
			EObject jClassToTClass, EObject jParamList,
			EObject jParamListToTMethodSignature) {
		if (!tMethodDefinition.equals(tMethodSignature)) {
			if (!jMethod.equals(tMethodDefinition)) {
				if (!jMethod.equals(tMethodSignature)) {
					if (!jMethod.equals(jMethodToTMethodSignature)) {
						if (!jMethod.equals(jMethodToTMethodDefinition)) {
							if (!jMethod.equals(tClass)) {
								if (!jMethod.equals(jParamList)) {
									if (!jMethod
											.equals(jParamListToTMethodSignature)) {
										if (!jMethodToTMethodSignature
												.equals(tMethodDefinition)) {
											if (!jMethodToTMethodSignature
													.equals(tMethodSignature)) {
												if (!jMethodToTMethodSignature
														.equals(tClass)) {
													if (!jMethodToTMethodSignature
															.equals(jParamList)) {
														if (!jMethodToTMethodSignature
																.equals(jParamListToTMethodSignature)) {
															if (!jMethodToTMethodDefinition
																	.equals(tMethodDefinition)) {
																if (!jMethodToTMethodDefinition
																		.equals(tMethodSignature)) {
																	if (!jMethodToTMethodDefinition
																			.equals(jMethodToTMethodSignature)) {
																		if (!jMethodToTMethodDefinition
																				.equals(tClass)) {
																			if (!jMethodToTMethodDefinition
																					.equals(jParamList)) {
																				if (!jMethodToTMethodDefinition
																						.equals(jParamListToTMethodSignature)) {
																					if (!jClass
																							.equals(tMethodDefinition)) {
																						if (!jClass
																								.equals(jMethod)) {
																							if (!jClass
																									.equals(tMethodSignature)) {
																								if (!jClass
																										.equals(jMethodToTMethodSignature)) {
																									if (!jClass
																											.equals(jMethodToTMethodDefinition)) {
																										if (!jClass
																												.equals(tClass)) {
																											if (!jClass
																													.equals(jClassToTClass)) {
																												if (!jClass
																														.equals(jParamList)) {
																													if (!jClass
																															.equals(jParamListToTMethodSignature)) {
																														if (!tClass
																																.equals(tMethodDefinition)) {
																															if (!tClass
																																	.equals(tMethodSignature)) {
																																if (!jClassToTClass
																																		.equals(tMethodDefinition)) {
																																	if (!jClassToTClass
																																			.equals(jMethod)) {
																																		if (!jClassToTClass
																																				.equals(tMethodSignature)) {
																																			if (!jClassToTClass
																																					.equals(jMethodToTMethodSignature)) {
																																				if (!jClassToTClass
																																						.equals(jMethodToTMethodDefinition)) {
																																					if (!jClassToTClass
																																							.equals(tClass)) {
																																						if (!jClassToTClass
																																								.equals(jParamList)) {
																																							if (!jClassToTClass
																																									.equals(jParamListToTMethodSignature)) {
																																								if (!jParamList
																																										.equals(tMethodDefinition)) {
																																									if (!jParamList
																																											.equals(tMethodSignature)) {
																																										if (!jParamList
																																												.equals(tClass)) {
																																											if (!jParamList
																																													.equals(jParamListToTMethodSignature)) {
																																												if (!jParamListToTMethodSignature
																																														.equals(tMethodDefinition)) {
																																													if (!jParamListToTMethodSignature
																																															.equals(tMethodSignature)) {
																																														if (!jParamListToTMethodSignature
																																																.equals(tClass)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	tMethodDefinition,
																																																	jMethod,
																																																	tMethodSignature,
																																																	jMethodToTMethodSignature,
																																																	jMethodToTMethodDefinition,
																																																	jClass,
																																																	tClass,
																																																	jClassToTClass,
																																																	jParamList,
																																																	jParamListToTMethodSignature };
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

	public static final Object[] pattern_MethodLinkClass_1_3_greenBBBBBBFFF(
			PerformRuleResult ruleresult, EObject tMethodDefinition,
			EObject jMethod, EObject tMethodSignature, EObject jClass,
			EObject tClass) {
		EMoflonEdge jClass__jMethod____members = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tClass__tMethodDefinition____defines = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tClass__tMethodSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodLinkClass";
		String jClass__jMethod____members_name_prime = "members";
		String tClass__tMethodDefinition____defines_name_prime = "defines";
		String tClass__tMethodSignature____signature_name_prime = "signature";
		jClass__jMethod____members.setSrc(jClass);
		jClass__jMethod____members.setTrg(jMethod);
		ruleresult.getTranslatedEdges().add(jClass__jMethod____members);
		tClass__tMethodDefinition____defines.setSrc(tClass);
		tClass__tMethodDefinition____defines.setTrg(tMethodDefinition);
		ruleresult.getCreatedEdges().add(tClass__tMethodDefinition____defines);
		tClass__tMethodSignature____signature.setSrc(tClass);
		tClass__tMethodSignature____signature.setTrg(tMethodSignature);
		ruleresult.getCreatedEdges().add(tClass__tMethodSignature____signature);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jClass__jMethod____members
				.setName(jClass__jMethod____members_name_prime);
		tClass__tMethodDefinition____defines
				.setName(tClass__tMethodDefinition____defines_name_prime);
		tClass__tMethodSignature____signature
				.setName(tClass__tMethodSignature____signature_name_prime);
		return new Object[] { ruleresult, tMethodDefinition, jMethod,
				tMethodSignature, jClass, tClass, jClass__jMethod____members,
				tClass__tMethodDefinition____defines,
				tClass__tMethodSignature____signature };
	}

	public static final void pattern_MethodLinkClass_1_5_expressionBBBBBBBBBBBB(
			MethodLinkClass _this, PerformRuleResult ruleresult,
			EObject tMethodDefinition, EObject jMethod,
			EObject tMethodSignature, EObject jMethodToTMethodSignature,
			EObject jMethodToTMethodDefinition, EObject jClass, EObject tClass,
			EObject jClassToTClass, EObject jParamList,
			EObject jParamListToTMethodSignature) {
		_this.registerObjects_FWD(ruleresult, tMethodDefinition, jMethod,
				tMethodSignature, jMethodToTMethodSignature,
				jMethodToTMethodDefinition, jClass, tClass, jClassToTClass,
				jParamList, jParamListToTMethodSignature);

	}

	public static final PerformRuleResult pattern_MethodLinkClass_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodLinkClass_2_1_bindingFB(
			MethodLinkClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_2_1_blackFBB(
			EClass eClass, MethodLinkClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_2_1_bindingAndBlackFFB(
			MethodLinkClass _this) {
		Object[] result_pattern_MethodLinkClass_2_1_binding = pattern_MethodLinkClass_2_1_bindingFB(_this);
		if (result_pattern_MethodLinkClass_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodLinkClass_2_1_binding[0];

			Object[] result_pattern_MethodLinkClass_2_1_black = pattern_MethodLinkClass_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_MethodLinkClass_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodLinkClass_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodLinkClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodLinkClass_2_2_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("jMethod");
		EObject _localVariable_1 = match.getObject("jClass");
		EObject _localVariable_2 = match.getObject("jParamList");
		EObject tmpJMethod = _localVariable_0;
		EObject tmpJClass = _localVariable_1;
		EObject tmpJParamList = _localVariable_2;
		if (tmpJMethod instanceof ExtendedClassMethod) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
			if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
				org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
				if (tmpJParamList instanceof ExtendedParameterList) {
					ExtendedParameterList jParamList = (ExtendedParameterList) tmpJParamList;
					return new Object[] { jMethod, jClass, jParamList, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodLinkClass_2_2_blackFBFFFBFFBFB(
			ExtendedClassMethod jMethod,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedParameterList jParamList, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ClassMethodToTMethodSignature jMethodToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(jMethod,
						ClassMethodToTMethodSignature.class, "source")) {
			TMethodSignature tMethodSignature = jMethodToTMethodSignature
					.getTarget();
			if (tMethodSignature != null) {
				for (ClassMethodToTMethodDefinition jMethodToTMethodDefinition : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(jMethod,
								ClassMethodToTMethodDefinition.class, "source")) {
					TMethodDefinition tMethodDefinition = jMethodToTMethodDefinition
							.getTarget();
					if (tMethodDefinition != null) {
						for (ClassToTClass jClassToTClass : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(jClass,
										ClassToTClass.class, "source")) {
							TClass tClass = jClassToTClass.getTarget();
							if (tClass != null) {
								for (ExtendedParameterListToTMethodSignature jParamListToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(
												jParamList,
												ExtendedParameterListToTMethodSignature.class,
												"source")) {
									if (tMethodSignature
											.equals(jParamListToTMethodSignature
													.getTarget())) {
										_result.add(new Object[] {
												tMethodDefinition, jMethod,
												tMethodSignature,
												jMethodToTMethodSignature,
												jMethodToTMethodDefinition,
												jClass, tClass, jClassToTClass,
												jParamList,
												jParamListToTMethodSignature,
												match });
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

	public static final Iterable<Object[]> pattern_MethodLinkClass_2_3_blackBBBBBBBBBB(
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tMethodSignature.getDefinitions().contains(tMethodDefinition)) {
			if (tMethodSignature.equals(jMethodToTMethodSignature.getTarget())) {
				if (jMethod.equals(jMethodToTMethodSignature.getSource())) {
					if (jMethod.equals(jMethodToTMethodDefinition.getSource())) {
						if (tMethodDefinition.equals(jMethodToTMethodDefinition
								.getTarget())) {
							if (jClass.getMembers().contains(jMethod)) {
								if (jClass.equals(jClassToTClass.getSource())) {
									if (tClass.equals(jClassToTClass
											.getTarget())) {
										if (jParamList.getMethods().contains(
												jMethod)) {
											if (jParamList
													.equals(jParamListToTMethodSignature
															.getSource())) {
												if (tMethodSignature
														.equals(jParamListToTMethodSignature
																.getTarget())) {
													_result.add(new Object[] {
															tMethodDefinition,
															jMethod,
															tMethodSignature,
															jMethodToTMethodSignature,
															jMethodToTMethodDefinition,
															jClass, tClass,
															jClassToTClass,
															jParamList,
															jParamListToTMethodSignature });
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

	public static final Object[] pattern_MethodLinkClass_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFF(
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge tMethodSignature__tMethodDefinition____definitions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodDefinition__tMethodSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodSignature__tMethodSignature____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodSignature__jMethod____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodDefinition__jMethod____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodDefinition__tMethodDefinition____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClass__jMethod____members = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClassToTClass__jClass____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClassToTClass__tClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParamList__jMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__jParamList____parameter_list = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParamListToTMethodSignature__jParamList____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParamListToTMethodSignature__tMethodSignature____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tMethodSignature__tMethodDefinition____definitions_name_prime = "definitions";
		String tMethodDefinition__tMethodSignature____signature_name_prime = "signature";
		String jMethodToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String jMethodToTMethodSignature__jMethod____source_name_prime = "source";
		String jMethodToTMethodDefinition__jMethod____source_name_prime = "source";
		String jMethodToTMethodDefinition__tMethodDefinition____target_name_prime = "target";
		String jClass__jMethod____members_name_prime = "members";
		String jClassToTClass__jClass____source_name_prime = "source";
		String jClassToTClass__tClass____target_name_prime = "target";
		String jParamList__jMethod____methods_name_prime = "methods";
		String jMethod__jParamList____parameter_list_name_prime = "parameter_list";
		String jParamListToTMethodSignature__jParamList____source_name_prime = "source";
		String jParamListToTMethodSignature__tMethodSignature____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(jMethod);
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements()
				.add(jMethodToTMethodSignature);
		isApplicableMatch.getAllContextElements().add(
				jMethodToTMethodDefinition);
		isApplicableMatch.getAllContextElements().add(jClass);
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(jClassToTClass);
		isApplicableMatch.getAllContextElements().add(jParamList);
		isApplicableMatch.getAllContextElements().add(
				jParamListToTMethodSignature);
		tMethodSignature__tMethodDefinition____definitions
				.setSrc(tMethodSignature);
		tMethodSignature__tMethodDefinition____definitions
				.setTrg(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(
				tMethodSignature__tMethodDefinition____definitions);
		tMethodDefinition__tMethodSignature____signature
				.setSrc(tMethodDefinition);
		tMethodDefinition__tMethodSignature____signature
				.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(
				tMethodDefinition__tMethodSignature____signature);
		jMethodToTMethodSignature__tMethodSignature____target
				.setSrc(jMethodToTMethodSignature);
		jMethodToTMethodSignature__tMethodSignature____target
				.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(
				jMethodToTMethodSignature__tMethodSignature____target);
		jMethodToTMethodSignature__jMethod____source
				.setSrc(jMethodToTMethodSignature);
		jMethodToTMethodSignature__jMethod____source.setTrg(jMethod);
		isApplicableMatch.getAllContextElements().add(
				jMethodToTMethodSignature__jMethod____source);
		jMethodToTMethodDefinition__jMethod____source
				.setSrc(jMethodToTMethodDefinition);
		jMethodToTMethodDefinition__jMethod____source.setTrg(jMethod);
		isApplicableMatch.getAllContextElements().add(
				jMethodToTMethodDefinition__jMethod____source);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setSrc(jMethodToTMethodDefinition);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setTrg(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(
				jMethodToTMethodDefinition__tMethodDefinition____target);
		jClass__jMethod____members.setSrc(jClass);
		jClass__jMethod____members.setTrg(jMethod);
		isApplicableMatch.getAllContextElements().add(
				jClass__jMethod____members);
		jClassToTClass__jClass____source.setSrc(jClassToTClass);
		jClassToTClass__jClass____source.setTrg(jClass);
		isApplicableMatch.getAllContextElements().add(
				jClassToTClass__jClass____source);
		jClassToTClass__tClass____target.setSrc(jClassToTClass);
		jClassToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(
				jClassToTClass__tClass____target);
		jParamList__jMethod____methods.setSrc(jParamList);
		jParamList__jMethod____methods.setTrg(jMethod);
		isApplicableMatch.getAllContextElements().add(
				jParamList__jMethod____methods);
		jMethod__jParamList____parameter_list.setSrc(jMethod);
		jMethod__jParamList____parameter_list.setTrg(jParamList);
		isApplicableMatch.getAllContextElements().add(
				jMethod__jParamList____parameter_list);
		jParamListToTMethodSignature__jParamList____source
				.setSrc(jParamListToTMethodSignature);
		jParamListToTMethodSignature__jParamList____source.setTrg(jParamList);
		isApplicableMatch.getAllContextElements().add(
				jParamListToTMethodSignature__jParamList____source);
		jParamListToTMethodSignature__tMethodSignature____target
				.setSrc(jParamListToTMethodSignature);
		jParamListToTMethodSignature__tMethodSignature____target
				.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(
				jParamListToTMethodSignature__tMethodSignature____target);
		tMethodSignature__tMethodDefinition____definitions
				.setName(tMethodSignature__tMethodDefinition____definitions_name_prime);
		tMethodDefinition__tMethodSignature____signature
				.setName(tMethodDefinition__tMethodSignature____signature_name_prime);
		jMethodToTMethodSignature__tMethodSignature____target
				.setName(jMethodToTMethodSignature__tMethodSignature____target_name_prime);
		jMethodToTMethodSignature__jMethod____source
				.setName(jMethodToTMethodSignature__jMethod____source_name_prime);
		jMethodToTMethodDefinition__jMethod____source
				.setName(jMethodToTMethodDefinition__jMethod____source_name_prime);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setName(jMethodToTMethodDefinition__tMethodDefinition____target_name_prime);
		jClass__jMethod____members
				.setName(jClass__jMethod____members_name_prime);
		jClassToTClass__jClass____source
				.setName(jClassToTClass__jClass____source_name_prime);
		jClassToTClass__tClass____target
				.setName(jClassToTClass__tClass____target_name_prime);
		jParamList__jMethod____methods
				.setName(jParamList__jMethod____methods_name_prime);
		jMethod__jParamList____parameter_list
				.setName(jMethod__jParamList____parameter_list_name_prime);
		jParamListToTMethodSignature__jParamList____source
				.setName(jParamListToTMethodSignature__jParamList____source_name_prime);
		jParamListToTMethodSignature__tMethodSignature____target
				.setName(jParamListToTMethodSignature__tMethodSignature____target_name_prime);
		return new Object[] { tMethodDefinition, jMethod, tMethodSignature,
				jMethodToTMethodSignature, jMethodToTMethodDefinition, jClass,
				tClass, jClassToTClass, jParamList,
				jParamListToTMethodSignature, isApplicableMatch,
				tMethodSignature__tMethodDefinition____definitions,
				tMethodDefinition__tMethodSignature____signature,
				jMethodToTMethodSignature__tMethodSignature____target,
				jMethodToTMethodSignature__jMethod____source,
				jMethodToTMethodDefinition__jMethod____source,
				jMethodToTMethodDefinition__tMethodDefinition____target,
				jClass__jMethod____members, jClassToTClass__jClass____source,
				jClassToTClass__tClass____target,
				jParamList__jMethod____methods,
				jMethod__jParamList____parameter_list,
				jParamListToTMethodSignature__jParamList____source,
				jParamListToTMethodSignature__tMethodSignature____target };
	}

	public static final Object[] pattern_MethodLinkClass_2_4_bindingFBBBBBBBBBBBB(
			MethodLinkClass _this, IsApplicableMatch isApplicableMatch,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, tMethodDefinition, jMethod,
				tMethodSignature, jMethodToTMethodSignature,
				jMethodToTMethodDefinition, jClass, tClass, jClassToTClass,
				jParamList, jParamListToTMethodSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					tMethodDefinition, jMethod, tMethodSignature,
					jMethodToTMethodSignature, jMethodToTMethodDefinition,
					jClass, tClass, jClassToTClass, jParamList,
					jParamListToTMethodSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodLinkClass_2_4_bindingAndBlackFBBBBBBBBBBBB(
			MethodLinkClass _this, IsApplicableMatch isApplicableMatch,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature) {
		Object[] result_pattern_MethodLinkClass_2_4_binding = pattern_MethodLinkClass_2_4_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, tMethodDefinition, jMethod,
				tMethodSignature, jMethodToTMethodSignature,
				jMethodToTMethodDefinition, jClass, tClass, jClassToTClass,
				jParamList, jParamListToTMethodSignature);
		if (result_pattern_MethodLinkClass_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_MethodLinkClass_2_4_binding[0];

			Object[] result_pattern_MethodLinkClass_2_4_black = pattern_MethodLinkClass_2_4_blackB(csp);
			if (result_pattern_MethodLinkClass_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						tMethodDefinition, jMethod, tMethodSignature,
						jMethodToTMethodSignature, jMethodToTMethodDefinition,
						jClass, tClass, jClassToTClass, jParamList,
						jParamListToTMethodSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodLinkClass_2_5_expressionFBB(
			MethodLinkClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodLinkClass_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodLinkClass_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodLinkClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodLinkClass_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodLinkClass_10_1_blackBBBBB(
			MethodLinkClass _this, Match match,
			TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TClass tClass) {
		return new Object[] { _this, match, tMethodDefinition,
				tMethodSignature, tClass };
	}

	public static final Object[] pattern_MethodLinkClass_10_2_bindingFBBBBB(
			MethodLinkClass _this, Match match,
			TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TClass tClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				tMethodDefinition, tMethodSignature, tClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tMethodDefinition,
					tMethodSignature, tClass };
		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodLinkClass_10_2_bindingAndBlackFBBBBB(
			MethodLinkClass _this, Match match,
			TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TClass tClass) {
		Object[] result_pattern_MethodLinkClass_10_2_binding = pattern_MethodLinkClass_10_2_bindingFBBBBB(
				_this, match, tMethodDefinition, tMethodSignature, tClass);
		if (result_pattern_MethodLinkClass_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_MethodLinkClass_10_2_binding[0];

			Object[] result_pattern_MethodLinkClass_10_2_black = pattern_MethodLinkClass_10_2_blackB(csp);
			if (result_pattern_MethodLinkClass_10_2_black != null) {

				return new Object[] { csp, _this, match, tMethodDefinition,
						tMethodSignature, tClass };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodLinkClass_10_3_expressionFBB(
			MethodLinkClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodLinkClass_10_4_blackBBBB(
			Match match, TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TClass tClass) {
		return new Object[] { match, tMethodDefinition, tMethodSignature,
				tClass };
	}

	public static final Object[] pattern_MethodLinkClass_10_4_greenBBBBFF(
			Match match, TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TClass tClass) {
		EMoflonEdge tClass__tMethodDefinition____defines = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tClass__tMethodSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tClass__tMethodDefinition____defines_name_prime = "defines";
		String tClass__tMethodSignature____signature_name_prime = "signature";
		tClass__tMethodDefinition____defines.setSrc(tClass);
		tClass__tMethodDefinition____defines.setTrg(tMethodDefinition);
		match.getToBeTranslatedEdges()
				.add(tClass__tMethodDefinition____defines);
		tClass__tMethodSignature____signature.setSrc(tClass);
		tClass__tMethodSignature____signature.setTrg(tMethodSignature);
		match.getToBeTranslatedEdges().add(
				tClass__tMethodSignature____signature);
		tClass__tMethodDefinition____defines
				.setName(tClass__tMethodDefinition____defines_name_prime);
		tClass__tMethodSignature____signature
				.setName(tClass__tMethodSignature____signature_name_prime);
		return new Object[] { match, tMethodDefinition, tMethodSignature,
				tClass, tClass__tMethodDefinition____defines,
				tClass__tMethodSignature____signature };
	}

	public static final Object[] pattern_MethodLinkClass_10_5_blackBBBB(
			Match match, TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TClass tClass) {
		return new Object[] { match, tMethodDefinition, tMethodSignature,
				tClass };
	}

	public static final Object[] pattern_MethodLinkClass_10_5_greenBBBBFF(
			Match match, TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TClass tClass) {
		EMoflonEdge tMethodSignature__tMethodDefinition____definitions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodDefinition__tMethodSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(tMethodDefinition);
		match.getContextNodes().add(tMethodSignature);
		match.getContextNodes().add(tClass);
		String tMethodSignature__tMethodDefinition____definitions_name_prime = "definitions";
		String tMethodDefinition__tMethodSignature____signature_name_prime = "signature";
		tMethodSignature__tMethodDefinition____definitions
				.setSrc(tMethodSignature);
		tMethodSignature__tMethodDefinition____definitions
				.setTrg(tMethodDefinition);
		match.getContextEdges().add(
				tMethodSignature__tMethodDefinition____definitions);
		tMethodDefinition__tMethodSignature____signature
				.setSrc(tMethodDefinition);
		tMethodDefinition__tMethodSignature____signature
				.setTrg(tMethodSignature);
		match.getContextEdges().add(
				tMethodDefinition__tMethodSignature____signature);
		tMethodSignature__tMethodDefinition____definitions
				.setName(tMethodSignature__tMethodDefinition____definitions_name_prime);
		tMethodDefinition__tMethodSignature____signature
				.setName(tMethodDefinition__tMethodSignature____signature_name_prime);
		return new Object[] { match, tMethodDefinition, tMethodSignature,
				tClass, tMethodSignature__tMethodDefinition____definitions,
				tMethodDefinition__tMethodSignature____signature };
	}

	public static final void pattern_MethodLinkClass_10_6_expressionBBBBB(
			MethodLinkClass _this, Match match,
			TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TClass tClass) {
		_this.registerObjectsToMatch_BWD(match, tMethodDefinition,
				tMethodSignature, tClass);

	}

	public static final boolean pattern_MethodLinkClass_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodLinkClass_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodLinkClass_11_1_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("tMethodDefinition");
		EObject _localVariable_1 = isApplicableMatch.getObject("jMethod");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("tMethodSignature");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("jMethodToTMethodSignature");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("jMethodToTMethodDefinition");
		EObject _localVariable_5 = isApplicableMatch.getObject("jClass");
		EObject _localVariable_6 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_7 = isApplicableMatch
				.getObject("jClassToTClass");
		EObject _localVariable_8 = isApplicableMatch.getObject("jParamList");
		EObject _localVariable_9 = isApplicableMatch
				.getObject("jParamListToTMethodSignature");
		EObject tmpTMethodDefinition = _localVariable_0;
		EObject tmpJMethod = _localVariable_1;
		EObject tmpTMethodSignature = _localVariable_2;
		EObject tmpJMethodToTMethodSignature = _localVariable_3;
		EObject tmpJMethodToTMethodDefinition = _localVariable_4;
		EObject tmpJClass = _localVariable_5;
		EObject tmpTClass = _localVariable_6;
		EObject tmpJClassToTClass = _localVariable_7;
		EObject tmpJParamList = _localVariable_8;
		EObject tmpJParamListToTMethodSignature = _localVariable_9;
		if (tmpTMethodDefinition instanceof TMethodDefinition) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
			if (tmpJMethod instanceof ExtendedClassMethod) {
				ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
				if (tmpTMethodSignature instanceof TMethodSignature) {
					TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
					if (tmpJMethodToTMethodSignature instanceof ClassMethodToTMethodSignature) {
						ClassMethodToTMethodSignature jMethodToTMethodSignature = (ClassMethodToTMethodSignature) tmpJMethodToTMethodSignature;
						if (tmpJMethodToTMethodDefinition instanceof ClassMethodToTMethodDefinition) {
							ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) tmpJMethodToTMethodDefinition;
							if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
								org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
								if (tmpTClass instanceof TClass) {
									TClass tClass = (TClass) tmpTClass;
									if (tmpJClassToTClass instanceof ClassToTClass) {
										ClassToTClass jClassToTClass = (ClassToTClass) tmpJClassToTClass;
										if (tmpJParamList instanceof ExtendedParameterList) {
											ExtendedParameterList jParamList = (ExtendedParameterList) tmpJParamList;
											if (tmpJParamListToTMethodSignature instanceof ExtendedParameterListToTMethodSignature) {
												ExtendedParameterListToTMethodSignature jParamListToTMethodSignature = (ExtendedParameterListToTMethodSignature) tmpJParamListToTMethodSignature;
												return new Object[] {
														tMethodDefinition,
														jMethod,
														tMethodSignature,
														jMethodToTMethodSignature,
														jMethodToTMethodDefinition,
														jClass,
														tClass,
														jClassToTClass,
														jParamList,
														jParamListToTMethodSignature,
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
		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_11_1_blackBBBBBBBBBBFBB(
			TMethodDefinition tMethodDefinition,
			ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			org.emftext.language.java.classifiers.Class jClass,
			TClass tClass,
			ClassToTClass jClassToTClass,
			ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature,
			MethodLinkClass _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tMethodDefinition, jMethod,
						tMethodSignature, jMethodToTMethodSignature,
						jMethodToTMethodDefinition, jClass, tClass,
						jClassToTClass, jParamList,
						jParamListToTMethodSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_11_1_bindingAndBlackFFFFFFFFFFFBB(
			MethodLinkClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodLinkClass_11_1_binding = pattern_MethodLinkClass_11_1_bindingFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_MethodLinkClass_11_1_binding != null) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result_pattern_MethodLinkClass_11_1_binding[0];
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result_pattern_MethodLinkClass_11_1_binding[1];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_MethodLinkClass_11_1_binding[2];
			ClassMethodToTMethodSignature jMethodToTMethodSignature = (ClassMethodToTMethodSignature) result_pattern_MethodLinkClass_11_1_binding[3];
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result_pattern_MethodLinkClass_11_1_binding[4];
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result_pattern_MethodLinkClass_11_1_binding[5];
			TClass tClass = (TClass) result_pattern_MethodLinkClass_11_1_binding[6];
			ClassToTClass jClassToTClass = (ClassToTClass) result_pattern_MethodLinkClass_11_1_binding[7];
			ExtendedParameterList jParamList = (ExtendedParameterList) result_pattern_MethodLinkClass_11_1_binding[8];
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature = (ExtendedParameterListToTMethodSignature) result_pattern_MethodLinkClass_11_1_binding[9];

			Object[] result_pattern_MethodLinkClass_11_1_black = pattern_MethodLinkClass_11_1_blackBBBBBBBBBBFBB(
					tMethodDefinition, jMethod, tMethodSignature,
					jMethodToTMethodSignature, jMethodToTMethodDefinition,
					jClass, tClass, jClassToTClass, jParamList,
					jParamListToTMethodSignature, _this, isApplicableMatch);
			if (result_pattern_MethodLinkClass_11_1_black != null) {
				CSP csp = (CSP) result_pattern_MethodLinkClass_11_1_black[10];

				return new Object[] { tMethodDefinition, jMethod,
						tMethodSignature, jMethodToTMethodSignature,
						jMethodToTMethodDefinition, jClass, tClass,
						jClassToTClass, jParamList,
						jParamListToTMethodSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_11_1_greenBB(
			ExtendedClassMethod jMethod,
			org.emftext.language.java.classifiers.Class jClass) {
		jClass.getMembers().add(jMethod);
		return new Object[] { jMethod, jClass };
	}

	public static final Object[] pattern_MethodLinkClass_11_2_greenF() {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_MethodLinkClass_11_3_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tMethodDefinition,
			EObject jMethod, EObject tMethodSignature,
			EObject jMethodToTMethodSignature,
			EObject jMethodToTMethodDefinition, EObject jClass, EObject tClass,
			EObject jClassToTClass, EObject jParamList,
			EObject jParamListToTMethodSignature) {
		if (!tMethodDefinition.equals(tMethodSignature)) {
			if (!jMethod.equals(tMethodDefinition)) {
				if (!jMethod.equals(tMethodSignature)) {
					if (!jMethod.equals(jMethodToTMethodSignature)) {
						if (!jMethod.equals(jMethodToTMethodDefinition)) {
							if (!jMethod.equals(tClass)) {
								if (!jMethod.equals(jParamList)) {
									if (!jMethod
											.equals(jParamListToTMethodSignature)) {
										if (!jMethodToTMethodSignature
												.equals(tMethodDefinition)) {
											if (!jMethodToTMethodSignature
													.equals(tMethodSignature)) {
												if (!jMethodToTMethodSignature
														.equals(tClass)) {
													if (!jMethodToTMethodSignature
															.equals(jParamList)) {
														if (!jMethodToTMethodSignature
																.equals(jParamListToTMethodSignature)) {
															if (!jMethodToTMethodDefinition
																	.equals(tMethodDefinition)) {
																if (!jMethodToTMethodDefinition
																		.equals(tMethodSignature)) {
																	if (!jMethodToTMethodDefinition
																			.equals(jMethodToTMethodSignature)) {
																		if (!jMethodToTMethodDefinition
																				.equals(tClass)) {
																			if (!jMethodToTMethodDefinition
																					.equals(jParamList)) {
																				if (!jMethodToTMethodDefinition
																						.equals(jParamListToTMethodSignature)) {
																					if (!jClass
																							.equals(tMethodDefinition)) {
																						if (!jClass
																								.equals(jMethod)) {
																							if (!jClass
																									.equals(tMethodSignature)) {
																								if (!jClass
																										.equals(jMethodToTMethodSignature)) {
																									if (!jClass
																											.equals(jMethodToTMethodDefinition)) {
																										if (!jClass
																												.equals(tClass)) {
																											if (!jClass
																													.equals(jClassToTClass)) {
																												if (!jClass
																														.equals(jParamList)) {
																													if (!jClass
																															.equals(jParamListToTMethodSignature)) {
																														if (!tClass
																																.equals(tMethodDefinition)) {
																															if (!tClass
																																	.equals(tMethodSignature)) {
																																if (!jClassToTClass
																																		.equals(tMethodDefinition)) {
																																	if (!jClassToTClass
																																			.equals(jMethod)) {
																																		if (!jClassToTClass
																																				.equals(tMethodSignature)) {
																																			if (!jClassToTClass
																																					.equals(jMethodToTMethodSignature)) {
																																				if (!jClassToTClass
																																						.equals(jMethodToTMethodDefinition)) {
																																					if (!jClassToTClass
																																							.equals(tClass)) {
																																						if (!jClassToTClass
																																								.equals(jParamList)) {
																																							if (!jClassToTClass
																																									.equals(jParamListToTMethodSignature)) {
																																								if (!jParamList
																																										.equals(tMethodDefinition)) {
																																									if (!jParamList
																																											.equals(tMethodSignature)) {
																																										if (!jParamList
																																												.equals(tClass)) {
																																											if (!jParamList
																																													.equals(jParamListToTMethodSignature)) {
																																												if (!jParamListToTMethodSignature
																																														.equals(tMethodDefinition)) {
																																													if (!jParamListToTMethodSignature
																																															.equals(tMethodSignature)) {
																																														if (!jParamListToTMethodSignature
																																																.equals(tClass)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	tMethodDefinition,
																																																	jMethod,
																																																	tMethodSignature,
																																																	jMethodToTMethodSignature,
																																																	jMethodToTMethodDefinition,
																																																	jClass,
																																																	tClass,
																																																	jClassToTClass,
																																																	jParamList,
																																																	jParamListToTMethodSignature };
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

	public static final Object[] pattern_MethodLinkClass_11_3_greenBBBBBBFFF(
			PerformRuleResult ruleresult, EObject tMethodDefinition,
			EObject jMethod, EObject tMethodSignature, EObject jClass,
			EObject tClass) {
		EMoflonEdge jClass__jMethod____members = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tClass__tMethodDefinition____defines = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tClass__tMethodSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodLinkClass";
		String jClass__jMethod____members_name_prime = "members";
		String tClass__tMethodDefinition____defines_name_prime = "defines";
		String tClass__tMethodSignature____signature_name_prime = "signature";
		jClass__jMethod____members.setSrc(jClass);
		jClass__jMethod____members.setTrg(jMethod);
		ruleresult.getCreatedEdges().add(jClass__jMethod____members);
		tClass__tMethodDefinition____defines.setSrc(tClass);
		tClass__tMethodDefinition____defines.setTrg(tMethodDefinition);
		ruleresult.getTranslatedEdges().add(
				tClass__tMethodDefinition____defines);
		tClass__tMethodSignature____signature.setSrc(tClass);
		tClass__tMethodSignature____signature.setTrg(tMethodSignature);
		ruleresult.getTranslatedEdges().add(
				tClass__tMethodSignature____signature);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jClass__jMethod____members
				.setName(jClass__jMethod____members_name_prime);
		tClass__tMethodDefinition____defines
				.setName(tClass__tMethodDefinition____defines_name_prime);
		tClass__tMethodSignature____signature
				.setName(tClass__tMethodSignature____signature_name_prime);
		return new Object[] { ruleresult, tMethodDefinition, jMethod,
				tMethodSignature, jClass, tClass, jClass__jMethod____members,
				tClass__tMethodDefinition____defines,
				tClass__tMethodSignature____signature };
	}

	public static final void pattern_MethodLinkClass_11_5_expressionBBBBBBBBBBBB(
			MethodLinkClass _this, PerformRuleResult ruleresult,
			EObject tMethodDefinition, EObject jMethod,
			EObject tMethodSignature, EObject jMethodToTMethodSignature,
			EObject jMethodToTMethodDefinition, EObject jClass, EObject tClass,
			EObject jClassToTClass, EObject jParamList,
			EObject jParamListToTMethodSignature) {
		_this.registerObjects_BWD(ruleresult, tMethodDefinition, jMethod,
				tMethodSignature, jMethodToTMethodSignature,
				jMethodToTMethodDefinition, jClass, tClass, jClassToTClass,
				jParamList, jParamListToTMethodSignature);

	}

	public static final PerformRuleResult pattern_MethodLinkClass_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodLinkClass_12_1_bindingFB(
			MethodLinkClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_12_1_blackFBB(
			EClass eClass, MethodLinkClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_12_1_bindingAndBlackFFB(
			MethodLinkClass _this) {
		Object[] result_pattern_MethodLinkClass_12_1_binding = pattern_MethodLinkClass_12_1_bindingFB(_this);
		if (result_pattern_MethodLinkClass_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodLinkClass_12_1_binding[0];

			Object[] result_pattern_MethodLinkClass_12_1_black = pattern_MethodLinkClass_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_MethodLinkClass_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodLinkClass_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodLinkClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodLinkClass_12_2_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("tMethodDefinition");
		EObject _localVariable_1 = match.getObject("tMethodSignature");
		EObject _localVariable_2 = match.getObject("tClass");
		EObject tmpTMethodDefinition = _localVariable_0;
		EObject tmpTMethodSignature = _localVariable_1;
		EObject tmpTClass = _localVariable_2;
		if (tmpTMethodDefinition instanceof TMethodDefinition) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
			if (tmpTMethodSignature instanceof TMethodSignature) {
				TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
				if (tmpTClass instanceof TClass) {
					TClass tClass = (TClass) tmpTClass;
					return new Object[] { tMethodDefinition, tMethodSignature,
							tClass, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodLinkClass_12_2_blackBFBFFFBFFFB(
			TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TClass tClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ClassMethodToTMethodSignature jMethodToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tMethodSignature,
						ClassMethodToTMethodSignature.class, "target")) {
			ExtendedClassMethod jMethod = jMethodToTMethodSignature.getSource();
			if (jMethod != null) {
				for (ClassMethodToTMethodDefinition jMethodToTMethodDefinition : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tMethodDefinition,
								ClassMethodToTMethodDefinition.class, "target")) {
					if (jMethod.equals(jMethodToTMethodDefinition.getSource())) {
						for (ClassToTClass jClassToTClass : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tClass,
										ClassToTClass.class, "target")) {
							org.emftext.language.java.classifiers.Class jClass = jClassToTClass
									.getSource();
							if (jClass != null) {
								for (ExtendedParameterListToTMethodSignature jParamListToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(
												tMethodSignature,
												ExtendedParameterListToTMethodSignature.class,
												"target")) {
									ExtendedParameterList jParamList = jParamListToTMethodSignature
											.getSource();
									if (jParamList != null) {
										_result.add(new Object[] {
												tMethodDefinition, jMethod,
												tMethodSignature,
												jMethodToTMethodSignature,
												jMethodToTMethodDefinition,
												jClass, tClass, jClassToTClass,
												jParamList,
												jParamListToTMethodSignature,
												match });
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

	public static final Iterable<Object[]> pattern_MethodLinkClass_12_3_blackBBBBBBBBBB(
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tMethodSignature.getDefinitions().contains(tMethodDefinition)) {
			if (tMethodSignature.equals(jMethodToTMethodSignature.getTarget())) {
				if (jMethod.equals(jMethodToTMethodSignature.getSource())) {
					if (jMethod.equals(jMethodToTMethodDefinition.getSource())) {
						if (tMethodDefinition.equals(jMethodToTMethodDefinition
								.getTarget())) {
							if (tClass.getDefines().contains(tMethodDefinition)) {
								if (tClass.getSignature().contains(
										tMethodSignature)) {
									if (jClass.equals(jClassToTClass
											.getSource())) {
										if (tClass.equals(jClassToTClass
												.getTarget())) {
											if (jParamList.getMethods()
													.contains(jMethod)) {
												if (jParamList
														.equals(jParamListToTMethodSignature
																.getSource())) {
													if (tMethodSignature
															.equals(jParamListToTMethodSignature
																	.getTarget())) {
														_result.add(new Object[] {
																tMethodDefinition,
																jMethod,
																tMethodSignature,
																jMethodToTMethodSignature,
																jMethodToTMethodDefinition,
																jClass, tClass,
																jClassToTClass,
																jParamList,
																jParamListToTMethodSignature });
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

	public static final Object[] pattern_MethodLinkClass_12_3_greenBBBBBBBBBBFFFFFFFFFFFFFFF(
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge tMethodSignature__tMethodDefinition____definitions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodDefinition__tMethodSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodSignature__tMethodSignature____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodSignature__jMethod____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodDefinition__jMethod____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodDefinition__tMethodDefinition____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tClass__tMethodDefinition____defines = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tClass__tMethodSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClassToTClass__jClass____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClassToTClass__tClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParamList__jMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__jParamList____parameter_list = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParamListToTMethodSignature__jParamList____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParamListToTMethodSignature__tMethodSignature____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tMethodSignature__tMethodDefinition____definitions_name_prime = "definitions";
		String tMethodDefinition__tMethodSignature____signature_name_prime = "signature";
		String jMethodToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String jMethodToTMethodSignature__jMethod____source_name_prime = "source";
		String jMethodToTMethodDefinition__jMethod____source_name_prime = "source";
		String jMethodToTMethodDefinition__tMethodDefinition____target_name_prime = "target";
		String tClass__tMethodDefinition____defines_name_prime = "defines";
		String tClass__tMethodSignature____signature_name_prime = "signature";
		String jClassToTClass__jClass____source_name_prime = "source";
		String jClassToTClass__tClass____target_name_prime = "target";
		String jParamList__jMethod____methods_name_prime = "methods";
		String jMethod__jParamList____parameter_list_name_prime = "parameter_list";
		String jParamListToTMethodSignature__jParamList____source_name_prime = "source";
		String jParamListToTMethodSignature__tMethodSignature____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(jMethod);
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements()
				.add(jMethodToTMethodSignature);
		isApplicableMatch.getAllContextElements().add(
				jMethodToTMethodDefinition);
		isApplicableMatch.getAllContextElements().add(jClass);
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(jClassToTClass);
		isApplicableMatch.getAllContextElements().add(jParamList);
		isApplicableMatch.getAllContextElements().add(
				jParamListToTMethodSignature);
		tMethodSignature__tMethodDefinition____definitions
				.setSrc(tMethodSignature);
		tMethodSignature__tMethodDefinition____definitions
				.setTrg(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(
				tMethodSignature__tMethodDefinition____definitions);
		tMethodDefinition__tMethodSignature____signature
				.setSrc(tMethodDefinition);
		tMethodDefinition__tMethodSignature____signature
				.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(
				tMethodDefinition__tMethodSignature____signature);
		jMethodToTMethodSignature__tMethodSignature____target
				.setSrc(jMethodToTMethodSignature);
		jMethodToTMethodSignature__tMethodSignature____target
				.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(
				jMethodToTMethodSignature__tMethodSignature____target);
		jMethodToTMethodSignature__jMethod____source
				.setSrc(jMethodToTMethodSignature);
		jMethodToTMethodSignature__jMethod____source.setTrg(jMethod);
		isApplicableMatch.getAllContextElements().add(
				jMethodToTMethodSignature__jMethod____source);
		jMethodToTMethodDefinition__jMethod____source
				.setSrc(jMethodToTMethodDefinition);
		jMethodToTMethodDefinition__jMethod____source.setTrg(jMethod);
		isApplicableMatch.getAllContextElements().add(
				jMethodToTMethodDefinition__jMethod____source);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setSrc(jMethodToTMethodDefinition);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setTrg(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(
				jMethodToTMethodDefinition__tMethodDefinition____target);
		tClass__tMethodDefinition____defines.setSrc(tClass);
		tClass__tMethodDefinition____defines.setTrg(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(
				tClass__tMethodDefinition____defines);
		tClass__tMethodSignature____signature.setSrc(tClass);
		tClass__tMethodSignature____signature.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(
				tClass__tMethodSignature____signature);
		jClassToTClass__jClass____source.setSrc(jClassToTClass);
		jClassToTClass__jClass____source.setTrg(jClass);
		isApplicableMatch.getAllContextElements().add(
				jClassToTClass__jClass____source);
		jClassToTClass__tClass____target.setSrc(jClassToTClass);
		jClassToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(
				jClassToTClass__tClass____target);
		jParamList__jMethod____methods.setSrc(jParamList);
		jParamList__jMethod____methods.setTrg(jMethod);
		isApplicableMatch.getAllContextElements().add(
				jParamList__jMethod____methods);
		jMethod__jParamList____parameter_list.setSrc(jMethod);
		jMethod__jParamList____parameter_list.setTrg(jParamList);
		isApplicableMatch.getAllContextElements().add(
				jMethod__jParamList____parameter_list);
		jParamListToTMethodSignature__jParamList____source
				.setSrc(jParamListToTMethodSignature);
		jParamListToTMethodSignature__jParamList____source.setTrg(jParamList);
		isApplicableMatch.getAllContextElements().add(
				jParamListToTMethodSignature__jParamList____source);
		jParamListToTMethodSignature__tMethodSignature____target
				.setSrc(jParamListToTMethodSignature);
		jParamListToTMethodSignature__tMethodSignature____target
				.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(
				jParamListToTMethodSignature__tMethodSignature____target);
		tMethodSignature__tMethodDefinition____definitions
				.setName(tMethodSignature__tMethodDefinition____definitions_name_prime);
		tMethodDefinition__tMethodSignature____signature
				.setName(tMethodDefinition__tMethodSignature____signature_name_prime);
		jMethodToTMethodSignature__tMethodSignature____target
				.setName(jMethodToTMethodSignature__tMethodSignature____target_name_prime);
		jMethodToTMethodSignature__jMethod____source
				.setName(jMethodToTMethodSignature__jMethod____source_name_prime);
		jMethodToTMethodDefinition__jMethod____source
				.setName(jMethodToTMethodDefinition__jMethod____source_name_prime);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setName(jMethodToTMethodDefinition__tMethodDefinition____target_name_prime);
		tClass__tMethodDefinition____defines
				.setName(tClass__tMethodDefinition____defines_name_prime);
		tClass__tMethodSignature____signature
				.setName(tClass__tMethodSignature____signature_name_prime);
		jClassToTClass__jClass____source
				.setName(jClassToTClass__jClass____source_name_prime);
		jClassToTClass__tClass____target
				.setName(jClassToTClass__tClass____target_name_prime);
		jParamList__jMethod____methods
				.setName(jParamList__jMethod____methods_name_prime);
		jMethod__jParamList____parameter_list
				.setName(jMethod__jParamList____parameter_list_name_prime);
		jParamListToTMethodSignature__jParamList____source
				.setName(jParamListToTMethodSignature__jParamList____source_name_prime);
		jParamListToTMethodSignature__tMethodSignature____target
				.setName(jParamListToTMethodSignature__tMethodSignature____target_name_prime);
		return new Object[] { tMethodDefinition, jMethod, tMethodSignature,
				jMethodToTMethodSignature, jMethodToTMethodDefinition, jClass,
				tClass, jClassToTClass, jParamList,
				jParamListToTMethodSignature, isApplicableMatch,
				tMethodSignature__tMethodDefinition____definitions,
				tMethodDefinition__tMethodSignature____signature,
				jMethodToTMethodSignature__tMethodSignature____target,
				jMethodToTMethodSignature__jMethod____source,
				jMethodToTMethodDefinition__jMethod____source,
				jMethodToTMethodDefinition__tMethodDefinition____target,
				tClass__tMethodDefinition____defines,
				tClass__tMethodSignature____signature,
				jClassToTClass__jClass____source,
				jClassToTClass__tClass____target,
				jParamList__jMethod____methods,
				jMethod__jParamList____parameter_list,
				jParamListToTMethodSignature__jParamList____source,
				jParamListToTMethodSignature__tMethodSignature____target };
	}

	public static final Object[] pattern_MethodLinkClass_12_4_bindingFBBBBBBBBBBBB(
			MethodLinkClass _this, IsApplicableMatch isApplicableMatch,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, tMethodDefinition, jMethod,
				tMethodSignature, jMethodToTMethodSignature,
				jMethodToTMethodDefinition, jClass, tClass, jClassToTClass,
				jParamList, jParamListToTMethodSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					tMethodDefinition, jMethod, tMethodSignature,
					jMethodToTMethodSignature, jMethodToTMethodDefinition,
					jClass, tClass, jClassToTClass, jParamList,
					jParamListToTMethodSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodLinkClass_12_4_bindingAndBlackFBBBBBBBBBBBB(
			MethodLinkClass _this, IsApplicableMatch isApplicableMatch,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature) {
		Object[] result_pattern_MethodLinkClass_12_4_binding = pattern_MethodLinkClass_12_4_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, tMethodDefinition, jMethod,
				tMethodSignature, jMethodToTMethodSignature,
				jMethodToTMethodDefinition, jClass, tClass, jClassToTClass,
				jParamList, jParamListToTMethodSignature);
		if (result_pattern_MethodLinkClass_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_MethodLinkClass_12_4_binding[0];

			Object[] result_pattern_MethodLinkClass_12_4_black = pattern_MethodLinkClass_12_4_blackB(csp);
			if (result_pattern_MethodLinkClass_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						tMethodDefinition, jMethod, tMethodSignature,
						jMethodToTMethodSignature, jMethodToTMethodDefinition,
						jClass, tClass, jClassToTClass, jParamList,
						jParamListToTMethodSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodLinkClass_12_5_expressionFBB(
			MethodLinkClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodLinkClass_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodLinkClass_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodLinkClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodLinkClass_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodLinkClass_20_1_bindingFB(
			MethodLinkClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_20_1_blackFBB(
			EClass __eClass, MethodLinkClass _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_20_1_bindingAndBlackFFB(
			MethodLinkClass _this) {
		Object[] result_pattern_MethodLinkClass_20_1_binding = pattern_MethodLinkClass_20_1_bindingFB(_this);
		if (result_pattern_MethodLinkClass_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodLinkClass_20_1_binding[0];

			Object[] result_pattern_MethodLinkClass_20_1_black = pattern_MethodLinkClass_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_MethodLinkClass_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodLinkClass_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodLinkClass_20_2_blackFFFB(
			EMoflonEdge _edge_members) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJClass = _edge_members.getSrc();
		if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
			EObject tmpJMethod = _edge_members.getTrg();
			if (tmpJMethod instanceof ExtendedClassMethod) {
				ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
				if (jClass.getMembers().contains(jMethod)) {
					ExtendedParameterList jParamList = jMethod
							.getParameter_list();
					if (jParamList != null) {
						_result.add(new Object[] { jMethod, jClass, jParamList,
								_edge_members });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodLinkClass_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodLinkClass_20_3_expressionFBBBBB(
			MethodLinkClass _this, Match match, ExtendedClassMethod jMethod,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedParameterList jParamList) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jMethod,
				jClass, jParamList);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodLinkClass_20_4_expressionFBB(
			MethodLinkClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodLinkClass_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_MethodLinkClass_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_MethodLinkClass_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodLinkClass_21_1_bindingFB(
			MethodLinkClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_21_1_blackFBB(
			EClass __eClass, MethodLinkClass _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_21_1_bindingAndBlackFFB(
			MethodLinkClass _this) {
		Object[] result_pattern_MethodLinkClass_21_1_binding = pattern_MethodLinkClass_21_1_bindingFB(_this);
		if (result_pattern_MethodLinkClass_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodLinkClass_21_1_binding[0];

			Object[] result_pattern_MethodLinkClass_21_1_black = pattern_MethodLinkClass_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_MethodLinkClass_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodLinkClass_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodLinkClass_21_2_blackFFFB(
			EMoflonEdge _edge_defines) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTClass = _edge_defines.getSrc();
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			EObject tmpTMethodDefinition = _edge_defines.getTrg();
			if (tmpTMethodDefinition instanceof TMethodDefinition) {
				TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
				if (tClass.getDefines().contains(tMethodDefinition)) {
					TMethodSignature tMethodSignature = tMethodDefinition
							.getSignature();
					if (tMethodSignature != null) {
						if (tClass.getSignature().contains(tMethodSignature)) {
							_result.add(new Object[] { tMethodDefinition,
									tMethodSignature, tClass, _edge_defines });
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodLinkClass_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodLinkClass_21_3_expressionFBBBBB(
			MethodLinkClass _this, Match match,
			TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TClass tClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match,
				tMethodDefinition, tMethodSignature, tClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodLinkClass_21_4_expressionFBB(
			MethodLinkClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodLinkClass_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_MethodLinkClass_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_MethodLinkClass_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodLinkClass_22_1_bindingFB(
			MethodLinkClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_22_1_blackFBB(
			EClass __eClass, MethodLinkClass _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_22_1_bindingAndBlackFFB(
			MethodLinkClass _this) {
		Object[] result_pattern_MethodLinkClass_22_1_binding = pattern_MethodLinkClass_22_1_bindingFB(_this);
		if (result_pattern_MethodLinkClass_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodLinkClass_22_1_binding[0];

			Object[] result_pattern_MethodLinkClass_22_1_black = pattern_MethodLinkClass_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_MethodLinkClass_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodLinkClass_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodLinkClass_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodLinkClass_22_2_blackFFFB(
			EMoflonEdge _edge_signature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTClass = _edge_signature.getSrc();
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			EObject tmpTMethodSignature = _edge_signature.getTrg();
			if (tmpTMethodSignature instanceof TMethodSignature) {
				TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
				if (tClass.getSignature().contains(tMethodSignature)) {
					for (TMember tmpTMethodDefinition : tClass.getDefines()) {
						if (tmpTMethodDefinition instanceof TMethodDefinition) {
							TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
							if (tMethodSignature.getDefinitions().contains(
									tMethodDefinition)) {
								_result.add(new Object[] { tMethodDefinition,
										tMethodSignature, tClass,
										_edge_signature });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodLinkClass_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodLinkClass_22_3_expressionFBBBBB(
			MethodLinkClass _this, Match match,
			TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TClass tClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match,
				tMethodDefinition, tMethodSignature, tClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodLinkClass_22_4_expressionFBB(
			MethodLinkClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodLinkClass_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_MethodLinkClass_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_MethodLinkClass_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodLinkClassImpl
