/**
 */
package GravityTGG.Rules.impl;

import ExtendedJamopp.ExtendedParameter;
import ExtendedJamopp.ExtendedParameterList;

import GravityTGG.ExtendedParameterListToTParameterList;
import GravityTGG.ExtendedParameterToTParameter;

import GravityTGG.Rules.ParameterListLinkFirst;
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
import TypeGraphBasic.TParameterList;

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
 * An implementation of the model object '<em><b>Parameter List Link First</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParameterListLinkFirstImpl extends AbstractRuleImpl implements
		ParameterListLinkFirst {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterListLinkFirstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getParameterListLinkFirst();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ExtendedParameter jParameter,
			ExtendedParameterList jParameterList) {
		// initial bindings
		Object[] result1_black = ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_0_1_blackBBBB(this, match,
						jParameter, jParameterList);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_0_2_bindingAndBlackFBBBB(this,
						match, jParameter, jParameterList);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParameterListLinkFirstImpl
					.pattern_ParameterListLinkFirst_0_4_blackBBB(match,
							jParameter, jParameterList);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ParameterListLinkFirstImpl
					.pattern_ParameterListLinkFirst_0_4_greenBBBF(match,
							jParameter, jParameterList);
			// EMoflonEdge jParameterList__jParameter____first = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = ParameterListLinkFirstImpl
					.pattern_ParameterListLinkFirst_0_5_blackBBB(match,
							jParameter, jParameterList);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ParameterListLinkFirstImpl
					.pattern_ParameterListLinkFirst_0_5_greenBBB(match,
							jParameter, jParameterList);

			// register objects to match
			ParameterListLinkFirstImpl
					.pattern_ParameterListLinkFirst_0_6_expressionBBBB(this,
							match, jParameter, jParameterList);
			return ParameterListLinkFirstImpl
					.pattern_ParameterListLinkFirst_0_7_expressionF();
		} else {
			return ParameterListLinkFirstImpl
					.pattern_ParameterListLinkFirst_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_1_1_bindingAndBlackFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedParameter jParameter = (ExtendedParameter) result1_bindingAndBlack[0];
		ExtendedParameterList jParameterList = (ExtendedParameterList) result1_bindingAndBlack[1];
		ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) result1_bindingAndBlack[2];
		ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result1_bindingAndBlack[3];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[4];
		TParameterList tParameterList = (TParameterList) result1_bindingAndBlack[5];
		// CSP csp = (CSP) result1_bindingAndBlack[6];
		ParameterListLinkFirstImpl.pattern_ParameterListLinkFirst_1_1_greenBB(
				tParameter, tParameterList);

		// collect translated elements
		Object[] result2_green = ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_1_2_greenF();
		if (result2_green == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_1_3_blackBBBBBBB(ruleresult,
						jParameter, jParameterList,
						jParameterListToTParameterList, jParameterToTParameter,
						tParameter, tParameterList);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_1_3_greenBBBBBFF(ruleresult,
						jParameter, jParameterList, tParameter, tParameterList);
		// EMoflonEdge jParameterList__jParameter____first = (EMoflonEdge) result3_green[5];
		// EMoflonEdge tParameterList__tParameter____first = (EMoflonEdge) result3_green[6];

		// perform postprocessing story node is empty
		// register objects
		ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_1_5_expressionBBBBBBBB(this,
						ruleresult, jParameter, jParameterList,
						jParameterListToTParameterList, jParameterToTParameter,
						tParameter, tParameterList);
		return ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_2_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		ExtendedParameter jParameter = (ExtendedParameter) result2_binding[0];
		ExtendedParameterList jParameterList = (ExtendedParameterList) result2_binding[1];
		for (Object[] result2_black : ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_2_2_blackBBFFFFB(jParameter,
						jParameterList, match)) {
			ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) result2_black[2];
			ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result2_black[3];
			TParameter tParameter = (TParameter) result2_black[4];
			TParameterList tParameterList = (TParameterList) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : ParameterListLinkFirstImpl
					.pattern_ParameterListLinkFirst_2_3_blackBBBBBB(jParameter,
							jParameterList, jParameterListToTParameterList,
							jParameterToTParameter, tParameter, tParameterList)) {
				Object[] result3_green = ParameterListLinkFirstImpl
						.pattern_ParameterListLinkFirst_2_3_greenBBBBBBFFFFFF(
								jParameter, jParameterList,
								jParameterListToTParameterList,
								jParameterToTParameter, tParameter,
								tParameterList);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge jParameterList__jParameter____first = (EMoflonEdge) result3_green[7];
				// EMoflonEdge jParameterListToTParameterList__tParameterList____target = (EMoflonEdge) result3_green[8];
				// EMoflonEdge jParameterListToTParameterList__jParameterList____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge jParameterToTParameter__tParameter____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge jParameterToTParameter__jParameter____source = (EMoflonEdge) result3_green[11];

				// solve CSP
				Object[] result4_bindingAndBlack = ParameterListLinkFirstImpl
						.pattern_ParameterListLinkFirst_2_4_bindingAndBlackFBBBBBBBB(
								this, isApplicableMatch, jParameter,
								jParameterList, jParameterListToTParameterList,
								jParameterToTParameter, tParameter,
								tParameterList);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParameterListLinkFirstImpl
						.pattern_ParameterListLinkFirst_2_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = ParameterListLinkFirstImpl
							.pattern_ParameterListLinkFirst_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ParameterListLinkFirstImpl
							.pattern_ParameterListLinkFirst_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			ExtendedParameter jParameter, ExtendedParameterList jParameterList) {
		match.registerObject("jParameter", jParameter);
		match.registerObject("jParameterList", jParameterList);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			ExtendedParameter jParameter, ExtendedParameterList jParameterList) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(
			IsApplicableMatch isApplicableMatch,
			ExtendedParameter jParameter,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedParameterToTParameter jParameterToTParameter,
			TParameter tParameter, TParameterList tParameterList) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jParameter", jParameter);
		isApplicableMatch.registerObject("jParameterList", jParameterList);
		isApplicableMatch.registerObject("jParameterListToTParameterList",
				jParameterListToTParameterList);
		isApplicableMatch.registerObject("jParameterToTParameter",
				jParameterToTParameter);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("tParameterList", tParameterList);
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
			EObject jParameter, EObject jParameterList,
			EObject jParameterListToTParameterList,
			EObject jParameterToTParameter, EObject tParameter,
			EObject tParameterList) {
		ruleresult.registerObject("jParameter", jParameter);
		ruleresult.registerObject("jParameterList", jParameterList);
		ruleresult.registerObject("jParameterListToTParameterList",
				jParameterListToTParameterList);
		ruleresult.registerObject("jParameterToTParameter",
				jParameterToTParameter);
		ruleresult.registerObject("tParameter", tParameter);
		ruleresult.registerObject("tParameterList", tParameterList);

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
	public boolean isAppropriate_BWD(Match match, TParameter tParameter,
			TParameterList tParameterList) {
		// initial bindings
		Object[] result1_black = ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_10_1_blackBBBB(this, match,
						tParameter, tParameterList);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_10_2_bindingAndBlackFBBBB(this,
						match, tParameter, tParameterList);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParameterListLinkFirstImpl
					.pattern_ParameterListLinkFirst_10_4_blackBBB(match,
							tParameter, tParameterList);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ParameterListLinkFirstImpl
					.pattern_ParameterListLinkFirst_10_4_greenBBBF(match,
							tParameter, tParameterList);
			// EMoflonEdge tParameterList__tParameter____first = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = ParameterListLinkFirstImpl
					.pattern_ParameterListLinkFirst_10_5_blackBBB(match,
							tParameter, tParameterList);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ParameterListLinkFirstImpl
					.pattern_ParameterListLinkFirst_10_5_greenBBB(match,
							tParameter, tParameterList);

			// register objects to match
			ParameterListLinkFirstImpl
					.pattern_ParameterListLinkFirst_10_6_expressionBBBB(this,
							match, tParameter, tParameterList);
			return ParameterListLinkFirstImpl
					.pattern_ParameterListLinkFirst_10_7_expressionF();
		} else {
			return ParameterListLinkFirstImpl
					.pattern_ParameterListLinkFirst_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_11_1_bindingAndBlackFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedParameter jParameter = (ExtendedParameter) result1_bindingAndBlack[0];
		ExtendedParameterList jParameterList = (ExtendedParameterList) result1_bindingAndBlack[1];
		ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) result1_bindingAndBlack[2];
		ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result1_bindingAndBlack[3];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[4];
		TParameterList tParameterList = (TParameterList) result1_bindingAndBlack[5];
		// CSP csp = (CSP) result1_bindingAndBlack[6];
		ParameterListLinkFirstImpl.pattern_ParameterListLinkFirst_11_1_greenBB(
				jParameter, jParameterList);

		// collect translated elements
		Object[] result2_green = ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_11_2_greenF();
		if (result2_green == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_11_3_blackBBBBBBB(ruleresult,
						jParameter, jParameterList,
						jParameterListToTParameterList, jParameterToTParameter,
						tParameter, tParameterList);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_11_3_greenBBBBBFF(ruleresult,
						jParameter, jParameterList, tParameter, tParameterList);
		// EMoflonEdge jParameterList__jParameter____first = (EMoflonEdge) result3_green[5];
		// EMoflonEdge tParameterList__tParameter____first = (EMoflonEdge) result3_green[6];

		// perform postprocessing story node is empty
		// register objects
		ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_11_5_expressionBBBBBBBB(this,
						ruleresult, jParameter, jParameterList,
						jParameterListToTParameterList, jParameterToTParameter,
						tParameter, tParameterList);
		return ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		TParameter tParameter = (TParameter) result2_binding[0];
		TParameterList tParameterList = (TParameterList) result2_binding[1];
		for (Object[] result2_black : ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_12_2_blackFFFFBBB(tParameter,
						tParameterList, match)) {
			ExtendedParameter jParameter = (ExtendedParameter) result2_black[0];
			ExtendedParameterList jParameterList = (ExtendedParameterList) result2_black[1];
			ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) result2_black[2];
			ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : ParameterListLinkFirstImpl
					.pattern_ParameterListLinkFirst_12_3_blackBBBBBB(
							jParameter, jParameterList,
							jParameterListToTParameterList,
							jParameterToTParameter, tParameter, tParameterList)) {
				Object[] result3_green = ParameterListLinkFirstImpl
						.pattern_ParameterListLinkFirst_12_3_greenBBBBBBFFFFFF(
								jParameter, jParameterList,
								jParameterListToTParameterList,
								jParameterToTParameter, tParameter,
								tParameterList);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge jParameterListToTParameterList__tParameterList____target = (EMoflonEdge) result3_green[7];
				// EMoflonEdge jParameterListToTParameterList__jParameterList____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge jParameterToTParameter__tParameter____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge jParameterToTParameter__jParameter____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge tParameterList__tParameter____first = (EMoflonEdge) result3_green[11];

				// solve CSP
				Object[] result4_bindingAndBlack = ParameterListLinkFirstImpl
						.pattern_ParameterListLinkFirst_12_4_bindingAndBlackFBBBBBBBB(
								this, isApplicableMatch, jParameter,
								jParameterList, jParameterListToTParameterList,
								jParameterToTParameter, tParameter,
								tParameterList);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParameterListLinkFirstImpl
						.pattern_ParameterListLinkFirst_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ParameterListLinkFirstImpl
							.pattern_ParameterListLinkFirst_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ParameterListLinkFirstImpl
							.pattern_ParameterListLinkFirst_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TParameter tParameter,
			TParameterList tParameterList) {
		match.registerObject("tParameter", tParameter);
		match.registerObject("tParameterList", tParameterList);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TParameter tParameter,
			TParameterList tParameterList) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(
			IsApplicableMatch isApplicableMatch,
			ExtendedParameter jParameter,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedParameterToTParameter jParameterToTParameter,
			TParameter tParameter, TParameterList tParameterList) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jParameter", jParameter);
		isApplicableMatch.registerObject("jParameterList", jParameterList);
		isApplicableMatch.registerObject("jParameterListToTParameterList",
				jParameterListToTParameterList);
		isApplicableMatch.registerObject("jParameterToTParameter",
				jParameterToTParameter);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("tParameterList", tParameterList);
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
			EObject jParameter, EObject jParameterList,
			EObject jParameterListToTParameterList,
			EObject jParameterToTParameter, EObject tParameter,
			EObject tParameterList) {
		ruleresult.registerObject("jParameter", jParameter);
		ruleresult.registerObject("jParameterList", jParameterList);
		ruleresult.registerObject("jParameterListToTParameterList",
				jParameterListToTParameterList);
		ruleresult.registerObject("jParameterToTParameter",
				jParameterToTParameter);
		ruleresult.registerObject("tParameter", tParameter);
		ruleresult.registerObject("tParameterList", tParameterList);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_13(
			EMoflonEdge _edge_first) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_20_2_blackFFB(_edge_first)) {
			ExtendedParameter jParameter = (ExtendedParameter) result2_black[0];
			ExtendedParameterList jParameterList = (ExtendedParameterList) result2_black[1];
			Object[] result2_green = ParameterListLinkFirstImpl
					.pattern_ParameterListLinkFirst_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParameterListLinkFirstImpl
					.pattern_ParameterListLinkFirst_20_3_expressionFBBBB(this,
							match, jParameter, jParameterList)) {
				// Ensure that the correct types of elements are matched
				if (ParameterListLinkFirstImpl
						.pattern_ParameterListLinkFirst_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParameterListLinkFirstImpl
							.pattern_ParameterListLinkFirst_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParameterListLinkFirstImpl
							.pattern_ParameterListLinkFirst_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_18(
			EMoflonEdge _edge_first) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_21_2_blackFFB(_edge_first)) {
			TParameter tParameter = (TParameter) result2_black[0];
			TParameterList tParameterList = (TParameterList) result2_black[1];
			Object[] result2_green = ParameterListLinkFirstImpl
					.pattern_ParameterListLinkFirst_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParameterListLinkFirstImpl
					.pattern_ParameterListLinkFirst_21_3_expressionFBBBB(this,
							match, tParameter, tParameterList)) {
				// Ensure that the correct types of elements are matched
				if (ParameterListLinkFirstImpl
						.pattern_ParameterListLinkFirst_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParameterListLinkFirstImpl
							.pattern_ParameterListLinkFirst_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParameterListLinkFirstImpl
							.pattern_ParameterListLinkFirst_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParameterListLinkFirstImpl
				.pattern_ParameterListLinkFirst_21_6_expressionFB(__result);
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
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___IS_APPROPRIATE_FWD__MATCH_EXTENDEDPARAMETER_EXTENDEDPARAMETERLIST:
			return isAppropriate_FWD((Match) arguments.get(0),
					(ExtendedParameter) arguments.get(1),
					(ExtendedParameterList) arguments.get(2));
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDPARAMETER_EXTENDEDPARAMETERLIST:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(ExtendedParameter) arguments.get(1),
					(ExtendedParameterList) arguments.get(2));
			return null;
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDPARAMETER_EXTENDEDPARAMETERLIST:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(ExtendedParameter) arguments.get(1),
					(ExtendedParameterList) arguments.get(2));
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDPARAMETER_EXTENDEDPARAMETERLIST_EXTENDEDPARAMETERLISTTOTPARAMETERLIST_EXTENDEDPARAMETERTOTPARAMETER_TPARAMETER_TPARAMETERLIST:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedParameter) arguments.get(1),
					(ExtendedParameterList) arguments.get(2),
					(ExtendedParameterListToTParameterList) arguments.get(3),
					(ExtendedParameterToTParameter) arguments.get(4),
					(TParameter) arguments.get(5),
					(TParameterList) arguments.get(6));
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___IS_APPROPRIATE_BWD__MATCH_TPARAMETER_TPARAMETERLIST:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TParameter) arguments.get(1),
					(TParameterList) arguments.get(2));
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPARAMETER_TPARAMETERLIST:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TParameter) arguments.get(1),
					(TParameterList) arguments.get(2));
			return null;
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPARAMETER_TPARAMETERLIST:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TParameter) arguments.get(1),
					(TParameterList) arguments.get(2));
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXTENDEDPARAMETER_EXTENDEDPARAMETERLIST_EXTENDEDPARAMETERLISTTOTPARAMETERLIST_EXTENDEDPARAMETERTOTPARAMETER_TPARAMETER_TPARAMETERLIST:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedParameter) arguments.get(1),
					(ExtendedParameterList) arguments.get(2),
					(ExtendedParameterListToTParameterList) arguments.get(3),
					(ExtendedParameterToTParameter) arguments.get(4),
					(TParameter) arguments.get(5),
					(TParameterList) arguments.get(6));
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_13__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_13((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_18__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_18((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARAMETER_LIST_LINK_FIRST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ParameterListLinkFirst_0_1_blackBBBB(
			ParameterListLinkFirst _this, Match match,
			ExtendedParameter jParameter, ExtendedParameterList jParameterList) {
		return new Object[] { _this, match, jParameter, jParameterList };
	}

	public static final Object[] pattern_ParameterListLinkFirst_0_2_bindingFBBBB(
			ParameterListLinkFirst _this, Match match,
			ExtendedParameter jParameter, ExtendedParameterList jParameterList) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				jParameter, jParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jParameter, jParameterList };
		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterListLinkFirst_0_2_bindingAndBlackFBBBB(
			ParameterListLinkFirst _this, Match match,
			ExtendedParameter jParameter, ExtendedParameterList jParameterList) {
		Object[] result_pattern_ParameterListLinkFirst_0_2_binding = pattern_ParameterListLinkFirst_0_2_bindingFBBBB(
				_this, match, jParameter, jParameterList);
		if (result_pattern_ParameterListLinkFirst_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterListLinkFirst_0_2_binding[0];

			Object[] result_pattern_ParameterListLinkFirst_0_2_black = pattern_ParameterListLinkFirst_0_2_blackB(csp);
			if (result_pattern_ParameterListLinkFirst_0_2_black != null) {

				return new Object[] { csp, _this, match, jParameter,
						jParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterListLinkFirst_0_3_expressionFBB(
			ParameterListLinkFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterListLinkFirst_0_4_blackBBB(
			Match match, ExtendedParameter jParameter,
			ExtendedParameterList jParameterList) {
		return new Object[] { match, jParameter, jParameterList };
	}

	public static final Object[] pattern_ParameterListLinkFirst_0_4_greenBBBF(
			Match match, ExtendedParameter jParameter,
			ExtendedParameterList jParameterList) {
		EMoflonEdge jParameterList__jParameter____first = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jParameterList__jParameter____first_name_prime = "first";
		jParameterList__jParameter____first.setSrc(jParameterList);
		jParameterList__jParameter____first.setTrg(jParameter);
		match.getToBeTranslatedEdges().add(jParameterList__jParameter____first);
		jParameterList__jParameter____first
				.setName(jParameterList__jParameter____first_name_prime);
		return new Object[] { match, jParameter, jParameterList,
				jParameterList__jParameter____first };
	}

	public static final Object[] pattern_ParameterListLinkFirst_0_5_blackBBB(
			Match match, ExtendedParameter jParameter,
			ExtendedParameterList jParameterList) {
		return new Object[] { match, jParameter, jParameterList };
	}

	public static final Object[] pattern_ParameterListLinkFirst_0_5_greenBBB(
			Match match, ExtendedParameter jParameter,
			ExtendedParameterList jParameterList) {
		match.getContextNodes().add(jParameter);
		match.getContextNodes().add(jParameterList);
		return new Object[] { match, jParameter, jParameterList };
	}

	public static final void pattern_ParameterListLinkFirst_0_6_expressionBBBB(
			ParameterListLinkFirst _this, Match match,
			ExtendedParameter jParameter, ExtendedParameterList jParameterList) {
		_this.registerObjectsToMatch_FWD(match, jParameter, jParameterList);

	}

	public static final boolean pattern_ParameterListLinkFirst_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterListLinkFirst_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParameterListLinkFirst_1_1_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jParameter");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("jParameterList");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("jParameterListToTParameterList");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("jParameterToTParameter");
		EObject _localVariable_4 = isApplicableMatch.getObject("tParameter");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("tParameterList");
		EObject tmpJParameter = _localVariable_0;
		EObject tmpJParameterList = _localVariable_1;
		EObject tmpJParameterListToTParameterList = _localVariable_2;
		EObject tmpJParameterToTParameter = _localVariable_3;
		EObject tmpTParameter = _localVariable_4;
		EObject tmpTParameterList = _localVariable_5;
		if (tmpJParameter instanceof ExtendedParameter) {
			ExtendedParameter jParameter = (ExtendedParameter) tmpJParameter;
			if (tmpJParameterList instanceof ExtendedParameterList) {
				ExtendedParameterList jParameterList = (ExtendedParameterList) tmpJParameterList;
				if (tmpJParameterListToTParameterList instanceof ExtendedParameterListToTParameterList) {
					ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) tmpJParameterListToTParameterList;
					if (tmpJParameterToTParameter instanceof ExtendedParameterToTParameter) {
						ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) tmpJParameterToTParameter;
						if (tmpTParameter instanceof TParameter) {
							TParameter tParameter = (TParameter) tmpTParameter;
							if (tmpTParameterList instanceof TParameterList) {
								TParameterList tParameterList = (TParameterList) tmpTParameterList;
								return new Object[] { jParameter,
										jParameterList,
										jParameterListToTParameterList,
										jParameterToTParameter, tParameter,
										tParameterList, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_1_1_blackBBBBBBFBB(
			ExtendedParameter jParameter,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedParameterToTParameter jParameterToTParameter,
			TParameter tParameter, TParameterList tParameterList,
			ParameterListLinkFirst _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jParameter, jParameterList,
						jParameterListToTParameterList, jParameterToTParameter,
						tParameter, tParameterList, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_1_1_bindingAndBlackFFFFFFFBB(
			ParameterListLinkFirst _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParameterListLinkFirst_1_1_binding = pattern_ParameterListLinkFirst_1_1_bindingFFFFFFB(isApplicableMatch);
		if (result_pattern_ParameterListLinkFirst_1_1_binding != null) {
			ExtendedParameter jParameter = (ExtendedParameter) result_pattern_ParameterListLinkFirst_1_1_binding[0];
			ExtendedParameterList jParameterList = (ExtendedParameterList) result_pattern_ParameterListLinkFirst_1_1_binding[1];
			ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) result_pattern_ParameterListLinkFirst_1_1_binding[2];
			ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result_pattern_ParameterListLinkFirst_1_1_binding[3];
			TParameter tParameter = (TParameter) result_pattern_ParameterListLinkFirst_1_1_binding[4];
			TParameterList tParameterList = (TParameterList) result_pattern_ParameterListLinkFirst_1_1_binding[5];

			Object[] result_pattern_ParameterListLinkFirst_1_1_black = pattern_ParameterListLinkFirst_1_1_blackBBBBBBFBB(
					jParameter, jParameterList, jParameterListToTParameterList,
					jParameterToTParameter, tParameter, tParameterList, _this,
					isApplicableMatch);
			if (result_pattern_ParameterListLinkFirst_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ParameterListLinkFirst_1_1_black[6];

				return new Object[] { jParameter, jParameterList,
						jParameterListToTParameterList, jParameterToTParameter,
						tParameter, tParameterList, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_1_1_greenBB(
			TParameter tParameter, TParameterList tParameterList) {
		tParameterList.setFirst(tParameter);
		return new Object[] { tParameter, tParameterList };
	}

	public static final Object[] pattern_ParameterListLinkFirst_1_2_greenF() {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_ParameterListLinkFirst_1_3_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject jParameter,
			EObject jParameterList, EObject jParameterListToTParameterList,
			EObject jParameterToTParameter, EObject tParameter,
			EObject tParameterList) {
		if (!jParameter.equals(jParameterList)) {
			if (!jParameter.equals(jParameterListToTParameterList)) {
				if (!jParameter.equals(jParameterToTParameter)) {
					if (!jParameter.equals(tParameter)) {
						if (!jParameter.equals(tParameterList)) {
							if (!jParameterList
									.equals(jParameterListToTParameterList)) {
								if (!jParameterList
										.equals(jParameterToTParameter)) {
									if (!jParameterList.equals(tParameter)) {
										if (!jParameterList
												.equals(tParameterList)) {
											if (!jParameterListToTParameterList
													.equals(jParameterToTParameter)) {
												if (!jParameterListToTParameterList
														.equals(tParameter)) {
													if (!jParameterListToTParameterList
															.equals(tParameterList)) {
														if (!jParameterToTParameter
																.equals(tParameter)) {
															if (!jParameterToTParameter
																	.equals(tParameterList)) {
																if (!tParameter
																		.equals(tParameterList)) {
																	return new Object[] {
																			ruleresult,
																			jParameter,
																			jParameterList,
																			jParameterListToTParameterList,
																			jParameterToTParameter,
																			tParameter,
																			tParameterList };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterListLinkFirst_1_3_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject jParameter,
			EObject jParameterList, EObject tParameter, EObject tParameterList) {
		EMoflonEdge jParameterList__jParameter____first = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tParameterList__tParameter____first = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParameterListLinkFirst";
		String jParameterList__jParameter____first_name_prime = "first";
		String tParameterList__tParameter____first_name_prime = "first";
		jParameterList__jParameter____first.setSrc(jParameterList);
		jParameterList__jParameter____first.setTrg(jParameter);
		ruleresult.getTranslatedEdges()
				.add(jParameterList__jParameter____first);
		tParameterList__tParameter____first.setSrc(tParameterList);
		tParameterList__tParameter____first.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(tParameterList__tParameter____first);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jParameterList__jParameter____first
				.setName(jParameterList__jParameter____first_name_prime);
		tParameterList__tParameter____first
				.setName(tParameterList__tParameter____first_name_prime);
		return new Object[] { ruleresult, jParameter, jParameterList,
				tParameter, tParameterList,
				jParameterList__jParameter____first,
				tParameterList__tParameter____first };
	}

	public static final void pattern_ParameterListLinkFirst_1_5_expressionBBBBBBBB(
			ParameterListLinkFirst _this, PerformRuleResult ruleresult,
			EObject jParameter, EObject jParameterList,
			EObject jParameterListToTParameterList,
			EObject jParameterToTParameter, EObject tParameter,
			EObject tParameterList) {
		_this.registerObjects_FWD(ruleresult, jParameter, jParameterList,
				jParameterListToTParameterList, jParameterToTParameter,
				tParameter, tParameterList);

	}

	public static final PerformRuleResult pattern_ParameterListLinkFirst_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterListLinkFirst_2_1_bindingFB(
			ParameterListLinkFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_2_1_blackFBB(
			EClass eClass, ParameterListLinkFirst _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_2_1_bindingAndBlackFFB(
			ParameterListLinkFirst _this) {
		Object[] result_pattern_ParameterListLinkFirst_2_1_binding = pattern_ParameterListLinkFirst_2_1_bindingFB(_this);
		if (result_pattern_ParameterListLinkFirst_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParameterListLinkFirst_2_1_binding[0];

			Object[] result_pattern_ParameterListLinkFirst_2_1_black = pattern_ParameterListLinkFirst_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParameterListLinkFirst_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParameterListLinkFirst_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParameterListLinkFirst";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParameterListLinkFirst_2_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("jParameter");
		EObject _localVariable_1 = match.getObject("jParameterList");
		EObject tmpJParameter = _localVariable_0;
		EObject tmpJParameterList = _localVariable_1;
		if (tmpJParameter instanceof ExtendedParameter) {
			ExtendedParameter jParameter = (ExtendedParameter) tmpJParameter;
			if (tmpJParameterList instanceof ExtendedParameterList) {
				ExtendedParameterList jParameterList = (ExtendedParameterList) tmpJParameterList;
				return new Object[] { jParameter, jParameterList, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterListLinkFirst_2_2_blackBBFFFFB(
			ExtendedParameter jParameter, ExtendedParameterList jParameterList,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ExtendedParameterListToTParameterList jParameterListToTParameterList : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(jParameterList,
						ExtendedParameterListToTParameterList.class, "source")) {
			TParameterList tParameterList = jParameterListToTParameterList
					.getTarget();
			if (tParameterList != null) {
				for (ExtendedParameterToTParameter jParameterToTParameter : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(jParameter,
								ExtendedParameterToTParameter.class, "source")) {
					TParameter tParameter = jParameterToTParameter.getTarget();
					if (tParameter != null) {
						_result.add(new Object[] { jParameter, jParameterList,
								jParameterListToTParameterList,
								jParameterToTParameter, tParameter,
								tParameterList, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParameterListLinkFirst_2_3_blackBBBBBB(
			ExtendedParameter jParameter,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedParameterToTParameter jParameterToTParameter,
			TParameter tParameter, TParameterList tParameterList) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (jParameter.equals(jParameterList.getFirst())) {
			if (tParameterList.equals(jParameterListToTParameterList
					.getTarget())) {
				if (jParameterList.equals(jParameterListToTParameterList
						.getSource())) {
					if (tParameter.equals(jParameterToTParameter.getTarget())) {
						if (jParameter.equals(jParameterToTParameter
								.getSource())) {
							_result.add(new Object[] { jParameter,
									jParameterList,
									jParameterListToTParameterList,
									jParameterToTParameter, tParameter,
									tParameterList });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ParameterListLinkFirst_2_3_greenBBBBBBFFFFFF(
			ExtendedParameter jParameter,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedParameterToTParameter jParameterToTParameter,
			TParameter tParameter, TParameterList tParameterList) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge jParameterList__jParameter____first = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterListToTParameterList__tParameterList____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterListToTParameterList__jParameterList____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToTParameter__tParameter____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToTParameter__jParameter____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jParameterList__jParameter____first_name_prime = "first";
		String jParameterListToTParameterList__tParameterList____target_name_prime = "target";
		String jParameterListToTParameterList__jParameterList____source_name_prime = "source";
		String jParameterToTParameter__tParameter____target_name_prime = "target";
		String jParameterToTParameter__jParameter____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(jParameter);
		isApplicableMatch.getAllContextElements().add(jParameterList);
		isApplicableMatch.getAllContextElements().add(
				jParameterListToTParameterList);
		isApplicableMatch.getAllContextElements().add(jParameterToTParameter);
		isApplicableMatch.getAllContextElements().add(tParameter);
		isApplicableMatch.getAllContextElements().add(tParameterList);
		jParameterList__jParameter____first.setSrc(jParameterList);
		jParameterList__jParameter____first.setTrg(jParameter);
		isApplicableMatch.getAllContextElements().add(
				jParameterList__jParameter____first);
		jParameterListToTParameterList__tParameterList____target
				.setSrc(jParameterListToTParameterList);
		jParameterListToTParameterList__tParameterList____target
				.setTrg(tParameterList);
		isApplicableMatch.getAllContextElements().add(
				jParameterListToTParameterList__tParameterList____target);
		jParameterListToTParameterList__jParameterList____source
				.setSrc(jParameterListToTParameterList);
		jParameterListToTParameterList__jParameterList____source
				.setTrg(jParameterList);
		isApplicableMatch.getAllContextElements().add(
				jParameterListToTParameterList__jParameterList____source);
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
		jParameterList__jParameter____first
				.setName(jParameterList__jParameter____first_name_prime);
		jParameterListToTParameterList__tParameterList____target
				.setName(jParameterListToTParameterList__tParameterList____target_name_prime);
		jParameterListToTParameterList__jParameterList____source
				.setName(jParameterListToTParameterList__jParameterList____source_name_prime);
		jParameterToTParameter__tParameter____target
				.setName(jParameterToTParameter__tParameter____target_name_prime);
		jParameterToTParameter__jParameter____source
				.setName(jParameterToTParameter__jParameter____source_name_prime);
		return new Object[] { jParameter, jParameterList,
				jParameterListToTParameterList, jParameterToTParameter,
				tParameter, tParameterList, isApplicableMatch,
				jParameterList__jParameter____first,
				jParameterListToTParameterList__tParameterList____target,
				jParameterListToTParameterList__jParameterList____source,
				jParameterToTParameter__tParameter____target,
				jParameterToTParameter__jParameter____source };
	}

	public static final Object[] pattern_ParameterListLinkFirst_2_4_bindingFBBBBBBBB(
			ParameterListLinkFirst _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedParameter jParameter,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedParameterToTParameter jParameterToTParameter,
			TParameter tParameter, TParameterList tParameterList) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, jParameter, jParameterList,
				jParameterListToTParameterList, jParameterToTParameter,
				tParameter, tParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jParameter,
					jParameterList, jParameterListToTParameterList,
					jParameterToTParameter, tParameter, tParameterList };
		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterListLinkFirst_2_4_bindingAndBlackFBBBBBBBB(
			ParameterListLinkFirst _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedParameter jParameter,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedParameterToTParameter jParameterToTParameter,
			TParameter tParameter, TParameterList tParameterList) {
		Object[] result_pattern_ParameterListLinkFirst_2_4_binding = pattern_ParameterListLinkFirst_2_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, jParameter, jParameterList,
				jParameterListToTParameterList, jParameterToTParameter,
				tParameter, tParameterList);
		if (result_pattern_ParameterListLinkFirst_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterListLinkFirst_2_4_binding[0];

			Object[] result_pattern_ParameterListLinkFirst_2_4_black = pattern_ParameterListLinkFirst_2_4_blackB(csp);
			if (result_pattern_ParameterListLinkFirst_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						jParameter, jParameterList,
						jParameterListToTParameterList, jParameterToTParameter,
						tParameter, tParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterListLinkFirst_2_5_expressionFBB(
			ParameterListLinkFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterListLinkFirst_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterListLinkFirst_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParameterListLinkFirst";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterListLinkFirst_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterListLinkFirst_10_1_blackBBBB(
			ParameterListLinkFirst _this, Match match, TParameter tParameter,
			TParameterList tParameterList) {
		return new Object[] { _this, match, tParameter, tParameterList };
	}

	public static final Object[] pattern_ParameterListLinkFirst_10_2_bindingFBBBB(
			ParameterListLinkFirst _this, Match match, TParameter tParameter,
			TParameterList tParameterList) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				tParameter, tParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tParameter, tParameterList };
		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterListLinkFirst_10_2_bindingAndBlackFBBBB(
			ParameterListLinkFirst _this, Match match, TParameter tParameter,
			TParameterList tParameterList) {
		Object[] result_pattern_ParameterListLinkFirst_10_2_binding = pattern_ParameterListLinkFirst_10_2_bindingFBBBB(
				_this, match, tParameter, tParameterList);
		if (result_pattern_ParameterListLinkFirst_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterListLinkFirst_10_2_binding[0];

			Object[] result_pattern_ParameterListLinkFirst_10_2_black = pattern_ParameterListLinkFirst_10_2_blackB(csp);
			if (result_pattern_ParameterListLinkFirst_10_2_black != null) {

				return new Object[] { csp, _this, match, tParameter,
						tParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterListLinkFirst_10_3_expressionFBB(
			ParameterListLinkFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterListLinkFirst_10_4_blackBBB(
			Match match, TParameter tParameter, TParameterList tParameterList) {
		return new Object[] { match, tParameter, tParameterList };
	}

	public static final Object[] pattern_ParameterListLinkFirst_10_4_greenBBBF(
			Match match, TParameter tParameter, TParameterList tParameterList) {
		EMoflonEdge tParameterList__tParameter____first = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tParameterList__tParameter____first_name_prime = "first";
		tParameterList__tParameter____first.setSrc(tParameterList);
		tParameterList__tParameter____first.setTrg(tParameter);
		match.getToBeTranslatedEdges().add(tParameterList__tParameter____first);
		tParameterList__tParameter____first
				.setName(tParameterList__tParameter____first_name_prime);
		return new Object[] { match, tParameter, tParameterList,
				tParameterList__tParameter____first };
	}

	public static final Object[] pattern_ParameterListLinkFirst_10_5_blackBBB(
			Match match, TParameter tParameter, TParameterList tParameterList) {
		return new Object[] { match, tParameter, tParameterList };
	}

	public static final Object[] pattern_ParameterListLinkFirst_10_5_greenBBB(
			Match match, TParameter tParameter, TParameterList tParameterList) {
		match.getContextNodes().add(tParameter);
		match.getContextNodes().add(tParameterList);
		return new Object[] { match, tParameter, tParameterList };
	}

	public static final void pattern_ParameterListLinkFirst_10_6_expressionBBBB(
			ParameterListLinkFirst _this, Match match, TParameter tParameter,
			TParameterList tParameterList) {
		_this.registerObjectsToMatch_BWD(match, tParameter, tParameterList);

	}

	public static final boolean pattern_ParameterListLinkFirst_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterListLinkFirst_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParameterListLinkFirst_11_1_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jParameter");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("jParameterList");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("jParameterListToTParameterList");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("jParameterToTParameter");
		EObject _localVariable_4 = isApplicableMatch.getObject("tParameter");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("tParameterList");
		EObject tmpJParameter = _localVariable_0;
		EObject tmpJParameterList = _localVariable_1;
		EObject tmpJParameterListToTParameterList = _localVariable_2;
		EObject tmpJParameterToTParameter = _localVariable_3;
		EObject tmpTParameter = _localVariable_4;
		EObject tmpTParameterList = _localVariable_5;
		if (tmpJParameter instanceof ExtendedParameter) {
			ExtendedParameter jParameter = (ExtendedParameter) tmpJParameter;
			if (tmpJParameterList instanceof ExtendedParameterList) {
				ExtendedParameterList jParameterList = (ExtendedParameterList) tmpJParameterList;
				if (tmpJParameterListToTParameterList instanceof ExtendedParameterListToTParameterList) {
					ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) tmpJParameterListToTParameterList;
					if (tmpJParameterToTParameter instanceof ExtendedParameterToTParameter) {
						ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) tmpJParameterToTParameter;
						if (tmpTParameter instanceof TParameter) {
							TParameter tParameter = (TParameter) tmpTParameter;
							if (tmpTParameterList instanceof TParameterList) {
								TParameterList tParameterList = (TParameterList) tmpTParameterList;
								return new Object[] { jParameter,
										jParameterList,
										jParameterListToTParameterList,
										jParameterToTParameter, tParameter,
										tParameterList, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_11_1_blackBBBBBBFBB(
			ExtendedParameter jParameter,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedParameterToTParameter jParameterToTParameter,
			TParameter tParameter, TParameterList tParameterList,
			ParameterListLinkFirst _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jParameter, jParameterList,
						jParameterListToTParameterList, jParameterToTParameter,
						tParameter, tParameterList, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_11_1_bindingAndBlackFFFFFFFBB(
			ParameterListLinkFirst _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParameterListLinkFirst_11_1_binding = pattern_ParameterListLinkFirst_11_1_bindingFFFFFFB(isApplicableMatch);
		if (result_pattern_ParameterListLinkFirst_11_1_binding != null) {
			ExtendedParameter jParameter = (ExtendedParameter) result_pattern_ParameterListLinkFirst_11_1_binding[0];
			ExtendedParameterList jParameterList = (ExtendedParameterList) result_pattern_ParameterListLinkFirst_11_1_binding[1];
			ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) result_pattern_ParameterListLinkFirst_11_1_binding[2];
			ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result_pattern_ParameterListLinkFirst_11_1_binding[3];
			TParameter tParameter = (TParameter) result_pattern_ParameterListLinkFirst_11_1_binding[4];
			TParameterList tParameterList = (TParameterList) result_pattern_ParameterListLinkFirst_11_1_binding[5];

			Object[] result_pattern_ParameterListLinkFirst_11_1_black = pattern_ParameterListLinkFirst_11_1_blackBBBBBBFBB(
					jParameter, jParameterList, jParameterListToTParameterList,
					jParameterToTParameter, tParameter, tParameterList, _this,
					isApplicableMatch);
			if (result_pattern_ParameterListLinkFirst_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ParameterListLinkFirst_11_1_black[6];

				return new Object[] { jParameter, jParameterList,
						jParameterListToTParameterList, jParameterToTParameter,
						tParameter, tParameterList, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_11_1_greenBB(
			ExtendedParameter jParameter, ExtendedParameterList jParameterList) {
		jParameterList.setFirst(jParameter);
		return new Object[] { jParameter, jParameterList };
	}

	public static final Object[] pattern_ParameterListLinkFirst_11_2_greenF() {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_ParameterListLinkFirst_11_3_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject jParameter,
			EObject jParameterList, EObject jParameterListToTParameterList,
			EObject jParameterToTParameter, EObject tParameter,
			EObject tParameterList) {
		if (!jParameter.equals(jParameterList)) {
			if (!jParameter.equals(jParameterListToTParameterList)) {
				if (!jParameter.equals(jParameterToTParameter)) {
					if (!jParameter.equals(tParameter)) {
						if (!jParameter.equals(tParameterList)) {
							if (!jParameterList
									.equals(jParameterListToTParameterList)) {
								if (!jParameterList
										.equals(jParameterToTParameter)) {
									if (!jParameterList.equals(tParameter)) {
										if (!jParameterList
												.equals(tParameterList)) {
											if (!jParameterListToTParameterList
													.equals(jParameterToTParameter)) {
												if (!jParameterListToTParameterList
														.equals(tParameter)) {
													if (!jParameterListToTParameterList
															.equals(tParameterList)) {
														if (!jParameterToTParameter
																.equals(tParameter)) {
															if (!jParameterToTParameter
																	.equals(tParameterList)) {
																if (!tParameter
																		.equals(tParameterList)) {
																	return new Object[] {
																			ruleresult,
																			jParameter,
																			jParameterList,
																			jParameterListToTParameterList,
																			jParameterToTParameter,
																			tParameter,
																			tParameterList };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterListLinkFirst_11_3_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject jParameter,
			EObject jParameterList, EObject tParameter, EObject tParameterList) {
		EMoflonEdge jParameterList__jParameter____first = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tParameterList__tParameter____first = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParameterListLinkFirst";
		String jParameterList__jParameter____first_name_prime = "first";
		String tParameterList__tParameter____first_name_prime = "first";
		jParameterList__jParameter____first.setSrc(jParameterList);
		jParameterList__jParameter____first.setTrg(jParameter);
		ruleresult.getCreatedEdges().add(jParameterList__jParameter____first);
		tParameterList__tParameter____first.setSrc(tParameterList);
		tParameterList__tParameter____first.setTrg(tParameter);
		ruleresult.getTranslatedEdges()
				.add(tParameterList__tParameter____first);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jParameterList__jParameter____first
				.setName(jParameterList__jParameter____first_name_prime);
		tParameterList__tParameter____first
				.setName(tParameterList__tParameter____first_name_prime);
		return new Object[] { ruleresult, jParameter, jParameterList,
				tParameter, tParameterList,
				jParameterList__jParameter____first,
				tParameterList__tParameter____first };
	}

	public static final void pattern_ParameterListLinkFirst_11_5_expressionBBBBBBBB(
			ParameterListLinkFirst _this, PerformRuleResult ruleresult,
			EObject jParameter, EObject jParameterList,
			EObject jParameterListToTParameterList,
			EObject jParameterToTParameter, EObject tParameter,
			EObject tParameterList) {
		_this.registerObjects_BWD(ruleresult, jParameter, jParameterList,
				jParameterListToTParameterList, jParameterToTParameter,
				tParameter, tParameterList);

	}

	public static final PerformRuleResult pattern_ParameterListLinkFirst_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterListLinkFirst_12_1_bindingFB(
			ParameterListLinkFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_12_1_blackFBB(
			EClass eClass, ParameterListLinkFirst _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_12_1_bindingAndBlackFFB(
			ParameterListLinkFirst _this) {
		Object[] result_pattern_ParameterListLinkFirst_12_1_binding = pattern_ParameterListLinkFirst_12_1_bindingFB(_this);
		if (result_pattern_ParameterListLinkFirst_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParameterListLinkFirst_12_1_binding[0];

			Object[] result_pattern_ParameterListLinkFirst_12_1_black = pattern_ParameterListLinkFirst_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParameterListLinkFirst_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParameterListLinkFirst_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParameterListLinkFirst";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParameterListLinkFirst_12_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("tParameter");
		EObject _localVariable_1 = match.getObject("tParameterList");
		EObject tmpTParameter = _localVariable_0;
		EObject tmpTParameterList = _localVariable_1;
		if (tmpTParameter instanceof TParameter) {
			TParameter tParameter = (TParameter) tmpTParameter;
			if (tmpTParameterList instanceof TParameterList) {
				TParameterList tParameterList = (TParameterList) tmpTParameterList;
				return new Object[] { tParameter, tParameterList, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterListLinkFirst_12_2_blackFFFFBBB(
			TParameter tParameter, TParameterList tParameterList, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ExtendedParameterListToTParameterList jParameterListToTParameterList : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tParameterList,
						ExtendedParameterListToTParameterList.class, "target")) {
			ExtendedParameterList jParameterList = jParameterListToTParameterList
					.getSource();
			if (jParameterList != null) {
				for (ExtendedParameterToTParameter jParameterToTParameter : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tParameter,
								ExtendedParameterToTParameter.class, "target")) {
					ExtendedParameter jParameter = jParameterToTParameter
							.getSource();
					if (jParameter != null) {
						_result.add(new Object[] { jParameter, jParameterList,
								jParameterListToTParameterList,
								jParameterToTParameter, tParameter,
								tParameterList, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParameterListLinkFirst_12_3_blackBBBBBB(
			ExtendedParameter jParameter,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedParameterToTParameter jParameterToTParameter,
			TParameter tParameter, TParameterList tParameterList) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tParameterList.equals(jParameterListToTParameterList.getTarget())) {
			if (jParameterList.equals(jParameterListToTParameterList
					.getSource())) {
				if (tParameter.equals(jParameterToTParameter.getTarget())) {
					if (jParameter.equals(jParameterToTParameter.getSource())) {
						if (tParameter.equals(tParameterList.getFirst())) {
							_result.add(new Object[] { jParameter,
									jParameterList,
									jParameterListToTParameterList,
									jParameterToTParameter, tParameter,
									tParameterList });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ParameterListLinkFirst_12_3_greenBBBBBBFFFFFF(
			ExtendedParameter jParameter,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedParameterToTParameter jParameterToTParameter,
			TParameter tParameter, TParameterList tParameterList) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge jParameterListToTParameterList__tParameterList____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterListToTParameterList__jParameterList____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToTParameter__tParameter____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToTParameter__jParameter____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tParameterList__tParameter____first = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jParameterListToTParameterList__tParameterList____target_name_prime = "target";
		String jParameterListToTParameterList__jParameterList____source_name_prime = "source";
		String jParameterToTParameter__tParameter____target_name_prime = "target";
		String jParameterToTParameter__jParameter____source_name_prime = "source";
		String tParameterList__tParameter____first_name_prime = "first";
		isApplicableMatch.getAllContextElements().add(jParameter);
		isApplicableMatch.getAllContextElements().add(jParameterList);
		isApplicableMatch.getAllContextElements().add(
				jParameterListToTParameterList);
		isApplicableMatch.getAllContextElements().add(jParameterToTParameter);
		isApplicableMatch.getAllContextElements().add(tParameter);
		isApplicableMatch.getAllContextElements().add(tParameterList);
		jParameterListToTParameterList__tParameterList____target
				.setSrc(jParameterListToTParameterList);
		jParameterListToTParameterList__tParameterList____target
				.setTrg(tParameterList);
		isApplicableMatch.getAllContextElements().add(
				jParameterListToTParameterList__tParameterList____target);
		jParameterListToTParameterList__jParameterList____source
				.setSrc(jParameterListToTParameterList);
		jParameterListToTParameterList__jParameterList____source
				.setTrg(jParameterList);
		isApplicableMatch.getAllContextElements().add(
				jParameterListToTParameterList__jParameterList____source);
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
		tParameterList__tParameter____first.setSrc(tParameterList);
		tParameterList__tParameter____first.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(
				tParameterList__tParameter____first);
		jParameterListToTParameterList__tParameterList____target
				.setName(jParameterListToTParameterList__tParameterList____target_name_prime);
		jParameterListToTParameterList__jParameterList____source
				.setName(jParameterListToTParameterList__jParameterList____source_name_prime);
		jParameterToTParameter__tParameter____target
				.setName(jParameterToTParameter__tParameter____target_name_prime);
		jParameterToTParameter__jParameter____source
				.setName(jParameterToTParameter__jParameter____source_name_prime);
		tParameterList__tParameter____first
				.setName(tParameterList__tParameter____first_name_prime);
		return new Object[] { jParameter, jParameterList,
				jParameterListToTParameterList, jParameterToTParameter,
				tParameter, tParameterList, isApplicableMatch,
				jParameterListToTParameterList__tParameterList____target,
				jParameterListToTParameterList__jParameterList____source,
				jParameterToTParameter__tParameter____target,
				jParameterToTParameter__jParameter____source,
				tParameterList__tParameter____first };
	}

	public static final Object[] pattern_ParameterListLinkFirst_12_4_bindingFBBBBBBBB(
			ParameterListLinkFirst _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedParameter jParameter,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedParameterToTParameter jParameterToTParameter,
			TParameter tParameter, TParameterList tParameterList) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, jParameter, jParameterList,
				jParameterListToTParameterList, jParameterToTParameter,
				tParameter, tParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jParameter,
					jParameterList, jParameterListToTParameterList,
					jParameterToTParameter, tParameter, tParameterList };
		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterListLinkFirst_12_4_bindingAndBlackFBBBBBBBB(
			ParameterListLinkFirst _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedParameter jParameter,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedParameterToTParameter jParameterToTParameter,
			TParameter tParameter, TParameterList tParameterList) {
		Object[] result_pattern_ParameterListLinkFirst_12_4_binding = pattern_ParameterListLinkFirst_12_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, jParameter, jParameterList,
				jParameterListToTParameterList, jParameterToTParameter,
				tParameter, tParameterList);
		if (result_pattern_ParameterListLinkFirst_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterListLinkFirst_12_4_binding[0];

			Object[] result_pattern_ParameterListLinkFirst_12_4_black = pattern_ParameterListLinkFirst_12_4_blackB(csp);
			if (result_pattern_ParameterListLinkFirst_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						jParameter, jParameterList,
						jParameterListToTParameterList, jParameterToTParameter,
						tParameter, tParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterListLinkFirst_12_5_expressionFBB(
			ParameterListLinkFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterListLinkFirst_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterListLinkFirst_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParameterListLinkFirst";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterListLinkFirst_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterListLinkFirst_20_1_bindingFB(
			ParameterListLinkFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_20_1_blackFBB(
			EClass __eClass, ParameterListLinkFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_20_1_bindingAndBlackFFB(
			ParameterListLinkFirst _this) {
		Object[] result_pattern_ParameterListLinkFirst_20_1_binding = pattern_ParameterListLinkFirst_20_1_bindingFB(_this);
		if (result_pattern_ParameterListLinkFirst_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterListLinkFirst_20_1_binding[0];

			Object[] result_pattern_ParameterListLinkFirst_20_1_black = pattern_ParameterListLinkFirst_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParameterListLinkFirst_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterListLinkFirst_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParameterListLinkFirst_20_2_blackFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJParameterList = _edge_first.getSrc();
		if (tmpJParameterList instanceof ExtendedParameterList) {
			ExtendedParameterList jParameterList = (ExtendedParameterList) tmpJParameterList;
			EObject tmpJParameter = _edge_first.getTrg();
			if (tmpJParameter instanceof ExtendedParameter) {
				ExtendedParameter jParameter = (ExtendedParameter) tmpJParameter;
				if (jParameter.equals(jParameterList.getFirst())) {
					_result.add(new Object[] { jParameter, jParameterList,
							_edge_first });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParameterListLinkFirst_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterListLinkFirst_20_3_expressionFBBBB(
			ParameterListLinkFirst _this, Match match,
			ExtendedParameter jParameter, ExtendedParameterList jParameterList) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jParameter,
				jParameterList);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterListLinkFirst_20_4_expressionFBB(
			ParameterListLinkFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterListLinkFirst_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParameterListLinkFirst_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParameterListLinkFirst_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterListLinkFirst_21_1_bindingFB(
			ParameterListLinkFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_21_1_blackFBB(
			EClass __eClass, ParameterListLinkFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_21_1_bindingAndBlackFFB(
			ParameterListLinkFirst _this) {
		Object[] result_pattern_ParameterListLinkFirst_21_1_binding = pattern_ParameterListLinkFirst_21_1_bindingFB(_this);
		if (result_pattern_ParameterListLinkFirst_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterListLinkFirst_21_1_binding[0];

			Object[] result_pattern_ParameterListLinkFirst_21_1_black = pattern_ParameterListLinkFirst_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParameterListLinkFirst_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterListLinkFirst_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterListLinkFirst_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParameterListLinkFirst_21_2_blackFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTParameterList = _edge_first.getSrc();
		if (tmpTParameterList instanceof TParameterList) {
			TParameterList tParameterList = (TParameterList) tmpTParameterList;
			EObject tmpTParameter = _edge_first.getTrg();
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				if (tParameter.equals(tParameterList.getFirst())) {
					_result.add(new Object[] { tParameter, tParameterList,
							_edge_first });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParameterListLinkFirst_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterListLinkFirst_21_3_expressionFBBBB(
			ParameterListLinkFirst _this, Match match, TParameter tParameter,
			TParameterList tParameterList) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tParameter,
				tParameterList);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterListLinkFirst_21_4_expressionFBB(
			ParameterListLinkFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterListLinkFirst_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParameterListLinkFirst_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParameterListLinkFirst_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParameterListLinkFirstImpl
