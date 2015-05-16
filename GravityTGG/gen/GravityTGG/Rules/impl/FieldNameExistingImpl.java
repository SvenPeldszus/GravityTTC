/**
 */
package GravityTGG.Rules.impl;

import GravityTGG.ClassToTClass;
import GravityTGG.FieldToTField;
import GravityTGG.FieldToTFieldDefinition;
import GravityTGG.FieldToTFieldSignature;
import GravityTGG.GravityTGGFactory;

import GravityTGG.Rules.FieldNameExisting;
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
 * An implementation of the model object '<em><b>Field Name Existing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FieldNameExistingImpl extends AbstractRuleImpl implements
		FieldNameExisting {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldNameExistingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFieldNameExisting();
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
		Object[] result1_black = FieldNameExistingImpl
				.pattern_FieldNameExisting_0_1_blackBBBB(this, match,
						jContainingClass, jField);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = FieldNameExistingImpl
				.pattern_FieldNameExisting_0_2_bindingAndBlackFBBBB(this,
						match, jContainingClass, jField);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (FieldNameExistingImpl.pattern_FieldNameExisting_0_3_expressionFBB(
				this, csp)) {

			// collect elements to be translated
			Object[] result4_black = FieldNameExistingImpl
					.pattern_FieldNameExisting_0_4_blackBBB(match,
							jContainingClass, jField);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			FieldNameExistingImpl.pattern_FieldNameExisting_0_4_greenBBBF(
					match, jContainingClass, jField);
			// EMoflonEdge jContainingClass__jField____members = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = FieldNameExistingImpl
					.pattern_FieldNameExisting_0_5_blackBBB(match,
							jContainingClass, jField);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			FieldNameExistingImpl.pattern_FieldNameExisting_0_5_greenBB(match,
					jContainingClass);

			// register objects to match
			FieldNameExistingImpl.pattern_FieldNameExisting_0_6_expressionBBBB(
					this, match, jContainingClass, jField);
			return FieldNameExistingImpl
					.pattern_FieldNameExisting_0_7_expressionF();
		} else {
			return FieldNameExistingImpl
					.pattern_FieldNameExisting_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = FieldNameExistingImpl
				.pattern_FieldNameExisting_1_1_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		org.emftext.language.java.classifiers.Class jContainingClass = (org.emftext.language.java.classifiers.Class) result1_bindingAndBlack[0];
		Field jField = (Field) result1_bindingAndBlack[1];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[2];
		TClass tContainingClass = (TClass) result1_bindingAndBlack[3];
		ClassToTClass tContainingClassToJContainingClass = (ClassToTClass) result1_bindingAndBlack[4];
		TField tField = (TField) result1_bindingAndBlack[5];
		// CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = FieldNameExistingImpl
				.pattern_FieldNameExisting_1_1_greenBFFBBFFF(jField,
						tContainingClass, tField);
		FieldToTField jFieldToTField = (FieldToTField) result1_green[1];
		FieldToTFieldDefinition jFieldToTFieldDefinition = (FieldToTFieldDefinition) result1_green[2];
		TFieldDefinition tFieldDefinition = (TFieldDefinition) result1_green[5];
		TFieldSignature tFieldSignature = (TFieldSignature) result1_green[6];
		FieldToTFieldSignature tFieldSignatureToJField = (FieldToTFieldSignature) result1_green[7];

		// collect translated elements
		Object[] result2_black = FieldNameExistingImpl
				.pattern_FieldNameExisting_1_2_blackBBBBBB(jField,
						jFieldToTField, jFieldToTFieldDefinition,
						tFieldDefinition, tFieldSignature,
						tFieldSignatureToJField);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = FieldNameExistingImpl
				.pattern_FieldNameExisting_1_2_greenFBBBBBB(jField,
						jFieldToTField, jFieldToTFieldDefinition,
						tFieldDefinition, tFieldSignature,
						tFieldSignatureToJField);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = FieldNameExistingImpl
				.pattern_FieldNameExisting_1_3_blackBBBBBBBBBBBB(ruleresult,
						jContainingClass, jField, jFieldToTField,
						jFieldToTFieldDefinition, pg, tContainingClass,
						tContainingClassToJContainingClass, tField,
						tFieldDefinition, tFieldSignature,
						tFieldSignatureToJField);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		FieldNameExistingImpl
				.pattern_FieldNameExisting_1_3_greenBBBBBBBBBBFFFFFFFFFFFFF(
						ruleresult, jContainingClass, jField, jFieldToTField,
						jFieldToTFieldDefinition, tContainingClass, tField,
						tFieldDefinition, tFieldSignature,
						tFieldSignatureToJField);
		// EMoflonEdge jContainingClass__jField____members = (EMoflonEdge) result3_green[10];
		// EMoflonEdge jFieldToTField__tField____target = (EMoflonEdge) result3_green[11];
		// EMoflonEdge jFieldToTField__jField____source = (EMoflonEdge) result3_green[12];
		// EMoflonEdge jFieldToTFieldDefinition__tFieldDefinition____target = (EMoflonEdge) result3_green[13];
		// EMoflonEdge jFieldToTFieldDefinition__jField____source = (EMoflonEdge) result3_green[14];
		// EMoflonEdge tContainingClass__tFieldDefinition____defines = (EMoflonEdge) result3_green[15];
		// EMoflonEdge tContainingClass__tFieldSignature____signature = (EMoflonEdge) result3_green[16];
		// EMoflonEdge tFieldSignature__tFieldDefinition____definitions = (EMoflonEdge) result3_green[17];
		// EMoflonEdge tFieldDefinition__tFieldSignature____signature = (EMoflonEdge) result3_green[18];
		// EMoflonEdge tFieldSignature__tField____field = (EMoflonEdge) result3_green[19];
		// EMoflonEdge tField__tFieldSignature____signatures = (EMoflonEdge) result3_green[20];
		// EMoflonEdge tFieldSignatureToJField__tFieldSignature____target = (EMoflonEdge) result3_green[21];
		// EMoflonEdge tFieldSignatureToJField__jField____source = (EMoflonEdge) result3_green[22];

		// perform postprocessing story node is empty
		// register objects
		FieldNameExistingImpl
				.pattern_FieldNameExisting_1_5_expressionBBBBBBBBBBBBB(this,
						ruleresult, jContainingClass, jField, jFieldToTField,
						jFieldToTFieldDefinition, pg, tContainingClass,
						tContainingClassToJContainingClass, tField,
						tFieldDefinition, tFieldSignature,
						tFieldSignatureToJField);
		return FieldNameExistingImpl
				.pattern_FieldNameExisting_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameExistingImpl
				.pattern_FieldNameExisting_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameExistingImpl
				.pattern_FieldNameExisting_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = FieldNameExistingImpl
				.pattern_FieldNameExisting_2_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		org.emftext.language.java.classifiers.Class jContainingClass = (org.emftext.language.java.classifiers.Class) result2_binding[0];
		Field jField = (Field) result2_binding[1];
		for (Object[] result2_black : FieldNameExistingImpl
				.pattern_FieldNameExisting_2_2_blackBBFFB(jContainingClass,
						jField, match)) {
			TClass tContainingClass = (TClass) result2_black[2];
			ClassToTClass tContainingClassToJContainingClass = (ClassToTClass) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : FieldNameExistingImpl
					.pattern_FieldNameExisting_2_3_blackBBFBBF(
							jContainingClass, jField, tContainingClass,
							tContainingClassToJContainingClass)) {
				TypeGraph pg = (TypeGraph) result3_black[2];
				TField tField = (TField) result3_black[5];
				Object[] result3_green = FieldNameExistingImpl
						.pattern_FieldNameExisting_2_3_greenBBBBBBFFFFFF(
								jContainingClass, jField, pg, tContainingClass,
								tContainingClassToJContainingClass, tField);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge jContainingClass__jField____members = (EMoflonEdge) result3_green[7];
				// EMoflonEdge pg__tContainingClass____classes = (EMoflonEdge) result3_green[8];
				// EMoflonEdge pg__tField____fields = (EMoflonEdge) result3_green[9];
				// EMoflonEdge tContainingClassToJContainingClass__tContainingClass____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge tContainingClassToJContainingClass__jContainingClass____source = (EMoflonEdge) result3_green[11];

				// solve CSP
				Object[] result4_bindingAndBlack = FieldNameExistingImpl
						.pattern_FieldNameExisting_2_4_bindingAndBlackFBBBBBBBB(
								this, isApplicableMatch, jContainingClass,
								jField, pg, tContainingClass,
								tContainingClassToJContainingClass, tField);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (FieldNameExistingImpl
						.pattern_FieldNameExisting_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = FieldNameExistingImpl
							.pattern_FieldNameExisting_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					FieldNameExistingImpl
							.pattern_FieldNameExisting_2_6_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return FieldNameExistingImpl
				.pattern_FieldNameExisting_2_7_expressionFB(ruleresult);
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
			Field jField, TypeGraph pg, TClass tContainingClass,
			ClassToTClass tContainingClassToJContainingClass, TField tField) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_jField_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"jField.name", true, csp);
		var_jField_name.setValue(jField.getName());
		var_jField_name.setType("String");
		Variable var_tField_tName = CSPFactoryHelper.eINSTANCE.createVariable(
				"tField.tName", true, csp);
		var_tField_tName.setValue(tField.getTName());
		var_tField_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_jField_name, var_tField_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jContainingClass", jContainingClass);
		isApplicableMatch.registerObject("jField", jField);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("tContainingClass", tContainingClass);
		isApplicableMatch.registerObject("tContainingClassToJContainingClass",
				tContainingClassToJContainingClass);
		isApplicableMatch.registerObject("tField", tField);
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
			EObject jContainingClass, EObject jField, EObject jFieldToTField,
			EObject jFieldToTFieldDefinition, EObject pg,
			EObject tContainingClass,
			EObject tContainingClassToJContainingClass, EObject tField,
			EObject tFieldDefinition, EObject tFieldSignature,
			EObject tFieldSignatureToJField) {
		ruleresult.registerObject("jContainingClass", jContainingClass);
		ruleresult.registerObject("jField", jField);
		ruleresult.registerObject("jFieldToTField", jFieldToTField);
		ruleresult.registerObject("jFieldToTFieldDefinition",
				jFieldToTFieldDefinition);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("tContainingClass", tContainingClass);
		ruleresult.registerObject("tContainingClassToJContainingClass",
				tContainingClassToJContainingClass);
		ruleresult.registerObject("tField", tField);
		ruleresult.registerObject("tFieldDefinition", tFieldDefinition);
		ruleresult.registerObject("tFieldSignature", tFieldSignature);
		ruleresult.registerObject("tFieldSignatureToJField",
				tFieldSignatureToJField);

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
	public boolean isAppropriate_BWD(Match match, TypeGraph pg,
			TClass tContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		// initial bindings
		Object[] result1_black = FieldNameExistingImpl
				.pattern_FieldNameExisting_10_1_blackBBBBBBB(this, match, pg,
						tContainingClass, tField, tFieldDefinition,
						tFieldSignature);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = FieldNameExistingImpl
				.pattern_FieldNameExisting_10_2_bindingAndBlackFBBBBBBB(this,
						match, pg, tContainingClass, tField, tFieldDefinition,
						tFieldSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (FieldNameExistingImpl.pattern_FieldNameExisting_10_3_expressionFBB(
				this, csp)) {

			// collect elements to be translated
			Object[] result4_black = FieldNameExistingImpl
					.pattern_FieldNameExisting_10_4_blackBBBBBB(match, pg,
							tContainingClass, tField, tFieldDefinition,
							tFieldSignature);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			FieldNameExistingImpl
					.pattern_FieldNameExisting_10_4_greenBBBBBFFFFFF(match,
							tContainingClass, tField, tFieldDefinition,
							tFieldSignature);
			// EMoflonEdge tContainingClass__tFieldDefinition____defines = (EMoflonEdge) result4_green[5];
			// EMoflonEdge tContainingClass__tFieldSignature____signature = (EMoflonEdge) result4_green[6];
			// EMoflonEdge tFieldSignature__tFieldDefinition____definitions = (EMoflonEdge) result4_green[7];
			// EMoflonEdge tFieldDefinition__tFieldSignature____signature = (EMoflonEdge) result4_green[8];
			// EMoflonEdge tFieldSignature__tField____field = (EMoflonEdge) result4_green[9];
			// EMoflonEdge tField__tFieldSignature____signatures = (EMoflonEdge) result4_green[10];

			// collect context elements
			Object[] result5_black = FieldNameExistingImpl
					.pattern_FieldNameExisting_10_5_blackBBBBBB(match, pg,
							tContainingClass, tField, tFieldDefinition,
							tFieldSignature);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			FieldNameExistingImpl.pattern_FieldNameExisting_10_5_greenBBBBFF(
					match, pg, tContainingClass, tField);
			// EMoflonEdge pg__tContainingClass____classes = (EMoflonEdge) result5_green[4];
			// EMoflonEdge pg__tField____fields = (EMoflonEdge) result5_green[5];

			// register objects to match
			FieldNameExistingImpl
					.pattern_FieldNameExisting_10_6_expressionBBBBBBB(this,
							match, pg, tContainingClass, tField,
							tFieldDefinition, tFieldSignature);
			return FieldNameExistingImpl
					.pattern_FieldNameExisting_10_7_expressionF();
		} else {
			return FieldNameExistingImpl
					.pattern_FieldNameExisting_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = FieldNameExistingImpl
				.pattern_FieldNameExisting_11_1_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		org.emftext.language.java.classifiers.Class jContainingClass = (org.emftext.language.java.classifiers.Class) result1_bindingAndBlack[0];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[1];
		TClass tContainingClass = (TClass) result1_bindingAndBlack[2];
		ClassToTClass tContainingClassToJContainingClass = (ClassToTClass) result1_bindingAndBlack[3];
		TField tField = (TField) result1_bindingAndBlack[4];
		TFieldDefinition tFieldDefinition = (TFieldDefinition) result1_bindingAndBlack[5];
		TFieldSignature tFieldSignature = (TFieldSignature) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = FieldNameExistingImpl
				.pattern_FieldNameExisting_11_1_greenBFFFBBBFB(
						jContainingClass, tField, tFieldDefinition,
						tFieldSignature, csp);
		Field jField = (Field) result1_green[1];
		FieldToTField jFieldToTField = (FieldToTField) result1_green[2];
		FieldToTFieldDefinition jFieldToTFieldDefinition = (FieldToTFieldDefinition) result1_green[3];
		FieldToTFieldSignature tFieldSignatureToJField = (FieldToTFieldSignature) result1_green[7];

		// collect translated elements
		Object[] result2_black = FieldNameExistingImpl
				.pattern_FieldNameExisting_11_2_blackBBBBBB(jField,
						jFieldToTField, jFieldToTFieldDefinition,
						tFieldDefinition, tFieldSignature,
						tFieldSignatureToJField);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = FieldNameExistingImpl
				.pattern_FieldNameExisting_11_2_greenFBBBBBB(jField,
						jFieldToTField, jFieldToTFieldDefinition,
						tFieldDefinition, tFieldSignature,
						tFieldSignatureToJField);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = FieldNameExistingImpl
				.pattern_FieldNameExisting_11_3_blackBBBBBBBBBBBB(ruleresult,
						jContainingClass, jField, jFieldToTField,
						jFieldToTFieldDefinition, pg, tContainingClass,
						tContainingClassToJContainingClass, tField,
						tFieldDefinition, tFieldSignature,
						tFieldSignatureToJField);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		FieldNameExistingImpl
				.pattern_FieldNameExisting_11_3_greenBBBBBBBBBBFFFFFFFFFFFFF(
						ruleresult, jContainingClass, jField, jFieldToTField,
						jFieldToTFieldDefinition, tContainingClass, tField,
						tFieldDefinition, tFieldSignature,
						tFieldSignatureToJField);
		// EMoflonEdge jContainingClass__jField____members = (EMoflonEdge) result3_green[10];
		// EMoflonEdge jFieldToTField__tField____target = (EMoflonEdge) result3_green[11];
		// EMoflonEdge jFieldToTField__jField____source = (EMoflonEdge) result3_green[12];
		// EMoflonEdge jFieldToTFieldDefinition__tFieldDefinition____target = (EMoflonEdge) result3_green[13];
		// EMoflonEdge jFieldToTFieldDefinition__jField____source = (EMoflonEdge) result3_green[14];
		// EMoflonEdge tContainingClass__tFieldDefinition____defines = (EMoflonEdge) result3_green[15];
		// EMoflonEdge tContainingClass__tFieldSignature____signature = (EMoflonEdge) result3_green[16];
		// EMoflonEdge tFieldSignature__tFieldDefinition____definitions = (EMoflonEdge) result3_green[17];
		// EMoflonEdge tFieldDefinition__tFieldSignature____signature = (EMoflonEdge) result3_green[18];
		// EMoflonEdge tFieldSignature__tField____field = (EMoflonEdge) result3_green[19];
		// EMoflonEdge tField__tFieldSignature____signatures = (EMoflonEdge) result3_green[20];
		// EMoflonEdge tFieldSignatureToJField__tFieldSignature____target = (EMoflonEdge) result3_green[21];
		// EMoflonEdge tFieldSignatureToJField__jField____source = (EMoflonEdge) result3_green[22];

		// perform postprocessing story node is empty
		// register objects
		FieldNameExistingImpl
				.pattern_FieldNameExisting_11_5_expressionBBBBBBBBBBBBB(this,
						ruleresult, jContainingClass, jField, jFieldToTField,
						jFieldToTFieldDefinition, pg, tContainingClass,
						tContainingClassToJContainingClass, tField,
						tFieldDefinition, tFieldSignature,
						tFieldSignatureToJField);
		return FieldNameExistingImpl
				.pattern_FieldNameExisting_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameExistingImpl
				.pattern_FieldNameExisting_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameExistingImpl
				.pattern_FieldNameExisting_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = FieldNameExistingImpl
				.pattern_FieldNameExisting_12_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		TypeGraph pg = (TypeGraph) result2_binding[0];
		TClass tContainingClass = (TClass) result2_binding[1];
		TField tField = (TField) result2_binding[2];
		TFieldDefinition tFieldDefinition = (TFieldDefinition) result2_binding[3];
		TFieldSignature tFieldSignature = (TFieldSignature) result2_binding[4];
		for (Object[] result2_black : FieldNameExistingImpl
				.pattern_FieldNameExisting_12_2_blackFBBFBBBB(pg,
						tContainingClass, tField, tFieldDefinition,
						tFieldSignature, match)) {
			org.emftext.language.java.classifiers.Class jContainingClass = (org.emftext.language.java.classifiers.Class) result2_black[0];
			ClassToTClass tContainingClassToJContainingClass = (ClassToTClass) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : FieldNameExistingImpl
					.pattern_FieldNameExisting_12_3_blackBBBBBBB(
							jContainingClass, pg, tContainingClass,
							tContainingClassToJContainingClass, tField,
							tFieldDefinition, tFieldSignature)) {
				Object[] result3_green = FieldNameExistingImpl
						.pattern_FieldNameExisting_12_3_greenBBBBBBBFFFFFFFFFFF(
								jContainingClass, pg, tContainingClass,
								tContainingClassToJContainingClass, tField,
								tFieldDefinition, tFieldSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge pg__tContainingClass____classes = (EMoflonEdge) result3_green[8];
				// EMoflonEdge pg__tField____fields = (EMoflonEdge) result3_green[9];
				// EMoflonEdge tContainingClass__tFieldDefinition____defines = (EMoflonEdge) result3_green[10];
				// EMoflonEdge tContainingClass__tFieldSignature____signature = (EMoflonEdge) result3_green[11];
				// EMoflonEdge tContainingClassToJContainingClass__tContainingClass____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge tContainingClassToJContainingClass__jContainingClass____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge tFieldSignature__tFieldDefinition____definitions = (EMoflonEdge) result3_green[14];
				// EMoflonEdge tFieldDefinition__tFieldSignature____signature = (EMoflonEdge) result3_green[15];
				// EMoflonEdge tFieldSignature__tField____field = (EMoflonEdge) result3_green[16];
				// EMoflonEdge tField__tFieldSignature____signatures = (EMoflonEdge) result3_green[17];

				// solve CSP
				Object[] result4_bindingAndBlack = FieldNameExistingImpl
						.pattern_FieldNameExisting_12_4_bindingAndBlackFBBBBBBBBB(
								this, isApplicableMatch, jContainingClass, pg,
								tContainingClass,
								tContainingClassToJContainingClass, tField,
								tFieldDefinition, tFieldSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (FieldNameExistingImpl
						.pattern_FieldNameExisting_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = FieldNameExistingImpl
							.pattern_FieldNameExisting_12_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					FieldNameExistingImpl
							.pattern_FieldNameExisting_12_6_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return FieldNameExistingImpl
				.pattern_FieldNameExisting_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TypeGraph pg,
			TClass tContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		match.registerObject("pg", pg);
		match.registerObject("tContainingClass", tContainingClass);
		match.registerObject("tField", tField);
		match.registerObject("tFieldDefinition", tFieldDefinition);
		match.registerObject("tFieldSignature", tFieldSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph pg,
			TClass tContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {// Create CSP
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
			org.emftext.language.java.classifiers.Class jContainingClass,
			TypeGraph pg, TClass tContainingClass,
			ClassToTClass tContainingClassToJContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {// Create CSP
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
		isApplicableMatch.registerObject("jContainingClass", jContainingClass);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("tContainingClass", tContainingClass);
		isApplicableMatch.registerObject("tContainingClassToJContainingClass",
				tContainingClassToJContainingClass);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("tFieldDefinition", tFieldDefinition);
		isApplicableMatch.registerObject("tFieldSignature", tFieldSignature);
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
			EObject jContainingClass, EObject jField, EObject jFieldToTField,
			EObject jFieldToTFieldDefinition, EObject pg,
			EObject tContainingClass,
			EObject tContainingClassToJContainingClass, EObject tField,
			EObject tFieldDefinition, EObject tFieldSignature,
			EObject tFieldSignatureToJField) {
		ruleresult.registerObject("jContainingClass", jContainingClass);
		ruleresult.registerObject("jField", jField);
		ruleresult.registerObject("jFieldToTField", jFieldToTField);
		ruleresult.registerObject("jFieldToTFieldDefinition",
				jFieldToTFieldDefinition);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("tContainingClass", tContainingClass);
		ruleresult.registerObject("tContainingClassToJContainingClass",
				tContainingClassToJContainingClass);
		ruleresult.registerObject("tField", tField);
		ruleresult.registerObject("tFieldDefinition", tFieldDefinition);
		ruleresult.registerObject("tFieldSignature", tFieldSignature);
		ruleresult.registerObject("tFieldSignatureToJField",
				tFieldSignatureToJField);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& match.getObject("tFieldDefinition")
						.eClass()
						.equals(TypeGraphBasic.TypeGraphBasicPackage.eINSTANCE
								.getTFieldDefinition())
				&& match.getObject("tFieldSignature")
						.eClass()
						.equals(TypeGraphBasic.TypeGraphBasicPackage.eINSTANCE
								.getTFieldSignature());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_4(
			EMoflonEdge _edge_members) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameExistingImpl
				.pattern_FieldNameExisting_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameExistingImpl
				.pattern_FieldNameExisting_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldNameExistingImpl
				.pattern_FieldNameExisting_20_2_blackFFB(_edge_members)) {
			org.emftext.language.java.classifiers.Class jContainingClass = (org.emftext.language.java.classifiers.Class) result2_black[0];
			Field jField = (Field) result2_black[1];
			Object[] result2_green = FieldNameExistingImpl
					.pattern_FieldNameExisting_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldNameExistingImpl
					.pattern_FieldNameExisting_20_3_expressionFBBBB(this,
							match, jContainingClass, jField)) {
				// Ensure that the correct types of elements are matched
				if (FieldNameExistingImpl
						.pattern_FieldNameExisting_20_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = FieldNameExistingImpl
							.pattern_FieldNameExisting_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					FieldNameExistingImpl
							.pattern_FieldNameExisting_20_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return FieldNameExistingImpl
				.pattern_FieldNameExisting_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_5(
			EMoflonEdge _edge_defines) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameExistingImpl
				.pattern_FieldNameExisting_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameExistingImpl
				.pattern_FieldNameExisting_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldNameExistingImpl
				.pattern_FieldNameExisting_21_2_blackFFFFFB(_edge_defines)) {
			TypeGraph pg = (TypeGraph) result2_black[0];
			TClass tContainingClass = (TClass) result2_black[1];
			TField tField = (TField) result2_black[2];
			TFieldDefinition tFieldDefinition = (TFieldDefinition) result2_black[3];
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[4];
			Object[] result2_green = FieldNameExistingImpl
					.pattern_FieldNameExisting_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldNameExistingImpl
					.pattern_FieldNameExisting_21_3_expressionFBBBBBBB(this,
							match, pg, tContainingClass, tField,
							tFieldDefinition, tFieldSignature)) {
				// Ensure that the correct types of elements are matched
				if (FieldNameExistingImpl
						.pattern_FieldNameExisting_21_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = FieldNameExistingImpl
							.pattern_FieldNameExisting_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					FieldNameExistingImpl
							.pattern_FieldNameExisting_21_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return FieldNameExistingImpl
				.pattern_FieldNameExisting_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_6(
			EMoflonEdge _edge_signature) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameExistingImpl
				.pattern_FieldNameExisting_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameExistingImpl
				.pattern_FieldNameExisting_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldNameExistingImpl
				.pattern_FieldNameExisting_22_2_blackFFFFFB(_edge_signature)) {
			TypeGraph pg = (TypeGraph) result2_black[0];
			TClass tContainingClass = (TClass) result2_black[1];
			TField tField = (TField) result2_black[2];
			TFieldDefinition tFieldDefinition = (TFieldDefinition) result2_black[3];
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[4];
			Object[] result2_green = FieldNameExistingImpl
					.pattern_FieldNameExisting_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldNameExistingImpl
					.pattern_FieldNameExisting_22_3_expressionFBBBBBBB(this,
							match, pg, tContainingClass, tField,
							tFieldDefinition, tFieldSignature)) {
				// Ensure that the correct types of elements are matched
				if (FieldNameExistingImpl
						.pattern_FieldNameExisting_22_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = FieldNameExistingImpl
							.pattern_FieldNameExisting_22_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					FieldNameExistingImpl
							.pattern_FieldNameExisting_22_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return FieldNameExistingImpl
				.pattern_FieldNameExisting_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_7(
			EMoflonEdge _edge_definitions) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameExistingImpl
				.pattern_FieldNameExisting_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameExistingImpl
				.pattern_FieldNameExisting_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldNameExistingImpl
				.pattern_FieldNameExisting_23_2_blackFFFFFB(_edge_definitions)) {
			TypeGraph pg = (TypeGraph) result2_black[0];
			TClass tContainingClass = (TClass) result2_black[1];
			TField tField = (TField) result2_black[2];
			TFieldDefinition tFieldDefinition = (TFieldDefinition) result2_black[3];
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[4];
			Object[] result2_green = FieldNameExistingImpl
					.pattern_FieldNameExisting_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldNameExistingImpl
					.pattern_FieldNameExisting_23_3_expressionFBBBBBBB(this,
							match, pg, tContainingClass, tField,
							tFieldDefinition, tFieldSignature)) {
				// Ensure that the correct types of elements are matched
				if (FieldNameExistingImpl
						.pattern_FieldNameExisting_23_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = FieldNameExistingImpl
							.pattern_FieldNameExisting_23_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					FieldNameExistingImpl
							.pattern_FieldNameExisting_23_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return FieldNameExistingImpl
				.pattern_FieldNameExisting_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_8(
			EMoflonEdge _edge_signature) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameExistingImpl
				.pattern_FieldNameExisting_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameExistingImpl
				.pattern_FieldNameExisting_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldNameExistingImpl
				.pattern_FieldNameExisting_24_2_blackFFFFFB(_edge_signature)) {
			TypeGraph pg = (TypeGraph) result2_black[0];
			TClass tContainingClass = (TClass) result2_black[1];
			TField tField = (TField) result2_black[2];
			TFieldDefinition tFieldDefinition = (TFieldDefinition) result2_black[3];
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[4];
			Object[] result2_green = FieldNameExistingImpl
					.pattern_FieldNameExisting_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldNameExistingImpl
					.pattern_FieldNameExisting_24_3_expressionFBBBBBBB(this,
							match, pg, tContainingClass, tField,
							tFieldDefinition, tFieldSignature)) {
				// Ensure that the correct types of elements are matched
				if (FieldNameExistingImpl
						.pattern_FieldNameExisting_24_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = FieldNameExistingImpl
							.pattern_FieldNameExisting_24_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					FieldNameExistingImpl
							.pattern_FieldNameExisting_24_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return FieldNameExistingImpl
				.pattern_FieldNameExisting_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_9(
			EMoflonEdge _edge_field) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameExistingImpl
				.pattern_FieldNameExisting_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameExistingImpl
				.pattern_FieldNameExisting_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldNameExistingImpl
				.pattern_FieldNameExisting_25_2_blackFFFFFB(_edge_field)) {
			TypeGraph pg = (TypeGraph) result2_black[0];
			TClass tContainingClass = (TClass) result2_black[1];
			TField tField = (TField) result2_black[2];
			TFieldDefinition tFieldDefinition = (TFieldDefinition) result2_black[3];
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[4];
			Object[] result2_green = FieldNameExistingImpl
					.pattern_FieldNameExisting_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldNameExistingImpl
					.pattern_FieldNameExisting_25_3_expressionFBBBBBBB(this,
							match, pg, tContainingClass, tField,
							tFieldDefinition, tFieldSignature)) {
				// Ensure that the correct types of elements are matched
				if (FieldNameExistingImpl
						.pattern_FieldNameExisting_25_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = FieldNameExistingImpl
							.pattern_FieldNameExisting_25_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					FieldNameExistingImpl
							.pattern_FieldNameExisting_25_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return FieldNameExistingImpl
				.pattern_FieldNameExisting_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_10(
			EMoflonEdge _edge_signatures) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameExistingImpl
				.pattern_FieldNameExisting_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameExistingImpl
				.pattern_FieldNameExisting_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldNameExistingImpl
				.pattern_FieldNameExisting_26_2_blackFFFFFB(_edge_signatures)) {
			TypeGraph pg = (TypeGraph) result2_black[0];
			TClass tContainingClass = (TClass) result2_black[1];
			TField tField = (TField) result2_black[2];
			TFieldDefinition tFieldDefinition = (TFieldDefinition) result2_black[3];
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[4];
			Object[] result2_green = FieldNameExistingImpl
					.pattern_FieldNameExisting_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldNameExistingImpl
					.pattern_FieldNameExisting_26_3_expressionFBBBBBBB(this,
							match, pg, tContainingClass, tField,
							tFieldDefinition, tFieldSignature)) {
				// Ensure that the correct types of elements are matched
				if (FieldNameExistingImpl
						.pattern_FieldNameExisting_26_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = FieldNameExistingImpl
							.pattern_FieldNameExisting_26_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					FieldNameExistingImpl
							.pattern_FieldNameExisting_26_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return FieldNameExistingImpl
				.pattern_FieldNameExisting_26_6_expressionFB(__result);
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
		case RulesPackage.FIELD_NAME_EXISTING___IS_APPROPRIATE_FWD__MATCH_CLASS_FIELD:
			return isAppropriate_FWD((Match) arguments.get(0),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(1), (Field) arguments.get(2));
		case RulesPackage.FIELD_NAME_EXISTING___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_NAME_EXISTING___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_NAME_EXISTING___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASS_FIELD:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(1), (Field) arguments.get(2));
			return null;
		case RulesPackage.FIELD_NAME_EXISTING___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASS_FIELD:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(1), (Field) arguments.get(2));
		case RulesPackage.FIELD_NAME_EXISTING___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_NAME_EXISTING___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASS_FIELD_TYPEGRAPH_TCLASS_CLASSTOTCLASS_TFIELD:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(1), (Field) arguments.get(2),
					(TypeGraph) arguments.get(3), (TClass) arguments.get(4),
					(ClassToTClass) arguments.get(5), (TField) arguments.get(6));
		case RulesPackage.FIELD_NAME_EXISTING___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_NAME_EXISTING___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.FIELD_NAME_EXISTING___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_NAME_EXISTING___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TCLASS_TFIELD_TFIELDDEFINITION_TFIELDSIGNATURE:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TypeGraph) arguments.get(1), (TClass) arguments.get(2),
					(TField) arguments.get(3),
					(TFieldDefinition) arguments.get(4),
					(TFieldSignature) arguments.get(5));
		case RulesPackage.FIELD_NAME_EXISTING___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_NAME_EXISTING___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_NAME_EXISTING___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TCLASS_TFIELD_TFIELDDEFINITION_TFIELDSIGNATURE:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TypeGraph) arguments.get(1), (TClass) arguments.get(2),
					(TField) arguments.get(3),
					(TFieldDefinition) arguments.get(4),
					(TFieldSignature) arguments.get(5));
			return null;
		case RulesPackage.FIELD_NAME_EXISTING___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TCLASS_TFIELD_TFIELDDEFINITION_TFIELDSIGNATURE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TypeGraph) arguments.get(1), (TClass) arguments.get(2),
					(TField) arguments.get(3),
					(TFieldDefinition) arguments.get(4),
					(TFieldSignature) arguments.get(5));
		case RulesPackage.FIELD_NAME_EXISTING___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_NAME_EXISTING___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASS_TYPEGRAPH_TCLASS_CLASSTOTCLASS_TFIELD_TFIELDDEFINITION_TFIELDSIGNATURE:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(org.emftext.language.java.classifiers.Class) arguments
							.get(1), (TypeGraph) arguments.get(2),
					(TClass) arguments.get(3),
					(ClassToTClass) arguments.get(4),
					(TField) arguments.get(5),
					(TFieldDefinition) arguments.get(6),
					(TFieldSignature) arguments.get(7));
		case RulesPackage.FIELD_NAME_EXISTING___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_NAME_EXISTING___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.FIELD_NAME_EXISTING___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_NAME_EXISTING___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_4((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIELD_NAME_EXISTING___IS_APPROPRIATE_BWD_EMOFLON_EDGE_5__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_5((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIELD_NAME_EXISTING___IS_APPROPRIATE_BWD_EMOFLON_EDGE_6__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_6((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIELD_NAME_EXISTING___IS_APPROPRIATE_BWD_EMOFLON_EDGE_7__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_7((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIELD_NAME_EXISTING___IS_APPROPRIATE_BWD_EMOFLON_EDGE_8__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_8((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIELD_NAME_EXISTING___IS_APPROPRIATE_BWD_EMOFLON_EDGE_9__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_9((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIELD_NAME_EXISTING___IS_APPROPRIATE_BWD_EMOFLON_EDGE_10__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_10((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.FIELD_NAME_EXISTING___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_NAME_EXISTING___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_FieldNameExisting_0_1_blackBBBB(
			FieldNameExisting _this, Match match,
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField) {
		return new Object[] { _this, match, jContainingClass, jField };
	}

	public static final Object[] pattern_FieldNameExisting_0_2_bindingFBBBB(
			FieldNameExisting _this, Match match,
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

	public static final Object[] pattern_FieldNameExisting_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldNameExisting_0_2_bindingAndBlackFBBBB(
			FieldNameExisting _this, Match match,
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField) {
		Object[] result_pattern_FieldNameExisting_0_2_binding = pattern_FieldNameExisting_0_2_bindingFBBBB(
				_this, match, jContainingClass, jField);
		if (result_pattern_FieldNameExisting_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_FieldNameExisting_0_2_binding[0];

			Object[] result_pattern_FieldNameExisting_0_2_black = pattern_FieldNameExisting_0_2_blackB(csp);
			if (result_pattern_FieldNameExisting_0_2_black != null) {

				return new Object[] { csp, _this, match, jContainingClass,
						jField };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldNameExisting_0_3_expressionFBB(
			FieldNameExisting _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_0_4_blackBBB(
			Match match,
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField) {
		return new Object[] { match, jContainingClass, jField };
	}

	public static final Object[] pattern_FieldNameExisting_0_4_greenBBBF(
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

	public static final Object[] pattern_FieldNameExisting_0_5_blackBBB(
			Match match,
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField) {
		return new Object[] { match, jContainingClass, jField };
	}

	public static final Object[] pattern_FieldNameExisting_0_5_greenBB(
			Match match,
			org.emftext.language.java.classifiers.Class jContainingClass) {
		match.getContextNodes().add(jContainingClass);
		return new Object[] { match, jContainingClass };
	}

	public static final void pattern_FieldNameExisting_0_6_expressionBBBB(
			FieldNameExisting _this, Match match,
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField) {
		_this.registerObjectsToMatch_FWD(match, jContainingClass, jField);

	}

	public static final boolean pattern_FieldNameExisting_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldNameExisting_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_1_1_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("jContainingClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("jField");
		EObject _localVariable_2 = isApplicableMatch.getObject("pg");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("tContainingClass");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("tContainingClassToJContainingClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("tField");
		EObject tmpJContainingClass = _localVariable_0;
		EObject tmpJField = _localVariable_1;
		EObject tmpPg = _localVariable_2;
		EObject tmpTContainingClass = _localVariable_3;
		EObject tmpTContainingClassToJContainingClass = _localVariable_4;
		EObject tmpTField = _localVariable_5;
		if (tmpJContainingClass instanceof org.emftext.language.java.classifiers.Class) {
			org.emftext.language.java.classifiers.Class jContainingClass = (org.emftext.language.java.classifiers.Class) tmpJContainingClass;
			if (tmpJField instanceof Field) {
				Field jField = (Field) tmpJField;
				if (tmpPg instanceof TypeGraph) {
					TypeGraph pg = (TypeGraph) tmpPg;
					if (tmpTContainingClass instanceof TClass) {
						TClass tContainingClass = (TClass) tmpTContainingClass;
						if (tmpTContainingClassToJContainingClass instanceof ClassToTClass) {
							ClassToTClass tContainingClassToJContainingClass = (ClassToTClass) tmpTContainingClassToJContainingClass;
							if (tmpTField instanceof TField) {
								TField tField = (TField) tmpTField;
								return new Object[] { jContainingClass, jField,
										pg, tContainingClass,
										tContainingClassToJContainingClass,
										tField, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_1_1_blackBBBBBBFBB(
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField, TypeGraph pg, TClass tContainingClass,
			ClassToTClass tContainingClassToJContainingClass, TField tField,
			FieldNameExisting _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jContainingClass, jField, pg,
						tContainingClass, tContainingClassToJContainingClass,
						tField, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_1_1_bindingAndBlackFFFFFFFBB(
			FieldNameExisting _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldNameExisting_1_1_binding = pattern_FieldNameExisting_1_1_bindingFFFFFFB(isApplicableMatch);
		if (result_pattern_FieldNameExisting_1_1_binding != null) {
			org.emftext.language.java.classifiers.Class jContainingClass = (org.emftext.language.java.classifiers.Class) result_pattern_FieldNameExisting_1_1_binding[0];
			Field jField = (Field) result_pattern_FieldNameExisting_1_1_binding[1];
			TypeGraph pg = (TypeGraph) result_pattern_FieldNameExisting_1_1_binding[2];
			TClass tContainingClass = (TClass) result_pattern_FieldNameExisting_1_1_binding[3];
			ClassToTClass tContainingClassToJContainingClass = (ClassToTClass) result_pattern_FieldNameExisting_1_1_binding[4];
			TField tField = (TField) result_pattern_FieldNameExisting_1_1_binding[5];

			Object[] result_pattern_FieldNameExisting_1_1_black = pattern_FieldNameExisting_1_1_blackBBBBBBFBB(
					jContainingClass, jField, pg, tContainingClass,
					tContainingClassToJContainingClass, tField, _this,
					isApplicableMatch);
			if (result_pattern_FieldNameExisting_1_1_black != null) {
				CSP csp = (CSP) result_pattern_FieldNameExisting_1_1_black[6];

				return new Object[] { jContainingClass, jField, pg,
						tContainingClass, tContainingClassToJContainingClass,
						tField, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_1_1_greenBFFBBFFF(
			Field jField, TClass tContainingClass, TField tField) {
		FieldToTField jFieldToTField = GravityTGGFactory.eINSTANCE
				.createFieldToTField();
		FieldToTFieldDefinition jFieldToTFieldDefinition = GravityTGGFactory.eINSTANCE
				.createFieldToTFieldDefinition();
		TFieldDefinition tFieldDefinition = TypeGraphBasicFactory.eINSTANCE
				.createTFieldDefinition();
		TFieldSignature tFieldSignature = TypeGraphBasicFactory.eINSTANCE
				.createTFieldSignature();
		FieldToTFieldSignature tFieldSignatureToJField = GravityTGGFactory.eINSTANCE
				.createFieldToTFieldSignature();
		jFieldToTField.setTarget(tField);
		jFieldToTField.setSource(jField);
		jFieldToTFieldDefinition.setSource(jField);
		jFieldToTFieldDefinition.setTarget(tFieldDefinition);
		tContainingClass.getDefines().add(tFieldDefinition);
		tContainingClass.getSignature().add(tFieldSignature);
		tFieldSignature.getDefinitions().add(tFieldDefinition);
		tFieldSignature.setField(tField);
		tFieldSignatureToJField.setTarget(tFieldSignature);
		tFieldSignatureToJField.setSource(jField);
		return new Object[] { jField, jFieldToTField, jFieldToTFieldDefinition,
				tContainingClass, tField, tFieldDefinition, tFieldSignature,
				tFieldSignatureToJField };
	}

	public static final Object[] pattern_FieldNameExisting_1_2_blackBBBBBB(
			Field jField, FieldToTField jFieldToTField,
			FieldToTFieldDefinition jFieldToTFieldDefinition,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature,
			FieldToTFieldSignature tFieldSignatureToJField) {
		return new Object[] { jField, jFieldToTField, jFieldToTFieldDefinition,
				tFieldDefinition, tFieldSignature, tFieldSignatureToJField };
	}

	public static final Object[] pattern_FieldNameExisting_1_2_greenFBBBBBB(
			Field jField, FieldToTField jFieldToTField,
			FieldToTFieldDefinition jFieldToTFieldDefinition,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature,
			FieldToTFieldSignature tFieldSignatureToJField) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(jField);
		ruleresult.getCreatedLinkElements().add(jFieldToTField);
		ruleresult.getCreatedLinkElements().add(jFieldToTFieldDefinition);
		ruleresult.getCreatedElements().add(tFieldDefinition);
		ruleresult.getCreatedElements().add(tFieldSignature);
		ruleresult.getCreatedLinkElements().add(tFieldSignatureToJField);
		return new Object[] { ruleresult, jField, jFieldToTField,
				jFieldToTFieldDefinition, tFieldDefinition, tFieldSignature,
				tFieldSignatureToJField };
	}

	public static final Object[] pattern_FieldNameExisting_1_3_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject jContainingClass,
			EObject jField, EObject jFieldToTField,
			EObject jFieldToTFieldDefinition, EObject pg,
			EObject tContainingClass,
			EObject tContainingClassToJContainingClass, EObject tField,
			EObject tFieldDefinition, EObject tFieldSignature,
			EObject tFieldSignatureToJField) {
		if (!jContainingClass.equals(jField)) {
			if (!jContainingClass.equals(jFieldToTField)) {
				if (!jContainingClass.equals(jFieldToTFieldDefinition)) {
					if (!jContainingClass.equals(pg)) {
						if (!jContainingClass.equals(tContainingClass)) {
							if (!jContainingClass
									.equals(tContainingClassToJContainingClass)) {
								if (!jContainingClass.equals(tField)) {
									if (!jContainingClass
											.equals(tFieldDefinition)) {
										if (!jContainingClass
												.equals(tFieldSignature)) {
											if (!jContainingClass
													.equals(tFieldSignatureToJField)) {
												if (!jField
														.equals(jFieldToTField)) {
													if (!jField
															.equals(jFieldToTFieldDefinition)) {
														if (!jField.equals(pg)) {
															if (!jField
																	.equals(tContainingClass)) {
																if (!jField
																		.equals(tContainingClassToJContainingClass)) {
																	if (!jField
																			.equals(tField)) {
																		if (!jField
																				.equals(tFieldDefinition)) {
																			if (!jField
																					.equals(tFieldSignature)) {
																				if (!jField
																						.equals(tFieldSignatureToJField)) {
																					if (!jFieldToTField
																							.equals(jFieldToTFieldDefinition)) {
																						if (!jFieldToTField
																								.equals(pg)) {
																							if (!jFieldToTField
																									.equals(tContainingClass)) {
																								if (!jFieldToTField
																										.equals(tContainingClassToJContainingClass)) {
																									if (!jFieldToTField
																											.equals(tField)) {
																										if (!jFieldToTField
																												.equals(tFieldDefinition)) {
																											if (!jFieldToTField
																													.equals(tFieldSignature)) {
																												if (!jFieldToTField
																														.equals(tFieldSignatureToJField)) {
																													if (!jFieldToTFieldDefinition
																															.equals(pg)) {
																														if (!jFieldToTFieldDefinition
																																.equals(tContainingClass)) {
																															if (!jFieldToTFieldDefinition
																																	.equals(tContainingClassToJContainingClass)) {
																																if (!jFieldToTFieldDefinition
																																		.equals(tField)) {
																																	if (!jFieldToTFieldDefinition
																																			.equals(tFieldDefinition)) {
																																		if (!jFieldToTFieldDefinition
																																				.equals(tFieldSignature)) {
																																			if (!jFieldToTFieldDefinition
																																					.equals(tFieldSignatureToJField)) {
																																				if (!pg.equals(tContainingClass)) {
																																					if (!pg.equals(tContainingClassToJContainingClass)) {
																																						if (!pg.equals(tField)) {
																																							if (!pg.equals(tFieldDefinition)) {
																																								if (!pg.equals(tFieldSignature)) {
																																									if (!pg.equals(tFieldSignatureToJField)) {
																																										if (!tContainingClass
																																												.equals(tContainingClassToJContainingClass)) {
																																											if (!tContainingClass
																																													.equals(tField)) {
																																												if (!tContainingClass
																																														.equals(tFieldDefinition)) {
																																													if (!tContainingClass
																																															.equals(tFieldSignature)) {
																																														if (!tContainingClass
																																																.equals(tFieldSignatureToJField)) {
																																															if (!tContainingClassToJContainingClass
																																																	.equals(tField)) {
																																																if (!tContainingClassToJContainingClass
																																																		.equals(tFieldDefinition)) {
																																																	if (!tContainingClassToJContainingClass
																																																			.equals(tFieldSignature)) {
																																																		if (!tContainingClassToJContainingClass
																																																				.equals(tFieldSignatureToJField)) {
																																																			if (!tField
																																																					.equals(tFieldDefinition)) {
																																																				if (!tField
																																																						.equals(tFieldSignature)) {
																																																					if (!tField
																																																							.equals(tFieldSignatureToJField)) {
																																																						if (!tFieldDefinition
																																																								.equals(tFieldSignature)) {
																																																							if (!tFieldDefinition
																																																									.equals(tFieldSignatureToJField)) {
																																																								if (!tFieldSignature
																																																										.equals(tFieldSignatureToJField)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											jContainingClass,
																																																											jField,
																																																											jFieldToTField,
																																																											jFieldToTFieldDefinition,
																																																											pg,
																																																											tContainingClass,
																																																											tContainingClassToJContainingClass,
																																																											tField,
																																																											tFieldDefinition,
																																																											tFieldSignature,
																																																											tFieldSignatureToJField };
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

	public static final Object[] pattern_FieldNameExisting_1_3_greenBBBBBBBBBBFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject jContainingClass,
			EObject jField, EObject jFieldToTField,
			EObject jFieldToTFieldDefinition, EObject tContainingClass,
			EObject tField, EObject tFieldDefinition, EObject tFieldSignature,
			EObject tFieldSignatureToJField) {
		EMoflonEdge jContainingClass__jField____members = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jFieldToTField__tField____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jFieldToTField__jField____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jFieldToTFieldDefinition__tFieldDefinition____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jFieldToTFieldDefinition__jField____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tContainingClass__tFieldDefinition____defines = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tContainingClass__tFieldSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldSignature__tFieldDefinition____definitions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldDefinition__tFieldSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldSignature__tField____field = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tField__tFieldSignature____signatures = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldSignatureToJField__tFieldSignature____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldSignatureToJField__jField____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldNameExisting";
		String jContainingClass__jField____members_name_prime = "members";
		String jFieldToTField__tField____target_name_prime = "target";
		String jFieldToTField__jField____source_name_prime = "source";
		String jFieldToTFieldDefinition__tFieldDefinition____target_name_prime = "target";
		String jFieldToTFieldDefinition__jField____source_name_prime = "source";
		String tContainingClass__tFieldDefinition____defines_name_prime = "defines";
		String tContainingClass__tFieldSignature____signature_name_prime = "signature";
		String tFieldSignature__tFieldDefinition____definitions_name_prime = "definitions";
		String tFieldDefinition__tFieldSignature____signature_name_prime = "signature";
		String tFieldSignature__tField____field_name_prime = "field";
		String tField__tFieldSignature____signatures_name_prime = "signatures";
		String tFieldSignatureToJField__tFieldSignature____target_name_prime = "target";
		String tFieldSignatureToJField__jField____source_name_prime = "source";
		jContainingClass__jField____members.setSrc(jContainingClass);
		jContainingClass__jField____members.setTrg(jField);
		ruleresult.getTranslatedEdges()
				.add(jContainingClass__jField____members);
		jFieldToTField__tField____target.setSrc(jFieldToTField);
		jFieldToTField__tField____target.setTrg(tField);
		ruleresult.getCreatedEdges().add(jFieldToTField__tField____target);
		jFieldToTField__jField____source.setSrc(jFieldToTField);
		jFieldToTField__jField____source.setTrg(jField);
		ruleresult.getCreatedEdges().add(jFieldToTField__jField____source);
		jFieldToTFieldDefinition__tFieldDefinition____target
				.setSrc(jFieldToTFieldDefinition);
		jFieldToTFieldDefinition__tFieldDefinition____target
				.setTrg(tFieldDefinition);
		ruleresult.getCreatedEdges().add(
				jFieldToTFieldDefinition__tFieldDefinition____target);
		jFieldToTFieldDefinition__jField____source
				.setSrc(jFieldToTFieldDefinition);
		jFieldToTFieldDefinition__jField____source.setTrg(jField);
		ruleresult.getCreatedEdges().add(
				jFieldToTFieldDefinition__jField____source);
		tContainingClass__tFieldDefinition____defines.setSrc(tContainingClass);
		tContainingClass__tFieldDefinition____defines.setTrg(tFieldDefinition);
		ruleresult.getCreatedEdges().add(
				tContainingClass__tFieldDefinition____defines);
		tContainingClass__tFieldSignature____signature.setSrc(tContainingClass);
		tContainingClass__tFieldSignature____signature.setTrg(tFieldSignature);
		ruleresult.getCreatedEdges().add(
				tContainingClass__tFieldSignature____signature);
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
		tFieldSignature__tField____field.setSrc(tFieldSignature);
		tFieldSignature__tField____field.setTrg(tField);
		ruleresult.getCreatedEdges().add(tFieldSignature__tField____field);
		tField__tFieldSignature____signatures.setSrc(tField);
		tField__tFieldSignature____signatures.setTrg(tFieldSignature);
		ruleresult.getCreatedEdges().add(tField__tFieldSignature____signatures);
		tFieldSignatureToJField__tFieldSignature____target
				.setSrc(tFieldSignatureToJField);
		tFieldSignatureToJField__tFieldSignature____target
				.setTrg(tFieldSignature);
		ruleresult.getCreatedEdges().add(
				tFieldSignatureToJField__tFieldSignature____target);
		tFieldSignatureToJField__jField____source
				.setSrc(tFieldSignatureToJField);
		tFieldSignatureToJField__jField____source.setTrg(jField);
		ruleresult.getCreatedEdges().add(
				tFieldSignatureToJField__jField____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jContainingClass__jField____members
				.setName(jContainingClass__jField____members_name_prime);
		jFieldToTField__tField____target
				.setName(jFieldToTField__tField____target_name_prime);
		jFieldToTField__jField____source
				.setName(jFieldToTField__jField____source_name_prime);
		jFieldToTFieldDefinition__tFieldDefinition____target
				.setName(jFieldToTFieldDefinition__tFieldDefinition____target_name_prime);
		jFieldToTFieldDefinition__jField____source
				.setName(jFieldToTFieldDefinition__jField____source_name_prime);
		tContainingClass__tFieldDefinition____defines
				.setName(tContainingClass__tFieldDefinition____defines_name_prime);
		tContainingClass__tFieldSignature____signature
				.setName(tContainingClass__tFieldSignature____signature_name_prime);
		tFieldSignature__tFieldDefinition____definitions
				.setName(tFieldSignature__tFieldDefinition____definitions_name_prime);
		tFieldDefinition__tFieldSignature____signature
				.setName(tFieldDefinition__tFieldSignature____signature_name_prime);
		tFieldSignature__tField____field
				.setName(tFieldSignature__tField____field_name_prime);
		tField__tFieldSignature____signatures
				.setName(tField__tFieldSignature____signatures_name_prime);
		tFieldSignatureToJField__tFieldSignature____target
				.setName(tFieldSignatureToJField__tFieldSignature____target_name_prime);
		tFieldSignatureToJField__jField____source
				.setName(tFieldSignatureToJField__jField____source_name_prime);
		return new Object[] { ruleresult, jContainingClass, jField,
				jFieldToTField, jFieldToTFieldDefinition, tContainingClass,
				tField, tFieldDefinition, tFieldSignature,
				tFieldSignatureToJField, jContainingClass__jField____members,
				jFieldToTField__tField____target,
				jFieldToTField__jField____source,
				jFieldToTFieldDefinition__tFieldDefinition____target,
				jFieldToTFieldDefinition__jField____source,
				tContainingClass__tFieldDefinition____defines,
				tContainingClass__tFieldSignature____signature,
				tFieldSignature__tFieldDefinition____definitions,
				tFieldDefinition__tFieldSignature____signature,
				tFieldSignature__tField____field,
				tField__tFieldSignature____signatures,
				tFieldSignatureToJField__tFieldSignature____target,
				tFieldSignatureToJField__jField____source };
	}

	public static final void pattern_FieldNameExisting_1_5_expressionBBBBBBBBBBBBB(
			FieldNameExisting _this, PerformRuleResult ruleresult,
			EObject jContainingClass, EObject jField, EObject jFieldToTField,
			EObject jFieldToTFieldDefinition, EObject pg,
			EObject tContainingClass,
			EObject tContainingClassToJContainingClass, EObject tField,
			EObject tFieldDefinition, EObject tFieldSignature,
			EObject tFieldSignatureToJField) {
		_this.registerObjects_FWD(ruleresult, jContainingClass, jField,
				jFieldToTField, jFieldToTFieldDefinition, pg, tContainingClass,
				tContainingClassToJContainingClass, tField, tFieldDefinition,
				tFieldSignature, tFieldSignatureToJField);

	}

	public static final PerformRuleResult pattern_FieldNameExisting_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_2_1_bindingFB(
			FieldNameExisting _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_2_1_blackFBB(
			EClass eClass, FieldNameExisting _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_2_1_bindingAndBlackFFB(
			FieldNameExisting _this) {
		Object[] result_pattern_FieldNameExisting_2_1_binding = pattern_FieldNameExisting_2_1_bindingFB(_this);
		if (result_pattern_FieldNameExisting_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldNameExisting_2_1_binding[0];

			Object[] result_pattern_FieldNameExisting_2_1_black = pattern_FieldNameExisting_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_FieldNameExisting_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldNameExisting_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "FieldNameExisting";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldNameExisting_2_2_bindingFFB(
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

	public static final Iterable<Object[]> pattern_FieldNameExisting_2_2_blackBBFFB(
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ClassToTClass tContainingClassToJContainingClass : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(jContainingClass,
						ClassToTClass.class, "source")) {
			TClass tContainingClass = tContainingClassToJContainingClass
					.getTarget();
			if (tContainingClass != null) {
				_result.add(new Object[] { jContainingClass, jField,
						tContainingClass, tContainingClassToJContainingClass,
						match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldNameExisting_2_3_blackBBFBBF(
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField, TClass tContainingClass,
			ClassToTClass tContainingClassToJContainingClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (jContainingClass.getMembers().contains(jField)) {
			if (tContainingClass.equals(tContainingClassToJContainingClass
					.getTarget())) {
				if (jContainingClass.equals(tContainingClassToJContainingClass
						.getSource())) {
					for (TypeGraph pg : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tContainingClass,
									TypeGraph.class, "classes")) {
						for (TField tField : pg.getFields()) {
							_result.add(new Object[] { jContainingClass,
									jField, pg, tContainingClass,
									tContainingClassToJContainingClass, tField });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_2_3_greenBBBBBBFFFFFF(
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField, TypeGraph pg, TClass tContainingClass,
			ClassToTClass tContainingClassToJContainingClass, TField tField) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge jContainingClass__jField____members = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tContainingClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tField____fields = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tContainingClassToJContainingClass__tContainingClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tContainingClassToJContainingClass__jContainingClass____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jContainingClass__jField____members_name_prime = "members";
		String pg__tContainingClass____classes_name_prime = "classes";
		String pg__tField____fields_name_prime = "fields";
		String tContainingClassToJContainingClass__tContainingClass____target_name_prime = "target";
		String tContainingClassToJContainingClass__jContainingClass____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(jContainingClass);
		isApplicableMatch.getAllContextElements().add(jField);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(tContainingClass);
		isApplicableMatch.getAllContextElements().add(
				tContainingClassToJContainingClass);
		isApplicableMatch.getAllContextElements().add(tField);
		jContainingClass__jField____members.setSrc(jContainingClass);
		jContainingClass__jField____members.setTrg(jField);
		isApplicableMatch.getAllContextElements().add(
				jContainingClass__jField____members);
		pg__tContainingClass____classes.setSrc(pg);
		pg__tContainingClass____classes.setTrg(tContainingClass);
		isApplicableMatch.getAllContextElements().add(
				pg__tContainingClass____classes);
		pg__tField____fields.setSrc(pg);
		pg__tField____fields.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(pg__tField____fields);
		tContainingClassToJContainingClass__tContainingClass____target
				.setSrc(tContainingClassToJContainingClass);
		tContainingClassToJContainingClass__tContainingClass____target
				.setTrg(tContainingClass);
		isApplicableMatch.getAllContextElements().add(
				tContainingClassToJContainingClass__tContainingClass____target);
		tContainingClassToJContainingClass__jContainingClass____source
				.setSrc(tContainingClassToJContainingClass);
		tContainingClassToJContainingClass__jContainingClass____source
				.setTrg(jContainingClass);
		isApplicableMatch.getAllContextElements().add(
				tContainingClassToJContainingClass__jContainingClass____source);
		jContainingClass__jField____members
				.setName(jContainingClass__jField____members_name_prime);
		pg__tContainingClass____classes
				.setName(pg__tContainingClass____classes_name_prime);
		pg__tField____fields.setName(pg__tField____fields_name_prime);
		tContainingClassToJContainingClass__tContainingClass____target
				.setName(tContainingClassToJContainingClass__tContainingClass____target_name_prime);
		tContainingClassToJContainingClass__jContainingClass____source
				.setName(tContainingClassToJContainingClass__jContainingClass____source_name_prime);
		return new Object[] { jContainingClass, jField, pg, tContainingClass,
				tContainingClassToJContainingClass, tField, isApplicableMatch,
				jContainingClass__jField____members,
				pg__tContainingClass____classes, pg__tField____fields,
				tContainingClassToJContainingClass__tContainingClass____target,
				tContainingClassToJContainingClass__jContainingClass____source };
	}

	public static final Object[] pattern_FieldNameExisting_2_4_bindingFBBBBBBBB(
			FieldNameExisting _this, IsApplicableMatch isApplicableMatch,
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField, TypeGraph pg, TClass tContainingClass,
			ClassToTClass tContainingClassToJContainingClass, TField tField) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, jContainingClass, jField, pg,
				tContainingClass, tContainingClassToJContainingClass, tField);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					jContainingClass, jField, pg, tContainingClass,
					tContainingClassToJContainingClass, tField };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldNameExisting_2_4_bindingAndBlackFBBBBBBBB(
			FieldNameExisting _this, IsApplicableMatch isApplicableMatch,
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField, TypeGraph pg, TClass tContainingClass,
			ClassToTClass tContainingClassToJContainingClass, TField tField) {
		Object[] result_pattern_FieldNameExisting_2_4_binding = pattern_FieldNameExisting_2_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, jContainingClass, jField, pg,
				tContainingClass, tContainingClassToJContainingClass, tField);
		if (result_pattern_FieldNameExisting_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_FieldNameExisting_2_4_binding[0];

			Object[] result_pattern_FieldNameExisting_2_4_black = pattern_FieldNameExisting_2_4_blackB(csp);
			if (result_pattern_FieldNameExisting_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						jContainingClass, jField, pg, tContainingClass,
						tContainingClassToJContainingClass, tField };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldNameExisting_2_5_expressionFBB(
			FieldNameExisting _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldNameExisting_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldNameExisting";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldNameExisting_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_10_1_blackBBBBBBB(
			FieldNameExisting _this, Match match, TypeGraph pg,
			TClass tContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		return new Object[] { _this, match, pg, tContainingClass, tField,
				tFieldDefinition, tFieldSignature };
	}

	public static final Object[] pattern_FieldNameExisting_10_2_bindingFBBBBBBB(
			FieldNameExisting _this, Match match, TypeGraph pg,
			TClass tContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, pg,
				tContainingClass, tField, tFieldDefinition, tFieldSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, pg, tContainingClass,
					tField, tFieldDefinition, tFieldSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldNameExisting_10_2_bindingAndBlackFBBBBBBB(
			FieldNameExisting _this, Match match, TypeGraph pg,
			TClass tContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		Object[] result_pattern_FieldNameExisting_10_2_binding = pattern_FieldNameExisting_10_2_bindingFBBBBBBB(
				_this, match, pg, tContainingClass, tField, tFieldDefinition,
				tFieldSignature);
		if (result_pattern_FieldNameExisting_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_FieldNameExisting_10_2_binding[0];

			Object[] result_pattern_FieldNameExisting_10_2_black = pattern_FieldNameExisting_10_2_blackB(csp);
			if (result_pattern_FieldNameExisting_10_2_black != null) {

				return new Object[] { csp, _this, match, pg, tContainingClass,
						tField, tFieldDefinition, tFieldSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldNameExisting_10_3_expressionFBB(
			FieldNameExisting _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_10_4_blackBBBBBB(
			Match match, TypeGraph pg, TClass tContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		return new Object[] { match, pg, tContainingClass, tField,
				tFieldDefinition, tFieldSignature };
	}

	public static final Object[] pattern_FieldNameExisting_10_4_greenBBBBBFFFFFF(
			Match match, TClass tContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		EMoflonEdge tContainingClass__tFieldDefinition____defines = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tContainingClass__tFieldSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldSignature__tFieldDefinition____definitions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldDefinition__tFieldSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldSignature__tField____field = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tField__tFieldSignature____signatures = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tFieldDefinition);
		match.getToBeTranslatedNodes().add(tFieldSignature);
		String tContainingClass__tFieldDefinition____defines_name_prime = "defines";
		String tContainingClass__tFieldSignature____signature_name_prime = "signature";
		String tFieldSignature__tFieldDefinition____definitions_name_prime = "definitions";
		String tFieldDefinition__tFieldSignature____signature_name_prime = "signature";
		String tFieldSignature__tField____field_name_prime = "field";
		String tField__tFieldSignature____signatures_name_prime = "signatures";
		tContainingClass__tFieldDefinition____defines.setSrc(tContainingClass);
		tContainingClass__tFieldDefinition____defines.setTrg(tFieldDefinition);
		match.getToBeTranslatedEdges().add(
				tContainingClass__tFieldDefinition____defines);
		tContainingClass__tFieldSignature____signature.setSrc(tContainingClass);
		tContainingClass__tFieldSignature____signature.setTrg(tFieldSignature);
		match.getToBeTranslatedEdges().add(
				tContainingClass__tFieldSignature____signature);
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
		tFieldSignature__tField____field.setSrc(tFieldSignature);
		tFieldSignature__tField____field.setTrg(tField);
		match.getToBeTranslatedEdges().add(tFieldSignature__tField____field);
		tField__tFieldSignature____signatures.setSrc(tField);
		tField__tFieldSignature____signatures.setTrg(tFieldSignature);
		match.getToBeTranslatedEdges().add(
				tField__tFieldSignature____signatures);
		tContainingClass__tFieldDefinition____defines
				.setName(tContainingClass__tFieldDefinition____defines_name_prime);
		tContainingClass__tFieldSignature____signature
				.setName(tContainingClass__tFieldSignature____signature_name_prime);
		tFieldSignature__tFieldDefinition____definitions
				.setName(tFieldSignature__tFieldDefinition____definitions_name_prime);
		tFieldDefinition__tFieldSignature____signature
				.setName(tFieldDefinition__tFieldSignature____signature_name_prime);
		tFieldSignature__tField____field
				.setName(tFieldSignature__tField____field_name_prime);
		tField__tFieldSignature____signatures
				.setName(tField__tFieldSignature____signatures_name_prime);
		return new Object[] { match, tContainingClass, tField,
				tFieldDefinition, tFieldSignature,
				tContainingClass__tFieldDefinition____defines,
				tContainingClass__tFieldSignature____signature,
				tFieldSignature__tFieldDefinition____definitions,
				tFieldDefinition__tFieldSignature____signature,
				tFieldSignature__tField____field,
				tField__tFieldSignature____signatures };
	}

	public static final Object[] pattern_FieldNameExisting_10_5_blackBBBBBB(
			Match match, TypeGraph pg, TClass tContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		return new Object[] { match, pg, tContainingClass, tField,
				tFieldDefinition, tFieldSignature };
	}

	public static final Object[] pattern_FieldNameExisting_10_5_greenBBBBFF(
			Match match, TypeGraph pg, TClass tContainingClass, TField tField) {
		EMoflonEdge pg__tContainingClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tField____fields = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(pg);
		match.getContextNodes().add(tContainingClass);
		match.getContextNodes().add(tField);
		String pg__tContainingClass____classes_name_prime = "classes";
		String pg__tField____fields_name_prime = "fields";
		pg__tContainingClass____classes.setSrc(pg);
		pg__tContainingClass____classes.setTrg(tContainingClass);
		match.getContextEdges().add(pg__tContainingClass____classes);
		pg__tField____fields.setSrc(pg);
		pg__tField____fields.setTrg(tField);
		match.getContextEdges().add(pg__tField____fields);
		pg__tContainingClass____classes
				.setName(pg__tContainingClass____classes_name_prime);
		pg__tField____fields.setName(pg__tField____fields_name_prime);
		return new Object[] { match, pg, tContainingClass, tField,
				pg__tContainingClass____classes, pg__tField____fields };
	}

	public static final void pattern_FieldNameExisting_10_6_expressionBBBBBBB(
			FieldNameExisting _this, Match match, TypeGraph pg,
			TClass tContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		_this.registerObjectsToMatch_BWD(match, pg, tContainingClass, tField,
				tFieldDefinition, tFieldSignature);

	}

	public static final boolean pattern_FieldNameExisting_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldNameExisting_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_11_1_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch
				.getObject("jContainingClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("pg");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("tContainingClass");
		EObject _localVariable_3 = isApplicableMatch
				.getObject("tContainingClassToJContainingClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("tField");
		EObject _localVariable_5 = isApplicableMatch
				.getObject("tFieldDefinition");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("tFieldSignature");
		EObject tmpJContainingClass = _localVariable_0;
		EObject tmpPg = _localVariable_1;
		EObject tmpTContainingClass = _localVariable_2;
		EObject tmpTContainingClassToJContainingClass = _localVariable_3;
		EObject tmpTField = _localVariable_4;
		EObject tmpTFieldDefinition = _localVariable_5;
		EObject tmpTFieldSignature = _localVariable_6;
		if (tmpJContainingClass instanceof org.emftext.language.java.classifiers.Class) {
			org.emftext.language.java.classifiers.Class jContainingClass = (org.emftext.language.java.classifiers.Class) tmpJContainingClass;
			if (tmpPg instanceof TypeGraph) {
				TypeGraph pg = (TypeGraph) tmpPg;
				if (tmpTContainingClass instanceof TClass) {
					TClass tContainingClass = (TClass) tmpTContainingClass;
					if (tmpTContainingClassToJContainingClass instanceof ClassToTClass) {
						ClassToTClass tContainingClassToJContainingClass = (ClassToTClass) tmpTContainingClassToJContainingClass;
						if (tmpTField instanceof TField) {
							TField tField = (TField) tmpTField;
							if (tmpTFieldDefinition instanceof TFieldDefinition) {
								TFieldDefinition tFieldDefinition = (TFieldDefinition) tmpTFieldDefinition;
								if (tmpTFieldSignature instanceof TFieldSignature) {
									TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
									return new Object[] { jContainingClass, pg,
											tContainingClass,
											tContainingClassToJContainingClass,
											tField, tFieldDefinition,
											tFieldSignature, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_11_1_blackBBBBBBBFBB(
			org.emftext.language.java.classifiers.Class jContainingClass,
			TypeGraph pg, TClass tContainingClass,
			ClassToTClass tContainingClassToJContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature,
			FieldNameExisting _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jContainingClass, pg, tContainingClass,
						tContainingClassToJContainingClass, tField,
						tFieldDefinition, tFieldSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_11_1_bindingAndBlackFFFFFFFFBB(
			FieldNameExisting _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldNameExisting_11_1_binding = pattern_FieldNameExisting_11_1_bindingFFFFFFFB(isApplicableMatch);
		if (result_pattern_FieldNameExisting_11_1_binding != null) {
			org.emftext.language.java.classifiers.Class jContainingClass = (org.emftext.language.java.classifiers.Class) result_pattern_FieldNameExisting_11_1_binding[0];
			TypeGraph pg = (TypeGraph) result_pattern_FieldNameExisting_11_1_binding[1];
			TClass tContainingClass = (TClass) result_pattern_FieldNameExisting_11_1_binding[2];
			ClassToTClass tContainingClassToJContainingClass = (ClassToTClass) result_pattern_FieldNameExisting_11_1_binding[3];
			TField tField = (TField) result_pattern_FieldNameExisting_11_1_binding[4];
			TFieldDefinition tFieldDefinition = (TFieldDefinition) result_pattern_FieldNameExisting_11_1_binding[5];
			TFieldSignature tFieldSignature = (TFieldSignature) result_pattern_FieldNameExisting_11_1_binding[6];

			Object[] result_pattern_FieldNameExisting_11_1_black = pattern_FieldNameExisting_11_1_blackBBBBBBBFBB(
					jContainingClass, pg, tContainingClass,
					tContainingClassToJContainingClass, tField,
					tFieldDefinition, tFieldSignature, _this, isApplicableMatch);
			if (result_pattern_FieldNameExisting_11_1_black != null) {
				CSP csp = (CSP) result_pattern_FieldNameExisting_11_1_black[7];

				return new Object[] { jContainingClass, pg, tContainingClass,
						tContainingClassToJContainingClass, tField,
						tFieldDefinition, tFieldSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_11_1_greenBFFFBBBFB(
			org.emftext.language.java.classifiers.Class jContainingClass,
			TField tField, TFieldDefinition tFieldDefinition,
			TFieldSignature tFieldSignature, CSP csp) {
		Field jField = MembersFactory.eINSTANCE.createField();
		FieldToTField jFieldToTField = GravityTGGFactory.eINSTANCE
				.createFieldToTField();
		FieldToTFieldDefinition jFieldToTFieldDefinition = GravityTGGFactory.eINSTANCE
				.createFieldToTFieldDefinition();
		FieldToTFieldSignature tFieldSignatureToJField = GravityTGGFactory.eINSTANCE
				.createFieldToTFieldSignature();
		Object _localVariable_0 = csp.getValue("jField", "name");
		jContainingClass.getMembers().add(jField);
		jFieldToTField.setTarget(tField);
		jFieldToTField.setSource(jField);
		jFieldToTFieldDefinition.setTarget(tFieldDefinition);
		jFieldToTFieldDefinition.setSource(jField);
		tFieldSignatureToJField.setTarget(tFieldSignature);
		tFieldSignatureToJField.setSource(jField);
		String jField_name_prime = (String) _localVariable_0;
		jField.setName(jField_name_prime);
		return new Object[] { jContainingClass, jField, jFieldToTField,
				jFieldToTFieldDefinition, tField, tFieldDefinition,
				tFieldSignature, tFieldSignatureToJField, csp };
	}

	public static final Object[] pattern_FieldNameExisting_11_2_blackBBBBBB(
			Field jField, FieldToTField jFieldToTField,
			FieldToTFieldDefinition jFieldToTFieldDefinition,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature,
			FieldToTFieldSignature tFieldSignatureToJField) {
		return new Object[] { jField, jFieldToTField, jFieldToTFieldDefinition,
				tFieldDefinition, tFieldSignature, tFieldSignatureToJField };
	}

	public static final Object[] pattern_FieldNameExisting_11_2_greenFBBBBBB(
			Field jField, FieldToTField jFieldToTField,
			FieldToTFieldDefinition jFieldToTFieldDefinition,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature,
			FieldToTFieldSignature tFieldSignatureToJField) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(jField);
		ruleresult.getCreatedLinkElements().add(jFieldToTField);
		ruleresult.getCreatedLinkElements().add(jFieldToTFieldDefinition);
		ruleresult.getTranslatedElements().add(tFieldDefinition);
		ruleresult.getTranslatedElements().add(tFieldSignature);
		ruleresult.getCreatedLinkElements().add(tFieldSignatureToJField);
		return new Object[] { ruleresult, jField, jFieldToTField,
				jFieldToTFieldDefinition, tFieldDefinition, tFieldSignature,
				tFieldSignatureToJField };
	}

	public static final Object[] pattern_FieldNameExisting_11_3_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject jContainingClass,
			EObject jField, EObject jFieldToTField,
			EObject jFieldToTFieldDefinition, EObject pg,
			EObject tContainingClass,
			EObject tContainingClassToJContainingClass, EObject tField,
			EObject tFieldDefinition, EObject tFieldSignature,
			EObject tFieldSignatureToJField) {
		if (!jContainingClass.equals(jField)) {
			if (!jContainingClass.equals(jFieldToTField)) {
				if (!jContainingClass.equals(jFieldToTFieldDefinition)) {
					if (!jContainingClass.equals(pg)) {
						if (!jContainingClass.equals(tContainingClass)) {
							if (!jContainingClass
									.equals(tContainingClassToJContainingClass)) {
								if (!jContainingClass.equals(tField)) {
									if (!jContainingClass
											.equals(tFieldDefinition)) {
										if (!jContainingClass
												.equals(tFieldSignature)) {
											if (!jContainingClass
													.equals(tFieldSignatureToJField)) {
												if (!jField
														.equals(jFieldToTField)) {
													if (!jField
															.equals(jFieldToTFieldDefinition)) {
														if (!jField.equals(pg)) {
															if (!jField
																	.equals(tContainingClass)) {
																if (!jField
																		.equals(tContainingClassToJContainingClass)) {
																	if (!jField
																			.equals(tField)) {
																		if (!jField
																				.equals(tFieldDefinition)) {
																			if (!jField
																					.equals(tFieldSignature)) {
																				if (!jField
																						.equals(tFieldSignatureToJField)) {
																					if (!jFieldToTField
																							.equals(jFieldToTFieldDefinition)) {
																						if (!jFieldToTField
																								.equals(pg)) {
																							if (!jFieldToTField
																									.equals(tContainingClass)) {
																								if (!jFieldToTField
																										.equals(tContainingClassToJContainingClass)) {
																									if (!jFieldToTField
																											.equals(tField)) {
																										if (!jFieldToTField
																												.equals(tFieldDefinition)) {
																											if (!jFieldToTField
																													.equals(tFieldSignature)) {
																												if (!jFieldToTField
																														.equals(tFieldSignatureToJField)) {
																													if (!jFieldToTFieldDefinition
																															.equals(pg)) {
																														if (!jFieldToTFieldDefinition
																																.equals(tContainingClass)) {
																															if (!jFieldToTFieldDefinition
																																	.equals(tContainingClassToJContainingClass)) {
																																if (!jFieldToTFieldDefinition
																																		.equals(tField)) {
																																	if (!jFieldToTFieldDefinition
																																			.equals(tFieldDefinition)) {
																																		if (!jFieldToTFieldDefinition
																																				.equals(tFieldSignature)) {
																																			if (!jFieldToTFieldDefinition
																																					.equals(tFieldSignatureToJField)) {
																																				if (!pg.equals(tContainingClass)) {
																																					if (!pg.equals(tContainingClassToJContainingClass)) {
																																						if (!pg.equals(tField)) {
																																							if (!pg.equals(tFieldDefinition)) {
																																								if (!pg.equals(tFieldSignature)) {
																																									if (!pg.equals(tFieldSignatureToJField)) {
																																										if (!tContainingClass
																																												.equals(tContainingClassToJContainingClass)) {
																																											if (!tContainingClass
																																													.equals(tField)) {
																																												if (!tContainingClass
																																														.equals(tFieldDefinition)) {
																																													if (!tContainingClass
																																															.equals(tFieldSignature)) {
																																														if (!tContainingClass
																																																.equals(tFieldSignatureToJField)) {
																																															if (!tContainingClassToJContainingClass
																																																	.equals(tField)) {
																																																if (!tContainingClassToJContainingClass
																																																		.equals(tFieldDefinition)) {
																																																	if (!tContainingClassToJContainingClass
																																																			.equals(tFieldSignature)) {
																																																		if (!tContainingClassToJContainingClass
																																																				.equals(tFieldSignatureToJField)) {
																																																			if (!tField
																																																					.equals(tFieldDefinition)) {
																																																				if (!tField
																																																						.equals(tFieldSignature)) {
																																																					if (!tField
																																																							.equals(tFieldSignatureToJField)) {
																																																						if (!tFieldDefinition
																																																								.equals(tFieldSignature)) {
																																																							if (!tFieldDefinition
																																																									.equals(tFieldSignatureToJField)) {
																																																								if (!tFieldSignature
																																																										.equals(tFieldSignatureToJField)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											jContainingClass,
																																																											jField,
																																																											jFieldToTField,
																																																											jFieldToTFieldDefinition,
																																																											pg,
																																																											tContainingClass,
																																																											tContainingClassToJContainingClass,
																																																											tField,
																																																											tFieldDefinition,
																																																											tFieldSignature,
																																																											tFieldSignatureToJField };
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

	public static final Object[] pattern_FieldNameExisting_11_3_greenBBBBBBBBBBFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject jContainingClass,
			EObject jField, EObject jFieldToTField,
			EObject jFieldToTFieldDefinition, EObject tContainingClass,
			EObject tField, EObject tFieldDefinition, EObject tFieldSignature,
			EObject tFieldSignatureToJField) {
		EMoflonEdge jContainingClass__jField____members = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jFieldToTField__tField____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jFieldToTField__jField____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jFieldToTFieldDefinition__tFieldDefinition____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jFieldToTFieldDefinition__jField____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tContainingClass__tFieldDefinition____defines = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tContainingClass__tFieldSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldSignature__tFieldDefinition____definitions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldDefinition__tFieldSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldSignature__tField____field = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tField__tFieldSignature____signatures = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldSignatureToJField__tFieldSignature____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldSignatureToJField__jField____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldNameExisting";
		String jContainingClass__jField____members_name_prime = "members";
		String jFieldToTField__tField____target_name_prime = "target";
		String jFieldToTField__jField____source_name_prime = "source";
		String jFieldToTFieldDefinition__tFieldDefinition____target_name_prime = "target";
		String jFieldToTFieldDefinition__jField____source_name_prime = "source";
		String tContainingClass__tFieldDefinition____defines_name_prime = "defines";
		String tContainingClass__tFieldSignature____signature_name_prime = "signature";
		String tFieldSignature__tFieldDefinition____definitions_name_prime = "definitions";
		String tFieldDefinition__tFieldSignature____signature_name_prime = "signature";
		String tFieldSignature__tField____field_name_prime = "field";
		String tField__tFieldSignature____signatures_name_prime = "signatures";
		String tFieldSignatureToJField__tFieldSignature____target_name_prime = "target";
		String tFieldSignatureToJField__jField____source_name_prime = "source";
		jContainingClass__jField____members.setSrc(jContainingClass);
		jContainingClass__jField____members.setTrg(jField);
		ruleresult.getCreatedEdges().add(jContainingClass__jField____members);
		jFieldToTField__tField____target.setSrc(jFieldToTField);
		jFieldToTField__tField____target.setTrg(tField);
		ruleresult.getCreatedEdges().add(jFieldToTField__tField____target);
		jFieldToTField__jField____source.setSrc(jFieldToTField);
		jFieldToTField__jField____source.setTrg(jField);
		ruleresult.getCreatedEdges().add(jFieldToTField__jField____source);
		jFieldToTFieldDefinition__tFieldDefinition____target
				.setSrc(jFieldToTFieldDefinition);
		jFieldToTFieldDefinition__tFieldDefinition____target
				.setTrg(tFieldDefinition);
		ruleresult.getCreatedEdges().add(
				jFieldToTFieldDefinition__tFieldDefinition____target);
		jFieldToTFieldDefinition__jField____source
				.setSrc(jFieldToTFieldDefinition);
		jFieldToTFieldDefinition__jField____source.setTrg(jField);
		ruleresult.getCreatedEdges().add(
				jFieldToTFieldDefinition__jField____source);
		tContainingClass__tFieldDefinition____defines.setSrc(tContainingClass);
		tContainingClass__tFieldDefinition____defines.setTrg(tFieldDefinition);
		ruleresult.getTranslatedEdges().add(
				tContainingClass__tFieldDefinition____defines);
		tContainingClass__tFieldSignature____signature.setSrc(tContainingClass);
		tContainingClass__tFieldSignature____signature.setTrg(tFieldSignature);
		ruleresult.getTranslatedEdges().add(
				tContainingClass__tFieldSignature____signature);
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
		tFieldSignature__tField____field.setSrc(tFieldSignature);
		tFieldSignature__tField____field.setTrg(tField);
		ruleresult.getTranslatedEdges().add(tFieldSignature__tField____field);
		tField__tFieldSignature____signatures.setSrc(tField);
		tField__tFieldSignature____signatures.setTrg(tFieldSignature);
		ruleresult.getTranslatedEdges().add(
				tField__tFieldSignature____signatures);
		tFieldSignatureToJField__tFieldSignature____target
				.setSrc(tFieldSignatureToJField);
		tFieldSignatureToJField__tFieldSignature____target
				.setTrg(tFieldSignature);
		ruleresult.getCreatedEdges().add(
				tFieldSignatureToJField__tFieldSignature____target);
		tFieldSignatureToJField__jField____source
				.setSrc(tFieldSignatureToJField);
		tFieldSignatureToJField__jField____source.setTrg(jField);
		ruleresult.getCreatedEdges().add(
				tFieldSignatureToJField__jField____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jContainingClass__jField____members
				.setName(jContainingClass__jField____members_name_prime);
		jFieldToTField__tField____target
				.setName(jFieldToTField__tField____target_name_prime);
		jFieldToTField__jField____source
				.setName(jFieldToTField__jField____source_name_prime);
		jFieldToTFieldDefinition__tFieldDefinition____target
				.setName(jFieldToTFieldDefinition__tFieldDefinition____target_name_prime);
		jFieldToTFieldDefinition__jField____source
				.setName(jFieldToTFieldDefinition__jField____source_name_prime);
		tContainingClass__tFieldDefinition____defines
				.setName(tContainingClass__tFieldDefinition____defines_name_prime);
		tContainingClass__tFieldSignature____signature
				.setName(tContainingClass__tFieldSignature____signature_name_prime);
		tFieldSignature__tFieldDefinition____definitions
				.setName(tFieldSignature__tFieldDefinition____definitions_name_prime);
		tFieldDefinition__tFieldSignature____signature
				.setName(tFieldDefinition__tFieldSignature____signature_name_prime);
		tFieldSignature__tField____field
				.setName(tFieldSignature__tField____field_name_prime);
		tField__tFieldSignature____signatures
				.setName(tField__tFieldSignature____signatures_name_prime);
		tFieldSignatureToJField__tFieldSignature____target
				.setName(tFieldSignatureToJField__tFieldSignature____target_name_prime);
		tFieldSignatureToJField__jField____source
				.setName(tFieldSignatureToJField__jField____source_name_prime);
		return new Object[] { ruleresult, jContainingClass, jField,
				jFieldToTField, jFieldToTFieldDefinition, tContainingClass,
				tField, tFieldDefinition, tFieldSignature,
				tFieldSignatureToJField, jContainingClass__jField____members,
				jFieldToTField__tField____target,
				jFieldToTField__jField____source,
				jFieldToTFieldDefinition__tFieldDefinition____target,
				jFieldToTFieldDefinition__jField____source,
				tContainingClass__tFieldDefinition____defines,
				tContainingClass__tFieldSignature____signature,
				tFieldSignature__tFieldDefinition____definitions,
				tFieldDefinition__tFieldSignature____signature,
				tFieldSignature__tField____field,
				tField__tFieldSignature____signatures,
				tFieldSignatureToJField__tFieldSignature____target,
				tFieldSignatureToJField__jField____source };
	}

	public static final void pattern_FieldNameExisting_11_5_expressionBBBBBBBBBBBBB(
			FieldNameExisting _this, PerformRuleResult ruleresult,
			EObject jContainingClass, EObject jField, EObject jFieldToTField,
			EObject jFieldToTFieldDefinition, EObject pg,
			EObject tContainingClass,
			EObject tContainingClassToJContainingClass, EObject tField,
			EObject tFieldDefinition, EObject tFieldSignature,
			EObject tFieldSignatureToJField) {
		_this.registerObjects_BWD(ruleresult, jContainingClass, jField,
				jFieldToTField, jFieldToTFieldDefinition, pg, tContainingClass,
				tContainingClassToJContainingClass, tField, tFieldDefinition,
				tFieldSignature, tFieldSignatureToJField);

	}

	public static final PerformRuleResult pattern_FieldNameExisting_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_12_1_bindingFB(
			FieldNameExisting _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_12_1_blackFBB(
			EClass eClass, FieldNameExisting _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_12_1_bindingAndBlackFFB(
			FieldNameExisting _this) {
		Object[] result_pattern_FieldNameExisting_12_1_binding = pattern_FieldNameExisting_12_1_bindingFB(_this);
		if (result_pattern_FieldNameExisting_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldNameExisting_12_1_binding[0];

			Object[] result_pattern_FieldNameExisting_12_1_black = pattern_FieldNameExisting_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_FieldNameExisting_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldNameExisting_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "FieldNameExisting";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldNameExisting_12_2_bindingFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("pg");
		EObject _localVariable_1 = match.getObject("tContainingClass");
		EObject _localVariable_2 = match.getObject("tField");
		EObject _localVariable_3 = match.getObject("tFieldDefinition");
		EObject _localVariable_4 = match.getObject("tFieldSignature");
		EObject tmpPg = _localVariable_0;
		EObject tmpTContainingClass = _localVariable_1;
		EObject tmpTField = _localVariable_2;
		EObject tmpTFieldDefinition = _localVariable_3;
		EObject tmpTFieldSignature = _localVariable_4;
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			if (tmpTContainingClass instanceof TClass) {
				TClass tContainingClass = (TClass) tmpTContainingClass;
				if (tmpTField instanceof TField) {
					TField tField = (TField) tmpTField;
					if (tmpTFieldDefinition instanceof TFieldDefinition) {
						TFieldDefinition tFieldDefinition = (TFieldDefinition) tmpTFieldDefinition;
						if (tmpTFieldSignature instanceof TFieldSignature) {
							TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
							return new Object[] { pg, tContainingClass, tField,
									tFieldDefinition, tFieldSignature, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldNameExisting_12_2_blackFBBFBBBB(
			TypeGraph pg, TClass tContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ClassToTClass tContainingClassToJContainingClass : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tContainingClass,
						ClassToTClass.class, "target")) {
			org.emftext.language.java.classifiers.Class jContainingClass = tContainingClassToJContainingClass
					.getSource();
			if (jContainingClass != null) {
				_result.add(new Object[] { jContainingClass, pg,
						tContainingClass, tContainingClassToJContainingClass,
						tField, tFieldDefinition, tFieldSignature, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldNameExisting_12_3_blackBBBBBBB(
			org.emftext.language.java.classifiers.Class jContainingClass,
			TypeGraph pg, TClass tContainingClass,
			ClassToTClass tContainingClassToJContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pg.getClasses().contains(tContainingClass)) {
			if (pg.getFields().contains(tField)) {
				if (tContainingClass.getDefines().contains(tFieldDefinition)) {
					if (tContainingClass.getSignature().contains(
							tFieldSignature)) {
						if (tContainingClass
								.equals(tContainingClassToJContainingClass
										.getTarget())) {
							if (jContainingClass
									.equals(tContainingClassToJContainingClass
											.getSource())) {
								if (tFieldSignature.getDefinitions().contains(
										tFieldDefinition)) {
									if (tField.equals(tFieldSignature
											.getField())) {
										_result.add(new Object[] {
												jContainingClass,
												pg,
												tContainingClass,
												tContainingClassToJContainingClass,
												tField, tFieldDefinition,
												tFieldSignature });
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

	public static final Object[] pattern_FieldNameExisting_12_3_greenBBBBBBBFFFFFFFFFFF(
			org.emftext.language.java.classifiers.Class jContainingClass,
			TypeGraph pg, TClass tContainingClass,
			ClassToTClass tContainingClassToJContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge pg__tContainingClass____classes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tField____fields = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tContainingClass__tFieldDefinition____defines = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tContainingClass__tFieldSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tContainingClassToJContainingClass__tContainingClass____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tContainingClassToJContainingClass__jContainingClass____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldSignature__tFieldDefinition____definitions = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldDefinition__tFieldSignature____signature = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tFieldSignature__tField____field = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tField__tFieldSignature____signatures = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String pg__tContainingClass____classes_name_prime = "classes";
		String pg__tField____fields_name_prime = "fields";
		String tContainingClass__tFieldDefinition____defines_name_prime = "defines";
		String tContainingClass__tFieldSignature____signature_name_prime = "signature";
		String tContainingClassToJContainingClass__tContainingClass____target_name_prime = "target";
		String tContainingClassToJContainingClass__jContainingClass____source_name_prime = "source";
		String tFieldSignature__tFieldDefinition____definitions_name_prime = "definitions";
		String tFieldDefinition__tFieldSignature____signature_name_prime = "signature";
		String tFieldSignature__tField____field_name_prime = "field";
		String tField__tFieldSignature____signatures_name_prime = "signatures";
		isApplicableMatch.getAllContextElements().add(jContainingClass);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(tContainingClass);
		isApplicableMatch.getAllContextElements().add(
				tContainingClassToJContainingClass);
		isApplicableMatch.getAllContextElements().add(tField);
		isApplicableMatch.getAllContextElements().add(tFieldDefinition);
		isApplicableMatch.getAllContextElements().add(tFieldSignature);
		pg__tContainingClass____classes.setSrc(pg);
		pg__tContainingClass____classes.setTrg(tContainingClass);
		isApplicableMatch.getAllContextElements().add(
				pg__tContainingClass____classes);
		pg__tField____fields.setSrc(pg);
		pg__tField____fields.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(pg__tField____fields);
		tContainingClass__tFieldDefinition____defines.setSrc(tContainingClass);
		tContainingClass__tFieldDefinition____defines.setTrg(tFieldDefinition);
		isApplicableMatch.getAllContextElements().add(
				tContainingClass__tFieldDefinition____defines);
		tContainingClass__tFieldSignature____signature.setSrc(tContainingClass);
		tContainingClass__tFieldSignature____signature.setTrg(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(
				tContainingClass__tFieldSignature____signature);
		tContainingClassToJContainingClass__tContainingClass____target
				.setSrc(tContainingClassToJContainingClass);
		tContainingClassToJContainingClass__tContainingClass____target
				.setTrg(tContainingClass);
		isApplicableMatch.getAllContextElements().add(
				tContainingClassToJContainingClass__tContainingClass____target);
		tContainingClassToJContainingClass__jContainingClass____source
				.setSrc(tContainingClassToJContainingClass);
		tContainingClassToJContainingClass__jContainingClass____source
				.setTrg(jContainingClass);
		isApplicableMatch.getAllContextElements().add(
				tContainingClassToJContainingClass__jContainingClass____source);
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
		tFieldSignature__tField____field.setSrc(tFieldSignature);
		tFieldSignature__tField____field.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(
				tFieldSignature__tField____field);
		tField__tFieldSignature____signatures.setSrc(tField);
		tField__tFieldSignature____signatures.setTrg(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(
				tField__tFieldSignature____signatures);
		pg__tContainingClass____classes
				.setName(pg__tContainingClass____classes_name_prime);
		pg__tField____fields.setName(pg__tField____fields_name_prime);
		tContainingClass__tFieldDefinition____defines
				.setName(tContainingClass__tFieldDefinition____defines_name_prime);
		tContainingClass__tFieldSignature____signature
				.setName(tContainingClass__tFieldSignature____signature_name_prime);
		tContainingClassToJContainingClass__tContainingClass____target
				.setName(tContainingClassToJContainingClass__tContainingClass____target_name_prime);
		tContainingClassToJContainingClass__jContainingClass____source
				.setName(tContainingClassToJContainingClass__jContainingClass____source_name_prime);
		tFieldSignature__tFieldDefinition____definitions
				.setName(tFieldSignature__tFieldDefinition____definitions_name_prime);
		tFieldDefinition__tFieldSignature____signature
				.setName(tFieldDefinition__tFieldSignature____signature_name_prime);
		tFieldSignature__tField____field
				.setName(tFieldSignature__tField____field_name_prime);
		tField__tFieldSignature____signatures
				.setName(tField__tFieldSignature____signatures_name_prime);
		return new Object[] { jContainingClass, pg, tContainingClass,
				tContainingClassToJContainingClass, tField, tFieldDefinition,
				tFieldSignature, isApplicableMatch,
				pg__tContainingClass____classes, pg__tField____fields,
				tContainingClass__tFieldDefinition____defines,
				tContainingClass__tFieldSignature____signature,
				tContainingClassToJContainingClass__tContainingClass____target,
				tContainingClassToJContainingClass__jContainingClass____source,
				tFieldSignature__tFieldDefinition____definitions,
				tFieldDefinition__tFieldSignature____signature,
				tFieldSignature__tField____field,
				tField__tFieldSignature____signatures };
	}

	public static final Object[] pattern_FieldNameExisting_12_4_bindingFBBBBBBBBB(
			FieldNameExisting _this, IsApplicableMatch isApplicableMatch,
			org.emftext.language.java.classifiers.Class jContainingClass,
			TypeGraph pg, TClass tContainingClass,
			ClassToTClass tContainingClassToJContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, jContainingClass, pg, tContainingClass,
				tContainingClassToJContainingClass, tField, tFieldDefinition,
				tFieldSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch,
					jContainingClass, pg, tContainingClass,
					tContainingClassToJContainingClass, tField,
					tFieldDefinition, tFieldSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldNameExisting_12_4_bindingAndBlackFBBBBBBBBB(
			FieldNameExisting _this, IsApplicableMatch isApplicableMatch,
			org.emftext.language.java.classifiers.Class jContainingClass,
			TypeGraph pg, TClass tContainingClass,
			ClassToTClass tContainingClassToJContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		Object[] result_pattern_FieldNameExisting_12_4_binding = pattern_FieldNameExisting_12_4_bindingFBBBBBBBBB(
				_this, isApplicableMatch, jContainingClass, pg,
				tContainingClass, tContainingClassToJContainingClass, tField,
				tFieldDefinition, tFieldSignature);
		if (result_pattern_FieldNameExisting_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_FieldNameExisting_12_4_binding[0];

			Object[] result_pattern_FieldNameExisting_12_4_black = pattern_FieldNameExisting_12_4_blackB(csp);
			if (result_pattern_FieldNameExisting_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch,
						jContainingClass, pg, tContainingClass,
						tContainingClassToJContainingClass, tField,
						tFieldDefinition, tFieldSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldNameExisting_12_5_expressionFBB(
			FieldNameExisting _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldNameExisting_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldNameExisting";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldNameExisting_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_20_1_bindingFB(
			FieldNameExisting _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_20_1_blackFBB(
			EClass __eClass, FieldNameExisting _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_20_1_bindingAndBlackFFB(
			FieldNameExisting _this) {
		Object[] result_pattern_FieldNameExisting_20_1_binding = pattern_FieldNameExisting_20_1_bindingFB(_this);
		if (result_pattern_FieldNameExisting_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldNameExisting_20_1_binding[0];

			Object[] result_pattern_FieldNameExisting_20_1_black = pattern_FieldNameExisting_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_FieldNameExisting_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldNameExisting_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_FieldNameExisting_20_2_blackFFB(
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

	public static final Object[] pattern_FieldNameExisting_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldNameExisting_20_3_expressionFBBBB(
			FieldNameExisting _this, Match match,
			org.emftext.language.java.classifiers.Class jContainingClass,
			Field jField) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match,
				jContainingClass, jField);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldNameExisting_20_4_expressionFBB(
			FieldNameExisting _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_FieldNameExisting_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_FieldNameExisting_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_21_1_bindingFB(
			FieldNameExisting _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_21_1_blackFBB(
			EClass __eClass, FieldNameExisting _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_21_1_bindingAndBlackFFB(
			FieldNameExisting _this) {
		Object[] result_pattern_FieldNameExisting_21_1_binding = pattern_FieldNameExisting_21_1_bindingFB(_this);
		if (result_pattern_FieldNameExisting_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldNameExisting_21_1_binding[0];

			Object[] result_pattern_FieldNameExisting_21_1_black = pattern_FieldNameExisting_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_FieldNameExisting_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldNameExisting_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldNameExisting_21_2_black_nac_0BB(
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		TFieldSignature __DEC_tFieldDefinition_definitions_818893 = tFieldDefinition
				.getSignature();
		if (__DEC_tFieldDefinition_definitions_818893 != null) {
			if (!tFieldSignature
					.equals(__DEC_tFieldDefinition_definitions_818893)) {
				return new Object[] { tFieldDefinition, tFieldSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_FieldNameExisting_21_2_black_nac_1BB(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition) {
		for (TFieldDefinition __DEC_tFieldSignature_definitions_370019 : tFieldSignature
				.getDefinitions()) {
			if (!tFieldDefinition
					.equals(__DEC_tFieldSignature_definitions_370019)) {
				return new Object[] { tFieldSignature, tFieldDefinition };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldNameExisting_21_2_blackFFFFFB(
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
								if (pattern_FieldNameExisting_21_2_black_nac_0BB(
										tFieldDefinition, tFieldSignature) == null) {
									if (pattern_FieldNameExisting_21_2_black_nac_1BB(
											tFieldSignature, tFieldDefinition) == null) {
										for (TypeGraph pg : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														tContainingClass,
														TypeGraph.class,
														"classes")) {
											if (pg.getFields().contains(tField)) {
												_result.add(new Object[] { pg,
														tContainingClass,
														tField,
														tFieldDefinition,
														tFieldSignature,
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

		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldNameExisting_21_3_expressionFBBBBBBB(
			FieldNameExisting _this, Match match, TypeGraph pg,
			TClass tContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, pg,
				tContainingClass, tField, tFieldDefinition, tFieldSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldNameExisting_21_4_expressionFBB(
			FieldNameExisting _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_FieldNameExisting_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_FieldNameExisting_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_22_1_bindingFB(
			FieldNameExisting _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_22_1_blackFBB(
			EClass __eClass, FieldNameExisting _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_22_1_bindingAndBlackFFB(
			FieldNameExisting _this) {
		Object[] result_pattern_FieldNameExisting_22_1_binding = pattern_FieldNameExisting_22_1_bindingFB(_this);
		if (result_pattern_FieldNameExisting_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldNameExisting_22_1_binding[0];

			Object[] result_pattern_FieldNameExisting_22_1_black = pattern_FieldNameExisting_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_FieldNameExisting_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldNameExisting_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldNameExisting_22_2_black_nac_0BB(
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		TFieldSignature __DEC_tFieldDefinition_definitions_8172 = tFieldDefinition
				.getSignature();
		if (__DEC_tFieldDefinition_definitions_8172 != null) {
			if (!tFieldSignature
					.equals(__DEC_tFieldDefinition_definitions_8172)) {
				return new Object[] { tFieldDefinition, tFieldSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_FieldNameExisting_22_2_black_nac_1BB(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition) {
		for (TFieldDefinition __DEC_tFieldSignature_definitions_308174 : tFieldSignature
				.getDefinitions()) {
			if (!tFieldDefinition
					.equals(__DEC_tFieldSignature_definitions_308174)) {
				return new Object[] { tFieldSignature, tFieldDefinition };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldNameExisting_22_2_blackFFFFFB(
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
									if (pattern_FieldNameExisting_22_2_black_nac_0BB(
											tFieldDefinition, tFieldSignature) == null) {
										if (pattern_FieldNameExisting_22_2_black_nac_1BB(
												tFieldSignature,
												tFieldDefinition) == null) {
											for (TypeGraph pg : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(
															tContainingClass,
															TypeGraph.class,
															"classes")) {
												if (pg.getFields().contains(
														tField)) {
													_result.add(new Object[] {
															pg,
															tContainingClass,
															tField,
															tFieldDefinition,
															tFieldSignature,
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

	public static final Object[] pattern_FieldNameExisting_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldNameExisting_22_3_expressionFBBBBBBB(
			FieldNameExisting _this, Match match, TypeGraph pg,
			TClass tContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, pg,
				tContainingClass, tField, tFieldDefinition, tFieldSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldNameExisting_22_4_expressionFBB(
			FieldNameExisting _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_FieldNameExisting_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_FieldNameExisting_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_23_1_bindingFB(
			FieldNameExisting _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_23_1_blackFBB(
			EClass __eClass, FieldNameExisting _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_23_1_bindingAndBlackFFB(
			FieldNameExisting _this) {
		Object[] result_pattern_FieldNameExisting_23_1_binding = pattern_FieldNameExisting_23_1_bindingFB(_this);
		if (result_pattern_FieldNameExisting_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldNameExisting_23_1_binding[0];

			Object[] result_pattern_FieldNameExisting_23_1_black = pattern_FieldNameExisting_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_FieldNameExisting_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldNameExisting_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldNameExisting_23_2_black_nac_0BB(
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		TFieldSignature __DEC_tFieldDefinition_definitions_576340 = tFieldDefinition
				.getSignature();
		if (__DEC_tFieldDefinition_definitions_576340 != null) {
			if (!tFieldSignature
					.equals(__DEC_tFieldDefinition_definitions_576340)) {
				return new Object[] { tFieldDefinition, tFieldSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_FieldNameExisting_23_2_black_nac_1BB(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition) {
		for (TFieldDefinition __DEC_tFieldSignature_definitions_254106 : tFieldSignature
				.getDefinitions()) {
			if (!tFieldDefinition
					.equals(__DEC_tFieldSignature_definitions_254106)) {
				return new Object[] { tFieldSignature, tFieldDefinition };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldNameExisting_23_2_blackFFFFFB(
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
						if (pattern_FieldNameExisting_23_2_black_nac_0BB(
								tFieldDefinition, tFieldSignature) == null) {
							if (pattern_FieldNameExisting_23_2_black_nac_1BB(
									tFieldSignature, tFieldDefinition) == null) {
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
												_result.add(new Object[] { pg,
														tContainingClass,
														tField,
														tFieldDefinition,
														tFieldSignature,
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

		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldNameExisting_23_3_expressionFBBBBBBB(
			FieldNameExisting _this, Match match, TypeGraph pg,
			TClass tContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, pg,
				tContainingClass, tField, tFieldDefinition, tFieldSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldNameExisting_23_4_expressionFBB(
			FieldNameExisting _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_FieldNameExisting_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_FieldNameExisting_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_24_1_bindingFB(
			FieldNameExisting _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_24_1_blackFBB(
			EClass __eClass, FieldNameExisting _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_24_1_bindingAndBlackFFB(
			FieldNameExisting _this) {
		Object[] result_pattern_FieldNameExisting_24_1_binding = pattern_FieldNameExisting_24_1_bindingFB(_this);
		if (result_pattern_FieldNameExisting_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldNameExisting_24_1_binding[0];

			Object[] result_pattern_FieldNameExisting_24_1_black = pattern_FieldNameExisting_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_FieldNameExisting_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldNameExisting_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldNameExisting_24_2_black_nac_0BB(
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		TFieldSignature __DEC_tFieldDefinition_definitions_599264 = tFieldDefinition
				.getSignature();
		if (__DEC_tFieldDefinition_definitions_599264 != null) {
			if (!tFieldSignature
					.equals(__DEC_tFieldDefinition_definitions_599264)) {
				return new Object[] { tFieldDefinition, tFieldSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_FieldNameExisting_24_2_black_nac_1BB(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition) {
		for (TFieldDefinition __DEC_tFieldSignature_definitions_91171 : tFieldSignature
				.getDefinitions()) {
			if (!tFieldDefinition
					.equals(__DEC_tFieldSignature_definitions_91171)) {
				return new Object[] { tFieldSignature, tFieldDefinition };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldNameExisting_24_2_blackFFFFFB(
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
						if (pattern_FieldNameExisting_24_2_black_nac_0BB(
								tFieldDefinition, tFieldSignature) == null) {
							if (pattern_FieldNameExisting_24_2_black_nac_1BB(
									tFieldSignature, tFieldDefinition) == null) {
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
												_result.add(new Object[] { pg,
														tContainingClass,
														tField,
														tFieldDefinition,
														tFieldSignature,
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

		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldNameExisting_24_3_expressionFBBBBBBB(
			FieldNameExisting _this, Match match, TypeGraph pg,
			TClass tContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, pg,
				tContainingClass, tField, tFieldDefinition, tFieldSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldNameExisting_24_4_expressionFBB(
			FieldNameExisting _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_FieldNameExisting_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_FieldNameExisting_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_25_1_bindingFB(
			FieldNameExisting _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_25_1_blackFBB(
			EClass __eClass, FieldNameExisting _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_25_1_bindingAndBlackFFB(
			FieldNameExisting _this) {
		Object[] result_pattern_FieldNameExisting_25_1_binding = pattern_FieldNameExisting_25_1_bindingFB(_this);
		if (result_pattern_FieldNameExisting_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldNameExisting_25_1_binding[0];

			Object[] result_pattern_FieldNameExisting_25_1_black = pattern_FieldNameExisting_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_FieldNameExisting_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldNameExisting_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldNameExisting_25_2_black_nac_0BB(
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		TFieldSignature __DEC_tFieldDefinition_definitions_194646 = tFieldDefinition
				.getSignature();
		if (__DEC_tFieldDefinition_definitions_194646 != null) {
			if (!tFieldSignature
					.equals(__DEC_tFieldDefinition_definitions_194646)) {
				return new Object[] { tFieldDefinition, tFieldSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_FieldNameExisting_25_2_black_nac_1BB(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition) {
		for (TFieldDefinition __DEC_tFieldSignature_definitions_520070 : tFieldSignature
				.getDefinitions()) {
			if (!tFieldDefinition
					.equals(__DEC_tFieldSignature_definitions_520070)) {
				return new Object[] { tFieldSignature, tFieldDefinition };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldNameExisting_25_2_blackFFFFFB(
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
						if (pattern_FieldNameExisting_25_2_black_nac_0BB(
								tFieldDefinition, tFieldSignature) == null) {
							if (pattern_FieldNameExisting_25_2_black_nac_1BB(
									tFieldSignature, tFieldDefinition) == null) {
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
												_result.add(new Object[] { pg,
														tContainingClass,
														tField,
														tFieldDefinition,
														tFieldSignature,
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

		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldNameExisting_25_3_expressionFBBBBBBB(
			FieldNameExisting _this, Match match, TypeGraph pg,
			TClass tContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, pg,
				tContainingClass, tField, tFieldDefinition, tFieldSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldNameExisting_25_4_expressionFBB(
			FieldNameExisting _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_FieldNameExisting_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_FieldNameExisting_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_26_1_bindingFB(
			FieldNameExisting _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_26_1_blackFBB(
			EClass __eClass, FieldNameExisting _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_26_1_bindingAndBlackFFB(
			FieldNameExisting _this) {
		Object[] result_pattern_FieldNameExisting_26_1_binding = pattern_FieldNameExisting_26_1_bindingFB(_this);
		if (result_pattern_FieldNameExisting_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldNameExisting_26_1_binding[0];

			Object[] result_pattern_FieldNameExisting_26_1_black = pattern_FieldNameExisting_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_FieldNameExisting_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldNameExisting_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldNameExisting_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldNameExisting_26_2_black_nac_0BB(
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		TFieldSignature __DEC_tFieldDefinition_definitions_334748 = tFieldDefinition
				.getSignature();
		if (__DEC_tFieldDefinition_definitions_334748 != null) {
			if (!tFieldSignature
					.equals(__DEC_tFieldDefinition_definitions_334748)) {
				return new Object[] { tFieldDefinition, tFieldSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_FieldNameExisting_26_2_black_nac_1BB(
			TFieldSignature tFieldSignature, TFieldDefinition tFieldDefinition) {
		for (TFieldDefinition __DEC_tFieldSignature_definitions_669117 : tFieldSignature
				.getDefinitions()) {
			if (!tFieldDefinition
					.equals(__DEC_tFieldSignature_definitions_669117)) {
				return new Object[] { tFieldSignature, tFieldDefinition };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldNameExisting_26_2_blackFFFFFB(
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
						if (pattern_FieldNameExisting_26_2_black_nac_0BB(
								tFieldDefinition, tFieldSignature) == null) {
							if (pattern_FieldNameExisting_26_2_black_nac_1BB(
									tFieldSignature, tFieldDefinition) == null) {
								for (TypeGraph pg : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(tField,
												TypeGraph.class, "fields")) {
									for (TClass tContainingClass : pg
											.getClasses()) {
										if (tContainingClass.getDefines()
												.contains(tFieldDefinition)) {
											if (tContainingClass.getSignature()
													.contains(tFieldSignature)) {
												_result.add(new Object[] { pg,
														tContainingClass,
														tField,
														tFieldDefinition,
														tFieldSignature,
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

		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_26_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldNameExisting_26_3_expressionFBBBBBBB(
			FieldNameExisting _this, Match match, TypeGraph pg,
			TClass tContainingClass, TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, pg,
				tContainingClass, tField, tFieldDefinition, tFieldSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldNameExisting_26_4_expressionFBB(
			FieldNameExisting _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldNameExisting_26_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_FieldNameExisting_26_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_FieldNameExisting_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FieldNameExistingImpl
