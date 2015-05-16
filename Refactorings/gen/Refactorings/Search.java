/**
 */
package Refactorings;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TPackage;
import TypeGraphBasic.TypeGraph;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Refactorings.Search#getPg <em>Pg</em>}</li>
 * </ul>
 * </p>
 *
 * @see Refactorings.RefactoringsPackage#getSearch()
 * @model
 * @generated
 */
public interface Search extends EObject {
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
	 * @see Refactorings.RefactoringsPackage#getSearch_Pg()
	 * @model
	 * @generated
	 */
	TypeGraph getPg();

	/**
	 * Sets the value of the '{@link Refactorings.Search#getPg <em>Pg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pg</em>' reference.
	 * @see #getPg()
	 * @generated
	 */
	void setPg(TypeGraph value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TPackage getBasePackage(TClass tClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TPackage getBasePackage(TPackage tPackage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isChild(TClass child, TClass parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void linkClass(TClass tClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean equivalent(TPackage package2, TPackage package1);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Search
