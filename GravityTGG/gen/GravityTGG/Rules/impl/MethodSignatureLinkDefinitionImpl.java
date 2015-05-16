/**
 */
package GravityTGG.Rules.impl;

import ExtendedJamopp.ExtendedClassMethod;
import ExtendedJamopp.ExtendedParameterList;

import GravityTGG.ClassMethodToTMethodDefinition;
import GravityTGG.ClassMethodToTMethodSignature;
import GravityTGG.ExtendedParameterListToTParameterList;
import GravityTGG.GravityTGGFactory;

import GravityTGG.Rules.MethodSignatureLinkDefinition;
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

import TypeGraphBasic.TMethodDefinition;
import TypeGraphBasic.TMethodSignature;
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
 * An implementation of the model object '<em><b>Method Signature Link Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodSignatureLinkDefinitionImpl extends AbstractRuleImpl
		implements MethodSignatureLinkDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodSignatureLinkDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodSignatureLinkDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ExtendedClassMethod jMethod,
			ExtendedParameterList jParameterList) {
		// initial bindings
		Object[] result1_black = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_0_1_blackBBBB(this,
						match, jMethod, jParameterList);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_0_2_bindingAndBlackFBBBB(
						this, match, jMethod, jParameterList);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_0_3_expressionFBB(this,
						csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_0_4_blackBBB(match,
							jMethod, jParameterList);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_0_4_greenBBBFF(
							match, jMethod, jParameterList);
			// EMoflonEdge jParameterList__jMethod____methods = (EMoflonEdge) result4_green[3];
			// EMoflonEdge jMethod__jParameterList____parameter_list = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_0_5_blackBBB(match,
							jMethod, jParameterList);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_0_5_greenBBB(match,
							jMethod, jParameterList);

			// register objects to match
			MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_0_6_expressionBBBB(
							this, match, jMethod, jParameterList);
			return MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_0_7_expressionF();
		} else {
			return MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_1_1_bindingAndBlackFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedClassMethod jMethod = (ExtendedClassMethod) result1_bindingAndBlack[0];
		ExtendedParameterList jParameterList = (ExtendedParameterList) result1_bindingAndBlack[1];
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result1_bindingAndBlack[2];
		ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result1_bindingAndBlack[3];
		ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) result1_bindingAndBlack[4];
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[5];
		TParameterList tParameterList = (TParameterList) result1_bindingAndBlack[6];
		// CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_1_1_greenBFBB(jMethod,
						tMethodDefinition, tMethodSignature);
		ClassMethodToTMethodSignature jMethodToTMethodSignature = (ClassMethodToTMethodSignature) result1_green[1];

		// collect translated elements
		Object[] result2_black = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_1_2_blackB(jMethodToTMethodSignature);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_1_2_greenFB(jMethodToTMethodSignature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_1_3_blackBBBBBBBBB(
						ruleresult, jMethod, jMethodToTMethodSignature,
						jParameterList, tMethodDefinition,
						jMethodToTMethodDefinition,
						jParameterListToTParameterList, tMethodSignature,
						tParameterList);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_1_3_greenBBBBBBFFFFFF(
						ruleresult, jMethod, jMethodToTMethodSignature,
						jParameterList, tMethodDefinition, tMethodSignature);
		// EMoflonEdge jParameterList__jMethod____methods = (EMoflonEdge) result3_green[6];
		// EMoflonEdge jMethod__jParameterList____parameter_list = (EMoflonEdge) result3_green[7];
		// EMoflonEdge jMethodToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[8];
		// EMoflonEdge jMethodToTMethodSignature__jMethod____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge tMethodSignature__tMethodDefinition____definitions = (EMoflonEdge) result3_green[10];
		// EMoflonEdge tMethodDefinition__tMethodSignature____signature = (EMoflonEdge) result3_green[11];

		// perform postprocessing story node is empty
		// register objects
		MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_1_5_expressionBBBBBBBBBB(
						this, ruleresult, jMethod, jMethodToTMethodSignature,
						jParameterList, tMethodDefinition,
						jMethodToTMethodDefinition,
						jParameterListToTParameterList, tMethodSignature,
						tParameterList);
		return MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_2_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		ExtendedClassMethod jMethod = (ExtendedClassMethod) result2_binding[0];
		ExtendedParameterList jParameterList = (ExtendedParameterList) result2_binding[1];
		for (Object[] result2_black : MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_2_2_blackBBFFFFB(
						jMethod, jParameterList, match)) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_black[2];
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result2_black[3];
			ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) result2_black[4];
			TParameterList tParameterList = (TParameterList) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_2_3_blackBBBBBFB(
							jMethod, jParameterList, tMethodDefinition,
							jMethodToTMethodDefinition,
							jParameterListToTParameterList, tParameterList)) {
				TMethodSignature tMethodSignature = (TMethodSignature) result3_black[5];
				Object[] result3_green = MethodSignatureLinkDefinitionImpl
						.pattern_MethodSignatureLinkDefinition_2_3_greenBBBBBBBFFFFFFFF(
								jMethod, jParameterList, tMethodDefinition,
								jMethodToTMethodDefinition,
								jParameterListToTParameterList,
								tMethodSignature, tParameterList);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge jParameterList__jMethod____methods = (EMoflonEdge) result3_green[8];
				// EMoflonEdge jMethod__jParameterList____parameter_list = (EMoflonEdge) result3_green[9];
				// EMoflonEdge jMethodToTMethodDefinition__jMethod____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge jMethodToTMethodDefinition__tMethodDefinition____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge jParameterListToTParameterList__tParameterList____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge jParameterListToTParameterList__jParameterList____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge tMethodSignature__tParameterList____paramList = (EMoflonEdge) result3_green[14];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodSignatureLinkDefinitionImpl
						.pattern_MethodSignatureLinkDefinition_2_4_bindingAndBlackFBBBBBBBBB(
								this, isApplicableMatch, jMethod,
								jParameterList, tMethodDefinition,
								jMethodToTMethodDefinition,
								jParameterListToTParameterList,
								tMethodSignature, tParameterList);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodSignatureLinkDefinitionImpl
						.pattern_MethodSignatureLinkDefinition_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = MethodSignatureLinkDefinitionImpl
							.pattern_MethodSignatureLinkDefinition_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					MethodSignatureLinkDefinitionImpl
							.pattern_MethodSignatureLinkDefinition_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			ExtendedClassMethod jMethod, ExtendedParameterList jParameterList) {
		match.registerObject("jMethod", jMethod);
		match.registerObject("jParameterList", jParameterList);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			ExtendedClassMethod jMethod, ExtendedParameterList jParameterList) {// Create CSP
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
			ExtendedClassMethod jMethod,
			ExtendedParameterList jParameterList,
			TMethodDefinition tMethodDefinition,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jMethod", jMethod);
		isApplicableMatch.registerObject("jParameterList", jParameterList);
		isApplicableMatch
				.registerObject("tMethodDefinition", tMethodDefinition);
		isApplicableMatch.registerObject("jMethodToTMethodDefinition",
				jMethodToTMethodDefinition);
		isApplicableMatch.registerObject("jParameterListToTParameterList",
				jParameterListToTParameterList);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
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
			EObject jMethod, EObject jMethodToTMethodSignature,
			EObject jParameterList, EObject tMethodDefinition,
			EObject jMethodToTMethodDefinition,
			EObject jParameterListToTParameterList, EObject tMethodSignature,
			EObject tParameterList) {
		ruleresult.registerObject("jMethod", jMethod);
		ruleresult.registerObject("jMethodToTMethodSignature",
				jMethodToTMethodSignature);
		ruleresult.registerObject("jParameterList", jParameterList);
		ruleresult.registerObject("tMethodDefinition", tMethodDefinition);
		ruleresult.registerObject("jMethodToTMethodDefinition",
				jMethodToTMethodDefinition);
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
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match,
			TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		// initial bindings
		Object[] result1_black = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_10_1_blackBBBBB(this,
						match, tMethodDefinition, tMethodSignature,
						tParameterList);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_10_2_bindingAndBlackFBBBBB(
						this, match, tMethodDefinition, tMethodSignature,
						tParameterList);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_10_3_expressionFBB(this,
						csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_10_4_blackBBBB(
							match, tMethodDefinition, tMethodSignature,
							tParameterList);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_10_4_greenBBBFF(
							match, tMethodDefinition, tMethodSignature);
			// EMoflonEdge tMethodSignature__tMethodDefinition____definitions = (EMoflonEdge) result4_green[3];
			// EMoflonEdge tMethodDefinition__tMethodSignature____signature = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_10_5_blackBBBB(
							match, tMethodDefinition, tMethodSignature,
							tParameterList);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_10_5_greenBBBBF(
							match, tMethodDefinition, tMethodSignature,
							tParameterList);
			// EMoflonEdge tMethodSignature__tParameterList____paramList = (EMoflonEdge) result5_green[4];

			// register objects to match
			MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_10_6_expressionBBBBB(
							this, match, tMethodDefinition, tMethodSignature,
							tParameterList);
			return MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_10_7_expressionF();
		} else {
			return MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_11_1_bindingAndBlackFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedClassMethod jMethod = (ExtendedClassMethod) result1_bindingAndBlack[0];
		ExtendedParameterList jParameterList = (ExtendedParameterList) result1_bindingAndBlack[1];
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result1_bindingAndBlack[2];
		ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result1_bindingAndBlack[3];
		ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) result1_bindingAndBlack[4];
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[5];
		TParameterList tParameterList = (TParameterList) result1_bindingAndBlack[6];
		// CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_11_1_greenBFBB(jMethod,
						jParameterList, tMethodSignature);
		ClassMethodToTMethodSignature jMethodToTMethodSignature = (ClassMethodToTMethodSignature) result1_green[1];

		// collect translated elements
		Object[] result2_black = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_11_2_blackB(jMethodToTMethodSignature);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_11_2_greenFB(jMethodToTMethodSignature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_11_3_blackBBBBBBBBB(
						ruleresult, jMethod, jMethodToTMethodSignature,
						jParameterList, tMethodDefinition,
						jMethodToTMethodDefinition,
						jParameterListToTParameterList, tMethodSignature,
						tParameterList);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_11_3_greenBBBBBBFFFFFF(
						ruleresult, jMethod, jMethodToTMethodSignature,
						jParameterList, tMethodDefinition, tMethodSignature);
		// EMoflonEdge jParameterList__jMethod____methods = (EMoflonEdge) result3_green[6];
		// EMoflonEdge jMethod__jParameterList____parameter_list = (EMoflonEdge) result3_green[7];
		// EMoflonEdge jMethodToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[8];
		// EMoflonEdge jMethodToTMethodSignature__jMethod____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge tMethodSignature__tMethodDefinition____definitions = (EMoflonEdge) result3_green[10];
		// EMoflonEdge tMethodDefinition__tMethodSignature____signature = (EMoflonEdge) result3_green[11];

		// perform postprocessing story node is empty
		// register objects
		MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_11_5_expressionBBBBBBBBBB(
						this, ruleresult, jMethod, jMethodToTMethodSignature,
						jParameterList, tMethodDefinition,
						jMethodToTMethodDefinition,
						jParameterListToTParameterList, tMethodSignature,
						tParameterList);
		return MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_binding[0];
		TMethodSignature tMethodSignature = (TMethodSignature) result2_binding[1];
		TParameterList tParameterList = (TParameterList) result2_binding[2];
		for (Object[] result2_black : MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_12_2_blackFFBFFBBB(
						tMethodDefinition, tMethodSignature, tParameterList,
						match)) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result2_black[0];
			ExtendedParameterList jParameterList = (ExtendedParameterList) result2_black[1];
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result2_black[3];
			ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) result2_black[4];
			// ForEach find context
			for (Object[] result3_black : MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_12_3_blackBBBBBBB(
							jMethod, jParameterList, tMethodDefinition,
							jMethodToTMethodDefinition,
							jParameterListToTParameterList, tMethodSignature,
							tParameterList)) {
				Object[] result3_green = MethodSignatureLinkDefinitionImpl
						.pattern_MethodSignatureLinkDefinition_12_3_greenBBBBBBBFFFFFFFF(
								jMethod, jParameterList, tMethodDefinition,
								jMethodToTMethodDefinition,
								jParameterListToTParameterList,
								tMethodSignature, tParameterList);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge tMethodSignature__tMethodDefinition____definitions = (EMoflonEdge) result3_green[8];
				// EMoflonEdge tMethodDefinition__tMethodSignature____signature = (EMoflonEdge) result3_green[9];
				// EMoflonEdge jMethodToTMethodDefinition__jMethod____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge jMethodToTMethodDefinition__tMethodDefinition____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge jParameterListToTParameterList__tParameterList____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge jParameterListToTParameterList__jParameterList____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge tMethodSignature__tParameterList____paramList = (EMoflonEdge) result3_green[14];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodSignatureLinkDefinitionImpl
						.pattern_MethodSignatureLinkDefinition_12_4_bindingAndBlackFBBBBBBBBB(
								this, isApplicableMatch, jMethod,
								jParameterList, tMethodDefinition,
								jMethodToTMethodDefinition,
								jParameterListToTParameterList,
								tMethodSignature, tParameterList);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodSignatureLinkDefinitionImpl
						.pattern_MethodSignatureLinkDefinition_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = MethodSignatureLinkDefinitionImpl
							.pattern_MethodSignatureLinkDefinition_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					MethodSignatureLinkDefinitionImpl
							.pattern_MethodSignatureLinkDefinition_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		match.registerObject("tMethodDefinition", tMethodDefinition);
		match.registerObject("tMethodSignature", tMethodSignature);
		match.registerObject("tParameterList", tParameterList);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			TMethodDefinition tMethodDefinition,
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
	public CSP isApplicable_solveCsp_BWD(
			IsApplicableMatch isApplicableMatch,
			ExtendedClassMethod jMethod,
			ExtendedParameterList jParameterList,
			TMethodDefinition tMethodDefinition,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jMethod", jMethod);
		isApplicableMatch.registerObject("jParameterList", jParameterList);
		isApplicableMatch
				.registerObject("tMethodDefinition", tMethodDefinition);
		isApplicableMatch.registerObject("jMethodToTMethodDefinition",
				jMethodToTMethodDefinition);
		isApplicableMatch.registerObject("jParameterListToTParameterList",
				jParameterListToTParameterList);
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
			EObject jMethod, EObject jMethodToTMethodSignature,
			EObject jParameterList, EObject tMethodDefinition,
			EObject jMethodToTMethodDefinition,
			EObject jParameterListToTParameterList, EObject tMethodSignature,
			EObject tParameterList) {
		ruleresult.registerObject("jMethod", jMethod);
		ruleresult.registerObject("jMethodToTMethodSignature",
				jMethodToTMethodSignature);
		ruleresult.registerObject("jParameterList", jParameterList);
		ruleresult.registerObject("tMethodDefinition", tMethodDefinition);
		ruleresult.registerObject("jMethodToTMethodDefinition",
				jMethodToTMethodDefinition);
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
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_16(
			EMoflonEdge _edge_methods) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_20_2_blackFFB(_edge_methods)) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result2_black[0];
			ExtendedParameterList jParameterList = (ExtendedParameterList) result2_black[1];
			Object[] result2_green = MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_20_3_expressionFBBBB(
							this, match, jMethod, jParameterList)) {
				// Ensure that the correct types of elements are matched
				if (MethodSignatureLinkDefinitionImpl
						.pattern_MethodSignatureLinkDefinition_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = MethodSignatureLinkDefinitionImpl
							.pattern_MethodSignatureLinkDefinition_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					MethodSignatureLinkDefinitionImpl
							.pattern_MethodSignatureLinkDefinition_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_17(
			EMoflonEdge _edge_parameter_list) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_21_2_blackFFB(_edge_parameter_list)) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result2_black[0];
			ExtendedParameterList jParameterList = (ExtendedParameterList) result2_black[1];
			Object[] result2_green = MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_21_3_expressionFBBBB(
							this, match, jMethod, jParameterList)) {
				// Ensure that the correct types of elements are matched
				if (MethodSignatureLinkDefinitionImpl
						.pattern_MethodSignatureLinkDefinition_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = MethodSignatureLinkDefinitionImpl
							.pattern_MethodSignatureLinkDefinition_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					MethodSignatureLinkDefinitionImpl
							.pattern_MethodSignatureLinkDefinition_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_20(
			EMoflonEdge _edge_definitions) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_22_2_blackFFFB(_edge_definitions)) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_black[0];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[1];
			TParameterList tParameterList = (TParameterList) result2_black[2];
			Object[] result2_green = MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_22_3_expressionFBBBBB(
							this, match, tMethodDefinition, tMethodSignature,
							tParameterList)) {
				// Ensure that the correct types of elements are matched
				if (MethodSignatureLinkDefinitionImpl
						.pattern_MethodSignatureLinkDefinition_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = MethodSignatureLinkDefinitionImpl
							.pattern_MethodSignatureLinkDefinition_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					MethodSignatureLinkDefinitionImpl
							.pattern_MethodSignatureLinkDefinition_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_21(
			EMoflonEdge _edge_signature) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_23_2_blackFFFB(_edge_signature)) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_black[0];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[1];
			TParameterList tParameterList = (TParameterList) result2_black[2];
			Object[] result2_green = MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodSignatureLinkDefinitionImpl
					.pattern_MethodSignatureLinkDefinition_23_3_expressionFBBBBB(
							this, match, tMethodDefinition, tMethodSignature,
							tParameterList)) {
				// Ensure that the correct types of elements are matched
				if (MethodSignatureLinkDefinitionImpl
						.pattern_MethodSignatureLinkDefinition_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = MethodSignatureLinkDefinitionImpl
							.pattern_MethodSignatureLinkDefinition_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					MethodSignatureLinkDefinitionImpl
							.pattern_MethodSignatureLinkDefinition_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return MethodSignatureLinkDefinitionImpl
				.pattern_MethodSignatureLinkDefinition_23_6_expressionFB(__result);
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
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___IS_APPROPRIATE_FWD__MATCH_EXTENDEDCLASSMETHOD_EXTENDEDPARAMETERLIST:
			return isAppropriate_FWD((Match) arguments.get(0),
					(ExtendedClassMethod) arguments.get(1),
					(ExtendedParameterList) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDCLASSMETHOD_EXTENDEDPARAMETERLIST:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(ExtendedClassMethod) arguments.get(1),
					(ExtendedParameterList) arguments.get(2));
			return null;
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDCLASSMETHOD_EXTENDEDPARAMETERLIST:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(ExtendedClassMethod) arguments.get(1),
					(ExtendedParameterList) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDCLASSMETHOD_EXTENDEDPARAMETERLIST_TMETHODDEFINITION_CLASSMETHODTOTMETHODDEFINITION_EXTENDEDPARAMETERLISTTOTPARAMETERLIST_TMETHODSIGNATURE_TPARAMETERLIST:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedClassMethod) arguments.get(1),
					(ExtendedParameterList) arguments.get(2),
					(TMethodDefinition) arguments.get(3),
					(ClassMethodToTMethodDefinition) arguments.get(4),
					(ExtendedParameterListToTParameterList) arguments.get(5),
					(TMethodSignature) arguments.get(6),
					(TParameterList) arguments.get(7));
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8));
			return null;
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___IS_APPROPRIATE_BWD__MATCH_TMETHODDEFINITION_TMETHODSIGNATURE_TPARAMETERLIST:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TMethodDefinition) arguments.get(1),
					(TMethodSignature) arguments.get(2),
					(TParameterList) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODDEFINITION_TMETHODSIGNATURE_TPARAMETERLIST:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TMethodDefinition) arguments.get(1),
					(TMethodSignature) arguments.get(2),
					(TParameterList) arguments.get(3));
			return null;
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODDEFINITION_TMETHODSIGNATURE_TPARAMETERLIST:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TMethodDefinition) arguments.get(1),
					(TMethodSignature) arguments.get(2),
					(TParameterList) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXTENDEDCLASSMETHOD_EXTENDEDPARAMETERLIST_TMETHODDEFINITION_CLASSMETHODTOTMETHODDEFINITION_EXTENDEDPARAMETERLISTTOTPARAMETERLIST_TMETHODSIGNATURE_TPARAMETERLIST:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedClassMethod) arguments.get(1),
					(ExtendedParameterList) arguments.get(2),
					(TMethodDefinition) arguments.get(3),
					(ClassMethodToTMethodDefinition) arguments.get(4),
					(ExtendedParameterListToTParameterList) arguments.get(5),
					(TMethodSignature) arguments.get(6),
					(TParameterList) arguments.get(7));
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8));
			return null;
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_16__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_16((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_17__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_17((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_20__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_20((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_21__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_21((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_0_1_blackBBBB(
			MethodSignatureLinkDefinition _this, Match match,
			ExtendedClassMethod jMethod, ExtendedParameterList jParameterList) {
		return new Object[] { _this, match, jMethod, jParameterList };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_0_2_bindingFBBBB(
			MethodSignatureLinkDefinition _this, Match match,
			ExtendedClassMethod jMethod, ExtendedParameterList jParameterList) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, jMethod,
				jParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jMethod, jParameterList };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_0_2_bindingAndBlackFBBBB(
			MethodSignatureLinkDefinition _this, Match match,
			ExtendedClassMethod jMethod, ExtendedParameterList jParameterList) {
		Object[] result_pattern_MethodSignatureLinkDefinition_0_2_binding = pattern_MethodSignatureLinkDefinition_0_2_bindingFBBBB(
				_this, match, jMethod, jParameterList);
		if (result_pattern_MethodSignatureLinkDefinition_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignatureLinkDefinition_0_2_binding[0];

			Object[] result_pattern_MethodSignatureLinkDefinition_0_2_black = pattern_MethodSignatureLinkDefinition_0_2_blackB(csp);
			if (result_pattern_MethodSignatureLinkDefinition_0_2_black != null) {

				return new Object[] { csp, _this, match, jMethod,
						jParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureLinkDefinition_0_3_expressionFBB(
			MethodSignatureLinkDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_0_4_blackBBB(
			Match match, ExtendedClassMethod jMethod,
			ExtendedParameterList jParameterList) {
		return new Object[] { match, jMethod, jParameterList };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_0_4_greenBBBFF(
			Match match, ExtendedClassMethod jMethod,
			ExtendedParameterList jParameterList) {
		EMoflonEdge jParameterList__jMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__jParameterList____parameter_list = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jParameterList__jMethod____methods_name_prime = "methods";
		String jMethod__jParameterList____parameter_list_name_prime = "parameter_list";
		jParameterList__jMethod____methods.setSrc(jParameterList);
		jParameterList__jMethod____methods.setTrg(jMethod);
		match.getToBeTranslatedEdges().add(jParameterList__jMethod____methods);
		jMethod__jParameterList____parameter_list.setSrc(jMethod);
		jMethod__jParameterList____parameter_list.setTrg(jParameterList);
		match.getToBeTranslatedEdges().add(
				jMethod__jParameterList____parameter_list);
		jParameterList__jMethod____methods
				.setName(jParameterList__jMethod____methods_name_prime);
		jMethod__jParameterList____parameter_list
				.setName(jMethod__jParameterList____parameter_list_name_prime);
		return new Object[] { match, jMethod, jParameterList,
				jParameterList__jMethod____methods,
				jMethod__jParameterList____parameter_list };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_0_5_blackBBB(
			Match match, ExtendedClassMethod jMethod,
			ExtendedParameterList jParameterList) {
		return new Object[] { match, jMethod, jParameterList };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_0_5_greenBBB(
			Match match, ExtendedClassMethod jMethod,
			ExtendedParameterList jParameterList) {
		match.getContextNodes().add(jMethod);
		match.getContextNodes().add(jParameterList);
		return new Object[] { match, jMethod, jParameterList };
	}

	public static final void pattern_MethodSignatureLinkDefinition_0_6_expressionBBBB(
			MethodSignatureLinkDefinition _this, Match match,
			ExtendedClassMethod jMethod, ExtendedParameterList jParameterList) {
		_this.registerObjectsToMatch_FWD(match, jMethod, jParameterList);

	}

	public static final boolean pattern_MethodSignatureLinkDefinition_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignatureLinkDefinition_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_1_1_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jMethod");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("jParameterList");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("tMethodDefinition");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("jMethodToTMethodDefinition");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("jParameterListToTParameterList");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("tMethodSignature");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("tParameterList");
		EObject tmpJMethod = _localVariable_0;
		EObject tmpJParameterList = _localVariable_1;
		EObject tmpTMethodDefinition = _localVariable_2;
		EObject tmpJMethodToTMethodDefinition = _localVariable_3;
		EObject tmpJParameterListToTParameterList = _localVariable_4;
		EObject tmpTMethodSignature = _localVariable_5;
		EObject tmpTParameterList = _localVariable_6;
		if (tmpJMethod instanceof ExtendedClassMethod) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
			if (tmpJParameterList instanceof ExtendedParameterList) {
				ExtendedParameterList jParameterList = (ExtendedParameterList) tmpJParameterList;
				if (tmpTMethodDefinition instanceof TMethodDefinition) {
					TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
					if (tmpJMethodToTMethodDefinition instanceof ClassMethodToTMethodDefinition) {
						ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) tmpJMethodToTMethodDefinition;
						if (tmpJParameterListToTParameterList instanceof ExtendedParameterListToTParameterList) {
							ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) tmpJParameterListToTParameterList;
							if (tmpTMethodSignature instanceof TMethodSignature) {
								TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
								if (tmpTParameterList instanceof TParameterList) {
									TParameterList tParameterList = (TParameterList) tmpTParameterList;
									return new Object[] { jMethod,
											jParameterList, tMethodDefinition,
											jMethodToTMethodDefinition,
											jParameterListToTParameterList,
											tMethodSignature, tParameterList,
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

	public static final Object[] pattern_MethodSignatureLinkDefinition_1_1_blackBBBBBBBFBB(
			ExtendedClassMethod jMethod,
			ExtendedParameterList jParameterList,
			TMethodDefinition tMethodDefinition,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			TMethodSignature tMethodSignature, TParameterList tParameterList,
			MethodSignatureLinkDefinition _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jMethod, jParameterList,
						tMethodDefinition, jMethodToTMethodDefinition,
						jParameterListToTParameterList, tMethodSignature,
						tParameterList, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_1_1_bindingAndBlackFFFFFFFFBB(
			MethodSignatureLinkDefinition _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodSignatureLinkDefinition_1_1_binding = pattern_MethodSignatureLinkDefinition_1_1_bindingFFFFFFFB(isApplicableMatch);
		if (result_pattern_MethodSignatureLinkDefinition_1_1_binding != null) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result_pattern_MethodSignatureLinkDefinition_1_1_binding[0];
			ExtendedParameterList jParameterList = (ExtendedParameterList) result_pattern_MethodSignatureLinkDefinition_1_1_binding[1];
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result_pattern_MethodSignatureLinkDefinition_1_1_binding[2];
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result_pattern_MethodSignatureLinkDefinition_1_1_binding[3];
			ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) result_pattern_MethodSignatureLinkDefinition_1_1_binding[4];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_MethodSignatureLinkDefinition_1_1_binding[5];
			TParameterList tParameterList = (TParameterList) result_pattern_MethodSignatureLinkDefinition_1_1_binding[6];

			Object[] result_pattern_MethodSignatureLinkDefinition_1_1_black = pattern_MethodSignatureLinkDefinition_1_1_blackBBBBBBBFBB(
					jMethod, jParameterList, tMethodDefinition,
					jMethodToTMethodDefinition, jParameterListToTParameterList,
					tMethodSignature, tParameterList, _this, isApplicableMatch);
			if (result_pattern_MethodSignatureLinkDefinition_1_1_black != null) {
				CSP csp = (CSP) result_pattern_MethodSignatureLinkDefinition_1_1_black[7];

				return new Object[] { jMethod, jParameterList,
						tMethodDefinition, jMethodToTMethodDefinition,
						jParameterListToTParameterList, tMethodSignature,
						tParameterList, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_1_1_greenBFBB(
			ExtendedClassMethod jMethod, TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature) {
		ClassMethodToTMethodSignature jMethodToTMethodSignature = GravityTGGFactory.eINSTANCE
				.createClassMethodToTMethodSignature();
		tMethodSignature.getDefinitions().add(tMethodDefinition);
		jMethodToTMethodSignature.setTarget(tMethodSignature);
		jMethodToTMethodSignature.setSource(jMethod);
		return new Object[] { jMethod, jMethodToTMethodSignature,
				tMethodDefinition, tMethodSignature };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_1_2_blackB(
			ClassMethodToTMethodSignature jMethodToTMethodSignature) {
		return new Object[] { jMethodToTMethodSignature };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_1_2_greenFB(
			ClassMethodToTMethodSignature jMethodToTMethodSignature) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(jMethodToTMethodSignature);
		return new Object[] { ruleresult, jMethodToTMethodSignature };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_1_3_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject jMethod,
			EObject jMethodToTMethodSignature, EObject jParameterList,
			EObject tMethodDefinition, EObject jMethodToTMethodDefinition,
			EObject jParameterListToTParameterList, EObject tMethodSignature,
			EObject tParameterList) {
		if (!jMethod.equals(jMethodToTMethodSignature)) {
			if (!jMethod.equals(jParameterList)) {
				if (!jMethod.equals(tMethodDefinition)) {
					if (!jMethod.equals(jMethodToTMethodDefinition)) {
						if (!jMethod.equals(jParameterListToTParameterList)) {
							if (!jMethod.equals(tMethodSignature)) {
								if (!jMethod.equals(tParameterList)) {
									if (!jMethodToTMethodSignature
											.equals(jParameterList)) {
										if (!jMethodToTMethodSignature
												.equals(tMethodDefinition)) {
											if (!jMethodToTMethodSignature
													.equals(jParameterListToTParameterList)) {
												if (!jMethodToTMethodSignature
														.equals(tMethodSignature)) {
													if (!jMethodToTMethodSignature
															.equals(tParameterList)) {
														if (!jParameterList
																.equals(tMethodDefinition)) {
															if (!jParameterList
																	.equals(jParameterListToTParameterList)) {
																if (!jParameterList
																		.equals(tMethodSignature)) {
																	if (!jParameterList
																			.equals(tParameterList)) {
																		if (!tMethodDefinition
																				.equals(tMethodSignature)) {
																			if (!tMethodDefinition
																					.equals(tParameterList)) {
																				if (!jMethodToTMethodDefinition
																						.equals(jMethodToTMethodSignature)) {
																					if (!jMethodToTMethodDefinition
																							.equals(jParameterList)) {
																						if (!jMethodToTMethodDefinition
																								.equals(tMethodDefinition)) {
																							if (!jMethodToTMethodDefinition
																									.equals(jParameterListToTParameterList)) {
																								if (!jMethodToTMethodDefinition
																										.equals(tMethodSignature)) {
																									if (!jMethodToTMethodDefinition
																											.equals(tParameterList)) {
																										if (!jParameterListToTParameterList
																												.equals(tMethodDefinition)) {
																											if (!jParameterListToTParameterList
																													.equals(tMethodSignature)) {
																												if (!jParameterListToTParameterList
																														.equals(tParameterList)) {
																													if (!tMethodSignature
																															.equals(tParameterList)) {
																														return new Object[] {
																																ruleresult,
																																jMethod,
																																jMethodToTMethodSignature,
																																jParameterList,
																																tMethodDefinition,
																																jMethodToTMethodDefinition,
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
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodSignatureLinkDefinition_1_3_greenBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject jMethod,
			EObject jMethodToTMethodSignature, EObject jParameterList,
			EObject tMethodDefinition, EObject tMethodSignature) {
		EMoflonEdge jParameterList__jMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__jParameterList____parameter_list = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodSignature__tMethodSignature____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodSignature__jMethod____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tMethodDefinition____definitions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodDefinition__tMethodSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodSignatureLinkDefinition";
		String jParameterList__jMethod____methods_name_prime = "methods";
		String jMethod__jParameterList____parameter_list_name_prime = "parameter_list";
		String jMethodToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String jMethodToTMethodSignature__jMethod____source_name_prime = "source";
		String tMethodSignature__tMethodDefinition____definitions_name_prime = "definitions";
		String tMethodDefinition__tMethodSignature____signature_name_prime = "signature";
		jParameterList__jMethod____methods.setSrc(jParameterList);
		jParameterList__jMethod____methods.setTrg(jMethod);
		ruleresult.getTranslatedEdges().add(jParameterList__jMethod____methods);
		jMethod__jParameterList____parameter_list.setSrc(jMethod);
		jMethod__jParameterList____parameter_list.setTrg(jParameterList);
		ruleresult.getTranslatedEdges().add(
				jMethod__jParameterList____parameter_list);
		jMethodToTMethodSignature__tMethodSignature____target
				.setSrc(jMethodToTMethodSignature);
		jMethodToTMethodSignature__tMethodSignature____target
				.setTrg(tMethodSignature);
		ruleresult.getCreatedEdges().add(
				jMethodToTMethodSignature__tMethodSignature____target);
		jMethodToTMethodSignature__jMethod____source
				.setSrc(jMethodToTMethodSignature);
		jMethodToTMethodSignature__jMethod____source.setTrg(jMethod);
		ruleresult.getCreatedEdges().add(
				jMethodToTMethodSignature__jMethod____source);
		tMethodSignature__tMethodDefinition____definitions
				.setSrc(tMethodSignature);
		tMethodSignature__tMethodDefinition____definitions
				.setTrg(tMethodDefinition);
		ruleresult.getCreatedEdges().add(
				tMethodSignature__tMethodDefinition____definitions);
		tMethodDefinition__tMethodSignature____signature
				.setSrc(tMethodDefinition);
		tMethodDefinition__tMethodSignature____signature
				.setTrg(tMethodSignature);
		ruleresult.getCreatedEdges().add(
				tMethodDefinition__tMethodSignature____signature);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jParameterList__jMethod____methods
				.setName(jParameterList__jMethod____methods_name_prime);
		jMethod__jParameterList____parameter_list
				.setName(jMethod__jParameterList____parameter_list_name_prime);
		jMethodToTMethodSignature__tMethodSignature____target
				.setName(jMethodToTMethodSignature__tMethodSignature____target_name_prime);
		jMethodToTMethodSignature__jMethod____source
				.setName(jMethodToTMethodSignature__jMethod____source_name_prime);
		tMethodSignature__tMethodDefinition____definitions
				.setName(tMethodSignature__tMethodDefinition____definitions_name_prime);
		tMethodDefinition__tMethodSignature____signature
				.setName(tMethodDefinition__tMethodSignature____signature_name_prime);
		return new Object[] { ruleresult, jMethod, jMethodToTMethodSignature,
				jParameterList, tMethodDefinition, tMethodSignature,
				jParameterList__jMethod____methods,
				jMethod__jParameterList____parameter_list,
				jMethodToTMethodSignature__tMethodSignature____target,
				jMethodToTMethodSignature__jMethod____source,
				tMethodSignature__tMethodDefinition____definitions,
				tMethodDefinition__tMethodSignature____signature };
	}

	public static final void pattern_MethodSignatureLinkDefinition_1_5_expressionBBBBBBBBBB(
			MethodSignatureLinkDefinition _this, PerformRuleResult ruleresult,
			EObject jMethod, EObject jMethodToTMethodSignature,
			EObject jParameterList, EObject tMethodDefinition,
			EObject jMethodToTMethodDefinition,
			EObject jParameterListToTParameterList, EObject tMethodSignature,
			EObject tParameterList) {
		_this.registerObjects_FWD(ruleresult, jMethod,
				jMethodToTMethodSignature, jParameterList, tMethodDefinition,
				jMethodToTMethodDefinition, jParameterListToTParameterList,
				tMethodSignature, tParameterList);

	}

	public static final PerformRuleResult pattern_MethodSignatureLinkDefinition_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_2_1_bindingFB(
			MethodSignatureLinkDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_2_1_blackFBB(
			EClass eClass, MethodSignatureLinkDefinition _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_2_1_bindingAndBlackFFB(
			MethodSignatureLinkDefinition _this) {
		Object[] result_pattern_MethodSignatureLinkDefinition_2_1_binding = pattern_MethodSignatureLinkDefinition_2_1_bindingFB(_this);
		if (result_pattern_MethodSignatureLinkDefinition_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodSignatureLinkDefinition_2_1_binding[0];

			Object[] result_pattern_MethodSignatureLinkDefinition_2_1_black = pattern_MethodSignatureLinkDefinition_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_MethodSignatureLinkDefinition_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodSignatureLinkDefinition_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodSignatureLinkDefinition";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_2_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("jMethod");
		EObject _localVariable_1 = match.getObject("jParameterList");
		EObject tmpJMethod = _localVariable_0;
		EObject tmpJParameterList = _localVariable_1;
		if (tmpJMethod instanceof ExtendedClassMethod) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
			if (tmpJParameterList instanceof ExtendedParameterList) {
				ExtendedParameterList jParameterList = (ExtendedParameterList) tmpJParameterList;
				return new Object[] { jMethod, jParameterList, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignatureLinkDefinition_2_2_blackBBFFFFB(
			ExtendedClassMethod jMethod, ExtendedParameterList jParameterList,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ClassMethodToTMethodDefinition jMethodToTMethodDefinition : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(jMethod,
						ClassMethodToTMethodDefinition.class, "source")) {
			TMethodDefinition tMethodDefinition = jMethodToTMethodDefinition
					.getTarget();
			if (tMethodDefinition != null) {
				for (ExtendedParameterListToTParameterList jParameterListToTParameterList : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(jParameterList,
								ExtendedParameterListToTParameterList.class,
								"source")) {
					TParameterList tParameterList = jParameterListToTParameterList
							.getTarget();
					if (tParameterList != null) {
						_result.add(new Object[] { jMethod, jParameterList,
								tMethodDefinition, jMethodToTMethodDefinition,
								jParameterListToTParameterList, tParameterList,
								match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodSignatureLinkDefinition_2_3_blackBBBBBFB(
			ExtendedClassMethod jMethod,
			ExtendedParameterList jParameterList,
			TMethodDefinition tMethodDefinition,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			TParameterList tParameterList) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (jParameterList.getMethods().contains(jMethod)) {
			if (jMethod.equals(jMethodToTMethodDefinition.getSource())) {
				if (tMethodDefinition.equals(jMethodToTMethodDefinition
						.getTarget())) {
					if (tParameterList.equals(jParameterListToTParameterList
							.getTarget())) {
						if (jParameterList
								.equals(jParameterListToTParameterList
										.getSource())) {
							for (TMethodSignature tMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(tParameterList,
											TMethodSignature.class, "paramList")) {
								_result.add(new Object[] { jMethod,
										jParameterList, tMethodDefinition,
										jMethodToTMethodDefinition,
										jParameterListToTParameterList,
										tMethodSignature, tParameterList });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_2_3_greenBBBBBBBFFFFFFFF(
			ExtendedClassMethod jMethod,
			ExtendedParameterList jParameterList,
			TMethodDefinition tMethodDefinition,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge jParameterList__jMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__jParameterList____parameter_list = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodDefinition__jMethod____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodDefinition__tMethodDefinition____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterListToTParameterList__tParameterList____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterListToTParameterList__jParameterList____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tParameterList____paramList = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jParameterList__jMethod____methods_name_prime = "methods";
		String jMethod__jParameterList____parameter_list_name_prime = "parameter_list";
		String jMethodToTMethodDefinition__jMethod____source_name_prime = "source";
		String jMethodToTMethodDefinition__tMethodDefinition____target_name_prime = "target";
		String jParameterListToTParameterList__tParameterList____target_name_prime = "target";
		String jParameterListToTParameterList__jParameterList____source_name_prime = "source";
		String tMethodSignature__tParameterList____paramList_name_prime = "paramList";
		isApplicableMatch.getAllContextElements().add(jMethod);
		isApplicableMatch.getAllContextElements().add(jParameterList);
		isApplicableMatch.getAllContextElements().add(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(
				jMethodToTMethodDefinition);
		isApplicableMatch.getAllContextElements().add(
				jParameterListToTParameterList);
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(tParameterList);
		jParameterList__jMethod____methods.setSrc(jParameterList);
		jParameterList__jMethod____methods.setTrg(jMethod);
		isApplicableMatch.getAllContextElements().add(
				jParameterList__jMethod____methods);
		jMethod__jParameterList____parameter_list.setSrc(jMethod);
		jMethod__jParameterList____parameter_list.setTrg(jParameterList);
		isApplicableMatch.getAllContextElements().add(
				jMethod__jParameterList____parameter_list);
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
		tMethodSignature__tParameterList____paramList.setSrc(tMethodSignature);
		tMethodSignature__tParameterList____paramList.setTrg(tParameterList);
		isApplicableMatch.getAllContextElements().add(
				tMethodSignature__tParameterList____paramList);
		jParameterList__jMethod____methods
				.setName(jParameterList__jMethod____methods_name_prime);
		jMethod__jParameterList____parameter_list
				.setName(jMethod__jParameterList____parameter_list_name_prime);
		jMethodToTMethodDefinition__jMethod____source
				.setName(jMethodToTMethodDefinition__jMethod____source_name_prime);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setName(jMethodToTMethodDefinition__tMethodDefinition____target_name_prime);
		jParameterListToTParameterList__tParameterList____target
				.setName(jParameterListToTParameterList__tParameterList____target_name_prime);
		jParameterListToTParameterList__jParameterList____source
				.setName(jParameterListToTParameterList__jParameterList____source_name_prime);
		tMethodSignature__tParameterList____paramList
				.setName(tMethodSignature__tParameterList____paramList_name_prime);
		return new Object[] { jMethod, jParameterList, tMethodDefinition,
				jMethodToTMethodDefinition, jParameterListToTParameterList,
				tMethodSignature, tParameterList, isApplicableMatch,
				jParameterList__jMethod____methods,
				jMethod__jParameterList____parameter_list,
				jMethodToTMethodDefinition__jMethod____source,
				jMethodToTMethodDefinition__tMethodDefinition____target,
				jParameterListToTParameterList__tParameterList____target,
				jParameterListToTParameterList__jParameterList____source,
				tMethodSignature__tParameterList____paramList };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_2_4_bindingFBBBBBBBBB(
			MethodSignatureLinkDefinition _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedClassMethod jMethod,
			ExtendedParameterList jParameterList,
			TMethodDefinition tMethodDefinition,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, jMethod, jParameterList, tMethodDefinition,
				jMethodToTMethodDefinition, jParameterListToTParameterList,
				tMethodSignature, tParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jMethod,
					jParameterList, tMethodDefinition,
					jMethodToTMethodDefinition, jParameterListToTParameterList,
					tMethodSignature, tParameterList };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_2_4_bindingAndBlackFBBBBBBBBB(
			MethodSignatureLinkDefinition _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedClassMethod jMethod,
			ExtendedParameterList jParameterList,
			TMethodDefinition tMethodDefinition,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		Object[] result_pattern_MethodSignatureLinkDefinition_2_4_binding = pattern_MethodSignatureLinkDefinition_2_4_bindingFBBBBBBBBB(
				_this, isApplicableMatch, jMethod, jParameterList,
				tMethodDefinition, jMethodToTMethodDefinition,
				jParameterListToTParameterList, tMethodSignature,
				tParameterList);
		if (result_pattern_MethodSignatureLinkDefinition_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignatureLinkDefinition_2_4_binding[0];

			Object[] result_pattern_MethodSignatureLinkDefinition_2_4_black = pattern_MethodSignatureLinkDefinition_2_4_blackB(csp);
			if (result_pattern_MethodSignatureLinkDefinition_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jMethod,
						jParameterList, tMethodDefinition,
						jMethodToTMethodDefinition,
						jParameterListToTParameterList, tMethodSignature,
						tParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureLinkDefinition_2_5_expressionFBB(
			MethodSignatureLinkDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodSignatureLinkDefinition";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodSignatureLinkDefinition_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_10_1_blackBBBBB(
			MethodSignatureLinkDefinition _this, Match match,
			TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		return new Object[] { _this, match, tMethodDefinition,
				tMethodSignature, tParameterList };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_10_2_bindingFBBBBB(
			MethodSignatureLinkDefinition _this, Match match,
			TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				tMethodDefinition, tMethodSignature, tParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tMethodDefinition,
					tMethodSignature, tParameterList };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_10_2_bindingAndBlackFBBBBB(
			MethodSignatureLinkDefinition _this, Match match,
			TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		Object[] result_pattern_MethodSignatureLinkDefinition_10_2_binding = pattern_MethodSignatureLinkDefinition_10_2_bindingFBBBBB(
				_this, match, tMethodDefinition, tMethodSignature,
				tParameterList);
		if (result_pattern_MethodSignatureLinkDefinition_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignatureLinkDefinition_10_2_binding[0];

			Object[] result_pattern_MethodSignatureLinkDefinition_10_2_black = pattern_MethodSignatureLinkDefinition_10_2_blackB(csp);
			if (result_pattern_MethodSignatureLinkDefinition_10_2_black != null) {

				return new Object[] { csp, _this, match, tMethodDefinition,
						tMethodSignature, tParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureLinkDefinition_10_3_expressionFBB(
			MethodSignatureLinkDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_10_4_blackBBBB(
			Match match, TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		return new Object[] { match, tMethodDefinition, tMethodSignature,
				tParameterList };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_10_4_greenBBBFF(
			Match match, TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature) {
		EMoflonEdge tMethodSignature__tMethodDefinition____definitions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodDefinition__tMethodSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tMethodSignature__tMethodDefinition____definitions_name_prime = "definitions";
		String tMethodDefinition__tMethodSignature____signature_name_prime = "signature";
		tMethodSignature__tMethodDefinition____definitions
				.setSrc(tMethodSignature);
		tMethodSignature__tMethodDefinition____definitions
				.setTrg(tMethodDefinition);
		match.getToBeTranslatedEdges().add(
				tMethodSignature__tMethodDefinition____definitions);
		tMethodDefinition__tMethodSignature____signature
				.setSrc(tMethodDefinition);
		tMethodDefinition__tMethodSignature____signature
				.setTrg(tMethodSignature);
		match.getToBeTranslatedEdges().add(
				tMethodDefinition__tMethodSignature____signature);
		tMethodSignature__tMethodDefinition____definitions
				.setName(tMethodSignature__tMethodDefinition____definitions_name_prime);
		tMethodDefinition__tMethodSignature____signature
				.setName(tMethodDefinition__tMethodSignature____signature_name_prime);
		return new Object[] { match, tMethodDefinition, tMethodSignature,
				tMethodSignature__tMethodDefinition____definitions,
				tMethodDefinition__tMethodSignature____signature };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_10_5_blackBBBB(
			Match match, TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		return new Object[] { match, tMethodDefinition, tMethodSignature,
				tParameterList };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_10_5_greenBBBBF(
			Match match, TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		EMoflonEdge tMethodSignature__tParameterList____paramList = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(tMethodDefinition);
		match.getContextNodes().add(tMethodSignature);
		match.getContextNodes().add(tParameterList);
		String tMethodSignature__tParameterList____paramList_name_prime = "paramList";
		tMethodSignature__tParameterList____paramList.setSrc(tMethodSignature);
		tMethodSignature__tParameterList____paramList.setTrg(tParameterList);
		match.getContextEdges().add(
				tMethodSignature__tParameterList____paramList);
		tMethodSignature__tParameterList____paramList
				.setName(tMethodSignature__tParameterList____paramList_name_prime);
		return new Object[] { match, tMethodDefinition, tMethodSignature,
				tParameterList, tMethodSignature__tParameterList____paramList };
	}

	public static final void pattern_MethodSignatureLinkDefinition_10_6_expressionBBBBB(
			MethodSignatureLinkDefinition _this, Match match,
			TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		_this.registerObjectsToMatch_BWD(match, tMethodDefinition,
				tMethodSignature, tParameterList);

	}

	public static final boolean pattern_MethodSignatureLinkDefinition_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignatureLinkDefinition_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_11_1_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jMethod");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("jParameterList");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("tMethodDefinition");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("jMethodToTMethodDefinition");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("jParameterListToTParameterList");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("tMethodSignature");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("tParameterList");
		EObject tmpJMethod = _localVariable_0;
		EObject tmpJParameterList = _localVariable_1;
		EObject tmpTMethodDefinition = _localVariable_2;
		EObject tmpJMethodToTMethodDefinition = _localVariable_3;
		EObject tmpJParameterListToTParameterList = _localVariable_4;
		EObject tmpTMethodSignature = _localVariable_5;
		EObject tmpTParameterList = _localVariable_6;
		if (tmpJMethod instanceof ExtendedClassMethod) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
			if (tmpJParameterList instanceof ExtendedParameterList) {
				ExtendedParameterList jParameterList = (ExtendedParameterList) tmpJParameterList;
				if (tmpTMethodDefinition instanceof TMethodDefinition) {
					TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
					if (tmpJMethodToTMethodDefinition instanceof ClassMethodToTMethodDefinition) {
						ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) tmpJMethodToTMethodDefinition;
						if (tmpJParameterListToTParameterList instanceof ExtendedParameterListToTParameterList) {
							ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) tmpJParameterListToTParameterList;
							if (tmpTMethodSignature instanceof TMethodSignature) {
								TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
								if (tmpTParameterList instanceof TParameterList) {
									TParameterList tParameterList = (TParameterList) tmpTParameterList;
									return new Object[] { jMethod,
											jParameterList, tMethodDefinition,
											jMethodToTMethodDefinition,
											jParameterListToTParameterList,
											tMethodSignature, tParameterList,
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

	public static final Object[] pattern_MethodSignatureLinkDefinition_11_1_blackBBBBBBBFBB(
			ExtendedClassMethod jMethod,
			ExtendedParameterList jParameterList,
			TMethodDefinition tMethodDefinition,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			TMethodSignature tMethodSignature, TParameterList tParameterList,
			MethodSignatureLinkDefinition _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jMethod, jParameterList,
						tMethodDefinition, jMethodToTMethodDefinition,
						jParameterListToTParameterList, tMethodSignature,
						tParameterList, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_11_1_bindingAndBlackFFFFFFFFBB(
			MethodSignatureLinkDefinition _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodSignatureLinkDefinition_11_1_binding = pattern_MethodSignatureLinkDefinition_11_1_bindingFFFFFFFB(isApplicableMatch);
		if (result_pattern_MethodSignatureLinkDefinition_11_1_binding != null) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result_pattern_MethodSignatureLinkDefinition_11_1_binding[0];
			ExtendedParameterList jParameterList = (ExtendedParameterList) result_pattern_MethodSignatureLinkDefinition_11_1_binding[1];
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result_pattern_MethodSignatureLinkDefinition_11_1_binding[2];
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result_pattern_MethodSignatureLinkDefinition_11_1_binding[3];
			ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) result_pattern_MethodSignatureLinkDefinition_11_1_binding[4];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_MethodSignatureLinkDefinition_11_1_binding[5];
			TParameterList tParameterList = (TParameterList) result_pattern_MethodSignatureLinkDefinition_11_1_binding[6];

			Object[] result_pattern_MethodSignatureLinkDefinition_11_1_black = pattern_MethodSignatureLinkDefinition_11_1_blackBBBBBBBFBB(
					jMethod, jParameterList, tMethodDefinition,
					jMethodToTMethodDefinition, jParameterListToTParameterList,
					tMethodSignature, tParameterList, _this, isApplicableMatch);
			if (result_pattern_MethodSignatureLinkDefinition_11_1_black != null) {
				CSP csp = (CSP) result_pattern_MethodSignatureLinkDefinition_11_1_black[7];

				return new Object[] { jMethod, jParameterList,
						tMethodDefinition, jMethodToTMethodDefinition,
						jParameterListToTParameterList, tMethodSignature,
						tParameterList, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_11_1_greenBFBB(
			ExtendedClassMethod jMethod, ExtendedParameterList jParameterList,
			TMethodSignature tMethodSignature) {
		ClassMethodToTMethodSignature jMethodToTMethodSignature = GravityTGGFactory.eINSTANCE
				.createClassMethodToTMethodSignature();
		jParameterList.getMethods().add(jMethod);
		jMethodToTMethodSignature.setTarget(tMethodSignature);
		jMethodToTMethodSignature.setSource(jMethod);
		return new Object[] { jMethod, jMethodToTMethodSignature,
				jParameterList, tMethodSignature };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_11_2_blackB(
			ClassMethodToTMethodSignature jMethodToTMethodSignature) {
		return new Object[] { jMethodToTMethodSignature };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_11_2_greenFB(
			ClassMethodToTMethodSignature jMethodToTMethodSignature) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(jMethodToTMethodSignature);
		return new Object[] { ruleresult, jMethodToTMethodSignature };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_11_3_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject jMethod,
			EObject jMethodToTMethodSignature, EObject jParameterList,
			EObject tMethodDefinition, EObject jMethodToTMethodDefinition,
			EObject jParameterListToTParameterList, EObject tMethodSignature,
			EObject tParameterList) {
		if (!jMethod.equals(jMethodToTMethodSignature)) {
			if (!jMethod.equals(jParameterList)) {
				if (!jMethod.equals(tMethodDefinition)) {
					if (!jMethod.equals(jMethodToTMethodDefinition)) {
						if (!jMethod.equals(jParameterListToTParameterList)) {
							if (!jMethod.equals(tMethodSignature)) {
								if (!jMethod.equals(tParameterList)) {
									if (!jMethodToTMethodSignature
											.equals(jParameterList)) {
										if (!jMethodToTMethodSignature
												.equals(tMethodDefinition)) {
											if (!jMethodToTMethodSignature
													.equals(jParameterListToTParameterList)) {
												if (!jMethodToTMethodSignature
														.equals(tMethodSignature)) {
													if (!jMethodToTMethodSignature
															.equals(tParameterList)) {
														if (!jParameterList
																.equals(tMethodDefinition)) {
															if (!jParameterList
																	.equals(jParameterListToTParameterList)) {
																if (!jParameterList
																		.equals(tMethodSignature)) {
																	if (!jParameterList
																			.equals(tParameterList)) {
																		if (!tMethodDefinition
																				.equals(tMethodSignature)) {
																			if (!tMethodDefinition
																					.equals(tParameterList)) {
																				if (!jMethodToTMethodDefinition
																						.equals(jMethodToTMethodSignature)) {
																					if (!jMethodToTMethodDefinition
																							.equals(jParameterList)) {
																						if (!jMethodToTMethodDefinition
																								.equals(tMethodDefinition)) {
																							if (!jMethodToTMethodDefinition
																									.equals(jParameterListToTParameterList)) {
																								if (!jMethodToTMethodDefinition
																										.equals(tMethodSignature)) {
																									if (!jMethodToTMethodDefinition
																											.equals(tParameterList)) {
																										if (!jParameterListToTParameterList
																												.equals(tMethodDefinition)) {
																											if (!jParameterListToTParameterList
																													.equals(tMethodSignature)) {
																												if (!jParameterListToTParameterList
																														.equals(tParameterList)) {
																													if (!tMethodSignature
																															.equals(tParameterList)) {
																														return new Object[] {
																																ruleresult,
																																jMethod,
																																jMethodToTMethodSignature,
																																jParameterList,
																																tMethodDefinition,
																																jMethodToTMethodDefinition,
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
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodSignatureLinkDefinition_11_3_greenBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject jMethod,
			EObject jMethodToTMethodSignature, EObject jParameterList,
			EObject tMethodDefinition, EObject tMethodSignature) {
		EMoflonEdge jParameterList__jMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__jParameterList____parameter_list = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodSignature__tMethodSignature____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodSignature__jMethod____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tMethodDefinition____definitions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodDefinition__tMethodSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodSignatureLinkDefinition";
		String jParameterList__jMethod____methods_name_prime = "methods";
		String jMethod__jParameterList____parameter_list_name_prime = "parameter_list";
		String jMethodToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String jMethodToTMethodSignature__jMethod____source_name_prime = "source";
		String tMethodSignature__tMethodDefinition____definitions_name_prime = "definitions";
		String tMethodDefinition__tMethodSignature____signature_name_prime = "signature";
		jParameterList__jMethod____methods.setSrc(jParameterList);
		jParameterList__jMethod____methods.setTrg(jMethod);
		ruleresult.getCreatedEdges().add(jParameterList__jMethod____methods);
		jMethod__jParameterList____parameter_list.setSrc(jMethod);
		jMethod__jParameterList____parameter_list.setTrg(jParameterList);
		ruleresult.getCreatedEdges().add(
				jMethod__jParameterList____parameter_list);
		jMethodToTMethodSignature__tMethodSignature____target
				.setSrc(jMethodToTMethodSignature);
		jMethodToTMethodSignature__tMethodSignature____target
				.setTrg(tMethodSignature);
		ruleresult.getCreatedEdges().add(
				jMethodToTMethodSignature__tMethodSignature____target);
		jMethodToTMethodSignature__jMethod____source
				.setSrc(jMethodToTMethodSignature);
		jMethodToTMethodSignature__jMethod____source.setTrg(jMethod);
		ruleresult.getCreatedEdges().add(
				jMethodToTMethodSignature__jMethod____source);
		tMethodSignature__tMethodDefinition____definitions
				.setSrc(tMethodSignature);
		tMethodSignature__tMethodDefinition____definitions
				.setTrg(tMethodDefinition);
		ruleresult.getTranslatedEdges().add(
				tMethodSignature__tMethodDefinition____definitions);
		tMethodDefinition__tMethodSignature____signature
				.setSrc(tMethodDefinition);
		tMethodDefinition__tMethodSignature____signature
				.setTrg(tMethodSignature);
		ruleresult.getTranslatedEdges().add(
				tMethodDefinition__tMethodSignature____signature);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jParameterList__jMethod____methods
				.setName(jParameterList__jMethod____methods_name_prime);
		jMethod__jParameterList____parameter_list
				.setName(jMethod__jParameterList____parameter_list_name_prime);
		jMethodToTMethodSignature__tMethodSignature____target
				.setName(jMethodToTMethodSignature__tMethodSignature____target_name_prime);
		jMethodToTMethodSignature__jMethod____source
				.setName(jMethodToTMethodSignature__jMethod____source_name_prime);
		tMethodSignature__tMethodDefinition____definitions
				.setName(tMethodSignature__tMethodDefinition____definitions_name_prime);
		tMethodDefinition__tMethodSignature____signature
				.setName(tMethodDefinition__tMethodSignature____signature_name_prime);
		return new Object[] { ruleresult, jMethod, jMethodToTMethodSignature,
				jParameterList, tMethodDefinition, tMethodSignature,
				jParameterList__jMethod____methods,
				jMethod__jParameterList____parameter_list,
				jMethodToTMethodSignature__tMethodSignature____target,
				jMethodToTMethodSignature__jMethod____source,
				tMethodSignature__tMethodDefinition____definitions,
				tMethodDefinition__tMethodSignature____signature };
	}

	public static final void pattern_MethodSignatureLinkDefinition_11_5_expressionBBBBBBBBBB(
			MethodSignatureLinkDefinition _this, PerformRuleResult ruleresult,
			EObject jMethod, EObject jMethodToTMethodSignature,
			EObject jParameterList, EObject tMethodDefinition,
			EObject jMethodToTMethodDefinition,
			EObject jParameterListToTParameterList, EObject tMethodSignature,
			EObject tParameterList) {
		_this.registerObjects_BWD(ruleresult, jMethod,
				jMethodToTMethodSignature, jParameterList, tMethodDefinition,
				jMethodToTMethodDefinition, jParameterListToTParameterList,
				tMethodSignature, tParameterList);

	}

	public static final PerformRuleResult pattern_MethodSignatureLinkDefinition_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_12_1_bindingFB(
			MethodSignatureLinkDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_12_1_blackFBB(
			EClass eClass, MethodSignatureLinkDefinition _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_12_1_bindingAndBlackFFB(
			MethodSignatureLinkDefinition _this) {
		Object[] result_pattern_MethodSignatureLinkDefinition_12_1_binding = pattern_MethodSignatureLinkDefinition_12_1_bindingFB(_this);
		if (result_pattern_MethodSignatureLinkDefinition_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodSignatureLinkDefinition_12_1_binding[0];

			Object[] result_pattern_MethodSignatureLinkDefinition_12_1_black = pattern_MethodSignatureLinkDefinition_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_MethodSignatureLinkDefinition_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodSignatureLinkDefinition_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodSignatureLinkDefinition";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_12_2_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("tMethodDefinition");
		EObject _localVariable_1 = match.getObject("tMethodSignature");
		EObject _localVariable_2 = match.getObject("tParameterList");
		EObject tmpTMethodDefinition = _localVariable_0;
		EObject tmpTMethodSignature = _localVariable_1;
		EObject tmpTParameterList = _localVariable_2;
		if (tmpTMethodDefinition instanceof TMethodDefinition) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
			if (tmpTMethodSignature instanceof TMethodSignature) {
				TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
				if (tmpTParameterList instanceof TParameterList) {
					TParameterList tParameterList = (TParameterList) tmpTParameterList;
					return new Object[] { tMethodDefinition, tMethodSignature,
							tParameterList, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignatureLinkDefinition_12_2_blackFFBFFBBB(
			TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TParameterList tParameterList,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ClassMethodToTMethodDefinition jMethodToTMethodDefinition : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tMethodDefinition,
						ClassMethodToTMethodDefinition.class, "target")) {
			ExtendedClassMethod jMethod = jMethodToTMethodDefinition
					.getSource();
			if (jMethod != null) {
				for (ExtendedParameterListToTParameterList jParameterListToTParameterList : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tParameterList,
								ExtendedParameterListToTParameterList.class,
								"target")) {
					ExtendedParameterList jParameterList = jParameterListToTParameterList
							.getSource();
					if (jParameterList != null) {
						_result.add(new Object[] { jMethod, jParameterList,
								tMethodDefinition, jMethodToTMethodDefinition,
								jParameterListToTParameterList,
								tMethodSignature, tParameterList, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodSignatureLinkDefinition_12_3_blackBBBBBBB(
			ExtendedClassMethod jMethod,
			ExtendedParameterList jParameterList,
			TMethodDefinition tMethodDefinition,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tMethodSignature.getDefinitions().contains(tMethodDefinition)) {
			if (jMethod.equals(jMethodToTMethodDefinition.getSource())) {
				if (tMethodDefinition.equals(jMethodToTMethodDefinition
						.getTarget())) {
					if (tParameterList.equals(jParameterListToTParameterList
							.getTarget())) {
						if (jParameterList
								.equals(jParameterListToTParameterList
										.getSource())) {
							if (tParameterList.equals(tMethodSignature
									.getParamList())) {
								_result.add(new Object[] { jMethod,
										jParameterList, tMethodDefinition,
										jMethodToTMethodDefinition,
										jParameterListToTParameterList,
										tMethodSignature, tParameterList });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_12_3_greenBBBBBBBFFFFFFFF(
			ExtendedClassMethod jMethod,
			ExtendedParameterList jParameterList,
			TMethodDefinition tMethodDefinition,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge tMethodSignature__tMethodDefinition____definitions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodDefinition__tMethodSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodDefinition__jMethod____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodDefinition__tMethodDefinition____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterListToTParameterList__tParameterList____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterListToTParameterList__jParameterList____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tParameterList____paramList = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tMethodSignature__tMethodDefinition____definitions_name_prime = "definitions";
		String tMethodDefinition__tMethodSignature____signature_name_prime = "signature";
		String jMethodToTMethodDefinition__jMethod____source_name_prime = "source";
		String jMethodToTMethodDefinition__tMethodDefinition____target_name_prime = "target";
		String jParameterListToTParameterList__tParameterList____target_name_prime = "target";
		String jParameterListToTParameterList__jParameterList____source_name_prime = "source";
		String tMethodSignature__tParameterList____paramList_name_prime = "paramList";
		isApplicableMatch.getAllContextElements().add(jMethod);
		isApplicableMatch.getAllContextElements().add(jParameterList);
		isApplicableMatch.getAllContextElements().add(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(
				jMethodToTMethodDefinition);
		isApplicableMatch.getAllContextElements().add(
				jParameterListToTParameterList);
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(tParameterList);
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
		tMethodSignature__tParameterList____paramList.setSrc(tMethodSignature);
		tMethodSignature__tParameterList____paramList.setTrg(tParameterList);
		isApplicableMatch.getAllContextElements().add(
				tMethodSignature__tParameterList____paramList);
		tMethodSignature__tMethodDefinition____definitions
				.setName(tMethodSignature__tMethodDefinition____definitions_name_prime);
		tMethodDefinition__tMethodSignature____signature
				.setName(tMethodDefinition__tMethodSignature____signature_name_prime);
		jMethodToTMethodDefinition__jMethod____source
				.setName(jMethodToTMethodDefinition__jMethod____source_name_prime);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setName(jMethodToTMethodDefinition__tMethodDefinition____target_name_prime);
		jParameterListToTParameterList__tParameterList____target
				.setName(jParameterListToTParameterList__tParameterList____target_name_prime);
		jParameterListToTParameterList__jParameterList____source
				.setName(jParameterListToTParameterList__jParameterList____source_name_prime);
		tMethodSignature__tParameterList____paramList
				.setName(tMethodSignature__tParameterList____paramList_name_prime);
		return new Object[] { jMethod, jParameterList, tMethodDefinition,
				jMethodToTMethodDefinition, jParameterListToTParameterList,
				tMethodSignature, tParameterList, isApplicableMatch,
				tMethodSignature__tMethodDefinition____definitions,
				tMethodDefinition__tMethodSignature____signature,
				jMethodToTMethodDefinition__jMethod____source,
				jMethodToTMethodDefinition__tMethodDefinition____target,
				jParameterListToTParameterList__tParameterList____target,
				jParameterListToTParameterList__jParameterList____source,
				tMethodSignature__tParameterList____paramList };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_12_4_bindingFBBBBBBBBB(
			MethodSignatureLinkDefinition _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedClassMethod jMethod,
			ExtendedParameterList jParameterList,
			TMethodDefinition tMethodDefinition,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, jMethod, jParameterList, tMethodDefinition,
				jMethodToTMethodDefinition, jParameterListToTParameterList,
				tMethodSignature, tParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jMethod,
					jParameterList, tMethodDefinition,
					jMethodToTMethodDefinition, jParameterListToTParameterList,
					tMethodSignature, tParameterList };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_12_4_bindingAndBlackFBBBBBBBBB(
			MethodSignatureLinkDefinition _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedClassMethod jMethod,
			ExtendedParameterList jParameterList,
			TMethodDefinition tMethodDefinition,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		Object[] result_pattern_MethodSignatureLinkDefinition_12_4_binding = pattern_MethodSignatureLinkDefinition_12_4_bindingFBBBBBBBBB(
				_this, isApplicableMatch, jMethod, jParameterList,
				tMethodDefinition, jMethodToTMethodDefinition,
				jParameterListToTParameterList, tMethodSignature,
				tParameterList);
		if (result_pattern_MethodSignatureLinkDefinition_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignatureLinkDefinition_12_4_binding[0];

			Object[] result_pattern_MethodSignatureLinkDefinition_12_4_black = pattern_MethodSignatureLinkDefinition_12_4_blackB(csp);
			if (result_pattern_MethodSignatureLinkDefinition_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jMethod,
						jParameterList, tMethodDefinition,
						jMethodToTMethodDefinition,
						jParameterListToTParameterList, tMethodSignature,
						tParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureLinkDefinition_12_5_expressionFBB(
			MethodSignatureLinkDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodSignatureLinkDefinition";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodSignatureLinkDefinition_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_20_1_bindingFB(
			MethodSignatureLinkDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_20_1_blackFBB(
			EClass __eClass, MethodSignatureLinkDefinition _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_20_1_bindingAndBlackFFB(
			MethodSignatureLinkDefinition _this) {
		Object[] result_pattern_MethodSignatureLinkDefinition_20_1_binding = pattern_MethodSignatureLinkDefinition_20_1_bindingFB(_this);
		if (result_pattern_MethodSignatureLinkDefinition_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodSignatureLinkDefinition_20_1_binding[0];

			Object[] result_pattern_MethodSignatureLinkDefinition_20_1_black = pattern_MethodSignatureLinkDefinition_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_MethodSignatureLinkDefinition_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodSignatureLinkDefinition_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodSignatureLinkDefinition_20_2_blackFFB(
			EMoflonEdge _edge_methods) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJParameterList = _edge_methods.getSrc();
		if (tmpJParameterList instanceof ExtendedParameterList) {
			ExtendedParameterList jParameterList = (ExtendedParameterList) tmpJParameterList;
			EObject tmpJMethod = _edge_methods.getTrg();
			if (tmpJMethod instanceof ExtendedClassMethod) {
				ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
				if (jParameterList.getMethods().contains(jMethod)) {
					_result.add(new Object[] { jMethod, jParameterList,
							_edge_methods });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodSignatureLinkDefinition_20_3_expressionFBBBB(
			MethodSignatureLinkDefinition _this, Match match,
			ExtendedClassMethod jMethod, ExtendedParameterList jParameterList) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jMethod,
				jParameterList);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodSignatureLinkDefinition_20_4_expressionFBB(
			MethodSignatureLinkDefinition _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_MethodSignatureLinkDefinition_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_21_1_bindingFB(
			MethodSignatureLinkDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_21_1_blackFBB(
			EClass __eClass, MethodSignatureLinkDefinition _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_21_1_bindingAndBlackFFB(
			MethodSignatureLinkDefinition _this) {
		Object[] result_pattern_MethodSignatureLinkDefinition_21_1_binding = pattern_MethodSignatureLinkDefinition_21_1_bindingFB(_this);
		if (result_pattern_MethodSignatureLinkDefinition_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodSignatureLinkDefinition_21_1_binding[0];

			Object[] result_pattern_MethodSignatureLinkDefinition_21_1_black = pattern_MethodSignatureLinkDefinition_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_MethodSignatureLinkDefinition_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodSignatureLinkDefinition_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodSignatureLinkDefinition_21_2_blackFFB(
			EMoflonEdge _edge_parameter_list) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJMethod = _edge_parameter_list.getSrc();
		if (tmpJMethod instanceof ExtendedClassMethod) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
			EObject tmpJParameterList = _edge_parameter_list.getTrg();
			if (tmpJParameterList instanceof ExtendedParameterList) {
				ExtendedParameterList jParameterList = (ExtendedParameterList) tmpJParameterList;
				if (jParameterList.getMethods().contains(jMethod)) {
					_result.add(new Object[] { jMethod, jParameterList,
							_edge_parameter_list });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodSignatureLinkDefinition_21_3_expressionFBBBB(
			MethodSignatureLinkDefinition _this, Match match,
			ExtendedClassMethod jMethod, ExtendedParameterList jParameterList) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jMethod,
				jParameterList);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodSignatureLinkDefinition_21_4_expressionFBB(
			MethodSignatureLinkDefinition _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_MethodSignatureLinkDefinition_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_22_1_bindingFB(
			MethodSignatureLinkDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_22_1_blackFBB(
			EClass __eClass, MethodSignatureLinkDefinition _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_22_1_bindingAndBlackFFB(
			MethodSignatureLinkDefinition _this) {
		Object[] result_pattern_MethodSignatureLinkDefinition_22_1_binding = pattern_MethodSignatureLinkDefinition_22_1_bindingFB(_this);
		if (result_pattern_MethodSignatureLinkDefinition_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodSignatureLinkDefinition_22_1_binding[0];

			Object[] result_pattern_MethodSignatureLinkDefinition_22_1_black = pattern_MethodSignatureLinkDefinition_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_MethodSignatureLinkDefinition_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodSignatureLinkDefinition_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodSignatureLinkDefinition_22_2_blackFFFB(
			EMoflonEdge _edge_definitions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMethodSignature = _edge_definitions.getSrc();
		if (tmpTMethodSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
			EObject tmpTMethodDefinition = _edge_definitions.getTrg();
			if (tmpTMethodDefinition instanceof TMethodDefinition) {
				TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
				if (tMethodSignature.getDefinitions().contains(
						tMethodDefinition)) {
					TParameterList tParameterList = tMethodSignature
							.getParamList();
					if (tParameterList != null) {
						_result.add(new Object[] { tMethodDefinition,
								tMethodSignature, tParameterList,
								_edge_definitions });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodSignatureLinkDefinition_22_3_expressionFBBBBB(
			MethodSignatureLinkDefinition _this, Match match,
			TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match,
				tMethodDefinition, tMethodSignature, tParameterList);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodSignatureLinkDefinition_22_4_expressionFBB(
			MethodSignatureLinkDefinition _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_MethodSignatureLinkDefinition_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_23_1_bindingFB(
			MethodSignatureLinkDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_23_1_blackFBB(
			EClass __eClass, MethodSignatureLinkDefinition _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_23_1_bindingAndBlackFFB(
			MethodSignatureLinkDefinition _this) {
		Object[] result_pattern_MethodSignatureLinkDefinition_23_1_binding = pattern_MethodSignatureLinkDefinition_23_1_bindingFB(_this);
		if (result_pattern_MethodSignatureLinkDefinition_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodSignatureLinkDefinition_23_1_binding[0];

			Object[] result_pattern_MethodSignatureLinkDefinition_23_1_black = pattern_MethodSignatureLinkDefinition_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_MethodSignatureLinkDefinition_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodSignatureLinkDefinition_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodSignatureLinkDefinition_23_2_blackFFFB(
			EMoflonEdge _edge_signature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMethodDefinition = _edge_signature.getSrc();
		if (tmpTMethodDefinition instanceof TMethodDefinition) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
			EObject tmpTMethodSignature = _edge_signature.getTrg();
			if (tmpTMethodSignature instanceof TMethodSignature) {
				TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
				if (tMethodSignature.getDefinitions().contains(
						tMethodDefinition)) {
					TParameterList tParameterList = tMethodSignature
							.getParamList();
					if (tParameterList != null) {
						_result.add(new Object[] { tMethodDefinition,
								tMethodSignature, tParameterList,
								_edge_signature });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodSignatureLinkDefinition_23_3_expressionFBBBBB(
			MethodSignatureLinkDefinition _this, Match match,
			TMethodDefinition tMethodDefinition,
			TMethodSignature tMethodSignature, TParameterList tParameterList) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match,
				tMethodDefinition, tMethodSignature, tParameterList);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodSignatureLinkDefinition_23_4_expressionFBB(
			MethodSignatureLinkDefinition _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_MethodSignatureLinkDefinition_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_MethodSignatureLinkDefinition_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodSignatureLinkDefinitionImpl
