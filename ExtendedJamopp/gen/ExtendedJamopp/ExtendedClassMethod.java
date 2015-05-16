/**
 */
package ExtendedJamopp;

import org.emftext.language.java.members.ClassMethod;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Class Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ExtendedJamopp.ExtendedClassMethod#getExtendedMethodName <em>Extended Method Name</em>}</li>
 *   <li>{@link ExtendedJamopp.ExtendedClassMethod#getParameter_list <em>Parameter list</em>}</li>
 *   <li>{@link ExtendedJamopp.ExtendedClassMethod#getExtendedReturnType <em>Extended Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedClassMethod()
 * @model
 * @generated
 */
public interface ExtendedClassMethod extends ClassMethod {
	/**
	 * Returns the value of the '<em><b>Extended Method Name</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ExtendedJamopp.ExtendedMethodName#getExtendedClassMethod <em>Extended Class Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Method Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Method Name</em>' reference.
	 * @see #setExtendedMethodName(ExtendedMethodName)
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedClassMethod_ExtendedMethodName()
	 * @see ExtendedJamopp.ExtendedMethodName#getExtendedClassMethod
	 * @model opposite="extendedClassMethod"
	 * @generated
	 */
	ExtendedMethodName getExtendedMethodName();

	/**
	 * Sets the value of the '{@link ExtendedJamopp.ExtendedClassMethod#getExtendedMethodName <em>Extended Method Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Method Name</em>' reference.
	 * @see #getExtendedMethodName()
	 * @generated
	 */
	void setExtendedMethodName(ExtendedMethodName value);

	/**
	 * Returns the value of the '<em><b>Parameter list</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ExtendedJamopp.ExtendedParameterList#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter list</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter list</em>' reference.
	 * @see #setParameter_list(ExtendedParameterList)
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedClassMethod_Parameter_list()
	 * @see ExtendedJamopp.ExtendedParameterList#getMethods
	 * @model opposite="methods"
	 * @generated
	 */
	ExtendedParameterList getParameter_list();

	/**
	 * Sets the value of the '{@link ExtendedJamopp.ExtendedClassMethod#getParameter_list <em>Parameter list</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter list</em>' reference.
	 * @see #getParameter_list()
	 * @generated
	 */
	void setParameter_list(ExtendedParameterList value);

	/**
	 * Returns the value of the '<em><b>Extended Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Return Type</em>' containment reference.
	 * @see #setExtendedReturnType(ExtendedType)
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedClassMethod_ExtendedReturnType()
	 * @model containment="true"
	 * @generated
	 */
	ExtendedType getExtendedReturnType();

	/**
	 * Sets the value of the '{@link ExtendedJamopp.ExtendedClassMethod#getExtendedReturnType <em>Extended Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Return Type</em>' containment reference.
	 * @see #getExtendedReturnType()
	 * @generated
	 */
	void setExtendedReturnType(ExtendedType value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ExtendedClassMethod
