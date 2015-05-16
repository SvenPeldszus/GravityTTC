/**
 */
package Refactorings.Containers;

import TypeGraphBasic.TClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSC Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Refactorings.Containers.CSCContainer#getNew_parent <em>New parent</em>}</li>
 *   <li>{@link Refactorings.Containers.CSCContainer#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see Refactorings.Containers.ContainersPackage#getCSCContainer()
 * @model
 * @generated
 */
public interface CSCContainer extends RefactoringContainer {
	/**
	 * Returns the value of the '<em><b>New parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New parent</em>' reference.
	 * @see #setNew_parent(TClass)
	 * @see Refactorings.Containers.ContainersPackage#getCSCContainer_New_parent()
	 * @model required="true"
	 * @generated
	 */
	TClass getNew_parent();

	/**
	 * Sets the value of the '{@link Refactorings.Containers.CSCContainer#getNew_parent <em>New parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New parent</em>' reference.
	 * @see #getNew_parent()
	 * @generated
	 */
	void setNew_parent(TClass value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(TClassContainer)
	 * @see Refactorings.Containers.ContainersPackage#getCSCContainer_Child()
	 * @model required="true"
	 * @generated
	 */
	TClassContainer getChild();

	/**
	 * Sets the value of the '{@link Refactorings.Containers.CSCContainer#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(TClassContainer value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // CSCContainer
