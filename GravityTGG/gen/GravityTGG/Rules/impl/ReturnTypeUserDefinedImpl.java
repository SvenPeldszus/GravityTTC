/**
 */
package GravityTGG.Rules.impl;

import ExtendedJamopp.ExtendedClassMethod;
import ExtendedJamopp.ExtendedJamoppFactory;
import ExtendedJamopp.ExtendedMethodName;
import ExtendedJamopp.ExtendedParameter;
import ExtendedJamopp.ExtendedParameterList;
import ExtendedJamopp.ExtendedType;

import GravityTGG.ClassMethodToTMethodDefinition;
import GravityTGG.ClassToTClass;

import GravityTGG.Rules.ReturnTypeUserDefined;
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
import TypeGraphBasic.TMethodDefinition;

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
 * An implementation of the model object '<em><b>Return Type User Defined</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReturnTypeUserDefinedImpl extends AbstractRuleImpl implements
		ReturnTypeUserDefined {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnTypeUserDefinedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getReturnTypeUserDefined();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			ExtendedMethodName jMethodName, ExtendedClassMethod jMethod,
			ExtendedType extendedType,
			org.emftext.language.java.classifiers.Class jType,
			ExtendedParameterList extendedParameterList) {
		// initial bindings
		Object[] result1_black = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_0_1_blackBBBBBBB(this, match,
						jMethodName, jMethod, extendedType, jType,
						extendedParameterList);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_0_2_bindingAndBlackFBBBBBBB(
						this, match, jMethodName, jMethod, extendedType, jType,
						extendedParameterList);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_0_4_blackBBBBBB(match,
							jMethodName, jMethod, extendedType, jType,
							extendedParameterList);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_0_4_greenBBBBFF(match,
							jMethod, extendedType, jType);
			// EMoflonEdge jMethod__extendedType____extendedReturnType = (EMoflonEdge) result4_green[4];
			// EMoflonEdge extendedType__jType____type = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_0_5_blackBBBBBB(match,
							jMethodName, jMethod, extendedType, jType,
							extendedParameterList);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_0_5_greenBBBBBFFFF(match,
							jMethodName, jMethod, jType, extendedParameterList);
			// EMoflonEdge jMethodName__jMethod____extendedClassMethod = (EMoflonEdge) result5_green[5];
			// EMoflonEdge jMethod__jMethodName____extendedMethodName = (EMoflonEdge) result5_green[6];
			// EMoflonEdge extendedParameterList__jMethod____methods = (EMoflonEdge) result5_green[7];
			// EMoflonEdge jMethod__extendedParameterList____parameter_list = (EMoflonEdge) result5_green[8];

			// register objects to match
			ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_0_6_expressionBBBBBBB(this,
							match, jMethodName, jMethod, extendedType, jType,
							extendedParameterList);
			return ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_0_7_expressionF();
		} else {
			return ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_1_1_bindingAndBlackFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedMethodName jMethodName = (ExtendedMethodName) result1_bindingAndBlack[0];
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result1_bindingAndBlack[1];
		ExtendedClassMethod jMethod = (ExtendedClassMethod) result1_bindingAndBlack[2];
		ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result1_bindingAndBlack[3];
		ExtendedType extendedType = (ExtendedType) result1_bindingAndBlack[4];
		org.emftext.language.java.classifiers.Class jType = (org.emftext.language.java.classifiers.Class) result1_bindingAndBlack[5];
		TClass tType = (TClass) result1_bindingAndBlack[6];
		ClassToTClass jTypeToTType = (ClassToTClass) result1_bindingAndBlack[7];
		ExtendedParameterList extendedParameterList = (ExtendedParameterList) result1_bindingAndBlack[8];
		// CSP csp = (CSP) result1_bindingAndBlack[9];
		ReturnTypeUserDefinedImpl.pattern_ReturnTypeUserDefined_1_1_greenBB(
				tMethodDefinition, tType);

		// collect translated elements
		Object[] result2_black = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_1_2_blackB(extendedType);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_1_2_greenFB(extendedType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_1_3_blackBBBBBBBBBB(ruleresult,
						jMethodName, tMethodDefinition, jMethod,
						jMethodToTMethodDefinition, extendedType, jType, tType,
						jTypeToTType, extendedParameterList);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_1_3_greenBBBBBBFFF(ruleresult,
						tMethodDefinition, jMethod, extendedType, jType, tType);
		// EMoflonEdge tMethodDefinition__tType____returnType = (EMoflonEdge) result3_green[6];
		// EMoflonEdge jMethod__extendedType____extendedReturnType = (EMoflonEdge) result3_green[7];
		// EMoflonEdge extendedType__jType____type = (EMoflonEdge) result3_green[8];

		// perform postprocessing story node is empty
		// register objects
		ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_1_5_expressionBBBBBBBBBBB(this,
						ruleresult, jMethodName, tMethodDefinition, jMethod,
						jMethodToTMethodDefinition, extendedType, jType, tType,
						jTypeToTType, extendedParameterList);
		return ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		ExtendedMethodName jMethodName = (ExtendedMethodName) result2_binding[0];
		ExtendedClassMethod jMethod = (ExtendedClassMethod) result2_binding[1];
		ExtendedType extendedType = (ExtendedType) result2_binding[2];
		org.emftext.language.java.classifiers.Class jType = (org.emftext.language.java.classifiers.Class) result2_binding[3];
		ExtendedParameterList extendedParameterList = (ExtendedParameterList) result2_binding[4];
		for (Object[] result2_black : ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_2_2_blackBFBFBBFFBB(jMethodName,
						jMethod, extendedType, jType, extendedParameterList,
						match)) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_black[1];
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result2_black[3];
			TClass tType = (TClass) result2_black[6];
			ClassToTClass jTypeToTType = (ClassToTClass) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_2_3_blackBBBBBBBBB(
							jMethodName, tMethodDefinition, jMethod,
							jMethodToTMethodDefinition, extendedType, jType,
							tType, jTypeToTType, extendedParameterList)) {
				Object[] result3_green = ReturnTypeUserDefinedImpl
						.pattern_ReturnTypeUserDefined_2_3_greenBBBBBBBBBFFFFFFFFFFF(
								jMethodName, tMethodDefinition, jMethod,
								jMethodToTMethodDefinition, extendedType,
								jType, tType, jTypeToTType,
								extendedParameterList);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge jMethodName__jMethod____extendedClassMethod = (EMoflonEdge) result3_green[10];
				// EMoflonEdge jMethod__jMethodName____extendedMethodName = (EMoflonEdge) result3_green[11];
				// EMoflonEdge jMethod__extendedType____extendedReturnType = (EMoflonEdge) result3_green[12];
				// EMoflonEdge jMethodToTMethodDefinition__tMethodDefinition____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge jMethodToTMethodDefinition__jMethod____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge extendedType__jType____type = (EMoflonEdge) result3_green[15];
				// EMoflonEdge jTypeToTType__jType____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge jTypeToTType__tType____target = (EMoflonEdge) result3_green[17];
				// EMoflonEdge extendedParameterList__jMethod____methods = (EMoflonEdge) result3_green[18];
				// EMoflonEdge jMethod__extendedParameterList____parameter_list = (EMoflonEdge) result3_green[19];

				// solve CSP
				Object[] result4_bindingAndBlack = ReturnTypeUserDefinedImpl
						.pattern_ReturnTypeUserDefined_2_4_bindingAndBlackFBBBBBBBBBBB(
								this, isApplicableMatch, jMethodName,
								tMethodDefinition, jMethod,
								jMethodToTMethodDefinition, extendedType,
								jType, tType, jTypeToTType,
								extendedParameterList);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ReturnTypeUserDefinedImpl
						.pattern_ReturnTypeUserDefined_2_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = ReturnTypeUserDefinedImpl
							.pattern_ReturnTypeUserDefined_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ReturnTypeUserDefinedImpl
							.pattern_ReturnTypeUserDefined_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			ExtendedMethodName jMethodName, ExtendedClassMethod jMethod,
			ExtendedType extendedType,
			org.emftext.language.java.classifiers.Class jType,
			ExtendedParameterList extendedParameterList) {
		match.registerObject("jMethodName", jMethodName);
		match.registerObject("jMethod", jMethod);
		match.registerObject("extendedType", extendedType);
		match.registerObject("jType", jType);
		match.registerObject("extendedParameterList", extendedParameterList);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			ExtendedMethodName jMethodName, ExtendedClassMethod jMethod,
			ExtendedType extendedType,
			org.emftext.language.java.classifiers.Class jType,
			ExtendedParameterList extendedParameterList) {// Create CSP
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
			ExtendedMethodName jMethodName,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			ExtendedType extendedType,
			org.emftext.language.java.classifiers.Class jType, TClass tType,
			ClassToTClass jTypeToTType,
			ExtendedParameterList extendedParameterList) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jMethodName", jMethodName);
		isApplicableMatch
				.registerObject("tMethodDefinition", tMethodDefinition);
		isApplicableMatch.registerObject("jMethod", jMethod);
		isApplicableMatch.registerObject("jMethodToTMethodDefinition",
				jMethodToTMethodDefinition);
		isApplicableMatch.registerObject("extendedType", extendedType);
		isApplicableMatch.registerObject("jType", jType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("jTypeToTType", jTypeToTType);
		isApplicableMatch.registerObject("extendedParameterList",
				extendedParameterList);
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
			EObject jMethodName, EObject tMethodDefinition, EObject jMethod,
			EObject jMethodToTMethodDefinition, EObject extendedType,
			EObject jType, EObject tType, EObject jTypeToTType,
			EObject extendedParameterList) {
		ruleresult.registerObject("jMethodName", jMethodName);
		ruleresult.registerObject("tMethodDefinition", tMethodDefinition);
		ruleresult.registerObject("jMethod", jMethod);
		ruleresult.registerObject("jMethodToTMethodDefinition",
				jMethodToTMethodDefinition);
		ruleresult.registerObject("extendedType", extendedType);
		ruleresult.registerObject("jType", jType);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("jTypeToTType", jTypeToTType);
		ruleresult.registerObject("extendedParameterList",
				extendedParameterList);

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
	public boolean isAppropriate_BWD(Match match,
			TMethodDefinition tMethodDefinition, TClass tType) {
		// initial bindings
		Object[] result1_black = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_10_1_blackBBBB(this, match,
						tMethodDefinition, tType);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_10_2_bindingAndBlackFBBBB(this,
						match, tMethodDefinition, tType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_10_4_blackBBB(match,
							tMethodDefinition, tType);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_10_4_greenBBBF(match,
							tMethodDefinition, tType);
			// EMoflonEdge tMethodDefinition__tType____returnType = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_10_5_blackBBB(match,
							tMethodDefinition, tType);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_10_5_greenBBB(match,
							tMethodDefinition, tType);

			// register objects to match
			ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_10_6_expressionBBBB(this,
							match, tMethodDefinition, tType);
			return ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_10_7_expressionF();
		} else {
			return ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_11_1_bindingAndBlackFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedMethodName jMethodName = (ExtendedMethodName) result1_bindingAndBlack[0];
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result1_bindingAndBlack[1];
		ExtendedClassMethod jMethod = (ExtendedClassMethod) result1_bindingAndBlack[2];
		ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result1_bindingAndBlack[3];
		org.emftext.language.java.classifiers.Class jType = (org.emftext.language.java.classifiers.Class) result1_bindingAndBlack[4];
		TClass tType = (TClass) result1_bindingAndBlack[5];
		ClassToTClass jTypeToTType = (ClassToTClass) result1_bindingAndBlack[6];
		ExtendedParameterList extendedParameterList = (ExtendedParameterList) result1_bindingAndBlack[7];
		// CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_11_1_greenBFB(jMethod, jType);
		ExtendedType extendedType = (ExtendedType) result1_green[1];

		// collect translated elements
		Object[] result2_black = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_11_2_blackB(extendedType);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_11_2_greenFB(extendedType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_11_3_blackBBBBBBBBBB(ruleresult,
						jMethodName, tMethodDefinition, jMethod,
						jMethodToTMethodDefinition, extendedType, jType, tType,
						jTypeToTType, extendedParameterList);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_11_3_greenBBBBBBFFF(ruleresult,
						tMethodDefinition, jMethod, extendedType, jType, tType);
		// EMoflonEdge tMethodDefinition__tType____returnType = (EMoflonEdge) result3_green[6];
		// EMoflonEdge jMethod__extendedType____extendedReturnType = (EMoflonEdge) result3_green[7];
		// EMoflonEdge extendedType__jType____type = (EMoflonEdge) result3_green[8];

		// perform postprocessing story node is empty
		// register objects
		ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_11_5_expressionBBBBBBBBBBB(this,
						ruleresult, jMethodName, tMethodDefinition, jMethod,
						jMethodToTMethodDefinition, extendedType, jType, tType,
						jTypeToTType, extendedParameterList);
		return ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_binding[0];
		TClass tType = (TClass) result2_binding[1];
		for (Object[] result2_black : ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_12_2_blackBFFFBFB(
						tMethodDefinition, tType, match)) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result2_black[1];
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result2_black[2];
			org.emftext.language.java.classifiers.Class jType = (org.emftext.language.java.classifiers.Class) result2_black[3];
			ClassToTClass jTypeToTType = (ClassToTClass) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_12_3_blackFBBBBBBF(
							tMethodDefinition, jMethod,
							jMethodToTMethodDefinition, jType, tType,
							jTypeToTType)) {
				ExtendedMethodName jMethodName = (ExtendedMethodName) result3_black[0];
				ExtendedParameterList extendedParameterList = (ExtendedParameterList) result3_black[7];
				Object[] result3_green = ReturnTypeUserDefinedImpl
						.pattern_ReturnTypeUserDefined_12_3_greenBBBBBBBBFFFFFFFFFF(
								jMethodName, tMethodDefinition, jMethod,
								jMethodToTMethodDefinition, jType, tType,
								jTypeToTType, extendedParameterList);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge jMethodName__jMethod____extendedClassMethod = (EMoflonEdge) result3_green[9];
				// EMoflonEdge jMethod__jMethodName____extendedMethodName = (EMoflonEdge) result3_green[10];
				// EMoflonEdge tMethodDefinition__tType____returnType = (EMoflonEdge) result3_green[11];
				// EMoflonEdge jMethodToTMethodDefinition__tMethodDefinition____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge jMethodToTMethodDefinition__jMethod____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge jTypeToTType__jType____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge jTypeToTType__tType____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge extendedParameterList__jMethod____methods = (EMoflonEdge) result3_green[16];
				// EMoflonEdge jMethod__extendedParameterList____parameter_list = (EMoflonEdge) result3_green[17];

				// solve CSP
				Object[] result4_bindingAndBlack = ReturnTypeUserDefinedImpl
						.pattern_ReturnTypeUserDefined_12_4_bindingAndBlackFBBBBBBBBBB(
								this, isApplicableMatch, jMethodName,
								tMethodDefinition, jMethod,
								jMethodToTMethodDefinition, jType, tType,
								jTypeToTType, extendedParameterList);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ReturnTypeUserDefinedImpl
						.pattern_ReturnTypeUserDefined_12_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = ReturnTypeUserDefinedImpl
							.pattern_ReturnTypeUserDefined_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ReturnTypeUserDefinedImpl
							.pattern_ReturnTypeUserDefined_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			TMethodDefinition tMethodDefinition, TClass tType) {
		match.registerObject("tMethodDefinition", tMethodDefinition);
		match.registerObject("tType", tType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			TMethodDefinition tMethodDefinition, TClass tType) {// Create CSP
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
			ExtendedMethodName jMethodName,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			org.emftext.language.java.classifiers.Class jType, TClass tType,
			ClassToTClass jTypeToTType,
			ExtendedParameterList extendedParameterList) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jMethodName", jMethodName);
		isApplicableMatch
				.registerObject("tMethodDefinition", tMethodDefinition);
		isApplicableMatch.registerObject("jMethod", jMethod);
		isApplicableMatch.registerObject("jMethodToTMethodDefinition",
				jMethodToTMethodDefinition);
		isApplicableMatch.registerObject("jType", jType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("jTypeToTType", jTypeToTType);
		isApplicableMatch.registerObject("extendedParameterList",
				extendedParameterList);
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
			EObject jMethodName, EObject tMethodDefinition, EObject jMethod,
			EObject jMethodToTMethodDefinition, EObject extendedType,
			EObject jType, EObject tType, EObject jTypeToTType,
			EObject extendedParameterList) {
		ruleresult.registerObject("jMethodName", jMethodName);
		ruleresult.registerObject("tMethodDefinition", tMethodDefinition);
		ruleresult.registerObject("jMethod", jMethod);
		ruleresult.registerObject("jMethodToTMethodDefinition",
				jMethodToTMethodDefinition);
		ruleresult.registerObject("extendedType", extendedType);
		ruleresult.registerObject("jType", jType);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("jTypeToTType", jTypeToTType);
		ruleresult.registerObject("extendedParameterList",
				extendedParameterList);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_36(
			EMoflonEdge _edge_returnType) {
		// prepare return value
		Object[] result1_bindingAndBlack = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_20_2_blackFFB(_edge_returnType)) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_black[0];
			TClass tType = (TClass) result2_black[1];
			Object[] result2_green = ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_20_3_expressionFBBBB(this,
							match, tMethodDefinition, tType)) {
				// Ensure that the correct types of elements are matched
				if (ReturnTypeUserDefinedImpl
						.pattern_ReturnTypeUserDefined_20_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ReturnTypeUserDefinedImpl
							.pattern_ReturnTypeUserDefined_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ReturnTypeUserDefinedImpl
							.pattern_ReturnTypeUserDefined_20_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_27(
			EMoflonEdge _edge_extendedReturnType) {
		// prepare return value
		Object[] result1_bindingAndBlack = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_21_2_blackFFFFFB(_edge_extendedReturnType)) {
			ExtendedMethodName jMethodName = (ExtendedMethodName) result2_black[0];
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result2_black[1];
			ExtendedType extendedType = (ExtendedType) result2_black[2];
			org.emftext.language.java.classifiers.Class jType = (org.emftext.language.java.classifiers.Class) result2_black[3];
			ExtendedParameterList extendedParameterList = (ExtendedParameterList) result2_black[4];
			Object[] result2_green = ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_21_3_expressionFBBBBBBB(
							this, match, jMethodName, jMethod, extendedType,
							jType, extendedParameterList)) {
				// Ensure that the correct types of elements are matched
				if (ReturnTypeUserDefinedImpl
						.pattern_ReturnTypeUserDefined_21_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ReturnTypeUserDefinedImpl
							.pattern_ReturnTypeUserDefined_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ReturnTypeUserDefinedImpl
							.pattern_ReturnTypeUserDefined_21_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_28(
			EMoflonEdge _edge_type) {
		// prepare return value
		Object[] result1_bindingAndBlack = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_22_2_blackFFFFFB(_edge_type)) {
			ExtendedMethodName jMethodName = (ExtendedMethodName) result2_black[0];
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result2_black[1];
			ExtendedType extendedType = (ExtendedType) result2_black[2];
			org.emftext.language.java.classifiers.Class jType = (org.emftext.language.java.classifiers.Class) result2_black[3];
			ExtendedParameterList extendedParameterList = (ExtendedParameterList) result2_black[4];
			Object[] result2_green = ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ReturnTypeUserDefinedImpl
					.pattern_ReturnTypeUserDefined_22_3_expressionFBBBBBBB(
							this, match, jMethodName, jMethod, extendedType,
							jType, extendedParameterList)) {
				// Ensure that the correct types of elements are matched
				if (ReturnTypeUserDefinedImpl
						.pattern_ReturnTypeUserDefined_22_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ReturnTypeUserDefinedImpl
							.pattern_ReturnTypeUserDefined_22_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ReturnTypeUserDefinedImpl
							.pattern_ReturnTypeUserDefined_22_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ReturnTypeUserDefinedImpl
				.pattern_ReturnTypeUserDefined_22_6_expressionFB(__result);
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
		case RulesPackage.RETURN_TYPE_USER_DEFINED___IS_APPROPRIATE_FWD__MATCH_EXTENDEDMETHODNAME_EXTENDEDCLASSMETHOD_EXTENDEDTYPE_CLASS_EXTENDEDPARAMETERLIST:
			return isAppropriate_FWD((Match) arguments.get(0),
					(ExtendedMethodName) arguments.get(1),
					(ExtendedClassMethod) arguments.get(2),
					(ExtendedType) arguments.get(3),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(4), (ExtendedParameterList) arguments.get(5));
		case RulesPackage.RETURN_TYPE_USER_DEFINED___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.RETURN_TYPE_USER_DEFINED___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.RETURN_TYPE_USER_DEFINED___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDMETHODNAME_EXTENDEDCLASSMETHOD_EXTENDEDTYPE_CLASS_EXTENDEDPARAMETERLIST:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(ExtendedMethodName) arguments.get(1),
					(ExtendedClassMethod) arguments.get(2),
					(ExtendedType) arguments.get(3),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(4), (ExtendedParameterList) arguments.get(5));
			return null;
		case RulesPackage.RETURN_TYPE_USER_DEFINED___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDMETHODNAME_EXTENDEDCLASSMETHOD_EXTENDEDTYPE_CLASS_EXTENDEDPARAMETERLIST:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(ExtendedMethodName) arguments.get(1),
					(ExtendedClassMethod) arguments.get(2),
					(ExtendedType) arguments.get(3),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(4), (ExtendedParameterList) arguments.get(5));
		case RulesPackage.RETURN_TYPE_USER_DEFINED___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.RETURN_TYPE_USER_DEFINED___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDMETHODNAME_TMETHODDEFINITION_EXTENDEDCLASSMETHOD_CLASSMETHODTOTMETHODDEFINITION_EXTENDEDTYPE_CLASS_TCLASS_CLASSTOTCLASS_EXTENDEDPARAMETERLIST:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedMethodName) arguments.get(1),
					(TMethodDefinition) arguments.get(2),
					(ExtendedClassMethod) arguments.get(3),
					(ClassMethodToTMethodDefinition) arguments.get(4),
					(ExtendedType) arguments.get(5),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(6), (TClass) arguments.get(7),
					(ClassToTClass) arguments.get(8),
					(ExtendedParameterList) arguments.get(9));
		case RulesPackage.RETURN_TYPE_USER_DEFINED___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.RETURN_TYPE_USER_DEFINED___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9));
			return null;
		case RulesPackage.RETURN_TYPE_USER_DEFINED___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.RETURN_TYPE_USER_DEFINED___IS_APPROPRIATE_BWD__MATCH_TMETHODDEFINITION_TCLASS:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TMethodDefinition) arguments.get(1),
					(TClass) arguments.get(2));
		case RulesPackage.RETURN_TYPE_USER_DEFINED___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.RETURN_TYPE_USER_DEFINED___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.RETURN_TYPE_USER_DEFINED___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODDEFINITION_TCLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TMethodDefinition) arguments.get(1),
					(TClass) arguments.get(2));
			return null;
		case RulesPackage.RETURN_TYPE_USER_DEFINED___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODDEFINITION_TCLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TMethodDefinition) arguments.get(1),
					(TClass) arguments.get(2));
		case RulesPackage.RETURN_TYPE_USER_DEFINED___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.RETURN_TYPE_USER_DEFINED___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXTENDEDMETHODNAME_TMETHODDEFINITION_EXTENDEDCLASSMETHOD_CLASSMETHODTOTMETHODDEFINITION_CLASS_TCLASS_CLASSTOTCLASS_EXTENDEDPARAMETERLIST:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedMethodName) arguments.get(1),
					(TMethodDefinition) arguments.get(2),
					(ExtendedClassMethod) arguments.get(3),
					(ClassMethodToTMethodDefinition) arguments.get(4),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(5), (TClass) arguments.get(6),
					(ClassToTClass) arguments.get(7),
					(ExtendedParameterList) arguments.get(8));
		case RulesPackage.RETURN_TYPE_USER_DEFINED___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.RETURN_TYPE_USER_DEFINED___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9));
			return null;
		case RulesPackage.RETURN_TYPE_USER_DEFINED___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.RETURN_TYPE_USER_DEFINED___IS_APPROPRIATE_BWD_EMOFLON_EDGE_36__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_36((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.RETURN_TYPE_USER_DEFINED___IS_APPROPRIATE_FWD_EMOFLON_EDGE_27__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_27((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.RETURN_TYPE_USER_DEFINED___IS_APPROPRIATE_FWD_EMOFLON_EDGE_28__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_28((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.RETURN_TYPE_USER_DEFINED___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.RETURN_TYPE_USER_DEFINED___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ReturnTypeUserDefined_0_1_blackBBBBBBB(
			ReturnTypeUserDefined _this, Match match,
			ExtendedMethodName jMethodName, ExtendedClassMethod jMethod,
			ExtendedType extendedType,
			org.emftext.language.java.classifiers.Class jType,
			ExtendedParameterList extendedParameterList) {
		return new Object[] { _this, match, jMethodName, jMethod, extendedType,
				jType, extendedParameterList };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_0_2_bindingFBBBBBBB(
			ReturnTypeUserDefined _this, Match match,
			ExtendedMethodName jMethodName, ExtendedClassMethod jMethod,
			ExtendedType extendedType,
			org.emftext.language.java.classifiers.Class jType,
			ExtendedParameterList extendedParameterList) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				jMethodName, jMethod, extendedType, jType,
				extendedParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jMethodName, jMethod,
					extendedType, jType, extendedParameterList };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_0_2_bindingAndBlackFBBBBBBB(
			ReturnTypeUserDefined _this, Match match,
			ExtendedMethodName jMethodName, ExtendedClassMethod jMethod,
			ExtendedType extendedType,
			org.emftext.language.java.classifiers.Class jType,
			ExtendedParameterList extendedParameterList) {
		Object[] result_pattern_ReturnTypeUserDefined_0_2_binding = pattern_ReturnTypeUserDefined_0_2_bindingFBBBBBBB(
				_this, match, jMethodName, jMethod, extendedType, jType,
				extendedParameterList);
		if (result_pattern_ReturnTypeUserDefined_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ReturnTypeUserDefined_0_2_binding[0];

			Object[] result_pattern_ReturnTypeUserDefined_0_2_black = pattern_ReturnTypeUserDefined_0_2_blackB(csp);
			if (result_pattern_ReturnTypeUserDefined_0_2_black != null) {

				return new Object[] { csp, _this, match, jMethodName, jMethod,
						extendedType, jType, extendedParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_ReturnTypeUserDefined_0_3_expressionFBB(
			ReturnTypeUserDefined _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_0_4_blackBBBBBB(
			Match match, ExtendedMethodName jMethodName,
			ExtendedClassMethod jMethod, ExtendedType extendedType,
			org.emftext.language.java.classifiers.Class jType,
			ExtendedParameterList extendedParameterList) {
		return new Object[] { match, jMethodName, jMethod, extendedType, jType,
				extendedParameterList };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_0_4_greenBBBBFF(
			Match match, ExtendedClassMethod jMethod,
			ExtendedType extendedType,
			org.emftext.language.java.classifiers.Class jType) {
		EMoflonEdge jMethod__extendedType____extendedReturnType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedType__jType____type = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(extendedType);
		String jMethod__extendedType____extendedReturnType_name_prime = "extendedReturnType";
		String extendedType__jType____type_name_prime = "type";
		jMethod__extendedType____extendedReturnType.setSrc(jMethod);
		jMethod__extendedType____extendedReturnType.setTrg(extendedType);
		match.getToBeTranslatedEdges().add(
				jMethod__extendedType____extendedReturnType);
		extendedType__jType____type.setSrc(extendedType);
		extendedType__jType____type.setTrg(jType);
		match.getToBeTranslatedEdges().add(extendedType__jType____type);
		jMethod__extendedType____extendedReturnType
				.setName(jMethod__extendedType____extendedReturnType_name_prime);
		extendedType__jType____type
				.setName(extendedType__jType____type_name_prime);
		return new Object[] { match, jMethod, extendedType, jType,
				jMethod__extendedType____extendedReturnType,
				extendedType__jType____type };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_0_5_blackBBBBBB(
			Match match, ExtendedMethodName jMethodName,
			ExtendedClassMethod jMethod, ExtendedType extendedType,
			org.emftext.language.java.classifiers.Class jType,
			ExtendedParameterList extendedParameterList) {
		return new Object[] { match, jMethodName, jMethod, extendedType, jType,
				extendedParameterList };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_0_5_greenBBBBBFFFF(
			Match match, ExtendedMethodName jMethodName,
			ExtendedClassMethod jMethod,
			org.emftext.language.java.classifiers.Class jType,
			ExtendedParameterList extendedParameterList) {
		EMoflonEdge jMethodName__jMethod____extendedClassMethod = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__jMethodName____extendedMethodName = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedParameterList__jMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__extendedParameterList____parameter_list = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(jMethodName);
		match.getContextNodes().add(jMethod);
		match.getContextNodes().add(jType);
		match.getContextNodes().add(extendedParameterList);
		String jMethodName__jMethod____extendedClassMethod_name_prime = "extendedClassMethod";
		String jMethod__jMethodName____extendedMethodName_name_prime = "extendedMethodName";
		String extendedParameterList__jMethod____methods_name_prime = "methods";
		String jMethod__extendedParameterList____parameter_list_name_prime = "parameter_list";
		jMethodName__jMethod____extendedClassMethod.setSrc(jMethodName);
		jMethodName__jMethod____extendedClassMethod.setTrg(jMethod);
		match.getContextEdges()
				.add(jMethodName__jMethod____extendedClassMethod);
		jMethod__jMethodName____extendedMethodName.setSrc(jMethod);
		jMethod__jMethodName____extendedMethodName.setTrg(jMethodName);
		match.getContextEdges().add(jMethod__jMethodName____extendedMethodName);
		extendedParameterList__jMethod____methods.setSrc(extendedParameterList);
		extendedParameterList__jMethod____methods.setTrg(jMethod);
		match.getContextEdges().add(extendedParameterList__jMethod____methods);
		jMethod__extendedParameterList____parameter_list.setSrc(jMethod);
		jMethod__extendedParameterList____parameter_list
				.setTrg(extendedParameterList);
		match.getContextEdges().add(
				jMethod__extendedParameterList____parameter_list);
		jMethodName__jMethod____extendedClassMethod
				.setName(jMethodName__jMethod____extendedClassMethod_name_prime);
		jMethod__jMethodName____extendedMethodName
				.setName(jMethod__jMethodName____extendedMethodName_name_prime);
		extendedParameterList__jMethod____methods
				.setName(extendedParameterList__jMethod____methods_name_prime);
		jMethod__extendedParameterList____parameter_list
				.setName(jMethod__extendedParameterList____parameter_list_name_prime);
		return new Object[] { match, jMethodName, jMethod, jType,
				extendedParameterList,
				jMethodName__jMethod____extendedClassMethod,
				jMethod__jMethodName____extendedMethodName,
				extendedParameterList__jMethod____methods,
				jMethod__extendedParameterList____parameter_list };
	}

	public static final void pattern_ReturnTypeUserDefined_0_6_expressionBBBBBBB(
			ReturnTypeUserDefined _this, Match match,
			ExtendedMethodName jMethodName, ExtendedClassMethod jMethod,
			ExtendedType extendedType,
			org.emftext.language.java.classifiers.Class jType,
			ExtendedParameterList extendedParameterList) {
		_this.registerObjectsToMatch_FWD(match, jMethodName, jMethod,
				extendedType, jType, extendedParameterList);

	}

	public static final boolean pattern_ReturnTypeUserDefined_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ReturnTypeUserDefined_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_1_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jMethodName");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("tMethodDefinition");
		EObject _localVariable_2 = isApplicableMatch.getObject("jMethod");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("jMethodToTMethodDefinition");
		EObject _localVariable_4 = isApplicableMatch.getObject("extendedType");
		EObject _localVariable_5 = isApplicableMatch.getObject("jType");
		EObject _localVariable_6 = isApplicableMatch.getObject("tType");
		EObject _localVariable_7 = isApplicableMatch.getObject("jTypeToTType");
		EObject _localVariable_8 = isApplicableMatch
				.getObject("extendedParameterList");
		EObject tmpJMethodName = _localVariable_0;
		EObject tmpTMethodDefinition = _localVariable_1;
		EObject tmpJMethod = _localVariable_2;
		EObject tmpJMethodToTMethodDefinition = _localVariable_3;
		EObject tmpExtendedType = _localVariable_4;
		EObject tmpJType = _localVariable_5;
		EObject tmpTType = _localVariable_6;
		EObject tmpJTypeToTType = _localVariable_7;
		EObject tmpExtendedParameterList = _localVariable_8;
		if (tmpJMethodName instanceof ExtendedMethodName) {
			ExtendedMethodName jMethodName = (ExtendedMethodName) tmpJMethodName;
			if (tmpTMethodDefinition instanceof TMethodDefinition) {
				TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
				if (tmpJMethod instanceof ExtendedClassMethod) {
					ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
					if (tmpJMethodToTMethodDefinition instanceof ClassMethodToTMethodDefinition) {
						ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) tmpJMethodToTMethodDefinition;
						if (tmpExtendedType instanceof ExtendedType) {
							ExtendedType extendedType = (ExtendedType) tmpExtendedType;
							if (tmpJType instanceof org.emftext.language.java.classifiers.Class) {
								org.emftext.language.java.classifiers.Class jType = (org.emftext.language.java.classifiers.Class) tmpJType;
								if (tmpTType instanceof TClass) {
									TClass tType = (TClass) tmpTType;
									if (tmpJTypeToTType instanceof ClassToTClass) {
										ClassToTClass jTypeToTType = (ClassToTClass) tmpJTypeToTType;
										if (tmpExtendedParameterList instanceof ExtendedParameterList) {
											ExtendedParameterList extendedParameterList = (ExtendedParameterList) tmpExtendedParameterList;
											return new Object[] { jMethodName,
													tMethodDefinition, jMethod,
													jMethodToTMethodDefinition,
													extendedType, jType, tType,
													jTypeToTType,
													extendedParameterList,
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

	public static final Object[] pattern_ReturnTypeUserDefined_1_1_blackBBBBBBBBBFBB(
			ExtendedMethodName jMethodName,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			ExtendedType extendedType,
			org.emftext.language.java.classifiers.Class jType, TClass tType,
			ClassToTClass jTypeToTType,
			ExtendedParameterList extendedParameterList,
			ReturnTypeUserDefined _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jMethodName, tMethodDefinition, jMethod,
						jMethodToTMethodDefinition, extendedType, jType, tType,
						jTypeToTType, extendedParameterList, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_1_1_bindingAndBlackFFFFFFFFFFBB(
			ReturnTypeUserDefined _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ReturnTypeUserDefined_1_1_binding = pattern_ReturnTypeUserDefined_1_1_bindingFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ReturnTypeUserDefined_1_1_binding != null) {
			ExtendedMethodName jMethodName = (ExtendedMethodName) result_pattern_ReturnTypeUserDefined_1_1_binding[0];
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result_pattern_ReturnTypeUserDefined_1_1_binding[1];
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result_pattern_ReturnTypeUserDefined_1_1_binding[2];
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result_pattern_ReturnTypeUserDefined_1_1_binding[3];
			ExtendedType extendedType = (ExtendedType) result_pattern_ReturnTypeUserDefined_1_1_binding[4];
			org.emftext.language.java.classifiers.Class jType = (org.emftext.language.java.classifiers.Class) result_pattern_ReturnTypeUserDefined_1_1_binding[5];
			TClass tType = (TClass) result_pattern_ReturnTypeUserDefined_1_1_binding[6];
			ClassToTClass jTypeToTType = (ClassToTClass) result_pattern_ReturnTypeUserDefined_1_1_binding[7];
			ExtendedParameterList extendedParameterList = (ExtendedParameterList) result_pattern_ReturnTypeUserDefined_1_1_binding[8];

			Object[] result_pattern_ReturnTypeUserDefined_1_1_black = pattern_ReturnTypeUserDefined_1_1_blackBBBBBBBBBFBB(
					jMethodName, tMethodDefinition, jMethod,
					jMethodToTMethodDefinition, extendedType, jType, tType,
					jTypeToTType, extendedParameterList, _this,
					isApplicableMatch);
			if (result_pattern_ReturnTypeUserDefined_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ReturnTypeUserDefined_1_1_black[9];

				return new Object[] { jMethodName, tMethodDefinition, jMethod,
						jMethodToTMethodDefinition, extendedType, jType, tType,
						jTypeToTType, extendedParameterList, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_1_1_greenBB(
			TMethodDefinition tMethodDefinition, TClass tType) {
		tMethodDefinition.setReturnType(tType);
		return new Object[] { tMethodDefinition, tType };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_1_2_blackB(
			ExtendedType extendedType) {
		return new Object[] { extendedType };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_1_2_greenFB(
			ExtendedType extendedType) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(extendedType);
		return new Object[] { ruleresult, extendedType };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_1_3_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject jMethodName,
			EObject tMethodDefinition, EObject jMethod,
			EObject jMethodToTMethodDefinition, EObject extendedType,
			EObject jType, EObject tType, EObject jTypeToTType,
			EObject extendedParameterList) {
		if (!jMethodName.equals(tMethodDefinition)) {
			if (!jMethodName.equals(jMethodToTMethodDefinition)) {
				if (!jMethodName.equals(jType)) {
					if (!jMethodName.equals(tType)) {
						if (!jMethodName.equals(jTypeToTType)) {
							if (!tMethodDefinition.equals(tType)) {
								if (!jMethod.equals(jMethodName)) {
									if (!jMethod.equals(tMethodDefinition)) {
										if (!jMethod
												.equals(jMethodToTMethodDefinition)) {
											if (!jMethod.equals(jType)) {
												if (!jMethod.equals(tType)) {
													if (!jMethod
															.equals(jTypeToTType)) {
														if (!jMethodToTMethodDefinition
																.equals(tMethodDefinition)) {
															if (!jMethodToTMethodDefinition
																	.equals(jType)) {
																if (!jMethodToTMethodDefinition
																		.equals(tType)) {
																	if (!jMethodToTMethodDefinition
																			.equals(jTypeToTType)) {
																		if (!extendedType
																				.equals(jMethodName)) {
																			if (!extendedType
																					.equals(tMethodDefinition)) {
																				if (!extendedType
																						.equals(jMethod)) {
																					if (!extendedType
																							.equals(jMethodToTMethodDefinition)) {
																						if (!extendedType
																								.equals(jType)) {
																							if (!extendedType
																									.equals(tType)) {
																								if (!extendedType
																										.equals(jTypeToTType)) {
																									if (!jType
																											.equals(tMethodDefinition)) {
																										if (!jType
																												.equals(tType)) {
																											if (!jType
																													.equals(jTypeToTType)) {
																												if (!jTypeToTType
																														.equals(tMethodDefinition)) {
																													if (!jTypeToTType
																															.equals(tType)) {
																														if (!extendedParameterList
																																.equals(jMethodName)) {
																															if (!extendedParameterList
																																	.equals(tMethodDefinition)) {
																																if (!extendedParameterList
																																		.equals(jMethod)) {
																																	if (!extendedParameterList
																																			.equals(jMethodToTMethodDefinition)) {
																																		if (!extendedParameterList
																																				.equals(extendedType)) {
																																			if (!extendedParameterList
																																					.equals(jType)) {
																																				if (!extendedParameterList
																																						.equals(tType)) {
																																					if (!extendedParameterList
																																							.equals(jTypeToTType)) {
																																						return new Object[] {
																																								ruleresult,
																																								jMethodName,
																																								tMethodDefinition,
																																								jMethod,
																																								jMethodToTMethodDefinition,
																																								extendedType,
																																								jType,
																																								tType,
																																								jTypeToTType,
																																								extendedParameterList };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ReturnTypeUserDefined_1_3_greenBBBBBBFFF(
			PerformRuleResult ruleresult, EObject tMethodDefinition,
			EObject jMethod, EObject extendedType, EObject jType, EObject tType) {
		EMoflonEdge tMethodDefinition__tType____returnType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__extendedType____extendedReturnType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedType__jType____type = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ReturnTypeUserDefined";
		String tMethodDefinition__tType____returnType_name_prime = "returnType";
		String jMethod__extendedType____extendedReturnType_name_prime = "extendedReturnType";
		String extendedType__jType____type_name_prime = "type";
		tMethodDefinition__tType____returnType.setSrc(tMethodDefinition);
		tMethodDefinition__tType____returnType.setTrg(tType);
		ruleresult.getCreatedEdges()
				.add(tMethodDefinition__tType____returnType);
		jMethod__extendedType____extendedReturnType.setSrc(jMethod);
		jMethod__extendedType____extendedReturnType.setTrg(extendedType);
		ruleresult.getTranslatedEdges().add(
				jMethod__extendedType____extendedReturnType);
		extendedType__jType____type.setSrc(extendedType);
		extendedType__jType____type.setTrg(jType);
		ruleresult.getTranslatedEdges().add(extendedType__jType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tMethodDefinition__tType____returnType
				.setName(tMethodDefinition__tType____returnType_name_prime);
		jMethod__extendedType____extendedReturnType
				.setName(jMethod__extendedType____extendedReturnType_name_prime);
		extendedType__jType____type
				.setName(extendedType__jType____type_name_prime);
		return new Object[] { ruleresult, tMethodDefinition, jMethod,
				extendedType, jType, tType,
				tMethodDefinition__tType____returnType,
				jMethod__extendedType____extendedReturnType,
				extendedType__jType____type };
	}

	public static final void pattern_ReturnTypeUserDefined_1_5_expressionBBBBBBBBBBB(
			ReturnTypeUserDefined _this, PerformRuleResult ruleresult,
			EObject jMethodName, EObject tMethodDefinition, EObject jMethod,
			EObject jMethodToTMethodDefinition, EObject extendedType,
			EObject jType, EObject tType, EObject jTypeToTType,
			EObject extendedParameterList) {
		_this.registerObjects_FWD(ruleresult, jMethodName, tMethodDefinition,
				jMethod, jMethodToTMethodDefinition, extendedType, jType,
				tType, jTypeToTType, extendedParameterList);

	}

	public static final PerformRuleResult pattern_ReturnTypeUserDefined_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_2_1_bindingFB(
			ReturnTypeUserDefined _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_2_1_blackFBB(
			EClass eClass, ReturnTypeUserDefined _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_2_1_bindingAndBlackFFB(
			ReturnTypeUserDefined _this) {
		Object[] result_pattern_ReturnTypeUserDefined_2_1_binding = pattern_ReturnTypeUserDefined_2_1_bindingFB(_this);
		if (result_pattern_ReturnTypeUserDefined_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ReturnTypeUserDefined_2_1_binding[0];

			Object[] result_pattern_ReturnTypeUserDefined_2_1_black = pattern_ReturnTypeUserDefined_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ReturnTypeUserDefined_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ReturnTypeUserDefined_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ReturnTypeUserDefined";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_2_2_bindingFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("jMethodName");
		EObject _localVariable_1 = match.getObject("jMethod");
		EObject _localVariable_2 = match.getObject("extendedType");
		EObject _localVariable_3 = match.getObject("jType");
		EObject _localVariable_4 = match.getObject("extendedParameterList");
		EObject tmpJMethodName = _localVariable_0;
		EObject tmpJMethod = _localVariable_1;
		EObject tmpExtendedType = _localVariable_2;
		EObject tmpJType = _localVariable_3;
		EObject tmpExtendedParameterList = _localVariable_4;
		if (tmpJMethodName instanceof ExtendedMethodName) {
			ExtendedMethodName jMethodName = (ExtendedMethodName) tmpJMethodName;
			if (tmpJMethod instanceof ExtendedClassMethod) {
				ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
				if (tmpExtendedType instanceof ExtendedType) {
					ExtendedType extendedType = (ExtendedType) tmpExtendedType;
					if (tmpJType instanceof org.emftext.language.java.classifiers.Class) {
						org.emftext.language.java.classifiers.Class jType = (org.emftext.language.java.classifiers.Class) tmpJType;
						if (tmpExtendedParameterList instanceof ExtendedParameterList) {
							ExtendedParameterList extendedParameterList = (ExtendedParameterList) tmpExtendedParameterList;
							return new Object[] { jMethodName, jMethod,
									extendedType, jType, extendedParameterList,
									match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ReturnTypeUserDefined_2_2_blackBFBFBBFFBB(
			ExtendedMethodName jMethodName, ExtendedClassMethod jMethod,
			ExtendedType extendedType,
			org.emftext.language.java.classifiers.Class jType,
			ExtendedParameterList extendedParameterList, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		boolean extendedTypeisFromLib = extendedType.isIsFromLib();
		if (Boolean.valueOf(extendedTypeisFromLib).equals(false)) {
			for (ClassMethodToTMethodDefinition jMethodToTMethodDefinition : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(jMethod,
							ClassMethodToTMethodDefinition.class, "source")) {
				TMethodDefinition tMethodDefinition = jMethodToTMethodDefinition
						.getTarget();
				if (tMethodDefinition != null) {
					for (ClassToTClass jTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(jType,
									ClassToTClass.class, "source")) {
						TClass tType = jTypeToTType.getTarget();
						if (tType != null) {
							_result.add(new Object[] { jMethodName,
									tMethodDefinition, jMethod,
									jMethodToTMethodDefinition, extendedType,
									jType, tType, jTypeToTType,
									extendedParameterList, match });
						}

					}
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_ReturnTypeUserDefined_2_3_blackBBBBBBBBB(
			ExtendedMethodName jMethodName,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			ExtendedType extendedType,
			org.emftext.language.java.classifiers.Class jType, TClass tType,
			ClassToTClass jTypeToTType,
			ExtendedParameterList extendedParameterList) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (jMethodName.getExtendedClassMethod().contains(jMethod)) {
			if (extendedType.equals(jMethod.getExtendedReturnType())) {
				if (tMethodDefinition.equals(jMethodToTMethodDefinition
						.getTarget())) {
					if (jMethod.equals(jMethodToTMethodDefinition.getSource())) {
						if (jType.equals(extendedType.getType())) {
							if (jType.equals(jTypeToTType.getSource())) {
								if (tType.equals(jTypeToTType.getTarget())) {
									if (extendedParameterList.getMethods()
											.contains(jMethod)) {
										boolean extendedTypeisFromLib = extendedType
												.isIsFromLib();
										if (Boolean.valueOf(
												extendedTypeisFromLib).equals(
												false)) {
											_result.add(new Object[] {
													jMethodName,
													tMethodDefinition, jMethod,
													jMethodToTMethodDefinition,
													extendedType, jType, tType,
													jTypeToTType,
													extendedParameterList });
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

	public static final Object[] pattern_ReturnTypeUserDefined_2_3_greenBBBBBBBBBFFFFFFFFFFF(
			ExtendedMethodName jMethodName,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			ExtendedType extendedType,
			org.emftext.language.java.classifiers.Class jType, TClass tType,
			ClassToTClass jTypeToTType,
			ExtendedParameterList extendedParameterList) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge jMethodName__jMethod____extendedClassMethod = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__jMethodName____extendedMethodName = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__extendedType____extendedReturnType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodDefinition__tMethodDefinition____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodDefinition__jMethod____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedType__jType____type = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jTypeToTType__jType____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jTypeToTType__tType____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedParameterList__jMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__extendedParameterList____parameter_list = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jMethodName__jMethod____extendedClassMethod_name_prime = "extendedClassMethod";
		String jMethod__jMethodName____extendedMethodName_name_prime = "extendedMethodName";
		String jMethod__extendedType____extendedReturnType_name_prime = "extendedReturnType";
		String jMethodToTMethodDefinition__tMethodDefinition____target_name_prime = "target";
		String jMethodToTMethodDefinition__jMethod____source_name_prime = "source";
		String extendedType__jType____type_name_prime = "type";
		String jTypeToTType__jType____source_name_prime = "source";
		String jTypeToTType__tType____target_name_prime = "target";
		String extendedParameterList__jMethod____methods_name_prime = "methods";
		String jMethod__extendedParameterList____parameter_list_name_prime = "parameter_list";
		isApplicableMatch.getAllContextElements().add(jMethodName);
		isApplicableMatch.getAllContextElements().add(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(jMethod);
		isApplicableMatch.getAllContextElements().add(
				jMethodToTMethodDefinition);
		isApplicableMatch.getAllContextElements().add(extendedType);
		isApplicableMatch.getAllContextElements().add(jType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(jTypeToTType);
		isApplicableMatch.getAllContextElements().add(extendedParameterList);
		jMethodName__jMethod____extendedClassMethod.setSrc(jMethodName);
		jMethodName__jMethod____extendedClassMethod.setTrg(jMethod);
		isApplicableMatch.getAllContextElements().add(
				jMethodName__jMethod____extendedClassMethod);
		jMethod__jMethodName____extendedMethodName.setSrc(jMethod);
		jMethod__jMethodName____extendedMethodName.setTrg(jMethodName);
		isApplicableMatch.getAllContextElements().add(
				jMethod__jMethodName____extendedMethodName);
		jMethod__extendedType____extendedReturnType.setSrc(jMethod);
		jMethod__extendedType____extendedReturnType.setTrg(extendedType);
		isApplicableMatch.getAllContextElements().add(
				jMethod__extendedType____extendedReturnType);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setSrc(jMethodToTMethodDefinition);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setTrg(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(
				jMethodToTMethodDefinition__tMethodDefinition____target);
		jMethodToTMethodDefinition__jMethod____source
				.setSrc(jMethodToTMethodDefinition);
		jMethodToTMethodDefinition__jMethod____source.setTrg(jMethod);
		isApplicableMatch.getAllContextElements().add(
				jMethodToTMethodDefinition__jMethod____source);
		extendedType__jType____type.setSrc(extendedType);
		extendedType__jType____type.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(
				extendedType__jType____type);
		jTypeToTType__jType____source.setSrc(jTypeToTType);
		jTypeToTType__jType____source.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(
				jTypeToTType__jType____source);
		jTypeToTType__tType____target.setSrc(jTypeToTType);
		jTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(
				jTypeToTType__tType____target);
		extendedParameterList__jMethod____methods.setSrc(extendedParameterList);
		extendedParameterList__jMethod____methods.setTrg(jMethod);
		isApplicableMatch.getAllContextElements().add(
				extendedParameterList__jMethod____methods);
		jMethod__extendedParameterList____parameter_list.setSrc(jMethod);
		jMethod__extendedParameterList____parameter_list
				.setTrg(extendedParameterList);
		isApplicableMatch.getAllContextElements().add(
				jMethod__extendedParameterList____parameter_list);
		jMethodName__jMethod____extendedClassMethod
				.setName(jMethodName__jMethod____extendedClassMethod_name_prime);
		jMethod__jMethodName____extendedMethodName
				.setName(jMethod__jMethodName____extendedMethodName_name_prime);
		jMethod__extendedType____extendedReturnType
				.setName(jMethod__extendedType____extendedReturnType_name_prime);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setName(jMethodToTMethodDefinition__tMethodDefinition____target_name_prime);
		jMethodToTMethodDefinition__jMethod____source
				.setName(jMethodToTMethodDefinition__jMethod____source_name_prime);
		extendedType__jType____type
				.setName(extendedType__jType____type_name_prime);
		jTypeToTType__jType____source
				.setName(jTypeToTType__jType____source_name_prime);
		jTypeToTType__tType____target
				.setName(jTypeToTType__tType____target_name_prime);
		extendedParameterList__jMethod____methods
				.setName(extendedParameterList__jMethod____methods_name_prime);
		jMethod__extendedParameterList____parameter_list
				.setName(jMethod__extendedParameterList____parameter_list_name_prime);
		return new Object[] { jMethodName, tMethodDefinition, jMethod,
				jMethodToTMethodDefinition, extendedType, jType, tType,
				jTypeToTType, extendedParameterList, isApplicableMatch,
				jMethodName__jMethod____extendedClassMethod,
				jMethod__jMethodName____extendedMethodName,
				jMethod__extendedType____extendedReturnType,
				jMethodToTMethodDefinition__tMethodDefinition____target,
				jMethodToTMethodDefinition__jMethod____source,
				extendedType__jType____type, jTypeToTType__jType____source,
				jTypeToTType__tType____target,
				extendedParameterList__jMethod____methods,
				jMethod__extendedParameterList____parameter_list };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_2_4_bindingFBBBBBBBBBBB(
			ReturnTypeUserDefined _this, IsApplicableMatch isApplicableMatch,
			ExtendedMethodName jMethodName,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			ExtendedType extendedType,
			org.emftext.language.java.classifiers.Class jType, TClass tType,
			ClassToTClass jTypeToTType,
			ExtendedParameterList extendedParameterList) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, jMethodName, tMethodDefinition, jMethod,
				jMethodToTMethodDefinition, extendedType, jType, tType,
				jTypeToTType, extendedParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jMethodName,
					tMethodDefinition, jMethod, jMethodToTMethodDefinition,
					extendedType, jType, tType, jTypeToTType,
					extendedParameterList };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_2_4_bindingAndBlackFBBBBBBBBBBB(
			ReturnTypeUserDefined _this, IsApplicableMatch isApplicableMatch,
			ExtendedMethodName jMethodName,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			ExtendedType extendedType,
			org.emftext.language.java.classifiers.Class jType, TClass tType,
			ClassToTClass jTypeToTType,
			ExtendedParameterList extendedParameterList) {
		Object[] result_pattern_ReturnTypeUserDefined_2_4_binding = pattern_ReturnTypeUserDefined_2_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, jMethodName, tMethodDefinition,
				jMethod, jMethodToTMethodDefinition, extendedType, jType,
				tType, jTypeToTType, extendedParameterList);
		if (result_pattern_ReturnTypeUserDefined_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ReturnTypeUserDefined_2_4_binding[0];

			Object[] result_pattern_ReturnTypeUserDefined_2_4_black = pattern_ReturnTypeUserDefined_2_4_blackB(csp);
			if (result_pattern_ReturnTypeUserDefined_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						jMethodName, tMethodDefinition, jMethod,
						jMethodToTMethodDefinition, extendedType, jType, tType,
						jTypeToTType, extendedParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_ReturnTypeUserDefined_2_5_expressionFBB(
			ReturnTypeUserDefined _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ReturnTypeUserDefined";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ReturnTypeUserDefined_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_10_1_blackBBBB(
			ReturnTypeUserDefined _this, Match match,
			TMethodDefinition tMethodDefinition, TClass tType) {
		return new Object[] { _this, match, tMethodDefinition, tType };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_10_2_bindingFBBBB(
			ReturnTypeUserDefined _this, Match match,
			TMethodDefinition tMethodDefinition, TClass tType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				tMethodDefinition, tType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tMethodDefinition, tType };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_10_2_bindingAndBlackFBBBB(
			ReturnTypeUserDefined _this, Match match,
			TMethodDefinition tMethodDefinition, TClass tType) {
		Object[] result_pattern_ReturnTypeUserDefined_10_2_binding = pattern_ReturnTypeUserDefined_10_2_bindingFBBBB(
				_this, match, tMethodDefinition, tType);
		if (result_pattern_ReturnTypeUserDefined_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ReturnTypeUserDefined_10_2_binding[0];

			Object[] result_pattern_ReturnTypeUserDefined_10_2_black = pattern_ReturnTypeUserDefined_10_2_blackB(csp);
			if (result_pattern_ReturnTypeUserDefined_10_2_black != null) {

				return new Object[] { csp, _this, match, tMethodDefinition,
						tType };
			}
		}
		return null;
	}

	public static final boolean pattern_ReturnTypeUserDefined_10_3_expressionFBB(
			ReturnTypeUserDefined _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_10_4_blackBBB(
			Match match, TMethodDefinition tMethodDefinition, TClass tType) {
		return new Object[] { match, tMethodDefinition, tType };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_10_4_greenBBBF(
			Match match, TMethodDefinition tMethodDefinition, TClass tType) {
		EMoflonEdge tMethodDefinition__tType____returnType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tMethodDefinition__tType____returnType_name_prime = "returnType";
		tMethodDefinition__tType____returnType.setSrc(tMethodDefinition);
		tMethodDefinition__tType____returnType.setTrg(tType);
		match.getToBeTranslatedEdges().add(
				tMethodDefinition__tType____returnType);
		tMethodDefinition__tType____returnType
				.setName(tMethodDefinition__tType____returnType_name_prime);
		return new Object[] { match, tMethodDefinition, tType,
				tMethodDefinition__tType____returnType };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_10_5_blackBBB(
			Match match, TMethodDefinition tMethodDefinition, TClass tType) {
		return new Object[] { match, tMethodDefinition, tType };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_10_5_greenBBB(
			Match match, TMethodDefinition tMethodDefinition, TClass tType) {
		match.getContextNodes().add(tMethodDefinition);
		match.getContextNodes().add(tType);
		return new Object[] { match, tMethodDefinition, tType };
	}

	public static final void pattern_ReturnTypeUserDefined_10_6_expressionBBBB(
			ReturnTypeUserDefined _this, Match match,
			TMethodDefinition tMethodDefinition, TClass tType) {
		_this.registerObjectsToMatch_BWD(match, tMethodDefinition, tType);

	}

	public static final boolean pattern_ReturnTypeUserDefined_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ReturnTypeUserDefined_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_11_1_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jMethodName");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("tMethodDefinition");
		EObject _localVariable_2 = isApplicableMatch.getObject("jMethod");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("jMethodToTMethodDefinition");
		EObject _localVariable_4 = isApplicableMatch.getObject("jType");
		EObject _localVariable_5 = isApplicableMatch.getObject("tType");
		EObject _localVariable_6 = isApplicableMatch.getObject("jTypeToTType");
		EObject _localVariable_7 = isApplicableMatch
				.getObject("extendedParameterList");
		EObject tmpJMethodName = _localVariable_0;
		EObject tmpTMethodDefinition = _localVariable_1;
		EObject tmpJMethod = _localVariable_2;
		EObject tmpJMethodToTMethodDefinition = _localVariable_3;
		EObject tmpJType = _localVariable_4;
		EObject tmpTType = _localVariable_5;
		EObject tmpJTypeToTType = _localVariable_6;
		EObject tmpExtendedParameterList = _localVariable_7;
		if (tmpJMethodName instanceof ExtendedMethodName) {
			ExtendedMethodName jMethodName = (ExtendedMethodName) tmpJMethodName;
			if (tmpTMethodDefinition instanceof TMethodDefinition) {
				TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
				if (tmpJMethod instanceof ExtendedClassMethod) {
					ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
					if (tmpJMethodToTMethodDefinition instanceof ClassMethodToTMethodDefinition) {
						ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) tmpJMethodToTMethodDefinition;
						if (tmpJType instanceof org.emftext.language.java.classifiers.Class) {
							org.emftext.language.java.classifiers.Class jType = (org.emftext.language.java.classifiers.Class) tmpJType;
							if (tmpTType instanceof TClass) {
								TClass tType = (TClass) tmpTType;
								if (tmpJTypeToTType instanceof ClassToTClass) {
									ClassToTClass jTypeToTType = (ClassToTClass) tmpJTypeToTType;
									if (tmpExtendedParameterList instanceof ExtendedParameterList) {
										ExtendedParameterList extendedParameterList = (ExtendedParameterList) tmpExtendedParameterList;
										return new Object[] { jMethodName,
												tMethodDefinition, jMethod,
												jMethodToTMethodDefinition,
												jType, tType, jTypeToTType,
												extendedParameterList,
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

	public static final Object[] pattern_ReturnTypeUserDefined_11_1_blackBBBBBBBBFBB(
			ExtendedMethodName jMethodName,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			org.emftext.language.java.classifiers.Class jType, TClass tType,
			ClassToTClass jTypeToTType,
			ExtendedParameterList extendedParameterList,
			ReturnTypeUserDefined _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jMethodName, tMethodDefinition, jMethod,
						jMethodToTMethodDefinition, jType, tType, jTypeToTType,
						extendedParameterList, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_11_1_bindingAndBlackFFFFFFFFFBB(
			ReturnTypeUserDefined _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ReturnTypeUserDefined_11_1_binding = pattern_ReturnTypeUserDefined_11_1_bindingFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ReturnTypeUserDefined_11_1_binding != null) {
			ExtendedMethodName jMethodName = (ExtendedMethodName) result_pattern_ReturnTypeUserDefined_11_1_binding[0];
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result_pattern_ReturnTypeUserDefined_11_1_binding[1];
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result_pattern_ReturnTypeUserDefined_11_1_binding[2];
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result_pattern_ReturnTypeUserDefined_11_1_binding[3];
			org.emftext.language.java.classifiers.Class jType = (org.emftext.language.java.classifiers.Class) result_pattern_ReturnTypeUserDefined_11_1_binding[4];
			TClass tType = (TClass) result_pattern_ReturnTypeUserDefined_11_1_binding[5];
			ClassToTClass jTypeToTType = (ClassToTClass) result_pattern_ReturnTypeUserDefined_11_1_binding[6];
			ExtendedParameterList extendedParameterList = (ExtendedParameterList) result_pattern_ReturnTypeUserDefined_11_1_binding[7];

			Object[] result_pattern_ReturnTypeUserDefined_11_1_black = pattern_ReturnTypeUserDefined_11_1_blackBBBBBBBBFBB(
					jMethodName, tMethodDefinition, jMethod,
					jMethodToTMethodDefinition, jType, tType, jTypeToTType,
					extendedParameterList, _this, isApplicableMatch);
			if (result_pattern_ReturnTypeUserDefined_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ReturnTypeUserDefined_11_1_black[8];

				return new Object[] { jMethodName, tMethodDefinition, jMethod,
						jMethodToTMethodDefinition, jType, tType, jTypeToTType,
						extendedParameterList, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_11_1_greenBFB(
			ExtendedClassMethod jMethod,
			org.emftext.language.java.classifiers.Class jType) {
		ExtendedType extendedType = ExtendedJamoppFactory.eINSTANCE
				.createExtendedType();
		boolean extendedType_isFromLib_prime = false;
		jMethod.setExtendedReturnType(extendedType);
		extendedType.setType(jType);
		extendedType
				.setIsFromLib(Boolean.valueOf(extendedType_isFromLib_prime));
		return new Object[] { jMethod, extendedType, jType };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_11_2_blackB(
			ExtendedType extendedType) {
		return new Object[] { extendedType };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_11_2_greenFB(
			ExtendedType extendedType) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(extendedType);
		return new Object[] { ruleresult, extendedType };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_11_3_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject jMethodName,
			EObject tMethodDefinition, EObject jMethod,
			EObject jMethodToTMethodDefinition, EObject extendedType,
			EObject jType, EObject tType, EObject jTypeToTType,
			EObject extendedParameterList) {
		if (!jMethodName.equals(tMethodDefinition)) {
			if (!jMethodName.equals(jMethodToTMethodDefinition)) {
				if (!jMethodName.equals(jType)) {
					if (!jMethodName.equals(tType)) {
						if (!jMethodName.equals(jTypeToTType)) {
							if (!tMethodDefinition.equals(tType)) {
								if (!jMethod.equals(jMethodName)) {
									if (!jMethod.equals(tMethodDefinition)) {
										if (!jMethod
												.equals(jMethodToTMethodDefinition)) {
											if (!jMethod.equals(jType)) {
												if (!jMethod.equals(tType)) {
													if (!jMethod
															.equals(jTypeToTType)) {
														if (!jMethodToTMethodDefinition
																.equals(tMethodDefinition)) {
															if (!jMethodToTMethodDefinition
																	.equals(jType)) {
																if (!jMethodToTMethodDefinition
																		.equals(tType)) {
																	if (!jMethodToTMethodDefinition
																			.equals(jTypeToTType)) {
																		if (!extendedType
																				.equals(jMethodName)) {
																			if (!extendedType
																					.equals(tMethodDefinition)) {
																				if (!extendedType
																						.equals(jMethod)) {
																					if (!extendedType
																							.equals(jMethodToTMethodDefinition)) {
																						if (!extendedType
																								.equals(jType)) {
																							if (!extendedType
																									.equals(tType)) {
																								if (!extendedType
																										.equals(jTypeToTType)) {
																									if (!jType
																											.equals(tMethodDefinition)) {
																										if (!jType
																												.equals(tType)) {
																											if (!jType
																													.equals(jTypeToTType)) {
																												if (!jTypeToTType
																														.equals(tMethodDefinition)) {
																													if (!jTypeToTType
																															.equals(tType)) {
																														if (!extendedParameterList
																																.equals(jMethodName)) {
																															if (!extendedParameterList
																																	.equals(tMethodDefinition)) {
																																if (!extendedParameterList
																																		.equals(jMethod)) {
																																	if (!extendedParameterList
																																			.equals(jMethodToTMethodDefinition)) {
																																		if (!extendedParameterList
																																				.equals(extendedType)) {
																																			if (!extendedParameterList
																																					.equals(jType)) {
																																				if (!extendedParameterList
																																						.equals(tType)) {
																																					if (!extendedParameterList
																																							.equals(jTypeToTType)) {
																																						return new Object[] {
																																								ruleresult,
																																								jMethodName,
																																								tMethodDefinition,
																																								jMethod,
																																								jMethodToTMethodDefinition,
																																								extendedType,
																																								jType,
																																								tType,
																																								jTypeToTType,
																																								extendedParameterList };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ReturnTypeUserDefined_11_3_greenBBBBBBFFF(
			PerformRuleResult ruleresult, EObject tMethodDefinition,
			EObject jMethod, EObject extendedType, EObject jType, EObject tType) {
		EMoflonEdge tMethodDefinition__tType____returnType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__extendedType____extendedReturnType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedType__jType____type = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ReturnTypeUserDefined";
		String tMethodDefinition__tType____returnType_name_prime = "returnType";
		String jMethod__extendedType____extendedReturnType_name_prime = "extendedReturnType";
		String extendedType__jType____type_name_prime = "type";
		tMethodDefinition__tType____returnType.setSrc(tMethodDefinition);
		tMethodDefinition__tType____returnType.setTrg(tType);
		ruleresult.getTranslatedEdges().add(
				tMethodDefinition__tType____returnType);
		jMethod__extendedType____extendedReturnType.setSrc(jMethod);
		jMethod__extendedType____extendedReturnType.setTrg(extendedType);
		ruleresult.getCreatedEdges().add(
				jMethod__extendedType____extendedReturnType);
		extendedType__jType____type.setSrc(extendedType);
		extendedType__jType____type.setTrg(jType);
		ruleresult.getCreatedEdges().add(extendedType__jType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tMethodDefinition__tType____returnType
				.setName(tMethodDefinition__tType____returnType_name_prime);
		jMethod__extendedType____extendedReturnType
				.setName(jMethod__extendedType____extendedReturnType_name_prime);
		extendedType__jType____type
				.setName(extendedType__jType____type_name_prime);
		return new Object[] { ruleresult, tMethodDefinition, jMethod,
				extendedType, jType, tType,
				tMethodDefinition__tType____returnType,
				jMethod__extendedType____extendedReturnType,
				extendedType__jType____type };
	}

	public static final void pattern_ReturnTypeUserDefined_11_5_expressionBBBBBBBBBBB(
			ReturnTypeUserDefined _this, PerformRuleResult ruleresult,
			EObject jMethodName, EObject tMethodDefinition, EObject jMethod,
			EObject jMethodToTMethodDefinition, EObject extendedType,
			EObject jType, EObject tType, EObject jTypeToTType,
			EObject extendedParameterList) {
		_this.registerObjects_BWD(ruleresult, jMethodName, tMethodDefinition,
				jMethod, jMethodToTMethodDefinition, extendedType, jType,
				tType, jTypeToTType, extendedParameterList);

	}

	public static final PerformRuleResult pattern_ReturnTypeUserDefined_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_12_1_bindingFB(
			ReturnTypeUserDefined _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_12_1_blackFBB(
			EClass eClass, ReturnTypeUserDefined _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_12_1_bindingAndBlackFFB(
			ReturnTypeUserDefined _this) {
		Object[] result_pattern_ReturnTypeUserDefined_12_1_binding = pattern_ReturnTypeUserDefined_12_1_bindingFB(_this);
		if (result_pattern_ReturnTypeUserDefined_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ReturnTypeUserDefined_12_1_binding[0];

			Object[] result_pattern_ReturnTypeUserDefined_12_1_black = pattern_ReturnTypeUserDefined_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ReturnTypeUserDefined_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ReturnTypeUserDefined_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ReturnTypeUserDefined";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_12_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("tMethodDefinition");
		EObject _localVariable_1 = match.getObject("tType");
		EObject tmpTMethodDefinition = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		if (tmpTMethodDefinition instanceof TMethodDefinition) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
			if (tmpTType instanceof TClass) {
				TClass tType = (TClass) tmpTType;
				return new Object[] { tMethodDefinition, tType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ReturnTypeUserDefined_12_2_blackBFFFBFB(
			TMethodDefinition tMethodDefinition, TClass tType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ClassMethodToTMethodDefinition jMethodToTMethodDefinition : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tMethodDefinition,
						ClassMethodToTMethodDefinition.class, "target")) {
			ExtendedClassMethod jMethod = jMethodToTMethodDefinition
					.getSource();
			if (jMethod != null) {
				for (ClassToTClass jTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tType, ClassToTClass.class,
								"target")) {
					org.emftext.language.java.classifiers.Class jType = jTypeToTType
							.getSource();
					if (jType != null) {
						_result.add(new Object[] { tMethodDefinition, jMethod,
								jMethodToTMethodDefinition, jType, tType,
								jTypeToTType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ReturnTypeUserDefined_12_3_blackFBBBBBBF(
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			org.emftext.language.java.classifiers.Class jType, TClass tType,
			ClassToTClass jTypeToTType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tType.equals(tMethodDefinition.getReturnType())) {
			if (tMethodDefinition
					.equals(jMethodToTMethodDefinition.getTarget())) {
				if (jMethod.equals(jMethodToTMethodDefinition.getSource())) {
					if (jType.equals(jTypeToTType.getSource())) {
						if (tType.equals(jTypeToTType.getTarget())) {
							ExtendedMethodName jMethodName = jMethod
									.getExtendedMethodName();
							if (jMethodName != null) {
								ExtendedParameterList extendedParameterList = jMethod
										.getParameter_list();
								if (extendedParameterList != null) {
									_result.add(new Object[] { jMethodName,
											tMethodDefinition, jMethod,
											jMethodToTMethodDefinition, jType,
											tType, jTypeToTType,
											extendedParameterList });
								}

							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_12_3_greenBBBBBBBBFFFFFFFFFF(
			ExtendedMethodName jMethodName,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			org.emftext.language.java.classifiers.Class jType, TClass tType,
			ClassToTClass jTypeToTType,
			ExtendedParameterList extendedParameterList) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge jMethodName__jMethod____extendedClassMethod = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__jMethodName____extendedMethodName = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodDefinition__tType____returnType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodDefinition__tMethodDefinition____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodDefinition__jMethod____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jTypeToTType__jType____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jTypeToTType__tType____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedParameterList__jMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__extendedParameterList____parameter_list = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jMethodName__jMethod____extendedClassMethod_name_prime = "extendedClassMethod";
		String jMethod__jMethodName____extendedMethodName_name_prime = "extendedMethodName";
		String tMethodDefinition__tType____returnType_name_prime = "returnType";
		String jMethodToTMethodDefinition__tMethodDefinition____target_name_prime = "target";
		String jMethodToTMethodDefinition__jMethod____source_name_prime = "source";
		String jTypeToTType__jType____source_name_prime = "source";
		String jTypeToTType__tType____target_name_prime = "target";
		String extendedParameterList__jMethod____methods_name_prime = "methods";
		String jMethod__extendedParameterList____parameter_list_name_prime = "parameter_list";
		isApplicableMatch.getAllContextElements().add(jMethodName);
		isApplicableMatch.getAllContextElements().add(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(jMethod);
		isApplicableMatch.getAllContextElements().add(
				jMethodToTMethodDefinition);
		isApplicableMatch.getAllContextElements().add(jType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(jTypeToTType);
		isApplicableMatch.getAllContextElements().add(extendedParameterList);
		jMethodName__jMethod____extendedClassMethod.setSrc(jMethodName);
		jMethodName__jMethod____extendedClassMethod.setTrg(jMethod);
		isApplicableMatch.getAllContextElements().add(
				jMethodName__jMethod____extendedClassMethod);
		jMethod__jMethodName____extendedMethodName.setSrc(jMethod);
		jMethod__jMethodName____extendedMethodName.setTrg(jMethodName);
		isApplicableMatch.getAllContextElements().add(
				jMethod__jMethodName____extendedMethodName);
		tMethodDefinition__tType____returnType.setSrc(tMethodDefinition);
		tMethodDefinition__tType____returnType.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(
				tMethodDefinition__tType____returnType);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setSrc(jMethodToTMethodDefinition);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setTrg(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(
				jMethodToTMethodDefinition__tMethodDefinition____target);
		jMethodToTMethodDefinition__jMethod____source
				.setSrc(jMethodToTMethodDefinition);
		jMethodToTMethodDefinition__jMethod____source.setTrg(jMethod);
		isApplicableMatch.getAllContextElements().add(
				jMethodToTMethodDefinition__jMethod____source);
		jTypeToTType__jType____source.setSrc(jTypeToTType);
		jTypeToTType__jType____source.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(
				jTypeToTType__jType____source);
		jTypeToTType__tType____target.setSrc(jTypeToTType);
		jTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(
				jTypeToTType__tType____target);
		extendedParameterList__jMethod____methods.setSrc(extendedParameterList);
		extendedParameterList__jMethod____methods.setTrg(jMethod);
		isApplicableMatch.getAllContextElements().add(
				extendedParameterList__jMethod____methods);
		jMethod__extendedParameterList____parameter_list.setSrc(jMethod);
		jMethod__extendedParameterList____parameter_list
				.setTrg(extendedParameterList);
		isApplicableMatch.getAllContextElements().add(
				jMethod__extendedParameterList____parameter_list);
		jMethodName__jMethod____extendedClassMethod
				.setName(jMethodName__jMethod____extendedClassMethod_name_prime);
		jMethod__jMethodName____extendedMethodName
				.setName(jMethod__jMethodName____extendedMethodName_name_prime);
		tMethodDefinition__tType____returnType
				.setName(tMethodDefinition__tType____returnType_name_prime);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setName(jMethodToTMethodDefinition__tMethodDefinition____target_name_prime);
		jMethodToTMethodDefinition__jMethod____source
				.setName(jMethodToTMethodDefinition__jMethod____source_name_prime);
		jTypeToTType__jType____source
				.setName(jTypeToTType__jType____source_name_prime);
		jTypeToTType__tType____target
				.setName(jTypeToTType__tType____target_name_prime);
		extendedParameterList__jMethod____methods
				.setName(extendedParameterList__jMethod____methods_name_prime);
		jMethod__extendedParameterList____parameter_list
				.setName(jMethod__extendedParameterList____parameter_list_name_prime);
		return new Object[] { jMethodName, tMethodDefinition, jMethod,
				jMethodToTMethodDefinition, jType, tType, jTypeToTType,
				extendedParameterList, isApplicableMatch,
				jMethodName__jMethod____extendedClassMethod,
				jMethod__jMethodName____extendedMethodName,
				tMethodDefinition__tType____returnType,
				jMethodToTMethodDefinition__tMethodDefinition____target,
				jMethodToTMethodDefinition__jMethod____source,
				jTypeToTType__jType____source, jTypeToTType__tType____target,
				extendedParameterList__jMethod____methods,
				jMethod__extendedParameterList____parameter_list };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_12_4_bindingFBBBBBBBBBB(
			ReturnTypeUserDefined _this, IsApplicableMatch isApplicableMatch,
			ExtendedMethodName jMethodName,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			org.emftext.language.java.classifiers.Class jType, TClass tType,
			ClassToTClass jTypeToTType,
			ExtendedParameterList extendedParameterList) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, jMethodName, tMethodDefinition, jMethod,
				jMethodToTMethodDefinition, jType, tType, jTypeToTType,
				extendedParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jMethodName,
					tMethodDefinition, jMethod, jMethodToTMethodDefinition,
					jType, tType, jTypeToTType, extendedParameterList };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_12_4_bindingAndBlackFBBBBBBBBBB(
			ReturnTypeUserDefined _this, IsApplicableMatch isApplicableMatch,
			ExtendedMethodName jMethodName,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			org.emftext.language.java.classifiers.Class jType, TClass tType,
			ClassToTClass jTypeToTType,
			ExtendedParameterList extendedParameterList) {
		Object[] result_pattern_ReturnTypeUserDefined_12_4_binding = pattern_ReturnTypeUserDefined_12_4_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, jMethodName, tMethodDefinition,
				jMethod, jMethodToTMethodDefinition, jType, tType,
				jTypeToTType, extendedParameterList);
		if (result_pattern_ReturnTypeUserDefined_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ReturnTypeUserDefined_12_4_binding[0];

			Object[] result_pattern_ReturnTypeUserDefined_12_4_black = pattern_ReturnTypeUserDefined_12_4_blackB(csp);
			if (result_pattern_ReturnTypeUserDefined_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						jMethodName, tMethodDefinition, jMethod,
						jMethodToTMethodDefinition, jType, tType, jTypeToTType,
						extendedParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_ReturnTypeUserDefined_12_5_expressionFBB(
			ReturnTypeUserDefined _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ReturnTypeUserDefined";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ReturnTypeUserDefined_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_20_1_bindingFB(
			ReturnTypeUserDefined _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_20_1_blackFBB(
			EClass __eClass, ReturnTypeUserDefined _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_20_1_bindingAndBlackFFB(
			ReturnTypeUserDefined _this) {
		Object[] result_pattern_ReturnTypeUserDefined_20_1_binding = pattern_ReturnTypeUserDefined_20_1_bindingFB(_this);
		if (result_pattern_ReturnTypeUserDefined_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ReturnTypeUserDefined_20_1_binding[0];

			Object[] result_pattern_ReturnTypeUserDefined_20_1_black = pattern_ReturnTypeUserDefined_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ReturnTypeUserDefined_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ReturnTypeUserDefined_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ReturnTypeUserDefined_20_2_blackFFB(
			EMoflonEdge _edge_returnType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMethodDefinition = _edge_returnType.getSrc();
		if (tmpTMethodDefinition instanceof TMethodDefinition) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
			EObject tmpTType = _edge_returnType.getTrg();
			if (tmpTType instanceof TClass) {
				TClass tType = (TClass) tmpTType;
				if (tType.equals(tMethodDefinition.getReturnType())) {
					_result.add(new Object[] { tMethodDefinition, tType,
							_edge_returnType });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ReturnTypeUserDefined_20_3_expressionFBBBB(
			ReturnTypeUserDefined _this, Match match,
			TMethodDefinition tMethodDefinition, TClass tType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match,
				tMethodDefinition, tType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ReturnTypeUserDefined_20_4_expressionFBB(
			ReturnTypeUserDefined _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ReturnTypeUserDefined_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_21_1_bindingFB(
			ReturnTypeUserDefined _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_21_1_blackFBB(
			EClass __eClass, ReturnTypeUserDefined _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_21_1_bindingAndBlackFFB(
			ReturnTypeUserDefined _this) {
		Object[] result_pattern_ReturnTypeUserDefined_21_1_binding = pattern_ReturnTypeUserDefined_21_1_bindingFB(_this);
		if (result_pattern_ReturnTypeUserDefined_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ReturnTypeUserDefined_21_1_binding[0];

			Object[] result_pattern_ReturnTypeUserDefined_21_1_black = pattern_ReturnTypeUserDefined_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ReturnTypeUserDefined_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ReturnTypeUserDefined_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_21_2_black_nac_0BB(
			ExtendedType extendedType, ExtendedClassMethod jMethod) {
		for (ExtendedClassMethod __DEC_extendedType_extendedReturnType_21973 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(extendedType,
						ExtendedClassMethod.class, "extendedReturnType")) {
			if (!jMethod.equals(__DEC_extendedType_extendedReturnType_21973)) {
				return new Object[] { extendedType, jMethod };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_21_2_black_nac_1B(
			ExtendedType extendedType) {
		for (ExtendedParameter __DEC_extendedType_extendedParameterType_326758 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(extendedType,
						ExtendedParameter.class, "extendedParameterType")) {
			return new Object[] { extendedType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ReturnTypeUserDefined_21_2_blackFFFFFB(
			EMoflonEdge _edge_extendedReturnType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJMethod = _edge_extendedReturnType.getSrc();
		if (tmpJMethod instanceof ExtendedClassMethod) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
			EObject tmpExtendedType = _edge_extendedReturnType.getTrg();
			if (tmpExtendedType instanceof ExtendedType) {
				ExtendedType extendedType = (ExtendedType) tmpExtendedType;
				if (extendedType.equals(jMethod.getExtendedReturnType())) {
					ExtendedMethodName jMethodName = jMethod
							.getExtendedMethodName();
					if (jMethodName != null) {
						ExtendedParameterList extendedParameterList = jMethod
								.getParameter_list();
						if (extendedParameterList != null) {
							Type tmpJType = extendedType.getType();
							if (tmpJType instanceof org.emftext.language.java.classifiers.Class) {
								org.emftext.language.java.classifiers.Class jType = (org.emftext.language.java.classifiers.Class) tmpJType;
								boolean extendedTypeisFromLib = extendedType
										.isIsFromLib();
								if (Boolean.valueOf(extendedTypeisFromLib)
										.equals(false)) {
									if (pattern_ReturnTypeUserDefined_21_2_black_nac_0BB(
											extendedType, jMethod) == null) {
										if (pattern_ReturnTypeUserDefined_21_2_black_nac_1B(extendedType) == null) {
											_result.add(new Object[] {
													jMethodName, jMethod,
													extendedType, jType,
													extendedParameterList,
													_edge_extendedReturnType });
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

	public static final Object[] pattern_ReturnTypeUserDefined_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ReturnTypeUserDefined_21_3_expressionFBBBBBBB(
			ReturnTypeUserDefined _this, Match match,
			ExtendedMethodName jMethodName, ExtendedClassMethod jMethod,
			ExtendedType extendedType,
			org.emftext.language.java.classifiers.Class jType,
			ExtendedParameterList extendedParameterList) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jMethodName,
				jMethod, extendedType, jType, extendedParameterList);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ReturnTypeUserDefined_21_4_expressionFBB(
			ReturnTypeUserDefined _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ReturnTypeUserDefined_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_22_1_bindingFB(
			ReturnTypeUserDefined _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_22_1_blackFBB(
			EClass __eClass, ReturnTypeUserDefined _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_22_1_bindingAndBlackFFB(
			ReturnTypeUserDefined _this) {
		Object[] result_pattern_ReturnTypeUserDefined_22_1_binding = pattern_ReturnTypeUserDefined_22_1_bindingFB(_this);
		if (result_pattern_ReturnTypeUserDefined_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ReturnTypeUserDefined_22_1_binding[0];

			Object[] result_pattern_ReturnTypeUserDefined_22_1_black = pattern_ReturnTypeUserDefined_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ReturnTypeUserDefined_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ReturnTypeUserDefined_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_22_2_black_nac_0BB(
			ExtendedType extendedType, ExtendedClassMethod jMethod) {
		for (ExtendedClassMethod __DEC_extendedType_extendedReturnType_88843 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(extendedType,
						ExtendedClassMethod.class, "extendedReturnType")) {
			if (!jMethod.equals(__DEC_extendedType_extendedReturnType_88843)) {
				return new Object[] { extendedType, jMethod };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_22_2_black_nac_1B(
			ExtendedType extendedType) {
		for (ExtendedParameter __DEC_extendedType_extendedParameterType_321000 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(extendedType,
						ExtendedParameter.class, "extendedParameterType")) {
			return new Object[] { extendedType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ReturnTypeUserDefined_22_2_blackFFFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpExtendedType = _edge_type.getSrc();
		if (tmpExtendedType instanceof ExtendedType) {
			ExtendedType extendedType = (ExtendedType) tmpExtendedType;
			EObject tmpJType = _edge_type.getTrg();
			if (tmpJType instanceof org.emftext.language.java.classifiers.Class) {
				org.emftext.language.java.classifiers.Class jType = (org.emftext.language.java.classifiers.Class) tmpJType;
				if (jType.equals(extendedType.getType())) {
					boolean extendedTypeisFromLib = extendedType.isIsFromLib();
					if (Boolean.valueOf(extendedTypeisFromLib).equals(false)) {
						if (pattern_ReturnTypeUserDefined_22_2_black_nac_1B(extendedType) == null) {
							for (ExtendedClassMethod jMethod : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(extendedType,
											ExtendedClassMethod.class,
											"extendedReturnType")) {
								ExtendedMethodName jMethodName = jMethod
										.getExtendedMethodName();
								if (jMethodName != null) {
									ExtendedParameterList extendedParameterList = jMethod
											.getParameter_list();
									if (extendedParameterList != null) {
										if (pattern_ReturnTypeUserDefined_22_2_black_nac_0BB(
												extendedType, jMethod) == null) {
											_result.add(new Object[] {
													jMethodName, jMethod,
													extendedType, jType,
													extendedParameterList,
													_edge_type });
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

	public static final Object[] pattern_ReturnTypeUserDefined_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ReturnTypeUserDefined_22_3_expressionFBBBBBBB(
			ReturnTypeUserDefined _this, Match match,
			ExtendedMethodName jMethodName, ExtendedClassMethod jMethod,
			ExtendedType extendedType,
			org.emftext.language.java.classifiers.Class jType,
			ExtendedParameterList extendedParameterList) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jMethodName,
				jMethod, extendedType, jType, extendedParameterList);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ReturnTypeUserDefined_22_4_expressionFBB(
			ReturnTypeUserDefined _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReturnTypeUserDefined_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ReturnTypeUserDefined_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ReturnTypeUserDefined_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ReturnTypeUserDefinedImpl
