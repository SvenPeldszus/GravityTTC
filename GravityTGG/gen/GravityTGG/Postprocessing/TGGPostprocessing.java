/**
 */
package GravityTGG.Postprocessing;

import GravityTGG.ClassMethodToTMethodDefinition;

import TypeGraphBasic.TMember;
import TypeGraphBasic.TMethodDefinition;
import TypeGraphBasic.TypeGraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.java.containers.CompilationUnit;

import org.emftext.language.java.members.ClassMethod;
import org.emftext.language.java.members.Field;

import org.emftext.language.java.references.ElementReference;
import org.emftext.language.java.references.MethodCall;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TGG Postprocessing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GravityTGG.Postprocessing.TGGPostprocessing#getMemberCorrespondences <em>Member Correspondences</em>}</li>
 *   <li>{@link GravityTGG.Postprocessing.TGGPostprocessing#getPg <em>Pg</em>}</li>
 * </ul>
 * </p>
 *
 * @see GravityTGG.Postprocessing.PostprocessingPackage#getTGGPostprocessing()
 * @model
 * @generated
 */
public interface TGGPostprocessing extends EObject {
	/**
	 * Returns the value of the '<em><b>Member Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link GravityTGG.Postprocessing.MemberCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Correspondences</em>' containment reference list.
	 * @see GravityTGG.Postprocessing.PostprocessingPackage#getTGGPostprocessing_MemberCorrespondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemberCorrespondence> getMemberCorrespondences();

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
	 * @see GravityTGG.Postprocessing.PostprocessingPackage#getTGGPostprocessing_Pg()
	 * @model required="true"
	 * @generated
	 */
	TypeGraph getPg();

	/**
	 * Sets the value of the '{@link GravityTGG.Postprocessing.TGGPostprocessing#getPg <em>Pg</em>}' reference.
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
	void createAccessEdgesForMethod(ClassMethodToTMethodDefinition match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void handleElementReference(ElementReference reference,
			TMethodDefinition tMethod);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean creadeAndLink(ClassMethod jAccessed, TMember tAccessing);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getFullyQualifiedName(CompilationUnit jCompilationUnit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean createAndLink(Field jAccessed, TMember tAccessing);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void handleArguments(MethodCall reference, TMethodDefinition tMethod);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TGGPostprocessing
