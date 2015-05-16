/**
 */
package GravityTGG;

import ExtendedJamopp.ExtendedParameter;

import TGGRuntime.AbstractCorrespondence;

import TypeGraphBasic.TParameter;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Parameter To TParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GravityTGG.ExtendedParameterToTParameter#getSource <em>Source</em>}</li>
 *   <li>{@link GravityTGG.ExtendedParameterToTParameter#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see GravityTGG.GravityTGGPackage#getExtendedParameterToTParameter()
 * @model
 * @generated
 */
public interface ExtendedParameterToTParameter extends EObject,
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
	 * @see #setSource(ExtendedParameter)
	 * @see GravityTGG.GravityTGGPackage#getExtendedParameterToTParameter_Source()
	 * @model required="true"
	 * @generated
	 */
	ExtendedParameter getSource();

	/**
	 * Sets the value of the '{@link GravityTGG.ExtendedParameterToTParameter#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ExtendedParameter value);

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
	 * @see GravityTGG.GravityTGGPackage#getExtendedParameterToTParameter_Target()
	 * @model required="true"
	 * @generated
	 */
	TParameter getTarget();

	/**
	 * Sets the value of the '{@link GravityTGG.ExtendedParameterToTParameter#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TParameter value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ExtendedParameterToTParameter
