/**
 */
package GravityTGG.Postprocessing;

import TypeGraphBasic.TMember;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.java.members.Member;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GravityTGG.Postprocessing.MemberCorrespondence#getSource <em>Source</em>}</li>
 *   <li>{@link GravityTGG.Postprocessing.MemberCorrespondence#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see GravityTGG.Postprocessing.PostprocessingPackage#getMemberCorrespondence()
 * @model
 * @generated
 */
public interface MemberCorrespondence extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Member)
	 * @see GravityTGG.Postprocessing.PostprocessingPackage#getMemberCorrespondence_Source()
	 * @model required="true"
	 * @generated
	 */
	Member getSource();

	/**
	 * Sets the value of the '{@link GravityTGG.Postprocessing.MemberCorrespondence#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Member value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TMember)
	 * @see GravityTGG.Postprocessing.PostprocessingPackage#getMemberCorrespondence_Target()
	 * @model required="true"
	 * @generated
	 */
	TMember getTarget();

	/**
	 * Sets the value of the '{@link GravityTGG.Postprocessing.MemberCorrespondence#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TMember value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MemberCorrespondence
