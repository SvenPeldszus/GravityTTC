/**
 */
package GravityTGG;

import ExtendedJamopp.ExtendedType;

import TGGRuntime.AbstractCorrespondence;

import TypeGraphBasic.TypeGraph;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Type To Type Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GravityTGG.ExtendedTypeToTypeGraph#getSource <em>Source</em>}</li>
 *   <li>{@link GravityTGG.ExtendedTypeToTypeGraph#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see GravityTGG.GravityTGGPackage#getExtendedTypeToTypeGraph()
 * @model
 * @generated
 */
public interface ExtendedTypeToTypeGraph extends EObject,
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
	 * @see #setSource(ExtendedType)
	 * @see GravityTGG.GravityTGGPackage#getExtendedTypeToTypeGraph_Source()
	 * @model required="true"
	 * @generated
	 */
	ExtendedType getSource();

	/**
	 * Sets the value of the '{@link GravityTGG.ExtendedTypeToTypeGraph#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ExtendedType value);

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
	 * @see GravityTGG.GravityTGGPackage#getExtendedTypeToTypeGraph_Target()
	 * @model required="true"
	 * @generated
	 */
	TypeGraph getTarget();

	/**
	 * Sets the value of the '{@link GravityTGG.ExtendedTypeToTypeGraph#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TypeGraph value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ExtendedTypeToTypeGraph
