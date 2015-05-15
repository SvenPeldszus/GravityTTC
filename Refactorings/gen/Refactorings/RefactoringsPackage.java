/**
 */
package Refactorings;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see Refactorings.RefactoringsFactory
 * @model kind="package"
 * @generated
 */
public interface RefactoringsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Refactorings";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/Refactorings/model/Refactorings.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Refactorings";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefactoringsPackage eINSTANCE = Refactorings.impl.RefactoringsPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link Refactorings.impl.RefactoringImpl <em>Refactoring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Refactorings.impl.RefactoringImpl
	 * @see Refactorings.impl.RefactoringsPackageImpl#getRefactoring()
	 * @generated
	 */
	int REFACTORING = 0;

	/**
	 * The feature id for the '<em><b>Pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING__PG = 0;

	/**
	 * The feature id for the '<em><b>Search</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING__SEARCH = 1;

	/**
	 * The number of structural features of the '<em>Refactoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Csc is Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING___CSC_IS_APPLICABLE__TCLASSCONTAINER_TCLASS = 0;

	/**
	 * The operation id for the '<em>Csc Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING___CSC_PERFORM__TCLASSCONTAINER_TCLASS = 1;

	/**
	 * The operation id for the '<em>Pum is Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING___PUM_IS_APPLICABLE__TMETHODSIGNATURE_TCLASS = 2;

	/**
	 * The operation id for the '<em>Pum Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING___PUM_PERFORM__TMETHODSIGNATURE_TCLASS = 3;

	/**
	 * The number of operations of the '<em>Refactoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link Refactorings.impl.SearchImpl <em>Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Refactorings.impl.SearchImpl
	 * @see Refactorings.impl.RefactoringsPackageImpl#getSearch()
	 * @generated
	 */
	int SEARCH = 1;

	/**
	 * The feature id for the '<em><b>Pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__PG = 0;

	/**
	 * The number of structural features of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Base Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH___GET_BASE_PACKAGE__TCLASS = 0;

	/**
	 * The operation id for the '<em>Get Base Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH___GET_BASE_PACKAGE__TPACKAGE = 1;

	/**
	 * The operation id for the '<em>Is Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH___IS_CHILD__TCLASS_TCLASS = 2;

	/**
	 * The operation id for the '<em>Link Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH___LINK_CLASS__TCLASS = 3;

	/**
	 * The operation id for the '<em>Equivalent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH___EQUIVALENT__TPACKAGE_TPACKAGE = 4;

	/**
	 * The number of operations of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_OPERATION_COUNT = 5;

	/**
	 * Returns the meta object for class '{@link Refactorings.Refactoring <em>Refactoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refactoring</em>'.
	 * @see Refactorings.Refactoring
	 * @generated
	 */
	EClass getRefactoring();

	/**
	 * Returns the meta object for the reference '{@link Refactorings.Refactoring#getPg <em>Pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pg</em>'.
	 * @see Refactorings.Refactoring#getPg()
	 * @see #getRefactoring()
	 * @generated
	 */
	EReference getRefactoring_Pg();

	/**
	 * Returns the meta object for the reference '{@link Refactorings.Refactoring#getSearch <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Search</em>'.
	 * @see Refactorings.Refactoring#getSearch()
	 * @see #getRefactoring()
	 * @generated
	 */
	EReference getRefactoring_Search();

	/**
	 * Returns the meta object for the '{@link Refactorings.Refactoring#csc_isApplicable(Refactorings.Containers.TClassContainer, TypeGraphBasic.TClass) <em>Csc is Applicable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Csc is Applicable</em>' operation.
	 * @see Refactorings.Refactoring#csc_isApplicable(Refactorings.Containers.TClassContainer, TypeGraphBasic.TClass)
	 * @generated
	 */
	EOperation getRefactoring__Csc_isApplicable__TClassContainer_TClass();

	/**
	 * Returns the meta object for the '{@link Refactorings.Refactoring#csc_Perform(Refactorings.Containers.TClassContainer, TypeGraphBasic.TClass) <em>Csc Perform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Csc Perform</em>' operation.
	 * @see Refactorings.Refactoring#csc_Perform(Refactorings.Containers.TClassContainer, TypeGraphBasic.TClass)
	 * @generated
	 */
	EOperation getRefactoring__Csc_Perform__TClassContainer_TClass();

	/**
	 * Returns the meta object for the '{@link Refactorings.Refactoring#pum_isApplicable(TypeGraphBasic.TMethodSignature, TypeGraphBasic.TClass) <em>Pum is Applicable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pum is Applicable</em>' operation.
	 * @see Refactorings.Refactoring#pum_isApplicable(TypeGraphBasic.TMethodSignature, TypeGraphBasic.TClass)
	 * @generated
	 */
	EOperation getRefactoring__Pum_isApplicable__TMethodSignature_TClass();

	/**
	 * Returns the meta object for the '{@link Refactorings.Refactoring#pum_Perform(TypeGraphBasic.TMethodSignature, TypeGraphBasic.TClass) <em>Pum Perform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pum Perform</em>' operation.
	 * @see Refactorings.Refactoring#pum_Perform(TypeGraphBasic.TMethodSignature, TypeGraphBasic.TClass)
	 * @generated
	 */
	EOperation getRefactoring__Pum_Perform__TMethodSignature_TClass();

	/**
	 * Returns the meta object for class '{@link Refactorings.Search <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search</em>'.
	 * @see Refactorings.Search
	 * @generated
	 */
	EClass getSearch();

	/**
	 * Returns the meta object for the reference '{@link Refactorings.Search#getPg <em>Pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pg</em>'.
	 * @see Refactorings.Search#getPg()
	 * @see #getSearch()
	 * @generated
	 */
	EReference getSearch_Pg();

	/**
	 * Returns the meta object for the '{@link Refactorings.Search#getBasePackage(TypeGraphBasic.TClass) <em>Get Base Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Base Package</em>' operation.
	 * @see Refactorings.Search#getBasePackage(TypeGraphBasic.TClass)
	 * @generated
	 */
	EOperation getSearch__GetBasePackage__TClass();

	/**
	 * Returns the meta object for the '{@link Refactorings.Search#getBasePackage(TypeGraphBasic.TPackage) <em>Get Base Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Base Package</em>' operation.
	 * @see Refactorings.Search#getBasePackage(TypeGraphBasic.TPackage)
	 * @generated
	 */
	EOperation getSearch__GetBasePackage__TPackage();

	/**
	 * Returns the meta object for the '{@link Refactorings.Search#isChild(TypeGraphBasic.TClass, TypeGraphBasic.TClass) <em>Is Child</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Child</em>' operation.
	 * @see Refactorings.Search#isChild(TypeGraphBasic.TClass, TypeGraphBasic.TClass)
	 * @generated
	 */
	EOperation getSearch__IsChild__TClass_TClass();

	/**
	 * Returns the meta object for the '{@link Refactorings.Search#linkClass(TypeGraphBasic.TClass) <em>Link Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Link Class</em>' operation.
	 * @see Refactorings.Search#linkClass(TypeGraphBasic.TClass)
	 * @generated
	 */
	EOperation getSearch__LinkClass__TClass();

	/**
	 * Returns the meta object for the '{@link Refactorings.Search#equivalent(TypeGraphBasic.TPackage, TypeGraphBasic.TPackage) <em>Equivalent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equivalent</em>' operation.
	 * @see Refactorings.Search#equivalent(TypeGraphBasic.TPackage, TypeGraphBasic.TPackage)
	 * @generated
	 */
	EOperation getSearch__Equivalent__TPackage_TPackage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RefactoringsFactory getRefactoringsFactory();

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
		 * The meta object literal for the '{@link Refactorings.impl.RefactoringImpl <em>Refactoring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Refactorings.impl.RefactoringImpl
		 * @see Refactorings.impl.RefactoringsPackageImpl#getRefactoring()
		 * @generated
		 */
		EClass REFACTORING = eINSTANCE.getRefactoring();

		/**
		 * The meta object literal for the '<em><b>Pg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFACTORING__PG = eINSTANCE.getRefactoring_Pg();

		/**
		 * The meta object literal for the '<em><b>Search</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFACTORING__SEARCH = eINSTANCE.getRefactoring_Search();

		/**
		 * The meta object literal for the '<em><b>Csc is Applicable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFACTORING___CSC_IS_APPLICABLE__TCLASSCONTAINER_TCLASS = eINSTANCE
				.getRefactoring__Csc_isApplicable__TClassContainer_TClass();

		/**
		 * The meta object literal for the '<em><b>Csc Perform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFACTORING___CSC_PERFORM__TCLASSCONTAINER_TCLASS = eINSTANCE
				.getRefactoring__Csc_Perform__TClassContainer_TClass();

		/**
		 * The meta object literal for the '<em><b>Pum is Applicable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFACTORING___PUM_IS_APPLICABLE__TMETHODSIGNATURE_TCLASS = eINSTANCE
				.getRefactoring__Pum_isApplicable__TMethodSignature_TClass();

		/**
		 * The meta object literal for the '<em><b>Pum Perform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFACTORING___PUM_PERFORM__TMETHODSIGNATURE_TCLASS = eINSTANCE
				.getRefactoring__Pum_Perform__TMethodSignature_TClass();

		/**
		 * The meta object literal for the '{@link Refactorings.impl.SearchImpl <em>Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Refactorings.impl.SearchImpl
		 * @see Refactorings.impl.RefactoringsPackageImpl#getSearch()
		 * @generated
		 */
		EClass SEARCH = eINSTANCE.getSearch();

		/**
		 * The meta object literal for the '<em><b>Pg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH__PG = eINSTANCE.getSearch_Pg();

		/**
		 * The meta object literal for the '<em><b>Get Base Package</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEARCH___GET_BASE_PACKAGE__TCLASS = eINSTANCE
				.getSearch__GetBasePackage__TClass();

		/**
		 * The meta object literal for the '<em><b>Get Base Package</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEARCH___GET_BASE_PACKAGE__TPACKAGE = eINSTANCE
				.getSearch__GetBasePackage__TPackage();

		/**
		 * The meta object literal for the '<em><b>Is Child</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEARCH___IS_CHILD__TCLASS_TCLASS = eINSTANCE
				.getSearch__IsChild__TClass_TClass();

		/**
		 * The meta object literal for the '<em><b>Link Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEARCH___LINK_CLASS__TCLASS = eINSTANCE
				.getSearch__LinkClass__TClass();

		/**
		 * The meta object literal for the '<em><b>Equivalent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEARCH___EQUIVALENT__TPACKAGE_TPACKAGE = eINSTANCE
				.getSearch__Equivalent__TPackage_TPackage();

	}

} //RefactoringsPackage
