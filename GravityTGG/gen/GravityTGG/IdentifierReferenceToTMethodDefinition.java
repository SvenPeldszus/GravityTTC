/**
 */
package GravityTGG;

import TGGRuntime.AbstractCorrespondence;

import TypeGraphBasic.TMethodDefinition;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.java.references.IdentifierReference;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier Reference To TMethod Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GravityTGG.IdentifierReferenceToTMethodDefinition#getSource <em>Source</em>}</li>
 *   <li>{@link GravityTGG.IdentifierReferenceToTMethodDefinition#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see GravityTGG.GravityTGGPackage#getIdentifierReferenceToTMethodDefinition()
 * @model
 * @generated
 */
public interface IdentifierReferenceToTMethodDefinition extends EObject,
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
	 * @see #setSource(IdentifierReference)
	 * @see GravityTGG.GravityTGGPackage#getIdentifierReferenceToTMethodDefinition_Source()
	 * @model required="true"
	 * @generated
	 */
	IdentifierReference getSource();

	/**
	 * Sets the value of the '{@link GravityTGG.IdentifierReferenceToTMethodDefinition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(IdentifierReference value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TMethodDefinition)
	 * @see GravityTGG.GravityTGGPackage#getIdentifierReferenceToTMethodDefinition_Target()
	 * @model required="true"
	 * @generated
	 */
	TMethodDefinition getTarget();

	/**
	 * Sets the value of the '{@link GravityTGG.IdentifierReferenceToTMethodDefinition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TMethodDefinition value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // IdentifierReferenceToTMethodDefinition
