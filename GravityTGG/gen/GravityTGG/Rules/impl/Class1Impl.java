/**
 */
package GravityTGG.Rules.impl;

import ExtendedJamopp.ExtendedClassMethod;
import ExtendedJamopp.ExtendedJamoppFactory;

import GravityTGG.ClassMethodToTMethodDefinition;
import GravityTGG.GravityTGGFactory;

import GravityTGG.Rules.Class1;
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

import TypeGraphBasic.TMethodDefinition;
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
 * An implementation of the model object '<em><b>Class1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Class1Impl extends AbstractRuleImpl implements Class1 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Class1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getClass1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ExtendedClassMethod jMethod) {
		// initial bindings
		Object[] result1_black = Class1Impl.pattern_Class1_0_1_blackBBB(this,
				match, jMethod);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Class1Impl
				.pattern_Class1_0_2_bindingAndBlackFBBB(this, match, jMethod);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Class1Impl.pattern_Class1_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Class1Impl.pattern_Class1_0_4_blackBB(
					match, jMethod);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			Class1Impl.pattern_Class1_0_4_greenBB(match, jMethod);

			// collect context elements
			Object[] result5_black = Class1Impl.pattern_Class1_0_5_blackBB(
					match, jMethod);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			// register objects to match
			Class1Impl.pattern_Class1_0_6_expressionBBB(this, match, jMethod);
			return Class1Impl.pattern_Class1_0_7_expressionF();
		} else {
			return Class1Impl.pattern_Class1_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Class1Impl
				.pattern_Class1_1_1_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedClassMethod jMethod = (ExtendedClassMethod) result1_bindingAndBlack[0];
		// CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl
				.pattern_Class1_1_1_greenBFF(jMethod);
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result1_green[1];
		ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result1_green[2];

		// collect translated elements
		Object[] result2_black = Class1Impl.pattern_Class1_1_2_blackBBB(
				jMethod, tMethodDefinition, jMethodToTMethodDefinition);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = Class1Impl.pattern_Class1_1_2_greenFBBB(
				jMethod, tMethodDefinition, jMethodToTMethodDefinition);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Class1Impl.pattern_Class1_1_3_blackBBBB(
				ruleresult, jMethod, tMethodDefinition,
				jMethodToTMethodDefinition);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		Class1Impl.pattern_Class1_1_3_greenBBBBFF(ruleresult, jMethod,
				tMethodDefinition, jMethodToTMethodDefinition);
		// EMoflonEdge jMethodToTMethodDefinition__jMethod____source = (EMoflonEdge) result3_green[4];
		// EMoflonEdge jMethodToTMethodDefinition__tMethodDefinition____target = (EMoflonEdge) result3_green[5];

		// perform postprocessing story node is empty
		// register objects
		Class1Impl.pattern_Class1_1_5_expressionBBBBB(this, ruleresult,
				jMethod, tMethodDefinition, jMethodToTMethodDefinition);
		return Class1Impl.pattern_Class1_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl
				.pattern_Class1_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl
				.pattern_Class1_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Class1Impl
				.pattern_Class1_2_2_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		ExtendedClassMethod jMethod = (ExtendedClassMethod) result2_binding[0];
		for (Object[] result2_black : Class1Impl.pattern_Class1_2_2_blackBB(
				jMethod, match)) {
			// ForEach find context
			for (Object[] result3_black : Class1Impl
					.pattern_Class1_2_3_blackB(jMethod)) {
				Object[] result3_green = Class1Impl
						.pattern_Class1_2_3_greenBF(jMethod);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				// solve CSP
				Object[] result4_bindingAndBlack = Class1Impl
						.pattern_Class1_2_4_bindingAndBlackFBBB(this,
								isApplicableMatch, jMethod);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Class1Impl.pattern_Class1_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Class1Impl
							.pattern_Class1_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					Class1Impl.pattern_Class1_2_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return Class1Impl.pattern_Class1_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			ExtendedClassMethod jMethod) {
		match.registerObject("jMethod", jMethod);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			ExtendedClassMethod jMethod) {// Create CSP
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
			ExtendedClassMethod jMethod) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jMethod", jMethod);
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
			EObject jMethod, EObject tMethodDefinition,
			EObject jMethodToTMethodDefinition) {
		ruleresult.registerObject("jMethod", jMethod);
		ruleresult.registerObject("tMethodDefinition", tMethodDefinition);
		ruleresult.registerObject("jMethodToTMethodDefinition",
				jMethodToTMethodDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match
				.getObject("jMethod")
				.eClass()
				.equals(ExtendedJamopp.ExtendedJamoppPackage.eINSTANCE
						.getExtendedClassMethod());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match,
			TMethodDefinition tMethodDefinition) {
		// initial bindings
		Object[] result1_black = Class1Impl.pattern_Class1_10_1_blackBBB(this,
				match, tMethodDefinition);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Class1Impl
				.pattern_Class1_10_2_bindingAndBlackFBBB(this, match,
						tMethodDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Class1Impl.pattern_Class1_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Class1Impl.pattern_Class1_10_4_blackBB(
					match, tMethodDefinition);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			Class1Impl.pattern_Class1_10_4_greenBB(match, tMethodDefinition);

			// collect context elements
			Object[] result5_black = Class1Impl.pattern_Class1_10_5_blackBB(
					match, tMethodDefinition);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			// register objects to match
			Class1Impl.pattern_Class1_10_6_expressionBBB(this, match,
					tMethodDefinition);
			return Class1Impl.pattern_Class1_10_7_expressionF();
		} else {
			return Class1Impl.pattern_Class1_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Class1Impl
				.pattern_Class1_11_1_bindingAndBlackFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result1_bindingAndBlack[0];
		// CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl
				.pattern_Class1_11_1_greenFBF(tMethodDefinition);
		ExtendedClassMethod jMethod = (ExtendedClassMethod) result1_green[0];
		ClassMethodToTMethodDefinition jMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) result1_green[2];

		// collect translated elements
		Object[] result2_black = Class1Impl.pattern_Class1_11_2_blackBBB(
				jMethod, tMethodDefinition, jMethodToTMethodDefinition);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = Class1Impl.pattern_Class1_11_2_greenFBBB(
				jMethod, tMethodDefinition, jMethodToTMethodDefinition);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Class1Impl.pattern_Class1_11_3_blackBBBB(
				ruleresult, jMethod, tMethodDefinition,
				jMethodToTMethodDefinition);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		Class1Impl.pattern_Class1_11_3_greenBBBBFF(ruleresult, jMethod,
				tMethodDefinition, jMethodToTMethodDefinition);
		// EMoflonEdge jMethodToTMethodDefinition__jMethod____source = (EMoflonEdge) result3_green[4];
		// EMoflonEdge jMethodToTMethodDefinition__tMethodDefinition____target = (EMoflonEdge) result3_green[5];

		// perform postprocessing story node is empty
		// register objects
		Class1Impl.pattern_Class1_11_5_expressionBBBBB(this, ruleresult,
				jMethod, tMethodDefinition, jMethodToTMethodDefinition);
		return Class1Impl.pattern_Class1_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl
				.pattern_Class1_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl
				.pattern_Class1_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Class1Impl
				.pattern_Class1_12_2_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_binding[0];
		for (Object[] result2_black : Class1Impl.pattern_Class1_12_2_blackBB(
				tMethodDefinition, match)) {
			// ForEach find context
			for (Object[] result3_black : Class1Impl
					.pattern_Class1_12_3_blackB(tMethodDefinition)) {
				Object[] result3_green = Class1Impl
						.pattern_Class1_12_3_greenBF(tMethodDefinition);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				// solve CSP
				Object[] result4_bindingAndBlack = Class1Impl
						.pattern_Class1_12_4_bindingAndBlackFBBB(this,
								isApplicableMatch, tMethodDefinition);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Class1Impl.pattern_Class1_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Class1Impl
							.pattern_Class1_12_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					Class1Impl.pattern_Class1_12_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return Class1Impl.pattern_Class1_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			TMethodDefinition tMethodDefinition) {
		match.registerObject("tMethodDefinition", tMethodDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			TMethodDefinition tMethodDefinition) {// Create CSP
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
			TMethodDefinition tMethodDefinition) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch
				.registerObject("tMethodDefinition", tMethodDefinition);
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
			EObject jMethod, EObject tMethodDefinition,
			EObject jMethodToTMethodDefinition) {
		ruleresult.registerObject("jMethod", jMethod);
		ruleresult.registerObject("tMethodDefinition", tMethodDefinition);
		ruleresult.registerObject("jMethodToTMethodDefinition",
				jMethodToTMethodDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("tMethodDefinition")
				.eClass()
				.equals(TypeGraphBasic.TypeGraphBasicPackage.eINSTANCE
						.getTMethodDefinition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_ExtendedClassMethod_0(
			ExtendedClassMethod jMethod) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl
				.pattern_Class1_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl.pattern_Class1_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Class1Impl
				.pattern_Class1_20_2_blackB(jMethod)) {
			Object[] result2_green = Class1Impl
					.pattern_Class1_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Class1Impl.pattern_Class1_20_3_expressionFBBB(this, match,
					jMethod)) {
				// Ensure that the correct types of elements are matched
				if (Class1Impl.pattern_Class1_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Class1Impl
							.pattern_Class1_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					Class1Impl.pattern_Class1_20_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Class1Impl.pattern_Class1_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_TMethodDefinition_0(
			TMethodDefinition tMethodDefinition) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl
				.pattern_Class1_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl.pattern_Class1_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Class1Impl
				.pattern_Class1_21_2_blackB(tMethodDefinition)) {
			Object[] result2_green = Class1Impl
					.pattern_Class1_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Class1Impl.pattern_Class1_21_3_expressionFBBB(this, match,
					tMethodDefinition)) {
				// Ensure that the correct types of elements are matched
				if (Class1Impl.pattern_Class1_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Class1Impl
							.pattern_Class1_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					Class1Impl.pattern_Class1_21_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Class1Impl.pattern_Class1_21_6_expressionFB(__result);
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
		case RulesPackage.CLASS1___IS_APPROPRIATE_FWD__MATCH_EXTENDEDCLASSMETHOD:
			return isAppropriate_FWD((Match) arguments.get(0),
					(ExtendedClassMethod) arguments.get(1));
		case RulesPackage.CLASS1___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS1___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDCLASSMETHOD:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(ExtendedClassMethod) arguments.get(1));
			return null;
		case RulesPackage.CLASS1___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDCLASSMETHOD:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(ExtendedClassMethod) arguments.get(1));
		case RulesPackage.CLASS1___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDCLASSMETHOD:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedClassMethod) arguments.get(1));
		case RulesPackage.CLASS1___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS1___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3));
			return null;
		case RulesPackage.CLASS1___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPROPRIATE_BWD__MATCH_TMETHODDEFINITION:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TMethodDefinition) arguments.get(1));
		case RulesPackage.CLASS1___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS1___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODDEFINITION:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TMethodDefinition) arguments.get(1));
			return null;
		case RulesPackage.CLASS1___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODDEFINITION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TMethodDefinition) arguments.get(1));
		case RulesPackage.CLASS1___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMETHODDEFINITION:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(TMethodDefinition) arguments.get(1));
		case RulesPackage.CLASS1___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS1___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3));
			return null;
		case RulesPackage.CLASS1___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPROPRIATE_FWD_EXTENDED_CLASS_METHOD_0__EXTENDEDCLASSMETHOD:
			return isAppropriate_FWD_ExtendedClassMethod_0((ExtendedClassMethod) arguments
					.get(0));
		case RulesPackage.CLASS1___IS_APPROPRIATE_BWD_TMETHOD_DEFINITION_0__TMETHODDEFINITION:
			return isAppropriate_BWD_TMethodDefinition_0((TMethodDefinition) arguments
					.get(0));
		case RulesPackage.CLASS1___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS1___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Class1_0_1_blackBBB(Class1 _this,
			Match match, ExtendedClassMethod jMethod) {
		return new Object[] { _this, match, jMethod };
	}

	public static final Object[] pattern_Class1_0_2_bindingFBBB(Class1 _this,
			Match match, ExtendedClassMethod jMethod) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, jMethod);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jMethod };
		}
		return null;
	}

	public static final Object[] pattern_Class1_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_0_2_bindingAndBlackFBBB(
			Class1 _this, Match match, ExtendedClassMethod jMethod) {
		Object[] result_pattern_Class1_0_2_binding = pattern_Class1_0_2_bindingFBBB(
				_this, match, jMethod);
		if (result_pattern_Class1_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_0_2_binding[0];

			Object[] result_pattern_Class1_0_2_black = pattern_Class1_0_2_blackB(csp);
			if (result_pattern_Class1_0_2_black != null) {

				return new Object[] { csp, _this, match, jMethod };
			}
		}
		return null;
	}

	public static final boolean pattern_Class1_0_3_expressionFBB(Class1 _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_0_4_blackBB(Match match,
			ExtendedClassMethod jMethod) {
		return new Object[] { match, jMethod };
	}

	public static final Object[] pattern_Class1_0_4_greenBB(Match match,
			ExtendedClassMethod jMethod) {
		match.getToBeTranslatedNodes().add(jMethod);
		return new Object[] { match, jMethod };
	}

	public static final Object[] pattern_Class1_0_5_blackBB(Match match,
			ExtendedClassMethod jMethod) {
		return new Object[] { match, jMethod };
	}

	public static final void pattern_Class1_0_6_expressionBBB(Class1 _this,
			Match match, ExtendedClassMethod jMethod) {
		_this.registerObjectsToMatch_FWD(match, jMethod);

	}

	public static final boolean pattern_Class1_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Class1_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Class1_1_1_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jMethod");
		EObject tmpJMethod = _localVariable_0;
		if (tmpJMethod instanceof ExtendedClassMethod) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
			return new Object[] { jMethod, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_Class1_1_1_blackBFBB(
			ExtendedClassMethod jMethod, Class1 _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jMethod, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_1_1_bindingAndBlackFFBB(
			Class1 _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Class1_1_1_binding = pattern_Class1_1_1_bindingFB(isApplicableMatch);
		if (result_pattern_Class1_1_1_binding != null) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) result_pattern_Class1_1_1_binding[0];

			Object[] result_pattern_Class1_1_1_black = pattern_Class1_1_1_blackBFBB(
					jMethod, _this, isApplicableMatch);
			if (result_pattern_Class1_1_1_black != null) {
				CSP csp = (CSP) result_pattern_Class1_1_1_black[1];

				return new Object[] { jMethod, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_1_1_greenBFF(
			ExtendedClassMethod jMethod) {
		TMethodDefinition tMethodDefinition = TypeGraphBasicFactory.eINSTANCE
				.createTMethodDefinition();
		ClassMethodToTMethodDefinition jMethodToTMethodDefinition = GravityTGGFactory.eINSTANCE
				.createClassMethodToTMethodDefinition();
		jMethodToTMethodDefinition.setSource(jMethod);
		jMethodToTMethodDefinition.setTarget(tMethodDefinition);
		return new Object[] { jMethod, tMethodDefinition,
				jMethodToTMethodDefinition };
	}

	public static final Object[] pattern_Class1_1_2_blackBBB(
			ExtendedClassMethod jMethod, TMethodDefinition tMethodDefinition,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition) {
		return new Object[] { jMethod, tMethodDefinition,
				jMethodToTMethodDefinition };
	}

	public static final Object[] pattern_Class1_1_2_greenFBBB(
			ExtendedClassMethod jMethod, TMethodDefinition tMethodDefinition,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(jMethod);
		ruleresult.getCreatedElements().add(tMethodDefinition);
		ruleresult.getCreatedLinkElements().add(jMethodToTMethodDefinition);
		return new Object[] { ruleresult, jMethod, tMethodDefinition,
				jMethodToTMethodDefinition };
	}

	public static final Object[] pattern_Class1_1_3_blackBBBB(
			PerformRuleResult ruleresult, EObject jMethod,
			EObject tMethodDefinition, EObject jMethodToTMethodDefinition) {
		if (!jMethod.equals(tMethodDefinition)) {
			if (!jMethod.equals(jMethodToTMethodDefinition)) {
				if (!jMethodToTMethodDefinition.equals(tMethodDefinition)) {
					return new Object[] { ruleresult, jMethod,
							tMethodDefinition, jMethodToTMethodDefinition };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_1_3_greenBBBBFF(
			PerformRuleResult ruleresult, EObject jMethod,
			EObject tMethodDefinition, EObject jMethodToTMethodDefinition) {
		EMoflonEdge jMethodToTMethodDefinition__jMethod____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodDefinition__tMethodDefinition____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Class1";
		String jMethodToTMethodDefinition__jMethod____source_name_prime = "source";
		String jMethodToTMethodDefinition__tMethodDefinition____target_name_prime = "target";
		jMethodToTMethodDefinition__jMethod____source
				.setSrc(jMethodToTMethodDefinition);
		jMethodToTMethodDefinition__jMethod____source.setTrg(jMethod);
		ruleresult.getCreatedEdges().add(
				jMethodToTMethodDefinition__jMethod____source);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setSrc(jMethodToTMethodDefinition);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setTrg(tMethodDefinition);
		ruleresult.getCreatedEdges().add(
				jMethodToTMethodDefinition__tMethodDefinition____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jMethodToTMethodDefinition__jMethod____source
				.setName(jMethodToTMethodDefinition__jMethod____source_name_prime);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setName(jMethodToTMethodDefinition__tMethodDefinition____target_name_prime);
		return new Object[] { ruleresult, jMethod, tMethodDefinition,
				jMethodToTMethodDefinition,
				jMethodToTMethodDefinition__jMethod____source,
				jMethodToTMethodDefinition__tMethodDefinition____target };
	}

	public static final void pattern_Class1_1_5_expressionBBBBB(Class1 _this,
			PerformRuleResult ruleresult, EObject jMethod,
			EObject tMethodDefinition, EObject jMethodToTMethodDefinition) {
		_this.registerObjects_FWD(ruleresult, jMethod, tMethodDefinition,
				jMethodToTMethodDefinition);

	}

	public static final PerformRuleResult pattern_Class1_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Class1_2_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_2_1_blackFBB(EClass eClass,
			Class1 _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_2_1_bindingAndBlackFFB(
			Class1 _this) {
		Object[] result_pattern_Class1_2_1_binding = pattern_Class1_2_1_bindingFB(_this);
		if (result_pattern_Class1_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Class1_2_1_binding[0];

			Object[] result_pattern_Class1_2_1_black = pattern_Class1_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_Class1_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Class1_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Class1";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Class1_2_2_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("jMethod");
		EObject tmpJMethod = _localVariable_0;
		if (tmpJMethod instanceof ExtendedClassMethod) {
			ExtendedClassMethod jMethod = (ExtendedClassMethod) tmpJMethod;
			return new Object[] { jMethod, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Class1_2_2_blackBB(
			ExtendedClassMethod jMethod, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { jMethod, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_Class1_2_3_blackB(
			ExtendedClassMethod jMethod) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { jMethod });
		return _result;
	}

	public static final Object[] pattern_Class1_2_3_greenBF(
			ExtendedClassMethod jMethod) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(jMethod);
		return new Object[] { jMethod, isApplicableMatch };
	}

	public static final Object[] pattern_Class1_2_4_bindingFBBB(Class1 _this,
			IsApplicableMatch isApplicableMatch, ExtendedClassMethod jMethod) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, jMethod);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jMethod };
		}
		return null;
	}

	public static final Object[] pattern_Class1_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_2_4_bindingAndBlackFBBB(
			Class1 _this, IsApplicableMatch isApplicableMatch,
			ExtendedClassMethod jMethod) {
		Object[] result_pattern_Class1_2_4_binding = pattern_Class1_2_4_bindingFBBB(
				_this, isApplicableMatch, jMethod);
		if (result_pattern_Class1_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_2_4_binding[0];

			Object[] result_pattern_Class1_2_4_black = pattern_Class1_2_4_blackB(csp);
			if (result_pattern_Class1_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jMethod };
			}
		}
		return null;
	}

	public static final boolean pattern_Class1_2_5_expressionFBB(Class1 _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Class1_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Class1";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Class1_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Class1_10_1_blackBBB(Class1 _this,
			Match match, TMethodDefinition tMethodDefinition) {
		return new Object[] { _this, match, tMethodDefinition };
	}

	public static final Object[] pattern_Class1_10_2_bindingFBBB(Class1 _this,
			Match match, TMethodDefinition tMethodDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				tMethodDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tMethodDefinition };
		}
		return null;
	}

	public static final Object[] pattern_Class1_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_10_2_bindingAndBlackFBBB(
			Class1 _this, Match match, TMethodDefinition tMethodDefinition) {
		Object[] result_pattern_Class1_10_2_binding = pattern_Class1_10_2_bindingFBBB(
				_this, match, tMethodDefinition);
		if (result_pattern_Class1_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_10_2_binding[0];

			Object[] result_pattern_Class1_10_2_black = pattern_Class1_10_2_blackB(csp);
			if (result_pattern_Class1_10_2_black != null) {

				return new Object[] { csp, _this, match, tMethodDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_Class1_10_3_expressionFBB(Class1 _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_10_4_blackBB(Match match,
			TMethodDefinition tMethodDefinition) {
		return new Object[] { match, tMethodDefinition };
	}

	public static final Object[] pattern_Class1_10_4_greenBB(Match match,
			TMethodDefinition tMethodDefinition) {
		match.getToBeTranslatedNodes().add(tMethodDefinition);
		return new Object[] { match, tMethodDefinition };
	}

	public static final Object[] pattern_Class1_10_5_blackBB(Match match,
			TMethodDefinition tMethodDefinition) {
		return new Object[] { match, tMethodDefinition };
	}

	public static final void pattern_Class1_10_6_expressionBBB(Class1 _this,
			Match match, TMethodDefinition tMethodDefinition) {
		_this.registerObjectsToMatch_BWD(match, tMethodDefinition);

	}

	public static final boolean pattern_Class1_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Class1_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Class1_11_1_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("tMethodDefinition");
		EObject tmpTMethodDefinition = _localVariable_0;
		if (tmpTMethodDefinition instanceof TMethodDefinition) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
			return new Object[] { tMethodDefinition, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_Class1_11_1_blackBFBB(
			TMethodDefinition tMethodDefinition, Class1 _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tMethodDefinition, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_11_1_bindingAndBlackFFBB(
			Class1 _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Class1_11_1_binding = pattern_Class1_11_1_bindingFB(isApplicableMatch);
		if (result_pattern_Class1_11_1_binding != null) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result_pattern_Class1_11_1_binding[0];

			Object[] result_pattern_Class1_11_1_black = pattern_Class1_11_1_blackBFBB(
					tMethodDefinition, _this, isApplicableMatch);
			if (result_pattern_Class1_11_1_black != null) {
				CSP csp = (CSP) result_pattern_Class1_11_1_black[1];

				return new Object[] { tMethodDefinition, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_11_1_greenFBF(
			TMethodDefinition tMethodDefinition) {
		ExtendedClassMethod jMethod = ExtendedJamoppFactory.eINSTANCE
				.createExtendedClassMethod();
		ClassMethodToTMethodDefinition jMethodToTMethodDefinition = GravityTGGFactory.eINSTANCE
				.createClassMethodToTMethodDefinition();
		jMethodToTMethodDefinition.setSource(jMethod);
		jMethodToTMethodDefinition.setTarget(tMethodDefinition);
		return new Object[] { jMethod, tMethodDefinition,
				jMethodToTMethodDefinition };
	}

	public static final Object[] pattern_Class1_11_2_blackBBB(
			ExtendedClassMethod jMethod, TMethodDefinition tMethodDefinition,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition) {
		return new Object[] { jMethod, tMethodDefinition,
				jMethodToTMethodDefinition };
	}

	public static final Object[] pattern_Class1_11_2_greenFBBB(
			ExtendedClassMethod jMethod, TMethodDefinition tMethodDefinition,
			ClassMethodToTMethodDefinition jMethodToTMethodDefinition) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(jMethod);
		ruleresult.getTranslatedElements().add(tMethodDefinition);
		ruleresult.getCreatedLinkElements().add(jMethodToTMethodDefinition);
		return new Object[] { ruleresult, jMethod, tMethodDefinition,
				jMethodToTMethodDefinition };
	}

	public static final Object[] pattern_Class1_11_3_blackBBBB(
			PerformRuleResult ruleresult, EObject jMethod,
			EObject tMethodDefinition, EObject jMethodToTMethodDefinition) {
		if (!jMethod.equals(tMethodDefinition)) {
			if (!jMethod.equals(jMethodToTMethodDefinition)) {
				if (!jMethodToTMethodDefinition.equals(tMethodDefinition)) {
					return new Object[] { ruleresult, jMethod,
							tMethodDefinition, jMethodToTMethodDefinition };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_11_3_greenBBBBFF(
			PerformRuleResult ruleresult, EObject jMethod,
			EObject tMethodDefinition, EObject jMethodToTMethodDefinition) {
		EMoflonEdge jMethodToTMethodDefinition__jMethod____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethodDefinition__tMethodDefinition____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Class1";
		String jMethodToTMethodDefinition__jMethod____source_name_prime = "source";
		String jMethodToTMethodDefinition__tMethodDefinition____target_name_prime = "target";
		jMethodToTMethodDefinition__jMethod____source
				.setSrc(jMethodToTMethodDefinition);
		jMethodToTMethodDefinition__jMethod____source.setTrg(jMethod);
		ruleresult.getCreatedEdges().add(
				jMethodToTMethodDefinition__jMethod____source);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setSrc(jMethodToTMethodDefinition);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setTrg(tMethodDefinition);
		ruleresult.getCreatedEdges().add(
				jMethodToTMethodDefinition__tMethodDefinition____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jMethodToTMethodDefinition__jMethod____source
				.setName(jMethodToTMethodDefinition__jMethod____source_name_prime);
		jMethodToTMethodDefinition__tMethodDefinition____target
				.setName(jMethodToTMethodDefinition__tMethodDefinition____target_name_prime);
		return new Object[] { ruleresult, jMethod, tMethodDefinition,
				jMethodToTMethodDefinition,
				jMethodToTMethodDefinition__jMethod____source,
				jMethodToTMethodDefinition__tMethodDefinition____target };
	}

	public static final void pattern_Class1_11_5_expressionBBBBB(Class1 _this,
			PerformRuleResult ruleresult, EObject jMethod,
			EObject tMethodDefinition, EObject jMethodToTMethodDefinition) {
		_this.registerObjects_BWD(ruleresult, jMethod, tMethodDefinition,
				jMethodToTMethodDefinition);

	}

	public static final PerformRuleResult pattern_Class1_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Class1_12_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_12_1_blackFBB(EClass eClass,
			Class1 _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_12_1_bindingAndBlackFFB(
			Class1 _this) {
		Object[] result_pattern_Class1_12_1_binding = pattern_Class1_12_1_bindingFB(_this);
		if (result_pattern_Class1_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Class1_12_1_binding[0];

			Object[] result_pattern_Class1_12_1_black = pattern_Class1_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_Class1_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Class1_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Class1";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Class1_12_2_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("tMethodDefinition");
		EObject tmpTMethodDefinition = _localVariable_0;
		if (tmpTMethodDefinition instanceof TMethodDefinition) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
			return new Object[] { tMethodDefinition, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Class1_12_2_blackBB(
			TMethodDefinition tMethodDefinition, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { tMethodDefinition, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_Class1_12_3_blackB(
			TMethodDefinition tMethodDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { tMethodDefinition });
		return _result;
	}

	public static final Object[] pattern_Class1_12_3_greenBF(
			TMethodDefinition tMethodDefinition) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(tMethodDefinition);
		return new Object[] { tMethodDefinition, isApplicableMatch };
	}

	public static final Object[] pattern_Class1_12_4_bindingFBBB(Class1 _this,
			IsApplicableMatch isApplicableMatch,
			TMethodDefinition tMethodDefinition) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, tMethodDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					tMethodDefinition };
		}
		return null;
	}

	public static final Object[] pattern_Class1_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_12_4_bindingAndBlackFBBB(
			Class1 _this, IsApplicableMatch isApplicableMatch,
			TMethodDefinition tMethodDefinition) {
		Object[] result_pattern_Class1_12_4_binding = pattern_Class1_12_4_bindingFBBB(
				_this, isApplicableMatch, tMethodDefinition);
		if (result_pattern_Class1_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_12_4_binding[0];

			Object[] result_pattern_Class1_12_4_black = pattern_Class1_12_4_blackB(csp);
			if (result_pattern_Class1_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						tMethodDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_Class1_12_5_expressionFBB(Class1 _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Class1_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Class1";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Class1_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Class1_20_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_20_1_blackFBB(EClass __eClass,
			Class1 _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_20_1_bindingAndBlackFFB(
			Class1 _this) {
		Object[] result_pattern_Class1_20_1_binding = pattern_Class1_20_1_bindingFB(_this);
		if (result_pattern_Class1_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Class1_20_1_binding[0];

			Object[] result_pattern_Class1_20_1_black = pattern_Class1_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Class1_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Class1_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Class1_20_2_blackB(
			ExtendedClassMethod jMethod) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { jMethod });
		return _result;
	}

	public static final Object[] pattern_Class1_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Class1_20_3_expressionFBBB(
			Class1 _this, Match match, ExtendedClassMethod jMethod) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jMethod);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Class1_20_4_expressionFBB(Class1 _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_20_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Class1_20_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Class1_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Class1_21_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_21_1_blackFBB(EClass __eClass,
			Class1 _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_21_1_bindingAndBlackFFB(
			Class1 _this) {
		Object[] result_pattern_Class1_21_1_binding = pattern_Class1_21_1_bindingFB(_this);
		if (result_pattern_Class1_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Class1_21_1_binding[0];

			Object[] result_pattern_Class1_21_1_black = pattern_Class1_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Class1_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Class1_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Class1_21_2_blackB(
			TMethodDefinition tMethodDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { tMethodDefinition });
		return _result;
	}

	public static final Object[] pattern_Class1_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Class1_21_3_expressionFBBB(
			Class1 _this, Match match, TMethodDefinition tMethodDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match,
				tMethodDefinition);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Class1_21_4_expressionFBB(Class1 _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_21_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Class1_21_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Class1_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //Class1Impl
