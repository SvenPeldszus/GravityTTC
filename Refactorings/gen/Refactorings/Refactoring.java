/**
 */
package Refactorings;

import Refactorings.Containers.TClassContainer;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TMethodSignature;
import TypeGraphBasic.TypeGraph;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refactoring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Refactorings.Refactoring#getPg <em>Pg</em>}</li>
 *   <li>{@link Refactorings.Refactoring#getSearch <em>Search</em>}</li>
 * </ul>
 * </p>
 *
 * @see Refactorings.RefactoringsPackage#getRefactoring()
 * @model
 * @generated
 */
public interface Refactoring extends EObject {
	/**
	 * Returns the value of the '<em><b>Pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pg</em>' reference.
	 * @see #setPg(TypeGraph)
	 * @see Refactorings.RefactoringsPackage#getRefactoring_Pg()
	 * @model
	 * @generated
	 */
	TypeGraph getPg();

	/**
	 * Sets the value of the '{@link Refactorings.Refactoring#getPg <em>Pg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pg</em>' reference.
	 * @see #getPg()
	 * @generated
	 */
	void setPg(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>Search</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search</em>' reference.
	 * @see #setSearch(Search)
	 * @see Refactorings.RefactoringsPackage#getRefactoring_Search()
	 * @model
	 * @generated
	 */
	Search getSearch();

	/**
	 * Sets the value of the '{@link Refactorings.Refactoring#getSearch <em>Search</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search</em>' reference.
	 * @see #getSearch()
	 * @generated
	 */
	void setSearch(Search value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean csc_isApplicable(TClassContainer child, TClass new_parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TClassContainer csc_Perform(TClassContainer child, TClass new_parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean pum_isApplicable(TMethodSignature method, TClass parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TClassContainer pum_Perform(TMethodSignature method, TClass parent);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Refactoring
