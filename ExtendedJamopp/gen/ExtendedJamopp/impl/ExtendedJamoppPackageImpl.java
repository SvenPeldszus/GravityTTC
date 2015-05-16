/**
 */
package ExtendedJamopp.impl;

import ExtendedJamopp.ExtendedClassMethod;
import ExtendedJamopp.ExtendedJamoppFactory;
import ExtendedJamopp.ExtendedJamoppJavaContainer;
import ExtendedJamopp.ExtendedJamoppPackage;
import ExtendedJamopp.ExtendedJamoppPackageElement;
import ExtendedJamopp.ExtendedMethodName;
import ExtendedJamopp.ExtendedParameter;
import ExtendedJamopp.ExtendedParameterList;
import ExtendedJamopp.ExtendedType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emftext.language.java.annotations.AnnotationsPackage;

import org.emftext.language.java.arrays.ArraysPackage;

import org.emftext.language.java.classifiers.ClassifiersPackage;

import org.emftext.language.java.commons.CommonsPackage;

import org.emftext.language.java.containers.ContainersPackage;

import org.emftext.language.java.expressions.ExpressionsPackage;

import org.emftext.language.java.generics.GenericsPackage;

import org.emftext.language.java.imports.ImportsPackage;

import org.emftext.language.java.instantiations.InstantiationsPackage;

import org.emftext.language.java.literals.LiteralsPackage;

import org.emftext.language.java.members.MembersPackage;

import org.emftext.language.java.modifiers.ModifiersPackage;

import org.emftext.language.java.operators.OperatorsPackage;

import org.emftext.language.java.parameters.ParametersPackage;

import org.emftext.language.java.references.ReferencesPackage;

import org.emftext.language.java.statements.StatementsPackage;

import org.emftext.language.java.types.TypesPackage;

