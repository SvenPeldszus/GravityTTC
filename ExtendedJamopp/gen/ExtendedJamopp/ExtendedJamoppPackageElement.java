/**
 */
package ExtendedJamopp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.java.containers.CompilationUnit;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ExtendedJamopp.ExtendedJamoppPackageElement#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link ExtendedJamopp.ExtendedJamoppPackageElement#getPredessor <em>Predessor</em>}</li>
 *   <li>{@link ExtendedJamopp.ExtendedJamoppPackageElement#getCompilationUnit <em>Compilation Unit</em>}</li>
 *   <li>{@link ExtendedJamopp.ExtendedJamoppPackageElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedJamoppPackageElement()
 * @model
 * @generated
 */
public interface ExtendedJamoppPackageElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference list.
	 * The list contents are of type {@link ExtendedJamopp.ExtendedJamoppPackageElement}.
	 * It is bidirectional and its opposite is '{@link ExtendedJamopp.ExtendedJamoppPackageElement#getPredessor <em>Predessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' reference list.
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedJamoppPackageElement_Successor()
	 * @see ExtendedJamopp.ExtendedJamoppPackageElement#getPredessor
	 * @model opposite="predessor"
	 * @generated
	 */
	EList<ExtendedJamoppPackageElement> getSuccessor();

	/**
	 * Returns the value of the '<em><b>Predessor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ExtendedJamopp.ExtendedJamoppPackageElement#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predessor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predessor</em>' reference.
	 * @see #setPredessor(ExtendedJamoppPackageElement)
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedJamoppPackageElement_Predessor()
	 * @see ExtendedJamopp.ExtendedJamoppPackageElement#getSuccessor
	 * @model opposite="successor"
	 * @generated
	 */
	ExtendedJamoppPackageElement getPredessor();

	/**
	 * Sets the value of the '{@link ExtendedJamopp.ExtendedJamoppPackageElement#getPredessor <em>Predessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predessor</em>' reference.
	 * @see #getPredessor()
	 * @generated
	 */
	void setPredessor(ExtendedJamoppPackageElement value);

	/**
	 * Returns the value of the '<em><b>Compilation Unit</b></em>' reference list.
	 * The list contents are of type {@link org.emftext.language.java.containers.CompilationUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compilation Unit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compilation Unit</em>' reference list.
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedJamoppPackageElement_CompilationUnit()
	 * @model
	 * @generated
	 */
	EList<CompilationUnit> getCompilationUnit();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedJamoppPackageElement_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ExtendedJamopp.ExtendedJamoppPackageElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ExtendedJamoppPackageElement
