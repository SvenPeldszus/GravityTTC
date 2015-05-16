/**
 */
package Refactorings.impl;

import Refactorings.Containers.ContainersPackage;

import Refactorings.Containers.impl.ContainersPackageImpl;

import Refactorings.Refactoring;
import Refactorings.RefactoringsFactory;
import Refactorings.RefactoringsPackage;
import Refactorings.Search;

import TypeGraphBasic.TypeGraphBasicPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefactoringsPackageImpl extends EPackageImpl implements
		RefactoringsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refactoringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchEClass = null;

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
	 * @see Refactorings.RefactoringsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RefactoringsPackageImpl() {
		super(eNS_URI, RefactoringsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RefactoringsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RefactoringsPackage init() {
		if (isInited)
			return (RefactoringsPackage) EPackage.Registry.INSTANCE
					.getEPackage(RefactoringsPackage.eNS_URI);

		// Obtain or create and register package
		RefactoringsPackageImpl theRefactoringsPackage = (RefactoringsPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RefactoringsPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new RefactoringsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypeGraphBasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ContainersPackageImpl theContainersPackage = (ContainersPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ContainersPackage.eNS_URI) instanceof ContainersPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ContainersPackage.eNS_URI)
				: ContainersPackage.eINSTANCE);

		// Create package meta-data objects
		theRefactoringsPackage.createPackageContents();
		theContainersPackage.createPackageContents();

		// Initialize created meta-data
		theRefactoringsPackage.initializePackageContents();
		theContainersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRefactoringsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RefactoringsPackage.eNS_URI,
				theRefactoringsPackage);
		return theRefactoringsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefactoring() {
		return refactoringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefactoring_Pg() {
		return (EReference) refactoringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefactoring_Search() {
		return (EReference) refactoringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRefactoring__Csc_isApplicable__TClassContainer_TClass() {
		return refactoringEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRefactoring__Csc_Perform__TClassContainer_TClass() {
		return refactoringEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRefactoring__Pum_isApplicable__TMethodSignature_TClass() {
		return refactoringEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRefactoring__Pum_Perform__TMethodSignature_TClass() {
		return refactoringEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearch() {
		return searchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearch_Pg() {
		return (EReference) searchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSearch__GetBasePackage__TClass() {
		return searchEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSearch__GetBasePackage__TPackage() {
		return searchEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSearch__IsChild__TClass_TClass() {
		return searchEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSearch__LinkClass__TClass() {
		return searchEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSearch__Equivalent__TPackage_TPackage() {
		return searchEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringsFactory getRefactoringsFactory() {
		return (RefactoringsFactory) getEFactoryInstance();
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
		refactoringEClass = createEClass(REFACTORING);
		createEReference(refactoringEClass, REFACTORING__PG);
		createEReference(refactoringEClass, REFACTORING__SEARCH);
		createEOperation(refactoringEClass,
				REFACTORING___CSC_IS_APPLICABLE__TCLASSCONTAINER_TCLASS);
		createEOperation(refactoringEClass,
				REFACTORING___CSC_PERFORM__TCLASSCONTAINER_TCLASS);
		createEOperation(refactoringEClass,
				REFACTORING___PUM_IS_APPLICABLE__TMETHODSIGNATURE_TCLASS);
		createEOperation(refactoringEClass,
				REFACTORING___PUM_PERFORM__TMETHODSIGNATURE_TCLASS);

		searchEClass = createEClass(SEARCH);
		createEReference(searchEClass, SEARCH__PG);
		createEOperation(searchEClass, SEARCH___GET_BASE_PACKAGE__TCLASS);
		createEOperation(searchEClass, SEARCH___GET_BASE_PACKAGE__TPACKAGE);
		createEOperation(searchEClass, SEARCH___IS_CHILD__TCLASS_TCLASS);
		createEOperation(searchEClass, SEARCH___LINK_CLASS__TCLASS);
		createEOperation(searchEClass, SEARCH___EQUIVALENT__TPACKAGE_TPACKAGE);
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
		ContainersPackage theContainersPackage = (ContainersPackage) EPackage.Registry.INSTANCE
				.getEPackage(ContainersPackage.eNS_URI);
		TypeGraphBasicPackage theTypeGraphBasicPackage = (TypeGraphBasicPackage) EPackage.Registry.INSTANCE
				.getEPackage(TypeGraphBasicPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theContainersPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(refactoringEClass, Refactoring.class, "Refactoring",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefactoring_Pg(),
				theTypeGraphBasicPackage.getTypeGraph(), null, "pg", null, 0,
				1, Refactoring.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefactoring_Search(), this.getSearch(), null,
				"search", null, 0, 1, Refactoring.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(
				getRefactoring__Csc_isApplicable__TClassContainer_TClass(),
				ecorePackage.getEBoolean(), "csc_isApplicable", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContainersPackage.getTClassContainer(), "child",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypeGraphBasicPackage.getTClass(), "new_parent",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getRefactoring__Csc_Perform__TClassContainer_TClass(),
				theContainersPackage.getTClassContainer(), "csc_Perform", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContainersPackage.getTClassContainer(), "child",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypeGraphBasicPackage.getTClass(), "new_parent",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getRefactoring__Pum_isApplicable__TMethodSignature_TClass(),
				ecorePackage.getEBoolean(), "pum_isApplicable", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypeGraphBasicPackage.getTMethodSignature(),
				"method", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypeGraphBasicPackage.getTClass(), "parent", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getRefactoring__Pum_Perform__TMethodSignature_TClass(),
				theContainersPackage.getTClassContainer(), "pum_Perform", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypeGraphBasicPackage.getTMethodSignature(),
				"method", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypeGraphBasicPackage.getTClass(), "parent", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(searchEClass, Search.class, "Search", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearch_Pg(), theTypeGraphBasicPackage.getTypeGraph(),
				null, "pg", null, 0, 1, Search.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSearch__GetBasePackage__TClass(),
				theTypeGraphBasicPackage.getTPackage(), "getBasePackage", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypeGraphBasicPackage.getTClass(), "tClass", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSearch__GetBasePackage__TPackage(),
				theTypeGraphBasicPackage.getTPackage(), "getBasePackage", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypeGraphBasicPackage.getTPackage(), "tPackage",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSearch__IsChild__TClass_TClass(),
				ecorePackage.getEBoolean(), "isChild", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTypeGraphBasicPackage.getTClass(), "child", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypeGraphBasicPackage.getTClass(), "parent", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSearch__LinkClass__TClass(), null, "linkClass",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypeGraphBasicPackage.getTClass(), "tClass", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSearch__Equivalent__TPackage_TPackage(),
				ecorePackage.getEBoolean(), "equivalent", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTypeGraphBasicPackage.getTPackage(), "package2",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypeGraphBasicPackage.getTPackage(), "package1",
				0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RefactoringsPackageImpl
