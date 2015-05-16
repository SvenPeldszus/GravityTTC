/**
 */
package GravityTGG.Rules;

import ExtendedJamopp.ExtendedJamoppJavaContainer;
import ExtendedJamopp.ExtendedJamoppPackageElement;

import GravityTGG.ExtendedJamoppJavaContainerToTypeGraph;
import GravityTGG.ExtendedJamoppPackageElementToTPackage;

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
import TypeGraphBasic.TPackage;
import TypeGraphBasic.TypeGraph;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.java.containers.CompilationUnit;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Default</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see GravityTGG.Rules.RulesPackage#getClassDefault()
 * @model
 * @generated
 */
public interface ClassDefault extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage);

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
			CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match,
			CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage);

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
			CompilationUnit compilationUnit,
			org.emftext.language.java.classifiers.Class jClass,
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage,
			ExtendedJamoppPackageElementToTPackage jPackageToTPackage,
			TPackage tPackage, TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer);

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
			EObject compilationUnit, EObject compilationUnitToTClass,
			EObject jClass, EObject jClassToTClass, EObject jContainer,
			EObject jPackage, EObject jPackageToTPackage, EObject tClass,
			EObject tPackage, EObject typeGraph, EObject typeGraphToJContainer);

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
	boolean isAppropriate_BWD(Match match, TClass tClass, TPackage tPackage,
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
	void registerObjectsToMatch_BWD(Match match, TClass tClass,
			TPackage tPackage, TypeGraph typeGraph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_BWD(Match match, TClass tClass,
			TPackage tPackage, TypeGraph typeGraph);

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
			ExtendedJamoppJavaContainer jContainer,
			ExtendedJamoppPackageElement jPackage,
			ExtendedJamoppPackageElementToTPackage jPackageToTPackage,
			TClass tClass, TPackage tPackage, TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToJContainer);

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
			EObject compilationUnit, EObject compilationUnitToTClass,
			EObject jClass, EObject jClassToTClass, EObject jContainer,
			EObject jPackage, EObject jPackageToTPackage, EObject tClass,
			EObject tPackage, EObject typeGraph, EObject typeGraphToJContainer);

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
	EObjectContainer isAppropriate_FWD_EMoflonEdge_0(
			EMoflonEdge _edge_classifiers);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_1(
			EMoflonEdge _edge_compilationUnit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_2(
			EMoflonEdge _edge_compilationUnit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_0(
			EMoflonEdge _edge_containedClasses);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_1(EMoflonEdge _edge_package);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_2(EMoflonEdge _edge_classes);

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
} // ClassDefault
