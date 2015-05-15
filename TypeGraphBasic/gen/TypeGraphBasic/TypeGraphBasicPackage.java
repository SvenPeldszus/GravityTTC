/**
 */
package TypeGraphBasic;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see TypeGraphBasic.TypeGraphBasicFactory
 * @model kind="package"
 * @generated
 */
public interface TypeGraphBasicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TypeGraphBasic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TypeGraphBasic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypeGraphBasicPackage eINSTANCE = TypeGraphBasic.impl.TypeGraphBasicPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link TypeGraphBasic.impl.TClassImpl <em>TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TypeGraphBasic.impl.TClassImpl
	 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTClass()
	 * @generated
	 */
	int TCLASS = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__SIGNATURE = 1;

	/**
	 * The feature id for the '<em><b>Defines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__DEFINES = 2;

	/**
	 * The feature id for the '<em><b>Parent Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__PARENT_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Child Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__CHILD_CLASSES = 4;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__TNAME = 5;

	/**
	 * The number of structural features of the '<em>TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TypeGraphBasic.impl.TFieldImpl <em>TField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TypeGraphBasic.impl.TFieldImpl
	 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTField()
	 * @generated
	 */
	int TFIELD = 1;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD__SIGNATURES = 0;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD__TNAME = 1;

	/**
	 * The number of structural features of the '<em>TField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TypeGraphBasic.impl.TMemberImpl <em>TMember</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TypeGraphBasic.impl.TMemberImpl
	 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTMember()
	 * @generated
	 */
	int TMEMBER = 4;

	/**
	 * The feature id for the '<em><b>Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER__ACCESS = 0;

	/**
	 * The number of structural features of the '<em>TMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TypeGraphBasic.impl.TFieldDefinitionImpl <em>TField Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TypeGraphBasic.impl.TFieldDefinitionImpl
	 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTFieldDefinition()
	 * @generated
	 */
	int TFIELD_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__ACCESS = TMEMBER__ACCESS;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__SIGNATURE = TMEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hiding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__HIDING = TMEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hidden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__HIDDEN_BY = TMEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TField Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION_FEATURE_COUNT = TMEMBER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TField Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION_OPERATION_COUNT = TMEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TypeGraphBasic.impl.TSignatureImpl <em>TSignature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TypeGraphBasic.impl.TSignatureImpl
	 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTSignature()
	 * @generated
	 */
	int TSIGNATURE = 11;

	/**
	 * The number of structural features of the '<em>TSignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNATURE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>TSignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TypeGraphBasic.impl.TFieldSignatureImpl <em>TField Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TypeGraphBasic.impl.TFieldSignatureImpl
	 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTFieldSignature()
	 * @generated
	 */
	int TFIELD_SIGNATURE = 3;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE__DEFINITIONS = TSIGNATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE__FIELD = TSIGNATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE__TYPE = TSIGNATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TField Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE_FEATURE_COUNT = TSIGNATURE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TField Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE_OPERATION_COUNT = TSIGNATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TypeGraphBasic.impl.TMethodImpl <em>TMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TypeGraphBasic.impl.TMethodImpl
	 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTMethod()
	 * @generated
	 */
	int TMETHOD = 5;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD__SIGNATURES = 0;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD__TNAME = 1;

	/**
	 * The number of structural features of the '<em>TMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TypeGraphBasic.impl.TMethodDefinitionImpl <em>TMethod Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TypeGraphBasic.impl.TMethodDefinitionImpl
	 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTMethodDefinition()
	 * @generated
	 */
	int TMETHOD_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__ACCESS = TMEMBER__ACCESS;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__SIGNATURE = TMEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Overriding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__OVERRIDING = TMEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Overridden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__OVERRIDDEN_BY = TMEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Overloading</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__OVERLOADING = TMEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Overloaded By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__OVERLOADED_BY = TMEMBER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__RETURN_TYPE = TMEMBER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION_FEATURE_COUNT = TMEMBER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>TMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION_OPERATION_COUNT = TMEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TypeGraphBasic.impl.TMethodSignatureImpl <em>TMethod Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TypeGraphBasic.impl.TMethodSignatureImpl
	 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTMethodSignature()
	 * @generated
	 */
	int TMETHOD_SIGNATURE = 7;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE__METHOD = TSIGNATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Param List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE__PARAM_LIST = TSIGNATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE__DEFINITIONS = TSIGNATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE_FEATURE_COUNT = TSIGNATURE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE_OPERATION_COUNT = TSIGNATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TypeGraphBasic.impl.TPackageImpl <em>TPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TypeGraphBasic.impl.TPackageImpl
	 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTPackage()
	 * @generated
	 */
	int TPACKAGE = 8;

	/**
	 * The feature id for the '<em><b>Contained Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__CONTAINED_CLASSES = 0;

	/**
	 * The feature id for the '<em><b>Subpackage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__SUBPACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__PARENT = 2;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__TNAME = 3;

	/**
	 * The number of structural features of the '<em>TPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TypeGraphBasic.impl.TParameterImpl <em>TParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TypeGraphBasic.impl.TParameterImpl
	 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTParameter()
	 * @generated
	 */
	int TPARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__NEXT = 0;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__PREVIOUS = 1;

	/**
	 * The feature id for the '<em><b>TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__TCLASS = 2;

	/**
	 * The number of structural features of the '<em>TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TypeGraphBasic.impl.TParameterListImpl <em>TParameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TypeGraphBasic.impl.TParameterListImpl
	 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTParameterList()
	 * @generated
	 */
	int TPARAMETER_LIST = 10;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_LIST__ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_LIST__FIRST = 1;

	/**
	 * The number of structural features of the '<em>TParameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TParameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TypeGraphBasic.impl.TypeGraphImpl <em>Type Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TypeGraphBasic.impl.TypeGraphImpl
	 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTypeGraph()
	 * @generated
	 */
	int TYPE_GRAPH = 12;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__PACKAGES = 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__METHODS = 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__FIELDS = 2;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__CLASSES = 3;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__TNAME = 4;

	/**
	 * The number of structural features of the '<em>Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link TypeGraphBasic.TClass <em>TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TClass</em>'.
	 * @see TypeGraphBasic.TClass
	 * @generated
	 */
	EClass getTClass();

	/**
	 * Returns the meta object for the reference '{@link TypeGraphBasic.TClass#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see TypeGraphBasic.TClass#getPackage()
	 * @see #getTClass()
	 * @generated
	 */
	EReference getTClass_Package();

	/**
	 * Returns the meta object for the reference list '{@link TypeGraphBasic.TClass#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signature</em>'.
	 * @see TypeGraphBasic.TClass#getSignature()
	 * @see #getTClass()
	 * @generated
	 */
	EReference getTClass_Signature();

	/**
	 * Returns the meta object for the containment reference list '{@link TypeGraphBasic.TClass#getDefines <em>Defines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defines</em>'.
	 * @see TypeGraphBasic.TClass#getDefines()
	 * @see #getTClass()
	 * @generated
	 */
	EReference getTClass_Defines();

	/**
	 * Returns the meta object for the reference '{@link TypeGraphBasic.TClass#getParentClass <em>Parent Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Class</em>'.
	 * @see TypeGraphBasic.TClass#getParentClass()
	 * @see #getTClass()
	 * @generated
	 */
	EReference getTClass_ParentClass();

	/**
	 * Returns the meta object for the reference list '{@link TypeGraphBasic.TClass#getChildClasses <em>Child Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Classes</em>'.
	 * @see TypeGraphBasic.TClass#getChildClasses()
	 * @see #getTClass()
	 * @generated
	 */
	EReference getTClass_ChildClasses();

	/**
	 * Returns the meta object for the attribute '{@link TypeGraphBasic.TClass#getTName <em>TName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TName</em>'.
	 * @see TypeGraphBasic.TClass#getTName()
	 * @see #getTClass()
	 * @generated
	 */
	EAttribute getTClass_TName();

	/**
	 * Returns the meta object for class '{@link TypeGraphBasic.TField <em>TField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TField</em>'.
	 * @see TypeGraphBasic.TField
	 * @generated
	 */
	EClass getTField();

	/**
	 * Returns the meta object for the containment reference list '{@link TypeGraphBasic.TField#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signatures</em>'.
	 * @see TypeGraphBasic.TField#getSignatures()
	 * @see #getTField()
	 * @generated
	 */
	EReference getTField_Signatures();

	/**
	 * Returns the meta object for the attribute '{@link TypeGraphBasic.TField#getTName <em>TName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TName</em>'.
	 * @see TypeGraphBasic.TField#getTName()
	 * @see #getTField()
	 * @generated
	 */
	EAttribute getTField_TName();

	/**
	 * Returns the meta object for class '{@link TypeGraphBasic.TFieldDefinition <em>TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TField Definition</em>'.
	 * @see TypeGraphBasic.TFieldDefinition
	 * @generated
	 */
	EClass getTFieldDefinition();

	/**
	 * Returns the meta object for the reference '{@link TypeGraphBasic.TFieldDefinition#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature</em>'.
	 * @see TypeGraphBasic.TFieldDefinition#getSignature()
	 * @see #getTFieldDefinition()
	 * @generated
	 */
	EReference getTFieldDefinition_Signature();

	/**
	 * Returns the meta object for the reference '{@link TypeGraphBasic.TFieldDefinition#getHiding <em>Hiding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hiding</em>'.
	 * @see TypeGraphBasic.TFieldDefinition#getHiding()
	 * @see #getTFieldDefinition()
	 * @generated
	 */
	EReference getTFieldDefinition_Hiding();

	/**
	 * Returns the meta object for the reference list '{@link TypeGraphBasic.TFieldDefinition#getHiddenBy <em>Hidden By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hidden By</em>'.
	 * @see TypeGraphBasic.TFieldDefinition#getHiddenBy()
	 * @see #getTFieldDefinition()
	 * @generated
	 */
	EReference getTFieldDefinition_HiddenBy();

	/**
	 * Returns the meta object for class '{@link TypeGraphBasic.TFieldSignature <em>TField Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TField Signature</em>'.
	 * @see TypeGraphBasic.TFieldSignature
	 * @generated
	 */
	EClass getTFieldSignature();

	/**
	 * Returns the meta object for the reference list '{@link TypeGraphBasic.TFieldSignature#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Definitions</em>'.
	 * @see TypeGraphBasic.TFieldSignature#getDefinitions()
	 * @see #getTFieldSignature()
	 * @generated
	 */
	EReference getTFieldSignature_Definitions();

	/**
	 * Returns the meta object for the container reference '{@link TypeGraphBasic.TFieldSignature#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Field</em>'.
	 * @see TypeGraphBasic.TFieldSignature#getField()
	 * @see #getTFieldSignature()
	 * @generated
	 */
	EReference getTFieldSignature_Field();

	/**
	 * Returns the meta object for the reference '{@link TypeGraphBasic.TFieldSignature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see TypeGraphBasic.TFieldSignature#getType()
	 * @see #getTFieldSignature()
	 * @generated
	 */
	EReference getTFieldSignature_Type();

	/**
	 * Returns the meta object for class '{@link TypeGraphBasic.TMember <em>TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMember</em>'.
	 * @see TypeGraphBasic.TMember
	 * @generated
	 */
	EClass getTMember();

	/**
	 * Returns the meta object for the reference list '{@link TypeGraphBasic.TMember#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Access</em>'.
	 * @see TypeGraphBasic.TMember#getAccess()
	 * @see #getTMember()
	 * @generated
	 */
	EReference getTMember_Access();

	/**
	 * Returns the meta object for class '{@link TypeGraphBasic.TMethod <em>TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMethod</em>'.
	 * @see TypeGraphBasic.TMethod
	 * @generated
	 */
	EClass getTMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link TypeGraphBasic.TMethod#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signatures</em>'.
	 * @see TypeGraphBasic.TMethod#getSignatures()
	 * @see #getTMethod()
	 * @generated
	 */
	EReference getTMethod_Signatures();

	/**
	 * Returns the meta object for the attribute '{@link TypeGraphBasic.TMethod#getTName <em>TName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TName</em>'.
	 * @see TypeGraphBasic.TMethod#getTName()
	 * @see #getTMethod()
	 * @generated
	 */
	EAttribute getTMethod_TName();

	/**
	 * Returns the meta object for class '{@link TypeGraphBasic.TMethodDefinition <em>TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMethod Definition</em>'.
	 * @see TypeGraphBasic.TMethodDefinition
	 * @generated
	 */
	EClass getTMethodDefinition();

	/**
	 * Returns the meta object for the reference '{@link TypeGraphBasic.TMethodDefinition#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature</em>'.
	 * @see TypeGraphBasic.TMethodDefinition#getSignature()
	 * @see #getTMethodDefinition()
	 * @generated
	 */
	EReference getTMethodDefinition_Signature();

	/**
	 * Returns the meta object for the reference '{@link TypeGraphBasic.TMethodDefinition#getOverriding <em>Overriding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overriding</em>'.
	 * @see TypeGraphBasic.TMethodDefinition#getOverriding()
	 * @see #getTMethodDefinition()
	 * @generated
	 */
	EReference getTMethodDefinition_Overriding();

	/**
	 * Returns the meta object for the reference list '{@link TypeGraphBasic.TMethodDefinition#getOverriddenBy <em>Overridden By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Overridden By</em>'.
	 * @see TypeGraphBasic.TMethodDefinition#getOverriddenBy()
	 * @see #getTMethodDefinition()
	 * @generated
	 */
	EReference getTMethodDefinition_OverriddenBy();

	/**
	 * Returns the meta object for the reference list '{@link TypeGraphBasic.TMethodDefinition#getOverloading <em>Overloading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Overloading</em>'.
	 * @see TypeGraphBasic.TMethodDefinition#getOverloading()
	 * @see #getTMethodDefinition()
	 * @generated
	 */
	EReference getTMethodDefinition_Overloading();

	/**
	 * Returns the meta object for the reference list '{@link TypeGraphBasic.TMethodDefinition#getOverloadedBy <em>Overloaded By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Overloaded By</em>'.
	 * @see TypeGraphBasic.TMethodDefinition#getOverloadedBy()
	 * @see #getTMethodDefinition()
	 * @generated
	 */
	EReference getTMethodDefinition_OverloadedBy();

	/**
	 * Returns the meta object for the reference '{@link TypeGraphBasic.TMethodDefinition#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see TypeGraphBasic.TMethodDefinition#getReturnType()
	 * @see #getTMethodDefinition()
	 * @generated
	 */
	EReference getTMethodDefinition_ReturnType();

	/**
	 * Returns the meta object for class '{@link TypeGraphBasic.TMethodSignature <em>TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMethod Signature</em>'.
	 * @see TypeGraphBasic.TMethodSignature
	 * @generated
	 */
	EClass getTMethodSignature();

	/**
	 * Returns the meta object for the container reference '{@link TypeGraphBasic.TMethodSignature#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Method</em>'.
	 * @see TypeGraphBasic.TMethodSignature#getMethod()
	 * @see #getTMethodSignature()
	 * @generated
	 */
	EReference getTMethodSignature_Method();

	/**
	 * Returns the meta object for the containment reference '{@link TypeGraphBasic.TMethodSignature#getParamList <em>Param List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param List</em>'.
	 * @see TypeGraphBasic.TMethodSignature#getParamList()
	 * @see #getTMethodSignature()
	 * @generated
	 */
	EReference getTMethodSignature_ParamList();

	/**
	 * Returns the meta object for the reference list '{@link TypeGraphBasic.TMethodSignature#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Definitions</em>'.
	 * @see TypeGraphBasic.TMethodSignature#getDefinitions()
	 * @see #getTMethodSignature()
	 * @generated
	 */
	EReference getTMethodSignature_Definitions();

	/**
	 * Returns the meta object for class '{@link TypeGraphBasic.TPackage <em>TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPackage</em>'.
	 * @see TypeGraphBasic.TPackage
	 * @generated
	 */
	EClass getTPackage();

	/**
	 * Returns the meta object for the reference list '{@link TypeGraphBasic.TPackage#getContainedClasses <em>Contained Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Classes</em>'.
	 * @see TypeGraphBasic.TPackage#getContainedClasses()
	 * @see #getTPackage()
	 * @generated
	 */
	EReference getTPackage_ContainedClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link TypeGraphBasic.TPackage#getSubpackage <em>Subpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subpackage</em>'.
	 * @see TypeGraphBasic.TPackage#getSubpackage()
	 * @see #getTPackage()
	 * @generated
	 */
	EReference getTPackage_Subpackage();

	/**
	 * Returns the meta object for the container reference '{@link TypeGraphBasic.TPackage#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see TypeGraphBasic.TPackage#getParent()
	 * @see #getTPackage()
	 * @generated
	 */
	EReference getTPackage_Parent();

	/**
	 * Returns the meta object for the attribute '{@link TypeGraphBasic.TPackage#getTName <em>TName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TName</em>'.
	 * @see TypeGraphBasic.TPackage#getTName()
	 * @see #getTPackage()
	 * @generated
	 */
	EAttribute getTPackage_TName();

	/**
	 * Returns the meta object for class '{@link TypeGraphBasic.TParameter <em>TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TParameter</em>'.
	 * @see TypeGraphBasic.TParameter
	 * @generated
	 */
	EClass getTParameter();

	/**
	 * Returns the meta object for the reference '{@link TypeGraphBasic.TParameter#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see TypeGraphBasic.TParameter#getNext()
	 * @see #getTParameter()
	 * @generated
	 */
	EReference getTParameter_Next();

	/**
	 * Returns the meta object for the reference '{@link TypeGraphBasic.TParameter#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see TypeGraphBasic.TParameter#getPrevious()
	 * @see #getTParameter()
	 * @generated
	 */
	EReference getTParameter_Previous();

	/**
	 * Returns the meta object for the reference '{@link TypeGraphBasic.TParameter#getTClass <em>TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TClass</em>'.
	 * @see TypeGraphBasic.TParameter#getTClass()
	 * @see #getTParameter()
	 * @generated
	 */
	EReference getTParameter_TClass();

	/**
	 * Returns the meta object for class '{@link TypeGraphBasic.TParameterList <em>TParameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TParameter List</em>'.
	 * @see TypeGraphBasic.TParameterList
	 * @generated
	 */
	EClass getTParameterList();

	/**
	 * Returns the meta object for the containment reference list '{@link TypeGraphBasic.TParameterList#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see TypeGraphBasic.TParameterList#getEntries()
	 * @see #getTParameterList()
	 * @generated
	 */
	EReference getTParameterList_Entries();

	/**
	 * Returns the meta object for the reference '{@link TypeGraphBasic.TParameterList#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see TypeGraphBasic.TParameterList#getFirst()
	 * @see #getTParameterList()
	 * @generated
	 */
	EReference getTParameterList_First();

	/**
	 * Returns the meta object for class '{@link TypeGraphBasic.TSignature <em>TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSignature</em>'.
	 * @see TypeGraphBasic.TSignature
	 * @generated
	 */
	EClass getTSignature();

	/**
	 * Returns the meta object for class '{@link TypeGraphBasic.TypeGraph <em>Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Graph</em>'.
	 * @see TypeGraphBasic.TypeGraph
	 * @generated
	 */
	EClass getTypeGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link TypeGraphBasic.TypeGraph#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see TypeGraphBasic.TypeGraph#getPackages()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EReference getTypeGraph_Packages();

	/**
	 * Returns the meta object for the containment reference list '{@link TypeGraphBasic.TypeGraph#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see TypeGraphBasic.TypeGraph#getMethods()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EReference getTypeGraph_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link TypeGraphBasic.TypeGraph#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see TypeGraphBasic.TypeGraph#getFields()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EReference getTypeGraph_Fields();

	/**
	 * Returns the meta object for the containment reference list '{@link TypeGraphBasic.TypeGraph#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see TypeGraphBasic.TypeGraph#getClasses()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EReference getTypeGraph_Classes();

	/**
	 * Returns the meta object for the attribute '{@link TypeGraphBasic.TypeGraph#getTName <em>TName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TName</em>'.
	 * @see TypeGraphBasic.TypeGraph#getTName()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EAttribute getTypeGraph_TName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypeGraphBasicFactory getTypeGraphBasicFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link TypeGraphBasic.impl.TClassImpl <em>TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TypeGraphBasic.impl.TClassImpl
		 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTClass()
		 * @generated
		 */
		EClass TCLASS = eINSTANCE.getTClass();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCLASS__PACKAGE = eINSTANCE.getTClass_Package();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCLASS__SIGNATURE = eINSTANCE.getTClass_Signature();

		/**
		 * The meta object literal for the '<em><b>Defines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCLASS__DEFINES = eINSTANCE.getTClass_Defines();

		/**
		 * The meta object literal for the '<em><b>Parent Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCLASS__PARENT_CLASS = eINSTANCE.getTClass_ParentClass();

		/**
		 * The meta object literal for the '<em><b>Child Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCLASS__CHILD_CLASSES = eINSTANCE.getTClass_ChildClasses();

		/**
		 * The meta object literal for the '<em><b>TName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCLASS__TNAME = eINSTANCE.getTClass_TName();

		/**
		 * The meta object literal for the '{@link TypeGraphBasic.impl.TFieldImpl <em>TField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TypeGraphBasic.impl.TFieldImpl
		 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTField()
		 * @generated
		 */
		EClass TFIELD = eINSTANCE.getTField();

		/**
		 * The meta object literal for the '<em><b>Signatures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD__SIGNATURES = eINSTANCE.getTField_Signatures();

		/**
		 * The meta object literal for the '<em><b>TName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFIELD__TNAME = eINSTANCE.getTField_TName();

		/**
		 * The meta object literal for the '{@link TypeGraphBasic.impl.TFieldDefinitionImpl <em>TField Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TypeGraphBasic.impl.TFieldDefinitionImpl
		 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTFieldDefinition()
		 * @generated
		 */
		EClass TFIELD_DEFINITION = eINSTANCE.getTFieldDefinition();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD_DEFINITION__SIGNATURE = eINSTANCE
				.getTFieldDefinition_Signature();

		/**
		 * The meta object literal for the '<em><b>Hiding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD_DEFINITION__HIDING = eINSTANCE
				.getTFieldDefinition_Hiding();

		/**
		 * The meta object literal for the '<em><b>Hidden By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD_DEFINITION__HIDDEN_BY = eINSTANCE
				.getTFieldDefinition_HiddenBy();

		/**
		 * The meta object literal for the '{@link TypeGraphBasic.impl.TFieldSignatureImpl <em>TField Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TypeGraphBasic.impl.TFieldSignatureImpl
		 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTFieldSignature()
		 * @generated
		 */
		EClass TFIELD_SIGNATURE = eINSTANCE.getTFieldSignature();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD_SIGNATURE__DEFINITIONS = eINSTANCE
				.getTFieldSignature_Definitions();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD_SIGNATURE__FIELD = eINSTANCE
				.getTFieldSignature_Field();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD_SIGNATURE__TYPE = eINSTANCE.getTFieldSignature_Type();

		/**
		 * The meta object literal for the '{@link TypeGraphBasic.impl.TMemberImpl <em>TMember</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TypeGraphBasic.impl.TMemberImpl
		 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTMember()
		 * @generated
		 */
		EClass TMEMBER = eINSTANCE.getTMember();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMEMBER__ACCESS = eINSTANCE.getTMember_Access();

		/**
		 * The meta object literal for the '{@link TypeGraphBasic.impl.TMethodImpl <em>TMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TypeGraphBasic.impl.TMethodImpl
		 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTMethod()
		 * @generated
		 */
		EClass TMETHOD = eINSTANCE.getTMethod();

		/**
		 * The meta object literal for the '<em><b>Signatures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD__SIGNATURES = eINSTANCE.getTMethod_Signatures();

		/**
		 * The meta object literal for the '<em><b>TName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMETHOD__TNAME = eINSTANCE.getTMethod_TName();

		/**
		 * The meta object literal for the '{@link TypeGraphBasic.impl.TMethodDefinitionImpl <em>TMethod Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TypeGraphBasic.impl.TMethodDefinitionImpl
		 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTMethodDefinition()
		 * @generated
		 */
		EClass TMETHOD_DEFINITION = eINSTANCE.getTMethodDefinition();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_DEFINITION__SIGNATURE = eINSTANCE
				.getTMethodDefinition_Signature();

		/**
		 * The meta object literal for the '<em><b>Overriding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_DEFINITION__OVERRIDING = eINSTANCE
				.getTMethodDefinition_Overriding();

		/**
		 * The meta object literal for the '<em><b>Overridden By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_DEFINITION__OVERRIDDEN_BY = eINSTANCE
				.getTMethodDefinition_OverriddenBy();

		/**
		 * The meta object literal for the '<em><b>Overloading</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_DEFINITION__OVERLOADING = eINSTANCE
				.getTMethodDefinition_Overloading();

		/**
		 * The meta object literal for the '<em><b>Overloaded By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_DEFINITION__OVERLOADED_BY = eINSTANCE
				.getTMethodDefinition_OverloadedBy();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_DEFINITION__RETURN_TYPE = eINSTANCE
				.getTMethodDefinition_ReturnType();

		/**
		 * The meta object literal for the '{@link TypeGraphBasic.impl.TMethodSignatureImpl <em>TMethod Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TypeGraphBasic.impl.TMethodSignatureImpl
		 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTMethodSignature()
		 * @generated
		 */
		EClass TMETHOD_SIGNATURE = eINSTANCE.getTMethodSignature();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_SIGNATURE__METHOD = eINSTANCE
				.getTMethodSignature_Method();

		/**
		 * The meta object literal for the '<em><b>Param List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_SIGNATURE__PARAM_LIST = eINSTANCE
				.getTMethodSignature_ParamList();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_SIGNATURE__DEFINITIONS = eINSTANCE
				.getTMethodSignature_Definitions();

		/**
		 * The meta object literal for the '{@link TypeGraphBasic.impl.TPackageImpl <em>TPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TypeGraphBasic.impl.TPackageImpl
		 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTPackage()
		 * @generated
		 */
		EClass TPACKAGE = eINSTANCE.getTPackage();

		/**
		 * The meta object literal for the '<em><b>Contained Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKAGE__CONTAINED_CLASSES = eINSTANCE
				.getTPackage_ContainedClasses();

		/**
		 * The meta object literal for the '<em><b>Subpackage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKAGE__SUBPACKAGE = eINSTANCE.getTPackage_Subpackage();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKAGE__PARENT = eINSTANCE.getTPackage_Parent();

		/**
		 * The meta object literal for the '<em><b>TName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPACKAGE__TNAME = eINSTANCE.getTPackage_TName();

		/**
		 * The meta object literal for the '{@link TypeGraphBasic.impl.TParameterImpl <em>TParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TypeGraphBasic.impl.TParameterImpl
		 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTParameter()
		 * @generated
		 */
		EClass TPARAMETER = eINSTANCE.getTParameter();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPARAMETER__NEXT = eINSTANCE.getTParameter_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPARAMETER__PREVIOUS = eINSTANCE.getTParameter_Previous();

		/**
		 * The meta object literal for the '<em><b>TClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPARAMETER__TCLASS = eINSTANCE.getTParameter_TClass();

		/**
		 * The meta object literal for the '{@link TypeGraphBasic.impl.TParameterListImpl <em>TParameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TypeGraphBasic.impl.TParameterListImpl
		 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTParameterList()
		 * @generated
		 */
		EClass TPARAMETER_LIST = eINSTANCE.getTParameterList();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPARAMETER_LIST__ENTRIES = eINSTANCE
				.getTParameterList_Entries();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPARAMETER_LIST__FIRST = eINSTANCE.getTParameterList_First();

		/**
		 * The meta object literal for the '{@link TypeGraphBasic.impl.TSignatureImpl <em>TSignature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TypeGraphBasic.impl.TSignatureImpl
		 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTSignature()
		 * @generated
		 */
		EClass TSIGNATURE = eINSTANCE.getTSignature();

		/**
		 * The meta object literal for the '{@link TypeGraphBasic.impl.TypeGraphImpl <em>Type Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TypeGraphBasic.impl.TypeGraphImpl
		 * @see TypeGraphBasic.impl.TypeGraphBasicPackageImpl#getTypeGraph()
		 * @generated
		 */
		EClass TYPE_GRAPH = eINSTANCE.getTypeGraph();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GRAPH__PACKAGES = eINSTANCE.getTypeGraph_Packages();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GRAPH__METHODS = eINSTANCE.getTypeGraph_Methods();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GRAPH__FIELDS = eINSTANCE.getTypeGraph_Fields();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GRAPH__CLASSES = eINSTANCE.getTypeGraph_Classes();

		/**
		 * The meta object literal for the '<em><b>TName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_GRAPH__TNAME = eINSTANCE.getTypeGraph_TName();

	}

} //TypeGraphBasicPackage
