/**
 */
package GravityTGG;

import ExtendedJamopp.ExtendedParameterList;

import TGGRuntime.AbstractCorrespondence;

import TypeGraphBasic.TParameterList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Parameter List To TParameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GravityTGG.ExtendedParameterListToTParameterList#getTarget <em>Target</em>}</li>
 *   <li>{@link GravityTGG.ExtendedParameterListToTParameterList#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see GravityTGG.GravityTGGPackage#getExtendedParameterListToTParameterList()
 * @model
 * @generated
 */
public interface ExtendedParameterListToTParameterList extends EObject,
		AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TParameterList)
	 * @see GravityTGG.GravityTGGPackage#getExtendedParameterListToTParameterList_Target()
	 * @model required="true"
	 * @generated
	 */
	TParameterList getTarget();

	/**
	 * Sets the value of the '{@link GravityTGG.ExtendedParameterListToTParameterList#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TParameterList value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ExtendedParameterList)
	 * @see GravityTGG.GravityTGGPackage#getExtendedParameterListToTParameterList_Source()
	 * @model required="true"
	 * @generated
	 */
	ExtendedParameterList getSource();

	/**
	 * Sets the value of the '{@link GravityTGG.ExtendedParameterListToTParameterList#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ExtendedParameterList value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ExtendedParameterListToTParameterList
