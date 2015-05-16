/**
 */
package GravityTGG;

import ExtendedJamopp.ExtendedJamoppJavaContainer;

import TGGRuntime.AbstractCorrespondence;

import TypeGraphBasic.TypeGraph;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Jamopp Java Container To Type Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GravityTGG.ExtendedJamoppJavaContainerToTypeGraph#getTarget <em>Target</em>}</li>
 *   <li>{@link GravityTGG.ExtendedJamoppJavaContainerToTypeGraph#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see GravityTGG.GravityTGGPackage#getExtendedJamoppJavaContainerToTypeGraph()
 * @model
 * @generated
 */
public interface ExtendedJamoppJavaContainerToTypeGraph extends EObject,
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
	 * @see #setTarget(TypeGraph)
	 * @see GravityTGG.GravityTGGPackage#getExtendedJamoppJavaContainerToTypeGraph_Target()
	 * @model required="true"
	 * @generated
	 */
	TypeGraph getTarget();

	/**
	 * Sets the value of the '{@link GravityTGG.ExtendedJamoppJavaContainerToTypeGraph#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ExtendedJamoppJavaContainer)
	 * @see GravityTGG.GravityTGGPackage#getExtendedJamoppJavaContainerToTypeGraph_Source()
	 * @model required="true"
	 * @generated
	 */
	ExtendedJamoppJavaContainer getSource();

	/**
	 * Sets the value of the '{@link GravityTGG.ExtendedJamoppJavaContainerToTypeGraph#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ExtendedJamoppJavaContainer value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ExtendedJamoppJavaContainerToTypeGraph
