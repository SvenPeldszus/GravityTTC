/**
 */
package GravityTGG;

import ExtendedJamopp.ExtendedJamoppPackageElement;

import TGGRuntime.AbstractCorrespondence;

import TypeGraphBasic.TPackage;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Jamopp Package Element To TPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GravityTGG.ExtendedJamoppPackageElementToTPackage#getTarget <em>Target</em>}</li>
 *   <li>{@link GravityTGG.ExtendedJamoppPackageElementToTPackage#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see GravityTGG.GravityTGGPackage#getExtendedJamoppPackageElementToTPackage()
 * @model
 * @generated
 */
public interface ExtendedJamoppPackageElementToTPackage extends EObject,
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
	 * @see #setTarget(TPackage)
	 * @see GravityTGG.GravityTGGPackage#getExtendedJamoppPackageElementToTPackage_Target()
	 * @model required="true"
	 * @generated
	 */
	TPackage getTarget();

	/**
	 * Sets the value of the '{@link GravityTGG.ExtendedJamoppPackageElementToTPackage#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TPackage value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ExtendedJamoppPackageElement)
	 * @see GravityTGG.GravityTGGPackage#getExtendedJamoppPackageElementToTPackage_Source()
	 * @model required="true"
	 * @generated
	 */
	ExtendedJamoppPackageElement getSource();

	/**
	 * Sets the value of the '{@link GravityTGG.ExtendedJamoppPackageElementToTPackage#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ExtendedJamoppPackageElement value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ExtendedJamoppPackageElementToTPackage
