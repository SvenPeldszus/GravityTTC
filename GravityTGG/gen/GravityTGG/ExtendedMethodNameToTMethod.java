/**
 */
package GravityTGG;

import ExtendedJamopp.ExtendedMethodName;

import TGGRuntime.AbstractCorrespondence;

import TypeGraphBasic.TMethod;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Method Name To TMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GravityTGG.ExtendedMethodNameToTMethod#getSource <em>Source</em>}</li>
 *   <li>{@link GravityTGG.ExtendedMethodNameToTMethod#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see GravityTGG.GravityTGGPackage#getExtendedMethodNameToTMethod()
 * @model
 * @generated
 */
public interface ExtendedMethodNameToTMethod extends EObject,
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
	 * @see #setSource(ExtendedMethodName)
	 * @see GravityTGG.GravityTGGPackage#getExtendedMethodNameToTMethod_Source()
	 * @model required="true"
	 * @generated
	 */
	ExtendedMethodName getSource();

	/**
	 * Sets the value of the '{@link GravityTGG.ExtendedMethodNameToTMethod#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ExtendedMethodName value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TMethod)
	 * @see GravityTGG.GravityTGGPackage#getExtendedMethodNameToTMethod_Target()
	 * @model required="true"
	 * @generated
	 */
	TMethod getTarget();

	/**
	 * Sets the value of the '{@link GravityTGG.ExtendedMethodNameToTMethod#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TMethod value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ExtendedMethodNameToTMethod
