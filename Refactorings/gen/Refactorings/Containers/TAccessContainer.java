/**
 */
package Refactorings.Containers;

import TypeGraphBasic.TMember;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAccess Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Refactorings.Containers.TAccessContainer#getTMember <em>TMember</em>}</li>
 * </ul>
 * </p>
 *
 * @see Refactorings.Containers.ContainersPackage#getTAccessContainer()
 * @model
 * @generated
 */
public interface TAccessContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>TMember</b></em>' reference list.
	 * The list contents are of type {@link TypeGraphBasic.TMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TMember</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TMember</em>' reference list.
	 * @see Refactorings.Containers.ContainersPackage#getTAccessContainer_TMember()
	 * @model
	 * @generated
	 */
	EList<TMember> getTMember();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TAccessContainer
