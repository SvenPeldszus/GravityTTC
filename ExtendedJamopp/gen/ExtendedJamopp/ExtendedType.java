/**
 */
package ExtendedJamopp;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.java.types.Type;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ExtendedJamopp.ExtendedType#getType <em>Type</em>}</li>
 *   <li>{@link ExtendedJamopp.ExtendedType#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link ExtendedJamopp.ExtendedType#isIsFromLib <em>Is From Lib</em>}</li>
 * </ul>
 * </p>
 *
 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedType()
 * @model
 * @generated
 */
public interface ExtendedType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedType_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link ExtendedJamopp.ExtendedType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedType_TypeName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link ExtendedJamopp.ExtendedType#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Is From Lib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is From Lib</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is From Lib</em>' attribute.
	 * @see #setIsFromLib(boolean)
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedType_IsFromLib()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsFromLib();

	/**
	 * Sets the value of the '{@link ExtendedJamopp.ExtendedType#isIsFromLib <em>Is From Lib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is From Lib</em>' attribute.
	 * @see #isIsFromLib()
	 * @generated
	 */
	void setIsFromLib(boolean value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ExtendedType
