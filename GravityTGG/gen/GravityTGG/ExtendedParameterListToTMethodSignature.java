/**
 */
package GravityTGG;

import ExtendedJamopp.ExtendedParameterList;

import TGGRuntime.AbstractCorrespondence;

import TypeGraphBasic.TMethodSignature;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Parameter List To TMethod Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GravityTGG.ExtendedParameterListToTMethodSignature#getSource <em>Source</em>}</li>
 *   <li>{@link GravityTGG.ExtendedParameterListToTMethodSignature#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see GravityTGG.GravityTGGPackage#getExtendedParameterListToTMethodSignature()
 * @model
 * @generated
 */
public interface ExtendedParameterListToTMethodSignature extends EObject,
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
	 * @see GravityTGG.GravityTGGPackage#getExtendedParameterListToTMethodSignature_Source()
	 * @model required="true"
	 * @generated
	 */
	ExtendedParameterList getSource();

	/**
	 * Sets the value of the '{@link GravityTGG.ExtendedParameterListToTMethodSignature#getSource <em>Source</em>}' reference.
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
	 * @see #setTarget(TMethodSignature)
	 * @see GravityTGG.GravityTGGPackage#getExtendedParameterListToTMethodSignature_Target()
	 * @model required="true"
	 * @generated
	 */
	TMethodSignature getTarget();

	/**
	 * Sets the value of the '{@link GravityTGG.ExtendedParameterListToTMethodSignature#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TMethodSignature value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ExtendedParameterListToTMethodSignature
