/**
 */
package Refactorings.Containers.impl;

import Refactorings.Containers.CSCContainer;
import Refactorings.Containers.ContainersFactory;
import Refactorings.Containers.ContainersPackage;
import Refactorings.Containers.PUMContainer;
import Refactorings.Containers.RefactoringContainer;
import Refactorings.Containers.TAccessContainer;
import Refactorings.Containers.TClassContainer;
import Refactorings.Containers.TMethodDefinitionContainer;

import Refactorings.RefactoringsPackage;

import Refactorings.impl.RefactoringsPackageImpl;

import TypeGraphBasic.TypeGraphBasicPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainersPackageImpl extends EPackageImpl implements
		ContainersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cscContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pumContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refactoringContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAccessContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tClassContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tMethodDefinitionContainerEClass = null;

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
	 * @see Refactorings.Containers.ContainersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContainersPackageImpl() {
		super(eNS_URI, ContainersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContainersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContainersPackage init() {
		if (isInited)
			return (ContainersPackage) EPackage.Registry.INSTANCE
					.getEPackage(ContainersPackage.eNS_URI);

		// Obtain or create and register package
		ContainersPackageImpl theContainersPackage = (ContainersPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ContainersPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new ContainersPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypeGraphBasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RefactoringsPackageImpl theRefactoringsPackage = (RefactoringsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RefactoringsPackage.eNS_URI) instanceof RefactoringsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(RefactoringsPackage.eNS_URI)
				: RefactoringsPackage.eINSTANCE);

		// Create package meta-data objects
		theContainersPackage.createPackageContents();
		theRefactoringsPackage.createPackageContents();

		// Initialize created meta-data
		theContainersPackage.initializePackageContents();
		theRefactoringsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContainersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContainersPackage.eNS_URI,
				theContainersPackage);
		return theContainersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSCContainer() {
		return cscContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSCContainer_New_parent() {
		return (EReference) cscContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSCContainer_Child() {
		return (EReference) cscContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPUMContainer() {
		return pumContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPUMContainer_Parent() {
		return (EReference) pumContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPUMContainer_Method() {
		return (EReference) pumContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefactoringContainer() {
		return refactoringContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTAccessContainer() {
		return tAccessContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAccessContainer_TMember() {
		return (EReference) tAccessContainerEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTClassContainer() {
		return tClassContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTClassContainer_TClass() {
		return (EReference) tClassContainerEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMethodDefinitionContainer() {
		return tMethodDefinitionContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodDefinitionContainer_TMethodDefinition() {
		return (EReference) tMethodDefinitionContainerEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainersFactory getContainersFactory() {
		return (ContainersFactory) getEFactoryInstance();
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
		cscContainerEClass = createEClass(CSC_CONTAINER);
		createEReference(cscContainerEClass, CSC_CONTAINER__NEW_PARENT);
		createEReference(cscContainerEClass, CSC_CONTAINER__CHILD);

		pumContainerEClass = createEClass(PUM_CONTAINER);
		createEReference(pumContainerEClass, PUM_CONTAINER__PARENT);
		createEReference(pumContainerEClass, PUM_CONTAINER__METHOD);

		refactoringContainerEClass = createEClass(REFACTORING_CONTAINER);

		tAccessContainerEClass = createEClass(TACCESS_CONTAINER);
		createEReference(tAccessContainerEClass, TACCESS_CONTAINER__TMEMBER);

		tClassContainerEClass = createEClass(TCLASS_CONTAINER);
		createEReference(tClassContainerEClass, TCLASS_CONTAINER__TCLASS);

		tMethodDefinitionContainerEClass = createEClass(TMETHOD_DEFINITION_CONTAINER);
		createEReference(tMethodDefinitionContainerEClass,
				TMETHOD_DEFINITION_CONTAINER__TMETHOD_DEFINITION);
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
		TypeGraphBasicPackage theTypeGraphBasicPackage = (TypeGraphBasicPackage) EPackage.Registry.INSTANCE
				.getEPackage(TypeGraphBasicPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cscContainerEClass.getESuperTypes().add(this.getRefactoringContainer());
		pumContainerEClass.getESuperTypes().add(this.getRefactoringContainer());

		// Initialize classes, features, and operations; add parameters
		initEClass(cscContainerEClass, CSCContainer.class, "CSCContainer",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSCContainer_New_parent(),
				theTypeGraphBasicPackage.getTClass(), null, "new_parent", null,
				1, 1, CSCContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSCContainer_Child(), this.getTClassContainer(),
				null, "child", null, 1, 1, CSCContainer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pumContainerEClass, PUMContainer.class, "PUMContainer",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPUMContainer_Parent(),
				theTypeGraphBasicPackage.getTClass(), null, "parent", null, 1,
				1, PUMContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPUMContainer_Method(),
				theTypeGraphBasicPackage.getTMethodSignature(), null, "method",
				null, 1, 1, PUMContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refactoringContainerEClass, RefactoringContainer.class,
				"RefactoringContainer", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(tAccessContainerEClass, TAccessContainer.class,
				"TAccessContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTAccessContainer_TMember(),
				theTypeGraphBasicPackage.getTMember(), null, "tMember", null,
				0, -1, TAccessContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tClassContainerEClass, TClassContainer.class,
				"TClassContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTClassContainer_TClass(),
				theTypeGraphBasicPackage.getTClass(), null, "tClass", null, 0,
				-1, TClassContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tMethodDefinitionContainerEClass,
				TMethodDefinitionContainer.class, "TMethodDefinitionContainer",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMethodDefinitionContainer_TMethodDefinition(),
				theTypeGraphBasicPackage.getTMethodDefinition(), null,
				"tMethodDefinition", null, 0, -1,
				TMethodDefinitionContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ContainersPackageImpl
