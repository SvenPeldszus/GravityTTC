/**
 */
package Refactorings.Containers;

import TypeGraphBasic.TMethodDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMethod Definition Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Refactorings.Containers.TMethodDefinitionContainer#getTMethodDefinition <em>TMethod Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see Refactorings.Containers.ContainersPackage#getTMethodDefinitionContainer()
 * @model
 * @generated
 */
public interface TMethodDefinitionContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>TMethod Definition</b></em>' reference list.
	 * The list contents are of type {@link TypeGraphBasic.TMethodDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TMethod Definition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TMethod Definition</em>' reference list.
	 * @see Refactorings.Containers.ContainersPackage#getTMethodDefinitionContainer_TMethodDefinition()
	 * @model
	 * @generated
	 */
	EList<TMethodDefinition> getTMethodDefinition();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TMethodDefinitionContainer
