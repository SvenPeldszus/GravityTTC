/**
 */
package GravityTGG;

import TGGRuntime.AbstractCorrespondence;

import TypeGraphBasic.TFieldSignature;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.java.members.Field;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field To TField Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GravityTGG.FieldToTFieldSignature#getTarget <em>Target</em>}</li>
 *   <li>{@link GravityTGG.FieldToTFieldSignature#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see GravityTGG.GravityTGGPackage#getFieldToTFieldSignature()
 * @model
 * @generated
 */
public interface FieldToTFieldSignature extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TFieldSignature)
	 * @see GravityTGG.GravityTGGPackage#getFieldToTFieldSignature_Target()
	 * @model required="true"
	 * @generated
	 */
	TFieldSignature getTarget();

	/**
	 * Sets the value of the '{@link GravityTGG.FieldToTFieldSignature#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TFieldSignature value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Field)
	 * @see GravityTGG.GravityTGGPackage#getFieldToTFieldSignature_Source()
	 * @model required="true"
	 * @generated
	 */
	Field getSource();

	/**
	 * Sets the value of the '{@link GravityTGG.FieldToTFieldSignature#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Field value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // FieldToTFieldSignature
