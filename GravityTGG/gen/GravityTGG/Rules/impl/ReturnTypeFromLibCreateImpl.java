/**
 */
package GravityTGG.Rules.impl;

import ExtendedJamopp.ExtendedClassMethod;
import ExtendedJamopp.ExtendedJamoppFactory;
import ExtendedJamopp.ExtendedParameter;
import ExtendedJamopp.ExtendedType;

import GravityTGG.ClassMethodToTMethodDefinition;
import GravityTGG.ClassToTClass;
import GravityTGG.ExtendedTypeToTClass;
import GravityTGG.GravityTGGFactory;

import GravityTGG.Rules.ReturnTypeFromLibCreate;
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
import TypeGraphBasic.TPackage;
import TypeGraphBasic.TypeGraph;
import TypeGraphBasic.TypeGraphBasicFactory;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.emftext.language.java.members.MemberContainer;

import org.emftext.language.java.types.Type;
// <-- [user defined imports]
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;

// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Type From Lib Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReturnTypeFromLibCreateImpl extends AbstractRuleImpl implements
		ReturnTypeFromLibCreate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnTypeFromLibCreateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getReturnTypeFromLibCreate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedType extendedType, ExtendedClassMethod jMethod) {
		// initial bindings
		Object[] result1_black = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_0_1_blackBBBBB(this, match,
						jClass, extendedType, jMethod);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_0_2_bindingAndBlackFBBBBB(
						this, match, jClass, extendedType, jMethod);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_0_4_blackBBBB(match,
							jClass, extendedType, jMethod);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_0_4_greenBBBF(match,
							extendedType, jMethod);
			// EMoflonEdge jMethod__extendedType____extendedReturnType = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_0_5_blackBBBB(match,
							jClass, extendedType, jMethod);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_0_5_greenBBBF(match,
							jClass, jMethod);
			// EMoflonEdge jClass__jMethod____members = (EMoflonEdge) result5_green[3];

			// register objects to match
			ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_0_6_expressionBBBBB(this,
							match, jClass, extendedType, jMethod);
			return ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_0_7_expressionF();
		} else {
			return ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_1_1_bindingAndBlackFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result1_bindingAndBlack[0];
		TClass tClass = (TClass) result1_bindingAndBlack[1];
		ClassToTClass jClassToTClass = (ClassToTClass) result1_bindingAndBlack[2];
		ExtendedType extendedType = (ExtendedType) result1_bindingAndBlack[3];
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result1_bindingAndBlack[4];
		ExtendedClassMethod jMethod = (ExtendedClassMethod) result1_bindingAndBlack[5];
		ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result1_bindingAndBlack[6];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_1_1_greenFBBFBB(extendedType,
						tMethodDefinition, pg, csp);
		TClass tType = (TClass) result1_green[0];
		ExtendedTypeToTClass extendedTypeToTType = (ExtendedTypeToTClass) result1_green[3];

		// collect translated elements
		Object[] result2_black = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_1_2_blackBBB(tType,
						extendedType, extendedTypeToTType);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_1_2_greenFBBB(tType,
						extendedType, extendedTypeToTType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_1_3_blackBBBBBBBBBBB(
						ruleresult, jClass, tClass, jClassToTClass, tType,
						extendedType, tMethodDefinition, jMethod,
						jMethodToTMethodDefinition, extendedTypeToTType, pg);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_1_3_greenBBBBBBBFFFFF(
						ruleresult, tType, extendedType, tMethodDefinition,
						jMethod, extendedTypeToTType, pg);
		// EMoflonEdge tMethodDefinition__tType____returnType = (EMoflonEdge) result3_green[7];
		// EMoflonEdge jMethod__extendedType____extendedReturnType = (EMoflonEdge) result3_green[8];
		// EMoflonEdge extendedTypeToTType__extendedType____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge extendedTypeToTType__tType____target = (EMoflonEdge) result3_green[10];
		// EMoflonEdge pg__tType____classes = (EMoflonEdge) result3_green[11];

		// perform postprocessing story node is empty
		// register objects
		ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_1_5_expressionBBBBBBBBBBBB(
						this, ruleresult, jClass, tClass, jClassToTClass,
						tType, extendedType, tMethodDefinition, jMethod,
						jMethodToTMethodDefinition, extendedTypeToTType, pg);
		return ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_2_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result2_binding[0];
		ExtendedType extendedType = (ExtendedType) result2_binding[1];
		ExtendedClassMethod jMethod = (ExtendedClassMethod) result2_binding[2];
		for (Object[] result2_black : ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_2_2_blackBFFBFBFB(jClass,
						extendedType, jMethod, match)) {
			TClass tClass = (TClass) result2_black[1];
			ClassToTClass jClassToTClass = (ClassToTClass) result2_black[2];
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_black[4];
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_2_3_blackBBBBBBBF(jClass,
							tClass, jClassToTClass, extendedType,
							tMethodDefinition, jMethod,
							jMethodToTMethodDefinition)) {
				TypeGraph pg = (TypeGraph) result3_black[7];
				Object[] result3_green = ReturnTypeFromLibCreateImpl
						.pattern_ReturnTypeFromLibCreate_2_3_greenBBBBBBBBFFFFFFFFF(
								jClass, tClass, jClassToTClass, extendedType,
								tMethodDefinition, jMethod,
								jMethodToTMethodDefinition, pg);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge jClass__jMethod____members = (EMoflonEdge) result3_green[9];
				// EMoflonEdge tClass__tMethodDefinition____defines = (EMoflonEdge) result3_green[10];
				// EMoflonEdge jClassToTClass__jClass____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge jClassToTClass__tClass____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge jMethod__extendedType____extendedReturnType = (EMoflonEdge) result3_green[13];
				// EMoflonEdge jMethodToTMethodDefinition__tMethodDefinition____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge jMethodToTMethodDefinition__jMethod____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pg__tClass____classes = (EMoflonEdge) result3_green[16];

				// solve CSP
				Object[] result4_bindingAndBlack = ReturnTypeFromLibCreateImpl
						.pattern_ReturnTypeFromLibCreate_2_4_bindingAndBlackFBBBBBBBBBB(
								this, isApplicableMatch, jClass, tClass,
								jClassToTClass, extendedType,
								tMethodDefinition, jMethod,
								jMethodToTMethodDefinition, pg);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ReturnTypeFromLibCreateImpl
						.pattern_ReturnTypeFromLibCreate_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ReturnTypeFromLibCreateImpl
							.pattern_ReturnTypeFromLibCreate_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ReturnTypeFromLibCreateImpl
							.pattern_ReturnTypeFromLibCreate_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedType extendedType, ExtendedClassMethod jMethod) {
		match.registerObject("jClass", jClass);
		match.registerObject("extendedType", extendedType);
		match.registerObject("jMethod", jMethod);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedType extendedType, ExtendedClassMethod jMethod) {// Create CSP
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
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, ExtendedType extendedType,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			TypeGraph pg) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_extendedType_typeName = CSPFactoryHelper.eINSTANCE
				.createVariable("extendedType.typeName", true, csp);
		var_extendedType_typeName.setValue(extendedType.getTypeName());
		var_extendedType_typeName.setType("String");

		// Create unbound variables
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable(
				"tType.tName", csp);
		var_tType_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_extendedType_typeName, var_tType_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jClass", jClass);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("jClassToTClass", jClassToTClass);
		isApplicableMatch.registerObject("extendedType", extendedType);
		isApplicableMatch
				.registerObject("tMethodDefinition", tMethodDefinition);
		isApplicableMatch.registerObject("jMethod", jMethod);
		isApplicableMatch.registerObject("jMethodToTMethodDefinition",
				jMethodToTMethodDefinition);
		isApplicableMatch.registerObject("pg", pg);
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
			EObject jClass, EObject tClass, EObject jClassToTClass,
			EObject tType, EObject extendedType, EObject tMethodDefinition,
			EObject jMethod, EObject jMethodToTMethodDefinition,
			EObject extendedTypeToTType, EObject pg) {
		ruleresult.registerObject("jClass", jClass);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("jClassToTClass", jClassToTClass);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("extendedType", extendedType);
		ruleresult.registerObject("tMethodDefinition", tMethodDefinition);
		ruleresult.registerObject("jMethod", jMethod);
		ruleresult.registerObject("jMethodToTMethodDefinition",
				jMethodToTMethodDefinition);
		ruleresult.registerObject("extendedTypeToTType", extendedTypeToTType);
		ruleresult.registerObject("pg", pg);

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
	public boolean isAppropriate_BWD(Match match, TClass tClass, TClass tType,
			TMethodDefinition tMethodDefinition, TypeGraph pg) {
		// initial bindings
		Object[] result1_black = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_10_1_blackBBBBBB(this, match,
						tClass, tType, tMethodDefinition, pg);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_10_2_bindingAndBlackFBBBBBB(
						this, match, tClass, tType, tMethodDefinition, pg);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_10_4_blackBBBBB(match,
							tClass, tType, tMethodDefinition, pg);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_10_4_greenBBBBFF(match,
							tType, tMethodDefinition, pg);
			// EMoflonEdge tMethodDefinition__tType____returnType = (EMoflonEdge) result4_green[4];
			// EMoflonEdge pg__tType____classes = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_10_5_blackBBBBB(match,
							tClass, tType, tMethodDefinition, pg);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_10_5_greenBBBBFF(match,
							tClass, tMethodDefinition, pg);
			// EMoflonEdge tClass__tMethodDefinition____defines = (EMoflonEdge) result5_green[4];
			// EMoflonEdge pg__tClass____classes = (EMoflonEdge) result5_green[5];

			// register objects to match
			ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_10_6_expressionBBBBBB(
							this, match, tClass, tType, tMethodDefinition, pg);
			return ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_10_7_expressionF();
		} else {
			return ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_11_1_bindingAndBlackFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result1_bindingAndBlack[0];
		TClass tClass = (TClass) result1_bindingAndBlack[1];
		ClassToTClass jClassToTClass = (ClassToTClass) result1_bindingAndBlack[2];
		TClass tType = (TClass) result1_bindingAndBlack[3];
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result1_bindingAndBlack[4];
		ExtendedClassMethod jMethod = (ExtendedClassMethod) result1_bindingAndBlack[5];
		ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result1_bindingAndBlack[6];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_11_1_greenBFBFB(tType,
						jMethod, csp);
		ExtendedType extendedType = (ExtendedType) result1_green[1];
		ExtendedTypeToTClass extendedTypeToTType = (ExtendedTypeToTClass) result1_green[3];

		// collect translated elements
		Object[] result2_black = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_11_2_blackBBB(tType,
						extendedType, extendedTypeToTType);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_11_2_greenFBBB(tType,
						extendedType, extendedTypeToTType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_11_3_blackBBBBBBBBBBB(
						ruleresult, jClass, tClass, jClassToTClass, tType,
						extendedType, tMethodDefinition, jMethod,
						jMethodToTMethodDefinition, extendedTypeToTType, pg);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_11_3_greenBBBBBBBFFFFF(
						ruleresult, tType, extendedType, tMethodDefinition,
						jMethod, extendedTypeToTType, pg);
		// EMoflonEdge tMethodDefinition__tType____returnType = (EMoflonEdge) result3_green[7];
		// EMoflonEdge jMethod__extendedType____extendedReturnType = (EMoflonEdge) result3_green[8];
		// EMoflonEdge extendedTypeToTType__extendedType____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge extendedTypeToTType__tType____target = (EMoflonEdge) result3_green[10];
		// EMoflonEdge pg__tType____classes = (EMoflonEdge) result3_green[11];

		// perform postprocessing story node is empty
		// register objects
		ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_11_5_expressionBBBBBBBBBBBB(
						this, ruleresult, jClass, tClass, jClassToTClass,
						tType, extendedType, tMethodDefinition, jMethod,
						jMethodToTMethodDefinition, extendedTypeToTType, pg);
		return ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_12_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		TClass tClass = (TClass) result2_binding[0];
		TClass tType = (TClass) result2_binding[1];
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_binding[2];
		TypeGraph pg = (TypeGraph) result2_binding[3];
		for (Object[] result2_black : ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_12_2_blackFBFBBFFBB(tClass,
						tType, tMethodDefinition, pg, match)) {
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result2_black[0];
			ClassToTClass jClassToTClass = (ClassToTClass) result2_black[2];
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result2_black[5];
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_12_3_blackBBBBBBBB(jClass,
							tClass, jClassToTClass, tType, tMethodDefinition,
							jMethod, jMethodToTMethodDefinition, pg)) {
				Object[] result3_green = ReturnTypeFromLibCreateImpl
						.pattern_ReturnTypeFromLibCreate_12_3_greenBBBBBBBBFFFFFFFFFF(
								jClass, tClass, jClassToTClass, tType,
								tMethodDefinition, jMethod,
								jMethodToTMethodDefinition, pg);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge jClass__jMethod____members = (EMoflonEdge) result3_green[9];
				// EMoflonEdge tClass__tMethodDefinition____defines = (EMoflonEdge) result3_green[10];
				// EMoflonEdge jClassToTClass__jClass____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge jClassToTClass__tClass____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge tMethodDefinition__tType____returnType = (EMoflonEdge) result3_green[13];
				// EMoflonEdge jMethodToTMethodDefinition__tMethodDefinition____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge jMethodToTMethodDefinition__jMethod____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pg__tClass____classes = (EMoflonEdge) result3_green[16];
				// EMoflonEdge pg__tType____classes = (EMoflonEdge) result3_green[17];

				// solve CSP
				Object[] result4_bindingAndBlack = ReturnTypeFromLibCreateImpl
						.pattern_ReturnTypeFromLibCreate_12_4_bindingAndBlackFBBBBBBBBBB(
								this, isApplicableMatch, jClass, tClass,
								jClassToTClass, tType, tMethodDefinition,
								jMethod, jMethodToTMethodDefinition, pg);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ReturnTypeFromLibCreateImpl
						.pattern_ReturnTypeFromLibCreate_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ReturnTypeFromLibCreateImpl
							.pattern_ReturnTypeFromLibCreate_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ReturnTypeFromLibCreateImpl
							.pattern_ReturnTypeFromLibCreate_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TClass tClass,
			TClass tType, TMethodDefinition tMethodDefinition, TypeGraph pg) {
		match.registerObject("tClass", tClass);
		match.registerObject("tType", tType);
		match.registerObject("tMethodDefinition", tMethodDefinition);
		match.registerObject("pg", pg);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TClass tClass,
			TClass tType, TMethodDefinition tMethodDefinition, TypeGraph pg) {// Create CSP
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
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, TClass tType,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			TypeGraph pg) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable(
				"tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");

		// Create unbound variables
		Variable var_extendedType_typeName = CSPFactoryHelper.eINSTANCE
				.createVariable("extendedType.typeName", csp);
		var_extendedType_typeName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_extendedType_typeName, var_tType_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jClass", jClass);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("jClassToTClass", jClassToTClass);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch
				.registerObject("tMethodDefinition", tMethodDefinition);
		isApplicableMatch.registerObject("jMethod", jMethod);
		isApplicableMatch.registerObject("jMethodToTMethodDefinition",
				jMethodToTMethodDefinition);
		isApplicableMatch.registerObject("pg", pg);
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
			EObject jClass, EObject tClass, EObject jClassToTClass,
			EObject tType, EObject extendedType, EObject tMethodDefinition,
			EObject jMethod, EObject jMethodToTMethodDefinition,
			EObject extendedTypeToTType, EObject pg) {
		ruleresult.registerObject("jClass", jClass);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("jClassToTClass", jClassToTClass);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("extendedType", extendedType);
		ruleresult.registerObject("tMethodDefinition", tMethodDefinition);
		ruleresult.registerObject("jMethod", jMethod);
		ruleresult.registerObject("jMethodToTMethodDefinition",
				jMethodToTMethodDefinition);
		ruleresult.registerObject("extendedTypeToTType", extendedTypeToTType);
		ruleresult.registerObject("pg", pg);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("tType")
				.eClass()
				.equals(TypeGraphBasic.TypeGraphBasicPackage.eINSTANCE
						.getTClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_37(
			EMoflonEdge _edge_returnType) {
		// prepare return value
		Object[] result1_bindingAndBlack = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_20_2_blackFFFFB(_edge_returnType)) {
			TClass tClass = (TClass) result2_black[0];
			TClass tType = (TClass) result2_black[1];
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_black[2];
			TypeGraph pg = (TypeGraph) result2_black[3];
			Object[] result2_green = ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_20_3_expressionFBBBBBB(
							this, match, tClass, tType, tMethodDefinition, pg)) {
				// Ensure that the correct types of elements are matched
				if (ReturnTypeFromLibCreateImpl
						.pattern_ReturnTypeFromLibCreate_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ReturnTypeFromLibCreateImpl
							.pattern_ReturnTypeFromLibCreate_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ReturnTypeFromLibCreateImpl
							.pattern_ReturnTypeFromLibCreate_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_29(
			EMoflonEdge _edge_extendedReturnType) {
		// prepare return value
		Object[] result1_bindingAndBlack = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_21_2_blackFFFB(_edge_extendedReturnType)) {
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result2_black[0];
			ExtendedType extendedType = (ExtendedType) result2_black[1];
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result2_black[2];
			Object[] result2_green = ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_21_3_expressionFBBBBB(
							this, match, jClass, extendedType, jMethod)) {
				// Ensure that the correct types of elements are matched
				if (ReturnTypeFromLibCreateImpl
						.pattern_ReturnTypeFromLibCreate_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ReturnTypeFromLibCreateImpl
							.pattern_ReturnTypeFromLibCreate_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ReturnTypeFromLibCreateImpl
							.pattern_ReturnTypeFromLibCreate_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_38(
			EMoflonEdge _edge_classes) {
		// prepare return value
		Object[] result1_bindingAndBlack = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_22_2_blackFFFFB(_edge_classes)) {
			TClass tClass = (TClass) result2_black[0];
			TClass tType = (TClass) result2_black[1];
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_black[2];
			TypeGraph pg = (TypeGraph) result2_black[3];
			Object[] result2_green = ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ReturnTypeFromLibCreateImpl
					.pattern_ReturnTypeFromLibCreate_22_3_expressionFBBBBBB(
							this, match, tClass, tType, tMethodDefinition, pg)) {
				// Ensure that the correct types of elements are matched
				if (ReturnTypeFromLibCreateImpl
						.pattern_ReturnTypeFromLibCreate_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ReturnTypeFromLibCreateImpl
							.pattern_ReturnTypeFromLibCreate_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ReturnTypeFromLibCreateImpl
							.pattern_ReturnTypeFromLibCreate_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ReturnTypeFromLibCreateImpl
				.pattern_ReturnTypeFromLibCreate_22_6_expressionFB(__result);
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
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___IS_APPROPRIATE_FWD__MATCH_CLASS_EXTENDEDTYPE_EXTENDEDCLASSMETHOD:
			return isAppropriate_FWD((Match) arguments.get(0),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(1), (ExtendedType) arguments.get(2),
					(ExtendedClassMethod) arguments.get(3));
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASS_EXTENDEDTYPE_EXTENDEDCLASSMETHOD:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(1), (ExtendedType) arguments.get(2),
					(ExtendedClassMethod) arguments.get(3));
			return null;
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASS_EXTENDEDTYPE_EXTENDEDCLASSMETHOD:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(1), (ExtendedType) arguments.get(2),
					(ExtendedClassMethod) arguments.get(3));
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASS_TCLASS_CLASSTOTCLASS_EXTENDEDTYPE_TMETHODDEFINITION_EXTENDEDCLASSMETHOD_CLASSMETHODTOTMETHODDEFINITION_TYPEGRAPH:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(1), (TClass) arguments.get(2),
					(ClassToTClass) arguments.get(3),
					(ExtendedType) arguments.get(4),
					(TMethodDefinition) arguments.get(5),
					(ExtendedClassMethod) arguments.get(6),
					(ClassMethodToTMethodDefinition) arguments.get(7),
					(TypeGraph) arguments.get(8));
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___IS_APPROPRIATE_BWD__MATCH_TCLASS_TCLASS_TMETHODDEFINITION_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TClass) arguments.get(1), (TClass) arguments.get(2),
					(TMethodDefinition) arguments.get(3),
					(TypeGraph) arguments.get(4));
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TCLASS_TMETHODDEFINITION_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TClass) arguments.get(1), (TClass) arguments.get(2),
					(TMethodDefinition) arguments.get(3),
					(TypeGraph) arguments.get(4));
			return null;
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TCLASS_TMETHODDEFINITION_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TClass) arguments.get(1), (TClass) arguments.get(2),
					(TMethodDefinition) arguments.get(3),
					(TypeGraph) arguments.get(4));
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASS_TCLASS_CLASSTOTCLASS_TCLASS_TMETHODDEFINITION_EXTENDEDCLASSMETHOD_CLASSMETHODTOTMETHODDEFINITION_TYPEGRAPH:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(1), (TClass) arguments.get(2),
					(ClassToTClass) arguments.get(3),
					(TClass) arguments.get(4),
					(TMethodDefinition) arguments.get(5),
					(ExtendedClassMethod) arguments.get(6),
					(ClassMethodToTMethodDefinition) arguments.get(7),
					(TypeGraph) arguments.get(8));
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_37__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_37((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_29__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_29((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_38__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_38((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_0_1_blackBBBBB(
			ReturnTypeFromLibCreate _this, Match match,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedType extendedType, ExtendedClassMethod jMethod) {
		return new Object[] { _this, match, jClass, extendedType, jMethod };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_0_2_bindingFBBBBB(
			ReturnTypeFromLibCreate _this, Match match,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedType extendedType, ExtendedClassMethod jMethod) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, jClass,
				extendedType, jMethod);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jClass, extendedType,
					jMethod };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_0_2_bindingAndBlackFBBBBB(
			ReturnTypeFromLibCreate _this, Match match,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedType extendedType, ExtendedClassMethod jMethod) {
		Object[] result_pattern_ReturnTypeFromLibCreate_0_2_binding = pattern_ReturnTypeFromLibCreate_0_2_bindingFBBBBB(
				_this, match, jClass, extendedType, jMethod);
		if (result_pattern_ReturnTypeFromLibCreate_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ReturnTypeFromLibCreate_0_2_binding[0];

			Object[] result_pattern_ReturnTypeFromLibCreate_0_2_black = pattern_ReturnTypeFromLibCreate_0_2_blackB(csp);
			if (result_pattern_ReturnTypeFromLibCreate_0_2_black != null) {

				return new Object[] { csp, _this, match, jClass, extendedType,
						jMethod };
			}
		}
		return null;
	}

	public static final boolean pattern_ReturnTypeFromLibCreate_0_3_expressionFBB(
			ReturnTypeFromLibCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_0_4_blackBBBB(
			Match match, org.emftext.language.java.classifiers.Class jClass,
			ExtendedType extendedType, ExtendedClassMethod jMethod) {
		return new Object[] { match, jClass, extendedType, jMethod };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_0_4_greenBBBF(
			Match match, ExtendedType extendedType, ExtendedClassMethod jMethod) {
		EMoflonEdge jMethod__extendedType____extendedReturnType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(extendedType);
		String jMethod__extendedType____extendedReturnType_name_prime = "extendedReturnType";
		jMethod__extendedType____extendedReturnType.setSrc(jMethod);
		jMethod__extendedType____extendedReturnType.setTrg(extendedType);
		match.getToBeTranslatedEdges().add(
				jMethod__extendedType____extendedReturnType);
		jMethod__extendedType____extendedReturnType
				.setName(jMethod__extendedType____extendedReturnType_name_prime);
		return new Object[] { match, extendedType, jMethod,
				jMethod__extendedType____extendedReturnType };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_0_5_blackBBBB(
			Match match, org.emftext.language.java.classifiers.Class jClass,
			ExtendedType extendedType, ExtendedClassMethod jMethod) {
		return new Object[] { match, jClass, extendedType, jMethod };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_0_5_greenBBBF(
			Match match, org.emftext.language.java.classifiers.Class jClass,
			ExtendedClassMethod jMethod) {
		EMoflonEdge jClass__jMethod____members = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(jClass);
		match.getContextNodes().add(jMethod);
		String jClass__jMethod____members_name_prime = "members";
		jClass__jMethod____members.setSrc(jClass);
		jClass__jMethod____members.setTrg(jMethod);
		match.getContextEdges().add(jClass__jMethod____members);
		jClass__jMethod____members
				.setName(jClass__jMethod____members_name_prime);
		return new Object[] { match, jClass, jMethod,
				jClass__jMethod____members };
	}

	public static final void pattern_ReturnTypeFromLibCreate_0_6_expressionBBBBB(
			ReturnTypeFromLibCreate _this, Match match,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedType extendedType, ExtendedClassMethod jMethod) {
		_this.registerObjectsToMatch_FWD(match, jClass, extendedType, jMethod);

	}

	public static final boolean pattern_ReturnTypeFromLibCreate_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ReturnTypeFromLibCreate_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_1_1_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("jClassToTClass");
		EObject _localVariable_3 = isApplicableMatch.getObject("extendedType");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("tMethodDefinition");
		EObject _localVariable_5 = isApplicableMatch.getObject("jMethod");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("jMethodToTMethodDefinition");
		EObject _localVariable_7 = isApplicableMatch.getObject("pg");
		EObject tmpJClass = _localVariable_0;
		EObject tmpTClass = _localVariable_1;
		EObject tmpJClassToTClass = _localVariable_2;
		EObject tmpExtendedType = _localVariable_3;
		EObject tmpTMethodDefinition = _localVariable_4;
		EObject tmpJMethod = _localVariable_5;
		EObject tmpJMethodToTMethodDefinition = _localVariable_6;
		EObject tmpPg = _localVariable_7;
		if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				if (tmpJClassToTClass instanceof ClassToTClass) {
					ClassToTClass jClassToTClass = (ClassToTClass) tmpJClassToTClass;
					if (tmpExtendedType instanceof ExtendedType) {
						ExtendedType extendedType = (ExtendedType) tmpExtendedType;
						if (tmpTMethodDefinition instanceof TMethodDefinition) {
							TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
							if (tmpJMethod instanceof ExtendedClassMethod) {
								ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
								if (tmpJMethodToTMethodDefinition instanceof ClassMethodToTMethodDefinition) {
									ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) tmpJMethodToTMethodDefinition;
									if (tmpPg instanceof TypeGraph) {
										TypeGraph pg = (TypeGraph) tmpPg;
										return new Object[] { jClass, tClass,
												jClassToTClass, extendedType,
												tMethodDefinition, jMethod,
												jMethodToTMethodDefinition, pg,
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

	public static final Object[] pattern_ReturnTypeFromLibCreate_1_1_blackBBBBBBBBFBB(
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, ExtendedType extendedType,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			TypeGraph pg, ReturnTypeFromLibCreate _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jClass, tClass, jClassToTClass,
						extendedType, tMethodDefinition, jMethod,
						jMethodToTMethodDefinition, pg, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_1_1_bindingAndBlackFFFFFFFFFBB(
			ReturnTypeFromLibCreate _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ReturnTypeFromLibCreate_1_1_binding = pattern_ReturnTypeFromLibCreate_1_1_bindingFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ReturnTypeFromLibCreate_1_1_binding != null) {
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result_pattern_ReturnTypeFromLibCreate_1_1_binding[0];
			TClass tClass = (TClass) result_pattern_ReturnTypeFromLibCreate_1_1_binding[1];
			ClassToTClass jClassToTClass = (ClassToTClass) result_pattern_ReturnTypeFromLibCreate_1_1_binding[2];
			ExtendedType extendedType = (ExtendedType) result_pattern_ReturnTypeFromLibCreate_1_1_binding[3];
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result_pattern_ReturnTypeFromLibCreate_1_1_binding[4];
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result_pattern_ReturnTypeFromLibCreate_1_1_binding[5];
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result_pattern_ReturnTypeFromLibCreate_1_1_binding[6];
			TypeGraph pg = (TypeGraph) result_pattern_ReturnTypeFromLibCreate_1_1_binding[7];

			Object[] result_pattern_ReturnTypeFromLibCreate_1_1_black = pattern_ReturnTypeFromLibCreate_1_1_blackBBBBBBBBFBB(
					jClass, tClass, jClassToTClass, extendedType,
					tMethodDefinition, jMethod, jMethodToTMethodDefinition, pg,
					_this, isApplicableMatch);
			if (result_pattern_ReturnTypeFromLibCreate_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ReturnTypeFromLibCreate_1_1_black[8];

				return new Object[] { jClass, tClass, jClassToTClass,
						extendedType, tMethodDefinition, jMethod,
						jMethodToTMethodDefinition, pg, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_1_1_greenFBBFBB(
			ExtendedType extendedType, TMethodDefinition tMethodDefinition,
			TypeGraph pg, CSP csp) {
		TClass tType = TypeGraphBasicFactory.eINSTANCE.createTClass();
		ExtendedTypeToTClass extendedTypeToTType = GravityTGGFactory.eINSTANCE
				.createExtendedTypeToTClass();
		Object _localVariable_0 = csp.getValue("tType", "tName");
		tMethodDefinition.setReturnType(tType);
		pg.getClasses().add(tType);
		extendedTypeToTType.setSource(extendedType);
		extendedTypeToTType.setTarget(tType);
		String tType_tName_prime = (String) _localVariable_0;
		tType.setTName(tType_tName_prime);
		return new Object[] { tType, extendedType, tMethodDefinition,
				extendedTypeToTType, pg, csp };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_1_2_blackBBB(
			TClass tType, ExtendedType extendedType,
			ExtendedTypeToTClass extendedTypeToTType) {
		return new Object[] { tType, extendedType, extendedTypeToTType };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_1_2_greenFBBB(
			TClass tType, ExtendedType extendedType,
			ExtendedTypeToTClass extendedTypeToTType) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tType);
		ruleresult.getTranslatedElements().add(extendedType);
		ruleresult.getCreatedLinkElements().add(extendedTypeToTType);
		return new Object[] { ruleresult, tType, extendedType,
				extendedTypeToTType };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_1_3_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject jClass, EObject tClass,
			EObject jClassToTClass, EObject tType, EObject extendedType,
			EObject tMethodDefinition, EObject jMethod,
			EObject jMethodToTMethodDefinition, EObject extendedTypeToTType,
			EObject pg) {
		if (!jClass.equals(tClass)) {
			if (!jClass.equals(jClassToTClass)) {
				if (!jClass.equals(tType)) {
					if (!jClass.equals(tMethodDefinition)) {
						if (!jClass.equals(jMethod)) {
							if (!jClass.equals(jMethodToTMethodDefinition)) {
								if (!jClass.equals(pg)) {
									if (!tClass.equals(tType)) {
										if (!tClass.equals(tMethodDefinition)) {
											if (!jClassToTClass.equals(tClass)) {
												if (!jClassToTClass
														.equals(tType)) {
													if (!jClassToTClass
															.equals(tMethodDefinition)) {
														if (!jClassToTClass
																.equals(jMethod)) {
															if (!jClassToTClass
																	.equals(jMethodToTMethodDefinition)) {
																if (!jClassToTClass
																		.equals(pg)) {
																	if (!extendedType
																			.equals(jClass)) {
																		if (!extendedType
																				.equals(tClass)) {
																			if (!extendedType
																					.equals(jClassToTClass)) {
																				if (!extendedType
																						.equals(tType)) {
																					if (!extendedType
																							.equals(tMethodDefinition)) {
																						if (!extendedType
																								.equals(jMethod)) {
																							if (!extendedType
																									.equals(jMethodToTMethodDefinition)) {
																								if (!extendedType
																										.equals(extendedTypeToTType)) {
																									if (!extendedType
																											.equals(pg)) {
																										if (!tMethodDefinition
																												.equals(tType)) {
																											if (!jMethod
																													.equals(tClass)) {
																												if (!jMethod
																														.equals(tType)) {
																													if (!jMethod
																															.equals(tMethodDefinition)) {
																														if (!jMethod
																																.equals(jMethodToTMethodDefinition)) {
																															if (!jMethod
																																	.equals(pg)) {
																																if (!jMethodToTMethodDefinition
																																		.equals(tClass)) {
																																	if (!jMethodToTMethodDefinition
																																			.equals(tType)) {
																																		if (!jMethodToTMethodDefinition
																																				.equals(tMethodDefinition)) {
																																			if (!jMethodToTMethodDefinition
																																					.equals(pg)) {
																																				if (!extendedTypeToTType
																																						.equals(jClass)) {
																																					if (!extendedTypeToTType
																																							.equals(tClass)) {
																																						if (!extendedTypeToTType
																																								.equals(jClassToTClass)) {
																																							if (!extendedTypeToTType
																																									.equals(tType)) {
																																								if (!extendedTypeToTType
																																										.equals(tMethodDefinition)) {
																																									if (!extendedTypeToTType
																																											.equals(jMethod)) {
																																										if (!extendedTypeToTType
																																												.equals(jMethodToTMethodDefinition)) {
																																											if (!extendedTypeToTType
																																													.equals(pg)) {
																																												if (!pg.equals(tClass)) {
																																													if (!pg.equals(tType)) {
																																														if (!pg.equals(tMethodDefinition)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	jClass,
																																																	tClass,
																																																	jClassToTClass,
																																																	tType,
																																																	extendedType,
																																																	tMethodDefinition,
																																																	jMethod,
																																																	jMethodToTMethodDefinition,
																																																	extendedTypeToTType,
																																																	pg };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ReturnTypeFromLibCreate_1_3_greenBBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tType, EObject extendedType,
			EObject tMethodDefinition, EObject jMethod,
			EObject extendedTypeToTType, EObject pg) {
		EMoflonEdge tMethodDefinition__tType____returnType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__extendedType____extendedReturnType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedTypeToTType__extendedType____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedTypeToTType__tType____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tType____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ReturnTypeFromLibCreate";
		String tMethodDefinition__tType____returnType_name_prime = "returnType";
		String jMethod__extendedType____extendedReturnType_name_prime = "extendedReturnType";
		String extendedTypeToTType__extendedType____source_name_prime = "source";
		String extendedTypeToTType__tType____target_name_prime = "target";
		String pg__tType____classes_name_prime = "classes";
		tMethodDefinition__tType____returnType.setSrc(tMethodDefinition);
		tMethodDefinition__tType____returnType.setTrg(tType);
		ruleresult.getCreatedEdges()
				.add(tMethodDefinition__tType____returnType);
		jMethod__extendedType____extendedReturnType.setSrc(jMethod);
		jMethod__extendedType____extendedReturnType.setTrg(extendedType);
		ruleresult.getTranslatedEdges().add(
				jMethod__extendedType____extendedReturnType);
		extendedTypeToTType__extendedType____source.setSrc(extendedTypeToTType);
		extendedTypeToTType__extendedType____source.setTrg(extendedType);
		ruleresult.getCreatedEdges().add(
				extendedTypeToTType__extendedType____source);
		extendedTypeToTType__tType____target.setSrc(extendedTypeToTType);
		extendedTypeToTType__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(extendedTypeToTType__tType____target);
		pg__tType____classes.setSrc(pg);
		pg__tType____classes.setTrg(tType);
		ruleresult.getCreatedEdges().add(pg__tType____classes);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tMethodDefinition__tType____returnType
				.setName(tMethodDefinition__tType____returnType_name_prime);
		jMethod__extendedType____extendedReturnType
				.setName(jMethod__extendedType____extendedReturnType_name_prime);
		extendedTypeToTType__extendedType____source
				.setName(extendedTypeToTType__extendedType____source_name_prime);
		extendedTypeToTType__tType____target
				.setName(extendedTypeToTType__tType____target_name_prime);
		pg__tType____classes.setName(pg__tType____classes_name_prime);
		return new Object[] { ruleresult, tType, extendedType,
				tMethodDefinition, jMethod, extendedTypeToTType, pg,
				tMethodDefinition__tType____returnType,
				jMethod__extendedType____extendedReturnType,
				extendedTypeToTType__extendedType____source,
				extendedTypeToTType__tType____target, pg__tType____classes };
	}

	public static final void pattern_ReturnTypeFromLibCreate_1_5_expressionBBBBBBBBBBBB(
			ReturnTypeFromLibCreate _this, PerformRuleResult ruleresult,
			EObject jClass, EObject tClass, EObject jClassToTClass,
			EObject tType, EObject extendedType, EObject tMethodDefinition,
			EObject jMethod, EObject jMethodToTMethodDefinition,
			EObject extendedTypeToTType, EObject pg) {
		_this.registerObjects_FWD(ruleresult, jClass, tClass, jClassToTClass,
				tType, extendedType, tMethodDefinition, jMethod,
				jMethodToTMethodDefinition, extendedTypeToTType, pg);

	}

	public static final PerformRuleResult pattern_ReturnTypeFromLibCreate_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_2_1_bindingFB(
			ReturnTypeFromLibCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_2_1_blackFBB(
			EClass eClass, ReturnTypeFromLibCreate _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_2_1_bindingAndBlackFFB(
			ReturnTypeFromLibCreate _this) {
		Object[] result_pattern_ReturnTypeFromLibCreate_2_1_binding = pattern_ReturnTypeFromLibCreate_2_1_bindingFB(_this);
		if (result_pattern_ReturnTypeFromLibCreate_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ReturnTypeFromLibCreate_2_1_binding[0];

			Object[] result_pattern_ReturnTypeFromLibCreate_2_1_black = pattern_ReturnTypeFromLibCreate_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ReturnTypeFromLibCreate_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ReturnTypeFromLibCreate_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ReturnTypeFromLibCreate";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_2_2_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("jClass");
		EObject _localVariable_1 = match.getObject("extendedType");
		EObject _localVariable_2 = match.getObject("jMethod");
		EObject tmpJClass = _localVariable_0;
		EObject tmpExtendedType = _localVariable_1;
		EObject tmpJMethod = _localVariable_2;
		if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
			if (tmpExtendedType instanceof ExtendedType) {
				ExtendedType extendedType = (ExtendedType) tmpExtendedType;
				if (tmpJMethod instanceof ExtendedClassMethod) {
					ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
					return new Object[] { jClass, extendedType, jMethod, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ReturnTypeFromLibCreate_2_2_blackBFFBFBFB(
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedType extendedType, ExtendedClassMethod jMethod, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		boolean extendedTypeisFromLib = extendedType.isIsFromLib();
		if (Boolean.valueOf(extendedTypeisFromLib)
				.equals(Boolean.valueOf(true))) {
			for (ClassToTClass jClassToTClass : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(jClass, ClassToTClass.class,
							"source")) {
				TClass tClass = jClassToTClass.getTarget();
				if (tClass != null) {
					for (ClassMethodToTMethodDefinition jMethodToTMethodDefinition : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(jMethod,
									ClassMethodToTMethodDefinition.class,
									"source")) {
						TMethodDefinition tMethodDefinition = jMethodToTMethodDefinition
								.getTarget();
						if (tMethodDefinition != null) {
							_result.add(new Object[] { jClass, tClass,
									jClassToTClass, extendedType,
									tMethodDefinition, jMethod,
									jMethodToTMethodDefinition, match });
						}

					}
				}

			}
		}

		return _result;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_2_3_black_nac_0BBB(
			TypeGraph pg, TClass tClass, ExtendedType extendedType) {
		String extendedTypetypeName = extendedType.getTypeName();
		for (TClass tExistingType : pg.getClasses()) {
			if (!tClass.equals(tExistingType)) {
				String tExistingTypetName = tExistingType.getTName();
				if (tExistingTypetName.equals(extendedTypetypeName)) {
					return new Object[] { pg, tClass, extendedType };
				}

			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_ReturnTypeFromLibCreate_2_3_blackBBBBBBBF(
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, ExtendedType extendedType,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (jClass.getMembers().contains(jMethod)) {
			if (tClass.getDefines().contains(tMethodDefinition)) {
				if (jClass.equals(jClassToTClass.getSource())) {
					if (tClass.equals(jClassToTClass.getTarget())) {
						if (extendedType
								.equals(jMethod.getExtendedReturnType())) {
							if (tMethodDefinition
									.equals(jMethodToTMethodDefinition
											.getTarget())) {
								if (jMethod.equals(jMethodToTMethodDefinition
										.getSource())) {
									boolean extendedTypeisFromLib = extendedType
											.isIsFromLib();
									if (Boolean.valueOf(extendedTypeisFromLib)
											.equals(Boolean.valueOf(true))) {
										for (TypeGraph pg : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														tClass,
														TypeGraph.class,
														"classes")) {
											if (pattern_ReturnTypeFromLibCreate_2_3_black_nac_0BBB(
													pg, tClass, extendedType) == null) {
												_result.add(new Object[] {
														jClass,
														tClass,
														jClassToTClass,
														extendedType,
														tMethodDefinition,
														jMethod,
														jMethodToTMethodDefinition,
														pg });
											}
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

	public static final Object[] pattern_ReturnTypeFromLibCreate_2_3_greenBBBBBBBBFFFFFFFFF(
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, ExtendedType extendedType,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			TypeGraph pg) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge jClass__jMethod____members = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tClass__tMethodDefinition____defines = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClassToTClass__jClass____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClassToTClass__tClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__extendedType____extendedReturnType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodDefinition__tMethodDefinition____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodDefinition__jMethod____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jClass__jMethod____members_name_prime = "members";
		String tClass__tMethodDefinition____defines_name_prime = "defines";
		String jClassToTClass__jClass____source_name_prime = "source";
		String jClassToTClass__tClass____target_name_prime = "target";
		String jMethod__extendedType____extendedReturnType_name_prime = "extendedReturnType";
		String jMethodToTMethodDefinition__tMethodDefinition____target_name_prime = "target";
		String jMethodToTMethodDefinition__jMethod____source_name_prime = "source";
		String pg__tClass____classes_name_prime = "classes";
		isApplicableMatch.getAllContextElements().add(jClass);
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(jClassToTClass);
		isApplicableMatch.getAllContextElements().add(extendedType);
		isApplicableMatch.getAllContextElements().add(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(jMethod);
		isApplicableMatch.getAllContextElements().add(
				jMethodToTMethodDefinition);
		isApplicableMatch.getAllContextElements().add(pg);
		jClass__jMethod____members.setSrc(jClass);
		jClass__jMethod____members.setTrg(jMethod);
		isApplicableMatch.getAllContextElements().add(
				jClass__jMethod____members);
		tClass__tMethodDefinition____defines.setSrc(tClass);
		tClass__tMethodDefinition____defines.setTrg(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(
				tClass__tMethodDefinition____defines);
		jClassToTClass__jClass____source.setSrc(jClassToTClass);
		jClassToTClass__jClass____source.setTrg(jClass);
		isApplicableMatch.getAllContextElements().add(
				jClassToTClass__jClass____source);
		jClassToTClass__tClass____target.setSrc(jClassToTClass);
		jClassToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(
				jClassToTClass__tClass____target);
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
		pg__tClass____classes.setSrc(pg);
		pg__tClass____classes.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(pg__tClass____classes);
		jClass__jMethod____members
				.setName(jClass__jMethod____members_name_prime);
		tClass__tMethodDefinition____defines
				.setName(tClass__tMethodDefinition____defines_name_prime);
		jClassToTClass__jClass____source
				.setName(jClassToTClass__jClass____source_name_prime);
		jClassToTClass__tClass____target
				.setName(jClassToTClass__tClass____target_name_prime);
		jMethod__extendedType____extendedReturnType
				.setName(jMethod__extendedType____extendedReturnType_name_prime);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setName(jMethodToTMethodDefinition__tMethodDefinition____target_name_prime);
		jMethodToTMethodDefinition__jMethod____source
				.setName(jMethodToTMethodDefinition__jMethod____source_name_prime);
		pg__tClass____classes.setName(pg__tClass____classes_name_prime);
		return new Object[] { jClass, tClass, jClassToTClass, extendedType,
				tMethodDefinition, jMethod, jMethodToTMethodDefinition, pg,
				isApplicableMatch, jClass__jMethod____members,
				tClass__tMethodDefinition____defines,
				jClassToTClass__jClass____source,
				jClassToTClass__tClass____target,
				jMethod__extendedType____extendedReturnType,
				jMethodToTMethodDefinition__tMethodDefinition____target,
				jMethodToTMethodDefinition__jMethod____source,
				pg__tClass____classes };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_2_4_bindingFBBBBBBBBBB(
			ReturnTypeFromLibCreate _this, IsApplicableMatch isApplicableMatch,
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, ExtendedType extendedType,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			TypeGraph pg) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, jClass, tClass, jClassToTClass,
				extendedType, tMethodDefinition, jMethod,
				jMethodToTMethodDefinition, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jClass,
					tClass, jClassToTClass, extendedType, tMethodDefinition,
					jMethod, jMethodToTMethodDefinition, pg };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_2_4_bindingAndBlackFBBBBBBBBBB(
			ReturnTypeFromLibCreate _this, IsApplicableMatch isApplicableMatch,
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, ExtendedType extendedType,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			TypeGraph pg) {
		Object[] result_pattern_ReturnTypeFromLibCreate_2_4_binding = pattern_ReturnTypeFromLibCreate_2_4_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, jClass, tClass, jClassToTClass,
				extendedType, tMethodDefinition, jMethod,
				jMethodToTMethodDefinition, pg);
		if (result_pattern_ReturnTypeFromLibCreate_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ReturnTypeFromLibCreate_2_4_binding[0];

			Object[] result_pattern_ReturnTypeFromLibCreate_2_4_black = pattern_ReturnTypeFromLibCreate_2_4_blackB(csp);
			if (result_pattern_ReturnTypeFromLibCreate_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jClass,
						tClass, jClassToTClass, extendedType,
						tMethodDefinition, jMethod, jMethodToTMethodDefinition,
						pg };
			}
		}
		return null;
	}

	public static final boolean pattern_ReturnTypeFromLibCreate_2_5_expressionFBB(
			ReturnTypeFromLibCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ReturnTypeFromLibCreate";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ReturnTypeFromLibCreate_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_10_1_blackBBBBBB(
			ReturnTypeFromLibCreate _this, Match match, TClass tClass,
			TClass tType, TMethodDefinition tMethodDefinition, TypeGraph pg) {
		if (!tClass.equals(tType)) {
			return new Object[] { _this, match, tClass, tType,
					tMethodDefinition, pg };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_10_2_bindingFBBBBBB(
			ReturnTypeFromLibCreate _this, Match match, TClass tClass,
			TClass tType, TMethodDefinition tMethodDefinition, TypeGraph pg) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tClass,
				tType, tMethodDefinition, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tClass, tType,
					tMethodDefinition, pg };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_10_2_bindingAndBlackFBBBBBB(
			ReturnTypeFromLibCreate _this, Match match, TClass tClass,
			TClass tType, TMethodDefinition tMethodDefinition, TypeGraph pg) {
		Object[] result_pattern_ReturnTypeFromLibCreate_10_2_binding = pattern_ReturnTypeFromLibCreate_10_2_bindingFBBBBBB(
				_this, match, tClass, tType, tMethodDefinition, pg);
		if (result_pattern_ReturnTypeFromLibCreate_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ReturnTypeFromLibCreate_10_2_binding[0];

			Object[] result_pattern_ReturnTypeFromLibCreate_10_2_black = pattern_ReturnTypeFromLibCreate_10_2_blackB(csp);
			if (result_pattern_ReturnTypeFromLibCreate_10_2_black != null) {

				return new Object[] { csp, _this, match, tClass, tType,
						tMethodDefinition, pg };
			}
		}
		return null;
	}

	public static final boolean pattern_ReturnTypeFromLibCreate_10_3_expressionFBB(
			ReturnTypeFromLibCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_10_4_blackBBBBB(
			Match match, TClass tClass, TClass tType,
			TMethodDefinition tMethodDefinition, TypeGraph pg) {
		if (!tClass.equals(tType)) {
			return new Object[] { match, tClass, tType, tMethodDefinition, pg };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_10_4_greenBBBBFF(
			Match match, TClass tType, TMethodDefinition tMethodDefinition,
			TypeGraph pg) {
		EMoflonEdge tMethodDefinition__tType____returnType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tType____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tType);
		String tMethodDefinition__tType____returnType_name_prime = "returnType";
		String pg__tType____classes_name_prime = "classes";
		tMethodDefinition__tType____returnType.setSrc(tMethodDefinition);
		tMethodDefinition__tType____returnType.setTrg(tType);
		match.getToBeTranslatedEdges().add(
				tMethodDefinition__tType____returnType);
		pg__tType____classes.setSrc(pg);
		pg__tType____classes.setTrg(tType);
		match.getToBeTranslatedEdges().add(pg__tType____classes);
		tMethodDefinition__tType____returnType
				.setName(tMethodDefinition__tType____returnType_name_prime);
		pg__tType____classes.setName(pg__tType____classes_name_prime);
		return new Object[] { match, tType, tMethodDefinition, pg,
				tMethodDefinition__tType____returnType, pg__tType____classes };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_10_5_blackBBBBB(
			Match match, TClass tClass, TClass tType,
			TMethodDefinition tMethodDefinition, TypeGraph pg) {
		if (!tClass.equals(tType)) {
			return new Object[] { match, tClass, tType, tMethodDefinition, pg };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_10_5_greenBBBBFF(
			Match match, TClass tClass, TMethodDefinition tMethodDefinition,
			TypeGraph pg) {
		EMoflonEdge tClass__tMethodDefinition____defines = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(tClass);
		match.getContextNodes().add(tMethodDefinition);
		match.getContextNodes().add(pg);
		String tClass__tMethodDefinition____defines_name_prime = "defines";
		String pg__tClass____classes_name_prime = "classes";
		tClass__tMethodDefinition____defines.setSrc(tClass);
		tClass__tMethodDefinition____defines.setTrg(tMethodDefinition);
		match.getContextEdges().add(tClass__tMethodDefinition____defines);
		pg__tClass____classes.setSrc(pg);
		pg__tClass____classes.setTrg(tClass);
		match.getContextEdges().add(pg__tClass____classes);
		tClass__tMethodDefinition____defines
				.setName(tClass__tMethodDefinition____defines_name_prime);
		pg__tClass____classes.setName(pg__tClass____classes_name_prime);
		return new Object[] { match, tClass, tMethodDefinition, pg,
				tClass__tMethodDefinition____defines, pg__tClass____classes };
	}

	public static final void pattern_ReturnTypeFromLibCreate_10_6_expressionBBBBBB(
			ReturnTypeFromLibCreate _this, Match match, TClass tClass,
			TClass tType, TMethodDefinition tMethodDefinition, TypeGraph pg) {
		_this.registerObjectsToMatch_BWD(match, tClass, tType,
				tMethodDefinition, pg);

	}

	public static final boolean pattern_ReturnTypeFromLibCreate_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ReturnTypeFromLibCreate_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_11_1_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("jClassToTClass");
		EObject _localVariable_3 = isApplicableMatch.getObject("tType");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("tMethodDefinition");
		EObject _localVariable_5 = isApplicableMatch.getObject("jMethod");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("jMethodToTMethodDefinition");
		EObject _localVariable_7 = isApplicableMatch.getObject("pg");
		EObject tmpJClass = _localVariable_0;
		EObject tmpTClass = _localVariable_1;
		EObject tmpJClassToTClass = _localVariable_2;
		EObject tmpTType = _localVariable_3;
		EObject tmpTMethodDefinition = _localVariable_4;
		EObject tmpJMethod = _localVariable_5;
		EObject tmpJMethodToTMethodDefinition = _localVariable_6;
		EObject tmpPg = _localVariable_7;
		if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				if (tmpJClassToTClass instanceof ClassToTClass) {
					ClassToTClass jClassToTClass = (ClassToTClass) tmpJClassToTClass;
					if (tmpTType instanceof TClass) {
						TClass tType = (TClass) tmpTType;
						if (tmpTMethodDefinition instanceof TMethodDefinition) {
							TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
							if (tmpJMethod instanceof ExtendedClassMethod) {
								ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
								if (tmpJMethodToTMethodDefinition instanceof ClassMethodToTMethodDefinition) {
									ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) tmpJMethodToTMethodDefinition;
									if (tmpPg instanceof TypeGraph) {
										TypeGraph pg = (TypeGraph) tmpPg;
										return new Object[] { jClass, tClass,
												jClassToTClass, tType,
												tMethodDefinition, jMethod,
												jMethodToTMethodDefinition, pg,
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

	public static final Object[] pattern_ReturnTypeFromLibCreate_11_1_blackBBBBBBBBFBB(
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, TClass tType,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			TypeGraph pg, ReturnTypeFromLibCreate _this,
			IsApplicableMatch isApplicableMatch) {
		if (!tClass.equals(tType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { jClass, tClass, jClassToTClass,
							tType, tMethodDefinition, jMethod,
							jMethodToTMethodDefinition, pg, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_11_1_bindingAndBlackFFFFFFFFFBB(
			ReturnTypeFromLibCreate _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ReturnTypeFromLibCreate_11_1_binding = pattern_ReturnTypeFromLibCreate_11_1_bindingFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ReturnTypeFromLibCreate_11_1_binding != null) {
			org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result_pattern_ReturnTypeFromLibCreate_11_1_binding[0];
			TClass tClass = (TClass) result_pattern_ReturnTypeFromLibCreate_11_1_binding[1];
			ClassToTClass jClassToTClass = (ClassToTClass) result_pattern_ReturnTypeFromLibCreate_11_1_binding[2];
			TClass tType = (TClass) result_pattern_ReturnTypeFromLibCreate_11_1_binding[3];
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result_pattern_ReturnTypeFromLibCreate_11_1_binding[4];
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result_pattern_ReturnTypeFromLibCreate_11_1_binding[5];
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result_pattern_ReturnTypeFromLibCreate_11_1_binding[6];
			TypeGraph pg = (TypeGraph) result_pattern_ReturnTypeFromLibCreate_11_1_binding[7];

			Object[] result_pattern_ReturnTypeFromLibCreate_11_1_black = pattern_ReturnTypeFromLibCreate_11_1_blackBBBBBBBBFBB(
					jClass, tClass, jClassToTClass, tType, tMethodDefinition,
					jMethod, jMethodToTMethodDefinition, pg, _this,
					isApplicableMatch);
			if (result_pattern_ReturnTypeFromLibCreate_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ReturnTypeFromLibCreate_11_1_black[8];

				return new Object[] { jClass, tClass, jClassToTClass, tType,
						tMethodDefinition, jMethod, jMethodToTMethodDefinition,
						pg, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_11_1_greenBFBFB(
			TClass tType, ExtendedClassMethod jMethod, CSP csp) {
		ExtendedType extendedType = ExtendedJamoppFactory.eINSTANCE
				.createExtendedType();
		ExtendedTypeToTClass extendedTypeToTType = GravityTGGFactory.eINSTANCE
				.createExtendedTypeToTClass();
		boolean extendedType_isFromLib_prime = Boolean.valueOf(true);
		Object _localVariable_0 = csp.getValue("extendedType", "typeName");
		jMethod.setExtendedReturnType(extendedType);
		extendedTypeToTType.setSource(extendedType);
		extendedTypeToTType.setTarget(tType);
		extendedType
				.setIsFromLib(Boolean.valueOf(extendedType_isFromLib_prime));
		String extendedType_typeName_prime = (String) _localVariable_0;
		extendedType.setTypeName(extendedType_typeName_prime);
		return new Object[] { tType, extendedType, jMethod,
				extendedTypeToTType, csp };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_11_2_blackBBB(
			TClass tType, ExtendedType extendedType,
			ExtendedTypeToTClass extendedTypeToTType) {
		return new Object[] { tType, extendedType, extendedTypeToTType };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_11_2_greenFBBB(
			TClass tType, ExtendedType extendedType,
			ExtendedTypeToTClass extendedTypeToTType) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tType);
		ruleresult.getCreatedElements().add(extendedType);
		ruleresult.getCreatedLinkElements().add(extendedTypeToTType);
		return new Object[] { ruleresult, tType, extendedType,
				extendedTypeToTType };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_11_3_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject jClass, EObject tClass,
			EObject jClassToTClass, EObject tType, EObject extendedType,
			EObject tMethodDefinition, EObject jMethod,
			EObject jMethodToTMethodDefinition, EObject extendedTypeToTType,
			EObject pg) {
		if (!jClass.equals(tClass)) {
			if (!jClass.equals(jClassToTClass)) {
				if (!jClass.equals(tType)) {
					if (!jClass.equals(tMethodDefinition)) {
						if (!jClass.equals(jMethod)) {
							if (!jClass.equals(jMethodToTMethodDefinition)) {
								if (!jClass.equals(pg)) {
									if (!tClass.equals(tType)) {
										if (!tClass.equals(tMethodDefinition)) {
											if (!jClassToTClass.equals(tClass)) {
												if (!jClassToTClass
														.equals(tType)) {
													if (!jClassToTClass
															.equals(tMethodDefinition)) {
														if (!jClassToTClass
																.equals(jMethod)) {
															if (!jClassToTClass
																	.equals(jMethodToTMethodDefinition)) {
																if (!jClassToTClass
																		.equals(pg)) {
																	if (!extendedType
																			.equals(jClass)) {
																		if (!extendedType
																				.equals(tClass)) {
																			if (!extendedType
																					.equals(jClassToTClass)) {
																				if (!extendedType
																						.equals(tType)) {
																					if (!extendedType
																							.equals(tMethodDefinition)) {
																						if (!extendedType
																								.equals(jMethod)) {
																							if (!extendedType
																									.equals(jMethodToTMethodDefinition)) {
																								if (!extendedType
																										.equals(extendedTypeToTType)) {
																									if (!extendedType
																											.equals(pg)) {
																										if (!tMethodDefinition
																												.equals(tType)) {
																											if (!jMethod
																													.equals(tClass)) {
																												if (!jMethod
																														.equals(tType)) {
																													if (!jMethod
																															.equals(tMethodDefinition)) {
																														if (!jMethod
																																.equals(jMethodToTMethodDefinition)) {
																															if (!jMethod
																																	.equals(pg)) {
																																if (!jMethodToTMethodDefinition
																																		.equals(tClass)) {
																																	if (!jMethodToTMethodDefinition
																																			.equals(tType)) {
																																		if (!jMethodToTMethodDefinition
																																				.equals(tMethodDefinition)) {
																																			if (!jMethodToTMethodDefinition
																																					.equals(pg)) {
																																				if (!extendedTypeToTType
																																						.equals(jClass)) {
																																					if (!extendedTypeToTType
																																							.equals(tClass)) {
																																						if (!extendedTypeToTType
																																								.equals(jClassToTClass)) {
																																							if (!extendedTypeToTType
																																									.equals(tType)) {
																																								if (!extendedTypeToTType
																																										.equals(tMethodDefinition)) {
																																									if (!extendedTypeToTType
																																											.equals(jMethod)) {
																																										if (!extendedTypeToTType
																																												.equals(jMethodToTMethodDefinition)) {
																																											if (!extendedTypeToTType
																																													.equals(pg)) {
																																												if (!pg.equals(tClass)) {
																																													if (!pg.equals(tType)) {
																																														if (!pg.equals(tMethodDefinition)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	jClass,
																																																	tClass,
																																																	jClassToTClass,
																																																	tType,
																																																	extendedType,
																																																	tMethodDefinition,
																																																	jMethod,
																																																	jMethodToTMethodDefinition,
																																																	extendedTypeToTType,
																																																	pg };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ReturnTypeFromLibCreate_11_3_greenBBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tType, EObject extendedType,
			EObject tMethodDefinition, EObject jMethod,
			EObject extendedTypeToTType, EObject pg) {
		EMoflonEdge tMethodDefinition__tType____returnType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__extendedType____extendedReturnType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedTypeToTType__extendedType____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedTypeToTType__tType____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tType____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ReturnTypeFromLibCreate";
		String tMethodDefinition__tType____returnType_name_prime = "returnType";
		String jMethod__extendedType____extendedReturnType_name_prime = "extendedReturnType";
		String extendedTypeToTType__extendedType____source_name_prime = "source";
		String extendedTypeToTType__tType____target_name_prime = "target";
		String pg__tType____classes_name_prime = "classes";
		tMethodDefinition__tType____returnType.setSrc(tMethodDefinition);
		tMethodDefinition__tType____returnType.setTrg(tType);
		ruleresult.getTranslatedEdges().add(
				tMethodDefinition__tType____returnType);
		jMethod__extendedType____extendedReturnType.setSrc(jMethod);
		jMethod__extendedType____extendedReturnType.setTrg(extendedType);
		ruleresult.getCreatedEdges().add(
				jMethod__extendedType____extendedReturnType);
		extendedTypeToTType__extendedType____source.setSrc(extendedTypeToTType);
		extendedTypeToTType__extendedType____source.setTrg(extendedType);
		ruleresult.getCreatedEdges().add(
				extendedTypeToTType__extendedType____source);
		extendedTypeToTType__tType____target.setSrc(extendedTypeToTType);
		extendedTypeToTType__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(extendedTypeToTType__tType____target);
		pg__tType____classes.setSrc(pg);
		pg__tType____classes.setTrg(tType);
		ruleresult.getTranslatedEdges().add(pg__tType____classes);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tMethodDefinition__tType____returnType
				.setName(tMethodDefinition__tType____returnType_name_prime);
		jMethod__extendedType____extendedReturnType
				.setName(jMethod__extendedType____extendedReturnType_name_prime);
		extendedTypeToTType__extendedType____source
				.setName(extendedTypeToTType__extendedType____source_name_prime);
		extendedTypeToTType__tType____target
				.setName(extendedTypeToTType__tType____target_name_prime);
		pg__tType____classes.setName(pg__tType____classes_name_prime);
		return new Object[] { ruleresult, tType, extendedType,
				tMethodDefinition, jMethod, extendedTypeToTType, pg,
				tMethodDefinition__tType____returnType,
				jMethod__extendedType____extendedReturnType,
				extendedTypeToTType__extendedType____source,
				extendedTypeToTType__tType____target, pg__tType____classes };
	}

	public static final void pattern_ReturnTypeFromLibCreate_11_5_expressionBBBBBBBBBBBB(
			ReturnTypeFromLibCreate _this, PerformRuleResult ruleresult,
			EObject jClass, EObject tClass, EObject jClassToTClass,
			EObject tType, EObject extendedType, EObject tMethodDefinition,
			EObject jMethod, EObject jMethodToTMethodDefinition,
			EObject extendedTypeToTType, EObject pg) {
		_this.registerObjects_BWD(ruleresult, jClass, tClass, jClassToTClass,
				tType, extendedType, tMethodDefinition, jMethod,
				jMethodToTMethodDefinition, extendedTypeToTType, pg);

	}

	public static final PerformRuleResult pattern_ReturnTypeFromLibCreate_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_12_1_bindingFB(
			ReturnTypeFromLibCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_12_1_blackFBB(
			EClass eClass, ReturnTypeFromLibCreate _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_12_1_bindingAndBlackFFB(
			ReturnTypeFromLibCreate _this) {
		Object[] result_pattern_ReturnTypeFromLibCreate_12_1_binding = pattern_ReturnTypeFromLibCreate_12_1_bindingFB(_this);
		if (result_pattern_ReturnTypeFromLibCreate_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ReturnTypeFromLibCreate_12_1_binding[0];

			Object[] result_pattern_ReturnTypeFromLibCreate_12_1_black = pattern_ReturnTypeFromLibCreate_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ReturnTypeFromLibCreate_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ReturnTypeFromLibCreate_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ReturnTypeFromLibCreate";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_12_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("tClass");
		EObject _localVariable_1 = match.getObject("tType");
		EObject _localVariable_2 = match.getObject("tMethodDefinition");
		EObject _localVariable_3 = match.getObject("pg");
		EObject tmpTClass = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpTMethodDefinition = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpTType instanceof TClass) {
				TClass tType = (TClass) tmpTType;
				if (tmpTMethodDefinition instanceof TMethodDefinition) {
					TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						return new Object[] { tClass, tType, tMethodDefinition,
								pg, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ReturnTypeFromLibCreate_12_2_blackFBFBBFFBB(
			TClass tClass, TClass tType, TMethodDefinition tMethodDefinition,
			TypeGraph pg, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tClass.equals(tType)) {
			for (ClassToTClass jClassToTClass : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tClass, ClassToTClass.class,
							"target")) {
				org.emftext.language.java.classifiers.Class jClass = jClassToTClass
						.getSource();
				if (jClass != null) {
					for (ClassMethodToTMethodDefinition jMethodToTMethodDefinition : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tMethodDefinition,
									ClassMethodToTMethodDefinition.class,
									"target")) {
						ExtendedClassMethod jMethod = jMethodToTMethodDefinition
								.getSource();
						if (jMethod != null) {
							_result.add(new Object[] { jClass, tClass,
									jClassToTClass, tType, tMethodDefinition,
									jMethod, jMethodToTMethodDefinition, pg,
									match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ReturnTypeFromLibCreate_12_3_blackBBBBBBBB(
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, TClass tType,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			TypeGraph pg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tClass.equals(tType)) {
			if (jClass.getMembers().contains(jMethod)) {
				if (tClass.getDefines().contains(tMethodDefinition)) {
					if (jClass.equals(jClassToTClass.getSource())) {
						if (tClass.equals(jClassToTClass.getTarget())) {
							if (tType.equals(tMethodDefinition.getReturnType())) {
								if (tMethodDefinition
										.equals(jMethodToTMethodDefinition
												.getTarget())) {
									if (jMethod
											.equals(jMethodToTMethodDefinition
													.getSource())) {
										if (pg.getClasses().contains(tClass)) {
											if (pg.getClasses().contains(tType)) {
												_result.add(new Object[] {
														jClass,
														tClass,
														jClassToTClass,
														tType,
														tMethodDefinition,
														jMethod,
														jMethodToTMethodDefinition,
														pg });
											}
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

	public static final Object[] pattern_ReturnTypeFromLibCreate_12_3_greenBBBBBBBBFFFFFFFFFF(
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, TClass tType,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			TypeGraph pg) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge jClass__jMethod____members = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tClass__tMethodDefinition____defines = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClassToTClass__jClass____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jClassToTClass__tClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodDefinition__tType____returnType = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodDefinition__tMethodDefinition____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodDefinition__jMethod____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tType____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jClass__jMethod____members_name_prime = "members";
		String tClass__tMethodDefinition____defines_name_prime = "defines";
		String jClassToTClass__jClass____source_name_prime = "source";
		String jClassToTClass__tClass____target_name_prime = "target";
		String tMethodDefinition__tType____returnType_name_prime = "returnType";
		String jMethodToTMethodDefinition__tMethodDefinition____target_name_prime = "target";
		String jMethodToTMethodDefinition__jMethod____source_name_prime = "source";
		String pg__tClass____classes_name_prime = "classes";
		String pg__tType____classes_name_prime = "classes";
		isApplicableMatch.getAllContextElements().add(jClass);
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(jClassToTClass);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(jMethod);
		isApplicableMatch.getAllContextElements().add(
				jMethodToTMethodDefinition);
		isApplicableMatch.getAllContextElements().add(pg);
		jClass__jMethod____members.setSrc(jClass);
		jClass__jMethod____members.setTrg(jMethod);
		isApplicableMatch.getAllContextElements().add(
				jClass__jMethod____members);
		tClass__tMethodDefinition____defines.setSrc(tClass);
		tClass__tMethodDefinition____defines.setTrg(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(
				tClass__tMethodDefinition____defines);
		jClassToTClass__jClass____source.setSrc(jClassToTClass);
		jClassToTClass__jClass____source.setTrg(jClass);
		isApplicableMatch.getAllContextElements().add(
				jClassToTClass__jClass____source);
		jClassToTClass__tClass____target.setSrc(jClassToTClass);
		jClassToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(
				jClassToTClass__tClass____target);
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
		pg__tClass____classes.setSrc(pg);
		pg__tClass____classes.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(pg__tClass____classes);
		pg__tType____classes.setSrc(pg);
		pg__tType____classes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(pg__tType____classes);
		jClass__jMethod____members
				.setName(jClass__jMethod____members_name_prime);
		tClass__tMethodDefinition____defines
				.setName(tClass__tMethodDefinition____defines_name_prime);
		jClassToTClass__jClass____source
				.setName(jClassToTClass__jClass____source_name_prime);
		jClassToTClass__tClass____target
				.setName(jClassToTClass__tClass____target_name_prime);
		tMethodDefinition__tType____returnType
				.setName(tMethodDefinition__tType____returnType_name_prime);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setName(jMethodToTMethodDefinition__tMethodDefinition____target_name_prime);
		jMethodToTMethodDefinition__jMethod____source
				.setName(jMethodToTMethodDefinition__jMethod____source_name_prime);
		pg__tClass____classes.setName(pg__tClass____classes_name_prime);
		pg__tType____classes.setName(pg__tType____classes_name_prime);
		return new Object[] { jClass, tClass, jClassToTClass, tType,
				tMethodDefinition, jMethod, jMethodToTMethodDefinition, pg,
				isApplicableMatch, jClass__jMethod____members,
				tClass__tMethodDefinition____defines,
				jClassToTClass__jClass____source,
				jClassToTClass__tClass____target,
				tMethodDefinition__tType____returnType,
				jMethodToTMethodDefinition__tMethodDefinition____target,
				jMethodToTMethodDefinition__jMethod____source,
				pg__tClass____classes, pg__tType____classes };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_12_4_bindingFBBBBBBBBBB(
			ReturnTypeFromLibCreate _this, IsApplicableMatch isApplicableMatch,
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, TClass tType,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			TypeGraph pg) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, jClass, tClass, jClassToTClass, tType,
				tMethodDefinition, jMethod, jMethodToTMethodDefinition, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jClass,
					tClass, jClassToTClass, tType, tMethodDefinition, jMethod,
					jMethodToTMethodDefinition, pg };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_12_4_bindingAndBlackFBBBBBBBBBB(
			ReturnTypeFromLibCreate _this, IsApplicableMatch isApplicableMatch,
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, TClass tType,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			TypeGraph pg) {
		Object[] result_pattern_ReturnTypeFromLibCreate_12_4_binding = pattern_ReturnTypeFromLibCreate_12_4_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, jClass, tClass, jClassToTClass,
				tType, tMethodDefinition, jMethod, jMethodToTMethodDefinition,
				pg);
		if (result_pattern_ReturnTypeFromLibCreate_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ReturnTypeFromLibCreate_12_4_binding[0];

			Object[] result_pattern_ReturnTypeFromLibCreate_12_4_black = pattern_ReturnTypeFromLibCreate_12_4_blackB(csp);
			if (result_pattern_ReturnTypeFromLibCreate_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jClass,
						tClass, jClassToTClass, tType, tMethodDefinition,
						jMethod, jMethodToTMethodDefinition, pg };
			}
		}
		return null;
	}

	public static final boolean pattern_ReturnTypeFromLibCreate_12_5_expressionFBB(
			ReturnTypeFromLibCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ReturnTypeFromLibCreate";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ReturnTypeFromLibCreate_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_20_1_bindingFB(
			ReturnTypeFromLibCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_20_1_blackFBB(
			EClass __eClass, ReturnTypeFromLibCreate _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_20_1_bindingAndBlackFFB(
			ReturnTypeFromLibCreate _this) {
		Object[] result_pattern_ReturnTypeFromLibCreate_20_1_binding = pattern_ReturnTypeFromLibCreate_20_1_bindingFB(_this);
		if (result_pattern_ReturnTypeFromLibCreate_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ReturnTypeFromLibCreate_20_1_binding[0];

			Object[] result_pattern_ReturnTypeFromLibCreate_20_1_black = pattern_ReturnTypeFromLibCreate_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ReturnTypeFromLibCreate_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ReturnTypeFromLibCreate_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_20_2_black_nac_0B(
			TClass tType) {
		TPackage __DEC_tType_containedClasses_346511 = tType.getPackage();
		if (__DEC_tType_containedClasses_346511 != null) {
			return new Object[] { tType };
		}

		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_20_2_black_nac_1BB(
			TClass tType, TypeGraph pg) {
		for (TypeGraph __DEC_tType_classes_849588 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tType_classes_849588)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ReturnTypeFromLibCreate_20_2_blackFFFFB(
			EMoflonEdge _edge_returnType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMethodDefinition = _edge_returnType.getSrc();
		if (tmpTMethodDefinition instanceof TMethodDefinition) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
			EObject tmpTType = _edge_returnType.getTrg();
			if (tmpTType instanceof TClass) {
				TClass tType = (TClass) tmpTType;
				if (tType.equals(tMethodDefinition.getReturnType())) {
					if (pattern_ReturnTypeFromLibCreate_20_2_black_nac_0B(tType) == null) {
						for (TClass tClass : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tMethodDefinition,
										TClass.class, "defines")) {
							if (!tClass.equals(tType)) {
								for (TypeGraph pg : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(tType,
												TypeGraph.class, "classes")) {
									if (pg.getClasses().contains(tClass)) {
										if (pattern_ReturnTypeFromLibCreate_20_2_black_nac_1BB(
												tType, pg) == null) {
											_result.add(new Object[] { tClass,
													tType, tMethodDefinition,
													pg, _edge_returnType });
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

	public static final Object[] pattern_ReturnTypeFromLibCreate_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ReturnTypeFromLibCreate_20_3_expressionFBBBBBB(
			ReturnTypeFromLibCreate _this, Match match, TClass tClass,
			TClass tType, TMethodDefinition tMethodDefinition, TypeGraph pg) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tClass,
				tType, tMethodDefinition, pg);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ReturnTypeFromLibCreate_20_4_expressionFBB(
			ReturnTypeFromLibCreate _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ReturnTypeFromLibCreate_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_21_1_bindingFB(
			ReturnTypeFromLibCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_21_1_blackFBB(
			EClass __eClass, ReturnTypeFromLibCreate _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_21_1_bindingAndBlackFFB(
			ReturnTypeFromLibCreate _this) {
		Object[] result_pattern_ReturnTypeFromLibCreate_21_1_binding = pattern_ReturnTypeFromLibCreate_21_1_bindingFB(_this);
		if (result_pattern_ReturnTypeFromLibCreate_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ReturnTypeFromLibCreate_21_1_binding[0];

			Object[] result_pattern_ReturnTypeFromLibCreate_21_1_black = pattern_ReturnTypeFromLibCreate_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ReturnTypeFromLibCreate_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ReturnTypeFromLibCreate_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_21_2_black_nac_0BB(
			ExtendedType extendedType,
			org.emftext.language.java.classifiers.Class jClass) {
		Type __DEC_extendedType_type_378593 = extendedType.getType();
		if (__DEC_extendedType_type_378593 != null) {
			if (!jClass.equals(__DEC_extendedType_type_378593)) {
				return new Object[] { extendedType, jClass };
			}
		}

		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_21_2_black_nac_1BB(
			ExtendedType extendedType, ExtendedClassMethod jMethod) {
		for (ExtendedClassMethod __DEC_extendedType_extendedReturnType_153374 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(extendedType,
						ExtendedClassMethod.class, "extendedReturnType")) {
			if (!jMethod.equals(__DEC_extendedType_extendedReturnType_153374)) {
				return new Object[] { extendedType, jMethod };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_21_2_black_nac_2B(
			ExtendedType extendedType) {
		for (ExtendedParameter __DEC_extendedType_extendedParameterType_691401 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(extendedType,
						ExtendedParameter.class, "extendedParameterType")) {
			return new Object[] { extendedType };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_21_2_black_nac_3BB(
			ExtendedType extendedType,
			org.emftext.language.java.classifiers.Class jClass) {
		if (jClass.equals(extendedType.getType())) {
			return new Object[] { extendedType, jClass };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ReturnTypeFromLibCreate_21_2_blackFFFB(
			EMoflonEdge _edge_extendedReturnType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJMethod = _edge_extendedReturnType.getSrc();
		if (tmpJMethod instanceof ExtendedClassMethod) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
			EObject tmpExtendedType = _edge_extendedReturnType.getTrg();
			if (tmpExtendedType instanceof ExtendedType) {
				ExtendedType extendedType = (ExtendedType) tmpExtendedType;
				if (extendedType.equals(jMethod.getExtendedReturnType())) {
					boolean extendedTypeisFromLib = extendedType.isIsFromLib();
					if (Boolean.valueOf(extendedTypeisFromLib).equals(
							Boolean.valueOf(true))) {
						if (pattern_ReturnTypeFromLibCreate_21_2_black_nac_1BB(
								extendedType, jMethod) == null) {
							if (pattern_ReturnTypeFromLibCreate_21_2_black_nac_2B(extendedType) == null) {
								for (MemberContainer tmpJClass : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(jMethod,
												MemberContainer.class,
												"members")) {
									if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
										org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
										if (pattern_ReturnTypeFromLibCreate_21_2_black_nac_0BB(
												extendedType, jClass) == null) {
											if (pattern_ReturnTypeFromLibCreate_21_2_black_nac_3BB(
													extendedType, jClass) == null) {
												_result.add(new Object[] {
														jClass, extendedType,
														jMethod,
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

		}

		return _result;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ReturnTypeFromLibCreate_21_3_expressionFBBBBB(
			ReturnTypeFromLibCreate _this, Match match,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedType extendedType, ExtendedClassMethod jMethod) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jClass,
				extendedType, jMethod);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ReturnTypeFromLibCreate_21_4_expressionFBB(
			ReturnTypeFromLibCreate _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ReturnTypeFromLibCreate_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_22_1_bindingFB(
			ReturnTypeFromLibCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_22_1_blackFBB(
			EClass __eClass, ReturnTypeFromLibCreate _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_22_1_bindingAndBlackFFB(
			ReturnTypeFromLibCreate _this) {
		Object[] result_pattern_ReturnTypeFromLibCreate_22_1_binding = pattern_ReturnTypeFromLibCreate_22_1_bindingFB(_this);
		if (result_pattern_ReturnTypeFromLibCreate_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ReturnTypeFromLibCreate_22_1_binding[0];

			Object[] result_pattern_ReturnTypeFromLibCreate_22_1_black = pattern_ReturnTypeFromLibCreate_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ReturnTypeFromLibCreate_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ReturnTypeFromLibCreate_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_22_2_black_nac_0B(
			TClass tType) {
		TPackage __DEC_tType_containedClasses_837921 = tType.getPackage();
		if (__DEC_tType_containedClasses_837921 != null) {
			return new Object[] { tType };
		}

		return null;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_22_2_black_nac_1BB(
			TClass tType, TypeGraph pg) {
		for (TypeGraph __DEC_tType_classes_512929 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tType_classes_512929)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ReturnTypeFromLibCreate_22_2_blackFFFFB(
			EMoflonEdge _edge_classes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPg = _edge_classes.getSrc();
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			EObject tmpTType = _edge_classes.getTrg();
			if (tmpTType instanceof TClass) {
				TClass tType = (TClass) tmpTType;
				if (pg.getClasses().contains(tType)) {
					if (pattern_ReturnTypeFromLibCreate_22_2_black_nac_0B(tType) == null) {
						if (pattern_ReturnTypeFromLibCreate_22_2_black_nac_1BB(
								tType, pg) == null) {
							for (TClass tClass : pg.getClasses()) {
								if (!tClass.equals(tType)) {
									for (TMember tmpTMethodDefinition : tClass
											.getDefines()) {
										if (tmpTMethodDefinition instanceof TMethodDefinition) {
											TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
											if (tType.equals(tMethodDefinition
													.getReturnType())) {
												_result.add(new Object[] {
														tClass, tType,
														tMethodDefinition, pg,
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

	public static final Object[] pattern_ReturnTypeFromLibCreate_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ReturnTypeFromLibCreate_22_3_expressionFBBBBBB(
			ReturnTypeFromLibCreate _this, Match match, TClass tClass,
			TClass tType, TMethodDefinition tMethodDefinition, TypeGraph pg) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tClass,
				tType, tMethodDefinition, pg);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ReturnTypeFromLibCreate_22_4_expressionFBB(
			ReturnTypeFromLibCreate _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ReturnTypeFromLibCreate_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ReturnTypeFromLibCreate_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ReturnTypeFromLibCreateImpl
