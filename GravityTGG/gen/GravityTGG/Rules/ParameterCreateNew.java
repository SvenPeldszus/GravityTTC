/**
 */
package GravityTGG.Rules;

import ExtendedJamopp.ExtendedJamoppJavaContainer;
import ExtendedJamopp.ExtendedMethodName;
import ExtendedJamopp.ExtendedParameter;
import ExtendedJamopp.ExtendedParameterList;

import GravityTGG.ExtendedJamoppJavaContainerToTypeGraph;
import GravityTGG.ExtendedMethodNameToTMethod;
import GravityTGG.ExtendedParameterListToTMethodSignature;
import GravityTGG.ExtendedParameterListToTParameterList;

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
import TypeGraphBasic.TParameter;
import TypeGraphBasic.TParameterList;
import TypeGraphBasic.TypeGraph;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Create New</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see GravityTGG.Rules.RulesPackage#getParameterCreateNew()
 * @model
 * @generated
 */
public interface ParameterCreateNew extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedMethodName jMethodName, ExtendedParameter jParameter,
			ExtendedParameterList jParameterList);

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
	void registerObjectsToMatch_FWD(Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedMethodName jMethodName, ExtendedParameter jParameter,
			ExtendedParameterList jParameterList);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedMethodName jMethodName, ExtendedParameter jParameter,
			ExtendedParameterList jParameterList);

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
			ExtendedMethodNameToTMethod jMethodNameToTMethod);

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
	void registerObjects_FWD(PerformRuleResult ruleresult,
			EObject extendedJamoppJavaContainer, EObject pg,
			EObject extendedJamoppJavaContainerToPg, EObject tMethodSignature,
			EObject jParameterListToTMethodSignature, EObject jParameterToPg,
			EObject jMethodName, EObject tMethod, EObject jParameter,
			EObject tParameter, EObject tParameterList, EObject jParameterList,
			EObject jParameterListToTParameterList,
			EObject jParameterToTParameter, EObject jMethodNameToTMethod);

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
	boolean isAppropriate_BWD(Match match, TypeGraph pg,
			TMethodSignature tMethodSignature, TMethod tMethod,
			TParameter tParameter, TParameterList tParameterList);

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
	void registerObjectsToMatch_BWD(Match match, TypeGraph pg,
			TMethodSignature tMethodSignature, TMethod tMethod,
			TParameter tParameter, TParameterList tParameterList);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph pg,
			TMethodSignature tMethodSignature, TMethod tMethod,
			TParameter tParameter, TParameterList tParameterList);

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
			ExtendedMethodNameToTMethod jMethodNameToTMethod);

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
	void registerObjects_BWD(PerformRuleResult ruleresult,
			EObject extendedJamoppJavaContainer, EObject pg,
			EObject extendedJamoppJavaContainerToPg, EObject tMethodSignature,
			EObject jParameterListToTMethodSignature, EObject jParameterToPg,
			EObject jMethodName, EObject tMethod, EObject jParameter,
			EObject tParameter, EObject tParameterList, EObject jParameterList,
			EObject jParameterListToTParameterList,
			EObject jParameterToTParameter, EObject jMethodNameToTMethod);

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
	EObjectContainer isAppropriate_BWD_EMoflonEdge_40(EMoflonEdge _edge_entries);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_31(EMoflonEdge _edge_values);

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
} // ParameterCreateNew
