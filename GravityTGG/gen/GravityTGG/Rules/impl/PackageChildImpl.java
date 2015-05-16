/**
 */
package GravityTGG.Rules.impl;

import ExtendedJamopp.ExtendedJamoppFactory;
import ExtendedJamopp.ExtendedJamoppJavaContainer;
import ExtendedJamopp.ExtendedJamoppPackageElement;

import GravityTGG.ExtendedJamoppPackageElementToTPackage;
import GravityTGG.GravityTGGFactory;

import GravityTGG.Rules.PackageChild;
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
 * An implementation of the model object '<em><b>Package Child</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PackageChildImpl extends AbstractRuleImpl implements PackageChild {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageChildImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getPackageChild();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppPackageElement jSubPackage) {
		// initial bindings
		Object[] result1_black = PackageChildImpl
				.pattern_PackageChild_0_1_blackBBBBB(this, match,
						extendedJamoppJavaContainer,
						extendedJamoppPackageElement, jSubPackage);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = PackageChildImpl
				.pattern_PackageChild_0_2_bindingAndBlackFBBBBB(this, match,
						extendedJamoppJavaContainer,
						extendedJamoppPackageElement, jSubPackage);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (PackageChildImpl.pattern_PackageChild_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = PackageChildImpl
					.pattern_PackageChild_0_4_blackBBBB(match,
							extendedJamoppJavaContainer,
							extendedJamoppPackageElement, jSubPackage);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			PackageChildImpl.pattern_PackageChild_0_4_greenBBBBFFF(match,
					extendedJamoppJavaContainer, extendedJamoppPackageElement,
					jSubPackage);
			// EMoflonEdge extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement = (EMoflonEdge) result4_green[4];
			// EMoflonEdge jSubPackage__extendedJamoppPackageElement____predessor = (EMoflonEdge) result4_green[5];
			// EMoflonEdge extendedJamoppPackageElement__jSubPackage____successor = (EMoflonEdge) result4_green[6];

			// collect context elements
			Object[] result5_black = PackageChildImpl
					.pattern_PackageChild_0_5_blackBBBB(match,
							extendedJamoppJavaContainer,
							extendedJamoppPackageElement, jSubPackage);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			PackageChildImpl.pattern_PackageChild_0_5_greenBBBF(match,
					extendedJamoppJavaContainer, extendedJamoppPackageElement);
			// EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement = (EMoflonEdge) result5_green[3];

			// register objects to match
			PackageChildImpl.pattern_PackageChild_0_6_expressionBBBBB(this,
					match, extendedJamoppJavaContainer,
					extendedJamoppPackageElement, jSubPackage);
			return PackageChildImpl.pattern_PackageChild_0_7_expressionF();
		} else {
			return PackageChildImpl.pattern_PackageChild_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = PackageChildImpl
				.pattern_PackageChild_1_1_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result1_bindingAndBlack[0];
		ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) result1_bindingAndBlack[1];
		ExtendedJamoppPackageElement jSubPackage = (ExtendedJamoppPackageElement) result1_bindingAndBlack[2];
		TPackage tPackage = (TPackage) result1_bindingAndBlack[3];
		ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement = (ExtendedJamoppPackageElementToTPackage) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = PackageChildImpl
				.pattern_PackageChild_1_1_greenBBFFB(jSubPackage, tPackage, csp);
		TPackage tSubPackage = (TPackage) result1_green[2];
		ExtendedJamoppPackageElementToTPackage tSubPackageToJSubPackage = (ExtendedJamoppPackageElementToTPackage) result1_green[3];

		// collect translated elements
		Object[] result2_black = PackageChildImpl
				.pattern_PackageChild_1_2_blackBBB(jSubPackage, tSubPackage,
						tSubPackageToJSubPackage);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = PackageChildImpl
				.pattern_PackageChild_1_2_greenFBBB(jSubPackage, tSubPackage,
						tSubPackageToJSubPackage);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = PackageChildImpl
				.pattern_PackageChild_1_3_blackBBBBBBBB(ruleresult,
						extendedJamoppJavaContainer,
						extendedJamoppPackageElement, jSubPackage, tPackage,
						tPackageToExtendedJamoppPackageElement, tSubPackage,
						tSubPackageToJSubPackage);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		PackageChildImpl.pattern_PackageChild_1_3_greenBBBBBBBFFFFFFF(
				ruleresult, extendedJamoppJavaContainer,
				extendedJamoppPackageElement, jSubPackage, tPackage,
				tSubPackage, tSubPackageToJSubPackage);
		// EMoflonEdge extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement = (EMoflonEdge) result3_green[7];
		// EMoflonEdge jSubPackage__extendedJamoppPackageElement____predessor = (EMoflonEdge) result3_green[8];
		// EMoflonEdge extendedJamoppPackageElement__jSubPackage____successor = (EMoflonEdge) result3_green[9];
		// EMoflonEdge tSubPackage__tPackage____parent = (EMoflonEdge) result3_green[10];
		// EMoflonEdge tPackage__tSubPackage____subpackage = (EMoflonEdge) result3_green[11];
		// EMoflonEdge tSubPackageToJSubPackage__tSubPackage____target = (EMoflonEdge) result3_green[12];
		// EMoflonEdge tSubPackageToJSubPackage__jSubPackage____source = (EMoflonEdge) result3_green[13];

		// perform postprocessing story node is empty
		// register objects
		PackageChildImpl.pattern_PackageChild_1_5_expressionBBBBBBBBB(this,
				ruleresult, extendedJamoppJavaContainer,
				extendedJamoppPackageElement, jSubPackage, tPackage,
				tPackageToExtendedJamoppPackageElement, tSubPackage,
				tSubPackageToJSubPackage);
		return PackageChildImpl
				.pattern_PackageChild_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = PackageChildImpl
				.pattern_PackageChild_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PackageChildImpl
				.pattern_PackageChild_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = PackageChildImpl
				.pattern_PackageChild_2_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result2_binding[0];
		ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) result2_binding[1];
		ExtendedJamoppPackageElement jSubPackage = (ExtendedJamoppPackageElement) result2_binding[2];
		for (Object[] result2_black : PackageChildImpl
				.pattern_PackageChild_2_2_blackBBBFFB(
						extendedJamoppJavaContainer,
						extendedJamoppPackageElement, jSubPackage, match)) {
			TPackage tPackage = (TPackage) result2_black[3];
			ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement = (ExtendedJamoppPackageElementToTPackage) result2_black[4];
			// ForEach find context
			for (Object[] result3_black : PackageChildImpl
					.pattern_PackageChild_2_3_blackBBBBB(
							extendedJamoppJavaContainer,
							extendedJamoppPackageElement, jSubPackage,
							tPackage, tPackageToExtendedJamoppPackageElement)) {
				Object[] result3_green = PackageChildImpl
						.pattern_PackageChild_2_3_greenBBBBBFFFFFFF(
								extendedJamoppJavaContainer,
								extendedJamoppPackageElement, jSubPackage,
								tPackage,
								tPackageToExtendedJamoppPackageElement);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement = (EMoflonEdge) result3_green[6];
				// EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement = (EMoflonEdge) result3_green[7];
				// EMoflonEdge jSubPackage__extendedJamoppPackageElement____predessor = (EMoflonEdge) result3_green[8];
				// EMoflonEdge extendedJamoppPackageElement__jSubPackage____successor = (EMoflonEdge) result3_green[9];
				// EMoflonEdge tPackageToExtendedJamoppPackageElement__tPackage____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source = (EMoflonEdge) result3_green[11];

				// solve CSP
				Object[] result4_bindingAndBlack = PackageChildImpl
						.pattern_PackageChild_2_4_bindingAndBlackFBBBBBBB(this,
								isApplicableMatch, extendedJamoppJavaContainer,
								extendedJamoppPackageElement, jSubPackage,
								tPackage,
								tPackageToExtendedJamoppPackageElement);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (PackageChildImpl.pattern_PackageChild_2_5_expressionFBB(
						this, csp)) {

					// add match to rule result
					Object[] result6_black = PackageChildImpl
							.pattern_PackageChild_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					PackageChildImpl.pattern_PackageChild_2_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return PackageChildImpl
				.pattern_PackageChild_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppPackageElement jSubPackage) {
		match.registerObject("extendedJamoppJavaContainer",
				extendedJamoppJavaContainer);
		match.registerObject("extendedJamoppPackageElement",
				extendedJamoppPackageElement);
		match.registerObject("jSubPackage", jSubPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppPackageElement jSubPackage) {// Create CSP
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
			ExtendedJamoppPackageElement jSubPackage,
			TPackage tPackage,
			ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_jSubPackage_name = CSPFactoryHelper.eINSTANCE
				.createVariable("jSubPackage.name", true, csp);
		var_jSubPackage_name.setValue(jSubPackage.getName());
		var_jSubPackage_name.setType("String");

		// Create unbound variables
		Variable var_tSubPackage_tName = CSPFactoryHelper.eINSTANCE
				.createVariable("tSubPackage.tName", csp);
		var_tSubPackage_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_jSubPackage_name, var_tSubPackage_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("extendedJamoppJavaContainer",
				extendedJamoppJavaContainer);
		isApplicableMatch.registerObject("extendedJamoppPackageElement",
				extendedJamoppPackageElement);
		isApplicableMatch.registerObject("jSubPackage", jSubPackage);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject(
				"tPackageToExtendedJamoppPackageElement",
				tPackageToExtendedJamoppPackageElement);
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
			EObject extendedJamoppPackageElement, EObject jSubPackage,
			EObject tPackage, EObject tPackageToExtendedJamoppPackageElement,
			EObject tSubPackage, EObject tSubPackageToJSubPackage) {
		ruleresult.registerObject("extendedJamoppJavaContainer",
				extendedJamoppJavaContainer);
		ruleresult.registerObject("extendedJamoppPackageElement",
				extendedJamoppPackageElement);
		ruleresult.registerObject("jSubPackage", jSubPackage);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("tPackageToExtendedJamoppPackageElement",
				tPackageToExtendedJamoppPackageElement);
		ruleresult.registerObject("tSubPackage", tSubPackage);
		ruleresult.registerObject("tSubPackageToJSubPackage",
				tSubPackageToJSubPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match
				.getObject("jSubPackage")
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
			TPackage tSubPackage) {
		// initial bindings
		Object[] result1_black = PackageChildImpl
				.pattern_PackageChild_10_1_blackBBBB(this, match, tPackage,
						tSubPackage);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = PackageChildImpl
				.pattern_PackageChild_10_2_bindingAndBlackFBBBB(this, match,
						tPackage, tSubPackage);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (PackageChildImpl.pattern_PackageChild_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = PackageChildImpl
					.pattern_PackageChild_10_4_blackBBB(match, tPackage,
							tSubPackage);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			PackageChildImpl.pattern_PackageChild_10_4_greenBBBFF(match,
					tPackage, tSubPackage);
			// EMoflonEdge tSubPackage__tPackage____parent = (EMoflonEdge) result4_green[3];
			// EMoflonEdge tPackage__tSubPackage____subpackage = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = PackageChildImpl
					.pattern_PackageChild_10_5_blackBBB(match, tPackage,
							tSubPackage);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			PackageChildImpl.pattern_PackageChild_10_5_greenBB(match, tPackage);

			// register objects to match
			PackageChildImpl.pattern_PackageChild_10_6_expressionBBBB(this,
					match, tPackage, tSubPackage);
			return PackageChildImpl.pattern_PackageChild_10_7_expressionF();
		} else {
			return PackageChildImpl.pattern_PackageChild_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = PackageChildImpl
				.pattern_PackageChild_11_1_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result1_bindingAndBlack[0];
		ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) result1_bindingAndBlack[1];
		TPackage tPackage = (TPackage) result1_bindingAndBlack[2];
		ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement = (ExtendedJamoppPackageElementToTPackage) result1_bindingAndBlack[3];
		TPackage tSubPackage = (TPackage) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = PackageChildImpl
				.pattern_PackageChild_11_1_greenBBFBFB(
						extendedJamoppJavaContainer,
						extendedJamoppPackageElement, tSubPackage, csp);
		ExtendedJamoppPackageElement jSubPackage = (ExtendedJamoppPackageElement) result1_green[2];
		ExtendedJamoppPackageElementToTPackage tSubPackageToJSubPackage = (ExtendedJamoppPackageElementToTPackage) result1_green[4];

		// collect translated elements
		Object[] result2_black = PackageChildImpl
				.pattern_PackageChild_11_2_blackBBB(jSubPackage, tSubPackage,
						tSubPackageToJSubPackage);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = PackageChildImpl
				.pattern_PackageChild_11_2_greenFBBB(jSubPackage, tSubPackage,
						tSubPackageToJSubPackage);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = PackageChildImpl
				.pattern_PackageChild_11_3_blackBBBBBBBB(ruleresult,
						extendedJamoppJavaContainer,
						extendedJamoppPackageElement, jSubPackage, tPackage,
						tPackageToExtendedJamoppPackageElement, tSubPackage,
						tSubPackageToJSubPackage);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		PackageChildImpl.pattern_PackageChild_11_3_greenBBBBBBBFFFFFFF(
				ruleresult, extendedJamoppJavaContainer,
				extendedJamoppPackageElement, jSubPackage, tPackage,
				tSubPackage, tSubPackageToJSubPackage);
		// EMoflonEdge extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement = (EMoflonEdge) result3_green[7];
		// EMoflonEdge jSubPackage__extendedJamoppPackageElement____predessor = (EMoflonEdge) result3_green[8];
		// EMoflonEdge extendedJamoppPackageElement__jSubPackage____successor = (EMoflonEdge) result3_green[9];
		// EMoflonEdge tSubPackage__tPackage____parent = (EMoflonEdge) result3_green[10];
		// EMoflonEdge tPackage__tSubPackage____subpackage = (EMoflonEdge) result3_green[11];
		// EMoflonEdge tSubPackageToJSubPackage__tSubPackage____target = (EMoflonEdge) result3_green[12];
		// EMoflonEdge tSubPackageToJSubPackage__jSubPackage____source = (EMoflonEdge) result3_green[13];

		// perform postprocessing story node is empty
		// register objects
		PackageChildImpl.pattern_PackageChild_11_5_expressionBBBBBBBBB(this,
				ruleresult, extendedJamoppJavaContainer,
				extendedJamoppPackageElement, jSubPackage, tPackage,
				tPackageToExtendedJamoppPackageElement, tSubPackage,
				tSubPackageToJSubPackage);
		return PackageChildImpl
				.pattern_PackageChild_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = PackageChildImpl
				.pattern_PackageChild_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PackageChildImpl
				.pattern_PackageChild_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = PackageChildImpl
				.pattern_PackageChild_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		TPackage tPackage = (TPackage) result2_binding[0];
		TPackage tSubPackage = (TPackage) result2_binding[1];
		for (Object[] result2_black : PackageChildImpl
				.pattern_PackageChild_12_2_blackFBFBB(tPackage, tSubPackage,
						match)) {
			ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) result2_black[0];
			ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement = (ExtendedJamoppPackageElementToTPackage) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : PackageChildImpl
					.pattern_PackageChild_12_3_blackFBBBB(
							extendedJamoppPackageElement, tPackage,
							tPackageToExtendedJamoppPackageElement, tSubPackage)) {
				ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result3_black[0];
				Object[] result3_green = PackageChildImpl
						.pattern_PackageChild_12_3_greenBBBBBFFFFFF(
								extendedJamoppJavaContainer,
								extendedJamoppPackageElement, tPackage,
								tPackageToExtendedJamoppPackageElement,
								tSubPackage);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement = (EMoflonEdge) result3_green[6];
				// EMoflonEdge tPackageToExtendedJamoppPackageElement__tPackage____target = (EMoflonEdge) result3_green[7];
				// EMoflonEdge tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge tSubPackage__tPackage____parent = (EMoflonEdge) result3_green[9];
				// EMoflonEdge tPackage__tSubPackage____subpackage = (EMoflonEdge) result3_green[10];

				// solve CSP
				Object[] result4_bindingAndBlack = PackageChildImpl
						.pattern_PackageChild_12_4_bindingAndBlackFBBBBBBB(
								this, isApplicableMatch,
								extendedJamoppJavaContainer,
								extendedJamoppPackageElement, tPackage,
								tPackageToExtendedJamoppPackageElement,
								tSubPackage);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (PackageChildImpl.pattern_PackageChild_12_5_expressionFBB(
						this, csp)) {

					// add match to rule result
					Object[] result6_black = PackageChildImpl
							.pattern_PackageChild_12_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					PackageChildImpl.pattern_PackageChild_12_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return PackageChildImpl
				.pattern_PackageChild_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TPackage tPackage,
			TPackage tSubPackage) {
		match.registerObject("tPackage", tPackage);
		match.registerObject("tSubPackage", tSubPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TPackage tPackage,
			TPackage tSubPackage) {// Create CSP
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
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			TPackage tPackage,
			ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement,
			TPackage tSubPackage) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tSubPackage_tName = CSPFactoryHelper.eINSTANCE
				.createVariable("tSubPackage.tName", true, csp);
		var_tSubPackage_tName.setValue(tSubPackage.getTName());
		var_tSubPackage_tName.setType("String");

		// Create unbound variables
		Variable var_jSubPackage_name = CSPFactoryHelper.eINSTANCE
				.createVariable("jSubPackage.name", csp);
		var_jSubPackage_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_jSubPackage_name, var_tSubPackage_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("extendedJamoppJavaContainer",
				extendedJamoppJavaContainer);
		isApplicableMatch.registerObject("extendedJamoppPackageElement",
				extendedJamoppPackageElement);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject(
				"tPackageToExtendedJamoppPackageElement",
				tPackageToExtendedJamoppPackageElement);
		isApplicableMatch.registerObject("tSubPackage", tSubPackage);
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
			EObject extendedJamoppPackageElement, EObject jSubPackage,
			EObject tPackage, EObject tPackageToExtendedJamoppPackageElement,
			EObject tSubPackage, EObject tSubPackageToJSubPackage) {
		ruleresult.registerObject("extendedJamoppJavaContainer",
				extendedJamoppJavaContainer);
		ruleresult.registerObject("extendedJamoppPackageElement",
				extendedJamoppPackageElement);
		ruleresult.registerObject("jSubPackage", jSubPackage);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("tPackageToExtendedJamoppPackageElement",
				tPackageToExtendedJamoppPackageElement);
		ruleresult.registerObject("tSubPackage", tSubPackage);
		ruleresult.registerObject("tSubPackageToJSubPackage",
				tSubPackageToJSubPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("tSubPackage")
				.eClass()
				.equals(TypeGraphBasic.TypeGraphBasicPackage.eINSTANCE
						.getTPackage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_24(
			EMoflonEdge _edge_extendedJamoppPackageElement) {
		// prepare return value
		Object[] result1_bindingAndBlack = PackageChildImpl
				.pattern_PackageChild_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PackageChildImpl
				.pattern_PackageChild_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PackageChildImpl
				.pattern_PackageChild_20_2_blackFFFB(_edge_extendedJamoppPackageElement)) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result2_black[0];
			ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) result2_black[1];
			ExtendedJamoppPackageElement jSubPackage = (ExtendedJamoppPackageElement) result2_black[2];
			Object[] result2_green = PackageChildImpl
					.pattern_PackageChild_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PackageChildImpl.pattern_PackageChild_20_3_expressionFBBBBB(
					this, match, extendedJamoppJavaContainer,
					extendedJamoppPackageElement, jSubPackage)) {
				// Ensure that the correct types of elements are matched
				if (PackageChildImpl.pattern_PackageChild_20_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = PackageChildImpl
							.pattern_PackageChild_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					PackageChildImpl.pattern_PackageChild_20_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return PackageChildImpl
				.pattern_PackageChild_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_25(
			EMoflonEdge _edge_predessor) {
		// prepare return value
		Object[] result1_bindingAndBlack = PackageChildImpl
				.pattern_PackageChild_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PackageChildImpl
				.pattern_PackageChild_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PackageChildImpl
				.pattern_PackageChild_21_2_blackFFFB(_edge_predessor)) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result2_black[0];
			ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) result2_black[1];
			ExtendedJamoppPackageElement jSubPackage = (ExtendedJamoppPackageElement) result2_black[2];
			Object[] result2_green = PackageChildImpl
					.pattern_PackageChild_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PackageChildImpl.pattern_PackageChild_21_3_expressionFBBBBB(
					this, match, extendedJamoppJavaContainer,
					extendedJamoppPackageElement, jSubPackage)) {
				// Ensure that the correct types of elements are matched
				if (PackageChildImpl.pattern_PackageChild_21_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = PackageChildImpl
							.pattern_PackageChild_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					PackageChildImpl.pattern_PackageChild_21_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return PackageChildImpl
				.pattern_PackageChild_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_26(
			EMoflonEdge _edge_successor) {
		// prepare return value
		Object[] result1_bindingAndBlack = PackageChildImpl
				.pattern_PackageChild_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PackageChildImpl
				.pattern_PackageChild_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PackageChildImpl
				.pattern_PackageChild_22_2_blackFFFB(_edge_successor)) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result2_black[0];
			ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) result2_black[1];
			ExtendedJamoppPackageElement jSubPackage = (ExtendedJamoppPackageElement) result2_black[2];
			Object[] result2_green = PackageChildImpl
					.pattern_PackageChild_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PackageChildImpl.pattern_PackageChild_22_3_expressionFBBBBB(
					this, match, extendedJamoppJavaContainer,
					extendedJamoppPackageElement, jSubPackage)) {
				// Ensure that the correct types of elements are matched
				if (PackageChildImpl.pattern_PackageChild_22_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = PackageChildImpl
							.pattern_PackageChild_22_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					PackageChildImpl.pattern_PackageChild_22_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return PackageChildImpl
				.pattern_PackageChild_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_34(
			EMoflonEdge _edge_parent) {
		// prepare return value
		Object[] result1_bindingAndBlack = PackageChildImpl
				.pattern_PackageChild_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PackageChildImpl
				.pattern_PackageChild_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PackageChildImpl
				.pattern_PackageChild_23_2_blackFFB(_edge_parent)) {
			TPackage tPackage = (TPackage) result2_black[0];
			TPackage tSubPackage = (TPackage) result2_black[1];
			Object[] result2_green = PackageChildImpl
					.pattern_PackageChild_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PackageChildImpl.pattern_PackageChild_23_3_expressionFBBBB(
					this, match, tPackage, tSubPackage)) {
				// Ensure that the correct types of elements are matched
				if (PackageChildImpl.pattern_PackageChild_23_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = PackageChildImpl
							.pattern_PackageChild_23_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					PackageChildImpl.pattern_PackageChild_23_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return PackageChildImpl
				.pattern_PackageChild_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_35(
			EMoflonEdge _edge_subpackage) {
		// prepare return value
		Object[] result1_bindingAndBlack = PackageChildImpl
				.pattern_PackageChild_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PackageChildImpl
				.pattern_PackageChild_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PackageChildImpl
				.pattern_PackageChild_24_2_blackFFB(_edge_subpackage)) {
			TPackage tPackage = (TPackage) result2_black[0];
			TPackage tSubPackage = (TPackage) result2_black[1];
			Object[] result2_green = PackageChildImpl
					.pattern_PackageChild_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PackageChildImpl.pattern_PackageChild_24_3_expressionFBBBB(
					this, match, tPackage, tSubPackage)) {
				// Ensure that the correct types of elements are matched
				if (PackageChildImpl.pattern_PackageChild_24_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = PackageChildImpl
							.pattern_PackageChild_24_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					PackageChildImpl.pattern_PackageChild_24_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return PackageChildImpl
				.pattern_PackageChild_24_6_expressionFB(__result);
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
		case RulesPackage.PACKAGE_CHILD___IS_APPROPRIATE_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT_EXTENDEDJAMOPPPACKAGEELEMENT:
			return isAppropriate_FWD((Match) arguments.get(0),
					(ExtendedJamoppJavaContainer) arguments.get(1),
					(ExtendedJamoppPackageElement) arguments.get(2),
					(ExtendedJamoppPackageElement) arguments.get(3));
		case RulesPackage.PACKAGE_CHILD___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PACKAGE_CHILD___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PACKAGE_CHILD___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT_EXTENDEDJAMOPPPACKAGEELEMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(ExtendedJamoppJavaContainer) arguments.get(1),
					(ExtendedJamoppPackageElement) arguments.get(2),
					(ExtendedJamoppPackageElement) arguments.get(3));
			return null;
		case RulesPackage.PACKAGE_CHILD___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT_EXTENDEDJAMOPPPACKAGEELEMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(ExtendedJamoppJavaContainer) arguments.get(1),
					(ExtendedJamoppPackageElement) arguments.get(2),
					(ExtendedJamoppPackageElement) arguments.get(3));
		case RulesPackage.PACKAGE_CHILD___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PACKAGE_CHILD___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT_EXTENDEDJAMOPPPACKAGEELEMENT_TPACKAGE_EXTENDEDJAMOPPPACKAGEELEMENTTOTPACKAGE:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedJamoppJavaContainer) arguments.get(1),
					(ExtendedJamoppPackageElement) arguments.get(2),
					(ExtendedJamoppPackageElement) arguments.get(3),
					(TPackage) arguments.get(4),
					(ExtendedJamoppPackageElementToTPackage) arguments.get(5));
		case RulesPackage.PACKAGE_CHILD___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PACKAGE_CHILD___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7));
			return null;
		case RulesPackage.PACKAGE_CHILD___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PACKAGE_CHILD___IS_APPROPRIATE_BWD__MATCH_TPACKAGE_TPACKAGE:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TPackage) arguments.get(1), (TPackage) arguments.get(2));
		case RulesPackage.PACKAGE_CHILD___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PACKAGE_CHILD___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PACKAGE_CHILD___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPACKAGE_TPACKAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TPackage) arguments.get(1), (TPackage) arguments.get(2));
			return null;
		case RulesPackage.PACKAGE_CHILD___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPACKAGE_TPACKAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TPackage) arguments.get(1), (TPackage) arguments.get(2));
		case RulesPackage.PACKAGE_CHILD___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PACKAGE_CHILD___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT_TPACKAGE_EXTENDEDJAMOPPPACKAGEELEMENTTOTPACKAGE_TPACKAGE:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(ExtendedJamoppJavaContainer) arguments.get(1),
					(ExtendedJamoppPackageElement) arguments.get(2),
					(TPackage) arguments.get(3),
					(ExtendedJamoppPackageElementToTPackage) arguments.get(4),
					(TPackage) arguments.get(5));
		case RulesPackage.PACKAGE_CHILD___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PACKAGE_CHILD___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7));
			return null;
		case RulesPackage.PACKAGE_CHILD___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PACKAGE_CHILD___IS_APPROPRIATE_FWD_EMOFLON_EDGE_24__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_24((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PACKAGE_CHILD___IS_APPROPRIATE_FWD_EMOFLON_EDGE_25__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_25((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PACKAGE_CHILD___IS_APPROPRIATE_FWD_EMOFLON_EDGE_26__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_26((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PACKAGE_CHILD___IS_APPROPRIATE_BWD_EMOFLON_EDGE_34__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_34((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PACKAGE_CHILD___IS_APPROPRIATE_BWD_EMOFLON_EDGE_35__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_35((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PACKAGE_CHILD___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PACKAGE_CHILD___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_PackageChild_0_1_blackBBBBB(
			PackageChild _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppPackageElement jSubPackage) {
		if (!extendedJamoppPackageElement.equals(jSubPackage)) {
			return new Object[] { _this, match, extendedJamoppJavaContainer,
					extendedJamoppPackageElement, jSubPackage };
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_0_2_bindingFBBBBB(
			PackageChild _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppPackageElement jSubPackage) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				extendedJamoppJavaContainer, extendedJamoppPackageElement,
				jSubPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match,
					extendedJamoppJavaContainer, extendedJamoppPackageElement,
					jSubPackage };
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PackageChild_0_2_bindingAndBlackFBBBBB(
			PackageChild _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppPackageElement jSubPackage) {
		Object[] result_pattern_PackageChild_0_2_binding = pattern_PackageChild_0_2_bindingFBBBBB(
				_this, match, extendedJamoppJavaContainer,
				extendedJamoppPackageElement, jSubPackage);
		if (result_pattern_PackageChild_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_PackageChild_0_2_binding[0];

			Object[] result_pattern_PackageChild_0_2_black = pattern_PackageChild_0_2_blackB(csp);
			if (result_pattern_PackageChild_0_2_black != null) {

				return new Object[] { csp, _this, match,
						extendedJamoppJavaContainer,
						extendedJamoppPackageElement, jSubPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_PackageChild_0_3_expressionFBB(
			PackageChild _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageChild_0_4_blackBBBB(
			Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppPackageElement jSubPackage) {
		if (!extendedJamoppPackageElement.equals(jSubPackage)) {
			return new Object[] { match, extendedJamoppJavaContainer,
					extendedJamoppPackageElement, jSubPackage };
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_0_4_greenBBBBFFF(
			Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppPackageElement jSubPackage) {
		EMoflonEdge extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jSubPackage__extendedJamoppPackageElement____predessor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedJamoppPackageElement__jSubPackage____successor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(jSubPackage);
		String extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement_name_prime = "extendedJamoppPackageElement";
		String jSubPackage__extendedJamoppPackageElement____predessor_name_prime = "predessor";
		String extendedJamoppPackageElement__jSubPackage____successor_name_prime = "successor";
		extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement
				.setSrc(extendedJamoppJavaContainer);
		extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement
				.setTrg(jSubPackage);
		match.getToBeTranslatedEdges()
				.add(extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement);
		jSubPackage__extendedJamoppPackageElement____predessor
				.setSrc(jSubPackage);
		jSubPackage__extendedJamoppPackageElement____predessor
				.setTrg(extendedJamoppPackageElement);
		match.getToBeTranslatedEdges().add(
				jSubPackage__extendedJamoppPackageElement____predessor);
		extendedJamoppPackageElement__jSubPackage____successor
				.setSrc(extendedJamoppPackageElement);
		extendedJamoppPackageElement__jSubPackage____successor
				.setTrg(jSubPackage);
		match.getToBeTranslatedEdges().add(
				extendedJamoppPackageElement__jSubPackage____successor);
		extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement
				.setName(extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement_name_prime);
		jSubPackage__extendedJamoppPackageElement____predessor
				.setName(jSubPackage__extendedJamoppPackageElement____predessor_name_prime);
		extendedJamoppPackageElement__jSubPackage____successor
				.setName(extendedJamoppPackageElement__jSubPackage____successor_name_prime);
		return new Object[] {
				match,
				extendedJamoppJavaContainer,
				extendedJamoppPackageElement,
				jSubPackage,
				extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement,
				jSubPackage__extendedJamoppPackageElement____predessor,
				extendedJamoppPackageElement__jSubPackage____successor };
	}

	public static final Object[] pattern_PackageChild_0_5_blackBBBB(
			Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppPackageElement jSubPackage) {
		if (!extendedJamoppPackageElement.equals(jSubPackage)) {
			return new Object[] { match, extendedJamoppJavaContainer,
					extendedJamoppPackageElement, jSubPackage };
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_0_5_greenBBBF(
			Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement) {
		EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(extendedJamoppJavaContainer);
		match.getContextNodes().add(extendedJamoppPackageElement);
		String extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement_name_prime = "extendedJamoppPackageElement";
		extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement
				.setSrc(extendedJamoppJavaContainer);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement
				.setTrg(extendedJamoppPackageElement);
		match.getContextEdges()
				.add(extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement
				.setName(extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement_name_prime);
		return new Object[] {
				match,
				extendedJamoppJavaContainer,
				extendedJamoppPackageElement,
				extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement };
	}

	public static final void pattern_PackageChild_0_6_expressionBBBBB(
			PackageChild _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppPackageElement jSubPackage) {
		_this.registerObjectsToMatch_FWD(match, extendedJamoppJavaContainer,
				extendedJamoppPackageElement, jSubPackage);

	}

	public static final boolean pattern_PackageChild_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PackageChild_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_PackageChild_1_1_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("extendedJamoppJavaContainer");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("extendedJamoppPackageElement");
		EObject _localVariable_2 = isApplicableMatch.getObject("jSubPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("tPackageToExtendedJamoppPackageElement");
		EObject tmpExtendedJamoppJavaContainer = _localVariable_0;
		EObject tmpExtendedJamoppPackageElement = _localVariable_1;
		EObject tmpJSubPackage = _localVariable_2;
		EObject tmpTPackage = _localVariable_3;
		EObject tmpTPackageToExtendedJamoppPackageElement = _localVariable_4;
		if (tmpExtendedJamoppJavaContainer instanceof ExtendedJamoppJavaContainer) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) tmpExtendedJamoppJavaContainer;
			if (tmpExtendedJamoppPackageElement instanceof ExtendedJamoppPackageElement) {
				ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) tmpExtendedJamoppPackageElement;
				if (tmpJSubPackage instanceof ExtendedJamoppPackageElement) {
					ExtendedJamoppPackageElement jSubPackage = (ExtendedJamoppPackageElement) tmpJSubPackage;
					if (tmpTPackage instanceof TPackage) {
						TPackage tPackage = (TPackage) tmpTPackage;
						if (tmpTPackageToExtendedJamoppPackageElement instanceof ExtendedJamoppPackageElementToTPackage) {
							ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement = (ExtendedJamoppPackageElementToTPackage) tmpTPackageToExtendedJamoppPackageElement;
							return new Object[] { extendedJamoppJavaContainer,
									extendedJamoppPackageElement, jSubPackage,
									tPackage,
									tPackageToExtendedJamoppPackageElement,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_1_1_blackBBBBBFBB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppPackageElement jSubPackage,
			TPackage tPackage,
			ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement,
			PackageChild _this, IsApplicableMatch isApplicableMatch) {
		if (!extendedJamoppPackageElement.equals(jSubPackage)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { extendedJamoppJavaContainer,
							extendedJamoppPackageElement, jSubPackage,
							tPackage, tPackageToExtendedJamoppPackageElement,
							csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_1_1_bindingAndBlackFFFFFFBB(
			PackageChild _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PackageChild_1_1_binding = pattern_PackageChild_1_1_bindingFFFFFB(isApplicableMatch);
		if (result_pattern_PackageChild_1_1_binding != null) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result_pattern_PackageChild_1_1_binding[0];
			ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) result_pattern_PackageChild_1_1_binding[1];
			ExtendedJamoppPackageElement jSubPackage = (ExtendedJamoppPackageElement) result_pattern_PackageChild_1_1_binding[2];
			TPackage tPackage = (TPackage) result_pattern_PackageChild_1_1_binding[3];
			ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement = (ExtendedJamoppPackageElementToTPackage) result_pattern_PackageChild_1_1_binding[4];

			Object[] result_pattern_PackageChild_1_1_black = pattern_PackageChild_1_1_blackBBBBBFBB(
					extendedJamoppJavaContainer, extendedJamoppPackageElement,
					jSubPackage, tPackage,
					tPackageToExtendedJamoppPackageElement, _this,
					isApplicableMatch);
			if (result_pattern_PackageChild_1_1_black != null) {
				CSP csp = (CSP) result_pattern_PackageChild_1_1_black[5];

				return new Object[] { extendedJamoppJavaContainer,
						extendedJamoppPackageElement, jSubPackage, tPackage,
						tPackageToExtendedJamoppPackageElement, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_1_1_greenBBFFB(
			ExtendedJamoppPackageElement jSubPackage, TPackage tPackage, CSP csp) {
		TPackage tSubPackage = TypeGraphBasicFactory.eINSTANCE.createTPackage();
		ExtendedJamoppPackageElementToTPackage tSubPackageToJSubPackage = GravityTGGFactory.eINSTANCE
				.createExtendedJamoppPackageElementToTPackage();
		Object _localVariable_0 = csp.getValue("tSubPackage", "tName");
		tSubPackage.setParent(tPackage);
		tSubPackageToJSubPackage.setTarget(tSubPackage);
		tSubPackageToJSubPackage.setSource(jSubPackage);
		String tSubPackage_tName_prime = (String) _localVariable_0;
		tSubPackage.setTName(tSubPackage_tName_prime);
		return new Object[] { jSubPackage, tPackage, tSubPackage,
				tSubPackageToJSubPackage, csp };
	}

	public static final Object[] pattern_PackageChild_1_2_blackBBB(
			ExtendedJamoppPackageElement jSubPackage, TPackage tSubPackage,
			ExtendedJamoppPackageElementToTPackage tSubPackageToJSubPackage) {
		return new Object[] { jSubPackage, tSubPackage,
				tSubPackageToJSubPackage };
	}

	public static final Object[] pattern_PackageChild_1_2_greenFBBB(
			ExtendedJamoppPackageElement jSubPackage, TPackage tSubPackage,
			ExtendedJamoppPackageElementToTPackage tSubPackageToJSubPackage) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(jSubPackage);
		ruleresult.getCreatedElements().add(tSubPackage);
		ruleresult.getCreatedLinkElements().add(tSubPackageToJSubPackage);
		return new Object[] { ruleresult, jSubPackage, tSubPackage,
				tSubPackageToJSubPackage };
	}

	public static final Object[] pattern_PackageChild_1_3_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject extendedJamoppJavaContainer,
			EObject extendedJamoppPackageElement, EObject jSubPackage,
			EObject tPackage, EObject tPackageToExtendedJamoppPackageElement,
			EObject tSubPackage, EObject tSubPackageToJSubPackage) {
		if (!extendedJamoppJavaContainer.equals(extendedJamoppPackageElement)) {
			if (!extendedJamoppJavaContainer.equals(jSubPackage)) {
				if (!extendedJamoppJavaContainer.equals(tPackage)) {
					if (!extendedJamoppJavaContainer
							.equals(tPackageToExtendedJamoppPackageElement)) {
						if (!extendedJamoppJavaContainer.equals(tSubPackage)) {
							if (!extendedJamoppJavaContainer
									.equals(tSubPackageToJSubPackage)) {
								if (!extendedJamoppPackageElement
										.equals(jSubPackage)) {
									if (!extendedJamoppPackageElement
											.equals(tPackage)) {
										if (!extendedJamoppPackageElement
												.equals(tPackageToExtendedJamoppPackageElement)) {
											if (!extendedJamoppPackageElement
													.equals(tSubPackage)) {
												if (!extendedJamoppPackageElement
														.equals(tSubPackageToJSubPackage)) {
													if (!jSubPackage
															.equals(tPackage)) {
														if (!jSubPackage
																.equals(tPackageToExtendedJamoppPackageElement)) {
															if (!jSubPackage
																	.equals(tSubPackage)) {
																if (!jSubPackage
																		.equals(tSubPackageToJSubPackage)) {
																	if (!tPackage
																			.equals(tPackageToExtendedJamoppPackageElement)) {
																		if (!tPackage
																				.equals(tSubPackage)) {
																			if (!tPackage
																					.equals(tSubPackageToJSubPackage)) {
																				if (!tPackageToExtendedJamoppPackageElement
																						.equals(tSubPackage)) {
																					if (!tPackageToExtendedJamoppPackageElement
																							.equals(tSubPackageToJSubPackage)) {
																						if (!tSubPackage
																								.equals(tSubPackageToJSubPackage)) {
																							return new Object[] {
																									ruleresult,
																									extendedJamoppJavaContainer,
																									extendedJamoppPackageElement,
																									jSubPackage,
																									tPackage,
																									tPackageToExtendedJamoppPackageElement,
																									tSubPackage,
																									tSubPackageToJSubPackage };
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

	public static final Object[] pattern_PackageChild_1_3_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject extendedJamoppJavaContainer,
			EObject extendedJamoppPackageElement, EObject jSubPackage,
			EObject tPackage, EObject tSubPackage,
			EObject tSubPackageToJSubPackage) {
		EMoflonEdge extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jSubPackage__extendedJamoppPackageElement____predessor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedJamoppPackageElement__jSubPackage____successor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tSubPackage__tPackage____parent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tPackage__tSubPackage____subpackage = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tSubPackageToJSubPackage__tSubPackage____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tSubPackageToJSubPackage__jSubPackage____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PackageChild";
		String extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement_name_prime = "extendedJamoppPackageElement";
		String jSubPackage__extendedJamoppPackageElement____predessor_name_prime = "predessor";
		String extendedJamoppPackageElement__jSubPackage____successor_name_prime = "successor";
		String tSubPackage__tPackage____parent_name_prime = "parent";
		String tPackage__tSubPackage____subpackage_name_prime = "subpackage";
		String tSubPackageToJSubPackage__tSubPackage____target_name_prime = "target";
		String tSubPackageToJSubPackage__jSubPackage____source_name_prime = "source";
		extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement
				.setSrc(extendedJamoppJavaContainer);
		extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement
				.setTrg(jSubPackage);
		ruleresult
				.getTranslatedEdges()
				.add(extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement);
		jSubPackage__extendedJamoppPackageElement____predessor
				.setSrc(jSubPackage);
		jSubPackage__extendedJamoppPackageElement____predessor
				.setTrg(extendedJamoppPackageElement);
		ruleresult.getTranslatedEdges().add(
				jSubPackage__extendedJamoppPackageElement____predessor);
		extendedJamoppPackageElement__jSubPackage____successor
				.setSrc(extendedJamoppPackageElement);
		extendedJamoppPackageElement__jSubPackage____successor
				.setTrg(jSubPackage);
		ruleresult.getTranslatedEdges().add(
				extendedJamoppPackageElement__jSubPackage____successor);
		tSubPackage__tPackage____parent.setSrc(tSubPackage);
		tSubPackage__tPackage____parent.setTrg(tPackage);
		ruleresult.getCreatedEdges().add(tSubPackage__tPackage____parent);
		tPackage__tSubPackage____subpackage.setSrc(tPackage);
		tPackage__tSubPackage____subpackage.setTrg(tSubPackage);
		ruleresult.getCreatedEdges().add(tPackage__tSubPackage____subpackage);
		tSubPackageToJSubPackage__tSubPackage____target
				.setSrc(tSubPackageToJSubPackage);
		tSubPackageToJSubPackage__tSubPackage____target.setTrg(tSubPackage);
		ruleresult.getCreatedEdges().add(
				tSubPackageToJSubPackage__tSubPackage____target);
		tSubPackageToJSubPackage__jSubPackage____source
				.setSrc(tSubPackageToJSubPackage);
		tSubPackageToJSubPackage__jSubPackage____source.setTrg(jSubPackage);
		ruleresult.getCreatedEdges().add(
				tSubPackageToJSubPackage__jSubPackage____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement
				.setName(extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement_name_prime);
		jSubPackage__extendedJamoppPackageElement____predessor
				.setName(jSubPackage__extendedJamoppPackageElement____predessor_name_prime);
		extendedJamoppPackageElement__jSubPackage____successor
				.setName(extendedJamoppPackageElement__jSubPackage____successor_name_prime);
		tSubPackage__tPackage____parent
				.setName(tSubPackage__tPackage____parent_name_prime);
		tPackage__tSubPackage____subpackage
				.setName(tPackage__tSubPackage____subpackage_name_prime);
		tSubPackageToJSubPackage__tSubPackage____target
				.setName(tSubPackageToJSubPackage__tSubPackage____target_name_prime);
		tSubPackageToJSubPackage__jSubPackage____source
				.setName(tSubPackageToJSubPackage__jSubPackage____source_name_prime);
		return new Object[] {
				ruleresult,
				extendedJamoppJavaContainer,
				extendedJamoppPackageElement,
				jSubPackage,
				tPackage,
				tSubPackage,
				tSubPackageToJSubPackage,
				extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement,
				jSubPackage__extendedJamoppPackageElement____predessor,
				extendedJamoppPackageElement__jSubPackage____successor,
				tSubPackage__tPackage____parent,
				tPackage__tSubPackage____subpackage,
				tSubPackageToJSubPackage__tSubPackage____target,
				tSubPackageToJSubPackage__jSubPackage____source };
	}

	public static final void pattern_PackageChild_1_5_expressionBBBBBBBBB(
			PackageChild _this, PerformRuleResult ruleresult,
			EObject extendedJamoppJavaContainer,
			EObject extendedJamoppPackageElement, EObject jSubPackage,
			EObject tPackage, EObject tPackageToExtendedJamoppPackageElement,
			EObject tSubPackage, EObject tSubPackageToJSubPackage) {
		_this.registerObjects_FWD(ruleresult, extendedJamoppJavaContainer,
				extendedJamoppPackageElement, jSubPackage, tPackage,
				tPackageToExtendedJamoppPackageElement, tSubPackage,
				tSubPackageToJSubPackage);

	}

	public static final PerformRuleResult pattern_PackageChild_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PackageChild_2_1_bindingFB(
			PackageChild _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_2_1_blackFBB(
			EClass eClass, PackageChild _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PackageChild_2_1_bindingAndBlackFFB(
			PackageChild _this) {
		Object[] result_pattern_PackageChild_2_1_binding = pattern_PackageChild_2_1_bindingFB(_this);
		if (result_pattern_PackageChild_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_PackageChild_2_1_binding[0];

			Object[] result_pattern_PackageChild_2_1_black = pattern_PackageChild_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_PackageChild_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PackageChild_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "PackageChild";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PackageChild_2_2_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match
				.getObject("extendedJamoppJavaContainer");
		EObject _localVariable_1 = match
				.getObject("extendedJamoppPackageElement");
		EObject _localVariable_2 = match.getObject("jSubPackage");
		EObject tmpExtendedJamoppJavaContainer = _localVariable_0;
		EObject tmpExtendedJamoppPackageElement = _localVariable_1;
		EObject tmpJSubPackage = _localVariable_2;
		if (tmpExtendedJamoppJavaContainer instanceof ExtendedJamoppJavaContainer) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) tmpExtendedJamoppJavaContainer;
			if (tmpExtendedJamoppPackageElement instanceof ExtendedJamoppPackageElement) {
				ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) tmpExtendedJamoppPackageElement;
				if (tmpJSubPackage instanceof ExtendedJamoppPackageElement) {
					ExtendedJamoppPackageElement jSubPackage = (ExtendedJamoppPackageElement) tmpJSubPackage;
					return new Object[] { extendedJamoppJavaContainer,
							extendedJamoppPackageElement, jSubPackage, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PackageChild_2_2_blackBBBFFB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppPackageElement jSubPackage, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!extendedJamoppPackageElement.equals(jSubPackage)) {
			for (ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(extendedJamoppPackageElement,
							ExtendedJamoppPackageElementToTPackage.class,
							"source")) {
				TPackage tPackage = tPackageToExtendedJamoppPackageElement
						.getTarget();
				if (tPackage != null) {
					_result.add(new Object[] { extendedJamoppJavaContainer,
							extendedJamoppPackageElement, jSubPackage,
							tPackage, tPackageToExtendedJamoppPackageElement,
							match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_PackageChild_2_3_blackBBBBB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppPackageElement jSubPackage,
			TPackage tPackage,
			ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!extendedJamoppPackageElement.equals(jSubPackage)) {
			if (extendedJamoppJavaContainer.getExtendedJamoppPackageElement()
					.contains(jSubPackage)) {
				if (extendedJamoppJavaContainer
						.getExtendedJamoppPackageElement().contains(
								extendedJamoppPackageElement)) {
					if (extendedJamoppPackageElement.equals(jSubPackage
							.getPredessor())) {
						if (tPackage
								.equals(tPackageToExtendedJamoppPackageElement
										.getTarget())) {
							if (extendedJamoppPackageElement
									.equals(tPackageToExtendedJamoppPackageElement
											.getSource())) {
								_result.add(new Object[] {
										extendedJamoppJavaContainer,
										extendedJamoppPackageElement,
										jSubPackage, tPackage,
										tPackageToExtendedJamoppPackageElement });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PackageChild_2_3_greenBBBBBFFFFFFF(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppPackageElement jSubPackage,
			TPackage tPackage,
			ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jSubPackage__extendedJamoppPackageElement____predessor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedJamoppPackageElement__jSubPackage____successor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tPackageToExtendedJamoppPackageElement__tPackage____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement_name_prime = "extendedJamoppPackageElement";
		String extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement_name_prime = "extendedJamoppPackageElement";
		String jSubPackage__extendedJamoppPackageElement____predessor_name_prime = "predessor";
		String extendedJamoppPackageElement__jSubPackage____successor_name_prime = "successor";
		String tPackageToExtendedJamoppPackageElement__tPackage____target_name_prime = "target";
		String tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(
				extendedJamoppJavaContainer);
		isApplicableMatch.getAllContextElements().add(
				extendedJamoppPackageElement);
		isApplicableMatch.getAllContextElements().add(jSubPackage);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(
				tPackageToExtendedJamoppPackageElement);
		extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement
				.setSrc(extendedJamoppJavaContainer);
		extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement
				.setTrg(jSubPackage);
		isApplicableMatch
				.getAllContextElements()
				.add(extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement
				.setSrc(extendedJamoppJavaContainer);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement
				.setTrg(extendedJamoppPackageElement);
		isApplicableMatch
				.getAllContextElements()
				.add(extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement);
		jSubPackage__extendedJamoppPackageElement____predessor
				.setSrc(jSubPackage);
		jSubPackage__extendedJamoppPackageElement____predessor
				.setTrg(extendedJamoppPackageElement);
		isApplicableMatch.getAllContextElements().add(
				jSubPackage__extendedJamoppPackageElement____predessor);
		extendedJamoppPackageElement__jSubPackage____successor
				.setSrc(extendedJamoppPackageElement);
		extendedJamoppPackageElement__jSubPackage____successor
				.setTrg(jSubPackage);
		isApplicableMatch.getAllContextElements().add(
				extendedJamoppPackageElement__jSubPackage____successor);
		tPackageToExtendedJamoppPackageElement__tPackage____target
				.setSrc(tPackageToExtendedJamoppPackageElement);
		tPackageToExtendedJamoppPackageElement__tPackage____target
				.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(
				tPackageToExtendedJamoppPackageElement__tPackage____target);
		tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source
				.setSrc(tPackageToExtendedJamoppPackageElement);
		tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source
				.setTrg(extendedJamoppPackageElement);
		isApplicableMatch
				.getAllContextElements()
				.add(tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source);
		extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement
				.setName(extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement_name_prime);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement
				.setName(extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement_name_prime);
		jSubPackage__extendedJamoppPackageElement____predessor
				.setName(jSubPackage__extendedJamoppPackageElement____predessor_name_prime);
		extendedJamoppPackageElement__jSubPackage____successor
				.setName(extendedJamoppPackageElement__jSubPackage____successor_name_prime);
		tPackageToExtendedJamoppPackageElement__tPackage____target
				.setName(tPackageToExtendedJamoppPackageElement__tPackage____target_name_prime);
		tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source
				.setName(tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source_name_prime);
		return new Object[] {
				extendedJamoppJavaContainer,
				extendedJamoppPackageElement,
				jSubPackage,
				tPackage,
				tPackageToExtendedJamoppPackageElement,
				isApplicableMatch,
				extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement,
				extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement,
				jSubPackage__extendedJamoppPackageElement____predessor,
				extendedJamoppPackageElement__jSubPackage____successor,
				tPackageToExtendedJamoppPackageElement__tPackage____target,
				tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source };
	}

	public static final Object[] pattern_PackageChild_2_4_bindingFBBBBBBB(
			PackageChild _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppPackageElement jSubPackage,
			TPackage tPackage,
			ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, extendedJamoppJavaContainer,
				extendedJamoppPackageElement, jSubPackage, tPackage,
				tPackageToExtendedJamoppPackageElement);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					extendedJamoppJavaContainer, extendedJamoppPackageElement,
					jSubPackage, tPackage,
					tPackageToExtendedJamoppPackageElement };
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PackageChild_2_4_bindingAndBlackFBBBBBBB(
			PackageChild _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppPackageElement jSubPackage,
			TPackage tPackage,
			ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement) {
		Object[] result_pattern_PackageChild_2_4_binding = pattern_PackageChild_2_4_bindingFBBBBBBB(
				_this, isApplicableMatch, extendedJamoppJavaContainer,
				extendedJamoppPackageElement, jSubPackage, tPackage,
				tPackageToExtendedJamoppPackageElement);
		if (result_pattern_PackageChild_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_PackageChild_2_4_binding[0];

			Object[] result_pattern_PackageChild_2_4_black = pattern_PackageChild_2_4_blackB(csp);
			if (result_pattern_PackageChild_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						extendedJamoppJavaContainer,
						extendedJamoppPackageElement, jSubPackage, tPackage,
						tPackageToExtendedJamoppPackageElement };
			}
		}
		return null;
	}

	public static final boolean pattern_PackageChild_2_5_expressionFBB(
			PackageChild _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageChild_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PackageChild_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PackageChild";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PackageChild_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PackageChild_10_1_blackBBBB(
			PackageChild _this, Match match, TPackage tPackage,
			TPackage tSubPackage) {
		if (!tPackage.equals(tSubPackage)) {
			return new Object[] { _this, match, tPackage, tSubPackage };
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_10_2_bindingFBBBB(
			PackageChild _this, Match match, TPackage tPackage,
			TPackage tSubPackage) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				tPackage, tSubPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tPackage, tSubPackage };
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PackageChild_10_2_bindingAndBlackFBBBB(
			PackageChild _this, Match match, TPackage tPackage,
			TPackage tSubPackage) {
		Object[] result_pattern_PackageChild_10_2_binding = pattern_PackageChild_10_2_bindingFBBBB(
				_this, match, tPackage, tSubPackage);
		if (result_pattern_PackageChild_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_PackageChild_10_2_binding[0];

			Object[] result_pattern_PackageChild_10_2_black = pattern_PackageChild_10_2_blackB(csp);
			if (result_pattern_PackageChild_10_2_black != null) {

				return new Object[] { csp, _this, match, tPackage, tSubPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_PackageChild_10_3_expressionFBB(
			PackageChild _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageChild_10_4_blackBBB(
			Match match, TPackage tPackage, TPackage tSubPackage) {
		if (!tPackage.equals(tSubPackage)) {
			return new Object[] { match, tPackage, tSubPackage };
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_10_4_greenBBBFF(
			Match match, TPackage tPackage, TPackage tSubPackage) {
		EMoflonEdge tSubPackage__tPackage____parent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tPackage__tSubPackage____subpackage = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tSubPackage);
		String tSubPackage__tPackage____parent_name_prime = "parent";
		String tPackage__tSubPackage____subpackage_name_prime = "subpackage";
		tSubPackage__tPackage____parent.setSrc(tSubPackage);
		tSubPackage__tPackage____parent.setTrg(tPackage);
		match.getToBeTranslatedEdges().add(tSubPackage__tPackage____parent);
		tPackage__tSubPackage____subpackage.setSrc(tPackage);
		tPackage__tSubPackage____subpackage.setTrg(tSubPackage);
		match.getToBeTranslatedEdges().add(tPackage__tSubPackage____subpackage);
		tSubPackage__tPackage____parent
				.setName(tSubPackage__tPackage____parent_name_prime);
		tPackage__tSubPackage____subpackage
				.setName(tPackage__tSubPackage____subpackage_name_prime);
		return new Object[] { match, tPackage, tSubPackage,
				tSubPackage__tPackage____parent,
				tPackage__tSubPackage____subpackage };
	}

	public static final Object[] pattern_PackageChild_10_5_blackBBB(
			Match match, TPackage tPackage, TPackage tSubPackage) {
		if (!tPackage.equals(tSubPackage)) {
			return new Object[] { match, tPackage, tSubPackage };
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_10_5_greenBB(Match match,
			TPackage tPackage) {
		match.getContextNodes().add(tPackage);
		return new Object[] { match, tPackage };
	}

	public static final void pattern_PackageChild_10_6_expressionBBBB(
			PackageChild _this, Match match, TPackage tPackage,
			TPackage tSubPackage) {
		_this.registerObjectsToMatch_BWD(match, tPackage, tSubPackage);

	}

	public static final boolean pattern_PackageChild_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PackageChild_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_PackageChild_11_1_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("extendedJamoppJavaContainer");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("extendedJamoppPackageElement");
		EObject _localVariable_2 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("tPackageToExtendedJamoppPackageElement");
		EObject _localVariable_4 = isApplicableMatch.getObject("tSubPackage");
		EObject tmpExtendedJamoppJavaContainer = _localVariable_0;
		EObject tmpExtendedJamoppPackageElement = _localVariable_1;
		EObject tmpTPackage = _localVariable_2;
		EObject tmpTPackageToExtendedJamoppPackageElement = _localVariable_3;
		EObject tmpTSubPackage = _localVariable_4;
		if (tmpExtendedJamoppJavaContainer instanceof ExtendedJamoppJavaContainer) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) tmpExtendedJamoppJavaContainer;
			if (tmpExtendedJamoppPackageElement instanceof ExtendedJamoppPackageElement) {
				ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) tmpExtendedJamoppPackageElement;
				if (tmpTPackage instanceof TPackage) {
					TPackage tPackage = (TPackage) tmpTPackage;
					if (tmpTPackageToExtendedJamoppPackageElement instanceof ExtendedJamoppPackageElementToTPackage) {
						ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement = (ExtendedJamoppPackageElementToTPackage) tmpTPackageToExtendedJamoppPackageElement;
						if (tmpTSubPackage instanceof TPackage) {
							TPackage tSubPackage = (TPackage) tmpTSubPackage;
							return new Object[] { extendedJamoppJavaContainer,
									extendedJamoppPackageElement, tPackage,
									tPackageToExtendedJamoppPackageElement,
									tSubPackage, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_11_1_blackBBBBBFBB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			TPackage tPackage,
			ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement,
			TPackage tSubPackage, PackageChild _this,
			IsApplicableMatch isApplicableMatch) {
		if (!tPackage.equals(tSubPackage)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { extendedJamoppJavaContainer,
							extendedJamoppPackageElement, tPackage,
							tPackageToExtendedJamoppPackageElement,
							tSubPackage, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_11_1_bindingAndBlackFFFFFFBB(
			PackageChild _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PackageChild_11_1_binding = pattern_PackageChild_11_1_bindingFFFFFB(isApplicableMatch);
		if (result_pattern_PackageChild_11_1_binding != null) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) result_pattern_PackageChild_11_1_binding[0];
			ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) result_pattern_PackageChild_11_1_binding[1];
			TPackage tPackage = (TPackage) result_pattern_PackageChild_11_1_binding[2];
			ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement = (ExtendedJamoppPackageElementToTPackage) result_pattern_PackageChild_11_1_binding[3];
			TPackage tSubPackage = (TPackage) result_pattern_PackageChild_11_1_binding[4];

			Object[] result_pattern_PackageChild_11_1_black = pattern_PackageChild_11_1_blackBBBBBFBB(
					extendedJamoppJavaContainer, extendedJamoppPackageElement,
					tPackage, tPackageToExtendedJamoppPackageElement,
					tSubPackage, _this, isApplicableMatch);
			if (result_pattern_PackageChild_11_1_black != null) {
				CSP csp = (CSP) result_pattern_PackageChild_11_1_black[5];

				return new Object[] { extendedJamoppJavaContainer,
						extendedJamoppPackageElement, tPackage,
						tPackageToExtendedJamoppPackageElement, tSubPackage,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_11_1_greenBBFBFB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			TPackage tSubPackage, CSP csp) {
		ExtendedJamoppPackageElement jSubPackage = ExtendedJamoppFactory.eINSTANCE
				.createExtendedJamoppPackageElement();
		ExtendedJamoppPackageElementToTPackage tSubPackageToJSubPackage = GravityTGGFactory.eINSTANCE
				.createExtendedJamoppPackageElementToTPackage();
		Object _localVariable_0 = csp.getValue("jSubPackage", "name");
		extendedJamoppJavaContainer.getExtendedJamoppPackageElement().add(
				jSubPackage);
		jSubPackage.setPredessor(extendedJamoppPackageElement);
		tSubPackageToJSubPackage.setTarget(tSubPackage);
		tSubPackageToJSubPackage.setSource(jSubPackage);
		String jSubPackage_name_prime = (String) _localVariable_0;
		jSubPackage.setName(jSubPackage_name_prime);
		return new Object[] { extendedJamoppJavaContainer,
				extendedJamoppPackageElement, jSubPackage, tSubPackage,
				tSubPackageToJSubPackage, csp };
	}

	public static final Object[] pattern_PackageChild_11_2_blackBBB(
			ExtendedJamoppPackageElement jSubPackage, TPackage tSubPackage,
			ExtendedJamoppPackageElementToTPackage tSubPackageToJSubPackage) {
		return new Object[] { jSubPackage, tSubPackage,
				tSubPackageToJSubPackage };
	}

	public static final Object[] pattern_PackageChild_11_2_greenFBBB(
			ExtendedJamoppPackageElement jSubPackage, TPackage tSubPackage,
			ExtendedJamoppPackageElementToTPackage tSubPackageToJSubPackage) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(jSubPackage);
		ruleresult.getTranslatedElements().add(tSubPackage);
		ruleresult.getCreatedLinkElements().add(tSubPackageToJSubPackage);
		return new Object[] { ruleresult, jSubPackage, tSubPackage,
				tSubPackageToJSubPackage };
	}

	public static final Object[] pattern_PackageChild_11_3_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject extendedJamoppJavaContainer,
			EObject extendedJamoppPackageElement, EObject jSubPackage,
			EObject tPackage, EObject tPackageToExtendedJamoppPackageElement,
			EObject tSubPackage, EObject tSubPackageToJSubPackage) {
		if (!extendedJamoppJavaContainer.equals(extendedJamoppPackageElement)) {
			if (!extendedJamoppJavaContainer.equals(jSubPackage)) {
				if (!extendedJamoppJavaContainer.equals(tPackage)) {
					if (!extendedJamoppJavaContainer
							.equals(tPackageToExtendedJamoppPackageElement)) {
						if (!extendedJamoppJavaContainer.equals(tSubPackage)) {
							if (!extendedJamoppJavaContainer
									.equals(tSubPackageToJSubPackage)) {
								if (!extendedJamoppPackageElement
										.equals(jSubPackage)) {
									if (!extendedJamoppPackageElement
											.equals(tPackage)) {
										if (!extendedJamoppPackageElement
												.equals(tPackageToExtendedJamoppPackageElement)) {
											if (!extendedJamoppPackageElement
													.equals(tSubPackage)) {
												if (!extendedJamoppPackageElement
														.equals(tSubPackageToJSubPackage)) {
													if (!jSubPackage
															.equals(tPackage)) {
														if (!jSubPackage
																.equals(tPackageToExtendedJamoppPackageElement)) {
															if (!jSubPackage
																	.equals(tSubPackage)) {
																if (!jSubPackage
																		.equals(tSubPackageToJSubPackage)) {
																	if (!tPackage
																			.equals(tPackageToExtendedJamoppPackageElement)) {
																		if (!tPackage
																				.equals(tSubPackage)) {
																			if (!tPackage
																					.equals(tSubPackageToJSubPackage)) {
																				if (!tPackageToExtendedJamoppPackageElement
																						.equals(tSubPackage)) {
																					if (!tPackageToExtendedJamoppPackageElement
																							.equals(tSubPackageToJSubPackage)) {
																						if (!tSubPackage
																								.equals(tSubPackageToJSubPackage)) {
																							return new Object[] {
																									ruleresult,
																									extendedJamoppJavaContainer,
																									extendedJamoppPackageElement,
																									jSubPackage,
																									tPackage,
																									tPackageToExtendedJamoppPackageElement,
																									tSubPackage,
																									tSubPackageToJSubPackage };
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

	public static final Object[] pattern_PackageChild_11_3_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject extendedJamoppJavaContainer,
			EObject extendedJamoppPackageElement, EObject jSubPackage,
			EObject tPackage, EObject tSubPackage,
			EObject tSubPackageToJSubPackage) {
		EMoflonEdge extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jSubPackage__extendedJamoppPackageElement____predessor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge extendedJamoppPackageElement__jSubPackage____successor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tSubPackage__tPackage____parent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tPackage__tSubPackage____subpackage = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tSubPackageToJSubPackage__tSubPackage____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tSubPackageToJSubPackage__jSubPackage____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PackageChild";
		String extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement_name_prime = "extendedJamoppPackageElement";
		String jSubPackage__extendedJamoppPackageElement____predessor_name_prime = "predessor";
		String extendedJamoppPackageElement__jSubPackage____successor_name_prime = "successor";
		String tSubPackage__tPackage____parent_name_prime = "parent";
		String tPackage__tSubPackage____subpackage_name_prime = "subpackage";
		String tSubPackageToJSubPackage__tSubPackage____target_name_prime = "target";
		String tSubPackageToJSubPackage__jSubPackage____source_name_prime = "source";
		extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement
				.setSrc(extendedJamoppJavaContainer);
		extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement
				.setTrg(jSubPackage);
		ruleresult
				.getCreatedEdges()
				.add(extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement);
		jSubPackage__extendedJamoppPackageElement____predessor
				.setSrc(jSubPackage);
		jSubPackage__extendedJamoppPackageElement____predessor
				.setTrg(extendedJamoppPackageElement);
		ruleresult.getCreatedEdges().add(
				jSubPackage__extendedJamoppPackageElement____predessor);
		extendedJamoppPackageElement__jSubPackage____successor
				.setSrc(extendedJamoppPackageElement);
		extendedJamoppPackageElement__jSubPackage____successor
				.setTrg(jSubPackage);
		ruleresult.getCreatedEdges().add(
				extendedJamoppPackageElement__jSubPackage____successor);
		tSubPackage__tPackage____parent.setSrc(tSubPackage);
		tSubPackage__tPackage____parent.setTrg(tPackage);
		ruleresult.getTranslatedEdges().add(tSubPackage__tPackage____parent);
		tPackage__tSubPackage____subpackage.setSrc(tPackage);
		tPackage__tSubPackage____subpackage.setTrg(tSubPackage);
		ruleresult.getTranslatedEdges()
				.add(tPackage__tSubPackage____subpackage);
		tSubPackageToJSubPackage__tSubPackage____target
				.setSrc(tSubPackageToJSubPackage);
		tSubPackageToJSubPackage__tSubPackage____target.setTrg(tSubPackage);
		ruleresult.getCreatedEdges().add(
				tSubPackageToJSubPackage__tSubPackage____target);
		tSubPackageToJSubPackage__jSubPackage____source
				.setSrc(tSubPackageToJSubPackage);
		tSubPackageToJSubPackage__jSubPackage____source.setTrg(jSubPackage);
		ruleresult.getCreatedEdges().add(
				tSubPackageToJSubPackage__jSubPackage____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement
				.setName(extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement_name_prime);
		jSubPackage__extendedJamoppPackageElement____predessor
				.setName(jSubPackage__extendedJamoppPackageElement____predessor_name_prime);
		extendedJamoppPackageElement__jSubPackage____successor
				.setName(extendedJamoppPackageElement__jSubPackage____successor_name_prime);
		tSubPackage__tPackage____parent
				.setName(tSubPackage__tPackage____parent_name_prime);
		tPackage__tSubPackage____subpackage
				.setName(tPackage__tSubPackage____subpackage_name_prime);
		tSubPackageToJSubPackage__tSubPackage____target
				.setName(tSubPackageToJSubPackage__tSubPackage____target_name_prime);
		tSubPackageToJSubPackage__jSubPackage____source
				.setName(tSubPackageToJSubPackage__jSubPackage____source_name_prime);
		return new Object[] {
				ruleresult,
				extendedJamoppJavaContainer,
				extendedJamoppPackageElement,
				jSubPackage,
				tPackage,
				tSubPackage,
				tSubPackageToJSubPackage,
				extendedJamoppJavaContainer__jSubPackage____extendedJamoppPackageElement,
				jSubPackage__extendedJamoppPackageElement____predessor,
				extendedJamoppPackageElement__jSubPackage____successor,
				tSubPackage__tPackage____parent,
				tPackage__tSubPackage____subpackage,
				tSubPackageToJSubPackage__tSubPackage____target,
				tSubPackageToJSubPackage__jSubPackage____source };
	}

	public static final void pattern_PackageChild_11_5_expressionBBBBBBBBB(
			PackageChild _this, PerformRuleResult ruleresult,
			EObject extendedJamoppJavaContainer,
			EObject extendedJamoppPackageElement, EObject jSubPackage,
			EObject tPackage, EObject tPackageToExtendedJamoppPackageElement,
			EObject tSubPackage, EObject tSubPackageToJSubPackage) {
		_this.registerObjects_BWD(ruleresult, extendedJamoppJavaContainer,
				extendedJamoppPackageElement, jSubPackage, tPackage,
				tPackageToExtendedJamoppPackageElement, tSubPackage,
				tSubPackageToJSubPackage);

	}

	public static final PerformRuleResult pattern_PackageChild_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PackageChild_12_1_bindingFB(
			PackageChild _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_12_1_blackFBB(
			EClass eClass, PackageChild _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PackageChild_12_1_bindingAndBlackFFB(
			PackageChild _this) {
		Object[] result_pattern_PackageChild_12_1_binding = pattern_PackageChild_12_1_bindingFB(_this);
		if (result_pattern_PackageChild_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_PackageChild_12_1_binding[0];

			Object[] result_pattern_PackageChild_12_1_black = pattern_PackageChild_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_PackageChild_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PackageChild_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "PackageChild";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PackageChild_12_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("tPackage");
		EObject _localVariable_1 = match.getObject("tSubPackage");
		EObject tmpTPackage = _localVariable_0;
		EObject tmpTSubPackage = _localVariable_1;
		if (tmpTPackage instanceof TPackage) {
			TPackage tPackage = (TPackage) tmpTPackage;
			if (tmpTSubPackage instanceof TPackage) {
				TPackage tSubPackage = (TPackage) tmpTSubPackage;
				return new Object[] { tPackage, tSubPackage, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PackageChild_12_2_blackFBFBB(
			TPackage tPackage, TPackage tSubPackage, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tPackage.equals(tSubPackage)) {
			for (ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tPackage,
							ExtendedJamoppPackageElementToTPackage.class,
							"target")) {
				ExtendedJamoppPackageElement extendedJamoppPackageElement = tPackageToExtendedJamoppPackageElement
						.getSource();
				if (extendedJamoppPackageElement != null) {
					_result.add(new Object[] { extendedJamoppPackageElement,
							tPackage, tPackageToExtendedJamoppPackageElement,
							tSubPackage, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_PackageChild_12_3_blackFBBBB(
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			TPackage tPackage,
			ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement,
			TPackage tSubPackage) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tPackage.equals(tSubPackage)) {
			if (tPackage.equals(tPackageToExtendedJamoppPackageElement
					.getTarget())) {
				if (extendedJamoppPackageElement
						.equals(tPackageToExtendedJamoppPackageElement
								.getSource())) {
					if (tPackage.equals(tSubPackage.getParent())) {
						for (ExtendedJamoppJavaContainer extendedJamoppJavaContainer : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(
										extendedJamoppPackageElement,
										ExtendedJamoppJavaContainer.class,
										"extendedJamoppPackageElement")) {
							_result.add(new Object[] {
									extendedJamoppJavaContainer,
									extendedJamoppPackageElement, tPackage,
									tPackageToExtendedJamoppPackageElement,
									tSubPackage });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PackageChild_12_3_greenBBBBBFFFFFF(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			TPackage tPackage,
			ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement,
			TPackage tSubPackage) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tPackageToExtendedJamoppPackageElement__tPackage____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tSubPackage__tPackage____parent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tPackage__tSubPackage____subpackage = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement_name_prime = "extendedJamoppPackageElement";
		String tPackageToExtendedJamoppPackageElement__tPackage____target_name_prime = "target";
		String tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source_name_prime = "source";
		String tSubPackage__tPackage____parent_name_prime = "parent";
		String tPackage__tSubPackage____subpackage_name_prime = "subpackage";
		isApplicableMatch.getAllContextElements().add(
				extendedJamoppJavaContainer);
		isApplicableMatch.getAllContextElements().add(
				extendedJamoppPackageElement);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(
				tPackageToExtendedJamoppPackageElement);
		isApplicableMatch.getAllContextElements().add(tSubPackage);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement
				.setSrc(extendedJamoppJavaContainer);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement
				.setTrg(extendedJamoppPackageElement);
		isApplicableMatch
				.getAllContextElements()
				.add(extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement);
		tPackageToExtendedJamoppPackageElement__tPackage____target
				.setSrc(tPackageToExtendedJamoppPackageElement);
		tPackageToExtendedJamoppPackageElement__tPackage____target
				.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(
				tPackageToExtendedJamoppPackageElement__tPackage____target);
		tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source
				.setSrc(tPackageToExtendedJamoppPackageElement);
		tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source
				.setTrg(extendedJamoppPackageElement);
		isApplicableMatch
				.getAllContextElements()
				.add(tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source);
		tSubPackage__tPackage____parent.setSrc(tSubPackage);
		tSubPackage__tPackage____parent.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(
				tSubPackage__tPackage____parent);
		tPackage__tSubPackage____subpackage.setSrc(tPackage);
		tPackage__tSubPackage____subpackage.setTrg(tSubPackage);
		isApplicableMatch.getAllContextElements().add(
				tPackage__tSubPackage____subpackage);
		extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement
				.setName(extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement_name_prime);
		tPackageToExtendedJamoppPackageElement__tPackage____target
				.setName(tPackageToExtendedJamoppPackageElement__tPackage____target_name_prime);
		tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source
				.setName(tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source_name_prime);
		tSubPackage__tPackage____parent
				.setName(tSubPackage__tPackage____parent_name_prime);
		tPackage__tSubPackage____subpackage
				.setName(tPackage__tSubPackage____subpackage_name_prime);
		return new Object[] {
				extendedJamoppJavaContainer,
				extendedJamoppPackageElement,
				tPackage,
				tPackageToExtendedJamoppPackageElement,
				tSubPackage,
				isApplicableMatch,
				extendedJamoppJavaContainer__extendedJamoppPackageElement____extendedJamoppPackageElement,
				tPackageToExtendedJamoppPackageElement__tPackage____target,
				tPackageToExtendedJamoppPackageElement__extendedJamoppPackageElement____source,
				tSubPackage__tPackage____parent,
				tPackage__tSubPackage____subpackage };
	}

	public static final Object[] pattern_PackageChild_12_4_bindingFBBBBBBB(
			PackageChild _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			TPackage tPackage,
			ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement,
			TPackage tSubPackage) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, extendedJamoppJavaContainer,
				extendedJamoppPackageElement, tPackage,
				tPackageToExtendedJamoppPackageElement, tSubPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					extendedJamoppJavaContainer, extendedJamoppPackageElement,
					tPackage, tPackageToExtendedJamoppPackageElement,
					tSubPackage };
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PackageChild_12_4_bindingAndBlackFBBBBBBB(
			PackageChild _this,
			IsApplicableMatch isApplicableMatch,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			TPackage tPackage,
			ExtendedJamoppPackageElementToTPackage tPackageToExtendedJamoppPackageElement,
			TPackage tSubPackage) {
		Object[] result_pattern_PackageChild_12_4_binding = pattern_PackageChild_12_4_bindingFBBBBBBB(
				_this, isApplicableMatch, extendedJamoppJavaContainer,
				extendedJamoppPackageElement, tPackage,
				tPackageToExtendedJamoppPackageElement, tSubPackage);
		if (result_pattern_PackageChild_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_PackageChild_12_4_binding[0];

			Object[] result_pattern_PackageChild_12_4_black = pattern_PackageChild_12_4_blackB(csp);
			if (result_pattern_PackageChild_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						extendedJamoppJavaContainer,
						extendedJamoppPackageElement, tPackage,
						tPackageToExtendedJamoppPackageElement, tSubPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_PackageChild_12_5_expressionFBB(
			PackageChild _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageChild_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PackageChild_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PackageChild";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PackageChild_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PackageChild_20_1_bindingFB(
			PackageChild _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_20_1_blackFBB(
			EClass __eClass, PackageChild _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PackageChild_20_1_bindingAndBlackFFB(
			PackageChild _this) {
		Object[] result_pattern_PackageChild_20_1_binding = pattern_PackageChild_20_1_bindingFB(_this);
		if (result_pattern_PackageChild_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PackageChild_20_1_binding[0];

			Object[] result_pattern_PackageChild_20_1_black = pattern_PackageChild_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PackageChild_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PackageChild_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PackageChild_20_2_black_nac_0BB(
			ExtendedJamoppPackageElement jSubPackage,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		for (ExtendedJamoppJavaContainer __DEC_jSubPackage_roots_202170 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(jSubPackage,
						ExtendedJamoppJavaContainer.class, "roots")) {
			if (!extendedJamoppJavaContainer
					.equals(__DEC_jSubPackage_roots_202170)) {
				return new Object[] { jSubPackage, extendedJamoppJavaContainer };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_20_2_black_nac_1BB(
			ExtendedJamoppPackageElement jSubPackage,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		for (ExtendedJamoppJavaContainer __DEC_jSubPackage_extendedJamoppPackageElement_453385 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(jSubPackage,
						ExtendedJamoppJavaContainer.class,
						"extendedJamoppPackageElement")) {
			if (!extendedJamoppJavaContainer
					.equals(__DEC_jSubPackage_extendedJamoppPackageElement_453385)) {
				return new Object[] { jSubPackage, extendedJamoppJavaContainer };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_20_2_black_nac_2BB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement jSubPackage) {
		if (extendedJamoppJavaContainer.getRoots().contains(jSubPackage)) {
			return new Object[] { extendedJamoppJavaContainer, jSubPackage };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PackageChild_20_2_blackFFFB(
			EMoflonEdge _edge_extendedJamoppPackageElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpExtendedJamoppJavaContainer = _edge_extendedJamoppPackageElement
				.getSrc();
		if (tmpExtendedJamoppJavaContainer instanceof ExtendedJamoppJavaContainer) {
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer = (ExtendedJamoppJavaContainer) tmpExtendedJamoppJavaContainer;
			EObject tmpJSubPackage = _edge_extendedJamoppPackageElement
					.getTrg();
			if (tmpJSubPackage instanceof ExtendedJamoppPackageElement) {
				ExtendedJamoppPackageElement jSubPackage = (ExtendedJamoppPackageElement) tmpJSubPackage;
				if (extendedJamoppJavaContainer
						.getExtendedJamoppPackageElement()
						.contains(jSubPackage)) {
					ExtendedJamoppPackageElement extendedJamoppPackageElement = jSubPackage
							.getPredessor();
					if (extendedJamoppPackageElement != null) {
						if (!extendedJamoppPackageElement.equals(jSubPackage)) {
							if (extendedJamoppJavaContainer
									.getExtendedJamoppPackageElement()
									.contains(extendedJamoppPackageElement)) {
								if (pattern_PackageChild_20_2_black_nac_0BB(
										jSubPackage,
										extendedJamoppJavaContainer) == null) {
									if (pattern_PackageChild_20_2_black_nac_1BB(
											jSubPackage,
											extendedJamoppJavaContainer) == null) {
										if (pattern_PackageChild_20_2_black_nac_2BB(
												extendedJamoppJavaContainer,
												jSubPackage) == null) {
											_result.add(new Object[] {
													extendedJamoppJavaContainer,
													extendedJamoppPackageElement,
													jSubPackage,
													_edge_extendedJamoppPackageElement });
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

	public static final Object[] pattern_PackageChild_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PackageChild_20_3_expressionFBBBBB(
			PackageChild _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppPackageElement jSubPackage) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				extendedJamoppJavaContainer, extendedJamoppPackageElement,
				jSubPackage);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PackageChild_20_4_expressionFBB(
			PackageChild _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageChild_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PackageChild_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PackageChild_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PackageChild_21_1_bindingFB(
			PackageChild _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_21_1_blackFBB(
			EClass __eClass, PackageChild _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PackageChild_21_1_bindingAndBlackFFB(
			PackageChild _this) {
		Object[] result_pattern_PackageChild_21_1_binding = pattern_PackageChild_21_1_bindingFB(_this);
		if (result_pattern_PackageChild_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PackageChild_21_1_binding[0];

			Object[] result_pattern_PackageChild_21_1_black = pattern_PackageChild_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PackageChild_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PackageChild_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PackageChild_21_2_black_nac_0BB(
			ExtendedJamoppPackageElement jSubPackage,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		for (ExtendedJamoppJavaContainer __DEC_jSubPackage_roots_572844 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(jSubPackage,
						ExtendedJamoppJavaContainer.class, "roots")) {
			if (!extendedJamoppJavaContainer
					.equals(__DEC_jSubPackage_roots_572844)) {
				return new Object[] { jSubPackage, extendedJamoppJavaContainer };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_21_2_black_nac_1BB(
			ExtendedJamoppPackageElement jSubPackage,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		for (ExtendedJamoppJavaContainer __DEC_jSubPackage_extendedJamoppPackageElement_183503 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(jSubPackage,
						ExtendedJamoppJavaContainer.class,
						"extendedJamoppPackageElement")) {
			if (!extendedJamoppJavaContainer
					.equals(__DEC_jSubPackage_extendedJamoppPackageElement_183503)) {
				return new Object[] { jSubPackage, extendedJamoppJavaContainer };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_21_2_black_nac_2BB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement jSubPackage) {
		if (extendedJamoppJavaContainer.getRoots().contains(jSubPackage)) {
			return new Object[] { extendedJamoppJavaContainer, jSubPackage };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PackageChild_21_2_blackFFFB(
			EMoflonEdge _edge_predessor) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJSubPackage = _edge_predessor.getSrc();
		if (tmpJSubPackage instanceof ExtendedJamoppPackageElement) {
			ExtendedJamoppPackageElement jSubPackage = (ExtendedJamoppPackageElement) tmpJSubPackage;
			EObject tmpExtendedJamoppPackageElement = _edge_predessor.getTrg();
			if (tmpExtendedJamoppPackageElement instanceof ExtendedJamoppPackageElement) {
				ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) tmpExtendedJamoppPackageElement;
				if (!extendedJamoppPackageElement.equals(jSubPackage)) {
					if (extendedJamoppPackageElement.equals(jSubPackage
							.getPredessor())) {
						for (ExtendedJamoppJavaContainer extendedJamoppJavaContainer : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(jSubPackage,
										ExtendedJamoppJavaContainer.class,
										"extendedJamoppPackageElement")) {
							if (extendedJamoppJavaContainer
									.getExtendedJamoppPackageElement()
									.contains(extendedJamoppPackageElement)) {
								if (pattern_PackageChild_21_2_black_nac_0BB(
										jSubPackage,
										extendedJamoppJavaContainer) == null) {
									if (pattern_PackageChild_21_2_black_nac_1BB(
											jSubPackage,
											extendedJamoppJavaContainer) == null) {
										if (pattern_PackageChild_21_2_black_nac_2BB(
												extendedJamoppJavaContainer,
												jSubPackage) == null) {
											_result.add(new Object[] {
													extendedJamoppJavaContainer,
													extendedJamoppPackageElement,
													jSubPackage,
													_edge_predessor });
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

	public static final Object[] pattern_PackageChild_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PackageChild_21_3_expressionFBBBBB(
			PackageChild _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppPackageElement jSubPackage) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				extendedJamoppJavaContainer, extendedJamoppPackageElement,
				jSubPackage);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PackageChild_21_4_expressionFBB(
			PackageChild _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageChild_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PackageChild_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PackageChild_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PackageChild_22_1_bindingFB(
			PackageChild _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_22_1_blackFBB(
			EClass __eClass, PackageChild _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PackageChild_22_1_bindingAndBlackFFB(
			PackageChild _this) {
		Object[] result_pattern_PackageChild_22_1_binding = pattern_PackageChild_22_1_bindingFB(_this);
		if (result_pattern_PackageChild_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PackageChild_22_1_binding[0];

			Object[] result_pattern_PackageChild_22_1_black = pattern_PackageChild_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PackageChild_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PackageChild_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PackageChild_22_2_black_nac_0BB(
			ExtendedJamoppPackageElement jSubPackage,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		for (ExtendedJamoppJavaContainer __DEC_jSubPackage_roots_584399 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(jSubPackage,
						ExtendedJamoppJavaContainer.class, "roots")) {
			if (!extendedJamoppJavaContainer
					.equals(__DEC_jSubPackage_roots_584399)) {
				return new Object[] { jSubPackage, extendedJamoppJavaContainer };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_22_2_black_nac_1BB(
			ExtendedJamoppPackageElement jSubPackage,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer) {
		for (ExtendedJamoppJavaContainer __DEC_jSubPackage_extendedJamoppPackageElement_878660 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(jSubPackage,
						ExtendedJamoppJavaContainer.class,
						"extendedJamoppPackageElement")) {
			if (!extendedJamoppJavaContainer
					.equals(__DEC_jSubPackage_extendedJamoppPackageElement_878660)) {
				return new Object[] { jSubPackage, extendedJamoppJavaContainer };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_22_2_black_nac_2BB(
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement jSubPackage) {
		if (extendedJamoppJavaContainer.getRoots().contains(jSubPackage)) {
			return new Object[] { extendedJamoppJavaContainer, jSubPackage };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PackageChild_22_2_blackFFFB(
			EMoflonEdge _edge_successor) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpExtendedJamoppPackageElement = _edge_successor.getSrc();
		if (tmpExtendedJamoppPackageElement instanceof ExtendedJamoppPackageElement) {
			ExtendedJamoppPackageElement extendedJamoppPackageElement = (ExtendedJamoppPackageElement) tmpExtendedJamoppPackageElement;
			EObject tmpJSubPackage = _edge_successor.getTrg();
			if (tmpJSubPackage instanceof ExtendedJamoppPackageElement) {
				ExtendedJamoppPackageElement jSubPackage = (ExtendedJamoppPackageElement) tmpJSubPackage;
				if (!extendedJamoppPackageElement.equals(jSubPackage)) {
					if (extendedJamoppPackageElement.equals(jSubPackage
							.getPredessor())) {
						for (ExtendedJamoppJavaContainer extendedJamoppJavaContainer : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(
										extendedJamoppPackageElement,
										ExtendedJamoppJavaContainer.class,
										"extendedJamoppPackageElement")) {
							if (extendedJamoppJavaContainer
									.getExtendedJamoppPackageElement()
									.contains(jSubPackage)) {
								if (pattern_PackageChild_22_2_black_nac_0BB(
										jSubPackage,
										extendedJamoppJavaContainer) == null) {
									if (pattern_PackageChild_22_2_black_nac_1BB(
											jSubPackage,
											extendedJamoppJavaContainer) == null) {
										if (pattern_PackageChild_22_2_black_nac_2BB(
												extendedJamoppJavaContainer,
												jSubPackage) == null) {
											_result.add(new Object[] {
													extendedJamoppJavaContainer,
													extendedJamoppPackageElement,
													jSubPackage,
													_edge_successor });
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

	public static final Object[] pattern_PackageChild_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PackageChild_22_3_expressionFBBBBB(
			PackageChild _this, Match match,
			ExtendedJamoppJavaContainer extendedJamoppJavaContainer,
			ExtendedJamoppPackageElement extendedJamoppPackageElement,
			ExtendedJamoppPackageElement jSubPackage) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				extendedJamoppJavaContainer, extendedJamoppPackageElement,
				jSubPackage);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PackageChild_22_4_expressionFBB(
			PackageChild _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageChild_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PackageChild_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PackageChild_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PackageChild_23_1_bindingFB(
			PackageChild _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_23_1_blackFBB(
			EClass __eClass, PackageChild _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PackageChild_23_1_bindingAndBlackFFB(
			PackageChild _this) {
		Object[] result_pattern_PackageChild_23_1_binding = pattern_PackageChild_23_1_bindingFB(_this);
		if (result_pattern_PackageChild_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PackageChild_23_1_binding[0];

			Object[] result_pattern_PackageChild_23_1_black = pattern_PackageChild_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PackageChild_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PackageChild_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PackageChild_23_2_black_nac_0B(
			TPackage tSubPackage) {
		for (TypeGraph __DEC_tSubPackage_packages_74242 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tSubPackage, TypeGraph.class,
						"packages")) {
			return new Object[] { tSubPackage };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PackageChild_23_2_blackFFB(
			EMoflonEdge _edge_parent) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTSubPackage = _edge_parent.getSrc();
		if (tmpTSubPackage instanceof TPackage) {
			TPackage tSubPackage = (TPackage) tmpTSubPackage;
			EObject tmpTPackage = _edge_parent.getTrg();
			if (tmpTPackage instanceof TPackage) {
				TPackage tPackage = (TPackage) tmpTPackage;
				if (!tPackage.equals(tSubPackage)) {
					if (tPackage.equals(tSubPackage.getParent())) {
						if (pattern_PackageChild_23_2_black_nac_0B(tSubPackage) == null) {
							_result.add(new Object[] { tPackage, tSubPackage,
									_edge_parent });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_PackageChild_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PackageChild_23_3_expressionFBBBB(
			PackageChild _this, Match match, TPackage tPackage,
			TPackage tSubPackage) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tPackage,
				tSubPackage);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PackageChild_23_4_expressionFBB(
			PackageChild _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageChild_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PackageChild_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PackageChild_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PackageChild_24_1_bindingFB(
			PackageChild _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_24_1_blackFBB(
			EClass __eClass, PackageChild _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PackageChild_24_1_bindingAndBlackFFB(
			PackageChild _this) {
		Object[] result_pattern_PackageChild_24_1_binding = pattern_PackageChild_24_1_bindingFB(_this);
		if (result_pattern_PackageChild_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PackageChild_24_1_binding[0];

			Object[] result_pattern_PackageChild_24_1_black = pattern_PackageChild_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PackageChild_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PackageChild_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageChild_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PackageChild_24_2_black_nac_0B(
			TPackage tSubPackage) {
		for (TypeGraph __DEC_tSubPackage_packages_987796 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tSubPackage, TypeGraph.class,
						"packages")) {
			return new Object[] { tSubPackage };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PackageChild_24_2_blackFFB(
			EMoflonEdge _edge_subpackage) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTPackage = _edge_subpackage.getSrc();
		if (tmpTPackage instanceof TPackage) {
			TPackage tPackage = (TPackage) tmpTPackage;
			EObject tmpTSubPackage = _edge_subpackage.getTrg();
			if (tmpTSubPackage instanceof TPackage) {
				TPackage tSubPackage = (TPackage) tmpTSubPackage;
				if (!tPackage.equals(tSubPackage)) {
					if (tPackage.equals(tSubPackage.getParent())) {
						if (pattern_PackageChild_24_2_black_nac_0B(tSubPackage) == null) {
							_result.add(new Object[] { tPackage, tSubPackage,
									_edge_subpackage });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_PackageChild_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PackageChild_24_3_expressionFBBBB(
			PackageChild _this, Match match, TPackage tPackage,
			TPackage tSubPackage) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tPackage,
				tSubPackage);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PackageChild_24_4_expressionFBB(
			PackageChild _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageChild_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PackageChild_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PackageChild_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PackageChildImpl
