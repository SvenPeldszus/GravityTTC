/**
 */
package GravityTGG.Rules;

import TGGRuntime.TGGRuntimePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see GravityTGG.Rules.RulesFactory
 * @model kind="package"
 * @generated
 */
public interface RulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Rules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/GravityTGG/model/GravityTGG.ecore#//Rules";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Rules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesPackage eINSTANCE = GravityTGG.Rules.impl.RulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.ClassDefaultImpl <em>Class Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.ClassDefaultImpl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getClassDefault()
	 * @generated
	 */
	int CLASS_DEFAULT = 0;

	/**
	 * The number of structural features of the '<em>Class Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___IS_APPROPRIATE_FWD__MATCH_COMPILATIONUNIT_CLASS_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_COMPILATIONUNIT_CLASS_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_COMPILATIONUNIT_CLASS_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_COMPILATIONUNIT_CLASS_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT_EXTENDEDJAMOPPPACKAGEELEMENTTOTPACKAGE_TPACKAGE_TYPEGRAPH_EXTENDEDJAMOPPJAVACONTAINERTOTYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___IS_APPROPRIATE_BWD__MATCH_TCLASS_TPACKAGE_TYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TPACKAGE_TYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TPACKAGE_TYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT_EXTENDEDJAMOPPPACKAGEELEMENTTOTPACKAGE_TCLASS_TPACKAGE_TYPEGRAPH_EXTENDEDJAMOPPJAVACONTAINERTOTYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_0__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_2__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The number of operations of the '<em>Class Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFAULT_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.ParameterTypeLibCreateImpl <em>Parameter Type Lib Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.ParameterTypeLibCreateImpl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getParameterTypeLibCreate()
	 * @generated
	 */
	int PARAMETER_TYPE_LIB_CREATE = 1;

	/**
	 * The number of structural features of the '<em>Parameter Type Lib Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___IS_APPROPRIATE_FWD__MATCH_EXTENDEDPARAMETER_EXTENDEDTYPE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDPARAMETER_EXTENDEDTYPE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDPARAMETER_EXTENDEDTYPE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDPARAMETER_TPARAMETER_EXTENDEDPARAMETERTOTPARAMETER_EXTENDEDTYPE_TYPEGRAPH_TMETHODSIGNATURE_TMETHOD_EXTENDEDPARAMETERTOTYPEGRAPH_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___IS_APPROPRIATE_BWD__MATCH_TPARAMETER_TCLASS_TYPEGRAPH_TMETHODSIGNATURE_TMETHOD_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPARAMETER_TCLASS_TYPEGRAPH_TMETHODSIGNATURE_TMETHOD_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPARAMETER_TCLASS_TYPEGRAPH_TMETHODSIGNATURE_TMETHOD_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXTENDEDPARAMETER_TPARAMETER_EXTENDEDPARAMETERTOTPARAMETER_TCLASS_TYPEGRAPH_TMETHODSIGNATURE_TMETHOD_EXTENDEDPARAMETERTOTYPEGRAPH_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_3__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_3__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_4__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The number of operations of the '<em>Parameter Type Lib Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_CREATE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.FieldNameExistingImpl <em>Field Name Existing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.FieldNameExistingImpl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getFieldNameExisting()
	 * @generated
	 */
	int FIELD_NAME_EXISTING = 2;

	/**
	 * The number of structural features of the '<em>Field Name Existing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___IS_APPROPRIATE_FWD__MATCH_CLASS_FIELD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASS_FIELD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASS_FIELD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASS_FIELD_TYPEGRAPH_TCLASS_CLASSTOTCLASS_TFIELD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TCLASS_TFIELD_TFIELDDEFINITION_TFIELDSIGNATURE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TCLASS_TFIELD_TFIELDDEFINITION_TFIELDSIGNATURE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TCLASS_TFIELD_TFIELDDEFINITION_TFIELDSIGNATURE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASS_TYPEGRAPH_TCLASS_CLASSTOTCLASS_TFIELD_TFIELDDEFINITION_TFIELDSIGNATURE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___IS_APPROPRIATE_BWD_EMOFLON_EDGE_5__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 6</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___IS_APPROPRIATE_BWD_EMOFLON_EDGE_6__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 7</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___IS_APPROPRIATE_BWD_EMOFLON_EDGE_7__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 8</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___IS_APPROPRIATE_BWD_EMOFLON_EDGE_8__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 9</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___IS_APPROPRIATE_BWD_EMOFLON_EDGE_9__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 10</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___IS_APPROPRIATE_BWD_EMOFLON_EDGE_10__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>Field Name Existing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_EXISTING_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.ParameterTypeLibLinkImpl <em>Parameter Type Lib Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.ParameterTypeLibLinkImpl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getParameterTypeLibLink()
	 * @generated
	 */
	int PARAMETER_TYPE_LIB_LINK = 3;

	/**
	 * The number of structural features of the '<em>Parameter Type Lib Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___IS_APPROPRIATE_FWD__MATCH_EXTENDEDTYPE_EXTENDEDPARAMETER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDTYPE_EXTENDEDPARAMETER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDTYPE_EXTENDEDPARAMETER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TCLASS_EXTENDEDTYPE_TYPEGRAPH_EXTENDEDPARAMETER_TPARAMETER_EXTENDEDPARAMETERTOTPARAMETER_TMETHODSIGNATURE_TMETHOD_TPARAMETERLIST_EXTENDEDPARAMETERTOTYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___IS_APPROPRIATE_BWD__MATCH_TCLASS_TYPEGRAPH_TPARAMETER_TMETHODSIGNATURE_TMETHOD_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TYPEGRAPH_TPARAMETER_TMETHODSIGNATURE_TMETHOD_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TYPEGRAPH_TPARAMETER_TMETHODSIGNATURE_TMETHOD_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TCLASS_TYPEGRAPH_EXTENDEDPARAMETER_TPARAMETER_EXTENDEDPARAMETERTOTPARAMETER_TMETHODSIGNATURE_TMETHOD_TPARAMETERLIST_EXTENDEDPARAMETERTOTYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 11</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___IS_APPROPRIATE_BWD_EMOFLON_EDGE_11__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The number of operations of the '<em>Parameter Type Lib Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_LIB_LINK_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.MethodDefinitionLinkSignatureImpl <em>Method Definition Link Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.MethodDefinitionLinkSignatureImpl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getMethodDefinitionLinkSignature()
	 * @generated
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE = 4;

	/**
	 * The number of structural features of the '<em>Method Definition Link Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_FWD__MATCH_EXTENDEDCLASSMETHOD_EXTENDEDMETHODNAME_EXTENDEDPARAMETERLIST_EXTENDEDJAMOPPJAVACONTAINER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDCLASSMETHOD_EXTENDEDMETHODNAME_EXTENDEDPARAMETERLIST_EXTENDEDJAMOPPJAVACONTAINER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDCLASSMETHOD_EXTENDEDMETHODNAME_EXTENDEDPARAMETERLIST_EXTENDEDJAMOPPJAVACONTAINER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDCLASSMETHOD_TMETHODSIGNATURE_CLASSMETHODTOTMETHODSIGNATURE_EXTENDEDMETHODNAME_TMETHOD_EXTENDEDMETHODNAMETOTMETHOD_EXTENDEDPARAMETERLIST_EXTENDEDPARAMETERLISTTOTMETHODSIGNATURE_EXTENDEDJAMOPPJAVACONTAINER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_BWD__MATCH_TMETHODSIGNATURE_TMETHOD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODSIGNATURE_TMETHOD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODSIGNATURE_TMETHOD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXTENDEDCLASSMETHOD_TMETHODSIGNATURE_CLASSMETHODTOTMETHODSIGNATURE_EXTENDEDMETHODNAME_TMETHOD_EXTENDEDMETHODNAMETOTMETHOD_EXTENDEDPARAMETERLIST_EXTENDEDPARAMETERLISTTOTMETHODSIGNATURE_EXTENDEDJAMOPPJAVACONTAINER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 6</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_6__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 7</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_7__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 12</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_12__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 13</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_13__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 8</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_8__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The number of operations of the '<em>Method Definition Link Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_LINK_SIGNATURE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.MethodLinkClassImpl <em>Method Link Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.MethodLinkClassImpl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getMethodLinkClass()
	 * @generated
	 */
	int METHOD_LINK_CLASS = 5;

	/**
	 * The number of structural features of the '<em>Method Link Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___IS_APPROPRIATE_FWD__MATCH_EXTENDEDCLASSMETHOD_CLASS_EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDCLASSMETHOD_CLASS_EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDCLASSMETHOD_CLASS_EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TMETHODDEFINITION_EXTENDEDCLASSMETHOD_TMETHODSIGNATURE_CLASSMETHODTOTMETHODSIGNATURE_CLASSMETHODTOTMETHODDEFINITION_CLASS_TCLASS_CLASSTOTCLASS_EXTENDEDPARAMETERLIST_EXTENDEDPARAMETERLISTTOTMETHODSIGNATURE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___IS_APPROPRIATE_BWD__MATCH_TMETHODDEFINITION_TMETHODSIGNATURE_TCLASS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODDEFINITION_TMETHODSIGNATURE_TCLASS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODDEFINITION_TMETHODSIGNATURE_TCLASS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMETHODDEFINITION_EXTENDEDCLASSMETHOD_TMETHODSIGNATURE_CLASSMETHODTOTMETHODSIGNATURE_CLASSMETHODTOTMETHODDEFINITION_CLASS_TCLASS_CLASSTOTCLASS_EXTENDEDPARAMETERLIST_EXTENDEDPARAMETERLISTTOTMETHODSIGNATURE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 9</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_9__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 14</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_14__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 15</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_15__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The number of operations of the '<em>Method Link Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_LINK_CLASS_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.InheritanceImpl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 6;

	/**
	 * The number of structural features of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___IS_APPROPRIATE_FWD__MATCH_CLASSIFIERREFERENCE_CLASS_CLASS_NAMESPACECLASSIFIERREFERENCE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSIFIERREFERENCE_CLASS_CLASS_NAMESPACECLASSIFIERREFERENCE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSIFIERREFERENCE_CLASS_CLASS_NAMESPACECLASSIFIERREFERENCE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASSIFIERREFERENCE_CLASS_CLASSTOTCLASS_CLASS_CLASSTOTCLASS_NAMESPACECLASSIFIERREFERENCE_TYPEGRAPH_TCLASS_TCLASS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TCLASS_TCLASS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TCLASS_TCLASS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TCLASS_TCLASS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASS_CLASSTOTCLASS_CLASS_CLASSTOTCLASS_TYPEGRAPH_TCLASS_TCLASS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 10</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_10__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 11</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_11__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 12</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_12__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 16</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_16__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 17</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_17__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The number of operations of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.ParameterListLinkFirstImpl <em>Parameter List Link First</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.ParameterListLinkFirstImpl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getParameterListLinkFirst()
	 * @generated
	 */
	int PARAMETER_LIST_LINK_FIRST = 7;

	/**
	 * The number of structural features of the '<em>Parameter List Link First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___IS_APPROPRIATE_FWD__MATCH_EXTENDEDPARAMETER_EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDPARAMETER_EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDPARAMETER_EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDPARAMETER_EXTENDEDPARAMETERLIST_EXTENDEDPARAMETERLISTTOTPARAMETERLIST_EXTENDEDPARAMETERTOTPARAMETER_TPARAMETER_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___IS_APPROPRIATE_BWD__MATCH_TPARAMETER_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPARAMETER_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPARAMETER_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXTENDEDPARAMETER_EXTENDEDPARAMETERLIST_EXTENDEDPARAMETERLISTTOTPARAMETERLIST_EXTENDEDPARAMETERTOTPARAMETER_TPARAMETER_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 13</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_13__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 18</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_18__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The number of operations of the '<em>Parameter List Link First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_LINK_FIRST_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.ParameterTypeUserDefinedImpl <em>Parameter Type User Defined</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.ParameterTypeUserDefinedImpl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getParameterTypeUserDefined()
	 * @generated
	 */
	int PARAMETER_TYPE_USER_DEFINED = 8;

	/**
	 * The number of structural features of the '<em>Parameter Type User Defined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___IS_APPROPRIATE_FWD__MATCH_EXTENDEDTYPE_EXTENDEDPARAMETER_CLASS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDTYPE_EXTENDEDPARAMETER_CLASS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDTYPE_EXTENDEDPARAMETER_CLASS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TCLASS_EXTENDEDTYPE_EXTENDEDPARAMETER_TPARAMETER_EXTENDEDPARAMETERTOTPARAMETER_CLASS_CLASSTOTCLASS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___IS_APPROPRIATE_BWD__MATCH_TCLASS_TPARAMETER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TPARAMETER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TPARAMETER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TCLASS_EXTENDEDPARAMETER_TPARAMETER_EXTENDEDPARAMETERTOTPARAMETER_CLASS_CLASSTOTCLASS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 14</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___IS_APPROPRIATE_FWD_EMOFLON_EDGE_14__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 15</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___IS_APPROPRIATE_FWD_EMOFLON_EDGE_15__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 19</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___IS_APPROPRIATE_BWD_EMOFLON_EDGE_19__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The number of operations of the '<em>Parameter Type User Defined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_USER_DEFINED_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.MethodSignatureLinkDefinitionImpl <em>Method Signature Link Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.MethodSignatureLinkDefinitionImpl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getMethodSignatureLinkDefinition()
	 * @generated
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION = 9;

	/**
	 * The number of structural features of the '<em>Method Signature Link Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___IS_APPROPRIATE_FWD__MATCH_EXTENDEDCLASSMETHOD_EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDCLASSMETHOD_EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDCLASSMETHOD_EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDCLASSMETHOD_EXTENDEDPARAMETERLIST_TMETHODDEFINITION_CLASSMETHODTOTMETHODDEFINITION_EXTENDEDPARAMETERLISTTOTPARAMETERLIST_TMETHODSIGNATURE_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___IS_APPROPRIATE_BWD__MATCH_TMETHODDEFINITION_TMETHODSIGNATURE_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODDEFINITION_TMETHODSIGNATURE_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODDEFINITION_TMETHODSIGNATURE_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXTENDEDCLASSMETHOD_EXTENDEDPARAMETERLIST_TMETHODDEFINITION_CLASSMETHODTOTMETHODDEFINITION_EXTENDEDPARAMETERLISTTOTPARAMETERLIST_TMETHODSIGNATURE_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 16</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_16__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 17</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_17__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 20</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_20__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 21</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_21__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The number of operations of the '<em>Method Signature Link Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_LINK_DEFINITION_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.ParameterLinkListNextImpl <em>Parameter Link List Next</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.ParameterLinkListNextImpl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getParameterLinkListNext()
	 * @generated
	 */
	int PARAMETER_LINK_LIST_NEXT = 10;

	/**
	 * The number of structural features of the '<em>Parameter Link List Next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___IS_APPROPRIATE_FWD__MATCH_EXTENDEDPARAMETER_EXTENDEDPARAMETER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDPARAMETER_EXTENDEDPARAMETER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDPARAMETER_EXTENDEDPARAMETER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDPARAMETER_EXTENDEDPARAMETER_EXTENDEDPARAMETERTOTPARAMETER_EXTENDEDPARAMETERTOTPARAMETER_TPARAMETER_TPARAMETER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___IS_APPROPRIATE_BWD__MATCH_TPARAMETER_TPARAMETER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPARAMETER_TPARAMETER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPARAMETER_TPARAMETER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXTENDEDPARAMETER_EXTENDEDPARAMETER_EXTENDEDPARAMETERTOTPARAMETER_EXTENDEDPARAMETERTOTPARAMETER_TPARAMETER_TPARAMETER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 18</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_18__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 19</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_19__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 22</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_22__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 23</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_23__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The number of operations of the '<em>Parameter Link List Next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_LIST_NEXT_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.FieldNameCreateImpl <em>Field Name Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.FieldNameCreateImpl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getFieldNameCreate()
	 * @generated
	 */
	int FIELD_NAME_CREATE = 11;

	/**
	 * The number of structural features of the '<em>Field Name Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___IS_APPROPRIATE_FWD__MATCH_CLASS_FIELD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASS_FIELD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASS_FIELD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASS_TCLASS_FIELD_TYPEGRAPH_CLASSTOTCLASS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___IS_APPROPRIATE_BWD__MATCH_TFIELDSIGNATURE_TFIELDDEFINITION_TCLASS_TYPEGRAPH_TFIELD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TFIELDSIGNATURE_TFIELDDEFINITION_TCLASS_TYPEGRAPH_TFIELD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TFIELDSIGNATURE_TFIELDDEFINITION_TCLASS_TYPEGRAPH_TFIELD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TFIELDSIGNATURE_TFIELDDEFINITION_CLASS_TCLASS_TYPEGRAPH_TFIELD_CLASSTOTCLASS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 24</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_24__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 25</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_25__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 26</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_26__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 27</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_27__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 20</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_20__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 28</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_28__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 29</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_29__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 30</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_30__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The number of operations of the '<em>Field Name Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_CREATE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.MethodNameCreateImpl <em>Method Name Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.MethodNameCreateImpl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getMethodNameCreate()
	 * @generated
	 */
	int METHOD_NAME_CREATE = 12;

	/**
	 * The number of structural features of the '<em>Method Name Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___IS_APPROPRIATE_FWD__MATCH_EXTENDEDMETHODNAME_EXTENDEDJAMOPPJAVACONTAINER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDMETHODNAME_EXTENDEDJAMOPPJAVACONTAINER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDMETHODNAME_EXTENDEDJAMOPPJAVACONTAINER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDMETHODNAME_TYPEGRAPH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPJAVACONTAINERTOTYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___IS_APPROPRIATE_BWD__MATCH_TMETHOD_TYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHOD_TYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHOD_TYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMETHOD_TYPEGRAPH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPJAVACONTAINERTOTYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 31</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_31__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 21</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_21__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The number of operations of the '<em>Method Name Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_CREATE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.Class1Impl <em>Class1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.Class1Impl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getClass1()
	 * @generated
	 */
	int CLASS1 = 13;

	/**
	 * The number of structural features of the '<em>Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_FWD__MATCH_EXTENDEDCLASSMETHOD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDCLASSMETHOD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDCLASSMETHOD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDCLASSMETHOD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_BWD__MATCH_TMETHODDEFINITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODDEFINITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODDEFINITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMETHODDEFINITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD Extended Class Method 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_FWD_EXTENDED_CLASS_METHOD_0__EXTENDEDCLASSMETHOD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD TMethod Definition 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_BWD_TMETHOD_DEFINITION_0__TMETHODDEFINITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The number of operations of the '<em>Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.MethodSignatureCreateImpl <em>Method Signature Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.MethodSignatureCreateImpl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getMethodSignatureCreate()
	 * @generated
	 */
	int METHOD_SIGNATURE_CREATE = 14;

	/**
	 * The number of structural features of the '<em>Method Signature Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___IS_APPROPRIATE_FWD__MATCH_EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___IS_APPROPRIATE_BWD__MATCH_TMETHODSIGNATURE_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODSIGNATURE_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODSIGNATURE_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMETHODSIGNATURE_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD Extended Parameter List 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___IS_APPROPRIATE_FWD_EXTENDED_PARAMETER_LIST_0__EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 32</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_32__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The number of operations of the '<em>Method Signature Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_CREATE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.PackageRootImpl <em>Package Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.PackageRootImpl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getPackageRoot()
	 * @generated
	 */
	int PACKAGE_ROOT = 15;

	/**
	 * The number of structural features of the '<em>Package Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___IS_APPROPRIATE_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT_TYPEGRAPH_EXTENDEDJAMOPPJAVACONTAINERTOTYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___IS_APPROPRIATE_BWD__MATCH_TPACKAGE_TYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPACKAGE_TYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPACKAGE_TYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXTENDEDJAMOPPJAVACONTAINER_TPACKAGE_TYPEGRAPH_EXTENDEDJAMOPPJAVACONTAINERTOTYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 22</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_22__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 23</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_23__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 33</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_33__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The number of operations of the '<em>Package Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ROOT_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.PackageChildImpl <em>Package Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.PackageChildImpl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getPackageChild()
	 * @generated
	 */
	int PACKAGE_CHILD = 16;

	/**
	 * The number of structural features of the '<em>Package Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___IS_APPROPRIATE_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT_EXTENDEDJAMOPPPACKAGEELEMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT_EXTENDEDJAMOPPPACKAGEELEMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT_EXTENDEDJAMOPPPACKAGEELEMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT_EXTENDEDJAMOPPPACKAGEELEMENT_TPACKAGE_EXTENDEDJAMOPPPACKAGEELEMENTTOTPACKAGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___IS_APPROPRIATE_BWD__MATCH_TPACKAGE_TPACKAGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPACKAGE_TPACKAGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPACKAGE_TPACKAGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDJAMOPPPACKAGEELEMENT_TPACKAGE_EXTENDEDJAMOPPPACKAGEELEMENTTOTPACKAGE_TPACKAGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 24</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___IS_APPROPRIATE_FWD_EMOFLON_EDGE_24__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 25</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___IS_APPROPRIATE_FWD_EMOFLON_EDGE_25__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 26</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___IS_APPROPRIATE_FWD_EMOFLON_EDGE_26__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 34</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___IS_APPROPRIATE_BWD_EMOFLON_EDGE_34__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 35</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___IS_APPROPRIATE_BWD_EMOFLON_EDGE_35__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The number of operations of the '<em>Package Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CHILD_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.ProgramGraphCreateImpl <em>Program Graph Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.ProgramGraphCreateImpl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getProgramGraphCreate()
	 * @generated
	 */
	int PROGRAM_GRAPH_CREATE = 17;

	/**
	 * The number of structural features of the '<em>Program Graph Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___IS_APPROPRIATE_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDJAMOPPJAVACONTAINER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD Extended Jamopp Java Container 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___IS_APPROPRIATE_FWD_EXTENDED_JAMOPP_JAVA_CONTAINER_0__EXTENDEDJAMOPPJAVACONTAINER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD Type Graph 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___IS_APPROPRIATE_BWD_TYPE_GRAPH_0__TYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The number of operations of the '<em>Program Graph Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_GRAPH_CREATE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.ReturnTypeUserDefinedImpl <em>Return Type User Defined</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.ReturnTypeUserDefinedImpl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getReturnTypeUserDefined()
	 * @generated
	 */
	int RETURN_TYPE_USER_DEFINED = 18;

	/**
	 * The number of structural features of the '<em>Return Type User Defined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___IS_APPROPRIATE_FWD__MATCH_EXTENDEDMETHODNAME_EXTENDEDCLASSMETHOD_EXTENDEDTYPE_CLASS_EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDMETHODNAME_EXTENDEDCLASSMETHOD_EXTENDEDTYPE_CLASS_EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDMETHODNAME_EXTENDEDCLASSMETHOD_EXTENDEDTYPE_CLASS_EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDMETHODNAME_TMETHODDEFINITION_EXTENDEDCLASSMETHOD_CLASSMETHODTOTMETHODDEFINITION_EXTENDEDTYPE_CLASS_TCLASS_CLASSTOTCLASS_EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___IS_APPROPRIATE_BWD__MATCH_TMETHODDEFINITION_TCLASS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODDEFINITION_TCLASS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODDEFINITION_TCLASS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXTENDEDMETHODNAME_TMETHODDEFINITION_EXTENDEDCLASSMETHOD_CLASSMETHODTOTMETHODDEFINITION_CLASS_TCLASS_CLASSTOTCLASS_EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 36</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___IS_APPROPRIATE_BWD_EMOFLON_EDGE_36__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 27</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___IS_APPROPRIATE_FWD_EMOFLON_EDGE_27__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 28</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___IS_APPROPRIATE_FWD_EMOFLON_EDGE_28__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The number of operations of the '<em>Return Type User Defined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_USER_DEFINED_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.ReturnTypeFromLibCreateImpl <em>Return Type From Lib Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.ReturnTypeFromLibCreateImpl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getReturnTypeFromLibCreate()
	 * @generated
	 */
	int RETURN_TYPE_FROM_LIB_CREATE = 19;

	/**
	 * The number of structural features of the '<em>Return Type From Lib Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___IS_APPROPRIATE_FWD__MATCH_CLASS_EXTENDEDTYPE_EXTENDEDCLASSMETHOD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASS_EXTENDEDTYPE_EXTENDEDCLASSMETHOD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASS_EXTENDEDTYPE_EXTENDEDCLASSMETHOD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASS_TCLASS_CLASSTOTCLASS_EXTENDEDTYPE_TMETHODDEFINITION_EXTENDEDCLASSMETHOD_CLASSMETHODTOTMETHODDEFINITION_TYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___IS_APPROPRIATE_BWD__MATCH_TCLASS_TCLASS_TMETHODDEFINITION_TYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TCLASS_TMETHODDEFINITION_TYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TCLASS_TMETHODDEFINITION_TYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASS_TCLASS_CLASSTOTCLASS_TCLASS_TMETHODDEFINITION_EXTENDEDCLASSMETHOD_CLASSMETHODTOTMETHODDEFINITION_TYPEGRAPH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 37</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_37__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 29</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_29__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 38</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_38__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The number of operations of the '<em>Return Type From Lib Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_CREATE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.ReturnTypeFromLibLinkImpl <em>Return Type From Lib Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.ReturnTypeFromLibLinkImpl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getReturnTypeFromLibLink()
	 * @generated
	 */
	int RETURN_TYPE_FROM_LIB_LINK = 20;

	/**
	 * The number of structural features of the '<em>Return Type From Lib Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___IS_APPROPRIATE_FWD__MATCH_CLASS_EXTENDEDTYPE_EXTENDEDCLASSMETHOD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASS_EXTENDEDTYPE_EXTENDEDCLASSMETHOD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASS_EXTENDEDTYPE_EXTENDEDCLASSMETHOD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASS_TCLASS_CLASSTOTCLASS_TYPEGRAPH_TCLASS_EXTENDEDTYPE_TMETHODDEFINITION_EXTENDEDCLASSMETHOD_CLASSMETHODTOTMETHODDEFINITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___IS_APPROPRIATE_BWD__MATCH_TCLASS_TYPEGRAPH_TCLASS_TMETHODDEFINITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TYPEGRAPH_TCLASS_TMETHODDEFINITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TYPEGRAPH_TCLASS_TMETHODDEFINITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASS_TCLASS_CLASSTOTCLASS_TYPEGRAPH_TCLASS_TMETHODDEFINITION_EXTENDEDCLASSMETHOD_CLASSMETHODTOTMETHODDEFINITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 39</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___IS_APPROPRIATE_BWD_EMOFLON_EDGE_39__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 30</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___IS_APPROPRIATE_FWD_EMOFLON_EDGE_30__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The number of operations of the '<em>Return Type From Lib Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FROM_LIB_LINK_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The meta object id for the '{@link GravityTGG.Rules.impl.ParameterCreateNewImpl <em>Parameter Create New</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Rules.impl.ParameterCreateNewImpl
	 * @see GravityTGG.Rules.impl.RulesPackageImpl#getParameterCreateNew()
	 * @generated
	 */
	int PARAMETER_CREATE_NEW = 21;

	/**
	 * The number of structural features of the '<em>Parameter Create New</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___IS_APPROPRIATE_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDMETHODNAME_EXTENDEDPARAMETER_EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDMETHODNAME_EXTENDEDPARAMETER_EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXTENDEDJAMOPPJAVACONTAINER_EXTENDEDMETHODNAME_EXTENDEDPARAMETER_EXTENDEDPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXTENDEDJAMOPPJAVACONTAINER_TYPEGRAPH_EXTENDEDJAMOPPJAVACONTAINERTOTYPEGRAPH_TMETHODSIGNATURE_EXTENDEDPARAMETERLISTTOTMETHODSIGNATURE_EXTENDEDMETHODNAME_TMETHOD_EXTENDEDPARAMETER_TPARAMETERLIST_EXTENDEDPARAMETERLIST_EXTENDEDPARAMETERLISTTOTPARAMETERLIST_EXTENDEDMETHODNAMETOTMETHOD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TMETHODSIGNATURE_TMETHOD_TPARAMETER_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TMETHODSIGNATURE_TMETHOD_TPARAMETER_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TMETHODSIGNATURE_TMETHOD_TPARAMETER_TPARAMETERLIST = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXTENDEDJAMOPPJAVACONTAINER_TYPEGRAPH_EXTENDEDJAMOPPJAVACONTAINERTOTYPEGRAPH_TMETHODSIGNATURE_EXTENDEDPARAMETERLISTTOTMETHODSIGNATURE_EXTENDEDMETHODNAME_TMETHOD_TPARAMETER_TPARAMETERLIST_EXTENDEDPARAMETERLIST_EXTENDEDPARAMETERLISTTOTPARAMETERLIST_EXTENDEDMETHODNAMETOTMETHOD = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 40</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_40__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 31</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_31__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The number of operations of the '<em>Parameter Create New</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CREATE_NEW_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.ClassDefault <em>Class Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Default</em>'.
	 * @see GravityTGG.Rules.ClassDefault
	 * @generated
	 */
	EClass getClassDefault();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#isAppropriate_FWD(TGGRuntime.Match, org.emftext.language.java.containers.CompilationUnit, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#isAppropriate_FWD(TGGRuntime.Match, org.emftext.language.java.containers.CompilationUnit, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement)
	 * @generated
	 */
	EOperation getClassDefault__IsAppropriate_FWD__Match_CompilationUnit_Class_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getClassDefault__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getClassDefault__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#registerObjectsToMatch_FWD(TGGRuntime.Match, org.emftext.language.java.containers.CompilationUnit, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#registerObjectsToMatch_FWD(TGGRuntime.Match, org.emftext.language.java.containers.CompilationUnit, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement)
	 * @generated
	 */
	EOperation getClassDefault__RegisterObjectsToMatch_FWD__Match_CompilationUnit_Class_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#isAppropriate_solveCsp_FWD(TGGRuntime.Match, org.emftext.language.java.containers.CompilationUnit, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#isAppropriate_solveCsp_FWD(TGGRuntime.Match, org.emftext.language.java.containers.CompilationUnit, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement)
	 * @generated
	 */
	EOperation getClassDefault__IsAppropriate_solveCsp_FWD__Match_CompilationUnit_Class_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getClassDefault__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, org.emftext.language.java.containers.CompilationUnit, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement, GravityTGG.ExtendedJamoppPackageElementToTPackage, TypeGraphBasic.TPackage, TypeGraphBasic.TypeGraph, GravityTGG.ExtendedJamoppJavaContainerToTypeGraph) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, org.emftext.language.java.containers.CompilationUnit, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement, GravityTGG.ExtendedJamoppPackageElementToTPackage, TypeGraphBasic.TPackage, TypeGraphBasic.TypeGraph, GravityTGG.ExtendedJamoppJavaContainerToTypeGraph)
	 * @generated
	 */
	EOperation getClassDefault__IsApplicable_solveCsp_FWD__IsApplicableMatch_CompilationUnit_Class_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement_ExtendedJamoppPackageElementToTPackage_TPackage_TypeGraph_ExtendedJamoppJavaContainerToTypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getClassDefault__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getClassDefault__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getClassDefault__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TPackage, TypeGraphBasic.TypeGraph) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TPackage, TypeGraphBasic.TypeGraph)
	 * @generated
	 */
	EOperation getClassDefault__IsAppropriate_BWD__Match_TClass_TPackage_TypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getClassDefault__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getClassDefault__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TPackage, TypeGraphBasic.TypeGraph) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TPackage, TypeGraphBasic.TypeGraph)
	 * @generated
	 */
	EOperation getClassDefault__RegisterObjectsToMatch_BWD__Match_TClass_TPackage_TypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TPackage, TypeGraphBasic.TypeGraph) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TPackage, TypeGraphBasic.TypeGraph)
	 * @generated
	 */
	EOperation getClassDefault__IsAppropriate_solveCsp_BWD__Match_TClass_TPackage_TypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getClassDefault__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement, GravityTGG.ExtendedJamoppPackageElementToTPackage, TypeGraphBasic.TClass, TypeGraphBasic.TPackage, TypeGraphBasic.TypeGraph, GravityTGG.ExtendedJamoppJavaContainerToTypeGraph) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement, GravityTGG.ExtendedJamoppPackageElementToTPackage, TypeGraphBasic.TClass, TypeGraphBasic.TPackage, TypeGraphBasic.TypeGraph, GravityTGG.ExtendedJamoppJavaContainerToTypeGraph)
	 * @generated
	 */
	EOperation getClassDefault__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement_ExtendedJamoppPackageElementToTPackage_TClass_TPackage_TypeGraph_ExtendedJamoppJavaContainerToTypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getClassDefault__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getClassDefault__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getClassDefault__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#isAppropriate_FWD_EMoflonEdge_0(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 0</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#isAppropriate_FWD_EMoflonEdge_0(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getClassDefault__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#isAppropriate_FWD_EMoflonEdge_1(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#isAppropriate_FWD_EMoflonEdge_1(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getClassDefault__IsAppropriate_FWD_EMoflonEdge_1__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#isAppropriate_FWD_EMoflonEdge_2(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 2</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#isAppropriate_FWD_EMoflonEdge_2(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getClassDefault__IsAppropriate_FWD_EMoflonEdge_2__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#isAppropriate_BWD_EMoflonEdge_0(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 0</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#isAppropriate_BWD_EMoflonEdge_0(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getClassDefault__IsAppropriate_BWD_EMoflonEdge_0__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#isAppropriate_BWD_EMoflonEdge_1(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 1</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#isAppropriate_BWD_EMoflonEdge_1(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getClassDefault__IsAppropriate_BWD_EMoflonEdge_1__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#isAppropriate_BWD_EMoflonEdge_2(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 2</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#isAppropriate_BWD_EMoflonEdge_2(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getClassDefault__IsAppropriate_BWD_EMoflonEdge_2__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getClassDefault__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ClassDefault#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.ClassDefault#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getClassDefault__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.ParameterTypeLibCreate <em>Parameter Type Lib Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type Lib Create</em>'.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate
	 * @generated
	 */
	EClass getParameterTypeLibCreate();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedType) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedType)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__IsAppropriate_FWD__Match_ExtendedParameter_ExtendedType();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedType) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedType)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__RegisterObjectsToMatch_FWD__Match_ExtendedParameter_ExtendedType();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedType) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedType)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__IsAppropriate_solveCsp_FWD__Match_ExtendedParameter_ExtendedType();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedParameter, TypeGraphBasic.TParameter, GravityTGG.ExtendedParameterToTParameter, ExtendedJamopp.ExtendedType, TypeGraphBasic.TypeGraph, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, GravityTGG.ExtendedParameterToTypeGraph, TypeGraphBasic.TParameterList) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedParameter, TypeGraphBasic.TParameter, GravityTGG.ExtendedParameterToTParameter, ExtendedJamopp.ExtendedType, TypeGraphBasic.TypeGraph, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, GravityTGG.ExtendedParameterToTypeGraph, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedParameter_TParameter_ExtendedParameterToTParameter_ExtendedType_TypeGraph_TMethodSignature_TMethod_ExtendedParameterToTypeGraph_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TParameter, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameterList) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TParameter, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__IsAppropriate_BWD__Match_TParameter_TClass_TypeGraph_TMethodSignature_TMethod_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TParameter, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameterList) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TParameter, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__RegisterObjectsToMatch_BWD__Match_TParameter_TClass_TypeGraph_TMethodSignature_TMethod_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TParameter, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameterList) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TParameter, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__IsAppropriate_solveCsp_BWD__Match_TParameter_TClass_TypeGraph_TMethodSignature_TMethod_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedParameter, TypeGraphBasic.TParameter, GravityTGG.ExtendedParameterToTParameter, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, GravityTGG.ExtendedParameterToTypeGraph, TypeGraphBasic.TParameterList) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedParameter, TypeGraphBasic.TParameter, GravityTGG.ExtendedParameterToTParameter, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, GravityTGG.ExtendedParameterToTypeGraph, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExtendedParameter_TParameter_ExtendedParameterToTParameter_TClass_TypeGraph_TMethodSignature_TMethod_ExtendedParameterToTypeGraph_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#isAppropriate_FWD_EMoflonEdge_3(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 3</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#isAppropriate_FWD_EMoflonEdge_3(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__IsAppropriate_FWD_EMoflonEdge_3__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#isAppropriate_BWD_EMoflonEdge_3(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 3</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#isAppropriate_BWD_EMoflonEdge_3(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__IsAppropriate_BWD_EMoflonEdge_3__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#isAppropriate_BWD_EMoflonEdge_4(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 4</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#isAppropriate_BWD_EMoflonEdge_4(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__IsAppropriate_BWD_EMoflonEdge_4__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibCreate#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParameterTypeLibCreate__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.FieldNameExisting <em>Field Name Existing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Name Existing</em>'.
	 * @see GravityTGG.Rules.FieldNameExisting
	 * @generated
	 */
	EClass getFieldNameExisting();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#isAppropriate_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, org.emftext.language.java.members.Field) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#isAppropriate_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, org.emftext.language.java.members.Field)
	 * @generated
	 */
	EOperation getFieldNameExisting__IsAppropriate_FWD__Match_Class_Field();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getFieldNameExisting__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFieldNameExisting__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#registerObjectsToMatch_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, org.emftext.language.java.members.Field) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#registerObjectsToMatch_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, org.emftext.language.java.members.Field)
	 * @generated
	 */
	EOperation getFieldNameExisting__RegisterObjectsToMatch_FWD__Match_Class_Field();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#isAppropriate_solveCsp_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, org.emftext.language.java.members.Field) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#isAppropriate_solveCsp_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, org.emftext.language.java.members.Field)
	 * @generated
	 */
	EOperation getFieldNameExisting__IsAppropriate_solveCsp_FWD__Match_Class_Field();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFieldNameExisting__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, org.emftext.language.java.classifiers.Class, org.emftext.language.java.members.Field, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, GravityTGG.ClassToTClass, TypeGraphBasic.TField) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, org.emftext.language.java.classifiers.Class, org.emftext.language.java.members.Field, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, GravityTGG.ClassToTClass, TypeGraphBasic.TField)
	 * @generated
	 */
	EOperation getFieldNameExisting__IsApplicable_solveCsp_FWD__IsApplicableMatch_Class_Field_TypeGraph_TClass_ClassToTClass_TField();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFieldNameExisting__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFieldNameExisting__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFieldNameExisting__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TField, TypeGraphBasic.TFieldDefinition, TypeGraphBasic.TFieldSignature) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TField, TypeGraphBasic.TFieldDefinition, TypeGraphBasic.TFieldSignature)
	 * @generated
	 */
	EOperation getFieldNameExisting__IsAppropriate_BWD__Match_TypeGraph_TClass_TField_TFieldDefinition_TFieldSignature();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getFieldNameExisting__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFieldNameExisting__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TField, TypeGraphBasic.TFieldDefinition, TypeGraphBasic.TFieldSignature) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TField, TypeGraphBasic.TFieldDefinition, TypeGraphBasic.TFieldSignature)
	 * @generated
	 */
	EOperation getFieldNameExisting__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass_TField_TFieldDefinition_TFieldSignature();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TField, TypeGraphBasic.TFieldDefinition, TypeGraphBasic.TFieldSignature) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TField, TypeGraphBasic.TFieldDefinition, TypeGraphBasic.TFieldSignature)
	 * @generated
	 */
	EOperation getFieldNameExisting__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass_TField_TFieldDefinition_TFieldSignature();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFieldNameExisting__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, GravityTGG.ClassToTClass, TypeGraphBasic.TField, TypeGraphBasic.TFieldDefinition, TypeGraphBasic.TFieldSignature) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, GravityTGG.ClassToTClass, TypeGraphBasic.TField, TypeGraphBasic.TFieldDefinition, TypeGraphBasic.TFieldSignature)
	 * @generated
	 */
	EOperation getFieldNameExisting__IsApplicable_solveCsp_BWD__IsApplicableMatch_Class_TypeGraph_TClass_ClassToTClass_TField_TFieldDefinition_TFieldSignature();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFieldNameExisting__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFieldNameExisting__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFieldNameExisting__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#isAppropriate_FWD_EMoflonEdge_4(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 4</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#isAppropriate_FWD_EMoflonEdge_4(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFieldNameExisting__IsAppropriate_FWD_EMoflonEdge_4__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#isAppropriate_BWD_EMoflonEdge_5(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 5</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 5</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#isAppropriate_BWD_EMoflonEdge_5(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFieldNameExisting__IsAppropriate_BWD_EMoflonEdge_5__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#isAppropriate_BWD_EMoflonEdge_6(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 6</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 6</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#isAppropriate_BWD_EMoflonEdge_6(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFieldNameExisting__IsAppropriate_BWD_EMoflonEdge_6__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#isAppropriate_BWD_EMoflonEdge_7(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 7</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 7</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#isAppropriate_BWD_EMoflonEdge_7(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFieldNameExisting__IsAppropriate_BWD_EMoflonEdge_7__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#isAppropriate_BWD_EMoflonEdge_8(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 8</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 8</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#isAppropriate_BWD_EMoflonEdge_8(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFieldNameExisting__IsAppropriate_BWD_EMoflonEdge_8__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#isAppropriate_BWD_EMoflonEdge_9(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 9</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 9</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#isAppropriate_BWD_EMoflonEdge_9(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFieldNameExisting__IsAppropriate_BWD_EMoflonEdge_9__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#isAppropriate_BWD_EMoflonEdge_10(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 10</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 10</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#isAppropriate_BWD_EMoflonEdge_10(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFieldNameExisting__IsAppropriate_BWD_EMoflonEdge_10__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getFieldNameExisting__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameExisting#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameExisting#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getFieldNameExisting__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.ParameterTypeLibLink <em>Parameter Type Lib Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type Lib Link</em>'.
	 * @see GravityTGG.Rules.ParameterTypeLibLink
	 * @generated
	 */
	EClass getParameterTypeLibLink();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedParameter) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedParameter)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__IsAppropriate_FWD__Match_ExtendedType_ExtendedParameter();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedParameter) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedParameter)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__RegisterObjectsToMatch_FWD__Match_ExtendedType_ExtendedParameter();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedParameter) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedParameter)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__IsAppropriate_solveCsp_FWD__Match_ExtendedType_ExtendedParameter();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TClass, ExtendedJamopp.ExtendedType, TypeGraphBasic.TypeGraph, ExtendedJamopp.ExtendedParameter, TypeGraphBasic.TParameter, GravityTGG.ExtendedParameterToTParameter, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameterList, GravityTGG.ExtendedParameterToTypeGraph) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TClass, ExtendedJamopp.ExtendedType, TypeGraphBasic.TypeGraph, ExtendedJamopp.ExtendedParameter, TypeGraphBasic.TParameter, GravityTGG.ExtendedParameterToTParameter, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameterList, GravityTGG.ExtendedParameterToTypeGraph)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__IsApplicable_solveCsp_FWD__IsApplicableMatch_TClass_ExtendedType_TypeGraph_ExtendedParameter_TParameter_ExtendedParameterToTParameter_TMethodSignature_TMethod_TParameterList_ExtendedParameterToTypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TParameter, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameterList) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TParameter, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__IsAppropriate_BWD__Match_TClass_TypeGraph_TParameter_TMethodSignature_TMethod_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TParameter, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameterList) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TParameter, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__RegisterObjectsToMatch_BWD__Match_TClass_TypeGraph_TParameter_TMethodSignature_TMethod_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TParameter, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameterList) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TParameter, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__IsAppropriate_solveCsp_BWD__Match_TClass_TypeGraph_TParameter_TMethodSignature_TMethod_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, ExtendedJamopp.ExtendedParameter, TypeGraphBasic.TParameter, GravityTGG.ExtendedParameterToTParameter, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameterList, GravityTGG.ExtendedParameterToTypeGraph) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, ExtendedJamopp.ExtendedParameter, TypeGraphBasic.TParameter, GravityTGG.ExtendedParameterToTParameter, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameterList, GravityTGG.ExtendedParameterToTypeGraph)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__IsApplicable_solveCsp_BWD__IsApplicableMatch_TClass_TypeGraph_ExtendedParameter_TParameter_ExtendedParameterToTParameter_TMethodSignature_TMethod_TParameterList_ExtendedParameterToTypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#isAppropriate_FWD_EMoflonEdge_5(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 5</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 5</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#isAppropriate_FWD_EMoflonEdge_5(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__IsAppropriate_FWD_EMoflonEdge_5__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#isAppropriate_BWD_EMoflonEdge_11(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 11</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 11</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#isAppropriate_BWD_EMoflonEdge_11(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__IsAppropriate_BWD_EMoflonEdge_11__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeLibLink#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeLibLink#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParameterTypeLibLink__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.MethodDefinitionLinkSignature <em>Method Definition Link Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Definition Link Signature</em>'.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature
	 * @generated
	 */
	EClass getMethodDefinitionLinkSignature();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedParameterList, ExtendedJamopp.ExtendedJamoppJavaContainer) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedParameterList, ExtendedJamopp.ExtendedJamoppJavaContainer)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__IsAppropriate_FWD__Match_ExtendedClassMethod_ExtendedMethodName_ExtendedParameterList_ExtendedJamoppJavaContainer();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedParameterList, ExtendedJamopp.ExtendedJamoppJavaContainer) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedParameterList, ExtendedJamopp.ExtendedJamoppJavaContainer)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__RegisterObjectsToMatch_FWD__Match_ExtendedClassMethod_ExtendedMethodName_ExtendedParameterList_ExtendedJamoppJavaContainer();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedParameterList, ExtendedJamopp.ExtendedJamoppJavaContainer) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedParameterList, ExtendedJamopp.ExtendedJamoppJavaContainer)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__IsAppropriate_solveCsp_FWD__Match_ExtendedClassMethod_ExtendedMethodName_ExtendedParameterList_ExtendedJamoppJavaContainer();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedClassMethod, TypeGraphBasic.TMethodSignature, GravityTGG.ClassMethodToTMethodSignature, ExtendedJamopp.ExtendedMethodName, TypeGraphBasic.TMethod, GravityTGG.ExtendedMethodNameToTMethod, ExtendedJamopp.ExtendedParameterList, GravityTGG.ExtendedParameterListToTMethodSignature, ExtendedJamopp.ExtendedJamoppJavaContainer) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedClassMethod, TypeGraphBasic.TMethodSignature, GravityTGG.ClassMethodToTMethodSignature, ExtendedJamopp.ExtendedMethodName, TypeGraphBasic.TMethod, GravityTGG.ExtendedMethodNameToTMethod, ExtendedJamopp.ExtendedParameterList, GravityTGG.ExtendedParameterListToTMethodSignature, ExtendedJamopp.ExtendedJamoppJavaContainer)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedClassMethod_TMethodSignature_ClassMethodToTMethodSignature_ExtendedMethodName_TMethod_ExtendedMethodNameToTMethod_ExtendedParameterList_ExtendedParameterListToTMethodSignature_ExtendedJamoppJavaContainer();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__IsAppropriate_BWD__Match_TMethodSignature_TMethod();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__RegisterObjectsToMatch_BWD__Match_TMethodSignature_TMethod();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__IsAppropriate_solveCsp_BWD__Match_TMethodSignature_TMethod();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedClassMethod, TypeGraphBasic.TMethodSignature, GravityTGG.ClassMethodToTMethodSignature, ExtendedJamopp.ExtendedMethodName, TypeGraphBasic.TMethod, GravityTGG.ExtendedMethodNameToTMethod, ExtendedJamopp.ExtendedParameterList, GravityTGG.ExtendedParameterListToTMethodSignature, ExtendedJamopp.ExtendedJamoppJavaContainer) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedClassMethod, TypeGraphBasic.TMethodSignature, GravityTGG.ClassMethodToTMethodSignature, ExtendedJamopp.ExtendedMethodName, TypeGraphBasic.TMethod, GravityTGG.ExtendedMethodNameToTMethod, ExtendedJamopp.ExtendedParameterList, GravityTGG.ExtendedParameterListToTMethodSignature, ExtendedJamopp.ExtendedJamoppJavaContainer)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExtendedClassMethod_TMethodSignature_ClassMethodToTMethodSignature_ExtendedMethodName_TMethod_ExtendedMethodNameToTMethod_ExtendedParameterList_ExtendedParameterListToTMethodSignature_ExtendedJamoppJavaContainer();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_FWD_EMoflonEdge_6(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 6</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 6</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_FWD_EMoflonEdge_6(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__IsAppropriate_FWD_EMoflonEdge_6__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_FWD_EMoflonEdge_7(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 7</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 7</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_FWD_EMoflonEdge_7(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__IsAppropriate_FWD_EMoflonEdge_7__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_BWD_EMoflonEdge_12(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 12</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 12</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_BWD_EMoflonEdge_12(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__IsAppropriate_BWD_EMoflonEdge_12__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_BWD_EMoflonEdge_13(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 13</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 13</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_BWD_EMoflonEdge_13(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__IsAppropriate_BWD_EMoflonEdge_13__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_FWD_EMoflonEdge_8(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 8</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 8</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#isAppropriate_FWD_EMoflonEdge_8(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__IsAppropriate_FWD_EMoflonEdge_8__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodDefinitionLinkSignature#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getMethodDefinitionLinkSignature__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.MethodLinkClass <em>Method Link Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Link Class</em>'.
	 * @see GravityTGG.Rules.MethodLinkClass
	 * @generated
	 */
	EClass getMethodLinkClass();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedParameterList) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getMethodLinkClass__IsAppropriate_FWD__Match_ExtendedClassMethod_Class_ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getMethodLinkClass__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getMethodLinkClass__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedParameterList) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getMethodLinkClass__RegisterObjectsToMatch_FWD__Match_ExtendedClassMethod_Class_ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedParameterList) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getMethodLinkClass__IsAppropriate_solveCsp_FWD__Match_ExtendedClassMethod_Class_ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getMethodLinkClass__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TMethodDefinition, ExtendedJamopp.ExtendedClassMethod, TypeGraphBasic.TMethodSignature, GravityTGG.ClassMethodToTMethodSignature, GravityTGG.ClassMethodToTMethodDefinition, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TClass, GravityTGG.ClassToTClass, ExtendedJamopp.ExtendedParameterList, GravityTGG.ExtendedParameterListToTMethodSignature) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TMethodDefinition, ExtendedJamopp.ExtendedClassMethod, TypeGraphBasic.TMethodSignature, GravityTGG.ClassMethodToTMethodSignature, GravityTGG.ClassMethodToTMethodDefinition, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TClass, GravityTGG.ClassToTClass, ExtendedJamopp.ExtendedParameterList, GravityTGG.ExtendedParameterListToTMethodSignature)
	 * @generated
	 */
	EOperation getMethodLinkClass__IsApplicable_solveCsp_FWD__IsApplicableMatch_TMethodDefinition_ExtendedClassMethod_TMethodSignature_ClassMethodToTMethodSignature_ClassMethodToTMethodDefinition_Class_TClass_ClassToTClass_ExtendedParameterList_ExtendedParameterListToTMethodSignature();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getMethodLinkClass__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMethodLinkClass__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getMethodLinkClass__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TClass) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TClass)
	 * @generated
	 */
	EOperation getMethodLinkClass__IsAppropriate_BWD__Match_TMethodDefinition_TMethodSignature_TClass();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getMethodLinkClass__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getMethodLinkClass__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TClass) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TClass)
	 * @generated
	 */
	EOperation getMethodLinkClass__RegisterObjectsToMatch_BWD__Match_TMethodDefinition_TMethodSignature_TClass();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TClass) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TClass)
	 * @generated
	 */
	EOperation getMethodLinkClass__IsAppropriate_solveCsp_BWD__Match_TMethodDefinition_TMethodSignature_TClass();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getMethodLinkClass__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TMethodDefinition, ExtendedJamopp.ExtendedClassMethod, TypeGraphBasic.TMethodSignature, GravityTGG.ClassMethodToTMethodSignature, GravityTGG.ClassMethodToTMethodDefinition, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TClass, GravityTGG.ClassToTClass, ExtendedJamopp.ExtendedParameterList, GravityTGG.ExtendedParameterListToTMethodSignature) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TMethodDefinition, ExtendedJamopp.ExtendedClassMethod, TypeGraphBasic.TMethodSignature, GravityTGG.ClassMethodToTMethodSignature, GravityTGG.ClassMethodToTMethodDefinition, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TClass, GravityTGG.ClassToTClass, ExtendedJamopp.ExtendedParameterList, GravityTGG.ExtendedParameterListToTMethodSignature)
	 * @generated
	 */
	EOperation getMethodLinkClass__IsApplicable_solveCsp_BWD__IsApplicableMatch_TMethodDefinition_ExtendedClassMethod_TMethodSignature_ClassMethodToTMethodSignature_ClassMethodToTMethodDefinition_Class_TClass_ClassToTClass_ExtendedParameterList_ExtendedParameterListToTMethodSignature();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getMethodLinkClass__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMethodLinkClass__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getMethodLinkClass__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#isAppropriate_FWD_EMoflonEdge_9(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 9</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 9</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#isAppropriate_FWD_EMoflonEdge_9(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getMethodLinkClass__IsAppropriate_FWD_EMoflonEdge_9__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#isAppropriate_BWD_EMoflonEdge_14(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 14</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 14</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#isAppropriate_BWD_EMoflonEdge_14(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getMethodLinkClass__IsAppropriate_BWD_EMoflonEdge_14__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#isAppropriate_BWD_EMoflonEdge_15(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 15</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 15</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#isAppropriate_BWD_EMoflonEdge_15(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getMethodLinkClass__IsAppropriate_BWD_EMoflonEdge_15__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getMethodLinkClass__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodLinkClass#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodLinkClass#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getMethodLinkClass__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see GravityTGG.Rules.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#isAppropriate_FWD(TGGRuntime.Match, org.emftext.language.java.types.ClassifierReference, org.emftext.language.java.classifiers.Class, org.emftext.language.java.classifiers.Class, org.emftext.language.java.types.NamespaceClassifierReference) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#isAppropriate_FWD(TGGRuntime.Match, org.emftext.language.java.types.ClassifierReference, org.emftext.language.java.classifiers.Class, org.emftext.language.java.classifiers.Class, org.emftext.language.java.types.NamespaceClassifierReference)
	 * @generated
	 */
	EOperation getInheritance__IsAppropriate_FWD__Match_ClassifierReference_Class_Class_NamespaceClassifierReference();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getInheritance__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getInheritance__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#registerObjectsToMatch_FWD(TGGRuntime.Match, org.emftext.language.java.types.ClassifierReference, org.emftext.language.java.classifiers.Class, org.emftext.language.java.classifiers.Class, org.emftext.language.java.types.NamespaceClassifierReference) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#registerObjectsToMatch_FWD(TGGRuntime.Match, org.emftext.language.java.types.ClassifierReference, org.emftext.language.java.classifiers.Class, org.emftext.language.java.classifiers.Class, org.emftext.language.java.types.NamespaceClassifierReference)
	 * @generated
	 */
	EOperation getInheritance__RegisterObjectsToMatch_FWD__Match_ClassifierReference_Class_Class_NamespaceClassifierReference();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#isAppropriate_solveCsp_FWD(TGGRuntime.Match, org.emftext.language.java.types.ClassifierReference, org.emftext.language.java.classifiers.Class, org.emftext.language.java.classifiers.Class, org.emftext.language.java.types.NamespaceClassifierReference) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#isAppropriate_solveCsp_FWD(TGGRuntime.Match, org.emftext.language.java.types.ClassifierReference, org.emftext.language.java.classifiers.Class, org.emftext.language.java.classifiers.Class, org.emftext.language.java.types.NamespaceClassifierReference)
	 * @generated
	 */
	EOperation getInheritance__IsAppropriate_solveCsp_FWD__Match_ClassifierReference_Class_Class_NamespaceClassifierReference();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getInheritance__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, org.emftext.language.java.types.ClassifierReference, org.emftext.language.java.classifiers.Class, GravityTGG.ClassToTClass, org.emftext.language.java.classifiers.Class, GravityTGG.ClassToTClass, org.emftext.language.java.types.NamespaceClassifierReference, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TClass) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, org.emftext.language.java.types.ClassifierReference, org.emftext.language.java.classifiers.Class, GravityTGG.ClassToTClass, org.emftext.language.java.classifiers.Class, GravityTGG.ClassToTClass, org.emftext.language.java.types.NamespaceClassifierReference, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TClass)
	 * @generated
	 */
	EOperation getInheritance__IsApplicable_solveCsp_FWD__IsApplicableMatch_ClassifierReference_Class_ClassToTClass_Class_ClassToTClass_NamespaceClassifierReference_TypeGraph_TClass_TClass();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getInheritance__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getInheritance__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getInheritance__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TClass) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TClass)
	 * @generated
	 */
	EOperation getInheritance__IsAppropriate_BWD__Match_TypeGraph_TClass_TClass();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getInheritance__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getInheritance__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TClass) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TClass)
	 * @generated
	 */
	EOperation getInheritance__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass_TClass();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TClass) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TClass)
	 * @generated
	 */
	EOperation getInheritance__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass_TClass();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getInheritance__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, org.emftext.language.java.classifiers.Class, GravityTGG.ClassToTClass, org.emftext.language.java.classifiers.Class, GravityTGG.ClassToTClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TClass) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, org.emftext.language.java.classifiers.Class, GravityTGG.ClassToTClass, org.emftext.language.java.classifiers.Class, GravityTGG.ClassToTClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TClass)
	 * @generated
	 */
	EOperation getInheritance__IsApplicable_solveCsp_BWD__IsApplicableMatch_Class_ClassToTClass_Class_ClassToTClass_TypeGraph_TClass_TClass();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getInheritance__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getInheritance__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getInheritance__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#isAppropriate_FWD_EMoflonEdge_10(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 10</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 10</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#isAppropriate_FWD_EMoflonEdge_10(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getInheritance__IsAppropriate_FWD_EMoflonEdge_10__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#isAppropriate_FWD_EMoflonEdge_11(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 11</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 11</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#isAppropriate_FWD_EMoflonEdge_11(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getInheritance__IsAppropriate_FWD_EMoflonEdge_11__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#isAppropriate_FWD_EMoflonEdge_12(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 12</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 12</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#isAppropriate_FWD_EMoflonEdge_12(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getInheritance__IsAppropriate_FWD_EMoflonEdge_12__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#isAppropriate_BWD_EMoflonEdge_16(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 16</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 16</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#isAppropriate_BWD_EMoflonEdge_16(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getInheritance__IsAppropriate_BWD_EMoflonEdge_16__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#isAppropriate_BWD_EMoflonEdge_17(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 17</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 17</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#isAppropriate_BWD_EMoflonEdge_17(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getInheritance__IsAppropriate_BWD_EMoflonEdge_17__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getInheritance__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Inheritance#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.Inheritance#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getInheritance__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.ParameterListLinkFirst <em>Parameter List Link First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter List Link First</em>'.
	 * @see GravityTGG.Rules.ParameterListLinkFirst
	 * @generated
	 */
	EClass getParameterListLinkFirst();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameterList) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__IsAppropriate_FWD__Match_ExtendedParameter_ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameterList) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__RegisterObjectsToMatch_FWD__Match_ExtendedParameter_ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameterList) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__IsAppropriate_solveCsp_FWD__Match_ExtendedParameter_ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameterList, GravityTGG.ExtendedParameterListToTParameterList, GravityTGG.ExtendedParameterToTParameter, TypeGraphBasic.TParameter, TypeGraphBasic.TParameterList) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameterList, GravityTGG.ExtendedParameterListToTParameterList, GravityTGG.ExtendedParameterToTParameter, TypeGraphBasic.TParameter, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedParameter_ExtendedParameterList_ExtendedParameterListToTParameterList_ExtendedParameterToTParameter_TParameter_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TParameter, TypeGraphBasic.TParameterList) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TParameter, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__IsAppropriate_BWD__Match_TParameter_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TParameter, TypeGraphBasic.TParameterList) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TParameter, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__RegisterObjectsToMatch_BWD__Match_TParameter_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TParameter, TypeGraphBasic.TParameterList) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TParameter, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__IsAppropriate_solveCsp_BWD__Match_TParameter_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameterList, GravityTGG.ExtendedParameterListToTParameterList, GravityTGG.ExtendedParameterToTParameter, TypeGraphBasic.TParameter, TypeGraphBasic.TParameterList) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameterList, GravityTGG.ExtendedParameterListToTParameterList, GravityTGG.ExtendedParameterToTParameter, TypeGraphBasic.TParameter, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExtendedParameter_ExtendedParameterList_ExtendedParameterListToTParameterList_ExtendedParameterToTParameter_TParameter_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#isAppropriate_FWD_EMoflonEdge_13(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 13</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 13</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#isAppropriate_FWD_EMoflonEdge_13(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__IsAppropriate_FWD_EMoflonEdge_13__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#isAppropriate_BWD_EMoflonEdge_18(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 18</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 18</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#isAppropriate_BWD_EMoflonEdge_18(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__IsAppropriate_BWD_EMoflonEdge_18__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterListLinkFirst#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterListLinkFirst#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParameterListLinkFirst__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.ParameterTypeUserDefined <em>Parameter Type User Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type User Defined</em>'.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined
	 * @generated
	 */
	EClass getParameterTypeUserDefined();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedParameter, org.emftext.language.java.classifiers.Class) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedParameter, org.emftext.language.java.classifiers.Class)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__IsAppropriate_FWD__Match_ExtendedType_ExtendedParameter_Class();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedParameter, org.emftext.language.java.classifiers.Class) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedParameter, org.emftext.language.java.classifiers.Class)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__RegisterObjectsToMatch_FWD__Match_ExtendedType_ExtendedParameter_Class();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedParameter, org.emftext.language.java.classifiers.Class) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedParameter, org.emftext.language.java.classifiers.Class)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__IsAppropriate_solveCsp_FWD__Match_ExtendedType_ExtendedParameter_Class();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TClass, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedParameter, TypeGraphBasic.TParameter, GravityTGG.ExtendedParameterToTParameter, org.emftext.language.java.classifiers.Class, GravityTGG.ClassToTClass) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TClass, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedParameter, TypeGraphBasic.TParameter, GravityTGG.ExtendedParameterToTParameter, org.emftext.language.java.classifiers.Class, GravityTGG.ClassToTClass)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__IsApplicable_solveCsp_FWD__IsApplicableMatch_TClass_ExtendedType_ExtendedParameter_TParameter_ExtendedParameterToTParameter_Class_ClassToTClass();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TParameter) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TParameter)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__IsAppropriate_BWD__Match_TClass_TParameter();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TParameter) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TParameter)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__RegisterObjectsToMatch_BWD__Match_TClass_TParameter();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TParameter) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TParameter)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__IsAppropriate_solveCsp_BWD__Match_TClass_TParameter();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TClass, ExtendedJamopp.ExtendedParameter, TypeGraphBasic.TParameter, GravityTGG.ExtendedParameterToTParameter, org.emftext.language.java.classifiers.Class, GravityTGG.ClassToTClass) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TClass, ExtendedJamopp.ExtendedParameter, TypeGraphBasic.TParameter, GravityTGG.ExtendedParameterToTParameter, org.emftext.language.java.classifiers.Class, GravityTGG.ClassToTClass)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__IsApplicable_solveCsp_BWD__IsApplicableMatch_TClass_ExtendedParameter_TParameter_ExtendedParameterToTParameter_Class_ClassToTClass();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#isAppropriate_FWD_EMoflonEdge_14(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 14</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 14</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#isAppropriate_FWD_EMoflonEdge_14(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__IsAppropriate_FWD_EMoflonEdge_14__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#isAppropriate_FWD_EMoflonEdge_15(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 15</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 15</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#isAppropriate_FWD_EMoflonEdge_15(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__IsAppropriate_FWD_EMoflonEdge_15__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#isAppropriate_BWD_EMoflonEdge_19(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 19</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 19</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#isAppropriate_BWD_EMoflonEdge_19(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__IsAppropriate_BWD_EMoflonEdge_19__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterTypeUserDefined#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParameterTypeUserDefined__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.MethodSignatureLinkDefinition <em>Method Signature Link Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Signature Link Definition</em>'.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition
	 * @generated
	 */
	EClass getMethodSignatureLinkDefinition();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedParameterList) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__IsAppropriate_FWD__Match_ExtendedClassMethod_ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedParameterList) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__RegisterObjectsToMatch_FWD__Match_ExtendedClassMethod_ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedParameterList) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__IsAppropriate_solveCsp_FWD__Match_ExtendedClassMethod_ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedParameterList, TypeGraphBasic.TMethodDefinition, GravityTGG.ClassMethodToTMethodDefinition, GravityTGG.ExtendedParameterListToTParameterList, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TParameterList) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedParameterList, TypeGraphBasic.TMethodDefinition, GravityTGG.ClassMethodToTMethodDefinition, GravityTGG.ExtendedParameterListToTParameterList, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedClassMethod_ExtendedParameterList_TMethodDefinition_ClassMethodToTMethodDefinition_ExtendedParameterListToTParameterList_TMethodSignature_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TParameterList) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__IsAppropriate_BWD__Match_TMethodDefinition_TMethodSignature_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TParameterList) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__RegisterObjectsToMatch_BWD__Match_TMethodDefinition_TMethodSignature_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TParameterList) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__IsAppropriate_solveCsp_BWD__Match_TMethodDefinition_TMethodSignature_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedParameterList, TypeGraphBasic.TMethodDefinition, GravityTGG.ClassMethodToTMethodDefinition, GravityTGG.ExtendedParameterListToTParameterList, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TParameterList) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedParameterList, TypeGraphBasic.TMethodDefinition, GravityTGG.ClassMethodToTMethodDefinition, GravityTGG.ExtendedParameterListToTParameterList, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExtendedClassMethod_ExtendedParameterList_TMethodDefinition_ClassMethodToTMethodDefinition_ExtendedParameterListToTParameterList_TMethodSignature_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#isAppropriate_FWD_EMoflonEdge_16(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 16</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 16</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#isAppropriate_FWD_EMoflonEdge_16(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__IsAppropriate_FWD_EMoflonEdge_16__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#isAppropriate_FWD_EMoflonEdge_17(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 17</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 17</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#isAppropriate_FWD_EMoflonEdge_17(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__IsAppropriate_FWD_EMoflonEdge_17__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#isAppropriate_BWD_EMoflonEdge_20(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 20</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 20</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#isAppropriate_BWD_EMoflonEdge_20(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__IsAppropriate_BWD_EMoflonEdge_20__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#isAppropriate_BWD_EMoflonEdge_21(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 21</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 21</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#isAppropriate_BWD_EMoflonEdge_21(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__IsAppropriate_BWD_EMoflonEdge_21__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureLinkDefinition#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getMethodSignatureLinkDefinition__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.ParameterLinkListNext <em>Parameter Link List Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Link List Next</em>'.
	 * @see GravityTGG.Rules.ParameterLinkListNext
	 * @generated
	 */
	EClass getParameterLinkListNext();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameter) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameter)
	 * @generated
	 */
	EOperation getParameterLinkListNext__IsAppropriate_FWD__Match_ExtendedParameter_ExtendedParameter();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParameterLinkListNext__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterLinkListNext__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameter) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameter)
	 * @generated
	 */
	EOperation getParameterLinkListNext__RegisterObjectsToMatch_FWD__Match_ExtendedParameter_ExtendedParameter();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameter) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameter)
	 * @generated
	 */
	EOperation getParameterLinkListNext__IsAppropriate_solveCsp_FWD__Match_ExtendedParameter_ExtendedParameter();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterLinkListNext__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameter, GravityTGG.ExtendedParameterToTParameter, GravityTGG.ExtendedParameterToTParameter, TypeGraphBasic.TParameter, TypeGraphBasic.TParameter) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameter, GravityTGG.ExtendedParameterToTParameter, GravityTGG.ExtendedParameterToTParameter, TypeGraphBasic.TParameter, TypeGraphBasic.TParameter)
	 * @generated
	 */
	EOperation getParameterLinkListNext__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedParameter_ExtendedParameter_ExtendedParameterToTParameter_ExtendedParameterToTParameter_TParameter_TParameter();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterLinkListNext__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParameterLinkListNext__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterLinkListNext__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TParameter, TypeGraphBasic.TParameter) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TParameter, TypeGraphBasic.TParameter)
	 * @generated
	 */
	EOperation getParameterLinkListNext__IsAppropriate_BWD__Match_TParameter_TParameter();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParameterLinkListNext__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterLinkListNext__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TParameter, TypeGraphBasic.TParameter) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TParameter, TypeGraphBasic.TParameter)
	 * @generated
	 */
	EOperation getParameterLinkListNext__RegisterObjectsToMatch_BWD__Match_TParameter_TParameter();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TParameter, TypeGraphBasic.TParameter) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TParameter, TypeGraphBasic.TParameter)
	 * @generated
	 */
	EOperation getParameterLinkListNext__IsAppropriate_solveCsp_BWD__Match_TParameter_TParameter();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterLinkListNext__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameter, GravityTGG.ExtendedParameterToTParameter, GravityTGG.ExtendedParameterToTParameter, TypeGraphBasic.TParameter, TypeGraphBasic.TParameter) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameter, GravityTGG.ExtendedParameterToTParameter, GravityTGG.ExtendedParameterToTParameter, TypeGraphBasic.TParameter, TypeGraphBasic.TParameter)
	 * @generated
	 */
	EOperation getParameterLinkListNext__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExtendedParameter_ExtendedParameter_ExtendedParameterToTParameter_ExtendedParameterToTParameter_TParameter_TParameter();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterLinkListNext__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParameterLinkListNext__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterLinkListNext__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#isAppropriate_FWD_EMoflonEdge_18(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 18</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 18</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#isAppropriate_FWD_EMoflonEdge_18(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParameterLinkListNext__IsAppropriate_FWD_EMoflonEdge_18__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#isAppropriate_FWD_EMoflonEdge_19(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 19</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 19</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#isAppropriate_FWD_EMoflonEdge_19(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParameterLinkListNext__IsAppropriate_FWD_EMoflonEdge_19__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#isAppropriate_BWD_EMoflonEdge_22(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 22</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 22</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#isAppropriate_BWD_EMoflonEdge_22(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParameterLinkListNext__IsAppropriate_BWD_EMoflonEdge_22__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#isAppropriate_BWD_EMoflonEdge_23(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 23</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 23</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#isAppropriate_BWD_EMoflonEdge_23(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParameterLinkListNext__IsAppropriate_BWD_EMoflonEdge_23__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParameterLinkListNext__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterLinkListNext#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterLinkListNext#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParameterLinkListNext__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.FieldNameCreate <em>Field Name Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Name Create</em>'.
	 * @see GravityTGG.Rules.FieldNameCreate
	 * @generated
	 */
	EClass getFieldNameCreate();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#isAppropriate_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, org.emftext.language.java.members.Field) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#isAppropriate_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, org.emftext.language.java.members.Field)
	 * @generated
	 */
	EOperation getFieldNameCreate__IsAppropriate_FWD__Match_Class_Field();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getFieldNameCreate__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFieldNameCreate__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#registerObjectsToMatch_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, org.emftext.language.java.members.Field) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#registerObjectsToMatch_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, org.emftext.language.java.members.Field)
	 * @generated
	 */
	EOperation getFieldNameCreate__RegisterObjectsToMatch_FWD__Match_Class_Field();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#isAppropriate_solveCsp_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, org.emftext.language.java.members.Field) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#isAppropriate_solveCsp_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, org.emftext.language.java.members.Field)
	 * @generated
	 */
	EOperation getFieldNameCreate__IsAppropriate_solveCsp_FWD__Match_Class_Field();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFieldNameCreate__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TClass, org.emftext.language.java.members.Field, TypeGraphBasic.TypeGraph, GravityTGG.ClassToTClass) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TClass, org.emftext.language.java.members.Field, TypeGraphBasic.TypeGraph, GravityTGG.ClassToTClass)
	 * @generated
	 */
	EOperation getFieldNameCreate__IsApplicable_solveCsp_FWD__IsApplicableMatch_Class_TClass_Field_TypeGraph_ClassToTClass();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFieldNameCreate__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFieldNameCreate__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFieldNameCreate__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TFieldSignature, TypeGraphBasic.TFieldDefinition, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TField) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TFieldSignature, TypeGraphBasic.TFieldDefinition, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TField)
	 * @generated
	 */
	EOperation getFieldNameCreate__IsAppropriate_BWD__Match_TFieldSignature_TFieldDefinition_TClass_TypeGraph_TField();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getFieldNameCreate__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFieldNameCreate__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TFieldSignature, TypeGraphBasic.TFieldDefinition, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TField) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TFieldSignature, TypeGraphBasic.TFieldDefinition, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TField)
	 * @generated
	 */
	EOperation getFieldNameCreate__RegisterObjectsToMatch_BWD__Match_TFieldSignature_TFieldDefinition_TClass_TypeGraph_TField();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TFieldSignature, TypeGraphBasic.TFieldDefinition, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TField) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TFieldSignature, TypeGraphBasic.TFieldDefinition, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TField)
	 * @generated
	 */
	EOperation getFieldNameCreate__IsAppropriate_solveCsp_BWD__Match_TFieldSignature_TFieldDefinition_TClass_TypeGraph_TField();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFieldNameCreate__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TFieldSignature, TypeGraphBasic.TFieldDefinition, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TField, GravityTGG.ClassToTClass) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TFieldSignature, TypeGraphBasic.TFieldDefinition, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TField, GravityTGG.ClassToTClass)
	 * @generated
	 */
	EOperation getFieldNameCreate__IsApplicable_solveCsp_BWD__IsApplicableMatch_TFieldSignature_TFieldDefinition_Class_TClass_TypeGraph_TField_ClassToTClass();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getFieldNameCreate__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFieldNameCreate__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getFieldNameCreate__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#isAppropriate_BWD_EMoflonEdge_24(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 24</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 24</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#isAppropriate_BWD_EMoflonEdge_24(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFieldNameCreate__IsAppropriate_BWD_EMoflonEdge_24__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#isAppropriate_BWD_EMoflonEdge_25(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 25</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 25</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#isAppropriate_BWD_EMoflonEdge_25(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFieldNameCreate__IsAppropriate_BWD_EMoflonEdge_25__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#isAppropriate_BWD_EMoflonEdge_26(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 26</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 26</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#isAppropriate_BWD_EMoflonEdge_26(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFieldNameCreate__IsAppropriate_BWD_EMoflonEdge_26__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#isAppropriate_BWD_EMoflonEdge_27(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 27</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 27</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#isAppropriate_BWD_EMoflonEdge_27(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFieldNameCreate__IsAppropriate_BWD_EMoflonEdge_27__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#isAppropriate_FWD_EMoflonEdge_20(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 20</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 20</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#isAppropriate_FWD_EMoflonEdge_20(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFieldNameCreate__IsAppropriate_FWD_EMoflonEdge_20__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#isAppropriate_BWD_EMoflonEdge_28(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 28</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 28</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#isAppropriate_BWD_EMoflonEdge_28(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFieldNameCreate__IsAppropriate_BWD_EMoflonEdge_28__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#isAppropriate_BWD_EMoflonEdge_29(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 29</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 29</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#isAppropriate_BWD_EMoflonEdge_29(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFieldNameCreate__IsAppropriate_BWD_EMoflonEdge_29__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#isAppropriate_BWD_EMoflonEdge_30(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 30</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 30</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#isAppropriate_BWD_EMoflonEdge_30(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFieldNameCreate__IsAppropriate_BWD_EMoflonEdge_30__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getFieldNameCreate__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.FieldNameCreate#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.FieldNameCreate#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getFieldNameCreate__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.MethodNameCreate <em>Method Name Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Name Create</em>'.
	 * @see GravityTGG.Rules.MethodNameCreate
	 * @generated
	 */
	EClass getMethodNameCreate();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedJamoppJavaContainer) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedJamoppJavaContainer)
	 * @generated
	 */
	EOperation getMethodNameCreate__IsAppropriate_FWD__Match_ExtendedMethodName_ExtendedJamoppJavaContainer();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getMethodNameCreate__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getMethodNameCreate__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedJamoppJavaContainer) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedJamoppJavaContainer)
	 * @generated
	 */
	EOperation getMethodNameCreate__RegisterObjectsToMatch_FWD__Match_ExtendedMethodName_ExtendedJamoppJavaContainer();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedJamoppJavaContainer) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedJamoppJavaContainer)
	 * @generated
	 */
	EOperation getMethodNameCreate__IsAppropriate_solveCsp_FWD__Match_ExtendedMethodName_ExtendedJamoppJavaContainer();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getMethodNameCreate__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedMethodName, TypeGraphBasic.TypeGraph, ExtendedJamopp.ExtendedJamoppJavaContainer, GravityTGG.ExtendedJamoppJavaContainerToTypeGraph) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedMethodName, TypeGraphBasic.TypeGraph, ExtendedJamopp.ExtendedJamoppJavaContainer, GravityTGG.ExtendedJamoppJavaContainerToTypeGraph)
	 * @generated
	 */
	EOperation getMethodNameCreate__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedMethodName_TypeGraph_ExtendedJamoppJavaContainer_ExtendedJamoppJavaContainerToTypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getMethodNameCreate__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMethodNameCreate__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getMethodNameCreate__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TMethod, TypeGraphBasic.TypeGraph) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TMethod, TypeGraphBasic.TypeGraph)
	 * @generated
	 */
	EOperation getMethodNameCreate__IsAppropriate_BWD__Match_TMethod_TypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getMethodNameCreate__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getMethodNameCreate__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TMethod, TypeGraphBasic.TypeGraph) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TMethod, TypeGraphBasic.TypeGraph)
	 * @generated
	 */
	EOperation getMethodNameCreate__RegisterObjectsToMatch_BWD__Match_TMethod_TypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TMethod, TypeGraphBasic.TypeGraph) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TMethod, TypeGraphBasic.TypeGraph)
	 * @generated
	 */
	EOperation getMethodNameCreate__IsAppropriate_solveCsp_BWD__Match_TMethod_TypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getMethodNameCreate__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TMethod, TypeGraphBasic.TypeGraph, ExtendedJamopp.ExtendedJamoppJavaContainer, GravityTGG.ExtendedJamoppJavaContainerToTypeGraph) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TMethod, TypeGraphBasic.TypeGraph, ExtendedJamopp.ExtendedJamoppJavaContainer, GravityTGG.ExtendedJamoppJavaContainerToTypeGraph)
	 * @generated
	 */
	EOperation getMethodNameCreate__IsApplicable_solveCsp_BWD__IsApplicableMatch_TMethod_TypeGraph_ExtendedJamoppJavaContainer_ExtendedJamoppJavaContainerToTypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getMethodNameCreate__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMethodNameCreate__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getMethodNameCreate__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#isAppropriate_BWD_EMoflonEdge_31(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 31</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 31</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#isAppropriate_BWD_EMoflonEdge_31(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getMethodNameCreate__IsAppropriate_BWD_EMoflonEdge_31__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#isAppropriate_FWD_EMoflonEdge_21(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 21</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 21</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#isAppropriate_FWD_EMoflonEdge_21(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getMethodNameCreate__IsAppropriate_FWD_EMoflonEdge_21__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getMethodNameCreate__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodNameCreate#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodNameCreate#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getMethodNameCreate__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.Class1 <em>Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class1</em>'.
	 * @see GravityTGG.Rules.Class1
	 * @generated
	 */
	EClass getClass1();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_FWD__Match_ExtendedClassMethod();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getClass1__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getClass1__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod)
	 * @generated
	 */
	EOperation getClass1__RegisterObjectsToMatch_FWD__Match_ExtendedClassMethod();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedClassMethod)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_solveCsp_FWD__Match_ExtendedClassMethod();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedClassMethod) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedClassMethod)
	 * @generated
	 */
	EOperation getClass1__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedClassMethod();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getClass1__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getClass1__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getClass1__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_BWD__Match_TMethodDefinition();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getClass1__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getClass1__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition)
	 * @generated
	 */
	EOperation getClass1__RegisterObjectsToMatch_BWD__Match_TMethodDefinition();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_solveCsp_BWD__Match_TMethodDefinition();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TMethodDefinition) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TMethodDefinition)
	 * @generated
	 */
	EOperation getClass1__IsApplicable_solveCsp_BWD__IsApplicableMatch_TMethodDefinition();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getClass1__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getClass1__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getClass1__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#isAppropriate_FWD_ExtendedClassMethod_0(ExtendedJamopp.ExtendedClassMethod) <em>Is Appropriate FWD Extended Class Method 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Extended Class Method 0</em>' operation.
	 * @see GravityTGG.Rules.Class1#isAppropriate_FWD_ExtendedClassMethod_0(ExtendedJamopp.ExtendedClassMethod)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_FWD_ExtendedClassMethod_0__ExtendedClassMethod();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#isAppropriate_BWD_TMethodDefinition_0(TypeGraphBasic.TMethodDefinition) <em>Is Appropriate BWD TMethod Definition 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD TMethod Definition 0</em>' operation.
	 * @see GravityTGG.Rules.Class1#isAppropriate_BWD_TMethodDefinition_0(TypeGraphBasic.TMethodDefinition)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_BWD_TMethodDefinition_0__TMethodDefinition();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getClass1__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.Class1#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.Class1#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getClass1__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.MethodSignatureCreate <em>Method Signature Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Signature Create</em>'.
	 * @see GravityTGG.Rules.MethodSignatureCreate
	 * @generated
	 */
	EClass getMethodSignatureCreate();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameterList) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__IsAppropriate_FWD__Match_ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameterList) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__RegisterObjectsToMatch_FWD__Match_ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameterList) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__IsAppropriate_solveCsp_FWD__Match_ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedParameterList) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TParameterList) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__IsAppropriate_BWD__Match_TMethodSignature_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TParameterList) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__RegisterObjectsToMatch_BWD__Match_TMethodSignature_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TParameterList) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__IsAppropriate_solveCsp_BWD__Match_TMethodSignature_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TParameterList) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__IsApplicable_solveCsp_BWD__IsApplicableMatch_TMethodSignature_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#isAppropriate_FWD_ExtendedParameterList_0(ExtendedJamopp.ExtendedParameterList) <em>Is Appropriate FWD Extended Parameter List 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Extended Parameter List 0</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#isAppropriate_FWD_ExtendedParameterList_0(ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__IsAppropriate_FWD_ExtendedParameterList_0__ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#isAppropriate_BWD_EMoflonEdge_32(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 32</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 32</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#isAppropriate_BWD_EMoflonEdge_32(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__IsAppropriate_BWD_EMoflonEdge_32__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.MethodSignatureCreate#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.MethodSignatureCreate#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getMethodSignatureCreate__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.PackageRoot <em>Package Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Root</em>'.
	 * @see GravityTGG.Rules.PackageRoot
	 * @generated
	 */
	EClass getPackageRoot();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement)
	 * @generated
	 */
	EOperation getPackageRoot__IsAppropriate_FWD__Match_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPackageRoot__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPackageRoot__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement)
	 * @generated
	 */
	EOperation getPackageRoot__RegisterObjectsToMatch_FWD__Match_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement)
	 * @generated
	 */
	EOperation getPackageRoot__IsAppropriate_solveCsp_FWD__Match_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPackageRoot__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement, TypeGraphBasic.TypeGraph, GravityTGG.ExtendedJamoppJavaContainerToTypeGraph) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement, TypeGraphBasic.TypeGraph, GravityTGG.ExtendedJamoppJavaContainerToTypeGraph)
	 * @generated
	 */
	EOperation getPackageRoot__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement_TypeGraph_ExtendedJamoppJavaContainerToTypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPackageRoot__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPackageRoot__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPackageRoot__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TPackage, TypeGraphBasic.TypeGraph) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TPackage, TypeGraphBasic.TypeGraph)
	 * @generated
	 */
	EOperation getPackageRoot__IsAppropriate_BWD__Match_TPackage_TypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPackageRoot__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPackageRoot__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TPackage, TypeGraphBasic.TypeGraph) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TPackage, TypeGraphBasic.TypeGraph)
	 * @generated
	 */
	EOperation getPackageRoot__RegisterObjectsToMatch_BWD__Match_TPackage_TypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TPackage, TypeGraphBasic.TypeGraph) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TPackage, TypeGraphBasic.TypeGraph)
	 * @generated
	 */
	EOperation getPackageRoot__IsAppropriate_solveCsp_BWD__Match_TPackage_TypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPackageRoot__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedJamoppJavaContainer, TypeGraphBasic.TPackage, TypeGraphBasic.TypeGraph, GravityTGG.ExtendedJamoppJavaContainerToTypeGraph) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedJamoppJavaContainer, TypeGraphBasic.TPackage, TypeGraphBasic.TypeGraph, GravityTGG.ExtendedJamoppJavaContainerToTypeGraph)
	 * @generated
	 */
	EOperation getPackageRoot__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExtendedJamoppJavaContainer_TPackage_TypeGraph_ExtendedJamoppJavaContainerToTypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPackageRoot__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPackageRoot__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPackageRoot__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#isAppropriate_FWD_EMoflonEdge_22(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 22</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 22</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#isAppropriate_FWD_EMoflonEdge_22(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPackageRoot__IsAppropriate_FWD_EMoflonEdge_22__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#isAppropriate_FWD_EMoflonEdge_23(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 23</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 23</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#isAppropriate_FWD_EMoflonEdge_23(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPackageRoot__IsAppropriate_FWD_EMoflonEdge_23__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#isAppropriate_BWD_EMoflonEdge_33(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 33</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 33</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#isAppropriate_BWD_EMoflonEdge_33(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPackageRoot__IsAppropriate_BWD_EMoflonEdge_33__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getPackageRoot__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageRoot#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageRoot#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getPackageRoot__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.PackageChild <em>Package Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Child</em>'.
	 * @see GravityTGG.Rules.PackageChild
	 * @generated
	 */
	EClass getPackageChild();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement, ExtendedJamopp.ExtendedJamoppPackageElement) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement, ExtendedJamopp.ExtendedJamoppPackageElement)
	 * @generated
	 */
	EOperation getPackageChild__IsAppropriate_FWD__Match_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement_ExtendedJamoppPackageElement();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPackageChild__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPackageChild__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement, ExtendedJamopp.ExtendedJamoppPackageElement) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement, ExtendedJamopp.ExtendedJamoppPackageElement)
	 * @generated
	 */
	EOperation getPackageChild__RegisterObjectsToMatch_FWD__Match_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement_ExtendedJamoppPackageElement();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement, ExtendedJamopp.ExtendedJamoppPackageElement) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement, ExtendedJamopp.ExtendedJamoppPackageElement)
	 * @generated
	 */
	EOperation getPackageChild__IsAppropriate_solveCsp_FWD__Match_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement_ExtendedJamoppPackageElement();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPackageChild__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement, ExtendedJamopp.ExtendedJamoppPackageElement, TypeGraphBasic.TPackage, GravityTGG.ExtendedJamoppPackageElementToTPackage) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement, ExtendedJamopp.ExtendedJamoppPackageElement, TypeGraphBasic.TPackage, GravityTGG.ExtendedJamoppPackageElementToTPackage)
	 * @generated
	 */
	EOperation getPackageChild__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement_ExtendedJamoppPackageElement_TPackage_ExtendedJamoppPackageElementToTPackage();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPackageChild__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPackageChild__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPackageChild__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TPackage, TypeGraphBasic.TPackage) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TPackage, TypeGraphBasic.TPackage)
	 * @generated
	 */
	EOperation getPackageChild__IsAppropriate_BWD__Match_TPackage_TPackage();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPackageChild__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPackageChild__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TPackage, TypeGraphBasic.TPackage) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TPackage, TypeGraphBasic.TPackage)
	 * @generated
	 */
	EOperation getPackageChild__RegisterObjectsToMatch_BWD__Match_TPackage_TPackage();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TPackage, TypeGraphBasic.TPackage) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TPackage, TypeGraphBasic.TPackage)
	 * @generated
	 */
	EOperation getPackageChild__IsAppropriate_solveCsp_BWD__Match_TPackage_TPackage();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPackageChild__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement, TypeGraphBasic.TPackage, GravityTGG.ExtendedJamoppPackageElementToTPackage, TypeGraphBasic.TPackage) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedJamoppPackageElement, TypeGraphBasic.TPackage, GravityTGG.ExtendedJamoppPackageElementToTPackage, TypeGraphBasic.TPackage)
	 * @generated
	 */
	EOperation getPackageChild__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement_TPackage_ExtendedJamoppPackageElementToTPackage_TPackage();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPackageChild__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPackageChild__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPackageChild__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#isAppropriate_FWD_EMoflonEdge_24(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 24</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 24</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#isAppropriate_FWD_EMoflonEdge_24(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPackageChild__IsAppropriate_FWD_EMoflonEdge_24__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#isAppropriate_FWD_EMoflonEdge_25(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 25</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 25</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#isAppropriate_FWD_EMoflonEdge_25(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPackageChild__IsAppropriate_FWD_EMoflonEdge_25__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#isAppropriate_FWD_EMoflonEdge_26(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 26</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 26</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#isAppropriate_FWD_EMoflonEdge_26(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPackageChild__IsAppropriate_FWD_EMoflonEdge_26__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#isAppropriate_BWD_EMoflonEdge_34(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 34</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 34</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#isAppropriate_BWD_EMoflonEdge_34(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPackageChild__IsAppropriate_BWD_EMoflonEdge_34__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#isAppropriate_BWD_EMoflonEdge_35(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 35</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 35</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#isAppropriate_BWD_EMoflonEdge_35(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPackageChild__IsAppropriate_BWD_EMoflonEdge_35__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getPackageChild__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.PackageChild#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.PackageChild#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getPackageChild__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.ProgramGraphCreate <em>Program Graph Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Graph Create</em>'.
	 * @see GravityTGG.Rules.ProgramGraphCreate
	 * @generated
	 */
	EClass getProgramGraphCreate();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer)
	 * @generated
	 */
	EOperation getProgramGraphCreate__IsAppropriate_FWD__Match_ExtendedJamoppJavaContainer();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getProgramGraphCreate__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getProgramGraphCreate__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer)
	 * @generated
	 */
	EOperation getProgramGraphCreate__RegisterObjectsToMatch_FWD__Match_ExtendedJamoppJavaContainer();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer)
	 * @generated
	 */
	EOperation getProgramGraphCreate__IsAppropriate_solveCsp_FWD__Match_ExtendedJamoppJavaContainer();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getProgramGraphCreate__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedJamoppJavaContainer) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedJamoppJavaContainer)
	 * @generated
	 */
	EOperation getProgramGraphCreate__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedJamoppJavaContainer();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getProgramGraphCreate__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getProgramGraphCreate__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getProgramGraphCreate__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph)
	 * @generated
	 */
	EOperation getProgramGraphCreate__IsAppropriate_BWD__Match_TypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getProgramGraphCreate__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getProgramGraphCreate__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph)
	 * @generated
	 */
	EOperation getProgramGraphCreate__RegisterObjectsToMatch_BWD__Match_TypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph)
	 * @generated
	 */
	EOperation getProgramGraphCreate__IsAppropriate_solveCsp_BWD__Match_TypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getProgramGraphCreate__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TypeGraph) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TypeGraphBasic.TypeGraph)
	 * @generated
	 */
	EOperation getProgramGraphCreate__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getProgramGraphCreate__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getProgramGraphCreate__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getProgramGraphCreate__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#isAppropriate_FWD_ExtendedJamoppJavaContainer_0(ExtendedJamopp.ExtendedJamoppJavaContainer) <em>Is Appropriate FWD Extended Jamopp Java Container 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Extended Jamopp Java Container 0</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#isAppropriate_FWD_ExtendedJamoppJavaContainer_0(ExtendedJamopp.ExtendedJamoppJavaContainer)
	 * @generated
	 */
	EOperation getProgramGraphCreate__IsAppropriate_FWD_ExtendedJamoppJavaContainer_0__ExtendedJamoppJavaContainer();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#isAppropriate_BWD_TypeGraph_0(TypeGraphBasic.TypeGraph) <em>Is Appropriate BWD Type Graph 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD Type Graph 0</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#isAppropriate_BWD_TypeGraph_0(TypeGraphBasic.TypeGraph)
	 * @generated
	 */
	EOperation getProgramGraphCreate__IsAppropriate_BWD_TypeGraph_0__TypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getProgramGraphCreate__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ProgramGraphCreate#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.ProgramGraphCreate#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getProgramGraphCreate__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.ReturnTypeUserDefined <em>Return Type User Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type User Defined</em>'.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined
	 * @generated
	 */
	EClass getReturnTypeUserDefined();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedType, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedParameterList) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedType, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__IsAppropriate_FWD__Match_ExtendedMethodName_ExtendedClassMethod_ExtendedType_Class_ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedType, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedParameterList) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedType, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__RegisterObjectsToMatch_FWD__Match_ExtendedMethodName_ExtendedClassMethod_ExtendedType_Class_ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedType, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedParameterList) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedClassMethod, ExtendedJamopp.ExtendedType, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__IsAppropriate_solveCsp_FWD__Match_ExtendedMethodName_ExtendedClassMethod_ExtendedType_Class_ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedMethodName, TypeGraphBasic.TMethodDefinition, ExtendedJamopp.ExtendedClassMethod, GravityTGG.ClassMethodToTMethodDefinition, ExtendedJamopp.ExtendedType, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TClass, GravityTGG.ClassToTClass, ExtendedJamopp.ExtendedParameterList) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedMethodName, TypeGraphBasic.TMethodDefinition, ExtendedJamopp.ExtendedClassMethod, GravityTGG.ClassMethodToTMethodDefinition, ExtendedJamopp.ExtendedType, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TClass, GravityTGG.ClassToTClass, ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedMethodName_TMethodDefinition_ExtendedClassMethod_ClassMethodToTMethodDefinition_ExtendedType_Class_TClass_ClassToTClass_ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TClass) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TClass)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__IsAppropriate_BWD__Match_TMethodDefinition_TClass();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TClass) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TClass)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__RegisterObjectsToMatch_BWD__Match_TMethodDefinition_TClass();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TClass) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TClass)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__IsAppropriate_solveCsp_BWD__Match_TMethodDefinition_TClass();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedMethodName, TypeGraphBasic.TMethodDefinition, ExtendedJamopp.ExtendedClassMethod, GravityTGG.ClassMethodToTMethodDefinition, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TClass, GravityTGG.ClassToTClass, ExtendedJamopp.ExtendedParameterList) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedMethodName, TypeGraphBasic.TMethodDefinition, ExtendedJamopp.ExtendedClassMethod, GravityTGG.ClassMethodToTMethodDefinition, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TClass, GravityTGG.ClassToTClass, ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExtendedMethodName_TMethodDefinition_ExtendedClassMethod_ClassMethodToTMethodDefinition_Class_TClass_ClassToTClass_ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#isAppropriate_BWD_EMoflonEdge_36(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 36</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 36</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#isAppropriate_BWD_EMoflonEdge_36(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__IsAppropriate_BWD_EMoflonEdge_36__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#isAppropriate_FWD_EMoflonEdge_27(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 27</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 27</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#isAppropriate_FWD_EMoflonEdge_27(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__IsAppropriate_FWD_EMoflonEdge_27__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#isAppropriate_FWD_EMoflonEdge_28(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 28</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 28</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#isAppropriate_FWD_EMoflonEdge_28(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__IsAppropriate_FWD_EMoflonEdge_28__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeUserDefined#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getReturnTypeUserDefined__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.ReturnTypeFromLibCreate <em>Return Type From Lib Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type From Lib Create</em>'.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate
	 * @generated
	 */
	EClass getReturnTypeFromLibCreate();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#isAppropriate_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedClassMethod) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#isAppropriate_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedClassMethod)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__IsAppropriate_FWD__Match_Class_ExtendedType_ExtendedClassMethod();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#registerObjectsToMatch_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedClassMethod) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#registerObjectsToMatch_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedClassMethod)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__RegisterObjectsToMatch_FWD__Match_Class_ExtendedType_ExtendedClassMethod();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#isAppropriate_solveCsp_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedClassMethod) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#isAppropriate_solveCsp_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedClassMethod)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__IsAppropriate_solveCsp_FWD__Match_Class_ExtendedType_ExtendedClassMethod();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TClass, GravityTGG.ClassToTClass, ExtendedJamopp.ExtendedType, TypeGraphBasic.TMethodDefinition, ExtendedJamopp.ExtendedClassMethod, GravityTGG.ClassMethodToTMethodDefinition, TypeGraphBasic.TypeGraph) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TClass, GravityTGG.ClassToTClass, ExtendedJamopp.ExtendedType, TypeGraphBasic.TMethodDefinition, ExtendedJamopp.ExtendedClassMethod, GravityTGG.ClassMethodToTMethodDefinition, TypeGraphBasic.TypeGraph)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__IsApplicable_solveCsp_FWD__IsApplicableMatch_Class_TClass_ClassToTClass_ExtendedType_TMethodDefinition_ExtendedClassMethod_ClassMethodToTMethodDefinition_TypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TClass, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TypeGraph) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TClass, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TypeGraph)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__IsAppropriate_BWD__Match_TClass_TClass_TMethodDefinition_TypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TClass, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TypeGraph) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TClass, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TypeGraph)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__RegisterObjectsToMatch_BWD__Match_TClass_TClass_TMethodDefinition_TypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TClass, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TypeGraph) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TClass, TypeGraphBasic.TMethodDefinition, TypeGraphBasic.TypeGraph)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__IsAppropriate_solveCsp_BWD__Match_TClass_TClass_TMethodDefinition_TypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TClass, GravityTGG.ClassToTClass, TypeGraphBasic.TClass, TypeGraphBasic.TMethodDefinition, ExtendedJamopp.ExtendedClassMethod, GravityTGG.ClassMethodToTMethodDefinition, TypeGraphBasic.TypeGraph) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TClass, GravityTGG.ClassToTClass, TypeGraphBasic.TClass, TypeGraphBasic.TMethodDefinition, ExtendedJamopp.ExtendedClassMethod, GravityTGG.ClassMethodToTMethodDefinition, TypeGraphBasic.TypeGraph)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__IsApplicable_solveCsp_BWD__IsApplicableMatch_Class_TClass_ClassToTClass_TClass_TMethodDefinition_ExtendedClassMethod_ClassMethodToTMethodDefinition_TypeGraph();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#isAppropriate_BWD_EMoflonEdge_37(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 37</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 37</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#isAppropriate_BWD_EMoflonEdge_37(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__IsAppropriate_BWD_EMoflonEdge_37__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#isAppropriate_FWD_EMoflonEdge_29(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 29</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 29</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#isAppropriate_FWD_EMoflonEdge_29(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__IsAppropriate_FWD_EMoflonEdge_29__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#isAppropriate_BWD_EMoflonEdge_38(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 38</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 38</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#isAppropriate_BWD_EMoflonEdge_38(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__IsAppropriate_BWD_EMoflonEdge_38__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibCreate#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getReturnTypeFromLibCreate__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.ReturnTypeFromLibLink <em>Return Type From Lib Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type From Lib Link</em>'.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink
	 * @generated
	 */
	EClass getReturnTypeFromLibLink();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#isAppropriate_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedClassMethod) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#isAppropriate_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedClassMethod)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__IsAppropriate_FWD__Match_Class_ExtendedType_ExtendedClassMethod();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#registerObjectsToMatch_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedClassMethod) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#registerObjectsToMatch_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedClassMethod)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__RegisterObjectsToMatch_FWD__Match_Class_ExtendedType_ExtendedClassMethod();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#isAppropriate_solveCsp_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedClassMethod) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#isAppropriate_solveCsp_FWD(TGGRuntime.Match, org.emftext.language.java.classifiers.Class, ExtendedJamopp.ExtendedType, ExtendedJamopp.ExtendedClassMethod)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__IsAppropriate_solveCsp_FWD__Match_Class_ExtendedType_ExtendedClassMethod();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TClass, GravityTGG.ClassToTClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, ExtendedJamopp.ExtendedType, TypeGraphBasic.TMethodDefinition, ExtendedJamopp.ExtendedClassMethod, GravityTGG.ClassMethodToTMethodDefinition) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TClass, GravityTGG.ClassToTClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, ExtendedJamopp.ExtendedType, TypeGraphBasic.TMethodDefinition, ExtendedJamopp.ExtendedClassMethod, GravityTGG.ClassMethodToTMethodDefinition)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__IsApplicable_solveCsp_FWD__IsApplicableMatch_Class_TClass_ClassToTClass_TypeGraph_TClass_ExtendedType_TMethodDefinition_ExtendedClassMethod_ClassMethodToTMethodDefinition();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TMethodDefinition) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TMethodDefinition)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__IsAppropriate_BWD__Match_TClass_TypeGraph_TClass_TMethodDefinition();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TMethodDefinition) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TMethodDefinition)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__RegisterObjectsToMatch_BWD__Match_TClass_TypeGraph_TClass_TMethodDefinition();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TMethodDefinition) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TMethodDefinition)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__IsAppropriate_solveCsp_BWD__Match_TClass_TypeGraph_TClass_TMethodDefinition();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TClass, GravityTGG.ClassToTClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TMethodDefinition, ExtendedJamopp.ExtendedClassMethod, GravityTGG.ClassMethodToTMethodDefinition) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, org.emftext.language.java.classifiers.Class, TypeGraphBasic.TClass, GravityTGG.ClassToTClass, TypeGraphBasic.TypeGraph, TypeGraphBasic.TClass, TypeGraphBasic.TMethodDefinition, ExtendedJamopp.ExtendedClassMethod, GravityTGG.ClassMethodToTMethodDefinition)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__IsApplicable_solveCsp_BWD__IsApplicableMatch_Class_TClass_ClassToTClass_TypeGraph_TClass_TMethodDefinition_ExtendedClassMethod_ClassMethodToTMethodDefinition();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#isAppropriate_BWD_EMoflonEdge_39(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 39</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 39</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#isAppropriate_BWD_EMoflonEdge_39(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__IsAppropriate_BWD_EMoflonEdge_39__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#isAppropriate_FWD_EMoflonEdge_30(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 30</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 30</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#isAppropriate_FWD_EMoflonEdge_30(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__IsAppropriate_FWD_EMoflonEdge_30__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ReturnTypeFromLibLink#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getReturnTypeFromLibLink__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Rules.ParameterCreateNew <em>Parameter Create New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Create New</em>'.
	 * @see GravityTGG.Rules.ParameterCreateNew
	 * @generated
	 */
	EClass getParameterCreateNew();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameterList) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#isAppropriate_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getParameterCreateNew__IsAppropriate_FWD__Match_ExtendedJamoppJavaContainer_ExtendedMethodName_ExtendedParameter_ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParameterCreateNew__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterCreateNew__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameterList) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#registerObjectsToMatch_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getParameterCreateNew__RegisterObjectsToMatch_FWD__Match_ExtendedJamoppJavaContainer_ExtendedMethodName_ExtendedParameter_ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameterList) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#isAppropriate_solveCsp_FWD(TGGRuntime.Match, ExtendedJamopp.ExtendedJamoppJavaContainer, ExtendedJamopp.ExtendedMethodName, ExtendedJamopp.ExtendedParameter, ExtendedJamopp.ExtendedParameterList)
	 * @generated
	 */
	EOperation getParameterCreateNew__IsAppropriate_solveCsp_FWD__Match_ExtendedJamoppJavaContainer_ExtendedMethodName_ExtendedParameter_ExtendedParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterCreateNew__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedJamoppJavaContainer, TypeGraphBasic.TypeGraph, GravityTGG.ExtendedJamoppJavaContainerToTypeGraph, TypeGraphBasic.TMethodSignature, GravityTGG.ExtendedParameterListToTMethodSignature, ExtendedJamopp.ExtendedMethodName, TypeGraphBasic.TMethod, ExtendedJamopp.ExtendedParameter, TypeGraphBasic.TParameterList, ExtendedJamopp.ExtendedParameterList, GravityTGG.ExtendedParameterListToTParameterList, GravityTGG.ExtendedMethodNameToTMethod) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedJamoppJavaContainer, TypeGraphBasic.TypeGraph, GravityTGG.ExtendedJamoppJavaContainerToTypeGraph, TypeGraphBasic.TMethodSignature, GravityTGG.ExtendedParameterListToTMethodSignature, ExtendedJamopp.ExtendedMethodName, TypeGraphBasic.TMethod, ExtendedJamopp.ExtendedParameter, TypeGraphBasic.TParameterList, ExtendedJamopp.ExtendedParameterList, GravityTGG.ExtendedParameterListToTParameterList, GravityTGG.ExtendedMethodNameToTMethod)
	 * @generated
	 */
	EOperation getParameterCreateNew__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedJamoppJavaContainer_TypeGraph_ExtendedJamoppJavaContainerToTypeGraph_TMethodSignature_ExtendedParameterListToTMethodSignature_ExtendedMethodName_TMethod_ExtendedParameter_TParameterList_ExtendedParameterList_ExtendedParameterListToTParameterList_ExtendedMethodNameToTMethod();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterCreateNew__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParameterCreateNew__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterCreateNew__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameter, TypeGraphBasic.TParameterList) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#isAppropriate_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameter, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getParameterCreateNew__IsAppropriate_BWD__Match_TypeGraph_TMethodSignature_TMethod_TParameter_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParameterCreateNew__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterCreateNew__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameter, TypeGraphBasic.TParameterList) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#registerObjectsToMatch_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameter, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getParameterCreateNew__RegisterObjectsToMatch_BWD__Match_TypeGraph_TMethodSignature_TMethod_TParameter_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameter, TypeGraphBasic.TParameterList) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#isAppropriate_solveCsp_BWD(TGGRuntime.Match, TypeGraphBasic.TypeGraph, TypeGraphBasic.TMethodSignature, TypeGraphBasic.TMethod, TypeGraphBasic.TParameter, TypeGraphBasic.TParameterList)
	 * @generated
	 */
	EOperation getParameterCreateNew__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TMethodSignature_TMethod_TParameter_TParameterList();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterCreateNew__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedJamoppJavaContainer, TypeGraphBasic.TypeGraph, GravityTGG.ExtendedJamoppJavaContainerToTypeGraph, TypeGraphBasic.TMethodSignature, GravityTGG.ExtendedParameterListToTMethodSignature, ExtendedJamopp.ExtendedMethodName, TypeGraphBasic.TMethod, TypeGraphBasic.TParameter, TypeGraphBasic.TParameterList, ExtendedJamopp.ExtendedParameterList, GravityTGG.ExtendedParameterListToTParameterList, GravityTGG.ExtendedMethodNameToTMethod) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, ExtendedJamopp.ExtendedJamoppJavaContainer, TypeGraphBasic.TypeGraph, GravityTGG.ExtendedJamoppJavaContainerToTypeGraph, TypeGraphBasic.TMethodSignature, GravityTGG.ExtendedParameterListToTMethodSignature, ExtendedJamopp.ExtendedMethodName, TypeGraphBasic.TMethod, TypeGraphBasic.TParameter, TypeGraphBasic.TParameterList, ExtendedJamopp.ExtendedParameterList, GravityTGG.ExtendedParameterListToTParameterList, GravityTGG.ExtendedMethodNameToTMethod)
	 * @generated
	 */
	EOperation getParameterCreateNew__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExtendedJamoppJavaContainer_TypeGraph_ExtendedJamoppJavaContainerToTypeGraph_TMethodSignature_ExtendedParameterListToTMethodSignature_ExtendedMethodName_TMethod_TParameter_TParameterList_ExtendedParameterList_ExtendedParameterListToTParameterList_ExtendedMethodNameToTMethod();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParameterCreateNew__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParameterCreateNew__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParameterCreateNew__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#isAppropriate_BWD_EMoflonEdge_40(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 40</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 40</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#isAppropriate_BWD_EMoflonEdge_40(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParameterCreateNew__IsAppropriate_BWD_EMoflonEdge_40__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#isAppropriate_FWD_EMoflonEdge_31(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 31</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 31</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#isAppropriate_FWD_EMoflonEdge_31(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParameterCreateNew__IsAppropriate_FWD_EMoflonEdge_31__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParameterCreateNew__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Rules.ParameterCreateNew#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see GravityTGG.Rules.ParameterCreateNew#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParameterCreateNew__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

} //RulesPackage
