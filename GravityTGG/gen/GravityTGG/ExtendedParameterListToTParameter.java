/**
 */
package GravityTGG;

import ExtendedJamopp.ExtendedParameterList;

import TGGRuntime.AbstractCorrespondence;

import TypeGraphBasic.TParameter;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Parameter List To TParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GravityTGG.ExtendedParameterListToTParameter#getSource <em>Source</em>}</li>
 *   <li>{@link GravityTGG.ExtendedParameterListToTParameter#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see GravityTGG.GravityTGGPackage#getExtendedParameterListToTParameter()
 * @model
 * @generated
 */
public interface ExtendedParameterListToTParameter extends EObject,
		AbstractCorrespondence {
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
	 * @see GravityTGG.GravityTGGPackage#getExtendedParameterListToTParameter_Source()
	 * @model required="true"
	 * @generated
	 */
	ExtendedParameterList getSource();

	/**
	 * Sets the value of the '{@link GravityTGG.ExtendedParameterListToTParameter#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ExtendedParameterList value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TParameter)
	 * @see GravityTGG.GravityTGGPackage#getExtendedParameterListToTParameter_Target()
	 * @model required="true"
	 * @generated
	 */
	TParameter getTarget();

	/**
	 * Sets the value of the '{@link GravityTGG.ExtendedParameterListToTParameter#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TParameter value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ExtendedParameterListToTParameter
