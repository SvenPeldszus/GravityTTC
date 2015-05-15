/**
 */
package GravityTGG.Rules;

import ExtendedJamopp.ExtendedClassMethod;
import ExtendedJamopp.ExtendedType;

import GravityTGG.ClassMethodToTMethodDefinition;
import GravityTGG.ClassToTClass;

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

import TypeGraphBasic.TClass;
import TypeGraphBasic.TMethodDefinition;
import TypeGraphBasic.TypeGraph;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Type From Lib Create</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see GravityTGG.Rules.RulesPackage#getReturnTypeFromLibCreate()
 * @model
 * @generated
 */
public interface ReturnTypeFromLibCreate extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedType extendedType, ExtendedClassMethod jMethod);

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
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedType extendedType, ExtendedClassMethod jMethod);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedType extendedType, ExtendedClassMethod jMethod);

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
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, ExtendedType extendedType,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			TypeGraph pg);

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
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject jClass,
			EObject tClass, EObject jClassToTClass, EObject tType,
			EObject extendedType, EObject tMethodDefinition, EObject jMethod,
			EObject jMethodToTMethodDefinition, EObject extendedTypeToTType,
			EObject pg);

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
	boolean isAppropriate_BWD(Match match, TClass tClass, TClass tType,
			TMethodDefinition tMethodDefinition, TypeGraph pg);

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
	void registerObjectsToMatch_BWD(Match match, TClass tClass, TClass tType,
			TMethodDefinition tMethodDefinition, TypeGraph pg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_BWD(Match match, TClass tClass, TClass tType,
			TMethodDefinition tMethodDefinition, TypeGraph pg);

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
	CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			org.emftext.language.java.classifiers.Class jClass, TClass tClass,
			ClassToTClass jClassToTClass, TClass tType,
			TMethodDefinition tMethodDefinition, ExtendedClassMethod jMethod,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition,
			TypeGraph pg);

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
	void registerObjects_BWD(PerformRuleResult ruleresult, EObject jClass,
			EObject tClass, EObject jClassToTClass, EObject tType,
			EObject extendedType, EObject tMethodDefinition, EObject jMethod,
			EObject jMethodToTMethodDefinition, EObject extendedTypeToTType,
			EObject pg);

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
	EObjectContainer isAppropriate_BWD_EMoflonEdge_37(
			EMoflonEdge _edge_returnType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_29(
			EMoflonEdge _edge_extendedReturnType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_38(EMoflonEdge _edge_classes);

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
} // ReturnTypeFromLibCreate
