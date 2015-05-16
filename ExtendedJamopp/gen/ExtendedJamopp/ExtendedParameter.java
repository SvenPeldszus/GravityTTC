/**
 */
package ExtendedJamopp;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ExtendedJamopp.ExtendedParameter#getNext <em>Next</em>}</li>
 *   <li>{@link ExtendedJamopp.ExtendedParameter#getPrevious <em>Previous</em>}</li>
 *   <li>{@link ExtendedJamopp.ExtendedParameter#getExtendedParameterType <em>Extended Parameter Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedParameter()
 * @model
 * @generated
 */
public interface ExtendedParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ExtendedJamopp.ExtendedParameter#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(ExtendedParameter)
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedParameter_Next()
	 * @see ExtendedJamopp.ExtendedParameter#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	ExtendedParameter getNext();

	/**
	 * Sets the value of the '{@link ExtendedJamopp.ExtendedParameter#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(ExtendedParameter value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ExtendedJamopp.ExtendedParameter#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(ExtendedParameter)
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedParameter_Previous()
	 * @see ExtendedJamopp.ExtendedParameter#getNext
	 * @model opposite="next"
	 * @generated
	 */
	ExtendedParameter getPrevious();

	/**
	 * Sets the value of the '{@link ExtendedJamopp.ExtendedParameter#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(ExtendedParameter value);

	/**
	 * Returns the value of the '<em><b>Extended Parameter Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Parameter Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Parameter Type</em>' containment reference.
	 * @see #setExtendedParameterType(ExtendedType)
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedParameter_ExtendedParameterType()
	 * @model containment="true"
	 * @generated
	 */
	ExtendedType getExtendedParameterType();

	/**
	 * Sets the value of the '{@link ExtendedJamopp.ExtendedParameter#getExtendedParameterType <em>Extended Parameter Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Parameter Type</em>' containment reference.
	 * @see #getExtendedParameterType()
	 * @generated
	 */
	void setExtendedParameterType(ExtendedType value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ExtendedParameter
