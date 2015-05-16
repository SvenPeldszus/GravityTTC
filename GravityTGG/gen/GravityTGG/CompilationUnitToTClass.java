/**
 */
package GravityTGG;

import TGGRuntime.AbstractCorrespondence;

import TypeGraphBasic.TClass;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.java.containers.CompilationUnit;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit To TClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GravityTGG.CompilationUnitToTClass#getTarget <em>Target</em>}</li>
 *   <li>{@link GravityTGG.CompilationUnitToTClass#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see GravityTGG.GravityTGGPackage#getCompilationUnitToTClass()
 * @model
 * @generated
 */
public interface CompilationUnitToTClass extends EObject,
		AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TClass)
	 * @see GravityTGG.GravityTGGPackage#getCompilationUnitToTClass_Target()
	 * @model required="true"
	 * @generated
	 */
	TClass getTarget();

	/**
	 * Sets the value of the '{@link GravityTGG.CompilationUnitToTClass#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TClass value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(CompilationUnit)
	 * @see GravityTGG.GravityTGGPackage#getCompilationUnitToTClass_Source()
	 * @model required="true"
	 * @generated
	 */
	CompilationUnit getSource();

	/**
	 * Sets the value of the '{@link GravityTGG.CompilationUnitToTClass#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(CompilationUnit value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // CompilationUnitToTClass
