/**
 */
package GravityTGG.Rules.impl;

import GravityTGG.ClassToTClass;
import GravityTGG.FieldToTField;
import GravityTGG.FieldToTFieldDefinition;
import GravityTGG.FieldToTFieldSignature;
import GravityTGG.GravityTGGFactory;

import GravityTGG.Rules.FieldNameCreate;
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

import TypeGraphBasic.TClass;
import TypeGraphBasic.TField;
import TypeGraphBasic.TFieldDefinition;
import TypeGraphBasic.TFieldSignature;
import TypeGraphBasic.TMember;
import TypeGraphBasic.TypeGraph;
import TypeGraphBasic.TypeGraphBasicFactory;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.emftext.language.java.members.Field;
import org.emftext.language.java.members.MembersFactory;
// <-- [user defined imports]
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;

// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Name Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FieldNameCreateImpl extends AbstractRuleImpl implements
		FieldNameCreate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldNameCreateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFieldNameCreate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField) {
		// initial bindings
		Object[] result1_black = FieldNameCreateImpl
				.pattern_FieldNameCreate_0_1_blackBBBB(this, match,
						jContainingClass, jField);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = FieldNameCreateImpl
				.pattern_FieldNameCreate_0_2_bindingAndBlackFBBBB(this, match,
						jContainingClass, jField);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (FieldNameCreateImpl.pattern_FieldNameCreate_0_3_expressionFBB(this,
				csp)) {

			// collect elements to be translated
			Object[] result4_black = FieldNameCreateImpl
					.pattern_FieldNameCreate_0_4_blackBBB(match,
							jContainingClass, jField);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			FieldNameCreateImpl.pattern_FieldNameCreate_0_4_greenBBBF(match,
					jContainingClass, jField);
			// EMoflonEdge jContainingClass__jField____members = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = FieldNameCreateImpl
					.pattern_FieldNameCreate_0_5_blackBBB(match,
							jContainingClass, jField);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			FieldNameCreateImpl.pattern_FieldNameCreate_0_5_greenBB(match,
					jContainingClass);

			// register objects to match
			FieldNameCreateImpl.pattern_FieldNameCreate_0_6_expressionBBBB(
					this, match, jContainingClass, jField);
			return FieldNameCreateImpl
					.pattern_FieldNameCreate_0_7_expressionF();
		} else {
			return FieldNameCreateImpl
					.pattern_FieldNameCreate_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = FieldNameCreateImpl
				.pattern_FieldNameCreate_1_1_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		org.emftext.language.java.classifiers.Class jContainingClass = (org.emftext.language.java.classifiers.Class) result1_bindingAndBlack[0];
		TClass tContainingClass = (TClass) result1_bindingAndBlack[1];
		Field jField = (Field) result1_bindingAndBlack[2];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[3];
		ClassToTClass jContainingClassToTContainingClass = (ClassToTClass) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = FieldNameCreateImpl
				.pattern_FieldNameCreate_1_1_greenFFFFBBFBFB(tContainingClass,
						jField, pg, csp);
		TFieldSignature tFieldSignature = (TFieldSignature) result1_green[0];
		TFieldDefinition tFieldDefinition = (TFieldDefinition) result1_green[1];
		FieldToTFieldSignature jFieldToTFieldSignature = (FieldToTFieldSignature) result1_green[2];
		FieldToTFieldDefinition jFieldToTFieldDefinition = (FieldToTFieldDefinition) result1_green[3];
		FieldToTField jFieldToTField = (FieldToTField) result1_green[6];
		TField tField = (TField) result1_green[8];

		// collect translated elements
		Object[] result2_black = FieldNameCreateImpl
				.pattern_FieldNameCreate_1_2_blackBBBBBBB(tFieldSignature,
						tFieldDefinition, jFieldToTFieldSignature,
						jFieldToTFieldDefinition, jField, jFieldToTField,
						tField);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = FieldNameCreateImpl
				.pattern_FieldNameCreate_1_2_greenFBBBBBBB(tFieldSignature,
						tFieldDefinition, jFieldToTFieldSignature,
						jFieldToTFieldDefinition, jField, jFieldToTField,
						tField);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = FieldNameCreateImpl
				.pattern_FieldNameCreate_1_3_blackBBBBBBBBBBBB(ruleresult,
						tFieldSignature, tFieldDefinition,
						jFieldToTFieldSignature, jFieldToTFieldDefinition,
						jContainingClass, tContainingClass, jField,
						jFieldToTField, pg, tField,
						jContainingClassToTContainingClass);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		FieldNameCreateImpl
				.pattern_FieldNameCreate_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
						ruleresult, tFieldSignature, tFieldDefinition,
						jFieldToTFieldSignature, jFieldToTFieldDefinition,
						jContainingClass, tContainingClass, jField,
						jFieldToTField, pg, tField);
		// EMoflonEdge tFieldSignature__tField____field = (EMoflonEdge) result3_green[11];
		// EMoflonEdge tField__tFieldSignature____signatures = (EMoflonEdge) result3_green[12];
		// EMoflonEdge tFieldSignature__tFieldDefinition____definitions = (EMoflonEdge) result3_green[13];
		// EMoflonEdge tFieldDefinition__tFieldSignature____signature = (EMoflonEdge) result3_green[14];
		// EMoflonEdge jFieldToTFieldSignature__jField____source = (EMoflonEdge) result3_green[15];
		// EMoflonEdge jFieldToTFieldSignature__tFieldSignature____target = (EMoflonEdge) result3_green[16];
		// EMoflonEdge jFieldToTFieldDefinition__jField____source = (EMoflonEdge) result3_green[17];
		// EMoflonEdge jFieldToTFieldDefinition__tFieldDefinition____target = (EMoflonEdge) result3_green[18];
		// EMoflonEdge jContainingClass__jField____members = (EMoflonEdge) result3_green[19];
		// EMoflonEdge tContainingClass__tFieldSignature____signature = (EMoflonEdge) result3_green[20];
		// EMoflonEdge tContainingClass__tFieldDefinition____defines = (EMoflonEdge) result3_green[21];
		// EMoflonEdge jFieldToTField__tField____target = (EMoflonEdge) result3_green[22];
		// EMoflonEdge jFieldToTField__jField____source = (EMoflonEdge) result3_green[23];
		// EMoflonEdge pg__tField____fields = (EMoflonEdge) result3_green[24];

		// perform postprocessing story node is empty
		// register objects
		FieldNameCreateImpl
				.pattern_FieldNameCreate_1_5_expressionBBBBBBBBBBBBB(this,
						ruleresult, tFieldSignature, tFieldDefinition,
						jFieldToTFieldSignature, jFieldToTFieldDefinition,
						jContainingClass, tContainingClass, jField,
						jFieldToTField, pg, tField,
						jContainingClassToTContainingClass);
		return FieldNameCreateImpl
				.pattern_FieldNameCreate_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameCreateImpl
				.pattern_FieldNameCreate_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameCreateImpl
				.pattern_FieldNameCreate_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = FieldNameCreateImpl
				.pattern_FieldNameCreate_2_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		org.emftext.language.java.classifiers.Class jContainingClass = (org.emftext.language.java.classifiers.Class) result2_binding[0];
		Field jField = (Field) result2_binding[1];
		for (Object[] result2_black : FieldNameCreateImpl
				.pattern_FieldNameCreate_2_2_blackBFBFB(jContainingClass,
						jField, match)) {
			TClass tContainingClass = (TClass) result2_black[1];
			ClassToTClass jContainingClassToTContainingClass = (ClassToTClass) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : FieldNameCreateImpl
					.pattern_FieldNameCreate_2_3_blackBBBFB(jContainingClass,
							tContainingClass, jField,
							jContainingClassToTContainingClass)) {
				TypeGraph pg = (TypeGraph) result3_black[3];
				Object[] result3_green = FieldNameCreateImpl
						.pattern_FieldNameCreate_2_3_greenBBBBBFFFFF(
								jContainingClass, tContainingClass, jField, pg,
								jContainingClassToTContainingClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge jContainingClass__jField____members = (EMoflonEdge) result3_green[6];
				// EMoflonEdge pg__tContainingClass____classes = (EMoflonEdge) result3_green[7];
				// EMoflonEdge jContainingClassToTContainingClass__jContainingClass____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge jContainingClassToTContainingClass__tContainingClass____target = (EMoflonEdge) result3_green[9];

				// solve CSP
				Object[] result4_bindingAndBlack = FieldNameCreateImpl
						.pattern_FieldNameCreate_2_4_bindingAndBlackFBBBBBBB(
								this, isApplicableMatch, jContainingClass,
								tContainingClass, jField, pg,
								jContainingClassToTContainingClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (FieldNameCreateImpl
						.pattern_FieldNameCreate_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = FieldNameCreateImpl
							.pattern_FieldNameCreate_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					FieldNameCreateImpl.pattern_FieldNameCreate_2_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return FieldNameCreateImpl
				.pattern_FieldNameCreate_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField) {
		match.registerObject("jContainingClass", jContainingClass);
		match.registerObject("jField", jField);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField) {// Create CSP
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
			org.emftext.language.java.classifiers.Class jContainingClass,
			TClass tContainingClass, Field jField, TypeGraph pg,
			ClassToTClass jContainingClassToTContainingClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_jField_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"jField.name", true, csp);
		var_jField_name.setValue(jField.getName());
		var_jField_name.setType("String");

		// Create unbound variables
		Variable var_tField_tName = CSPFactoryHelper.eINSTANCE.createVariable(
				"tField.tName", csp);
		var_tField_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_jField_name, var_tField_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jContainingClass", jContainingClass);
		isApplicableMatch.registerObject("tContainingClass", tContainingClass);
		isApplicableMatch.registerObject("jField", jField);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("jContainingClassToTContainingClass",
				jContainingClassToTContainingClass);
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
			EObject tFieldSignature, EObject tFieldDefinition,
			EObject jFieldToTFieldSignature, EObject jFieldToTFieldDefinition,
			EObject jContainingClass, EObject tContainingClass, EObject jField,
			EObject jFieldToTField, EObject pg, EObject tField,
			EObject jContainingClassToTContainingClass) {
		ruleresult.registerObject("tFieldSignature", tFieldSignature);
		ruleresult.registerObject("tFieldDefinition", tFieldDefinition);
		ruleresult.registerObject("jFieldToTFieldSignature",
				jFieldToTFieldSignature);
		ruleresult.registerObject("jFieldToTFieldDefinition",
				jFieldToTFieldDefinition);
		ruleresult.registerObject("jContainingClass", jContainingClass);
		ruleresult.registerObject("tContainingClass", tContainingClass);
		ruleresult.registerObject("jField", jField);
		ruleresult.registerObject("jFieldToTField", jFieldToTField);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("tField", tField);
		ruleresult.registerObject("jContainingClassToTContainingClass",
				jContainingClassToTContainingClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match
				.getObject("jField")
				.eClass()
				.equals(org.emftext.language.java.members.MembersPackage.eINSTANCE
						.getField());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match,
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			TClass tContainingClass, TypeGraph pg, TField tField) {
		// initial bindings
		Object[] result1_black = FieldNameCreateImpl
				.pattern_FieldNameCreate_10_1_blackBBBBBBB(this, match,
						tFieldSignature, tFieldDefinition, tContainingClass,
						pg, tField);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = FieldNameCreateImpl
				.pattern_FieldNameCreate_10_2_bindingAndBlackFBBBBBBB(this,
						match, tFieldSignature, tFieldDefinition,
						tContainingClass, pg, tField);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (FieldNameCreateImpl.pattern_FieldNameCreate_10_3_expressionFBB(
				this, csp)) {

			// collect elements to be translated
			Object[] result4_black = FieldNameCreateImpl
					.pattern_FieldNameCreate_10_4_blackBBBBBB(match,
							tFieldSignature, tFieldDefinition,
							tContainingClass, pg, tField);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			FieldNameCreateImpl
					.pattern_FieldNameCreate_10_4_greenBBBBBBFFFFFFF(match,
							tFieldSignature, tFieldDefinition,
							tContainingClass, pg, tField);
			// EMoflonEdge tFieldSignature__tField____field = (EMoflonEdge) result4_green[6];
			// EMoflonEdge tField__tFieldSignature____signatures = (EMoflonEdge) result4_green[7];
			// EMoflonEdge tFieldSignature__tFieldDefinition____definitions = (EMoflonEdge) result4_green[8];
			// EMoflonEdge tFieldDefinition__tFieldSignature____signature = (EMoflonEdge) result4_green[9];
			// EMoflonEdge tContainingClass__tFieldSignature____signature = (EMoflonEdge) result4_green[10];
			// EMoflonEdge tContainingClass__tFieldDefinition____defines = (EMoflonEdge) result4_green[11];
			// EMoflonEdge pg__tField____fields = (EMoflonEdge) result4_green[12];

			// collect context elements
			Object[] result5_black = FieldNameCreateImpl
					.pattern_FieldNameCreate_10_5_blackBBBBBB(match,
							tFieldSignature, tFieldDefinition,
							tContainingClass, pg, tField);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			FieldNameCreateImpl.pattern_FieldNameCreate_10_5_greenBBBF(match,
					tContainingClass, pg);
			// EMoflonEdge pg__tContainingClass____classes = (EMoflonEdge) result5_green[3];

			// register objects to match
			FieldNameCreateImpl.pattern_FieldNameCreate_10_6_expressionBBBBBBB(
					this, match, tFieldSignature, tFieldDefinition,
					tContainingClass, pg, tField);
			return FieldNameCreateImpl
					.pattern_FieldNameCreate_10_7_expressionF();
		} else {
			return FieldNameCreateImpl
					.pattern_FieldNameCreate_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = FieldNameCreateImpl
				.pattern_FieldNameCreate_11_1_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		TFieldSignature tFieldSignature = (TFieldSignature) result1_bindingAndBlack[0];
		TFieldDefinition tFieldDefinition = (TFieldDefinition) result1_bindingAndBlack[1];
		org.emftext.language.java.classifiers.Class jContainingClass = (org.emftext.language.java.classifiers.Class) result1_bindingAndBlack[2];
		TClass tContainingClass = (TClass) result1_bindingAndBlack[3];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[4];
		TField tField = (TField) result1_bindingAndBlack[5];
		ClassToTClass jContainingClassToTContainingClass = (ClassToTClass) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = FieldNameCreateImpl
				.pattern_FieldNameCreate_11_1_greenBBFFBFFBB(tFieldSignature,
						tFieldDefinition, jContainingClass, tField, csp);
		FieldToTFieldSignature jFieldToTFieldSignature = (FieldToTFieldSignature) result1_green[2];
		FieldToTFieldDefinition jFieldToTFieldDefinition = (FieldToTFieldDefinition) result1_green[3];
		Field jField = (Field) result1_green[5];
		FieldToTField jFieldToTField = (FieldToTField) result1_green[6];

		// collect translated elements
		Object[] result2_black = FieldNameCreateImpl
				.pattern_FieldNameCreate_11_2_blackBBBBBBB(tFieldSignature,
						tFieldDefinition, jFieldToTFieldSignature,
						jFieldToTFieldDefinition, jField, jFieldToTField,
						tField);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = FieldNameCreateImpl
				.pattern_FieldNameCreate_11_2_greenFBBBBBBB(tFieldSignature,
						tFieldDefinition, jFieldToTFieldSignature,
						jFieldToTFieldDefinition, jField, jFieldToTField,
						tField);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = FieldNameCreateImpl
				.pattern_FieldNameCreate_11_3_blackBBBBBBBBBBBB(ruleresult,
						tFieldSignature, tFieldDefinition,
						jFieldToTFieldSignature, jFieldToTFieldDefinition,
						jContainingClass, tContainingClass, jField,
						jFieldToTField, pg, tField,
						jContainingClassToTContainingClass);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		FieldNameCreateImpl
				.pattern_FieldNameCreate_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
						ruleresult, tFieldSignature, tFieldDefinition,
						jFieldToTFieldSignature, jFieldToTFieldDefinition,
						jContainingClass, tContainingClass, jField,
						jFieldToTField, pg, tField);
		// EMoflonEdge tFieldSignature__tField____field = (EMoflonEdge) result3_green[11];
		// EMoflonEdge tField__tFieldSignature____signatures = (EMoflonEdge) result3_green[12];
		// EMoflonEdge tFieldSignature__tFieldDefinition____definitions = (EMoflonEdge) result3_green[13];
		// EMoflonEdge tFieldDefinition__tFieldSignature____signature = (EMoflonEdge) result3_green[14];
		// EMoflonEdge jFieldToTFieldSignature__jField____source = (EMoflonEdge) result3_green[15];
		// EMoflonEdge jFieldToTFieldSignature__tFieldSignature____target = (EMoflonEdge) result3_green[16];
		// EMoflonEdge jFieldToTFieldDefinition__jField____source = (EMoflonEdge) result3_green[17];
		// EMoflonEdge jFieldToTFieldDefinition__tFieldDefinition____target = (EMoflonEdge) result3_green[18];
		// EMoflonEdge jContainingClass__jField____members = (EMoflonEdge) result3_green[19];
		// EMoflonEdge tContainingClass__tFieldSignature____signature = (EMoflonEdge) result3_green[20];
		// EMoflonEdge tContainingClass__tFieldDefinition____defines = (EMoflonEdge) result3_green[21];
		// EMoflonEdge jFieldToTField__tField____target = (EMoflonEdge) result3_green[22];
		// EMoflonEdge jFieldToTField__jField____source = (EMoflonEdge) result3_green[23];
		// EMoflonEdge pg__tField____fields = (EMoflonEdge) result3_green[24];

		// perform postprocessing story node is empty
		// register objects
		FieldNameCreateImpl
				.pattern_FieldNameCreate_11_5_expressionBBBBBBBBBBBBB(this,
						ruleresult, tFieldSignature, tFieldDefinition,
						jFieldToTFieldSignature, jFieldToTFieldDefinition,
						jContainingClass, tContainingClass, jField,
						jFieldToTField, pg, tField,
						jContainingClassToTContainingClass);
		return FieldNameCreateImpl
				.pattern_FieldNameCreate_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameCreateImpl
				.pattern_FieldNameCreate_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameCreateImpl
				.pattern_FieldNameCreate_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = FieldNameCreateImpl
				.pattern_FieldNameCreate_12_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		TFieldSignature tFieldSignature = (TFieldSignature) result2_binding[0];
		TFieldDefinition tFieldDefinition = (TFieldDefinition) result2_binding[1];
		TClass tContainingClass = (TClass) result2_binding[2];
		TypeGraph pg = (TypeGraph) result2_binding[3];
		TField tField = (TField) result2_binding[4];
		for (Object[] result2_black : FieldNameCreateImpl
				.pattern_FieldNameCreate_12_2_blackBBFBBBFB(tFieldSignature,
						tFieldDefinition, tContainingClass, pg, tField, match)) {
			org.emftext.language.java.classifiers.Class jContainingClass = (org.emftext.language.java.classifiers.Class) result2_black[2];
			ClassToTClass jContainingClassToTContainingClass = (ClassToTClass) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : FieldNameCreateImpl
					.pattern_FieldNameCreate_12_3_blackBBBBBBB(tFieldSignature,
							tFieldDefinition, jContainingClass,
							tContainingClass, pg, tField,
							jContainingClassToTContainingClass)) {
				Object[] result3_green = FieldNameCreateImpl
						.pattern_FieldNameCreate_12_3_greenBBBBBBBFFFFFFFFFFF(
								tFieldSignature, tFieldDefinition,
								jContainingClass, tContainingClass, pg, tField,
								jContainingClassToTContainingClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge tFieldSignature__tField____field = (EMoflonEdge) result3_green[8];
				// EMoflonEdge tField__tFieldSignature____signatures = (EMoflonEdge) result3_green[9];
				// EMoflonEdge tFieldSignature__tFieldDefinition____definitions = (EMoflonEdge) result3_green[10];
				// EMoflonEdge tFieldDefinition__tFieldSignature____signature = (EMoflonEdge) result3_green[11];
				// EMoflonEdge tContainingClass__tFieldSignature____signature = (EMoflonEdge) result3_green[12];
				// EMoflonEdge tContainingClass__tFieldDefinition____defines = (EMoflonEdge) result3_green[13];
				// EMoflonEdge pg__tField____fields = (EMoflonEdge) result3_green[14];
				// EMoflonEdge pg__tContainingClass____classes = (EMoflonEdge) result3_green[15];
				// EMoflonEdge jContainingClassToTContainingClass__jContainingClass____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge jContainingClassToTContainingClass__tContainingClass____target = (EMoflonEdge) result3_green[17];

				// solve CSP
				Object[] result4_bindingAndBlack = FieldNameCreateImpl
						.pattern_FieldNameCreate_12_4_bindingAndBlackFBBBBBBBBB(
								this, isApplicableMatch, tFieldSignature,
								tFieldDefinition, jContainingClass,
								tContainingClass, pg, tField,
								jContainingClassToTContainingClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (FieldNameCreateImpl
						.pattern_FieldNameCreate_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = FieldNameCreateImpl
							.pattern_FieldNameCreate_12_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					FieldNameCreateImpl.pattern_FieldNameCreate_12_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return FieldNameCreateImpl
				.pattern_FieldNameCreate_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			TClass tContainingClass, TypeGraph pg, TField tField) {
		match.registerObject("tFieldSignature", tFieldSignature);
		match.registerObject("tFieldDefinition", tFieldDefinition);
		match.registerObject("tContainingClass", tContainingClass);
		match.registerObject("pg", pg);
		match.registerObject("tField", tField);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			TClass tContainingClass, TypeGraph pg, TField tField) {// Create CSP
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
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			org.emftext.language.java.classifiers.Class jContainingClass,
			TClass tContainingClass, TypeGraph pg, TField tField,
			ClassToTClass jContainingClassToTContainingClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tField_tName = CSPFactoryHelper.eINSTANCE.createVariable(
				"tField.tName", true, csp);
		var_tField_tName.setValue(tField.getTName());
		var_tField_tName.setType("String");

		// Create unbound variables
		Variable var_jField_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"jField.name", csp);
		var_jField_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_jField_name, var_tField_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tFieldSignature", tFieldSignature);
		isApplicableMatch.registerObject("tFieldDefinition", tFieldDefinition);
		isApplicableMatch.registerObject("jContainingClass", jContainingClass);
		isApplicableMatch.registerObject("tContainingClass", tContainingClass);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("jContainingClassToTContainingClass",
				jContainingClassToTContainingClass);
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
			EObject tFieldSignature, EObject tFieldDefinition,
			EObject jFieldToTFieldSignature, EObject jFieldToTFieldDefinition,
			EObject jContainingClass, EObject tContainingClass, EObject jField,
			EObject jFieldToTField, EObject pg, EObject tField,
			EObject jContainingClassToTContainingClass) {
		ruleresult.registerObject("tFieldSignature", tFieldSignature);
		ruleresult.registerObject("tFieldDefinition", tFieldDefinition);
		ruleresult.registerObject("jFieldToTFieldSignature",
				jFieldToTFieldSignature);
		ruleresult.registerObject("jFieldToTFieldDefinition",
				jFieldToTFieldDefinition);
		ruleresult.registerObject("jContainingClass", jContainingClass);
		ruleresult.registerObject("tContainingClass", tContainingClass);
		ruleresult.registerObject("jField", jField);
		ruleresult.registerObject("jFieldToTField", jFieldToTField);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("tField", tField);
		ruleresult.registerObject("jContainingClassToTContainingClass",
				jContainingClassToTContainingClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& match.getObject("tFieldSignature")
						.eClass()
						.equals(TypeGraphBasic.TypeGraphBasicPackage.eINSTANCE
								.getTFieldSignature())
				&& match.getObject("tFieldDefinition")
						.eClass()
						.equals(TypeGraphBasic.TypeGraphBasicPackage.eINSTANCE
								.getTFieldDefinition())
				&& match.getObject("tField")
						.eClass()
						.equals(TypeGraphBasic.TypeGraphBasicPackage.eINSTANCE
								.getTField());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_24(
			EMoflonEdge _edge_field) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameCreateImpl
				.pattern_FieldNameCreate_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameCreateImpl
				.pattern_FieldNameCreate_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldNameCreateImpl
				.pattern_FieldNameCreate_20_2_blackFFFFFB(_edge_field)) {
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[0];
			TFieldDefinition tFieldDefinition = (TFieldDefinition) result2_black[1];
			TClass tContainingClass = (TClass) result2_black[2];
			TypeGraph pg = (TypeGraph) result2_black[3];
			TField tField = (TField) result2_black[4];
			Object[] result2_green = FieldNameCreateImpl
					.pattern_FieldNameCreate_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldNameCreateImpl
					.pattern_FieldNameCreate_20_3_expressionFBBBBBBB(this,
							match, tFieldSignature, tFieldDefinition,
							tContainingClass, pg, tField)) {
				// Ensure that the correct types of elements are matched
				if (FieldNameCreateImpl
						.pattern_FieldNameCreate_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = FieldNameCreateImpl
							.pattern_FieldNameCreate_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					FieldNameCreateImpl.pattern_FieldNameCreate_20_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return FieldNameCreateImpl
				.pattern_FieldNameCreate_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_25(
			EMoflonEdge _edge_signatures) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameCreateImpl
				.pattern_FieldNameCreate_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameCreateImpl
				.pattern_FieldNameCreate_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldNameCreateImpl
				.pattern_FieldNameCreate_21_2_blackFFFFFB(_edge_signatures)) {
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[0];
			TFieldDefinition tFieldDefinition = (TFieldDefinition) result2_black[1];
			TClass tContainingClass = (TClass) result2_black[2];
			TypeGraph pg = (TypeGraph) result2_black[3];
			TField tField = (TField) result2_black[4];
			Object[] result2_green = FieldNameCreateImpl
					.pattern_FieldNameCreate_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldNameCreateImpl
					.pattern_FieldNameCreate_21_3_expressionFBBBBBBB(this,
							match, tFieldSignature, tFieldDefinition,
							tContainingClass, pg, tField)) {
				// Ensure that the correct types of elements are matched
				if (FieldNameCreateImpl
						.pattern_FieldNameCreate_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = FieldNameCreateImpl
							.pattern_FieldNameCreate_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					FieldNameCreateImpl.pattern_FieldNameCreate_21_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return FieldNameCreateImpl
				.pattern_FieldNameCreate_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_26(
			EMoflonEdge _edge_definitions) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameCreateImpl
				.pattern_FieldNameCreate_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameCreateImpl
				.pattern_FieldNameCreate_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldNameCreateImpl
				.pattern_FieldNameCreate_22_2_blackFFFFFB(_edge_definitions)) {
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[0];
			TFieldDefinition tFieldDefinition = (TFieldDefinition) result2_black[1];
			TClass tContainingClass = (TClass) result2_black[2];
			TypeGraph pg = (TypeGraph) result2_black[3];
			TField tField = (TField) result2_black[4];
			Object[] result2_green = FieldNameCreateImpl
					.pattern_FieldNameCreate_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldNameCreateImpl
					.pattern_FieldNameCreate_22_3_expressionFBBBBBBB(this,
							match, tFieldSignature, tFieldDefinition,
							tContainingClass, pg, tField)) {
				// Ensure that the correct types of elements are matched
				if (FieldNameCreateImpl
						.pattern_FieldNameCreate_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = FieldNameCreateImpl
							.pattern_FieldNameCreate_22_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					FieldNameCreateImpl.pattern_FieldNameCreate_22_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return FieldNameCreateImpl
				.pattern_FieldNameCreate_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_27(
			EMoflonEdge _edge_signature) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameCreateImpl
				.pattern_FieldNameCreate_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameCreateImpl
				.pattern_FieldNameCreate_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldNameCreateImpl
				.pattern_FieldNameCreate_23_2_blackFFFFFB(_edge_signature)) {
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[0];
			TFieldDefinition tFieldDefinition = (TFieldDefinition) result2_black[1];
			TClass tContainingClass = (TClass) result2_black[2];
			TypeGraph pg = (TypeGraph) result2_black[3];
			TField tField = (TField) result2_black[4];
			Object[] result2_green = FieldNameCreateImpl
					.pattern_FieldNameCreate_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldNameCreateImpl
					.pattern_FieldNameCreate_23_3_expressionFBBBBBBB(this,
							match, tFieldSignature, tFieldDefinition,
							tContainingClass, pg, tField)) {
				// Ensure that the correct types of elements are matched
				if (FieldNameCreateImpl
						.pattern_FieldNameCreate_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = FieldNameCreateImpl
							.pattern_FieldNameCreate_23_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					FieldNameCreateImpl.pattern_FieldNameCreate_23_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return FieldNameCreateImpl
				.pattern_FieldNameCreate_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_20(
			EMoflonEdge _edge_members) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameCreateImpl
				.pattern_FieldNameCreate_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameCreateImpl
				.pattern_FieldNameCreate_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldNameCreateImpl
				.pattern_FieldNameCreate_24_2_blackFFB(_edge_members)) {
			org.emftext.language.java.classifiers.Class jContainingClass = (org.emftext.language.java.classifiers.Class) result2_black[0];
			Field jField = (Field) result2_black[1];
			Object[] result2_green = FieldNameCreateImpl
					.pattern_FieldNameCreate_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldNameCreateImpl
					.pattern_FieldNameCreate_24_3_expressionFBBBB(this, match,
							jContainingClass, jField)) {
				// Ensure that the correct types of elements are matched
				if (FieldNameCreateImpl
						.pattern_FieldNameCreate_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = FieldNameCreateImpl
							.pattern_FieldNameCreate_24_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					FieldNameCreateImpl.pattern_FieldNameCreate_24_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return FieldNameCreateImpl
				.pattern_FieldNameCreate_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_28(
			EMoflonEdge _edge_signature) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameCreateImpl
				.pattern_FieldNameCreate_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameCreateImpl
				.pattern_FieldNameCreate_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldNameCreateImpl
				.pattern_FieldNameCreate_25_2_blackFFFFFB(_edge_signature)) {
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[0];
			TFieldDefinition tFieldDefinition = (TFieldDefinition) result2_black[1];
			TClass tContainingClass = (TClass) result2_black[2];
			TypeGraph pg = (TypeGraph) result2_black[3];
			TField tField = (TField) result2_black[4];
			Object[] result2_green = FieldNameCreateImpl
					.pattern_FieldNameCreate_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldNameCreateImpl
					.pattern_FieldNameCreate_25_3_expressionFBBBBBBB(this,
							match, tFieldSignature, tFieldDefinition,
							tContainingClass, pg, tField)) {
				// Ensure that the correct types of elements are matched
				if (FieldNameCreateImpl
						.pattern_FieldNameCreate_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = FieldNameCreateImpl
							.pattern_FieldNameCreate_25_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					FieldNameCreateImpl.pattern_FieldNameCreate_25_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return FieldNameCreateImpl
				.pattern_FieldNameCreate_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_29(
			EMoflonEdge _edge_defines) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameCreateImpl
				.pattern_FieldNameCreate_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameCreateImpl
				.pattern_FieldNameCreate_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldNameCreateImpl
				.pattern_FieldNameCreate_26_2_blackFFFFFB(_edge_defines)) {
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[0];
			TFieldDefinition tFieldDefinition = (TFieldDefinition) result2_black[1];
			TClass tContainingClass = (TClass) result2_black[2];
			TypeGraph pg = (TypeGraph) result2_black[3];
			TField tField = (TField) result2_black[4];
			Object[] result2_green = FieldNameCreateImpl
					.pattern_FieldNameCreate_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldNameCreateImpl
					.pattern_FieldNameCreate_26_3_expressionFBBBBBBB(this,
							match, tFieldSignature, tFieldDefinition,
							tContainingClass, pg, tField)) {
				// Ensure that the correct types of elements are matched
				if (FieldNameCreateImpl
						.pattern_FieldNameCreate_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = FieldNameCreateImpl
							.pattern_FieldNameCreate_26_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					FieldNameCreateImpl.pattern_FieldNameCreate_26_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return FieldNameCreateImpl
				.pattern_FieldNameCreate_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_30(
			EMoflonEdge _edge_fields) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameCreateImpl
				.pattern_FieldNameCreate_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameCreateImpl
				.pattern_FieldNameCreate_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldNameCreateImpl
				.pattern_FieldNameCreate_27_2_blackFFFFFB(_edge_fields)) {
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[0];
			TFieldDefinition tFieldDefinition = (TFieldDefinition) result2_black[1];
			TClass tContainingClass = (TClass) result2_black[2];
			TypeGraph pg = (TypeGraph) result2_black[3];
			TField tField = (TField) result2_black[4];
			Object[] result2_green = FieldNameCreateImpl
					.pattern_FieldNameCreate_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldNameCreateImpl
					.pattern_FieldNameCreate_27_3_expressionFBBBBBBB(this,
							match, tFieldSignature, tFieldDefinition,
							tContainingClass, pg, tField)) {
				// Ensure that the correct types of elements are matched
				if (FieldNameCreateImpl
						.pattern_FieldNameCreate_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = FieldNameCreateImpl
							.pattern_FieldNameCreate_27_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					FieldNameCreateImpl.pattern_FieldNameCreate_27_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return FieldNameCreateImpl
				.pattern_FieldNameCreate_27_6_expressionFB(__result);
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
		case RulesPackage.FIELD_NAME_CREATE___IS_APPROPRIATE_FWD__MATCH_CLASS_FIELD:
			return isAppropriate_FWD((Match) arguments.get(0),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(1), (Field) arguments.get(2));
		case RulesPackage.FIELD_NAME_CREATE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_NAME_CREATE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_NAME_CREATE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASS_FIELD:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(1), (Field) arguments.get(2));
			return null;
		case RulesPackage.FIELD_NAME_CREATE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASS_FIELD:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(1), (Field) arguments.get(2));
		case RulesPackage.FIELD_NAME_CREATE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_NAME_CREATE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASS_TCLASS_FIELD_TYPEGRAPH_CLASSTOTCLASS:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(1), (TClass) arguments.get(2),
					(Field) arguments.get(3), (TypeGraph) arguments.get(4),
					(ClassToTClass) arguments.get(5));
		case RulesPackage.FIELD_NAME_CREATE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_NAME_CREATE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.FIELD_NAME_CREATE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_NAME_CREATE___IS_APPROPRIATE_BWD__MATCH_TFIELDSIGNATURE_TFIELDDEFINITION_TCLASS_TYPEGRAPH_TFIELD:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TFieldSignature) arguments.get(1),
					(TFieldDefinition) arguments.get(2),
					(TClass) arguments.get(3), (TypeGraph) arguments.get(4),
					(TField) arguments.get(5));
		case RulesPackage.FIELD_NAME_CREATE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_NAME_CREATE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_NAME_CREATE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TFIELDSIGNATURE_TFIELDDEFINITION_TCLASS_TYPEGRAPH_TFIELD:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TFieldSignature) arguments.get(1),
					(TFieldDefinition) arguments.get(2),
					(TClass) arguments.get(3), (TypeGraph) arguments.get(4),
					(TField) arguments.get(5));
			return null;
		case RulesPackage.FIELD_NAME_CREATE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TFIELDSIGNATURE_TFIELDDEFINITION_TCLASS_TYPEGRAPH_TFIELD:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TFieldSignature) arguments.get(1),
					(TFieldDefinition) arguments.get(2),
					(TClass) arguments.get(3), (TypeGraph) arguments.get(4),
					(TField) arguments.get(5));
		case RulesPackage.FIELD_NAME_CREATE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_NAME_CREATE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TFIELDSIGNATURE_TFIELDDEFINITION_CLASS_TCLASS_TYPEGRAPH_TFIELD_CLASSTOTCLASS:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(TFieldSignature) arguments.get(1),
					(TFieldDefinition) arguments.get(2),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(3), (TClass) arguments.get(4),
					(TypeGraph) arguments.get(5), (TField) arguments.get(6),
					(ClassToTClass) arguments.get(7));
		case RulesPackage.FIELD_NAME_CREATE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_NAME_CREATE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.FIELD_NAME_CREATE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_NAME_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_24__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_24((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIELD_NAME_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_25__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_25((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIELD_NAME_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_26__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_26((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIELD_NAME_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_27__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_27((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIELD_NAME_CREATE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_20__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_20((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIELD_NAME_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_28__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_28((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIELD_NAME_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_29__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_29((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIELD_NAME_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_30__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_30((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIELD_NAME_CREATE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_NAME_CREATE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_FieldNameCreate_0_1_blackBBBB(
			FieldNameCreate _this, Match match,
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField) {
		return new Object[] { _this, match, jContainingClass, jField };
	}

	public static final Object[] pattern_FieldNameCreate_0_2_bindingFBBBB(
			FieldNameCreate _this, Match match,
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match,
				jContainingClass, jField);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jContainingClass, jField };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldNameCreate_0_2_bindingAndBlackFBBBB(
			FieldNameCreate _this, Match match,
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField) {
		Object[] result_pattern_FieldNameCreate_0_2_binding = pattern_FieldNameCreate_0_2_bindingFBBBB(
				_this, match, jContainingClass, jField);
		if (result_pattern_FieldNameCreate_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_FieldNameCreate_0_2_binding[0];

			Object[] result_pattern_FieldNameCreate_0_2_black = pattern_FieldNameCreate_0_2_blackB(csp);
			if (result_pattern_FieldNameCreate_0_2_black != null) {

				return new Object[] { csp, _this, match, jContainingClass,
						jField };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldNameCreate_0_3_expressionFBB(
			FieldNameCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_0_4_blackBBB(
			Match match,
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField) {
		return new Object[] { match, jContainingClass, jField };
	}

	public static final Object[] pattern_FieldNameCreate_0_4_greenBBBF(
			Match match,
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField) {
		EMoflonEdge jContainingClass__jField____members = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(jField);
		String jContainingClass__jField____members_name_prime = "members";
		jContainingClass__jField____members.setSrc(jContainingClass);
		jContainingClass__jField____members.setTrg(jField);
		match.getToBeTranslatedEdges().add(jContainingClass__jField____members);
		jContainingClass__jField____members
				.setName(jContainingClass__jField____members_name_prime);
		return new Object[] { match, jContainingClass, jField,
				jContainingClass__jField____members };
	}

	public static final Object[] pattern_FieldNameCreate_0_5_blackBBB(
			Match match,
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField) {
		return new Object[] { match, jContainingClass, jField };
	}

	public static final Object[] pattern_FieldNameCreate_0_5_greenBB(
			Match match,
			org.emftext.language.java.classifiers.Class jContainingClass) {
		match.getContextNodes().add(jContainingClass);
		return new Object[] { match, jContainingClass };
	}

	public static final void pattern_FieldNameCreate_0_6_expressionBBBB(
			FieldNameCreate _this, Match match,
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField) {
		_this.registerObjectsToMatch_FWD(match, jContainingClass, jField);

	}

	public static final boolean pattern_FieldNameCreate_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldNameCreate_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_1_1_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("jContainingClass");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("tContainingClass");
		EObject _localVariable_2 = isApplicableMatch.getObject("jField");
		EObject _localVariable_3 = isApplicableMatch.getObject("pg");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("jContainingClassToTContainingClass");
		EObject tmpJContainingClass = _localVariable_0;
		EObject tmpTContainingClass = _localVariable_1;
		EObject tmpJField = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		EObject tmpJContainingClassToTContainingClass = _localVariable_4;
		if (tmpJContainingClass instanceof org.emftext.language.java.classifiers.Class) {
			org.emftext.language.java.classifiers.Class jContainingClass = (org.emftext.language.java.classifiers.Class) tmpJContainingClass;
			if (tmpTContainingClass instanceof TClass) {
				TClass tContainingClass = (TClass) tmpTContainingClass;
				if (tmpJField instanceof Field) {
					Field jField = (Field) tmpJField;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						if (tmpJContainingClassToTContainingClass instanceof ClassToTClass) {
							ClassToTClass jContainingClassToTContainingClass = (ClassToTClass) tmpJContainingClassToTContainingClass;
							return new Object[] { jContainingClass,
									tContainingClass, jField, pg,
									jContainingClassToTContainingClass,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_1_1_blackBBBBBFBB(
			org.emftext.language.java.classifiers.Class jContainingClass,
			TClass tContainingClass, Field jField, TypeGraph pg,
			ClassToTClass jContainingClassToTContainingClass,
			FieldNameCreate _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jContainingClass, tContainingClass,
						jField, pg, jContainingClassToTContainingClass, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_1_1_bindingAndBlackFFFFFFBB(
			FieldNameCreate _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldNameCreate_1_1_binding = pattern_FieldNameCreate_1_1_bindingFFFFFB(isApplicableMatch);
		if (result_pattern_FieldNameCreate_1_1_binding != null) {
			org.emftext.language.java.classifiers.Class jContainingClass = (org.emftext.language.java.classifiers.Class) result_pattern_FieldNameCreate_1_1_binding[0];
			TClass tContainingClass = (TClass) result_pattern_FieldNameCreate_1_1_binding[1];
			Field jField = (Field) result_pattern_FieldNameCreate_1_1_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_FieldNameCreate_1_1_binding[3];
			ClassToTClass jContainingClassToTContainingClass = (ClassToTClass) result_pattern_FieldNameCreate_1_1_binding[4];

			Object[] result_pattern_FieldNameCreate_1_1_black = pattern_FieldNameCreate_1_1_blackBBBBBFBB(
					jContainingClass, tContainingClass, jField, pg,
					jContainingClassToTContainingClass, _this,
					isApplicableMatch);
			if (result_pattern_FieldNameCreate_1_1_black != null) {
				CSP csp = (CSP) result_pattern_FieldNameCreate_1_1_black[5];

				return new Object[] { jContainingClass, tContainingClass,
						jField, pg, jContainingClassToTContainingClass, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_1_1_greenFFFFBBFBFB(
			TClass tContainingClass, Field jField, TypeGraph pg, CSP csp) {
		TFieldSignature tFieldSignature = TypeGraphBasicFactory.eINSTANCE
				.createTFieldSignature();
		TFieldDefinition tFieldDefinition = TypeGraphBasicFactory.eINSTANCE
				.createTFieldDefinition();
		FieldToTFieldSignature jFieldToTFieldSignature = GravityTGGFactory.eINSTANCE
				.createFieldToTFieldSignature();
		FieldToTFieldDefinition jFieldToTFieldDefinition = GravityTGGFactory.eINSTANCE
				.createFieldToTFieldDefinition();
		FieldToTField jFieldToTField = GravityTGGFactory.eINSTANCE
				.createFieldToTField();
		TField tField = TypeGraphBasicFactory.eINSTANCE.createTField();
		Object _localVariable_0 = csp.getValue("tField", "tName");
		tContainingClass.getSignature().add(tFieldSignature);
		tFieldSignature.getDefinitions().add(tFieldDefinition);
		tContainingClass.getDefines().add(tFieldDefinition);
		jFieldToTFieldSignature.setSource(jField);
		jFieldToTFieldSignature.setTarget(tFieldSignature);
		jFieldToTFieldDefinition.setSource(jField);
		jFieldToTFieldDefinition.setTarget(tFieldDefinition);
		jFieldToTField.setSource(jField);
		tFieldSignature.setField(tField);
		jFieldToTField.setTarget(tField);
		pg.getFields().add(tField);
		String tField_tName_prime = (String) _localVariable_0;
		tField.setTName(tField_tName_prime);
		return new Object[] { tFieldSignature, tFieldDefinition,
				jFieldToTFieldSignature, jFieldToTFieldDefinition,
				tContainingClass, jField, jFieldToTField, pg, tField, csp };
	}

	public static final Object[] pattern_FieldNameCreate_1_2_blackBBBBBBB(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			FieldToTFieldSignature jFieldToTFieldSignature,
			FieldToTFieldDefinition jFieldToTFieldDefinition, Field jField,
			FieldToTField jFieldToTField, TField tField) {
		return new Object[] { tFieldSignature, tFieldDefinition,
				jFieldToTFieldSignature, jFieldToTFieldDefinition, jField,
				jFieldToTField, tField };
	}

	public static final Object[] pattern_FieldNameCreate_1_2_greenFBBBBBBB(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			FieldToTFieldSignature jFieldToTFieldSignature,
			FieldToTFieldDefinition jFieldToTFieldDefinition, Field jField,
			FieldToTField jFieldToTField, TField tField) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tFieldSignature);
		ruleresult.getCreatedElements().add(tFieldDefinition);
		ruleresult.getCreatedLinkElements().add(jFieldToTFieldSignature);
		ruleresult.getCreatedLinkElements().add(jFieldToTFieldDefinition);
		ruleresult.getTranslatedElements().add(jField);
		ruleresult.getCreatedLinkElements().add(jFieldToTField);
		ruleresult.getCreatedElements().add(tField);
		return new Object[] { ruleresult, tFieldSignature, tFieldDefinition,
				jFieldToTFieldSignature, jFieldToTFieldDefinition, jField,
				jFieldToTField, tField };
	}

	public static final Object[] pattern_FieldNameCreate_1_3_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tFieldSignature,
			EObject tFieldDefinition, EObject jFieldToTFieldSignature,
			EObject jFieldToTFieldDefinition, EObject jContainingClass,
			EObject tContainingClass, EObject jField, EObject jFieldToTField,
			EObject pg, EObject tField,
			EObject jContainingClassToTContainingClass) {
		if (!tFieldDefinition.equals(tFieldSignature)) {
			if (!jFieldToTFieldSignature.equals(tFieldSignature)) {
				if (!jFieldToTFieldSignature.equals(tFieldDefinition)) {
					if (!jFieldToTFieldSignature.equals(tContainingClass)) {
						if (!jFieldToTFieldSignature.equals(pg)) {
							if (!jFieldToTFieldSignature.equals(tField)) {
								if (!jFieldToTFieldDefinition
										.equals(tFieldSignature)) {
									if (!jFieldToTFieldDefinition
											.equals(tFieldDefinition)) {
										if (!jFieldToTFieldDefinition
												.equals(jFieldToTFieldSignature)) {
											if (!jFieldToTFieldDefinition
													.equals(tContainingClass)) {
												if (!jFieldToTFieldDefinition
														.equals(pg)) {
													if (!jFieldToTFieldDefinition
															.equals(tField)) {
														if (!jContainingClass
																.equals(tFieldSignature)) {
															if (!jContainingClass
																	.equals(tFieldDefinition)) {
																if (!jContainingClass
																		.equals(jFieldToTFieldSignature)) {
																	if (!jContainingClass
																			.equals(jFieldToTFieldDefinition)) {
																		if (!jContainingClass
																				.equals(tContainingClass)) {
																			if (!jContainingClass
																					.equals(jField)) {
																				if (!jContainingClass
																						.equals(jFieldToTField)) {
																					if (!jContainingClass
																							.equals(pg)) {
																						if (!jContainingClass
																								.equals(tField)) {
																							if (!jContainingClass
																									.equals(jContainingClassToTContainingClass)) {
																								if (!tContainingClass
																										.equals(tFieldSignature)) {
																									if (!tContainingClass
																											.equals(tFieldDefinition)) {
																										if (!tContainingClass
																												.equals(tField)) {
																											if (!jField
																													.equals(tFieldSignature)) {
																												if (!jField
																														.equals(tFieldDefinition)) {
																													if (!jField
																															.equals(jFieldToTFieldSignature)) {
																														if (!jField
																																.equals(jFieldToTFieldDefinition)) {
																															if (!jField
																																	.equals(tContainingClass)) {
																																if (!jField
																																		.equals(jFieldToTField)) {
																																	if (!jField
																																			.equals(pg)) {
																																		if (!jField
																																				.equals(tField)) {
																																			if (!jFieldToTField
																																					.equals(tFieldSignature)) {
																																				if (!jFieldToTField
																																						.equals(tFieldDefinition)) {
																																					if (!jFieldToTField
																																							.equals(jFieldToTFieldSignature)) {
																																						if (!jFieldToTField
																																								.equals(jFieldToTFieldDefinition)) {
																																							if (!jFieldToTField
																																									.equals(tContainingClass)) {
																																								if (!jFieldToTField
																																										.equals(pg)) {
																																									if (!jFieldToTField
																																											.equals(tField)) {
																																										if (!pg.equals(tFieldSignature)) {
																																											if (!pg.equals(tFieldDefinition)) {
																																												if (!pg.equals(tContainingClass)) {
																																													if (!pg.equals(tField)) {
																																														if (!tField
																																																.equals(tFieldSignature)) {
																																															if (!tField
																																																	.equals(tFieldDefinition)) {
																																																if (!jContainingClassToTContainingClass
																																																		.equals(tFieldSignature)) {
																																																	if (!jContainingClassToTContainingClass
																																																			.equals(tFieldDefinition)) {
																																																		if (!jContainingClassToTContainingClass
																																																				.equals(jFieldToTFieldSignature)) {
																																																			if (!jContainingClassToTContainingClass
																																																					.equals(jFieldToTFieldDefinition)) {
																																																				if (!jContainingClassToTContainingClass
																																																						.equals(tContainingClass)) {
																																																					if (!jContainingClassToTContainingClass
																																																							.equals(jField)) {
																																																						if (!jContainingClassToTContainingClass
																																																								.equals(jFieldToTField)) {
																																																							if (!jContainingClassToTContainingClass
																																																									.equals(pg)) {
																																																								if (!jContainingClassToTContainingClass
																																																										.equals(tField)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											tFieldSignature,
																																																											tFieldDefinition,
																																																											jFieldToTFieldSignature,
																																																											jFieldToTFieldDefinition,
																																																											jContainingClass,
																																																											tContainingClass,
																																																											jField,
																																																											jFieldToTField,
																																																											pg,
																																																											tField,
																																																											jContainingClassToTContainingClass };
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

	public static final Object[] pattern_FieldNameCreate_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tFieldSignature,
			EObject tFieldDefinition, EObject jFieldToTFieldSignature,
			EObject jFieldToTFieldDefinition, EObject jContainingClass,
			EObject tContainingClass, EObject jField, EObject jFieldToTField,
			EObject pg, EObject tField) {
		EMoflonEdge tFieldSignature__tField____field = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tField__tFieldSignature____signatures = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldSignature__tFieldDefinition____definitions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldDefinition__tFieldSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jFieldToTFieldSignature__jField____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jFieldToTFieldSignature__tFieldSignature____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jFieldToTFieldDefinition__jField____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jFieldToTFieldDefinition__tFieldDefinition____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jContainingClass__jField____members = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tContainingClass__tFieldSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tContainingClass__tFieldDefinition____defines = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jFieldToTField__tField____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jFieldToTField__jField____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tField____fields = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldNameCreate";
		String tFieldSignature__tField____field_name_prime = "field";
		String tField__tFieldSignature____signatures_name_prime = "signatures";
		String tFieldSignature__tFieldDefinition____definitions_name_prime = "definitions";
		String tFieldDefinition__tFieldSignature____signature_name_prime = "signature";
		String jFieldToTFieldSignature__jField____source_name_prime = "source";
		String jFieldToTFieldSignature__tFieldSignature____target_name_prime = "target";
		String jFieldToTFieldDefinition__jField____source_name_prime = "source";
		String jFieldToTFieldDefinition__tFieldDefinition____target_name_prime = "target";
		String jContainingClass__jField____members_name_prime = "members";
		String tContainingClass__tFieldSignature____signature_name_prime = "signature";
		String tContainingClass__tFieldDefinition____defines_name_prime = "defines";
		String jFieldToTField__tField____target_name_prime = "target";
		String jFieldToTField__jField____source_name_prime = "source";
		String pg__tField____fields_name_prime = "fields";
		tFieldSignature__tField____field.setSrc(tFieldSignature);
		tFieldSignature__tField____field.setTrg(tField);
		ruleresult.getCreatedEdges().add(tFieldSignature__tField____field);
		tField__tFieldSignature____signatures.setSrc(tField);
		tField__tFieldSignature____signatures.setTrg(tFieldSignature);
		ruleresult.getCreatedEdges().add(tField__tFieldSignature____signatures);
		tFieldSignature__tFieldDefinition____definitions
				.setSrc(tFieldSignature);
		tFieldSignature__tFieldDefinition____definitions
				.setTrg(tFieldDefinition);
		ruleresult.getCreatedEdges().add(
				tFieldSignature__tFieldDefinition____definitions);
		tFieldDefinition__tFieldSignature____signature.setSrc(tFieldDefinition);
		tFieldDefinition__tFieldSignature____signature.setTrg(tFieldSignature);
		ruleresult.getCreatedEdges().add(
				tFieldDefinition__tFieldSignature____signature);
		jFieldToTFieldSignature__jField____source
				.setSrc(jFieldToTFieldSignature);
		jFieldToTFieldSignature__jField____source.setTrg(jField);
		ruleresult.getCreatedEdges().add(
				jFieldToTFieldSignature__jField____source);
		jFieldToTFieldSignature__tFieldSignature____target
				.setSrc(jFieldToTFieldSignature);
		jFieldToTFieldSignature__tFieldSignature____target
				.setTrg(tFieldSignature);
		ruleresult.getCreatedEdges().add(
				jFieldToTFieldSignature__tFieldSignature____target);
		jFieldToTFieldDefinition__jField____source
				.setSrc(jFieldToTFieldDefinition);
		jFieldToTFieldDefinition__jField____source.setTrg(jField);
		ruleresult.getCreatedEdges().add(
				jFieldToTFieldDefinition__jField____source);
		jFieldToTFieldDefinition__tFieldDefinition____target
				.setSrc(jFieldToTFieldDefinition);
		jFieldToTFieldDefinition__tFieldDefinition____target
				.setTrg(tFieldDefinition);
		ruleresult.getCreatedEdges().add(
				jFieldToTFieldDefinition__tFieldDefinition____target);
		jContainingClass__jField____members.setSrc(jContainingClass);
		jContainingClass__jField____members.setTrg(jField);
		ruleresult.getTranslatedEdges()
				.add(jContainingClass__jField____members);
		tContainingClass__tFieldSignature____signature.setSrc(tContainingClass);
		tContainingClass__tFieldSignature____signature.setTrg(tFieldSignature);
		ruleresult.getCreatedEdges().add(
				tContainingClass__tFieldSignature____signature);
		tContainingClass__tFieldDefinition____defines.setSrc(tContainingClass);
		tContainingClass__tFieldDefinition____defines.setTrg(tFieldDefinition);
		ruleresult.getCreatedEdges().add(
				tContainingClass__tFieldDefinition____defines);
		jFieldToTField__tField____target.setSrc(jFieldToTField);
		jFieldToTField__tField____target.setTrg(tField);
		ruleresult.getCreatedEdges().add(jFieldToTField__tField____target);
		jFieldToTField__jField____source.setSrc(jFieldToTField);
		jFieldToTField__jField____source.setTrg(jField);
		ruleresult.getCreatedEdges().add(jFieldToTField__jField____source);
		pg__tField____fields.setSrc(pg);
		pg__tField____fields.setTrg(tField);
		ruleresult.getCreatedEdges().add(pg__tField____fields);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tFieldSignature__tField____field
				.setName(tFieldSignature__tField____field_name_prime);
		tField__tFieldSignature____signatures
				.setName(tField__tFieldSignature____signatures_name_prime);
		tFieldSignature__tFieldDefinition____definitions
				.setName(tFieldSignature__tFieldDefinition____definitions_name_prime);
		tFieldDefinition__tFieldSignature____signature
				.setName(tFieldDefinition__tFieldSignature____signature_name_prime);
		jFieldToTFieldSignature__jField____source
				.setName(jFieldToTFieldSignature__jField____source_name_prime);
		jFieldToTFieldSignature__tFieldSignature____target
				.setName(jFieldToTFieldSignature__tFieldSignature____target_name_prime);
		jFieldToTFieldDefinition__jField____source
				.setName(jFieldToTFieldDefinition__jField____source_name_prime);
		jFieldToTFieldDefinition__tFieldDefinition____target
				.setName(jFieldToTFieldDefinition__tFieldDefinition____target_name_prime);
		jContainingClass__jField____members
				.setName(jContainingClass__jField____members_name_prime);
		tContainingClass__tFieldSignature____signature
				.setName(tContainingClass__tFieldSignature____signature_name_prime);
		tContainingClass__tFieldDefinition____defines
				.setName(tContainingClass__tFieldDefinition____defines_name_prime);
		jFieldToTField__tField____target
				.setName(jFieldToTField__tField____target_name_prime);
		jFieldToTField__jField____source
				.setName(jFieldToTField__jField____source_name_prime);
		pg__tField____fields.setName(pg__tField____fields_name_prime);
		return new Object[] { ruleresult, tFieldSignature, tFieldDefinition,
				jFieldToTFieldSignature, jFieldToTFieldDefinition,
				jContainingClass, tContainingClass, jField, jFieldToTField, pg,
				tField, tFieldSignature__tField____field,
				tField__tFieldSignature____signatures,
				tFieldSignature__tFieldDefinition____definitions,
				tFieldDefinition__tFieldSignature____signature,
				jFieldToTFieldSignature__jField____source,
				jFieldToTFieldSignature__tFieldSignature____target,
				jFieldToTFieldDefinition__jField____source,
				jFieldToTFieldDefinition__tFieldDefinition____target,
				jContainingClass__jField____members,
				tContainingClass__tFieldSignature____signature,
				tContainingClass__tFieldDefinition____defines,
				jFieldToTField__tField____target,
				jFieldToTField__jField____source, pg__tField____fields };
	}

	public static final void pattern_FieldNameCreate_1_5_expressionBBBBBBBBBBBBB(
			FieldNameCreate _this, PerformRuleResult ruleresult,
			EObject tFieldSignature, EObject tFieldDefinition,
			EObject jFieldToTFieldSignature, EObject jFieldToTFieldDefinition,
			EObject jContainingClass, EObject tContainingClass, EObject jField,
			EObject jFieldToTField, EObject pg, EObject tField,
			EObject jContainingClassToTContainingClass) {
		_this.registerObjects_FWD(ruleresult, tFieldSignature,
				tFieldDefinition, jFieldToTFieldSignature,
				jFieldToTFieldDefinition, jContainingClass, tContainingClass,
				jField, jFieldToTField, pg, tField,
				jContainingClassToTContainingClass);

	}

	public static final PerformRuleResult pattern_FieldNameCreate_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_2_1_bindingFB(
			FieldNameCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_2_1_blackFBB(
			EClass eClass, FieldNameCreate _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_2_1_bindingAndBlackFFB(
			FieldNameCreate _this) {
		Object[] result_pattern_FieldNameCreate_2_1_binding = pattern_FieldNameCreate_2_1_bindingFB(_this);
		if (result_pattern_FieldNameCreate_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldNameCreate_2_1_binding[0];

			Object[] result_pattern_FieldNameCreate_2_1_black = pattern_FieldNameCreate_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_FieldNameCreate_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldNameCreate_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "FieldNameCreate";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldNameCreate_2_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("jContainingClass");
		EObject _localVariable_1 = match.getObject("jField");
		EObject tmpJContainingClass = _localVariable_0;
		EObject tmpJField = _localVariable_1;
		if (tmpJContainingClass instanceof org.emftext.language.java.classifiers.Class) {
			org.emftext.language.java.classifiers.Class jContainingClass = (org.emftext.language.java.classifiers.Class) tmpJContainingClass;
			if (tmpJField instanceof Field) {
				Field jField = (Field) tmpJField;
				return new Object[] { jContainingClass, jField, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldNameCreate_2_2_blackBFBFB(
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ClassToTClass jContainingClassToTContainingClass : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(jContainingClass,
						ClassToTClass.class, "source")) {
			TClass tContainingClass = jContainingClassToTContainingClass
					.getTarget();
			if (tContainingClass != null) {
				_result.add(new Object[] { jContainingClass, tContainingClass,
						jField, jContainingClassToTContainingClass, match });
			}

		}
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_2_3_black_nac_0BB(
			TypeGraph pg, Field jField) {
		String jFieldname = jField.getName();
		for (TField tExistingField : pg.getFields()) {
			String tExistingFieldtName = tExistingField.getTName();
			if (tExistingFieldtName.equals(jFieldname)) {
				return new Object[] { pg, jField };
			}

		}

		return null;
	}

	public static final Iterable<Object[]> pattern_FieldNameCreate_2_3_blackBBBFB(
			org.emftext.language.java.classifiers.Class jContainingClass,
			TClass tContainingClass, Field jField,
			ClassToTClass jContainingClassToTContainingClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (jContainingClass.getMembers().contains(jField)) {
			if (jContainingClass.equals(jContainingClassToTContainingClass
					.getSource())) {
				if (tContainingClass.equals(jContainingClassToTContainingClass
						.getTarget())) {
					for (TypeGraph pg : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tContainingClass,
									TypeGraph.class, "classes")) {
						if (pattern_FieldNameCreate_2_3_black_nac_0BB(pg,
								jField) == null) {
							_result.add(new Object[] { jContainingClass,
									tContainingClass, jField, pg,
									jContainingClassToTContainingClass });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_2_3_greenBBBBBFFFFF(
			org.emftext.language.java.classifiers.Class jContainingClass,
			TClass tContainingClass, Field jField, TypeGraph pg,
			ClassToTClass jContainingClassToTContainingClass) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge jContainingClass__jField____members = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tContainingClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jContainingClassToTContainingClass__jContainingClass____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jContainingClassToTContainingClass__tContainingClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jContainingClass__jField____members_name_prime = "members";
		String pg__tContainingClass____classes_name_prime = "classes";
		String jContainingClassToTContainingClass__jContainingClass____source_name_prime = "source";
		String jContainingClassToTContainingClass__tContainingClass____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(jContainingClass);
		isApplicableMatch.getAllContextElements().add(tContainingClass);
		isApplicableMatch.getAllContextElements().add(jField);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(
				jContainingClassToTContainingClass);
		jContainingClass__jField____members.setSrc(jContainingClass);
		jContainingClass__jField____members.setTrg(jField);
		isApplicableMatch.getAllContextElements().add(
				jContainingClass__jField____members);
		pg__tContainingClass____classes.setSrc(pg);
		pg__tContainingClass____classes.setTrg(tContainingClass);
		isApplicableMatch.getAllContextElements().add(
				pg__tContainingClass____classes);
		jContainingClassToTContainingClass__jContainingClass____source
				.setSrc(jContainingClassToTContainingClass);
		jContainingClassToTContainingClass__jContainingClass____source
				.setTrg(jContainingClass);
		isApplicableMatch.getAllContextElements().add(
				jContainingClassToTContainingClass__jContainingClass____source);
		jContainingClassToTContainingClass__tContainingClass____target
				.setSrc(jContainingClassToTContainingClass);
		jContainingClassToTContainingClass__tContainingClass____target
				.setTrg(tContainingClass);
		isApplicableMatch.getAllContextElements().add(
				jContainingClassToTContainingClass__tContainingClass____target);
		jContainingClass__jField____members
				.setName(jContainingClass__jField____members_name_prime);
		pg__tContainingClass____classes
				.setName(pg__tContainingClass____classes_name_prime);
		jContainingClassToTContainingClass__jContainingClass____source
				.setName(jContainingClassToTContainingClass__jContainingClass____source_name_prime);
		jContainingClassToTContainingClass__tContainingClass____target
				.setName(jContainingClassToTContainingClass__tContainingClass____target_name_prime);
		return new Object[] { jContainingClass, tContainingClass, jField, pg,
				jContainingClassToTContainingClass, isApplicableMatch,
				jContainingClass__jField____members,
				pg__tContainingClass____classes,
				jContainingClassToTContainingClass__jContainingClass____source,
				jContainingClassToTContainingClass__tContainingClass____target };
	}

	public static final Object[] pattern_FieldNameCreate_2_4_bindingFBBBBBBB(
			FieldNameCreate _this, IsApplicableMatch isApplicableMatch,
			org.emftext.language.java.classifiers.Class jContainingClass,
			TClass tContainingClass, Field jField, TypeGraph pg,
			ClassToTClass jContainingClassToTContainingClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, jContainingClass, tContainingClass, jField,
				pg, jContainingClassToTContainingClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					jContainingClass, tContainingClass, jField, pg,
					jContainingClassToTContainingClass };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldNameCreate_2_4_bindingAndBlackFBBBBBBB(
			FieldNameCreate _this, IsApplicableMatch isApplicableMatch,
			org.emftext.language.java.classifiers.Class jContainingClass,
			TClass tContainingClass, Field jField, TypeGraph pg,
			ClassToTClass jContainingClassToTContainingClass) {
		Object[] result_pattern_FieldNameCreate_2_4_binding = pattern_FieldNameCreate_2_4_bindingFBBBBBBB(
				_this, isApplicableMatch, jContainingClass, tContainingClass,
				jField, pg, jContainingClassToTContainingClass);
		if (result_pattern_FieldNameCreate_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_FieldNameCreate_2_4_binding[0];

			Object[] result_pattern_FieldNameCreate_2_4_black = pattern_FieldNameCreate_2_4_blackB(csp);
			if (result_pattern_FieldNameCreate_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						jContainingClass, tContainingClass, jField, pg,
						jContainingClassToTContainingClass };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldNameCreate_2_5_expressionFBB(
			FieldNameCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldNameCreate_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldNameCreate";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldNameCreate_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_10_1_blackBBBBBBB(
			FieldNameCreate _this, Match match,
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			TClass tContainingClass, TypeGraph pg, TField tField) {
		return new Object[] { _this, match, tFieldSignature, tFieldDefinition,
				tContainingClass, pg, tField };
	}

	public static final Object[] pattern_FieldNameCreate_10_2_bindingFBBBBBBB(
			FieldNameCreate _this, Match match,
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			TClass tContainingClass, TypeGraph pg, TField tField) {
		CSP _localVariable_0 = _this
				.isAppropriate_solveCsp_BWD(match, tFieldSignature,
						tFieldDefinition, tContainingClass, pg, tField);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tFieldSignature,
					tFieldDefinition, tContainingClass, pg, tField };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldNameCreate_10_2_bindingAndBlackFBBBBBBB(
			FieldNameCreate _this, Match match,
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			TClass tContainingClass, TypeGraph pg, TField tField) {
		Object[] result_pattern_FieldNameCreate_10_2_binding = pattern_FieldNameCreate_10_2_bindingFBBBBBBB(
				_this, match, tFieldSignature, tFieldDefinition,
				tContainingClass, pg, tField);
		if (result_pattern_FieldNameCreate_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_FieldNameCreate_10_2_binding[0];

			Object[] result_pattern_FieldNameCreate_10_2_black = pattern_FieldNameCreate_10_2_blackB(csp);
			if (result_pattern_FieldNameCreate_10_2_black != null) {

				return new Object[] { csp, _this, match, tFieldSignature,
						tFieldDefinition, tContainingClass, pg, tField };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldNameCreate_10_3_expressionFBB(
			FieldNameCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_10_4_blackBBBBBB(
			Match match, TFieldSignature tFieldSignature,
			TFieldDefinition tFieldDefinition, TClass tContainingClass,
			TypeGraph pg, TField tField) {
		return new Object[] { match, tFieldSignature, tFieldDefinition,
				tContainingClass, pg, tField };
	}

	public static final Object[] pattern_FieldNameCreate_10_4_greenBBBBBBFFFFFFF(
			Match match, TFieldSignature tFieldSignature,
			TFieldDefinition tFieldDefinition, TClass tContainingClass,
			TypeGraph pg, TField tField) {
		EMoflonEdge tFieldSignature__tField____field = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tField__tFieldSignature____signatures = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldSignature__tFieldDefinition____definitions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldDefinition__tFieldSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tContainingClass__tFieldSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tContainingClass__tFieldDefinition____defines = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tField____fields = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tFieldSignature);
		match.getToBeTranslatedNodes().add(tFieldDefinition);
		match.getToBeTranslatedNodes().add(tField);
		String tFieldSignature__tField____field_name_prime = "field";
		String tField__tFieldSignature____signatures_name_prime = "signatures";
		String tFieldSignature__tFieldDefinition____definitions_name_prime = "definitions";
		String tFieldDefinition__tFieldSignature____signature_name_prime = "signature";
		String tContainingClass__tFieldSignature____signature_name_prime = "signature";
		String tContainingClass__tFieldDefinition____defines_name_prime = "defines";
		String pg__tField____fields_name_prime = "fields";
		tFieldSignature__tField____field.setSrc(tFieldSignature);
		tFieldSignature__tField____field.setTrg(tField);
		match.getToBeTranslatedEdges().add(tFieldSignature__tField____field);
		tField__tFieldSignature____signatures.setSrc(tField);
		tField__tFieldSignature____signatures.setTrg(tFieldSignature);
		match.getToBeTranslatedEdges().add(
				tField__tFieldSignature____signatures);
		tFieldSignature__tFieldDefinition____definitions
				.setSrc(tFieldSignature);
		tFieldSignature__tFieldDefinition____definitions
				.setTrg(tFieldDefinition);
		match.getToBeTranslatedEdges().add(
				tFieldSignature__tFieldDefinition____definitions);
		tFieldDefinition__tFieldSignature____signature.setSrc(tFieldDefinition);
		tFieldDefinition__tFieldSignature____signature.setTrg(tFieldSignature);
		match.getToBeTranslatedEdges().add(
				tFieldDefinition__tFieldSignature____signature);
		tContainingClass__tFieldSignature____signature.setSrc(tContainingClass);
		tContainingClass__tFieldSignature____signature.setTrg(tFieldSignature);
		match.getToBeTranslatedEdges().add(
				tContainingClass__tFieldSignature____signature);
		tContainingClass__tFieldDefinition____defines.setSrc(tContainingClass);
		tContainingClass__tFieldDefinition____defines.setTrg(tFieldDefinition);
		match.getToBeTranslatedEdges().add(
				tContainingClass__tFieldDefinition____defines);
		pg__tField____fields.setSrc(pg);
		pg__tField____fields.setTrg(tField);
		match.getToBeTranslatedEdges().add(pg__tField____fields);
		tFieldSignature__tField____field
				.setName(tFieldSignature__tField____field_name_prime);
		tField__tFieldSignature____signatures
				.setName(tField__tFieldSignature____signatures_name_prime);
		tFieldSignature__tFieldDefinition____definitions
				.setName(tFieldSignature__tFieldDefinition____definitions_name_prime);
		tFieldDefinition__tFieldSignature____signature
				.setName(tFieldDefinition__tFieldSignature____signature_name_prime);
		tContainingClass__tFieldSignature____signature
				.setName(tContainingClass__tFieldSignature____signature_name_prime);
		tContainingClass__tFieldDefinition____defines
				.setName(tContainingClass__tFieldDefinition____defines_name_prime);
		pg__tField____fields.setName(pg__tField____fields_name_prime);
		return new Object[] { match, tFieldSignature, tFieldDefinition,
				tContainingClass, pg, tField, tFieldSignature__tField____field,
				tField__tFieldSignature____signatures,
				tFieldSignature__tFieldDefinition____definitions,
				tFieldDefinition__tFieldSignature____signature,
				tContainingClass__tFieldSignature____signature,
				tContainingClass__tFieldDefinition____defines,
				pg__tField____fields };
	}

	public static final Object[] pattern_FieldNameCreate_10_5_blackBBBBBB(
			Match match, TFieldSignature tFieldSignature,
			TFieldDefinition tFieldDefinition, TClass tContainingClass,
			TypeGraph pg, TField tField) {
		return new Object[] { match, tFieldSignature, tFieldDefinition,
				tContainingClass, pg, tField };
	}

	public static final Object[] pattern_FieldNameCreate_10_5_greenBBBF(
			Match match, TClass tContainingClass, TypeGraph pg) {
		EMoflonEdge pg__tContainingClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(tContainingClass);
		match.getContextNodes().add(pg);
		String pg__tContainingClass____classes_name_prime = "classes";
		pg__tContainingClass____classes.setSrc(pg);
		pg__tContainingClass____classes.setTrg(tContainingClass);
		match.getContextEdges().add(pg__tContainingClass____classes);
		pg__tContainingClass____classes
				.setName(pg__tContainingClass____classes_name_prime);
		return new Object[] { match, tContainingClass, pg,
				pg__tContainingClass____classes };
	}

	public static final void pattern_FieldNameCreate_10_6_expressionBBBBBBB(
			FieldNameCreate _this, Match match,
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			TClass tContainingClass, TypeGraph pg, TField tField) {
		_this.registerObjectsToMatch_BWD(match, tFieldSignature,
				tFieldDefinition, tContainingClass, pg, tField);

	}

	public static final boolean pattern_FieldNameCreate_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldNameCreate_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_11_1_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("tFieldSignature");
		EObject _localVariable_1 = isApplicableMatch
				.getObject("tFieldDefinition");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("jContainingClass");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("tContainingClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("pg");
		EObject _localVariable_5 = isApplicableMatch.getObject("tField");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("jContainingClassToTContainingClass");
		EObject tmpTFieldSignature = _localVariable_0;
		EObject tmpTFieldDefinition = _localVariable_1;
		EObject tmpJContainingClass = _localVariable_2;
		EObject tmpTContainingClass = _localVariable_3;
		EObject tmpPg = _localVariable_4;
		EObject tmpTField = _localVariable_5;
		EObject tmpJContainingClassToTContainingClass = _localVariable_6;
		if (tmpTFieldSignature instanceof TFieldSignature) {
			TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
			if (tmpTFieldDefinition instanceof TFieldDefinition) {
				TFieldDefinition tFieldDefinition = (TFieldDefinition) tmpTFieldDefinition;
				if (tmpJContainingClass instanceof org.emftext.language.java.classifiers.Class) {
					org.emftext.language.java.classifiers.Class jContainingClass = (org.emftext.language.java.classifiers.Class) tmpJContainingClass;
					if (tmpTContainingClass instanceof TClass) {
						TClass tContainingClass = (TClass) tmpTContainingClass;
						if (tmpPg instanceof TypeGraph) {
							TypeGraph pg = (TypeGraph) tmpPg;
							if (tmpTField instanceof TField) {
								TField tField = (TField) tmpTField;
								if (tmpJContainingClassToTContainingClass instanceof ClassToTClass) {
									ClassToTClass jContainingClassToTContainingClass = (ClassToTClass) tmpJContainingClassToTContainingClass;
									return new Object[] { tFieldSignature,
											tFieldDefinition, jContainingClass,
											tContainingClass, pg, tField,
											jContainingClassToTContainingClass,
											isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_11_1_blackBBBBBBBFBB(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			org.emftext.language.java.classifiers.Class jContainingClass,
			TClass tContainingClass, TypeGraph pg, TField tField,
			ClassToTClass jContainingClassToTContainingClass,
			FieldNameCreate _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tFieldSignature, tFieldDefinition,
						jContainingClass, tContainingClass, pg, tField,
						jContainingClassToTContainingClass, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_11_1_bindingAndBlackFFFFFFFFBB(
			FieldNameCreate _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldNameCreate_11_1_binding = pattern_FieldNameCreate_11_1_bindingFFFFFFFB(isApplicableMatch);
		if (result_pattern_FieldNameCreate_11_1_binding != null) {
			TFieldSignature tFieldSignature = (TFieldSignature) result_pattern_FieldNameCreate_11_1_binding[0];
			TFieldDefinition tFieldDefinition = (TFieldDefinition) result_pattern_FieldNameCreate_11_1_binding[1];
			org.emftext.language.java.classifiers.Class jContainingClass = (org.emftext.language.java.classifiers.Class) result_pattern_FieldNameCreate_11_1_binding[2];
			TClass tContainingClass = (TClass) result_pattern_FieldNameCreate_11_1_binding[3];
			TypeGraph pg = (TypeGraph) result_pattern_FieldNameCreate_11_1_binding[4];
			TField tField = (TField) result_pattern_FieldNameCreate_11_1_binding[5];
			ClassToTClass jContainingClassToTContainingClass = (ClassToTClass) result_pattern_FieldNameCreate_11_1_binding[6];

			Object[] result_pattern_FieldNameCreate_11_1_black = pattern_FieldNameCreate_11_1_blackBBBBBBBFBB(
					tFieldSignature, tFieldDefinition, jContainingClass,
					tContainingClass, pg, tField,
					jContainingClassToTContainingClass, _this,
					isApplicableMatch);
			if (result_pattern_FieldNameCreate_11_1_black != null) {
				CSP csp = (CSP) result_pattern_FieldNameCreate_11_1_black[7];

				return new Object[] { tFieldSignature, tFieldDefinition,
						jContainingClass, tContainingClass, pg, tField,
						jContainingClassToTContainingClass, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_11_1_greenBBFFBFFBB(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			org.emftext.language.java.classifiers.Class jContainingClass,
			TField tField, CSP csp) {
		FieldToTFieldSignature jFieldToTFieldSignature = GravityTGGFactory.eINSTANCE
				.createFieldToTFieldSignature();
		FieldToTFieldDefinition jFieldToTFieldDefinition = GravityTGGFactory.eINSTANCE
				.createFieldToTFieldDefinition();
		Field jField = MembersFactory.eINSTANCE.createField();
		FieldToTField jFieldToTField = GravityTGGFactory.eINSTANCE
				.createFieldToTField();
		Object _localVariable_0 = csp.getValue("jField", "name");
		jFieldToTFieldSignature.setTarget(tFieldSignature);
		jFieldToTFieldDefinition.setTarget(tFieldDefinition);
		jFieldToTFieldSignature.setSource(jField);
		jFieldToTFieldDefinition.setSource(jField);
		jContainingClass.getMembers().add(jField);
		jFieldToTField.setTarget(tField);
		jFieldToTField.setSource(jField);
		String jField_name_prime = (String) _localVariable_0;
		jField.setName(jField_name_prime);
		return new Object[] { tFieldSignature, tFieldDefinition,
				jFieldToTFieldSignature, jFieldToTFieldDefinition,
				jContainingClass, jField, jFieldToTField, tField, csp };
	}

	public static final Object[] pattern_FieldNameCreate_11_2_blackBBBBBBB(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			FieldToTFieldSignature jFieldToTFieldSignature,
			FieldToTFieldDefinition jFieldToTFieldDefinition, Field jField,
			FieldToTField jFieldToTField, TField tField) {
		return new Object[] { tFieldSignature, tFieldDefinition,
				jFieldToTFieldSignature, jFieldToTFieldDefinition, jField,
				jFieldToTField, tField };
	}

	public static final Object[] pattern_FieldNameCreate_11_2_greenFBBBBBBB(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			FieldToTFieldSignature jFieldToTFieldSignature,
			FieldToTFieldDefinition jFieldToTFieldDefinition, Field jField,
			FieldToTField jFieldToTField, TField tField) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tFieldSignature);
		ruleresult.getTranslatedElements().add(tFieldDefinition);
		ruleresult.getCreatedLinkElements().add(jFieldToTFieldSignature);
		ruleresult.getCreatedLinkElements().add(jFieldToTFieldDefinition);
		ruleresult.getCreatedElements().add(jField);
		ruleresult.getCreatedLinkElements().add(jFieldToTField);
		ruleresult.getTranslatedElements().add(tField);
		return new Object[] { ruleresult, tFieldSignature, tFieldDefinition,
				jFieldToTFieldSignature, jFieldToTFieldDefinition, jField,
				jFieldToTField, tField };
	}

	public static final Object[] pattern_FieldNameCreate_11_3_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tFieldSignature,
			EObject tFieldDefinition, EObject jFieldToTFieldSignature,
			EObject jFieldToTFieldDefinition, EObject jContainingClass,
			EObject tContainingClass, EObject jField, EObject jFieldToTField,
			EObject pg, EObject tField,
			EObject jContainingClassToTContainingClass) {
		if (!tFieldDefinition.equals(tFieldSignature)) {
			if (!jFieldToTFieldSignature.equals(tFieldSignature)) {
				if (!jFieldToTFieldSignature.equals(tFieldDefinition)) {
					if (!jFieldToTFieldSignature.equals(tContainingClass)) {
						if (!jFieldToTFieldSignature.equals(pg)) {
							if (!jFieldToTFieldSignature.equals(tField)) {
								if (!jFieldToTFieldDefinition
										.equals(tFieldSignature)) {
									if (!jFieldToTFieldDefinition
											.equals(tFieldDefinition)) {
										if (!jFieldToTFieldDefinition
												.equals(jFieldToTFieldSignature)) {
											if (!jFieldToTFieldDefinition
													.equals(tContainingClass)) {
												if (!jFieldToTFieldDefinition
														.equals(pg)) {
													if (!jFieldToTFieldDefinition
															.equals(tField)) {
														if (!jContainingClass
																.equals(tFieldSignature)) {
															if (!jContainingClass
																	.equals(tFieldDefinition)) {
																if (!jContainingClass
																		.equals(jFieldToTFieldSignature)) {
																	if (!jContainingClass
																			.equals(jFieldToTFieldDefinition)) {
																		if (!jContainingClass
																				.equals(tContainingClass)) {
																			if (!jContainingClass
																					.equals(jField)) {
																				if (!jContainingClass
																						.equals(jFieldToTField)) {
																					if (!jContainingClass
																							.equals(pg)) {
																						if (!jContainingClass
																								.equals(tField)) {
																							if (!jContainingClass
																									.equals(jContainingClassToTContainingClass)) {
																								if (!tContainingClass
																										.equals(tFieldSignature)) {
																									if (!tContainingClass
																											.equals(tFieldDefinition)) {
																										if (!tContainingClass
																												.equals(tField)) {
																											if (!jField
																													.equals(tFieldSignature)) {
																												if (!jField
																														.equals(tFieldDefinition)) {
																													if (!jField
																															.equals(jFieldToTFieldSignature)) {
																														if (!jField
																																.equals(jFieldToTFieldDefinition)) {
																															if (!jField
																																	.equals(tContainingClass)) {
																																if (!jField
																																		.equals(jFieldToTField)) {
																																	if (!jField
																																			.equals(pg)) {
																																		if (!jField
																																				.equals(tField)) {
																																			if (!jFieldToTField
																																					.equals(tFieldSignature)) {
																																				if (!jFieldToTField
																																						.equals(tFieldDefinition)) {
																																					if (!jFieldToTField
																																							.equals(jFieldToTFieldSignature)) {
																																						if (!jFieldToTField
																																								.equals(jFieldToTFieldDefinition)) {
																																							if (!jFieldToTField
																																									.equals(tContainingClass)) {
																																								if (!jFieldToTField
																																										.equals(pg)) {
																																									if (!jFieldToTField
																																											.equals(tField)) {
																																										if (!pg.equals(tFieldSignature)) {
																																											if (!pg.equals(tFieldDefinition)) {
																																												if (!pg.equals(tContainingClass)) {
																																													if (!pg.equals(tField)) {
																																														if (!tField
																																																.equals(tFieldSignature)) {
																																															if (!tField
																																																	.equals(tFieldDefinition)) {
																																																if (!jContainingClassToTContainingClass
																																																		.equals(tFieldSignature)) {
																																																	if (!jContainingClassToTContainingClass
																																																			.equals(tFieldDefinition)) {
																																																		if (!jContainingClassToTContainingClass
																																																				.equals(jFieldToTFieldSignature)) {
																																																			if (!jContainingClassToTContainingClass
																																																					.equals(jFieldToTFieldDefinition)) {
																																																				if (!jContainingClassToTContainingClass
																																																						.equals(tContainingClass)) {
																																																					if (!jContainingClassToTContainingClass
																																																							.equals(jField)) {
																																																						if (!jContainingClassToTContainingClass
																																																								.equals(jFieldToTField)) {
																																																							if (!jContainingClassToTContainingClass
																																																									.equals(pg)) {
																																																								if (!jContainingClassToTContainingClass
																																																										.equals(tField)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											tFieldSignature,
																																																											tFieldDefinition,
																																																											jFieldToTFieldSignature,
																																																											jFieldToTFieldDefinition,
																																																											jContainingClass,
																																																											tContainingClass,
																																																											jField,
																																																											jFieldToTField,
																																																											pg,
																																																											tField,
																																																											jContainingClassToTContainingClass };
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

	public static final Object[] pattern_FieldNameCreate_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tFieldSignature,
			EObject tFieldDefinition, EObject jFieldToTFieldSignature,
			EObject jFieldToTFieldDefinition, EObject jContainingClass,
			EObject tContainingClass, EObject jField, EObject jFieldToTField,
			EObject pg, EObject tField) {
		EMoflonEdge tFieldSignature__tField____field = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tField__tFieldSignature____signatures = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldSignature__tFieldDefinition____definitions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldDefinition__tFieldSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jFieldToTFieldSignature__jField____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jFieldToTFieldSignature__tFieldSignature____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jFieldToTFieldDefinition__jField____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jFieldToTFieldDefinition__tFieldDefinition____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jContainingClass__jField____members = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tContainingClass__tFieldSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tContainingClass__tFieldDefinition____defines = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jFieldToTField__tField____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jFieldToTField__jField____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tField____fields = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldNameCreate";
		String tFieldSignature__tField____field_name_prime = "field";
		String tField__tFieldSignature____signatures_name_prime = "signatures";
		String tFieldSignature__tFieldDefinition____definitions_name_prime = "definitions";
		String tFieldDefinition__tFieldSignature____signature_name_prime = "signature";
		String jFieldToTFieldSignature__jField____source_name_prime = "source";
		String jFieldToTFieldSignature__tFieldSignature____target_name_prime = "target";
		String jFieldToTFieldDefinition__jField____source_name_prime = "source";
		String jFieldToTFieldDefinition__tFieldDefinition____target_name_prime = "target";
		String jContainingClass__jField____members_name_prime = "members";
		String tContainingClass__tFieldSignature____signature_name_prime = "signature";
		String tContainingClass__tFieldDefinition____defines_name_prime = "defines";
		String jFieldToTField__tField____target_name_prime = "target";
		String jFieldToTField__jField____source_name_prime = "source";
		String pg__tField____fields_name_prime = "fields";
		tFieldSignature__tField____field.setSrc(tFieldSignature);
		tFieldSignature__tField____field.setTrg(tField);
		ruleresult.getTranslatedEdges().add(tFieldSignature__tField____field);
		tField__tFieldSignature____signatures.setSrc(tField);
		tField__tFieldSignature____signatures.setTrg(tFieldSignature);
		ruleresult.getTranslatedEdges().add(
				tField__tFieldSignature____signatures);
		tFieldSignature__tFieldDefinition____definitions
				.setSrc(tFieldSignature);
		tFieldSignature__tFieldDefinition____definitions
				.setTrg(tFieldDefinition);
		ruleresult.getTranslatedEdges().add(
				tFieldSignature__tFieldDefinition____definitions);
		tFieldDefinition__tFieldSignature____signature.setSrc(tFieldDefinition);
		tFieldDefinition__tFieldSignature____signature.setTrg(tFieldSignature);
		ruleresult.getTranslatedEdges().add(
				tFieldDefinition__tFieldSignature____signature);
		jFieldToTFieldSignature__jField____source
				.setSrc(jFieldToTFieldSignature);
		jFieldToTFieldSignature__jField____source.setTrg(jField);
		ruleresult.getCreatedEdges().add(
				jFieldToTFieldSignature__jField____source);
		jFieldToTFieldSignature__tFieldSignature____target
				.setSrc(jFieldToTFieldSignature);
		jFieldToTFieldSignature__tFieldSignature____target
				.setTrg(tFieldSignature);
		ruleresult.getCreatedEdges().add(
				jFieldToTFieldSignature__tFieldSignature____target);
		jFieldToTFieldDefinition__jField____source
				.setSrc(jFieldToTFieldDefinition);
		jFieldToTFieldDefinition__jField____source.setTrg(jField);
		ruleresult.getCreatedEdges().add(
				jFieldToTFieldDefinition__jField____source);
		jFieldToTFieldDefinition__tFieldDefinition____target
				.setSrc(jFieldToTFieldDefinition);
		jFieldToTFieldDefinition__tFieldDefinition____target
				.setTrg(tFieldDefinition);
		ruleresult.getCreatedEdges().add(
				jFieldToTFieldDefinition__tFieldDefinition____target);
		jContainingClass__jField____members.setSrc(jContainingClass);
		jContainingClass__jField____members.setTrg(jField);
		ruleresult.getCreatedEdges().add(jContainingClass__jField____members);
		tContainingClass__tFieldSignature____signature.setSrc(tContainingClass);
		tContainingClass__tFieldSignature____signature.setTrg(tFieldSignature);
		ruleresult.getTranslatedEdges().add(
				tContainingClass__tFieldSignature____signature);
		tContainingClass__tFieldDefinition____defines.setSrc(tContainingClass);
		tContainingClass__tFieldDefinition____defines.setTrg(tFieldDefinition);
		ruleresult.getTranslatedEdges().add(
				tContainingClass__tFieldDefinition____defines);
		jFieldToTField__tField____target.setSrc(jFieldToTField);
		jFieldToTField__tField____target.setTrg(tField);
		ruleresult.getCreatedEdges().add(jFieldToTField__tField____target);
		jFieldToTField__jField____source.setSrc(jFieldToTField);
		jFieldToTField__jField____source.setTrg(jField);
		ruleresult.getCreatedEdges().add(jFieldToTField__jField____source);
		pg__tField____fields.setSrc(pg);
		pg__tField____fields.setTrg(tField);
		ruleresult.getTranslatedEdges().add(pg__tField____fields);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tFieldSignature__tField____field
				.setName(tFieldSignature__tField____field_name_prime);
		tField__tFieldSignature____signatures
				.setName(tField__tFieldSignature____signatures_name_prime);
		tFieldSignature__tFieldDefinition____definitions
				.setName(tFieldSignature__tFieldDefinition____definitions_name_prime);
		tFieldDefinition__tFieldSignature____signature
				.setName(tFieldDefinition__tFieldSignature____signature_name_prime);
		jFieldToTFieldSignature__jField____source
				.setName(jFieldToTFieldSignature__jField____source_name_prime);
		jFieldToTFieldSignature__tFieldSignature____target
				.setName(jFieldToTFieldSignature__tFieldSignature____target_name_prime);
		jFieldToTFieldDefinition__jField____source
				.setName(jFieldToTFieldDefinition__jField____source_name_prime);
		jFieldToTFieldDefinition__tFieldDefinition____target
				.setName(jFieldToTFieldDefinition__tFieldDefinition____target_name_prime);
		jContainingClass__jField____members
				.setName(jContainingClass__jField____members_name_prime);
		tContainingClass__tFieldSignature____signature
				.setName(tContainingClass__tFieldSignature____signature_name_prime);
		tContainingClass__tFieldDefinition____defines
				.setName(tContainingClass__tFieldDefinition____defines_name_prime);
		jFieldToTField__tField____target
				.setName(jFieldToTField__tField____target_name_prime);
		jFieldToTField__jField____source
				.setName(jFieldToTField__jField____source_name_prime);
		pg__tField____fields.setName(pg__tField____fields_name_prime);
		return new Object[] { ruleresult, tFieldSignature, tFieldDefinition,
				jFieldToTFieldSignature, jFieldToTFieldDefinition,
				jContainingClass, tContainingClass, jField, jFieldToTField, pg,
				tField, tFieldSignature__tField____field,
				tField__tFieldSignature____signatures,
				tFieldSignature__tFieldDefinition____definitions,
				tFieldDefinition__tFieldSignature____signature,
				jFieldToTFieldSignature__jField____source,
				jFieldToTFieldSignature__tFieldSignature____target,
				jFieldToTFieldDefinition__jField____source,
				jFieldToTFieldDefinition__tFieldDefinition____target,
				jContainingClass__jField____members,
				tContainingClass__tFieldSignature____signature,
				tContainingClass__tFieldDefinition____defines,
				jFieldToTField__tField____target,
				jFieldToTField__jField____source, pg__tField____fields };
	}

	public static final void pattern_FieldNameCreate_11_5_expressionBBBBBBBBBBBBB(
			FieldNameCreate _this, PerformRuleResult ruleresult,
			EObject tFieldSignature, EObject tFieldDefinition,
			EObject jFieldToTFieldSignature, EObject jFieldToTFieldDefinition,
			EObject jContainingClass, EObject tContainingClass, EObject jField,
			EObject jFieldToTField, EObject pg, EObject tField,
			EObject jContainingClassToTContainingClass) {
		_this.registerObjects_BWD(ruleresult, tFieldSignature,
				tFieldDefinition, jFieldToTFieldSignature,
				jFieldToTFieldDefinition, jContainingClass, tContainingClass,
				jField, jFieldToTField, pg, tField,
				jContainingClassToTContainingClass);

	}

	public static final PerformRuleResult pattern_FieldNameCreate_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_12_1_bindingFB(
			FieldNameCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_12_1_blackFBB(
			EClass eClass, FieldNameCreate _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_12_1_bindingAndBlackFFB(
			FieldNameCreate _this) {
		Object[] result_pattern_FieldNameCreate_12_1_binding = pattern_FieldNameCreate_12_1_bindingFB(_this);
		if (result_pattern_FieldNameCreate_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldNameCreate_12_1_binding[0];

			Object[] result_pattern_FieldNameCreate_12_1_black = pattern_FieldNameCreate_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_FieldNameCreate_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldNameCreate_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "FieldNameCreate";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldNameCreate_12_2_bindingFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("tFieldSignature");
		EObject _localVariable_1 = match.getObject("tFieldDefinition");
		EObject _localVariable_2 = match.getObject("tContainingClass");
		EObject _localVariable_3 = match.getObject("pg");
		EObject _localVariable_4 = match.getObject("tField");
		EObject tmpTFieldSignature = _localVariable_0;
		EObject tmpTFieldDefinition = _localVariable_1;
		EObject tmpTContainingClass = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		EObject tmpTField = _localVariable_4;
		if (tmpTFieldSignature instanceof TFieldSignature) {
			TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
			if (tmpTFieldDefinition instanceof TFieldDefinition) {
				TFieldDefinition tFieldDefinition = (TFieldDefinition) tmpTFieldDefinition;
				if (tmpTContainingClass instanceof TClass) {
					TClass tContainingClass = (TClass) tmpTContainingClass;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						if (tmpTField instanceof TField) {
							TField tField = (TField) tmpTField;
							return new Object[] { tFieldSignature,
									tFieldDefinition, tContainingClass, pg,
									tField, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldNameCreate_12_2_blackBBFBBBFB(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			TClass tContainingClass, TypeGraph pg, TField tField, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ClassToTClass jContainingClassToTContainingClass : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tContainingClass,
						ClassToTClass.class, "target")) {
			org.emftext.language.java.classifiers.Class jContainingClass = jContainingClassToTContainingClass
					.getSource();
			if (jContainingClass != null) {
				_result.add(new Object[] { tFieldSignature, tFieldDefinition,
						jContainingClass, tContainingClass, pg, tField,
						jContainingClassToTContainingClass, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldNameCreate_12_3_blackBBBBBBB(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			org.emftext.language.java.classifiers.Class jContainingClass,
			TClass tContainingClass, TypeGraph pg, TField tField,
			ClassToTClass jContainingClassToTContainingClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tField.equals(tFieldSignature.getField())) {
			if (tFieldSignature.getDefinitions().contains(tFieldDefinition)) {
				if (tContainingClass.getSignature().contains(tFieldSignature)) {
					if (tContainingClass.getDefines()
							.contains(tFieldDefinition)) {
						if (pg.getFields().contains(tField)) {
							if (pg.getClasses().contains(tContainingClass)) {
								if (jContainingClass
										.equals(jContainingClassToTContainingClass
												.getSource())) {
									if (tContainingClass
											.equals(jContainingClassToTContainingClass
													.getTarget())) {
										_result.add(new Object[] {
												tFieldSignature,
												tFieldDefinition,
												jContainingClass,
												tContainingClass, pg, tField,
												jContainingClassToTContainingClass });
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

	public static final Object[] pattern_FieldNameCreate_12_3_greenBBBBBBBFFFFFFFFFFF(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			org.emftext.language.java.classifiers.Class jContainingClass,
			TClass tContainingClass, TypeGraph pg, TField tField,
			ClassToTClass jContainingClassToTContainingClass) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge tFieldSignature__tField____field = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tField__tFieldSignature____signatures = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldSignature__tFieldDefinition____definitions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldDefinition__tFieldSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tContainingClass__tFieldSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tContainingClass__tFieldDefinition____defines = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tField____fields = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tContainingClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jContainingClassToTContainingClass__jContainingClass____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jContainingClassToTContainingClass__tContainingClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tFieldSignature__tField____field_name_prime = "field";
		String tField__tFieldSignature____signatures_name_prime = "signatures";
		String tFieldSignature__tFieldDefinition____definitions_name_prime = "definitions";
		String tFieldDefinition__tFieldSignature____signature_name_prime = "signature";
		String tContainingClass__tFieldSignature____signature_name_prime = "signature";
		String tContainingClass__tFieldDefinition____defines_name_prime = "defines";
		String pg__tField____fields_name_prime = "fields";
		String pg__tContainingClass____classes_name_prime = "classes";
		String jContainingClassToTContainingClass__jContainingClass____source_name_prime = "source";
		String jContainingClassToTContainingClass__tContainingClass____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(tFieldDefinition);
		isApplicableMatch.getAllContextElements().add(jContainingClass);
		isApplicableMatch.getAllContextElements().add(tContainingClass);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(tField);
		isApplicableMatch.getAllContextElements().add(
				jContainingClassToTContainingClass);
		tFieldSignature__tField____field.setSrc(tFieldSignature);
		tFieldSignature__tField____field.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(
				tFieldSignature__tField____field);
		tField__tFieldSignature____signatures.setSrc(tField);
		tField__tFieldSignature____signatures.setTrg(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(
				tField__tFieldSignature____signatures);
		tFieldSignature__tFieldDefinition____definitions
				.setSrc(tFieldSignature);
		tFieldSignature__tFieldDefinition____definitions
				.setTrg(tFieldDefinition);
		isApplicableMatch.getAllContextElements().add(
				tFieldSignature__tFieldDefinition____definitions);
		tFieldDefinition__tFieldSignature____signature.setSrc(tFieldDefinition);
		tFieldDefinition__tFieldSignature____signature.setTrg(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(
				tFieldDefinition__tFieldSignature____signature);
		tContainingClass__tFieldSignature____signature.setSrc(tContainingClass);
		tContainingClass__tFieldSignature____signature.setTrg(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(
				tContainingClass__tFieldSignature____signature);
		tContainingClass__tFieldDefinition____defines.setSrc(tContainingClass);
		tContainingClass__tFieldDefinition____defines.setTrg(tFieldDefinition);
		isApplicableMatch.getAllContextElements().add(
				tContainingClass__tFieldDefinition____defines);
		pg__tField____fields.setSrc(pg);
		pg__tField____fields.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(pg__tField____fields);
		pg__tContainingClass____classes.setSrc(pg);
		pg__tContainingClass____classes.setTrg(tContainingClass);
		isApplicableMatch.getAllContextElements().add(
				pg__tContainingClass____classes);
		jContainingClassToTContainingClass__jContainingClass____source
				.setSrc(jContainingClassToTContainingClass);
		jContainingClassToTContainingClass__jContainingClass____source
				.setTrg(jContainingClass);
		isApplicableMatch.getAllContextElements().add(
				jContainingClassToTContainingClass__jContainingClass____source);
		jContainingClassToTContainingClass__tContainingClass____target
				.setSrc(jContainingClassToTContainingClass);
		jContainingClassToTContainingClass__tContainingClass____target
				.setTrg(tContainingClass);
		isApplicableMatch.getAllContextElements().add(
				jContainingClassToTContainingClass__tContainingClass____target);
		tFieldSignature__tField____field
				.setName(tFieldSignature__tField____field_name_prime);
		tField__tFieldSignature____signatures
				.setName(tField__tFieldSignature____signatures_name_prime);
		tFieldSignature__tFieldDefinition____definitions
				.setName(tFieldSignature__tFieldDefinition____definitions_name_prime);
		tFieldDefinition__tFieldSignature____signature
				.setName(tFieldDefinition__tFieldSignature____signature_name_prime);
		tContainingClass__tFieldSignature____signature
				.setName(tContainingClass__tFieldSignature____signature_name_prime);
		tContainingClass__tFieldDefinition____defines
				.setName(tContainingClass__tFieldDefinition____defines_name_prime);
		pg__tField____fields.setName(pg__tField____fields_name_prime);
		pg__tContainingClass____classes
				.setName(pg__tContainingClass____classes_name_prime);
		jContainingClassToTContainingClass__jContainingClass____source
				.setName(jContainingClassToTContainingClass__jContainingClass____source_name_prime);
		jContainingClassToTContainingClass__tContainingClass____target
				.setName(jContainingClassToTContainingClass__tContainingClass____target_name_prime);
		return new Object[] { tFieldSignature, tFieldDefinition,
				jContainingClass, tContainingClass, pg, tField,
				jContainingClassToTContainingClass, isApplicableMatch,
				tFieldSignature__tField____field,
				tField__tFieldSignature____signatures,
				tFieldSignature__tFieldDefinition____definitions,
				tFieldDefinition__tFieldSignature____signature,
				tContainingClass__tFieldSignature____signature,
				tContainingClass__tFieldDefinition____defines,
				pg__tField____fields, pg__tContainingClass____classes,
				jContainingClassToTContainingClass__jContainingClass____source,
				jContainingClassToTContainingClass__tContainingClass____target };
	}

	public static final Object[] pattern_FieldNameCreate_12_4_bindingFBBBBBBBBB(
			FieldNameCreate _this, IsApplicableMatch isApplicableMatch,
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			org.emftext.language.java.classifiers.Class jContainingClass,
			TClass tContainingClass, TypeGraph pg, TField tField,
			ClassToTClass jContainingClassToTContainingClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, tFieldSignature, tFieldDefinition,
				jContainingClass, tContainingClass, pg, tField,
				jContainingClassToTContainingClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					tFieldSignature, tFieldDefinition, jContainingClass,
					tContainingClass, pg, tField,
					jContainingClassToTContainingClass };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldNameCreate_12_4_bindingAndBlackFBBBBBBBBB(
			FieldNameCreate _this, IsApplicableMatch isApplicableMatch,
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			org.emftext.language.java.classifiers.Class jContainingClass,
			TClass tContainingClass, TypeGraph pg, TField tField,
			ClassToTClass jContainingClassToTContainingClass) {
		Object[] result_pattern_FieldNameCreate_12_4_binding = pattern_FieldNameCreate_12_4_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tFieldSignature, tFieldDefinition,
				jContainingClass, tContainingClass, pg, tField,
				jContainingClassToTContainingClass);
		if (result_pattern_FieldNameCreate_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_FieldNameCreate_12_4_binding[0];

			Object[] result_pattern_FieldNameCreate_12_4_black = pattern_FieldNameCreate_12_4_blackB(csp);
			if (result_pattern_FieldNameCreate_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						tFieldSignature, tFieldDefinition, jContainingClass,
						tContainingClass, pg, tField,
						jContainingClassToTContainingClass };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldNameCreate_12_5_expressionFBB(
			FieldNameCreate _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldNameCreate_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldNameCreate";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldNameCreate_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_20_1_bindingFB(
			FieldNameCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_20_1_blackFBB(
			EClass __eClass, FieldNameCreate _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_20_1_bindingAndBlackFFB(
			FieldNameCreate _this) {
		Object[] result_pattern_FieldNameCreate_20_1_binding = pattern_FieldNameCreate_20_1_bindingFB(_this);
		if (result_pattern_FieldNameCreate_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldNameCreate_20_1_binding[0];

			Object[] result_pattern_FieldNameCreate_20_1_black = pattern_FieldNameCreate_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_FieldNameCreate_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldNameCreate_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldNameCreate_20_2_black_nac_0BB(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition) {
		for (TFieldDefinition __DEC_tFieldSignature_definitions_202058 : tFieldSignature
				.getDefinitions()) {
			if (!tFieldDefinition
					.equals(__DEC_tFieldSignature_definitions_202058)) {
				return new Object[] { tFieldSignature, tFieldDefinition };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_20_2_black_nac_1BB(
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		TFieldSignature __DEC_tFieldDefinition_definitions_534609 = tFieldDefinition
				.getSignature();
		if (__DEC_tFieldDefinition_definitions_534609 != null) {
			if (!tFieldSignature
					.equals(__DEC_tFieldDefinition_definitions_534609)) {
				return new Object[] { tFieldDefinition, tFieldSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_FieldNameCreate_20_2_black_nac_2BB(
			TField tField, TypeGraph pg) {
		for (TypeGraph __DEC_tField_fields_26852 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tField, TypeGraph.class, "fields")) {
			if (!pg.equals(__DEC_tField_fields_26852)) {
				return new Object[] { tField, pg };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldNameCreate_20_2_blackFFFFFB(
			EMoflonEdge _edge_field) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTFieldSignature = _edge_field.getSrc();
		if (tmpTFieldSignature instanceof TFieldSignature) {
			TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
			EObject tmpTField = _edge_field.getTrg();
			if (tmpTField instanceof TField) {
				TField tField = (TField) tmpTField;
				if (tField.equals(tFieldSignature.getField())) {
					for (TFieldDefinition tFieldDefinition : tFieldSignature
							.getDefinitions()) {
						if (pattern_FieldNameCreate_20_2_black_nac_0BB(
								tFieldSignature, tFieldDefinition) == null) {
							if (pattern_FieldNameCreate_20_2_black_nac_1BB(
									tFieldDefinition, tFieldSignature) == null) {
								for (TClass tContainingClass : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(
												tFieldSignature, TClass.class,
												"signature")) {
									if (tContainingClass.getDefines().contains(
											tFieldDefinition)) {
										for (TypeGraph pg : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														tField,
														TypeGraph.class,
														"fields")) {
											if (pg.getClasses().contains(
													tContainingClass)) {
												if (pattern_FieldNameCreate_20_2_black_nac_2BB(
														tField, pg) == null) {
													_result.add(new Object[] {
															tFieldSignature,
															tFieldDefinition,
															tContainingClass,
															pg, tField,
															_edge_field });
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

		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldNameCreate_20_3_expressionFBBBBBBB(
			FieldNameCreate _this, Match match,
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			TClass tContainingClass, TypeGraph pg, TField tField) {
		boolean _localVariable_0 = _this
				.isAppropriate_BWD(match, tFieldSignature, tFieldDefinition,
						tContainingClass, pg, tField);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldNameCreate_20_4_expressionFBB(
			FieldNameCreate _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_FieldNameCreate_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_FieldNameCreate_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_21_1_bindingFB(
			FieldNameCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_21_1_blackFBB(
			EClass __eClass, FieldNameCreate _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_21_1_bindingAndBlackFFB(
			FieldNameCreate _this) {
		Object[] result_pattern_FieldNameCreate_21_1_binding = pattern_FieldNameCreate_21_1_bindingFB(_this);
		if (result_pattern_FieldNameCreate_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldNameCreate_21_1_binding[0];

			Object[] result_pattern_FieldNameCreate_21_1_black = pattern_FieldNameCreate_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_FieldNameCreate_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldNameCreate_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldNameCreate_21_2_black_nac_0BB(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition) {
		for (TFieldDefinition __DEC_tFieldSignature_definitions_119909 : tFieldSignature
				.getDefinitions()) {
			if (!tFieldDefinition
					.equals(__DEC_tFieldSignature_definitions_119909)) {
				return new Object[] { tFieldSignature, tFieldDefinition };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_21_2_black_nac_1BB(
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		TFieldSignature __DEC_tFieldDefinition_definitions_726290 = tFieldDefinition
				.getSignature();
		if (__DEC_tFieldDefinition_definitions_726290 != null) {
			if (!tFieldSignature
					.equals(__DEC_tFieldDefinition_definitions_726290)) {
				return new Object[] { tFieldDefinition, tFieldSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_FieldNameCreate_21_2_black_nac_2BB(
			TField tField, TypeGraph pg) {
		for (TypeGraph __DEC_tField_fields_502958 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tField, TypeGraph.class, "fields")) {
			if (!pg.equals(__DEC_tField_fields_502958)) {
				return new Object[] { tField, pg };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldNameCreate_21_2_blackFFFFFB(
			EMoflonEdge _edge_signatures) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTField = _edge_signatures.getSrc();
		if (tmpTField instanceof TField) {
			TField tField = (TField) tmpTField;
			EObject tmpTFieldSignature = _edge_signatures.getTrg();
			if (tmpTFieldSignature instanceof TFieldSignature) {
				TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
				if (tField.equals(tFieldSignature.getField())) {
					for (TFieldDefinition tFieldDefinition : tFieldSignature
							.getDefinitions()) {
						if (pattern_FieldNameCreate_21_2_black_nac_0BB(
								tFieldSignature, tFieldDefinition) == null) {
							if (pattern_FieldNameCreate_21_2_black_nac_1BB(
									tFieldDefinition, tFieldSignature) == null) {
								for (TypeGraph pg : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(tField,
												TypeGraph.class, "fields")) {
									if (pattern_FieldNameCreate_21_2_black_nac_2BB(
											tField, pg) == null) {
										for (TClass tContainingClass : pg
												.getClasses()) {
											if (tContainingClass.getSignature()
													.contains(tFieldSignature)) {
												if (tContainingClass
														.getDefines()
														.contains(
																tFieldDefinition)) {
													_result.add(new Object[] {
															tFieldSignature,
															tFieldDefinition,
															tContainingClass,
															pg, tField,
															_edge_signatures });
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

		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldNameCreate_21_3_expressionFBBBBBBB(
			FieldNameCreate _this, Match match,
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			TClass tContainingClass, TypeGraph pg, TField tField) {
		boolean _localVariable_0 = _this
				.isAppropriate_BWD(match, tFieldSignature, tFieldDefinition,
						tContainingClass, pg, tField);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldNameCreate_21_4_expressionFBB(
			FieldNameCreate _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_FieldNameCreate_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_FieldNameCreate_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_22_1_bindingFB(
			FieldNameCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_22_1_blackFBB(
			EClass __eClass, FieldNameCreate _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_22_1_bindingAndBlackFFB(
			FieldNameCreate _this) {
		Object[] result_pattern_FieldNameCreate_22_1_binding = pattern_FieldNameCreate_22_1_bindingFB(_this);
		if (result_pattern_FieldNameCreate_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldNameCreate_22_1_binding[0];

			Object[] result_pattern_FieldNameCreate_22_1_black = pattern_FieldNameCreate_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_FieldNameCreate_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldNameCreate_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldNameCreate_22_2_black_nac_0BB(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition) {
		for (TFieldDefinition __DEC_tFieldSignature_definitions_402849 : tFieldSignature
				.getDefinitions()) {
			if (!tFieldDefinition
					.equals(__DEC_tFieldSignature_definitions_402849)) {
				return new Object[] { tFieldSignature, tFieldDefinition };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_22_2_black_nac_1BB(
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		TFieldSignature __DEC_tFieldDefinition_definitions_458456 = tFieldDefinition
				.getSignature();
		if (__DEC_tFieldDefinition_definitions_458456 != null) {
			if (!tFieldSignature
					.equals(__DEC_tFieldDefinition_definitions_458456)) {
				return new Object[] { tFieldDefinition, tFieldSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_FieldNameCreate_22_2_black_nac_2BB(
			TField tField, TypeGraph pg) {
		for (TypeGraph __DEC_tField_fields_318627 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tField, TypeGraph.class, "fields")) {
			if (!pg.equals(__DEC_tField_fields_318627)) {
				return new Object[] { tField, pg };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldNameCreate_22_2_blackFFFFFB(
			EMoflonEdge _edge_definitions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTFieldSignature = _edge_definitions.getSrc();
		if (tmpTFieldSignature instanceof TFieldSignature) {
			TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
			EObject tmpTFieldDefinition = _edge_definitions.getTrg();
			if (tmpTFieldDefinition instanceof TFieldDefinition) {
				TFieldDefinition tFieldDefinition = (TFieldDefinition) tmpTFieldDefinition;
				if (tFieldSignature.getDefinitions().contains(tFieldDefinition)) {
					TField tField = tFieldSignature.getField();
					if (tField != null) {
						if (pattern_FieldNameCreate_22_2_black_nac_0BB(
								tFieldSignature, tFieldDefinition) == null) {
							if (pattern_FieldNameCreate_22_2_black_nac_1BB(
									tFieldDefinition, tFieldSignature) == null) {
								for (TClass tContainingClass : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(
												tFieldSignature, TClass.class,
												"signature")) {
									if (tContainingClass.getDefines().contains(
											tFieldDefinition)) {
										for (TypeGraph pg : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														tField,
														TypeGraph.class,
														"fields")) {
											if (pg.getClasses().contains(
													tContainingClass)) {
												if (pattern_FieldNameCreate_22_2_black_nac_2BB(
														tField, pg) == null) {
													_result.add(new Object[] {
															tFieldSignature,
															tFieldDefinition,
															tContainingClass,
															pg, tField,
															_edge_definitions });
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

		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldNameCreate_22_3_expressionFBBBBBBB(
			FieldNameCreate _this, Match match,
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			TClass tContainingClass, TypeGraph pg, TField tField) {
		boolean _localVariable_0 = _this
				.isAppropriate_BWD(match, tFieldSignature, tFieldDefinition,
						tContainingClass, pg, tField);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldNameCreate_22_4_expressionFBB(
			FieldNameCreate _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_FieldNameCreate_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_FieldNameCreate_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_23_1_bindingFB(
			FieldNameCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_23_1_blackFBB(
			EClass __eClass, FieldNameCreate _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_23_1_bindingAndBlackFFB(
			FieldNameCreate _this) {
		Object[] result_pattern_FieldNameCreate_23_1_binding = pattern_FieldNameCreate_23_1_bindingFB(_this);
		if (result_pattern_FieldNameCreate_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldNameCreate_23_1_binding[0];

			Object[] result_pattern_FieldNameCreate_23_1_black = pattern_FieldNameCreate_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_FieldNameCreate_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldNameCreate_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldNameCreate_23_2_black_nac_0BB(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition) {
		for (TFieldDefinition __DEC_tFieldSignature_definitions_426369 : tFieldSignature
				.getDefinitions()) {
			if (!tFieldDefinition
					.equals(__DEC_tFieldSignature_definitions_426369)) {
				return new Object[] { tFieldSignature, tFieldDefinition };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_23_2_black_nac_1BB(
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		TFieldSignature __DEC_tFieldDefinition_definitions_345785 = tFieldDefinition
				.getSignature();
		if (__DEC_tFieldDefinition_definitions_345785 != null) {
			if (!tFieldSignature
					.equals(__DEC_tFieldDefinition_definitions_345785)) {
				return new Object[] { tFieldDefinition, tFieldSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_FieldNameCreate_23_2_black_nac_2BB(
			TField tField, TypeGraph pg) {
		for (TypeGraph __DEC_tField_fields_389578 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tField, TypeGraph.class, "fields")) {
			if (!pg.equals(__DEC_tField_fields_389578)) {
				return new Object[] { tField, pg };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldNameCreate_23_2_blackFFFFFB(
			EMoflonEdge _edge_signature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTFieldDefinition = _edge_signature.getSrc();
		if (tmpTFieldDefinition instanceof TFieldDefinition) {
			TFieldDefinition tFieldDefinition = (TFieldDefinition) tmpTFieldDefinition;
			EObject tmpTFieldSignature = _edge_signature.getTrg();
			if (tmpTFieldSignature instanceof TFieldSignature) {
				TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
				if (tFieldSignature.getDefinitions().contains(tFieldDefinition)) {
					TField tField = tFieldSignature.getField();
					if (tField != null) {
						if (pattern_FieldNameCreate_23_2_black_nac_0BB(
								tFieldSignature, tFieldDefinition) == null) {
							if (pattern_FieldNameCreate_23_2_black_nac_1BB(
									tFieldDefinition, tFieldSignature) == null) {
								for (TClass tContainingClass : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(
												tFieldDefinition, TClass.class,
												"defines")) {
									if (tContainingClass.getSignature()
											.contains(tFieldSignature)) {
										for (TypeGraph pg : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														tField,
														TypeGraph.class,
														"fields")) {
											if (pg.getClasses().contains(
													tContainingClass)) {
												if (pattern_FieldNameCreate_23_2_black_nac_2BB(
														tField, pg) == null) {
													_result.add(new Object[] {
															tFieldSignature,
															tFieldDefinition,
															tContainingClass,
															pg, tField,
															_edge_signature });
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

		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldNameCreate_23_3_expressionFBBBBBBB(
			FieldNameCreate _this, Match match,
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			TClass tContainingClass, TypeGraph pg, TField tField) {
		boolean _localVariable_0 = _this
				.isAppropriate_BWD(match, tFieldSignature, tFieldDefinition,
						tContainingClass, pg, tField);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldNameCreate_23_4_expressionFBB(
			FieldNameCreate _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_FieldNameCreate_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_FieldNameCreate_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_24_1_bindingFB(
			FieldNameCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_24_1_blackFBB(
			EClass __eClass, FieldNameCreate _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_24_1_bindingAndBlackFFB(
			FieldNameCreate _this) {
		Object[] result_pattern_FieldNameCreate_24_1_binding = pattern_FieldNameCreate_24_1_bindingFB(_this);
		if (result_pattern_FieldNameCreate_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldNameCreate_24_1_binding[0];

			Object[] result_pattern_FieldNameCreate_24_1_black = pattern_FieldNameCreate_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_FieldNameCreate_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldNameCreate_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_FieldNameCreate_24_2_blackFFB(
			EMoflonEdge _edge_members) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJContainingClass = _edge_members.getSrc();
		if (tmpJContainingClass instanceof org.emftext.language.java.classifiers.Class) {
			org.emftext.language.java.classifiers.Class jContainingClass = (org.emftext.language.java.classifiers.Class) tmpJContainingClass;
			EObject tmpJField = _edge_members.getTrg();
			if (tmpJField instanceof Field) {
				Field jField = (Field) tmpJField;
				if (jContainingClass.getMembers().contains(jField)) {
					_result.add(new Object[] { jContainingClass, jField,
							_edge_members });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldNameCreate_24_3_expressionFBBBB(
			FieldNameCreate _this, Match match,
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				jContainingClass, jField);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldNameCreate_24_4_expressionFBB(
			FieldNameCreate _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_FieldNameCreate_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_FieldNameCreate_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_25_1_bindingFB(
			FieldNameCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_25_1_blackFBB(
			EClass __eClass, FieldNameCreate _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_25_1_bindingAndBlackFFB(
			FieldNameCreate _this) {
		Object[] result_pattern_FieldNameCreate_25_1_binding = pattern_FieldNameCreate_25_1_bindingFB(_this);
		if (result_pattern_FieldNameCreate_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldNameCreate_25_1_binding[0];

			Object[] result_pattern_FieldNameCreate_25_1_black = pattern_FieldNameCreate_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_FieldNameCreate_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldNameCreate_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldNameCreate_25_2_black_nac_0BB(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition) {
		for (TFieldDefinition __DEC_tFieldSignature_definitions_90385 : tFieldSignature
				.getDefinitions()) {
			if (!tFieldDefinition
					.equals(__DEC_tFieldSignature_definitions_90385)) {
				return new Object[] { tFieldSignature, tFieldDefinition };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_25_2_black_nac_1BB(
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		TFieldSignature __DEC_tFieldDefinition_definitions_214058 = tFieldDefinition
				.getSignature();
		if (__DEC_tFieldDefinition_definitions_214058 != null) {
			if (!tFieldSignature
					.equals(__DEC_tFieldDefinition_definitions_214058)) {
				return new Object[] { tFieldDefinition, tFieldSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_FieldNameCreate_25_2_black_nac_2BB(
			TField tField, TypeGraph pg) {
		for (TypeGraph __DEC_tField_fields_259830 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tField, TypeGraph.class, "fields")) {
			if (!pg.equals(__DEC_tField_fields_259830)) {
				return new Object[] { tField, pg };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldNameCreate_25_2_blackFFFFFB(
			EMoflonEdge _edge_signature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTContainingClass = _edge_signature.getSrc();
		if (tmpTContainingClass instanceof TClass) {
			TClass tContainingClass = (TClass) tmpTContainingClass;
			EObject tmpTFieldSignature = _edge_signature.getTrg();
			if (tmpTFieldSignature instanceof TFieldSignature) {
				TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
				if (tContainingClass.getSignature().contains(tFieldSignature)) {
					TField tField = tFieldSignature.getField();
					if (tField != null) {
						for (TMember tmpTFieldDefinition : tContainingClass
								.getDefines()) {
							if (tmpTFieldDefinition instanceof TFieldDefinition) {
								TFieldDefinition tFieldDefinition = (TFieldDefinition) tmpTFieldDefinition;
								if (tFieldSignature.getDefinitions().contains(
										tFieldDefinition)) {
									if (pattern_FieldNameCreate_25_2_black_nac_0BB(
											tFieldSignature, tFieldDefinition) == null) {
										if (pattern_FieldNameCreate_25_2_black_nac_1BB(
												tFieldDefinition,
												tFieldSignature) == null) {
											for (TypeGraph pg : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(
															tContainingClass,
															TypeGraph.class,
															"classes")) {
												if (pg.getFields().contains(
														tField)) {
													if (pattern_FieldNameCreate_25_2_black_nac_2BB(
															tField, pg) == null) {
														_result.add(new Object[] {
																tFieldSignature,
																tFieldDefinition,
																tContainingClass,
																pg, tField,
																_edge_signature });
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

		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldNameCreate_25_3_expressionFBBBBBBB(
			FieldNameCreate _this, Match match,
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			TClass tContainingClass, TypeGraph pg, TField tField) {
		boolean _localVariable_0 = _this
				.isAppropriate_BWD(match, tFieldSignature, tFieldDefinition,
						tContainingClass, pg, tField);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldNameCreate_25_4_expressionFBB(
			FieldNameCreate _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_FieldNameCreate_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_FieldNameCreate_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_26_1_bindingFB(
			FieldNameCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_26_1_blackFBB(
			EClass __eClass, FieldNameCreate _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_26_1_bindingAndBlackFFB(
			FieldNameCreate _this) {
		Object[] result_pattern_FieldNameCreate_26_1_binding = pattern_FieldNameCreate_26_1_bindingFB(_this);
		if (result_pattern_FieldNameCreate_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldNameCreate_26_1_binding[0];

			Object[] result_pattern_FieldNameCreate_26_1_black = pattern_FieldNameCreate_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_FieldNameCreate_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldNameCreate_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldNameCreate_26_2_black_nac_0BB(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition) {
		for (TFieldDefinition __DEC_tFieldSignature_definitions_504640 : tFieldSignature
				.getDefinitions()) {
			if (!tFieldDefinition
					.equals(__DEC_tFieldSignature_definitions_504640)) {
				return new Object[] { tFieldSignature, tFieldDefinition };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_26_2_black_nac_1BB(
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		TFieldSignature __DEC_tFieldDefinition_definitions_145250 = tFieldDefinition
				.getSignature();
		if (__DEC_tFieldDefinition_definitions_145250 != null) {
			if (!tFieldSignature
					.equals(__DEC_tFieldDefinition_definitions_145250)) {
				return new Object[] { tFieldDefinition, tFieldSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_FieldNameCreate_26_2_black_nac_2BB(
			TField tField, TypeGraph pg) {
		for (TypeGraph __DEC_tField_fields_678876 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tField, TypeGraph.class, "fields")) {
			if (!pg.equals(__DEC_tField_fields_678876)) {
				return new Object[] { tField, pg };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldNameCreate_26_2_blackFFFFFB(
			EMoflonEdge _edge_defines) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTContainingClass = _edge_defines.getSrc();
		if (tmpTContainingClass instanceof TClass) {
			TClass tContainingClass = (TClass) tmpTContainingClass;
			EObject tmpTFieldDefinition = _edge_defines.getTrg();
			if (tmpTFieldDefinition instanceof TFieldDefinition) {
				TFieldDefinition tFieldDefinition = (TFieldDefinition) tmpTFieldDefinition;
				if (tContainingClass.getDefines().contains(tFieldDefinition)) {
					TFieldSignature tFieldSignature = tFieldDefinition
							.getSignature();
					if (tFieldSignature != null) {
						if (tContainingClass.getSignature().contains(
								tFieldSignature)) {
							TField tField = tFieldSignature.getField();
							if (tField != null) {
								if (pattern_FieldNameCreate_26_2_black_nac_0BB(
										tFieldSignature, tFieldDefinition) == null) {
									if (pattern_FieldNameCreate_26_2_black_nac_1BB(
											tFieldDefinition, tFieldSignature) == null) {
										for (TypeGraph pg : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														tContainingClass,
														TypeGraph.class,
														"classes")) {
											if (pg.getFields().contains(tField)) {
												if (pattern_FieldNameCreate_26_2_black_nac_2BB(
														tField, pg) == null) {
													_result.add(new Object[] {
															tFieldSignature,
															tFieldDefinition,
															tContainingClass,
															pg, tField,
															_edge_defines });
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

		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_26_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldNameCreate_26_3_expressionFBBBBBBB(
			FieldNameCreate _this, Match match,
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			TClass tContainingClass, TypeGraph pg, TField tField) {
		boolean _localVariable_0 = _this
				.isAppropriate_BWD(match, tFieldSignature, tFieldDefinition,
						tContainingClass, pg, tField);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldNameCreate_26_4_expressionFBB(
			FieldNameCreate _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_26_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_FieldNameCreate_26_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_FieldNameCreate_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_27_1_bindingFB(
			FieldNameCreate _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_27_1_blackFBB(
			EClass __eClass, FieldNameCreate _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_27_1_bindingAndBlackFFB(
			FieldNameCreate _this) {
		Object[] result_pattern_FieldNameCreate_27_1_binding = pattern_FieldNameCreate_27_1_bindingFB(_this);
		if (result_pattern_FieldNameCreate_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldNameCreate_27_1_binding[0];

			Object[] result_pattern_FieldNameCreate_27_1_black = pattern_FieldNameCreate_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_FieldNameCreate_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldNameCreate_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldNameCreate_27_2_black_nac_0BB(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition) {
		for (TFieldDefinition __DEC_tFieldSignature_definitions_951540 : tFieldSignature
				.getDefinitions()) {
			if (!tFieldDefinition
					.equals(__DEC_tFieldSignature_definitions_951540)) {
				return new Object[] { tFieldSignature, tFieldDefinition };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameCreate_27_2_black_nac_1BB(
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		TFieldSignature __DEC_tFieldDefinition_definitions_329828 = tFieldDefinition
				.getSignature();
		if (__DEC_tFieldDefinition_definitions_329828 != null) {
			if (!tFieldSignature
					.equals(__DEC_tFieldDefinition_definitions_329828)) {
				return new Object[] { tFieldDefinition, tFieldSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_FieldNameCreate_27_2_black_nac_2BB(
			TField tField, TypeGraph pg) {
		for (TypeGraph __DEC_tField_fields_200400 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tField, TypeGraph.class, "fields")) {
			if (!pg.equals(__DEC_tField_fields_200400)) {
				return new Object[] { tField, pg };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldNameCreate_27_2_blackFFFFFB(
			EMoflonEdge _edge_fields) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPg = _edge_fields.getSrc();
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			EObject tmpTField = _edge_fields.getTrg();
			if (tmpTField instanceof TField) {
				TField tField = (TField) tmpTField;
				if (pg.getFields().contains(tField)) {
					if (pattern_FieldNameCreate_27_2_black_nac_2BB(tField, pg) == null) {
						for (TClass tContainingClass : pg.getClasses()) {
							for (TFieldSignature tFieldSignature : tField
									.getSignatures()) {
								if (tContainingClass.getSignature().contains(
										tFieldSignature)) {
									for (TMember tmpTFieldDefinition : tContainingClass
											.getDefines()) {
										if (tmpTFieldDefinition instanceof TFieldDefinition) {
											TFieldDefinition tFieldDefinition = (TFieldDefinition) tmpTFieldDefinition;
											if (tFieldSignature
													.getDefinitions().contains(
															tFieldDefinition)) {
												if (pattern_FieldNameCreate_27_2_black_nac_0BB(
														tFieldSignature,
														tFieldDefinition) == null) {
													if (pattern_FieldNameCreate_27_2_black_nac_1BB(
															tFieldDefinition,
															tFieldSignature) == null) {
														_result.add(new Object[] {
																tFieldSignature,
																tFieldDefinition,
																tContainingClass,
																pg, tField,
																_edge_fields });
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

		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_27_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldNameCreate_27_3_expressionFBBBBBBB(
			FieldNameCreate _this, Match match,
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition,
			TClass tContainingClass, TypeGraph pg, TField tField) {
		boolean _localVariable_0 = _this
				.isAppropriate_BWD(match, tFieldSignature, tFieldDefinition,
						tContainingClass, pg, tField);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldNameCreate_27_4_expressionFBB(
			FieldNameCreate _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameCreate_27_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_FieldNameCreate_27_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_FieldNameCreate_27_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FieldNameCreateImpl