import org.emftext.language.java.variables.VariablesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendedJamoppPackageImpl extends EPackageImpl implements
		ExtendedJamoppPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedClassMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedJamoppJavaContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedJamoppPackageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedParameterListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedMethodNameEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ExtendedJamopp.ExtendedJamoppPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExtendedJamoppPackageImpl() {
		super(eNS_URI, ExtendedJamoppFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ExtendedJamoppPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExtendedJamoppPackage init() {
		if (isInited)
			return (ExtendedJamoppPackage) EPackage.Registry.INSTANCE
					.getEPackage(ExtendedJamoppPackage.eNS_URI);

		// Obtain or create and register package
		ExtendedJamoppPackageImpl theExtendedJamoppPackage = (ExtendedJamoppPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ExtendedJamoppPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new ExtendedJamoppPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AnnotationsPackage.eINSTANCE.eClass();
		ArraysPackage.eINSTANCE.eClass();
		ClassifiersPackage.eINSTANCE.eClass();
		CommonsPackage.eINSTANCE.eClass();
		ContainersPackage.eINSTANCE.eClass();
		ExpressionsPackage.eINSTANCE.eClass();
		GenericsPackage.eINSTANCE.eClass();
		ImportsPackage.eINSTANCE.eClass();
		InstantiationsPackage.eINSTANCE.eClass();
		LiteralsPackage.eINSTANCE.eClass();
		MembersPackage.eINSTANCE.eClass();
		ModifiersPackage.eINSTANCE.eClass();
		OperatorsPackage.eINSTANCE.eClass();
		ParametersPackage.eINSTANCE.eClass();
		ReferencesPackage.eINSTANCE.eClass();
		StatementsPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		VariablesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExtendedJamoppPackage.createPackageContents();

		// Initialize created meta-data
		theExtendedJamoppPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExtendedJamoppPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExtendedJamoppPackage.eNS_URI,
				theExtendedJamoppPackage);
		return theExtendedJamoppPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedClassMethod() {
		return extendedClassMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedClassMethod_ExtendedMethodName() {
		return (EReference) extendedClassMethodEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedClassMethod_Parameter_list() {
		return (EReference) extendedClassMethodEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedClassMethod_ExtendedReturnType() {
		return (EReference) extendedClassMethodEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedJamoppJavaContainer() {
		return extendedJamoppJavaContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedJamoppJavaContainer_CompilationUnit() {
		return (EReference) extendedJamoppJavaContainerEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedJamoppJavaContainer_Roots() {
		return (EReference) extendedJamoppJavaContainerEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedJamoppJavaContainer_ExtendedJamoppPackageElement() {
		return (EReference) extendedJamoppJavaContainerEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedJamoppJavaContainer_ExtendedParameterList() {
		return (EReference) extendedJamoppJavaContainerEClass
				.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedJamoppJavaContainer_ExtendedMethodName() {
		return (EReference) extendedJamoppJavaContainerEClass
				.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedJamoppPackageElement() {
		return extendedJamoppPackageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedJamoppPackageElement_Successor() {
		return (EReference) extendedJamoppPackageElementEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedJamoppPackageElement_Predessor() {
		return (EReference) extendedJamoppPackageElementEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedJamoppPackageElement_CompilationUnit() {
		return (EReference) extendedJamoppPackageElementEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedJamoppPackageElement_Name() {
		return (EAttribute) extendedJamoppPackageElementEClass
				.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedParameter() {
		return extendedParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedParameter_Next() {
		return (EReference) extendedParameterEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedParameter_Previous() {
		return (EReference) extendedParameterEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedParameter_ExtendedParameterType() {
		return (EReference) extendedParameterEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedParameterList() {
		return extendedParameterListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedParameterList_Methods() {
		return (EReference) extendedParameterListEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedParameterList_Values() {
		return (EReference) extendedParameterListEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedParameterList_First() {
		return (EReference) extendedParameterListEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedType() {
		return extendedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedType_Type() {
		return (EReference) extendedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedType_TypeName() {
		return (EAttribute) extendedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedType_IsFromLib() {
		return (EAttribute) extendedTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedMethodName() {
		return extendedMethodNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedMethodName_ExtendedClassMethod() {
		return (EReference) extendedMethodNameEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedMethodName_Name() {
		return (EAttribute) extendedMethodNameEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedJamoppFactory getExtendedJamoppFactory() {
		return (ExtendedJamoppFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		extendedClassMethodEClass = createEClass(EXTENDED_CLASS_METHOD);
		createEReference(extendedClassMethodEClass,
				EXTENDED_CLASS_METHOD__EXTENDED_METHOD_NAME);
		createEReference(extendedClassMethodEClass,
				EXTENDED_CLASS_METHOD__PARAMETER_LIST);
		createEReference(extendedClassMethodEClass,
				EXTENDED_CLASS_METHOD__EXTENDED_RETURN_TYPE);

		extendedJamoppJavaContainerEClass = createEClass(EXTENDED_JAMOPP_JAVA_CONTAINER);
		createEReference(extendedJamoppJavaContainerEClass,
				EXTENDED_JAMOPP_JAVA_CONTAINER__COMPILATION_UNIT);
		createEReference(extendedJamoppJavaContainerEClass,
				EXTENDED_JAMOPP_JAVA_CONTAINER__ROOTS);
		createEReference(extendedJamoppJavaContainerEClass,
				EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_JAMOPP_PACKAGE_ELEMENT);
		createEReference(extendedJamoppJavaContainerEClass,
				EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_PARAMETER_LIST);
		createEReference(extendedJamoppJavaContainerEClass,
				EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_METHOD_NAME);

		extendedJamoppPackageElementEClass = createEClass(EXTENDED_JAMOPP_PACKAGE_ELEMENT);
		createEReference(extendedJamoppPackageElementEClass,
				EXTENDED_JAMOPP_PACKAGE_ELEMENT__SUCCESSOR);
		createEReference(extendedJamoppPackageElementEClass,
				EXTENDED_JAMOPP_PACKAGE_ELEMENT__PREDESSOR);
		createEReference(extendedJamoppPackageElementEClass,
				EXTENDED_JAMOPP_PACKAGE_ELEMENT__COMPILATION_UNIT);
		createEAttribute(extendedJamoppPackageElementEClass,
				EXTENDED_JAMOPP_PACKAGE_ELEMENT__NAME);

		extendedParameterEClass = createEClass(EXTENDED_PARAMETER);
		createEReference(extendedParameterEClass, EXTENDED_PARAMETER__NEXT);
		createEReference(extendedParameterEClass, EXTENDED_PARAMETER__PREVIOUS);
		createEReference(extendedParameterEClass,
				EXTENDED_PARAMETER__EXTENDED_PARAMETER_TYPE);

		extendedParameterListEClass = createEClass(EXTENDED_PARAMETER_LIST);
		createEReference(extendedParameterListEClass,
				EXTENDED_PARAMETER_LIST__METHODS);
		createEReference(extendedParameterListEClass,
				EXTENDED_PARAMETER_LIST__VALUES);
		createEReference(extendedParameterListEClass,
				EXTENDED_PARAMETER_LIST__FIRST);

		extendedTypeEClass = createEClass(EXTENDED_TYPE);
		createEReference(extendedTypeEClass, EXTENDED_TYPE__TYPE);
		createEAttribute(extendedTypeEClass, EXTENDED_TYPE__TYPE_NAME);
		createEAttribute(extendedTypeEClass, EXTENDED_TYPE__IS_FROM_LIB);

		extendedMethodNameEClass = createEClass(EXTENDED_METHOD_NAME);
		createEReference(extendedMethodNameEClass,
				EXTENDED_METHOD_NAME__EXTENDED_CLASS_METHOD);
		createEAttribute(extendedMethodNameEClass, EXTENDED_METHOD_NAME__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MembersPackage theMembersPackage = (MembersPackage) EPackage.Registry.INSTANCE
				.getEPackage(MembersPackage.eNS_URI);
		ContainersPackage theContainersPackage = (ContainersPackage) EPackage.Registry.INSTANCE
				.getEPackage(ContainersPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE
				.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		extendedClassMethodEClass.getESuperTypes().add(
				theMembersPackage.getClassMethod());

		// Initialize classes, features, and operations; add parameters
		initEClass(extendedClassMethodEClass, ExtendedClassMethod.class,
				"ExtendedClassMethod", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtendedClassMethod_ExtendedMethodName(),
				this.getExtendedMethodName(),
				this.getExtendedMethodName_ExtendedClassMethod(),
				"extendedMethodName", null, 0, 1, ExtendedClassMethod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getExtendedClassMethod_Parameter_list(),
				this.getExtendedParameterList(),
				this.getExtendedParameterList_Methods(), "parameter_list",
				null, 0, 1, ExtendedClassMethod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedClassMethod_ExtendedReturnType(),
				this.getExtendedType(), null, "extendedReturnType", null, 0, 1,
				ExtendedClassMethod.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendedJamoppJavaContainerEClass,
				ExtendedJamoppJavaContainer.class,
				"ExtendedJamoppJavaContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtendedJamoppJavaContainer_CompilationUnit(),
				theContainersPackage.getCompilationUnit(), null,
				"compilationUnit", null, 0, -1,
				ExtendedJamoppJavaContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedJamoppJavaContainer_Roots(),
				this.getExtendedJamoppPackageElement(), null, "roots", null, 0,
				-1, ExtendedJamoppJavaContainer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
				getExtendedJamoppJavaContainer_ExtendedJamoppPackageElement(),
				this.getExtendedJamoppPackageElement(), null,
				"extendedJamoppPackageElement", null, 0, -1,
				ExtendedJamoppJavaContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedJamoppJavaContainer_ExtendedParameterList(),
				this.getExtendedParameterList(), null, "extendedParameterList",
				null, 0, -1, ExtendedJamoppJavaContainer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedJamoppJavaContainer_ExtendedMethodName(),
				this.getExtendedMethodName(), null, "extendedMethodName", null,
				0, -1, ExtendedJamoppJavaContainer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendedJamoppPackageElementEClass,
				ExtendedJamoppPackageElement.class,
				"ExtendedJamoppPackageElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtendedJamoppPackageElement_Successor(),
				this.getExtendedJamoppPackageElement(),
				this.getExtendedJamoppPackageElement_Predessor(), "successor",
				null, 0, -1, ExtendedJamoppPackageElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedJamoppPackageElement_Predessor(),
				this.getExtendedJamoppPackageElement(),
				this.getExtendedJamoppPackageElement_Successor(), "predessor",
				null, 0, 1, ExtendedJamoppPackageElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedJamoppPackageElement_CompilationUnit(),
				theContainersPackage.getCompilationUnit(), null,
				"compilationUnit", null, 0, -1,
				ExtendedJamoppPackageElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedJamoppPackageElement_Name(),
				ecorePackage.getEString(), "name", null, 1, 1,
				ExtendedJamoppPackageElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(extendedParameterEClass, ExtendedParameter.class,
				"ExtendedParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtendedParameter_Next(),
				this.getExtendedParameter(),
				this.getExtendedParameter_Previous(), "next", null, 0, 1,
				ExtendedParameter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedParameter_Previous(),
				this.getExtendedParameter(), this.getExtendedParameter_Next(),
				"previous", null, 0, 1, ExtendedParameter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedParameter_ExtendedParameterType(),
				this.getExtendedType(), null, "extendedParameterType", null, 0,
				1, ExtendedParameter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendedParameterListEClass, ExtendedParameterList.class,
				"ExtendedParameterList", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtendedParameterList_Methods(),
				this.getExtendedClassMethod(),
				this.getExtendedClassMethod_Parameter_list(), "methods", null,
				1, -1, ExtendedParameterList.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedParameterList_Values(),
				this.getExtendedParameter(), null, "values", null, 0, -1,
				ExtendedParameterList.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedParameterList_First(),
				this.getExtendedParameter(), null, "first", null, 0, 1,
				ExtendedParameterList.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendedTypeEClass, ExtendedType.class, "ExtendedType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtendedType_Type(), theTypesPackage.getType(), null,
				"type", null, 1, 1, ExtendedType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedType_TypeName(), ecorePackage.getEString(),
				"typeName", null, 1, 1, ExtendedType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExtendedType_IsFromLib(), ecorePackage.getEBoolean(),
				"isFromLib", null, 1, 1, ExtendedType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(extendedMethodNameEClass, ExtendedMethodName.class,
				"ExtendedMethodName", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtendedMethodName_ExtendedClassMethod(),
				this.getExtendedClassMethod(),
				this.getExtendedClassMethod_ExtendedMethodName(),
				"extendedClassMethod", null, 0, -1, ExtendedMethodName.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getExtendedMethodName_Name(), ecorePackage.getEString(),
				"name", null, 1, 1, ExtendedMethodName.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ExtendedJamoppPackageImpl
