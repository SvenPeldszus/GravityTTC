/**
 */
package GravityTGG.Rules.impl;

import ExtendedJamopp.ExtendedParameter;

import GravityTGG.ExtendedParameterToTParameter;

import GravityTGG.Rules.ParameterLinkListNext;
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

import TypeGraphBasic.TParameter;

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
 * An implementation of the model object '<em><b>Parameter Link List Next</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParameterLinkListNextImpl extends AbstractRuleImpl implements
		ParameterLinkListNext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterLinkListNextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getParameterLinkListNext();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			ExtendedParameter jNextParameter, ExtendedParameter jParameter) {
		// initial bindings
		Object[] result1_black = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_0_1_blackBBBB(this, match,
						jNextParameter, jParameter);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_0_2_bindingAndBlackFBBBB(this,
						match, jNextParameter, jParameter);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_0_4_blackBBB(match,
							jNextParameter, jParameter);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_0_4_greenBBBFF(match,
							jNextParameter, jParameter);
			// EMoflonEdge jParameter__jNextParameter____next = (EMoflonEdge) result4_green[3];
			// EMoflonEdge jNextParameter__jParameter____previous = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_0_5_blackBBB(match,
							jNextParameter, jParameter);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_0_5_greenBBB(match,
							jNextParameter, jParameter);

			// register objects to match
			ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_0_6_expressionBBBB(this,
							match, jNextParameter, jParameter);
			return ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_0_7_expressionF();
		} else {
			return ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_1_1_bindingAndBlackFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedParameter jNextParameter = (ExtendedParameter) result1_bindingAndBlack[0];
		ExtendedParameter jParameter = (ExtendedParameter) result1_bindingAndBlack[1];
		ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result1_bindingAndBlack[2];
		ExtendedParameterToTParameter nextPArameterToTnextPArameter = (ExtendedParameterToTParameter) result1_bindingAndBlack[3];
		TParameter tNextParameter = (TParameter) result1_bindingAndBlack[4];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[5];
		// CSP csp = (CSP) result1_bindingAndBlack[6];
		ParameterLinkListNextImpl.pattern_ParameterLinkListNext_1_1_greenBB(
				tNextParameter, tParameter);

		// collect translated elements
		Object[] result2_green = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_1_2_greenF();
		if (result2_green == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_1_3_blackBBBBBBB(ruleresult,
						jNextParameter, jParameter, jParameterToTParameter,
						nextPArameterToTnextPArameter, tNextParameter,
						tParameter);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_1_3_greenBBBBBFFFF(ruleresult,
						jNextParameter, jParameter, tNextParameter, tParameter);
		// EMoflonEdge jParameter__jNextParameter____next = (EMoflonEdge) result3_green[5];
		// EMoflonEdge jNextParameter__jParameter____previous = (EMoflonEdge) result3_green[6];
		// EMoflonEdge tParameter__tNextParameter____next = (EMoflonEdge) result3_green[7];
		// EMoflonEdge tNextParameter__tParameter____previous = (EMoflonEdge) result3_green[8];

		// perform postprocessing story node is empty
		// register objects
		ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_1_5_expressionBBBBBBBB(this,
						ruleresult, jNextParameter, jParameter,
						jParameterToTParameter, nextPArameterToTnextPArameter,
						tNextParameter, tParameter);
		return ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_2_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		ExtendedParameter jNextParameter = (ExtendedParameter) result2_binding[0];
		ExtendedParameter jParameter = (ExtendedParameter) result2_binding[1];
		for (Object[] result2_black : ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_2_2_blackBBFFFFB(jNextParameter,
						jParameter, match)) {
			ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result2_black[2];
			ExtendedParameterToTParameter nextPArameterToTnextPArameter = (ExtendedParameterToTParameter) result2_black[3];
			TParameter tNextParameter = (TParameter) result2_black[4];
			TParameter tParameter = (TParameter) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_2_3_blackBBBBBB(
							jNextParameter, jParameter, jParameterToTParameter,
							nextPArameterToTnextPArameter, tNextParameter,
							tParameter)) {
				Object[] result3_green = ParameterLinkListNextImpl
						.pattern_ParameterLinkListNext_2_3_greenBBBBBBFFFFFFF(
								jNextParameter, jParameter,
								jParameterToTParameter,
								nextPArameterToTnextPArameter, tNextParameter,
								tParameter);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge jParameter__jNextParameter____next = (EMoflonEdge) result3_green[7];
				// EMoflonEdge jNextParameter__jParameter____previous = (EMoflonEdge) result3_green[8];
				// EMoflonEdge jParameterToTParameter__tParameter____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge jParameterToTParameter__jParameter____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge nextPArameterToTnextPArameter__tNextParameter____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge nextPArameterToTnextPArameter__jNextParameter____source = (EMoflonEdge) result3_green[12];

				// solve CSP
				Object[] result4_bindingAndBlack = ParameterLinkListNextImpl
						.pattern_ParameterLinkListNext_2_4_bindingAndBlackFBBBBBBBB(
								this, isApplicableMatch, jNextParameter,
								jParameter, jParameterToTParameter,
								nextPArameterToTnextPArameter, tNextParameter,
								tParameter);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParameterLinkListNextImpl
						.pattern_ParameterLinkListNext_2_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = ParameterLinkListNextImpl
							.pattern_ParameterLinkListNext_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ParameterLinkListNextImpl
							.pattern_ParameterLinkListNext_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			ExtendedParameter jNextParameter, ExtendedParameter jParameter) {
		match.registerObject("jNextParameter", jNextParameter);
		match.registerObject("jParameter", jParameter);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			ExtendedParameter jNextParameter, ExtendedParameter jParameter) {// Create CSP
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
			ExtendedParameter jNextParameter, ExtendedParameter jParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			ExtendedParameterToTParameter nextPArameterToTnextPArameter,
			TParameter tNextParameter, TParameter tParameter) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jNextParameter", jNextParameter);
		isApplicableMatch.registerObject("jParameter", jParameter);
		isApplicableMatch.registerObject("jParameterToTParameter",
				jParameterToTParameter);
		isApplicableMatch.registerObject("nextPArameterToTnextPArameter",
				nextPArameterToTnextPArameter);
		isApplicableMatch.registerObject("tNextParameter", tNextParameter);
		isApplicableMatch.registerObject("tParameter", tParameter);
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
			EObject jNextParameter, EObject jParameter,
			EObject jParameterToTParameter,
			EObject nextPArameterToTnextPArameter, EObject tNextParameter,
			EObject tParameter) {
		ruleresult.registerObject("jNextParameter", jNextParameter);
		ruleresult.registerObject("jParameter", jParameter);
		ruleresult.registerObject("jParameterToTParameter",
				jParameterToTParameter);
		ruleresult.registerObject("nextPArameterToTnextPArameter",
				nextPArameterToTnextPArameter);
		ruleresult.registerObject("tNextParameter", tNextParameter);
		ruleresult.registerObject("tParameter", tParameter);

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
	public boolean isAppropriate_BWD(Match match, TParameter tNextParameter,
			TParameter tParameter) {
		// initial bindings
		Object[] result1_black = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_10_1_blackBBBB(this, match,
						tNextParameter, tParameter);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_10_2_bindingAndBlackFBBBB(this,
						match, tNextParameter, tParameter);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_10_4_blackBBB(match,
							tNextParameter, tParameter);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_10_4_greenBBBFF(match,
							tNextParameter, tParameter);
			// EMoflonEdge tParameter__tNextParameter____next = (EMoflonEdge) result4_green[3];
			// EMoflonEdge tNextParameter__tParameter____previous = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_10_5_blackBBB(match,
							tNextParameter, tParameter);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_10_5_greenBBB(match,
							tNextParameter, tParameter);

			// register objects to match
			ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_10_6_expressionBBBB(this,
							match, tNextParameter, tParameter);
			return ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_10_7_expressionF();
		} else {
			return ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_11_1_bindingAndBlackFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedParameter jNextParameter = (ExtendedParameter) result1_bindingAndBlack[0];
		ExtendedParameter jParameter = (ExtendedParameter) result1_bindingAndBlack[1];
		ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result1_bindingAndBlack[2];
		ExtendedParameterToTParameter nextPArameterToTnextPArameter = (ExtendedParameterToTParameter) result1_bindingAndBlack[3];
		TParameter tNextParameter = (TParameter) result1_bindingAndBlack[4];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[5];
		// CSP csp = (CSP) result1_bindingAndBlack[6];
		ParameterLinkListNextImpl.pattern_ParameterLinkListNext_11_1_greenBB(
				jNextParameter, jParameter);

		// collect translated elements
		Object[] result2_green = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_11_2_greenF();
		if (result2_green == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_11_3_blackBBBBBBB(ruleresult,
						jNextParameter, jParameter, jParameterToTParameter,
						nextPArameterToTnextPArameter, tNextParameter,
						tParameter);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_11_3_greenBBBBBFFFF(ruleresult,
						jNextParameter, jParameter, tNextParameter, tParameter);
		// EMoflonEdge jParameter__jNextParameter____next = (EMoflonEdge) result3_green[5];
		// EMoflonEdge jNextParameter__jParameter____previous = (EMoflonEdge) result3_green[6];
		// EMoflonEdge tParameter__tNextParameter____next = (EMoflonEdge) result3_green[7];
		// EMoflonEdge tNextParameter__tParameter____previous = (EMoflonEdge) result3_green[8];

		// perform postprocessing story node is empty
		// register objects
		ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_11_5_expressionBBBBBBBB(this,
						ruleresult, jNextParameter, jParameter,
						jParameterToTParameter, nextPArameterToTnextPArameter,
						tNextParameter, tParameter);
		return ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		TParameter tNextParameter = (TParameter) result2_binding[0];
		TParameter tParameter = (TParameter) result2_binding[1];
		for (Object[] result2_black : ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_12_2_blackFFFFBBB(
						tNextParameter, tParameter, match)) {
			ExtendedParameter jNextParameter = (ExtendedParameter) result2_black[0];
			ExtendedParameter jParameter = (ExtendedParameter) result2_black[1];
			ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result2_black[2];
			ExtendedParameterToTParameter nextPArameterToTnextPArameter = (ExtendedParameterToTParameter) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_12_3_blackBBBBBB(
							jNextParameter, jParameter, jParameterToTParameter,
							nextPArameterToTnextPArameter, tNextParameter,
							tParameter)) {
				Object[] result3_green = ParameterLinkListNextImpl
						.pattern_ParameterLinkListNext_12_3_greenBBBBBBFFFFFFF(
								jNextParameter, jParameter,
								jParameterToTParameter,
								nextPArameterToTnextPArameter, tNextParameter,
								tParameter);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge jParameterToTParameter__tParameter____target = (EMoflonEdge) result3_green[7];
				// EMoflonEdge jParameterToTParameter__jParameter____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge nextPArameterToTnextPArameter__tNextParameter____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge nextPArameterToTnextPArameter__jNextParameter____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge tParameter__tNextParameter____next = (EMoflonEdge) result3_green[11];
				// EMoflonEdge tNextParameter__tParameter____previous = (EMoflonEdge) result3_green[12];

				// solve CSP
				Object[] result4_bindingAndBlack = ParameterLinkListNextImpl
						.pattern_ParameterLinkListNext_12_4_bindingAndBlackFBBBBBBBB(
								this, isApplicableMatch, jNextParameter,
								jParameter, jParameterToTParameter,
								nextPArameterToTnextPArameter, tNextParameter,
								tParameter);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParameterLinkListNextImpl
						.pattern_ParameterLinkListNext_12_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = ParameterLinkListNextImpl
							.pattern_ParameterLinkListNext_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ParameterLinkListNextImpl
							.pattern_ParameterLinkListNext_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			TParameter tNextParameter, TParameter tParameter) {
		match.registerObject("tNextParameter", tNextParameter);
		match.registerObject("tParameter", tParameter);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			TParameter tNextParameter, TParameter tParameter) {// Create CSP
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
			ExtendedParameter jNextParameter, ExtendedParameter jParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			ExtendedParameterToTParameter nextPArameterToTnextPArameter,
			TParameter tNextParameter, TParameter tParameter) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jNextParameter", jNextParameter);
		isApplicableMatch.registerObject("jParameter", jParameter);
		isApplicableMatch.registerObject("jParameterToTParameter",
				jParameterToTParameter);
		isApplicableMatch.registerObject("nextPArameterToTnextPArameter",
				nextPArameterToTnextPArameter);
		isApplicableMatch.registerObject("tNextParameter", tNextParameter);
		isApplicableMatch.registerObject("tParameter", tParameter);
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
			EObject jNextParameter, EObject jParameter,
			EObject jParameterToTParameter,
			EObject nextPArameterToTnextPArameter, EObject tNextParameter,
			EObject tParameter) {
		ruleresult.registerObject("jNextParameter", jNextParameter);
		ruleresult.registerObject("jParameter", jParameter);
		ruleresult.registerObject("jParameterToTParameter",
				jParameterToTParameter);
		ruleresult.registerObject("nextPArameterToTnextPArameter",
				nextPArameterToTnextPArameter);
		ruleresult.registerObject("tNextParameter", tNextParameter);
		ruleresult.registerObject("tParameter", tParameter);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_18(
			EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_20_2_blackFFB(_edge_next)) {
			ExtendedParameter jNextParameter = (ExtendedParameter) result2_black[0];
			ExtendedParameter jParameter = (ExtendedParameter) result2_black[1];
			Object[] result2_green = ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_20_3_expressionFBBBB(this,
							match, jNextParameter, jParameter)) {
				// Ensure that the correct types of elements are matched
				if (ParameterLinkListNextImpl
						.pattern_ParameterLinkListNext_20_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ParameterLinkListNextImpl
							.pattern_ParameterLinkListNext_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParameterLinkListNextImpl
							.pattern_ParameterLinkListNext_20_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_19(
			EMoflonEdge _edge_previous) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_21_2_blackFFB(_edge_previous)) {
			ExtendedParameter jNextParameter = (ExtendedParameter) result2_black[0];
			ExtendedParameter jParameter = (ExtendedParameter) result2_black[1];
			Object[] result2_green = ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_21_3_expressionFBBBB(this,
							match, jNextParameter, jParameter)) {
				// Ensure that the correct types of elements are matched
				if (ParameterLinkListNextImpl
						.pattern_ParameterLinkListNext_21_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ParameterLinkListNextImpl
							.pattern_ParameterLinkListNext_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParameterLinkListNextImpl
							.pattern_ParameterLinkListNext_21_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_22(
			EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_22_2_blackFFB(_edge_next)) {
			TParameter tNextParameter = (TParameter) result2_black[0];
			TParameter tParameter = (TParameter) result2_black[1];
			Object[] result2_green = ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_22_3_expressionFBBBB(this,
							match, tNextParameter, tParameter)) {
				// Ensure that the correct types of elements are matched
				if (ParameterLinkListNextImpl
						.pattern_ParameterLinkListNext_22_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ParameterLinkListNextImpl
							.pattern_ParameterLinkListNext_22_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParameterLinkListNextImpl
							.pattern_ParameterLinkListNext_22_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_23(
			EMoflonEdge _edge_previous) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_23_2_blackFFB(_edge_previous)) {
			TParameter tNextParameter = (TParameter) result2_black[0];
			TParameter tParameter = (TParameter) result2_black[1];
			Object[] result2_green = ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParameterLinkListNextImpl
					.pattern_ParameterLinkListNext_23_3_expressionFBBBB(this,
							match, tNextParameter, tParameter)) {
				// Ensure that the correct types of elements are matched
				if (ParameterLinkListNextImpl
						.pattern_ParameterLinkListNext_23_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ParameterLinkListNextImpl
							.pattern_ParameterLinkListNext_23_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParameterLinkListNextImpl
							.pattern_ParameterLinkListNext_23_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParameterLinkListNextImpl
				.pattern_ParameterLinkListNext_23_6_expressionFB(__result);
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
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___IS_APPROPRIATE_FWD__MATCH_EXTENDEDPARAMETER_EXTENDEDPARAMETER:
			return isAppropriate_FWD((Match) arguments.get(0),
					(ExtendedParameter) arguments.get(1),
					(ExtendedParameter) arguments.get(2));
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDPARAMETER_EXTENDEDPARAMETER:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(ExtendedParameter) arguments.get(1),
					(ExtendedParameter) arguments.get(2));
			return null;
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDPARAMETER_EXTENDEDPARAMETER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(ExtendedParameter) arguments.get(1),
					(ExtendedParameter) arguments.get(2));
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDPARAMETER_EXTENDEDPARAMETER_EXTENDEDPARAMETERTOTPARAMETER_EXTENDEDPARAMETERTOTPARAMETER_TPARAMETER_TPARAMETER:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedParameter) arguments.get(1),
					(ExtendedParameter) arguments.get(2),
					(ExtendedParameterToTParameter) arguments.get(3),
					(ExtendedParameterToTParameter) arguments.get(4),
					(TParameter) arguments.get(5),
					(TParameter) arguments.get(6));
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___IS_APPROPRIATE_BWD__MATCH_TPARAMETER_TPARAMETER:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TParameter) arguments.get(1),
					(TParameter) arguments.get(2));
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPARAMETER_TPARAMETER:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TParameter) arguments.get(1),
					(TParameter) arguments.get(2));
			return null;
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPARAMETER_TPARAMETER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TParameter) arguments.get(1),
					(TParameter) arguments.get(2));
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXTENDEDPARAMETER_EXTENDEDPARAMETER_EXTENDEDPARAMETERTOTPARAMETER_EXTENDEDPARAMETERTOTPARAMETER_TPARAMETER_TPARAMETER:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedParameter) arguments.get(1),
					(ExtendedParameter) arguments.get(2),
					(ExtendedParameterToTParameter) arguments.get(3),
					(ExtendedParameterToTParameter) arguments.get(4),
					(TParameter) arguments.get(5),
					(TParameter) arguments.get(6));
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_18__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_18((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_19__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_19((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_22__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_22((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_23__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_23((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARAMETER_LINK_LIST_NEXT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ParameterLinkListNext_0_1_blackBBBB(
			ParameterLinkListNext _this, Match match,
			ExtendedParameter jNextParameter, ExtendedParameter jParameter) {
		if (!jNextParameter.equals(jParameter)) {
			return new Object[] { _this, match, jNextParameter, jParameter };
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_0_2_bindingFBBBB(
			ParameterLinkListNext _this, Match match,
			ExtendedParameter jNextParameter, ExtendedParameter jParameter) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				jNextParameter, jParameter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jNextParameter, jParameter };
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterLinkListNext_0_2_bindingAndBlackFBBBB(
			ParameterLinkListNext _this, Match match,
			ExtendedParameter jNextParameter, ExtendedParameter jParameter) {
		Object[] result_pattern_ParameterLinkListNext_0_2_binding = pattern_ParameterLinkListNext_0_2_bindingFBBBB(
				_this, match, jNextParameter, jParameter);
		if (result_pattern_ParameterLinkListNext_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterLinkListNext_0_2_binding[0];

			Object[] result_pattern_ParameterLinkListNext_0_2_black = pattern_ParameterLinkListNext_0_2_blackB(csp);
			if (result_pattern_ParameterLinkListNext_0_2_black != null) {

				return new Object[] { csp, _this, match, jNextParameter,
						jParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterLinkListNext_0_3_expressionFBB(
			ParameterLinkListNext _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterLinkListNext_0_4_blackBBB(
			Match match, ExtendedParameter jNextParameter,
			ExtendedParameter jParameter) {
		if (!jNextParameter.equals(jParameter)) {
			return new Object[] { match, jNextParameter, jParameter };
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_0_4_greenBBBFF(
			Match match, ExtendedParameter jNextParameter,
			ExtendedParameter jParameter) {
		EMoflonEdge jParameter__jNextParameter____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jNextParameter__jParameter____previous = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jParameter__jNextParameter____next_name_prime = "next";
		String jNextParameter__jParameter____previous_name_prime = "previous";
		jParameter__jNextParameter____next.setSrc(jParameter);
		jParameter__jNextParameter____next.setTrg(jNextParameter);
		match.getToBeTranslatedEdges().add(jParameter__jNextParameter____next);
		jNextParameter__jParameter____previous.setSrc(jNextParameter);
		jNextParameter__jParameter____previous.setTrg(jParameter);
		match.getToBeTranslatedEdges().add(
				jNextParameter__jParameter____previous);
		jParameter__jNextParameter____next
				.setName(jParameter__jNextParameter____next_name_prime);
		jNextParameter__jParameter____previous
				.setName(jNextParameter__jParameter____previous_name_prime);
		return new Object[] { match, jNextParameter, jParameter,
				jParameter__jNextParameter____next,
				jNextParameter__jParameter____previous };
	}

	public static final Object[] pattern_ParameterLinkListNext_0_5_blackBBB(
			Match match, ExtendedParameter jNextParameter,
			ExtendedParameter jParameter) {
		if (!jNextParameter.equals(jParameter)) {
			return new Object[] { match, jNextParameter, jParameter };
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_0_5_greenBBB(
			Match match, ExtendedParameter jNextParameter,
			ExtendedParameter jParameter) {
		match.getContextNodes().add(jNextParameter);
		match.getContextNodes().add(jParameter);
		return new Object[] { match, jNextParameter, jParameter };
	}

	public static final void pattern_ParameterLinkListNext_0_6_expressionBBBB(
			ParameterLinkListNext _this, Match match,
			ExtendedParameter jNextParameter, ExtendedParameter jParameter) {
		_this.registerObjectsToMatch_FWD(match, jNextParameter, jParameter);

	}

	public static final boolean pattern_ParameterLinkListNext_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterLinkListNext_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParameterLinkListNext_1_1_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("jNextParameter");
		EObject _localVariable_1 = isApplicableMatch.getObject("jParameter");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("jParameterToTParameter");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("nextPArameterToTnextPArameter");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("tNextParameter");
		EObject _localVariable_5 = isApplicableMatch.getObject("tParameter");
		EObject tmpJNextParameter = _localVariable_0;
		EObject tmpJParameter = _localVariable_1;
		EObject tmpJParameterToTParameter = _localVariable_2;
		EObject tmpNextPArameterToTnextPArameter = _localVariable_3;
		EObject tmpTNextParameter = _localVariable_4;
		EObject tmpTParameter = _localVariable_5;
		if (tmpJNextParameter instanceof ExtendedParameter) {
			ExtendedParameter jNextParameter = (ExtendedParameter) tmpJNextParameter;
			if (tmpJParameter instanceof ExtendedParameter) {
				ExtendedParameter jParameter = (ExtendedParameter) tmpJParameter;
				if (tmpJParameterToTParameter instanceof ExtendedParameterToTParameter) {
					ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) tmpJParameterToTParameter;
					if (tmpNextPArameterToTnextPArameter instanceof ExtendedParameterToTParameter) {
						ExtendedParameterToTParameter nextPArameterToTnextPArameter = (ExtendedParameterToTParameter) tmpNextPArameterToTnextPArameter;
						if (tmpTNextParameter instanceof TParameter) {
							TParameter tNextParameter = (TParameter) tmpTNextParameter;
							if (tmpTParameter instanceof TParameter) {
								TParameter tParameter = (TParameter) tmpTParameter;
								return new Object[] { jNextParameter,
										jParameter, jParameterToTParameter,
										nextPArameterToTnextPArameter,
										tNextParameter, tParameter,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_1_1_blackBBBBBBFBB(
			ExtendedParameter jNextParameter, ExtendedParameter jParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			ExtendedParameterToTParameter nextPArameterToTnextPArameter,
			TParameter tNextParameter, TParameter tParameter,
			ParameterLinkListNext _this, IsApplicableMatch isApplicableMatch) {
		if (!jNextParameter.equals(jParameter)) {
			if (!jParameterToTParameter.equals(nextPArameterToTnextPArameter)) {
				if (!tNextParameter.equals(tParameter)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { jNextParameter, jParameter,
									jParameterToTParameter,
									nextPArameterToTnextPArameter,
									tNextParameter, tParameter, csp, _this,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_1_1_bindingAndBlackFFFFFFFBB(
			ParameterLinkListNext _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParameterLinkListNext_1_1_binding = pattern_ParameterLinkListNext_1_1_bindingFFFFFFB(isApplicableMatch);
		if (result_pattern_ParameterLinkListNext_1_1_binding != null) {
			ExtendedParameter jNextParameter = (ExtendedParameter) result_pattern_ParameterLinkListNext_1_1_binding[0];
			ExtendedParameter jParameter = (ExtendedParameter) result_pattern_ParameterLinkListNext_1_1_binding[1];
			ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result_pattern_ParameterLinkListNext_1_1_binding[2];
			ExtendedParameterToTParameter nextPArameterToTnextPArameter = (ExtendedParameterToTParameter) result_pattern_ParameterLinkListNext_1_1_binding[3];
			TParameter tNextParameter = (TParameter) result_pattern_ParameterLinkListNext_1_1_binding[4];
			TParameter tParameter = (TParameter) result_pattern_ParameterLinkListNext_1_1_binding[5];

			Object[] result_pattern_ParameterLinkListNext_1_1_black = pattern_ParameterLinkListNext_1_1_blackBBBBBBFBB(
					jNextParameter, jParameter, jParameterToTParameter,
					nextPArameterToTnextPArameter, tNextParameter, tParameter,
					_this, isApplicableMatch);
			if (result_pattern_ParameterLinkListNext_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ParameterLinkListNext_1_1_black[6];

				return new Object[] { jNextParameter, jParameter,
						jParameterToTParameter, nextPArameterToTnextPArameter,
						tNextParameter, tParameter, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_1_1_greenBB(
			TParameter tNextParameter, TParameter tParameter) {
		tParameter.setNext(tNextParameter);
		return new Object[] { tNextParameter, tParameter };
	}

	public static final Object[] pattern_ParameterLinkListNext_1_2_greenF() {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_ParameterLinkListNext_1_3_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject jNextParameter,
			EObject jParameter, EObject jParameterToTParameter,
			EObject nextPArameterToTnextPArameter, EObject tNextParameter,
			EObject tParameter) {
		if (!jNextParameter.equals(jParameter)) {
			if (!jNextParameter.equals(jParameterToTParameter)) {
				if (!jNextParameter.equals(nextPArameterToTnextPArameter)) {
					if (!jNextParameter.equals(tNextParameter)) {
						if (!jNextParameter.equals(tParameter)) {
							if (!jParameter.equals(jParameterToTParameter)) {
								if (!jParameter
										.equals(nextPArameterToTnextPArameter)) {
									if (!jParameter.equals(tNextParameter)) {
										if (!jParameter.equals(tParameter)) {
											if (!jParameterToTParameter
													.equals(nextPArameterToTnextPArameter)) {
												if (!jParameterToTParameter
														.equals(tNextParameter)) {
													if (!jParameterToTParameter
															.equals(tParameter)) {
														if (!nextPArameterToTnextPArameter
																.equals(tNextParameter)) {
															if (!nextPArameterToTnextPArameter
																	.equals(tParameter)) {
																if (!tNextParameter
																		.equals(tParameter)) {
																	return new Object[] {
																			ruleresult,
																			jNextParameter,
																			jParameter,
																			jParameterToTParameter,
																			nextPArameterToTnextPArameter,
																			tNextParameter,
																			tParameter };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterLinkListNext_1_3_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject jNextParameter,
			EObject jParameter, EObject tNextParameter, EObject tParameter) {
		EMoflonEdge jParameter__jNextParameter____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jNextParameter__jParameter____previous = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tParameter__tNextParameter____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tNextParameter__tParameter____previous = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParameterLinkListNext";
		String jParameter__jNextParameter____next_name_prime = "next";
		String jNextParameter__jParameter____previous_name_prime = "previous";
		String tParameter__tNextParameter____next_name_prime = "next";
		String tNextParameter__tParameter____previous_name_prime = "previous";
		jParameter__jNextParameter____next.setSrc(jParameter);
		jParameter__jNextParameter____next.setTrg(jNextParameter);
		ruleresult.getTranslatedEdges().add(jParameter__jNextParameter____next);
		jNextParameter__jParameter____previous.setSrc(jNextParameter);
		jNextParameter__jParameter____previous.setTrg(jParameter);
		ruleresult.getTranslatedEdges().add(
				jNextParameter__jParameter____previous);
		tParameter__tNextParameter____next.setSrc(tParameter);
		tParameter__tNextParameter____next.setTrg(tNextParameter);
		ruleresult.getCreatedEdges().add(tParameter__tNextParameter____next);
		tNextParameter__tParameter____previous.setSrc(tNextParameter);
		tNextParameter__tParameter____previous.setTrg(tParameter);
		ruleresult.getCreatedEdges()
				.add(tNextParameter__tParameter____previous);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jParameter__jNextParameter____next
				.setName(jParameter__jNextParameter____next_name_prime);
		jNextParameter__jParameter____previous
				.setName(jNextParameter__jParameter____previous_name_prime);
		tParameter__tNextParameter____next
				.setName(tParameter__tNextParameter____next_name_prime);
		tNextParameter__tParameter____previous
				.setName(tNextParameter__tParameter____previous_name_prime);
		return new Object[] { ruleresult, jNextParameter, jParameter,
				tNextParameter, tParameter, jParameter__jNextParameter____next,
				jNextParameter__jParameter____previous,
				tParameter__tNextParameter____next,
				tNextParameter__tParameter____previous };
	}

	public static final void pattern_ParameterLinkListNext_1_5_expressionBBBBBBBB(
			ParameterLinkListNext _this, PerformRuleResult ruleresult,
			EObject jNextParameter, EObject jParameter,
			EObject jParameterToTParameter,
			EObject nextPArameterToTnextPArameter, EObject tNextParameter,
			EObject tParameter) {
		_this.registerObjects_FWD(ruleresult, jNextParameter, jParameter,
				jParameterToTParameter, nextPArameterToTnextPArameter,
				tNextParameter, tParameter);

	}

	public static final PerformRuleResult pattern_ParameterLinkListNext_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterLinkListNext_2_1_bindingFB(
			ParameterLinkListNext _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_2_1_blackFBB(
			EClass eClass, ParameterLinkListNext _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_2_1_bindingAndBlackFFB(
			ParameterLinkListNext _this) {
		Object[] result_pattern_ParameterLinkListNext_2_1_binding = pattern_ParameterLinkListNext_2_1_bindingFB(_this);
		if (result_pattern_ParameterLinkListNext_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParameterLinkListNext_2_1_binding[0];

			Object[] result_pattern_ParameterLinkListNext_2_1_black = pattern_ParameterLinkListNext_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParameterLinkListNext_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParameterLinkListNext_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParameterLinkListNext";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParameterLinkListNext_2_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("jNextParameter");
		EObject _localVariable_1 = match.getObject("jParameter");
		EObject tmpJNextParameter = _localVariable_0;
		EObject tmpJParameter = _localVariable_1;
		if (tmpJNextParameter instanceof ExtendedParameter) {
			ExtendedParameter jNextParameter = (ExtendedParameter) tmpJNextParameter;
			if (tmpJParameter instanceof ExtendedParameter) {
				ExtendedParameter jParameter = (ExtendedParameter) tmpJParameter;
				return new Object[] { jNextParameter, jParameter, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterLinkListNext_2_2_blackBBFFFFB(
			ExtendedParameter jNextParameter, ExtendedParameter jParameter,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!jNextParameter.equals(jParameter)) {
			for (ExtendedParameterToTParameter jParameterToTParameter : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(jParameter,
							ExtendedParameterToTParameter.class, "source")) {
				TParameter tParameter = jParameterToTParameter.getTarget();
				if (tParameter != null) {
					for (ExtendedParameterToTParameter nextPArameterToTnextPArameter : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(jNextParameter,
									ExtendedParameterToTParameter.class,
									"source")) {
						if (!jParameterToTParameter
								.equals(nextPArameterToTnextPArameter)) {
							TParameter tNextParameter = nextPArameterToTnextPArameter
									.getTarget();
							if (tNextParameter != null) {
								if (!tNextParameter.equals(tParameter)) {
									_result.add(new Object[] { jNextParameter,
											jParameter, jParameterToTParameter,
											nextPArameterToTnextPArameter,
											tNextParameter, tParameter, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParameterLinkListNext_2_3_blackBBBBBB(
			ExtendedParameter jNextParameter, ExtendedParameter jParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			ExtendedParameterToTParameter nextPArameterToTnextPArameter,
			TParameter tNextParameter, TParameter tParameter) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!jNextParameter.equals(jParameter)) {
			if (!jParameterToTParameter.equals(nextPArameterToTnextPArameter)) {
				if (!tNextParameter.equals(tParameter)) {
					if (jNextParameter.equals(jParameter.getNext())) {
						if (tParameter.equals(jParameterToTParameter
								.getTarget())) {
							if (jParameter.equals(jParameterToTParameter
									.getSource())) {
								if (tNextParameter
										.equals(nextPArameterToTnextPArameter
												.getTarget())) {
									if (jNextParameter
											.equals(nextPArameterToTnextPArameter
													.getSource())) {
										_result.add(new Object[] {
												jNextParameter, jParameter,
												jParameterToTParameter,
												nextPArameterToTnextPArameter,
												tNextParameter, tParameter });
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

	public static final Object[] pattern_ParameterLinkListNext_2_3_greenBBBBBBFFFFFFF(
			ExtendedParameter jNextParameter, ExtendedParameter jParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			ExtendedParameterToTParameter nextPArameterToTnextPArameter,
			TParameter tNextParameter, TParameter tParameter) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge jParameter__jNextParameter____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jNextParameter__jParameter____previous = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToTParameter__tParameter____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToTParameter__jParameter____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge nextPArameterToTnextPArameter__tNextParameter____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge nextPArameterToTnextPArameter__jNextParameter____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jParameter__jNextParameter____next_name_prime = "next";
		String jNextParameter__jParameter____previous_name_prime = "previous";
		String jParameterToTParameter__tParameter____target_name_prime = "target";
		String jParameterToTParameter__jParameter____source_name_prime = "source";
		String nextPArameterToTnextPArameter__tNextParameter____target_name_prime = "target";
		String nextPArameterToTnextPArameter__jNextParameter____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(jNextParameter);
		isApplicableMatch.getAllContextElements().add(jParameter);
		isApplicableMatch.getAllContextElements().add(jParameterToTParameter);
		isApplicableMatch.getAllContextElements().add(
				nextPArameterToTnextPArameter);
		isApplicableMatch.getAllContextElements().add(tNextParameter);
		isApplicableMatch.getAllContextElements().add(tParameter);
		jParameter__jNextParameter____next.setSrc(jParameter);
		jParameter__jNextParameter____next.setTrg(jNextParameter);
		isApplicableMatch.getAllContextElements().add(
				jParameter__jNextParameter____next);
		jNextParameter__jParameter____previous.setSrc(jNextParameter);
		jNextParameter__jParameter____previous.setTrg(jParameter);
		isApplicableMatch.getAllContextElements().add(
				jNextParameter__jParameter____previous);
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
		nextPArameterToTnextPArameter__tNextParameter____target
				.setSrc(nextPArameterToTnextPArameter);
		nextPArameterToTnextPArameter__tNextParameter____target
				.setTrg(tNextParameter);
		isApplicableMatch.getAllContextElements().add(
				nextPArameterToTnextPArameter__tNextParameter____target);
		nextPArameterToTnextPArameter__jNextParameter____source
				.setSrc(nextPArameterToTnextPArameter);
		nextPArameterToTnextPArameter__jNextParameter____source
				.setTrg(jNextParameter);
		isApplicableMatch.getAllContextElements().add(
				nextPArameterToTnextPArameter__jNextParameter____source);
		jParameter__jNextParameter____next
				.setName(jParameter__jNextParameter____next_name_prime);
		jNextParameter__jParameter____previous
				.setName(jNextParameter__jParameter____previous_name_prime);
		jParameterToTParameter__tParameter____target
				.setName(jParameterToTParameter__tParameter____target_name_prime);
		jParameterToTParameter__jParameter____source
				.setName(jParameterToTParameter__jParameter____source_name_prime);
		nextPArameterToTnextPArameter__tNextParameter____target
				.setName(nextPArameterToTnextPArameter__tNextParameter____target_name_prime);
		nextPArameterToTnextPArameter__jNextParameter____source
				.setName(nextPArameterToTnextPArameter__jNextParameter____source_name_prime);
		return new Object[] { jNextParameter, jParameter,
				jParameterToTParameter, nextPArameterToTnextPArameter,
				tNextParameter, tParameter, isApplicableMatch,
				jParameter__jNextParameter____next,
				jNextParameter__jParameter____previous,
				jParameterToTParameter__tParameter____target,
				jParameterToTParameter__jParameter____source,
				nextPArameterToTnextPArameter__tNextParameter____target,
				nextPArameterToTnextPArameter__jNextParameter____source };
	}

	public static final Object[] pattern_ParameterLinkListNext_2_4_bindingFBBBBBBBB(
			ParameterLinkListNext _this, IsApplicableMatch isApplicableMatch,
			ExtendedParameter jNextParameter, ExtendedParameter jParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			ExtendedParameterToTParameter nextPArameterToTnextPArameter,
			TParameter tNextParameter, TParameter tParameter) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, jNextParameter, jParameter,
				jParameterToTParameter, nextPArameterToTnextPArameter,
				tNextParameter, tParameter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					jNextParameter, jParameter, jParameterToTParameter,
					nextPArameterToTnextPArameter, tNextParameter, tParameter };
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterLinkListNext_2_4_bindingAndBlackFBBBBBBBB(
			ParameterLinkListNext _this, IsApplicableMatch isApplicableMatch,
			ExtendedParameter jNextParameter, ExtendedParameter jParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			ExtendedParameterToTParameter nextPArameterToTnextPArameter,
			TParameter tNextParameter, TParameter tParameter) {
		Object[] result_pattern_ParameterLinkListNext_2_4_binding = pattern_ParameterLinkListNext_2_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, jNextParameter, jParameter,
				jParameterToTParameter, nextPArameterToTnextPArameter,
				tNextParameter, tParameter);
		if (result_pattern_ParameterLinkListNext_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterLinkListNext_2_4_binding[0];

			Object[] result_pattern_ParameterLinkListNext_2_4_black = pattern_ParameterLinkListNext_2_4_blackB(csp);
			if (result_pattern_ParameterLinkListNext_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						jNextParameter, jParameter, jParameterToTParameter,
						nextPArameterToTnextPArameter, tNextParameter,
						tParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterLinkListNext_2_5_expressionFBB(
			ParameterLinkListNext _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterLinkListNext_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterLinkListNext_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParameterLinkListNext";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterLinkListNext_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterLinkListNext_10_1_blackBBBB(
			ParameterLinkListNext _this, Match match,
			TParameter tNextParameter, TParameter tParameter) {
		if (!tNextParameter.equals(tParameter)) {
			return new Object[] { _this, match, tNextParameter, tParameter };
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_10_2_bindingFBBBB(
			ParameterLinkListNext _this, Match match,
			TParameter tNextParameter, TParameter tParameter) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				tNextParameter, tParameter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tNextParameter, tParameter };
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterLinkListNext_10_2_bindingAndBlackFBBBB(
			ParameterLinkListNext _this, Match match,
			TParameter tNextParameter, TParameter tParameter) {
		Object[] result_pattern_ParameterLinkListNext_10_2_binding = pattern_ParameterLinkListNext_10_2_bindingFBBBB(
				_this, match, tNextParameter, tParameter);
		if (result_pattern_ParameterLinkListNext_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterLinkListNext_10_2_binding[0];

			Object[] result_pattern_ParameterLinkListNext_10_2_black = pattern_ParameterLinkListNext_10_2_blackB(csp);
			if (result_pattern_ParameterLinkListNext_10_2_black != null) {

				return new Object[] { csp, _this, match, tNextParameter,
						tParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterLinkListNext_10_3_expressionFBB(
			ParameterLinkListNext _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterLinkListNext_10_4_blackBBB(
			Match match, TParameter tNextParameter, TParameter tParameter) {
		if (!tNextParameter.equals(tParameter)) {
			return new Object[] { match, tNextParameter, tParameter };
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_10_4_greenBBBFF(
			Match match, TParameter tNextParameter, TParameter tParameter) {
		EMoflonEdge tParameter__tNextParameter____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tNextParameter__tParameter____previous = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tParameter__tNextParameter____next_name_prime = "next";
		String tNextParameter__tParameter____previous_name_prime = "previous";
		tParameter__tNextParameter____next.setSrc(tParameter);
		tParameter__tNextParameter____next.setTrg(tNextParameter);
		match.getToBeTranslatedEdges().add(tParameter__tNextParameter____next);
		tNextParameter__tParameter____previous.setSrc(tNextParameter);
		tNextParameter__tParameter____previous.setTrg(tParameter);
		match.getToBeTranslatedEdges().add(
				tNextParameter__tParameter____previous);
		tParameter__tNextParameter____next
				.setName(tParameter__tNextParameter____next_name_prime);
		tNextParameter__tParameter____previous
				.setName(tNextParameter__tParameter____previous_name_prime);
		return new Object[] { match, tNextParameter, tParameter,
				tParameter__tNextParameter____next,
				tNextParameter__tParameter____previous };
	}

	public static final Object[] pattern_ParameterLinkListNext_10_5_blackBBB(
			Match match, TParameter tNextParameter, TParameter tParameter) {
		if (!tNextParameter.equals(tParameter)) {
			return new Object[] { match, tNextParameter, tParameter };
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_10_5_greenBBB(
			Match match, TParameter tNextParameter, TParameter tParameter) {
		match.getContextNodes().add(tNextParameter);
		match.getContextNodes().add(tParameter);
		return new Object[] { match, tNextParameter, tParameter };
	}

	public static final void pattern_ParameterLinkListNext_10_6_expressionBBBB(
			ParameterLinkListNext _this, Match match,
			TParameter tNextParameter, TParameter tParameter) {
		_this.registerObjectsToMatch_BWD(match, tNextParameter, tParameter);

	}

	public static final boolean pattern_ParameterLinkListNext_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterLinkListNext_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParameterLinkListNext_11_1_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("jNextParameter");
		EObject _localVariable_1 = isApplicableMatch.getObject("jParameter");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("jParameterToTParameter");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("nextPArameterToTnextPArameter");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("tNextParameter");
		EObject _localVariable_5 = isApplicableMatch.getObject("tParameter");
		EObject tmpJNextParameter = _localVariable_0;
		EObject tmpJParameter = _localVariable_1;
		EObject tmpJParameterToTParameter = _localVariable_2;
		EObject tmpNextPArameterToTnextPArameter = _localVariable_3;
		EObject tmpTNextParameter = _localVariable_4;
		EObject tmpTParameter = _localVariable_5;
		if (tmpJNextParameter instanceof ExtendedParameter) {
			ExtendedParameter jNextParameter = (ExtendedParameter) tmpJNextParameter;
			if (tmpJParameter instanceof ExtendedParameter) {
				ExtendedParameter jParameter = (ExtendedParameter) tmpJParameter;
				if (tmpJParameterToTParameter instanceof ExtendedParameterToTParameter) {
					ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) tmpJParameterToTParameter;
					if (tmpNextPArameterToTnextPArameter instanceof ExtendedParameterToTParameter) {
						ExtendedParameterToTParameter nextPArameterToTnextPArameter = (ExtendedParameterToTParameter) tmpNextPArameterToTnextPArameter;
						if (tmpTNextParameter instanceof TParameter) {
							TParameter tNextParameter = (TParameter) tmpTNextParameter;
							if (tmpTParameter instanceof TParameter) {
								TParameter tParameter = (TParameter) tmpTParameter;
								return new Object[] { jNextParameter,
										jParameter, jParameterToTParameter,
										nextPArameterToTnextPArameter,
										tNextParameter, tParameter,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_11_1_blackBBBBBBFBB(
			ExtendedParameter jNextParameter, ExtendedParameter jParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			ExtendedParameterToTParameter nextPArameterToTnextPArameter,
			TParameter tNextParameter, TParameter tParameter,
			ParameterLinkListNext _this, IsApplicableMatch isApplicableMatch) {
		if (!jNextParameter.equals(jParameter)) {
			if (!jParameterToTParameter.equals(nextPArameterToTnextPArameter)) {
				if (!tNextParameter.equals(tParameter)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { jNextParameter, jParameter,
									jParameterToTParameter,
									nextPArameterToTnextPArameter,
									tNextParameter, tParameter, csp, _this,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_11_1_bindingAndBlackFFFFFFFBB(
			ParameterLinkListNext _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParameterLinkListNext_11_1_binding = pattern_ParameterLinkListNext_11_1_bindingFFFFFFB(isApplicableMatch);
		if (result_pattern_ParameterLinkListNext_11_1_binding != null) {
			ExtendedParameter jNextParameter = (ExtendedParameter) result_pattern_ParameterLinkListNext_11_1_binding[0];
			ExtendedParameter jParameter = (ExtendedParameter) result_pattern_ParameterLinkListNext_11_1_binding[1];
			ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result_pattern_ParameterLinkListNext_11_1_binding[2];
			ExtendedParameterToTParameter nextPArameterToTnextPArameter = (ExtendedParameterToTParameter) result_pattern_ParameterLinkListNext_11_1_binding[3];
			TParameter tNextParameter = (TParameter) result_pattern_ParameterLinkListNext_11_1_binding[4];
			TParameter tParameter = (TParameter) result_pattern_ParameterLinkListNext_11_1_binding[5];

			Object[] result_pattern_ParameterLinkListNext_11_1_black = pattern_ParameterLinkListNext_11_1_blackBBBBBBFBB(
					jNextParameter, jParameter, jParameterToTParameter,
					nextPArameterToTnextPArameter, tNextParameter, tParameter,
					_this, isApplicableMatch);
			if (result_pattern_ParameterLinkListNext_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ParameterLinkListNext_11_1_black[6];

				return new Object[] { jNextParameter, jParameter,
						jParameterToTParameter, nextPArameterToTnextPArameter,
						tNextParameter, tParameter, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_11_1_greenBB(
			ExtendedParameter jNextParameter, ExtendedParameter jParameter) {
		jParameter.setNext(jNextParameter);
		return new Object[] { jNextParameter, jParameter };
	}

	public static final Object[] pattern_ParameterLinkListNext_11_2_greenF() {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_ParameterLinkListNext_11_3_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject jNextParameter,
			EObject jParameter, EObject jParameterToTParameter,
			EObject nextPArameterToTnextPArameter, EObject tNextParameter,
			EObject tParameter) {
		if (!jNextParameter.equals(jParameter)) {
			if (!jNextParameter.equals(jParameterToTParameter)) {
				if (!jNextParameter.equals(nextPArameterToTnextPArameter)) {
					if (!jNextParameter.equals(tNextParameter)) {
						if (!jNextParameter.equals(tParameter)) {
							if (!jParameter.equals(jParameterToTParameter)) {
								if (!jParameter
										.equals(nextPArameterToTnextPArameter)) {
									if (!jParameter.equals(tNextParameter)) {
										if (!jParameter.equals(tParameter)) {
											if (!jParameterToTParameter
													.equals(nextPArameterToTnextPArameter)) {
												if (!jParameterToTParameter
														.equals(tNextParameter)) {
													if (!jParameterToTParameter
															.equals(tParameter)) {
														if (!nextPArameterToTnextPArameter
																.equals(tNextParameter)) {
															if (!nextPArameterToTnextPArameter
																	.equals(tParameter)) {
																if (!tNextParameter
																		.equals(tParameter)) {
																	return new Object[] {
																			ruleresult,
																			jNextParameter,
																			jParameter,
																			jParameterToTParameter,
																			nextPArameterToTnextPArameter,
																			tNextParameter,
																			tParameter };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterLinkListNext_11_3_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject jNextParameter,
			EObject jParameter, EObject tNextParameter, EObject tParameter) {
		EMoflonEdge jParameter__jNextParameter____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jNextParameter__jParameter____previous = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tParameter__tNextParameter____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tNextParameter__tParameter____previous = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParameterLinkListNext";
		String jParameter__jNextParameter____next_name_prime = "next";
		String jNextParameter__jParameter____previous_name_prime = "previous";
		String tParameter__tNextParameter____next_name_prime = "next";
		String tNextParameter__tParameter____previous_name_prime = "previous";
		jParameter__jNextParameter____next.setSrc(jParameter);
		jParameter__jNextParameter____next.setTrg(jNextParameter);
		ruleresult.getCreatedEdges().add(jParameter__jNextParameter____next);
		jNextParameter__jParameter____previous.setSrc(jNextParameter);
		jNextParameter__jParameter____previous.setTrg(jParameter);
		ruleresult.getCreatedEdges()
				.add(jNextParameter__jParameter____previous);
		tParameter__tNextParameter____next.setSrc(tParameter);
		tParameter__tNextParameter____next.setTrg(tNextParameter);
		ruleresult.getTranslatedEdges().add(tParameter__tNextParameter____next);
		tNextParameter__tParameter____previous.setSrc(tNextParameter);
		tNextParameter__tParameter____previous.setTrg(tParameter);
		ruleresult.getTranslatedEdges().add(
				tNextParameter__tParameter____previous);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jParameter__jNextParameter____next
				.setName(jParameter__jNextParameter____next_name_prime);
		jNextParameter__jParameter____previous
				.setName(jNextParameter__jParameter____previous_name_prime);
		tParameter__tNextParameter____next
				.setName(tParameter__tNextParameter____next_name_prime);
		tNextParameter__tParameter____previous
				.setName(tNextParameter__tParameter____previous_name_prime);
		return new Object[] { ruleresult, jNextParameter, jParameter,
				tNextParameter, tParameter, jParameter__jNextParameter____next,
				jNextParameter__jParameter____previous,
				tParameter__tNextParameter____next,
				tNextParameter__tParameter____previous };
	}

	public static final void pattern_ParameterLinkListNext_11_5_expressionBBBBBBBB(
			ParameterLinkListNext _this, PerformRuleResult ruleresult,
			EObject jNextParameter, EObject jParameter,
			EObject jParameterToTParameter,
			EObject nextPArameterToTnextPArameter, EObject tNextParameter,
			EObject tParameter) {
		_this.registerObjects_BWD(ruleresult, jNextParameter, jParameter,
				jParameterToTParameter, nextPArameterToTnextPArameter,
				tNextParameter, tParameter);

	}

	public static final PerformRuleResult pattern_ParameterLinkListNext_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterLinkListNext_12_1_bindingFB(
			ParameterLinkListNext _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_12_1_blackFBB(
			EClass eClass, ParameterLinkListNext _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_12_1_bindingAndBlackFFB(
			ParameterLinkListNext _this) {
		Object[] result_pattern_ParameterLinkListNext_12_1_binding = pattern_ParameterLinkListNext_12_1_bindingFB(_this);
		if (result_pattern_ParameterLinkListNext_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParameterLinkListNext_12_1_binding[0];

			Object[] result_pattern_ParameterLinkListNext_12_1_black = pattern_ParameterLinkListNext_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParameterLinkListNext_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParameterLinkListNext_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParameterLinkListNext";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParameterLinkListNext_12_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("tNextParameter");
		EObject _localVariable_1 = match.getObject("tParameter");
		EObject tmpTNextParameter = _localVariable_0;
		EObject tmpTParameter = _localVariable_1;
		if (tmpTNextParameter instanceof TParameter) {
			TParameter tNextParameter = (TParameter) tmpTNextParameter;
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				return new Object[] { tNextParameter, tParameter, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterLinkListNext_12_2_blackFFFFBBB(
			TParameter tNextParameter, TParameter tParameter, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tNextParameter.equals(tParameter)) {
			for (ExtendedParameterToTParameter jParameterToTParameter : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tParameter,
							ExtendedParameterToTParameter.class, "target")) {
				ExtendedParameter jParameter = jParameterToTParameter
						.getSource();
				if (jParameter != null) {
					for (ExtendedParameterToTParameter nextPArameterToTnextPArameter : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tNextParameter,
									ExtendedParameterToTParameter.class,
									"target")) {
						if (!jParameterToTParameter
								.equals(nextPArameterToTnextPArameter)) {
							ExtendedParameter jNextParameter = nextPArameterToTnextPArameter
									.getSource();
							if (jNextParameter != null) {
								if (!jNextParameter.equals(jParameter)) {
									_result.add(new Object[] { jNextParameter,
											jParameter, jParameterToTParameter,
											nextPArameterToTnextPArameter,
											tNextParameter, tParameter, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParameterLinkListNext_12_3_blackBBBBBB(
			ExtendedParameter jNextParameter, ExtendedParameter jParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			ExtendedParameterToTParameter nextPArameterToTnextPArameter,
			TParameter tNextParameter, TParameter tParameter) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!jNextParameter.equals(jParameter)) {
			if (!jParameterToTParameter.equals(nextPArameterToTnextPArameter)) {
				if (!tNextParameter.equals(tParameter)) {
					if (tParameter.equals(jParameterToTParameter.getTarget())) {
						if (jParameter.equals(jParameterToTParameter
								.getSource())) {
							if (tNextParameter
									.equals(nextPArameterToTnextPArameter
											.getTarget())) {
								if (jNextParameter
										.equals(nextPArameterToTnextPArameter
												.getSource())) {
									if (tNextParameter.equals(tParameter
											.getNext())) {
										_result.add(new Object[] {
												jNextParameter, jParameter,
												jParameterToTParameter,
												nextPArameterToTnextPArameter,
												tNextParameter, tParameter });
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

	public static final Object[] pattern_ParameterLinkListNext_12_3_greenBBBBBBFFFFFFF(
			ExtendedParameter jNextParameter, ExtendedParameter jParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			ExtendedParameterToTParameter nextPArameterToTnextPArameter,
			TParameter tNextParameter, TParameter tParameter) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge jParameterToTParameter__tParameter____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToTParameter__jParameter____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge nextPArameterToTnextPArameter__tNextParameter____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge nextPArameterToTnextPArameter__jNextParameter____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tParameter__tNextParameter____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tNextParameter__tParameter____previous = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jParameterToTParameter__tParameter____target_name_prime = "target";
		String jParameterToTParameter__jParameter____source_name_prime = "source";
		String nextPArameterToTnextPArameter__tNextParameter____target_name_prime = "target";
		String nextPArameterToTnextPArameter__jNextParameter____source_name_prime = "source";
		String tParameter__tNextParameter____next_name_prime = "next";
		String tNextParameter__tParameter____previous_name_prime = "previous";
		isApplicableMatch.getAllContextElements().add(jNextParameter);
		isApplicableMatch.getAllContextElements().add(jParameter);
		isApplicableMatch.getAllContextElements().add(jParameterToTParameter);
		isApplicableMatch.getAllContextElements().add(
				nextPArameterToTnextPArameter);
		isApplicableMatch.getAllContextElements().add(tNextParameter);
		isApplicableMatch.getAllContextElements().add(tParameter);
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
		nextPArameterToTnextPArameter__tNextParameter____target
				.setSrc(nextPArameterToTnextPArameter);
		nextPArameterToTnextPArameter__tNextParameter____target
				.setTrg(tNextParameter);
		isApplicableMatch.getAllContextElements().add(
				nextPArameterToTnextPArameter__tNextParameter____target);
		nextPArameterToTnextPArameter__jNextParameter____source
				.setSrc(nextPArameterToTnextPArameter);
		nextPArameterToTnextPArameter__jNextParameter____source
				.setTrg(jNextParameter);
		isApplicableMatch.getAllContextElements().add(
				nextPArameterToTnextPArameter__jNextParameter____source);
		tParameter__tNextParameter____next.setSrc(tParameter);
		tParameter__tNextParameter____next.setTrg(tNextParameter);
		isApplicableMatch.getAllContextElements().add(
				tParameter__tNextParameter____next);
		tNextParameter__tParameter____previous.setSrc(tNextParameter);
		tNextParameter__tParameter____previous.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(
				tNextParameter__tParameter____previous);
		jParameterToTParameter__tParameter____target
				.setName(jParameterToTParameter__tParameter____target_name_prime);
		jParameterToTParameter__jParameter____source
				.setName(jParameterToTParameter__jParameter____source_name_prime);
		nextPArameterToTnextPArameter__tNextParameter____target
				.setName(nextPArameterToTnextPArameter__tNextParameter____target_name_prime);
		nextPArameterToTnextPArameter__jNextParameter____source
				.setName(nextPArameterToTnextPArameter__jNextParameter____source_name_prime);
		tParameter__tNextParameter____next
				.setName(tParameter__tNextParameter____next_name_prime);
		tNextParameter__tParameter____previous
				.setName(tNextParameter__tParameter____previous_name_prime);
		return new Object[] { jNextParameter, jParameter,
				jParameterToTParameter, nextPArameterToTnextPArameter,
				tNextParameter, tParameter, isApplicableMatch,
				jParameterToTParameter__tParameter____target,
				jParameterToTParameter__jParameter____source,
				nextPArameterToTnextPArameter__tNextParameter____target,
				nextPArameterToTnextPArameter__jNextParameter____source,
				tParameter__tNextParameter____next,
				tNextParameter__tParameter____previous };
	}

	public static final Object[] pattern_ParameterLinkListNext_12_4_bindingFBBBBBBBB(
			ParameterLinkListNext _this, IsApplicableMatch isApplicableMatch,
			ExtendedParameter jNextParameter, ExtendedParameter jParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			ExtendedParameterToTParameter nextPArameterToTnextPArameter,
			TParameter tNextParameter, TParameter tParameter) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, jNextParameter, jParameter,
				jParameterToTParameter, nextPArameterToTnextPArameter,
				tNextParameter, tParameter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					jNextParameter, jParameter, jParameterToTParameter,
					nextPArameterToTnextPArameter, tNextParameter, tParameter };
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterLinkListNext_12_4_bindingAndBlackFBBBBBBBB(
			ParameterLinkListNext _this, IsApplicableMatch isApplicableMatch,
			ExtendedParameter jNextParameter, ExtendedParameter jParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			ExtendedParameterToTParameter nextPArameterToTnextPArameter,
			TParameter tNextParameter, TParameter tParameter) {
		Object[] result_pattern_ParameterLinkListNext_12_4_binding = pattern_ParameterLinkListNext_12_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, jNextParameter, jParameter,
				jParameterToTParameter, nextPArameterToTnextPArameter,
				tNextParameter, tParameter);
		if (result_pattern_ParameterLinkListNext_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterLinkListNext_12_4_binding[0];

			Object[] result_pattern_ParameterLinkListNext_12_4_black = pattern_ParameterLinkListNext_12_4_blackB(csp);
			if (result_pattern_ParameterLinkListNext_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						jNextParameter, jParameter, jParameterToTParameter,
						nextPArameterToTnextPArameter, tNextParameter,
						tParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterLinkListNext_12_5_expressionFBB(
			ParameterLinkListNext _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterLinkListNext_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterLinkListNext_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParameterLinkListNext";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterLinkListNext_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterLinkListNext_20_1_bindingFB(
			ParameterLinkListNext _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_20_1_blackFBB(
			EClass __eClass, ParameterLinkListNext _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_20_1_bindingAndBlackFFB(
			ParameterLinkListNext _this) {
		Object[] result_pattern_ParameterLinkListNext_20_1_binding = pattern_ParameterLinkListNext_20_1_bindingFB(_this);
		if (result_pattern_ParameterLinkListNext_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterLinkListNext_20_1_binding[0];

			Object[] result_pattern_ParameterLinkListNext_20_1_black = pattern_ParameterLinkListNext_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParameterLinkListNext_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterLinkListNext_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParameterLinkListNext_20_2_blackFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJParameter = _edge_next.getSrc();
		if (tmpJParameter instanceof ExtendedParameter) {
			ExtendedParameter jParameter = (ExtendedParameter) tmpJParameter;
			EObject tmpJNextParameter = _edge_next.getTrg();
			if (tmpJNextParameter instanceof ExtendedParameter) {
				ExtendedParameter jNextParameter = (ExtendedParameter) tmpJNextParameter;
				if (!jNextParameter.equals(jParameter)) {
					if (jNextParameter.equals(jParameter.getNext())) {
						_result.add(new Object[] { jNextParameter, jParameter,
								_edge_next });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParameterLinkListNext_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterLinkListNext_20_3_expressionFBBBB(
			ParameterLinkListNext _this, Match match,
			ExtendedParameter jNextParameter, ExtendedParameter jParameter) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				jNextParameter, jParameter);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterLinkListNext_20_4_expressionFBB(
			ParameterLinkListNext _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterLinkListNext_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParameterLinkListNext_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParameterLinkListNext_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterLinkListNext_21_1_bindingFB(
			ParameterLinkListNext _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_21_1_blackFBB(
			EClass __eClass, ParameterLinkListNext _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_21_1_bindingAndBlackFFB(
			ParameterLinkListNext _this) {
		Object[] result_pattern_ParameterLinkListNext_21_1_binding = pattern_ParameterLinkListNext_21_1_bindingFB(_this);
		if (result_pattern_ParameterLinkListNext_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterLinkListNext_21_1_binding[0];

			Object[] result_pattern_ParameterLinkListNext_21_1_black = pattern_ParameterLinkListNext_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParameterLinkListNext_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterLinkListNext_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParameterLinkListNext_21_2_blackFFB(
			EMoflonEdge _edge_previous) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJNextParameter = _edge_previous.getSrc();
		if (tmpJNextParameter instanceof ExtendedParameter) {
			ExtendedParameter jNextParameter = (ExtendedParameter) tmpJNextParameter;
			EObject tmpJParameter = _edge_previous.getTrg();
			if (tmpJParameter instanceof ExtendedParameter) {
				ExtendedParameter jParameter = (ExtendedParameter) tmpJParameter;
				if (!jNextParameter.equals(jParameter)) {
					if (jNextParameter.equals(jParameter.getNext())) {
						_result.add(new Object[] { jNextParameter, jParameter,
								_edge_previous });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParameterLinkListNext_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterLinkListNext_21_3_expressionFBBBB(
			ParameterLinkListNext _this, Match match,
			ExtendedParameter jNextParameter, ExtendedParameter jParameter) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				jNextParameter, jParameter);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterLinkListNext_21_4_expressionFBB(
			ParameterLinkListNext _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterLinkListNext_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParameterLinkListNext_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParameterLinkListNext_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterLinkListNext_22_1_bindingFB(
			ParameterLinkListNext _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_22_1_blackFBB(
			EClass __eClass, ParameterLinkListNext _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_22_1_bindingAndBlackFFB(
			ParameterLinkListNext _this) {
		Object[] result_pattern_ParameterLinkListNext_22_1_binding = pattern_ParameterLinkListNext_22_1_bindingFB(_this);
		if (result_pattern_ParameterLinkListNext_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterLinkListNext_22_1_binding[0];

			Object[] result_pattern_ParameterLinkListNext_22_1_black = pattern_ParameterLinkListNext_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParameterLinkListNext_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterLinkListNext_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParameterLinkListNext_22_2_blackFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTParameter = _edge_next.getSrc();
		if (tmpTParameter instanceof TParameter) {
			TParameter tParameter = (TParameter) tmpTParameter;
			EObject tmpTNextParameter = _edge_next.getTrg();
			if (tmpTNextParameter instanceof TParameter) {
				TParameter tNextParameter = (TParameter) tmpTNextParameter;
				if (!tNextParameter.equals(tParameter)) {
					if (tNextParameter.equals(tParameter.getNext())) {
						_result.add(new Object[] { tNextParameter, tParameter,
								_edge_next });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParameterLinkListNext_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterLinkListNext_22_3_expressionFBBBB(
			ParameterLinkListNext _this, Match match,
			TParameter tNextParameter, TParameter tParameter) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match,
				tNextParameter, tParameter);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterLinkListNext_22_4_expressionFBB(
			ParameterLinkListNext _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterLinkListNext_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParameterLinkListNext_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParameterLinkListNext_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterLinkListNext_23_1_bindingFB(
			ParameterLinkListNext _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_23_1_blackFBB(
			EClass __eClass, ParameterLinkListNext _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_23_1_bindingAndBlackFFB(
			ParameterLinkListNext _this) {
		Object[] result_pattern_ParameterLinkListNext_23_1_binding = pattern_ParameterLinkListNext_23_1_bindingFB(_this);
		if (result_pattern_ParameterLinkListNext_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterLinkListNext_23_1_binding[0];

			Object[] result_pattern_ParameterLinkListNext_23_1_black = pattern_ParameterLinkListNext_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParameterLinkListNext_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterLinkListNext_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterLinkListNext_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParameterLinkListNext_23_2_blackFFB(
			EMoflonEdge _edge_previous) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTNextParameter = _edge_previous.getSrc();
		if (tmpTNextParameter instanceof TParameter) {
			TParameter tNextParameter = (TParameter) tmpTNextParameter;
			EObject tmpTParameter = _edge_previous.getTrg();
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				if (!tNextParameter.equals(tParameter)) {
					if (tNextParameter.equals(tParameter.getNext())) {
						_result.add(new Object[] { tNextParameter, tParameter,
								_edge_previous });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParameterLinkListNext_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterLinkListNext_23_3_expressionFBBBB(
			ParameterLinkListNext _this, Match match,
			TParameter tNextParameter, TParameter tParameter) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match,
				tNextParameter, tParameter);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterLinkListNext_23_4_expressionFBB(
			ParameterLinkListNext _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterLinkListNext_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParameterLinkListNext_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParameterLinkListNext_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParameterLinkListNextImpl
