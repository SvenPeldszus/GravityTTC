/**
 */
package Refactorings.impl;

import Refactorings.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefactoringsFactoryImpl extends EFactoryImpl implements
		RefactoringsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RefactoringsFactory init() {
		try {
			RefactoringsFactory theRefactoringsFactory = (RefactoringsFactory) EPackage.Registry.INSTANCE
					.getEFactory(RefactoringsPackage.eNS_URI);
			if (theRefactoringsFactory != null) {
				return theRefactoringsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RefactoringsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RefactoringsPackage.REFACTORING:
			return createRefactoring();
		case RefactoringsPackage.SEARCH:
			return createSearch();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refactoring createRefactoring() {
		RefactoringImpl refactoring = new RefactoringImpl();
		return refactoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Search createSearch() {
		SearchImpl search = new SearchImpl();
		return search;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringsPackage getRefactoringsPackage() {
		return (RefactoringsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RefactoringsPackage getPackage() {
		return RefactoringsPackage.eINSTANCE;
	}

} //RefactoringsFactoryImpl
