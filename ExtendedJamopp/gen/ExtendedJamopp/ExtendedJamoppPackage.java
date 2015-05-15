/**
 */
package ExtendedJamopp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.emftext.language.java.members.MembersPackage;

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
 * @see ExtendedJamopp.ExtendedJamoppFactory
 * @model kind="package"
 * @generated
 */
public interface ExtendedJamoppPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ExtendedJamopp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/ExtendedJamopp/model/ExtendedJamopp.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ExtendedJamopp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtendedJamoppPackage eINSTANCE = ExtendedJamopp.impl.ExtendedJamoppPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link ExtendedJamopp.impl.ExtendedClassMethodImpl <em>Extended Class Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExtendedJamopp.impl.ExtendedClassMethodImpl
	 * @see ExtendedJamopp.impl.ExtendedJamoppPackageImpl#getExtendedClassMethod()
	 * @generated
	 */
	int EXTENDED_CLASS_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CLASS_METHOD__LAYOUT_INFORMATIONS = MembersPackage.CLASS_METHOD__LAYOUT_INFORMATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CLASS_METHOD__NAME = MembersPackage.CLASS_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CLASS_METHOD__TYPE_REFERENCE = MembersPackage.CLASS_METHOD__TYPE_REFERENCE;

	/**
	 * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CLASS_METHOD__ARRAY_DIMENSIONS_BEFORE = MembersPackage.CLASS_METHOD__ARRAY_DIMENSIONS_BEFORE;

	/**
	 * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CLASS_METHOD__ARRAY_DIMENSIONS_AFTER = MembersPackage.CLASS_METHOD__ARRAY_DIMENSIONS_AFTER;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CLASS_METHOD__TYPE_PARAMETERS = MembersPackage.CLASS_METHOD__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CLASS_METHOD__PARAMETERS = MembersPackage.CLASS_METHOD__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CLASS_METHOD__EXCEPTIONS = MembersPackage.CLASS_METHOD__EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CLASS_METHOD__ANNOTATIONS_AND_MODIFIERS = MembersPackage.CLASS_METHOD__ANNOTATIONS_AND_MODIFIERS;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CLASS_METHOD__STATEMENTS = MembersPackage.CLASS_METHOD__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Extended Method Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CLASS_METHOD__EXTENDED_METHOD_NAME = MembersPackage.CLASS_METHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter list</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CLASS_METHOD__PARAMETER_LIST = MembersPackage.CLASS_METHOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extended Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CLASS_METHOD__EXTENDED_RETURN_TYPE = MembersPackage.CLASS_METHOD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Extended Class Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_CLASS_METHOD_FEATURE_COUNT = MembersPackage.CLASS_METHOD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ExtendedJamopp.impl.ExtendedJamoppJavaContainerImpl <em>Java Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExtendedJamopp.impl.ExtendedJamoppJavaContainerImpl
	 * @see ExtendedJamopp.impl.ExtendedJamoppPackageImpl#getExtendedJamoppJavaContainer()
	 * @generated
	 */
	int EXTENDED_JAMOPP_JAVA_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Compilation Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_JAMOPP_JAVA_CONTAINER__COMPILATION_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Roots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_JAMOPP_JAVA_CONTAINER__ROOTS = 1;

	/**
	 * The feature id for the '<em><b>Extended Jamopp Package Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_JAMOPP_PACKAGE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Extended Parameter List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_PARAMETER_LIST = 3;

	/**
	 * The feature id for the '<em><b>Extended Method Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_METHOD_NAME = 4;

	/**
	 * The number of structural features of the '<em>Java Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_JAMOPP_JAVA_CONTAINER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Java Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_JAMOPP_JAVA_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExtendedJamopp.impl.ExtendedJamoppPackageElementImpl <em>Package Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExtendedJamopp.impl.ExtendedJamoppPackageElementImpl
	 * @see ExtendedJamopp.impl.ExtendedJamoppPackageImpl#getExtendedJamoppPackageElement()
	 * @generated
	 */
	int EXTENDED_JAMOPP_PACKAGE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_JAMOPP_PACKAGE_ELEMENT__SUCCESSOR = 0;

	/**
	 * The feature id for the '<em><b>Predessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_JAMOPP_PACKAGE_ELEMENT__PREDESSOR = 1;

	/**
	 * The feature id for the '<em><b>Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_JAMOPP_PACKAGE_ELEMENT__COMPILATION_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_JAMOPP_PACKAGE_ELEMENT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Package Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_JAMOPP_PACKAGE_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Package Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_JAMOPP_PACKAGE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExtendedJamopp.impl.ExtendedParameterImpl <em>Extended Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExtendedJamopp.impl.ExtendedParameterImpl
	 * @see ExtendedJamopp.impl.ExtendedJamoppPackageImpl#getExtendedParameter()
	 * @generated
	 */
	int EXTENDED_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER__NEXT = 0;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER__PREVIOUS = 1;

	/**
	 * The feature id for the '<em><b>Extended Parameter Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER__EXTENDED_PARAMETER_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Extended Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Extended Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExtendedJamopp.impl.ExtendedParameterListImpl <em>Extended Parameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExtendedJamopp.impl.ExtendedParameterListImpl
	 * @see ExtendedJamopp.impl.ExtendedJamoppPackageImpl#getExtendedParameterList()
	 * @generated
	 */
	int EXTENDED_PARAMETER_LIST = 4;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_LIST__METHODS = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_LIST__VALUES = 1;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_LIST__FIRST = 2;

	/**
	 * The number of structural features of the '<em>Extended Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_LIST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Extended Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExtendedJamopp.impl.ExtendedTypeImpl <em>Extended Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExtendedJamopp.impl.ExtendedTypeImpl
	 * @see ExtendedJamopp.impl.ExtendedJamoppPackageImpl#getExtendedType()
	 * @generated
	 */
	int EXTENDED_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TYPE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TYPE__TYPE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Is From Lib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TYPE__IS_FROM_LIB = 2;

	/**
	 * The number of structural features of the '<em>Extended Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Extended Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExtendedJamopp.impl.ExtendedMethodNameImpl <em>Extended Method Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExtendedJamopp.impl.ExtendedMethodNameImpl
	 * @see ExtendedJamopp.impl.ExtendedJamoppPackageImpl#getExtendedMethodName()
	 * @generated
	 */
	int EXTENDED_METHOD_NAME = 6;

	/**
	 * The feature id for the '<em><b>Extended Class Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_METHOD_NAME__EXTENDED_CLASS_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_METHOD_NAME__NAME = 1;

	/**
	 * The number of structural features of the '<em>Extended Method Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_METHOD_NAME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Extended Method Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_METHOD_NAME_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link ExtendedJamopp.ExtendedClassMethod <em>Extended Class Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Class Method</em>'.
	 * @see ExtendedJamopp.ExtendedClassMethod
	 * @generated
	 */
	EClass getExtendedClassMethod();

	/**
	 * Returns the meta object for the reference '{@link ExtendedJamopp.ExtendedClassMethod#getExtendedMethodName <em>Extended Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extended Method Name</em>'.
	 * @see ExtendedJamopp.ExtendedClassMethod#getExtendedMethodName()
	 * @see #getExtendedClassMethod()
	 * @generated
	 */
	EReference getExtendedClassMethod_ExtendedMethodName();

	/**
	 * Returns the meta object for the reference '{@link ExtendedJamopp.ExtendedClassMethod#getParameter_list <em>Parameter list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter list</em>'.
	 * @see ExtendedJamopp.ExtendedClassMethod#getParameter_list()
	 * @see #getExtendedClassMethod()
	 * @generated
	 */
	EReference getExtendedClassMethod_Parameter_list();

	/**
	 * Returns the meta object for the containment reference '{@link ExtendedJamopp.ExtendedClassMethod#getExtendedReturnType <em>Extended Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Return Type</em>'.
	 * @see ExtendedJamopp.ExtendedClassMethod#getExtendedReturnType()
	 * @see #getExtendedClassMethod()
	 * @generated
	 */
	EReference getExtendedClassMethod_ExtendedReturnType();

	/**
	 * Returns the meta object for class '{@link ExtendedJamopp.ExtendedJamoppJavaContainer <em>Java Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Container</em>'.
	 * @see ExtendedJamopp.ExtendedJamoppJavaContainer
	 * @generated
	 */
	EClass getExtendedJamoppJavaContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link ExtendedJamopp.ExtendedJamoppJavaContainer#getCompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compilation Unit</em>'.
	 * @see ExtendedJamopp.ExtendedJamoppJavaContainer#getCompilationUnit()
	 * @see #getExtendedJamoppJavaContainer()
	 * @generated
	 */
	EReference getExtendedJamoppJavaContainer_CompilationUnit();

	/**
	 * Returns the meta object for the reference list '{@link ExtendedJamopp.ExtendedJamoppJavaContainer#getRoots <em>Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roots</em>'.
	 * @see ExtendedJamopp.ExtendedJamoppJavaContainer#getRoots()
	 * @see #getExtendedJamoppJavaContainer()
	 * @generated
	 */
	EReference getExtendedJamoppJavaContainer_Roots();

	/**
	 * Returns the meta object for the containment reference list '{@link ExtendedJamopp.ExtendedJamoppJavaContainer#getExtendedJamoppPackageElement <em>Extended Jamopp Package Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extended Jamopp Package Element</em>'.
	 * @see ExtendedJamopp.ExtendedJamoppJavaContainer#getExtendedJamoppPackageElement()
	 * @see #getExtendedJamoppJavaContainer()
	 * @generated
	 */
	EReference getExtendedJamoppJavaContainer_ExtendedJamoppPackageElement();

	/**
	 * Returns the meta object for the containment reference list '{@link ExtendedJamopp.ExtendedJamoppJavaContainer#getExtendedParameterList <em>Extended Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extended Parameter List</em>'.
	 * @see ExtendedJamopp.ExtendedJamoppJavaContainer#getExtendedParameterList()
	 * @see #getExtendedJamoppJavaContainer()
	 * @generated
	 */
	EReference getExtendedJamoppJavaContainer_ExtendedParameterList();

	/**
	 * Returns the meta object for the containment reference list '{@link ExtendedJamopp.ExtendedJamoppJavaContainer#getExtendedMethodName <em>Extended Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extended Method Name</em>'.
	 * @see ExtendedJamopp.ExtendedJamoppJavaContainer#getExtendedMethodName()
	 * @see #getExtendedJamoppJavaContainer()
	 * @generated
	 */
	EReference getExtendedJamoppJavaContainer_ExtendedMethodName();

	/**
	 * Returns the meta object for class '{@link ExtendedJamopp.ExtendedJamoppPackageElement <em>Package Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Element</em>'.
	 * @see ExtendedJamopp.ExtendedJamoppPackageElement
	 * @generated
	 */
	EClass getExtendedJamoppPackageElement();

	/**
	 * Returns the meta object for the reference list '{@link ExtendedJamopp.ExtendedJamoppPackageElement#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successor</em>'.
	 * @see ExtendedJamopp.ExtendedJamoppPackageElement#getSuccessor()
	 * @see #getExtendedJamoppPackageElement()
	 * @generated
	 */
	EReference getExtendedJamoppPackageElement_Successor();

	/**
	 * Returns the meta object for the reference '{@link ExtendedJamopp.ExtendedJamoppPackageElement#getPredessor <em>Predessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predessor</em>'.
	 * @see ExtendedJamopp.ExtendedJamoppPackageElement#getPredessor()
	 * @see #getExtendedJamoppPackageElement()
	 * @generated
	 */
	EReference getExtendedJamoppPackageElement_Predessor();

	/**
	 * Returns the meta object for the reference list '{@link ExtendedJamopp.ExtendedJamoppPackageElement#getCompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compilation Unit</em>'.
	 * @see ExtendedJamopp.ExtendedJamoppPackageElement#getCompilationUnit()
	 * @see #getExtendedJamoppPackageElement()
	 * @generated
	 */
	EReference getExtendedJamoppPackageElement_CompilationUnit();

	/**
	 * Returns the meta object for the attribute '{@link ExtendedJamopp.ExtendedJamoppPackageElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ExtendedJamopp.ExtendedJamoppPackageElement#getName()
	 * @see #getExtendedJamoppPackageElement()
	 * @generated
	 */
	EAttribute getExtendedJamoppPackageElement_Name();

	/**
	 * Returns the meta object for class '{@link ExtendedJamopp.ExtendedParameter <em>Extended Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Parameter</em>'.
	 * @see ExtendedJamopp.ExtendedParameter
	 * @generated
	 */
	EClass getExtendedParameter();

	/**
	 * Returns the meta object for the reference '{@link ExtendedJamopp.ExtendedParameter#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see ExtendedJamopp.ExtendedParameter#getNext()
	 * @see #getExtendedParameter()
	 * @generated
	 */
	EReference getExtendedParameter_Next();

	/**
	 * Returns the meta object for the reference '{@link ExtendedJamopp.ExtendedParameter#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see ExtendedJamopp.ExtendedParameter#getPrevious()
	 * @see #getExtendedParameter()
	 * @generated
	 */
	EReference getExtendedParameter_Previous();

	/**
	 * Returns the meta object for the containment reference '{@link ExtendedJamopp.ExtendedParameter#getExtendedParameterType <em>Extended Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Parameter Type</em>'.
	 * @see ExtendedJamopp.ExtendedParameter#getExtendedParameterType()
	 * @see #getExtendedParameter()
	 * @generated
	 */
	EReference getExtendedParameter_ExtendedParameterType();

	/**
	 * Returns the meta object for class '{@link ExtendedJamopp.ExtendedParameterList <em>Extended Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Parameter List</em>'.
	 * @see ExtendedJamopp.ExtendedParameterList
	 * @generated
	 */
	EClass getExtendedParameterList();

	/**
	 * Returns the meta object for the reference list '{@link ExtendedJamopp.ExtendedParameterList#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Methods</em>'.
	 * @see ExtendedJamopp.ExtendedParameterList#getMethods()
	 * @see #getExtendedParameterList()
	 * @generated
	 */
	EReference getExtendedParameterList_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link ExtendedJamopp.ExtendedParameterList#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see ExtendedJamopp.ExtendedParameterList#getValues()
	 * @see #getExtendedParameterList()
	 * @generated
	 */
	EReference getExtendedParameterList_Values();

	/**
	 * Returns the meta object for the reference '{@link ExtendedJamopp.ExtendedParameterList#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see ExtendedJamopp.ExtendedParameterList#getFirst()
	 * @see #getExtendedParameterList()
	 * @generated
	 */
	EReference getExtendedParameterList_First();

	/**
	 * Returns the meta object for class '{@link ExtendedJamopp.ExtendedType <em>Extended Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Type</em>'.
	 * @see ExtendedJamopp.ExtendedType
	 * @generated
	 */
	EClass getExtendedType();

	/**
	 * Returns the meta object for the reference '{@link ExtendedJamopp.ExtendedType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ExtendedJamopp.ExtendedType#getType()
	 * @see #getExtendedType()
	 * @generated
	 */
	EReference getExtendedType_Type();

	/**
	 * Returns the meta object for the attribute '{@link ExtendedJamopp.ExtendedType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see ExtendedJamopp.ExtendedType#getTypeName()
	 * @see #getExtendedType()
	 * @generated
	 */
	EAttribute getExtendedType_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link ExtendedJamopp.ExtendedType#isIsFromLib <em>Is From Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is From Lib</em>'.
	 * @see ExtendedJamopp.ExtendedType#isIsFromLib()
	 * @see #getExtendedType()
	 * @generated
	 */
	EAttribute getExtendedType_IsFromLib();

	/**
	 * Returns the meta object for class '{@link ExtendedJamopp.ExtendedMethodName <em>Extended Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Method Name</em>'.
	 * @see ExtendedJamopp.ExtendedMethodName
	 * @generated
	 */
	EClass getExtendedMethodName();

	/**
	 * Returns the meta object for the reference list '{@link ExtendedJamopp.ExtendedMethodName#getExtendedClassMethod <em>Extended Class Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extended Class Method</em>'.
	 * @see ExtendedJamopp.ExtendedMethodName#getExtendedClassMethod()
	 * @see #getExtendedMethodName()
	 * @generated
	 */
	EReference getExtendedMethodName_ExtendedClassMethod();

	/**
	 * Returns the meta object for the attribute '{@link ExtendedJamopp.ExtendedMethodName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ExtendedJamopp.ExtendedMethodName#getName()
	 * @see #getExtendedMethodName()
	 * @generated
	 */
	EAttribute getExtendedMethodName_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtendedJamoppFactory getExtendedJamoppFactory();

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
		 * The meta object literal for the '{@link ExtendedJamopp.impl.ExtendedClassMethodImpl <em>Extended Class Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExtendedJamopp.impl.ExtendedClassMethodImpl
		 * @see ExtendedJamopp.impl.ExtendedJamoppPackageImpl#getExtendedClassMethod()
		 * @generated
		 */
		EClass EXTENDED_CLASS_METHOD = eINSTANCE.getExtendedClassMethod();

		/**
		 * The meta object literal for the '<em><b>Extended Method Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_CLASS_METHOD__EXTENDED_METHOD_NAME = eINSTANCE
				.getExtendedClassMethod_ExtendedMethodName();

		/**
		 * The meta object literal for the '<em><b>Parameter list</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_CLASS_METHOD__PARAMETER_LIST = eINSTANCE
				.getExtendedClassMethod_Parameter_list();

		/**
		 * The meta object literal for the '<em><b>Extended Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_CLASS_METHOD__EXTENDED_RETURN_TYPE = eINSTANCE
				.getExtendedClassMethod_ExtendedReturnType();

		/**
		 * The meta object literal for the '{@link ExtendedJamopp.impl.ExtendedJamoppJavaContainerImpl <em>Java Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExtendedJamopp.impl.ExtendedJamoppJavaContainerImpl
		 * @see ExtendedJamopp.impl.ExtendedJamoppPackageImpl#getExtendedJamoppJavaContainer()
		 * @generated
		 */
		EClass EXTENDED_JAMOPP_JAVA_CONTAINER = eINSTANCE
				.getExtendedJamoppJavaContainer();

		/**
		 * The meta object literal for the '<em><b>Compilation Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_JAMOPP_JAVA_CONTAINER__COMPILATION_UNIT = eINSTANCE
				.getExtendedJamoppJavaContainer_CompilationUnit();

		/**
		 * The meta object literal for the '<em><b>Roots</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_JAMOPP_JAVA_CONTAINER__ROOTS = eINSTANCE
				.getExtendedJamoppJavaContainer_Roots();

		/**
		 * The meta object literal for the '<em><b>Extended Jamopp Package Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_JAMOPP_PACKAGE_ELEMENT = eINSTANCE
				.getExtendedJamoppJavaContainer_ExtendedJamoppPackageElement();

		/**
		 * The meta object literal for the '<em><b>Extended Parameter List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_PARAMETER_LIST = eINSTANCE
				.getExtendedJamoppJavaContainer_ExtendedParameterList();

		/**
		 * The meta object literal for the '<em><b>Extended Method Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_METHOD_NAME = eINSTANCE
				.getExtendedJamoppJavaContainer_ExtendedMethodName();

		/**
		 * The meta object literal for the '{@link ExtendedJamopp.impl.ExtendedJamoppPackageElementImpl <em>Package Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExtendedJamopp.impl.ExtendedJamoppPackageElementImpl
		 * @see ExtendedJamopp.impl.ExtendedJamoppPackageImpl#getExtendedJamoppPackageElement()
		 * @generated
		 */
		EClass EXTENDED_JAMOPP_PACKAGE_ELEMENT = eINSTANCE
				.getExtendedJamoppPackageElement();

		/**
		 * The meta object literal for the '<em><b>Successor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_JAMOPP_PACKAGE_ELEMENT__SUCCESSOR = eINSTANCE
				.getExtendedJamoppPackageElement_Successor();

		/**
		 * The meta object literal for the '<em><b>Predessor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_JAMOPP_PACKAGE_ELEMENT__PREDESSOR = eINSTANCE
				.getExtendedJamoppPackageElement_Predessor();

		/**
		 * The meta object literal for the '<em><b>Compilation Unit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_JAMOPP_PACKAGE_ELEMENT__COMPILATION_UNIT = eINSTANCE
				.getExtendedJamoppPackageElement_CompilationUnit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_JAMOPP_PACKAGE_ELEMENT__NAME = eINSTANCE
				.getExtendedJamoppPackageElement_Name();

		/**
		 * The meta object literal for the '{@link ExtendedJamopp.impl.ExtendedParameterImpl <em>Extended Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExtendedJamopp.impl.ExtendedParameterImpl
		 * @see ExtendedJamopp.impl.ExtendedJamoppPackageImpl#getExtendedParameter()
		 * @generated
		 */
		EClass EXTENDED_PARAMETER = eINSTANCE.getExtendedParameter();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PARAMETER__NEXT = eINSTANCE
				.getExtendedParameter_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PARAMETER__PREVIOUS = eINSTANCE
				.getExtendedParameter_Previous();

		/**
		 * The meta object literal for the '<em><b>Extended Parameter Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PARAMETER__EXTENDED_PARAMETER_TYPE = eINSTANCE
				.getExtendedParameter_ExtendedParameterType();

		/**
		 * The meta object literal for the '{@link ExtendedJamopp.impl.ExtendedParameterListImpl <em>Extended Parameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExtendedJamopp.impl.ExtendedParameterListImpl
		 * @see ExtendedJamopp.impl.ExtendedJamoppPackageImpl#getExtendedParameterList()
		 * @generated
		 */
		EClass EXTENDED_PARAMETER_LIST = eINSTANCE.getExtendedParameterList();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PARAMETER_LIST__METHODS = eINSTANCE
				.getExtendedParameterList_Methods();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PARAMETER_LIST__VALUES = eINSTANCE
				.getExtendedParameterList_Values();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PARAMETER_LIST__FIRST = eINSTANCE
				.getExtendedParameterList_First();

		/**
		 * The meta object literal for the '{@link ExtendedJamopp.impl.ExtendedTypeImpl <em>Extended Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExtendedJamopp.impl.ExtendedTypeImpl
		 * @see ExtendedJamopp.impl.ExtendedJamoppPackageImpl#getExtendedType()
		 * @generated
		 */
		EClass EXTENDED_TYPE = eINSTANCE.getExtendedType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_TYPE__TYPE = eINSTANCE.getExtendedType_Type();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_TYPE__TYPE_NAME = eINSTANCE
				.getExtendedType_TypeName();

		/**
		 * The meta object literal for the '<em><b>Is From Lib</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_TYPE__IS_FROM_LIB = eINSTANCE
				.getExtendedType_IsFromLib();

		/**
		 * The meta object literal for the '{@link ExtendedJamopp.impl.ExtendedMethodNameImpl <em>Extended Method Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExtendedJamopp.impl.ExtendedMethodNameImpl
		 * @see ExtendedJamopp.impl.ExtendedJamoppPackageImpl#getExtendedMethodName()
		 * @generated
		 */
		EClass EXTENDED_METHOD_NAME = eINSTANCE.getExtendedMethodName();

		/**
		 * The meta object literal for the '<em><b>Extended Class Method</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_METHOD_NAME__EXTENDED_CLASS_METHOD = eINSTANCE
				.getExtendedMethodName_ExtendedClassMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_METHOD_NAME__NAME = eINSTANCE
				.getExtendedMethodName_Name();

	}

} //ExtendedJamoppPackage
