/**
 */
package GravityTGG.Rules.impl;

import ExtendedJamopp.ExtendedClassMethod;
import ExtendedJamopp.ExtendedJamoppFactory;
import ExtendedJamopp.ExtendedParameter;
import ExtendedJamopp.ExtendedType;

import GravityTGG.ClassToTClass;
import GravityTGG.ExtendedParameterToTParameter;
import GravityTGG.ExtendedTypeToTClass;
import GravityTGG.GravityTGGFactory;

import GravityTGG.Rules.ParameterTypeUserDefined;
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
import TypeGraphBasic.TParameter;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.emftext.language.java.types.Type;
// <-- [user defined imports]
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;

// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Type User Defined</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParameterTypeUserDefinedImpl extends AbstractRuleImpl implements
		ParameterTypeUserDefined {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterTypeUserDefinedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getParameterTypeUserDefined();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ExtendedType extendedType,
			ExtendedParameter jParameter,
			org.emftext.language.java.classifiers.Class jClass) {
		// initial bindings
		Object[] result1_black = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_0_1_blackBBBBB(this, match,
						extendedType, jParameter, jClass);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_0_2_bindingAndBlackFBBBBB(
						this, match, extendedType, jParameter, jClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_0_4_blackBBBB(match,
							extendedType, jParameter, jClass);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_0_4_greenBBBBFF(match,
							extendedType, jParameter, jClass);
			// EMoflonEdge extendedType__jClass____type = (EMoflonEdge) result4_green[4];
			// EMoflonEdge jParameter__extendedType____extendedParameterType = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_0_5_blackBBBB(match,
							extendedType, jParameter, jClass);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_0_5_greenBBB(match,
							jParameter, jClass);

			// register objects to match
			ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_0_6_expressionBBBBB(this,
							match, extendedType, jParameter, jClass);
			return ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_0_7_expressionF();
		} else {
			return ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_1_1_bindingAndBlackFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		TClass tClass = (TClass) result1_bindingAndBlack[0];
		ExtendedType extendedType = (ExtendedType) result1_bindingAndBlack[1];
		ExtendedParameter jParameter = (ExtendedParameter) result1_bindingAndBlack[2];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[3];
		ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result1_bindingAndBlack[4];
		org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result1_bindingAndBlack[5];
		ClassToTClass jClassToTClass = (ClassToTClass) result1_bindingAndBlack[6];
		// CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_1_1_greenBBBF(tClass,
						extendedType, tParameter);
		ExtendedTypeToTClass extendedTypeToTClass = (ExtendedTypeToTClass) result1_green[3];

		// collect translated elements
		Object[] result2_black = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_1_2_blackBB(extendedType,
						extendedTypeToTClass);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_1_2_greenFBB(extendedType,
						extendedTypeToTClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_1_3_blackBBBBBBBBB(
						ruleresult, tClass, extendedType, jParameter,
						tParameter, jParameterToTParameter,
						extendedTypeToTClass, jClass, jClassToTClass);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_1_3_greenBBBBBBBFFFFF(
						ruleresult, tClass, extendedType, jParameter,
						tParameter, extendedTypeToTClass, jClass);
		// EMoflonEdge extendedType__jClass____type = (EMoflonEdge) result3_green[7];
		// EMoflonEdge jParameter__extendedType____extendedParameterType = (EMoflonEdge) result3_green[8];
		// EMoflonEdge tParameter__tClass____tClass = (EMoflonEdge) result3_green[9];
		// EMoflonEdge extendedTypeToTClass__extendedType____source = (EMoflonEdge) result3_green[10];
		// EMoflonEdge extendedTypeToTClass__tClass____target = (EMoflonEdge) result3_green[11];

		// perform postprocessing story node is empty
		// register objects
		ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_1_5_expressionBBBBBBBBBB(
						this, ruleresult, tClass, extendedType, jParameter,
						tParameter, jParameterToTParameter,
						extendedTypeToTClass, jClass, jClassToTClass);
		return ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_2_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		ExtendedType extendedType = (ExtendedType) result2_binding[0];
		ExtendedParameter jParameter = (ExtendedParameter) result2_binding[1];
		org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result2_binding[2];
		for (Object[] result2_black : ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_2_2_blackFBBFFBFB(
						extendedType, jParameter, jClass, match)) {
			TClass tClass = (TClass) result2_black[0];
			TParameter tParameter = (TParameter) result2_black[3];
			ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result2_black[4];
			ClassToTClass jClassToTClass = (ClassToTClass) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_2_3_blackBBBBBBB(tClass,
							extendedType, jParameter, tParameter,
							jParameterToTParameter, jClass, jClassToTClass)) {
				Object[] result3_green = ParameterTypeUserDefinedImpl
						.pattern_ParameterTypeUserDefined_2_3_greenBBBBBBBFFFFFFF(
								tClass, extendedType, jParameter, tParameter,
								jParameterToTParameter, jClass, jClassToTClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge extendedType__jClass____type = (EMoflonEdge) result3_green[8];
				// EMoflonEdge jParameter__extendedType____extendedParameterType = (EMoflonEdge) result3_green[9];
				// EMoflonEdge jParameterToTParameter__tParameter____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge jParameterToTParameter__jParameter____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge jClassToTClass__jClass____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge jClassToTClass__tClass____target = (EMoflonEdge) result3_green[13];

				// solve CSP
				Object[] result4_bindingAndBlack = ParameterTypeUserDefinedImpl
						.pattern_ParameterTypeUserDefined_2_4_bindingAndBlackFBBBBBBBBB(
								this, isApplicableMatch, tClass, extendedType,
								jParameter, tParameter, jParameterToTParameter,
								jClass, jClassToTClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParameterTypeUserDefinedImpl
						.pattern_ParameterTypeUserDefined_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ParameterTypeUserDefinedImpl
							.pattern_ParameterTypeUserDefined_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ParameterTypeUserDefinedImpl
							.pattern_ParameterTypeUserDefined_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			ExtendedType extendedType, ExtendedParameter jParameter,
			org.emftext.language.java.classifiers.Class jClass) {
		match.registerObject("extendedType", extendedType);
		match.registerObject("jParameter", jParameter);
		match.registerObject("jClass", jClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			ExtendedType extendedType, ExtendedParameter jParameter,
			org.emftext.language.java.classifiers.Class jClass) {// Create CSP
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
			TClass tClass, ExtendedType extendedType,
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("extendedType", extendedType);
		isApplicableMatch.registerObject("jParameter", jParameter);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("jParameterToTParameter",
				jParameterToTParameter);
		isApplicableMatch.registerObject("jClass", jClass);
		isApplicableMatch.registerObject("jClassToTClass", jClassToTClass);
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
			EObject tClass, EObject extendedType, EObject jParameter,
			EObject tParameter, EObject jParameterToTParameter,
			EObject extendedTypeToTClass, EObject jClass, EObject jClassToTClass) {
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("extendedType", extendedType);
		ruleresult.registerObject("jParameter", jParameter);
		ruleresult.registerObject("tParameter", tParameter);
		ruleresult.registerObject("jParameterToTParameter",
				jParameterToTParameter);
		ruleresult.registerObject("extendedTypeToTClass", extendedTypeToTClass);
		ruleresult.registerObject("jClass", jClass);
		ruleresult.registerObject("jClassToTClass", jClassToTClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match
				.getObject("extendedType")
				.eClass()
				.equals(ExtendedJamopp.ExtendedJamoppPackage.eINSTANCE
						.getExtendedType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TClass tClass,
			TParameter tParameter) {
		// initial bindings
		Object[] result1_black = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_10_1_blackBBBB(this, match,
						tClass, tParameter);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_10_2_bindingAndBlackFBBBB(
						this, match, tClass, tParameter);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_10_4_blackBBB(match,
							tClass, tParameter);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_10_4_greenBBBF(match,
							tClass, tParameter);
			// EMoflonEdge tParameter__tClass____tClass = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_10_5_blackBBB(match,
							tClass, tParameter);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_10_5_greenBBB(match,
							tClass, tParameter);

			// register objects to match
			ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_10_6_expressionBBBB(this,
							match, tClass, tParameter);
			return ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_10_7_expressionF();
		} else {
			return ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_11_1_bindingAndBlackFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		TClass tClass = (TClass) result1_bindingAndBlack[0];
		ExtendedParameter jParameter = (ExtendedParameter) result1_bindingAndBlack[1];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[2];
		ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result1_bindingAndBlack[3];
		org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result1_bindingAndBlack[4];
		ClassToTClass jClassToTClass = (ClassToTClass) result1_bindingAndBlack[5];
		// CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_11_1_greenBFBFB(tClass,
						jParameter, jClass);
		ExtendedType extendedType = (ExtendedType) result1_green[1];
		ExtendedTypeToTClass extendedTypeToTClass = (ExtendedTypeToTClass) result1_green[3];

		// collect translated elements
		Object[] result2_black = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_11_2_blackBB(extendedType,
						extendedTypeToTClass);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_11_2_greenFBB(extendedType,
						extendedTypeToTClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_11_3_blackBBBBBBBBB(
						ruleresult, tClass, extendedType, jParameter,
						tParameter, jParameterToTParameter,
						extendedTypeToTClass, jClass, jClassToTClass);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_11_3_greenBBBBBBBFFFFF(
						ruleresult, tClass, extendedType, jParameter,
						tParameter, extendedTypeToTClass, jClass);
		// EMoflonEdge extendedType__jClass____type = (EMoflonEdge) result3_green[7];
		// EMoflonEdge jParameter__extendedType____extendedParameterType = (EMoflonEdge) result3_green[8];
		// EMoflonEdge tParameter__tClass____tClass = (EMoflonEdge) result3_green[9];
		// EMoflonEdge extendedTypeToTClass__extendedType____source = (EMoflonEdge) result3_green[10];
		// EMoflonEdge extendedTypeToTClass__tClass____target = (EMoflonEdge) result3_green[11];

		// perform postprocessing story node is empty
		// register objects
		ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_11_5_expressionBBBBBBBBBB(
						this, ruleresult, tClass, extendedType, jParameter,
						tParameter, jParameterToTParameter,
						extendedTypeToTClass, jClass, jClassToTClass);
		return ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		TClass tClass = (TClass) result2_binding[0];
		TParameter tParameter = (TParameter) result2_binding[1];
		for (Object[] result2_black : ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_12_2_blackBFBFFFB(tClass,
						tParameter, match)) {
			ExtendedParameter jParameter = (ExtendedParameter) result2_black[1];
			ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result2_black[3];
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result2_black[4];
			ClassToTClass jClassToTClass = (ClassToTClass) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_12_3_blackBBBBBB(tClass,
							jParameter, tParameter, jParameterToTParameter,
							jClass, jClassToTClass)) {
				Object[] result3_green = ParameterTypeUserDefinedImpl
						.pattern_ParameterTypeUserDefined_12_3_greenBBBBBBFFFFFF(
								tClass, jParameter, tParameter,
								jParameterToTParameter, jClass, jClassToTClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge tParameter__tClass____tClass = (EMoflonEdge) result3_green[7];
				// EMoflonEdge jParameterToTParameter__tParameter____target = (EMoflonEdge) result3_green[8];
				// EMoflonEdge jParameterToTParameter__jParameter____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge jClassToTClass__jClass____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge jClassToTClass__tClass____target = (EMoflonEdge) result3_green[11];

				// solve CSP
				Object[] result4_bindingAndBlack = ParameterTypeUserDefinedImpl
						.pattern_ParameterTypeUserDefined_12_4_bindingAndBlackFBBBBBBBB(
								this, isApplicableMatch, tClass, jParameter,
								tParameter, jParameterToTParameter, jClass,
								jClassToTClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParameterTypeUserDefinedImpl
						.pattern_ParameterTypeUserDefined_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ParameterTypeUserDefinedImpl
							.pattern_ParameterTypeUserDefined_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ParameterTypeUserDefinedImpl
							.pattern_ParameterTypeUserDefined_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TClass tClass,
			TParameter tParameter) {
		match.registerObject("tClass", tClass);
		match.registerObject("tParameter", tParameter);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TClass tClass,
			TParameter tParameter) {// Create CSP
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
			TClass tClass, ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("jParameter", jParameter);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("jParameterToTParameter",
				jParameterToTParameter);
		isApplicableMatch.registerObject("jClass", jClass);
		isApplicableMatch.registerObject("jClassToTClass", jClassToTClass);
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
			EObject tClass, EObject extendedType, EObject jParameter,
			EObject tParameter, EObject jParameterToTParameter,
			EObject extendedTypeToTClass, EObject jClass, EObject jClassToTClass) {
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("extendedType", extendedType);
		ruleresult.registerObject("jParameter", jParameter);
		ruleresult.registerObject("tParameter", tParameter);
		ruleresult.registerObject("jParameterToTParameter",
				jParameterToTParameter);
		ruleresult.registerObject("extendedTypeToTClass", extendedTypeToTClass);
		ruleresult.registerObject("jClass", jClass);
		ruleresult.registerObject("jClassToTClass", jClassToTClass);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_14(
			EMoflonEdge _edge_type) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_20_2_blackFFFB(_edge_type)) {
			ExtendedType extendedType = (ExtendedType) result2_black[0];
			ExtendedParameter jParameter = (ExtendedParameter) result2_black[1];
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result2_black[2];
			Object[] result2_green = ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_20_3_expressionFBBBBB(
							this, match, extendedType, jParameter, jClass)) {
				// Ensure that the correct types of elements are matched
				if (ParameterTypeUserDefinedImpl
						.pattern_ParameterTypeUserDefined_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParameterTypeUserDefinedImpl
							.pattern_ParameterTypeUserDefined_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParameterTypeUserDefinedImpl
							.pattern_ParameterTypeUserDefined_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_15(
			EMoflonEdge _edge_extendedParameterType) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_21_2_blackFFFB(_edge_extendedParameterType)) {
			ExtendedType extendedType = (ExtendedType) result2_black[0];
			ExtendedParameter jParameter = (ExtendedParameter) result2_black[1];
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result2_black[2];
			Object[] result2_green = ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_21_3_expressionFBBBBB(
							this, match, extendedType, jParameter, jClass)) {
				// Ensure that the correct types of elements are matched
				if (ParameterTypeUserDefinedImpl
						.pattern_ParameterTypeUserDefined_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParameterTypeUserDefinedImpl
							.pattern_ParameterTypeUserDefined_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParameterTypeUserDefinedImpl
							.pattern_ParameterTypeUserDefined_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_19(
			EMoflonEdge _edge_tClass) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_22_2_blackFFB(_edge_tClass)) {
			TClass tClass = (TClass) result2_black[0];
			TParameter tParameter = (TParameter) result2_black[1];
			Object[] result2_green = ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParameterTypeUserDefinedImpl
					.pattern_ParameterTypeUserDefined_22_3_expressionFBBBB(
							this, match, tClass, tParameter)) {
				// Ensure that the correct types of elements are matched
				if (ParameterTypeUserDefinedImpl
						.pattern_ParameterTypeUserDefined_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParameterTypeUserDefinedImpl
							.pattern_ParameterTypeUserDefined_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParameterTypeUserDefinedImpl
							.pattern_ParameterTypeUserDefined_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParameterTypeUserDefinedImpl
				.pattern_ParameterTypeUserDefined_22_6_expressionFB(__result);
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
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___IS_APPROPRIATE_FWD__MATCH_EXTENDEDTYPE_EXTENDEDPARAMETER_CLASS:
			return isAppropriate_FWD((Match) arguments.get(0),
					(ExtendedType) arguments.get(1),
					(ExtendedParameter) arguments.get(2),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(3));
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDTYPE_EXTENDEDPARAMETER_CLASS:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(ExtendedType) arguments.get(1),
					(ExtendedParameter) arguments.get(2),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(3));
			return null;
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDTYPE_EXTENDEDPARAMETER_CLASS:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(ExtendedType) arguments.get(1),
					(ExtendedParameter) arguments.get(2),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(3));
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TCLASS_EXTENDEDTYPE_EXTENDEDPARAMETER_TPARAMETER_EXTENDEDPARAMETERTOTPARAMETER_CLASS_CLASSTOTCLASS:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(TClass) arguments.get(1), (ExtendedType) arguments.get(2),
					(ExtendedParameter) arguments.get(3),
					(TParameter) arguments.get(4),
					(ExtendedParameterToTParameter) arguments.get(5),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(6), (ClassToTClass) arguments.get(7));
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8));
			return null;
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___IS_APPROPRIATE_BWD__MATCH_TCLASS_TPARAMETER:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TClass) arguments.get(1), (TParameter) arguments.get(2));
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TPARAMETER:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TClass) arguments.get(1), (TParameter) arguments.get(2));
			return null;
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TPARAMETER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TClass) arguments.get(1), (TParameter) arguments.get(2));
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TCLASS_EXTENDEDPARAMETER_TPARAMETER_EXTENDEDPARAMETERTOTPARAMETER_CLASS_CLASSTOTCLASS:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(TClass) arguments.get(1),
					(ExtendedParameter) arguments.get(2),
					(TParameter) arguments.get(3),
					(ExtendedParameterToTParameter) arguments.get(4),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(5), (ClassToTClass) arguments.get(6));
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8));
			return null;
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___IS_APPROPRIATE_FWD_EMOFLON_EDGE_14__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_14((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___IS_APPROPRIATE_FWD_EMOFLON_EDGE_15__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_15((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___IS_APPROPRIATE_BWD_EMOFLON_EDGE_19__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_19((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ParameterTypeUserDefined_0_1_blackBBBBB(
			ParameterTypeUserDefined _this, Match match,
			ExtendedType extendedType, ExtendedParameter jParameter,
			org.emftext.language.java.classifiers.Class jClass) {
		return new Object[] { _this, match, extendedType, jParameter, jClass };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_0_2_bindingFBBBBB(
			ParameterTypeUserDefined _this, Match match,
			ExtendedType extendedType, ExtendedParameter jParameter,
			org.emftext.language.java.classifiers.Class jClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				extendedType, jParameter, jClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, extendedType, jParameter,
					jClass };
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_0_2_bindingAndBlackFBBBBB(
			ParameterTypeUserDefined _this, Match match,
			ExtendedType extendedType, ExtendedParameter jParameter,
			org.emftext.language.java.classifiers.Class jClass) {
		Object[] result_pattern_ParameterTypeUserDefined_0_2_binding = pattern_ParameterTypeUserDefined_0_2_bindingFBBBBB(
				_this, match, extendedType, jParameter, jClass);
		if (result_pattern_ParameterTypeUserDefined_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterTypeUserDefined_0_2_binding[0];

			Object[] result_pattern_ParameterTypeUserDefined_0_2_black = pattern_ParameterTypeUserDefined_0_2_blackB(csp);
			if (result_pattern_ParameterTypeUserDefined_0_2_black != null) {

				return new Object[] { csp, _this, match, extendedType,
						jParameter, jClass };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterTypeUserDefined_0_3_expressionFBB(
			ParameterTypeUserDefined _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_0_4_blackBBBB(
			Match match, ExtendedType extendedType,
			ExtendedParameter jParameter,
			org.emftext.language.java.classifiers.Class jClass) {
		return new Object[] { match, extendedType, jParameter, jClass };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_0_4_greenBBBBFF(
			Match match, ExtendedType extendedType,
			ExtendedParameter jParameter,
			org.emftext.language.java.classifiers.Class jClass) {
		EMoflonEdge extendedType__jClass____type = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameter__extendedType____extendedParameterType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(extendedType);
		String extendedType__jClass____type_name_prime = "type";
		String jParameter__extendedType____extendedParameterType_name_prime = "extendedParameterType";
		extendedType__jClass____type.setSrc(extendedType);
		extendedType__jClass____type.setTrg(jClass);
		match.getToBeTranslatedEdges().add(extendedType__jClass____type);
		jParameter__extendedType____extendedParameterType.setSrc(jParameter);
		jParameter__extendedType____extendedParameterType.setTrg(extendedType);
		match.getToBeTranslatedEdges().add(
				jParameter__extendedType____extendedParameterType);
		extendedType__jClass____type
				.setName(extendedType__jClass____type_name_prime);
		jParameter__extendedType____extendedParameterType
				.setName(jParameter__extendedType____extendedParameterType_name_prime);
		return new Object[] { match, extendedType, jParameter, jClass,
				extendedType__jClass____type,
				jParameter__extendedType____extendedParameterType };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_0_5_blackBBBB(
			Match match, ExtendedType extendedType,
			ExtendedParameter jParameter,
			org.emftext.language.java.classifiers.Class jClass) {
		return new Object[] { match, extendedType, jParameter, jClass };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_0_5_greenBBB(
			Match match, ExtendedParameter jParameter,
			org.emftext.language.java.classifiers.Class jClass) {
		match.getContextNodes().add(jParameter);
		match.getContextNodes().add(jClass);
		return new Object[] { match, jParameter, jClass };
	}

	public static final void pattern_ParameterTypeUserDefined_0_6_expressionBBBBB(
			ParameterTypeUserDefined _this, Match match,
			ExtendedType extendedType, ExtendedParameter jParameter,
			org.emftext.language.java.classifiers.Class jClass) {
		_this.registerObjectsToMatch_FWD(match, extendedType, jParameter,
				jClass);

	}

	public static final boolean pattern_ParameterTypeUserDefined_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterTypeUserDefined_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_1_1_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("extendedType");
		EObject _localVariable_2 = isApplicableMatch.getObject("jParameter");
		EObject _localVariable_3 = isApplicableMatch.getObject("tParameter");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("jParameterToTParameter");
		EObject _localVariable_5 = isApplicableMatch.getObject("jClass");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("jClassToTClass");
		EObject tmpTClass = _localVariable_0;
		EObject tmpExtendedType = _localVariable_1;
		EObject tmpJParameter = _localVariable_2;
		EObject tmpTParameter = _localVariable_3;
		EObject tmpJParameterToTParameter = _localVariable_4;
		EObject tmpJClass = _localVariable_5;
		EObject tmpJClassToTClass = _localVariable_6;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpExtendedType instanceof ExtendedType) {
				ExtendedType extendedType = (ExtendedType) tmpExtendedType;
				if (tmpJParameter instanceof ExtendedParameter) {
					ExtendedParameter jParameter = (ExtendedParameter) tmpJParameter;
					if (tmpTParameter instanceof TParameter) {
						TParameter tParameter = (TParameter) tmpTParameter;
						if (tmpJParameterToTParameter instanceof ExtendedParameterToTParameter) {
							ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) tmpJParameterToTParameter;
							if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
								org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
								if (tmpJClassToTClass instanceof ClassToTClass) {
									ClassToTClass jClassToTClass = (ClassToTClass) tmpJClassToTClass;
									return new Object[] { tClass, extendedType,
											jParameter, tParameter,
											jParameterToTParameter, jClass,
											jClassToTClass, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_1_1_blackBBBBBBBFBB(
			TClass tClass, ExtendedType extendedType,
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass, ParameterTypeUserDefined _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tClass, extendedType, jParameter,
						tParameter, jParameterToTParameter, jClass,
						jClassToTClass, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_1_1_bindingAndBlackFFFFFFFFBB(
			ParameterTypeUserDefined _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParameterTypeUserDefined_1_1_binding = pattern_ParameterTypeUserDefined_1_1_bindingFFFFFFFB(isApplicableMatch);
		if (result_pattern_ParameterTypeUserDefined_1_1_binding != null) {
			TClass tClass = (TClass) result_pattern_ParameterTypeUserDefined_1_1_binding[0];
			ExtendedType extendedType = (ExtendedType) result_pattern_ParameterTypeUserDefined_1_1_binding[1];
			ExtendedParameter jParameter = (ExtendedParameter) result_pattern_ParameterTypeUserDefined_1_1_binding[2];
			TParameter tParameter = (TParameter) result_pattern_ParameterTypeUserDefined_1_1_binding[3];
			ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result_pattern_ParameterTypeUserDefined_1_1_binding[4];
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result_pattern_ParameterTypeUserDefined_1_1_binding[5];
			ClassToTClass jClassToTClass = (ClassToTClass) result_pattern_ParameterTypeUserDefined_1_1_binding[6];

			Object[] result_pattern_ParameterTypeUserDefined_1_1_black = pattern_ParameterTypeUserDefined_1_1_blackBBBBBBBFBB(
					tClass, extendedType, jParameter, tParameter,
					jParameterToTParameter, jClass, jClassToTClass, _this,
					isApplicableMatch);
			if (result_pattern_ParameterTypeUserDefined_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ParameterTypeUserDefined_1_1_black[7];

				return new Object[] { tClass, extendedType, jParameter,
						tParameter, jParameterToTParameter, jClass,
						jClassToTClass, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_1_1_greenBBBF(
			TClass tClass, ExtendedType extendedType, TParameter tParameter) {
		ExtendedTypeToTClass extendedTypeToTClass = GravityTGGFactory.eINSTANCE
				.createExtendedTypeToTClass();
		tParameter.setTClass(tClass);
		extendedTypeToTClass.setSource(extendedType);
		extendedTypeToTClass.setTarget(tClass);
		return new Object[] { tClass, extendedType, tParameter,
				extendedTypeToTClass };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_1_2_blackBB(
			ExtendedType extendedType, ExtendedTypeToTClass extendedTypeToTClass) {
		return new Object[] { extendedType, extendedTypeToTClass };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_1_2_greenFBB(
			ExtendedType extendedType, ExtendedTypeToTClass extendedTypeToTClass) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(extendedType);
		ruleresult.getCreatedLinkElements().add(extendedTypeToTClass);
		return new Object[] { ruleresult, extendedType, extendedTypeToTClass };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_1_3_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tClass, EObject extendedType,
			EObject jParameter, EObject tParameter,
			EObject jParameterToTParameter, EObject extendedTypeToTClass,
			EObject jClass, EObject jClassToTClass) {
		if (!tClass.equals(tParameter)) {
			if (!extendedType.equals(tClass)) {
				if (!extendedType.equals(jParameter)) {
					if (!extendedType.equals(tParameter)) {
						if (!extendedType.equals(jParameterToTParameter)) {
							if (!extendedType.equals(extendedTypeToTClass)) {
								if (!extendedType.equals(jClass)) {
									if (!extendedType.equals(jClassToTClass)) {
										if (!jParameter.equals(tClass)) {
											if (!jParameter.equals(tParameter)) {
												if (!jParameter
														.equals(jParameterToTParameter)) {
													if (!jParameterToTParameter
															.equals(tClass)) {
														if (!jParameterToTParameter
																.equals(tParameter)) {
															if (!extendedTypeToTClass
																	.equals(tClass)) {
																if (!extendedTypeToTClass
																		.equals(jParameter)) {
																	if (!extendedTypeToTClass
																			.equals(tParameter)) {
																		if (!extendedTypeToTClass
																				.equals(jParameterToTParameter)) {
																			if (!extendedTypeToTClass
																					.equals(jClass)) {
																				if (!extendedTypeToTClass
																						.equals(jClassToTClass)) {
																					if (!jClass
																							.equals(tClass)) {
																						if (!jClass
																								.equals(jParameter)) {
																							if (!jClass
																									.equals(tParameter)) {
																								if (!jClass
																										.equals(jParameterToTParameter)) {
																									if (!jClass
																											.equals(jClassToTClass)) {
																										if (!jClassToTClass
																												.equals(tClass)) {
																											if (!jClassToTClass
																													.equals(jParameter)) {
																												if (!jClassToTClass
																														.equals(tParameter)) {
																													if (!jClassToTClass
																															.equals(jParameterToTParameter)) {
																														return new Object[] {
																																ruleresult,
																																tClass,
																																extendedType,
																																jParameter,
																																tParameter,
																																jParameterToTParameter,
																																extendedTypeToTClass,
																																jClass,
																																jClassToTClass };
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

	public static final Object[] pattern_ParameterTypeUserDefined_1_3_greenBBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tClass, EObject extendedType,
			EObject jParameter, EObject tParameter,
			EObject extendedTypeToTClass, EObject jClass) {
		EMoflonEdge extendedType__jClass____type = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameter__extendedType____extendedParameterType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tParameter__tClass____tClass = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedTypeToTClass__extendedType____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedTypeToTClass__tClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParameterTypeUserDefined";
		String extendedType__jClass____type_name_prime = "type";
		String jParameter__extendedType____extendedParameterType_name_prime = "extendedParameterType";
		String tParameter__tClass____tClass_name_prime = "tClass";
		String extendedTypeToTClass__extendedType____source_name_prime = "source";
		String extendedTypeToTClass__tClass____target_name_prime = "target";
		extendedType__jClass____type.setSrc(extendedType);
		extendedType__jClass____type.setTrg(jClass);
		ruleresult.getTranslatedEdges().add(extendedType__jClass____type);
		jParameter__extendedType____extendedParameterType.setSrc(jParameter);
		jParameter__extendedType____extendedParameterType.setTrg(extendedType);
		ruleresult.getTranslatedEdges().add(
				jParameter__extendedType____extendedParameterType);
		tParameter__tClass____tClass.setSrc(tParameter);
		tParameter__tClass____tClass.setTrg(tClass);
		ruleresult.getCreatedEdges().add(tParameter__tClass____tClass);
		extendedTypeToTClass__extendedType____source
				.setSrc(extendedTypeToTClass);
		extendedTypeToTClass__extendedType____source.setTrg(extendedType);
		ruleresult.getCreatedEdges().add(
				extendedTypeToTClass__extendedType____source);
		extendedTypeToTClass__tClass____target.setSrc(extendedTypeToTClass);
		extendedTypeToTClass__tClass____target.setTrg(tClass);
		ruleresult.getCreatedEdges()
				.add(extendedTypeToTClass__tClass____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		extendedType__jClass____type
				.setName(extendedType__jClass____type_name_prime);
		jParameter__extendedType____extendedParameterType
				.setName(jParameter__extendedType____extendedParameterType_name_prime);
		tParameter__tClass____tClass
				.setName(tParameter__tClass____tClass_name_prime);
		extendedTypeToTClass__extendedType____source
				.setName(extendedTypeToTClass__extendedType____source_name_prime);
		extendedTypeToTClass__tClass____target
				.setName(extendedTypeToTClass__tClass____target_name_prime);
		return new Object[] { ruleresult, tClass, extendedType, jParameter,
				tParameter, extendedTypeToTClass, jClass,
				extendedType__jClass____type,
				jParameter__extendedType____extendedParameterType,
				tParameter__tClass____tClass,
				extendedTypeToTClass__extendedType____source,
				extendedTypeToTClass__tClass____target };
	}

	public static final void pattern_ParameterTypeUserDefined_1_5_expressionBBBBBBBBBB(
			ParameterTypeUserDefined _this, PerformRuleResult ruleresult,
			EObject tClass, EObject extendedType, EObject jParameter,
			EObject tParameter, EObject jParameterToTParameter,
			EObject extendedTypeToTClass, EObject jClass, EObject jClassToTClass) {
		_this.registerObjects_FWD(ruleresult, tClass, extendedType, jParameter,
				tParameter, jParameterToTParameter, extendedTypeToTClass,
				jClass, jClassToTClass);

	}

	public static final PerformRuleResult pattern_ParameterTypeUserDefined_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_2_1_bindingFB(
			ParameterTypeUserDefined _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_2_1_blackFBB(
			EClass eClass, ParameterTypeUserDefined _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_2_1_bindingAndBlackFFB(
			ParameterTypeUserDefined _this) {
		Object[] result_pattern_ParameterTypeUserDefined_2_1_binding = pattern_ParameterTypeUserDefined_2_1_bindingFB(_this);
		if (result_pattern_ParameterTypeUserDefined_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParameterTypeUserDefined_2_1_binding[0];

			Object[] result_pattern_ParameterTypeUserDefined_2_1_black = pattern_ParameterTypeUserDefined_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParameterTypeUserDefined_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParameterTypeUserDefined_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParameterTypeUserDefined";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_2_2_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("extendedType");
		EObject _localVariable_1 = match.getObject("jParameter");
		EObject _localVariable_2 = match.getObject("jClass");
		EObject tmpExtendedType = _localVariable_0;
		EObject tmpJParameter = _localVariable_1;
		EObject tmpJClass = _localVariable_2;
		if (tmpExtendedType instanceof ExtendedType) {
			ExtendedType extendedType = (ExtendedType) tmpExtendedType;
			if (tmpJParameter instanceof ExtendedParameter) {
				ExtendedParameter jParameter = (ExtendedParameter) tmpJParameter;
				if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
					org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
					return new Object[] { extendedType, jParameter, jClass,
							match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterTypeUserDefined_2_2_blackFBBFFBFB(
			ExtendedType extendedType, ExtendedParameter jParameter,
			org.emftext.language.java.classifiers.Class jClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		boolean extendedTypeisFromLib = extendedType.isIsFromLib();
		if (Boolean.valueOf(extendedTypeisFromLib).equals(false)) {
			for (ExtendedParameterToTParameter jParameterToTParameter : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(jParameter,
							ExtendedParameterToTParameter.class, "source")) {
				TParameter tParameter = jParameterToTParameter.getTarget();
				if (tParameter != null) {
					for (ClassToTClass jClassToTClass : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(jClass,
									ClassToTClass.class, "source")) {
						TClass tClass = jClassToTClass.getTarget();
						if (tClass != null) {
							_result.add(new Object[] { tClass, extendedType,
									jParameter, tParameter,
									jParameterToTParameter, jClass,
									jClassToTClass, match });
						}

					}
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_ParameterTypeUserDefined_2_3_blackBBBBBBB(
			TClass tClass, ExtendedType extendedType,
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (jClass.equals(extendedType.getType())) {
			if (extendedType.equals(jParameter.getExtendedParameterType())) {
				if (tParameter.equals(jParameterToTParameter.getTarget())) {
					if (jParameter.equals(jParameterToTParameter.getSource())) {
						if (jClass.equals(jClassToTClass.getSource())) {
							if (tClass.equals(jClassToTClass.getTarget())) {
								boolean extendedTypeisFromLib = extendedType
										.isIsFromLib();
								if (Boolean.valueOf(extendedTypeisFromLib)
										.equals(false)) {
									_result.add(new Object[] { tClass,
											extendedType, jParameter,
											tParameter, jParameterToTParameter,
											jClass, jClassToTClass });
								}

							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_2_3_greenBBBBBBBFFFFFFF(
			TClass tClass, ExtendedType extendedType,
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge extendedType__jClass____type = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameter__extendedType____extendedParameterType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToTParameter__tParameter____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToTParameter__jParameter____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClassToTClass__jClass____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClassToTClass__tClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String extendedType__jClass____type_name_prime = "type";
		String jParameter__extendedType____extendedParameterType_name_prime = "extendedParameterType";
		String jParameterToTParameter__tParameter____target_name_prime = "target";
		String jParameterToTParameter__jParameter____source_name_prime = "source";
		String jClassToTClass__jClass____source_name_prime = "source";
		String jClassToTClass__tClass____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(extendedType);
		isApplicableMatch.getAllContextElements().add(jParameter);
		isApplicableMatch.getAllContextElements().add(tParameter);
		isApplicableMatch.getAllContextElements().add(jParameterToTParameter);
		isApplicableMatch.getAllContextElements().add(jClass);
		isApplicableMatch.getAllContextElements().add(jClassToTClass);
		extendedType__jClass____type.setSrc(extendedType);
		extendedType__jClass____type.setTrg(jClass);
		isApplicableMatch.getAllContextElements().add(
				extendedType__jClass____type);
		jParameter__extendedType____extendedParameterType.setSrc(jParameter);
		jParameter__extendedType____extendedParameterType.setTrg(extendedType);
		isApplicableMatch.getAllContextElements().add(
				jParameter__extendedType____extendedParameterType);
		jParameterToTParameter__tParameter____target
				.setSrc(jParameterToTParameter);
		jParameterToTParameter__tParameter____target.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(
				jParameterToTParameter__tParameter____target);
		jParameterToTParameter__jParameter____source
				.setSrc(jParameterToTParameter);
		jParameterToTParameter__jParameter____source.setTrg(jParameter);
		isApplicableMatch.getAllContextElements().add(
				jParameterToTParameter__jParameter____source);
		jClassToTClass__jClass____source.setSrc(jClassToTClass);
		jClassToTClass__jClass____source.setTrg(jClass);
		isApplicableMatch.getAllContextElements().add(
				jClassToTClass__jClass____source);
		jClassToTClass__tClass____target.setSrc(jClassToTClass);
		jClassToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(
				jClassToTClass__tClass____target);
		extendedType__jClass____type
				.setName(extendedType__jClass____type_name_prime);
		jParameter__extendedType____extendedParameterType
				.setName(jParameter__extendedType____extendedParameterType_name_prime);
		jParameterToTParameter__tParameter____target
				.setName(jParameterToTParameter__tParameter____target_name_prime);
		jParameterToTParameter__jParameter____source
				.setName(jParameterToTParameter__jParameter____source_name_prime);
		jClassToTClass__jClass____source
				.setName(jClassToTClass__jClass____source_name_prime);
		jClassToTClass__tClass____target
				.setName(jClassToTClass__tClass____target_name_prime);
		return new Object[] { tClass, extendedType, jParameter, tParameter,
				jParameterToTParameter, jClass, jClassToTClass,
				isApplicableMatch, extendedType__jClass____type,
				jParameter__extendedType____extendedParameterType,
				jParameterToTParameter__tParameter____target,
				jParameterToTParameter__jParameter____source,
				jClassToTClass__jClass____source,
				jClassToTClass__tClass____target };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_2_4_bindingFBBBBBBBBB(
			ParameterTypeUserDefined _this,
			IsApplicableMatch isApplicableMatch, TClass tClass,
			ExtendedType extendedType, ExtendedParameter jParameter,
			TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, tClass, extendedType, jParameter,
				tParameter, jParameterToTParameter, jClass, jClassToTClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tClass,
					extendedType, jParameter, tParameter,
					jParameterToTParameter, jClass, jClassToTClass };
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_2_4_bindingAndBlackFBBBBBBBBB(
			ParameterTypeUserDefined _this,
			IsApplicableMatch isApplicableMatch, TClass tClass,
			ExtendedType extendedType, ExtendedParameter jParameter,
			TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass) {
		Object[] result_pattern_ParameterTypeUserDefined_2_4_binding = pattern_ParameterTypeUserDefined_2_4_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tClass, extendedType, jParameter,
				tParameter, jParameterToTParameter, jClass, jClassToTClass);
		if (result_pattern_ParameterTypeUserDefined_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterTypeUserDefined_2_4_binding[0];

			Object[] result_pattern_ParameterTypeUserDefined_2_4_black = pattern_ParameterTypeUserDefined_2_4_blackB(csp);
			if (result_pattern_ParameterTypeUserDefined_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tClass,
						extendedType, jParameter, tParameter,
						jParameterToTParameter, jClass, jClassToTClass };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterTypeUserDefined_2_5_expressionFBB(
			ParameterTypeUserDefined _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParameterTypeUserDefined";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterTypeUserDefined_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_10_1_blackBBBB(
			ParameterTypeUserDefined _this, Match match, TClass tClass,
			TParameter tParameter) {
		return new Object[] { _this, match, tClass, tParameter };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_10_2_bindingFBBBB(
			ParameterTypeUserDefined _this, Match match, TClass tClass,
			TParameter tParameter) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tClass,
				tParameter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tClass, tParameter };
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_10_2_bindingAndBlackFBBBB(
			ParameterTypeUserDefined _this, Match match, TClass tClass,
			TParameter tParameter) {
		Object[] result_pattern_ParameterTypeUserDefined_10_2_binding = pattern_ParameterTypeUserDefined_10_2_bindingFBBBB(
				_this, match, tClass, tParameter);
		if (result_pattern_ParameterTypeUserDefined_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterTypeUserDefined_10_2_binding[0];

			Object[] result_pattern_ParameterTypeUserDefined_10_2_black = pattern_ParameterTypeUserDefined_10_2_blackB(csp);
			if (result_pattern_ParameterTypeUserDefined_10_2_black != null) {

				return new Object[] { csp, _this, match, tClass, tParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterTypeUserDefined_10_3_expressionFBB(
			ParameterTypeUserDefined _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_10_4_blackBBB(
			Match match, TClass tClass, TParameter tParameter) {
		return new Object[] { match, tClass, tParameter };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_10_4_greenBBBF(
			Match match, TClass tClass, TParameter tParameter) {
		EMoflonEdge tParameter__tClass____tClass = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tParameter__tClass____tClass_name_prime = "tClass";
		tParameter__tClass____tClass.setSrc(tParameter);
		tParameter__tClass____tClass.setTrg(tClass);
		match.getToBeTranslatedEdges().add(tParameter__tClass____tClass);
		tParameter__tClass____tClass
				.setName(tParameter__tClass____tClass_name_prime);
		return new Object[] { match, tClass, tParameter,
				tParameter__tClass____tClass };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_10_5_blackBBB(
			Match match, TClass tClass, TParameter tParameter) {
		return new Object[] { match, tClass, tParameter };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_10_5_greenBBB(
			Match match, TClass tClass, TParameter tParameter) {
		match.getContextNodes().add(tClass);
		match.getContextNodes().add(tParameter);
		return new Object[] { match, tClass, tParameter };
	}

	public static final void pattern_ParameterTypeUserDefined_10_6_expressionBBBB(
			ParameterTypeUserDefined _this, Match match, TClass tClass,
			TParameter tParameter) {
		_this.registerObjectsToMatch_BWD(match, tClass, tParameter);

	}

	public static final boolean pattern_ParameterTypeUserDefined_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterTypeUserDefined_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_11_1_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("jParameter");
		EObject _localVariable_2 = isApplicableMatch.getObject("tParameter");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("jParameterToTParameter");
		EObject _localVariable_4 = isApplicableMatch.getObject("jClass");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("jClassToTClass");
		EObject tmpTClass = _localVariable_0;
		EObject tmpJParameter = _localVariable_1;
		EObject tmpTParameter = _localVariable_2;
		EObject tmpJParameterToTParameter = _localVariable_3;
		EObject tmpJClass = _localVariable_4;
		EObject tmpJClassToTClass = _localVariable_5;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpJParameter instanceof ExtendedParameter) {
				ExtendedParameter jParameter = (ExtendedParameter) tmpJParameter;
				if (tmpTParameter instanceof TParameter) {
					TParameter tParameter = (TParameter) tmpTParameter;
					if (tmpJParameterToTParameter instanceof ExtendedParameterToTParameter) {
						ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) tmpJParameterToTParameter;
						if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
							org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
							if (tmpJClassToTClass instanceof ClassToTClass) {
								ClassToTClass jClassToTClass = (ClassToTClass) tmpJClassToTClass;
								return new Object[] { tClass, jParameter,
										tParameter, jParameterToTParameter,
										jClass, jClassToTClass,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_11_1_blackBBBBBBFBB(
			TClass tClass, ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass, ParameterTypeUserDefined _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tClass, jParameter, tParameter,
						jParameterToTParameter, jClass, jClassToTClass, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_11_1_bindingAndBlackFFFFFFFBB(
			ParameterTypeUserDefined _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParameterTypeUserDefined_11_1_binding = pattern_ParameterTypeUserDefined_11_1_bindingFFFFFFB(isApplicableMatch);
		if (result_pattern_ParameterTypeUserDefined_11_1_binding != null) {
			TClass tClass = (TClass) result_pattern_ParameterTypeUserDefined_11_1_binding[0];
			ExtendedParameter jParameter = (ExtendedParameter) result_pattern_ParameterTypeUserDefined_11_1_binding[1];
			TParameter tParameter = (TParameter) result_pattern_ParameterTypeUserDefined_11_1_binding[2];
			ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result_pattern_ParameterTypeUserDefined_11_1_binding[3];
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result_pattern_ParameterTypeUserDefined_11_1_binding[4];
			ClassToTClass jClassToTClass = (ClassToTClass) result_pattern_ParameterTypeUserDefined_11_1_binding[5];

			Object[] result_pattern_ParameterTypeUserDefined_11_1_black = pattern_ParameterTypeUserDefined_11_1_blackBBBBBBFBB(
					tClass, jParameter, tParameter, jParameterToTParameter,
					jClass, jClassToTClass, _this, isApplicableMatch);
			if (result_pattern_ParameterTypeUserDefined_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ParameterTypeUserDefined_11_1_black[6];

				return new Object[] { tClass, jParameter, tParameter,
						jParameterToTParameter, jClass, jClassToTClass, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_11_1_greenBFBFB(
			TClass tClass, ExtendedParameter jParameter,
			org.emftext.language.java.classifiers.Class jClass) {
		ExtendedType extendedType = ExtendedJamoppFactory.eINSTANCE
				.createExtendedType();
		ExtendedTypeToTClass extendedTypeToTClass = GravityTGGFactory.eINSTANCE
				.createExtendedTypeToTClass();
		boolean extendedType_isFromLib_prime = false;
		extendedType.setType(jClass);
		jParameter.setExtendedParameterType(extendedType);
		extendedTypeToTClass.setSource(extendedType);
		extendedTypeToTClass.setTarget(tClass);
		extendedType
				.setIsFromLib(Boolean.valueOf(extendedType_isFromLib_prime));
		return new Object[] { tClass, extendedType, jParameter,
				extendedTypeToTClass, jClass };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_11_2_blackBB(
			ExtendedType extendedType, ExtendedTypeToTClass extendedTypeToTClass) {
		return new Object[] { extendedType, extendedTypeToTClass };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_11_2_greenFBB(
			ExtendedType extendedType, ExtendedTypeToTClass extendedTypeToTClass) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(extendedType);
		ruleresult.getCreatedLinkElements().add(extendedTypeToTClass);
		return new Object[] { ruleresult, extendedType, extendedTypeToTClass };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_11_3_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tClass, EObject extendedType,
			EObject jParameter, EObject tParameter,
			EObject jParameterToTParameter, EObject extendedTypeToTClass,
			EObject jClass, EObject jClassToTClass) {
		if (!tClass.equals(tParameter)) {
			if (!extendedType.equals(tClass)) {
				if (!extendedType.equals(jParameter)) {
					if (!extendedType.equals(tParameter)) {
						if (!extendedType.equals(jParameterToTParameter)) {
							if (!extendedType.equals(extendedTypeToTClass)) {
								if (!extendedType.equals(jClass)) {
									if (!extendedType.equals(jClassToTClass)) {
										if (!jParameter.equals(tClass)) {
											if (!jParameter.equals(tParameter)) {
												if (!jParameter
														.equals(jParameterToTParameter)) {
													if (!jParameterToTParameter
															.equals(tClass)) {
														if (!jParameterToTParameter
																.equals(tParameter)) {
															if (!extendedTypeToTClass
																	.equals(tClass)) {
																if (!extendedTypeToTClass
																		.equals(jParameter)) {
																	if (!extendedTypeToTClass
																			.equals(tParameter)) {
																		if (!extendedTypeToTClass
																				.equals(jParameterToTParameter)) {
																			if (!extendedTypeToTClass
																					.equals(jClass)) {
																				if (!extendedTypeToTClass
																						.equals(jClassToTClass)) {
																					if (!jClass
																							.equals(tClass)) {
																						if (!jClass
																								.equals(jParameter)) {
																							if (!jClass
																									.equals(tParameter)) {
																								if (!jClass
																										.equals(jParameterToTParameter)) {
																									if (!jClass
																											.equals(jClassToTClass)) {
																										if (!jClassToTClass
																												.equals(tClass)) {
																											if (!jClassToTClass
																													.equals(jParameter)) {
																												if (!jClassToTClass
																														.equals(tParameter)) {
																													if (!jClassToTClass
																															.equals(jParameterToTParameter)) {
																														return new Object[] {
																																ruleresult,
																																tClass,
																																extendedType,
																																jParameter,
																																tParameter,
																																jParameterToTParameter,
																																extendedTypeToTClass,
																																jClass,
																																jClassToTClass };
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

	public static final Object[] pattern_ParameterTypeUserDefined_11_3_greenBBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tClass, EObject extendedType,
			EObject jParameter, EObject tParameter,
			EObject extendedTypeToTClass, EObject jClass) {
		EMoflonEdge extendedType__jClass____type = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameter__extendedType____extendedParameterType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tParameter__tClass____tClass = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedTypeToTClass__extendedType____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedTypeToTClass__tClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParameterTypeUserDefined";
		String extendedType__jClass____type_name_prime = "type";
		String jParameter__extendedType____extendedParameterType_name_prime = "extendedParameterType";
		String tParameter__tClass____tClass_name_prime = "tClass";
		String extendedTypeToTClass__extendedType____source_name_prime = "source";
		String extendedTypeToTClass__tClass____target_name_prime = "target";
		extendedType__jClass____type.setSrc(extendedType);
		extendedType__jClass____type.setTrg(jClass);
		ruleresult.getCreatedEdges().add(extendedType__jClass____type);
		jParameter__extendedType____extendedParameterType.setSrc(jParameter);
		jParameter__extendedType____extendedParameterType.setTrg(extendedType);
		ruleresult.getCreatedEdges().add(
				jParameter__extendedType____extendedParameterType);
		tParameter__tClass____tClass.setSrc(tParameter);
		tParameter__tClass____tClass.setTrg(tClass);
		ruleresult.getTranslatedEdges().add(tParameter__tClass____tClass);
		extendedTypeToTClass__extendedType____source
				.setSrc(extendedTypeToTClass);
		extendedTypeToTClass__extendedType____source.setTrg(extendedType);
		ruleresult.getCreatedEdges().add(
				extendedTypeToTClass__extendedType____source);
		extendedTypeToTClass__tClass____target.setSrc(extendedTypeToTClass);
		extendedTypeToTClass__tClass____target.setTrg(tClass);
		ruleresult.getCreatedEdges()
				.add(extendedTypeToTClass__tClass____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		extendedType__jClass____type
				.setName(extendedType__jClass____type_name_prime);
		jParameter__extendedType____extendedParameterType
				.setName(jParameter__extendedType____extendedParameterType_name_prime);
		tParameter__tClass____tClass
				.setName(tParameter__tClass____tClass_name_prime);
		extendedTypeToTClass__extendedType____source
				.setName(extendedTypeToTClass__extendedType____source_name_prime);
		extendedTypeToTClass__tClass____target
				.setName(extendedTypeToTClass__tClass____target_name_prime);
		return new Object[] { ruleresult, tClass, extendedType, jParameter,
				tParameter, extendedTypeToTClass, jClass,
				extendedType__jClass____type,
				jParameter__extendedType____extendedParameterType,
				tParameter__tClass____tClass,
				extendedTypeToTClass__extendedType____source,
				extendedTypeToTClass__tClass____target };
	}

	public static final void pattern_ParameterTypeUserDefined_11_5_expressionBBBBBBBBBB(
			ParameterTypeUserDefined _this, PerformRuleResult ruleresult,
			EObject tClass, EObject extendedType, EObject jParameter,
			EObject tParameter, EObject jParameterToTParameter,
			EObject extendedTypeToTClass, EObject jClass, EObject jClassToTClass) {
		_this.registerObjects_BWD(ruleresult, tClass, extendedType, jParameter,
				tParameter, jParameterToTParameter, extendedTypeToTClass,
				jClass, jClassToTClass);

	}

	public static final PerformRuleResult pattern_ParameterTypeUserDefined_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_12_1_bindingFB(
			ParameterTypeUserDefined _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_12_1_blackFBB(
			EClass eClass, ParameterTypeUserDefined _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_12_1_bindingAndBlackFFB(
			ParameterTypeUserDefined _this) {
		Object[] result_pattern_ParameterTypeUserDefined_12_1_binding = pattern_ParameterTypeUserDefined_12_1_bindingFB(_this);
		if (result_pattern_ParameterTypeUserDefined_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParameterTypeUserDefined_12_1_binding[0];

			Object[] result_pattern_ParameterTypeUserDefined_12_1_black = pattern_ParameterTypeUserDefined_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParameterTypeUserDefined_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParameterTypeUserDefined_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParameterTypeUserDefined";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_12_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("tClass");
		EObject _localVariable_1 = match.getObject("tParameter");
		EObject tmpTClass = _localVariable_0;
		EObject tmpTParameter = _localVariable_1;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				return new Object[] { tClass, tParameter, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterTypeUserDefined_12_2_blackBFBFFFB(
			TClass tClass, TParameter tParameter, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ExtendedParameterToTParameter jParameterToTParameter : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tParameter,
						ExtendedParameterToTParameter.class, "target")) {
			ExtendedParameter jParameter = jParameterToTParameter.getSource();
			if (jParameter != null) {
				for (ClassToTClass jClassToTClass : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tClass, ClassToTClass.class,
								"target")) {
					org.emftext.language.java.classifiers.Class jClass = jClassToTClass
							.getSource();
					if (jClass != null) {
						_result.add(new Object[] { tClass, jParameter,
								tParameter, jParameterToTParameter, jClass,
								jClassToTClass, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParameterTypeUserDefined_12_3_blackBBBBBB(
			TClass tClass, ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tClass.equals(tParameter.getTClass())) {
			if (tParameter.equals(jParameterToTParameter.getTarget())) {
				if (jParameter.equals(jParameterToTParameter.getSource())) {
					if (jClass.equals(jClassToTClass.getSource())) {
						if (tClass.equals(jClassToTClass.getTarget())) {
							_result.add(new Object[] { tClass, jParameter,
									tParameter, jParameterToTParameter, jClass,
									jClassToTClass });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_12_3_greenBBBBBBFFFFFF(
			TClass tClass, ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge tParameter__tClass____tClass = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToTParameter__tParameter____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToTParameter__jParameter____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClassToTClass__jClass____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClassToTClass__tClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tParameter__tClass____tClass_name_prime = "tClass";
		String jParameterToTParameter__tParameter____target_name_prime = "target";
		String jParameterToTParameter__jParameter____source_name_prime = "source";
		String jClassToTClass__jClass____source_name_prime = "source";
		String jClassToTClass__tClass____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(jParameter);
		isApplicableMatch.getAllContextElements().add(tParameter);
		isApplicableMatch.getAllContextElements().add(jParameterToTParameter);
		isApplicableMatch.getAllContextElements().add(jClass);
		isApplicableMatch.getAllContextElements().add(jClassToTClass);
		tParameter__tClass____tClass.setSrc(tParameter);
		tParameter__tClass____tClass.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(
				tParameter__tClass____tClass);
		jParameterToTParameter__tParameter____target
				.setSrc(jParameterToTParameter);
		jParameterToTParameter__tParameter____target.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(
				jParameterToTParameter__tParameter____target);
		jParameterToTParameter__jParameter____source
				.setSrc(jParameterToTParameter);
		jParameterToTParameter__jParameter____source.setTrg(jParameter);
		isApplicableMatch.getAllContextElements().add(
				jParameterToTParameter__jParameter____source);
		jClassToTClass__jClass____source.setSrc(jClassToTClass);
		jClassToTClass__jClass____source.setTrg(jClass);
		isApplicableMatch.getAllContextElements().add(
				jClassToTClass__jClass____source);
		jClassToTClass__tClass____target.setSrc(jClassToTClass);
		jClassToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(
				jClassToTClass__tClass____target);
		tParameter__tClass____tClass
				.setName(tParameter__tClass____tClass_name_prime);
		jParameterToTParameter__tParameter____target
				.setName(jParameterToTParameter__tParameter____target_name_prime);
		jParameterToTParameter__jParameter____source
				.setName(jParameterToTParameter__jParameter____source_name_prime);
		jClassToTClass__jClass____source
				.setName(jClassToTClass__jClass____source_name_prime);
		jClassToTClass__tClass____target
				.setName(jClassToTClass__tClass____target_name_prime);
		return new Object[] { tClass, jParameter, tParameter,
				jParameterToTParameter, jClass, jClassToTClass,
				isApplicableMatch, tParameter__tClass____tClass,
				jParameterToTParameter__tParameter____target,
				jParameterToTParameter__jParameter____source,
				jClassToTClass__jClass____source,
				jClassToTClass__tClass____target };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_12_4_bindingFBBBBBBBB(
			ParameterTypeUserDefined _this,
			IsApplicableMatch isApplicableMatch, TClass tClass,
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, tClass, jParameter, tParameter,
				jParameterToTParameter, jClass, jClassToTClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tClass,
					jParameter, tParameter, jParameterToTParameter, jClass,
					jClassToTClass };
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_12_4_bindingAndBlackFBBBBBBBB(
			ParameterTypeUserDefined _this,
			IsApplicableMatch isApplicableMatch, TClass tClass,
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			org.emftext.language.java.classifiers.Class jClass,
			ClassToTClass jClassToTClass) {
		Object[] result_pattern_ParameterTypeUserDefined_12_4_binding = pattern_ParameterTypeUserDefined_12_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, tClass, jParameter, tParameter,
				jParameterToTParameter, jClass, jClassToTClass);
		if (result_pattern_ParameterTypeUserDefined_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterTypeUserDefined_12_4_binding[0];

			Object[] result_pattern_ParameterTypeUserDefined_12_4_black = pattern_ParameterTypeUserDefined_12_4_blackB(csp);
			if (result_pattern_ParameterTypeUserDefined_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tClass,
						jParameter, tParameter, jParameterToTParameter, jClass,
						jClassToTClass };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterTypeUserDefined_12_5_expressionFBB(
			ParameterTypeUserDefined _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParameterTypeUserDefined";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterTypeUserDefined_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_20_1_bindingFB(
			ParameterTypeUserDefined _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_20_1_blackFBB(
			EClass __eClass, ParameterTypeUserDefined _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_20_1_bindingAndBlackFFB(
			ParameterTypeUserDefined _this) {
		Object[] result_pattern_ParameterTypeUserDefined_20_1_binding = pattern_ParameterTypeUserDefined_20_1_bindingFB(_this);
		if (result_pattern_ParameterTypeUserDefined_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterTypeUserDefined_20_1_binding[0];

			Object[] result_pattern_ParameterTypeUserDefined_20_1_black = pattern_ParameterTypeUserDefined_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParameterTypeUserDefined_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterTypeUserDefined_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_20_2_black_nac_0B(
			ExtendedType extendedType) {
		for (ExtendedClassMethod __DEC_extendedType_extendedReturnType_470422 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(extendedType,
						ExtendedClassMethod.class, "extendedReturnType")) {
			return new Object[] { extendedType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_20_2_black_nac_1BB(
			ExtendedType extendedType, ExtendedParameter jParameter) {
		for (ExtendedParameter __DEC_extendedType_extendedParameterType_90823 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(extendedType,
						ExtendedParameter.class, "extendedParameterType")) {
			if (!jParameter
					.equals(__DEC_extendedType_extendedParameterType_90823)) {
				return new Object[] { extendedType, jParameter };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterTypeUserDefined_20_2_blackFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpExtendedType = _edge_type.getSrc();
		if (tmpExtendedType instanceof ExtendedType) {
			ExtendedType extendedType = (ExtendedType) tmpExtendedType;
			EObject tmpJClass = _edge_type.getTrg();
			if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
				org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
				if (jClass.equals(extendedType.getType())) {
					boolean extendedTypeisFromLib = extendedType.isIsFromLib();
					if (Boolean.valueOf(extendedTypeisFromLib).equals(false)) {
						if (pattern_ParameterTypeUserDefined_20_2_black_nac_0B(extendedType) == null) {
							for (ExtendedParameter jParameter : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(extendedType,
											ExtendedParameter.class,
											"extendedParameterType")) {
								if (pattern_ParameterTypeUserDefined_20_2_black_nac_1BB(
										extendedType, jParameter) == null) {
									_result.add(new Object[] { extendedType,
											jParameter, jClass, _edge_type });
								}
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterTypeUserDefined_20_3_expressionFBBBBB(
			ParameterTypeUserDefined _this, Match match,
			ExtendedType extendedType, ExtendedParameter jParameter,
			org.emftext.language.java.classifiers.Class jClass) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, extendedType,
				jParameter, jClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterTypeUserDefined_20_4_expressionFBB(
			ParameterTypeUserDefined _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParameterTypeUserDefined_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_21_1_bindingFB(
			ParameterTypeUserDefined _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_21_1_blackFBB(
			EClass __eClass, ParameterTypeUserDefined _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_21_1_bindingAndBlackFFB(
			ParameterTypeUserDefined _this) {
		Object[] result_pattern_ParameterTypeUserDefined_21_1_binding = pattern_ParameterTypeUserDefined_21_1_bindingFB(_this);
		if (result_pattern_ParameterTypeUserDefined_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterTypeUserDefined_21_1_binding[0];

			Object[] result_pattern_ParameterTypeUserDefined_21_1_black = pattern_ParameterTypeUserDefined_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParameterTypeUserDefined_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterTypeUserDefined_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_21_2_black_nac_0B(
			ExtendedType extendedType) {
		for (ExtendedClassMethod __DEC_extendedType_extendedReturnType_133560 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(extendedType,
						ExtendedClassMethod.class, "extendedReturnType")) {
			return new Object[] { extendedType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_21_2_black_nac_1BB(
			ExtendedType extendedType, ExtendedParameter jParameter) {
		for (ExtendedParameter __DEC_extendedType_extendedParameterType_819857 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(extendedType,
						ExtendedParameter.class, "extendedParameterType")) {
			if (!jParameter
					.equals(__DEC_extendedType_extendedParameterType_819857)) {
				return new Object[] { extendedType, jParameter };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterTypeUserDefined_21_2_blackFFFB(
			EMoflonEdge _edge_extendedParameterType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJParameter = _edge_extendedParameterType.getSrc();
		if (tmpJParameter instanceof ExtendedParameter) {
			ExtendedParameter jParameter = (ExtendedParameter) tmpJParameter;
			EObject tmpExtendedType = _edge_extendedParameterType.getTrg();
			if (tmpExtendedType instanceof ExtendedType) {
				ExtendedType extendedType = (ExtendedType) tmpExtendedType;
				if (extendedType.equals(jParameter.getExtendedParameterType())) {
					Type tmpJClass = extendedType.getType();
					if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
						org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
						boolean extendedTypeisFromLib = extendedType
								.isIsFromLib();
						if (Boolean.valueOf(extendedTypeisFromLib)
								.equals(false)) {
							if (pattern_ParameterTypeUserDefined_21_2_black_nac_0B(extendedType) == null) {
								if (pattern_ParameterTypeUserDefined_21_2_black_nac_1BB(
										extendedType, jParameter) == null) {
									_result.add(new Object[] { extendedType,
											jParameter, jClass,
											_edge_extendedParameterType });
								}
							}
						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterTypeUserDefined_21_3_expressionFBBBBB(
			ParameterTypeUserDefined _this, Match match,
			ExtendedType extendedType, ExtendedParameter jParameter,
			org.emftext.language.java.classifiers.Class jClass) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, extendedType,
				jParameter, jClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterTypeUserDefined_21_4_expressionFBB(
			ParameterTypeUserDefined _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParameterTypeUserDefined_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_22_1_bindingFB(
			ParameterTypeUserDefined _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_22_1_blackFBB(
			EClass __eClass, ParameterTypeUserDefined _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_22_1_bindingAndBlackFFB(
			ParameterTypeUserDefined _this) {
		Object[] result_pattern_ParameterTypeUserDefined_22_1_binding = pattern_ParameterTypeUserDefined_22_1_bindingFB(_this);
		if (result_pattern_ParameterTypeUserDefined_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterTypeUserDefined_22_1_binding[0];

			Object[] result_pattern_ParameterTypeUserDefined_22_1_black = pattern_ParameterTypeUserDefined_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParameterTypeUserDefined_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterTypeUserDefined_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParameterTypeUserDefined_22_2_blackFFB(
			EMoflonEdge _edge_tClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTParameter = _edge_tClass.getSrc();
		if (tmpTParameter instanceof TParameter) {
			TParameter tParameter = (TParameter) tmpTParameter;
			EObject tmpTClass = _edge_tClass.getTrg();
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				if (tClass.equals(tParameter.getTClass())) {
					_result.add(new Object[] { tClass, tParameter, _edge_tClass });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterTypeUserDefined_22_3_expressionFBBBB(
			ParameterTypeUserDefined _this, Match match, TClass tClass,
			TParameter tParameter) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tClass,
				tParameter);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterTypeUserDefined_22_4_expressionFBB(
			ParameterTypeUserDefined _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterTypeUserDefined_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParameterTypeUserDefined_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParameterTypeUserDefined_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParameterTypeUserDefinedImpl
