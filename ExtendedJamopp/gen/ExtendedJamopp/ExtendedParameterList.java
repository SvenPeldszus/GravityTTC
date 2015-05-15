/**
 */
package ExtendedJamopp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ExtendedJamopp.ExtendedParameterList#getMethods <em>Methods</em>}</li>
 *   <li>{@link ExtendedJamopp.ExtendedParameterList#getValues <em>Values</em>}</li>
 *   <li>{@link ExtendedJamopp.ExtendedParameterList#getFirst <em>First</em>}</li>
 * </ul>
 * </p>
 *
 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedParameterList()
 * @model
 * @generated
 */
public interface ExtendedParameterList extends EObject {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' reference list.
	 * The list contents are of type {@link ExtendedJamopp.ExtendedClassMethod}.
	 * It is bidirectional and its opposite is '{@link ExtendedJamopp.ExtendedClassMethod#getParameter_list <em>Parameter list</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' reference list.
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedParameterList_Methods()
	 * @see ExtendedJamopp.ExtendedClassMethod#getParameter_list
	 * @model opposite="parameter_list" required="true"
	 * @generated
	 */
	EList<ExtendedClassMethod> getMethods();

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link ExtendedJamopp.ExtendedParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedParameterList_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtendedParameter> getValues();

	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(ExtendedParameter)
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedParameterList_First()
	 * @model
	 * @generated
	 */
	ExtendedParameter getFirst();

	/**
	 * Sets the value of the '{@link ExtendedJamopp.ExtendedParameterList#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(ExtendedParameter value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ExtendedParameterList
