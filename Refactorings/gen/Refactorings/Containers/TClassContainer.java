/**
 */
package Refactorings.Containers;

import TypeGraphBasic.TClass;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TClass Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Refactorings.Containers.TClassContainer#getTClass <em>TClass</em>}</li>
 * </ul>
 * </p>
 *
 * @see Refactorings.Containers.ContainersPackage#getTClassContainer()
 * @model
 * @generated
 */
public interface TClassContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>TClass</b></em>' reference list.
	 * The list contents are of type {@link TypeGraphBasic.TClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TClass</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TClass</em>' reference list.
	 * @see Refactorings.Containers.ContainersPackage#getTClassContainer_TClass()
	 * @model
	 * @generated
	 */
	EList<TClass> getTClass();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TClassContainer
