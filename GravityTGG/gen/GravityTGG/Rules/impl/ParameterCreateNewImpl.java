/**
 */
package GravityTGG.Rules.impl;

import ExtendedJamopp.ExtendedJamoppFactory;
import ExtendedJamopp.ExtendedJamoppJavaContainer;
import ExtendedJamopp.ExtendedMethodName;
import ExtendedJamopp.ExtendedParameter;
import ExtendedJamopp.ExtendedParameterList;

import GravityTGG.ExtendedJamoppJavaContainerToTypeGraph;
import GravityTGG.ExtendedMethodNameToTMethod;
import GravityTGG.ExtendedParameterListToTMethodSignature;
import GravityTGG.ExtendedParameterListToTParameterList;
import GravityTGG.ExtendedParameterToTParameter;
import GravityTGG.ExtendedParameterToTypeGraph;
import GravityTGG.GravityTGGFactory;

import GravityTGG.Rules.ParameterCreateNew;
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

import TypeGraphBasic.TMethod;
import TypeGraphBasic.TMethodSignature;
import TypeGraphBasic.TParameter;
import TypeGraphBasic.TParameterList;
import TypeGraphBasic.TypeGraph;
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
 * An implementation of the model object '<em><b>Parameter Create New</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParameterCreateNewImpl extends AbstractRuleImpl implements
		ParameterCreateNew {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterCreateNewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getParameterCreateNew();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedMethodName jMethodName, ExtendedParameter jParameter,
			ExtendedParameterList jParameterList) {
		// initial bindings
		Object[] result1_black = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_0_1_blackBBBBBB(this, match,
						extendedJamoppJavaContainer, jMethodName, jParameter,
						jParameterList);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_0_2_bindingAndBlackFBBBBBB(this,
						match, extendedJamoppJavaContainer, jMethodName,
						jParameter, jParameterList);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParameterCreateNewImpl
				.pattern_ParameterCreateNew_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParameterCreateNewImpl
					.pattern_ParameterCreateNew_0_4_blackBBBBB(match,
							extendedJamoppJavaContainer, jMethodName,
							jParameter, jParameterList);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ParameterCreateNewImpl.pattern_ParameterCreateNew_0_4_greenBBBF(
					match, jParameter, jParameterList);
			// EMoflonEdge jParameterList__jParameter____values = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = ParameterCreateNewImpl
					.pattern_ParameterCreateNew_0_5_blackBBBBB(match,
							extendedJamoppJavaContainer, jMethodName,
							jParameter, jParameterList);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ParameterCreateNewImpl.pattern_ParameterCreateNew_0_5_greenBBBBFF(
					match, extendedJamoppJavaContainer, jMethodName,
					jParameterList);
			// EMoflonEdge extendedJamoppJavaContainer__jParameterList____extendedParameterList = (EMoflonEdge) result5_green[4];
			// EMoflonEdge extendedJamoppJavaContainer__jMethodName____extendedMethodName = (EMoflonEdge) result5_green[5];

			// register objects to match
			ParameterCreateNewImpl
					.pattern_ParameterCreateNew_0_6_expressionBBBBBB(this,
							match, extendedJamoppJavaContainer, jMethodName,
							jParameter, jParameterList);
			return ParameterCreateNewImpl
					.pattern_ParameterCreateNew_0_7_expressionF();
		} else {
			return ParameterCreateNewImpl
					.pattern_ParameterCreateNew_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_1_1_bindingAndBlackFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result1_bindingAndBlack[0];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[1];
		ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg = (ExtendedJamoppJavaContainerToTypeGraph) result1_bindingAndBlack[2];
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[3];
		ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature = (ExtendedParameterListToTMethodSignature) result1_bindingAndBlack[4];
		ExtendedMethodName jMethodName = (ExtendedMethodName) result1_bindingAndBlack[5];
		TMethod tMethod = (TMethod) result1_bindingAndBlack[6];
		ExtendedParameter jParameter = (ExtendedParameter) result1_bindingAndBlack[7];
		TParameterList tParameterList = (TParameterList) result1_bindingAndBlack[8];
		ExtendedParameterList jParameterList = (ExtendedParameterList) result1_bindingAndBlack[9];
		ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) result1_bindingAndBlack[10];
		ExtendedMethodNameToTMethod jMethodNameToTMethod = (ExtendedMethodNameToTMethod) result1_bindingAndBlack[11];
		// CSP csp = (CSP) result1_bindingAndBlack[12];
		Object[] result1_green = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_1_1_greenBFBFBF(pg, jParameter,
						tParameterList);
		ExtendedParameterToTypeGraph jParameterToPg = (ExtendedParameterToTypeGraph) result1_green[1];
		TParameter tParameter = (TParameter) result1_green[3];
		ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result1_green[5];

		// collect translated elements
		Object[] result2_black = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_1_2_blackBBBB(jParameterToPg,
						jParameter, tParameter, jParameterToTParameter);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_1_2_greenFBBBB(jParameterToPg,
						jParameter, tParameter, jParameterToTParameter);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_1_3_blackBBBBBBBBBBBBBBBB(
						ruleresult, extendedJamoppJavaContainer, pg,
						extendedJamoppJavaContainerToPg, tMethodSignature,
						jParameterListToTMethodSignature, jParameterToPg,
						jMethodName, tMethod, jParameter, tParameter,
						tParameterList, jParameterList,
						jParameterListToTParameterList, jParameterToTParameter,
						jMethodNameToTMethod);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ParameterCreateNewImpl
				.pattern_ParameterCreateNew_1_3_greenBBBBBBBBFFFFFF(ruleresult,
						pg, jParameterToPg, jParameter, tParameter,
						tParameterList, jParameterList, jParameterToTParameter);
		// EMoflonEdge jParameterToPg__jParameter____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge jParameterToPg__pg____target = (EMoflonEdge) result3_green[9];
		// EMoflonEdge tParameterList__tParameter____entries = (EMoflonEdge) result3_green[10];
		// EMoflonEdge jParameterList__jParameter____values = (EMoflonEdge) result3_green[11];
		// EMoflonEdge jParameterToTParameter__tParameter____target = (EMoflonEdge) result3_green[12];
		// EMoflonEdge jParameterToTParameter__jParameter____source = (EMoflonEdge) result3_green[13];

		// perform postprocessing story node is empty
		// register objects
		ParameterCreateNewImpl
				.pattern_ParameterCreateNew_1_5_expressionBBBBBBBBBBBBBBBBB(
						this, ruleresult, extendedJamoppJavaContainer, pg,
						extendedJamoppJavaContainerToPg, tMethodSignature,
						jParameterListToTMethodSignature, jParameterToPg,
						jMethodName, tMethod, jParameter, tParameter,
						tParameterList, jParameterList,
						jParameterListToTParameterList, jParameterToTParameter,
						jMethodNameToTMethod);
		return ParameterCreateNewImpl
				.pattern_ParameterCreateNew_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result2_binding[0];
		ExtendedMethodName jMethodName = (ExtendedMethodName) result2_binding[1];
		ExtendedParameter jParameter = (ExtendedParameter) result2_binding[2];
		ExtendedParameterList jParameterList = (ExtendedParameterList) result2_binding[3];
		for (Object[] result2_black : ParameterCreateNewImpl
				.pattern_ParameterCreateNew_2_2_blackBFFFFBFBFBFFB(
						extendedJamoppJavaContainer, jMethodName, jParameter,
						jParameterList, match)) {
			TypeGraph pg = (TypeGraph) result2_black[1];
			ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg = (ExtendedJamoppJavaContainerToTypeGraph) result2_black[2];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[3];
			ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature = (ExtendedParameterListToTMethodSignature) result2_black[4];
			TMethod tMethod = (TMethod) result2_black[6];
			TParameterList tParameterList = (TParameterList) result2_black[8];
			ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) result2_black[10];
			ExtendedMethodNameToTMethod jMethodNameToTMethod = (ExtendedMethodNameToTMethod) result2_black[11];
			// ForEach find context
			for (Object[] result3_black : ParameterCreateNewImpl
					.pattern_ParameterCreateNew_2_3_blackBBBBBBBBBBBB(
							extendedJamoppJavaContainer, pg,
							extendedJamoppJavaContainerToPg, tMethodSignature,
							jParameterListToTMethodSignature, jMethodName,
							tMethod, jParameter, tParameterList,
							jParameterList, jParameterListToTParameterList,
							jMethodNameToTMethod)) {
				Object[] result3_green = ParameterCreateNewImpl
						.pattern_ParameterCreateNew_2_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
								extendedJamoppJavaContainer, pg,
								extendedJamoppJavaContainerToPg,
								tMethodSignature,
								jParameterListToTMethodSignature, jMethodName,
								tMethod, jParameter, tParameterList,
								jParameterList, jParameterListToTParameterList,
								jMethodNameToTMethod);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[12];
				// EMoflonEdge extendedJamoppJavaContainer__jParameterList____extendedParameterList = (EMoflonEdge) result3_green[13];
				// EMoflonEdge extendedJamoppJavaContainer__jMethodName____extendedMethodName = (EMoflonEdge) result3_green[14];
				// EMoflonEdge pg__tMethod____methods = (EMoflonEdge) result3_green[15];
				// EMoflonEdge extendedJamoppJavaContainerToPg__extendedJamoppJavaContainer____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge extendedJamoppJavaContainerToPg__pg____target = (EMoflonEdge) result3_green[17];
				// EMoflonEdge tMethodSignature__tParameterList____paramList = (EMoflonEdge) result3_green[18];
				// EMoflonEdge jParameterListToTMethodSignature__jParameterList____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge jParameterListToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[20];
				// EMoflonEdge tMethodSignature__tMethod____method = (EMoflonEdge) result3_green[21];
				// EMoflonEdge tMethod__tMethodSignature____signatures = (EMoflonEdge) result3_green[22];
				// EMoflonEdge jParameterList__jParameter____values = (EMoflonEdge) result3_green[23];
				// EMoflonEdge jParameterListToTParameterList__tParameterList____target = (EMoflonEdge) result3_green[24];
				// EMoflonEdge jParameterListToTParameterList__jParameterList____source = (EMoflonEdge) result3_green[25];
				// EMoflonEdge jMethodNameToTMethod__jMethodName____source = (EMoflonEdge) result3_green[26];
				// EMoflonEdge jMethodNameToTMethod__tMethod____target = (EMoflonEdge) result3_green[27];

				// solve CSP
				Object[] result4_bindingAndBlack = ParameterCreateNewImpl
						.pattern_ParameterCreateNew_2_4_bindingAndBlackFBBBBBBBBBBBBBB(
								this, isApplicableMatch,
								extendedJamoppJavaContainer, pg,
								extendedJamoppJavaContainerToPg,
								tMethodSignature,
								jParameterListToTMethodSignature, jMethodName,
								tMethod, jParameter, tParameterList,
								jParameterList, jParameterListToTParameterList,
								jMethodNameToTMethod);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParameterCreateNewImpl
						.pattern_ParameterCreateNew_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ParameterCreateNewImpl
							.pattern_ParameterCreateNew_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ParameterCreateNewImpl
							.pattern_ParameterCreateNew_2_6_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return ParameterCreateNewImpl
				.pattern_ParameterCreateNew_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedMethodName jMethodName, ExtendedParameter jParameter,
			ExtendedParameterList jParameterList) {
		match.registerObject("extendedJamoppJavaContainer",
				extendedJamoppJavaContainer);
		match.registerObject("jMethodName", jMethodName);
		match.registerObject("jParameter", jParameter);
		match.registerObject("jParameterList", jParameterList);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedMethodName jMethodName, ExtendedParameter jParameter,
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
	public CSP isApplicable_solveCsp_FWD(
			IsApplicableMatch isApplicableMatch,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TypeGraph pg,
			ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg,
			TMethodSignature tMethodSignature,
			ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature,
			ExtendedMethodName jMethodName,
			TMethod tMethod,
			ExtendedParameter jParameter,
			TParameterList tParameterList,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedMethodNameToTMethod jMethodNameToTMethod) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("extendedJamoppJavaContainer",
				extendedJamoppJavaContainer);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("extendedJamoppJavaContainerToPg",
				extendedJamoppJavaContainerToPg);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("jParameterListToTMethodSignature",
				jParameterListToTMethodSignature);
		isApplicableMatch.registerObject("jMethodName", jMethodName);
		isApplicableMatch.registerObject("tMethod", tMethod);
		isApplicableMatch.registerObject("jParameter", jParameter);
		isApplicableMatch.registerObject("tParameterList", tParameterList);
		isApplicableMatch.registerObject("jParameterList", jParameterList);
		isApplicableMatch.registerObject("jParameterListToTParameterList",
				jParameterListToTParameterList);
		isApplicableMatch.registerObject("jMethodNameToTMethod",
				jMethodNameToTMethod);
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
			EObject extendedJamoppJavaContainer, EObject pg,
			EObject extendedJamoppJavaContainerToPg, EObject tMethodSignature,
			EObject jParameterListToTMethodSignature, EObject jParameterToPg,
			EObject jMethodName, EObject tMethod, EObject jParameter,
			EObject tParameter, EObject tParameterList, EObject jParameterList,
			EObject jParameterListToTParameterList,
			EObject jParameterToTParameter, EObject jMethodNameToTMethod) {
		ruleresult.registerObject("extendedJamoppJavaContainer",
				extendedJamoppJavaContainer);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("extendedJamoppJavaContainerToPg",
				extendedJamoppJavaContainerToPg);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("jParameterListToTMethodSignature",
				jParameterListToTMethodSignature);
		ruleresult.registerObject("jParameterToPg", jParameterToPg);
		ruleresult.registerObject("jMethodName", jMethodName);
		ruleresult.registerObject("tMethod", tMethod);
		ruleresult.registerObject("jParameter", jParameter);
		ruleresult.registerObject("tParameter", tParameter);
		ruleresult.registerObject("tParameterList", tParameterList);
		ruleresult.registerObject("jParameterList", jParameterList);
		ruleresult.registerObject("jParameterListToTParameterList",
				jParameterListToTParameterList);
		ruleresult.registerObject("jParameterToTParameter",
				jParameterToTParameter);
		ruleresult.registerObject("jMethodNameToTMethod", jMethodNameToTMethod);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match
				.getObject("jParameter")
				.eClass()
				.equals(ExtendedJamopp.ExtendedJamoppPackage.eINSTANCE
						.getExtendedParameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TypeGraph pg,
			TMethodSignature tMethodSignature, TMethod tMethod,
			TParameter tParameter, TParameterList tParameterList) {
		// initial bindings
		Object[] result1_black = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_10_1_blackBBBBBBB(this, match, pg,
						tMethodSignature, tMethod, tParameter, tParameterList);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_10_2_bindingAndBlackFBBBBBBB(this,
						match, pg, tMethodSignature, tMethod, tParameter,
						tParameterList);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParameterCreateNewImpl
				.pattern_ParameterCreateNew_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParameterCreateNewImpl
					.pattern_ParameterCreateNew_10_4_blackBBBBBB(match, pg,
							tMethodSignature, tMethod, tParameter,
							tParameterList);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ParameterCreateNewImpl.pattern_ParameterCreateNew_10_4_greenBBBF(
					match, tParameter, tParameterList);
			// EMoflonEdge tParameterList__tParameter____entries = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = ParameterCreateNewImpl
					.pattern_ParameterCreateNew_10_5_blackBBBBBB(match, pg,
							tMethodSignature, tMethod, tParameter,
							tParameterList);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ParameterCreateNewImpl
					.pattern_ParameterCreateNew_10_5_greenBBBBBFFFF(match, pg,
							tMethodSignature, tMethod, tParameterList);
			// EMoflonEdge pg__tMethod____methods = (EMoflonEdge) result5_green[5];
			// EMoflonEdge tMethodSignature__tParameterList____paramList = (EMoflonEdge) result5_green[6];
			// EMoflonEdge tMethodSignature__tMethod____method = (EMoflonEdge) result5_green[7];
			// EMoflonEdge tMethod__tMethodSignature____signatures = (EMoflonEdge) result5_green[8];

			// register objects to match
			ParameterCreateNewImpl
					.pattern_ParameterCreateNew_10_6_expressionBBBBBBB(this,
							match, pg, tMethodSignature, tMethod, tParameter,
							tParameterList);
			return ParameterCreateNewImpl
					.pattern_ParameterCreateNew_10_7_expressionF();
		} else {
			return ParameterCreateNewImpl
					.pattern_ParameterCreateNew_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_11_1_bindingAndBlackFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result1_bindingAndBlack[0];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[1];
		ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg = (ExtendedJamoppJavaContainerToTypeGraph) result1_bindingAndBlack[2];
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[3];
		ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature = (ExtendedParameterListToTMethodSignature) result1_bindingAndBlack[4];
		ExtendedMethodName jMethodName = (ExtendedMethodName) result1_bindingAndBlack[5];
		TMethod tMethod = (TMethod) result1_bindingAndBlack[6];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[7];
		TParameterList tParameterList = (TParameterList) result1_bindingAndBlack[8];
		ExtendedParameterList jParameterList = (ExtendedParameterList) result1_bindingAndBlack[9];
		ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) result1_bindingAndBlack[10];
		ExtendedMethodNameToTMethod jMethodNameToTMethod = (ExtendedMethodNameToTMethod) result1_bindingAndBlack[11];
		// CSP csp = (CSP) result1_bindingAndBlack[12];
		Object[] result1_green = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_11_1_greenBFFBBF(pg, tParameter,
						jParameterList);
		ExtendedParameterToTypeGraph jParameterToPg = (ExtendedParameterToTypeGraph) result1_green[1];
		ExtendedParameter jParameter = (ExtendedParameter) result1_green[2];
		ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result1_green[5];

		// collect translated elements
		Object[] result2_black = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_11_2_blackBBBB(jParameterToPg,
						jParameter, tParameter, jParameterToTParameter);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_11_2_greenFBBBB(jParameterToPg,
						jParameter, tParameter, jParameterToTParameter);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_11_3_blackBBBBBBBBBBBBBBBB(
						ruleresult, extendedJamoppJavaContainer, pg,
						extendedJamoppJavaContainerToPg, tMethodSignature,
						jParameterListToTMethodSignature, jParameterToPg,
						jMethodName, tMethod, jParameter, tParameter,
						tParameterList, jParameterList,
						jParameterListToTParameterList, jParameterToTParameter,
						jMethodNameToTMethod);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ParameterCreateNewImpl
				.pattern_ParameterCreateNew_11_3_greenBBBBBBBBFFFFFF(
						ruleresult, pg, jParameterToPg, jParameter, tParameter,
						tParameterList, jParameterList, jParameterToTParameter);
		// EMoflonEdge jParameterToPg__jParameter____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge jParameterToPg__pg____target = (EMoflonEdge) result3_green[9];
		// EMoflonEdge tParameterList__tParameter____entries = (EMoflonEdge) result3_green[10];
		// EMoflonEdge jParameterList__jParameter____values = (EMoflonEdge) result3_green[11];
		// EMoflonEdge jParameterToTParameter__tParameter____target = (EMoflonEdge) result3_green[12];
		// EMoflonEdge jParameterToTParameter__jParameter____source = (EMoflonEdge) result3_green[13];

		// perform postprocessing story node is empty
		// register objects
		ParameterCreateNewImpl
				.pattern_ParameterCreateNew_11_5_expressionBBBBBBBBBBBBBBBBB(
						this, ruleresult, extendedJamoppJavaContainer, pg,
						extendedJamoppJavaContainerToPg, tMethodSignature,
						jParameterListToTMethodSignature, jParameterToPg,
						jMethodName, tMethod, jParameter, tParameter,
						tParameterList, jParameterList,
						jParameterListToTParameterList, jParameterToTParameter,
						jMethodNameToTMethod);
		return ParameterCreateNewImpl
				.pattern_ParameterCreateNew_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_12_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		TypeGraph pg = (TypeGraph) result2_binding[0];
		TMethodSignature tMethodSignature = (TMethodSignature) result2_binding[1];
		TMethod tMethod = (TMethod) result2_binding[2];
		TParameter tParameter = (TParameter) result2_binding[3];
		TParameterList tParameterList = (TParameterList) result2_binding[4];
		for (Object[] result2_black : ParameterCreateNewImpl
				.pattern_ParameterCreateNew_12_2_blackFBFBFFBBBFFFB(pg,
						tMethodSignature, tMethod, tParameter, tParameterList,
						match)) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result2_black[0];
			ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg = (ExtendedJamoppJavaContainerToTypeGraph) result2_black[2];
			ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature = (ExtendedParameterListToTMethodSignature) result2_black[4];
			ExtendedMethodName jMethodName = (ExtendedMethodName) result2_black[5];
			ExtendedParameterList jParameterList = (ExtendedParameterList) result2_black[9];
			ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) result2_black[10];
			ExtendedMethodNameToTMethod jMethodNameToTMethod = (ExtendedMethodNameToTMethod) result2_black[11];
			// ForEach find context
			for (Object[] result3_black : ParameterCreateNewImpl
					.pattern_ParameterCreateNew_12_3_blackBBBBBBBBBBBB(
							extendedJamoppJavaContainer, pg,
							extendedJamoppJavaContainerToPg, tMethodSignature,
							jParameterListToTMethodSignature, jMethodName,
							tMethod, tParameter, tParameterList,
							jParameterList, jParameterListToTParameterList,
							jMethodNameToTMethod)) {
				Object[] result3_green = ParameterCreateNewImpl
						.pattern_ParameterCreateNew_12_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
								extendedJamoppJavaContainer, pg,
								extendedJamoppJavaContainerToPg,
								tMethodSignature,
								jParameterListToTMethodSignature, jMethodName,
								tMethod, tParameter, tParameterList,
								jParameterList, jParameterListToTParameterList,
								jMethodNameToTMethod);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[12];
				// EMoflonEdge extendedJamoppJavaContainer__jParameterList____extendedParameterList = (EMoflonEdge) result3_green[13];
				// EMoflonEdge extendedJamoppJavaContainer__jMethodName____extendedMethodName = (EMoflonEdge) result3_green[14];
				// EMoflonEdge pg__tMethod____methods = (EMoflonEdge) result3_green[15];
				// EMoflonEdge extendedJamoppJavaContainerToPg__extendedJamoppJavaContainer____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge extendedJamoppJavaContainerToPg__pg____target = (EMoflonEdge) result3_green[17];
				// EMoflonEdge tMethodSignature__tParameterList____paramList = (EMoflonEdge) result3_green[18];
				// EMoflonEdge jParameterListToTMethodSignature__jParameterList____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge jParameterListToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[20];
				// EMoflonEdge tMethodSignature__tMethod____method = (EMoflonEdge) result3_green[21];
				// EMoflonEdge tMethod__tMethodSignature____signatures = (EMoflonEdge) result3_green[22];
				// EMoflonEdge tParameterList__tParameter____entries = (EMoflonEdge) result3_green[23];
				// EMoflonEdge jParameterListToTParameterList__tParameterList____target = (EMoflonEdge) result3_green[24];
				// EMoflonEdge jParameterListToTParameterList__jParameterList____source = (EMoflonEdge) result3_green[25];
				// EMoflonEdge jMethodNameToTMethod__jMethodName____source = (EMoflonEdge) result3_green[26];
				// EMoflonEdge jMethodNameToTMethod__tMethod____target = (EMoflonEdge) result3_green[27];

				// solve CSP
				Object[] result4_bindingAndBlack = ParameterCreateNewImpl
						.pattern_ParameterCreateNew_12_4_bindingAndBlackFBBBBBBBBBBBBBB(
								this, isApplicableMatch,
								extendedJamoppJavaContainer, pg,
								extendedJamoppJavaContainerToPg,
								tMethodSignature,
								jParameterListToTMethodSignature, jMethodName,
								tMethod, tParameter, tParameterList,
								jParameterList, jParameterListToTParameterList,
								jMethodNameToTMethod);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParameterCreateNewImpl
						.pattern_ParameterCreateNew_12_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = ParameterCreateNewImpl
							.pattern_ParameterCreateNew_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ParameterCreateNewImpl
							.pattern_ParameterCreateNew_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParameterCreateNewImpl
				.pattern_ParameterCreateNew_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TypeGraph pg,
			TMethodSignature tMethodSignature, TMethod tMethod,
			TParameter tParameter, TParameterList tParameterList) {
		match.registerObject("pg", pg);
		match.registerObject("tMethodSignature", tMethodSignature);
		match.registerObject("tMethod", tMethod);
		match.registerObject("tParameter", tParameter);
		match.registerObject("tParameterList", tParameterList);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph pg,
			TMethodSignature tMethodSignature, TMethod tMethod,
			TParameter tParameter, TParameterList tParameterList) {// Create CSP
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
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TypeGraph pg,
			ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg,
			TMethodSignature tMethodSignature,
			ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature,
			ExtendedMethodName jMethodName,
			TMethod tMethod,
			TParameter tParameter,
			TParameterList tParameterList,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedMethodNameToTMethod jMethodNameToTMethod) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("extendedJamoppJavaContainer",
				extendedJamoppJavaContainer);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("extendedJamoppJavaContainerToPg",
				extendedJamoppJavaContainerToPg);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("jParameterListToTMethodSignature",
				jParameterListToTMethodSignature);
		isApplicableMatch.registerObject("jMethodName", jMethodName);
		isApplicableMatch.registerObject("tMethod", tMethod);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("tParameterList", tParameterList);
		isApplicableMatch.registerObject("jParameterList", jParameterList);
		isApplicableMatch.registerObject("jParameterListToTParameterList",
				jParameterListToTParameterList);
		isApplicableMatch.registerObject("jMethodNameToTMethod",
				jMethodNameToTMethod);
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
			EObject extendedJamoppJavaContainer, EObject pg,
			EObject extendedJamoppJavaContainerToPg, EObject tMethodSignature,
			EObject jParameterListToTMethodSignature, EObject jParameterToPg,
			EObject jMethodName, EObject tMethod, EObject jParameter,
			EObject tParameter, EObject tParameterList, EObject jParameterList,
			EObject jParameterListToTParameterList,
			EObject jParameterToTParameter, EObject jMethodNameToTMethod) {
		ruleresult.registerObject("extendedJamoppJavaContainer",
				extendedJamoppJavaContainer);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("extendedJamoppJavaContainerToPg",
				extendedJamoppJavaContainerToPg);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("jParameterListToTMethodSignature",
				jParameterListToTMethodSignature);
		ruleresult.registerObject("jParameterToPg", jParameterToPg);
		ruleresult.registerObject("jMethodName", jMethodName);
		ruleresult.registerObject("tMethod", tMethod);
		ruleresult.registerObject("jParameter", jParameter);
		ruleresult.registerObject("tParameter", tParameter);
		ruleresult.registerObject("tParameterList", tParameterList);
		ruleresult.registerObject("jParameterList", jParameterList);
		ruleresult.registerObject("jParameterListToTParameterList",
				jParameterListToTParameterList);
		ruleresult.registerObject("jParameterToTParameter",
				jParameterToTParameter);
		ruleresult.registerObject("jMethodNameToTMethod", jMethodNameToTMethod);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("tParameter")
				.eClass()
				.equals(TypeGraphBasic.TypeGraphBasicPackage.eINSTANCE
						.getTParameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_40(
			EMoflonEdge _edge_entries) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParameterCreateNewImpl
				.pattern_ParameterCreateNew_20_2_blackFFFFFB(_edge_entries)) {
			TypeGraph pg = (TypeGraph) result2_black[0];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[1];
			TMethod tMethod = (TMethod) result2_black[2];
			TParameter tParameter = (TParameter) result2_black[3];
			TParameterList tParameterList = (TParameterList) result2_black[4];
			Object[] result2_green = ParameterCreateNewImpl
					.pattern_ParameterCreateNew_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParameterCreateNewImpl
					.pattern_ParameterCreateNew_20_3_expressionFBBBBBBB(this,
							match, pg, tMethodSignature, tMethod, tParameter,
							tParameterList)) {
				// Ensure that the correct types of elements are matched
				if (ParameterCreateNewImpl
						.pattern_ParameterCreateNew_20_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ParameterCreateNewImpl
							.pattern_ParameterCreateNew_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParameterCreateNewImpl
							.pattern_ParameterCreateNew_20_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParameterCreateNewImpl
				.pattern_ParameterCreateNew_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_31(
			EMoflonEdge _edge_values) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterCreateNewImpl
				.pattern_ParameterCreateNew_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParameterCreateNewImpl
				.pattern_ParameterCreateNew_21_2_blackFFFFB(_edge_values)) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result2_black[0];
			ExtendedMethodName jMethodName = (ExtendedMethodName) result2_black[1];
			ExtendedParameter jParameter = (ExtendedParameter) result2_black[2];
			ExtendedParameterList jParameterList = (ExtendedParameterList) result2_black[3];
			Object[] result2_green = ParameterCreateNewImpl
					.pattern_ParameterCreateNew_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParameterCreateNewImpl
					.pattern_ParameterCreateNew_21_3_expressionFBBBBBB(this,
							match, extendedJamoppJavaContainer, jMethodName,
							jParameter, jParameterList)) {
				// Ensure that the correct types of elements are matched
				if (ParameterCreateNewImpl
						.pattern_ParameterCreateNew_21_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ParameterCreateNewImpl
							.pattern_ParameterCreateNew_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParameterCreateNewImpl
							.pattern_ParameterCreateNew_21_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParameterCreateNewImpl
				.pattern_ParameterCreateNew_21_6_expressionFB(__result);
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
		case RulesPackage.PARAMETER_CREATE_NEW___IS_APPROPRIATE_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDMETHODNAME_EXTENDEDPARAMETER_EXTENDEDPARAMETERLIST:
			return isAppropriate_FWD((Match) arguments.get(0),
					(ExtendedJamoppJavaContainer) arguments.get(1),
					(ExtendedMethodName) arguments.get(2),
					(ExtendedParameter) arguments.get(3),
					(ExtendedParameterList) arguments.get(4));
		case RulesPackage.PARAMETER_CREATE_NEW___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARAMETER_CREATE_NEW___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETER_CREATE_NEW___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDMETHODNAME_EXTENDEDPARAMETER_EXTENDEDPARAMETERLIST:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(ExtendedJamoppJavaContainer) arguments.get(1),
					(ExtendedMethodName) arguments.get(2),
					(ExtendedParameter) arguments.get(3),
					(ExtendedParameterList) arguments.get(4));
			return null;
		case RulesPackage.PARAMETER_CREATE_NEW___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDMETHODNAME_EXTENDEDPARAMETER_EXTENDEDPARAMETERLIST:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(ExtendedJamoppJavaContainer) arguments.get(1),
					(ExtendedMethodName) arguments.get(2),
					(ExtendedParameter) arguments.get(3),
					(ExtendedParameterList) arguments.get(4));
		case RulesPackage.PARAMETER_CREATE_NEW___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETER_CREATE_NEW___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDJAMOPPJAVACONTAINER_TYPEGRAPH_EXTENDEDJAMOPPJAVACONTAINERTOTYPEGRAPH_TMETHODSIGNATURE_EXTENDEDPARAMETERLISTTOTMETHODSIGNATURE_EXTENDEDMETHODNAME_TMETHOD_EXTENDEDPARAMETER_TPARAMETERLIST_EXTENDEDPARAMETERLIST_EXTENDEDPARAMETERLISTTOTPARAMETERLIST_EXTENDEDMETHODNAMETOTMETHOD:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedJamoppJavaContainer) arguments.get(1),
					(TypeGraph) arguments.get(2),
					(ExtendedJamoppJavaContainerToTypeGraph) arguments.get(3),
					(TMethodSignature) arguments.get(4),
					(ExtendedParameterListToTMethodSignature) arguments.get(5),
					(ExtendedMethodName) arguments.get(6),
					(TMethod) arguments.get(7),
					(ExtendedParameter) arguments.get(8),
					(TParameterList) arguments.get(9),
					(ExtendedParameterList) arguments.get(10),
					(ExtendedParameterListToTParameterList) arguments.get(11),
					(ExtendedMethodNameToTMethod) arguments.get(12));
		case RulesPackage.PARAMETER_CREATE_NEW___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETER_CREATE_NEW___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15));
			return null;
		case RulesPackage.PARAMETER_CREATE_NEW___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETER_CREATE_NEW___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TMETHODSIGNATURE_TMETHOD_TPARAMETER_TPARAMETERLIST:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TypeGraph) arguments.get(1),
					(TMethodSignature) arguments.get(2),
					(TMethod) arguments.get(3), (TParameter) arguments.get(4),
					(TParameterList) arguments.get(5));
		case RulesPackage.PARAMETER_CREATE_NEW___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARAMETER_CREATE_NEW___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PARAMETER_CREATE_NEW___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TMETHODSIGNATURE_TMETHOD_TPARAMETER_TPARAMETERLIST:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TypeGraph) arguments.get(1),
					(TMethodSignature) arguments.get(2),
					(TMethod) arguments.get(3), (TParameter) arguments.get(4),
					(TParameterList) arguments.get(5));
			return null;
		case RulesPackage.PARAMETER_CREATE_NEW___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TMETHODSIGNATURE_TMETHOD_TPARAMETER_TPARAMETERLIST:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TypeGraph) arguments.get(1),
					(TMethodSignature) arguments.get(2),
					(TMethod) arguments.get(3), (TParameter) arguments.get(4),
					(TParameterList) arguments.get(5));
		case RulesPackage.PARAMETER_CREATE_NEW___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETER_CREATE_NEW___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXTENDEDJAMOPPJAVACONTAINER_TYPEGRAPH_EXTENDEDJAMOPPJAVACONTAINERTOTYPEGRAPH_TMETHODSIGNATURE_EXTENDEDPARAMETERLISTTOTMETHODSIGNATURE_EXTENDEDMETHODNAME_TMETHOD_TPARAMETER_TPARAMETERLIST_EXTENDEDPARAMETERLIST_EXTENDEDPARAMETERLISTTOTPARAMETERLIST_EXTENDEDMETHODNAMETOTMETHOD:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedJamoppJavaContainer) arguments.get(1),
					(TypeGraph) arguments.get(2),
					(ExtendedJamoppJavaContainerToTypeGraph) arguments.get(3),
					(TMethodSignature) arguments.get(4),
					(ExtendedParameterListToTMethodSignature) arguments.get(5),
					(ExtendedMethodName) arguments.get(6),
					(TMethod) arguments.get(7), (TParameter) arguments.get(8),
					(TParameterList) arguments.get(9),
					(ExtendedParameterList) arguments.get(10),
					(ExtendedParameterListToTParameterList) arguments.get(11),
					(ExtendedMethodNameToTMethod) arguments.get(12));
		case RulesPackage.PARAMETER_CREATE_NEW___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETER_CREATE_NEW___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15));
			return null;
		case RulesPackage.PARAMETER_CREATE_NEW___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PARAMETER_CREATE_NEW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_40__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_40((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARAMETER_CREATE_NEW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_31__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_31((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARAMETER_CREATE_NEW___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARAMETER_CREATE_NEW___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ParameterCreateNew_0_1_blackBBBBBB(
			ParameterCreateNew _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedMethodName jMethodName, ExtendedParameter jParameter,
			ExtendedParameterList jParameterList) {
		return new Object[] { _this, match, extendedJamoppJavaContainer,
				jMethodName, jParameter, jParameterList };
	}

	public static final Object[] pattern_ParameterCreateNew_0_2_bindingFBBBBBB(
			ParameterCreateNew _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedMethodName jMethodName, ExtendedParameter jParameter,
			ExtendedParameterList jParameterList) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				extendedJamoppJavaContainer, jMethodName, jParameter,
				jParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match,
					extendedJamoppJavaContainer, jMethodName, jParameter,
					jParameterList };
		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterCreateNew_0_2_bindingAndBlackFBBBBBB(
			ParameterCreateNew _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedMethodName jMethodName, ExtendedParameter jParameter,
			ExtendedParameterList jParameterList) {
		Object[] result_pattern_ParameterCreateNew_0_2_binding = pattern_ParameterCreateNew_0_2_bindingFBBBBBB(
				_this, match, extendedJamoppJavaContainer, jMethodName,
				jParameter, jParameterList);
		if (result_pattern_ParameterCreateNew_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterCreateNew_0_2_binding[0];

			Object[] result_pattern_ParameterCreateNew_0_2_black = pattern_ParameterCreateNew_0_2_blackB(csp);
			if (result_pattern_ParameterCreateNew_0_2_black != null) {

				return new Object[] { csp, _this, match,
						extendedJamoppJavaContainer, jMethodName, jParameter,
						jParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterCreateNew_0_3_expressionFBB(
			ParameterCreateNew _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterCreateNew_0_4_blackBBBBB(
			Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedMethodName jMethodName, ExtendedParameter jParameter,
			ExtendedParameterList jParameterList) {
		return new Object[] { match, extendedJamoppJavaContainer, jMethodName,
				jParameter, jParameterList };
	}

	public static final Object[] pattern_ParameterCreateNew_0_4_greenBBBF(
			Match match, ExtendedParameter jParameter,
			ExtendedParameterList jParameterList) {
		EMoflonEdge jParameterList__jParameter____values = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(jParameter);
		String jParameterList__jParameter____values_name_prime = "values";
		jParameterList__jParameter____values.setSrc(jParameterList);
		jParameterList__jParameter____values.setTrg(jParameter);
		match.getToBeTranslatedEdges()
				.add(jParameterList__jParameter____values);
		jParameterList__jParameter____values
				.setName(jParameterList__jParameter____values_name_prime);
		return new Object[] { match, jParameter, jParameterList,
				jParameterList__jParameter____values };
	}

	public static final Object[] pattern_ParameterCreateNew_0_5_blackBBBBB(
			Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedMethodName jMethodName, ExtendedParameter jParameter,
			ExtendedParameterList jParameterList) {
		return new Object[] { match, extendedJamoppJavaContainer, jMethodName,
				jParameter, jParameterList };
	}

	public static final Object[] pattern_ParameterCreateNew_0_5_greenBBBBFF(
			Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedMethodName jMethodName, ExtendedParameterList jParameterList) {
		EMoflonEdge extendedJamoppJavaContainer__jParameterList____extendedParameterList = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedJamoppJavaContainer__jMethodName____extendedMethodName = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(extendedJamoppJavaContainer);
		match.getContextNodes().add(jMethodName);
		match.getContextNodes().add(jParameterList);
		String extendedJamoppJavaContainer__jParameterList____extendedParameterList_name_prime = "extendedParameterList";
		String extendedJamoppJavaContainer__jMethodName____extendedMethodName_name_prime = "extendedMethodName";
		extendedJamoppJavaContainer__jParameterList____extendedParameterList
				.setSrc(extendedJamoppJavaContainer);
		extendedJamoppJavaContainer__jParameterList____extendedParameterList
				.setTrg(jParameterList);
		match.getContextEdges()
				.add(extendedJamoppJavaContainer__jParameterList____extendedParameterList);
		extendedJamoppJavaContainer__jMethodName____extendedMethodName
				.setSrc(extendedJamoppJavaContainer);
		extendedJamoppJavaContainer__jMethodName____extendedMethodName
				.setTrg(jMethodName);
		match.getContextEdges().add(
				extendedJamoppJavaContainer__jMethodName____extendedMethodName);
		extendedJamoppJavaContainer__jParameterList____extendedParameterList
				.setName(extendedJamoppJavaContainer__jParameterList____extendedParameterList_name_prime);
		extendedJamoppJavaContainer__jMethodName____extendedMethodName
				.setName(extendedJamoppJavaContainer__jMethodName____extendedMethodName_name_prime);
		return new Object[] {
				match,
				extendedJamoppJavaContainer,
				jMethodName,
				jParameterList,
				extendedJamoppJavaContainer__jParameterList____extendedParameterList,
				extendedJamoppJavaContainer__jMethodName____extendedMethodName };
	}

	public static final void pattern_ParameterCreateNew_0_6_expressionBBBBBB(
			ParameterCreateNew _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedMethodName jMethodName, ExtendedParameter jParameter,
			ExtendedParameterList jParameterList) {
		_this.registerObjectsToMatch_FWD(match, extendedJamoppJavaContainer,
				jMethodName, jParameter, jParameterList);

	}

	public static final boolean pattern_ParameterCreateNew_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterCreateNew_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParameterCreateNew_1_1_bindingFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("extendedJamoppJavaContainer");
		EObject _localVariable_1 = isApplicableMatch.getObject("pg");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("extendedJamoppJavaContainerToPg");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("tMethodSignature");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("jParameterListToTMethodSignature");
		EObject _localVariable_5 = isApplicableMatch.getObject("jMethodName");
		EObject _localVariable_6 = isApplicableMatch.getObject("tMethod");
		EObject _localVariable_7 = isApplicableMatch.getObject("jParameter");
		EObject _localVariable_8 = isApplicableMatch
				.getObject("tParameterList");
		EObject _localVariable_9 = isApplicableMatch
				.getObject("jParameterList");
		EObject _localVariable_10 = isApplicableMatch
				.getObject("jParameterListToTParameterList");
		EObject _localVariable_11 = isApplicableMatch
				.getObject("jMethodNameToTMethod");
		EObject tmpExtendedJamoppJavaContainer = _localVariable_0;
		EObject tmpPg = _localVariable_1;
		EObject tmpExtendedJamoppJavaContainerToPg = _localVariable_2;
		EObject tmpTMethodSignature = _localVariable_3;
		EObject tmpJParameterListToTMethodSignature = _localVariable_4;
		EObject tmpJMethodName = _localVariable_5;
		EObject tmpTMethod = _localVariable_6;
		EObject tmpJParameter = _localVariable_7;
		EObject tmpTParameterList = _localVariable_8;
		EObject tmpJParameterList = _localVariable_9;
		EObject tmpJParameterListToTParameterList = _localVariable_10;
		EObject tmpJMethodNameToTMethod = _localVariable_11;
		if (tmpExtendedJamoppJavaContainer instanceof ExtendedJamoppJavaContainer) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) tmpExtendedJamoppJavaContainer;
			if (tmpPg instanceof TypeGraph) {
				TypeGraph pg = (TypeGraph) tmpPg;
				if (tmpExtendedJamoppJavaContainerToPg instanceof ExtendedJamoppJavaContainerToTypeGraph) {
					ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg = (ExtendedJamoppJavaContainerToTypeGraph) tmpExtendedJamoppJavaContainerToPg;
					if (tmpTMethodSignature instanceof TMethodSignature) {
						TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
						if (tmpJParameterListToTMethodSignature instanceof ExtendedParameterListToTMethodSignature) {
							ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature = (ExtendedParameterListToTMethodSignature) tmpJParameterListToTMethodSignature;
							if (tmpJMethodName instanceof ExtendedMethodName) {
								ExtendedMethodName jMethodName = (ExtendedMethodName) tmpJMethodName;
								if (tmpTMethod instanceof TMethod) {
									TMethod tMethod = (TMethod) tmpTMethod;
									if (tmpJParameter instanceof ExtendedParameter) {
										ExtendedParameter jParameter = (ExtendedParameter) tmpJParameter;
										if (tmpTParameterList instanceof TParameterList) {
											TParameterList tParameterList = (TParameterList) tmpTParameterList;
											if (tmpJParameterList instanceof ExtendedParameterList) {
												ExtendedParameterList jParameterList = (ExtendedParameterList) tmpJParameterList;
												if (tmpJParameterListToTParameterList instanceof ExtendedParameterListToTParameterList) {
													ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) tmpJParameterListToTParameterList;
													if (tmpJMethodNameToTMethod instanceof ExtendedMethodNameToTMethod) {
														ExtendedMethodNameToTMethod jMethodNameToTMethod = (ExtendedMethodNameToTMethod) tmpJMethodNameToTMethod;
														return new Object[] {
																extendedJamoppJavaContainer,
																pg,
																extendedJamoppJavaContainerToPg,
																tMethodSignature,
																jParameterListToTMethodSignature,
																jMethodName,
																tMethod,
																jParameter,
																tParameterList,
																jParameterList,
																jParameterListToTParameterList,
																jMethodNameToTMethod,
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
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_1_1_blackBBBBBBBBBBBBFBB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TypeGraph pg,
			ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg,
			TMethodSignature tMethodSignature,
			ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature,
			ExtendedMethodName jMethodName,
			TMethod tMethod,
			ExtendedParameter jParameter,
			TParameterList tParameterList,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedMethodNameToTMethod jMethodNameToTMethod,
			ParameterCreateNew _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { extendedJamoppJavaContainer, pg,
						extendedJamoppJavaContainerToPg, tMethodSignature,
						jParameterListToTMethodSignature, jMethodName, tMethod,
						jParameter, tParameterList, jParameterList,
						jParameterListToTParameterList, jMethodNameToTMethod,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_1_1_bindingAndBlackFFFFFFFFFFFFFBB(
			ParameterCreateNew _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParameterCreateNew_1_1_binding = pattern_ParameterCreateNew_1_1_bindingFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ParameterCreateNew_1_1_binding != null) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result_pattern_ParameterCreateNew_1_1_binding[0];
			TypeGraph pg = (TypeGraph) result_pattern_ParameterCreateNew_1_1_binding[1];
			ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg = (ExtendedJamoppJavaContainerToTypeGraph) result_pattern_ParameterCreateNew_1_1_binding[2];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_ParameterCreateNew_1_1_binding[3];
			ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature = (ExtendedParameterListToTMethodSignature) result_pattern_ParameterCreateNew_1_1_binding[4];
			ExtendedMethodName jMethodName = (ExtendedMethodName) result_pattern_ParameterCreateNew_1_1_binding[5];
			TMethod tMethod = (TMethod) result_pattern_ParameterCreateNew_1_1_binding[6];
			ExtendedParameter jParameter = (ExtendedParameter) result_pattern_ParameterCreateNew_1_1_binding[7];
			TParameterList tParameterList = (TParameterList) result_pattern_ParameterCreateNew_1_1_binding[8];
			ExtendedParameterList jParameterList = (ExtendedParameterList) result_pattern_ParameterCreateNew_1_1_binding[9];
			ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) result_pattern_ParameterCreateNew_1_1_binding[10];
			ExtendedMethodNameToTMethod jMethodNameToTMethod = (ExtendedMethodNameToTMethod) result_pattern_ParameterCreateNew_1_1_binding[11];

			Object[] result_pattern_ParameterCreateNew_1_1_black = pattern_ParameterCreateNew_1_1_blackBBBBBBBBBBBBFBB(
					extendedJamoppJavaContainer, pg,
					extendedJamoppJavaContainerToPg, tMethodSignature,
					jParameterListToTMethodSignature, jMethodName, tMethod,
					jParameter, tParameterList, jParameterList,
					jParameterListToTParameterList, jMethodNameToTMethod,
					_this, isApplicableMatch);
			if (result_pattern_ParameterCreateNew_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ParameterCreateNew_1_1_black[12];

				return new Object[] { extendedJamoppJavaContainer, pg,
						extendedJamoppJavaContainerToPg, tMethodSignature,
						jParameterListToTMethodSignature, jMethodName, tMethod,
						jParameter, tParameterList, jParameterList,
						jParameterListToTParameterList, jMethodNameToTMethod,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_1_1_greenBFBFBF(
			TypeGraph pg, ExtendedParameter jParameter,
			TParameterList tParameterList) {
		ExtendedParameterToTypeGraph jParameterToPg = GravityTGGFactory.eINSTANCE
				.createExtendedParameterToTypeGraph();
		TParameter tParameter = TypeGraphBasicFactory.eINSTANCE
				.createTParameter();
		ExtendedParameterToTParameter jParameterToTParameter = GravityTGGFactory.eINSTANCE
				.createExtendedParameterToTParameter();
		jParameterToPg.setSource(jParameter);
		jParameterToPg.setTarget(pg);
		tParameterList.getEntries().add(tParameter);
		jParameterToTParameter.setTarget(tParameter);
		jParameterToTParameter.setSource(jParameter);
		return new Object[] { pg, jParameterToPg, jParameter, tParameter,
				tParameterList, jParameterToTParameter };
	}

	public static final Object[] pattern_ParameterCreateNew_1_2_blackBBBB(
			ExtendedParameterToTypeGraph jParameterToPg,
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter) {
		return new Object[] { jParameterToPg, jParameter, tParameter,
				jParameterToTParameter };
	}

	public static final Object[] pattern_ParameterCreateNew_1_2_greenFBBBB(
			ExtendedParameterToTypeGraph jParameterToPg,
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(jParameterToPg);
		ruleresult.getTranslatedElements().add(jParameter);
		ruleresult.getCreatedElements().add(tParameter);
		ruleresult.getCreatedLinkElements().add(jParameterToTParameter);
		return new Object[] { ruleresult, jParameterToPg, jParameter,
				tParameter, jParameterToTParameter };
	}

	public static final Object[] pattern_ParameterCreateNew_1_3_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject extendedJamoppJavaContainer,
			EObject pg, EObject extendedJamoppJavaContainerToPg,
			EObject tMethodSignature, EObject jParameterListToTMethodSignature,
			EObject jParameterToPg, EObject jMethodName, EObject tMethod,
			EObject jParameter, EObject tParameter, EObject tParameterList,
			EObject jParameterList, EObject jParameterListToTParameterList,
			EObject jParameterToTParameter, EObject jMethodNameToTMethod) {
		if (!extendedJamoppJavaContainer.equals(pg)) {
			if (!extendedJamoppJavaContainer
					.equals(extendedJamoppJavaContainerToPg)) {
				if (!extendedJamoppJavaContainer.equals(tMethodSignature)) {
					if (!extendedJamoppJavaContainer
							.equals(jParameterListToTMethodSignature)) {
						if (!extendedJamoppJavaContainer.equals(jParameterToPg)) {
							if (!extendedJamoppJavaContainer
									.equals(jMethodName)) {
								if (!extendedJamoppJavaContainer
										.equals(tMethod)) {
									if (!extendedJamoppJavaContainer
											.equals(jParameter)) {
										if (!extendedJamoppJavaContainer
												.equals(tParameter)) {
											if (!extendedJamoppJavaContainer
													.equals(tParameterList)) {
												if (!extendedJamoppJavaContainer
														.equals(jParameterList)) {
													if (!extendedJamoppJavaContainer
															.equals(jParameterListToTParameterList)) {
														if (!extendedJamoppJavaContainer
																.equals(jParameterToTParameter)) {
															if (!extendedJamoppJavaContainer
																	.equals(jMethodNameToTMethod)) {
																if (!pg.equals(tMethodSignature)) {
																	if (!pg.equals(tMethod)) {
																		if (!pg.equals(tParameter)) {
																			if (!pg.equals(tParameterList)) {
																				if (!extendedJamoppJavaContainerToPg
																						.equals(pg)) {
																					if (!extendedJamoppJavaContainerToPg
																							.equals(tMethodSignature)) {
																						if (!extendedJamoppJavaContainerToPg
																								.equals(jParameterListToTMethodSignature)) {
																							if (!extendedJamoppJavaContainerToPg
																									.equals(jParameterToPg)) {
																								if (!extendedJamoppJavaContainerToPg
																										.equals(jMethodName)) {
																									if (!extendedJamoppJavaContainerToPg
																											.equals(tMethod)) {
																										if (!extendedJamoppJavaContainerToPg
																												.equals(jParameter)) {
																											if (!extendedJamoppJavaContainerToPg
																													.equals(tParameter)) {
																												if (!extendedJamoppJavaContainerToPg
																														.equals(tParameterList)) {
																													if (!extendedJamoppJavaContainerToPg
																															.equals(jParameterList)) {
																														if (!extendedJamoppJavaContainerToPg
																																.equals(jParameterListToTParameterList)) {
																															if (!extendedJamoppJavaContainerToPg
																																	.equals(jParameterToTParameter)) {
																																if (!extendedJamoppJavaContainerToPg
																																		.equals(jMethodNameToTMethod)) {
																																	if (!tMethodSignature
																																			.equals(tParameter)) {
																																		if (!tMethodSignature
																																				.equals(tParameterList)) {
																																			if (!jParameterListToTMethodSignature
																																					.equals(pg)) {
																																				if (!jParameterListToTMethodSignature
																																						.equals(tMethodSignature)) {
																																					if (!jParameterListToTMethodSignature
																																							.equals(jParameterToPg)) {
																																						if (!jParameterListToTMethodSignature
																																								.equals(tMethod)) {
																																							if (!jParameterListToTMethodSignature
																																									.equals(tParameter)) {
																																								if (!jParameterListToTMethodSignature
																																										.equals(tParameterList)) {
																																									if (!jParameterListToTMethodSignature
																																											.equals(jParameterListToTParameterList)) {
																																										if (!jParameterListToTMethodSignature
																																												.equals(jParameterToTParameter)) {
																																											if (!jParameterToPg
																																													.equals(pg)) {
																																												if (!jParameterToPg
																																														.equals(tMethodSignature)) {
																																													if (!jParameterToPg
																																															.equals(tMethod)) {
																																														if (!jParameterToPg
																																																.equals(tParameter)) {
																																															if (!jParameterToPg
																																																	.equals(tParameterList)) {
																																																if (!jParameterToPg
																																																		.equals(jParameterToTParameter)) {
																																																	if (!jMethodName
																																																			.equals(pg)) {
																																																		if (!jMethodName
																																																				.equals(tMethodSignature)) {
																																																			if (!jMethodName
																																																					.equals(jParameterListToTMethodSignature)) {
																																																				if (!jMethodName
																																																						.equals(jParameterToPg)) {
																																																					if (!jMethodName
																																																							.equals(tMethod)) {
																																																						if (!jMethodName
																																																								.equals(jParameter)) {
																																																							if (!jMethodName
																																																									.equals(tParameter)) {
																																																								if (!jMethodName
																																																										.equals(tParameterList)) {
																																																									if (!jMethodName
																																																											.equals(jParameterList)) {
																																																										if (!jMethodName
																																																												.equals(jParameterListToTParameterList)) {
																																																											if (!jMethodName
																																																													.equals(jParameterToTParameter)) {
																																																												if (!jMethodName
																																																														.equals(jMethodNameToTMethod)) {
																																																													if (!tMethod
																																																															.equals(tMethodSignature)) {
																																																														if (!tMethod
																																																																.equals(tParameter)) {
																																																															if (!tMethod
																																																																	.equals(tParameterList)) {
																																																																if (!jParameter
																																																																		.equals(pg)) {
																																																																	if (!jParameter
																																																																			.equals(tMethodSignature)) {
																																																																		if (!jParameter
																																																																				.equals(jParameterListToTMethodSignature)) {
																																																																			if (!jParameter
																																																																					.equals(jParameterToPg)) {
																																																																				if (!jParameter
																																																																						.equals(tMethod)) {
																																																																					if (!jParameter
																																																																							.equals(tParameter)) {
																																																																						if (!jParameter
																																																																								.equals(tParameterList)) {
																																																																							if (!jParameter
																																																																									.equals(jParameterList)) {
																																																																								if (!jParameter
																																																																										.equals(jParameterListToTParameterList)) {
																																																																									if (!jParameter
																																																																											.equals(jParameterToTParameter)) {
																																																																										if (!tParameter
																																																																												.equals(tParameterList)) {
																																																																											if (!jParameterList
																																																																													.equals(pg)) {
																																																																												if (!jParameterList
																																																																														.equals(tMethodSignature)) {
																																																																													if (!jParameterList
																																																																															.equals(jParameterListToTMethodSignature)) {
																																																																														if (!jParameterList
																																																																																.equals(jParameterToPg)) {
																																																																															if (!jParameterList
																																																																																	.equals(tMethod)) {
																																																																																if (!jParameterList
																																																																																		.equals(tParameter)) {
																																																																																	if (!jParameterList
																																																																																			.equals(tParameterList)) {
																																																																																		if (!jParameterList
																																																																																				.equals(jParameterListToTParameterList)) {
																																																																																			if (!jParameterList
																																																																																					.equals(jParameterToTParameter)) {
																																																																																				if (!jParameterListToTParameterList
																																																																																						.equals(pg)) {
																																																																																					if (!jParameterListToTParameterList
																																																																																							.equals(tMethodSignature)) {
																																																																																						if (!jParameterListToTParameterList
																																																																																								.equals(jParameterToPg)) {
																																																																																							if (!jParameterListToTParameterList
																																																																																									.equals(tMethod)) {
																																																																																								if (!jParameterListToTParameterList
																																																																																										.equals(tParameter)) {
																																																																																									if (!jParameterListToTParameterList
																																																																																											.equals(tParameterList)) {
																																																																																										if (!jParameterListToTParameterList
																																																																																												.equals(jParameterToTParameter)) {
																																																																																											if (!jParameterToTParameter
																																																																																													.equals(pg)) {
																																																																																												if (!jParameterToTParameter
																																																																																														.equals(tMethodSignature)) {
																																																																																													if (!jParameterToTParameter
																																																																																															.equals(tMethod)) {
																																																																																														if (!jParameterToTParameter
																																																																																																.equals(tParameter)) {
																																																																																															if (!jParameterToTParameter
																																																																																																	.equals(tParameterList)) {
																																																																																																if (!jMethodNameToTMethod
																																																																																																		.equals(pg)) {
																																																																																																	if (!jMethodNameToTMethod
																																																																																																			.equals(tMethodSignature)) {
																																																																																																		if (!jMethodNameToTMethod
																																																																																																				.equals(jParameterListToTMethodSignature)) {
																																																																																																			if (!jMethodNameToTMethod
																																																																																																					.equals(jParameterToPg)) {
																																																																																																				if (!jMethodNameToTMethod
																																																																																																						.equals(tMethod)) {
																																																																																																					if (!jMethodNameToTMethod
																																																																																																							.equals(jParameter)) {
																																																																																																						if (!jMethodNameToTMethod
																																																																																																								.equals(tParameter)) {
																																																																																																							if (!jMethodNameToTMethod
																																																																																																									.equals(tParameterList)) {
																																																																																																								if (!jMethodNameToTMethod
																																																																																																										.equals(jParameterList)) {
																																																																																																									if (!jMethodNameToTMethod
																																																																																																											.equals(jParameterListToTParameterList)) {
																																																																																																										if (!jMethodNameToTMethod
																																																																																																												.equals(jParameterToTParameter)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													extendedJamoppJavaContainer,
																																																																																																													pg,
																																																																																																													extendedJamoppJavaContainerToPg,
																																																																																																													tMethodSignature,
																																																																																																													jParameterListToTMethodSignature,
																																																																																																													jParameterToPg,
																																																																																																													jMethodName,
																																																																																																													tMethod,
																																																																																																													jParameter,
																																																																																																													tParameter,
																																																																																																													tParameterList,
																																																																																																													jParameterList,
																																																																																																													jParameterListToTParameterList,
																																																																																																													jParameterToTParameter,
																																																																																																													jMethodNameToTMethod };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterCreateNew_1_3_greenBBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject pg, EObject jParameterToPg,
			EObject jParameter, EObject tParameter, EObject tParameterList,
			EObject jParameterList, EObject jParameterToTParameter) {
		EMoflonEdge jParameterToPg__jParameter____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToPg__pg____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tParameterList__tParameter____entries = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterList__jParameter____values = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToTParameter__tParameter____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToTParameter__jParameter____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParameterCreateNew";
		String jParameterToPg__jParameter____source_name_prime = "source";
		String jParameterToPg__pg____target_name_prime = "target";
		String tParameterList__tParameter____entries_name_prime = "entries";
		String jParameterList__jParameter____values_name_prime = "values";
		String jParameterToTParameter__tParameter____target_name_prime = "target";
		String jParameterToTParameter__jParameter____source_name_prime = "source";
		jParameterToPg__jParameter____source.setSrc(jParameterToPg);
		jParameterToPg__jParameter____source.setTrg(jParameter);
		ruleresult.getCreatedEdges().add(jParameterToPg__jParameter____source);
		jParameterToPg__pg____target.setSrc(jParameterToPg);
		jParameterToPg__pg____target.setTrg(pg);
		ruleresult.getCreatedEdges().add(jParameterToPg__pg____target);
		tParameterList__tParameter____entries.setSrc(tParameterList);
		tParameterList__tParameter____entries.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(tParameterList__tParameter____entries);
		jParameterList__jParameter____values.setSrc(jParameterList);
		jParameterList__jParameter____values.setTrg(jParameter);
		ruleresult.getTranslatedEdges().add(
				jParameterList__jParameter____values);
		jParameterToTParameter__tParameter____target
				.setSrc(jParameterToTParameter);
		jParameterToTParameter__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(
				jParameterToTParameter__tParameter____target);
		jParameterToTParameter__jParameter____source
				.setSrc(jParameterToTParameter);
		jParameterToTParameter__jParameter____source.setTrg(jParameter);
		ruleresult.getCreatedEdges().add(
				jParameterToTParameter__jParameter____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jParameterToPg__jParameter____source
				.setName(jParameterToPg__jParameter____source_name_prime);
		jParameterToPg__pg____target
				.setName(jParameterToPg__pg____target_name_prime);
		tParameterList__tParameter____entries
				.setName(tParameterList__tParameter____entries_name_prime);
		jParameterList__jParameter____values
				.setName(jParameterList__jParameter____values_name_prime);
		jParameterToTParameter__tParameter____target
				.setName(jParameterToTParameter__tParameter____target_name_prime);
		jParameterToTParameter__jParameter____source
				.setName(jParameterToTParameter__jParameter____source_name_prime);
		return new Object[] { ruleresult, pg, jParameterToPg, jParameter,
				tParameter, tParameterList, jParameterList,
				jParameterToTParameter, jParameterToPg__jParameter____source,
				jParameterToPg__pg____target,
				tParameterList__tParameter____entries,
				jParameterList__jParameter____values,
				jParameterToTParameter__tParameter____target,
				jParameterToTParameter__jParameter____source };
	}

	public static final void pattern_ParameterCreateNew_1_5_expressionBBBBBBBBBBBBBBBBB(
			ParameterCreateNew _this, PerformRuleResult ruleresult,
			EObject extendedJamoppJavaContainer, EObject pg,
			EObject extendedJamoppJavaContainerToPg, EObject tMethodSignature,
			EObject jParameterListToTMethodSignature, EObject jParameterToPg,
			EObject jMethodName, EObject tMethod, EObject jParameter,
			EObject tParameter, EObject tParameterList, EObject jParameterList,
			EObject jParameterListToTParameterList,
			EObject jParameterToTParameter, EObject jMethodNameToTMethod) {
		_this.registerObjects_FWD(ruleresult, extendedJamoppJavaContainer, pg,
				extendedJamoppJavaContainerToPg, tMethodSignature,
				jParameterListToTMethodSignature, jParameterToPg, jMethodName,
				tMethod, jParameter, tParameter, tParameterList,
				jParameterList, jParameterListToTParameterList,
				jParameterToTParameter, jMethodNameToTMethod);

	}

	public static final PerformRuleResult pattern_ParameterCreateNew_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterCreateNew_2_1_bindingFB(
			ParameterCreateNew _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_2_1_blackFBB(
			EClass eClass, ParameterCreateNew _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_2_1_bindingAndBlackFFB(
			ParameterCreateNew _this) {
		Object[] result_pattern_ParameterCreateNew_2_1_binding = pattern_ParameterCreateNew_2_1_bindingFB(_this);
		if (result_pattern_ParameterCreateNew_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParameterCreateNew_2_1_binding[0];

			Object[] result_pattern_ParameterCreateNew_2_1_black = pattern_ParameterCreateNew_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParameterCreateNew_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParameterCreateNew_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParameterCreateNew";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParameterCreateNew_2_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match
				.getObject("extendedJamoppJavaContainer");
		EObject _localVariable_1 = match.getObject("jMethodName");
		EObject _localVariable_2 = match.getObject("jParameter");
		EObject _localVariable_3 = match.getObject("jParameterList");
		EObject tmpExtendedJamoppJavaContainer = _localVariable_0;
		EObject tmpJMethodName = _localVariable_1;
		EObject tmpJParameter = _localVariable_2;
		EObject tmpJParameterList = _localVariable_3;
		if (tmpExtendedJamoppJavaContainer instanceof ExtendedJamoppJavaContainer) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) tmpExtendedJamoppJavaContainer;
			if (tmpJMethodName instanceof ExtendedMethodName) {
				ExtendedMethodName jMethodName = (ExtendedMethodName) tmpJMethodName;
				if (tmpJParameter instanceof ExtendedParameter) {
					ExtendedParameter jParameter = (ExtendedParameter) tmpJParameter;
					if (tmpJParameterList instanceof ExtendedParameterList) {
						ExtendedParameterList jParameterList = (ExtendedParameterList) tmpJParameterList;
						return new Object[] { extendedJamoppJavaContainer,
								jMethodName, jParameter, jParameterList, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterCreateNew_2_2_blackBFFFFBFBFBFFB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedMethodName jMethodName, ExtendedParameter jParameter,
			ExtendedParameterList jParameterList, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(extendedJamoppJavaContainer,
						ExtendedJamoppJavaContainerToTypeGraph.class, "source")) {
			TypeGraph pg = extendedJamoppJavaContainerToPg.getTarget();
			if (pg != null) {
				for (ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(jParameterList,
								ExtendedParameterListToTMethodSignature.class,
								"source")) {
					TMethodSignature tMethodSignature = jParameterListToTMethodSignature
							.getTarget();
					if (tMethodSignature != null) {
						for (ExtendedParameterListToTParameterList jParameterListToTParameterList : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(
										jParameterList,
										ExtendedParameterListToTParameterList.class,
										"source")) {
							TParameterList tParameterList = jParameterListToTParameterList
									.getTarget();
							if (tParameterList != null) {
								for (ExtendedMethodNameToTMethod jMethodNameToTMethod : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(
												jMethodName,
												ExtendedMethodNameToTMethod.class,
												"source")) {
									TMethod tMethod = jMethodNameToTMethod
											.getTarget();
									if (tMethod != null) {
										_result.add(new Object[] {
												extendedJamoppJavaContainer,
												pg,
												extendedJamoppJavaContainerToPg,
												tMethodSignature,
												jParameterListToTMethodSignature,
												jMethodName, tMethod,
												jParameter, tParameterList,
												jParameterList,
												jParameterListToTParameterList,
												jMethodNameToTMethod, match });
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

	public static final Iterable<Object[]> pattern_ParameterCreateNew_2_3_blackBBBBBBBBBBBB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TypeGraph pg,
			ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg,
			TMethodSignature tMethodSignature,
			ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature,
			ExtendedMethodName jMethodName,
			TMethod tMethod,
			ExtendedParameter jParameter,
			TParameterList tParameterList,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedMethodNameToTMethod jMethodNameToTMethod) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (extendedJamoppJavaContainer.getExtendedParameterList().contains(
				jParameterList)) {
			if (extendedJamoppJavaContainer.getExtendedMethodName().contains(
					jMethodName)) {
				if (pg.getMethods().contains(tMethod)) {
					if (extendedJamoppJavaContainer
							.equals(extendedJamoppJavaContainerToPg.getSource())) {
						if (pg.equals(extendedJamoppJavaContainerToPg
								.getTarget())) {
							if (tParameterList.equals(tMethodSignature
									.getParamList())) {
								if (jParameterList
										.equals(jParameterListToTMethodSignature
												.getSource())) {
									if (tMethodSignature
											.equals(jParameterListToTMethodSignature
													.getTarget())) {
										if (tMethod.equals(tMethodSignature
												.getMethod())) {
											if (jParameterList.getValues()
													.contains(jParameter)) {
												if (tParameterList
														.equals(jParameterListToTParameterList
																.getTarget())) {
													if (jParameterList
															.equals(jParameterListToTParameterList
																	.getSource())) {
														if (jMethodName
																.equals(jMethodNameToTMethod
																		.getSource())) {
															if (tMethod
																	.equals(jMethodNameToTMethod
																			.getTarget())) {
																_result.add(new Object[] {
																		extendedJamoppJavaContainer,
																		pg,
																		extendedJamoppJavaContainerToPg,
																		tMethodSignature,
																		jParameterListToTMethodSignature,
																		jMethodName,
																		tMethod,
																		jParameter,
																		tParameterList,
																		jParameterList,
																		jParameterListToTParameterList,
																		jMethodNameToTMethod });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterCreateNew_2_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TypeGraph pg,
			ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg,
			TMethodSignature tMethodSignature,
			ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature,
			ExtendedMethodName jMethodName,
			TMethod tMethod,
			ExtendedParameter jParameter,
			TParameterList tParameterList,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedMethodNameToTMethod jMethodNameToTMethod) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge extendedJamoppJavaContainer__jParameterList____extendedParameterList = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedJamoppJavaContainer__jMethodName____extendedMethodName = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedJamoppJavaContainerToPg__extendedJamoppJavaContainer____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedJamoppJavaContainerToPg__pg____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tParameterList____paramList = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterListToTMethodSignature__jParameterList____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterListToTMethodSignature__tMethodSignature____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tMethod____method = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethod__tMethodSignature____signatures = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterList__jParameter____values = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterListToTParameterList__tParameterList____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterListToTParameterList__jParameterList____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodNameToTMethod__jMethodName____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodNameToTMethod__tMethod____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String extendedJamoppJavaContainer__jParameterList____extendedParameterList_name_prime = "extendedParameterList";
		String extendedJamoppJavaContainer__jMethodName____extendedMethodName_name_prime = "extendedMethodName";
		String pg__tMethod____methods_name_prime = "methods";
		String extendedJamoppJavaContainerToPg__extendedJamoppJavaContainer____source_name_prime = "source";
		String extendedJamoppJavaContainerToPg__pg____target_name_prime = "target";
		String tMethodSignature__tParameterList____paramList_name_prime = "paramList";
		String jParameterListToTMethodSignature__jParameterList____source_name_prime = "source";
		String jParameterListToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String tMethodSignature__tMethod____method_name_prime = "method";
		String tMethod__tMethodSignature____signatures_name_prime = "signatures";
		String jParameterList__jParameter____values_name_prime = "values";
		String jParameterListToTParameterList__tParameterList____target_name_prime = "target";
		String jParameterListToTParameterList__jParameterList____source_name_prime = "source";
		String jMethodNameToTMethod__jMethodName____source_name_prime = "source";
		String jMethodNameToTMethod__tMethod____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(
				extendedJamoppJavaContainer);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(
				extendedJamoppJavaContainerToPg);
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(
				jParameterListToTMethodSignature);
		isApplicableMatch.getAllContextElements().add(jMethodName);
		isApplicableMatch.getAllContextElements().add(tMethod);
		isApplicableMatch.getAllContextElements().add(jParameter);
		isApplicableMatch.getAllContextElements().add(tParameterList);
		isApplicableMatch.getAllContextElements().add(jParameterList);
		isApplicableMatch.getAllContextElements().add(
				jParameterListToTParameterList);
		isApplicableMatch.getAllContextElements().add(jMethodNameToTMethod);
		extendedJamoppJavaContainer__jParameterList____extendedParameterList
				.setSrc(extendedJamoppJavaContainer);
		extendedJamoppJavaContainer__jParameterList____extendedParameterList
				.setTrg(jParameterList);
		isApplicableMatch
				.getAllContextElements()
				.add(extendedJamoppJavaContainer__jParameterList____extendedParameterList);
		extendedJamoppJavaContainer__jMethodName____extendedMethodName
				.setSrc(extendedJamoppJavaContainer);
		extendedJamoppJavaContainer__jMethodName____extendedMethodName
				.setTrg(jMethodName);
		isApplicableMatch.getAllContextElements().add(
				extendedJamoppJavaContainer__jMethodName____extendedMethodName);
		pg__tMethod____methods.setSrc(pg);
		pg__tMethod____methods.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(pg__tMethod____methods);
		extendedJamoppJavaContainerToPg__extendedJamoppJavaContainer____source
				.setSrc(extendedJamoppJavaContainerToPg);
		extendedJamoppJavaContainerToPg__extendedJamoppJavaContainer____source
				.setTrg(extendedJamoppJavaContainer);
		isApplicableMatch
				.getAllContextElements()
				.add(extendedJamoppJavaContainerToPg__extendedJamoppJavaContainer____source);
		extendedJamoppJavaContainerToPg__pg____target
				.setSrc(extendedJamoppJavaContainerToPg);
		extendedJamoppJavaContainerToPg__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(
				extendedJamoppJavaContainerToPg__pg____target);
		tMethodSignature__tParameterList____paramList.setSrc(tMethodSignature);
		tMethodSignature__tParameterList____paramList.setTrg(tParameterList);
		isApplicableMatch.getAllContextElements().add(
				tMethodSignature__tParameterList____paramList);
		jParameterListToTMethodSignature__jParameterList____source
				.setSrc(jParameterListToTMethodSignature);
		jParameterListToTMethodSignature__jParameterList____source
				.setTrg(jParameterList);
		isApplicableMatch.getAllContextElements().add(
				jParameterListToTMethodSignature__jParameterList____source);
		jParameterListToTMethodSignature__tMethodSignature____target
				.setSrc(jParameterListToTMethodSignature);
		jParameterListToTMethodSignature__tMethodSignature____target
				.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(
				jParameterListToTMethodSignature__tMethodSignature____target);
		tMethodSignature__tMethod____method.setSrc(tMethodSignature);
		tMethodSignature__tMethod____method.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(
				tMethodSignature__tMethod____method);
		tMethod__tMethodSignature____signatures.setSrc(tMethod);
		tMethod__tMethodSignature____signatures.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(
				tMethod__tMethodSignature____signatures);
		jParameterList__jParameter____values.setSrc(jParameterList);
		jParameterList__jParameter____values.setTrg(jParameter);
		isApplicableMatch.getAllContextElements().add(
				jParameterList__jParameter____values);
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
		jMethodNameToTMethod__jMethodName____source
				.setSrc(jMethodNameToTMethod);
		jMethodNameToTMethod__jMethodName____source.setTrg(jMethodName);
		isApplicableMatch.getAllContextElements().add(
				jMethodNameToTMethod__jMethodName____source);
		jMethodNameToTMethod__tMethod____target.setSrc(jMethodNameToTMethod);
		jMethodNameToTMethod__tMethod____target.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(
				jMethodNameToTMethod__tMethod____target);
		extendedJamoppJavaContainer__jParameterList____extendedParameterList
				.setName(extendedJamoppJavaContainer__jParameterList____extendedParameterList_name_prime);
		extendedJamoppJavaContainer__jMethodName____extendedMethodName
				.setName(extendedJamoppJavaContainer__jMethodName____extendedMethodName_name_prime);
		pg__tMethod____methods.setName(pg__tMethod____methods_name_prime);
		extendedJamoppJavaContainerToPg__extendedJamoppJavaContainer____source
				.setName(extendedJamoppJavaContainerToPg__extendedJamoppJavaContainer____source_name_prime);
		extendedJamoppJavaContainerToPg__pg____target
				.setName(extendedJamoppJavaContainerToPg__pg____target_name_prime);
		tMethodSignature__tParameterList____paramList
				.setName(tMethodSignature__tParameterList____paramList_name_prime);
		jParameterListToTMethodSignature__jParameterList____source
				.setName(jParameterListToTMethodSignature__jParameterList____source_name_prime);
		jParameterListToTMethodSignature__tMethodSignature____target
				.setName(jParameterListToTMethodSignature__tMethodSignature____target_name_prime);
		tMethodSignature__tMethod____method
				.setName(tMethodSignature__tMethod____method_name_prime);
		tMethod__tMethodSignature____signatures
				.setName(tMethod__tMethodSignature____signatures_name_prime);
		jParameterList__jParameter____values
				.setName(jParameterList__jParameter____values_name_prime);
		jParameterListToTParameterList__tParameterList____target
				.setName(jParameterListToTParameterList__tParameterList____target_name_prime);
		jParameterListToTParameterList__jParameterList____source
				.setName(jParameterListToTParameterList__jParameterList____source_name_prime);
		jMethodNameToTMethod__jMethodName____source
				.setName(jMethodNameToTMethod__jMethodName____source_name_prime);
		jMethodNameToTMethod__tMethod____target
				.setName(jMethodNameToTMethod__tMethod____target_name_prime);
		return new Object[] {
				extendedJamoppJavaContainer,
				pg,
				extendedJamoppJavaContainerToPg,
				tMethodSignature,
				jParameterListToTMethodSignature,
				jMethodName,
				tMethod,
				jParameter,
				tParameterList,
				jParameterList,
				jParameterListToTParameterList,
				jMethodNameToTMethod,
				isApplicableMatch,
				extendedJamoppJavaContainer__jParameterList____extendedParameterList,
				extendedJamoppJavaContainer__jMethodName____extendedMethodName,
				pg__tMethod____methods,
				extendedJamoppJavaContainerToPg__extendedJamoppJavaContainer____source,
				extendedJamoppJavaContainerToPg__pg____target,
				tMethodSignature__tParameterList____paramList,
				jParameterListToTMethodSignature__jParameterList____source,
				jParameterListToTMethodSignature__tMethodSignature____target,
				tMethodSignature__tMethod____method,
				tMethod__tMethodSignature____signatures,
				jParameterList__jParameter____values,
				jParameterListToTParameterList__tParameterList____target,
				jParameterListToTParameterList__jParameterList____source,
				jMethodNameToTMethod__jMethodName____source,
				jMethodNameToTMethod__tMethod____target };
	}

	public static final Object[] pattern_ParameterCreateNew_2_4_bindingFBBBBBBBBBBBBBB(
			ParameterCreateNew _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TypeGraph pg,
			ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg,
			TMethodSignature tMethodSignature,
			ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature,
			ExtendedMethodName jMethodName,
			TMethod tMethod,
			ExtendedParameter jParameter,
			TParameterList tParameterList,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedMethodNameToTMethod jMethodNameToTMethod) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, extendedJamoppJavaContainer, pg,
				extendedJamoppJavaContainerToPg, tMethodSignature,
				jParameterListToTMethodSignature, jMethodName, tMethod,
				jParameter, tParameterList, jParameterList,
				jParameterListToTParameterList, jMethodNameToTMethod);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					extendedJamoppJavaContainer, pg,
					extendedJamoppJavaContainerToPg, tMethodSignature,
					jParameterListToTMethodSignature, jMethodName, tMethod,
					jParameter, tParameterList, jParameterList,
					jParameterListToTParameterList, jMethodNameToTMethod };
		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterCreateNew_2_4_bindingAndBlackFBBBBBBBBBBBBBB(
			ParameterCreateNew _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TypeGraph pg,
			ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg,
			TMethodSignature tMethodSignature,
			ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature,
			ExtendedMethodName jMethodName,
			TMethod tMethod,
			ExtendedParameter jParameter,
			TParameterList tParameterList,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedMethodNameToTMethod jMethodNameToTMethod) {
		Object[] result_pattern_ParameterCreateNew_2_4_binding = pattern_ParameterCreateNew_2_4_bindingFBBBBBBBBBBBBBB(
				_this, isApplicableMatch, extendedJamoppJavaContainer, pg,
				extendedJamoppJavaContainerToPg, tMethodSignature,
				jParameterListToTMethodSignature, jMethodName, tMethod,
				jParameter, tParameterList, jParameterList,
				jParameterListToTParameterList, jMethodNameToTMethod);
		if (result_pattern_ParameterCreateNew_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterCreateNew_2_4_binding[0];

			Object[] result_pattern_ParameterCreateNew_2_4_black = pattern_ParameterCreateNew_2_4_blackB(csp);
			if (result_pattern_ParameterCreateNew_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						extendedJamoppJavaContainer, pg,
						extendedJamoppJavaContainerToPg, tMethodSignature,
						jParameterListToTMethodSignature, jMethodName, tMethod,
						jParameter, tParameterList, jParameterList,
						jParameterListToTParameterList, jMethodNameToTMethod };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterCreateNew_2_5_expressionFBB(
			ParameterCreateNew _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterCreateNew_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterCreateNew_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParameterCreateNew";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterCreateNew_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterCreateNew_10_1_blackBBBBBBB(
			ParameterCreateNew _this, Match match, TypeGraph pg,
			TMethodSignature tMethodSignature, TMethod tMethod,
			TParameter tParameter, TParameterList tParameterList) {
		return new Object[] { _this, match, pg, tMethodSignature, tMethod,
				tParameter, tParameterList };
	}

	public static final Object[] pattern_ParameterCreateNew_10_2_bindingFBBBBBBB(
			ParameterCreateNew _this, Match match, TypeGraph pg,
			TMethodSignature tMethodSignature, TMethod tMethod,
			TParameter tParameter, TParameterList tParameterList) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, pg,
				tMethodSignature, tMethod, tParameter, tParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, pg, tMethodSignature,
					tMethod, tParameter, tParameterList };
		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterCreateNew_10_2_bindingAndBlackFBBBBBBB(
			ParameterCreateNew _this, Match match, TypeGraph pg,
			TMethodSignature tMethodSignature, TMethod tMethod,
			TParameter tParameter, TParameterList tParameterList) {
		Object[] result_pattern_ParameterCreateNew_10_2_binding = pattern_ParameterCreateNew_10_2_bindingFBBBBBBB(
				_this, match, pg, tMethodSignature, tMethod, tParameter,
				tParameterList);
		if (result_pattern_ParameterCreateNew_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterCreateNew_10_2_binding[0];

			Object[] result_pattern_ParameterCreateNew_10_2_black = pattern_ParameterCreateNew_10_2_blackB(csp);
			if (result_pattern_ParameterCreateNew_10_2_black != null) {

				return new Object[] { csp, _this, match, pg, tMethodSignature,
						tMethod, tParameter, tParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterCreateNew_10_3_expressionFBB(
			ParameterCreateNew _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterCreateNew_10_4_blackBBBBBB(
			Match match, TypeGraph pg, TMethodSignature tMethodSignature,
			TMethod tMethod, TParameter tParameter,
			TParameterList tParameterList) {
		return new Object[] { match, pg, tMethodSignature, tMethod, tParameter,
				tParameterList };
	}

	public static final Object[] pattern_ParameterCreateNew_10_4_greenBBBF(
			Match match, TParameter tParameter, TParameterList tParameterList) {
		EMoflonEdge tParameterList__tParameter____entries = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tParameter);
		String tParameterList__tParameter____entries_name_prime = "entries";
		tParameterList__tParameter____entries.setSrc(tParameterList);
		tParameterList__tParameter____entries.setTrg(tParameter);
		match.getToBeTranslatedEdges().add(
				tParameterList__tParameter____entries);
		tParameterList__tParameter____entries
				.setName(tParameterList__tParameter____entries_name_prime);
		return new Object[] { match, tParameter, tParameterList,
				tParameterList__tParameter____entries };
	}

	public static final Object[] pattern_ParameterCreateNew_10_5_blackBBBBBB(
			Match match, TypeGraph pg, TMethodSignature tMethodSignature,
			TMethod tMethod, TParameter tParameter,
			TParameterList tParameterList) {
		return new Object[] { match, pg, tMethodSignature, tMethod, tParameter,
				tParameterList };
	}

	public static final Object[] pattern_ParameterCreateNew_10_5_greenBBBBBFFFF(
			Match match, TypeGraph pg, TMethodSignature tMethodSignature,
			TMethod tMethod, TParameterList tParameterList) {
		EMoflonEdge pg__tMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tParameterList____paramList = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tMethod____method = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethod__tMethodSignature____signatures = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(pg);
		match.getContextNodes().add(tMethodSignature);
		match.getContextNodes().add(tMethod);
		match.getContextNodes().add(tParameterList);
		String pg__tMethod____methods_name_prime = "methods";
		String tMethodSignature__tParameterList____paramList_name_prime = "paramList";
		String tMethodSignature__tMethod____method_name_prime = "method";
		String tMethod__tMethodSignature____signatures_name_prime = "signatures";
		pg__tMethod____methods.setSrc(pg);
		pg__tMethod____methods.setTrg(tMethod);
		match.getContextEdges().add(pg__tMethod____methods);
		tMethodSignature__tParameterList____paramList.setSrc(tMethodSignature);
		tMethodSignature__tParameterList____paramList.setTrg(tParameterList);
		match.getContextEdges().add(
				tMethodSignature__tParameterList____paramList);
		tMethodSignature__tMethod____method.setSrc(tMethodSignature);
		tMethodSignature__tMethod____method.setTrg(tMethod);
		match.getContextEdges().add(tMethodSignature__tMethod____method);
		tMethod__tMethodSignature____signatures.setSrc(tMethod);
		tMethod__tMethodSignature____signatures.setTrg(tMethodSignature);
		match.getContextEdges().add(tMethod__tMethodSignature____signatures);
		pg__tMethod____methods.setName(pg__tMethod____methods_name_prime);
		tMethodSignature__tParameterList____paramList
				.setName(tMethodSignature__tParameterList____paramList_name_prime);
		tMethodSignature__tMethod____method
				.setName(tMethodSignature__tMethod____method_name_prime);
		tMethod__tMethodSignature____signatures
				.setName(tMethod__tMethodSignature____signatures_name_prime);
		return new Object[] { match, pg, tMethodSignature, tMethod,
				tParameterList, pg__tMethod____methods,
				tMethodSignature__tParameterList____paramList,
				tMethodSignature__tMethod____method,
				tMethod__tMethodSignature____signatures };
	}

	public static final void pattern_ParameterCreateNew_10_6_expressionBBBBBBB(
			ParameterCreateNew _this, Match match, TypeGraph pg,
			TMethodSignature tMethodSignature, TMethod tMethod,
			TParameter tParameter, TParameterList tParameterList) {
		_this.registerObjectsToMatch_BWD(match, pg, tMethodSignature, tMethod,
				tParameter, tParameterList);

	}

	public static final boolean pattern_ParameterCreateNew_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterCreateNew_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParameterCreateNew_11_1_bindingFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("extendedJamoppJavaContainer");
		EObject _localVariable_1 = isApplicableMatch.getObject("pg");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("extendedJamoppJavaContainerToPg");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("tMethodSignature");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("jParameterListToTMethodSignature");
		EObject _localVariable_5 = isApplicableMatch.getObject("jMethodName");
		EObject _localVariable_6 = isApplicableMatch.getObject("tMethod");
		EObject _localVariable_7 = isApplicableMatch.getObject("tParameter");
		EObject _localVariable_8 = isApplicableMatch
				.getObject("tParameterList");
		EObject _localVariable_9 = isApplicableMatch
				.getObject("jParameterList");
		EObject _localVariable_10 = isApplicableMatch
				.getObject("jParameterListToTParameterList");
		EObject _localVariable_11 = isApplicableMatch
				.getObject("jMethodNameToTMethod");
		EObject tmpExtendedJamoppJavaContainer = _localVariable_0;
		EObject tmpPg = _localVariable_1;
		EObject tmpExtendedJamoppJavaContainerToPg = _localVariable_2;
		EObject tmpTMethodSignature = _localVariable_3;
		EObject tmpJParameterListToTMethodSignature = _localVariable_4;
		EObject tmpJMethodName = _localVariable_5;
		EObject tmpTMethod = _localVariable_6;
		EObject tmpTParameter = _localVariable_7;
		EObject tmpTParameterList = _localVariable_8;
		EObject tmpJParameterList = _localVariable_9;
		EObject tmpJParameterListToTParameterList = _localVariable_10;
		EObject tmpJMethodNameToTMethod = _localVariable_11;
		if (tmpExtendedJamoppJavaContainer instanceof ExtendedJamoppJavaContainer) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) tmpExtendedJamoppJavaContainer;
			if (tmpPg instanceof TypeGraph) {
				TypeGraph pg = (TypeGraph) tmpPg;
				if (tmpExtendedJamoppJavaContainerToPg instanceof ExtendedJamoppJavaContainerToTypeGraph) {
					ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg = (ExtendedJamoppJavaContainerToTypeGraph) tmpExtendedJamoppJavaContainerToPg;
					if (tmpTMethodSignature instanceof TMethodSignature) {
						TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
						if (tmpJParameterListToTMethodSignature instanceof ExtendedParameterListToTMethodSignature) {
							ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature = (ExtendedParameterListToTMethodSignature) tmpJParameterListToTMethodSignature;
							if (tmpJMethodName instanceof ExtendedMethodName) {
								ExtendedMethodName jMethodName = (ExtendedMethodName) tmpJMethodName;
								if (tmpTMethod instanceof TMethod) {
									TMethod tMethod = (TMethod) tmpTMethod;
									if (tmpTParameter instanceof TParameter) {
										TParameter tParameter = (TParameter) tmpTParameter;
										if (tmpTParameterList instanceof TParameterList) {
											TParameterList tParameterList = (TParameterList) tmpTParameterList;
											if (tmpJParameterList instanceof ExtendedParameterList) {
												ExtendedParameterList jParameterList = (ExtendedParameterList) tmpJParameterList;
												if (tmpJParameterListToTParameterList instanceof ExtendedParameterListToTParameterList) {
													ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) tmpJParameterListToTParameterList;
													if (tmpJMethodNameToTMethod instanceof ExtendedMethodNameToTMethod) {
														ExtendedMethodNameToTMethod jMethodNameToTMethod = (ExtendedMethodNameToTMethod) tmpJMethodNameToTMethod;
														return new Object[] {
																extendedJamoppJavaContainer,
																pg,
																extendedJamoppJavaContainerToPg,
																tMethodSignature,
																jParameterListToTMethodSignature,
																jMethodName,
																tMethod,
																tParameter,
																tParameterList,
																jParameterList,
																jParameterListToTParameterList,
																jMethodNameToTMethod,
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
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_11_1_blackBBBBBBBBBBBBFBB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TypeGraph pg,
			ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg,
			TMethodSignature tMethodSignature,
			ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature,
			ExtendedMethodName jMethodName,
			TMethod tMethod,
			TParameter tParameter,
			TParameterList tParameterList,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedMethodNameToTMethod jMethodNameToTMethod,
			ParameterCreateNew _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { extendedJamoppJavaContainer, pg,
						extendedJamoppJavaContainerToPg, tMethodSignature,
						jParameterListToTMethodSignature, jMethodName, tMethod,
						tParameter, tParameterList, jParameterList,
						jParameterListToTParameterList, jMethodNameToTMethod,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_11_1_bindingAndBlackFFFFFFFFFFFFFBB(
			ParameterCreateNew _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParameterCreateNew_11_1_binding = pattern_ParameterCreateNew_11_1_bindingFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ParameterCreateNew_11_1_binding != null) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result_pattern_ParameterCreateNew_11_1_binding[0];
			TypeGraph pg = (TypeGraph) result_pattern_ParameterCreateNew_11_1_binding[1];
			ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg = (ExtendedJamoppJavaContainerToTypeGraph) result_pattern_ParameterCreateNew_11_1_binding[2];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_ParameterCreateNew_11_1_binding[3];
			ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature = (ExtendedParameterListToTMethodSignature) result_pattern_ParameterCreateNew_11_1_binding[4];
			ExtendedMethodName jMethodName = (ExtendedMethodName) result_pattern_ParameterCreateNew_11_1_binding[5];
			TMethod tMethod = (TMethod) result_pattern_ParameterCreateNew_11_1_binding[6];
			TParameter tParameter = (TParameter) result_pattern_ParameterCreateNew_11_1_binding[7];
			TParameterList tParameterList = (TParameterList) result_pattern_ParameterCreateNew_11_1_binding[8];
			ExtendedParameterList jParameterList = (ExtendedParameterList) result_pattern_ParameterCreateNew_11_1_binding[9];
			ExtendedParameterListToTParameterList jParameterListToTParameterList = (ExtendedParameterListToTParameterList) result_pattern_ParameterCreateNew_11_1_binding[10];
			ExtendedMethodNameToTMethod jMethodNameToTMethod = (ExtendedMethodNameToTMethod) result_pattern_ParameterCreateNew_11_1_binding[11];

			Object[] result_pattern_ParameterCreateNew_11_1_black = pattern_ParameterCreateNew_11_1_blackBBBBBBBBBBBBFBB(
					extendedJamoppJavaContainer, pg,
					extendedJamoppJavaContainerToPg, tMethodSignature,
					jParameterListToTMethodSignature, jMethodName, tMethod,
					tParameter, tParameterList, jParameterList,
					jParameterListToTParameterList, jMethodNameToTMethod,
					_this, isApplicableMatch);
			if (result_pattern_ParameterCreateNew_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ParameterCreateNew_11_1_black[12];

				return new Object[] { extendedJamoppJavaContainer, pg,
						extendedJamoppJavaContainerToPg, tMethodSignature,
						jParameterListToTMethodSignature, jMethodName, tMethod,
						tParameter, tParameterList, jParameterList,
						jParameterListToTParameterList, jMethodNameToTMethod,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_11_1_greenBFFBBF(
			TypeGraph pg, TParameter tParameter,
			ExtendedParameterList jParameterList) {
		ExtendedParameterToTypeGraph jParameterToPg = GravityTGGFactory.eINSTANCE
				.createExtendedParameterToTypeGraph();
		ExtendedParameter jParameter = ExtendedJamoppFactory.eINSTANCE
				.createExtendedParameter();
		ExtendedParameterToTParameter jParameterToTParameter = GravityTGGFactory.eINSTANCE
				.createExtendedParameterToTParameter();
		jParameterToPg.setTarget(pg);
		jParameterToPg.setSource(jParameter);
		jParameterList.getValues().add(jParameter);
		jParameterToTParameter.setTarget(tParameter);
		jParameterToTParameter.setSource(jParameter);
		return new Object[] { pg, jParameterToPg, jParameter, tParameter,
				jParameterList, jParameterToTParameter };
	}

	public static final Object[] pattern_ParameterCreateNew_11_2_blackBBBB(
			ExtendedParameterToTypeGraph jParameterToPg,
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter) {
		return new Object[] { jParameterToPg, jParameter, tParameter,
				jParameterToTParameter };
	}

	public static final Object[] pattern_ParameterCreateNew_11_2_greenFBBBB(
			ExtendedParameterToTypeGraph jParameterToPg,
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(jParameterToPg);
		ruleresult.getCreatedElements().add(jParameter);
		ruleresult.getTranslatedElements().add(tParameter);
		ruleresult.getCreatedLinkElements().add(jParameterToTParameter);
		return new Object[] { ruleresult, jParameterToPg, jParameter,
				tParameter, jParameterToTParameter };
	}

	public static final Object[] pattern_ParameterCreateNew_11_3_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject extendedJamoppJavaContainer,
			EObject pg, EObject extendedJamoppJavaContainerToPg,
			EObject tMethodSignature, EObject jParameterListToTMethodSignature,
			EObject jParameterToPg, EObject jMethodName, EObject tMethod,
			EObject jParameter, EObject tParameter, EObject tParameterList,
			EObject jParameterList, EObject jParameterListToTParameterList,
			EObject jParameterToTParameter, EObject jMethodNameToTMethod) {
		if (!extendedJamoppJavaContainer.equals(pg)) {
			if (!extendedJamoppJavaContainer
					.equals(extendedJamoppJavaContainerToPg)) {
				if (!extendedJamoppJavaContainer.equals(tMethodSignature)) {
					if (!extendedJamoppJavaContainer
							.equals(jParameterListToTMethodSignature)) {
						if (!extendedJamoppJavaContainer.equals(jParameterToPg)) {
							if (!extendedJamoppJavaContainer
									.equals(jMethodName)) {
								if (!extendedJamoppJavaContainer
										.equals(tMethod)) {
									if (!extendedJamoppJavaContainer
											.equals(jParameter)) {
										if (!extendedJamoppJavaContainer
												.equals(tParameter)) {
											if (!extendedJamoppJavaContainer
													.equals(tParameterList)) {
												if (!extendedJamoppJavaContainer
														.equals(jParameterList)) {
													if (!extendedJamoppJavaContainer
															.equals(jParameterListToTParameterList)) {
														if (!extendedJamoppJavaContainer
																.equals(jParameterToTParameter)) {
															if (!extendedJamoppJavaContainer
																	.equals(jMethodNameToTMethod)) {
																if (!pg.equals(tMethodSignature)) {
																	if (!pg.equals(tMethod)) {
																		if (!pg.equals(tParameter)) {
																			if (!pg.equals(tParameterList)) {
																				if (!extendedJamoppJavaContainerToPg
																						.equals(pg)) {
																					if (!extendedJamoppJavaContainerToPg
																							.equals(tMethodSignature)) {
																						if (!extendedJamoppJavaContainerToPg
																								.equals(jParameterListToTMethodSignature)) {
																							if (!extendedJamoppJavaContainerToPg
																									.equals(jParameterToPg)) {
																								if (!extendedJamoppJavaContainerToPg
																										.equals(jMethodName)) {
																									if (!extendedJamoppJavaContainerToPg
																											.equals(tMethod)) {
																										if (!extendedJamoppJavaContainerToPg
																												.equals(jParameter)) {
																											if (!extendedJamoppJavaContainerToPg
																													.equals(tParameter)) {
																												if (!extendedJamoppJavaContainerToPg
																														.equals(tParameterList)) {
																													if (!extendedJamoppJavaContainerToPg
																															.equals(jParameterList)) {
																														if (!extendedJamoppJavaContainerToPg
																																.equals(jParameterListToTParameterList)) {
																															if (!extendedJamoppJavaContainerToPg
																																	.equals(jParameterToTParameter)) {
																																if (!extendedJamoppJavaContainerToPg
																																		.equals(jMethodNameToTMethod)) {
																																	if (!tMethodSignature
																																			.equals(tParameter)) {
																																		if (!tMethodSignature
																																				.equals(tParameterList)) {
																																			if (!jParameterListToTMethodSignature
																																					.equals(pg)) {
																																				if (!jParameterListToTMethodSignature
																																						.equals(tMethodSignature)) {
																																					if (!jParameterListToTMethodSignature
																																							.equals(jParameterToPg)) {
																																						if (!jParameterListToTMethodSignature
																																								.equals(tMethod)) {
																																							if (!jParameterListToTMethodSignature
																																									.equals(tParameter)) {
																																								if (!jParameterListToTMethodSignature
																																										.equals(tParameterList)) {
																																									if (!jParameterListToTMethodSignature
																																											.equals(jParameterListToTParameterList)) {
																																										if (!jParameterListToTMethodSignature
																																												.equals(jParameterToTParameter)) {
																																											if (!jParameterToPg
																																													.equals(pg)) {
																																												if (!jParameterToPg
																																														.equals(tMethodSignature)) {
																																													if (!jParameterToPg
																																															.equals(tMethod)) {
																																														if (!jParameterToPg
																																																.equals(tParameter)) {
																																															if (!jParameterToPg
																																																	.equals(tParameterList)) {
																																																if (!jParameterToPg
																																																		.equals(jParameterToTParameter)) {
																																																	if (!jMethodName
																																																			.equals(pg)) {
																																																		if (!jMethodName
																																																				.equals(tMethodSignature)) {
																																																			if (!jMethodName
																																																					.equals(jParameterListToTMethodSignature)) {
																																																				if (!jMethodName
																																																						.equals(jParameterToPg)) {
																																																					if (!jMethodName
																																																							.equals(tMethod)) {
																																																						if (!jMethodName
																																																								.equals(jParameter)) {
																																																							if (!jMethodName
																																																									.equals(tParameter)) {
																																																								if (!jMethodName
																																																										.equals(tParameterList)) {
																																																									if (!jMethodName
																																																											.equals(jParameterList)) {
																																																										if (!jMethodName
																																																												.equals(jParameterListToTParameterList)) {
																																																											if (!jMethodName
																																																													.equals(jParameterToTParameter)) {
																																																												if (!jMethodName
																																																														.equals(jMethodNameToTMethod)) {
																																																													if (!tMethod
																																																															.equals(tMethodSignature)) {
																																																														if (!tMethod
																																																																.equals(tParameter)) {
																																																															if (!tMethod
																																																																	.equals(tParameterList)) {
																																																																if (!jParameter
																																																																		.equals(pg)) {
																																																																	if (!jParameter
																																																																			.equals(tMethodSignature)) {
																																																																		if (!jParameter
																																																																				.equals(jParameterListToTMethodSignature)) {
																																																																			if (!jParameter
																																																																					.equals(jParameterToPg)) {
																																																																				if (!jParameter
																																																																						.equals(tMethod)) {
																																																																					if (!jParameter
																																																																							.equals(tParameter)) {
																																																																						if (!jParameter
																																																																								.equals(tParameterList)) {
																																																																							if (!jParameter
																																																																									.equals(jParameterList)) {
																																																																								if (!jParameter
																																																																										.equals(jParameterListToTParameterList)) {
																																																																									if (!jParameter
																																																																											.equals(jParameterToTParameter)) {
																																																																										if (!tParameter
																																																																												.equals(tParameterList)) {
																																																																											if (!jParameterList
																																																																													.equals(pg)) {
																																																																												if (!jParameterList
																																																																														.equals(tMethodSignature)) {
																																																																													if (!jParameterList
																																																																															.equals(jParameterListToTMethodSignature)) {
																																																																														if (!jParameterList
																																																																																.equals(jParameterToPg)) {
																																																																															if (!jParameterList
																																																																																	.equals(tMethod)) {
																																																																																if (!jParameterList
																																																																																		.equals(tParameter)) {
																																																																																	if (!jParameterList
																																																																																			.equals(tParameterList)) {
																																																																																		if (!jParameterList
																																																																																				.equals(jParameterListToTParameterList)) {
																																																																																			if (!jParameterList
																																																																																					.equals(jParameterToTParameter)) {
																																																																																				if (!jParameterListToTParameterList
																																																																																						.equals(pg)) {
																																																																																					if (!jParameterListToTParameterList
																																																																																							.equals(tMethodSignature)) {
																																																																																						if (!jParameterListToTParameterList
																																																																																								.equals(jParameterToPg)) {
																																																																																							if (!jParameterListToTParameterList
																																																																																									.equals(tMethod)) {
																																																																																								if (!jParameterListToTParameterList
																																																																																										.equals(tParameter)) {
																																																																																									if (!jParameterListToTParameterList
																																																																																											.equals(tParameterList)) {
																																																																																										if (!jParameterListToTParameterList
																																																																																												.equals(jParameterToTParameter)) {
																																																																																											if (!jParameterToTParameter
																																																																																													.equals(pg)) {
																																																																																												if (!jParameterToTParameter
																																																																																														.equals(tMethodSignature)) {
																																																																																													if (!jParameterToTParameter
																																																																																															.equals(tMethod)) {
																																																																																														if (!jParameterToTParameter
																																																																																																.equals(tParameter)) {
																																																																																															if (!jParameterToTParameter
																																																																																																	.equals(tParameterList)) {
																																																																																																if (!jMethodNameToTMethod
																																																																																																		.equals(pg)) {
																																																																																																	if (!jMethodNameToTMethod
																																																																																																			.equals(tMethodSignature)) {
																																																																																																		if (!jMethodNameToTMethod
																																																																																																				.equals(jParameterListToTMethodSignature)) {
																																																																																																			if (!jMethodNameToTMethod
																																																																																																					.equals(jParameterToPg)) {
																																																																																																				if (!jMethodNameToTMethod
																																																																																																						.equals(tMethod)) {
																																																																																																					if (!jMethodNameToTMethod
																																																																																																							.equals(jParameter)) {
																																																																																																						if (!jMethodNameToTMethod
																																																																																																								.equals(tParameter)) {
																																																																																																							if (!jMethodNameToTMethod
																																																																																																									.equals(tParameterList)) {
																																																																																																								if (!jMethodNameToTMethod
																																																																																																										.equals(jParameterList)) {
																																																																																																									if (!jMethodNameToTMethod
																																																																																																											.equals(jParameterListToTParameterList)) {
																																																																																																										if (!jMethodNameToTMethod
																																																																																																												.equals(jParameterToTParameter)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													extendedJamoppJavaContainer,
																																																																																																													pg,
																																																																																																													extendedJamoppJavaContainerToPg,
																																																																																																													tMethodSignature,
																																																																																																													jParameterListToTMethodSignature,
																																																																																																													jParameterToPg,
																																																																																																													jMethodName,
																																																																																																													tMethod,
																																																																																																													jParameter,
																																																																																																													tParameter,
																																																																																																													tParameterList,
																																																																																																													jParameterList,
																																																																																																													jParameterListToTParameterList,
																																																																																																													jParameterToTParameter,
																																																																																																													jMethodNameToTMethod };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterCreateNew_11_3_greenBBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject pg, EObject jParameterToPg,
			EObject jParameter, EObject tParameter, EObject tParameterList,
			EObject jParameterList, EObject jParameterToTParameter) {
		EMoflonEdge jParameterToPg__jParameter____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToPg__pg____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tParameterList__tParameter____entries = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterList__jParameter____values = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToTParameter__tParameter____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToTParameter__jParameter____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParameterCreateNew";
		String jParameterToPg__jParameter____source_name_prime = "source";
		String jParameterToPg__pg____target_name_prime = "target";
		String tParameterList__tParameter____entries_name_prime = "entries";
		String jParameterList__jParameter____values_name_prime = "values";
		String jParameterToTParameter__tParameter____target_name_prime = "target";
		String jParameterToTParameter__jParameter____source_name_prime = "source";
		jParameterToPg__jParameter____source.setSrc(jParameterToPg);
		jParameterToPg__jParameter____source.setTrg(jParameter);
		ruleresult.getCreatedEdges().add(jParameterToPg__jParameter____source);
		jParameterToPg__pg____target.setSrc(jParameterToPg);
		jParameterToPg__pg____target.setTrg(pg);
		ruleresult.getCreatedEdges().add(jParameterToPg__pg____target);
		tParameterList__tParameter____entries.setSrc(tParameterList);
		tParameterList__tParameter____entries.setTrg(tParameter);
		ruleresult.getTranslatedEdges().add(
				tParameterList__tParameter____entries);
		jParameterList__jParameter____values.setSrc(jParameterList);
		jParameterList__jParameter____values.setTrg(jParameter);
		ruleresult.getCreatedEdges().add(jParameterList__jParameter____values);
		jParameterToTParameter__tParameter____target
				.setSrc(jParameterToTParameter);
		jParameterToTParameter__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(
				jParameterToTParameter__tParameter____target);
		jParameterToTParameter__jParameter____source
				.setSrc(jParameterToTParameter);
		jParameterToTParameter__jParameter____source.setTrg(jParameter);
		ruleresult.getCreatedEdges().add(
				jParameterToTParameter__jParameter____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jParameterToPg__jParameter____source
				.setName(jParameterToPg__jParameter____source_name_prime);
		jParameterToPg__pg____target
				.setName(jParameterToPg__pg____target_name_prime);
		tParameterList__tParameter____entries
				.setName(tParameterList__tParameter____entries_name_prime);
		jParameterList__jParameter____values
				.setName(jParameterList__jParameter____values_name_prime);
		jParameterToTParameter__tParameter____target
				.setName(jParameterToTParameter__tParameter____target_name_prime);
		jParameterToTParameter__jParameter____source
				.setName(jParameterToTParameter__jParameter____source_name_prime);
		return new Object[] { ruleresult, pg, jParameterToPg, jParameter,
				tParameter, tParameterList, jParameterList,
				jParameterToTParameter, jParameterToPg__jParameter____source,
				jParameterToPg__pg____target,
				tParameterList__tParameter____entries,
				jParameterList__jParameter____values,
				jParameterToTParameter__tParameter____target,
				jParameterToTParameter__jParameter____source };
	}

	public static final void pattern_ParameterCreateNew_11_5_expressionBBBBBBBBBBBBBBBBB(
			ParameterCreateNew _this, PerformRuleResult ruleresult,
			EObject extendedJamoppJavaContainer, EObject pg,
			EObject extendedJamoppJavaContainerToPg, EObject tMethodSignature,
			EObject jParameterListToTMethodSignature, EObject jParameterToPg,
			EObject jMethodName, EObject tMethod, EObject jParameter,
			EObject tParameter, EObject tParameterList, EObject jParameterList,
			EObject jParameterListToTParameterList,
			EObject jParameterToTParameter, EObject jMethodNameToTMethod) {
		_this.registerObjects_BWD(ruleresult, extendedJamoppJavaContainer, pg,
				extendedJamoppJavaContainerToPg, tMethodSignature,
				jParameterListToTMethodSignature, jParameterToPg, jMethodName,
				tMethod, jParameter, tParameter, tParameterList,
				jParameterList, jParameterListToTParameterList,
				jParameterToTParameter, jMethodNameToTMethod);

	}

	public static final PerformRuleResult pattern_ParameterCreateNew_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterCreateNew_12_1_bindingFB(
			ParameterCreateNew _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_12_1_blackFBB(
			EClass eClass, ParameterCreateNew _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_12_1_bindingAndBlackFFB(
			ParameterCreateNew _this) {
		Object[] result_pattern_ParameterCreateNew_12_1_binding = pattern_ParameterCreateNew_12_1_bindingFB(_this);
		if (result_pattern_ParameterCreateNew_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParameterCreateNew_12_1_binding[0];

			Object[] result_pattern_ParameterCreateNew_12_1_black = pattern_ParameterCreateNew_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParameterCreateNew_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParameterCreateNew_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParameterCreateNew";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParameterCreateNew_12_2_bindingFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("pg");
		EObject _localVariable_1 = match.getObject("tMethodSignature");
		EObject _localVariable_2 = match.getObject("tMethod");
		EObject _localVariable_3 = match.getObject("tParameter");
		EObject _localVariable_4 = match.getObject("tParameterList");
		EObject tmpPg = _localVariable_0;
		EObject tmpTMethodSignature = _localVariable_1;
		EObject tmpTMethod = _localVariable_2;
		EObject tmpTParameter = _localVariable_3;
		EObject tmpTParameterList = _localVariable_4;
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			if (tmpTMethodSignature instanceof TMethodSignature) {
				TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
				if (tmpTMethod instanceof TMethod) {
					TMethod tMethod = (TMethod) tmpTMethod;
					if (tmpTParameter instanceof TParameter) {
						TParameter tParameter = (TParameter) tmpTParameter;
						if (tmpTParameterList instanceof TParameterList) {
							TParameterList tParameterList = (TParameterList) tmpTParameterList;
							return new Object[] { pg, tMethodSignature,
									tMethod, tParameter, tParameterList, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterCreateNew_12_2_blackFBFBFFBBBFFFB(
			TypeGraph pg, TMethodSignature tMethodSignature, TMethod tMethod,
			TParameter tParameter, TParameterList tParameterList, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pg,
						ExtendedJamoppJavaContainerToTypeGraph.class, "target")) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = extendedJamoppJavaContainerToPg
					.getSource();
			if (extendedJamoppJavaContainer != null) {
				for (ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tMethodSignature,
								ExtendedParameterListToTMethodSignature.class,
								"target")) {
					ExtendedParameterList jParameterList = jParameterListToTMethodSignature
							.getSource();
					if (jParameterList != null) {
						for (ExtendedParameterListToTParameterList jParameterListToTParameterList : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(
										tParameterList,
										ExtendedParameterListToTParameterList.class,
										"target")) {
							if (jParameterList
									.equals(jParameterListToTParameterList
											.getSource())) {
								for (ExtendedMethodNameToTMethod jMethodNameToTMethod : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(
												tMethod,
												ExtendedMethodNameToTMethod.class,
												"target")) {
									ExtendedMethodName jMethodName = jMethodNameToTMethod
											.getSource();
									if (jMethodName != null) {
										_result.add(new Object[] {
												extendedJamoppJavaContainer,
												pg,
												extendedJamoppJavaContainerToPg,
												tMethodSignature,
												jParameterListToTMethodSignature,
												jMethodName, tMethod,
												tParameter, tParameterList,
												jParameterList,
												jParameterListToTParameterList,
												jMethodNameToTMethod, match });
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

	public static final Iterable<Object[]> pattern_ParameterCreateNew_12_3_blackBBBBBBBBBBBB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TypeGraph pg,
			ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg,
			TMethodSignature tMethodSignature,
			ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature,
			ExtendedMethodName jMethodName,
			TMethod tMethod,
			TParameter tParameter,
			TParameterList tParameterList,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedMethodNameToTMethod jMethodNameToTMethod) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (extendedJamoppJavaContainer.getExtendedParameterList().contains(
				jParameterList)) {
			if (extendedJamoppJavaContainer.getExtendedMethodName().contains(
					jMethodName)) {
				if (pg.getMethods().contains(tMethod)) {
					if (extendedJamoppJavaContainer
							.equals(extendedJamoppJavaContainerToPg.getSource())) {
						if (pg.equals(extendedJamoppJavaContainerToPg
								.getTarget())) {
							if (tParameterList.equals(tMethodSignature
									.getParamList())) {
								if (jParameterList
										.equals(jParameterListToTMethodSignature
												.getSource())) {
									if (tMethodSignature
											.equals(jParameterListToTMethodSignature
													.getTarget())) {
										if (tMethod.equals(tMethodSignature
												.getMethod())) {
											if (tParameterList.getEntries()
													.contains(tParameter)) {
												if (tParameterList
														.equals(jParameterListToTParameterList
																.getTarget())) {
													if (jParameterList
															.equals(jParameterListToTParameterList
																	.getSource())) {
														if (jMethodName
																.equals(jMethodNameToTMethod
																		.getSource())) {
															if (tMethod
																	.equals(jMethodNameToTMethod
																			.getTarget())) {
																_result.add(new Object[] {
																		extendedJamoppJavaContainer,
																		pg,
																		extendedJamoppJavaContainerToPg,
																		tMethodSignature,
																		jParameterListToTMethodSignature,
																		jMethodName,
																		tMethod,
																		tParameter,
																		tParameterList,
																		jParameterList,
																		jParameterListToTParameterList,
																		jMethodNameToTMethod });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterCreateNew_12_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TypeGraph pg,
			ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg,
			TMethodSignature tMethodSignature,
			ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature,
			ExtendedMethodName jMethodName,
			TMethod tMethod,
			TParameter tParameter,
			TParameterList tParameterList,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedMethodNameToTMethod jMethodNameToTMethod) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge extendedJamoppJavaContainer__jParameterList____extendedParameterList = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedJamoppJavaContainer__jMethodName____extendedMethodName = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedJamoppJavaContainerToPg__extendedJamoppJavaContainer____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedJamoppJavaContainerToPg__pg____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tParameterList____paramList = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterListToTMethodSignature__jParameterList____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterListToTMethodSignature__tMethodSignature____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tMethod____method = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethod__tMethodSignature____signatures = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tParameterList__tParameter____entries = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterListToTParameterList__tParameterList____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterListToTParameterList__jParameterList____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodNameToTMethod__jMethodName____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodNameToTMethod__tMethod____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String extendedJamoppJavaContainer__jParameterList____extendedParameterList_name_prime = "extendedParameterList";
		String extendedJamoppJavaContainer__jMethodName____extendedMethodName_name_prime = "extendedMethodName";
		String pg__tMethod____methods_name_prime = "methods";
		String extendedJamoppJavaContainerToPg__extendedJamoppJavaContainer____source_name_prime = "source";
		String extendedJamoppJavaContainerToPg__pg____target_name_prime = "target";
		String tMethodSignature__tParameterList____paramList_name_prime = "paramList";
		String jParameterListToTMethodSignature__jParameterList____source_name_prime = "source";
		String jParameterListToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String tMethodSignature__tMethod____method_name_prime = "method";
		String tMethod__tMethodSignature____signatures_name_prime = "signatures";
		String tParameterList__tParameter____entries_name_prime = "entries";
		String jParameterListToTParameterList__tParameterList____target_name_prime = "target";
		String jParameterListToTParameterList__jParameterList____source_name_prime = "source";
		String jMethodNameToTMethod__jMethodName____source_name_prime = "source";
		String jMethodNameToTMethod__tMethod____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(
				extendedJamoppJavaContainer);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(
				extendedJamoppJavaContainerToPg);
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(
				jParameterListToTMethodSignature);
		isApplicableMatch.getAllContextElements().add(jMethodName);
		isApplicableMatch.getAllContextElements().add(tMethod);
		isApplicableMatch.getAllContextElements().add(tParameter);
		isApplicableMatch.getAllContextElements().add(tParameterList);
		isApplicableMatch.getAllContextElements().add(jParameterList);
		isApplicableMatch.getAllContextElements().add(
				jParameterListToTParameterList);
		isApplicableMatch.getAllContextElements().add(jMethodNameToTMethod);
		extendedJamoppJavaContainer__jParameterList____extendedParameterList
				.setSrc(extendedJamoppJavaContainer);
		extendedJamoppJavaContainer__jParameterList____extendedParameterList
				.setTrg(jParameterList);
		isApplicableMatch
				.getAllContextElements()
				.add(extendedJamoppJavaContainer__jParameterList____extendedParameterList);
		extendedJamoppJavaContainer__jMethodName____extendedMethodName
				.setSrc(extendedJamoppJavaContainer);
		extendedJamoppJavaContainer__jMethodName____extendedMethodName
				.setTrg(jMethodName);
		isApplicableMatch.getAllContextElements().add(
				extendedJamoppJavaContainer__jMethodName____extendedMethodName);
		pg__tMethod____methods.setSrc(pg);
		pg__tMethod____methods.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(pg__tMethod____methods);
		extendedJamoppJavaContainerToPg__extendedJamoppJavaContainer____source
				.setSrc(extendedJamoppJavaContainerToPg);
		extendedJamoppJavaContainerToPg__extendedJamoppJavaContainer____source
				.setTrg(extendedJamoppJavaContainer);
		isApplicableMatch
				.getAllContextElements()
				.add(extendedJamoppJavaContainerToPg__extendedJamoppJavaContainer____source);
		extendedJamoppJavaContainerToPg__pg____target
				.setSrc(extendedJamoppJavaContainerToPg);
		extendedJamoppJavaContainerToPg__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(
				extendedJamoppJavaContainerToPg__pg____target);
		tMethodSignature__tParameterList____paramList.setSrc(tMethodSignature);
		tMethodSignature__tParameterList____paramList.setTrg(tParameterList);
		isApplicableMatch.getAllContextElements().add(
				tMethodSignature__tParameterList____paramList);
		jParameterListToTMethodSignature__jParameterList____source
				.setSrc(jParameterListToTMethodSignature);
		jParameterListToTMethodSignature__jParameterList____source
				.setTrg(jParameterList);
		isApplicableMatch.getAllContextElements().add(
				jParameterListToTMethodSignature__jParameterList____source);
		jParameterListToTMethodSignature__tMethodSignature____target
				.setSrc(jParameterListToTMethodSignature);
		jParameterListToTMethodSignature__tMethodSignature____target
				.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(
				jParameterListToTMethodSignature__tMethodSignature____target);
		tMethodSignature__tMethod____method.setSrc(tMethodSignature);
		tMethodSignature__tMethod____method.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(
				tMethodSignature__tMethod____method);
		tMethod__tMethodSignature____signatures.setSrc(tMethod);
		tMethod__tMethodSignature____signatures.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(
				tMethod__tMethodSignature____signatures);
		tParameterList__tParameter____entries.setSrc(tParameterList);
		tParameterList__tParameter____entries.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(
				tParameterList__tParameter____entries);
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
		jMethodNameToTMethod__jMethodName____source
				.setSrc(jMethodNameToTMethod);
		jMethodNameToTMethod__jMethodName____source.setTrg(jMethodName);
		isApplicableMatch.getAllContextElements().add(
				jMethodNameToTMethod__jMethodName____source);
		jMethodNameToTMethod__tMethod____target.setSrc(jMethodNameToTMethod);
		jMethodNameToTMethod__tMethod____target.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(
				jMethodNameToTMethod__tMethod____target);
		extendedJamoppJavaContainer__jParameterList____extendedParameterList
				.setName(extendedJamoppJavaContainer__jParameterList____extendedParameterList_name_prime);
		extendedJamoppJavaContainer__jMethodName____extendedMethodName
				.setName(extendedJamoppJavaContainer__jMethodName____extendedMethodName_name_prime);
		pg__tMethod____methods.setName(pg__tMethod____methods_name_prime);
		extendedJamoppJavaContainerToPg__extendedJamoppJavaContainer____source
				.setName(extendedJamoppJavaContainerToPg__extendedJamoppJavaContainer____source_name_prime);
		extendedJamoppJavaContainerToPg__pg____target
				.setName(extendedJamoppJavaContainerToPg__pg____target_name_prime);
		tMethodSignature__tParameterList____paramList
				.setName(tMethodSignature__tParameterList____paramList_name_prime);
		jParameterListToTMethodSignature__jParameterList____source
				.setName(jParameterListToTMethodSignature__jParameterList____source_name_prime);
		jParameterListToTMethodSignature__tMethodSignature____target
				.setName(jParameterListToTMethodSignature__tMethodSignature____target_name_prime);
		tMethodSignature__tMethod____method
				.setName(tMethodSignature__tMethod____method_name_prime);
		tMethod__tMethodSignature____signatures
				.setName(tMethod__tMethodSignature____signatures_name_prime);
		tParameterList__tParameter____entries
				.setName(tParameterList__tParameter____entries_name_prime);
		jParameterListToTParameterList__tParameterList____target
				.setName(jParameterListToTParameterList__tParameterList____target_name_prime);
		jParameterListToTParameterList__jParameterList____source
				.setName(jParameterListToTParameterList__jParameterList____source_name_prime);
		jMethodNameToTMethod__jMethodName____source
				.setName(jMethodNameToTMethod__jMethodName____source_name_prime);
		jMethodNameToTMethod__tMethod____target
				.setName(jMethodNameToTMethod__tMethod____target_name_prime);
		return new Object[] {
				extendedJamoppJavaContainer,
				pg,
				extendedJamoppJavaContainerToPg,
				tMethodSignature,
				jParameterListToTMethodSignature,
				jMethodName,
				tMethod,
				tParameter,
				tParameterList,
				jParameterList,
				jParameterListToTParameterList,
				jMethodNameToTMethod,
				isApplicableMatch,
				extendedJamoppJavaContainer__jParameterList____extendedParameterList,
				extendedJamoppJavaContainer__jMethodName____extendedMethodName,
				pg__tMethod____methods,
				extendedJamoppJavaContainerToPg__extendedJamoppJavaContainer____source,
				extendedJamoppJavaContainerToPg__pg____target,
				tMethodSignature__tParameterList____paramList,
				jParameterListToTMethodSignature__jParameterList____source,
				jParameterListToTMethodSignature__tMethodSignature____target,
				tMethodSignature__tMethod____method,
				tMethod__tMethodSignature____signatures,
				tParameterList__tParameter____entries,
				jParameterListToTParameterList__tParameterList____target,
				jParameterListToTParameterList__jParameterList____source,
				jMethodNameToTMethod__jMethodName____source,
				jMethodNameToTMethod__tMethod____target };
	}

	public static final Object[] pattern_ParameterCreateNew_12_4_bindingFBBBBBBBBBBBBBB(
			ParameterCreateNew _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TypeGraph pg,
			ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg,
			TMethodSignature tMethodSignature,
			ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature,
			ExtendedMethodName jMethodName,
			TMethod tMethod,
			TParameter tParameter,
			TParameterList tParameterList,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedMethodNameToTMethod jMethodNameToTMethod) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, extendedJamoppJavaContainer, pg,
				extendedJamoppJavaContainerToPg, tMethodSignature,
				jParameterListToTMethodSignature, jMethodName, tMethod,
				tParameter, tParameterList, jParameterList,
				jParameterListToTParameterList, jMethodNameToTMethod);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					extendedJamoppJavaContainer, pg,
					extendedJamoppJavaContainerToPg, tMethodSignature,
					jParameterListToTMethodSignature, jMethodName, tMethod,
					tParameter, tParameterList, jParameterList,
					jParameterListToTParameterList, jMethodNameToTMethod };
		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterCreateNew_12_4_bindingAndBlackFBBBBBBBBBBBBBB(
			ParameterCreateNew _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TypeGraph pg,
			ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToPg,
			TMethodSignature tMethodSignature,
			ExtendedParameterListToTMethodSignature jParameterListToTMethodSignature,
			ExtendedMethodName jMethodName,
			TMethod tMethod,
			TParameter tParameter,
			TParameterList tParameterList,
			ExtendedParameterList jParameterList,
			ExtendedParameterListToTParameterList jParameterListToTParameterList,
			ExtendedMethodNameToTMethod jMethodNameToTMethod) {
		Object[] result_pattern_ParameterCreateNew_12_4_binding = pattern_ParameterCreateNew_12_4_bindingFBBBBBBBBBBBBBB(
				_this, isApplicableMatch, extendedJamoppJavaContainer, pg,
				extendedJamoppJavaContainerToPg, tMethodSignature,
				jParameterListToTMethodSignature, jMethodName, tMethod,
				tParameter, tParameterList, jParameterList,
				jParameterListToTParameterList, jMethodNameToTMethod);
		if (result_pattern_ParameterCreateNew_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterCreateNew_12_4_binding[0];

			Object[] result_pattern_ParameterCreateNew_12_4_black = pattern_ParameterCreateNew_12_4_blackB(csp);
			if (result_pattern_ParameterCreateNew_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						extendedJamoppJavaContainer, pg,
						extendedJamoppJavaContainerToPg, tMethodSignature,
						jParameterListToTMethodSignature, jMethodName, tMethod,
						tParameter, tParameterList, jParameterList,
						jParameterListToTParameterList, jMethodNameToTMethod };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterCreateNew_12_5_expressionFBB(
			ParameterCreateNew _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterCreateNew_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterCreateNew_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParameterCreateNew";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterCreateNew_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterCreateNew_20_1_bindingFB(
			ParameterCreateNew _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_20_1_blackFBB(
			EClass __eClass, ParameterCreateNew _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_20_1_bindingAndBlackFFB(
			ParameterCreateNew _this) {
		Object[] result_pattern_ParameterCreateNew_20_1_binding = pattern_ParameterCreateNew_20_1_bindingFB(_this);
		if (result_pattern_ParameterCreateNew_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterCreateNew_20_1_binding[0];

			Object[] result_pattern_ParameterCreateNew_20_1_black = pattern_ParameterCreateNew_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParameterCreateNew_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterCreateNew_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParameterCreateNew_20_2_black_nac_0BB(
			TParameter tParameter, TParameterList tParameterList) {
		for (TParameterList __DEC_tParameter_entries_460082 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tParameter, TParameterList.class,
						"entries")) {
			if (!tParameterList.equals(__DEC_tParameter_entries_460082)) {
				return new Object[] { tParameter, tParameterList };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterCreateNew_20_2_blackFFFFFB(
			EMoflonEdge _edge_entries) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTParameterList = _edge_entries.getSrc();
		if (tmpTParameterList instanceof TParameterList) {
			TParameterList tParameterList = (TParameterList) tmpTParameterList;
			EObject tmpTParameter = _edge_entries.getTrg();
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				if (tParameterList.getEntries().contains(tParameter)) {
					if (pattern_ParameterCreateNew_20_2_black_nac_0BB(
							tParameter, tParameterList) == null) {
						for (TMethodSignature tMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tParameterList,
										TMethodSignature.class, "paramList")) {
							TMethod tMethod = tMethodSignature.getMethod();
							if (tMethod != null) {
								for (TypeGraph pg : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(tMethod,
												TypeGraph.class, "methods")) {
									_result.add(new Object[] { pg,
											tMethodSignature, tMethod,
											tParameter, tParameterList,
											_edge_entries });
								}
							}

						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParameterCreateNew_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterCreateNew_20_3_expressionFBBBBBBB(
			ParameterCreateNew _this, Match match, TypeGraph pg,
			TMethodSignature tMethodSignature, TMethod tMethod,
			TParameter tParameter, TParameterList tParameterList) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, pg,
				tMethodSignature, tMethod, tParameter, tParameterList);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterCreateNew_20_4_expressionFBB(
			ParameterCreateNew _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterCreateNew_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParameterCreateNew_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParameterCreateNew_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterCreateNew_21_1_bindingFB(
			ParameterCreateNew _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_21_1_blackFBB(
			EClass __eClass, ParameterCreateNew _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_21_1_bindingAndBlackFFB(
			ParameterCreateNew _this) {
		Object[] result_pattern_ParameterCreateNew_21_1_binding = pattern_ParameterCreateNew_21_1_bindingFB(_this);
		if (result_pattern_ParameterCreateNew_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterCreateNew_21_1_binding[0];

			Object[] result_pattern_ParameterCreateNew_21_1_black = pattern_ParameterCreateNew_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParameterCreateNew_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterCreateNew_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterCreateNew_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParameterCreateNew_21_2_black_nac_0BB(
			ExtendedParameter jParameter, ExtendedParameterList jParameterList) {
		for (ExtendedParameterList __DEC_jParameter_values_160396 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(jParameter,
						ExtendedParameterList.class, "values")) {
			if (!jParameterList.equals(__DEC_jParameter_values_160396)) {
				return new Object[] { jParameter, jParameterList };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterCreateNew_21_2_blackFFFFB(
			EMoflonEdge _edge_values) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJParameterList = _edge_values.getSrc();
		if (tmpJParameterList instanceof ExtendedParameterList) {
			ExtendedParameterList jParameterList = (ExtendedParameterList) tmpJParameterList;
			EObject tmpJParameter = _edge_values.getTrg();
			if (tmpJParameter instanceof ExtendedParameter) {
				ExtendedParameter jParameter = (ExtendedParameter) tmpJParameter;
				if (jParameterList.getValues().contains(jParameter)) {
					if (pattern_ParameterCreateNew_21_2_black_nac_0BB(
							jParameter, jParameterList) == null) {
						for (ExtendedJamoppJavaContainer extendedJamoppJavaContainer : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(jParameterList,
										ExtendedJamoppJavaContainer.class,
										"extendedParameterList")) {
							for (ExtendedMethodName jMethodName : extendedJamoppJavaContainer
									.getExtendedMethodName()) {
								_result.add(new Object[] {
										extendedJamoppJavaContainer,
										jMethodName, jParameter,
										jParameterList, _edge_values });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParameterCreateNew_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterCreateNew_21_3_expressionFBBBBBB(
			ParameterCreateNew _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedMethodName jMethodName, ExtendedParameter jParameter,
			ExtendedParameterList jParameterList) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				extendedJamoppJavaContainer, jMethodName, jParameter,
				jParameterList);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterCreateNew_21_4_expressionFBB(
			ParameterCreateNew _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterCreateNew_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParameterCreateNew_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParameterCreateNew_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParameterCreateNewImpl
