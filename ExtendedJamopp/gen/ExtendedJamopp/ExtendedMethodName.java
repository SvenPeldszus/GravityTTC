/**
 */
package ExtendedJamopp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Method Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ExtendedJamopp.ExtendedMethodName#getExtendedClassMethod <em>Extended Class Method</em>}</li>
 *   <li>{@link ExtendedJamopp.ExtendedMethodName#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedMethodName()
 * @model
 * @generated
 */
public interface ExtendedMethodName extends EObject {
	/**
	 * Returns the value of the '<em><b>Extended Class Method</b></em>' reference list.
	 * The list contents are of type {@link ExtendedJamopp.ExtendedClassMethod}.
	 * It is bidirectional and its opposite is '{@link ExtendedJamopp.ExtendedClassMethod#getExtendedMethodName <em>Extended Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Class Method</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Class Method</em>' reference list.
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedMethodName_ExtendedClassMethod()
	 * @see ExtendedJamopp.ExtendedClassMethod#getExtendedMethodName
	 * @model opposite="extendedMethodName"
	 * @generated
	 */
	EList<ExtendedClassMethod> getExtendedClassMethod();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedMethodName_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ExtendedJamopp.ExtendedMethodName#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ExtendedMethodName
