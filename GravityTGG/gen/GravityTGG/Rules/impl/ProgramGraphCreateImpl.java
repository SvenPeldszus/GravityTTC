/**
 */
package GravityTGG.Rules.impl;

import ExtendedJamopp.ExtendedJamoppFactory;
import ExtendedJamopp.ExtendedJamoppJavaContainer;

import GravityTGG.ExtendedJamoppJavaContainerToTypeGraph;
import GravityTGG.GravityTGGFactory;

import GravityTGG.Rules.ProgramGraphCreate;
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
 * An implementation of the model object '<em><b>Program Graph Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProgramGraphCreateImpl extends AbstractRuleImpl implements
		ProgramGraphCreate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramGraphCreateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getProgramGraphCreate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		// initial bindings
		Object[] result1_black = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_0_1_blackBBB(this, match,
						extendedJamoppJavaContainer);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_0_2_bindingAndBlackFBBB(this,
						match, extendedJamoppJavaContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ProgramGraphCreateImpl
					.pattern_ProgramGraphCreate_0_4_blackBB(match,
							extendedJamoppJavaContainer);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ProgramGraphCreateImpl.pattern_ProgramGraphCreate_0_4_greenBB(
					match, extendedJamoppJavaContainer);

			// collect context elements
			Object[] result5_black = ProgramGraphCreateImpl
					.pattern_ProgramGraphCreate_0_5_blackBB(match,
							extendedJamoppJavaContainer);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			// register objects to match
			ProgramGraphCreateImpl
					.pattern_ProgramGraphCreate_0_6_expressionBBB(this, match,
							extendedJamoppJavaContainer);
			return ProgramGraphCreateImpl
					.pattern_ProgramGraphCreate_0_7_expressionF();
		} else {
			return ProgramGraphCreateImpl
					.pattern_ProgramGraphCreate_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_1_1_bindingAndBlackFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result1_bindingAndBlack[0];
		// CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_1_1_greenBFF(extendedJamoppJavaContainer);
		TypeGraph typeGraph = (TypeGraph) result1_green[1];
		ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer = (ExtendedJamoppJavaContainerToTypeGraph) result1_green[2];

		// collect translated elements
		Object[] result2_black = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_1_2_blackBBB(
						extendedJamoppJavaContainer, typeGraph,
						typeGraphToExtendedJamoppJavaContainer);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_1_2_greenFBBB(
						extendedJamoppJavaContainer, typeGraph,
						typeGraphToExtendedJamoppJavaContainer);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_1_3_blackBBBB(ruleresult,
						extendedJamoppJavaContainer, typeGraph,
						typeGraphToExtendedJamoppJavaContainer);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ProgramGraphCreateImpl.pattern_ProgramGraphCreate_1_3_greenBBBBFF(
				ruleresult, extendedJamoppJavaContainer, typeGraph,
				typeGraphToExtendedJamoppJavaContainer);
		// EMoflonEdge typeGraphToExtendedJamoppJavaContainer__typeGraph____target = (EMoflonEdge) result3_green[4];
		// EMoflonEdge typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source = (EMoflonEdge) result3_green[5];

		// perform postprocessing story node is empty
		// register objects
		ProgramGraphCreateImpl.pattern_ProgramGraphCreate_1_5_expressionBBBBB(
				this, ruleresult, extendedJamoppJavaContainer, typeGraph,
				typeGraphToExtendedJamoppJavaContainer);
		return ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_2_2_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result2_binding[0];
		for (Object[] result2_black : ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_2_2_blackBB(
						extendedJamoppJavaContainer, match)) {
			// ForEach find context
			for (Object[] result3_black : ProgramGraphCreateImpl
					.pattern_ProgramGraphCreate_2_3_blackB(extendedJamoppJavaContainer)) {
				Object[] result3_green = ProgramGraphCreateImpl
						.pattern_ProgramGraphCreate_2_3_greenBF(extendedJamoppJavaContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				// solve CSP
				Object[] result4_bindingAndBlack = ProgramGraphCreateImpl
						.pattern_ProgramGraphCreate_2_4_bindingAndBlackFBBB(
								this, isApplicableMatch,
								extendedJamoppJavaContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ProgramGraphCreateImpl
						.pattern_ProgramGraphCreate_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ProgramGraphCreateImpl
							.pattern_ProgramGraphCreate_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ProgramGraphCreateImpl
							.pattern_ProgramGraphCreate_2_6_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		match.registerObject("extendedJamoppJavaContainer",
				extendedJamoppJavaContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {// Create CSP
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
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("extendedJamoppJavaContainer",
				extendedJamoppJavaContainer);
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
			EObject extendedJamoppJavaContainer, EObject typeGraph,
			EObject typeGraphToExtendedJamoppJavaContainer) {
		ruleresult.registerObject("extendedJamoppJavaContainer",
				extendedJamoppJavaContainer);
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
				.getObject("extendedJamoppJavaContainer")
				.eClass()
				.equals(ExtendedJamopp.ExtendedJamoppPackage.eINSTANCE
						.getExtendedJamoppJavaContainer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TypeGraph typeGraph) {
		// initial bindings
		Object[] result1_black = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_10_1_blackBBB(this, match,
						typeGraph);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_10_2_bindingAndBlackFBBB(this,
						match, typeGraph);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ProgramGraphCreateImpl
					.pattern_ProgramGraphCreate_10_4_blackBB(match, typeGraph);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ProgramGraphCreateImpl.pattern_ProgramGraphCreate_10_4_greenBB(
					match, typeGraph);

			// collect context elements
			Object[] result5_black = ProgramGraphCreateImpl
					.pattern_ProgramGraphCreate_10_5_blackBB(match, typeGraph);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			// register objects to match
			ProgramGraphCreateImpl
					.pattern_ProgramGraphCreate_10_6_expressionBBB(this, match,
							typeGraph);
			return ProgramGraphCreateImpl
					.pattern_ProgramGraphCreate_10_7_expressionF();
		} else {
			return ProgramGraphCreateImpl
					.pattern_ProgramGraphCreate_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_11_1_bindingAndBlackFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[0];
		// CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_11_1_greenFBF(typeGraph);
		ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result1_green[0];
		ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer = (ExtendedJamoppJavaContainerToTypeGraph) result1_green[2];

		// collect translated elements
		Object[] result2_black = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_11_2_blackBBB(
						extendedJamoppJavaContainer, typeGraph,
						typeGraphToExtendedJamoppJavaContainer);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_11_2_greenFBBB(
						extendedJamoppJavaContainer, typeGraph,
						typeGraphToExtendedJamoppJavaContainer);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_11_3_blackBBBB(ruleresult,
						extendedJamoppJavaContainer, typeGraph,
						typeGraphToExtendedJamoppJavaContainer);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ProgramGraphCreateImpl.pattern_ProgramGraphCreate_11_3_greenBBBBFF(
				ruleresult, extendedJamoppJavaContainer, typeGraph,
				typeGraphToExtendedJamoppJavaContainer);
		// EMoflonEdge typeGraphToExtendedJamoppJavaContainer__typeGraph____target = (EMoflonEdge) result3_green[4];
		// EMoflonEdge typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source = (EMoflonEdge) result3_green[5];

		// perform postprocessing story node is empty
		// register objects
		ProgramGraphCreateImpl.pattern_ProgramGraphCreate_11_5_expressionBBBBB(
				this, ruleresult, extendedJamoppJavaContainer, typeGraph,
				typeGraphToExtendedJamoppJavaContainer);
		return ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_12_2_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		TypeGraph typeGraph = (TypeGraph) result2_binding[0];
		for (Object[] result2_black : ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_12_2_blackBB(typeGraph, match)) {
			// ForEach find context
			for (Object[] result3_black : ProgramGraphCreateImpl
					.pattern_ProgramGraphCreate_12_3_blackB(typeGraph)) {
				Object[] result3_green = ProgramGraphCreateImpl
						.pattern_ProgramGraphCreate_12_3_greenBF(typeGraph);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				// solve CSP
				Object[] result4_bindingAndBlack = ProgramGraphCreateImpl
						.pattern_ProgramGraphCreate_12_4_bindingAndBlackFBBB(
								this, isApplicableMatch, typeGraph);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ProgramGraphCreateImpl
						.pattern_ProgramGraphCreate_12_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = ProgramGraphCreateImpl
							.pattern_ProgramGraphCreate_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ProgramGraphCreateImpl
							.pattern_ProgramGraphCreate_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TypeGraph typeGraph) {
		match.registerObject("typeGraph", typeGraph);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph typeGraph) {// Create CSP
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
			TypeGraph typeGraph) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("typeGraph", typeGraph);
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
			EObject extendedJamoppJavaContainer, EObject typeGraph,
			EObject typeGraphToExtendedJamoppJavaContainer) {
		ruleresult.registerObject("extendedJamoppJavaContainer",
				extendedJamoppJavaContainer);
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
				.getObject("typeGraph")
				.eClass()
				.equals(TypeGraphBasic.TypeGraphBasicPackage.eINSTANCE
						.getTypeGraph());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_ExtendedJamoppJavaContainer_0(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		// prepare return value
		Object[] result1_bindingAndBlack = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_20_2_blackB(extendedJamoppJavaContainer)) {
			Object[] result2_green = ProgramGraphCreateImpl
					.pattern_ProgramGraphCreate_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ProgramGraphCreateImpl
					.pattern_ProgramGraphCreate_20_3_expressionFBBB(this,
							match, extendedJamoppJavaContainer)) {
				// Ensure that the correct types of elements are matched
				if (ProgramGraphCreateImpl
						.pattern_ProgramGraphCreate_20_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ProgramGraphCreateImpl
							.pattern_ProgramGraphCreate_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ProgramGraphCreateImpl
							.pattern_ProgramGraphCreate_20_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_TypeGraph_0(TypeGraph typeGraph) {
		// prepare return value
		Object[] result1_bindingAndBlack = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_21_2_blackB(typeGraph)) {
			Object[] result2_green = ProgramGraphCreateImpl
					.pattern_ProgramGraphCreate_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ProgramGraphCreateImpl
					.pattern_ProgramGraphCreate_21_3_expressionFBBB(this,
							match, typeGraph)) {
				// Ensure that the correct types of elements are matched
				if (ProgramGraphCreateImpl
						.pattern_ProgramGraphCreate_21_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ProgramGraphCreateImpl
							.pattern_ProgramGraphCreate_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ProgramGraphCreateImpl
							.pattern_ProgramGraphCreate_21_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ProgramGraphCreateImpl
				.pattern_ProgramGraphCreate_21_6_expressionFB(__result);
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
		case RulesPackage.PROGRAM_GRAPH_CREATE___IS_APPROPRIATE_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER:
			return isAppropriate_FWD((Match) arguments.get(0),
					(ExtendedJamoppJavaContainer) arguments.get(1));
		case RulesPackage.PROGRAM_GRAPH_CREATE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PROGRAM_GRAPH_CREATE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PROGRAM_GRAPH_CREATE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(ExtendedJamoppJavaContainer) arguments.get(1));
			return null;
		case RulesPackage.PROGRAM_GRAPH_CREATE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(ExtendedJamoppJavaContainer) arguments.get(1));
		case RulesPackage.PROGRAM_GRAPH_CREATE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PROGRAM_GRAPH_CREATE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDJAMOPPJAVACONTAINER:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedJamoppJavaContainer) arguments.get(1));
		case RulesPackage.PROGRAM_GRAPH_CREATE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PROGRAM_GRAPH_CREATE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3));
			return null;
		case RulesPackage.PROGRAM_GRAPH_CREATE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PROGRAM_GRAPH_CREATE___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TypeGraph) arguments.get(1));
		case RulesPackage.PROGRAM_GRAPH_CREATE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PROGRAM_GRAPH_CREATE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PROGRAM_GRAPH_CREATE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TypeGraph) arguments.get(1));
			return null;
		case RulesPackage.PROGRAM_GRAPH_CREATE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TypeGraph) arguments.get(1));
		case RulesPackage.PROGRAM_GRAPH_CREATE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PROGRAM_GRAPH_CREATE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(TypeGraph) arguments.get(1));
		case RulesPackage.PROGRAM_GRAPH_CREATE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PROGRAM_GRAPH_CREATE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3));
			return null;
		case RulesPackage.PROGRAM_GRAPH_CREATE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PROGRAM_GRAPH_CREATE___IS_APPROPRIATE_FWD_EXTENDED_JAMOPP_JAVA_CONTAINER_0__EXTENDEDJAMOPPJAVACONTAINER:
			return isAppropriate_FWD_ExtendedJamoppJavaContainer_0((ExtendedJamoppJavaContainer) arguments
					.get(0));
		case RulesPackage.PROGRAM_GRAPH_CREATE___IS_APPROPRIATE_BWD_TYPE_GRAPH_0__TYPEGRAPH:
			return isAppropriate_BWD_TypeGraph_0((TypeGraph) arguments.get(0));
		case RulesPackage.PROGRAM_GRAPH_CREATE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PROGRAM_GRAPH_CREATE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ProgramGraphCreate_0_1_blackBBB(
			ProgramGraphCreate _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		return new Object[] { _this, match, extendedJamoppJavaContainer };
	}

	public static final Object[] pattern_ProgramGraphCreate_0_2_bindingFBBB(
			ProgramGraphCreate _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				extendedJamoppJavaContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match,
					extendedJamoppJavaContainer };
		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ProgramGraphCreate_0_2_bindingAndBlackFBBB(
			ProgramGraphCreate _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		Object[] result_pattern_ProgramGraphCreate_0_2_binding = pattern_ProgramGraphCreate_0_2_bindingFBBB(
				_this, match, extendedJamoppJavaContainer);
		if (result_pattern_ProgramGraphCreate_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ProgramGraphCreate_0_2_binding[0];

			Object[] result_pattern_ProgramGraphCreate_0_2_black = pattern_ProgramGraphCreate_0_2_blackB(csp);
			if (result_pattern_ProgramGraphCreate_0_2_black != null) {

				return new Object[] { csp, _this, match,
						extendedJamoppJavaContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_ProgramGraphCreate_0_3_expressionFBB(
			ProgramGraphCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ProgramGraphCreate_0_4_blackBB(
			Match match, ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		return new Object[] { match, extendedJamoppJavaContainer };
	}

	public static final Object[] pattern_ProgramGraphCreate_0_4_greenBB(
			Match match, ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		match.getToBeTranslatedNodes().add(extendedJamoppJavaContainer);
		return new Object[] { match, extendedJamoppJavaContainer };
	}

	public static final Object[] pattern_ProgramGraphCreate_0_5_blackBB(
			Match match, ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		return new Object[] { match, extendedJamoppJavaContainer };
	}

	public static final void pattern_ProgramGraphCreate_0_6_expressionBBB(
			ProgramGraphCreate _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		_this.registerObjectsToMatch_FWD(match, extendedJamoppJavaContainer);

	}

	public static final boolean pattern_ProgramGraphCreate_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ProgramGraphCreate_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ProgramGraphCreate_1_1_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("extendedJamoppJavaContainer");
		EObject tmpExtendedJamoppJavaContainer = _localVariable_0;
		if (tmpExtendedJamoppJavaContainer instanceof ExtendedJamoppJavaContainer) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) tmpExtendedJamoppJavaContainer;
			return new Object[] { extendedJamoppJavaContainer,
					isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_1_1_blackBFBB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ProgramGraphCreate _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { extendedJamoppJavaContainer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_1_1_bindingAndBlackFFBB(
			ProgramGraphCreate _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ProgramGraphCreate_1_1_binding = pattern_ProgramGraphCreate_1_1_bindingFB(isApplicableMatch);
		if (result_pattern_ProgramGraphCreate_1_1_binding != null) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result_pattern_ProgramGraphCreate_1_1_binding[0];

			Object[] result_pattern_ProgramGraphCreate_1_1_black = pattern_ProgramGraphCreate_1_1_blackBFBB(
					extendedJamoppJavaContainer, _this, isApplicableMatch);
			if (result_pattern_ProgramGraphCreate_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ProgramGraphCreate_1_1_black[1];

				return new Object[] { extendedJamoppJavaContainer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_1_1_greenBFF(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		TypeGraph typeGraph = TypeGraphBasicFactory.eINSTANCE.createTypeGraph();
		ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer = GravityTGGFactory.eINSTANCE
				.createExtendedJamoppJavaContainerToTypeGraph();
		typeGraphToExtendedJamoppJavaContainer.setTarget(typeGraph);
		typeGraphToExtendedJamoppJavaContainer
				.setSource(extendedJamoppJavaContainer);
		return new Object[] { extendedJamoppJavaContainer, typeGraph,
				typeGraphToExtendedJamoppJavaContainer };
	}

	public static final Object[] pattern_ProgramGraphCreate_1_2_blackBBB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer) {
		return new Object[] { extendedJamoppJavaContainer, typeGraph,
				typeGraphToExtendedJamoppJavaContainer };
	}

	public static final Object[] pattern_ProgramGraphCreate_1_2_greenFBBB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(extendedJamoppJavaContainer);
		ruleresult.getCreatedElements().add(typeGraph);
		ruleresult.getCreatedLinkElements().add(
				typeGraphToExtendedJamoppJavaContainer);
		return new Object[] { ruleresult, extendedJamoppJavaContainer,
				typeGraph, typeGraphToExtendedJamoppJavaContainer };
	}

	public static final Object[] pattern_ProgramGraphCreate_1_3_blackBBBB(
			PerformRuleResult ruleresult, EObject extendedJamoppJavaContainer,
			EObject typeGraph, EObject typeGraphToExtendedJamoppJavaContainer) {
		if (!extendedJamoppJavaContainer.equals(typeGraph)) {
			if (!extendedJamoppJavaContainer
					.equals(typeGraphToExtendedJamoppJavaContainer)) {
				if (!typeGraph.equals(typeGraphToExtendedJamoppJavaContainer)) {
					return new Object[] { ruleresult,
							extendedJamoppJavaContainer, typeGraph,
							typeGraphToExtendedJamoppJavaContainer };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_1_3_greenBBBBFF(
			PerformRuleResult ruleresult, EObject extendedJamoppJavaContainer,
			EObject typeGraph, EObject typeGraphToExtendedJamoppJavaContainer) {
		EMoflonEdge typeGraphToExtendedJamoppJavaContainer__typeGraph____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ProgramGraphCreate";
		String typeGraphToExtendedJamoppJavaContainer__typeGraph____target_name_prime = "target";
		String typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source_name_prime = "source";
		typeGraphToExtendedJamoppJavaContainer__typeGraph____target
				.setSrc(typeGraphToExtendedJamoppJavaContainer);
		typeGraphToExtendedJamoppJavaContainer__typeGraph____target
				.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(
				typeGraphToExtendedJamoppJavaContainer__typeGraph____target);
		typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source
				.setSrc(typeGraphToExtendedJamoppJavaContainer);
		typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source
				.setTrg(extendedJamoppJavaContainer);
		ruleresult
				.getCreatedEdges()
				.add(typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		typeGraphToExtendedJamoppJavaContainer__typeGraph____target
				.setName(typeGraphToExtendedJamoppJavaContainer__typeGraph____target_name_prime);
		typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source
				.setName(typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source_name_prime);
		return new Object[] { ruleresult, extendedJamoppJavaContainer,
				typeGraph, typeGraphToExtendedJamoppJavaContainer,
				typeGraphToExtendedJamoppJavaContainer__typeGraph____target,
				typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source };
	}

	public static final void pattern_ProgramGraphCreate_1_5_expressionBBBBB(
			ProgramGraphCreate _this, PerformRuleResult ruleresult,
			EObject extendedJamoppJavaContainer, EObject typeGraph,
			EObject typeGraphToExtendedJamoppJavaContainer) {
		_this.registerObjects_FWD(ruleresult, extendedJamoppJavaContainer,
				typeGraph, typeGraphToExtendedJamoppJavaContainer);

	}

	public static final PerformRuleResult pattern_ProgramGraphCreate_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ProgramGraphCreate_2_1_bindingFB(
			ProgramGraphCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_2_1_blackFBB(
			EClass eClass, ProgramGraphCreate _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_2_1_bindingAndBlackFFB(
			ProgramGraphCreate _this) {
		Object[] result_pattern_ProgramGraphCreate_2_1_binding = pattern_ProgramGraphCreate_2_1_bindingFB(_this);
		if (result_pattern_ProgramGraphCreate_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ProgramGraphCreate_2_1_binding[0];

			Object[] result_pattern_ProgramGraphCreate_2_1_black = pattern_ProgramGraphCreate_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ProgramGraphCreate_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ProgramGraphCreate_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ProgramGraphCreate";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ProgramGraphCreate_2_2_bindingFB(
			Match match) {
		EObject _localVariable_0 = match
				.getObject("extendedJamoppJavaContainer");
		EObject tmpExtendedJamoppJavaContainer = _localVariable_0;
		if (tmpExtendedJamoppJavaContainer instanceof ExtendedJamoppJavaContainer) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) tmpExtendedJamoppJavaContainer;
			return new Object[] { extendedJamoppJavaContainer, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ProgramGraphCreate_2_2_blackBB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { extendedJamoppJavaContainer, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_ProgramGraphCreate_2_3_blackB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { extendedJamoppJavaContainer });
		return _result;
	}

	public static final Object[] pattern_ProgramGraphCreate_2_3_greenBF(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(
				extendedJamoppJavaContainer);
		return new Object[] { extendedJamoppJavaContainer, isApplicableMatch };
	}

	public static final Object[] pattern_ProgramGraphCreate_2_4_bindingFBBB(
			ProgramGraphCreate _this, IsApplicableMatch isApplicableMatch,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, extendedJamoppJavaContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					extendedJamoppJavaContainer };
		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ProgramGraphCreate_2_4_bindingAndBlackFBBB(
			ProgramGraphCreate _this, IsApplicableMatch isApplicableMatch,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		Object[] result_pattern_ProgramGraphCreate_2_4_binding = pattern_ProgramGraphCreate_2_4_bindingFBBB(
				_this, isApplicableMatch, extendedJamoppJavaContainer);
		if (result_pattern_ProgramGraphCreate_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ProgramGraphCreate_2_4_binding[0];

			Object[] result_pattern_ProgramGraphCreate_2_4_black = pattern_ProgramGraphCreate_2_4_blackB(csp);
			if (result_pattern_ProgramGraphCreate_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						extendedJamoppJavaContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_ProgramGraphCreate_2_5_expressionFBB(
			ProgramGraphCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ProgramGraphCreate_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ProgramGraphCreate_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ProgramGraphCreate";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ProgramGraphCreate_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ProgramGraphCreate_10_1_blackBBB(
			ProgramGraphCreate _this, Match match, TypeGraph typeGraph) {
		return new Object[] { _this, match, typeGraph };
	}

	public static final Object[] pattern_ProgramGraphCreate_10_2_bindingFBBB(
			ProgramGraphCreate _this, Match match, TypeGraph typeGraph) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				typeGraph);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ProgramGraphCreate_10_2_bindingAndBlackFBBB(
			ProgramGraphCreate _this, Match match, TypeGraph typeGraph) {
		Object[] result_pattern_ProgramGraphCreate_10_2_binding = pattern_ProgramGraphCreate_10_2_bindingFBBB(
				_this, match, typeGraph);
		if (result_pattern_ProgramGraphCreate_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ProgramGraphCreate_10_2_binding[0];

			Object[] result_pattern_ProgramGraphCreate_10_2_black = pattern_ProgramGraphCreate_10_2_blackB(csp);
			if (result_pattern_ProgramGraphCreate_10_2_black != null) {

				return new Object[] { csp, _this, match, typeGraph };
			}
		}
		return null;
	}

	public static final boolean pattern_ProgramGraphCreate_10_3_expressionFBB(
			ProgramGraphCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ProgramGraphCreate_10_4_blackBB(
			Match match, TypeGraph typeGraph) {
		return new Object[] { match, typeGraph };
	}

	public static final Object[] pattern_ProgramGraphCreate_10_4_greenBB(
			Match match, TypeGraph typeGraph) {
		match.getToBeTranslatedNodes().add(typeGraph);
		return new Object[] { match, typeGraph };
	}

	public static final Object[] pattern_ProgramGraphCreate_10_5_blackBB(
			Match match, TypeGraph typeGraph) {
		return new Object[] { match, typeGraph };
	}

	public static final void pattern_ProgramGraphCreate_10_6_expressionBBB(
			ProgramGraphCreate _this, Match match, TypeGraph typeGraph) {
		_this.registerObjectsToMatch_BWD(match, typeGraph);

	}

	public static final boolean pattern_ProgramGraphCreate_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ProgramGraphCreate_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ProgramGraphCreate_11_1_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("typeGraph");
		EObject tmpTypeGraph = _localVariable_0;
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			return new Object[] { typeGraph, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_11_1_blackBFBB(
			TypeGraph typeGraph, ProgramGraphCreate _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { typeGraph, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_11_1_bindingAndBlackFFBB(
			ProgramGraphCreate _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ProgramGraphCreate_11_1_binding = pattern_ProgramGraphCreate_11_1_bindingFB(isApplicableMatch);
		if (result_pattern_ProgramGraphCreate_11_1_binding != null) {
			TypeGraph typeGraph = (TypeGraph) result_pattern_ProgramGraphCreate_11_1_binding[0];

			Object[] result_pattern_ProgramGraphCreate_11_1_black = pattern_ProgramGraphCreate_11_1_blackBFBB(
					typeGraph, _this, isApplicableMatch);
			if (result_pattern_ProgramGraphCreate_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ProgramGraphCreate_11_1_black[1];

				return new Object[] { typeGraph, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_11_1_greenFBF(
			TypeGraph typeGraph) {
		ExtendedJamoppJavaContainer extendedJamoppJavaContainer = ExtendedJamoppFactory.eINSTANCE
				.createExtendedJamoppJavaContainer();
		ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer = GravityTGGFactory.eINSTANCE
				.createExtendedJamoppJavaContainerToTypeGraph();
		typeGraphToExtendedJamoppJavaContainer.setTarget(typeGraph);
		typeGraphToExtendedJamoppJavaContainer
				.setSource(extendedJamoppJavaContainer);
		return new Object[] { extendedJamoppJavaContainer, typeGraph,
				typeGraphToExtendedJamoppJavaContainer };
	}

	public static final Object[] pattern_ProgramGraphCreate_11_2_blackBBB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer) {
		return new Object[] { extendedJamoppJavaContainer, typeGraph,
				typeGraphToExtendedJamoppJavaContainer };
	}

	public static final Object[] pattern_ProgramGraphCreate_11_2_greenFBBB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			TypeGraph typeGraph,
			ExtendedJamoppJavaContainerToTypeGraph typeGraphToExtendedJamoppJavaContainer) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(extendedJamoppJavaContainer);
		ruleresult.getTranslatedElements().add(typeGraph);
		ruleresult.getCreatedLinkElements().add(
				typeGraphToExtendedJamoppJavaContainer);
		return new Object[] { ruleresult, extendedJamoppJavaContainer,
				typeGraph, typeGraphToExtendedJamoppJavaContainer };
	}

	public static final Object[] pattern_ProgramGraphCreate_11_3_blackBBBB(
			PerformRuleResult ruleresult, EObject extendedJamoppJavaContainer,
			EObject typeGraph, EObject typeGraphToExtendedJamoppJavaContainer) {
		if (!extendedJamoppJavaContainer.equals(typeGraph)) {
			if (!extendedJamoppJavaContainer
					.equals(typeGraphToExtendedJamoppJavaContainer)) {
				if (!typeGraph.equals(typeGraphToExtendedJamoppJavaContainer)) {
					return new Object[] { ruleresult,
							extendedJamoppJavaContainer, typeGraph,
							typeGraphToExtendedJamoppJavaContainer };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_11_3_greenBBBBFF(
			PerformRuleResult ruleresult, EObject extendedJamoppJavaContainer,
			EObject typeGraph, EObject typeGraphToExtendedJamoppJavaContainer) {
		EMoflonEdge typeGraphToExtendedJamoppJavaContainer__typeGraph____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ProgramGraphCreate";
		String typeGraphToExtendedJamoppJavaContainer__typeGraph____target_name_prime = "target";
		String typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source_name_prime = "source";
		typeGraphToExtendedJamoppJavaContainer__typeGraph____target
				.setSrc(typeGraphToExtendedJamoppJavaContainer);
		typeGraphToExtendedJamoppJavaContainer__typeGraph____target
				.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(
				typeGraphToExtendedJamoppJavaContainer__typeGraph____target);
		typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source
				.setSrc(typeGraphToExtendedJamoppJavaContainer);
		typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source
				.setTrg(extendedJamoppJavaContainer);
		ruleresult
				.getCreatedEdges()
				.add(typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		typeGraphToExtendedJamoppJavaContainer__typeGraph____target
				.setName(typeGraphToExtendedJamoppJavaContainer__typeGraph____target_name_prime);
		typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source
				.setName(typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source_name_prime);
		return new Object[] { ruleresult, extendedJamoppJavaContainer,
				typeGraph, typeGraphToExtendedJamoppJavaContainer,
				typeGraphToExtendedJamoppJavaContainer__typeGraph____target,
				typeGraphToExtendedJamoppJavaContainer__extendedJamoppJavaContainer____source };
	}

	public static final void pattern_ProgramGraphCreate_11_5_expressionBBBBB(
			ProgramGraphCreate _this, PerformRuleResult ruleresult,
			EObject extendedJamoppJavaContainer, EObject typeGraph,
			EObject typeGraphToExtendedJamoppJavaContainer) {
		_this.registerObjects_BWD(ruleresult, extendedJamoppJavaContainer,
				typeGraph, typeGraphToExtendedJamoppJavaContainer);

	}

	public static final PerformRuleResult pattern_ProgramGraphCreate_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ProgramGraphCreate_12_1_bindingFB(
			ProgramGraphCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_12_1_blackFBB(
			EClass eClass, ProgramGraphCreate _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_12_1_bindingAndBlackFFB(
			ProgramGraphCreate _this) {
		Object[] result_pattern_ProgramGraphCreate_12_1_binding = pattern_ProgramGraphCreate_12_1_bindingFB(_this);
		if (result_pattern_ProgramGraphCreate_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ProgramGraphCreate_12_1_binding[0];

			Object[] result_pattern_ProgramGraphCreate_12_1_black = pattern_ProgramGraphCreate_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ProgramGraphCreate_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ProgramGraphCreate_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ProgramGraphCreate";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ProgramGraphCreate_12_2_bindingFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("typeGraph");
		EObject tmpTypeGraph = _localVariable_0;
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			return new Object[] { typeGraph, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ProgramGraphCreate_12_2_blackBB(
			TypeGraph typeGraph, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { typeGraph, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_ProgramGraphCreate_12_3_blackB(
			TypeGraph typeGraph) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { typeGraph });
		return _result;
	}

	public static final Object[] pattern_ProgramGraphCreate_12_3_greenBF(
			TypeGraph typeGraph) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(typeGraph);
		return new Object[] { typeGraph, isApplicableMatch };
	}

	public static final Object[] pattern_ProgramGraphCreate_12_4_bindingFBBB(
			ProgramGraphCreate _this, IsApplicableMatch isApplicableMatch,
			TypeGraph typeGraph) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, typeGraph);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ProgramGraphCreate_12_4_bindingAndBlackFBBB(
			ProgramGraphCreate _this, IsApplicableMatch isApplicableMatch,
			TypeGraph typeGraph) {
		Object[] result_pattern_ProgramGraphCreate_12_4_binding = pattern_ProgramGraphCreate_12_4_bindingFBBB(
				_this, isApplicableMatch, typeGraph);
		if (result_pattern_ProgramGraphCreate_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ProgramGraphCreate_12_4_binding[0];

			Object[] result_pattern_ProgramGraphCreate_12_4_black = pattern_ProgramGraphCreate_12_4_blackB(csp);
			if (result_pattern_ProgramGraphCreate_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, typeGraph };
			}
		}
		return null;
	}

	public static final boolean pattern_ProgramGraphCreate_12_5_expressionFBB(
			ProgramGraphCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ProgramGraphCreate_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ProgramGraphCreate_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ProgramGraphCreate";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ProgramGraphCreate_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ProgramGraphCreate_20_1_bindingFB(
			ProgramGraphCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_20_1_blackFBB(
			EClass __eClass, ProgramGraphCreate _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_20_1_bindingAndBlackFFB(
			ProgramGraphCreate _this) {
		Object[] result_pattern_ProgramGraphCreate_20_1_binding = pattern_ProgramGraphCreate_20_1_bindingFB(_this);
		if (result_pattern_ProgramGraphCreate_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ProgramGraphCreate_20_1_binding[0];

			Object[] result_pattern_ProgramGraphCreate_20_1_black = pattern_ProgramGraphCreate_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ProgramGraphCreate_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ProgramGraphCreate_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ProgramGraphCreate_20_2_blackB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { extendedJamoppJavaContainer });
		return _result;
	}

	public static final Object[] pattern_ProgramGraphCreate_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ProgramGraphCreate_20_3_expressionFBBB(
			ProgramGraphCreate _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				extendedJamoppJavaContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ProgramGraphCreate_20_4_expressionFBB(
			ProgramGraphCreate _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ProgramGraphCreate_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ProgramGraphCreate_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ProgramGraphCreate_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ProgramGraphCreate_21_1_bindingFB(
			ProgramGraphCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_21_1_blackFBB(
			EClass __eClass, ProgramGraphCreate _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_21_1_bindingAndBlackFFB(
			ProgramGraphCreate _this) {
		Object[] result_pattern_ProgramGraphCreate_21_1_binding = pattern_ProgramGraphCreate_21_1_bindingFB(_this);
		if (result_pattern_ProgramGraphCreate_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ProgramGraphCreate_21_1_binding[0];

			Object[] result_pattern_ProgramGraphCreate_21_1_black = pattern_ProgramGraphCreate_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ProgramGraphCreate_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ProgramGraphCreate_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ProgramGraphCreate_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ProgramGraphCreate_21_2_blackB(
			TypeGraph typeGraph) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { typeGraph });
		return _result;
	}

	public static final Object[] pattern_ProgramGraphCreate_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ProgramGraphCreate_21_3_expressionFBBB(
			ProgramGraphCreate _this, Match match, TypeGraph typeGraph) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, typeGraph);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ProgramGraphCreate_21_4_expressionFBB(
			ProgramGraphCreate _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ProgramGraphCreate_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ProgramGraphCreate_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ProgramGraphCreate_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ProgramGraphCreateImpl
