/**
 */
package TypeGraphBasic;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMethod Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TypeGraphBasic.TMethodSignature#getMethod <em>Method</em>}</li>
 *   <li>{@link TypeGraphBasic.TMethodSignature#getParamList <em>Param List</em>}</li>
 *   <li>{@link TypeGraphBasic.TMethodSignature#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see TypeGraphBasic.TypeGraphBasicPackage#getTMethodSignature()
 * @model
 * @generated
 */
public interface TMethodSignature extends TSignature {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link TypeGraphBasic.TMethod#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' container reference.
	 * @see #setMethod(TMethod)
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTMethodSignature_Method()
	 * @see TypeGraphBasic.TMethod#getSignatures
	 * @model opposite="signatures" required="true" transient="false"
	 * @generated
	 */
	TMethod getMethod();

	/**
	 * Sets the value of the '{@link TypeGraphBasic.TMethodSignature#getMethod <em>Method</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' container reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(TMethod value);

	/**
	 * Returns the value of the '<em><b>Param List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param List</em>' containment reference.
	 * @see #setParamList(TParameterList)
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTMethodSignature_ParamList()
	 * @model containment="true"
	 * @generated
	 */
	TParameterList getParamList();

	/**
	 * Sets the value of the '{@link TypeGraphBasic.TMethodSignature#getParamList <em>Param List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param List</em>' containment reference.
	 * @see #getParamList()
	 * @generated
	 */
	void setParamList(TParameterList value);

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' reference list.
	 * The list contents are of type {@link TypeGraphBasic.TMethodDefinition}.
	 * It is bidirectional and its opposite is '{@link TypeGraphBasic.TMethodDefinition#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' reference list.
	 * @see TypeGraphBasic.TypeGraphBasicPackage#getTMethodSignature_Definitions()
	 * @see TypeGraphBasic.TMethodDefinition#getSignature
	 * @model opposite="signature"
	 * @generated
	 */
	EList<TMethodDefinition> getDefinitions();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TMethodSignature
