/**
 */
package GravityTGG;

import TGGRuntime.AbstractCorrespondence;

import TypeGraphBasic.TField;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.java.members.Field;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field To TField</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GravityTGG.FieldToTField#getSource <em>Source</em>}</li>
 *   <li>{@link GravityTGG.FieldToTField#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see GravityTGG.GravityTGGPackage#getFieldToTField()
 * @model
 * @generated
 */
public interface FieldToTField extends EObject, AbstractCorrespondence {
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
	 * @see GravityTGG.GravityTGGPackage#getFieldToTField_Source()
	 * @model required="true"
	 * @generated
	 */
	Field getSource();

	/**
	 * Sets the value of the '{@link GravityTGG.FieldToTField#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Field value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TField)
	 * @see GravityTGG.GravityTGGPackage#getFieldToTField_Target()
	 * @model required="true"
	 * @generated
	 */
	TField getTarget();

	/**
	 * Sets the value of the '{@link GravityTGG.FieldToTField#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TField value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // FieldToTField
