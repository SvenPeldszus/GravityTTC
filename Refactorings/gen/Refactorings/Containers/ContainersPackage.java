/**
 */
package Refactorings.Containers;

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
 * @see Refactorings.Containers.ContainersFactory
 * @model kind="package"
 * @generated
 */
public interface ContainersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Containers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/Refactorings/model/Refactorings.ecore#//Containers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Containers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContainersPackage eINSTANCE = Refactorings.Containers.impl.ContainersPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link Refactorings.Containers.impl.RefactoringContainerImpl <em>Refactoring Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Refactorings.Containers.impl.RefactoringContainerImpl
	 * @see Refactorings.Containers.impl.ContainersPackageImpl#getRefactoringContainer()
	 * @generated
	 */
	int REFACTORING_CONTAINER = 2;

	/**
	 * The number of structural features of the '<em>Refactoring Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING_CONTAINER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Refactoring Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Refactorings.Containers.impl.CSCContainerImpl <em>CSC Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Refactorings.Containers.impl.CSCContainerImpl
	 * @see Refactorings.Containers.impl.ContainersPackageImpl#getCSCContainer()
	 * @generated
	 */
	int CSC_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>New parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSC_CONTAINER__NEW_PARENT = REFACTORING_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSC_CONTAINER__CHILD = REFACTORING_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CSC Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSC_CONTAINER_FEATURE_COUNT = REFACTORING_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CSC Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSC_CONTAINER_OPERATION_COUNT = REFACTORING_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Refactorings.Containers.impl.PUMContainerImpl <em>PUM Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Refactorings.Containers.impl.PUMContainerImpl
	 * @see Refactorings.Containers.impl.ContainersPackageImpl#getPUMContainer()
	 * @generated
	 */
	int PUM_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUM_CONTAINER__PARENT = REFACTORING_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUM_CONTAINER__METHOD = REFACTORING_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PUM Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUM_CONTAINER_FEATURE_COUNT = REFACTORING_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PUM Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUM_CONTAINER_OPERATION_COUNT = REFACTORING_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Refactorings.Containers.impl.TAccessContainerImpl <em>TAccess Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Refactorings.Containers.impl.TAccessContainerImpl
	 * @see Refactorings.Containers.impl.ContainersPackageImpl#getTAccessContainer()
	 * @generated
	 */
	int TACCESS_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>TMember</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_CONTAINER__TMEMBER = 0;

	/**
	 * The number of structural features of the '<em>TAccess Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TAccess Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Refactorings.Containers.impl.TClassContainerImpl <em>TClass Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Refactorings.Containers.impl.TClassContainerImpl
	 * @see Refactorings.Containers.impl.ContainersPackageImpl#getTClassContainer()
	 * @generated
	 */
	int TCLASS_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>TClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_CONTAINER__TCLASS = 0;

	/**
	 * The number of structural features of the '<em>TClass Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TClass Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Refactorings.Containers.impl.TMethodDefinitionContainerImpl <em>TMethod Definition Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Refactorings.Containers.impl.TMethodDefinitionContainerImpl
	 * @see Refactorings.Containers.impl.ContainersPackageImpl#getTMethodDefinitionContainer()
	 * @generated
	 */
	int TMETHOD_DEFINITION_CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>TMethod Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION_CONTAINER__TMETHOD_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>TMethod Definition Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TMethod Definition Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link Refactorings.Containers.CSCContainer <em>CSC Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSC Container</em>'.
	 * @see Refactorings.Containers.CSCContainer
	 * @generated
	 */
	EClass getCSCContainer();

	/**
	 * Returns the meta object for the reference '{@link Refactorings.Containers.CSCContainer#getNew_parent <em>New parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New parent</em>'.
	 * @see Refactorings.Containers.CSCContainer#getNew_parent()
	 * @see #getCSCContainer()
	 * @generated
	 */
	EReference getCSCContainer_New_parent();

	/**
	 * Returns the meta object for the reference '{@link Refactorings.Containers.CSCContainer#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see Refactorings.Containers.CSCContainer#getChild()
	 * @see #getCSCContainer()
	 * @generated
	 */
	EReference getCSCContainer_Child();

	/**
	 * Returns the meta object for class '{@link Refactorings.Containers.PUMContainer <em>PUM Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PUM Container</em>'.
	 * @see Refactorings.Containers.PUMContainer
	 * @generated
	 */
	EClass getPUMContainer();

	/**
	 * Returns the meta object for the reference '{@link Refactorings.Containers.PUMContainer#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see Refactorings.Containers.PUMContainer#getParent()
	 * @see #getPUMContainer()
	 * @generated
	 */
	EReference getPUMContainer_Parent();

	/**
	 * Returns the meta object for the reference '{@link Refactorings.Containers.PUMContainer#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see Refactorings.Containers.PUMContainer#getMethod()
	 * @see #getPUMContainer()
	 * @generated
	 */
	EReference getPUMContainer_Method();

	/**
	 * Returns the meta object for class '{@link Refactorings.Containers.RefactoringContainer <em>Refactoring Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refactoring Container</em>'.
	 * @see Refactorings.Containers.RefactoringContainer
	 * @generated
	 */
	EClass getRefactoringContainer();

	/**
	 * Returns the meta object for class '{@link Refactorings.Containers.TAccessContainer <em>TAccess Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAccess Container</em>'.
	 * @see Refactorings.Containers.TAccessContainer
	 * @generated
	 */
	EClass getTAccessContainer();

	/**
	 * Returns the meta object for the reference list '{@link Refactorings.Containers.TAccessContainer#getTMember <em>TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>TMember</em>'.
	 * @see Refactorings.Containers.TAccessContainer#getTMember()
	 * @see #getTAccessContainer()
	 * @generated
	 */
	EReference getTAccessContainer_TMember();

	/**
	 * Returns the meta object for class '{@link Refactorings.Containers.TClassContainer <em>TClass Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TClass Container</em>'.
	 * @see Refactorings.Containers.TClassContainer
	 * @generated
	 */
	EClass getTClassContainer();

	/**
	 * Returns the meta object for the reference list '{@link Refactorings.Containers.TClassContainer#getTClass <em>TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>TClass</em>'.
	 * @see Refactorings.Containers.TClassContainer#getTClass()
	 * @see #getTClassContainer()
	 * @generated
	 */
	EReference getTClassContainer_TClass();

	/**
	 * Returns the meta object for class '{@link Refactorings.Containers.TMethodDefinitionContainer <em>TMethod Definition Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMethod Definition Container</em>'.
	 * @see Refactorings.Containers.TMethodDefinitionContainer
	 * @generated
	 */
	EClass getTMethodDefinitionContainer();

	/**
	 * Returns the meta object for the reference list '{@link Refactorings.Containers.TMethodDefinitionContainer#getTMethodDefinition <em>TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>TMethod Definition</em>'.
	 * @see Refactorings.Containers.TMethodDefinitionContainer#getTMethodDefinition()
	 * @see #getTMethodDefinitionContainer()
	 * @generated
	 */
	EReference getTMethodDefinitionContainer_TMethodDefinition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContainersFactory getContainersFactory();

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
		 * The meta object literal for the '{@link Refactorings.Containers.impl.CSCContainerImpl <em>CSC Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Refactorings.Containers.impl.CSCContainerImpl
		 * @see Refactorings.Containers.impl.ContainersPackageImpl#getCSCContainer()
		 * @generated
		 */
		EClass CSC_CONTAINER = eINSTANCE.getCSCContainer();

		/**
		 * The meta object literal for the '<em><b>New parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSC_CONTAINER__NEW_PARENT = eINSTANCE
				.getCSCContainer_New_parent();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSC_CONTAINER__CHILD = eINSTANCE.getCSCContainer_Child();

		/**
		 * The meta object literal for the '{@link Refactorings.Containers.impl.PUMContainerImpl <em>PUM Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Refactorings.Containers.impl.PUMContainerImpl
		 * @see Refactorings.Containers.impl.ContainersPackageImpl#getPUMContainer()
		 * @generated
		 */
		EClass PUM_CONTAINER = eINSTANCE.getPUMContainer();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUM_CONTAINER__PARENT = eINSTANCE.getPUMContainer_Parent();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUM_CONTAINER__METHOD = eINSTANCE.getPUMContainer_Method();

		/**
		 * The meta object literal for the '{@link Refactorings.Containers.impl.RefactoringContainerImpl <em>Refactoring Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Refactorings.Containers.impl.RefactoringContainerImpl
		 * @see Refactorings.Containers.impl.ContainersPackageImpl#getRefactoringContainer()
		 * @generated
		 */
		EClass REFACTORING_CONTAINER = eINSTANCE.getRefactoringContainer();

		/**
		 * The meta object literal for the '{@link Refactorings.Containers.impl.TAccessContainerImpl <em>TAccess Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Refactorings.Containers.impl.TAccessContainerImpl
		 * @see Refactorings.Containers.impl.ContainersPackageImpl#getTAccessContainer()
		 * @generated
		 */
		EClass TACCESS_CONTAINER = eINSTANCE.getTAccessContainer();

		/**
		 * The meta object literal for the '<em><b>TMember</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TACCESS_CONTAINER__TMEMBER = eINSTANCE
				.getTAccessContainer_TMember();

		/**
		 * The meta object literal for the '{@link Refactorings.Containers.impl.TClassContainerImpl <em>TClass Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Refactorings.Containers.impl.TClassContainerImpl
		 * @see Refactorings.Containers.impl.ContainersPackageImpl#getTClassContainer()
		 * @generated
		 */
		EClass TCLASS_CONTAINER = eINSTANCE.getTClassContainer();

		/**
		 * The meta object literal for the '<em><b>TClass</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCLASS_CONTAINER__TCLASS = eINSTANCE
				.getTClassContainer_TClass();

		/**
		 * The meta object literal for the '{@link Refactorings.Containers.impl.TMethodDefinitionContainerImpl <em>TMethod Definition Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Refactorings.Containers.impl.TMethodDefinitionContainerImpl
		 * @see Refactorings.Containers.impl.ContainersPackageImpl#getTMethodDefinitionContainer()
		 * @generated
		 */
		EClass TMETHOD_DEFINITION_CONTAINER = eINSTANCE
				.getTMethodDefinitionContainer();

		/**
		 * The meta object literal for the '<em><b>TMethod Definition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_DEFINITION_CONTAINER__TMETHOD_DEFINITION = eINSTANCE
				.getTMethodDefinitionContainer_TMethodDefinition();

	}

} //ContainersPackage
