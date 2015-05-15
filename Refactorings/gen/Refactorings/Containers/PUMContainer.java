/**
 */
package Refactorings.Containers;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TMethodSignature;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PUM Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Refactorings.Containers.PUMContainer#getParent <em>Parent</em>}</li>
 *   <li>{@link Refactorings.Containers.PUMContainer#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see Refactorings.Containers.ContainersPackage#getPUMContainer()
 * @model
 * @generated
 */
public interface PUMContainer extends RefactoringContainer {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(TClass)
	 * @see Refactorings.Containers.ContainersPackage#getPUMContainer_Parent()
	 * @model required="true"
	 * @generated
	 */
	TClass getParent();

	/**
	 * Sets the value of the '{@link Refactorings.Containers.PUMContainer#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TClass value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(TMethodSignature)
	 * @see Refactorings.Containers.ContainersPackage#getPUMContainer_Method()
	 * @model required="true"
	 * @generated
	 */
	TMethodSignature getMethod();

	/**
	 * Sets the value of the '{@link Refactorings.Containers.PUMContainer#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(TMethodSignature value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // PUMContainer
