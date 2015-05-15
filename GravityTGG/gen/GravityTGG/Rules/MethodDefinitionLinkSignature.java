/**
 */
package GravityTGG.Rules;

import ExtendedJamopp.ExtendedClassMethod;
import ExtendedJamopp.ExtendedJamoppJavaContainer;
import ExtendedJamopp.ExtendedMethodName;
import ExtendedJamopp.ExtendedParameterList;

import GravityTGG.ClassMethodToTMethodSignature;
import GravityTGG.ExtendedMethodNameToTMethod;
import GravityTGG.ExtendedParameterListToTMethodSignature;

import TGGLanguage.csp.CSP;

import TGGRuntime.AbstractRule;
import TGGRuntime.EMoflonEdge;
import TGGRuntime.EObjectContainer;
import TGGRuntime.IsApplicableMatch;
import TGGRuntime.IsApplicableRuleResult;
import TGGRuntime.Match;
import TGGRuntime.PerformRuleResult;
import TGGRuntime.RuleResult;
import TGGRuntime.TripleMatch;

import TypeGraphBasic.TMethod;
import TypeGraphBasic.TMethodSignature;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Definition Link Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see GravityTGG.Rules.RulesPackage#getMethodDefinitionLinkSignature()
 * @model
 * @generated
 */
public interface MethodDefinitionLinkSignature extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, ExtendedClassMethod jMethod,
			ExtendedMethodName JMethodname, ExtendedParameterList jParamList,
			ExtendedJamoppJavaContainer ejjc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjectsToMatch_FWD(Match match, ExtendedClassMethod jMethod,
			ExtendedMethodName JMethodname, ExtendedParameterList jParamList,
			ExtendedJamoppJavaContainer ejjc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, ExtendedClassMethod jMethod,
			ExtendedMethodName JMethodname, ExtendedParameterList jParamList,
			ExtendedJamoppJavaContainer ejjc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isApplicable_solveCsp_FWD(
			IsApplicableMatch isApplicableMatch,
			ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ExtendedMethodName JMethodname,
			TMethod tMethod,
			ExtendedMethodNameToTMethod JMethodnameToTMethod,
			ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature,
			ExtendedJamoppJavaContainer ejjc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject jMethod,
			EObject tMethodSignature, EObject jMethodToTMethodSignature,
			EObject JMethodname, EObject tMethod, EObject JMethodnameToTMethod,
			EObject jParamList, EObject jParamListToTMethodSignature,
			EObject ejjc, EObject jMethodToTMethod);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkTypes_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_BWD(Match match, TMethodSignature tMethodSignature,
			TMethod tMethod);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_BWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjectsToMatch_BWD(Match match,
			TMethodSignature tMethodSignature, TMethod tMethod);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_BWD(Match match,
			TMethodSignature tMethodSignature, TMethod tMethod);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_checkCsp_BWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isApplicable_solveCsp_BWD(
			IsApplicableMatch isApplicableMatch,
			ExtendedClassMethod jMethod,
			TMethodSignature tMethodSignature,
			ClassMethodToTMethodSignature jMethodToTMethodSignature,
			ExtendedMethodName JMethodname,
			TMethod tMethod,
			ExtendedMethodNameToTMethod JMethodnameToTMethod,
			ExtendedParameterList jParamList,
			ExtendedParameterListToTMethodSignature jParamListToTMethodSignature,
			ExtendedJamoppJavaContainer ejjc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_BWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjects_BWD(PerformRuleResult ruleresult, EObject jMethod,
			EObject tMethodSignature, EObject jMethodToTMethodSignature,
			EObject JMethodname, EObject tMethod, EObject JMethodnameToTMethod,
			EObject jParamList, EObject jParamListToTMethodSignature,
			EObject ejjc, EObject jMethodToTMethod);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkTypes_BWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_6(
			EMoflonEdge _edge_extendedClassMethod);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_7(
			EMoflonEdge _edge_extendedMethodName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_12(EMoflonEdge _edge_method);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_13(
			EMoflonEdge _edge_signatures);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_8(
			EMoflonEdge _edge_extendedParameterList);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RuleResult checkAttributes_FWD(TripleMatch tripleMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RuleResult checkAttributes_BWD(TripleMatch tripleMatch);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MethodDefinitionLinkSignature
