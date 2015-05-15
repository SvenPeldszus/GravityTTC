/**
 */
package GravityTGG;

import TGGRuntime.TGGRuntimePackage;

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
 * @see GravityTGG.GravityTGGFactory
 * @model kind="package"
 * @generated
 */
public interface GravityTGGPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GravityTGG";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/GravityTGG/model/GravityTGG.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GravityTGG";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GravityTGGPackage eINSTANCE = GravityTGG.impl.GravityTGGPackageImpl.init();

	/**
	 * The meta object id for the '{@link GravityTGG.impl.MemberToTMemberImpl <em>Member To TMember</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.MemberToTMemberImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getMemberToTMember()
	 * @generated
	 */
	int MEMBER_TO_TMEMBER = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_TO_TMEMBER__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_TO_TMEMBER__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Member To TMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_TO_TMEMBER_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Member To TMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_TO_TMEMBER_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GravityTGG.impl.ClassMethodToTMethodImpl <em>Class Method To TMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.ClassMethodToTMethodImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getClassMethodToTMethod()
	 * @generated
	 */
	int CLASS_METHOD_TO_TMETHOD = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD_TO_TMETHOD__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD_TO_TMETHOD__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Method To TMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD_TO_TMETHOD_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Class Method To TMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD_TO_TMETHOD_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GravityTGG.impl.ClassMethodToTMethodDefinitionImpl <em>Class Method To TMethod Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.ClassMethodToTMethodDefinitionImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getClassMethodToTMethodDefinition()
	 * @generated
	 */
	int CLASS_METHOD_TO_TMETHOD_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD_TO_TMETHOD_DEFINITION__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD_TO_TMETHOD_DEFINITION__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Method To TMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD_TO_TMETHOD_DEFINITION_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Class Method To TMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD_TO_TMETHOD_DEFINITION_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GravityTGG.impl.ClassMethodToTMethodSignatureImpl <em>Class Method To TMethod Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.ClassMethodToTMethodSignatureImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getClassMethodToTMethodSignature()
	 * @generated
	 */
	int CLASS_METHOD_TO_TMETHOD_SIGNATURE = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD_TO_TMETHOD_SIGNATURE__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD_TO_TMETHOD_SIGNATURE__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Method To TMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD_TO_TMETHOD_SIGNATURE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Class Method To TMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD_TO_TMETHOD_SIGNATURE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GravityTGG.impl.ClassToTClassImpl <em>Class To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.ClassToTClassImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getClassToTClass()
	 * @generated
	 */
	int CLASS_TO_TCLASS = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TO_TCLASS__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TO_TCLASS__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TO_TCLASS_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Class To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TO_TCLASS_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GravityTGG.impl.CompilationUnitToTClassImpl <em>Compilation Unit To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.CompilationUnitToTClassImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getCompilationUnitToTClass()
	 * @generated
	 */
	int COMPILATION_UNIT_TO_TCLASS = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_TO_TCLASS__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_TO_TCLASS__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compilation Unit To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_TO_TCLASS_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Compilation Unit To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_TO_TCLASS_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GravityTGG.impl.ExtendedJamoppJavaContainerToTypeGraphImpl <em>Extended Jamopp Java Container To Type Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.ExtendedJamoppJavaContainerToTypeGraphImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedJamoppJavaContainerToTypeGraph()
	 * @generated
	 */
	int EXTENDED_JAMOPP_JAVA_CONTAINER_TO_TYPE_GRAPH = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_JAMOPP_JAVA_CONTAINER_TO_TYPE_GRAPH__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_JAMOPP_JAVA_CONTAINER_TO_TYPE_GRAPH__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extended Jamopp Java Container To Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_JAMOPP_JAVA_CONTAINER_TO_TYPE_GRAPH_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extended Jamopp Java Container To Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_JAMOPP_JAVA_CONTAINER_TO_TYPE_GRAPH_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GravityTGG.impl.ExtendedJamoppPackageElementToTPackageImpl <em>Extended Jamopp Package Element To TPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.ExtendedJamoppPackageElementToTPackageImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedJamoppPackageElementToTPackage()
	 * @generated
	 */
	int EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE = 7;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extended Jamopp Package Element To TPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extended Jamopp Package Element To TPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GravityTGG.impl.ExtendedParameterListToTClassImpl <em>Extended Parameter List To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.ExtendedParameterListToTClassImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedParameterListToTClass()
	 * @generated
	 */
	int EXTENDED_PARAMETER_LIST_TO_TCLASS = 8;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_LIST_TO_TCLASS__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_LIST_TO_TCLASS__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extended Parameter List To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_LIST_TO_TCLASS_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extended Parameter List To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_LIST_TO_TCLASS_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GravityTGG.impl.ExtendedParameterListToTParameterImpl <em>Extended Parameter List To TParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.ExtendedParameterListToTParameterImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedParameterListToTParameter()
	 * @generated
	 */
	int EXTENDED_PARAMETER_LIST_TO_TPARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_LIST_TO_TPARAMETER__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_LIST_TO_TPARAMETER__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extended Parameter List To TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_LIST_TO_TPARAMETER_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extended Parameter List To TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_LIST_TO_TPARAMETER_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GravityTGG.impl.ExtendedParameterListToTParameterListImpl <em>Extended Parameter List To TParameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.ExtendedParameterListToTParameterListImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedParameterListToTParameterList()
	 * @generated
	 */
	int EXTENDED_PARAMETER_LIST_TO_TPARAMETER_LIST = 10;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_LIST_TO_TPARAMETER_LIST__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_LIST_TO_TPARAMETER_LIST__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extended Parameter List To TParameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_LIST_TO_TPARAMETER_LIST_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extended Parameter List To TParameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_LIST_TO_TPARAMETER_LIST_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GravityTGG.impl.ExtendedParameterToTParameterImpl <em>Extended Parameter To TParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.ExtendedParameterToTParameterImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedParameterToTParameter()
	 * @generated
	 */
	int EXTENDED_PARAMETER_TO_TPARAMETER = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_TO_TPARAMETER__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_TO_TPARAMETER__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extended Parameter To TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_TO_TPARAMETER_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extended Parameter To TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_TO_TPARAMETER_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GravityTGG.impl.FieldToTFieldImpl <em>Field To TField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.FieldToTFieldImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getFieldToTField()
	 * @generated
	 */
	int FIELD_TO_TFIELD = 12;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TO_TFIELD__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TO_TFIELD__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field To TField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TO_TFIELD_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field To TField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TO_TFIELD_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GravityTGG.impl.FieldToTFieldDefinitionImpl <em>Field To TField Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.FieldToTFieldDefinitionImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getFieldToTFieldDefinition()
	 * @generated
	 */
	int FIELD_TO_TFIELD_DEFINITION = 13;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TO_TFIELD_DEFINITION__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TO_TFIELD_DEFINITION__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field To TField Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TO_TFIELD_DEFINITION_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field To TField Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TO_TFIELD_DEFINITION_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GravityTGG.impl.FieldToTFieldSignatureImpl <em>Field To TField Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.FieldToTFieldSignatureImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getFieldToTFieldSignature()
	 * @generated
	 */
	int FIELD_TO_TFIELD_SIGNATURE = 14;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TO_TFIELD_SIGNATURE__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TO_TFIELD_SIGNATURE__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field To TField Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TO_TFIELD_SIGNATURE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field To TField Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TO_TFIELD_SIGNATURE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GravityTGG.impl.TypeToTClassImpl <em>Type To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.TypeToTClassImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getTypeToTClass()
	 * @generated
	 */
	int TYPE_TO_TCLASS = 15;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TO_TCLASS__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TO_TCLASS__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TO_TCLASS_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TO_TCLASS_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GravityTGG.impl.ExtendedParameterToTypeGraphImpl <em>Extended Parameter To Type Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.ExtendedParameterToTypeGraphImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedParameterToTypeGraph()
	 * @generated
	 */
	int EXTENDED_PARAMETER_TO_TYPE_GRAPH = 16;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_TO_TYPE_GRAPH__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_TO_TYPE_GRAPH__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extended Parameter To Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_TO_TYPE_GRAPH_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extended Parameter To Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_TO_TYPE_GRAPH_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GravityTGG.impl.ExtendedTypeToTypeGraphImpl <em>Extended Type To Type Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.ExtendedTypeToTypeGraphImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedTypeToTypeGraph()
	 * @generated
	 */
	int EXTENDED_TYPE_TO_TYPE_GRAPH = 17;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TYPE_TO_TYPE_GRAPH__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TYPE_TO_TYPE_GRAPH__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extended Type To Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TYPE_TO_TYPE_GRAPH_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extended Type To Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TYPE_TO_TYPE_GRAPH_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GravityTGG.impl.ExtendedTypeToTClassImpl <em>Extended Type To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.ExtendedTypeToTClassImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedTypeToTClass()
	 * @generated
	 */
	int EXTENDED_TYPE_TO_TCLASS = 18;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TYPE_TO_TCLASS__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TYPE_TO_TCLASS__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extended Type To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TYPE_TO_TCLASS_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extended Type To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TYPE_TO_TCLASS_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GravityTGG.impl.ExtendedParameterListToTMethodSignatureImpl <em>Extended Parameter List To TMethod Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.ExtendedParameterListToTMethodSignatureImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedParameterListToTMethodSignature()
	 * @generated
	 */
	int EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE = 19;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extended Parameter List To TMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extended Parameter List To TMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GravityTGG.impl.IdentifierReferenceToTMethodDefinitionImpl <em>Identifier Reference To TMethod Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.IdentifierReferenceToTMethodDefinitionImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getIdentifierReferenceToTMethodDefinition()
	 * @generated
	 */
	int IDENTIFIER_REFERENCE_TO_TMETHOD_DEFINITION = 20;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE_TO_TMETHOD_DEFINITION__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE_TO_TMETHOD_DEFINITION__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Identifier Reference To TMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE_TO_TMETHOD_DEFINITION_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Identifier Reference To TMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE_TO_TMETHOD_DEFINITION_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GravityTGG.impl.ExtendedMethodNameToTMethodImpl <em>Extended Method Name To TMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.impl.ExtendedMethodNameToTMethodImpl
	 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedMethodNameToTMethod()
	 * @generated
	 */
	int EXTENDED_METHOD_NAME_TO_TMETHOD = 21;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_METHOD_NAME_TO_TMETHOD__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_METHOD_NAME_TO_TMETHOD__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extended Method Name To TMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_METHOD_NAME_TO_TMETHOD_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extended Method Name To TMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_METHOD_NAME_TO_TMETHOD_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link GravityTGG.MemberToTMember <em>Member To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member To TMember</em>'.
	 * @see GravityTGG.MemberToTMember
	 * @generated
	 */
	EClass getMemberToTMember();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.MemberToTMember#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.MemberToTMember#getSource()
	 * @see #getMemberToTMember()
	 * @generated
	 */
	EReference getMemberToTMember_Source();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.MemberToTMember#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.MemberToTMember#getTarget()
	 * @see #getMemberToTMember()
	 * @generated
	 */
	EReference getMemberToTMember_Target();

	/**
	 * Returns the meta object for class '{@link GravityTGG.ClassMethodToTMethod <em>Class Method To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Method To TMethod</em>'.
	 * @see GravityTGG.ClassMethodToTMethod
	 * @generated
	 */
	EClass getClassMethodToTMethod();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ClassMethodToTMethod#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.ClassMethodToTMethod#getTarget()
	 * @see #getClassMethodToTMethod()
	 * @generated
	 */
	EReference getClassMethodToTMethod_Target();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ClassMethodToTMethod#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.ClassMethodToTMethod#getSource()
	 * @see #getClassMethodToTMethod()
	 * @generated
	 */
	EReference getClassMethodToTMethod_Source();

	/**
	 * Returns the meta object for class '{@link GravityTGG.ClassMethodToTMethodDefinition <em>Class Method To TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Method To TMethod Definition</em>'.
	 * @see GravityTGG.ClassMethodToTMethodDefinition
	 * @generated
	 */
	EClass getClassMethodToTMethodDefinition();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ClassMethodToTMethodDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.ClassMethodToTMethodDefinition#getSource()
	 * @see #getClassMethodToTMethodDefinition()
	 * @generated
	 */
	EReference getClassMethodToTMethodDefinition_Source();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ClassMethodToTMethodDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.ClassMethodToTMethodDefinition#getTarget()
	 * @see #getClassMethodToTMethodDefinition()
	 * @generated
	 */
	EReference getClassMethodToTMethodDefinition_Target();

	/**
	 * Returns the meta object for class '{@link GravityTGG.ClassMethodToTMethodSignature <em>Class Method To TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Method To TMethod Signature</em>'.
	 * @see GravityTGG.ClassMethodToTMethodSignature
	 * @generated
	 */
	EClass getClassMethodToTMethodSignature();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ClassMethodToTMethodSignature#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.ClassMethodToTMethodSignature#getTarget()
	 * @see #getClassMethodToTMethodSignature()
	 * @generated
	 */
	EReference getClassMethodToTMethodSignature_Target();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ClassMethodToTMethodSignature#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.ClassMethodToTMethodSignature#getSource()
	 * @see #getClassMethodToTMethodSignature()
	 * @generated
	 */
	EReference getClassMethodToTMethodSignature_Source();

	/**
	 * Returns the meta object for class '{@link GravityTGG.ClassToTClass <em>Class To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class To TClass</em>'.
	 * @see GravityTGG.ClassToTClass
	 * @generated
	 */
	EClass getClassToTClass();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ClassToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.ClassToTClass#getTarget()
	 * @see #getClassToTClass()
	 * @generated
	 */
	EReference getClassToTClass_Target();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ClassToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.ClassToTClass#getSource()
	 * @see #getClassToTClass()
	 * @generated
	 */
	EReference getClassToTClass_Source();

	/**
	 * Returns the meta object for class '{@link GravityTGG.CompilationUnitToTClass <em>Compilation Unit To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Unit To TClass</em>'.
	 * @see GravityTGG.CompilationUnitToTClass
	 * @generated
	 */
	EClass getCompilationUnitToTClass();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.CompilationUnitToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.CompilationUnitToTClass#getTarget()
	 * @see #getCompilationUnitToTClass()
	 * @generated
	 */
	EReference getCompilationUnitToTClass_Target();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.CompilationUnitToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.CompilationUnitToTClass#getSource()
	 * @see #getCompilationUnitToTClass()
	 * @generated
	 */
	EReference getCompilationUnitToTClass_Source();

	/**
	 * Returns the meta object for class '{@link GravityTGG.ExtendedJamoppJavaContainerToTypeGraph <em>Extended Jamopp Java Container To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Jamopp Java Container To Type Graph</em>'.
	 * @see GravityTGG.ExtendedJamoppJavaContainerToTypeGraph
	 * @generated
	 */
	EClass getExtendedJamoppJavaContainerToTypeGraph();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedJamoppJavaContainerToTypeGraph#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.ExtendedJamoppJavaContainerToTypeGraph#getTarget()
	 * @see #getExtendedJamoppJavaContainerToTypeGraph()
	 * @generated
	 */
	EReference getExtendedJamoppJavaContainerToTypeGraph_Target();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedJamoppJavaContainerToTypeGraph#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.ExtendedJamoppJavaContainerToTypeGraph#getSource()
	 * @see #getExtendedJamoppJavaContainerToTypeGraph()
	 * @generated
	 */
	EReference getExtendedJamoppJavaContainerToTypeGraph_Source();

	/**
	 * Returns the meta object for class '{@link GravityTGG.ExtendedJamoppPackageElementToTPackage <em>Extended Jamopp Package Element To TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Jamopp Package Element To TPackage</em>'.
	 * @see GravityTGG.ExtendedJamoppPackageElementToTPackage
	 * @generated
	 */
	EClass getExtendedJamoppPackageElementToTPackage();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedJamoppPackageElementToTPackage#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.ExtendedJamoppPackageElementToTPackage#getTarget()
	 * @see #getExtendedJamoppPackageElementToTPackage()
	 * @generated
	 */
	EReference getExtendedJamoppPackageElementToTPackage_Target();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedJamoppPackageElementToTPackage#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.ExtendedJamoppPackageElementToTPackage#getSource()
	 * @see #getExtendedJamoppPackageElementToTPackage()
	 * @generated
	 */
	EReference getExtendedJamoppPackageElementToTPackage_Source();

	/**
	 * Returns the meta object for class '{@link GravityTGG.ExtendedParameterListToTClass <em>Extended Parameter List To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Parameter List To TClass</em>'.
	 * @see GravityTGG.ExtendedParameterListToTClass
	 * @generated
	 */
	EClass getExtendedParameterListToTClass();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedParameterListToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.ExtendedParameterListToTClass#getTarget()
	 * @see #getExtendedParameterListToTClass()
	 * @generated
	 */
	EReference getExtendedParameterListToTClass_Target();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedParameterListToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.ExtendedParameterListToTClass#getSource()
	 * @see #getExtendedParameterListToTClass()
	 * @generated
	 */
	EReference getExtendedParameterListToTClass_Source();

	/**
	 * Returns the meta object for class '{@link GravityTGG.ExtendedParameterListToTParameter <em>Extended Parameter List To TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Parameter List To TParameter</em>'.
	 * @see GravityTGG.ExtendedParameterListToTParameter
	 * @generated
	 */
	EClass getExtendedParameterListToTParameter();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedParameterListToTParameter#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.ExtendedParameterListToTParameter#getSource()
	 * @see #getExtendedParameterListToTParameter()
	 * @generated
	 */
	EReference getExtendedParameterListToTParameter_Source();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedParameterListToTParameter#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.ExtendedParameterListToTParameter#getTarget()
	 * @see #getExtendedParameterListToTParameter()
	 * @generated
	 */
	EReference getExtendedParameterListToTParameter_Target();

	/**
	 * Returns the meta object for class '{@link GravityTGG.ExtendedParameterListToTParameterList <em>Extended Parameter List To TParameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Parameter List To TParameter List</em>'.
	 * @see GravityTGG.ExtendedParameterListToTParameterList
	 * @generated
	 */
	EClass getExtendedParameterListToTParameterList();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedParameterListToTParameterList#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.ExtendedParameterListToTParameterList#getTarget()
	 * @see #getExtendedParameterListToTParameterList()
	 * @generated
	 */
	EReference getExtendedParameterListToTParameterList_Target();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedParameterListToTParameterList#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.ExtendedParameterListToTParameterList#getSource()
	 * @see #getExtendedParameterListToTParameterList()
	 * @generated
	 */
	EReference getExtendedParameterListToTParameterList_Source();

	/**
	 * Returns the meta object for class '{@link GravityTGG.ExtendedParameterToTParameter <em>Extended Parameter To TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Parameter To TParameter</em>'.
	 * @see GravityTGG.ExtendedParameterToTParameter
	 * @generated
	 */
	EClass getExtendedParameterToTParameter();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedParameterToTParameter#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.ExtendedParameterToTParameter#getSource()
	 * @see #getExtendedParameterToTParameter()
	 * @generated
	 */
	EReference getExtendedParameterToTParameter_Source();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedParameterToTParameter#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.ExtendedParameterToTParameter#getTarget()
	 * @see #getExtendedParameterToTParameter()
	 * @generated
	 */
	EReference getExtendedParameterToTParameter_Target();

	/**
	 * Returns the meta object for class '{@link GravityTGG.FieldToTField <em>Field To TField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field To TField</em>'.
	 * @see GravityTGG.FieldToTField
	 * @generated
	 */
	EClass getFieldToTField();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.FieldToTField#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.FieldToTField#getSource()
	 * @see #getFieldToTField()
	 * @generated
	 */
	EReference getFieldToTField_Source();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.FieldToTField#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.FieldToTField#getTarget()
	 * @see #getFieldToTField()
	 * @generated
	 */
	EReference getFieldToTField_Target();

	/**
	 * Returns the meta object for class '{@link GravityTGG.FieldToTFieldDefinition <em>Field To TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field To TField Definition</em>'.
	 * @see GravityTGG.FieldToTFieldDefinition
	 * @generated
	 */
	EClass getFieldToTFieldDefinition();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.FieldToTFieldDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.FieldToTFieldDefinition#getTarget()
	 * @see #getFieldToTFieldDefinition()
	 * @generated
	 */
	EReference getFieldToTFieldDefinition_Target();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.FieldToTFieldDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.FieldToTFieldDefinition#getSource()
	 * @see #getFieldToTFieldDefinition()
	 * @generated
	 */
	EReference getFieldToTFieldDefinition_Source();

	/**
	 * Returns the meta object for class '{@link GravityTGG.FieldToTFieldSignature <em>Field To TField Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field To TField Signature</em>'.
	 * @see GravityTGG.FieldToTFieldSignature
	 * @generated
	 */
	EClass getFieldToTFieldSignature();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.FieldToTFieldSignature#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.FieldToTFieldSignature#getTarget()
	 * @see #getFieldToTFieldSignature()
	 * @generated
	 */
	EReference getFieldToTFieldSignature_Target();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.FieldToTFieldSignature#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.FieldToTFieldSignature#getSource()
	 * @see #getFieldToTFieldSignature()
	 * @generated
	 */
	EReference getFieldToTFieldSignature_Source();

	/**
	 * Returns the meta object for class '{@link GravityTGG.TypeToTClass <em>Type To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type To TClass</em>'.
	 * @see GravityTGG.TypeToTClass
	 * @generated
	 */
	EClass getTypeToTClass();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.TypeToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.TypeToTClass#getSource()
	 * @see #getTypeToTClass()
	 * @generated
	 */
	EReference getTypeToTClass_Source();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.TypeToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.TypeToTClass#getTarget()
	 * @see #getTypeToTClass()
	 * @generated
	 */
	EReference getTypeToTClass_Target();

	/**
	 * Returns the meta object for class '{@link GravityTGG.ExtendedParameterToTypeGraph <em>Extended Parameter To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Parameter To Type Graph</em>'.
	 * @see GravityTGG.ExtendedParameterToTypeGraph
	 * @generated
	 */
	EClass getExtendedParameterToTypeGraph();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedParameterToTypeGraph#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.ExtendedParameterToTypeGraph#getSource()
	 * @see #getExtendedParameterToTypeGraph()
	 * @generated
	 */
	EReference getExtendedParameterToTypeGraph_Source();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedParameterToTypeGraph#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.ExtendedParameterToTypeGraph#getTarget()
	 * @see #getExtendedParameterToTypeGraph()
	 * @generated
	 */
	EReference getExtendedParameterToTypeGraph_Target();

	/**
	 * Returns the meta object for class '{@link GravityTGG.ExtendedTypeToTypeGraph <em>Extended Type To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Type To Type Graph</em>'.
	 * @see GravityTGG.ExtendedTypeToTypeGraph
	 * @generated
	 */
	EClass getExtendedTypeToTypeGraph();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedTypeToTypeGraph#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.ExtendedTypeToTypeGraph#getSource()
	 * @see #getExtendedTypeToTypeGraph()
	 * @generated
	 */
	EReference getExtendedTypeToTypeGraph_Source();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedTypeToTypeGraph#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.ExtendedTypeToTypeGraph#getTarget()
	 * @see #getExtendedTypeToTypeGraph()
	 * @generated
	 */
	EReference getExtendedTypeToTypeGraph_Target();

	/**
	 * Returns the meta object for class '{@link GravityTGG.ExtendedTypeToTClass <em>Extended Type To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Type To TClass</em>'.
	 * @see GravityTGG.ExtendedTypeToTClass
	 * @generated
	 */
	EClass getExtendedTypeToTClass();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedTypeToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.ExtendedTypeToTClass#getSource()
	 * @see #getExtendedTypeToTClass()
	 * @generated
	 */
	EReference getExtendedTypeToTClass_Source();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedTypeToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.ExtendedTypeToTClass#getTarget()
	 * @see #getExtendedTypeToTClass()
	 * @generated
	 */
	EReference getExtendedTypeToTClass_Target();

	/**
	 * Returns the meta object for class '{@link GravityTGG.ExtendedParameterListToTMethodSignature <em>Extended Parameter List To TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Parameter List To TMethod Signature</em>'.
	 * @see GravityTGG.ExtendedParameterListToTMethodSignature
	 * @generated
	 */
	EClass getExtendedParameterListToTMethodSignature();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedParameterListToTMethodSignature#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.ExtendedParameterListToTMethodSignature#getSource()
	 * @see #getExtendedParameterListToTMethodSignature()
	 * @generated
	 */
	EReference getExtendedParameterListToTMethodSignature_Source();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedParameterListToTMethodSignature#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.ExtendedParameterListToTMethodSignature#getTarget()
	 * @see #getExtendedParameterListToTMethodSignature()
	 * @generated
	 */
	EReference getExtendedParameterListToTMethodSignature_Target();

	/**
	 * Returns the meta object for class '{@link GravityTGG.IdentifierReferenceToTMethodDefinition <em>Identifier Reference To TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier Reference To TMethod Definition</em>'.
	 * @see GravityTGG.IdentifierReferenceToTMethodDefinition
	 * @generated
	 */
	EClass getIdentifierReferenceToTMethodDefinition();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.IdentifierReferenceToTMethodDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.IdentifierReferenceToTMethodDefinition#getSource()
	 * @see #getIdentifierReferenceToTMethodDefinition()
	 * @generated
	 */
	EReference getIdentifierReferenceToTMethodDefinition_Source();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.IdentifierReferenceToTMethodDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.IdentifierReferenceToTMethodDefinition#getTarget()
	 * @see #getIdentifierReferenceToTMethodDefinition()
	 * @generated
	 */
	EReference getIdentifierReferenceToTMethodDefinition_Target();

	/**
	 * Returns the meta object for class '{@link GravityTGG.ExtendedMethodNameToTMethod <em>Extended Method Name To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Method Name To TMethod</em>'.
	 * @see GravityTGG.ExtendedMethodNameToTMethod
	 * @generated
	 */
	EClass getExtendedMethodNameToTMethod();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedMethodNameToTMethod#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.ExtendedMethodNameToTMethod#getSource()
	 * @see #getExtendedMethodNameToTMethod()
	 * @generated
	 */
	EReference getExtendedMethodNameToTMethod_Source();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.ExtendedMethodNameToTMethod#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.ExtendedMethodNameToTMethod#getTarget()
	 * @see #getExtendedMethodNameToTMethod()
	 * @generated
	 */
	EReference getExtendedMethodNameToTMethod_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GravityTGGFactory getGravityTGGFactory();

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
		 * The meta object literal for the '{@link GravityTGG.impl.MemberToTMemberImpl <em>Member To TMember</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.MemberToTMemberImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getMemberToTMember()
		 * @generated
		 */
		EClass MEMBER_TO_TMEMBER = eINSTANCE.getMemberToTMember();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_TO_TMEMBER__SOURCE = eINSTANCE
				.getMemberToTMember_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_TO_TMEMBER__TARGET = eINSTANCE
				.getMemberToTMember_Target();

		/**
		 * The meta object literal for the '{@link GravityTGG.impl.ClassMethodToTMethodImpl <em>Class Method To TMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.ClassMethodToTMethodImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getClassMethodToTMethod()
		 * @generated
		 */
		EClass CLASS_METHOD_TO_TMETHOD = eINSTANCE.getClassMethodToTMethod();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_METHOD_TO_TMETHOD__TARGET = eINSTANCE
				.getClassMethodToTMethod_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_METHOD_TO_TMETHOD__SOURCE = eINSTANCE
				.getClassMethodToTMethod_Source();

		/**
		 * The meta object literal for the '{@link GravityTGG.impl.ClassMethodToTMethodDefinitionImpl <em>Class Method To TMethod Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.ClassMethodToTMethodDefinitionImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getClassMethodToTMethodDefinition()
		 * @generated
		 */
		EClass CLASS_METHOD_TO_TMETHOD_DEFINITION = eINSTANCE
				.getClassMethodToTMethodDefinition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_METHOD_TO_TMETHOD_DEFINITION__SOURCE = eINSTANCE
				.getClassMethodToTMethodDefinition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_METHOD_TO_TMETHOD_DEFINITION__TARGET = eINSTANCE
				.getClassMethodToTMethodDefinition_Target();

		/**
		 * The meta object literal for the '{@link GravityTGG.impl.ClassMethodToTMethodSignatureImpl <em>Class Method To TMethod Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.ClassMethodToTMethodSignatureImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getClassMethodToTMethodSignature()
		 * @generated
		 */
		EClass CLASS_METHOD_TO_TMETHOD_SIGNATURE = eINSTANCE
				.getClassMethodToTMethodSignature();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_METHOD_TO_TMETHOD_SIGNATURE__TARGET = eINSTANCE
				.getClassMethodToTMethodSignature_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_METHOD_TO_TMETHOD_SIGNATURE__SOURCE = eINSTANCE
				.getClassMethodToTMethodSignature_Source();

		/**
		 * The meta object literal for the '{@link GravityTGG.impl.ClassToTClassImpl <em>Class To TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.ClassToTClassImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getClassToTClass()
		 * @generated
		 */
		EClass CLASS_TO_TCLASS = eINSTANCE.getClassToTClass();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TO_TCLASS__TARGET = eINSTANCE
				.getClassToTClass_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TO_TCLASS__SOURCE = eINSTANCE
				.getClassToTClass_Source();

		/**
		 * The meta object literal for the '{@link GravityTGG.impl.CompilationUnitToTClassImpl <em>Compilation Unit To TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.CompilationUnitToTClassImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getCompilationUnitToTClass()
		 * @generated
		 */
		EClass COMPILATION_UNIT_TO_TCLASS = eINSTANCE
				.getCompilationUnitToTClass();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT_TO_TCLASS__TARGET = eINSTANCE
				.getCompilationUnitToTClass_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT_TO_TCLASS__SOURCE = eINSTANCE
				.getCompilationUnitToTClass_Source();

		/**
		 * The meta object literal for the '{@link GravityTGG.impl.ExtendedJamoppJavaContainerToTypeGraphImpl <em>Extended Jamopp Java Container To Type Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.ExtendedJamoppJavaContainerToTypeGraphImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedJamoppJavaContainerToTypeGraph()
		 * @generated
		 */
		EClass EXTENDED_JAMOPP_JAVA_CONTAINER_TO_TYPE_GRAPH = eINSTANCE
				.getExtendedJamoppJavaContainerToTypeGraph();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_JAMOPP_JAVA_CONTAINER_TO_TYPE_GRAPH__TARGET = eINSTANCE
				.getExtendedJamoppJavaContainerToTypeGraph_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_JAMOPP_JAVA_CONTAINER_TO_TYPE_GRAPH__SOURCE = eINSTANCE
				.getExtendedJamoppJavaContainerToTypeGraph_Source();

		/**
		 * The meta object literal for the '{@link GravityTGG.impl.ExtendedJamoppPackageElementToTPackageImpl <em>Extended Jamopp Package Element To TPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.ExtendedJamoppPackageElementToTPackageImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedJamoppPackageElementToTPackage()
		 * @generated
		 */
		EClass EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE = eINSTANCE
				.getExtendedJamoppPackageElementToTPackage();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE__TARGET = eINSTANCE
				.getExtendedJamoppPackageElementToTPackage_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE__SOURCE = eINSTANCE
				.getExtendedJamoppPackageElementToTPackage_Source();

		/**
		 * The meta object literal for the '{@link GravityTGG.impl.ExtendedParameterListToTClassImpl <em>Extended Parameter List To TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.ExtendedParameterListToTClassImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedParameterListToTClass()
		 * @generated
		 */
		EClass EXTENDED_PARAMETER_LIST_TO_TCLASS = eINSTANCE
				.getExtendedParameterListToTClass();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PARAMETER_LIST_TO_TCLASS__TARGET = eINSTANCE
				.getExtendedParameterListToTClass_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PARAMETER_LIST_TO_TCLASS__SOURCE = eINSTANCE
				.getExtendedParameterListToTClass_Source();

		/**
		 * The meta object literal for the '{@link GravityTGG.impl.ExtendedParameterListToTParameterImpl <em>Extended Parameter List To TParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.ExtendedParameterListToTParameterImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedParameterListToTParameter()
		 * @generated
		 */
		EClass EXTENDED_PARAMETER_LIST_TO_TPARAMETER = eINSTANCE
				.getExtendedParameterListToTParameter();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PARAMETER_LIST_TO_TPARAMETER__SOURCE = eINSTANCE
				.getExtendedParameterListToTParameter_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PARAMETER_LIST_TO_TPARAMETER__TARGET = eINSTANCE
				.getExtendedParameterListToTParameter_Target();

		/**
		 * The meta object literal for the '{@link GravityTGG.impl.ExtendedParameterListToTParameterListImpl <em>Extended Parameter List To TParameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.ExtendedParameterListToTParameterListImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedParameterListToTParameterList()
		 * @generated
		 */
		EClass EXTENDED_PARAMETER_LIST_TO_TPARAMETER_LIST = eINSTANCE
				.getExtendedParameterListToTParameterList();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PARAMETER_LIST_TO_TPARAMETER_LIST__TARGET = eINSTANCE
				.getExtendedParameterListToTParameterList_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PARAMETER_LIST_TO_TPARAMETER_LIST__SOURCE = eINSTANCE
				.getExtendedParameterListToTParameterList_Source();

		/**
		 * The meta object literal for the '{@link GravityTGG.impl.ExtendedParameterToTParameterImpl <em>Extended Parameter To TParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.ExtendedParameterToTParameterImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedParameterToTParameter()
		 * @generated
		 */
		EClass EXTENDED_PARAMETER_TO_TPARAMETER = eINSTANCE
				.getExtendedParameterToTParameter();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PARAMETER_TO_TPARAMETER__SOURCE = eINSTANCE
				.getExtendedParameterToTParameter_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PARAMETER_TO_TPARAMETER__TARGET = eINSTANCE
				.getExtendedParameterToTParameter_Target();

		/**
		 * The meta object literal for the '{@link GravityTGG.impl.FieldToTFieldImpl <em>Field To TField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.FieldToTFieldImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getFieldToTField()
		 * @generated
		 */
		EClass FIELD_TO_TFIELD = eINSTANCE.getFieldToTField();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TO_TFIELD__SOURCE = eINSTANCE
				.getFieldToTField_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TO_TFIELD__TARGET = eINSTANCE
				.getFieldToTField_Target();

		/**
		 * The meta object literal for the '{@link GravityTGG.impl.FieldToTFieldDefinitionImpl <em>Field To TField Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.FieldToTFieldDefinitionImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getFieldToTFieldDefinition()
		 * @generated
		 */
		EClass FIELD_TO_TFIELD_DEFINITION = eINSTANCE
				.getFieldToTFieldDefinition();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TO_TFIELD_DEFINITION__TARGET = eINSTANCE
				.getFieldToTFieldDefinition_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TO_TFIELD_DEFINITION__SOURCE = eINSTANCE
				.getFieldToTFieldDefinition_Source();

		/**
		 * The meta object literal for the '{@link GravityTGG.impl.FieldToTFieldSignatureImpl <em>Field To TField Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.FieldToTFieldSignatureImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getFieldToTFieldSignature()
		 * @generated
		 */
		EClass FIELD_TO_TFIELD_SIGNATURE = eINSTANCE
				.getFieldToTFieldSignature();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TO_TFIELD_SIGNATURE__TARGET = eINSTANCE
				.getFieldToTFieldSignature_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TO_TFIELD_SIGNATURE__SOURCE = eINSTANCE
				.getFieldToTFieldSignature_Source();

		/**
		 * The meta object literal for the '{@link GravityTGG.impl.TypeToTClassImpl <em>Type To TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.TypeToTClassImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getTypeToTClass()
		 * @generated
		 */
		EClass TYPE_TO_TCLASS = eINSTANCE.getTypeToTClass();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TO_TCLASS__SOURCE = eINSTANCE.getTypeToTClass_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TO_TCLASS__TARGET = eINSTANCE.getTypeToTClass_Target();

		/**
		 * The meta object literal for the '{@link GravityTGG.impl.ExtendedParameterToTypeGraphImpl <em>Extended Parameter To Type Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.ExtendedParameterToTypeGraphImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedParameterToTypeGraph()
		 * @generated
		 */
		EClass EXTENDED_PARAMETER_TO_TYPE_GRAPH = eINSTANCE
				.getExtendedParameterToTypeGraph();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PARAMETER_TO_TYPE_GRAPH__SOURCE = eINSTANCE
				.getExtendedParameterToTypeGraph_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PARAMETER_TO_TYPE_GRAPH__TARGET = eINSTANCE
				.getExtendedParameterToTypeGraph_Target();

		/**
		 * The meta object literal for the '{@link GravityTGG.impl.ExtendedTypeToTypeGraphImpl <em>Extended Type To Type Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.ExtendedTypeToTypeGraphImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedTypeToTypeGraph()
		 * @generated
		 */
		EClass EXTENDED_TYPE_TO_TYPE_GRAPH = eINSTANCE
				.getExtendedTypeToTypeGraph();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_TYPE_TO_TYPE_GRAPH__SOURCE = eINSTANCE
				.getExtendedTypeToTypeGraph_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_TYPE_TO_TYPE_GRAPH__TARGET = eINSTANCE
				.getExtendedTypeToTypeGraph_Target();

		/**
		 * The meta object literal for the '{@link GravityTGG.impl.ExtendedTypeToTClassImpl <em>Extended Type To TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.ExtendedTypeToTClassImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedTypeToTClass()
		 * @generated
		 */
		EClass EXTENDED_TYPE_TO_TCLASS = eINSTANCE.getExtendedTypeToTClass();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_TYPE_TO_TCLASS__SOURCE = eINSTANCE
				.getExtendedTypeToTClass_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_TYPE_TO_TCLASS__TARGET = eINSTANCE
				.getExtendedTypeToTClass_Target();

		/**
		 * The meta object literal for the '{@link GravityTGG.impl.ExtendedParameterListToTMethodSignatureImpl <em>Extended Parameter List To TMethod Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.ExtendedParameterListToTMethodSignatureImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedParameterListToTMethodSignature()
		 * @generated
		 */
		EClass EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE = eINSTANCE
				.getExtendedParameterListToTMethodSignature();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE__SOURCE = eINSTANCE
				.getExtendedParameterListToTMethodSignature_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE__TARGET = eINSTANCE
				.getExtendedParameterListToTMethodSignature_Target();

		/**
		 * The meta object literal for the '{@link GravityTGG.impl.IdentifierReferenceToTMethodDefinitionImpl <em>Identifier Reference To TMethod Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.IdentifierReferenceToTMethodDefinitionImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getIdentifierReferenceToTMethodDefinition()
		 * @generated
		 */
		EClass IDENTIFIER_REFERENCE_TO_TMETHOD_DEFINITION = eINSTANCE
				.getIdentifierReferenceToTMethodDefinition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER_REFERENCE_TO_TMETHOD_DEFINITION__SOURCE = eINSTANCE
				.getIdentifierReferenceToTMethodDefinition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER_REFERENCE_TO_TMETHOD_DEFINITION__TARGET = eINSTANCE
				.getIdentifierReferenceToTMethodDefinition_Target();

		/**
		 * The meta object literal for the '{@link GravityTGG.impl.ExtendedMethodNameToTMethodImpl <em>Extended Method Name To TMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.impl.ExtendedMethodNameToTMethodImpl
		 * @see GravityTGG.impl.GravityTGGPackageImpl#getExtendedMethodNameToTMethod()
		 * @generated
		 */
		EClass EXTENDED_METHOD_NAME_TO_TMETHOD = eINSTANCE
				.getExtendedMethodNameToTMethod();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_METHOD_NAME_TO_TMETHOD__SOURCE = eINSTANCE
				.getExtendedMethodNameToTMethod_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_METHOD_NAME_TO_TMETHOD__TARGET = eINSTANCE
				.getExtendedMethodNameToTMethod_Target();

	}

} //GravityTGGPackage
