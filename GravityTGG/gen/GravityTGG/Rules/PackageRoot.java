/**
 */
package GravityTGG.Rules;

import ExtendedJamopp.ExtendedJamoppJavaContainer;
import ExtendedJamopp.ExtendedJamoppPackageElement;

import GravityTGG.ExtendedJamoppJavaContainerToTypeGraph;

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

import TypeGraphBasic.TPackage;
import TypeGraphBasic.TypeGraph;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Root</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see GravityTGG.Rules.RulesPackage#getPackageRoot()
 * @model
 * @generated
 */
public interface PackageRoot extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement);

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
			ExtendedJamoppPackageElement extendedJamoppPackageElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement);

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
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer);

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
			EObject extendedJamoppJavaContainer,
			EObject extendedJamoppPackageElement, EObject tPackage,
			EObject tPackageToExtendedJamoppPackageElement, EObject typeGraph,
			EObject typeGraphToExtendedJamoppJavaContainer);

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
	boolean isAppropriate_BWD(Match match, TPackage tPackage,
			TypeGraph typeGraph);

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
	void registerObjectsToMatch_BWD(Match match, TPackage tPackage,
			TypeGraph typeGraph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_BWD(Match match, TPackage tPackage,
			TypeGraph typeGraph);

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
			TPackage tPackage,
			TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer);

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
			EObject extendedJamoppJavaContainer,
			EObject extendedJamoppPackageElement, EObject tPackage,
			EObject tPackageToExtendedJamoppPackageElement, EObject typeGraph,
			EObject typeGraphToExtendedJamoppJavaContainer);

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
	EObjectContainer isAppropriate_FWD_EMoflonEdge_22(
			EMoflonEdge _edge_extendedJamoppPackageElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_23(EMoflonEdge _edge_roots);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_33(EMoflonEdge _edge_packages);

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
} // PackageRoot
