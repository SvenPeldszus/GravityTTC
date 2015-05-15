/**
 */
package GravityTGG.Rules.impl;

import ExtendedJamopp.ExtendedJamoppFactory;
import ExtendedJamopp.ExtendedJamoppJavaContainer;
import ExtendedJamopp.ExtendedJamoppPackageElement;

import GravityTGG.ExtendedJamoppJavaContainerToTypeGraph;
import GravityTGG.ExtendedJamoppPackageElementToTPackage;
import GravityTGG.GravityTGGFactory;

import GravityTGG.Rules.PackageRoot;
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
// <-- [user defined imports]
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;

// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PackageRootImpl extends AbstractRuleImpl implements PackageRoot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getPackageRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement) {
		// initial bindings
		Object[] result1_black = PackageRootImpl
				.pattern_PackageRoot_0_1_blackBBBB(this, match,
						extendedJamoppJavaContainer,
						extendedJamoppPackageElement);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = PackageRootImpl
				.pattern_PackageRoot_0_2_bindingAndBlackFBBBB(this, match,
						extendedJamoppJavaContainer,
						extendedJamoppPackageElement);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (PackageRootImpl.pattern_PackageRoot_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = PackageRootImpl
					.pattern_PackageRoot_0_4_blackBBB(match,
							extendedJamoppJavaContainer,
							extendedJamoppPackageElement);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			PackageRootImpl.pattern_PackageRoot_0_4_greenBBBFF(match,
					extendedJamoppJavaContainer, extendedJamoppPackageElement);
			// EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement = (EMoflonEdge) result4_green[3];
			// EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____roots = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = PackageRootImpl
					.pattern_PackageRoot_0_5_blackBBB(match,
							extendedJamoppJavaContainer,
							extendedJamoppPackageElement);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			PackageRootImpl.pattern_PackageRoot_0_5_greenBB(match,
					extendedJamoppJavaContainer);

			// register objects to match
			PackageRootImpl.pattern_PackageRoot_0_6_expressionBBBB(this, match,
					extendedJamoppJavaContainer, extendedJamoppPackageElement);
			return PackageRootImpl.pattern_PackageRoot_0_7_expressionF();
		} else {
			return PackageRootImpl.pattern_PackageRoot_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = PackageRootImpl
				.pattern_PackageRoot_1_1_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result1_bindingAndBlack[0];
		ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) result1_bindingAndBlack[1];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[2];
		ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer = (ExtendedJamoppJavaContainerToTypeGraph) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = PackageRootImpl
				.pattern_PackageRoot_1_1_greenBFFBB(
						extendedJamoppPackageElement, typeGraph, csp);
		TPackage tPackage = (TPackage) result1_green[1];
		ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement = (ExtendedJamoppPackageElementToTPackage) result1_green[2];

		// collect translated elements
		Object[] result2_black = PackageRootImpl
				.pattern_PackageRoot_1_2_blackBBB(extendedJamoppPackageElement,
						tPackage, tPackageToExtendedJamoppPackageElement);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = PackageRootImpl
				.pattern_PackageRoot_1_2_greenFBBB(
						extendedJamoppPackageElement, tPackage,
						tPackageToExtendedJamoppPackageElement);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = PackageRootImpl
				.pattern_PackageRoot_1_3_blackBBBBBBB(ruleresult,
						extendedJamoppJavaContainer,
						extendedJamoppPackageElement, tPackage,
						tPackageToExtendedJamoppPackageElement, typeGraph,
						typeGraphToExtendedJamoppJavaContainer);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		PackageRootImpl.pattern_PackageRoot_1_3_greenBBBBBBFFFFF(ruleresult,
				extendedJamoppJavaContainer, extendedJamoppPackageElement,
				tPackage, tPackageToExtendedJamoppPackageElement, typeGraph);
		// EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement = (EMoflonEdge) result3_green[6];
		// EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____roots = (EMoflonEdge) result3_green[7];
		// EMoflonEdge tPackageToExtendedJamoppPackageElement__tPackage____target = (EMoflonEdge) result3_green[8];
		// EMoflonEdge tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge typeGraph__tPackage____packages = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		PackageRootImpl.pattern_PackageRoot_1_5_expressionBBBBBBBB(this,
				ruleresult, extendedJamoppJavaContainer,
				extendedJamoppPackageElement, tPackage,
				tPackageToExtendedJamoppPackageElement, typeGraph,
				typeGraphToExtendedJamoppJavaContainer);
		return PackageRootImpl.pattern_PackageRoot_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = PackageRootImpl
				.pattern_PackageRoot_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PackageRootImpl
				.pattern_PackageRoot_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = PackageRootImpl
				.pattern_PackageRoot_2_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result2_binding[0];
		ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) result2_binding[1];
		for (Object[] result2_black : PackageRootImpl
				.pattern_PackageRoot_2_2_blackBBFFB(
						extendedJamoppJavaContainer,
						extendedJamoppPackageElement, match)) {
			TypeGraph typeGraph = (TypeGraph) result2_black[2];
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer = (ExtendedJamoppJavaContainerToTypeGraph) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : PackageRootImpl
					.pattern_PackageRoot_2_3_blackBBBB(
							extendedJamoppJavaContainer,
							extendedJamoppPackageElement, typeGraph,
							typeGraphToExtendedJamoppJavaContainer)) {
				Object[] result3_green = PackageRootImpl
						.pattern_PackageRoot_2_3_greenBBBBFFFFF(
								extendedJamoppJavaContainer,
								extendedJamoppPackageElement, typeGraph,
								typeGraphToExtendedJamoppJavaContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement = (EMoflonEdge) result3_green[5];
				// EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____roots = (EMoflonEdge) result3_green[6];
				// EMoflonEdge typeGraphToExtendedJamoppJavaContainer__typeGraph____target = (EMoflonEdge) result3_green[7];
				// EMoflonEdge typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source = (EMoflonEdge) result3_green[8];

				// solve CSP
				Object[] result4_bindingAndBlack = PackageRootImpl
						.pattern_PackageRoot_2_4_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, extendedJamoppJavaContainer,
								extendedJamoppPackageElement, typeGraph,
								typeGraphToExtendedJamoppJavaContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (PackageRootImpl.pattern_PackageRoot_2_5_expressionFBB(this,
						csp)) {

					// add match to rule result
					Object[] result6_black = PackageRootImpl
							.pattern_PackageRoot_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					PackageRootImpl.pattern_PackageRoot_2_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return PackageRootImpl.pattern_PackageRoot_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement) {
		match.registerObject("extendedJamoppJavaContainer",
				extendedJamoppJavaContainer);
		match.registerObject("extendedJamoppPackageElement",
				extendedJamoppPackageElement);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement) {// Create CSP
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
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_extendedJamoppPackageElement_name = CSPFactoryHelper.eINSTANCE
				.createVariable("extendedJamoppPackageElement.name", true, csp);
		var_extendedJamoppPackageElement_name
				.setValue(extendedJamoppPackageElement.getName());
		var_extendedJamoppPackageElement_name.setType("String");

		// Create unbound variables
		Variable var_tPackage_tName = CSPFactoryHelper.eINSTANCE
				.createVariable("tPackage.tName", csp);
		var_tPackage_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_extendedJamoppPackageElement_name, var_tPackage_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("extendedJamoppJavaContainer",
				extendedJamoppJavaContainer);
		isApplicableMatch.registerObject("extendedJamoppPackageElement",
				extendedJamoppPackageElement);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject(
				"typeGraphToExtendedJamoppJavaContainer",
				typeGraphToExtendedJamoppJavaContainer);
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
			EObject extendedJamoppJavaContainer,
			EObject extendedJamoppPackageElement, EObject tPackage,
			EObject tPackageToExtendedJamoppPackageElement, EObject typeGraph,
			EObject typeGraphToExtendedJamoppJavaContainer) {
		ruleresult.registerObject("extendedJamoppJavaContainer",
				extendedJamoppJavaContainer);
		ruleresult.registerObject("extendedJamoppPackageElement",
				extendedJamoppPackageElement);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("tPackageToExtendedJamoppPackageElement",
				tPackageToExtendedJamoppPackageElement);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("typeGraphToExtendedJamoppJavaContainer",
				typeGraphToExtendedJamoppJavaContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match
				.getObject("extendedJamoppPackageElement")
				.eClass()
				.equals(ExtendedJamopp.ExtendedJamoppPackage.eINSTANCE
						.getExtendedJamoppPackageElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TPackage tPackage,
			TypeGraph typeGraph) {
		// initial bindings
		Object[] result1_black = PackageRootImpl
				.pattern_PackageRoot_10_1_blackBBBB(this, match, tPackage,
						typeGraph);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = PackageRootImpl
				.pattern_PackageRoot_10_2_bindingAndBlackFBBBB(this, match,
						tPackage, typeGraph);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (PackageRootImpl.pattern_PackageRoot_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = PackageRootImpl
					.pattern_PackageRoot_10_4_blackBBB(match, tPackage,
							typeGraph);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			PackageRootImpl.pattern_PackageRoot_10_4_greenBBBF(match, tPackage,
					typeGraph);
			// EMoflonEdge typeGraph__tPackage____packages = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = PackageRootImpl
					.pattern_PackageRoot_10_5_blackBBB(match, tPackage,
							typeGraph);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			PackageRootImpl.pattern_PackageRoot_10_5_greenBB(match, typeGraph);

			// register objects to match
			PackageRootImpl.pattern_PackageRoot_10_6_expressionBBBB(this,
					match, tPackage, typeGraph);
			return PackageRootImpl.pattern_PackageRoot_10_7_expressionF();
		} else {
			return PackageRootImpl.pattern_PackageRoot_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = PackageRootImpl
				.pattern_PackageRoot_11_1_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result1_bindingAndBlack[0];
		TPackage tPackage = (TPackage) result1_bindingAndBlack[1];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[2];
		ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer = (ExtendedJamoppJavaContainerToTypeGraph) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = PackageRootImpl
				.pattern_PackageRoot_11_1_greenBFBFB(
						extendedJamoppJavaContainer, tPackage, csp);
		ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) result1_green[1];
		ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement = (ExtendedJamoppPackageElementToTPackage) result1_green[3];

		// collect translated elements
		Object[] result2_black = PackageRootImpl
				.pattern_PackageRoot_11_2_blackBBB(
						extendedJamoppPackageElement, tPackage,
						tPackageToExtendedJamoppPackageElement);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = PackageRootImpl
				.pattern_PackageRoot_11_2_greenFBBB(
						extendedJamoppPackageElement, tPackage,
						tPackageToExtendedJamoppPackageElement);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = PackageRootImpl
				.pattern_PackageRoot_11_3_blackBBBBBBB(ruleresult,
						extendedJamoppJavaContainer,
						extendedJamoppPackageElement, tPackage,
						tPackageToExtendedJamoppPackageElement, typeGraph,
						typeGraphToExtendedJamoppJavaContainer);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		PackageRootImpl.pattern_PackageRoot_11_3_greenBBBBBBFFFFF(ruleresult,
				extendedJamoppJavaContainer, extendedJamoppPackageElement,
				tPackage, tPackageToExtendedJamoppPackageElement, typeGraph);
		// EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement = (EMoflonEdge) result3_green[6];
		// EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____roots = (EMoflonEdge) result3_green[7];
		// EMoflonEdge tPackageToExtendedJamoppPackageElement__tPackage____target = (EMoflonEdge) result3_green[8];
		// EMoflonEdge tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge typeGraph__tPackage____packages = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		PackageRootImpl.pattern_PackageRoot_11_5_expressionBBBBBBBB(this,
				ruleresult, extendedJamoppJavaContainer,
				extendedJamoppPackageElement, tPackage,
				tPackageToExtendedJamoppPackageElement, typeGraph,
				typeGraphToExtendedJamoppJavaContainer);
		return PackageRootImpl
				.pattern_PackageRoot_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = PackageRootImpl
				.pattern_PackageRoot_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PackageRootImpl
				.pattern_PackageRoot_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = PackageRootImpl
				.pattern_PackageRoot_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		TPackage tPackage = (TPackage) result2_binding[0];
		TypeGraph typeGraph = (TypeGraph) result2_binding[1];
		for (Object[] result2_black : PackageRootImpl
				.pattern_PackageRoot_12_2_blackFBBFB(tPackage, typeGraph, match)) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result2_black[0];
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer = (ExtendedJamoppJavaContainerToTypeGraph) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : PackageRootImpl
					.pattern_PackageRoot_12_3_blackBBBB(
							extendedJamoppJavaContainer, tPackage, typeGraph,
							typeGraphToExtendedJamoppJavaContainer)) {
				Object[] result3_green = PackageRootImpl
						.pattern_PackageRoot_12_3_greenBBBBFFFF(
								extendedJamoppJavaContainer, tPackage,
								typeGraph,
								typeGraphToExtendedJamoppJavaContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge typeGraph__tPackage____packages = (EMoflonEdge) result3_green[5];
				// EMoflonEdge typeGraphToExtendedJamoppJavaContainer__typeGraph____target = (EMoflonEdge) result3_green[6];
				// EMoflonEdge typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = PackageRootImpl
						.pattern_PackageRoot_12_4_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, extendedJamoppJavaContainer,
								tPackage, typeGraph,
								typeGraphToExtendedJamoppJavaContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (PackageRootImpl.pattern_PackageRoot_12_5_expressionFBB(
						this, csp)) {

					// add match to rule result
					Object[] result6_black = PackageRootImpl
							.pattern_PackageRoot_12_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					PackageRootImpl.pattern_PackageRoot_12_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return PackageRootImpl
				.pattern_PackageRoot_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TPackage tPackage,
			TypeGraph typeGraph) {
		match.registerObject("tPackage", tPackage);
		match.registerObject("typeGraph", typeGraph);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TPackage tPackage,
			TypeGraph typeGraph) {// Create CSP
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
			TPackage tPackage,
			TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tPackage_tName = CSPFactoryHelper.eINSTANCE
				.createVariable("tPackage.tName", true, csp);
		var_tPackage_tName.setValue(tPackage.getTName());
		var_tPackage_tName.setType("String");

		// Create unbound variables
		Variable var_extendedJamoppPackageElement_name = CSPFactoryHelper.eINSTANCE
				.createVariable("extendedJamoppPackageElement.name", csp);
		var_extendedJamoppPackageElement_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_extendedJamoppPackageElement_name, var_tPackage_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("extendedJamoppJavaContainer",
				extendedJamoppJavaContainer);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject(
				"typeGraphToExtendedJamoppJavaContainer",
				typeGraphToExtendedJamoppJavaContainer);
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
			EObject extendedJamoppJavaContainer,
			EObject extendedJamoppPackageElement, EObject tPackage,
			EObject tPackageToExtendedJamoppPackageElement, EObject typeGraph,
			EObject typeGraphToExtendedJamoppJavaContainer) {
		ruleresult.registerObject("extendedJamoppJavaContainer",
				extendedJamoppJavaContainer);
		ruleresult.registerObject("extendedJamoppPackageElement",
				extendedJamoppPackageElement);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("tPackageToExtendedJamoppPackageElement",
				tPackageToExtendedJamoppPackageElement);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("typeGraphToExtendedJamoppJavaContainer",
				typeGraphToExtendedJamoppJavaContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("tPackage")
				.eClass()
				.equals(TypeGraphBasic.TypeGraphBasicPackage.eINSTANCE
						.getTPackage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_22(
			EMoflonEdge _edge_extendedJamoppPackageElement) {
		// prepare return value
		Object[] result1_bindingAndBlack = PackageRootImpl
				.pattern_PackageRoot_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PackageRootImpl
				.pattern_PackageRoot_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PackageRootImpl
				.pattern_PackageRoot_20_2_blackFFB(_edge_extendedJamoppPackageElement)) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result2_black[0];
			ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) result2_black[1];
			Object[] result2_green = PackageRootImpl
					.pattern_PackageRoot_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PackageRootImpl.pattern_PackageRoot_20_3_expressionFBBBB(this,
					match, extendedJamoppJavaContainer,
					extendedJamoppPackageElement)) {
				// Ensure that the correct types of elements are matched
				if (PackageRootImpl.pattern_PackageRoot_20_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = PackageRootImpl
							.pattern_PackageRoot_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					PackageRootImpl.pattern_PackageRoot_20_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return PackageRootImpl.pattern_PackageRoot_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_23(
			EMoflonEdge _edge_roots) {
		// prepare return value
		Object[] result1_bindingAndBlack = PackageRootImpl
				.pattern_PackageRoot_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PackageRootImpl
				.pattern_PackageRoot_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PackageRootImpl
				.pattern_PackageRoot_21_2_blackFFB(_edge_roots)) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result2_black[0];
			ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) result2_black[1];
			Object[] result2_green = PackageRootImpl
					.pattern_PackageRoot_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PackageRootImpl.pattern_PackageRoot_21_3_expressionFBBBB(this,
					match, extendedJamoppJavaContainer,
					extendedJamoppPackageElement)) {
				// Ensure that the correct types of elements are matched
				if (PackageRootImpl.pattern_PackageRoot_21_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = PackageRootImpl
							.pattern_PackageRoot_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					PackageRootImpl.pattern_PackageRoot_21_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return PackageRootImpl.pattern_PackageRoot_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_33(
			EMoflonEdge _edge_packages) {
		// prepare return value
		Object[] result1_bindingAndBlack = PackageRootImpl
				.pattern_PackageRoot_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PackageRootImpl
				.pattern_PackageRoot_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PackageRootImpl
				.pattern_PackageRoot_22_2_blackFFB(_edge_packages)) {
			TPackage tPackage = (TPackage) result2_black[0];
			TypeGraph typeGraph = (TypeGraph) result2_black[1];
			Object[] result2_green = PackageRootImpl
					.pattern_PackageRoot_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PackageRootImpl.pattern_PackageRoot_22_3_expressionFBBBB(this,
					match, tPackage, typeGraph)) {
				// Ensure that the correct types of elements are matched
				if (PackageRootImpl.pattern_PackageRoot_22_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = PackageRootImpl
							.pattern_PackageRoot_22_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					PackageRootImpl.pattern_PackageRoot_22_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return PackageRootImpl.pattern_PackageRoot_22_6_expressionFB(__result);
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
		case RulesPackage.PACKAGE_ROOT___IS_APPROPRIATE_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT:
			return isAppropriate_FWD((Match) arguments.get(0),
					(ExtendedJamoppJavaContainer) arguments.get(1),
					(ExtendedJamoppPackageElement) arguments.get(2));
		case RulesPackage.PACKAGE_ROOT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PACKAGE_ROOT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PACKAGE_ROOT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(ExtendedJamoppJavaContainer) arguments.get(1),
					(ExtendedJamoppPackageElement) arguments.get(2));
			return null;
		case RulesPackage.PACKAGE_ROOT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(ExtendedJamoppJavaContainer) arguments.get(1),
					(ExtendedJamoppPackageElement) arguments.get(2));
		case RulesPackage.PACKAGE_ROOT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PACKAGE_ROOT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT_TYPEGRAPH_EXTENDEDJAMOPPJAVACONTAINERTOTYPEGRAPH:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedJamoppJavaContainer) arguments.get(1),
					(ExtendedJamoppPackageElement) arguments.get(2),
					(TypeGraph) arguments.get(3),
					(ExtendedJamoppJavaContainerToTypeGraph) arguments.get(4));
		case RulesPackage.PACKAGE_ROOT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PACKAGE_ROOT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.PACKAGE_ROOT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PACKAGE_ROOT___IS_APPROPRIATE_BWD__MATCH_TPACKAGE_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TPackage) arguments.get(1), (TypeGraph) arguments.get(2));
		case RulesPackage.PACKAGE_ROOT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PACKAGE_ROOT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PACKAGE_ROOT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPACKAGE_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TPackage) arguments.get(1), (TypeGraph) arguments.get(2));
			return null;
		case RulesPackage.PACKAGE_ROOT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPACKAGE_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TPackage) arguments.get(1), (TypeGraph) arguments.get(2));
		case RulesPackage.PACKAGE_ROOT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PACKAGE_ROOT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXTENDEDJAMOPPJAVACONTAINER_TPACKAGE_TYPEGRAPH_EXTENDEDJAMOPPJAVACONTAINERTOTYPEGRAPH:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedJamoppJavaContainer) arguments.get(1),
					(TPackage) arguments.get(2), (TypeGraph) arguments.get(3),
					(ExtendedJamoppJavaContainerToTypeGraph) arguments.get(4));
		case RulesPackage.PACKAGE_ROOT___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PACKAGE_ROOT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.PACKAGE_ROOT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PACKAGE_ROOT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_22__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_22((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PACKAGE_ROOT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_23__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_23((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PACKAGE_ROOT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_33__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_33((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PACKAGE_ROOT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PACKAGE_ROOT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_PackageRoot_0_1_blackBBBB(
			PackageRoot _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement) {
		return new Object[] { _this, match, extendedJamoppJavaContainer,
				extendedJamoppPackageElement };
	}

	public static final Object[] pattern_PackageRoot_0_2_bindingFBBBB(
			PackageRoot _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				extendedJamoppJavaContainer, extendedJamoppPackageElement);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match,
					extendedJamoppJavaContainer, extendedJamoppPackageElement };
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PackageRoot_0_2_bindingAndBlackFBBBB(
			PackageRoot _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement) {
		Object[] result_pattern_PackageRoot_0_2_binding = pattern_PackageRoot_0_2_bindingFBBBB(
				_this, match, extendedJamoppJavaContainer,
				extendedJamoppPackageElement);
		if (result_pattern_PackageRoot_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_PackageRoot_0_2_binding[0];

			Object[] result_pattern_PackageRoot_0_2_black = pattern_PackageRoot_0_2_blackB(csp);
			if (result_pattern_PackageRoot_0_2_black != null) {

				return new Object[] { csp, _this, match,
						extendedJamoppJavaContainer,
						extendedJamoppPackageElement };
			}
		}
		return null;
	}

	public static final boolean pattern_PackageRoot_0_3_expressionFBB(
			PackageRoot _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageRoot_0_4_blackBBB(Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement) {
		return new Object[] { match, extendedJamoppJavaContainer,
				extendedJamoppPackageElement };
	}

	public static final Object[] pattern_PackageRoot_0_4_greenBBBFF(
			Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement) {
		EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____roots = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(extendedJamoppPackageElement);
		String extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement_name_prime = "extendedJamoppPackageElement";
		String extendedJamoppJavaContainer__extendedJamoppPackageElement____roots_name_prime = "roots";
		extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement
				.setSrc(extendedJamoppJavaContainer);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement
				.setTrg(extendedJamoppPackageElement);
		match.getToBeTranslatedEdges()
				.add(extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____roots
				.setSrc(extendedJamoppJavaContainer);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____roots
				.setTrg(extendedJamoppPackageElement);
		match.getToBeTranslatedEdges()
				.add(extendedJamoppJavaContainer__extendedJamoppPackageElement____roots);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement
				.setName(extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement_name_prime);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____roots
				.setName(extendedJamoppJavaContainer__extendedJamoppPackageElement____roots_name_prime);
		return new Object[] {
				match,
				extendedJamoppJavaContainer,
				extendedJamoppPackageElement,
				extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement,
				extendedJamoppJavaContainer__extendedJamoppPackageElement____roots };
	}

	public static final Object[] pattern_PackageRoot_0_5_blackBBB(Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement) {
		return new Object[] { match, extendedJamoppJavaContainer,
				extendedJamoppPackageElement };
	}

	public static final Object[] pattern_PackageRoot_0_5_greenBB(Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		match.getContextNodes().add(extendedJamoppJavaContainer);
		return new Object[] { match, extendedJamoppJavaContainer };
	}

	public static final void pattern_PackageRoot_0_6_expressionBBBB(
			PackageRoot _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement) {
		_this.registerObjectsToMatch_FWD(match, extendedJamoppJavaContainer,
				extendedJamoppPackageElement);

	}

	public static final boolean pattern_PackageRoot_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PackageRoot_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_PackageRoot_1_1_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("extendedJamoppJavaContainer");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("extendedJamoppPackageElement");
		EObject _localVariable_2 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("typeGraphToExtendedJamoppJavaContainer");
		EObject tmpExtendedJamoppJavaContainer = _localVariable_0;
		EObject tmpExtendedJamoppPackageElement = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpTypeGraphToExtendedJamoppJavaContainer = _localVariable_3;
		if (tmpExtendedJamoppJavaContainer instanceof ExtendedJamoppJavaContainer) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) tmpExtendedJamoppJavaContainer;
			if (tmpExtendedJamoppPackageElement instanceof ExtendedJamoppPackageElement) {
				ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) tmpExtendedJamoppPackageElement;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					if (tmpTypeGraphToExtendedJamoppJavaContainer instanceof ExtendedJamoppJavaContainerToTypeGraph) {
						ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer = (ExtendedJamoppJavaContainerToTypeGraph) tmpTypeGraphToExtendedJamoppJavaContainer;
						return new Object[] { extendedJamoppJavaContainer,
								extendedJamoppPackageElement, typeGraph,
								typeGraphToExtendedJamoppJavaContainer,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_1_1_blackBBBBFBB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer,
			PackageRoot _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { extendedJamoppJavaContainer,
						extendedJamoppPackageElement, typeGraph,
						typeGraphToExtendedJamoppJavaContainer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_1_1_bindingAndBlackFFFFFBB(
			PackageRoot _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PackageRoot_1_1_binding = pattern_PackageRoot_1_1_bindingFFFFB(isApplicableMatch);
		if (result_pattern_PackageRoot_1_1_binding != null) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result_pattern_PackageRoot_1_1_binding[0];
			ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) result_pattern_PackageRoot_1_1_binding[1];
			TypeGraph typeGraph = (TypeGraph) result_pattern_PackageRoot_1_1_binding[2];
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer = (ExtendedJamoppJavaContainerToTypeGraph) result_pattern_PackageRoot_1_1_binding[3];

			Object[] result_pattern_PackageRoot_1_1_black = pattern_PackageRoot_1_1_blackBBBBFBB(
					extendedJamoppJavaContainer, extendedJamoppPackageElement,
					typeGraph, typeGraphToExtendedJamoppJavaContainer, _this,
					isApplicableMatch);
			if (result_pattern_PackageRoot_1_1_black != null) {
				CSP csp = (CSP) result_pattern_PackageRoot_1_1_black[4];

				return new Object[] { extendedJamoppJavaContainer,
						extendedJamoppPackageElement, typeGraph,
						typeGraphToExtendedJamoppJavaContainer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_1_1_greenBFFBB(
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			TypeGraph typeGraph, CSP csp) {
		TPackage tPackage = TypeGraphBasicFactory.eINSTANCE.createTPackage();
		ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement = GravityTGGFactory.eINSTANCE
				.createExtendedJamoppPackageElementToTPackage();
		Object _localVariable_0 = csp.getValue("tPackage", "tName");
		typeGraph.getPackages().add(tPackage);
		tPackageToExtendedJamoppPackageElement.setTarget(tPackage);
		tPackageToExtendedJamoppPackageElement
				.setSource(extendedJamoppPackageElement);
		String tPackage_tName_prime = (String) _localVariable_0;
		tPackage.setTName(tPackage_tName_prime);
		return new Object[] { extendedJamoppPackageElement, tPackage,
				tPackageToExtendedJamoppPackageElement, typeGraph, csp };
	}

	public static final Object[] pattern_PackageRoot_1_2_blackBBB(
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			TPackage tPackage,
			ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement) {
		return new Object[] { extendedJamoppPackageElement, tPackage,
				tPackageToExtendedJamoppPackageElement };
	}

	public static final Object[] pattern_PackageRoot_1_2_greenFBBB(
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			TPackage tPackage,
			ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(extendedJamoppPackageElement);
		ruleresult.getCreatedElements().add(tPackage);
		ruleresult.getCreatedLinkElements().add(
				tPackageToExtendedJamoppPackageElement);
		return new Object[] { ruleresult, extendedJamoppPackageElement,
				tPackage, tPackageToExtendedJamoppPackageElement };
	}

	public static final Object[] pattern_PackageRoot_1_3_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject extendedJamoppJavaContainer,
			EObject extendedJamoppPackageElement, EObject tPackage,
			EObject tPackageToExtendedJamoppPackageElement, EObject typeGraph,
			EObject typeGraphToExtendedJamoppJavaContainer) {
		if (!extendedJamoppJavaContainer.equals(extendedJamoppPackageElement)) {
			if (!extendedJamoppJavaContainer.equals(tPackage)) {
				if (!extendedJamoppJavaContainer
						.equals(tPackageToExtendedJamoppPackageElement)) {
					if (!extendedJamoppJavaContainer.equals(typeGraph)) {
						if (!extendedJamoppJavaContainer
								.equals(typeGraphToExtendedJamoppJavaContainer)) {
							if (!extendedJamoppPackageElement.equals(tPackage)) {
								if (!extendedJamoppPackageElement
										.equals(tPackageToExtendedJamoppPackageElement)) {
									if (!extendedJamoppPackageElement
											.equals(typeGraph)) {
										if (!extendedJamoppPackageElement
												.equals(typeGraphToExtendedJamoppJavaContainer)) {
											if (!tPackage
													.equals(tPackageToExtendedJamoppPackageElement)) {
												if (!tPackage.equals(typeGraph)) {
													if (!tPackage
															.equals(typeGraphToExtendedJamoppJavaContainer)) {
														if (!tPackageToExtendedJamoppPackageElement
																.equals(typeGraph)) {
															if (!tPackageToExtendedJamoppPackageElement
																	.equals(typeGraphToExtendedJamoppJavaContainer)) {
																if (!typeGraph
																		.equals(typeGraphToExtendedJamoppJavaContainer)) {
																	return new Object[] {
																			ruleresult,
																			extendedJamoppJavaContainer,
																			extendedJamoppPackageElement,
																			tPackage,
																			tPackageToExtendedJamoppPackageElement,
																			typeGraph,
																			typeGraphToExtendedJamoppJavaContainer };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_PackageRoot_1_3_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject extendedJamoppJavaContainer,
			EObject extendedJamoppPackageElement, EObject tPackage,
			EObject tPackageToExtendedJamoppPackageElement, EObject typeGraph) {
		EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____roots = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tPackageToExtendedJamoppPackageElement__tPackage____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge typeGraph__tPackage____packages = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PackageRoot";
		String extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement_name_prime = "extendedJamoppPackageElement";
		String extendedJamoppJavaContainer__extendedJamoppPackageElement____roots_name_prime = "roots";
		String tPackageToExtendedJamoppPackageElement__tPackage____target_name_prime = "target";
		String tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source_name_prime = "source";
		String typeGraph__tPackage____packages_name_prime = "packages";
		extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement
				.setSrc(extendedJamoppJavaContainer);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement
				.setTrg(extendedJamoppPackageElement);
		ruleresult
				.getTranslatedEdges()
				.add(extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____roots
				.setSrc(extendedJamoppJavaContainer);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____roots
				.setTrg(extendedJamoppPackageElement);
		ruleresult
				.getTranslatedEdges()
				.add(extendedJamoppJavaContainer__extendedJamoppPackageElement____roots);
		tPackageToExtendedJamoppPackageElement__tPackage____target
				.setSrc(tPackageToExtendedJamoppPackageElement);
		tPackageToExtendedJamoppPackageElement__tPackage____target
				.setTrg(tPackage);
		ruleresult.getCreatedEdges().add(
				tPackageToExtendedJamoppPackageElement__tPackage____target);
		tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source
				.setSrc(tPackageToExtendedJamoppPackageElement);
		tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source
				.setTrg(extendedJamoppPackageElement);
		ruleresult
				.getCreatedEdges()
				.add(tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source);
		typeGraph__tPackage____packages.setSrc(typeGraph);
		typeGraph__tPackage____packages.setTrg(tPackage);
		ruleresult.getCreatedEdges().add(typeGraph__tPackage____packages);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement
				.setName(extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement_name_prime);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____roots
				.setName(extendedJamoppJavaContainer__extendedJamoppPackageElement____roots_name_prime);
		tPackageToExtendedJamoppPackageElement__tPackage____target
				.setName(tPackageToExtendedJamoppPackageElement__tPackage____target_name_prime);
		tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source
				.setName(tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source_name_prime);
		typeGraph__tPackage____packages
				.setName(typeGraph__tPackage____packages_name_prime);
		return new Object[] {
				ruleresult,
				extendedJamoppJavaContainer,
				extendedJamoppPackageElement,
				tPackage,
				tPackageToExtendedJamoppPackageElement,
				typeGraph,
				extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement,
				extendedJamoppJavaContainer__extendedJamoppPackageElement____roots,
				tPackageToExtendedJamoppPackageElement__tPackage____target,
				tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source,
				typeGraph__tPackage____packages };
	}

	public static final void pattern_PackageRoot_1_5_expressionBBBBBBBB(
			PackageRoot _this, PerformRuleResult ruleresult,
			EObject extendedJamoppJavaContainer,
			EObject extendedJamoppPackageElement, EObject tPackage,
			EObject tPackageToExtendedJamoppPackageElement, EObject typeGraph,
			EObject typeGraphToExtendedJamoppJavaContainer) {
		_this.registerObjects_FWD(ruleresult, extendedJamoppJavaContainer,
				extendedJamoppPackageElement, tPackage,
				tPackageToExtendedJamoppPackageElement, typeGraph,
				typeGraphToExtendedJamoppJavaContainer);

	}

	public static final PerformRuleResult pattern_PackageRoot_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PackageRoot_2_1_bindingFB(
			PackageRoot _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_2_1_blackFBB(
			EClass eClass, PackageRoot _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_2_1_bindingAndBlackFFB(
			PackageRoot _this) {
		Object[] result_pattern_PackageRoot_2_1_binding = pattern_PackageRoot_2_1_bindingFB(_this);
		if (result_pattern_PackageRoot_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_PackageRoot_2_1_binding[0];

			Object[] result_pattern_PackageRoot_2_1_black = pattern_PackageRoot_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_PackageRoot_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PackageRoot_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "PackageRoot";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PackageRoot_2_2_bindingFFB(Match match) {
		EObject _localVariable_0 = match
				.getObject("extendedJamoppJavaContainer");
		EObject _localVariable_1 = match
				.getObject("extendedJamoppPackageElement");
		EObject tmpExtendedJamoppJavaContainer = _localVariable_0;
		EObject tmpExtendedJamoppPackageElement = _localVariable_1;
		if (tmpExtendedJamoppJavaContainer instanceof ExtendedJamoppJavaContainer) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) tmpExtendedJamoppJavaContainer;
			if (tmpExtendedJamoppPackageElement instanceof ExtendedJamoppPackageElement) {
				ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) tmpExtendedJamoppPackageElement;
				return new Object[] { extendedJamoppJavaContainer,
						extendedJamoppPackageElement, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PackageRoot_2_2_blackBBFFB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(extendedJamoppJavaContainer,
						ExtendedJamoppJavaContainerToTypeGraph.class, "source")) {
			TypeGraph typeGraph = typeGraphToExtendedJamoppJavaContainer
					.getTarget();
			if (typeGraph != null) {
				_result.add(new Object[] { extendedJamoppJavaContainer,
						extendedJamoppPackageElement, typeGraph,
						typeGraphToExtendedJamoppJavaContainer, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_PackageRoot_2_3_blackBBBB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (extendedJamoppJavaContainer.getExtendedJamoppPackageElement()
				.contains(extendedJamoppPackageElement)) {
			if (extendedJamoppJavaContainer.getRoots().contains(
					extendedJamoppPackageElement)) {
				if (typeGraph.equals(typeGraphToExtendedJamoppJavaContainer
						.getTarget())) {
					if (extendedJamoppJavaContainer
							.equals(typeGraphToExtendedJamoppJavaContainer
									.getSource())) {
						_result.add(new Object[] { extendedJamoppJavaContainer,
								extendedJamoppPackageElement, typeGraph,
								typeGraphToExtendedJamoppJavaContainer });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PackageRoot_2_3_greenBBBBFFFFF(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____roots = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge typeGraphToExtendedJamoppJavaContainer__typeGraph____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement_name_prime = "extendedJamoppPackageElement";
		String extendedJamoppJavaContainer__extendedJamoppPackageElement____roots_name_prime = "roots";
		String typeGraphToExtendedJamoppJavaContainer__typeGraph____target_name_prime = "target";
		String typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(
				extendedJamoppJavaContainer);
		isApplicableMatch.getAllContextElements().add(
				extendedJamoppPackageElement);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(
				typeGraphToExtendedJamoppJavaContainer);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement
				.setSrc(extendedJamoppJavaContainer);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement
				.setTrg(extendedJamoppPackageElement);
		isApplicableMatch
				.getAllContextElements()
				.add(extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____roots
				.setSrc(extendedJamoppJavaContainer);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____roots
				.setTrg(extendedJamoppPackageElement);
		isApplicableMatch
				.getAllContextElements()
				.add(extendedJamoppJavaContainer__extendedJamoppPackageElement____roots);
		typeGraphToExtendedJamoppJavaContainer__typeGraph____target
				.setSrc(typeGraphToExtendedJamoppJavaContainer);
		typeGraphToExtendedJamoppJavaContainer__typeGraph____target
				.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(
				typeGraphToExtendedJamoppJavaContainer__typeGraph____target);
		typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source
				.setSrc(typeGraphToExtendedJamoppJavaContainer);
		typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source
				.setTrg(extendedJamoppJavaContainer);
		isApplicableMatch
				.getAllContextElements()
				.add(typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement
				.setName(extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement_name_prime);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____roots
				.setName(extendedJamoppJavaContainer__extendedJamoppPackageElement____roots_name_prime);
		typeGraphToExtendedJamoppJavaContainer__typeGraph____target
				.setName(typeGraphToExtendedJamoppJavaContainer__typeGraph____target_name_prime);
		typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source
				.setName(typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source_name_prime);
		return new Object[] {
				extendedJamoppJavaContainer,
				extendedJamoppPackageElement,
				typeGraph,
				typeGraphToExtendedJamoppJavaContainer,
				isApplicableMatch,
				extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement,
				extendedJamoppJavaContainer__extendedJamoppPackageElement____roots,
				typeGraphToExtendedJamoppJavaContainer__typeGraph____target,
				typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source };
	}

	public static final Object[] pattern_PackageRoot_2_4_bindingFBBBBBB(
			PackageRoot _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, extendedJamoppJavaContainer,
				extendedJamoppPackageElement, typeGraph,
				typeGraphToExtendedJamoppJavaContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					extendedJamoppJavaContainer, extendedJamoppPackageElement,
					typeGraph, typeGraphToExtendedJamoppJavaContainer };
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PackageRoot_2_4_bindingAndBlackFBBBBBB(
			PackageRoot _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer) {
		Object[] result_pattern_PackageRoot_2_4_binding = pattern_PackageRoot_2_4_bindingFBBBBBB(
				_this, isApplicableMatch, extendedJamoppJavaContainer,
				extendedJamoppPackageElement, typeGraph,
				typeGraphToExtendedJamoppJavaContainer);
		if (result_pattern_PackageRoot_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_PackageRoot_2_4_binding[0];

			Object[] result_pattern_PackageRoot_2_4_black = pattern_PackageRoot_2_4_blackB(csp);
			if (result_pattern_PackageRoot_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						extendedJamoppJavaContainer,
						extendedJamoppPackageElement, typeGraph,
						typeGraphToExtendedJamoppJavaContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_PackageRoot_2_5_expressionFBB(
			PackageRoot _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageRoot_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PackageRoot_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PackageRoot";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PackageRoot_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PackageRoot_10_1_blackBBBB(
			PackageRoot _this, Match match, TPackage tPackage,
			TypeGraph typeGraph) {
		return new Object[] { _this, match, tPackage, typeGraph };
	}

	public static final Object[] pattern_PackageRoot_10_2_bindingFBBBB(
			PackageRoot _this, Match match, TPackage tPackage,
			TypeGraph typeGraph) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				tPackage, typeGraph);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tPackage, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PackageRoot_10_2_bindingAndBlackFBBBB(
			PackageRoot _this, Match match, TPackage tPackage,
			TypeGraph typeGraph) {
		Object[] result_pattern_PackageRoot_10_2_binding = pattern_PackageRoot_10_2_bindingFBBBB(
				_this, match, tPackage, typeGraph);
		if (result_pattern_PackageRoot_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_PackageRoot_10_2_binding[0];

			Object[] result_pattern_PackageRoot_10_2_black = pattern_PackageRoot_10_2_blackB(csp);
			if (result_pattern_PackageRoot_10_2_black != null) {

				return new Object[] { csp, _this, match, tPackage, typeGraph };
			}
		}
		return null;
	}

	public static final boolean pattern_PackageRoot_10_3_expressionFBB(
			PackageRoot _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageRoot_10_4_blackBBB(Match match,
			TPackage tPackage, TypeGraph typeGraph) {
		return new Object[] { match, tPackage, typeGraph };
	}

	public static final Object[] pattern_PackageRoot_10_4_greenBBBF(
			Match match, TPackage tPackage, TypeGraph typeGraph) {
		EMoflonEdge typeGraph__tPackage____packages = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tPackage);
		String typeGraph__tPackage____packages_name_prime = "packages";
		typeGraph__tPackage____packages.setSrc(typeGraph);
		typeGraph__tPackage____packages.setTrg(tPackage);
		match.getToBeTranslatedEdges().add(typeGraph__tPackage____packages);
		typeGraph__tPackage____packages
				.setName(typeGraph__tPackage____packages_name_prime);
		return new Object[] { match, tPackage, typeGraph,
				typeGraph__tPackage____packages };
	}

	public static final Object[] pattern_PackageRoot_10_5_blackBBB(Match match,
			TPackage tPackage, TypeGraph typeGraph) {
		return new Object[] { match, tPackage, typeGraph };
	}

	public static final Object[] pattern_PackageRoot_10_5_greenBB(Match match,
			TypeGraph typeGraph) {
		match.getContextNodes().add(typeGraph);
		return new Object[] { match, typeGraph };
	}

	public static final void pattern_PackageRoot_10_6_expressionBBBB(
			PackageRoot _this, Match match, TPackage tPackage,
			TypeGraph typeGraph) {
		_this.registerObjectsToMatch_BWD(match, tPackage, typeGraph);

	}

	public static final boolean pattern_PackageRoot_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PackageRoot_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_PackageRoot_11_1_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("extendedJamoppJavaContainer");
		EObject _localVariable_1 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_2 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("typeGraphToExtendedJamoppJavaContainer");
		EObject tmpExtendedJamoppJavaContainer = _localVariable_0;
		EObject tmpTPackage = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpTypeGraphToExtendedJamoppJavaContainer = _localVariable_3;
		if (tmpExtendedJamoppJavaContainer instanceof ExtendedJamoppJavaContainer) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) tmpExtendedJamoppJavaContainer;
			if (tmpTPackage instanceof TPackage) {
				TPackage tPackage = (TPackage) tmpTPackage;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					if (tmpTypeGraphToExtendedJamoppJavaContainer instanceof ExtendedJamoppJavaContainerToTypeGraph) {
						ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer = (ExtendedJamoppJavaContainerToTypeGraph) tmpTypeGraphToExtendedJamoppJavaContainer;
						return new Object[] { extendedJamoppJavaContainer,
								tPackage, typeGraph,
								typeGraphToExtendedJamoppJavaContainer,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_11_1_blackBBBBFBB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TPackage tPackage,
			TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer,
			PackageRoot _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { extendedJamoppJavaContainer, tPackage,
						typeGraph, typeGraphToExtendedJamoppJavaContainer, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_11_1_bindingAndBlackFFFFFBB(
			PackageRoot _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PackageRoot_11_1_binding = pattern_PackageRoot_11_1_bindingFFFFB(isApplicableMatch);
		if (result_pattern_PackageRoot_11_1_binding != null) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result_pattern_PackageRoot_11_1_binding[0];
			TPackage tPackage = (TPackage) result_pattern_PackageRoot_11_1_binding[1];
			TypeGraph typeGraph = (TypeGraph) result_pattern_PackageRoot_11_1_binding[2];
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer = (ExtendedJamoppJavaContainerToTypeGraph) result_pattern_PackageRoot_11_1_binding[3];

			Object[] result_pattern_PackageRoot_11_1_black = pattern_PackageRoot_11_1_blackBBBBFBB(
					extendedJamoppJavaContainer, tPackage, typeGraph,
					typeGraphToExtendedJamoppJavaContainer, _this,
					isApplicableMatch);
			if (result_pattern_PackageRoot_11_1_black != null) {
				CSP csp = (CSP) result_pattern_PackageRoot_11_1_black[4];

				return new Object[] { extendedJamoppJavaContainer, tPackage,
						typeGraph, typeGraphToExtendedJamoppJavaContainer, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_11_1_greenBFBFB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TPackage tPackage, CSP csp) {
		ExtendedJamoppPackageElement extendedJamoppPackageElement = ExtendedJamoppFactory.eINSTANCE
				.createExtendedJamoppPackageElement();
		ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement = GravityTGGFactory.eINSTANCE
				.createExtendedJamoppPackageElementToTPackage();
		Object _localVariable_0 = csp.getValue("extendedJamoppPackageElement",
				"name");
		extendedJamoppJavaContainer.getExtendedJamoppPackageElement().add(
				extendedJamoppPackageElement);
		extendedJamoppJavaContainer.getRoots()
				.add(extendedJamoppPackageElement);
		tPackageToExtendedJamoppPackageElement.setTarget(tPackage);
		tPackageToExtendedJamoppPackageElement
				.setSource(extendedJamoppPackageElement);
		String extendedJamoppPackageElement_name_prime = (String) _localVariable_0;
		extendedJamoppPackageElement
				.setName(extendedJamoppPackageElement_name_prime);
		return new Object[] { extendedJamoppJavaContainer,
				extendedJamoppPackageElement, tPackage,
				tPackageToExtendedJamoppPackageElement, csp };
	}

	public static final Object[] pattern_PackageRoot_11_2_blackBBB(
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			TPackage tPackage,
			ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement) {
		return new Object[] { extendedJamoppPackageElement, tPackage,
				tPackageToExtendedJamoppPackageElement };
	}

	public static final Object[] pattern_PackageRoot_11_2_greenFBBB(
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			TPackage tPackage,
			ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(extendedJamoppPackageElement);
		ruleresult.getTranslatedElements().add(tPackage);
		ruleresult.getCreatedLinkElements().add(
				tPackageToExtendedJamoppPackageElement);
		return new Object[] { ruleresult, extendedJamoppPackageElement,
				tPackage, tPackageToExtendedJamoppPackageElement };
	}

	public static final Object[] pattern_PackageRoot_11_3_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject extendedJamoppJavaContainer,
			EObject extendedJamoppPackageElement, EObject tPackage,
			EObject tPackageToExtendedJamoppPackageElement, EObject typeGraph,
			EObject typeGraphToExtendedJamoppJavaContainer) {
		if (!extendedJamoppJavaContainer.equals(extendedJamoppPackageElement)) {
			if (!extendedJamoppJavaContainer.equals(tPackage)) {
				if (!extendedJamoppJavaContainer
						.equals(tPackageToExtendedJamoppPackageElement)) {
					if (!extendedJamoppJavaContainer.equals(typeGraph)) {
						if (!extendedJamoppJavaContainer
								.equals(typeGraphToExtendedJamoppJavaContainer)) {
							if (!extendedJamoppPackageElement.equals(tPackage)) {
								if (!extendedJamoppPackageElement
										.equals(tPackageToExtendedJamoppPackageElement)) {
									if (!extendedJamoppPackageElement
											.equals(typeGraph)) {
										if (!extendedJamoppPackageElement
												.equals(typeGraphToExtendedJamoppJavaContainer)) {
											if (!tPackage
													.equals(tPackageToExtendedJamoppPackageElement)) {
												if (!tPackage.equals(typeGraph)) {
													if (!tPackage
															.equals(typeGraphToExtendedJamoppJavaContainer)) {
														if (!tPackageToExtendedJamoppPackageElement
																.equals(typeGraph)) {
															if (!tPackageToExtendedJamoppPackageElement
																	.equals(typeGraphToExtendedJamoppJavaContainer)) {
																if (!typeGraph
																		.equals(typeGraphToExtendedJamoppJavaContainer)) {
																	return new Object[] {
																			ruleresult,
																			extendedJamoppJavaContainer,
																			extendedJamoppPackageElement,
																			tPackage,
																			tPackageToExtendedJamoppPackageElement,
																			typeGraph,
																			typeGraphToExtendedJamoppJavaContainer };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_PackageRoot_11_3_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject extendedJamoppJavaContainer,
			EObject extendedJamoppPackageElement, EObject tPackage,
			EObject tPackageToExtendedJamoppPackageElement, EObject typeGraph) {
		EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____roots = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tPackageToExtendedJamoppPackageElement__tPackage____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge typeGraph__tPackage____packages = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PackageRoot";
		String extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement_name_prime = "extendedJamoppPackageElement";
		String extendedJamoppJavaContainer__extendedJamoppPackageElement____roots_name_prime = "roots";
		String tPackageToExtendedJamoppPackageElement__tPackage____target_name_prime = "target";
		String tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source_name_prime = "source";
		String typeGraph__tPackage____packages_name_prime = "packages";
		extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement
				.setSrc(extendedJamoppJavaContainer);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement
				.setTrg(extendedJamoppPackageElement);
		ruleresult
				.getCreatedEdges()
				.add(extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____roots
				.setSrc(extendedJamoppJavaContainer);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____roots
				.setTrg(extendedJamoppPackageElement);
		ruleresult
				.getCreatedEdges()
				.add(extendedJamoppJavaContainer__extendedJamoppPackageElement____roots);
		tPackageToExtendedJamoppPackageElement__tPackage____target
				.setSrc(tPackageToExtendedJamoppPackageElement);
		tPackageToExtendedJamoppPackageElement__tPackage____target
				.setTrg(tPackage);
		ruleresult.getCreatedEdges().add(
				tPackageToExtendedJamoppPackageElement__tPackage____target);
		tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source
				.setSrc(tPackageToExtendedJamoppPackageElement);
		tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source
				.setTrg(extendedJamoppPackageElement);
		ruleresult
				.getCreatedEdges()
				.add(tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source);
		typeGraph__tPackage____packages.setSrc(typeGraph);
		typeGraph__tPackage____packages.setTrg(tPackage);
		ruleresult.getTranslatedEdges().add(typeGraph__tPackage____packages);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement
				.setName(extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement_name_prime);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____roots
				.setName(extendedJamoppJavaContainer__extendedJamoppPackageElement____roots_name_prime);
		tPackageToExtendedJamoppPackageElement__tPackage____target
				.setName(tPackageToExtendedJamoppPackageElement__tPackage____target_name_prime);
		tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source
				.setName(tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source_name_prime);
		typeGraph__tPackage____packages
				.setName(typeGraph__tPackage____packages_name_prime);
		return new Object[] {
				ruleresult,
				extendedJamoppJavaContainer,
				extendedJamoppPackageElement,
				tPackage,
				tPackageToExtendedJamoppPackageElement,
				typeGraph,
				extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement,
				extendedJamoppJavaContainer__extendedJamoppPackageElement____roots,
				tPackageToExtendedJamoppPackageElement__tPackage____target,
				tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source,
				typeGraph__tPackage____packages };
	}

	public static final void pattern_PackageRoot_11_5_expressionBBBBBBBB(
			PackageRoot _this, PerformRuleResult ruleresult,
			EObject extendedJamoppJavaContainer,
			EObject extendedJamoppPackageElement, EObject tPackage,
			EObject tPackageToExtendedJamoppPackageElement, EObject typeGraph,
			EObject typeGraphToExtendedJamoppJavaContainer) {
		_this.registerObjects_BWD(ruleresult, extendedJamoppJavaContainer,
				extendedJamoppPackageElement, tPackage,
				tPackageToExtendedJamoppPackageElement, typeGraph,
				typeGraphToExtendedJamoppJavaContainer);

	}

	public static final PerformRuleResult pattern_PackageRoot_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PackageRoot_12_1_bindingFB(
			PackageRoot _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_12_1_blackFBB(
			EClass eClass, PackageRoot _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_12_1_bindingAndBlackFFB(
			PackageRoot _this) {
		Object[] result_pattern_PackageRoot_12_1_binding = pattern_PackageRoot_12_1_bindingFB(_this);
		if (result_pattern_PackageRoot_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_PackageRoot_12_1_binding[0];

			Object[] result_pattern_PackageRoot_12_1_black = pattern_PackageRoot_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_PackageRoot_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PackageRoot_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "PackageRoot";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PackageRoot_12_2_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tPackage");
		EObject _localVariable_1 = match.getObject("typeGraph");
		EObject tmpTPackage = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		if (tmpTPackage instanceof TPackage) {
			TPackage tPackage = (TPackage) tmpTPackage;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				return new Object[] { tPackage, typeGraph, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PackageRoot_12_2_blackFBBFB(
			TPackage tPackage, TypeGraph typeGraph, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeGraph,
						ExtendedJamoppJavaContainerToTypeGraph.class, "target")) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = typeGraphToExtendedJamoppJavaContainer
					.getSource();
			if (extendedJamoppJavaContainer != null) {
				_result.add(new Object[] { extendedJamoppJavaContainer,
						tPackage, typeGraph,
						typeGraphToExtendedJamoppJavaContainer, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_PackageRoot_12_3_blackBBBB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TPackage tPackage,
			TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (typeGraph.getPackages().contains(tPackage)) {
			if (typeGraph.equals(typeGraphToExtendedJamoppJavaContainer
					.getTarget())) {
				if (extendedJamoppJavaContainer
						.equals(typeGraphToExtendedJamoppJavaContainer
								.getSource())) {
					_result.add(new Object[] { extendedJamoppJavaContainer,
							tPackage, typeGraph,
							typeGraphToExtendedJamoppJavaContainer });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PackageRoot_12_3_greenBBBBFFFF(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TPackage tPackage,
			TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge typeGraph__tPackage____packages = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge typeGraphToExtendedJamoppJavaContainer__typeGraph____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String typeGraph__tPackage____packages_name_prime = "packages";
		String typeGraphToExtendedJamoppJavaContainer__typeGraph____target_name_prime = "target";
		String typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(
				extendedJamoppJavaContainer);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(
				typeGraphToExtendedJamoppJavaContainer);
		typeGraph__tPackage____packages.setSrc(typeGraph);
		typeGraph__tPackage____packages.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(
				typeGraph__tPackage____packages);
		typeGraphToExtendedJamoppJavaContainer__typeGraph____target
				.setSrc(typeGraphToExtendedJamoppJavaContainer);
		typeGraphToExtendedJamoppJavaContainer__typeGraph____target
				.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(
				typeGraphToExtendedJamoppJavaContainer__typeGraph____target);
		typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source
				.setSrc(typeGraphToExtendedJamoppJavaContainer);
		typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source
				.setTrg(extendedJamoppJavaContainer);
		isApplicableMatch
				.getAllContextElements()
				.add(typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source);
		typeGraph__tPackage____packages
				.setName(typeGraph__tPackage____packages_name_prime);
		typeGraphToExtendedJamoppJavaContainer__typeGraph____target
				.setName(typeGraphToExtendedJamoppJavaContainer__typeGraph____target_name_prime);
		typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source
				.setName(typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source_name_prime);
		return new Object[] { extendedJamoppJavaContainer, tPackage, typeGraph,
				typeGraphToExtendedJamoppJavaContainer, isApplicableMatch,
				typeGraph__tPackage____packages,
				typeGraphToExtendedJamoppJavaContainer__typeGraph____target,
				typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source };
	}

	public static final Object[] pattern_PackageRoot_12_4_bindingFBBBBBB(
			PackageRoot _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TPackage tPackage,
			TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, extendedJamoppJavaContainer, tPackage,
				typeGraph, typeGraphToExtendedJamoppJavaContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					extendedJamoppJavaContainer, tPackage, typeGraph,
					typeGraphToExtendedJamoppJavaContainer };
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PackageRoot_12_4_bindingAndBlackFBBBBBB(
			PackageRoot _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TPackage tPackage,
			TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer) {
		Object[] result_pattern_PackageRoot_12_4_binding = pattern_PackageRoot_12_4_bindingFBBBBBB(
				_this, isApplicableMatch, extendedJamoppJavaContainer,
				tPackage, typeGraph, typeGraphToExtendedJamoppJavaContainer);
		if (result_pattern_PackageRoot_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_PackageRoot_12_4_binding[0];

			Object[] result_pattern_PackageRoot_12_4_black = pattern_PackageRoot_12_4_blackB(csp);
			if (result_pattern_PackageRoot_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						extendedJamoppJavaContainer, tPackage, typeGraph,
						typeGraphToExtendedJamoppJavaContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_PackageRoot_12_5_expressionFBB(
			PackageRoot _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageRoot_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PackageRoot_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PackageRoot";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PackageRoot_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PackageRoot_20_1_bindingFB(
			PackageRoot _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_20_1_blackFBB(
			EClass __eClass, PackageRoot _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_20_1_bindingAndBlackFFB(
			PackageRoot _this) {
		Object[] result_pattern_PackageRoot_20_1_binding = pattern_PackageRoot_20_1_bindingFB(_this);
		if (result_pattern_PackageRoot_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PackageRoot_20_1_binding[0];

			Object[] result_pattern_PackageRoot_20_1_black = pattern_PackageRoot_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PackageRoot_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PackageRoot_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PackageRoot_20_2_black_nac_0B(
			ExtendedJamoppPackageElement extendedJamoppPackageElement) {
		ExtendedJamoppPackageElement __DEC_extendedJamoppPackageElement_predessor_934634 = extendedJamoppPackageElement
				.getPredessor();
		if (__DEC_extendedJamoppPackageElement_predessor_934634 != null) {
			if (!extendedJamoppPackageElement
					.equals(__DEC_extendedJamoppPackageElement_predessor_934634)) {
				return new Object[] { extendedJamoppPackageElement };
			}
		}

		return null;
	}

	public static final Object[] pattern_PackageRoot_20_2_black_nac_1BB(
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		for (ExtendedJamoppJavaContainer __DEC_extendedJamoppPackageElement_roots_899276 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(extendedJamoppPackageElement,
						ExtendedJamoppJavaContainer.class, "roots")) {
			if (!extendedJamoppJavaContainer
					.equals(__DEC_extendedJamoppPackageElement_roots_899276)) {
				return new Object[] { extendedJamoppPackageElement,
						extendedJamoppJavaContainer };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_20_2_black_nac_2BB(
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		for (ExtendedJamoppJavaContainer __DEC_extendedJamoppPackageElement_extendedJamoppPackageElement_542460 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(extendedJamoppPackageElement,
						ExtendedJamoppJavaContainer.class,
						"extendedJamoppPackageElement")) {
			if (!extendedJamoppJavaContainer
					.equals(__DEC_extendedJamoppPackageElement_extendedJamoppPackageElement_542460)) {
				return new Object[] { extendedJamoppPackageElement,
						extendedJamoppJavaContainer };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PackageRoot_20_2_blackFFB(
			EMoflonEdge _edge_extendedJamoppPackageElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpExtendedJamoppJavaContainer = _edge_extendedJamoppPackageElement
				.getSrc();
		if (tmpExtendedJamoppJavaContainer instanceof ExtendedJamoppJavaContainer) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) tmpExtendedJamoppJavaContainer;
			EObject tmpExtendedJamoppPackageElement = _edge_extendedJamoppPackageElement
					.getTrg();
			if (tmpExtendedJamoppPackageElement instanceof ExtendedJamoppPackageElement) {
				ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) tmpExtendedJamoppPackageElement;
				if (extendedJamoppJavaContainer
						.getExtendedJamoppPackageElement().contains(
								extendedJamoppPackageElement)) {
					if (extendedJamoppJavaContainer.getRoots().contains(
							extendedJamoppPackageElement)) {
						if (pattern_PackageRoot_20_2_black_nac_0B(extendedJamoppPackageElement) == null) {
							if (pattern_PackageRoot_20_2_black_nac_1BB(
									extendedJamoppPackageElement,
									extendedJamoppJavaContainer) == null) {
								if (pattern_PackageRoot_20_2_black_nac_2BB(
										extendedJamoppPackageElement,
										extendedJamoppJavaContainer) == null) {
									_result.add(new Object[] {
											extendedJamoppJavaContainer,
											extendedJamoppPackageElement,
											_edge_extendedJamoppPackageElement });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_PackageRoot_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PackageRoot_20_3_expressionFBBBB(
			PackageRoot _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				extendedJamoppJavaContainer, extendedJamoppPackageElement);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PackageRoot_20_4_expressionFBB(
			PackageRoot _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageRoot_20_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PackageRoot_20_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PackageRoot_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PackageRoot_21_1_bindingFB(
			PackageRoot _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_21_1_blackFBB(
			EClass __eClass, PackageRoot _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_21_1_bindingAndBlackFFB(
			PackageRoot _this) {
		Object[] result_pattern_PackageRoot_21_1_binding = pattern_PackageRoot_21_1_bindingFB(_this);
		if (result_pattern_PackageRoot_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PackageRoot_21_1_binding[0];

			Object[] result_pattern_PackageRoot_21_1_black = pattern_PackageRoot_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PackageRoot_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PackageRoot_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PackageRoot_21_2_black_nac_0B(
			ExtendedJamoppPackageElement extendedJamoppPackageElement) {
		ExtendedJamoppPackageElement __DEC_extendedJamoppPackageElement_predessor_516958 = extendedJamoppPackageElement
				.getPredessor();
		if (__DEC_extendedJamoppPackageElement_predessor_516958 != null) {
			if (!extendedJamoppPackageElement
					.equals(__DEC_extendedJamoppPackageElement_predessor_516958)) {
				return new Object[] { extendedJamoppPackageElement };
			}
		}

		return null;
	}

	public static final Object[] pattern_PackageRoot_21_2_black_nac_1BB(
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		for (ExtendedJamoppJavaContainer __DEC_extendedJamoppPackageElement_roots_974239 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(extendedJamoppPackageElement,
						ExtendedJamoppJavaContainer.class, "roots")) {
			if (!extendedJamoppJavaContainer
					.equals(__DEC_extendedJamoppPackageElement_roots_974239)) {
				return new Object[] { extendedJamoppPackageElement,
						extendedJamoppJavaContainer };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_21_2_black_nac_2BB(
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		for (ExtendedJamoppJavaContainer __DEC_extendedJamoppPackageElement_extendedJamoppPackageElement_426860 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(extendedJamoppPackageElement,
						ExtendedJamoppJavaContainer.class,
						"extendedJamoppPackageElement")) {
			if (!extendedJamoppJavaContainer
					.equals(__DEC_extendedJamoppPackageElement_extendedJamoppPackageElement_426860)) {
				return new Object[] { extendedJamoppPackageElement,
						extendedJamoppJavaContainer };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PackageRoot_21_2_blackFFB(
			EMoflonEdge _edge_roots) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpExtendedJamoppJavaContainer = _edge_roots.getSrc();
		if (tmpExtendedJamoppJavaContainer instanceof ExtendedJamoppJavaContainer) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) tmpExtendedJamoppJavaContainer;
			EObject tmpExtendedJamoppPackageElement = _edge_roots.getTrg();
			if (tmpExtendedJamoppPackageElement instanceof ExtendedJamoppPackageElement) {
				ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) tmpExtendedJamoppPackageElement;
				if (extendedJamoppJavaContainer
						.getExtendedJamoppPackageElement().contains(
								extendedJamoppPackageElement)) {
					if (extendedJamoppJavaContainer.getRoots().contains(
							extendedJamoppPackageElement)) {
						if (pattern_PackageRoot_21_2_black_nac_0B(extendedJamoppPackageElement) == null) {
							if (pattern_PackageRoot_21_2_black_nac_1BB(
									extendedJamoppPackageElement,
									extendedJamoppJavaContainer) == null) {
								if (pattern_PackageRoot_21_2_black_nac_2BB(
										extendedJamoppPackageElement,
										extendedJamoppJavaContainer) == null) {
									_result.add(new Object[] {
											extendedJamoppJavaContainer,
											extendedJamoppPackageElement,
											_edge_roots });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_PackageRoot_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PackageRoot_21_3_expressionFBBBB(
			PackageRoot _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				extendedJamoppJavaContainer, extendedJamoppPackageElement);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PackageRoot_21_4_expressionFBB(
			PackageRoot _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageRoot_21_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PackageRoot_21_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PackageRoot_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PackageRoot_22_1_bindingFB(
			PackageRoot _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_22_1_blackFBB(
			EClass __eClass, PackageRoot _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_22_1_bindingAndBlackFFB(
			PackageRoot _this) {
		Object[] result_pattern_PackageRoot_22_1_binding = pattern_PackageRoot_22_1_bindingFB(_this);
		if (result_pattern_PackageRoot_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PackageRoot_22_1_binding[0];

			Object[] result_pattern_PackageRoot_22_1_black = pattern_PackageRoot_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PackageRoot_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PackageRoot_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageRoot_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PackageRoot_22_2_black_nac_0B(
			TPackage tPackage) {
		TPackage __DEC_tPackage_parent_560868 = tPackage.getParent();
		if (__DEC_tPackage_parent_560868 != null) {
			if (!tPackage.equals(__DEC_tPackage_parent_560868)) {
				return new Object[] { tPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_PackageRoot_22_2_black_nac_1BB(
			TPackage tPackage, TypeGraph typeGraph) {
		for (TypeGraph __DEC_tPackage_packages_174789 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tPackage, TypeGraph.class,
						"packages")) {
			if (!typeGraph.equals(__DEC_tPackage_packages_174789)) {
				return new Object[] { tPackage, typeGraph };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PackageRoot_22_2_blackFFB(
			EMoflonEdge _edge_packages) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTypeGraph = _edge_packages.getSrc();
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			EObject tmpTPackage = _edge_packages.getTrg();
			if (tmpTPackage instanceof TPackage) {
				TPackage tPackage = (TPackage) tmpTPackage;
				if (typeGraph.getPackages().contains(tPackage)) {
					if (pattern_PackageRoot_22_2_black_nac_0B(tPackage) == null) {
						if (pattern_PackageRoot_22_2_black_nac_1BB(tPackage,
								typeGraph) == null) {
							_result.add(new Object[] { tPackage, typeGraph,
									_edge_packages });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_PackageRoot_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PackageRoot_22_3_expressionFBBBB(
			PackageRoot _this, Match match, TPackage tPackage,
			TypeGraph typeGraph) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tPackage,
				typeGraph);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PackageRoot_22_4_expressionFBB(
			PackageRoot _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageRoot_22_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PackageRoot_22_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PackageRoot_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PackageRootImpl
