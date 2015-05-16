/**
 */
package ExtendedJamopp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ExtendedJamopp.ExtendedJamoppPackage
 * @generated
 */
public interface ExtendedJamoppFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtendedJamoppFactory eINSTANCE = ExtendedJamopp.impl.ExtendedJamoppFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Extended Class Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Class Method</em>'.
	 * @generated
	 */
	ExtendedClassMethod createExtendedClassMethod();

	/**
	 * Returns a new object of class '<em>Java Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Container</em>'.
	 * @generated
	 */
	ExtendedJamoppJavaContainer createExtendedJamoppJavaContainer();

	/**
	 * Returns a new object of class '<em>Package Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Element</em>'.
	 * @generated
	 */
	ExtendedJamoppPackageElement createExtendedJamoppPackageElement();

	/**
	 * Returns a new object of class '<em>Extended Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Parameter</em>'.
	 * @generated
	 */
	ExtendedParameter createExtendedParameter();

	/**
	 * Returns a new object of class '<em>Extended Parameter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Parameter List</em>'.
	 * @generated
	 */
	ExtendedParameterList createExtendedParameterList();

	/**
	 * Returns a new object of class '<em>Extended Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Type</em>'.
	 * @generated
	 */
	ExtendedType createExtendedType();

	/**
	 * Returns a new object of class '<em>Extended Method Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Method Name</em>'.
	 * @generated
	 */
	ExtendedMethodName createExtendedMethodName();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExtendedJamoppPackage getExtendedJamoppPackage();

} //ExtendedJamoppFactory
