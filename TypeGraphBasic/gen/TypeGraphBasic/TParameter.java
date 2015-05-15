/**
 */
package TypeGraphBasic;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TypeGraphBasic.TParameter#getNext <em>Next</em>}</li>
 *   <li>{@link TypeGraphBasic.TParameter#getPrevious <em>Previous</em>}</li>
 *   <li>{@link TypeGraphBasic.TParameter#getTClass <em>TClass</em>}</li>
 * </ul>
 * </p>
 *
 * @see TypeGraphBasic.TypeGraphBasicPackage#getTParameter()
 * @model
 * @generated
 */
public interface TParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TypeGraphBasic.TParameter#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(TParameter)
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTParameter_Next()
	 * @see TypeGraphBasic.TParameter#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	TParameter getNext();

	/**
	 * Sets the value of the '{@link TypeGraphBasic.TParameter#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(TParameter value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TypeGraphBasic.TParameter#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(TParameter)
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTParameter_Previous()
	 * @see TypeGraphBasic.TParameter#getNext
	 * @model opposite="next"
	 * @generated
	 */
	TParameter getPrevious();

	/**
	 * Sets the value of the '{@link TypeGraphBasic.TParameter#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(TParameter value);

	/**
	 * Returns the value of the '<em><b>TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TClass</em>' reference.
	 * @see #setTClass(TClass)
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTParameter_TClass()
	 * @model required="true"
	 * @generated
	 */
	TClass getTClass();

	/**
	 * Sets the value of the '{@link TypeGraphBasic.TParameter#getTClass <em>TClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TClass</em>' reference.
	 * @see #getTClass()
	 * @generated
	 */
	void setTClass(TClass value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TParameter
