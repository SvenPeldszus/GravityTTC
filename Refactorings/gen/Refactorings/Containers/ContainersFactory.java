/**
 */
package Refactorings.Containers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Refactorings.Containers.ContainersPackage
 * @generated
 */
public interface ContainersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContainersFactory eINSTANCE = Refactorings.Containers.impl.ContainersFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>CSC Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSC Container</em>'.
	 * @generated
	 */
	CSCContainer createCSCContainer();

	/**
	 * Returns a new object of class '<em>PUM Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PUM Container</em>'.
	 * @generated
	 */
	PUMContainer createPUMContainer();

	/**
	 * Returns a new object of class '<em>TAccess Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAccess Container</em>'.
	 * @generated
	 */
	TAccessContainer createTAccessContainer();

	/**
	 * Returns a new object of class '<em>TClass Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TClass Container</em>'.
	 * @generated
	 */
	TClassContainer createTClassContainer();

	/**
	 * Returns a new object of class '<em>TMethod Definition Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMethod Definition Container</em>'.
	 * @generated
	 */
	TMethodDefinitionContainer createTMethodDefinitionContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContainersPackage getContainersPackage();

} //ContainersFactory
