/**
 */
package GravityTGG.Rules.impl;

import ExtendedJamopp.ExtendedJamoppFactory;
import ExtendedJamopp.ExtendedJamoppJavaContainer;
import ExtendedJamopp.ExtendedMethodName;

import GravityTGG.ExtendedJamoppJavaContainerToTypeGraph;
import GravityTGG.ExtendedMethodNameToTMethod;
import GravityTGG.GravityTGGFactory;

import GravityTGG.Rules.MethodNameCreate;
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
 * An implementation of the model object '<em><b>Method Name Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodNameCreateImpl extends AbstractRuleImpl implements
		MethodNameCreate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodNameCreateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodNameCreate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ExtendedMethodName jMethod,
			ExtendedJamoppJavaContainer ejjc) {
		// initial bindings
		Object[] result1_black = MethodNameCreateImpl
				.pattern_MethodNameCreate_0_1_blackBBBB(this, match, jMethod,
						ejjc);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodNameCreateImpl
				.pattern_MethodNameCreate_0_2_bindingAndBlackFBBBB(this, match,
						jMethod, ejjc);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodNameCreateImpl.pattern_MethodNameCreate_0_3_expressionFBB(
				this, csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodNameCreateImpl
					.pattern_MethodNameCreate_0_4_blackBBB(match, jMethod, ejjc);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			MethodNameCreateImpl.pattern_MethodNameCreate_0_4_greenBBBF(match,
					jMethod, ejjc);
			// EMoflonEdge ejjc__jMethod____extendedMethodName = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = MethodNameCreateImpl
					.pattern_MethodNameCreate_0_5_blackBBB(match, jMethod, ejjc);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			MethodNameCreateImpl.pattern_MethodNameCreate_0_5_greenBB(match,
					ejjc);

			// register objects to match
			MethodNameCreateImpl.pattern_MethodNameCreate_0_6_expressionBBBB(
					this, match, jMethod, ejjc);
			return MethodNameCreateImpl
					.pattern_MethodNameCreate_0_7_expressionF();
		} else {
			return MethodNameCreateImpl
					.pattern_MethodNameCreate_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodNameCreateImpl
				.pattern_MethodNameCreate_1_1_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedMethodName jMethod = (ExtendedMethodName) result1_bindingAndBlack[0];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[1];
		ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) result1_bindingAndBlack[2];
		ExtendedJamoppJavaContainerToTypeGraph ejjcToPg = (ExtendedJamoppJavaContainerToTypeGraph) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = MethodNameCreateImpl
				.pattern_MethodNameCreate_1_1_greenFBFBB(jMethod, pg, csp);
		ExtendedMethodNameToTMethod jMethodToTMethod = (ExtendedMethodNameToTMethod) result1_green[0];
		TMethod tMethod = (TMethod) result1_green[2];

		// collect translated elements
		Object[] result2_black = MethodNameCreateImpl
				.pattern_MethodNameCreate_1_2_blackBBB(jMethodToTMethod,
						jMethod, tMethod);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = MethodNameCreateImpl
				.pattern_MethodNameCreate_1_2_greenFBBB(jMethodToTMethod,
						jMethod, tMethod);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodNameCreateImpl
				.pattern_MethodNameCreate_1_3_blackBBBBBBB(ruleresult,
						jMethodToTMethod, jMethod, tMethod, pg, ejjc, ejjcToPg);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		MethodNameCreateImpl.pattern_MethodNameCreate_1_3_greenBBBBBBFFFF(
				ruleresult, jMethodToTMethod, jMethod, tMethod, pg, ejjc);
		// EMoflonEdge jMethodToTMethod__jMethod____source = (EMoflonEdge) result3_green[6];
		// EMoflonEdge jMethodToTMethod__tMethod____target = (EMoflonEdge) result3_green[7];
		// EMoflonEdge pg__tMethod____methods = (EMoflonEdge) result3_green[8];
		// EMoflonEdge ejjc__jMethod____extendedMethodName = (EMoflonEdge) result3_green[9];

		// perform postprocessing story node is empty
		// register objects
		MethodNameCreateImpl.pattern_MethodNameCreate_1_5_expressionBBBBBBBB(
				this, ruleresult, jMethodToTMethod, jMethod, tMethod, pg, ejjc,
				ejjcToPg);
		return MethodNameCreateImpl
				.pattern_MethodNameCreate_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodNameCreateImpl
				.pattern_MethodNameCreate_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodNameCreateImpl
				.pattern_MethodNameCreate_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodNameCreateImpl
				.pattern_MethodNameCreate_2_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		ExtendedMethodName jMethod = (ExtendedMethodName) result2_binding[0];
		ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) result2_binding[1];
		for (Object[] result2_black : MethodNameCreateImpl
				.pattern_MethodNameCreate_2_2_blackBFBFB(jMethod, ejjc, match)) {
			TypeGraph pg = (TypeGraph) result2_black[1];
			ExtendedJamoppJavaContainerToTypeGraph ejjcToPg = (ExtendedJamoppJavaContainerToTypeGraph) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : MethodNameCreateImpl
					.pattern_MethodNameCreate_2_3_blackBBBB(jMethod, pg, ejjc,
							ejjcToPg)) {
				Object[] result3_green = MethodNameCreateImpl
						.pattern_MethodNameCreate_2_3_greenBBBBFFFF(jMethod,
								pg, ejjc, ejjcToPg);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge ejjc__jMethod____extendedMethodName = (EMoflonEdge) result3_green[5];
				// EMoflonEdge ejjcToPg__ejjc____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge ejjcToPg__pg____target = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodNameCreateImpl
						.pattern_MethodNameCreate_2_4_bindingAndBlackFBBBBBB(
								this, isApplicableMatch, jMethod, pg, ejjc,
								ejjcToPg);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodNameCreateImpl
						.pattern_MethodNameCreate_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = MethodNameCreateImpl
							.pattern_MethodNameCreate_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					MethodNameCreateImpl.pattern_MethodNameCreate_2_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodNameCreateImpl
				.pattern_MethodNameCreate_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			ExtendedMethodName jMethod, ExtendedJamoppJavaContainer ejjc) {
		match.registerObject("jMethod", jMethod);
		match.registerObject("ejjc", ejjc);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			ExtendedMethodName jMethod, ExtendedJamoppJavaContainer ejjc) {// Create CSP
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
			ExtendedMethodName jMethod, TypeGraph pg,
			ExtendedJamoppJavaContainer ejjc,
			ExtendedJamoppJavaContainerToTypeGraph ejjcToPg) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_jMethod_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"jMethod.name", true, csp);
		var_jMethod_name.setValue(jMethod.getName());
		var_jMethod_name.setType("String");

		// Create unbound variables
		Variable var_tMethod_tName = CSPFactoryHelper.eINSTANCE.createVariable(
				"tMethod.tName", csp);
		var_tMethod_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_jMethod_name, var_tMethod_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jMethod", jMethod);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("ejjc", ejjc);
		isApplicableMatch.registerObject("ejjcToPg", ejjcToPg);
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
			EObject jMethodToTMethod, EObject jMethod, EObject tMethod,
			EObject pg, EObject ejjc, EObject ejjcToPg) {
		ruleresult.registerObject("jMethodToTMethod", jMethodToTMethod);
		ruleresult.registerObject("jMethod", jMethod);
		ruleresult.registerObject("tMethod", tMethod);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("ejjc", ejjc);
		ruleresult.registerObject("ejjcToPg", ejjcToPg);

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
						.getExtendedMethodName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TMethod tMethod, TypeGraph pg) {
		// initial bindings
		Object[] result1_black = MethodNameCreateImpl
				.pattern_MethodNameCreate_10_1_blackBBBB(this, match, tMethod,
						pg);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodNameCreateImpl
				.pattern_MethodNameCreate_10_2_bindingAndBlackFBBBB(this,
						match, tMethod, pg);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodNameCreateImpl.pattern_MethodNameCreate_10_3_expressionFBB(
				this, csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodNameCreateImpl
					.pattern_MethodNameCreate_10_4_blackBBB(match, tMethod, pg);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			MethodNameCreateImpl.pattern_MethodNameCreate_10_4_greenBBBF(match,
					tMethod, pg);
			// EMoflonEdge pg__tMethod____methods = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = MethodNameCreateImpl
					.pattern_MethodNameCreate_10_5_blackBBB(match, tMethod, pg);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			MethodNameCreateImpl.pattern_MethodNameCreate_10_5_greenBB(match,
					pg);

			// register objects to match
			MethodNameCreateImpl.pattern_MethodNameCreate_10_6_expressionBBBB(
					this, match, tMethod, pg);
			return MethodNameCreateImpl
					.pattern_MethodNameCreate_10_7_expressionF();
		} else {
			return MethodNameCreateImpl
					.pattern_MethodNameCreate_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodNameCreateImpl
				.pattern_MethodNameCreate_11_1_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		TMethod tMethod = (TMethod) result1_bindingAndBlack[0];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[1];
		ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) result1_bindingAndBlack[2];
		ExtendedJamoppJavaContainerToTypeGraph ejjcToPg = (ExtendedJamoppJavaContainerToTypeGraph) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = MethodNameCreateImpl
				.pattern_MethodNameCreate_11_1_greenFFBBB(tMethod, ejjc, csp);
		ExtendedMethodNameToTMethod jMethodToTMethod = (ExtendedMethodNameToTMethod) result1_green[0];
		ExtendedMethodName jMethod = (ExtendedMethodName) result1_green[1];

		// collect translated elements
		Object[] result2_black = MethodNameCreateImpl
				.pattern_MethodNameCreate_11_2_blackBBB(jMethodToTMethod,
						jMethod, tMethod);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = MethodNameCreateImpl
				.pattern_MethodNameCreate_11_2_greenFBBB(jMethodToTMethod,
						jMethod, tMethod);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodNameCreateImpl
				.pattern_MethodNameCreate_11_3_blackBBBBBBB(ruleresult,
						jMethodToTMethod, jMethod, tMethod, pg, ejjc, ejjcToPg);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		MethodNameCreateImpl.pattern_MethodNameCreate_11_3_greenBBBBBBFFFF(
				ruleresult, jMethodToTMethod, jMethod, tMethod, pg, ejjc);
		// EMoflonEdge jMethodToTMethod__jMethod____source = (EMoflonEdge) result3_green[6];
		// EMoflonEdge jMethodToTMethod__tMethod____target = (EMoflonEdge) result3_green[7];
		// EMoflonEdge pg__tMethod____methods = (EMoflonEdge) result3_green[8];
		// EMoflonEdge ejjc__jMethod____extendedMethodName = (EMoflonEdge) result3_green[9];

		// perform postprocessing story node is empty
		// register objects
		MethodNameCreateImpl.pattern_MethodNameCreate_11_5_expressionBBBBBBBB(
				this, ruleresult, jMethodToTMethod, jMethod, tMethod, pg, ejjc,
				ejjcToPg);
		return MethodNameCreateImpl
				.pattern_MethodNameCreate_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodNameCreateImpl
				.pattern_MethodNameCreate_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodNameCreateImpl
				.pattern_MethodNameCreate_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodNameCreateImpl
				.pattern_MethodNameCreate_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		TMethod tMethod = (TMethod) result2_binding[0];
		TypeGraph pg = (TypeGraph) result2_binding[1];
		for (Object[] result2_black : MethodNameCreateImpl
				.pattern_MethodNameCreate_12_2_blackBBFFB(tMethod, pg, match)) {
			ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) result2_black[2];
			ExtendedJamoppJavaContainerToTypeGraph ejjcToPg = (ExtendedJamoppJavaContainerToTypeGraph) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : MethodNameCreateImpl
					.pattern_MethodNameCreate_12_3_blackBBBB(tMethod, pg, ejjc,
							ejjcToPg)) {
				Object[] result3_green = MethodNameCreateImpl
						.pattern_MethodNameCreate_12_3_greenBBBBFFFF(tMethod,
								pg, ejjc, ejjcToPg);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge pg__tMethod____methods = (EMoflonEdge) result3_green[5];
				// EMoflonEdge ejjcToPg__ejjc____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge ejjcToPg__pg____target = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodNameCreateImpl
						.pattern_MethodNameCreate_12_4_bindingAndBlackFBBBBBB(
								this, isApplicableMatch, tMethod, pg, ejjc,
								ejjcToPg);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodNameCreateImpl
						.pattern_MethodNameCreate_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = MethodNameCreateImpl
							.pattern_MethodNameCreate_12_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					MethodNameCreateImpl.pattern_MethodNameCreate_12_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodNameCreateImpl
				.pattern_MethodNameCreate_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TMethod tMethod,
			TypeGraph pg) {
		match.registerObject("tMethod", tMethod);
		match.registerObject("pg", pg);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMethod tMethod,
			TypeGraph pg) {// Create CSP
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
			TMethod tMethod, TypeGraph pg, ExtendedJamoppJavaContainer ejjc,
			ExtendedJamoppJavaContainerToTypeGraph ejjcToPg) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tMethod_tName = CSPFactoryHelper.eINSTANCE.createVariable(
				"tMethod.tName", true, csp);
		var_tMethod_tName.setValue(tMethod.getTName());
		var_tMethod_tName.setType("String");

		// Create unbound variables
		Variable var_jMethod_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"jMethod.name", csp);
		var_jMethod_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_jMethod_name, var_tMethod_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tMethod", tMethod);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("ejjc", ejjc);
		isApplicableMatch.registerObject("ejjcToPg", ejjcToPg);
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
			EObject jMethodToTMethod, EObject jMethod, EObject tMethod,
			EObject pg, EObject ejjc, EObject ejjcToPg) {
		ruleresult.registerObject("jMethodToTMethod", jMethodToTMethod);
		ruleresult.registerObject("jMethod", jMethod);
		ruleresult.registerObject("tMethod", tMethod);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("ejjc", ejjc);
		ruleresult.registerObject("ejjcToPg", ejjcToPg);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("tMethod")
				.eClass()
				.equals(TypeGraphBasic.TypeGraphBasicPackage.eINSTANCE
						.getTMethod());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_31(
			EMoflonEdge _edge_methods) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodNameCreateImpl
				.pattern_MethodNameCreate_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodNameCreateImpl
				.pattern_MethodNameCreate_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodNameCreateImpl
				.pattern_MethodNameCreate_20_2_blackFFB(_edge_methods)) {
			TMethod tMethod = (TMethod) result2_black[0];
			TypeGraph pg = (TypeGraph) result2_black[1];
			Object[] result2_green = MethodNameCreateImpl
					.pattern_MethodNameCreate_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodNameCreateImpl
					.pattern_MethodNameCreate_20_3_expressionFBBBB(this, match,
							tMethod, pg)) {
				// Ensure that the correct types of elements are matched
				if (MethodNameCreateImpl
						.pattern_MethodNameCreate_20_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = MethodNameCreateImpl
							.pattern_MethodNameCreate_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					MethodNameCreateImpl
							.pattern_MethodNameCreate_20_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return MethodNameCreateImpl
				.pattern_MethodNameCreate_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_21(
			EMoflonEdge _edge_extendedMethodName) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodNameCreateImpl
				.pattern_MethodNameCreate_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodNameCreateImpl
				.pattern_MethodNameCreate_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodNameCreateImpl
				.pattern_MethodNameCreate_21_2_blackFFB(_edge_extendedMethodName)) {
			ExtendedMethodName jMethod = (ExtendedMethodName) result2_black[0];
			ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) result2_black[1];
			Object[] result2_green = MethodNameCreateImpl
					.pattern_MethodNameCreate_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodNameCreateImpl
					.pattern_MethodNameCreate_21_3_expressionFBBBB(this, match,
							jMethod, ejjc)) {
				// Ensure that the correct types of elements are matched
				if (MethodNameCreateImpl
						.pattern_MethodNameCreate_21_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = MethodNameCreateImpl
							.pattern_MethodNameCreate_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					MethodNameCreateImpl
							.pattern_MethodNameCreate_21_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return MethodNameCreateImpl
				.pattern_MethodNameCreate_21_6_expressionFB(__result);
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
		case RulesPackage.METHOD_NAME_CREATE___IS_APPROPRIATE_FWD__MATCH_EXTENDEDMETHODNAME_EXTENDEDJAMOPPJAVACONTAINER:
			return isAppropriate_FWD((Match) arguments.get(0),
					(ExtendedMethodName) arguments.get(1),
					(ExtendedJamoppJavaContainer) arguments.get(2));
		case RulesPackage.METHOD_NAME_CREATE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_NAME_CREATE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_NAME_CREATE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDMETHODNAME_EXTENDEDJAMOPPJAVACONTAINER:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(ExtendedMethodName) arguments.get(1),
					(ExtendedJamoppJavaContainer) arguments.get(2));
			return null;
		case RulesPackage.METHOD_NAME_CREATE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDMETHODNAME_EXTENDEDJAMOPPJAVACONTAINER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(ExtendedMethodName) arguments.get(1),
					(ExtendedJamoppJavaContainer) arguments.get(2));
		case RulesPackage.METHOD_NAME_CREATE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_NAME_CREATE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDMETHODNAME_TYPEGRAPH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPJAVACONTAINERTOTYPEGRAPH:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedMethodName) arguments.get(1),
					(TypeGraph) arguments.get(2),
					(ExtendedJamoppJavaContainer) arguments.get(3),
					(ExtendedJamoppJavaContainerToTypeGraph) arguments.get(4));
		case RulesPackage.METHOD_NAME_CREATE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_NAME_CREATE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.METHOD_NAME_CREATE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_NAME_CREATE___IS_APPROPRIATE_BWD__MATCH_TMETHOD_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TMethod) arguments.get(1), (TypeGraph) arguments.get(2));
		case RulesPackage.METHOD_NAME_CREATE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_NAME_CREATE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_NAME_CREATE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHOD_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TMethod) arguments.get(1), (TypeGraph) arguments.get(2));
			return null;
		case RulesPackage.METHOD_NAME_CREATE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHOD_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TMethod) arguments.get(1), (TypeGraph) arguments.get(2));
		case RulesPackage.METHOD_NAME_CREATE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_NAME_CREATE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMETHOD_TYPEGRAPH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPJAVACONTAINERTOTYPEGRAPH:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(TMethod) arguments.get(1), (TypeGraph) arguments.get(2),
					(ExtendedJamoppJavaContainer) arguments.get(3),
					(ExtendedJamoppJavaContainerToTypeGraph) arguments.get(4));
		case RulesPackage.METHOD_NAME_CREATE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_NAME_CREATE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.METHOD_NAME_CREATE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_NAME_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_31__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_31((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.METHOD_NAME_CREATE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_21__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_21((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.METHOD_NAME_CREATE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_NAME_CREATE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodNameCreate_0_1_blackBBBB(
			MethodNameCreate _this, Match match, ExtendedMethodName jMethod,
			ExtendedJamoppJavaContainer ejjc) {
		return new Object[] { _this, match, jMethod, ejjc };
	}

	public static final Object[] pattern_MethodNameCreate_0_2_bindingFBBBB(
			MethodNameCreate _this, Match match, ExtendedMethodName jMethod,
			ExtendedJamoppJavaContainer ejjc) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, jMethod,
				ejjc);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jMethod, ejjc };
		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodNameCreate_0_2_bindingAndBlackFBBBB(
			MethodNameCreate _this, Match match, ExtendedMethodName jMethod,
			ExtendedJamoppJavaContainer ejjc) {
		Object[] result_pattern_MethodNameCreate_0_2_binding = pattern_MethodNameCreate_0_2_bindingFBBBB(
				_this, match, jMethod, ejjc);
		if (result_pattern_MethodNameCreate_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_MethodNameCreate_0_2_binding[0];

			Object[] result_pattern_MethodNameCreate_0_2_black = pattern_MethodNameCreate_0_2_blackB(csp);
			if (result_pattern_MethodNameCreate_0_2_black != null) {

				return new Object[] { csp, _this, match, jMethod, ejjc };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodNameCreate_0_3_expressionFBB(
			MethodNameCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodNameCreate_0_4_blackBBB(
			Match match, ExtendedMethodName jMethod,
			ExtendedJamoppJavaContainer ejjc) {
		return new Object[] { match, jMethod, ejjc };
	}

	public static final Object[] pattern_MethodNameCreate_0_4_greenBBBF(
			Match match, ExtendedMethodName jMethod,
			ExtendedJamoppJavaContainer ejjc) {
		EMoflonEdge ejjc__jMethod____extendedMethodName = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(jMethod);
		String ejjc__jMethod____extendedMethodName_name_prime = "extendedMethodName";
		ejjc__jMethod____extendedMethodName.setSrc(ejjc);
		ejjc__jMethod____extendedMethodName.setTrg(jMethod);
		match.getToBeTranslatedEdges().add(ejjc__jMethod____extendedMethodName);
		ejjc__jMethod____extendedMethodName
				.setName(ejjc__jMethod____extendedMethodName_name_prime);
		return new Object[] { match, jMethod, ejjc,
				ejjc__jMethod____extendedMethodName };
	}

	public static final Object[] pattern_MethodNameCreate_0_5_blackBBB(
			Match match, ExtendedMethodName jMethod,
			ExtendedJamoppJavaContainer ejjc) {
		return new Object[] { match, jMethod, ejjc };
	}

	public static final Object[] pattern_MethodNameCreate_0_5_greenBB(
			Match match, ExtendedJamoppJavaContainer ejjc) {
		match.getContextNodes().add(ejjc);
		return new Object[] { match, ejjc };
	}

	public static final void pattern_MethodNameCreate_0_6_expressionBBBB(
			MethodNameCreate _this, Match match, ExtendedMethodName jMethod,
			ExtendedJamoppJavaContainer ejjc) {
		_this.registerObjectsToMatch_FWD(match, jMethod, ejjc);

	}

	public static final boolean pattern_MethodNameCreate_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodNameCreate_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodNameCreate_1_1_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jMethod");
		EObject _localVariable_1 = isApplicableMatch.getObject("pg");
		EObject _localVariable_2 = isApplicableMatch.getObject("ejjc");
		EObject _localVariable_3 = isApplicableMatch.getObject("ejjcToPg");
		EObject tmpJMethod = _localVariable_0;
		EObject tmpPg = _localVariable_1;
		EObject tmpEjjc = _localVariable_2;
		EObject tmpEjjcToPg = _localVariable_3;
		if (tmpJMethod instanceof ExtendedMethodName) {
			ExtendedMethodName jMethod = (ExtendedMethodName) tmpJMethod;
			if (tmpPg instanceof TypeGraph) {
				TypeGraph pg = (TypeGraph) tmpPg;
				if (tmpEjjc instanceof ExtendedJamoppJavaContainer) {
					ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) tmpEjjc;
					if (tmpEjjcToPg instanceof ExtendedJamoppJavaContainerToTypeGraph) {
						ExtendedJamoppJavaContainerToTypeGraph ejjcToPg = (ExtendedJamoppJavaContainerToTypeGraph) tmpEjjcToPg;
						return new Object[] { jMethod, pg, ejjc, ejjcToPg,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_1_1_blackBBBBFBB(
			ExtendedMethodName jMethod, TypeGraph pg,
			ExtendedJamoppJavaContainer ejjc,
			ExtendedJamoppJavaContainerToTypeGraph ejjcToPg,
			MethodNameCreate _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jMethod, pg, ejjc, ejjcToPg, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_1_1_bindingAndBlackFFFFFBB(
			MethodNameCreate _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodNameCreate_1_1_binding = pattern_MethodNameCreate_1_1_bindingFFFFB(isApplicableMatch);
		if (result_pattern_MethodNameCreate_1_1_binding != null) {
			ExtendedMethodName jMethod = (ExtendedMethodName) result_pattern_MethodNameCreate_1_1_binding[0];
			TypeGraph pg = (TypeGraph) result_pattern_MethodNameCreate_1_1_binding[1];
			ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) result_pattern_MethodNameCreate_1_1_binding[2];
			ExtendedJamoppJavaContainerToTypeGraph ejjcToPg = (ExtendedJamoppJavaContainerToTypeGraph) result_pattern_MethodNameCreate_1_1_binding[3];

			Object[] result_pattern_MethodNameCreate_1_1_black = pattern_MethodNameCreate_1_1_blackBBBBFBB(
					jMethod, pg, ejjc, ejjcToPg, _this, isApplicableMatch);
			if (result_pattern_MethodNameCreate_1_1_black != null) {
				CSP csp = (CSP) result_pattern_MethodNameCreate_1_1_black[4];

				return new Object[] { jMethod, pg, ejjc, ejjcToPg, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_1_1_greenFBFBB(
			ExtendedMethodName jMethod, TypeGraph pg, CSP csp) {
		ExtendedMethodNameToTMethod jMethodToTMethod = GravityTGGFactory.eINSTANCE
				.createExtendedMethodNameToTMethod();
		TMethod tMethod = TypeGraphBasicFactory.eINSTANCE.createTMethod();
		Object _localVariable_0 = csp.getValue("tMethod", "tName");
		jMethodToTMethod.setSource(jMethod);
		jMethodToTMethod.setTarget(tMethod);
		pg.getMethods().add(tMethod);
		String tMethod_tName_prime = (String) _localVariable_0;
		tMethod.setTName(tMethod_tName_prime);
		return new Object[] { jMethodToTMethod, jMethod, tMethod, pg, csp };
	}

	public static final Object[] pattern_MethodNameCreate_1_2_blackBBB(
			ExtendedMethodNameToTMethod jMethodToTMethod,
			ExtendedMethodName jMethod, TMethod tMethod) {
		return new Object[] { jMethodToTMethod, jMethod, tMethod };
	}

	public static final Object[] pattern_MethodNameCreate_1_2_greenFBBB(
			ExtendedMethodNameToTMethod jMethodToTMethod,
			ExtendedMethodName jMethod, TMethod tMethod) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(jMethodToTMethod);
		ruleresult.getTranslatedElements().add(jMethod);
		ruleresult.getCreatedElements().add(tMethod);
		return new Object[] { ruleresult, jMethodToTMethod, jMethod, tMethod };
	}

	public static final Object[] pattern_MethodNameCreate_1_3_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject jMethodToTMethod,
			EObject jMethod, EObject tMethod, EObject pg, EObject ejjc,
			EObject ejjcToPg) {
		if (!jMethodToTMethod.equals(tMethod)) {
			if (!jMethodToTMethod.equals(pg)) {
				if (!jMethod.equals(jMethodToTMethod)) {
					if (!jMethod.equals(tMethod)) {
						if (!jMethod.equals(pg)) {
							if (!pg.equals(tMethod)) {
								if (!ejjc.equals(jMethodToTMethod)) {
									if (!ejjc.equals(jMethod)) {
										if (!ejjc.equals(tMethod)) {
											if (!ejjc.equals(pg)) {
												if (!ejjc.equals(ejjcToPg)) {
													if (!ejjcToPg
															.equals(jMethodToTMethod)) {
														if (!ejjcToPg
																.equals(jMethod)) {
															if (!ejjcToPg
																	.equals(tMethod)) {
																if (!ejjcToPg
																		.equals(pg)) {
																	return new Object[] {
																			ruleresult,
																			jMethodToTMethod,
																			jMethod,
																			tMethod,
																			pg,
																			ejjc,
																			ejjcToPg };
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

	public static final Object[] pattern_MethodNameCreate_1_3_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject jMethodToTMethod,
			EObject jMethod, EObject tMethod, EObject pg, EObject ejjc) {
		EMoflonEdge jMethodToTMethod__jMethod____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethod__tMethod____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ejjc__jMethod____extendedMethodName = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodNameCreate";
		String jMethodToTMethod__jMethod____source_name_prime = "source";
		String jMethodToTMethod__tMethod____target_name_prime = "target";
		String pg__tMethod____methods_name_prime = "methods";
		String ejjc__jMethod____extendedMethodName_name_prime = "extendedMethodName";
		jMethodToTMethod__jMethod____source.setSrc(jMethodToTMethod);
		jMethodToTMethod__jMethod____source.setTrg(jMethod);
		ruleresult.getCreatedEdges().add(jMethodToTMethod__jMethod____source);
		jMethodToTMethod__tMethod____target.setSrc(jMethodToTMethod);
		jMethodToTMethod__tMethod____target.setTrg(tMethod);
		ruleresult.getCreatedEdges().add(jMethodToTMethod__tMethod____target);
		pg__tMethod____methods.setSrc(pg);
		pg__tMethod____methods.setTrg(tMethod);
		ruleresult.getCreatedEdges().add(pg__tMethod____methods);
		ejjc__jMethod____extendedMethodName.setSrc(ejjc);
		ejjc__jMethod____extendedMethodName.setTrg(jMethod);
		ruleresult.getTranslatedEdges()
				.add(ejjc__jMethod____extendedMethodName);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jMethodToTMethod__jMethod____source
				.setName(jMethodToTMethod__jMethod____source_name_prime);
		jMethodToTMethod__tMethod____target
				.setName(jMethodToTMethod__tMethod____target_name_prime);
		pg__tMethod____methods.setName(pg__tMethod____methods_name_prime);
		ejjc__jMethod____extendedMethodName
				.setName(ejjc__jMethod____extendedMethodName_name_prime);
		return new Object[] { ruleresult, jMethodToTMethod, jMethod, tMethod,
				pg, ejjc, jMethodToTMethod__jMethod____source,
				jMethodToTMethod__tMethod____target, pg__tMethod____methods,
				ejjc__jMethod____extendedMethodName };
	}

	public static final void pattern_MethodNameCreate_1_5_expressionBBBBBBBB(
			MethodNameCreate _this, PerformRuleResult ruleresult,
			EObject jMethodToTMethod, EObject jMethod, EObject tMethod,
			EObject pg, EObject ejjc, EObject ejjcToPg) {
		_this.registerObjects_FWD(ruleresult, jMethodToTMethod, jMethod,
				tMethod, pg, ejjc, ejjcToPg);

	}

	public static final PerformRuleResult pattern_MethodNameCreate_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodNameCreate_2_1_bindingFB(
			MethodNameCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_2_1_blackFBB(
			EClass eClass, MethodNameCreate _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_2_1_bindingAndBlackFFB(
			MethodNameCreate _this) {
		Object[] result_pattern_MethodNameCreate_2_1_binding = pattern_MethodNameCreate_2_1_bindingFB(_this);
		if (result_pattern_MethodNameCreate_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodNameCreate_2_1_binding[0];

			Object[] result_pattern_MethodNameCreate_2_1_black = pattern_MethodNameCreate_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_MethodNameCreate_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodNameCreate_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodNameCreate";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodNameCreate_2_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("jMethod");
		EObject _localVariable_1 = match.getObject("ejjc");
		EObject tmpJMethod = _localVariable_0;
		EObject tmpEjjc = _localVariable_1;
		if (tmpJMethod instanceof ExtendedMethodName) {
			ExtendedMethodName jMethod = (ExtendedMethodName) tmpJMethod;
			if (tmpEjjc instanceof ExtendedJamoppJavaContainer) {
				ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) tmpEjjc;
				return new Object[] { jMethod, ejjc, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodNameCreate_2_2_blackBFBFB(
			ExtendedMethodName jMethod, ExtendedJamoppJavaContainer ejjc,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ExtendedJamoppJavaContainerToTypeGraph ejjcToPg : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ejjc,
						ExtendedJamoppJavaContainerToTypeGraph.class, "source")) {
			TypeGraph pg = ejjcToPg.getTarget();
			if (pg != null) {
				_result.add(new Object[] { jMethod, pg, ejjc, ejjcToPg, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodNameCreate_2_3_blackBBBB(
			ExtendedMethodName jMethod, TypeGraph pg,
			ExtendedJamoppJavaContainer ejjc,
			ExtendedJamoppJavaContainerToTypeGraph ejjcToPg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (ejjc.getExtendedMethodName().contains(jMethod)) {
			if (ejjc.equals(ejjcToPg.getSource())) {
				if (pg.equals(ejjcToPg.getTarget())) {
					_result.add(new Object[] { jMethod, pg, ejjc, ejjcToPg });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodNameCreate_2_3_greenBBBBFFFF(
			ExtendedMethodName jMethod, TypeGraph pg,
			ExtendedJamoppJavaContainer ejjc,
			ExtendedJamoppJavaContainerToTypeGraph ejjcToPg) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge ejjc__jMethod____extendedMethodName = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ejjcToPg__ejjc____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ejjcToPg__pg____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ejjc__jMethod____extendedMethodName_name_prime = "extendedMethodName";
		String ejjcToPg__ejjc____source_name_prime = "source";
		String ejjcToPg__pg____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(jMethod);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(ejjc);
		isApplicableMatch.getAllContextElements().add(ejjcToPg);
		ejjc__jMethod____extendedMethodName.setSrc(ejjc);
		ejjc__jMethod____extendedMethodName.setTrg(jMethod);
		isApplicableMatch.getAllContextElements().add(
				ejjc__jMethod____extendedMethodName);
		ejjcToPg__ejjc____source.setSrc(ejjcToPg);
		ejjcToPg__ejjc____source.setTrg(ejjc);
		isApplicableMatch.getAllContextElements().add(ejjcToPg__ejjc____source);
		ejjcToPg__pg____target.setSrc(ejjcToPg);
		ejjcToPg__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(ejjcToPg__pg____target);
		ejjc__jMethod____extendedMethodName
				.setName(ejjc__jMethod____extendedMethodName_name_prime);
		ejjcToPg__ejjc____source.setName(ejjcToPg__ejjc____source_name_prime);
		ejjcToPg__pg____target.setName(ejjcToPg__pg____target_name_prime);
		return new Object[] { jMethod, pg, ejjc, ejjcToPg, isApplicableMatch,
				ejjc__jMethod____extendedMethodName, ejjcToPg__ejjc____source,
				ejjcToPg__pg____target };
	}

	public static final Object[] pattern_MethodNameCreate_2_4_bindingFBBBBBB(
			MethodNameCreate _this, IsApplicableMatch isApplicableMatch,
			ExtendedMethodName jMethod, TypeGraph pg,
			ExtendedJamoppJavaContainer ejjc,
			ExtendedJamoppJavaContainerToTypeGraph ejjcToPg) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, jMethod, pg, ejjc, ejjcToPg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jMethod, pg,
					ejjc, ejjcToPg };
		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodNameCreate_2_4_bindingAndBlackFBBBBBB(
			MethodNameCreate _this, IsApplicableMatch isApplicableMatch,
			ExtendedMethodName jMethod, TypeGraph pg,
			ExtendedJamoppJavaContainer ejjc,
			ExtendedJamoppJavaContainerToTypeGraph ejjcToPg) {
		Object[] result_pattern_MethodNameCreate_2_4_binding = pattern_MethodNameCreate_2_4_bindingFBBBBBB(
				_this, isApplicableMatch, jMethod, pg, ejjc, ejjcToPg);
		if (result_pattern_MethodNameCreate_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_MethodNameCreate_2_4_binding[0];

			Object[] result_pattern_MethodNameCreate_2_4_black = pattern_MethodNameCreate_2_4_blackB(csp);
			if (result_pattern_MethodNameCreate_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jMethod,
						pg, ejjc, ejjcToPg };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodNameCreate_2_5_expressionFBB(
			MethodNameCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodNameCreate_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodNameCreate_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodNameCreate";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodNameCreate_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodNameCreate_10_1_blackBBBB(
			MethodNameCreate _this, Match match, TMethod tMethod, TypeGraph pg) {
		return new Object[] { _this, match, tMethod, pg };
	}

	public static final Object[] pattern_MethodNameCreate_10_2_bindingFBBBB(
			MethodNameCreate _this, Match match, TMethod tMethod, TypeGraph pg) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tMethod,
				pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tMethod, pg };
		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodNameCreate_10_2_bindingAndBlackFBBBB(
			MethodNameCreate _this, Match match, TMethod tMethod, TypeGraph pg) {
		Object[] result_pattern_MethodNameCreate_10_2_binding = pattern_MethodNameCreate_10_2_bindingFBBBB(
				_this, match, tMethod, pg);
		if (result_pattern_MethodNameCreate_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_MethodNameCreate_10_2_binding[0];

			Object[] result_pattern_MethodNameCreate_10_2_black = pattern_MethodNameCreate_10_2_blackB(csp);
			if (result_pattern_MethodNameCreate_10_2_black != null) {

				return new Object[] { csp, _this, match, tMethod, pg };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodNameCreate_10_3_expressionFBB(
			MethodNameCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodNameCreate_10_4_blackBBB(
			Match match, TMethod tMethod, TypeGraph pg) {
		return new Object[] { match, tMethod, pg };
	}

	public static final Object[] pattern_MethodNameCreate_10_4_greenBBBF(
			Match match, TMethod tMethod, TypeGraph pg) {
		EMoflonEdge pg__tMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tMethod);
		String pg__tMethod____methods_name_prime = "methods";
		pg__tMethod____methods.setSrc(pg);
		pg__tMethod____methods.setTrg(tMethod);
		match.getToBeTranslatedEdges().add(pg__tMethod____methods);
		pg__tMethod____methods.setName(pg__tMethod____methods_name_prime);
		return new Object[] { match, tMethod, pg, pg__tMethod____methods };
	}

	public static final Object[] pattern_MethodNameCreate_10_5_blackBBB(
			Match match, TMethod tMethod, TypeGraph pg) {
		return new Object[] { match, tMethod, pg };
	}

	public static final Object[] pattern_MethodNameCreate_10_5_greenBB(
			Match match, TypeGraph pg) {
		match.getContextNodes().add(pg);
		return new Object[] { match, pg };
	}

	public static final void pattern_MethodNameCreate_10_6_expressionBBBB(
			MethodNameCreate _this, Match match, TMethod tMethod, TypeGraph pg) {
		_this.registerObjectsToMatch_BWD(match, tMethod, pg);

	}

	public static final boolean pattern_MethodNameCreate_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodNameCreate_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodNameCreate_11_1_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tMethod");
		EObject _localVariable_1 = isApplicableMatch.getObject("pg");
		EObject _localVariable_2 = isApplicableMatch.getObject("ejjc");
		EObject _localVariable_3 = isApplicableMatch.getObject("ejjcToPg");
		EObject tmpTMethod = _localVariable_0;
		EObject tmpPg = _localVariable_1;
		EObject tmpEjjc = _localVariable_2;
		EObject tmpEjjcToPg = _localVariable_3;
		if (tmpTMethod instanceof TMethod) {
			TMethod tMethod = (TMethod) tmpTMethod;
			if (tmpPg instanceof TypeGraph) {
				TypeGraph pg = (TypeGraph) tmpPg;
				if (tmpEjjc instanceof ExtendedJamoppJavaContainer) {
					ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) tmpEjjc;
					if (tmpEjjcToPg instanceof ExtendedJamoppJavaContainerToTypeGraph) {
						ExtendedJamoppJavaContainerToTypeGraph ejjcToPg = (ExtendedJamoppJavaContainerToTypeGraph) tmpEjjcToPg;
						return new Object[] { tMethod, pg, ejjc, ejjcToPg,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_11_1_blackBBBBFBB(
			TMethod tMethod, TypeGraph pg, ExtendedJamoppJavaContainer ejjc,
			ExtendedJamoppJavaContainerToTypeGraph ejjcToPg,
			MethodNameCreate _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tMethod, pg, ejjc, ejjcToPg, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_11_1_bindingAndBlackFFFFFBB(
			MethodNameCreate _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodNameCreate_11_1_binding = pattern_MethodNameCreate_11_1_bindingFFFFB(isApplicableMatch);
		if (result_pattern_MethodNameCreate_11_1_binding != null) {
			TMethod tMethod = (TMethod) result_pattern_MethodNameCreate_11_1_binding[0];
			TypeGraph pg = (TypeGraph) result_pattern_MethodNameCreate_11_1_binding[1];
			ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) result_pattern_MethodNameCreate_11_1_binding[2];
			ExtendedJamoppJavaContainerToTypeGraph ejjcToPg = (ExtendedJamoppJavaContainerToTypeGraph) result_pattern_MethodNameCreate_11_1_binding[3];

			Object[] result_pattern_MethodNameCreate_11_1_black = pattern_MethodNameCreate_11_1_blackBBBBFBB(
					tMethod, pg, ejjc, ejjcToPg, _this, isApplicableMatch);
			if (result_pattern_MethodNameCreate_11_1_black != null) {
				CSP csp = (CSP) result_pattern_MethodNameCreate_11_1_black[4];

				return new Object[] { tMethod, pg, ejjc, ejjcToPg, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_11_1_greenFFBBB(
			TMethod tMethod, ExtendedJamoppJavaContainer ejjc, CSP csp) {
		ExtendedMethodNameToTMethod jMethodToTMethod = GravityTGGFactory.eINSTANCE
				.createExtendedMethodNameToTMethod();
		ExtendedMethodName jMethod = ExtendedJamoppFactory.eINSTANCE
				.createExtendedMethodName();
		Object _localVariable_0 = csp.getValue("jMethod", "name");
		jMethodToTMethod.setTarget(tMethod);
		jMethodToTMethod.setSource(jMethod);
		ejjc.getExtendedMethodName().add(jMethod);
		String jMethod_name_prime = (String) _localVariable_0;
		jMethod.setName(jMethod_name_prime);
		return new Object[] { jMethodToTMethod, jMethod, tMethod, ejjc, csp };
	}

	public static final Object[] pattern_MethodNameCreate_11_2_blackBBB(
			ExtendedMethodNameToTMethod jMethodToTMethod,
			ExtendedMethodName jMethod, TMethod tMethod) {
		return new Object[] { jMethodToTMethod, jMethod, tMethod };
	}

	public static final Object[] pattern_MethodNameCreate_11_2_greenFBBB(
			ExtendedMethodNameToTMethod jMethodToTMethod,
			ExtendedMethodName jMethod, TMethod tMethod) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(jMethodToTMethod);
		ruleresult.getCreatedElements().add(jMethod);
		ruleresult.getTranslatedElements().add(tMethod);
		return new Object[] { ruleresult, jMethodToTMethod, jMethod, tMethod };
	}

	public static final Object[] pattern_MethodNameCreate_11_3_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject jMethodToTMethod,
			EObject jMethod, EObject tMethod, EObject pg, EObject ejjc,
			EObject ejjcToPg) {
		if (!jMethodToTMethod.equals(tMethod)) {
			if (!jMethodToTMethod.equals(pg)) {
				if (!jMethod.equals(jMethodToTMethod)) {
					if (!jMethod.equals(tMethod)) {
						if (!jMethod.equals(pg)) {
							if (!pg.equals(tMethod)) {
								if (!ejjc.equals(jMethodToTMethod)) {
									if (!ejjc.equals(jMethod)) {
										if (!ejjc.equals(tMethod)) {
											if (!ejjc.equals(pg)) {
												if (!ejjc.equals(ejjcToPg)) {
													if (!ejjcToPg
															.equals(jMethodToTMethod)) {
														if (!ejjcToPg
																.equals(jMethod)) {
															if (!ejjcToPg
																	.equals(tMethod)) {
																if (!ejjcToPg
																		.equals(pg)) {
																	return new Object[] {
																			ruleresult,
																			jMethodToTMethod,
																			jMethod,
																			tMethod,
																			pg,
																			ejjc,
																			ejjcToPg };
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

	public static final Object[] pattern_MethodNameCreate_11_3_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject jMethodToTMethod,
			EObject jMethod, EObject tMethod, EObject pg, EObject ejjc) {
		EMoflonEdge jMethodToTMethod__jMethod____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jMethodToTMethod__tMethod____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ejjc__jMethod____extendedMethodName = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodNameCreate";
		String jMethodToTMethod__jMethod____source_name_prime = "source";
		String jMethodToTMethod__tMethod____target_name_prime = "target";
		String pg__tMethod____methods_name_prime = "methods";
		String ejjc__jMethod____extendedMethodName_name_prime = "extendedMethodName";
		jMethodToTMethod__jMethod____source.setSrc(jMethodToTMethod);
		jMethodToTMethod__jMethod____source.setTrg(jMethod);
		ruleresult.getCreatedEdges().add(jMethodToTMethod__jMethod____source);
		jMethodToTMethod__tMethod____target.setSrc(jMethodToTMethod);
		jMethodToTMethod__tMethod____target.setTrg(tMethod);
		ruleresult.getCreatedEdges().add(jMethodToTMethod__tMethod____target);
		pg__tMethod____methods.setSrc(pg);
		pg__tMethod____methods.setTrg(tMethod);
		ruleresult.getTranslatedEdges().add(pg__tMethod____methods);
		ejjc__jMethod____extendedMethodName.setSrc(ejjc);
		ejjc__jMethod____extendedMethodName.setTrg(jMethod);
		ruleresult.getCreatedEdges().add(ejjc__jMethod____extendedMethodName);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jMethodToTMethod__jMethod____source
				.setName(jMethodToTMethod__jMethod____source_name_prime);
		jMethodToTMethod__tMethod____target
				.setName(jMethodToTMethod__tMethod____target_name_prime);
		pg__tMethod____methods.setName(pg__tMethod____methods_name_prime);
		ejjc__jMethod____extendedMethodName
				.setName(ejjc__jMethod____extendedMethodName_name_prime);
		return new Object[] { ruleresult, jMethodToTMethod, jMethod, tMethod,
				pg, ejjc, jMethodToTMethod__jMethod____source,
				jMethodToTMethod__tMethod____target, pg__tMethod____methods,
				ejjc__jMethod____extendedMethodName };
	}

	public static final void pattern_MethodNameCreate_11_5_expressionBBBBBBBB(
			MethodNameCreate _this, PerformRuleResult ruleresult,
			EObject jMethodToTMethod, EObject jMethod, EObject tMethod,
			EObject pg, EObject ejjc, EObject ejjcToPg) {
		_this.registerObjects_BWD(ruleresult, jMethodToTMethod, jMethod,
				tMethod, pg, ejjc, ejjcToPg);

	}

	public static final PerformRuleResult pattern_MethodNameCreate_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodNameCreate_12_1_bindingFB(
			MethodNameCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_12_1_blackFBB(
			EClass eClass, MethodNameCreate _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_12_1_bindingAndBlackFFB(
			MethodNameCreate _this) {
		Object[] result_pattern_MethodNameCreate_12_1_binding = pattern_MethodNameCreate_12_1_bindingFB(_this);
		if (result_pattern_MethodNameCreate_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodNameCreate_12_1_binding[0];

			Object[] result_pattern_MethodNameCreate_12_1_black = pattern_MethodNameCreate_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_MethodNameCreate_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodNameCreate_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodNameCreate";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodNameCreate_12_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("tMethod");
		EObject _localVariable_1 = match.getObject("pg");
		EObject tmpTMethod = _localVariable_0;
		EObject tmpPg = _localVariable_1;
		if (tmpTMethod instanceof TMethod) {
			TMethod tMethod = (TMethod) tmpTMethod;
			if (tmpPg instanceof TypeGraph) {
				TypeGraph pg = (TypeGraph) tmpPg;
				return new Object[] { tMethod, pg, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodNameCreate_12_2_blackBBFFB(
			TMethod tMethod, TypeGraph pg, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ExtendedJamoppJavaContainerToTypeGraph ejjcToPg : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pg,
						ExtendedJamoppJavaContainerToTypeGraph.class, "target")) {
			ExtendedJamoppJavaContainer ejjc = ejjcToPg.getSource();
			if (ejjc != null) {
				_result.add(new Object[] { tMethod, pg, ejjc, ejjcToPg, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodNameCreate_12_3_blackBBBB(
			TMethod tMethod, TypeGraph pg, ExtendedJamoppJavaContainer ejjc,
			ExtendedJamoppJavaContainerToTypeGraph ejjcToPg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pg.getMethods().contains(tMethod)) {
			if (ejjc.equals(ejjcToPg.getSource())) {
				if (pg.equals(ejjcToPg.getTarget())) {
					_result.add(new Object[] { tMethod, pg, ejjc, ejjcToPg });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodNameCreate_12_3_greenBBBBFFFF(
			TMethod tMethod, TypeGraph pg, ExtendedJamoppJavaContainer ejjc,
			ExtendedJamoppJavaContainerToTypeGraph ejjcToPg) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge pg__tMethod____methods = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ejjcToPg__ejjc____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ejjcToPg__pg____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String pg__tMethod____methods_name_prime = "methods";
		String ejjcToPg__ejjc____source_name_prime = "source";
		String ejjcToPg__pg____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tMethod);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(ejjc);
		isApplicableMatch.getAllContextElements().add(ejjcToPg);
		pg__tMethod____methods.setSrc(pg);
		pg__tMethod____methods.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(pg__tMethod____methods);
		ejjcToPg__ejjc____source.setSrc(ejjcToPg);
		ejjcToPg__ejjc____source.setTrg(ejjc);
		isApplicableMatch.getAllContextElements().add(ejjcToPg__ejjc____source);
		ejjcToPg__pg____target.setSrc(ejjcToPg);
		ejjcToPg__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(ejjcToPg__pg____target);
		pg__tMethod____methods.setName(pg__tMethod____methods_name_prime);
		ejjcToPg__ejjc____source.setName(ejjcToPg__ejjc____source_name_prime);
		ejjcToPg__pg____target.setName(ejjcToPg__pg____target_name_prime);
		return new Object[] { tMethod, pg, ejjc, ejjcToPg, isApplicableMatch,
				pg__tMethod____methods, ejjcToPg__ejjc____source,
				ejjcToPg__pg____target };
	}

	public static final Object[] pattern_MethodNameCreate_12_4_bindingFBBBBBB(
			MethodNameCreate _this, IsApplicableMatch isApplicableMatch,
			TMethod tMethod, TypeGraph pg, ExtendedJamoppJavaContainer ejjc,
			ExtendedJamoppJavaContainerToTypeGraph ejjcToPg) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, tMethod, pg, ejjc, ejjcToPg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tMethod, pg,
					ejjc, ejjcToPg };
		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodNameCreate_12_4_bindingAndBlackFBBBBBB(
			MethodNameCreate _this, IsApplicableMatch isApplicableMatch,
			TMethod tMethod, TypeGraph pg, ExtendedJamoppJavaContainer ejjc,
			ExtendedJamoppJavaContainerToTypeGraph ejjcToPg) {
		Object[] result_pattern_MethodNameCreate_12_4_binding = pattern_MethodNameCreate_12_4_bindingFBBBBBB(
				_this, isApplicableMatch, tMethod, pg, ejjc, ejjcToPg);
		if (result_pattern_MethodNameCreate_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_MethodNameCreate_12_4_binding[0];

			Object[] result_pattern_MethodNameCreate_12_4_black = pattern_MethodNameCreate_12_4_blackB(csp);
			if (result_pattern_MethodNameCreate_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tMethod,
						pg, ejjc, ejjcToPg };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodNameCreate_12_5_expressionFBB(
			MethodNameCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodNameCreate_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodNameCreate_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodNameCreate";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodNameCreate_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodNameCreate_20_1_bindingFB(
			MethodNameCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_20_1_blackFBB(
			EClass __eClass, MethodNameCreate _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_20_1_bindingAndBlackFFB(
			MethodNameCreate _this) {
		Object[] result_pattern_MethodNameCreate_20_1_binding = pattern_MethodNameCreate_20_1_bindingFB(_this);
		if (result_pattern_MethodNameCreate_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodNameCreate_20_1_binding[0];

			Object[] result_pattern_MethodNameCreate_20_1_black = pattern_MethodNameCreate_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_MethodNameCreate_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodNameCreate_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MethodNameCreate_20_2_black_nac_0BB(
			TMethod tMethod, TypeGraph pg) {
		for (TypeGraph __DEC_tMethod_methods_21053 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tMethod, TypeGraph.class, "methods")) {
			if (!pg.equals(__DEC_tMethod_methods_21053)) {
				return new Object[] { tMethod, pg };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodNameCreate_20_2_blackFFB(
			EMoflonEdge _edge_methods) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPg = _edge_methods.getSrc();
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			EObject tmpTMethod = _edge_methods.getTrg();
			if (tmpTMethod instanceof TMethod) {
				TMethod tMethod = (TMethod) tmpTMethod;
				if (pg.getMethods().contains(tMethod)) {
					if (pattern_MethodNameCreate_20_2_black_nac_0BB(tMethod, pg) == null) {
						_result.add(new Object[] { tMethod, pg, _edge_methods });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodNameCreate_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodNameCreate_20_3_expressionFBBBB(
			MethodNameCreate _this, Match match, TMethod tMethod, TypeGraph pg) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tMethod, pg);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodNameCreate_20_4_expressionFBB(
			MethodNameCreate _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodNameCreate_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_MethodNameCreate_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_MethodNameCreate_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodNameCreate_21_1_bindingFB(
			MethodNameCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_21_1_blackFBB(
			EClass __eClass, MethodNameCreate _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_21_1_bindingAndBlackFFB(
			MethodNameCreate _this) {
		Object[] result_pattern_MethodNameCreate_21_1_binding = pattern_MethodNameCreate_21_1_bindingFB(_this);
		if (result_pattern_MethodNameCreate_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodNameCreate_21_1_binding[0];

			Object[] result_pattern_MethodNameCreate_21_1_black = pattern_MethodNameCreate_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_MethodNameCreate_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodNameCreate_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodNameCreate_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodNameCreate_21_2_blackFFB(
			EMoflonEdge _edge_extendedMethodName) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEjjc = _edge_extendedMethodName.getSrc();
		if (tmpEjjc instanceof ExtendedJamoppJavaContainer) {
			ExtendedJamoppJavaContainer ejjc = (ExtendedJamoppJavaContainer) tmpEjjc;
			EObject tmpJMethod = _edge_extendedMethodName.getTrg();
			if (tmpJMethod instanceof ExtendedMethodName) {
				ExtendedMethodName jMethod = (ExtendedMethodName) tmpJMethod;
				if (ejjc.getExtendedMethodName().contains(jMethod)) {
					_result.add(new Object[] { jMethod, ejjc,
							_edge_extendedMethodName });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodNameCreate_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodNameCreate_21_3_expressionFBBBB(
			MethodNameCreate _this, Match match, ExtendedMethodName jMethod,
			ExtendedJamoppJavaContainer ejjc) {
		boolean _localVariable_0 = _this
				.isAppropriate_FWD(match, jMethod, ejjc);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodNameCreate_21_4_expressionFBB(
			MethodNameCreate _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodNameCreate_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_MethodNameCreate_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_MethodNameCreate_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodNameCreateImpl
