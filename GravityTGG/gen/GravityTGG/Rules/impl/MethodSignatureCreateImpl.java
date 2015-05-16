/**
 */
package GravityTGG.Rules.impl;

import ExtendedJamopp.ExtendedJamoppFactory;
import ExtendedJamopp.ExtendedParameterList;

import GravityTGG.ExtendedParameterListToTMethodSignature;
import GravityTGG.ExtendedParameterListToTParameterList;
import GravityTGG.GravityTGGFactory;

import GravityTGG.Rules.MethodSignatureCreate;
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

import TypeGraphBasic.TMethodSignature;
import TypeGraphBasic.TParameterList;
import TypeGraphBasic.TypeGraphBasicFactory;

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
 * An implementation of the model object '<em><b>Method Signature Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodSignatureCreateImpl extends AbstractRuleImpl implements
		MethodSignatureCreate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodSignatureCreateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodSignatureCreate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			ExtendedParameterList jParameterList) {
		// initial bindings
		Object[] result1_black = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_0_1_blackBBB(this, match,
						jParameterList);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_0_2_bindingAndBlackFBBB(this,
						match, jParameterList);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodSignatureCreateImpl
					.pattern_MethodSignatureCreate_0_4_blackBB(match,
							jParameterList);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			MethodSignatureCreateImpl
					.pattern_MethodSignatureCreate_0_4_greenBB(match,
							jParameterList);

			// collect context elements
			Object[] result5_black = MethodSignatureCreateImpl
					.pattern_MethodSignatureCreate_0_5_blackBB(match,
							jParameterList);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			// register objects to match
			MethodSignatureCreateImpl
					.pattern_MethodSignatureCreate_0_6_expressionBBB(this,
							match, jParameterList);
			return MethodSignatureCreateImpl
					.pattern_MethodSignatureCreate_0_7_expressionF();
		} else {
			return MethodSignatureCreateImpl
					.pattern_MethodSignatureCreate_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_1_1_bindingAndBlackFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedParameterList jParameterList = (ExtendedParameterList) result1_bindingAndBlack[0];
		// CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_1_1_greenFBFFF(jParameterList);
		ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature = (ExtendedParameterListToTMethodSignature) result1_green[0];
		ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) result1_green[2];
		TMethodSignature tMethodSignature = (TMethodSignature) result1_green[3];
		TParameterList tParameterList = (TParameterList) result1_green[4];

		// collect translated elements
		Object[] result2_black = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_1_2_blackBBBBB(
						jParameterListToTMethodSignature, jParameterList,
						jParameterListToTParameterList, tMethodSignature,
						tParameterList);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_1_2_greenFBBBBB(
						jParameterListToTMethodSignature, jParameterList,
						jParameterListToTParameterList, tMethodSignature,
						tParameterList);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_1_3_blackBBBBBB(ruleresult,
						jParameterListToTMethodSignature, jParameterList,
						jParameterListToTParameterList, tMethodSignature,
						tParameterList);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_1_3_greenBBBBBBFFFFF(ruleresult,
						jParameterListToTMethodSignature, jParameterList,
						jParameterListToTParameterList, tMethodSignature,
						tParameterList);
		// EMoflonEdge jParameterListToTMethodSignature__jParameterList____source = (EMoflonEdge) result3_green[6];
		// EMoflonEdge jParameterListToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[7];
		// EMoflonEdge jParameterListToTParameterList__tParameterList____target = (EMoflonEdge) result3_green[8];
		// EMoflonEdge jParameterListToTParameterList__jParameterList____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge tMethodSignature__tParameterList____paramList = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_1_5_expressionBBBBBBB(this,
						ruleresult, jParameterListToTMethodSignature,
						jParameterList, jParameterListToTParameterList,
						tMethodSignature, tParameterList);
		return MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_2_2_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		ExtendedParameterList jParameterList = (ExtendedParameterList) result2_binding[0];
		for (Object[] result2_black : MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_2_2_blackBB(jParameterList,
						match)) {
			// ForEach find context
			for (Object[] result3_black : MethodSignatureCreateImpl
					.pattern_MethodSignatureCreate_2_3_blackB(jParameterList)) {
				Object[] result3_green = MethodSignatureCreateImpl
						.pattern_MethodSignatureCreate_2_3_greenBF(jParameterList);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodSignatureCreateImpl
						.pattern_MethodSignatureCreate_2_4_bindingAndBlackFBBB(
								this, isApplicableMatch, jParameterList);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodSignatureCreateImpl
						.pattern_MethodSignatureCreate_2_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = MethodSignatureCreateImpl
							.pattern_MethodSignatureCreate_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					MethodSignatureCreateImpl
							.pattern_MethodSignatureCreate_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			ExtendedParameterList jParameterList) {
		match.registerObject("jParameterList", jParameterList);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			ExtendedParameterList jParameterList) {// Create CSP
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
			ExtendedParameterList jParameterList) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jParameterList", jParameterList);
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
			EObject jParameterListToTMethodSignature, EObject jParameterList,
			EObject jParameterListToTParameterList, EObject tMethodSignature,
			EObject tParameterList) {
		ruleresult.registerObject("jParameterListToTMethodSignature",
				jParameterListToTMethodSignature);
		ruleresult.registerObject("jParameterList", jParameterList);
		ruleresult.registerObject("jParameterListToTParameterList",
				jParameterListToTParameterList);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("tParameterList", tParameterList);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match
				.getObject("jParameterList")
				.eClass()
				.equals(ExtendedJamopp.ExtendedJamoppPackage.eINSTANCE
						.getExtendedParameterList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		// initial bindings
		Object[] result1_black = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_10_1_blackBBBB(this, match,
						tMethodSignature, tParameterList);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_10_2_bindingAndBlackFBBBB(this,
						match, tMethodSignature, tParameterList);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodSignatureCreateImpl
					.pattern_MethodSignatureCreate_10_4_blackBBB(match,
							tMethodSignature, tParameterList);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			MethodSignatureCreateImpl
					.pattern_MethodSignatureCreate_10_4_greenBBBF(match,
							tMethodSignature, tParameterList);
			// EMoflonEdge tMethodSignature__tParameterList____paramList = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = MethodSignatureCreateImpl
					.pattern_MethodSignatureCreate_10_5_blackBBB(match,
							tMethodSignature, tParameterList);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			// register objects to match
			MethodSignatureCreateImpl
					.pattern_MethodSignatureCreate_10_6_expressionBBBB(this,
							match, tMethodSignature, tParameterList);
			return MethodSignatureCreateImpl
					.pattern_MethodSignatureCreate_10_7_expressionF();
		} else {
			return MethodSignatureCreateImpl
					.pattern_MethodSignatureCreate_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_11_1_bindingAndBlackFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[0];
		TParameterList tParameterList = (TParameterList) result1_bindingAndBlack[1];
		// CSP csp = (CSP) result1_bindingAndBlack[2];
		Object[] result1_green = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_11_1_greenFFFBB(
						tMethodSignature, tParameterList);
		ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature = (ExtendedParameterListToTMethodSignature) result1_green[0];
		ExtendedParameterList jParameterList = (ExtendedParameterList) result1_green[1];
		ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) result1_green[2];

		// collect translated elements
		Object[] result2_black = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_11_2_blackBBBBB(
						jParameterListToTMethodSignature, jParameterList,
						jParameterListToTParameterList, tMethodSignature,
						tParameterList);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_11_2_greenFBBBBB(
						jParameterListToTMethodSignature, jParameterList,
						jParameterListToTParameterList, tMethodSignature,
						tParameterList);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_11_3_blackBBBBBB(ruleresult,
						jParameterListToTMethodSignature, jParameterList,
						jParameterListToTParameterList, tMethodSignature,
						tParameterList);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_11_3_greenBBBBBBFFFFF(
						ruleresult, jParameterListToTMethodSignature,
						jParameterList, jParameterListToTParameterList,
						tMethodSignature, tParameterList);
		// EMoflonEdge jParameterListToTMethodSignature__jParameterList____source = (EMoflonEdge) result3_green[6];
		// EMoflonEdge jParameterListToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[7];
		// EMoflonEdge jParameterListToTParameterList__tParameterList____target = (EMoflonEdge) result3_green[8];
		// EMoflonEdge jParameterListToTParameterList__jParameterList____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge tMethodSignature__tParameterList____paramList = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_11_5_expressionBBBBBBB(this,
						ruleresult, jParameterListToTMethodSignature,
						jParameterList, jParameterListToTParameterList,
						tMethodSignature, tParameterList);
		return MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		TMethodSignature tMethodSignature = (TMethodSignature) result2_binding[0];
		TParameterList tParameterList = (TParameterList) result2_binding[1];
		for (Object[] result2_black : MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_12_2_blackBBB(tMethodSignature,
						tParameterList, match)) {
			// ForEach find context
			for (Object[] result3_black : MethodSignatureCreateImpl
					.pattern_MethodSignatureCreate_12_3_blackBB(
							tMethodSignature, tParameterList)) {
				Object[] result3_green = MethodSignatureCreateImpl
						.pattern_MethodSignatureCreate_12_3_greenBBFF(
								tMethodSignature, tParameterList);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[2];
				// EMoflonEdge tMethodSignature__tParameterList____paramList = (EMoflonEdge) result3_green[3];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodSignatureCreateImpl
						.pattern_MethodSignatureCreate_12_4_bindingAndBlackFBBBB(
								this, isApplicableMatch, tMethodSignature,
								tParameterList);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodSignatureCreateImpl
						.pattern_MethodSignatureCreate_12_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = MethodSignatureCreateImpl
							.pattern_MethodSignatureCreate_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					MethodSignatureCreateImpl
							.pattern_MethodSignatureCreate_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		match.registerObject("tMethodSignature", tMethodSignature);
		match.registerObject("tParameterList", tParameterList);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {// Create CSP
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
			TMethodSignature tMethodSignature, TParameterList tParameterList) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
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
			EObject jParameterListToTMethodSignature, EObject jParameterList,
			EObject jParameterListToTParameterList, EObject tMethodSignature,
			EObject tParameterList) {
		ruleresult.registerObject("jParameterListToTMethodSignature",
				jParameterListToTMethodSignature);
		ruleresult.registerObject("jParameterList", jParameterList);
		ruleresult.registerObject("jParameterListToTParameterList",
				jParameterListToTParameterList);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("tParameterList", tParameterList);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& match.getObject("tMethodSignature")
						.eClass()
						.equals(TypeGraphBasic.TypeGraphBasicPackage.eINSTANCE
								.getTMethodSignature())
				&& match.getObject("tParameterList")
						.eClass()
						.equals(TypeGraphBasic.TypeGraphBasicPackage.eINSTANCE
								.getTParameterList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_ExtendedParameterList_0(
			ExtendedParameterList jParameterList) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_20_2_blackB(jParameterList)) {
			Object[] result2_green = MethodSignatureCreateImpl
					.pattern_MethodSignatureCreate_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodSignatureCreateImpl
					.pattern_MethodSignatureCreate_20_3_expressionFBBB(this,
							match, jParameterList)) {
				// Ensure that the correct types of elements are matched
				if (MethodSignatureCreateImpl
						.pattern_MethodSignatureCreate_20_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = MethodSignatureCreateImpl
							.pattern_MethodSignatureCreate_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					MethodSignatureCreateImpl
							.pattern_MethodSignatureCreate_20_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_32(
			EMoflonEdge _edge_paramList) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_21_2_blackFFB(_edge_paramList)) {
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[0];
			TParameterList tParameterList = (TParameterList) result2_black[1];
			Object[] result2_green = MethodSignatureCreateImpl
					.pattern_MethodSignatureCreate_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodSignatureCreateImpl
					.pattern_MethodSignatureCreate_21_3_expressionFBBBB(this,
							match, tMethodSignature, tParameterList)) {
				// Ensure that the correct types of elements are matched
				if (MethodSignatureCreateImpl
						.pattern_MethodSignatureCreate_21_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = MethodSignatureCreateImpl
							.pattern_MethodSignatureCreate_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					MethodSignatureCreateImpl
							.pattern_MethodSignatureCreate_21_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return MethodSignatureCreateImpl
				.pattern_MethodSignatureCreate_21_6_expressionFB(__result);
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
		case RulesPackage.METHOD_SIGNATURE_CREATE___IS_APPROPRIATE_FWD__MATCH_EXTENDEDPARAMETERLIST:
			return isAppropriate_FWD((Match) arguments.get(0),
					(ExtendedParameterList) arguments.get(1));
		case RulesPackage.METHOD_SIGNATURE_CREATE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_CREATE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_CREATE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDPARAMETERLIST:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(ExtendedParameterList) arguments.get(1));
			return null;
		case RulesPackage.METHOD_SIGNATURE_CREATE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDPARAMETERLIST:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(ExtendedParameterList) arguments.get(1));
		case RulesPackage.METHOD_SIGNATURE_CREATE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_CREATE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDPARAMETERLIST:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedParameterList) arguments.get(1));
		case RulesPackage.METHOD_SIGNATURE_CREATE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_CREATE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5));
			return null;
		case RulesPackage.METHOD_SIGNATURE_CREATE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_CREATE___IS_APPROPRIATE_BWD__MATCH_TMETHODSIGNATURE_TPARAMETERLIST:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TMethodSignature) arguments.get(1),
					(TParameterList) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE_CREATE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_CREATE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_CREATE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODSIGNATURE_TPARAMETERLIST:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TMethodSignature) arguments.get(1),
					(TParameterList) arguments.get(2));
			return null;
		case RulesPackage.METHOD_SIGNATURE_CREATE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODSIGNATURE_TPARAMETERLIST:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TMethodSignature) arguments.get(1),
					(TParameterList) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE_CREATE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_CREATE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMETHODSIGNATURE_TPARAMETERLIST:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(TMethodSignature) arguments.get(1),
					(TParameterList) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE_CREATE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_CREATE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5));
			return null;
		case RulesPackage.METHOD_SIGNATURE_CREATE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_CREATE___IS_APPROPRIATE_FWD_EXTENDED_PARAMETER_LIST_0__EXTENDEDPARAMETERLIST:
			return isAppropriate_FWD_ExtendedParameterList_0((ExtendedParameterList) arguments
					.get(0));
		case RulesPackage.METHOD_SIGNATURE_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_32__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_32((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.METHOD_SIGNATURE_CREATE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_CREATE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodSignatureCreate_0_1_blackBBB(
			MethodSignatureCreate _this, Match match,
			ExtendedParameterList jParameterList) {
		return new Object[] { _this, match, jParameterList };
	}

	public static final Object[] pattern_MethodSignatureCreate_0_2_bindingFBBB(
			MethodSignatureCreate _this, Match match,
			ExtendedParameterList jParameterList) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				jParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jParameterList };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignatureCreate_0_2_bindingAndBlackFBBB(
			MethodSignatureCreate _this, Match match,
			ExtendedParameterList jParameterList) {
		Object[] result_pattern_MethodSignatureCreate_0_2_binding = pattern_MethodSignatureCreate_0_2_bindingFBBB(
				_this, match, jParameterList);
		if (result_pattern_MethodSignatureCreate_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignatureCreate_0_2_binding[0];

			Object[] result_pattern_MethodSignatureCreate_0_2_black = pattern_MethodSignatureCreate_0_2_blackB(csp);
			if (result_pattern_MethodSignatureCreate_0_2_black != null) {

				return new Object[] { csp, _this, match, jParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureCreate_0_3_expressionFBB(
			MethodSignatureCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureCreate_0_4_blackBB(
			Match match, ExtendedParameterList jParameterList) {
		return new Object[] { match, jParameterList };
	}

	public static final Object[] pattern_MethodSignatureCreate_0_4_greenBB(
			Match match, ExtendedParameterList jParameterList) {
		match.getToBeTranslatedNodes().add(jParameterList);
		return new Object[] { match, jParameterList };
	}

	public static final Object[] pattern_MethodSignatureCreate_0_5_blackBB(
			Match match, ExtendedParameterList jParameterList) {
		return new Object[] { match, jParameterList };
	}

	public static final void pattern_MethodSignatureCreate_0_6_expressionBBB(
			MethodSignatureCreate _this, Match match,
			ExtendedParameterList jParameterList) {
		_this.registerObjectsToMatch_FWD(match, jParameterList);

	}

	public static final boolean pattern_MethodSignatureCreate_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignatureCreate_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureCreate_1_1_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("jParameterList");
		EObject tmpJParameterList = _localVariable_0;
		if (tmpJParameterList instanceof ExtendedParameterList) {
			ExtendedParameterList jParameterList = (ExtendedParameterList) tmpJParameterList;
			return new Object[] { jParameterList, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_1_1_blackBFBB(
			ExtendedParameterList jParameterList, MethodSignatureCreate _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jParameterList, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_1_1_bindingAndBlackFFBB(
			MethodSignatureCreate _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodSignatureCreate_1_1_binding = pattern_MethodSignatureCreate_1_1_bindingFB(isApplicableMatch);
		if (result_pattern_MethodSignatureCreate_1_1_binding != null) {
			ExtendedParameterList jParameterList = (ExtendedParameterList) result_pattern_MethodSignatureCreate_1_1_binding[0];

			Object[] result_pattern_MethodSignatureCreate_1_1_black = pattern_MethodSignatureCreate_1_1_blackBFBB(
					jParameterList, _this, isApplicableMatch);
			if (result_pattern_MethodSignatureCreate_1_1_black != null) {
				CSP csp = (CSP) result_pattern_MethodSignatureCreate_1_1_black[1];

				return new Object[] { jParameterList, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_1_1_greenFBFFF(
			ExtendedParameterList jParameterList) {
		ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature = GravityTGGFactory.eINSTANCE
				.createExtendedParameterListToTMethodSignature();
		ExtendedParameterListToTParameterList jParameterListToTParameterList = GravityTGGFactory.eINSTANCE
				.createExtendedParameterListToTParameterList();
		TMethodSignature tMethodSignature = TypeGraphBasicFactory.eINSTANCE
				.createTMethodSignature();
		TParameterList tParameterList = TypeGraphBasicFactory.eINSTANCE
				.createTParameterList();
		jParameterListToTMethodSignature.setSource(jParameterList);
		jParameterListToTParameterList.setSource(jParameterList);
		jParameterListToTMethodSignature.setTarget(tMethodSignature);
		jParameterListToTParameterList.setTarget(tParameterList);
		tMethodSignature.setParamList(tParameterList);
		return new Object[] { jParameterListToTMethodSignature, jParameterList,
				jParameterListToTParameterList, tMethodSignature,
				tParameterList };
	}

	public static final Object[] pattern_MethodSignatureCreate_1_2_blackBBBBB(
			ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		return new Object[] { jParameterListToTMethodSignature, jParameterList,
				jParameterListToTParameterList, tMethodSignature,
				tParameterList };
	}

	public static final Object[] pattern_MethodSignatureCreate_1_2_greenFBBBBB(
			ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(
				jParameterListToTMethodSignature);
		ruleresult.getTranslatedElements().add(jParameterList);
		ruleresult.getCreatedLinkElements().add(jParameterListToTParameterList);
		ruleresult.getCreatedElements().add(tMethodSignature);
		ruleresult.getCreatedElements().add(tParameterList);
		return new Object[] { ruleresult, jParameterListToTMethodSignature,
				jParameterList, jParameterListToTParameterList,
				tMethodSignature, tParameterList };
	}

	public static final Object[] pattern_MethodSignatureCreate_1_3_blackBBBBBB(
			PerformRuleResult ruleresult,
			EObject jParameterListToTMethodSignature, EObject jParameterList,
			EObject jParameterListToTParameterList, EObject tMethodSignature,
			EObject tParameterList) {
		if (!jParameterListToTMethodSignature
				.equals(jParameterListToTParameterList)) {
			if (!jParameterListToTMethodSignature.equals(tMethodSignature)) {
				if (!jParameterListToTMethodSignature.equals(tParameterList)) {
					if (!jParameterList
							.equals(jParameterListToTMethodSignature)) {
						if (!jParameterList
								.equals(jParameterListToTParameterList)) {
							if (!jParameterList.equals(tMethodSignature)) {
								if (!jParameterList.equals(tParameterList)) {
									if (!jParameterListToTParameterList
											.equals(tMethodSignature)) {
										if (!jParameterListToTParameterList
												.equals(tParameterList)) {
											if (!tMethodSignature
													.equals(tParameterList)) {
												return new Object[] {
														ruleresult,
														jParameterListToTMethodSignature,
														jParameterList,
														jParameterListToTParameterList,
														tMethodSignature,
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
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_1_3_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult,
			EObject jParameterListToTMethodSignature, EObject jParameterList,
			EObject jParameterListToTParameterList, EObject tMethodSignature,
			EObject tParameterList) {
		EMoflonEdge jParameterListToTMethodSignature__jParameterList____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterListToTMethodSignature__tMethodSignature____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterListToTParameterList__tParameterList____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterListToTParameterList__jParameterList____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tParameterList____paramList = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodSignatureCreate";
		String jParameterListToTMethodSignature__jParameterList____source_name_prime = "source";
		String jParameterListToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String jParameterListToTParameterList__tParameterList____target_name_prime = "target";
		String jParameterListToTParameterList__jParameterList____source_name_prime = "source";
		String tMethodSignature__tParameterList____paramList_name_prime = "paramList";
		jParameterListToTMethodSignature__jParameterList____source
				.setSrc(jParameterListToTMethodSignature);
		jParameterListToTMethodSignature__jParameterList____source
				.setTrg(jParameterList);
		ruleresult.getCreatedEdges().add(
				jParameterListToTMethodSignature__jParameterList____source);
		jParameterListToTMethodSignature__tMethodSignature____target
				.setSrc(jParameterListToTMethodSignature);
		jParameterListToTMethodSignature__tMethodSignature____target
				.setTrg(tMethodSignature);
		ruleresult.getCreatedEdges().add(
				jParameterListToTMethodSignature__tMethodSignature____target);
		jParameterListToTParameterList__tParameterList____target
				.setSrc(jParameterListToTParameterList);
		jParameterListToTParameterList__tParameterList____target
				.setTrg(tParameterList);
		ruleresult.getCreatedEdges().add(
				jParameterListToTParameterList__tParameterList____target);
		jParameterListToTParameterList__jParameterList____source
				.setSrc(jParameterListToTParameterList);
		jParameterListToTParameterList__jParameterList____source
				.setTrg(jParameterList);
		ruleresult.getCreatedEdges().add(
				jParameterListToTParameterList__jParameterList____source);
		tMethodSignature__tParameterList____paramList.setSrc(tMethodSignature);
		tMethodSignature__tParameterList____paramList.setTrg(tParameterList);
		ruleresult.getCreatedEdges().add(
				tMethodSignature__tParameterList____paramList);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jParameterListToTMethodSignature__jParameterList____source
				.setName(jParameterListToTMethodSignature__jParameterList____source_name_prime);
		jParameterListToTMethodSignature__tMethodSignature____target
				.setName(jParameterListToTMethodSignature__tMethodSignature____target_name_prime);
		jParameterListToTParameterList__tParameterList____target
				.setName(jParameterListToTParameterList__tParameterList____target_name_prime);
		jParameterListToTParameterList__jParameterList____source
				.setName(jParameterListToTParameterList__jParameterList____source_name_prime);
		tMethodSignature__tParameterList____paramList
				.setName(tMethodSignature__tParameterList____paramList_name_prime);
		return new Object[] { ruleresult, jParameterListToTMethodSignature,
				jParameterList, jParameterListToTParameterList,
				tMethodSignature, tParameterList,
				jParameterListToTMethodSignature__jParameterList____source,
				jParameterListToTMethodSignature__tMethodSignature____target,
				jParameterListToTParameterList__tParameterList____target,
				jParameterListToTParameterList__jParameterList____source,
				tMethodSignature__tParameterList____paramList };
	}

	public static final void pattern_MethodSignatureCreate_1_5_expressionBBBBBBB(
			MethodSignatureCreate _this, PerformRuleResult ruleresult,
			EObject jParameterListToTMethodSignature, EObject jParameterList,
			EObject jParameterListToTParameterList, EObject tMethodSignature,
			EObject tParameterList) {
		_this.registerObjects_FWD(ruleresult, jParameterListToTMethodSignature,
				jParameterList, jParameterListToTParameterList,
				tMethodSignature, tParameterList);

	}

	public static final PerformRuleResult pattern_MethodSignatureCreate_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureCreate_2_1_bindingFB(
			MethodSignatureCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_2_1_blackFBB(
			EClass eClass, MethodSignatureCreate _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_2_1_bindingAndBlackFFB(
			MethodSignatureCreate _this) {
		Object[] result_pattern_MethodSignatureCreate_2_1_binding = pattern_MethodSignatureCreate_2_1_bindingFB(_this);
		if (result_pattern_MethodSignatureCreate_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodSignatureCreate_2_1_binding[0];

			Object[] result_pattern_MethodSignatureCreate_2_1_black = pattern_MethodSignatureCreate_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_MethodSignatureCreate_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodSignatureCreate_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodSignatureCreate";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodSignatureCreate_2_2_bindingFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("jParameterList");
		EObject tmpJParameterList = _localVariable_0;
		if (tmpJParameterList instanceof ExtendedParameterList) {
			ExtendedParameterList jParameterList = (ExtendedParameterList) tmpJParameterList;
			return new Object[] { jParameterList, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignatureCreate_2_2_blackBB(
			ExtendedParameterList jParameterList, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { jParameterList, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodSignatureCreate_2_3_blackB(
			ExtendedParameterList jParameterList) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { jParameterList });
		return _result;
	}

	public static final Object[] pattern_MethodSignatureCreate_2_3_greenBF(
			ExtendedParameterList jParameterList) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(jParameterList);
		return new Object[] { jParameterList, isApplicableMatch };
	}

	public static final Object[] pattern_MethodSignatureCreate_2_4_bindingFBBB(
			MethodSignatureCreate _this, IsApplicableMatch isApplicableMatch,
			ExtendedParameterList jParameterList) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, jParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jParameterList };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignatureCreate_2_4_bindingAndBlackFBBB(
			MethodSignatureCreate _this, IsApplicableMatch isApplicableMatch,
			ExtendedParameterList jParameterList) {
		Object[] result_pattern_MethodSignatureCreate_2_4_binding = pattern_MethodSignatureCreate_2_4_bindingFBBB(
				_this, isApplicableMatch, jParameterList);
		if (result_pattern_MethodSignatureCreate_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignatureCreate_2_4_binding[0];

			Object[] result_pattern_MethodSignatureCreate_2_4_black = pattern_MethodSignatureCreate_2_4_blackB(csp);
			if (result_pattern_MethodSignatureCreate_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						jParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureCreate_2_5_expressionFBB(
			MethodSignatureCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureCreate_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodSignatureCreate_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodSignatureCreate";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodSignatureCreate_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureCreate_10_1_blackBBBB(
			MethodSignatureCreate _this, Match match,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		return new Object[] { _this, match, tMethodSignature, tParameterList };
	}

	public static final Object[] pattern_MethodSignatureCreate_10_2_bindingFBBBB(
			MethodSignatureCreate _this, Match match,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				tMethodSignature, tParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tMethodSignature,
					tParameterList };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignatureCreate_10_2_bindingAndBlackFBBBB(
			MethodSignatureCreate _this, Match match,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		Object[] result_pattern_MethodSignatureCreate_10_2_binding = pattern_MethodSignatureCreate_10_2_bindingFBBBB(
				_this, match, tMethodSignature, tParameterList);
		if (result_pattern_MethodSignatureCreate_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignatureCreate_10_2_binding[0];

			Object[] result_pattern_MethodSignatureCreate_10_2_black = pattern_MethodSignatureCreate_10_2_blackB(csp);
			if (result_pattern_MethodSignatureCreate_10_2_black != null) {

				return new Object[] { csp, _this, match, tMethodSignature,
						tParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureCreate_10_3_expressionFBB(
			MethodSignatureCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureCreate_10_4_blackBBB(
			Match match, TMethodSignature tMethodSignature,
			TParameterList tParameterList) {
		return new Object[] { match, tMethodSignature, tParameterList };
	}

	public static final Object[] pattern_MethodSignatureCreate_10_4_greenBBBF(
			Match match, TMethodSignature tMethodSignature,
			TParameterList tParameterList) {
		EMoflonEdge tMethodSignature__tParameterList____paramList = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tMethodSignature);
		match.getToBeTranslatedNodes().add(tParameterList);
		String tMethodSignature__tParameterList____paramList_name_prime = "paramList";
		tMethodSignature__tParameterList____paramList.setSrc(tMethodSignature);
		tMethodSignature__tParameterList____paramList.setTrg(tParameterList);
		match.getToBeTranslatedEdges().add(
				tMethodSignature__tParameterList____paramList);
		tMethodSignature__tParameterList____paramList
				.setName(tMethodSignature__tParameterList____paramList_name_prime);
		return new Object[] { match, tMethodSignature, tParameterList,
				tMethodSignature__tParameterList____paramList };
	}

	public static final Object[] pattern_MethodSignatureCreate_10_5_blackBBB(
			Match match, TMethodSignature tMethodSignature,
			TParameterList tParameterList) {
		return new Object[] { match, tMethodSignature, tParameterList };
	}

	public static final void pattern_MethodSignatureCreate_10_6_expressionBBBB(
			MethodSignatureCreate _this, Match match,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		_this.registerObjectsToMatch_BWD(match, tMethodSignature,
				tParameterList);

	}

	public static final boolean pattern_MethodSignatureCreate_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignatureCreate_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureCreate_11_1_bindingFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("tMethodSignature");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("tParameterList");
		EObject tmpTMethodSignature = _localVariable_0;
		EObject tmpTParameterList = _localVariable_1;
		if (tmpTMethodSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
			if (tmpTParameterList instanceof TParameterList) {
				TParameterList tParameterList = (TParameterList) tmpTParameterList;
				return new Object[] { tMethodSignature, tParameterList,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_11_1_blackBBFBB(
			TMethodSignature tMethodSignature, TParameterList tParameterList,
			MethodSignatureCreate _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tMethodSignature, tParameterList, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_11_1_bindingAndBlackFFFBB(
			MethodSignatureCreate _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodSignatureCreate_11_1_binding = pattern_MethodSignatureCreate_11_1_bindingFFB(isApplicableMatch);
		if (result_pattern_MethodSignatureCreate_11_1_binding != null) {
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_MethodSignatureCreate_11_1_binding[0];
			TParameterList tParameterList = (TParameterList) result_pattern_MethodSignatureCreate_11_1_binding[1];

			Object[] result_pattern_MethodSignatureCreate_11_1_black = pattern_MethodSignatureCreate_11_1_blackBBFBB(
					tMethodSignature, tParameterList, _this, isApplicableMatch);
			if (result_pattern_MethodSignatureCreate_11_1_black != null) {
				CSP csp = (CSP) result_pattern_MethodSignatureCreate_11_1_black[2];

				return new Object[] { tMethodSignature, tParameterList, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_11_1_greenFFFBB(
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature = GravityTGGFactory.eINSTANCE
				.createExtendedParameterListToTMethodSignature();
		ExtendedParameterList jParameterList = ExtendedJamoppFactory.eINSTANCE
				.createExtendedParameterList();
		ExtendedParameterListToTParameterList jParameterListToTParameterList = GravityTGGFactory.eINSTANCE
				.createExtendedParameterListToTParameterList();
		jParameterListToTMethodSignature.setTarget(tMethodSignature);
		jParameterListToTMethodSignature.setSource(jParameterList);
		jParameterListToTParameterList.setTarget(tParameterList);
		jParameterListToTParameterList.setSource(jParameterList);
		return new Object[] { jParameterListToTMethodSignature, jParameterList,
				jParameterListToTParameterList, tMethodSignature,
				tParameterList };
	}

	public static final Object[] pattern_MethodSignatureCreate_11_2_blackBBBBB(
			ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		return new Object[] { jParameterListToTMethodSignature, jParameterList,
				jParameterListToTParameterList, tMethodSignature,
				tParameterList };
	}

	public static final Object[] pattern_MethodSignatureCreate_11_2_greenFBBBBB(
			ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(
				jParameterListToTMethodSignature);
		ruleresult.getCreatedElements().add(jParameterList);
		ruleresult.getCreatedLinkElements().add(jParameterListToTParameterList);
		ruleresult.getTranslatedElements().add(tMethodSignature);
		ruleresult.getTranslatedElements().add(tParameterList);
		return new Object[] { ruleresult, jParameterListToTMethodSignature,
				jParameterList, jParameterListToTParameterList,
				tMethodSignature, tParameterList };
	}

	public static final Object[] pattern_MethodSignatureCreate_11_3_blackBBBBBB(
			PerformRuleResult ruleresult,
			EObject jParameterListToTMethodSignature, EObject jParameterList,
			EObject jParameterListToTParameterList, EObject tMethodSignature,
			EObject tParameterList) {
		if (!jParameterListToTMethodSignature
				.equals(jParameterListToTParameterList)) {
			if (!jParameterListToTMethodSignature.equals(tMethodSignature)) {
				if (!jParameterListToTMethodSignature.equals(tParameterList)) {
					if (!jParameterList
							.equals(jParameterListToTMethodSignature)) {
						if (!jParameterList
								.equals(jParameterListToTParameterList)) {
							if (!jParameterList.equals(tMethodSignature)) {
								if (!jParameterList.equals(tParameterList)) {
									if (!jParameterListToTParameterList
											.equals(tMethodSignature)) {
										if (!jParameterListToTParameterList
												.equals(tParameterList)) {
											if (!tMethodSignature
													.equals(tParameterList)) {
												return new Object[] {
														ruleresult,
														jParameterListToTMethodSignature,
														jParameterList,
														jParameterListToTParameterList,
														tMethodSignature,
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
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_11_3_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult,
			EObject jParameterListToTMethodSignature, EObject jParameterList,
			EObject jParameterListToTParameterList, EObject tMethodSignature,
			EObject tParameterList) {
		EMoflonEdge jParameterListToTMethodSignature__jParameterList____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterListToTMethodSignature__tMethodSignature____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterListToTParameterList__tParameterList____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterListToTParameterList__jParameterList____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tParameterList____paramList = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodSignatureCreate";
		String jParameterListToTMethodSignature__jParameterList____source_name_prime = "source";
		String jParameterListToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String jParameterListToTParameterList__tParameterList____target_name_prime = "target";
		String jParameterListToTParameterList__jParameterList____source_name_prime = "source";
		String tMethodSignature__tParameterList____paramList_name_prime = "paramList";
		jParameterListToTMethodSignature__jParameterList____source
				.setSrc(jParameterListToTMethodSignature);
		jParameterListToTMethodSignature__jParameterList____source
				.setTrg(jParameterList);
		ruleresult.getCreatedEdges().add(
				jParameterListToTMethodSignature__jParameterList____source);
		jParameterListToTMethodSignature__tMethodSignature____target
				.setSrc(jParameterListToTMethodSignature);
		jParameterListToTMethodSignature__tMethodSignature____target
				.setTrg(tMethodSignature);
		ruleresult.getCreatedEdges().add(
				jParameterListToTMethodSignature__tMethodSignature____target);
		jParameterListToTParameterList__tParameterList____target
				.setSrc(jParameterListToTParameterList);
		jParameterListToTParameterList__tParameterList____target
				.setTrg(tParameterList);
		ruleresult.getCreatedEdges().add(
				jParameterListToTParameterList__tParameterList____target);
		jParameterListToTParameterList__jParameterList____source
				.setSrc(jParameterListToTParameterList);
		jParameterListToTParameterList__jParameterList____source
				.setTrg(jParameterList);
		ruleresult.getCreatedEdges().add(
				jParameterListToTParameterList__jParameterList____source);
		tMethodSignature__tParameterList____paramList.setSrc(tMethodSignature);
		tMethodSignature__tParameterList____paramList.setTrg(tParameterList);
		ruleresult.getTranslatedEdges().add(
				tMethodSignature__tParameterList____paramList);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jParameterListToTMethodSignature__jParameterList____source
				.setName(jParameterListToTMethodSignature__jParameterList____source_name_prime);
		jParameterListToTMethodSignature__tMethodSignature____target
				.setName(jParameterListToTMethodSignature__tMethodSignature____target_name_prime);
		jParameterListToTParameterList__tParameterList____target
				.setName(jParameterListToTParameterList__tParameterList____target_name_prime);
		jParameterListToTParameterList__jParameterList____source
				.setName(jParameterListToTParameterList__jParameterList____source_name_prime);
		tMethodSignature__tParameterList____paramList
				.setName(tMethodSignature__tParameterList____paramList_name_prime);
		return new Object[] { ruleresult, jParameterListToTMethodSignature,
				jParameterList, jParameterListToTParameterList,
				tMethodSignature, tParameterList,
				jParameterListToTMethodSignature__jParameterList____source,
				jParameterListToTMethodSignature__tMethodSignature____target,
				jParameterListToTParameterList__tParameterList____target,
				jParameterListToTParameterList__jParameterList____source,
				tMethodSignature__tParameterList____paramList };
	}

	public static final void pattern_MethodSignatureCreate_11_5_expressionBBBBBBB(
			MethodSignatureCreate _this, PerformRuleResult ruleresult,
			EObject jParameterListToTMethodSignature, EObject jParameterList,
			EObject jParameterListToTParameterList, EObject tMethodSignature,
			EObject tParameterList) {
		_this.registerObjects_BWD(ruleresult, jParameterListToTMethodSignature,
				jParameterList, jParameterListToTParameterList,
				tMethodSignature, tParameterList);

	}

	public static final PerformRuleResult pattern_MethodSignatureCreate_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureCreate_12_1_bindingFB(
			MethodSignatureCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_12_1_blackFBB(
			EClass eClass, MethodSignatureCreate _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_12_1_bindingAndBlackFFB(
			MethodSignatureCreate _this) {
		Object[] result_pattern_MethodSignatureCreate_12_1_binding = pattern_MethodSignatureCreate_12_1_bindingFB(_this);
		if (result_pattern_MethodSignatureCreate_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodSignatureCreate_12_1_binding[0];

			Object[] result_pattern_MethodSignatureCreate_12_1_black = pattern_MethodSignatureCreate_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_MethodSignatureCreate_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodSignatureCreate_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodSignatureCreate";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodSignatureCreate_12_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("tMethodSignature");
		EObject _localVariable_1 = match.getObject("tParameterList");
		EObject tmpTMethodSignature = _localVariable_0;
		EObject tmpTParameterList = _localVariable_1;
		if (tmpTMethodSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
			if (tmpTParameterList instanceof TParameterList) {
				TParameterList tParameterList = (TParameterList) tmpTParameterList;
				return new Object[] { tMethodSignature, tParameterList, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignatureCreate_12_2_blackBBB(
			TMethodSignature tMethodSignature, TParameterList tParameterList,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { tMethodSignature, tParameterList, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodSignatureCreate_12_3_blackBB(
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tParameterList.equals(tMethodSignature.getParamList())) {
			_result.add(new Object[] { tMethodSignature, tParameterList });
		}
		return _result;
	}

	public static final Object[] pattern_MethodSignatureCreate_12_3_greenBBFF(
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge tMethodSignature__tParameterList____paramList = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tMethodSignature__tParameterList____paramList_name_prime = "paramList";
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(tParameterList);
		tMethodSignature__tParameterList____paramList.setSrc(tMethodSignature);
		tMethodSignature__tParameterList____paramList.setTrg(tParameterList);
		isApplicableMatch.getAllContextElements().add(
				tMethodSignature__tParameterList____paramList);
		tMethodSignature__tParameterList____paramList
				.setName(tMethodSignature__tParameterList____paramList_name_prime);
		return new Object[] { tMethodSignature, tParameterList,
				isApplicableMatch,
				tMethodSignature__tParameterList____paramList };
	}

	public static final Object[] pattern_MethodSignatureCreate_12_4_bindingFBBBB(
			MethodSignatureCreate _this, IsApplicableMatch isApplicableMatch,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, tMethodSignature, tParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					tMethodSignature, tParameterList };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignatureCreate_12_4_bindingAndBlackFBBBB(
			MethodSignatureCreate _this, IsApplicableMatch isApplicableMatch,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		Object[] result_pattern_MethodSignatureCreate_12_4_binding = pattern_MethodSignatureCreate_12_4_bindingFBBBB(
				_this, isApplicableMatch, tMethodSignature, tParameterList);
		if (result_pattern_MethodSignatureCreate_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignatureCreate_12_4_binding[0];

			Object[] result_pattern_MethodSignatureCreate_12_4_black = pattern_MethodSignatureCreate_12_4_blackB(csp);
			if (result_pattern_MethodSignatureCreate_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						tMethodSignature, tParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureCreate_12_5_expressionFBB(
			MethodSignatureCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureCreate_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodSignatureCreate_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodSignatureCreate";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodSignatureCreate_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureCreate_20_1_bindingFB(
			MethodSignatureCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_20_1_blackFBB(
			EClass __eClass, MethodSignatureCreate _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_20_1_bindingAndBlackFFB(
			MethodSignatureCreate _this) {
		Object[] result_pattern_MethodSignatureCreate_20_1_binding = pattern_MethodSignatureCreate_20_1_bindingFB(_this);
		if (result_pattern_MethodSignatureCreate_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodSignatureCreate_20_1_binding[0];

			Object[] result_pattern_MethodSignatureCreate_20_1_black = pattern_MethodSignatureCreate_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_MethodSignatureCreate_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodSignatureCreate_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodSignatureCreate_20_2_blackB(
			ExtendedParameterList jParameterList) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { jParameterList });
		return _result;
	}

	public static final Object[] pattern_MethodSignatureCreate_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodSignatureCreate_20_3_expressionFBBB(
			MethodSignatureCreate _this, Match match,
			ExtendedParameterList jParameterList) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				jParameterList);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodSignatureCreate_20_4_expressionFBB(
			MethodSignatureCreate _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureCreate_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_MethodSignatureCreate_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_MethodSignatureCreate_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureCreate_21_1_bindingFB(
			MethodSignatureCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_21_1_blackFBB(
			EClass __eClass, MethodSignatureCreate _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_21_1_bindingAndBlackFFB(
			MethodSignatureCreate _this) {
		Object[] result_pattern_MethodSignatureCreate_21_1_binding = pattern_MethodSignatureCreate_21_1_bindingFB(_this);
		if (result_pattern_MethodSignatureCreate_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodSignatureCreate_21_1_binding[0];

			Object[] result_pattern_MethodSignatureCreate_21_1_black = pattern_MethodSignatureCreate_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_MethodSignatureCreate_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodSignatureCreate_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureCreate_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MethodSignatureCreate_21_2_black_nac_0BB(
			TParameterList tParameterList, TMethodSignature tMethodSignature) {
		for (TMethodSignature __DEC_tParameterList_paramList_517816 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tParameterList,
						TMethodSignature.class, "paramList")) {
			if (!tMethodSignature.equals(__DEC_tParameterList_paramList_517816)) {
				return new Object[] { tParameterList, tMethodSignature };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignatureCreate_21_2_blackFFB(
			EMoflonEdge _edge_paramList) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMethodSignature = _edge_paramList.getSrc();
		if (tmpTMethodSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
			EObject tmpTParameterList = _edge_paramList.getTrg();
			if (tmpTParameterList instanceof TParameterList) {
				TParameterList tParameterList = (TParameterList) tmpTParameterList;
				if (tParameterList.equals(tMethodSignature.getParamList())) {
					if (pattern_MethodSignatureCreate_21_2_black_nac_0BB(
							tParameterList, tMethodSignature) == null) {
						_result.add(new Object[] { tMethodSignature,
								tParameterList, _edge_paramList });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodSignatureCreate_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodSignatureCreate_21_3_expressionFBBBB(
			MethodSignatureCreate _this, Match match,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match,
				tMethodSignature, tParameterList);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodSignatureCreate_21_4_expressionFBB(
			MethodSignatureCreate _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureCreate_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_MethodSignatureCreate_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_MethodSignatureCreate_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodSignatureCreateImpl
