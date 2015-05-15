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
 * A representation of the model object '<em><b>Java Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ExtendedJamopp.ExtendedJamoppJavaContainer#getCompilationUnit <em>Compilation Unit</em>}</li>
 *   <li>{@link ExtendedJamopp.ExtendedJamoppJavaContainer#getRoots <em>Roots</em>}</li>
 *   <li>{@link ExtendedJamopp.ExtendedJamoppJavaContainer#getExtendedJamoppPackageElement <em>Extended Jamopp Package Element</em>}</li>
 *   <li>{@link ExtendedJamopp.ExtendedJamoppJavaContainer#getExtendedParameterList <em>Extended Parameter List</em>}</li>
 *   <li>{@link ExtendedJamopp.ExtendedJamoppJavaContainer#getExtendedMethodName <em>Extended Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedJamoppJavaContainer()
 * @model
 * @generated
 */
public interface ExtendedJamoppJavaContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Compilation Unit</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.java.containers.CompilationUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compilation Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compilation Unit</em>' containment reference list.
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedJamoppJavaContainer_CompilationUnit()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompilationUnit> getCompilationUnit();

	/**
	 * Returns the value of the '<em><b>Roots</b></em>' reference list.
	 * The list contents are of type {@link ExtendedJamopp.ExtendedJamoppPackageElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roots</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roots</em>' reference list.
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedJamoppJavaContainer_Roots()
	 * @model
	 * @generated
	 */
	EList<ExtendedJamoppPackageElement> getRoots();

	/**
	 * Returns the value of the '<em><b>Extended Jamopp Package Element</b></em>' containment reference list.
	 * The list contents are of type {@link ExtendedJamopp.ExtendedJamoppPackageElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Jamopp Package Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Jamopp Package Element</em>' containment reference list.
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedJamoppJavaContainer_ExtendedJamoppPackageElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtendedJamoppPackageElement> getExtendedJamoppPackageElement();

	/**
	 * Returns the value of the '<em><b>Extended Parameter List</b></em>' containment reference list.
	 * The list contents are of type {@link ExtendedJamopp.ExtendedParameterList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Parameter List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Parameter List</em>' containment reference list.
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedJamoppJavaContainer_ExtendedParameterList()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtendedParameterList> getExtendedParameterList();

	/**
	 * Returns the value of the '<em><b>Extended Method Name</b></em>' containment reference list.
	 * The list contents are of type {@link ExtendedJamopp.ExtendedMethodName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Method Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Method Name</em>' containment reference list.
	 * @see ExtendedJamopp.ExtendedJamoppPackage#getExtendedJamoppJavaContainer_ExtendedMethodName()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtendedMethodName> getExtendedMethodName();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ExtendedJamoppJavaContainer
