/**
 */
package GravityTGG.Rules.impl;

import ExtendedJamopp.ExtendedClassMethod;
import ExtendedJamopp.ExtendedJamoppFactory;
import ExtendedJamopp.ExtendedParameter;
import ExtendedJamopp.ExtendedType;

import GravityTGG.ExtendedParameterToTParameter;
import GravityTGG.ExtendedParameterToTypeGraph;
import GravityTGG.ExtendedTypeToTClass;
import GravityTGG.GravityTGGFactory;

import GravityTGG.Rules.ParameterTypeLibCreate;
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
import TypeGraphBasic.TMethod;
import TypeGraphBasic.TMethodSignature;
import TypeGraphBasic.TPackage;
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

import org.emftext.language.java.types.Type;
// <-- [user defined imports]
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;

// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Type Lib Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParameterTypeLibCreateImpl extends AbstractRuleImpl implements
		ParameterTypeLibCreate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterTypeLibCreateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getParameterTypeLibCreate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ExtendedParameter jParameter,
			ExtendedType extendedType) {
		// initial bindings
		Object[] result1_black = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_0_1_blackBBBB(this, match,
						jParameter, extendedType);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_0_2_bindingAndBlackFBBBB(this,
						match, jParameter, extendedType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_0_4_blackBBB(match,
							jParameter, extendedType);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_0_4_greenBBBF(match,
							jParameter, extendedType);
			// EMoflonEdge jParameter__extendedType____extendedParameterType = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_0_5_blackBBB(match,
							jParameter, extendedType);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_0_5_greenBB(match,
							jParameter);

			// register objects to match
			ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_0_6_expressionBBBB(this,
							match, jParameter, extendedType);
			return ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_0_7_expressionF();
		} else {
			return ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_1_1_bindingAndBlackFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedParameter jParameter = (ExtendedParameter) result1_bindingAndBlack[0];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[1];
		ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result1_bindingAndBlack[2];
		ExtendedType extendedType = (ExtendedType) result1_bindingAndBlack[3];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[4];
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[5];
		TMethod tMethod = (TMethod) result1_bindingAndBlack[6];
		ExtendedParameterToTypeGraph jParameterToPg = (ExtendedParameterToTypeGraph) result1_bindingAndBlack[7];
		TParameterList tParameterList = (TParameterList) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_1_1_greenBBFFBB(tParameter,
						extendedType, pg, csp);
		TClass tClass = (TClass) result1_green[2];
		ExtendedTypeToTClass extendedTypeToTClass = (ExtendedTypeToTClass) result1_green[3];

		// collect translated elements
		Object[] result2_black = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_1_2_blackBBB(extendedType,
						tClass, extendedTypeToTClass);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_1_2_greenFBBB(extendedType,
						tClass, extendedTypeToTClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_1_3_blackBBBBBBBBBBBB(
						ruleresult, jParameter, tParameter,
						jParameterToTParameter, extendedType, tClass,
						extendedTypeToTClass, pg, tMethodSignature, tMethod,
						jParameterToPg, tParameterList);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_1_3_greenBBBBBBBFFFFF(
						ruleresult, jParameter, tParameter, extendedType,
						tClass, extendedTypeToTClass, pg);
		// EMoflonEdge jParameter__extendedType____extendedParameterType = (EMoflonEdge) result3_green[7];
		// EMoflonEdge tParameter__tClass____tClass = (EMoflonEdge) result3_green[8];
		// EMoflonEdge extendedTypeToTClass__extendedType____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge extendedTypeToTClass__tClass____target = (EMoflonEdge) result3_green[10];
		// EMoflonEdge pg__tClass____classes = (EMoflonEdge) result3_green[11];

		// perform postprocessing story node is empty
		// register objects
		ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_1_5_expressionBBBBBBBBBBBBB(
						this, ruleresult, jParameter, tParameter,
						jParameterToTParameter, extendedType, tClass,
						extendedTypeToTClass, pg, tMethodSignature, tMethod,
						jParameterToPg, tParameterList);
		return ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_2_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		ExtendedParameter jParameter = (ExtendedParameter) result2_binding[0];
		ExtendedType extendedType = (ExtendedType) result2_binding[1];
		for (Object[] result2_black : ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_2_2_blackBFFBFFB(jParameter,
						extendedType, match)) {
			TParameter tParameter = (TParameter) result2_black[1];
			ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result2_black[2];
			TypeGraph pg = (TypeGraph) result2_black[4];
			ExtendedParameterToTypeGraph jParameterToPg = (ExtendedParameterToTypeGraph) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_2_3_blackBBBBBFFBF(
							jParameter, tParameter, jParameterToTParameter,
							extendedType, pg, jParameterToPg)) {
				TMethodSignature tMethodSignature = (TMethodSignature) result3_black[5];
				TMethod tMethod = (TMethod) result3_black[6];
				TParameterList tParameterList = (TParameterList) result3_black[8];
				Object[] result3_green = ParameterTypeLibCreateImpl
						.pattern_ParameterTypeLibCreate_2_3_greenBBBBBBBBBFFFFFFFFFFF(
								jParameter, tParameter, jParameterToTParameter,
								extendedType, pg, tMethodSignature, tMethod,
								jParameterToPg, tParameterList);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge jParameter__extendedType____extendedParameterType = (EMoflonEdge) result3_green[10];
				// EMoflonEdge jParameterToTParameter__tParameter____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge jParameterToTParameter__jParameter____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge pg__tMethod____methods = (EMoflonEdge) result3_green[13];
				// EMoflonEdge tMethodSignature__tParameterList____paramList = (EMoflonEdge) result3_green[14];
				// EMoflonEdge tMethodSignature__tMethod____method = (EMoflonEdge) result3_green[15];
				// EMoflonEdge tMethod__tMethodSignature____signatures = (EMoflonEdge) result3_green[16];
				// EMoflonEdge jParameterToPg__jParameter____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge jParameterToPg__pg____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge tParameterList__tParameter____entries = (EMoflonEdge) result3_green[19];

				// solve CSP
				Object[] result4_bindingAndBlack = ParameterTypeLibCreateImpl
						.pattern_ParameterTypeLibCreate_2_4_bindingAndBlackFBBBBBBBBBBB(
								this, isApplicableMatch, jParameter,
								tParameter, jParameterToTParameter,
								extendedType, pg, tMethodSignature, tMethod,
								jParameterToPg, tParameterList);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParameterTypeLibCreateImpl
						.pattern_ParameterTypeLibCreate_2_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = ParameterTypeLibCreateImpl
							.pattern_ParameterTypeLibCreate_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ParameterTypeLibCreateImpl
							.pattern_ParameterTypeLibCreate_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			ExtendedParameter jParameter, ExtendedType extendedType) {
		match.registerObject("jParameter", jParameter);
		match.registerObject("extendedType", extendedType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			ExtendedParameter jParameter, ExtendedType extendedType) {// Create CSP
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
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			ExtendedType extendedType, TypeGraph pg,
			TMethodSignature tMethodSignature, TMethod tMethod,
			ExtendedParameterToTypeGraph jParameterToPg,
			TParameterList tParameterList) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_extendedType_typeName = CSPFactoryHelper.eINSTANCE
				.createVariable("extendedType.typeName", true, csp);
		var_extendedType_typeName.setValue(extendedType.getTypeName());
		var_extendedType_typeName.setType("String");

		// Create unbound variables
		Variable var_tClass_tName = CSPFactoryHelper.eINSTANCE.createVariable(
				"tClass.tName", csp);
		var_tClass_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_extendedType_typeName, var_tClass_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jParameter", jParameter);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("jParameterToTParameter",
				jParameterToTParameter);
		isApplicableMatch.registerObject("extendedType", extendedType);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("tMethod", tMethod);
		isApplicableMatch.registerObject("jParameterToPg", jParameterToPg);
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
			EObject jParameter, EObject tParameter,
			EObject jParameterToTParameter, EObject extendedType,
			EObject tClass, EObject extendedTypeToTClass, EObject pg,
			EObject tMethodSignature, EObject tMethod, EObject jParameterToPg,
			EObject tParameterList) {
		ruleresult.registerObject("jParameter", jParameter);
		ruleresult.registerObject("tParameter", tParameter);
		ruleresult.registerObject("jParameterToTParameter",
				jParameterToTParameter);
		ruleresult.registerObject("extendedType", extendedType);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("extendedTypeToTClass", extendedTypeToTClass);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("tMethod", tMethod);
		ruleresult.registerObject("jParameterToPg", jParameterToPg);
		ruleresult.registerObject("tParameterList", tParameterList);

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
	public boolean isAppropriate_BWD(Match match, TParameter tParameter,
			TClass tClass, TypeGraph pg, TMethodSignature tMethodSignature,
			TMethod tMethod, TParameterList tParameterList) {
		// initial bindings
		Object[] result1_black = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_10_1_blackBBBBBBBB(this, match,
						tParameter, tClass, pg, tMethodSignature, tMethod,
						tParameterList);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_10_2_bindingAndBlackFBBBBBBBB(
						this, match, tParameter, tClass, pg, tMethodSignature,
						tMethod, tParameterList);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_10_4_blackBBBBBBB(match,
							tParameter, tClass, pg, tMethodSignature, tMethod,
							tParameterList);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_10_4_greenBBBBFF(match,
							tParameter, tClass, pg);
			// EMoflonEdge tParameter__tClass____tClass = (EMoflonEdge) result4_green[4];
			// EMoflonEdge pg__tClass____classes = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_10_5_blackBBBBBBB(match,
							tParameter, tClass, pg, tMethodSignature, tMethod,
							tParameterList);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_10_5_greenBBBBBBFFFFF(
							match, tParameter, pg, tMethodSignature, tMethod,
							tParameterList);
			// EMoflonEdge pg__tMethod____methods = (EMoflonEdge) result5_green[6];
			// EMoflonEdge tMethodSignature__tParameterList____paramList = (EMoflonEdge) result5_green[7];
			// EMoflonEdge tMethodSignature__tMethod____method = (EMoflonEdge) result5_green[8];
			// EMoflonEdge tMethod__tMethodSignature____signatures = (EMoflonEdge) result5_green[9];
			// EMoflonEdge tParameterList__tParameter____entries = (EMoflonEdge) result5_green[10];

			// register objects to match
			ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_10_6_expressionBBBBBBBB(
							this, match, tParameter, tClass, pg,
							tMethodSignature, tMethod, tParameterList);
			return ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_10_7_expressionF();
		} else {
			return ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_11_1_bindingAndBlackFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedParameter jParameter = (ExtendedParameter) result1_bindingAndBlack[0];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[1];
		ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result1_bindingAndBlack[2];
		TClass tClass = (TClass) result1_bindingAndBlack[3];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[4];
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[5];
		TMethod tMethod = (TMethod) result1_bindingAndBlack[6];
		ExtendedParameterToTypeGraph jParameterToPg = (ExtendedParameterToTypeGraph) result1_bindingAndBlack[7];
		TParameterList tParameterList = (TParameterList) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_11_1_greenBFBFB(jParameter,
						tClass, csp);
		ExtendedType extendedType = (ExtendedType) result1_green[1];
		ExtendedTypeToTClass extendedTypeToTClass = (ExtendedTypeToTClass) result1_green[3];

		// collect translated elements
		Object[] result2_black = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_11_2_blackBBB(extendedType,
						tClass, extendedTypeToTClass);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_11_2_greenFBBB(extendedType,
						tClass, extendedTypeToTClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_11_3_blackBBBBBBBBBBBB(
						ruleresult, jParameter, tParameter,
						jParameterToTParameter, extendedType, tClass,
						extendedTypeToTClass, pg, tMethodSignature, tMethod,
						jParameterToPg, tParameterList);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_11_3_greenBBBBBBBFFFFF(
						ruleresult, jParameter, tParameter, extendedType,
						tClass, extendedTypeToTClass, pg);
		// EMoflonEdge jParameter__extendedType____extendedParameterType = (EMoflonEdge) result3_green[7];
		// EMoflonEdge tParameter__tClass____tClass = (EMoflonEdge) result3_green[8];
		// EMoflonEdge extendedTypeToTClass__extendedType____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge extendedTypeToTClass__tClass____target = (EMoflonEdge) result3_green[10];
		// EMoflonEdge pg__tClass____classes = (EMoflonEdge) result3_green[11];

		// perform postprocessing story node is empty
		// register objects
		ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_11_5_expressionBBBBBBBBBBBBB(
						this, ruleresult, jParameter, tParameter,
						jParameterToTParameter, extendedType, tClass,
						extendedTypeToTClass, pg, tMethodSignature, tMethod,
						jParameterToPg, tParameterList);
		return ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_12_2_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		TParameter tParameter = (TParameter) result2_binding[0];
		TClass tClass = (TClass) result2_binding[1];
		TypeGraph pg = (TypeGraph) result2_binding[2];
		TMethodSignature tMethodSignature = (TMethodSignature) result2_binding[3];
		TMethod tMethod = (TMethod) result2_binding[4];
		TParameterList tParameterList = (TParameterList) result2_binding[5];
		for (Object[] result2_black : ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_12_2_blackFBFBBBBFBB(
						tParameter, tClass, pg, tMethodSignature, tMethod,
						tParameterList, match)) {
			ExtendedParameter jParameter = (ExtendedParameter) result2_black[0];
			ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result2_black[2];
			ExtendedParameterToTypeGraph jParameterToPg = (ExtendedParameterToTypeGraph) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_12_3_blackBBBBBBBBB(
							jParameter, tParameter, jParameterToTParameter,
							tClass, pg, tMethodSignature, tMethod,
							jParameterToPg, tParameterList)) {
				Object[] result3_green = ParameterTypeLibCreateImpl
						.pattern_ParameterTypeLibCreate_12_3_greenBBBBBBBBBFFFFFFFFFFFF(
								jParameter, tParameter, jParameterToTParameter,
								tClass, pg, tMethodSignature, tMethod,
								jParameterToPg, tParameterList);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge tParameter__tClass____tClass = (EMoflonEdge) result3_green[10];
				// EMoflonEdge jParameterToTParameter__tParameter____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge jParameterToTParameter__jParameter____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge pg__tMethod____methods = (EMoflonEdge) result3_green[13];
				// EMoflonEdge pg__tClass____classes = (EMoflonEdge) result3_green[14];
				// EMoflonEdge tMethodSignature__tParameterList____paramList = (EMoflonEdge) result3_green[15];
				// EMoflonEdge tMethodSignature__tMethod____method = (EMoflonEdge) result3_green[16];
				// EMoflonEdge tMethod__tMethodSignature____signatures = (EMoflonEdge) result3_green[17];
				// EMoflonEdge jParameterToPg__jParameter____source = (EMoflonEdge) result3_green[18];
				// EMoflonEdge jParameterToPg__pg____target = (EMoflonEdge) result3_green[19];
				// EMoflonEdge tParameterList__tParameter____entries = (EMoflonEdge) result3_green[20];

				// solve CSP
				Object[] result4_bindingAndBlack = ParameterTypeLibCreateImpl
						.pattern_ParameterTypeLibCreate_12_4_bindingAndBlackFBBBBBBBBBBB(
								this, isApplicableMatch, jParameter,
								tParameter, jParameterToTParameter, tClass, pg,
								tMethodSignature, tMethod, jParameterToPg,
								tParameterList);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParameterTypeLibCreateImpl
						.pattern_ParameterTypeLibCreate_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ParameterTypeLibCreateImpl
							.pattern_ParameterTypeLibCreate_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ParameterTypeLibCreateImpl
							.pattern_ParameterTypeLibCreate_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TParameter tParameter,
			TClass tClass, TypeGraph pg, TMethodSignature tMethodSignature,
			TMethod tMethod, TParameterList tParameterList) {
		match.registerObject("tParameter", tParameter);
		match.registerObject("tClass", tClass);
		match.registerObject("pg", pg);
		match.registerObject("tMethodSignature", tMethodSignature);
		match.registerObject("tMethod", tMethod);
		match.registerObject("tParameterList", tParameterList);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TParameter tParameter,
			TClass tClass, TypeGraph pg, TMethodSignature tMethodSignature,
			TMethod tMethod, TParameterList tParameterList) {// Create CSP
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
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			TClass tClass, TypeGraph pg, TMethodSignature tMethodSignature,
			TMethod tMethod, ExtendedParameterToTypeGraph jParameterToPg,
			TParameterList tParameterList) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tClass_tName = CSPFactoryHelper.eINSTANCE.createVariable(
				"tClass.tName", true, csp);
		var_tClass_tName.setValue(tClass.getTName());
		var_tClass_tName.setType("String");

		// Create unbound variables
		Variable var_extendedType_typeName = CSPFactoryHelper.eINSTANCE
				.createVariable("extendedType.typeName", csp);
		var_extendedType_typeName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_extendedType_typeName, var_tClass_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jParameter", jParameter);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("jParameterToTParameter",
				jParameterToTParameter);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("tMethod", tMethod);
		isApplicableMatch.registerObject("jParameterToPg", jParameterToPg);
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
			EObject jParameter, EObject tParameter,
			EObject jParameterToTParameter, EObject extendedType,
			EObject tClass, EObject extendedTypeToTClass, EObject pg,
			EObject tMethodSignature, EObject tMethod, EObject jParameterToPg,
			EObject tParameterList) {
		ruleresult.registerObject("jParameter", jParameter);
		ruleresult.registerObject("tParameter", tParameter);
		ruleresult.registerObject("jParameterToTParameter",
				jParameterToTParameter);
		ruleresult.registerObject("extendedType", extendedType);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("extendedTypeToTClass", extendedTypeToTClass);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("tMethod", tMethod);
		ruleresult.registerObject("jParameterToPg", jParameterToPg);
		ruleresult.registerObject("tParameterList", tParameterList);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_3(
			EMoflonEdge _edge_extendedParameterType) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_20_2_blackFFB(_edge_extendedParameterType)) {
			ExtendedParameter jParameter = (ExtendedParameter) result2_black[0];
			ExtendedType extendedType = (ExtendedType) result2_black[1];
			Object[] result2_green = ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_20_3_expressionFBBBB(this,
							match, jParameter, extendedType)) {
				// Ensure that the correct types of elements are matched
				if (ParameterTypeLibCreateImpl
						.pattern_ParameterTypeLibCreate_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParameterTypeLibCreateImpl
							.pattern_ParameterTypeLibCreate_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParameterTypeLibCreateImpl
							.pattern_ParameterTypeLibCreate_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_3(
			EMoflonEdge _edge_tClass) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_21_2_blackFFFFFFB(_edge_tClass)) {
			TParameter tParameter = (TParameter) result2_black[0];
			TClass tClass = (TClass) result2_black[1];
			TypeGraph pg = (TypeGraph) result2_black[2];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[3];
			TMethod tMethod = (TMethod) result2_black[4];
			TParameterList tParameterList = (TParameterList) result2_black[5];
			Object[] result2_green = ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_21_3_expressionFBBBBBBBB(
							this, match, tParameter, tClass, pg,
							tMethodSignature, tMethod, tParameterList)) {
				// Ensure that the correct types of elements are matched
				if (ParameterTypeLibCreateImpl
						.pattern_ParameterTypeLibCreate_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParameterTypeLibCreateImpl
							.pattern_ParameterTypeLibCreate_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParameterTypeLibCreateImpl
							.pattern_ParameterTypeLibCreate_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_4(
			EMoflonEdge _edge_classes) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_22_2_blackFFFFFFB(_edge_classes)) {
			TParameter tParameter = (TParameter) result2_black[0];
			TClass tClass = (TClass) result2_black[1];
			TypeGraph pg = (TypeGraph) result2_black[2];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[3];
			TMethod tMethod = (TMethod) result2_black[4];
			TParameterList tParameterList = (TParameterList) result2_black[5];
			Object[] result2_green = ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParameterTypeLibCreateImpl
					.pattern_ParameterTypeLibCreate_22_3_expressionFBBBBBBBB(
							this, match, tParameter, tClass, pg,
							tMethodSignature, tMethod, tParameterList)) {
				// Ensure that the correct types of elements are matched
				if (ParameterTypeLibCreateImpl
						.pattern_ParameterTypeLibCreate_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParameterTypeLibCreateImpl
							.pattern_ParameterTypeLibCreate_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ParameterTypeLibCreateImpl
							.pattern_ParameterTypeLibCreate_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParameterTypeLibCreateImpl
				.pattern_ParameterTypeLibCreate_22_6_expressionFB(__result);
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
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___IS_APPROPRIATE_FWD__MATCH_EXTENDEDPARAMETER_EXTENDEDTYPE:
			return isAppropriate_FWD((Match) arguments.get(0),
					(ExtendedParameter) arguments.get(1),
					(ExtendedType) arguments.get(2));
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDPARAMETER_EXTENDEDTYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(ExtendedParameter) arguments.get(1),
					(ExtendedType) arguments.get(2));
			return null;
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDPARAMETER_EXTENDEDTYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(ExtendedParameter) arguments.get(1),
					(ExtendedType) arguments.get(2));
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDPARAMETER_TPARAMETER_EXTENDEDPARAMETERTOTPARAMETER_EXTENDEDTYPE_TYPEGRAPH_TMETHODSIGNATURE_TMETHOD_EXTENDEDPARAMETERTOTYPEGRAPH_TPARAMETERLIST:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedParameter) arguments.get(1),
					(TParameter) arguments.get(2),
					(ExtendedParameterToTParameter) arguments.get(3),
					(ExtendedType) arguments.get(4),
					(TypeGraph) arguments.get(5),
					(TMethodSignature) arguments.get(6),
					(TMethod) arguments.get(7),
					(ExtendedParameterToTypeGraph) arguments.get(8),
					(TParameterList) arguments.get(9));
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___IS_APPROPRIATE_BWD__MATCH_TPARAMETER_TCLASS_TYPEGRAPH_TMETHODSIGNATURE_TMETHOD_TPARAMETERLIST:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TParameter) arguments.get(1), (TClass) arguments.get(2),
					(TypeGraph) arguments.get(3),
					(TMethodSignature) arguments.get(4),
					(TMethod) arguments.get(5),
					(TParameterList) arguments.get(6));
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPARAMETER_TCLASS_TYPEGRAPH_TMETHODSIGNATURE_TMETHOD_TPARAMETERLIST:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TParameter) arguments.get(1), (TClass) arguments.get(2),
					(TypeGraph) arguments.get(3),
					(TMethodSignature) arguments.get(4),
					(TMethod) arguments.get(5),
					(TParameterList) arguments.get(6));
			return null;
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPARAMETER_TCLASS_TYPEGRAPH_TMETHODSIGNATURE_TMETHOD_TPARAMETERLIST:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TParameter) arguments.get(1), (TClass) arguments.get(2),
					(TypeGraph) arguments.get(3),
					(TMethodSignature) arguments.get(4),
					(TMethod) arguments.get(5),
					(TParameterList) arguments.get(6));
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXTENDEDPARAMETER_TPARAMETER_EXTENDEDPARAMETERTOTPARAMETER_TCLASS_TYPEGRAPH_TMETHODSIGNATURE_TMETHOD_EXTENDEDPARAMETERTOTYPEGRAPH_TPARAMETERLIST:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedParameter) arguments.get(1),
					(TParameter) arguments.get(2),
					(ExtendedParameterToTParameter) arguments.get(3),
					(TClass) arguments.get(4), (TypeGraph) arguments.get(5),
					(TMethodSignature) arguments.get(6),
					(TMethod) arguments.get(7),
					(ExtendedParameterToTypeGraph) arguments.get(8),
					(TParameterList) arguments.get(9));
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_3__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_3((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_3__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_3((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_4((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ParameterTypeLibCreate_0_1_blackBBBB(
			ParameterTypeLibCreate _this, Match match,
			ExtendedParameter jParameter, ExtendedType extendedType) {
		return new Object[] { _this, match, jParameter, extendedType };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_0_2_bindingFBBBB(
			ParameterTypeLibCreate _this, Match match,
			ExtendedParameter jParameter, ExtendedType extendedType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				jParameter, extendedType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jParameter, extendedType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_0_2_bindingAndBlackFBBBB(
			ParameterTypeLibCreate _this, Match match,
			ExtendedParameter jParameter, ExtendedType extendedType) {
		Object[] result_pattern_ParameterTypeLibCreate_0_2_binding = pattern_ParameterTypeLibCreate_0_2_bindingFBBBB(
				_this, match, jParameter, extendedType);
		if (result_pattern_ParameterTypeLibCreate_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterTypeLibCreate_0_2_binding[0];

			Object[] result_pattern_ParameterTypeLibCreate_0_2_black = pattern_ParameterTypeLibCreate_0_2_blackB(csp);
			if (result_pattern_ParameterTypeLibCreate_0_2_black != null) {

				return new Object[] { csp, _this, match, jParameter,
						extendedType };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterTypeLibCreate_0_3_expressionFBB(
			ParameterTypeLibCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_0_4_blackBBB(
			Match match, ExtendedParameter jParameter, ExtendedType extendedType) {
		return new Object[] { match, jParameter, extendedType };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_0_4_greenBBBF(
			Match match, ExtendedParameter jParameter, ExtendedType extendedType) {
		EMoflonEdge jParameter__extendedType____extendedParameterType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(extendedType);
		String jParameter__extendedType____extendedParameterType_name_prime = "extendedParameterType";
		jParameter__extendedType____extendedParameterType.setSrc(jParameter);
		jParameter__extendedType____extendedParameterType.setTrg(extendedType);
		match.getToBeTranslatedEdges().add(
				jParameter__extendedType____extendedParameterType);
		jParameter__extendedType____extendedParameterType
				.setName(jParameter__extendedType____extendedParameterType_name_prime);
		return new Object[] { match, jParameter, extendedType,
				jParameter__extendedType____extendedParameterType };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_0_5_blackBBB(
			Match match, ExtendedParameter jParameter, ExtendedType extendedType) {
		return new Object[] { match, jParameter, extendedType };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_0_5_greenBB(
			Match match, ExtendedParameter jParameter) {
		match.getContextNodes().add(jParameter);
		return new Object[] { match, jParameter };
	}

	public static final void pattern_ParameterTypeLibCreate_0_6_expressionBBBB(
			ParameterTypeLibCreate _this, Match match,
			ExtendedParameter jParameter, ExtendedType extendedType) {
		_this.registerObjectsToMatch_FWD(match, jParameter, extendedType);

	}

	public static final boolean pattern_ParameterTypeLibCreate_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterTypeLibCreate_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_1_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jParameter");
		EObject _localVariable_1 = isApplicableMatch.getObject("tParameter");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("jParameterToTParameter");
		EObject _localVariable_3 = isApplicableMatch.getObject("extendedType");
		EObject _localVariable_4 = isApplicableMatch.getObject("pg");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("tMethodSignature");
		EObject _localVariable_6 = isApplicableMatch.getObject("tMethod");
		EObject _localVariable_7 = isApplicableMatch
				.getObject("jParameterToPg");
		EObject _localVariable_8 = isApplicableMatch
				.getObject("tParameterList");
		EObject tmpJParameter = _localVariable_0;
		EObject tmpTParameter = _localVariable_1;
		EObject tmpJParameterToTParameter = _localVariable_2;
		EObject tmpExtendedType = _localVariable_3;
		EObject tmpPg = _localVariable_4;
		EObject tmpTMethodSignature = _localVariable_5;
		EObject tmpTMethod = _localVariable_6;
		EObject tmpJParameterToPg = _localVariable_7;
		EObject tmpTParameterList = _localVariable_8;
		if (tmpJParameter instanceof ExtendedParameter) {
			ExtendedParameter jParameter = (ExtendedParameter) tmpJParameter;
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				if (tmpJParameterToTParameter instanceof ExtendedParameterToTParameter) {
					ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) tmpJParameterToTParameter;
					if (tmpExtendedType instanceof ExtendedType) {
						ExtendedType extendedType = (ExtendedType) tmpExtendedType;
						if (tmpPg instanceof TypeGraph) {
							TypeGraph pg = (TypeGraph) tmpPg;
							if (tmpTMethodSignature instanceof TMethodSignature) {
								TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
								if (tmpTMethod instanceof TMethod) {
									TMethod tMethod = (TMethod) tmpTMethod;
									if (tmpJParameterToPg instanceof ExtendedParameterToTypeGraph) {
										ExtendedParameterToTypeGraph jParameterToPg = (ExtendedParameterToTypeGraph) tmpJParameterToPg;
										if (tmpTParameterList instanceof TParameterList) {
											TParameterList tParameterList = (TParameterList) tmpTParameterList;
											return new Object[] { jParameter,
													tParameter,
													jParameterToTParameter,
													extendedType, pg,
													tMethodSignature, tMethod,
													jParameterToPg,
													tParameterList,
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

	public static final Object[] pattern_ParameterTypeLibCreate_1_1_blackBBBBBBBBBFBB(
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			ExtendedType extendedType, TypeGraph pg,
			TMethodSignature tMethodSignature, TMethod tMethod,
			ExtendedParameterToTypeGraph jParameterToPg,
			TParameterList tParameterList, ParameterTypeLibCreate _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jParameter, tParameter,
						jParameterToTParameter, extendedType, pg,
						tMethodSignature, tMethod, jParameterToPg,
						tParameterList, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_1_1_bindingAndBlackFFFFFFFFFFBB(
			ParameterTypeLibCreate _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParameterTypeLibCreate_1_1_binding = pattern_ParameterTypeLibCreate_1_1_bindingFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ParameterTypeLibCreate_1_1_binding != null) {
			ExtendedParameter jParameter = (ExtendedParameter) result_pattern_ParameterTypeLibCreate_1_1_binding[0];
			TParameter tParameter = (TParameter) result_pattern_ParameterTypeLibCreate_1_1_binding[1];
			ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result_pattern_ParameterTypeLibCreate_1_1_binding[2];
			ExtendedType extendedType = (ExtendedType) result_pattern_ParameterTypeLibCreate_1_1_binding[3];
			TypeGraph pg = (TypeGraph) result_pattern_ParameterTypeLibCreate_1_1_binding[4];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_ParameterTypeLibCreate_1_1_binding[5];
			TMethod tMethod = (TMethod) result_pattern_ParameterTypeLibCreate_1_1_binding[6];
			ExtendedParameterToTypeGraph jParameterToPg = (ExtendedParameterToTypeGraph) result_pattern_ParameterTypeLibCreate_1_1_binding[7];
			TParameterList tParameterList = (TParameterList) result_pattern_ParameterTypeLibCreate_1_1_binding[8];

			Object[] result_pattern_ParameterTypeLibCreate_1_1_black = pattern_ParameterTypeLibCreate_1_1_blackBBBBBBBBBFBB(
					jParameter, tParameter, jParameterToTParameter,
					extendedType, pg, tMethodSignature, tMethod,
					jParameterToPg, tParameterList, _this, isApplicableMatch);
			if (result_pattern_ParameterTypeLibCreate_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ParameterTypeLibCreate_1_1_black[9];

				return new Object[] { jParameter, tParameter,
						jParameterToTParameter, extendedType, pg,
						tMethodSignature, tMethod, jParameterToPg,
						tParameterList, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_1_1_greenBBFFBB(
			TParameter tParameter, ExtendedType extendedType, TypeGraph pg,
			CSP csp) {
		TClass tClass = TypeGraphBasicFactory.eINSTANCE.createTClass();
		ExtendedTypeToTClass extendedTypeToTClass = GravityTGGFactory.eINSTANCE
				.createExtendedTypeToTClass();
		Object _localVariable_0 = csp.getValue("tClass", "tName");
		tParameter.setTClass(tClass);
		pg.getClasses().add(tClass);
		extendedTypeToTClass.setSource(extendedType);
		extendedTypeToTClass.setTarget(tClass);
		String tClass_tName_prime = (String) _localVariable_0;
		tClass.setTName(tClass_tName_prime);
		return new Object[] { tParameter, extendedType, tClass,
				extendedTypeToTClass, pg, csp };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_1_2_blackBBB(
			ExtendedType extendedType, TClass tClass,
			ExtendedTypeToTClass extendedTypeToTClass) {
		return new Object[] { extendedType, tClass, extendedTypeToTClass };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_1_2_greenFBBB(
			ExtendedType extendedType, TClass tClass,
			ExtendedTypeToTClass extendedTypeToTClass) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(extendedType);
		ruleresult.getCreatedElements().add(tClass);
		ruleresult.getCreatedLinkElements().add(extendedTypeToTClass);
		return new Object[] { ruleresult, extendedType, tClass,
				extendedTypeToTClass };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_1_3_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject jParameter,
			EObject tParameter, EObject jParameterToTParameter,
			EObject extendedType, EObject tClass, EObject extendedTypeToTClass,
			EObject pg, EObject tMethodSignature, EObject tMethod,
			EObject jParameterToPg, EObject tParameterList) {
		if (!jParameter.equals(tParameter)) {
			if (!jParameter.equals(jParameterToTParameter)) {
				if (!jParameter.equals(tClass)) {
					if (!jParameter.equals(pg)) {
						if (!jParameter.equals(tMethodSignature)) {
							if (!jParameter.equals(tMethod)) {
								if (!jParameter.equals(jParameterToPg)) {
									if (!jParameter.equals(tParameterList)) {
										if (!tParameter.equals(tParameterList)) {
											if (!jParameterToTParameter
													.equals(tParameter)) {
												if (!jParameterToTParameter
														.equals(tClass)) {
													if (!jParameterToTParameter
															.equals(pg)) {
														if (!jParameterToTParameter
																.equals(tMethodSignature)) {
															if (!jParameterToTParameter
																	.equals(tMethod)) {
																if (!jParameterToTParameter
																		.equals(tParameterList)) {
																	if (!extendedType
																			.equals(jParameter)) {
																		if (!extendedType
																				.equals(tParameter)) {
																			if (!extendedType
																					.equals(jParameterToTParameter)) {
																				if (!extendedType
																						.equals(tClass)) {
																					if (!extendedType
																							.equals(extendedTypeToTClass)) {
																						if (!extendedType
																								.equals(pg)) {
																							if (!extendedType
																									.equals(tMethodSignature)) {
																								if (!extendedType
																										.equals(tMethod)) {
																									if (!extendedType
																											.equals(jParameterToPg)) {
																										if (!extendedType
																												.equals(tParameterList)) {
																											if (!tClass
																													.equals(tParameter)) {
																												if (!tClass
																														.equals(tMethodSignature)) {
																													if (!tClass
																															.equals(tMethod)) {
																														if (!tClass
																																.equals(tParameterList)) {
																															if (!extendedTypeToTClass
																																	.equals(jParameter)) {
																																if (!extendedTypeToTClass
																																		.equals(tParameter)) {
																																	if (!extendedTypeToTClass
																																			.equals(jParameterToTParameter)) {
																																		if (!extendedTypeToTClass
																																				.equals(tClass)) {
																																			if (!extendedTypeToTClass
																																					.equals(pg)) {
																																				if (!extendedTypeToTClass
																																						.equals(tMethodSignature)) {
																																					if (!extendedTypeToTClass
																																							.equals(tMethod)) {
																																						if (!extendedTypeToTClass
																																								.equals(jParameterToPg)) {
																																							if (!extendedTypeToTClass
																																									.equals(tParameterList)) {
																																								if (!pg.equals(tParameter)) {
																																									if (!pg.equals(tClass)) {
																																										if (!pg.equals(tMethodSignature)) {
																																											if (!pg.equals(tMethod)) {
																																												if (!pg.equals(tParameterList)) {
																																													if (!tMethodSignature
																																															.equals(tParameter)) {
																																														if (!tMethodSignature
																																																.equals(tParameterList)) {
																																															if (!tMethod
																																																	.equals(tParameter)) {
																																																if (!tMethod
																																																		.equals(tMethodSignature)) {
																																																	if (!tMethod
																																																			.equals(tParameterList)) {
																																																		if (!jParameterToPg
																																																				.equals(tParameter)) {
																																																			if (!jParameterToPg
																																																					.equals(jParameterToTParameter)) {
																																																				if (!jParameterToPg
																																																						.equals(tClass)) {
																																																					if (!jParameterToPg
																																																							.equals(pg)) {
																																																						if (!jParameterToPg
																																																								.equals(tMethodSignature)) {
																																																							if (!jParameterToPg
																																																									.equals(tMethod)) {
																																																								if (!jParameterToPg
																																																										.equals(tParameterList)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											jParameter,
																																																											tParameter,
																																																											jParameterToTParameter,
																																																											extendedType,
																																																											tClass,
																																																											extendedTypeToTClass,
																																																											pg,
																																																											tMethodSignature,
																																																											tMethod,
																																																											jParameterToPg,
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
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterTypeLibCreate_1_3_greenBBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject jParameter,
			EObject tParameter, EObject extendedType, EObject tClass,
			EObject extendedTypeToTClass, EObject pg) {
		EMoflonEdge jParameter__extendedType____extendedParameterType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tParameter__tClass____tClass = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedTypeToTClass__extendedType____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedTypeToTClass__tClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParameterTypeLibCreate";
		String jParameter__extendedType____extendedParameterType_name_prime = "extendedParameterType";
		String tParameter__tClass____tClass_name_prime = "tClass";
		String extendedTypeToTClass__extendedType____source_name_prime = "source";
		String extendedTypeToTClass__tClass____target_name_prime = "target";
		String pg__tClass____classes_name_prime = "classes";
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
		pg__tClass____classes.setSrc(pg);
		pg__tClass____classes.setTrg(tClass);
		ruleresult.getCreatedEdges().add(pg__tClass____classes);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jParameter__extendedType____extendedParameterType
				.setName(jParameter__extendedType____extendedParameterType_name_prime);
		tParameter__tClass____tClass
				.setName(tParameter__tClass____tClass_name_prime);
		extendedTypeToTClass__extendedType____source
				.setName(extendedTypeToTClass__extendedType____source_name_prime);
		extendedTypeToTClass__tClass____target
				.setName(extendedTypeToTClass__tClass____target_name_prime);
		pg__tClass____classes.setName(pg__tClass____classes_name_prime);
		return new Object[] { ruleresult, jParameter, tParameter, extendedType,
				tClass, extendedTypeToTClass, pg,
				jParameter__extendedType____extendedParameterType,
				tParameter__tClass____tClass,
				extendedTypeToTClass__extendedType____source,
				extendedTypeToTClass__tClass____target, pg__tClass____classes };
	}

	public static final void pattern_ParameterTypeLibCreate_1_5_expressionBBBBBBBBBBBBB(
			ParameterTypeLibCreate _this, PerformRuleResult ruleresult,
			EObject jParameter, EObject tParameter,
			EObject jParameterToTParameter, EObject extendedType,
			EObject tClass, EObject extendedTypeToTClass, EObject pg,
			EObject tMethodSignature, EObject tMethod, EObject jParameterToPg,
			EObject tParameterList) {
		_this.registerObjects_FWD(ruleresult, jParameter, tParameter,
				jParameterToTParameter, extendedType, tClass,
				extendedTypeToTClass, pg, tMethodSignature, tMethod,
				jParameterToPg, tParameterList);

	}

	public static final PerformRuleResult pattern_ParameterTypeLibCreate_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_2_1_bindingFB(
			ParameterTypeLibCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_2_1_blackFBB(
			EClass eClass, ParameterTypeLibCreate _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_2_1_bindingAndBlackFFB(
			ParameterTypeLibCreate _this) {
		Object[] result_pattern_ParameterTypeLibCreate_2_1_binding = pattern_ParameterTypeLibCreate_2_1_bindingFB(_this);
		if (result_pattern_ParameterTypeLibCreate_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParameterTypeLibCreate_2_1_binding[0];

			Object[] result_pattern_ParameterTypeLibCreate_2_1_black = pattern_ParameterTypeLibCreate_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParameterTypeLibCreate_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParameterTypeLibCreate_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParameterTypeLibCreate";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_2_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("jParameter");
		EObject _localVariable_1 = match.getObject("extendedType");
		EObject tmpJParameter = _localVariable_0;
		EObject tmpExtendedType = _localVariable_1;
		if (tmpJParameter instanceof ExtendedParameter) {
			ExtendedParameter jParameter = (ExtendedParameter) tmpJParameter;
			if (tmpExtendedType instanceof ExtendedType) {
				ExtendedType extendedType = (ExtendedType) tmpExtendedType;
				return new Object[] { jParameter, extendedType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterTypeLibCreate_2_2_blackBFFBFFB(
			ExtendedParameter jParameter, ExtendedType extendedType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		boolean extendedTypeisFromLib = extendedType.isIsFromLib();
		if (Boolean.valueOf(extendedTypeisFromLib)
				.equals(Boolean.valueOf(true))) {
			for (ExtendedParameterToTParameter jParameterToTParameter : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(jParameter,
							ExtendedParameterToTParameter.class, "source")) {
				TParameter tParameter = jParameterToTParameter.getTarget();
				if (tParameter != null) {
					for (ExtendedParameterToTypeGraph jParameterToPg : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(jParameter,
									ExtendedParameterToTypeGraph.class,
									"source")) {
						TypeGraph pg = jParameterToPg.getTarget();
						if (pg != null) {
							_result.add(new Object[] { jParameter, tParameter,
									jParameterToTParameter, extendedType, pg,
									jParameterToPg, match });
						}

					}
				}

			}
		}

		return _result;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_2_3_black_nac_0BB(
			TypeGraph pg, ExtendedType extendedType) {
		String extendedTypetypeName = extendedType.getTypeName();
		for (TClass tExistingClass : pg.getClasses()) {
			String tExistingClasstName = tExistingClass.getTName();
			if (tExistingClasstName.equals(extendedTypetypeName)) {
				return new Object[] { pg, extendedType };
			}

		}

		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterTypeLibCreate_2_3_blackBBBBBFFBF(
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			ExtendedType extendedType, TypeGraph pg,
			ExtendedParameterToTypeGraph jParameterToPg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (extendedType.equals(jParameter.getExtendedParameterType())) {
			if (tParameter.equals(jParameterToTParameter.getTarget())) {
				if (jParameter.equals(jParameterToTParameter.getSource())) {
					if (jParameter.equals(jParameterToPg.getSource())) {
						if (pg.equals(jParameterToPg.getTarget())) {
							boolean extendedTypeisFromLib = extendedType
									.isIsFromLib();
							if (Boolean.valueOf(extendedTypeisFromLib).equals(
									Boolean.valueOf(true))) {
								if (pattern_ParameterTypeLibCreate_2_3_black_nac_0BB(
										pg, extendedType) == null) {
									for (TMethod tMethod : pg.getMethods()) {
										for (TMethodSignature tMethodSignature : tMethod
												.getSignatures()) {
											TParameterList tParameterList = tMethodSignature
													.getParamList();
											if (tParameterList != null) {
												if (tParameterList.getEntries()
														.contains(tParameter)) {
													_result.add(new Object[] {
															jParameter,
															tParameter,
															jParameterToTParameter,
															extendedType, pg,
															tMethodSignature,
															tMethod,
															jParameterToPg,
															tParameterList });
												}
											}

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

	public static final Object[] pattern_ParameterTypeLibCreate_2_3_greenBBBBBBBBBFFFFFFFFFFF(
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			ExtendedType extendedType, TypeGraph pg,
			TMethodSignature tMethodSignature, TMethod tMethod,
			ExtendedParameterToTypeGraph jParameterToPg,
			TParameterList tParameterList) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge jParameter__extendedType____extendedParameterType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToTParameter__tParameter____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToTParameter__jParameter____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tParameterList____paramList = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tMethod____method = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethod__tMethodSignature____signatures = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToPg__jParameter____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToPg__pg____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tParameterList__tParameter____entries = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jParameter__extendedType____extendedParameterType_name_prime = "extendedParameterType";
		String jParameterToTParameter__tParameter____target_name_prime = "target";
		String jParameterToTParameter__jParameter____source_name_prime = "source";
		String pg__tMethod____methods_name_prime = "methods";
		String tMethodSignature__tParameterList____paramList_name_prime = "paramList";
		String tMethodSignature__tMethod____method_name_prime = "method";
		String tMethod__tMethodSignature____signatures_name_prime = "signatures";
		String jParameterToPg__jParameter____source_name_prime = "source";
		String jParameterToPg__pg____target_name_prime = "target";
		String tParameterList__tParameter____entries_name_prime = "entries";
		isApplicableMatch.getAllContextElements().add(jParameter);
		isApplicableMatch.getAllContextElements().add(tParameter);
		isApplicableMatch.getAllContextElements().add(jParameterToTParameter);
		isApplicableMatch.getAllContextElements().add(extendedType);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(tMethod);
		isApplicableMatch.getAllContextElements().add(jParameterToPg);
		isApplicableMatch.getAllContextElements().add(tParameterList);
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
		pg__tMethod____methods.setSrc(pg);
		pg__tMethod____methods.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(pg__tMethod____methods);
		tMethodSignature__tParameterList____paramList.setSrc(tMethodSignature);
		tMethodSignature__tParameterList____paramList.setTrg(tParameterList);
		isApplicableMatch.getAllContextElements().add(
				tMethodSignature__tParameterList____paramList);
		tMethodSignature__tMethod____method.setSrc(tMethodSignature);
		tMethodSignature__tMethod____method.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(
				tMethodSignature__tMethod____method);
		tMethod__tMethodSignature____signatures.setSrc(tMethod);
		tMethod__tMethodSignature____signatures.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(
				tMethod__tMethodSignature____signatures);
		jParameterToPg__jParameter____source.setSrc(jParameterToPg);
		jParameterToPg__jParameter____source.setTrg(jParameter);
		isApplicableMatch.getAllContextElements().add(
				jParameterToPg__jParameter____source);
		jParameterToPg__pg____target.setSrc(jParameterToPg);
		jParameterToPg__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(
				jParameterToPg__pg____target);
		tParameterList__tParameter____entries.setSrc(tParameterList);
		tParameterList__tParameter____entries.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(
				tParameterList__tParameter____entries);
		jParameter__extendedType____extendedParameterType
				.setName(jParameter__extendedType____extendedParameterType_name_prime);
		jParameterToTParameter__tParameter____target
				.setName(jParameterToTParameter__tParameter____target_name_prime);
		jParameterToTParameter__jParameter____source
				.setName(jParameterToTParameter__jParameter____source_name_prime);
		pg__tMethod____methods.setName(pg__tMethod____methods_name_prime);
		tMethodSignature__tParameterList____paramList
				.setName(tMethodSignature__tParameterList____paramList_name_prime);
		tMethodSignature__tMethod____method
				.setName(tMethodSignature__tMethod____method_name_prime);
		tMethod__tMethodSignature____signatures
				.setName(tMethod__tMethodSignature____signatures_name_prime);
		jParameterToPg__jParameter____source
				.setName(jParameterToPg__jParameter____source_name_prime);
		jParameterToPg__pg____target
				.setName(jParameterToPg__pg____target_name_prime);
		tParameterList__tParameter____entries
				.setName(tParameterList__tParameter____entries_name_prime);
		return new Object[] { jParameter, tParameter, jParameterToTParameter,
				extendedType, pg, tMethodSignature, tMethod, jParameterToPg,
				tParameterList, isApplicableMatch,
				jParameter__extendedType____extendedParameterType,
				jParameterToTParameter__tParameter____target,
				jParameterToTParameter__jParameter____source,
				pg__tMethod____methods,
				tMethodSignature__tParameterList____paramList,
				tMethodSignature__tMethod____method,
				tMethod__tMethodSignature____signatures,
				jParameterToPg__jParameter____source,
				jParameterToPg__pg____target,
				tParameterList__tParameter____entries };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_2_4_bindingFBBBBBBBBBBB(
			ParameterTypeLibCreate _this, IsApplicableMatch isApplicableMatch,
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			ExtendedType extendedType, TypeGraph pg,
			TMethodSignature tMethodSignature, TMethod tMethod,
			ExtendedParameterToTypeGraph jParameterToPg,
			TParameterList tParameterList) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, jParameter, tParameter,
				jParameterToTParameter, extendedType, pg, tMethodSignature,
				tMethod, jParameterToPg, tParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jParameter,
					tParameter, jParameterToTParameter, extendedType, pg,
					tMethodSignature, tMethod, jParameterToPg, tParameterList };
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_2_4_bindingAndBlackFBBBBBBBBBBB(
			ParameterTypeLibCreate _this, IsApplicableMatch isApplicableMatch,
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			ExtendedType extendedType, TypeGraph pg,
			TMethodSignature tMethodSignature, TMethod tMethod,
			ExtendedParameterToTypeGraph jParameterToPg,
			TParameterList tParameterList) {
		Object[] result_pattern_ParameterTypeLibCreate_2_4_binding = pattern_ParameterTypeLibCreate_2_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, jParameter, tParameter,
				jParameterToTParameter, extendedType, pg, tMethodSignature,
				tMethod, jParameterToPg, tParameterList);
		if (result_pattern_ParameterTypeLibCreate_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterTypeLibCreate_2_4_binding[0];

			Object[] result_pattern_ParameterTypeLibCreate_2_4_black = pattern_ParameterTypeLibCreate_2_4_blackB(csp);
			if (result_pattern_ParameterTypeLibCreate_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						jParameter, tParameter, jParameterToTParameter,
						extendedType, pg, tMethodSignature, tMethod,
						jParameterToPg, tParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterTypeLibCreate_2_5_expressionFBB(
			ParameterTypeLibCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParameterTypeLibCreate";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterTypeLibCreate_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_10_1_blackBBBBBBBB(
			ParameterTypeLibCreate _this, Match match, TParameter tParameter,
			TClass tClass, TypeGraph pg, TMethodSignature tMethodSignature,
			TMethod tMethod, TParameterList tParameterList) {
		return new Object[] { _this, match, tParameter, tClass, pg,
				tMethodSignature, tMethod, tParameterList };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_10_2_bindingFBBBBBBBB(
			ParameterTypeLibCreate _this, Match match, TParameter tParameter,
			TClass tClass, TypeGraph pg, TMethodSignature tMethodSignature,
			TMethod tMethod, TParameterList tParameterList) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				tParameter, tClass, pg, tMethodSignature, tMethod,
				tParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tParameter, tClass, pg,
					tMethodSignature, tMethod, tParameterList };
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_10_2_bindingAndBlackFBBBBBBBB(
			ParameterTypeLibCreate _this, Match match, TParameter tParameter,
			TClass tClass, TypeGraph pg, TMethodSignature tMethodSignature,
			TMethod tMethod, TParameterList tParameterList) {
		Object[] result_pattern_ParameterTypeLibCreate_10_2_binding = pattern_ParameterTypeLibCreate_10_2_bindingFBBBBBBBB(
				_this, match, tParameter, tClass, pg, tMethodSignature,
				tMethod, tParameterList);
		if (result_pattern_ParameterTypeLibCreate_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterTypeLibCreate_10_2_binding[0];

			Object[] result_pattern_ParameterTypeLibCreate_10_2_black = pattern_ParameterTypeLibCreate_10_2_blackB(csp);
			if (result_pattern_ParameterTypeLibCreate_10_2_black != null) {

				return new Object[] { csp, _this, match, tParameter, tClass,
						pg, tMethodSignature, tMethod, tParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterTypeLibCreate_10_3_expressionFBB(
			ParameterTypeLibCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_10_4_blackBBBBBBB(
			Match match, TParameter tParameter, TClass tClass, TypeGraph pg,
			TMethodSignature tMethodSignature, TMethod tMethod,
			TParameterList tParameterList) {
		return new Object[] { match, tParameter, tClass, pg, tMethodSignature,
				tMethod, tParameterList };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_10_4_greenBBBBFF(
			Match match, TParameter tParameter, TClass tClass, TypeGraph pg) {
		EMoflonEdge tParameter__tClass____tClass = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tClass);
		String tParameter__tClass____tClass_name_prime = "tClass";
		String pg__tClass____classes_name_prime = "classes";
		tParameter__tClass____tClass.setSrc(tParameter);
		tParameter__tClass____tClass.setTrg(tClass);
		match.getToBeTranslatedEdges().add(tParameter__tClass____tClass);
		pg__tClass____classes.setSrc(pg);
		pg__tClass____classes.setTrg(tClass);
		match.getToBeTranslatedEdges().add(pg__tClass____classes);
		tParameter__tClass____tClass
				.setName(tParameter__tClass____tClass_name_prime);
		pg__tClass____classes.setName(pg__tClass____classes_name_prime);
		return new Object[] { match, tParameter, tClass, pg,
				tParameter__tClass____tClass, pg__tClass____classes };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_10_5_blackBBBBBBB(
			Match match, TParameter tParameter, TClass tClass, TypeGraph pg,
			TMethodSignature tMethodSignature, TMethod tMethod,
			TParameterList tParameterList) {
		return new Object[] { match, tParameter, tClass, pg, tMethodSignature,
				tMethod, tParameterList };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_10_5_greenBBBBBBFFFFF(
			Match match, TParameter tParameter, TypeGraph pg,
			TMethodSignature tMethodSignature, TMethod tMethod,
			TParameterList tParameterList) {
		EMoflonEdge pg__tMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tParameterList____paramList = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tMethod____method = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethod__tMethodSignature____signatures = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tParameterList__tParameter____entries = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(tParameter);
		match.getContextNodes().add(pg);
		match.getContextNodes().add(tMethodSignature);
		match.getContextNodes().add(tMethod);
		match.getContextNodes().add(tParameterList);
		String pg__tMethod____methods_name_prime = "methods";
		String tMethodSignature__tParameterList____paramList_name_prime = "paramList";
		String tMethodSignature__tMethod____method_name_prime = "method";
		String tMethod__tMethodSignature____signatures_name_prime = "signatures";
		String tParameterList__tParameter____entries_name_prime = "entries";
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
		tParameterList__tParameter____entries.setSrc(tParameterList);
		tParameterList__tParameter____entries.setTrg(tParameter);
		match.getContextEdges().add(tParameterList__tParameter____entries);
		pg__tMethod____methods.setName(pg__tMethod____methods_name_prime);
		tMethodSignature__tParameterList____paramList
				.setName(tMethodSignature__tParameterList____paramList_name_prime);
		tMethodSignature__tMethod____method
				.setName(tMethodSignature__tMethod____method_name_prime);
		tMethod__tMethodSignature____signatures
				.setName(tMethod__tMethodSignature____signatures_name_prime);
		tParameterList__tParameter____entries
				.setName(tParameterList__tParameter____entries_name_prime);
		return new Object[] { match, tParameter, pg, tMethodSignature, tMethod,
				tParameterList, pg__tMethod____methods,
				tMethodSignature__tParameterList____paramList,
				tMethodSignature__tMethod____method,
				tMethod__tMethodSignature____signatures,
				tParameterList__tParameter____entries };
	}

	public static final void pattern_ParameterTypeLibCreate_10_6_expressionBBBBBBBB(
			ParameterTypeLibCreate _this, Match match, TParameter tParameter,
			TClass tClass, TypeGraph pg, TMethodSignature tMethodSignature,
			TMethod tMethod, TParameterList tParameterList) {
		_this.registerObjectsToMatch_BWD(match, tParameter, tClass, pg,
				tMethodSignature, tMethod, tParameterList);

	}

	public static final boolean pattern_ParameterTypeLibCreate_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterTypeLibCreate_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_11_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jParameter");
		EObject _localVariable_1 = isApplicableMatch.getObject("tParameter");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("jParameterToTParameter");
		EObject _localVariable_3 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("pg");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("tMethodSignature");
		EObject _localVariable_6 = isApplicableMatch.getObject("tMethod");
		EObject _localVariable_7 = isApplicableMatch
				.getObject("jParameterToPg");
		EObject _localVariable_8 = isApplicableMatch
				.getObject("tParameterList");
		EObject tmpJParameter = _localVariable_0;
		EObject tmpTParameter = _localVariable_1;
		EObject tmpJParameterToTParameter = _localVariable_2;
		EObject tmpTClass = _localVariable_3;
		EObject tmpPg = _localVariable_4;
		EObject tmpTMethodSignature = _localVariable_5;
		EObject tmpTMethod = _localVariable_6;
		EObject tmpJParameterToPg = _localVariable_7;
		EObject tmpTParameterList = _localVariable_8;
		if (tmpJParameter instanceof ExtendedParameter) {
			ExtendedParameter jParameter = (ExtendedParameter) tmpJParameter;
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				if (tmpJParameterToTParameter instanceof ExtendedParameterToTParameter) {
					ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) tmpJParameterToTParameter;
					if (tmpTClass instanceof TClass) {
						TClass tClass = (TClass) tmpTClass;
						if (tmpPg instanceof TypeGraph) {
							TypeGraph pg = (TypeGraph) tmpPg;
							if (tmpTMethodSignature instanceof TMethodSignature) {
								TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
								if (tmpTMethod instanceof TMethod) {
									TMethod tMethod = (TMethod) tmpTMethod;
									if (tmpJParameterToPg instanceof ExtendedParameterToTypeGraph) {
										ExtendedParameterToTypeGraph jParameterToPg = (ExtendedParameterToTypeGraph) tmpJParameterToPg;
										if (tmpTParameterList instanceof TParameterList) {
											TParameterList tParameterList = (TParameterList) tmpTParameterList;
											return new Object[] { jParameter,
													tParameter,
													jParameterToTParameter,
													tClass, pg,
													tMethodSignature, tMethod,
													jParameterToPg,
													tParameterList,
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

	public static final Object[] pattern_ParameterTypeLibCreate_11_1_blackBBBBBBBBBFBB(
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			TClass tClass, TypeGraph pg, TMethodSignature tMethodSignature,
			TMethod tMethod, ExtendedParameterToTypeGraph jParameterToPg,
			TParameterList tParameterList, ParameterTypeLibCreate _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jParameter, tParameter,
						jParameterToTParameter, tClass, pg, tMethodSignature,
						tMethod, jParameterToPg, tParameterList, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_11_1_bindingAndBlackFFFFFFFFFFBB(
			ParameterTypeLibCreate _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParameterTypeLibCreate_11_1_binding = pattern_ParameterTypeLibCreate_11_1_bindingFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ParameterTypeLibCreate_11_1_binding != null) {
			ExtendedParameter jParameter = (ExtendedParameter) result_pattern_ParameterTypeLibCreate_11_1_binding[0];
			TParameter tParameter = (TParameter) result_pattern_ParameterTypeLibCreate_11_1_binding[1];
			ExtendedParameterToTParameter jParameterToTParameter = (ExtendedParameterToTParameter) result_pattern_ParameterTypeLibCreate_11_1_binding[2];
			TClass tClass = (TClass) result_pattern_ParameterTypeLibCreate_11_1_binding[3];
			TypeGraph pg = (TypeGraph) result_pattern_ParameterTypeLibCreate_11_1_binding[4];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_ParameterTypeLibCreate_11_1_binding[5];
			TMethod tMethod = (TMethod) result_pattern_ParameterTypeLibCreate_11_1_binding[6];
			ExtendedParameterToTypeGraph jParameterToPg = (ExtendedParameterToTypeGraph) result_pattern_ParameterTypeLibCreate_11_1_binding[7];
			TParameterList tParameterList = (TParameterList) result_pattern_ParameterTypeLibCreate_11_1_binding[8];

			Object[] result_pattern_ParameterTypeLibCreate_11_1_black = pattern_ParameterTypeLibCreate_11_1_blackBBBBBBBBBFBB(
					jParameter, tParameter, jParameterToTParameter, tClass, pg,
					tMethodSignature, tMethod, jParameterToPg, tParameterList,
					_this, isApplicableMatch);
			if (result_pattern_ParameterTypeLibCreate_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ParameterTypeLibCreate_11_1_black[9];

				return new Object[] { jParameter, tParameter,
						jParameterToTParameter, tClass, pg, tMethodSignature,
						tMethod, jParameterToPg, tParameterList, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_11_1_greenBFBFB(
			ExtendedParameter jParameter, TClass tClass, CSP csp) {
		ExtendedType extendedType = ExtendedJamoppFactory.eINSTANCE
				.createExtendedType();
		ExtendedTypeToTClass extendedTypeToTClass = GravityTGGFactory.eINSTANCE
				.createExtendedTypeToTClass();
		boolean extendedType_isFromLib_prime = Boolean.valueOf(true);
		Object _localVariable_0 = csp.getValue("extendedType", "typeName");
		jParameter.setExtendedParameterType(extendedType);
		extendedTypeToTClass.setSource(extendedType);
		extendedTypeToTClass.setTarget(tClass);
		extendedType
				.setIsFromLib(Boolean.valueOf(extendedType_isFromLib_prime));
		String extendedType_typeName_prime = (String) _localVariable_0;
		extendedType.setTypeName(extendedType_typeName_prime);
		return new Object[] { jParameter, extendedType, tClass,
				extendedTypeToTClass, csp };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_11_2_blackBBB(
			ExtendedType extendedType, TClass tClass,
			ExtendedTypeToTClass extendedTypeToTClass) {
		return new Object[] { extendedType, tClass, extendedTypeToTClass };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_11_2_greenFBBB(
			ExtendedType extendedType, TClass tClass,
			ExtendedTypeToTClass extendedTypeToTClass) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(extendedType);
		ruleresult.getTranslatedElements().add(tClass);
		ruleresult.getCreatedLinkElements().add(extendedTypeToTClass);
		return new Object[] { ruleresult, extendedType, tClass,
				extendedTypeToTClass };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_11_3_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject jParameter,
			EObject tParameter, EObject jParameterToTParameter,
			EObject extendedType, EObject tClass, EObject extendedTypeToTClass,
			EObject pg, EObject tMethodSignature, EObject tMethod,
			EObject jParameterToPg, EObject tParameterList) {
		if (!jParameter.equals(tParameter)) {
			if (!jParameter.equals(jParameterToTParameter)) {
				if (!jParameter.equals(tClass)) {
					if (!jParameter.equals(pg)) {
						if (!jParameter.equals(tMethodSignature)) {
							if (!jParameter.equals(tMethod)) {
								if (!jParameter.equals(jParameterToPg)) {
									if (!jParameter.equals(tParameterList)) {
										if (!tParameter.equals(tParameterList)) {
											if (!jParameterToTParameter
													.equals(tParameter)) {
												if (!jParameterToTParameter
														.equals(tClass)) {
													if (!jParameterToTParameter
															.equals(pg)) {
														if (!jParameterToTParameter
																.equals(tMethodSignature)) {
															if (!jParameterToTParameter
																	.equals(tMethod)) {
																if (!jParameterToTParameter
																		.equals(tParameterList)) {
																	if (!extendedType
																			.equals(jParameter)) {
																		if (!extendedType
																				.equals(tParameter)) {
																			if (!extendedType
																					.equals(jParameterToTParameter)) {
																				if (!extendedType
																						.equals(tClass)) {
																					if (!extendedType
																							.equals(extendedTypeToTClass)) {
																						if (!extendedType
																								.equals(pg)) {
																							if (!extendedType
																									.equals(tMethodSignature)) {
																								if (!extendedType
																										.equals(tMethod)) {
																									if (!extendedType
																											.equals(jParameterToPg)) {
																										if (!extendedType
																												.equals(tParameterList)) {
																											if (!tClass
																													.equals(tParameter)) {
																												if (!tClass
																														.equals(tMethodSignature)) {
																													if (!tClass
																															.equals(tMethod)) {
																														if (!tClass
																																.equals(tParameterList)) {
																															if (!extendedTypeToTClass
																																	.equals(jParameter)) {
																																if (!extendedTypeToTClass
																																		.equals(tParameter)) {
																																	if (!extendedTypeToTClass
																																			.equals(jParameterToTParameter)) {
																																		if (!extendedTypeToTClass
																																				.equals(tClass)) {
																																			if (!extendedTypeToTClass
																																					.equals(pg)) {
																																				if (!extendedTypeToTClass
																																						.equals(tMethodSignature)) {
																																					if (!extendedTypeToTClass
																																							.equals(tMethod)) {
																																						if (!extendedTypeToTClass
																																								.equals(jParameterToPg)) {
																																							if (!extendedTypeToTClass
																																									.equals(tParameterList)) {
																																								if (!pg.equals(tParameter)) {
																																									if (!pg.equals(tClass)) {
																																										if (!pg.equals(tMethodSignature)) {
																																											if (!pg.equals(tMethod)) {
																																												if (!pg.equals(tParameterList)) {
																																													if (!tMethodSignature
																																															.equals(tParameter)) {
																																														if (!tMethodSignature
																																																.equals(tParameterList)) {
																																															if (!tMethod
																																																	.equals(tParameter)) {
																																																if (!tMethod
																																																		.equals(tMethodSignature)) {
																																																	if (!tMethod
																																																			.equals(tParameterList)) {
																																																		if (!jParameterToPg
																																																				.equals(tParameter)) {
																																																			if (!jParameterToPg
																																																					.equals(jParameterToTParameter)) {
																																																				if (!jParameterToPg
																																																						.equals(tClass)) {
																																																					if (!jParameterToPg
																																																							.equals(pg)) {
																																																						if (!jParameterToPg
																																																								.equals(tMethodSignature)) {
																																																							if (!jParameterToPg
																																																									.equals(tMethod)) {
																																																								if (!jParameterToPg
																																																										.equals(tParameterList)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											jParameter,
																																																											tParameter,
																																																											jParameterToTParameter,
																																																											extendedType,
																																																											tClass,
																																																											extendedTypeToTClass,
																																																											pg,
																																																											tMethodSignature,
																																																											tMethod,
																																																											jParameterToPg,
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
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterTypeLibCreate_11_3_greenBBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject jParameter,
			EObject tParameter, EObject extendedType, EObject tClass,
			EObject extendedTypeToTClass, EObject pg) {
		EMoflonEdge jParameter__extendedType____extendedParameterType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tParameter__tClass____tClass = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedTypeToTClass__extendedType____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedTypeToTClass__tClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParameterTypeLibCreate";
		String jParameter__extendedType____extendedParameterType_name_prime = "extendedParameterType";
		String tParameter__tClass____tClass_name_prime = "tClass";
		String extendedTypeToTClass__extendedType____source_name_prime = "source";
		String extendedTypeToTClass__tClass____target_name_prime = "target";
		String pg__tClass____classes_name_prime = "classes";
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
		pg__tClass____classes.setSrc(pg);
		pg__tClass____classes.setTrg(tClass);
		ruleresult.getTranslatedEdges().add(pg__tClass____classes);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jParameter__extendedType____extendedParameterType
				.setName(jParameter__extendedType____extendedParameterType_name_prime);
		tParameter__tClass____tClass
				.setName(tParameter__tClass____tClass_name_prime);
		extendedTypeToTClass__extendedType____source
				.setName(extendedTypeToTClass__extendedType____source_name_prime);
		extendedTypeToTClass__tClass____target
				.setName(extendedTypeToTClass__tClass____target_name_prime);
		pg__tClass____classes.setName(pg__tClass____classes_name_prime);
		return new Object[] { ruleresult, jParameter, tParameter, extendedType,
				tClass, extendedTypeToTClass, pg,
				jParameter__extendedType____extendedParameterType,
				tParameter__tClass____tClass,
				extendedTypeToTClass__extendedType____source,
				extendedTypeToTClass__tClass____target, pg__tClass____classes };
	}

	public static final void pattern_ParameterTypeLibCreate_11_5_expressionBBBBBBBBBBBBB(
			ParameterTypeLibCreate _this, PerformRuleResult ruleresult,
			EObject jParameter, EObject tParameter,
			EObject jParameterToTParameter, EObject extendedType,
			EObject tClass, EObject extendedTypeToTClass, EObject pg,
			EObject tMethodSignature, EObject tMethod, EObject jParameterToPg,
			EObject tParameterList) {
		_this.registerObjects_BWD(ruleresult, jParameter, tParameter,
				jParameterToTParameter, extendedType, tClass,
				extendedTypeToTClass, pg, tMethodSignature, tMethod,
				jParameterToPg, tParameterList);

	}

	public static final PerformRuleResult pattern_ParameterTypeLibCreate_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_12_1_bindingFB(
			ParameterTypeLibCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_12_1_blackFBB(
			EClass eClass, ParameterTypeLibCreate _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_12_1_bindingAndBlackFFB(
			ParameterTypeLibCreate _this) {
		Object[] result_pattern_ParameterTypeLibCreate_12_1_binding = pattern_ParameterTypeLibCreate_12_1_bindingFB(_this);
		if (result_pattern_ParameterTypeLibCreate_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParameterTypeLibCreate_12_1_binding[0];

			Object[] result_pattern_ParameterTypeLibCreate_12_1_black = pattern_ParameterTypeLibCreate_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParameterTypeLibCreate_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParameterTypeLibCreate_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParameterTypeLibCreate";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_12_2_bindingFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("tParameter");
		EObject _localVariable_1 = match.getObject("tClass");
		EObject _localVariable_2 = match.getObject("pg");
		EObject _localVariable_3 = match.getObject("tMethodSignature");
		EObject _localVariable_4 = match.getObject("tMethod");
		EObject _localVariable_5 = match.getObject("tParameterList");
		EObject tmpTParameter = _localVariable_0;
		EObject tmpTClass = _localVariable_1;
		EObject tmpPg = _localVariable_2;
		EObject tmpTMethodSignature = _localVariable_3;
		EObject tmpTMethod = _localVariable_4;
		EObject tmpTParameterList = _localVariable_5;
		if (tmpTParameter instanceof TParameter) {
			TParameter tParameter = (TParameter) tmpTParameter;
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				if (tmpPg instanceof TypeGraph) {
					TypeGraph pg = (TypeGraph) tmpPg;
					if (tmpTMethodSignature instanceof TMethodSignature) {
						TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
						if (tmpTMethod instanceof TMethod) {
							TMethod tMethod = (TMethod) tmpTMethod;
							if (tmpTParameterList instanceof TParameterList) {
								TParameterList tParameterList = (TParameterList) tmpTParameterList;
								return new Object[] { tParameter, tClass, pg,
										tMethodSignature, tMethod,
										tParameterList, match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterTypeLibCreate_12_2_blackFBFBBBBFBB(
			TParameter tParameter, TClass tClass, TypeGraph pg,
			TMethodSignature tMethodSignature, TMethod tMethod,
			TParameterList tParameterList, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ExtendedParameterToTParameter jParameterToTParameter : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tParameter,
						ExtendedParameterToTParameter.class, "target")) {
			ExtendedParameter jParameter = jParameterToTParameter.getSource();
			if (jParameter != null) {
				for (ExtendedParameterToTypeGraph jParameterToPg : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(pg,
								ExtendedParameterToTypeGraph.class, "target")) {
					if (jParameter.equals(jParameterToPg.getSource())) {
						_result.add(new Object[] { jParameter, tParameter,
								jParameterToTParameter, tClass, pg,
								tMethodSignature, tMethod, jParameterToPg,
								tParameterList, match });
					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParameterTypeLibCreate_12_3_blackBBBBBBBBB(
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			TClass tClass, TypeGraph pg, TMethodSignature tMethodSignature,
			TMethod tMethod, ExtendedParameterToTypeGraph jParameterToPg,
			TParameterList tParameterList) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tClass.equals(tParameter.getTClass())) {
			if (tParameter.equals(jParameterToTParameter.getTarget())) {
				if (jParameter.equals(jParameterToTParameter.getSource())) {
					if (pg.getMethods().contains(tMethod)) {
						if (pg.getClasses().contains(tClass)) {
							if (tParameterList.equals(tMethodSignature
									.getParamList())) {
								if (tMethod
										.equals(tMethodSignature.getMethod())) {
									if (jParameter.equals(jParameterToPg
											.getSource())) {
										if (pg.equals(jParameterToPg
												.getTarget())) {
											if (tParameterList.getEntries()
													.contains(tParameter)) {
												_result.add(new Object[] {
														jParameter, tParameter,
														jParameterToTParameter,
														tClass, pg,
														tMethodSignature,
														tMethod,
														jParameterToPg,
														tParameterList });
											}
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

	public static final Object[] pattern_ParameterTypeLibCreate_12_3_greenBBBBBBBBBFFFFFFFFFFFF(
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			TClass tClass, TypeGraph pg, TMethodSignature tMethodSignature,
			TMethod tMethod, ExtendedParameterToTypeGraph jParameterToPg,
			TParameterList tParameterList) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge tParameter__tClass____tClass = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToTParameter__tParameter____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToTParameter__jParameter____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tParameterList____paramList = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tMethod____method = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethod__tMethodSignature____signatures = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToPg__jParameter____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParameterToPg__pg____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tParameterList__tParameter____entries = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tParameter__tClass____tClass_name_prime = "tClass";
		String jParameterToTParameter__tParameter____target_name_prime = "target";
		String jParameterToTParameter__jParameter____source_name_prime = "source";
		String pg__tMethod____methods_name_prime = "methods";
		String pg__tClass____classes_name_prime = "classes";
		String tMethodSignature__tParameterList____paramList_name_prime = "paramList";
		String tMethodSignature__tMethod____method_name_prime = "method";
		String tMethod__tMethodSignature____signatures_name_prime = "signatures";
		String jParameterToPg__jParameter____source_name_prime = "source";
		String jParameterToPg__pg____target_name_prime = "target";
		String tParameterList__tParameter____entries_name_prime = "entries";
		isApplicableMatch.getAllContextElements().add(jParameter);
		isApplicableMatch.getAllContextElements().add(tParameter);
		isApplicableMatch.getAllContextElements().add(jParameterToTParameter);
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(tMethod);
		isApplicableMatch.getAllContextElements().add(jParameterToPg);
		isApplicableMatch.getAllContextElements().add(tParameterList);
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
		pg__tMethod____methods.setSrc(pg);
		pg__tMethod____methods.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(pg__tMethod____methods);
		pg__tClass____classes.setSrc(pg);
		pg__tClass____classes.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(pg__tClass____classes);
		tMethodSignature__tParameterList____paramList.setSrc(tMethodSignature);
		tMethodSignature__tParameterList____paramList.setTrg(tParameterList);
		isApplicableMatch.getAllContextElements().add(
				tMethodSignature__tParameterList____paramList);
		tMethodSignature__tMethod____method.setSrc(tMethodSignature);
		tMethodSignature__tMethod____method.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(
				tMethodSignature__tMethod____method);
		tMethod__tMethodSignature____signatures.setSrc(tMethod);
		tMethod__tMethodSignature____signatures.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(
				tMethod__tMethodSignature____signatures);
		jParameterToPg__jParameter____source.setSrc(jParameterToPg);
		jParameterToPg__jParameter____source.setTrg(jParameter);
		isApplicableMatch.getAllContextElements().add(
				jParameterToPg__jParameter____source);
		jParameterToPg__pg____target.setSrc(jParameterToPg);
		jParameterToPg__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(
				jParameterToPg__pg____target);
		tParameterList__tParameter____entries.setSrc(tParameterList);
		tParameterList__tParameter____entries.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(
				tParameterList__tParameter____entries);
		tParameter__tClass____tClass
				.setName(tParameter__tClass____tClass_name_prime);
		jParameterToTParameter__tParameter____target
				.setName(jParameterToTParameter__tParameter____target_name_prime);
		jParameterToTParameter__jParameter____source
				.setName(jParameterToTParameter__jParameter____source_name_prime);
		pg__tMethod____methods.setName(pg__tMethod____methods_name_prime);
		pg__tClass____classes.setName(pg__tClass____classes_name_prime);
		tMethodSignature__tParameterList____paramList
				.setName(tMethodSignature__tParameterList____paramList_name_prime);
		tMethodSignature__tMethod____method
				.setName(tMethodSignature__tMethod____method_name_prime);
		tMethod__tMethodSignature____signatures
				.setName(tMethod__tMethodSignature____signatures_name_prime);
		jParameterToPg__jParameter____source
				.setName(jParameterToPg__jParameter____source_name_prime);
		jParameterToPg__pg____target
				.setName(jParameterToPg__pg____target_name_prime);
		tParameterList__tParameter____entries
				.setName(tParameterList__tParameter____entries_name_prime);
		return new Object[] { jParameter, tParameter, jParameterToTParameter,
				tClass, pg, tMethodSignature, tMethod, jParameterToPg,
				tParameterList, isApplicableMatch,
				tParameter__tClass____tClass,
				jParameterToTParameter__tParameter____target,
				jParameterToTParameter__jParameter____source,
				pg__tMethod____methods, pg__tClass____classes,
				tMethodSignature__tParameterList____paramList,
				tMethodSignature__tMethod____method,
				tMethod__tMethodSignature____signatures,
				jParameterToPg__jParameter____source,
				jParameterToPg__pg____target,
				tParameterList__tParameter____entries };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_12_4_bindingFBBBBBBBBBBB(
			ParameterTypeLibCreate _this, IsApplicableMatch isApplicableMatch,
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			TClass tClass, TypeGraph pg, TMethodSignature tMethodSignature,
			TMethod tMethod, ExtendedParameterToTypeGraph jParameterToPg,
			TParameterList tParameterList) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, jParameter, tParameter,
				jParameterToTParameter, tClass, pg, tMethodSignature, tMethod,
				jParameterToPg, tParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jParameter,
					tParameter, jParameterToTParameter, tClass, pg,
					tMethodSignature, tMethod, jParameterToPg, tParameterList };
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_12_4_bindingAndBlackFBBBBBBBBBBB(
			ParameterTypeLibCreate _this, IsApplicableMatch isApplicableMatch,
			ExtendedParameter jParameter, TParameter tParameter,
			ExtendedParameterToTParameter jParameterToTParameter,
			TClass tClass, TypeGraph pg, TMethodSignature tMethodSignature,
			TMethod tMethod, ExtendedParameterToTypeGraph jParameterToPg,
			TParameterList tParameterList) {
		Object[] result_pattern_ParameterTypeLibCreate_12_4_binding = pattern_ParameterTypeLibCreate_12_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, jParameter, tParameter,
				jParameterToTParameter, tClass, pg, tMethodSignature, tMethod,
				jParameterToPg, tParameterList);
		if (result_pattern_ParameterTypeLibCreate_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterTypeLibCreate_12_4_binding[0];

			Object[] result_pattern_ParameterTypeLibCreate_12_4_black = pattern_ParameterTypeLibCreate_12_4_blackB(csp);
			if (result_pattern_ParameterTypeLibCreate_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						jParameter, tParameter, jParameterToTParameter, tClass,
						pg, tMethodSignature, tMethod, jParameterToPg,
						tParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterTypeLibCreate_12_5_expressionFBB(
			ParameterTypeLibCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParameterTypeLibCreate";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterTypeLibCreate_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_20_1_bindingFB(
			ParameterTypeLibCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_20_1_blackFBB(
			EClass __eClass, ParameterTypeLibCreate _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_20_1_bindingAndBlackFFB(
			ParameterTypeLibCreate _this) {
		Object[] result_pattern_ParameterTypeLibCreate_20_1_binding = pattern_ParameterTypeLibCreate_20_1_bindingFB(_this);
		if (result_pattern_ParameterTypeLibCreate_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterTypeLibCreate_20_1_binding[0];

			Object[] result_pattern_ParameterTypeLibCreate_20_1_black = pattern_ParameterTypeLibCreate_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParameterTypeLibCreate_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterTypeLibCreate_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_20_2_black_nac_0B(
			ExtendedType extendedType) {
		Type __DEC_extendedType_type_21993 = extendedType.getType();
		if (__DEC_extendedType_type_21993 != null) {
			return new Object[] { extendedType };
		}

		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_20_2_black_nac_1B(
			ExtendedType extendedType) {
		for (ExtendedClassMethod __DEC_extendedType_extendedReturnType_944387 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(extendedType,
						ExtendedClassMethod.class, "extendedReturnType")) {
			return new Object[] { extendedType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_20_2_black_nac_2BB(
			ExtendedType extendedType, ExtendedParameter jParameter) {
		for (ExtendedParameter __DEC_extendedType_extendedParameterType_937720 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(extendedType,
						ExtendedParameter.class, "extendedParameterType")) {
			if (!jParameter
					.equals(__DEC_extendedType_extendedParameterType_937720)) {
				return new Object[] { extendedType, jParameter };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterTypeLibCreate_20_2_blackFFB(
			EMoflonEdge _edge_extendedParameterType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJParameter = _edge_extendedParameterType.getSrc();
		if (tmpJParameter instanceof ExtendedParameter) {
			ExtendedParameter jParameter = (ExtendedParameter) tmpJParameter;
			EObject tmpExtendedType = _edge_extendedParameterType.getTrg();
			if (tmpExtendedType instanceof ExtendedType) {
				ExtendedType extendedType = (ExtendedType) tmpExtendedType;
				if (extendedType.equals(jParameter.getExtendedParameterType())) {
					boolean extendedTypeisFromLib = extendedType.isIsFromLib();
					if (Boolean.valueOf(extendedTypeisFromLib).equals(
							Boolean.valueOf(true))) {
						if (pattern_ParameterTypeLibCreate_20_2_black_nac_0B(extendedType) == null) {
							if (pattern_ParameterTypeLibCreate_20_2_black_nac_1B(extendedType) == null) {
								if (pattern_ParameterTypeLibCreate_20_2_black_nac_2BB(
										extendedType, jParameter) == null) {
									_result.add(new Object[] { jParameter,
											extendedType,
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

	public static final Object[] pattern_ParameterTypeLibCreate_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterTypeLibCreate_20_3_expressionFBBBB(
			ParameterTypeLibCreate _this, Match match,
			ExtendedParameter jParameter, ExtendedType extendedType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jParameter,
				extendedType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterTypeLibCreate_20_4_expressionFBB(
			ParameterTypeLibCreate _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParameterTypeLibCreate_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_21_1_bindingFB(
			ParameterTypeLibCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_21_1_blackFBB(
			EClass __eClass, ParameterTypeLibCreate _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_21_1_bindingAndBlackFFB(
			ParameterTypeLibCreate _this) {
		Object[] result_pattern_ParameterTypeLibCreate_21_1_binding = pattern_ParameterTypeLibCreate_21_1_bindingFB(_this);
		if (result_pattern_ParameterTypeLibCreate_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterTypeLibCreate_21_1_binding[0];

			Object[] result_pattern_ParameterTypeLibCreate_21_1_black = pattern_ParameterTypeLibCreate_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParameterTypeLibCreate_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterTypeLibCreate_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_21_2_black_nac_0B(
			TClass tClass) {
		TPackage __DEC_tClass_containedClasses_710502 = tClass.getPackage();
		if (__DEC_tClass_containedClasses_710502 != null) {
			return new Object[] { tClass };
		}

		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_21_2_black_nac_1BB(
			TClass tClass, TypeGraph pg) {
		for (TypeGraph __DEC_tClass_classes_150541 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tClass_classes_150541)) {
				return new Object[] { tClass, pg };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterTypeLibCreate_21_2_blackFFFFFFB(
			EMoflonEdge _edge_tClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTParameter = _edge_tClass.getSrc();
		if (tmpTParameter instanceof TParameter) {
			TParameter tParameter = (TParameter) tmpTParameter;
			EObject tmpTClass = _edge_tClass.getTrg();
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				if (tClass.equals(tParameter.getTClass())) {
					if (pattern_ParameterTypeLibCreate_21_2_black_nac_0B(tClass) == null) {
						for (TParameterList tParameterList : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tParameter,
										TParameterList.class, "entries")) {
							for (TypeGraph pg : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(tClass,
											TypeGraph.class, "classes")) {
								if (pattern_ParameterTypeLibCreate_21_2_black_nac_1BB(
										tClass, pg) == null) {
									for (TMethod tMethod : pg.getMethods()) {
										for (TMethodSignature tMethodSignature : tMethod
												.getSignatures()) {
											if (tParameterList
													.equals(tMethodSignature
															.getParamList())) {
												_result.add(new Object[] {
														tParameter, tClass, pg,
														tMethodSignature,
														tMethod,
														tParameterList,
														_edge_tClass });
											}
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

	public static final Object[] pattern_ParameterTypeLibCreate_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterTypeLibCreate_21_3_expressionFBBBBBBBB(
			ParameterTypeLibCreate _this, Match match, TParameter tParameter,
			TClass tClass, TypeGraph pg, TMethodSignature tMethodSignature,
			TMethod tMethod, TParameterList tParameterList) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tParameter,
				tClass, pg, tMethodSignature, tMethod, tParameterList);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterTypeLibCreate_21_4_expressionFBB(
			ParameterTypeLibCreate _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParameterTypeLibCreate_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_22_1_bindingFB(
			ParameterTypeLibCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_22_1_blackFBB(
			EClass __eClass, ParameterTypeLibCreate _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_22_1_bindingAndBlackFFB(
			ParameterTypeLibCreate _this) {
		Object[] result_pattern_ParameterTypeLibCreate_22_1_binding = pattern_ParameterTypeLibCreate_22_1_bindingFB(_this);
		if (result_pattern_ParameterTypeLibCreate_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterTypeLibCreate_22_1_binding[0];

			Object[] result_pattern_ParameterTypeLibCreate_22_1_black = pattern_ParameterTypeLibCreate_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParameterTypeLibCreate_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterTypeLibCreate_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_22_2_black_nac_0B(
			TClass tClass) {
		TPackage __DEC_tClass_containedClasses_390046 = tClass.getPackage();
		if (__DEC_tClass_containedClasses_390046 != null) {
			return new Object[] { tClass };
		}

		return null;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_22_2_black_nac_1BB(
			TClass tClass, TypeGraph pg) {
		for (TypeGraph __DEC_tClass_classes_283251 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tClass_classes_283251)) {
				return new Object[] { tClass, pg };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterTypeLibCreate_22_2_blackFFFFFFB(
			EMoflonEdge _edge_classes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPg = _edge_classes.getSrc();
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			EObject tmpTClass = _edge_classes.getTrg();
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				if (pg.getClasses().contains(tClass)) {
					if (pattern_ParameterTypeLibCreate_22_2_black_nac_0B(tClass) == null) {
						if (pattern_ParameterTypeLibCreate_22_2_black_nac_1BB(
								tClass, pg) == null) {
							for (TMethod tMethod : pg.getMethods()) {
								for (TMethodSignature tMethodSignature : tMethod
										.getSignatures()) {
									TParameterList tParameterList = tMethodSignature
											.getParamList();
									if (tParameterList != null) {
										for (TParameter tParameter : tParameterList
												.getEntries()) {
											if (tClass.equals(tParameter
													.getTClass())) {
												_result.add(new Object[] {
														tParameter, tClass, pg,
														tMethodSignature,
														tMethod,
														tParameterList,
														_edge_classes });
											}
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

	public static final Object[] pattern_ParameterTypeLibCreate_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterTypeLibCreate_22_3_expressionFBBBBBBBB(
			ParameterTypeLibCreate _this, Match match, TParameter tParameter,
			TClass tClass, TypeGraph pg, TMethodSignature tMethodSignature,
			TMethod tMethod, TParameterList tParameterList) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tParameter,
				tClass, pg, tMethodSignature, tMethod, tParameterList);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterTypeLibCreate_22_4_expressionFBB(
			ParameterTypeLibCreate _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterTypeLibCreate_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParameterTypeLibCreate_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParameterTypeLibCreate_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParameterTypeLibCreateImpl
