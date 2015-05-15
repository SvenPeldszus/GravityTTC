/**
 */
package GravityTGG.Rules.impl;

import ExtendedJamopp.ExtendedClassMethod;
import ExtendedJamopp.ExtendedJamoppJavaContainer;
import ExtendedJamopp.ExtendedMethodName;
import ExtendedJamopp.ExtendedParameterList;

import GravityTGG.ClassMethodToTMethod;
import GravityTGG.ClassMethodToTMethodSignature;
import GravityTGG.ExtendedMethodNameToTMethod;
import GravityTGG.ExtendedParameterListToTMethodSignature;
import GravityTGG.GravityTGGFactory;

import GravityTGG.Rules.MethodDefinitionLinkSignature;
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
 * An implementation of the model object '<em><b>Method Definition Link Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodDefinitionLinkSignatureImpl extends AbstractRuleImpl
		implements MethodDefinitionLinkSignature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodDefinitionLinkSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodDefinitionLinkSignature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ExtendedClassMethod jMethod,
			ExtendedMethodName JMethodname, ExtendedParameterList jParamList,
			ExtendedJamoppJavaContainer ejjc) {
		// initial bindings
		Object[] result1_black = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_0_1_blackBBBBBB(this,
						match, jMethod, JMethodname, jParamList, ejjc);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_0_2_bindingAndBlackFBBBBBB(
						this, match, jMethod, JMethodname, jParamList, ejjc);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_0_3_expressionFBB(this,
						csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_0_4_blackBBBBB(
							match, jMethod, JMethodname, jParamList, ejjc);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_0_4_greenBBBBBFFF(
							match, jMethod, JMethodname, jParamList, ejjc);
			// EMoflonEdge JMethodname__jMethod____extendedClassMethod = (EMoflonEdge) result4_green[5];
			// EMoflonEdge jMethod__JMethodname____extendedMethodName = (EMoflonEdge) result4_green[6];
			// EMoflonEdge ejjc__jParamList____extendedParameterList = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_0_5_blackBBBBB(
							match, jMethod, JMethodname, jParamList, ejjc);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_0_5_greenBBBBBFFF(
							match, jMethod, JMethodname, jParamList, ejjc);
			// EMoflonEdge jParamList__jMethod____methods = (EMoflonEdge) result5_green[5];
			// EMoflonEdge jMethod__jParamList____parameter_list = (EMoflonEdge) result5_green[6];
			// EMoflonEdge ejjc__JMethodname____extendedMethodName = (EMoflonEdge) result5_green[7];

			// register objects to match
			MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_0_6_expressionBBBBBB(
							this, match, jMethod, JMethodname, jParamList, ejjc);
			return MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_0_7_expressionF();
		} else {
			return MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_1_1_bindingAndBlackFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedClassMethod jMethod = (ExtendedClassMethod) result1_bindingAndBlack[0];
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[1];
		ClassMethodToTMethodSignature jMethodToTMethodSignature = (ClassMethodToTMethodSignature) result1_bindingAndBlack[2];
		ExtendedMethodName JMethodname = (ExtendedMethodName) result1_bindingAndBlack[3];
		TMethod tMethod = (TMethod) result1_bindingAndBlack[4];
		ExtendedMethodNameToTMethod JMethodnameToTMethod = (ExtendedMethodNameToTMethod) result1_bindingAndBlack[5];
		ExtendedParameterList jParamList = (ExtendedParameterList) result1_bindingAndBlack[6];
		ExtendedParameterListToTMethodSignature jParamListToTMethodSignature = (ExtendedParameterListToTMethodSignature) result1_bindingAndBlack[7];
		ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) result1_bindingAndBlack[8];
		// CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_1_1_greenBBBF(jMethod,
						tMethodSignature, tMethod);
		ClassMethodToTMethod jMethodToTMethod = (ClassMethodToTMethod) result1_green[3];

		// collect translated elements
		Object[] result2_black = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_1_2_blackB(jMethodToTMethod);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_1_2_greenFB(jMethodToTMethod);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_1_3_blackBBBBBBBBBBB(
						ruleresult, jMethod, tMethodSignature,
						jMethodToTMethodSignature, JMethodname, tMethod,
						JMethodnameToTMethod, jParamList,
						jParamListToTMethodSignature, ejjc, jMethodToTMethod);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_1_3_greenBBBBBBBBFFFFFFF(
						ruleresult, jMethod, tMethodSignature, JMethodname,
						tMethod, jParamList, ejjc, jMethodToTMethod);
		// EMoflonEdge JMethodname__jMethod____extendedClassMethod = (EMoflonEdge) result3_green[8];
		// EMoflonEdge jMethod__JMethodname____extendedMethodName = (EMoflonEdge) result3_green[9];
		// EMoflonEdge tMethodSignature__tMethod____method = (EMoflonEdge) result3_green[10];
		// EMoflonEdge tMethod__tMethodSignature____signatures = (EMoflonEdge) result3_green[11];
		// EMoflonEdge ejjc__jParamList____extendedParameterList = (EMoflonEdge) result3_green[12];
		// EMoflonEdge jMethodToTMethod__jMethod____source = (EMoflonEdge) result3_green[13];
		// EMoflonEdge jMethodToTMethod__tMethod____target = (EMoflonEdge) result3_green[14];

		// perform postprocessing story node is empty
		// register objects
		MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_1_5_expressionBBBBBBBBBBBB(
						this, ruleresult, jMethod, tMethodSignature,
						jMethodToTMethodSignature, JMethodname, tMethod,
						JMethodnameToTMethod, jParamList,
						jParamListToTMethodSignature, ejjc, jMethodToTMethod);
		return MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		ExtendedClassMethod jMethod = (ExtendedClassMethod) result2_binding[0];
		ExtendedMethodName JMethodname = (ExtendedMethodName) result2_binding[1];
		ExtendedParameterList jParamList = (ExtendedParameterList) result2_binding[2];
		ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) result2_binding[3];
		for (Object[] result2_black : MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_2_2_blackBFFBFFBFBB(
						jMethod, JMethodname, jParamList, ejjc, match)) {
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[1];
			ClassMethodToTMethodSignature jMethodToTMethodSignature = (ClassMethodToTMethodSignature) result2_black[2];
			TMethod tMethod = (TMethod) result2_black[4];
			ExtendedMethodNameToTMethod JMethodnameToTMethod = (ExtendedMethodNameToTMethod) result2_black[5];
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature = (ExtendedParameterListToTMethodSignature) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_2_3_blackBBBBBBBBB(
							jMethod, tMethodSignature,
							jMethodToTMethodSignature, JMethodname, tMethod,
							JMethodnameToTMethod, jParamList,
							jParamListToTMethodSignature, ejjc)) {
				Object[] result3_green = MethodDefinitionLinkSignatureImpl
						.pattern_MethodDefinitionLinkSignature_2_3_greenBBBBBBBBBFFFFFFFFFFFFF(
								jMethod, tMethodSignature,
								jMethodToTMethodSignature, JMethodname,
								tMethod, JMethodnameToTMethod, jParamList,
								jParamListToTMethodSignature, ejjc);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge JMethodname__jMethod____extendedClassMethod = (EMoflonEdge) result3_green[10];
				// EMoflonEdge jMethod__JMethodname____extendedMethodName = (EMoflonEdge) result3_green[11];
				// EMoflonEdge jMethodToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge jMethodToTMethodSignature__jMethod____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge JMethodnameToTMethod__JMethodname____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge JMethodnameToTMethod__tMethod____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge jParamList__jMethod____methods = (EMoflonEdge) result3_green[16];
				// EMoflonEdge jMethod__jParamList____parameter_list = (EMoflonEdge) result3_green[17];
				// EMoflonEdge jParamListToTMethodSignature__jParamList____source = (EMoflonEdge) result3_green[18];
				// EMoflonEdge jParamListToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[19];
				// EMoflonEdge ejjc__JMethodname____extendedMethodName = (EMoflonEdge) result3_green[20];
				// EMoflonEdge ejjc__jParamList____extendedParameterList = (EMoflonEdge) result3_green[21];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodDefinitionLinkSignatureImpl
						.pattern_MethodDefinitionLinkSignature_2_4_bindingAndBlackFBBBBBBBBBBB(
								this, isApplicableMatch, jMethod,
								tMethodSignature, jMethodToTMethodSignature,
								JMethodname, tMethod, JMethodnameToTMethod,
								jParamList, jParamListToTMethodSignature, ejjc);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodDefinitionLinkSignatureImpl
						.pattern_MethodDefinitionLinkSignature_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = MethodDefinitionLinkSignatureImpl
							.pattern_MethodDefinitionLinkSignature_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					MethodDefinitionLinkSignatureImpl
							.pattern_MethodDefinitionLinkSignature_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			ExtendedClassMethod jMethod, ExtendedMethodName JMethodname,
			ExtendedParameterList jParamList, ExtendedJamoppJavaContainer ejjc) {
		match.registerObject("jMethod", jMethod);
		match.registerObject("JMethodname", JMethodname);
		match.registerObject("jParamList", jParamList);
		match.registerObject("ejjc", ejjc);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			ExtendedClassMethod jMethod, ExtendedMethodName JMethodname,
			ExtendedParameterList jParamList, ExtendedJamoppJavaContainer ejjc) {// Create CSP
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
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ExtendedMethodName JMethodname,
			TMethod tMethod,
			ExtendedMethodNameToTMethod JMethodnameToTMethod,
			ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature,
			ExtendedJamoppJavaContainer ejjc) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jMethod", jMethod);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("jMethodToTMethodSignature",
				jMethodToTMethodSignature);
		isApplicableMatch.registerObject("JMethodname", JMethodname);
		isApplicableMatch.registerObject("tMethod", tMethod);
		isApplicableMatch.registerObject("JMethodnameToTMethod",
				JMethodnameToTMethod);
		isApplicableMatch.registerObject("jParamList", jParamList);
		isApplicableMatch.registerObject("jParamListToTMethodSignature",
				jParamListToTMethodSignature);
		isApplicableMatch.registerObject("ejjc", ejjc);
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
			EObject jMethod, EObject tMethodSignature,
			EObject jMethodToTMethodSignature, EObject JMethodname,
			EObject tMethod, EObject JMethodnameToTMethod, EObject jParamList,
			EObject jParamListToTMethodSignature, EObject ejjc,
			EObject jMethodToTMethod) {
		ruleresult.registerObject("jMethod", jMethod);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("jMethodToTMethodSignature",
				jMethodToTMethodSignature);
		ruleresult.registerObject("JMethodname", JMethodname);
		ruleresult.registerObject("tMethod", tMethod);
		ruleresult.registerObject("JMethodnameToTMethod", JMethodnameToTMethod);
		ruleresult.registerObject("jParamList", jParamList);
		ruleresult.registerObject("jParamListToTMethodSignature",
				jParamListToTMethodSignature);
		ruleresult.registerObject("ejjc", ejjc);
		ruleresult.registerObject("jMethodToTMethod", jMethodToTMethod);

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
			TMethodSignature tMethodSignature, TMethod tMethod) {
		// initial bindings
		Object[] result1_black = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_10_1_blackBBBB(this,
						match, tMethodSignature, tMethod);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_10_2_bindingAndBlackFBBBB(
						this, match, tMethodSignature, tMethod);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_10_3_expressionFBB(this,
						csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_10_4_blackBBB(match,
							tMethodSignature, tMethod);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_10_4_greenBBBFF(
							match, tMethodSignature, tMethod);
			// EMoflonEdge tMethodSignature__tMethod____method = (EMoflonEdge) result4_green[3];
			// EMoflonEdge tMethod__tMethodSignature____signatures = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_10_5_blackBBB(match,
							tMethodSignature, tMethod);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_10_5_greenBBB(match,
							tMethodSignature, tMethod);

			// register objects to match
			MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_10_6_expressionBBBB(
							this, match, tMethodSignature, tMethod);
			return MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_10_7_expressionF();
		} else {
			return MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_11_1_bindingAndBlackFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedClassMethod jMethod = (ExtendedClassMethod) result1_bindingAndBlack[0];
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[1];
		ClassMethodToTMethodSignature jMethodToTMethodSignature = (ClassMethodToTMethodSignature) result1_bindingAndBlack[2];
		ExtendedMethodName JMethodname = (ExtendedMethodName) result1_bindingAndBlack[3];
		TMethod tMethod = (TMethod) result1_bindingAndBlack[4];
		ExtendedMethodNameToTMethod JMethodnameToTMethod = (ExtendedMethodNameToTMethod) result1_bindingAndBlack[5];
		ExtendedParameterList jParamList = (ExtendedParameterList) result1_bindingAndBlack[6];
		ExtendedParameterListToTMethodSignature jParamListToTMethodSignature = (ExtendedParameterListToTMethodSignature) result1_bindingAndBlack[7];
		ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) result1_bindingAndBlack[8];
		// CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_11_1_greenBBBBBF(
						jMethod, JMethodname, tMethod, jParamList, ejjc);
		ClassMethodToTMethod jMethodToTMethod = (ClassMethodToTMethod) result1_green[5];

		// collect translated elements
		Object[] result2_black = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_11_2_blackB(jMethodToTMethod);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_11_2_greenFB(jMethodToTMethod);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_11_3_blackBBBBBBBBBBB(
						ruleresult, jMethod, tMethodSignature,
						jMethodToTMethodSignature, JMethodname, tMethod,
						JMethodnameToTMethod, jParamList,
						jParamListToTMethodSignature, ejjc, jMethodToTMethod);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_11_3_greenBBBBBBBBFFFFFFF(
						ruleresult, jMethod, tMethodSignature, JMethodname,
						tMethod, jParamList, ejjc, jMethodToTMethod);
		// EMoflonEdge JMethodname__jMethod____extendedClassMethod = (EMoflonEdge) result3_green[8];
		// EMoflonEdge jMethod__JMethodname____extendedMethodName = (EMoflonEdge) result3_green[9];
		// EMoflonEdge tMethodSignature__tMethod____method = (EMoflonEdge) result3_green[10];
		// EMoflonEdge tMethod__tMethodSignature____signatures = (EMoflonEdge) result3_green[11];
		// EMoflonEdge ejjc__jParamList____extendedParameterList = (EMoflonEdge) result3_green[12];
		// EMoflonEdge jMethodToTMethod__jMethod____source = (EMoflonEdge) result3_green[13];
		// EMoflonEdge jMethodToTMethod__tMethod____target = (EMoflonEdge) result3_green[14];

		// perform postprocessing story node is empty
		// register objects
		MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_11_5_expressionBBBBBBBBBBBB(
						this, ruleresult, jMethod, tMethodSignature,
						jMethodToTMethodSignature, JMethodname, tMethod,
						JMethodnameToTMethod, jParamList,
						jParamListToTMethodSignature, ejjc, jMethodToTMethod);
		return MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		TMethodSignature tMethodSignature = (TMethodSignature) result2_binding[0];
		TMethod tMethod = (TMethod) result2_binding[1];
		for (Object[] result2_black : MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_12_2_blackFBFFBFFFB(
						tMethodSignature, tMethod, match)) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result2_black[0];
			ClassMethodToTMethodSignature jMethodToTMethodSignature = (ClassMethodToTMethodSignature) result2_black[2];
			ExtendedMethodName JMethodname = (ExtendedMethodName) result2_black[3];
			ExtendedMethodNameToTMethod JMethodnameToTMethod = (ExtendedMethodNameToTMethod) result2_black[5];
			ExtendedParameterList jParamList = (ExtendedParameterList) result2_black[6];
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature = (ExtendedParameterListToTMethodSignature) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_12_3_blackBBBBBBBBF(
							jMethod, tMethodSignature,
							jMethodToTMethodSignature, JMethodname, tMethod,
							JMethodnameToTMethod, jParamList,
							jParamListToTMethodSignature)) {
				ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) result3_black[8];
				Object[] result3_green = MethodDefinitionLinkSignatureImpl
						.pattern_MethodDefinitionLinkSignature_12_3_greenBBBBBBBBBFFFFFFFFFFFF(
								jMethod, tMethodSignature,
								jMethodToTMethodSignature, JMethodname,
								tMethod, JMethodnameToTMethod, jParamList,
								jParamListToTMethodSignature, ejjc);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge tMethodSignature__tMethod____method = (EMoflonEdge) result3_green[10];
				// EMoflonEdge tMethod__tMethodSignature____signatures = (EMoflonEdge) result3_green[11];
				// EMoflonEdge jMethodToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge jMethodToTMethodSignature__jMethod____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge JMethodnameToTMethod__JMethodname____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge JMethodnameToTMethod__tMethod____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge jParamList__jMethod____methods = (EMoflonEdge) result3_green[16];
				// EMoflonEdge jMethod__jParamList____parameter_list = (EMoflonEdge) result3_green[17];
				// EMoflonEdge jParamListToTMethodSignature__jParamList____source = (EMoflonEdge) result3_green[18];
				// EMoflonEdge jParamListToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[19];
				// EMoflonEdge ejjc__JMethodname____extendedMethodName = (EMoflonEdge) result3_green[20];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodDefinitionLinkSignatureImpl
						.pattern_MethodDefinitionLinkSignature_12_4_bindingAndBlackFBBBBBBBBBBB(
								this, isApplicableMatch, jMethod,
								tMethodSignature, jMethodToTMethodSignature,
								JMethodname, tMethod, JMethodnameToTMethod,
								jParamList, jParamListToTMethodSignature, ejjc);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodDefinitionLinkSignatureImpl
						.pattern_MethodDefinitionLinkSignature_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = MethodDefinitionLinkSignatureImpl
							.pattern_MethodDefinitionLinkSignature_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					MethodDefinitionLinkSignatureImpl
							.pattern_MethodDefinitionLinkSignature_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			TMethodSignature tMethodSignature, TMethod tMethod) {
		match.registerObject("tMethodSignature", tMethodSignature);
		match.registerObject("tMethod", tMethod);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			TMethodSignature tMethodSignature, TMethod tMethod) {// Create CSP
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
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ExtendedMethodName JMethodname,
			TMethod tMethod,
			ExtendedMethodNameToTMethod JMethodnameToTMethod,
			ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature,
			ExtendedJamoppJavaContainer ejjc) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jMethod", jMethod);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("jMethodToTMethodSignature",
				jMethodToTMethodSignature);
		isApplicableMatch.registerObject("JMethodname", JMethodname);
		isApplicableMatch.registerObject("tMethod", tMethod);
		isApplicableMatch.registerObject("JMethodnameToTMethod",
				JMethodnameToTMethod);
		isApplicableMatch.registerObject("jParamList", jParamList);
		isApplicableMatch.registerObject("jParamListToTMethodSignature",
				jParamListToTMethodSignature);
		isApplicableMatch.registerObject("ejjc", ejjc);
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
			EObject jMethod, EObject tMethodSignature,
			EObject jMethodToTMethodSignature, EObject JMethodname,
			EObject tMethod, EObject JMethodnameToTMethod, EObject jParamList,
			EObject jParamListToTMethodSignature, EObject ejjc,
			EObject jMethodToTMethod) {
		ruleresult.registerObject("jMethod", jMethod);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("jMethodToTMethodSignature",
				jMethodToTMethodSignature);
		ruleresult.registerObject("JMethodname", JMethodname);
		ruleresult.registerObject("tMethod", tMethod);
		ruleresult.registerObject("JMethodnameToTMethod", JMethodnameToTMethod);
		ruleresult.registerObject("jParamList", jParamList);
		ruleresult.registerObject("jParamListToTMethodSignature",
				jParamListToTMethodSignature);
		ruleresult.registerObject("ejjc", ejjc);
		ruleresult.registerObject("jMethodToTMethod", jMethodToTMethod);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_6(
			EMoflonEdge _edge_extendedClassMethod) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_20_2_blackFFFFB(_edge_extendedClassMethod)) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result2_black[0];
			ExtendedMethodName JMethodname = (ExtendedMethodName) result2_black[1];
			ExtendedParameterList jParamList = (ExtendedParameterList) result2_black[2];
			ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) result2_black[3];
			Object[] result2_green = MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_20_3_expressionFBBBBBB(
							this, match, jMethod, JMethodname, jParamList, ejjc)) {
				// Ensure that the correct types of elements are matched
				if (MethodDefinitionLinkSignatureImpl
						.pattern_MethodDefinitionLinkSignature_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = MethodDefinitionLinkSignatureImpl
							.pattern_MethodDefinitionLinkSignature_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					MethodDefinitionLinkSignatureImpl
							.pattern_MethodDefinitionLinkSignature_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_7(
			EMoflonEdge _edge_extendedMethodName) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_21_2_blackFFFFB(_edge_extendedMethodName)) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result2_black[0];
			ExtendedMethodName JMethodname = (ExtendedMethodName) result2_black[1];
			ExtendedParameterList jParamList = (ExtendedParameterList) result2_black[2];
			ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) result2_black[3];
			Object[] result2_green = MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_21_3_expressionFBBBBBB(
							this, match, jMethod, JMethodname, jParamList, ejjc)) {
				// Ensure that the correct types of elements are matched
				if (MethodDefinitionLinkSignatureImpl
						.pattern_MethodDefinitionLinkSignature_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = MethodDefinitionLinkSignatureImpl
							.pattern_MethodDefinitionLinkSignature_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					MethodDefinitionLinkSignatureImpl
							.pattern_MethodDefinitionLinkSignature_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_12(
			EMoflonEdge _edge_method) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_22_2_blackFFB(_edge_method)) {
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[0];
			TMethod tMethod = (TMethod) result2_black[1];
			Object[] result2_green = MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_22_3_expressionFBBBB(
							this, match, tMethodSignature, tMethod)) {
				// Ensure that the correct types of elements are matched
				if (MethodDefinitionLinkSignatureImpl
						.pattern_MethodDefinitionLinkSignature_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = MethodDefinitionLinkSignatureImpl
							.pattern_MethodDefinitionLinkSignature_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					MethodDefinitionLinkSignatureImpl
							.pattern_MethodDefinitionLinkSignature_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_13(
			EMoflonEdge _edge_signatures) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_23_2_blackFFB(_edge_signatures)) {
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[0];
			TMethod tMethod = (TMethod) result2_black[1];
			Object[] result2_green = MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_23_3_expressionFBBBB(
							this, match, tMethodSignature, tMethod)) {
				// Ensure that the correct types of elements are matched
				if (MethodDefinitionLinkSignatureImpl
						.pattern_MethodDefinitionLinkSignature_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = MethodDefinitionLinkSignatureImpl
							.pattern_MethodDefinitionLinkSignature_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					MethodDefinitionLinkSignatureImpl
							.pattern_MethodDefinitionLinkSignature_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_8(
			EMoflonEdge _edge_extendedParameterList) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_24_2_blackFFFFB(_edge_extendedParameterList)) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result2_black[0];
			ExtendedMethodName JMethodname = (ExtendedMethodName) result2_black[1];
			ExtendedParameterList jParamList = (ExtendedParameterList) result2_black[2];
			ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) result2_black[3];
			Object[] result2_green = MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodDefinitionLinkSignatureImpl
					.pattern_MethodDefinitionLinkSignature_24_3_expressionFBBBBBB(
							this, match, jMethod, JMethodname, jParamList, ejjc)) {
				// Ensure that the correct types of elements are matched
				if (MethodDefinitionLinkSignatureImpl
						.pattern_MethodDefinitionLinkSignature_24_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = MethodDefinitionLinkSignatureImpl
							.pattern_MethodDefinitionLinkSignature_24_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					MethodDefinitionLinkSignatureImpl
							.pattern_MethodDefinitionLinkSignature_24_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return MethodDefinitionLinkSignatureImpl
				.pattern_MethodDefinitionLinkSignature_24_6_expressionFB(__result);
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
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_FWD__MATCH_EXTENDEDCLASSMETHOD_EXTENDEDMETHODNAME_EXTENDEDPARAMETERLIST_EXTENDEDJAMOPPJAVACONTAINER:
			return isAppropriate_FWD((Match) arguments.get(0),
					(ExtendedClassMethod) arguments.get(1),
					(ExtendedMethodName) arguments.get(2),
					(ExtendedParameterList) arguments.get(3),
					(ExtendedJamoppJavaContainer) arguments.get(4));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDCLASSMETHOD_EXTENDEDMETHODNAME_EXTENDEDPARAMETERLIST_EXTENDEDJAMOPPJAVACONTAINER:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(ExtendedClassMethod) arguments.get(1),
					(ExtendedMethodName) arguments.get(2),
					(ExtendedParameterList) arguments.get(3),
					(ExtendedJamoppJavaContainer) arguments.get(4));
			return null;
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDCLASSMETHOD_EXTENDEDMETHODNAME_EXTENDEDPARAMETERLIST_EXTENDEDJAMOPPJAVACONTAINER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(ExtendedClassMethod) arguments.get(1),
					(ExtendedMethodName) arguments.get(2),
					(ExtendedParameterList) arguments.get(3),
					(ExtendedJamoppJavaContainer) arguments.get(4));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDCLASSMETHOD_TMETHODSIGNATURE_CLASSMETHODTOTMETHODSIGNATURE_EXTENDEDMETHODNAME_TMETHOD_EXTENDEDMETHODNAMETOTMETHOD_EXTENDEDPARAMETERLIST_EXTENDEDPARAMETERLISTTOTMETHODSIGNATURE_EXTENDEDJAMOPPJAVACONTAINER:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedClassMethod) arguments.get(1),
					(TMethodSignature) arguments.get(2),
					(ClassMethodToTMethodSignature) arguments.get(3),
					(ExtendedMethodName) arguments.get(4),
					(TMethod) arguments.get(5),
					(ExtendedMethodNameToTMethod) arguments.get(6),
					(ExtendedParameterList) arguments.get(7),
					(ExtendedParameterListToTMethodSignature) arguments.get(8),
					(ExtendedJamoppJavaContainer) arguments.get(9));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_BWD__MATCH_TMETHODSIGNATURE_TMETHOD:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TMethodSignature) arguments.get(1),
					(TMethod) arguments.get(2));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODSIGNATURE_TMETHOD:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TMethodSignature) arguments.get(1),
					(TMethod) arguments.get(2));
			return null;
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODSIGNATURE_TMETHOD:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TMethodSignature) arguments.get(1),
					(TMethod) arguments.get(2));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXTENDEDCLASSMETHOD_TMETHODSIGNATURE_CLASSMETHODTOTMETHODSIGNATURE_EXTENDEDMETHODNAME_TMETHOD_EXTENDEDMETHODNAMETOTMETHOD_EXTENDEDPARAMETERLIST_EXTENDEDPARAMETERLISTTOTMETHODSIGNATURE_EXTENDEDJAMOPPJAVACONTAINER:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedClassMethod) arguments.get(1),
					(TMethodSignature) arguments.get(2),
					(ClassMethodToTMethodSignature) arguments.get(3),
					(ExtendedMethodName) arguments.get(4),
					(TMethod) arguments.get(5),
					(ExtendedMethodNameToTMethod) arguments.get(6),
					(ExtendedParameterList) arguments.get(7),
					(ExtendedParameterListToTMethodSignature) arguments.get(8),
					(ExtendedJamoppJavaContainer) arguments.get(9));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_6__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_6((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_7__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_7((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_12__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_12((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_13__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_13((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_8__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_8((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_0_1_blackBBBBBB(
			MethodDefinitionLinkSignature _this, Match match,
			ExtendedClassMethod jMethod, ExtendedMethodName jMethodname,
			ExtendedParameterList jParamList, ExtendedJamoppJavaContainer ejjc) {
		return new Object[] { _this, match, jMethod, jMethodname, jParamList,
				ejjc };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_0_2_bindingFBBBBBB(
			MethodDefinitionLinkSignature _this, Match match,
			ExtendedClassMethod jMethod, ExtendedMethodName jMethodname,
			ExtendedParameterList jParamList, ExtendedJamoppJavaContainer ejjc) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, jMethod,
				jMethodname, jParamList, ejjc);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jMethod, jMethodname,
					jParamList, ejjc };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_0_2_bindingAndBlackFBBBBBB(
			MethodDefinitionLinkSignature _this, Match match,
			ExtendedClassMethod jMethod, ExtendedMethodName jMethodname,
			ExtendedParameterList jParamList, ExtendedJamoppJavaContainer ejjc) {
		Object[] result_pattern_MethodDefinitionLinkSignature_0_2_binding = pattern_MethodDefinitionLinkSignature_0_2_bindingFBBBBBB(
				_this, match, jMethod, jMethodname, jParamList, ejjc);
		if (result_pattern_MethodDefinitionLinkSignature_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinitionLinkSignature_0_2_binding[0];

			Object[] result_pattern_MethodDefinitionLinkSignature_0_2_black = pattern_MethodDefinitionLinkSignature_0_2_blackB(csp);
			if (result_pattern_MethodDefinitionLinkSignature_0_2_black != null) {

				return new Object[] { csp, _this, match, jMethod, jMethodname,
						jParamList, ejjc };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinitionLinkSignature_0_3_expressionFBB(
			MethodDefinitionLinkSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_0_4_blackBBBBB(
			Match match, ExtendedClassMethod jMethod,
			ExtendedMethodName jMethodname, ExtendedParameterList jParamList,
			ExtendedJamoppJavaContainer ejjc) {
		return new Object[] { match, jMethod, jMethodname, jParamList, ejjc };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_0_4_greenBBBBBFFF(
			Match match, ExtendedClassMethod jMethod,
			ExtendedMethodName jMethodname, ExtendedParameterList jParamList,
			ExtendedJamoppJavaContainer ejjc) {
		EMoflonEdge jMethodname__jMethod____extendedClassMethod = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__JMethodname____extendedMethodName = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ejjc__jParamList____extendedParameterList = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jMethodname__jMethod____extendedClassMethod_name_prime = "extendedClassMethod";
		String jMethod__JMethodname____extendedMethodName_name_prime = "extendedMethodName";
		String ejjc__jParamList____extendedParameterList_name_prime = "extendedParameterList";
		jMethodname__jMethod____extendedClassMethod.setSrc(jMethodname);
		jMethodname__jMethod____extendedClassMethod.setTrg(jMethod);
		match.getToBeTranslatedEdges().add(
				jMethodname__jMethod____extendedClassMethod);
		jMethod__JMethodname____extendedMethodName.setSrc(jMethod);
		jMethod__JMethodname____extendedMethodName.setTrg(jMethodname);
		match.getToBeTranslatedEdges().add(
				jMethod__JMethodname____extendedMethodName);
		ejjc__jParamList____extendedParameterList.setSrc(ejjc);
		ejjc__jParamList____extendedParameterList.setTrg(jParamList);
		match.getToBeTranslatedEdges().add(
				ejjc__jParamList____extendedParameterList);
		jMethodname__jMethod____extendedClassMethod
				.setName(jMethodname__jMethod____extendedClassMethod_name_prime);
		jMethod__JMethodname____extendedMethodName
				.setName(jMethod__JMethodname____extendedMethodName_name_prime);
		ejjc__jParamList____extendedParameterList
				.setName(ejjc__jParamList____extendedParameterList_name_prime);
		return new Object[] { match, jMethod, jMethodname, jParamList, ejjc,
				jMethodname__jMethod____extendedClassMethod,
				jMethod__JMethodname____extendedMethodName,
				ejjc__jParamList____extendedParameterList };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_0_5_blackBBBBB(
			Match match, ExtendedClassMethod jMethod,
			ExtendedMethodName jMethodname, ExtendedParameterList jParamList,
			ExtendedJamoppJavaContainer ejjc) {
		return new Object[] { match, jMethod, jMethodname, jParamList, ejjc };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_0_5_greenBBBBBFFF(
			Match match, ExtendedClassMethod jMethod,
			ExtendedMethodName jMethodname, ExtendedParameterList jParamList,
			ExtendedJamoppJavaContainer ejjc) {
		EMoflonEdge jParamList__jMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__jParamList____parameter_list = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ejjc__JMethodname____extendedMethodName = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(jMethod);
		match.getContextNodes().add(jMethodname);
		match.getContextNodes().add(jParamList);
		match.getContextNodes().add(ejjc);
		String jParamList__jMethod____methods_name_prime = "methods";
		String jMethod__jParamList____parameter_list_name_prime = "parameter_list";
		String ejjc__JMethodname____extendedMethodName_name_prime = "extendedMethodName";
		jParamList__jMethod____methods.setSrc(jParamList);
		jParamList__jMethod____methods.setTrg(jMethod);
		match.getContextEdges().add(jParamList__jMethod____methods);
		jMethod__jParamList____parameter_list.setSrc(jMethod);
		jMethod__jParamList____parameter_list.setTrg(jParamList);
		match.getContextEdges().add(jMethod__jParamList____parameter_list);
		ejjc__JMethodname____extendedMethodName.setSrc(ejjc);
		ejjc__JMethodname____extendedMethodName.setTrg(jMethodname);
		match.getContextEdges().add(ejjc__JMethodname____extendedMethodName);
		jParamList__jMethod____methods
				.setName(jParamList__jMethod____methods_name_prime);
		jMethod__jParamList____parameter_list
				.setName(jMethod__jParamList____parameter_list_name_prime);
		ejjc__JMethodname____extendedMethodName
				.setName(ejjc__JMethodname____extendedMethodName_name_prime);
		return new Object[] { match, jMethod, jMethodname, jParamList, ejjc,
				jParamList__jMethod____methods,
				jMethod__jParamList____parameter_list,
				ejjc__JMethodname____extendedMethodName };
	}

	public static final void pattern_MethodDefinitionLinkSignature_0_6_expressionBBBBBB(
			MethodDefinitionLinkSignature _this, Match match,
			ExtendedClassMethod jMethod, ExtendedMethodName jMethodname,
			ExtendedParameterList jParamList, ExtendedJamoppJavaContainer ejjc) {
		_this.registerObjectsToMatch_FWD(match, jMethod, jMethodname,
				jParamList, ejjc);

	}

	public static final boolean pattern_MethodDefinitionLinkSignature_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDefinitionLinkSignature_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_1_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jMethod");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("tMethodSignature");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("jMethodToTMethodSignature");
		EObject _localVariable_3 = isApplicableMatch.getObject("JMethodname");
		EObject _localVariable_4 = isApplicableMatch.getObject("tMethod");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("JMethodnameToTMethod");
		EObject _localVariable_6 = isApplicableMatch.getObject("jParamList");
		EObject _localVariable_7 = isApplicableMatch
				.getObject("jParamListToTMethodSignature");
		EObject _localVariable_8 = isApplicableMatch.getObject("ejjc");
		EObject tmpJMethod = _localVariable_0;
		EObject tmpTMethodSignature = _localVariable_1;
		EObject tmpJMethodToTMethodSignature = _localVariable_2;
		EObject tmpJMethodname = _localVariable_3;
		EObject tmpTMethod = _localVariable_4;
		EObject tmpJMethodnameToTMethod = _localVariable_5;
		EObject tmpJParamList = _localVariable_6;
		EObject tmpJParamListToTMethodSignature = _localVariable_7;
		EObject tmpEjjc = _localVariable_8;
		if (tmpJMethod instanceof ExtendedClassMethod) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
			if (tmpTMethodSignature instanceof TMethodSignature) {
				TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
				if (tmpJMethodToTMethodSignature instanceof ClassMethodToTMethodSignature) {
					ClassMethodToTMethodSignature jMethodToTMethodSignature = (ClassMethodToTMethodSignature) tmpJMethodToTMethodSignature;
					if (tmpJMethodname instanceof ExtendedMethodName) {
						ExtendedMethodName jMethodname = (ExtendedMethodName) tmpJMethodname;
						if (tmpTMethod instanceof TMethod) {
							TMethod tMethod = (TMethod) tmpTMethod;
							if (tmpJMethodnameToTMethod instanceof ExtendedMethodNameToTMethod) {
								ExtendedMethodNameToTMethod jMethodnameToTMethod = (ExtendedMethodNameToTMethod) tmpJMethodnameToTMethod;
								if (tmpJParamList instanceof ExtendedParameterList) {
									ExtendedParameterList jParamList = (ExtendedParameterList) tmpJParamList;
									if (tmpJParamListToTMethodSignature instanceof ExtendedParameterListToTMethodSignature) {
										ExtendedParameterListToTMethodSignature jParamListToTMethodSignature = (ExtendedParameterListToTMethodSignature) tmpJParamListToTMethodSignature;
										if (tmpEjjc instanceof ExtendedJamoppJavaContainer) {
											ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) tmpEjjc;
											return new Object[] {
													jMethod,
													tMethodSignature,
													jMethodToTMethodSignature,
													jMethodname,
													tMethod,
													jMethodnameToTMethod,
													jParamList,
													jParamListToTMethodSignature,
													ejjc, isApplicableMatch };
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

	public static final Object[] pattern_MethodDefinitionLinkSignature_1_1_blackBBBBBBBBBFBB(
			ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ExtendedMethodName jMethodname,
			TMethod tMethod,
			ExtendedMethodNameToTMethod jMethodnameToTMethod,
			ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature,
			ExtendedJamoppJavaContainer ejjc,
			MethodDefinitionLinkSignature _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jMethod, tMethodSignature,
						jMethodToTMethodSignature, jMethodname, tMethod,
						jMethodnameToTMethod, jParamList,
						jParamListToTMethodSignature, ejjc, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_1_1_bindingAndBlackFFFFFFFFFFBB(
			MethodDefinitionLinkSignature _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodDefinitionLinkSignature_1_1_binding = pattern_MethodDefinitionLinkSignature_1_1_bindingFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_MethodDefinitionLinkSignature_1_1_binding != null) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result_pattern_MethodDefinitionLinkSignature_1_1_binding[0];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_MethodDefinitionLinkSignature_1_1_binding[1];
			ClassMethodToTMethodSignature jMethodToTMethodSignature = (ClassMethodToTMethodSignature) result_pattern_MethodDefinitionLinkSignature_1_1_binding[2];
			ExtendedMethodName jMethodname = (ExtendedMethodName) result_pattern_MethodDefinitionLinkSignature_1_1_binding[3];
			TMethod tMethod = (TMethod) result_pattern_MethodDefinitionLinkSignature_1_1_binding[4];
			ExtendedMethodNameToTMethod jMethodnameToTMethod = (ExtendedMethodNameToTMethod) result_pattern_MethodDefinitionLinkSignature_1_1_binding[5];
			ExtendedParameterList jParamList = (ExtendedParameterList) result_pattern_MethodDefinitionLinkSignature_1_1_binding[6];
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature = (ExtendedParameterListToTMethodSignature) result_pattern_MethodDefinitionLinkSignature_1_1_binding[7];
			ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) result_pattern_MethodDefinitionLinkSignature_1_1_binding[8];

			Object[] result_pattern_MethodDefinitionLinkSignature_1_1_black = pattern_MethodDefinitionLinkSignature_1_1_blackBBBBBBBBBFBB(
					jMethod, tMethodSignature, jMethodToTMethodSignature,
					jMethodname, tMethod, jMethodnameToTMethod, jParamList,
					jParamListToTMethodSignature, ejjc, _this,
					isApplicableMatch);
			if (result_pattern_MethodDefinitionLinkSignature_1_1_black != null) {
				CSP csp = (CSP) result_pattern_MethodDefinitionLinkSignature_1_1_black[9];

				return new Object[] { jMethod, tMethodSignature,
						jMethodToTMethodSignature, jMethodname, tMethod,
						jMethodnameToTMethod, jParamList,
						jParamListToTMethodSignature, ejjc, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_1_1_greenBBBF(
			ExtendedClassMethod jMethod, TMethodSignature tMethodSignature,
			TMethod tMethod) {
		ClassMethodToTMethod jMethodToTMethod = GravityTGGFactory.eINSTANCE
				.createClassMethodToTMethod();
		tMethodSignature.setMethod(tMethod);
		jMethodToTMethod.setSource(jMethod);
		jMethodToTMethod.setTarget(tMethod);
		return new Object[] { jMethod, tMethodSignature, tMethod,
				jMethodToTMethod };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_1_2_blackB(
			ClassMethodToTMethod jMethodToTMethod) {
		return new Object[] { jMethodToTMethod };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_1_2_greenFB(
			ClassMethodToTMethod jMethodToTMethod) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(jMethodToTMethod);
		return new Object[] { ruleresult, jMethodToTMethod };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_1_3_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject jMethod,
			EObject tMethodSignature, EObject jMethodToTMethodSignature,
			EObject jMethodname, EObject tMethod, EObject jMethodnameToTMethod,
			EObject jParamList, EObject jParamListToTMethodSignature,
			EObject ejjc, EObject jMethodToTMethod) {
		if (!jMethod.equals(tMethodSignature)) {
			if (!jMethod.equals(jMethodToTMethodSignature)) {
				if (!jMethod.equals(tMethod)) {
					if (!jMethod.equals(jParamList)) {
						if (!jMethod.equals(jParamListToTMethodSignature)) {
							if (!jMethod.equals(jMethodToTMethod)) {
								if (!jMethodToTMethodSignature
										.equals(tMethodSignature)) {
									if (!jMethodToTMethodSignature
											.equals(tMethod)) {
										if (!jMethodToTMethodSignature
												.equals(jParamList)) {
											if (!jMethodToTMethodSignature
													.equals(jParamListToTMethodSignature)) {
												if (!jMethodname
														.equals(jMethod)) {
													if (!jMethodname
															.equals(tMethodSignature)) {
														if (!jMethodname
																.equals(jMethodToTMethodSignature)) {
															if (!jMethodname
																	.equals(tMethod)) {
																if (!jMethodname
																		.equals(jMethodnameToTMethod)) {
																	if (!jMethodname
																			.equals(jParamList)) {
																		if (!jMethodname
																				.equals(jParamListToTMethodSignature)) {
																			if (!jMethodname
																					.equals(ejjc)) {
																				if (!jMethodname
																						.equals(jMethodToTMethod)) {
																					if (!tMethod
																							.equals(tMethodSignature)) {
																						if (!jMethodnameToTMethod
																								.equals(jMethod)) {
																							if (!jMethodnameToTMethod
																									.equals(tMethodSignature)) {
																								if (!jMethodnameToTMethod
																										.equals(jMethodToTMethodSignature)) {
																									if (!jMethodnameToTMethod
																											.equals(tMethod)) {
																										if (!jMethodnameToTMethod
																												.equals(jParamList)) {
																											if (!jMethodnameToTMethod
																													.equals(jParamListToTMethodSignature)) {
																												if (!jMethodnameToTMethod
																														.equals(ejjc)) {
																													if (!jMethodnameToTMethod
																															.equals(jMethodToTMethod)) {
																														if (!jParamList
																																.equals(tMethodSignature)) {
																															if (!jParamList
																																	.equals(tMethod)) {
																																if (!jParamList
																																		.equals(jParamListToTMethodSignature)) {
																																	if (!jParamListToTMethodSignature
																																			.equals(tMethodSignature)) {
																																		if (!jParamListToTMethodSignature
																																				.equals(tMethod)) {
																																			if (!ejjc
																																					.equals(jMethod)) {
																																				if (!ejjc
																																						.equals(tMethodSignature)) {
																																					if (!ejjc
																																							.equals(jMethodToTMethodSignature)) {
																																						if (!ejjc
																																								.equals(tMethod)) {
																																							if (!ejjc
																																									.equals(jParamList)) {
																																								if (!ejjc
																																										.equals(jParamListToTMethodSignature)) {
																																									if (!ejjc
																																											.equals(jMethodToTMethod)) {
																																										if (!jMethodToTMethod
																																												.equals(tMethodSignature)) {
																																											if (!jMethodToTMethod
																																													.equals(jMethodToTMethodSignature)) {
																																												if (!jMethodToTMethod
																																														.equals(tMethod)) {
																																													if (!jMethodToTMethod
																																															.equals(jParamList)) {
																																														if (!jMethodToTMethod
																																																.equals(jParamListToTMethodSignature)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	jMethod,
																																																	tMethodSignature,
																																																	jMethodToTMethodSignature,
																																																	jMethodname,
																																																	tMethod,
																																																	jMethodnameToTMethod,
																																																	jParamList,
																																																	jParamListToTMethodSignature,
																																																	ejjc,
																																																	jMethodToTMethod };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodDefinitionLinkSignature_1_3_greenBBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject jMethod,
			EObject tMethodSignature, EObject jMethodname, EObject tMethod,
			EObject jParamList, EObject ejjc, EObject jMethodToTMethod) {
		EMoflonEdge jMethodname__jMethod____extendedClassMethod = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__JMethodname____extendedMethodName = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tMethod____method = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethod__tMethodSignature____signatures = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ejjc__jParamList____extendedParameterList = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethod__jMethod____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethod__tMethod____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodDefinitionLinkSignature";
		String jMethodname__jMethod____extendedClassMethod_name_prime = "extendedClassMethod";
		String jMethod__JMethodname____extendedMethodName_name_prime = "extendedMethodName";
		String tMethodSignature__tMethod____method_name_prime = "method";
		String tMethod__tMethodSignature____signatures_name_prime = "signatures";
		String ejjc__jParamList____extendedParameterList_name_prime = "extendedParameterList";
		String jMethodToTMethod__jMethod____source_name_prime = "source";
		String jMethodToTMethod__tMethod____target_name_prime = "target";
		jMethodname__jMethod____extendedClassMethod.setSrc(jMethodname);
		jMethodname__jMethod____extendedClassMethod.setTrg(jMethod);
		ruleresult.getTranslatedEdges().add(
				jMethodname__jMethod____extendedClassMethod);
		jMethod__JMethodname____extendedMethodName.setSrc(jMethod);
		jMethod__JMethodname____extendedMethodName.setTrg(jMethodname);
		ruleresult.getTranslatedEdges().add(
				jMethod__JMethodname____extendedMethodName);
		tMethodSignature__tMethod____method.setSrc(tMethodSignature);
		tMethodSignature__tMethod____method.setTrg(tMethod);
		ruleresult.getCreatedEdges().add(tMethodSignature__tMethod____method);
		tMethod__tMethodSignature____signatures.setSrc(tMethod);
		tMethod__tMethodSignature____signatures.setTrg(tMethodSignature);
		ruleresult.getCreatedEdges().add(
				tMethod__tMethodSignature____signatures);
		ejjc__jParamList____extendedParameterList.setSrc(ejjc);
		ejjc__jParamList____extendedParameterList.setTrg(jParamList);
		ruleresult.getTranslatedEdges().add(
				ejjc__jParamList____extendedParameterList);
		jMethodToTMethod__jMethod____source.setSrc(jMethodToTMethod);
		jMethodToTMethod__jMethod____source.setTrg(jMethod);
		ruleresult.getCreatedEdges().add(jMethodToTMethod__jMethod____source);
		jMethodToTMethod__tMethod____target.setSrc(jMethodToTMethod);
		jMethodToTMethod__tMethod____target.setTrg(tMethod);
		ruleresult.getCreatedEdges().add(jMethodToTMethod__tMethod____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jMethodname__jMethod____extendedClassMethod
				.setName(jMethodname__jMethod____extendedClassMethod_name_prime);
		jMethod__JMethodname____extendedMethodName
				.setName(jMethod__JMethodname____extendedMethodName_name_prime);
		tMethodSignature__tMethod____method
				.setName(tMethodSignature__tMethod____method_name_prime);
		tMethod__tMethodSignature____signatures
				.setName(tMethod__tMethodSignature____signatures_name_prime);
		ejjc__jParamList____extendedParameterList
				.setName(ejjc__jParamList____extendedParameterList_name_prime);
		jMethodToTMethod__jMethod____source
				.setName(jMethodToTMethod__jMethod____source_name_prime);
		jMethodToTMethod__tMethod____target
				.setName(jMethodToTMethod__tMethod____target_name_prime);
		return new Object[] { ruleresult, jMethod, tMethodSignature,
				jMethodname, tMethod, jParamList, ejjc, jMethodToTMethod,
				jMethodname__jMethod____extendedClassMethod,
				jMethod__JMethodname____extendedMethodName,
				tMethodSignature__tMethod____method,
				tMethod__tMethodSignature____signatures,
				ejjc__jParamList____extendedParameterList,
				jMethodToTMethod__jMethod____source,
				jMethodToTMethod__tMethod____target };
	}

	public static final void pattern_MethodDefinitionLinkSignature_1_5_expressionBBBBBBBBBBBB(
			MethodDefinitionLinkSignature _this, PerformRuleResult ruleresult,
			EObject jMethod, EObject tMethodSignature,
			EObject jMethodToTMethodSignature, EObject jMethodname,
			EObject tMethod, EObject jMethodnameToTMethod, EObject jParamList,
			EObject jParamListToTMethodSignature, EObject ejjc,
			EObject jMethodToTMethod) {
		_this.registerObjects_FWD(ruleresult, jMethod, tMethodSignature,
				jMethodToTMethodSignature, jMethodname, tMethod,
				jMethodnameToTMethod, jParamList, jParamListToTMethodSignature,
				ejjc, jMethodToTMethod);

	}

	public static final PerformRuleResult pattern_MethodDefinitionLinkSignature_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_2_1_bindingFB(
			MethodDefinitionLinkSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_2_1_blackFBB(
			EClass eClass, MethodDefinitionLinkSignature _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_2_1_bindingAndBlackFFB(
			MethodDefinitionLinkSignature _this) {
		Object[] result_pattern_MethodDefinitionLinkSignature_2_1_binding = pattern_MethodDefinitionLinkSignature_2_1_bindingFB(_this);
		if (result_pattern_MethodDefinitionLinkSignature_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodDefinitionLinkSignature_2_1_binding[0];

			Object[] result_pattern_MethodDefinitionLinkSignature_2_1_black = pattern_MethodDefinitionLinkSignature_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_MethodDefinitionLinkSignature_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodDefinitionLinkSignature_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodDefinitionLinkSignature";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_2_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("jMethod");
		EObject _localVariable_1 = match.getObject("JMethodname");
		EObject _localVariable_2 = match.getObject("jParamList");
		EObject _localVariable_3 = match.getObject("ejjc");
		EObject tmpJMethod = _localVariable_0;
		EObject tmpJMethodname = _localVariable_1;
		EObject tmpJParamList = _localVariable_2;
		EObject tmpEjjc = _localVariable_3;
		if (tmpJMethod instanceof ExtendedClassMethod) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
			if (tmpJMethodname instanceof ExtendedMethodName) {
				ExtendedMethodName jMethodname = (ExtendedMethodName) tmpJMethodname;
				if (tmpJParamList instanceof ExtendedParameterList) {
					ExtendedParameterList jParamList = (ExtendedParameterList) tmpJParamList;
					if (tmpEjjc instanceof ExtendedJamoppJavaContainer) {
						ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) tmpEjjc;
						return new Object[] { jMethod, jMethodname, jParamList,
								ejjc, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionLinkSignature_2_2_blackBFFBFFBFBB(
			ExtendedClassMethod jMethod, ExtendedMethodName jMethodname,
			ExtendedParameterList jParamList, ExtendedJamoppJavaContainer ejjc,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ClassMethodToTMethodSignature jMethodToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(jMethod,
						ClassMethodToTMethodSignature.class, "source")) {
			TMethodSignature tMethodSignature = jMethodToTMethodSignature
					.getTarget();
			if (tMethodSignature != null) {
				for (ExtendedMethodNameToTMethod jMethodnameToTMethod : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(jMethodname,
								ExtendedMethodNameToTMethod.class, "source")) {
					TMethod tMethod = jMethodnameToTMethod.getTarget();
					if (tMethod != null) {
						for (ExtendedParameterListToTMethodSignature jParamListToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(
										jParamList,
										ExtendedParameterListToTMethodSignature.class,
										"source")) {
							if (tMethodSignature
									.equals(jParamListToTMethodSignature
											.getTarget())) {
								_result.add(new Object[] { jMethod,
										tMethodSignature,
										jMethodToTMethodSignature, jMethodname,
										tMethod, jMethodnameToTMethod,
										jParamList,
										jParamListToTMethodSignature, ejjc,
										match });
							}
						}
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionLinkSignature_2_3_blackBBBBBBBBB(
			ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ExtendedMethodName jMethodname,
			TMethod tMethod,
			ExtendedMethodNameToTMethod jMethodnameToTMethod,
			ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature,
			ExtendedJamoppJavaContainer ejjc) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (jMethodname.getExtendedClassMethod().contains(jMethod)) {
			if (tMethodSignature.equals(jMethodToTMethodSignature.getTarget())) {
				if (jMethod.equals(jMethodToTMethodSignature.getSource())) {
					if (jMethodname.equals(jMethodnameToTMethod.getSource())) {
						if (tMethod.equals(jMethodnameToTMethod.getTarget())) {
							if (jParamList.getMethods().contains(jMethod)) {
								if (jParamList
										.equals(jParamListToTMethodSignature
												.getSource())) {
									if (tMethodSignature
											.equals(jParamListToTMethodSignature
													.getTarget())) {
										if (ejjc.getExtendedMethodName()
												.contains(jMethodname)) {
											if (ejjc.getExtendedParameterList()
													.contains(jParamList)) {
												_result.add(new Object[] {
														jMethod,
														tMethodSignature,
														jMethodToTMethodSignature,
														jMethodname,
														tMethod,
														jMethodnameToTMethod,
														jParamList,
														jParamListToTMethodSignature,
														ejjc });
											}
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

	public static final Object[] pattern_MethodDefinitionLinkSignature_2_3_greenBBBBBBBBBFFFFFFFFFFFFF(
			ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ExtendedMethodName jMethodname,
			TMethod tMethod,
			ExtendedMethodNameToTMethod jMethodnameToTMethod,
			ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature,
			ExtendedJamoppJavaContainer ejjc) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge jMethodname__jMethod____extendedClassMethod = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__JMethodname____extendedMethodName = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodSignature__tMethodSignature____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodSignature__jMethod____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodnameToTMethod__JMethodname____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodnameToTMethod__tMethod____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParamList__jMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__jParamList____parameter_list = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParamListToTMethodSignature__jParamList____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParamListToTMethodSignature__tMethodSignature____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ejjc__JMethodname____extendedMethodName = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ejjc__jParamList____extendedParameterList = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jMethodname__jMethod____extendedClassMethod_name_prime = "extendedClassMethod";
		String jMethod__JMethodname____extendedMethodName_name_prime = "extendedMethodName";
		String jMethodToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String jMethodToTMethodSignature__jMethod____source_name_prime = "source";
		String jMethodnameToTMethod__JMethodname____source_name_prime = "source";
		String jMethodnameToTMethod__tMethod____target_name_prime = "target";
		String jParamList__jMethod____methods_name_prime = "methods";
		String jMethod__jParamList____parameter_list_name_prime = "parameter_list";
		String jParamListToTMethodSignature__jParamList____source_name_prime = "source";
		String jParamListToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String ejjc__JMethodname____extendedMethodName_name_prime = "extendedMethodName";
		String ejjc__jParamList____extendedParameterList_name_prime = "extendedParameterList";
		isApplicableMatch.getAllContextElements().add(jMethod);
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements()
				.add(jMethodToTMethodSignature);
		isApplicableMatch.getAllContextElements().add(jMethodname);
		isApplicableMatch.getAllContextElements().add(tMethod);
		isApplicableMatch.getAllContextElements().add(jMethodnameToTMethod);
		isApplicableMatch.getAllContextElements().add(jParamList);
		isApplicableMatch.getAllContextElements().add(
				jParamListToTMethodSignature);
		isApplicableMatch.getAllContextElements().add(ejjc);
		jMethodname__jMethod____extendedClassMethod.setSrc(jMethodname);
		jMethodname__jMethod____extendedClassMethod.setTrg(jMethod);
		isApplicableMatch.getAllContextElements().add(
				jMethodname__jMethod____extendedClassMethod);
		jMethod__JMethodname____extendedMethodName.setSrc(jMethod);
		jMethod__JMethodname____extendedMethodName.setTrg(jMethodname);
		isApplicableMatch.getAllContextElements().add(
				jMethod__JMethodname____extendedMethodName);
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
		jMethodnameToTMethod__JMethodname____source
				.setSrc(jMethodnameToTMethod);
		jMethodnameToTMethod__JMethodname____source.setTrg(jMethodname);
		isApplicableMatch.getAllContextElements().add(
				jMethodnameToTMethod__JMethodname____source);
		jMethodnameToTMethod__tMethod____target.setSrc(jMethodnameToTMethod);
		jMethodnameToTMethod__tMethod____target.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(
				jMethodnameToTMethod__tMethod____target);
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
		ejjc__JMethodname____extendedMethodName.setSrc(ejjc);
		ejjc__JMethodname____extendedMethodName.setTrg(jMethodname);
		isApplicableMatch.getAllContextElements().add(
				ejjc__JMethodname____extendedMethodName);
		ejjc__jParamList____extendedParameterList.setSrc(ejjc);
		ejjc__jParamList____extendedParameterList.setTrg(jParamList);
		isApplicableMatch.getAllContextElements().add(
				ejjc__jParamList____extendedParameterList);
		jMethodname__jMethod____extendedClassMethod
				.setName(jMethodname__jMethod____extendedClassMethod_name_prime);
		jMethod__JMethodname____extendedMethodName
				.setName(jMethod__JMethodname____extendedMethodName_name_prime);
		jMethodToTMethodSignature__tMethodSignature____target
				.setName(jMethodToTMethodSignature__tMethodSignature____target_name_prime);
		jMethodToTMethodSignature__jMethod____source
				.setName(jMethodToTMethodSignature__jMethod____source_name_prime);
		jMethodnameToTMethod__JMethodname____source
				.setName(jMethodnameToTMethod__JMethodname____source_name_prime);
		jMethodnameToTMethod__tMethod____target
				.setName(jMethodnameToTMethod__tMethod____target_name_prime);
		jParamList__jMethod____methods
				.setName(jParamList__jMethod____methods_name_prime);
		jMethod__jParamList____parameter_list
				.setName(jMethod__jParamList____parameter_list_name_prime);
		jParamListToTMethodSignature__jParamList____source
				.setName(jParamListToTMethodSignature__jParamList____source_name_prime);
		jParamListToTMethodSignature__tMethodSignature____target
				.setName(jParamListToTMethodSignature__tMethodSignature____target_name_prime);
		ejjc__JMethodname____extendedMethodName
				.setName(ejjc__JMethodname____extendedMethodName_name_prime);
		ejjc__jParamList____extendedParameterList
				.setName(ejjc__jParamList____extendedParameterList_name_prime);
		return new Object[] { jMethod, tMethodSignature,
				jMethodToTMethodSignature, jMethodname, tMethod,
				jMethodnameToTMethod, jParamList, jParamListToTMethodSignature,
				ejjc, isApplicableMatch,
				jMethodname__jMethod____extendedClassMethod,
				jMethod__JMethodname____extendedMethodName,
				jMethodToTMethodSignature__tMethodSignature____target,
				jMethodToTMethodSignature__jMethod____source,
				jMethodnameToTMethod__JMethodname____source,
				jMethodnameToTMethod__tMethod____target,
				jParamList__jMethod____methods,
				jMethod__jParamList____parameter_list,
				jParamListToTMethodSignature__jParamList____source,
				jParamListToTMethodSignature__tMethodSignature____target,
				ejjc__JMethodname____extendedMethodName,
				ejjc__jParamList____extendedParameterList };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_2_4_bindingFBBBBBBBBBBB(
			MethodDefinitionLinkSignature _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ExtendedMethodName jMethodname,
			TMethod tMethod,
			ExtendedMethodNameToTMethod jMethodnameToTMethod,
			ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature,
			ExtendedJamoppJavaContainer ejjc) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, jMethod, tMethodSignature,
				jMethodToTMethodSignature, jMethodname, tMethod,
				jMethodnameToTMethod, jParamList, jParamListToTMethodSignature,
				ejjc);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jMethod,
					tMethodSignature, jMethodToTMethodSignature, jMethodname,
					tMethod, jMethodnameToTMethod, jParamList,
					jParamListToTMethodSignature, ejjc };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_2_4_bindingAndBlackFBBBBBBBBBBB(
			MethodDefinitionLinkSignature _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ExtendedMethodName jMethodname,
			TMethod tMethod,
			ExtendedMethodNameToTMethod jMethodnameToTMethod,
			ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature,
			ExtendedJamoppJavaContainer ejjc) {
		Object[] result_pattern_MethodDefinitionLinkSignature_2_4_binding = pattern_MethodDefinitionLinkSignature_2_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, jMethod, tMethodSignature,
				jMethodToTMethodSignature, jMethodname, tMethod,
				jMethodnameToTMethod, jParamList, jParamListToTMethodSignature,
				ejjc);
		if (result_pattern_MethodDefinitionLinkSignature_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinitionLinkSignature_2_4_binding[0];

			Object[] result_pattern_MethodDefinitionLinkSignature_2_4_black = pattern_MethodDefinitionLinkSignature_2_4_blackB(csp);
			if (result_pattern_MethodDefinitionLinkSignature_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jMethod,
						tMethodSignature, jMethodToTMethodSignature,
						jMethodname, tMethod, jMethodnameToTMethod, jParamList,
						jParamListToTMethodSignature, ejjc };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinitionLinkSignature_2_5_expressionFBB(
			MethodDefinitionLinkSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodDefinitionLinkSignature";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodDefinitionLinkSignature_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_10_1_blackBBBB(
			MethodDefinitionLinkSignature _this, Match match,
			TMethodSignature tMethodSignature, TMethod tMethod) {
		return new Object[] { _this, match, tMethodSignature, tMethod };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_10_2_bindingFBBBB(
			MethodDefinitionLinkSignature _this, Match match,
			TMethodSignature tMethodSignature, TMethod tMethod) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				tMethodSignature, tMethod);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tMethodSignature, tMethod };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_10_2_bindingAndBlackFBBBB(
			MethodDefinitionLinkSignature _this, Match match,
			TMethodSignature tMethodSignature, TMethod tMethod) {
		Object[] result_pattern_MethodDefinitionLinkSignature_10_2_binding = pattern_MethodDefinitionLinkSignature_10_2_bindingFBBBB(
				_this, match, tMethodSignature, tMethod);
		if (result_pattern_MethodDefinitionLinkSignature_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinitionLinkSignature_10_2_binding[0];

			Object[] result_pattern_MethodDefinitionLinkSignature_10_2_black = pattern_MethodDefinitionLinkSignature_10_2_blackB(csp);
			if (result_pattern_MethodDefinitionLinkSignature_10_2_black != null) {

				return new Object[] { csp, _this, match, tMethodSignature,
						tMethod };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinitionLinkSignature_10_3_expressionFBB(
			MethodDefinitionLinkSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_10_4_blackBBB(
			Match match, TMethodSignature tMethodSignature, TMethod tMethod) {
		return new Object[] { match, tMethodSignature, tMethod };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_10_4_greenBBBFF(
			Match match, TMethodSignature tMethodSignature, TMethod tMethod) {
		EMoflonEdge tMethodSignature__tMethod____method = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethod__tMethodSignature____signatures = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tMethodSignature__tMethod____method_name_prime = "method";
		String tMethod__tMethodSignature____signatures_name_prime = "signatures";
		tMethodSignature__tMethod____method.setSrc(tMethodSignature);
		tMethodSignature__tMethod____method.setTrg(tMethod);
		match.getToBeTranslatedEdges().add(tMethodSignature__tMethod____method);
		tMethod__tMethodSignature____signatures.setSrc(tMethod);
		tMethod__tMethodSignature____signatures.setTrg(tMethodSignature);
		match.getToBeTranslatedEdges().add(
				tMethod__tMethodSignature____signatures);
		tMethodSignature__tMethod____method
				.setName(tMethodSignature__tMethod____method_name_prime);
		tMethod__tMethodSignature____signatures
				.setName(tMethod__tMethodSignature____signatures_name_prime);
		return new Object[] { match, tMethodSignature, tMethod,
				tMethodSignature__tMethod____method,
				tMethod__tMethodSignature____signatures };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_10_5_blackBBB(
			Match match, TMethodSignature tMethodSignature, TMethod tMethod) {
		return new Object[] { match, tMethodSignature, tMethod };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_10_5_greenBBB(
			Match match, TMethodSignature tMethodSignature, TMethod tMethod) {
		match.getContextNodes().add(tMethodSignature);
		match.getContextNodes().add(tMethod);
		return new Object[] { match, tMethodSignature, tMethod };
	}

	public static final void pattern_MethodDefinitionLinkSignature_10_6_expressionBBBB(
			MethodDefinitionLinkSignature _this, Match match,
			TMethodSignature tMethodSignature, TMethod tMethod) {
		_this.registerObjectsToMatch_BWD(match, tMethodSignature, tMethod);

	}

	public static final boolean pattern_MethodDefinitionLinkSignature_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDefinitionLinkSignature_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_11_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jMethod");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("tMethodSignature");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("jMethodToTMethodSignature");
		EObject _localVariable_3 = isApplicableMatch.getObject("JMethodname");
		EObject _localVariable_4 = isApplicableMatch.getObject("tMethod");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("JMethodnameToTMethod");
		EObject _localVariable_6 = isApplicableMatch.getObject("jParamList");
		EObject _localVariable_7 = isApplicableMatch
				.getObject("jParamListToTMethodSignature");
		EObject _localVariable_8 = isApplicableMatch.getObject("ejjc");
		EObject tmpJMethod = _localVariable_0;
		EObject tmpTMethodSignature = _localVariable_1;
		EObject tmpJMethodToTMethodSignature = _localVariable_2;
		EObject tmpJMethodname = _localVariable_3;
		EObject tmpTMethod = _localVariable_4;
		EObject tmpJMethodnameToTMethod = _localVariable_5;
		EObject tmpJParamList = _localVariable_6;
		EObject tmpJParamListToTMethodSignature = _localVariable_7;
		EObject tmpEjjc = _localVariable_8;
		if (tmpJMethod instanceof ExtendedClassMethod) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
			if (tmpTMethodSignature instanceof TMethodSignature) {
				TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
				if (tmpJMethodToTMethodSignature instanceof ClassMethodToTMethodSignature) {
					ClassMethodToTMethodSignature jMethodToTMethodSignature = (ClassMethodToTMethodSignature) tmpJMethodToTMethodSignature;
					if (tmpJMethodname instanceof ExtendedMethodName) {
						ExtendedMethodName jMethodname = (ExtendedMethodName) tmpJMethodname;
						if (tmpTMethod instanceof TMethod) {
							TMethod tMethod = (TMethod) tmpTMethod;
							if (tmpJMethodnameToTMethod instanceof ExtendedMethodNameToTMethod) {
								ExtendedMethodNameToTMethod jMethodnameToTMethod = (ExtendedMethodNameToTMethod) tmpJMethodnameToTMethod;
								if (tmpJParamList instanceof ExtendedParameterList) {
									ExtendedParameterList jParamList = (ExtendedParameterList) tmpJParamList;
									if (tmpJParamListToTMethodSignature instanceof ExtendedParameterListToTMethodSignature) {
										ExtendedParameterListToTMethodSignature jParamListToTMethodSignature = (ExtendedParameterListToTMethodSignature) tmpJParamListToTMethodSignature;
										if (tmpEjjc instanceof ExtendedJamoppJavaContainer) {
											ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) tmpEjjc;
											return new Object[] {
													jMethod,
													tMethodSignature,
													jMethodToTMethodSignature,
													jMethodname,
													tMethod,
													jMethodnameToTMethod,
													jParamList,
													jParamListToTMethodSignature,
													ejjc, isApplicableMatch };
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

	public static final Object[] pattern_MethodDefinitionLinkSignature_11_1_blackBBBBBBBBBFBB(
			ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ExtendedMethodName jMethodname,
			TMethod tMethod,
			ExtendedMethodNameToTMethod jMethodnameToTMethod,
			ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature,
			ExtendedJamoppJavaContainer ejjc,
			MethodDefinitionLinkSignature _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jMethod, tMethodSignature,
						jMethodToTMethodSignature, jMethodname, tMethod,
						jMethodnameToTMethod, jParamList,
						jParamListToTMethodSignature, ejjc, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_11_1_bindingAndBlackFFFFFFFFFFBB(
			MethodDefinitionLinkSignature _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodDefinitionLinkSignature_11_1_binding = pattern_MethodDefinitionLinkSignature_11_1_bindingFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_MethodDefinitionLinkSignature_11_1_binding != null) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result_pattern_MethodDefinitionLinkSignature_11_1_binding[0];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_MethodDefinitionLinkSignature_11_1_binding[1];
			ClassMethodToTMethodSignature jMethodToTMethodSignature = (ClassMethodToTMethodSignature) result_pattern_MethodDefinitionLinkSignature_11_1_binding[2];
			ExtendedMethodName jMethodname = (ExtendedMethodName) result_pattern_MethodDefinitionLinkSignature_11_1_binding[3];
			TMethod tMethod = (TMethod) result_pattern_MethodDefinitionLinkSignature_11_1_binding[4];
			ExtendedMethodNameToTMethod jMethodnameToTMethod = (ExtendedMethodNameToTMethod) result_pattern_MethodDefinitionLinkSignature_11_1_binding[5];
			ExtendedParameterList jParamList = (ExtendedParameterList) result_pattern_MethodDefinitionLinkSignature_11_1_binding[6];
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature = (ExtendedParameterListToTMethodSignature) result_pattern_MethodDefinitionLinkSignature_11_1_binding[7];
			ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) result_pattern_MethodDefinitionLinkSignature_11_1_binding[8];

			Object[] result_pattern_MethodDefinitionLinkSignature_11_1_black = pattern_MethodDefinitionLinkSignature_11_1_blackBBBBBBBBBFBB(
					jMethod, tMethodSignature, jMethodToTMethodSignature,
					jMethodname, tMethod, jMethodnameToTMethod, jParamList,
					jParamListToTMethodSignature, ejjc, _this,
					isApplicableMatch);
			if (result_pattern_MethodDefinitionLinkSignature_11_1_black != null) {
				CSP csp = (CSP) result_pattern_MethodDefinitionLinkSignature_11_1_black[9];

				return new Object[] { jMethod, tMethodSignature,
						jMethodToTMethodSignature, jMethodname, tMethod,
						jMethodnameToTMethod, jParamList,
						jParamListToTMethodSignature, ejjc, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_11_1_greenBBBBBF(
			ExtendedClassMethod jMethod, ExtendedMethodName jMethodname,
			TMethod tMethod, ExtendedParameterList jParamList,
			ExtendedJamoppJavaContainer ejjc) {
		ClassMethodToTMethod jMethodToTMethod = GravityTGGFactory.eINSTANCE
				.createClassMethodToTMethod();
		jMethodname.getExtendedClassMethod().add(jMethod);
		ejjc.getExtendedParameterList().add(jParamList);
		jMethodToTMethod.setSource(jMethod);
		jMethodToTMethod.setTarget(tMethod);
		return new Object[] { jMethod, jMethodname, tMethod, jParamList, ejjc,
				jMethodToTMethod };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_11_2_blackB(
			ClassMethodToTMethod jMethodToTMethod) {
		return new Object[] { jMethodToTMethod };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_11_2_greenFB(
			ClassMethodToTMethod jMethodToTMethod) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(jMethodToTMethod);
		return new Object[] { ruleresult, jMethodToTMethod };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_11_3_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject jMethod,
			EObject tMethodSignature, EObject jMethodToTMethodSignature,
			EObject jMethodname, EObject tMethod, EObject jMethodnameToTMethod,
			EObject jParamList, EObject jParamListToTMethodSignature,
			EObject ejjc, EObject jMethodToTMethod) {
		if (!jMethod.equals(tMethodSignature)) {
			if (!jMethod.equals(jMethodToTMethodSignature)) {
				if (!jMethod.equals(tMethod)) {
					if (!jMethod.equals(jParamList)) {
						if (!jMethod.equals(jParamListToTMethodSignature)) {
							if (!jMethod.equals(jMethodToTMethod)) {
								if (!jMethodToTMethodSignature
										.equals(tMethodSignature)) {
									if (!jMethodToTMethodSignature
											.equals(tMethod)) {
										if (!jMethodToTMethodSignature
												.equals(jParamList)) {
											if (!jMethodToTMethodSignature
													.equals(jParamListToTMethodSignature)) {
												if (!jMethodname
														.equals(jMethod)) {
													if (!jMethodname
															.equals(tMethodSignature)) {
														if (!jMethodname
																.equals(jMethodToTMethodSignature)) {
															if (!jMethodname
																	.equals(tMethod)) {
																if (!jMethodname
																		.equals(jMethodnameToTMethod)) {
																	if (!jMethodname
																			.equals(jParamList)) {
																		if (!jMethodname
																				.equals(jParamListToTMethodSignature)) {
																			if (!jMethodname
																					.equals(ejjc)) {
																				if (!jMethodname
																						.equals(jMethodToTMethod)) {
																					if (!tMethod
																							.equals(tMethodSignature)) {
																						if (!jMethodnameToTMethod
																								.equals(jMethod)) {
																							if (!jMethodnameToTMethod
																									.equals(tMethodSignature)) {
																								if (!jMethodnameToTMethod
																										.equals(jMethodToTMethodSignature)) {
																									if (!jMethodnameToTMethod
																											.equals(tMethod)) {
																										if (!jMethodnameToTMethod
																												.equals(jParamList)) {
																											if (!jMethodnameToTMethod
																													.equals(jParamListToTMethodSignature)) {
																												if (!jMethodnameToTMethod
																														.equals(ejjc)) {
																													if (!jMethodnameToTMethod
																															.equals(jMethodToTMethod)) {
																														if (!jParamList
																																.equals(tMethodSignature)) {
																															if (!jParamList
																																	.equals(tMethod)) {
																																if (!jParamList
																																		.equals(jParamListToTMethodSignature)) {
																																	if (!jParamListToTMethodSignature
																																			.equals(tMethodSignature)) {
																																		if (!jParamListToTMethodSignature
																																				.equals(tMethod)) {
																																			if (!ejjc
																																					.equals(jMethod)) {
																																				if (!ejjc
																																						.equals(tMethodSignature)) {
																																					if (!ejjc
																																							.equals(jMethodToTMethodSignature)) {
																																						if (!ejjc
																																								.equals(tMethod)) {
																																							if (!ejjc
																																									.equals(jParamList)) {
																																								if (!ejjc
																																										.equals(jParamListToTMethodSignature)) {
																																									if (!ejjc
																																											.equals(jMethodToTMethod)) {
																																										if (!jMethodToTMethod
																																												.equals(tMethodSignature)) {
																																											if (!jMethodToTMethod
																																													.equals(jMethodToTMethodSignature)) {
																																												if (!jMethodToTMethod
																																														.equals(tMethod)) {
																																													if (!jMethodToTMethod
																																															.equals(jParamList)) {
																																														if (!jMethodToTMethod
																																																.equals(jParamListToTMethodSignature)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	jMethod,
																																																	tMethodSignature,
																																																	jMethodToTMethodSignature,
																																																	jMethodname,
																																																	tMethod,
																																																	jMethodnameToTMethod,
																																																	jParamList,
																																																	jParamListToTMethodSignature,
																																																	ejjc,
																																																	jMethodToTMethod };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodDefinitionLinkSignature_11_3_greenBBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject jMethod,
			EObject tMethodSignature, EObject jMethodname, EObject tMethod,
			EObject jParamList, EObject ejjc, EObject jMethodToTMethod) {
		EMoflonEdge jMethodname__jMethod____extendedClassMethod = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__JMethodname____extendedMethodName = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tMethod____method = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethod__tMethodSignature____signatures = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ejjc__jParamList____extendedParameterList = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethod__jMethod____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethod__tMethod____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodDefinitionLinkSignature";
		String jMethodname__jMethod____extendedClassMethod_name_prime = "extendedClassMethod";
		String jMethod__JMethodname____extendedMethodName_name_prime = "extendedMethodName";
		String tMethodSignature__tMethod____method_name_prime = "method";
		String tMethod__tMethodSignature____signatures_name_prime = "signatures";
		String ejjc__jParamList____extendedParameterList_name_prime = "extendedParameterList";
		String jMethodToTMethod__jMethod____source_name_prime = "source";
		String jMethodToTMethod__tMethod____target_name_prime = "target";
		jMethodname__jMethod____extendedClassMethod.setSrc(jMethodname);
		jMethodname__jMethod____extendedClassMethod.setTrg(jMethod);
		ruleresult.getCreatedEdges().add(
				jMethodname__jMethod____extendedClassMethod);
		jMethod__JMethodname____extendedMethodName.setSrc(jMethod);
		jMethod__JMethodname____extendedMethodName.setTrg(jMethodname);
		ruleresult.getCreatedEdges().add(
				jMethod__JMethodname____extendedMethodName);
		tMethodSignature__tMethod____method.setSrc(tMethodSignature);
		tMethodSignature__tMethod____method.setTrg(tMethod);
		ruleresult.getTranslatedEdges()
				.add(tMethodSignature__tMethod____method);
		tMethod__tMethodSignature____signatures.setSrc(tMethod);
		tMethod__tMethodSignature____signatures.setTrg(tMethodSignature);
		ruleresult.getTranslatedEdges().add(
				tMethod__tMethodSignature____signatures);
		ejjc__jParamList____extendedParameterList.setSrc(ejjc);
		ejjc__jParamList____extendedParameterList.setTrg(jParamList);
		ruleresult.getCreatedEdges().add(
				ejjc__jParamList____extendedParameterList);
		jMethodToTMethod__jMethod____source.setSrc(jMethodToTMethod);
		jMethodToTMethod__jMethod____source.setTrg(jMethod);
		ruleresult.getCreatedEdges().add(jMethodToTMethod__jMethod____source);
		jMethodToTMethod__tMethod____target.setSrc(jMethodToTMethod);
		jMethodToTMethod__tMethod____target.setTrg(tMethod);
		ruleresult.getCreatedEdges().add(jMethodToTMethod__tMethod____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jMethodname__jMethod____extendedClassMethod
				.setName(jMethodname__jMethod____extendedClassMethod_name_prime);
		jMethod__JMethodname____extendedMethodName
				.setName(jMethod__JMethodname____extendedMethodName_name_prime);
		tMethodSignature__tMethod____method
				.setName(tMethodSignature__tMethod____method_name_prime);
		tMethod__tMethodSignature____signatures
				.setName(tMethod__tMethodSignature____signatures_name_prime);
		ejjc__jParamList____extendedParameterList
				.setName(ejjc__jParamList____extendedParameterList_name_prime);
		jMethodToTMethod__jMethod____source
				.setName(jMethodToTMethod__jMethod____source_name_prime);
		jMethodToTMethod__tMethod____target
				.setName(jMethodToTMethod__tMethod____target_name_prime);
		return new Object[] { ruleresult, jMethod, tMethodSignature,
				jMethodname, tMethod, jParamList, ejjc, jMethodToTMethod,
				jMethodname__jMethod____extendedClassMethod,
				jMethod__JMethodname____extendedMethodName,
				tMethodSignature__tMethod____method,
				tMethod__tMethodSignature____signatures,
				ejjc__jParamList____extendedParameterList,
				jMethodToTMethod__jMethod____source,
				jMethodToTMethod__tMethod____target };
	}

	public static final void pattern_MethodDefinitionLinkSignature_11_5_expressionBBBBBBBBBBBB(
			MethodDefinitionLinkSignature _this, PerformRuleResult ruleresult,
			EObject jMethod, EObject tMethodSignature,
			EObject jMethodToTMethodSignature, EObject jMethodname,
			EObject tMethod, EObject jMethodnameToTMethod, EObject jParamList,
			EObject jParamListToTMethodSignature, EObject ejjc,
			EObject jMethodToTMethod) {
		_this.registerObjects_BWD(ruleresult, jMethod, tMethodSignature,
				jMethodToTMethodSignature, jMethodname, tMethod,
				jMethodnameToTMethod, jParamList, jParamListToTMethodSignature,
				ejjc, jMethodToTMethod);

	}

	public static final PerformRuleResult pattern_MethodDefinitionLinkSignature_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_12_1_bindingFB(
			MethodDefinitionLinkSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_12_1_blackFBB(
			EClass eClass, MethodDefinitionLinkSignature _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_12_1_bindingAndBlackFFB(
			MethodDefinitionLinkSignature _this) {
		Object[] result_pattern_MethodDefinitionLinkSignature_12_1_binding = pattern_MethodDefinitionLinkSignature_12_1_bindingFB(_this);
		if (result_pattern_MethodDefinitionLinkSignature_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodDefinitionLinkSignature_12_1_binding[0];

			Object[] result_pattern_MethodDefinitionLinkSignature_12_1_black = pattern_MethodDefinitionLinkSignature_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_MethodDefinitionLinkSignature_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodDefinitionLinkSignature_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodDefinitionLinkSignature";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_12_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("tMethodSignature");
		EObject _localVariable_1 = match.getObject("tMethod");
		EObject tmpTMethodSignature = _localVariable_0;
		EObject tmpTMethod = _localVariable_1;
		if (tmpTMethodSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
			if (tmpTMethod instanceof TMethod) {
				TMethod tMethod = (TMethod) tmpTMethod;
				return new Object[] { tMethodSignature, tMethod, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionLinkSignature_12_2_blackFBFFBFFFB(
			TMethodSignature tMethodSignature, TMethod tMethod, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ClassMethodToTMethodSignature jMethodToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tMethodSignature,
						ClassMethodToTMethodSignature.class, "target")) {
			ExtendedClassMethod jMethod = jMethodToTMethodSignature.getSource();
			if (jMethod != null) {
				for (ExtendedMethodNameToTMethod jMethodnameToTMethod : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tMethod,
								ExtendedMethodNameToTMethod.class, "target")) {
					ExtendedMethodName jMethodname = jMethodnameToTMethod
							.getSource();
					if (jMethodname != null) {
						for (ExtendedParameterListToTMethodSignature jParamListToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(
										tMethodSignature,
										ExtendedParameterListToTMethodSignature.class,
										"target")) {
							ExtendedParameterList jParamList = jParamListToTMethodSignature
									.getSource();
							if (jParamList != null) {
								_result.add(new Object[] { jMethod,
										tMethodSignature,
										jMethodToTMethodSignature, jMethodname,
										tMethod, jMethodnameToTMethod,
										jParamList,
										jParamListToTMethodSignature, match });
							}

						}
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionLinkSignature_12_3_blackBBBBBBBBF(
			ExtendedClassMethod jMethod, TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ExtendedMethodName jMethodname, TMethod tMethod,
			ExtendedMethodNameToTMethod jMethodnameToTMethod,
			ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tMethod.equals(tMethodSignature.getMethod())) {
			if (tMethodSignature.equals(jMethodToTMethodSignature.getTarget())) {
				if (jMethod.equals(jMethodToTMethodSignature.getSource())) {
					if (jMethodname.equals(jMethodnameToTMethod.getSource())) {
						if (tMethod.equals(jMethodnameToTMethod.getTarget())) {
							if (jParamList.getMethods().contains(jMethod)) {
								if (jParamList
										.equals(jParamListToTMethodSignature
												.getSource())) {
									if (tMethodSignature
											.equals(jParamListToTMethodSignature
													.getTarget())) {
										for (ExtendedJamoppJavaContainer ejjc : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														jMethodname,
														ExtendedJamoppJavaContainer.class,
														"extendedMethodName")) {
											_result.add(new Object[] {
													jMethod,
													tMethodSignature,
													jMethodToTMethodSignature,
													jMethodname,
													tMethod,
													jMethodnameToTMethod,
													jParamList,
													jParamListToTMethodSignature,
													ejjc });
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

	public static final Object[] pattern_MethodDefinitionLinkSignature_12_3_greenBBBBBBBBBFFFFFFFFFFFF(
			ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ExtendedMethodName jMethodname,
			TMethod tMethod,
			ExtendedMethodNameToTMethod jMethodnameToTMethod,
			ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature,
			ExtendedJamoppJavaContainer ejjc) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge tMethodSignature__tMethod____method = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tMethod__tMethodSignature____signatures = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodSignature__tMethodSignature____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodSignature__jMethod____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodnameToTMethod__JMethodname____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodnameToTMethod__tMethod____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParamList__jMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethod__jParamList____parameter_list = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParamListToTMethodSignature__jParamList____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jParamListToTMethodSignature__tMethodSignature____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ejjc__JMethodname____extendedMethodName = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tMethodSignature__tMethod____method_name_prime = "method";
		String tMethod__tMethodSignature____signatures_name_prime = "signatures";
		String jMethodToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String jMethodToTMethodSignature__jMethod____source_name_prime = "source";
		String jMethodnameToTMethod__JMethodname____source_name_prime = "source";
		String jMethodnameToTMethod__tMethod____target_name_prime = "target";
		String jParamList__jMethod____methods_name_prime = "methods";
		String jMethod__jParamList____parameter_list_name_prime = "parameter_list";
		String jParamListToTMethodSignature__jParamList____source_name_prime = "source";
		String jParamListToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String ejjc__JMethodname____extendedMethodName_name_prime = "extendedMethodName";
		isApplicableMatch.getAllContextElements().add(jMethod);
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements()
				.add(jMethodToTMethodSignature);
		isApplicableMatch.getAllContextElements().add(jMethodname);
		isApplicableMatch.getAllContextElements().add(tMethod);
		isApplicableMatch.getAllContextElements().add(jMethodnameToTMethod);
		isApplicableMatch.getAllContextElements().add(jParamList);
		isApplicableMatch.getAllContextElements().add(
				jParamListToTMethodSignature);
		isApplicableMatch.getAllContextElements().add(ejjc);
		tMethodSignature__tMethod____method.setSrc(tMethodSignature);
		tMethodSignature__tMethod____method.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(
				tMethodSignature__tMethod____method);
		tMethod__tMethodSignature____signatures.setSrc(tMethod);
		tMethod__tMethodSignature____signatures.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(
				tMethod__tMethodSignature____signatures);
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
		jMethodnameToTMethod__JMethodname____source
				.setSrc(jMethodnameToTMethod);
		jMethodnameToTMethod__JMethodname____source.setTrg(jMethodname);
		isApplicableMatch.getAllContextElements().add(
				jMethodnameToTMethod__JMethodname____source);
		jMethodnameToTMethod__tMethod____target.setSrc(jMethodnameToTMethod);
		jMethodnameToTMethod__tMethod____target.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(
				jMethodnameToTMethod__tMethod____target);
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
		ejjc__JMethodname____extendedMethodName.setSrc(ejjc);
		ejjc__JMethodname____extendedMethodName.setTrg(jMethodname);
		isApplicableMatch.getAllContextElements().add(
				ejjc__JMethodname____extendedMethodName);
		tMethodSignature__tMethod____method
				.setName(tMethodSignature__tMethod____method_name_prime);
		tMethod__tMethodSignature____signatures
				.setName(tMethod__tMethodSignature____signatures_name_prime);
		jMethodToTMethodSignature__tMethodSignature____target
				.setName(jMethodToTMethodSignature__tMethodSignature____target_name_prime);
		jMethodToTMethodSignature__jMethod____source
				.setName(jMethodToTMethodSignature__jMethod____source_name_prime);
		jMethodnameToTMethod__JMethodname____source
				.setName(jMethodnameToTMethod__JMethodname____source_name_prime);
		jMethodnameToTMethod__tMethod____target
				.setName(jMethodnameToTMethod__tMethod____target_name_prime);
		jParamList__jMethod____methods
				.setName(jParamList__jMethod____methods_name_prime);
		jMethod__jParamList____parameter_list
				.setName(jMethod__jParamList____parameter_list_name_prime);
		jParamListToTMethodSignature__jParamList____source
				.setName(jParamListToTMethodSignature__jParamList____source_name_prime);
		jParamListToTMethodSignature__tMethodSignature____target
				.setName(jParamListToTMethodSignature__tMethodSignature____target_name_prime);
		ejjc__JMethodname____extendedMethodName
				.setName(ejjc__JMethodname____extendedMethodName_name_prime);
		return new Object[] { jMethod, tMethodSignature,
				jMethodToTMethodSignature, jMethodname, tMethod,
				jMethodnameToTMethod, jParamList, jParamListToTMethodSignature,
				ejjc, isApplicableMatch, tMethodSignature__tMethod____method,
				tMethod__tMethodSignature____signatures,
				jMethodToTMethodSignature__tMethodSignature____target,
				jMethodToTMethodSignature__jMethod____source,
				jMethodnameToTMethod__JMethodname____source,
				jMethodnameToTMethod__tMethod____target,
				jParamList__jMethod____methods,
				jMethod__jParamList____parameter_list,
				jParamListToTMethodSignature__jParamList____source,
				jParamListToTMethodSignature__tMethodSignature____target,
				ejjc__JMethodname____extendedMethodName };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_12_4_bindingFBBBBBBBBBBB(
			MethodDefinitionLinkSignature _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ExtendedMethodName jMethodname,
			TMethod tMethod,
			ExtendedMethodNameToTMethod jMethodnameToTMethod,
			ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature,
			ExtendedJamoppJavaContainer ejjc) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, jMethod, tMethodSignature,
				jMethodToTMethodSignature, jMethodname, tMethod,
				jMethodnameToTMethod, jParamList, jParamListToTMethodSignature,
				ejjc);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jMethod,
					tMethodSignature, jMethodToTMethodSignature, jMethodname,
					tMethod, jMethodnameToTMethod, jParamList,
					jParamListToTMethodSignature, ejjc };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_12_4_bindingAndBlackFBBBBBBBBBBB(
			MethodDefinitionLinkSignature _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ExtendedMethodName jMethodname,
			TMethod tMethod,
			ExtendedMethodNameToTMethod jMethodnameToTMethod,
			ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature,
			ExtendedJamoppJavaContainer ejjc) {
		Object[] result_pattern_MethodDefinitionLinkSignature_12_4_binding = pattern_MethodDefinitionLinkSignature_12_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, jMethod, tMethodSignature,
				jMethodToTMethodSignature, jMethodname, tMethod,
				jMethodnameToTMethod, jParamList, jParamListToTMethodSignature,
				ejjc);
		if (result_pattern_MethodDefinitionLinkSignature_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinitionLinkSignature_12_4_binding[0];

			Object[] result_pattern_MethodDefinitionLinkSignature_12_4_black = pattern_MethodDefinitionLinkSignature_12_4_blackB(csp);
			if (result_pattern_MethodDefinitionLinkSignature_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jMethod,
						tMethodSignature, jMethodToTMethodSignature,
						jMethodname, tMethod, jMethodnameToTMethod, jParamList,
						jParamListToTMethodSignature, ejjc };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinitionLinkSignature_12_5_expressionFBB(
			MethodDefinitionLinkSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodDefinitionLinkSignature";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodDefinitionLinkSignature_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_20_1_bindingFB(
			MethodDefinitionLinkSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_20_1_blackFBB(
			EClass __eClass, MethodDefinitionLinkSignature _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_20_1_bindingAndBlackFFB(
			MethodDefinitionLinkSignature _this) {
		Object[] result_pattern_MethodDefinitionLinkSignature_20_1_binding = pattern_MethodDefinitionLinkSignature_20_1_bindingFB(_this);
		if (result_pattern_MethodDefinitionLinkSignature_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodDefinitionLinkSignature_20_1_binding[0];

			Object[] result_pattern_MethodDefinitionLinkSignature_20_1_black = pattern_MethodDefinitionLinkSignature_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_MethodDefinitionLinkSignature_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodDefinitionLinkSignature_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionLinkSignature_20_2_blackFFFFB(
			EMoflonEdge _edge_extendedClassMethod) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJMethodname = _edge_extendedClassMethod.getSrc();
		if (tmpJMethodname instanceof ExtendedMethodName) {
			ExtendedMethodName jMethodname = (ExtendedMethodName) tmpJMethodname;
			EObject tmpJMethod = _edge_extendedClassMethod.getTrg();
			if (tmpJMethod instanceof ExtendedClassMethod) {
				ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
				if (jMethodname.getExtendedClassMethod().contains(jMethod)) {
					ExtendedParameterList jParamList = jMethod
							.getParameter_list();
					if (jParamList != null) {
						for (ExtendedJamoppJavaContainer ejjc : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(jMethodname,
										ExtendedJamoppJavaContainer.class,
										"extendedMethodName")) {
							if (ejjc.getExtendedParameterList().contains(
									jParamList)) {
								_result.add(new Object[] { jMethod,
										jMethodname, jParamList, ejjc,
										_edge_extendedClassMethod });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodDefinitionLinkSignature_20_3_expressionFBBBBBB(
			MethodDefinitionLinkSignature _this, Match match,
			ExtendedClassMethod jMethod, ExtendedMethodName jMethodname,
			ExtendedParameterList jParamList, ExtendedJamoppJavaContainer ejjc) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jMethod,
				jMethodname, jParamList, ejjc);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodDefinitionLinkSignature_20_4_expressionFBB(
			MethodDefinitionLinkSignature _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_MethodDefinitionLinkSignature_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_21_1_bindingFB(
			MethodDefinitionLinkSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_21_1_blackFBB(
			EClass __eClass, MethodDefinitionLinkSignature _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_21_1_bindingAndBlackFFB(
			MethodDefinitionLinkSignature _this) {
		Object[] result_pattern_MethodDefinitionLinkSignature_21_1_binding = pattern_MethodDefinitionLinkSignature_21_1_bindingFB(_this);
		if (result_pattern_MethodDefinitionLinkSignature_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodDefinitionLinkSignature_21_1_binding[0];

			Object[] result_pattern_MethodDefinitionLinkSignature_21_1_black = pattern_MethodDefinitionLinkSignature_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_MethodDefinitionLinkSignature_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodDefinitionLinkSignature_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionLinkSignature_21_2_blackFFFFB(
			EMoflonEdge _edge_extendedMethodName) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJMethod = _edge_extendedMethodName.getSrc();
		if (tmpJMethod instanceof ExtendedClassMethod) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
			EObject tmpJMethodname = _edge_extendedMethodName.getTrg();
			if (tmpJMethodname instanceof ExtendedMethodName) {
				ExtendedMethodName jMethodname = (ExtendedMethodName) tmpJMethodname;
				if (jMethodname.getExtendedClassMethod().contains(jMethod)) {
					ExtendedParameterList jParamList = jMethod
							.getParameter_list();
					if (jParamList != null) {
						for (ExtendedJamoppJavaContainer ejjc : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(jMethodname,
										ExtendedJamoppJavaContainer.class,
										"extendedMethodName")) {
							if (ejjc.getExtendedParameterList().contains(
									jParamList)) {
								_result.add(new Object[] { jMethod,
										jMethodname, jParamList, ejjc,
										_edge_extendedMethodName });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodDefinitionLinkSignature_21_3_expressionFBBBBBB(
			MethodDefinitionLinkSignature _this, Match match,
			ExtendedClassMethod jMethod, ExtendedMethodName jMethodname,
			ExtendedParameterList jParamList, ExtendedJamoppJavaContainer ejjc) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jMethod,
				jMethodname, jParamList, ejjc);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodDefinitionLinkSignature_21_4_expressionFBB(
			MethodDefinitionLinkSignature _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_MethodDefinitionLinkSignature_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_22_1_bindingFB(
			MethodDefinitionLinkSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_22_1_blackFBB(
			EClass __eClass, MethodDefinitionLinkSignature _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_22_1_bindingAndBlackFFB(
			MethodDefinitionLinkSignature _this) {
		Object[] result_pattern_MethodDefinitionLinkSignature_22_1_binding = pattern_MethodDefinitionLinkSignature_22_1_bindingFB(_this);
		if (result_pattern_MethodDefinitionLinkSignature_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodDefinitionLinkSignature_22_1_binding[0];

			Object[] result_pattern_MethodDefinitionLinkSignature_22_1_black = pattern_MethodDefinitionLinkSignature_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_MethodDefinitionLinkSignature_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodDefinitionLinkSignature_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionLinkSignature_22_2_blackFFB(
			EMoflonEdge _edge_method) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMethodSignature = _edge_method.getSrc();
		if (tmpTMethodSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
			EObject tmpTMethod = _edge_method.getTrg();
			if (tmpTMethod instanceof TMethod) {
				TMethod tMethod = (TMethod) tmpTMethod;
				if (tMethod.equals(tMethodSignature.getMethod())) {
					_result.add(new Object[] { tMethodSignature, tMethod,
							_edge_method });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodDefinitionLinkSignature_22_3_expressionFBBBB(
			MethodDefinitionLinkSignature _this, Match match,
			TMethodSignature tMethodSignature, TMethod tMethod) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match,
				tMethodSignature, tMethod);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodDefinitionLinkSignature_22_4_expressionFBB(
			MethodDefinitionLinkSignature _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_MethodDefinitionLinkSignature_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_23_1_bindingFB(
			MethodDefinitionLinkSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_23_1_blackFBB(
			EClass __eClass, MethodDefinitionLinkSignature _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_23_1_bindingAndBlackFFB(
			MethodDefinitionLinkSignature _this) {
		Object[] result_pattern_MethodDefinitionLinkSignature_23_1_binding = pattern_MethodDefinitionLinkSignature_23_1_bindingFB(_this);
		if (result_pattern_MethodDefinitionLinkSignature_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodDefinitionLinkSignature_23_1_binding[0];

			Object[] result_pattern_MethodDefinitionLinkSignature_23_1_black = pattern_MethodDefinitionLinkSignature_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_MethodDefinitionLinkSignature_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodDefinitionLinkSignature_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionLinkSignature_23_2_blackFFB(
			EMoflonEdge _edge_signatures) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMethod = _edge_signatures.getSrc();
		if (tmpTMethod instanceof TMethod) {
			TMethod tMethod = (TMethod) tmpTMethod;
			EObject tmpTMethodSignature = _edge_signatures.getTrg();
			if (tmpTMethodSignature instanceof TMethodSignature) {
				TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
				if (tMethod.equals(tMethodSignature.getMethod())) {
					_result.add(new Object[] { tMethodSignature, tMethod,
							_edge_signatures });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodDefinitionLinkSignature_23_3_expressionFBBBB(
			MethodDefinitionLinkSignature _this, Match match,
			TMethodSignature tMethodSignature, TMethod tMethod) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match,
				tMethodSignature, tMethod);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodDefinitionLinkSignature_23_4_expressionFBB(
			MethodDefinitionLinkSignature _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_MethodDefinitionLinkSignature_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_24_1_bindingFB(
			MethodDefinitionLinkSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_24_1_blackFBB(
			EClass __eClass, MethodDefinitionLinkSignature _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_24_1_bindingAndBlackFFB(
			MethodDefinitionLinkSignature _this) {
		Object[] result_pattern_MethodDefinitionLinkSignature_24_1_binding = pattern_MethodDefinitionLinkSignature_24_1_bindingFB(_this);
		if (result_pattern_MethodDefinitionLinkSignature_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodDefinitionLinkSignature_24_1_binding[0];

			Object[] result_pattern_MethodDefinitionLinkSignature_24_1_black = pattern_MethodDefinitionLinkSignature_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_MethodDefinitionLinkSignature_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodDefinitionLinkSignature_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionLinkSignature_24_2_blackFFFFB(
			EMoflonEdge _edge_extendedParameterList) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEjjc = _edge_extendedParameterList.getSrc();
		if (tmpEjjc instanceof ExtendedJamoppJavaContainer) {
			ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) tmpEjjc;
			EObject tmpJParamList = _edge_extendedParameterList.getTrg();
			if (tmpJParamList instanceof ExtendedParameterList) {
				ExtendedParameterList jParamList = (ExtendedParameterList) tmpJParamList;
				if (ejjc.getExtendedParameterList().contains(jParamList)) {
					for (ExtendedMethodName jMethodname : ejjc
							.getExtendedMethodName()) {
						for (ExtendedClassMethod jMethod : jParamList
								.getMethods()) {
							if (jMethodname.getExtendedClassMethod().contains(
									jMethod)) {
								_result.add(new Object[] { jMethod,
										jMethodname, jParamList, ejjc,
										_edge_extendedParameterList });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodDefinitionLinkSignature_24_3_expressionFBBBBBB(
			MethodDefinitionLinkSignature _this, Match match,
			ExtendedClassMethod jMethod, ExtendedMethodName jMethodname,
			ExtendedParameterList jParamList, ExtendedJamoppJavaContainer ejjc) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jMethod,
				jMethodname, jParamList, ejjc);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodDefinitionLinkSignature_24_4_expressionFBB(
			MethodDefinitionLinkSignature _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_MethodDefinitionLinkSignature_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_MethodDefinitionLinkSignature_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodDefinitionLinkSignatureImpl
