/**
 */
package GravityTGG;

import ExtendedJamopp.ExtendedClassMethod;

import TGGRuntime.AbstractCorrespondence;

import TypeGraphBasic.TMethod;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Method To TMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GravityTGG.ClassMethodToTMethod#getTarget <em>Target</em>}</li>
 *   <li>{@link GravityTGG.ClassMethodToTMethod#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see GravityTGG.GravityTGGPackage#getClassMethodToTMethod()
 * @model
 * @generated
 */
public interface ClassMethodToTMethod extends EObject, AbstractCorrespondence {
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
	 * @see GravityTGG.GravityTGGPackage#getClassMethodToTMethod_Target()
	 * @model required="true"
	 * @generated
	 */
	TMethod getTarget();

	/**
	 * Sets the value of the '{@link GravityTGG.ClassMethodToTMethod#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TMethod value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ExtendedClassMethod)
	 * @see GravityTGG.GravityTGGPackage#getClassMethodToTMethod_Source()
	 * @model required="true"
	 * @generated
	 */
	ExtendedClassMethod getSource();

	/**
	 * Sets the value of the '{@link GravityTGG.ClassMethodToTMethod#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ExtendedClassMethod value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ClassMethodToTMethod
