/**
 */
package GravityTGG.Postprocessing;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see GravityTGG.Postprocessing.PostprocessingFactory
 * @model kind="package"
 * @generated
 */
public interface PostprocessingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Postprocessing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/GravityTGG/model/GravityTGG.ecore#//Postprocessing";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Postprocessing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PostprocessingPackage eINSTANCE = GravityTGG.Postprocessing.impl.PostprocessingPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link GravityTGG.Postprocessing.impl.MemberCorrespondenceImpl <em>Member Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Postprocessing.impl.MemberCorrespondenceImpl
	 * @see GravityTGG.Postprocessing.impl.PostprocessingPackageImpl#getMemberCorrespondence()
	 * @generated
	 */
	int MEMBER_CORRESPONDENCE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_CORRESPONDENCE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_CORRESPONDENCE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Member Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_CORRESPONDENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Member Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_CORRESPONDENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GravityTGG.Postprocessing.impl.TGGPostprocessingImpl <em>TGG Postprocessing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GravityTGG.Postprocessing.impl.TGGPostprocessingImpl
	 * @see GravityTGG.Postprocessing.impl.PostprocessingPackageImpl#getTGGPostprocessing()
	 * @generated
	 */
	int TGG_POSTPROCESSING = 1;

	/**
	 * The feature id for the '<em><b>Member Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_POSTPROCESSING__MEMBER_CORRESPONDENCES = 0;

	/**
	 * The feature id for the '<em><b>Pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_POSTPROCESSING__PG = 1;

	/**
	 * The number of structural features of the '<em>TGG Postprocessing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_POSTPROCESSING_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Create Access Edges For Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_POSTPROCESSING___CREATE_ACCESS_EDGES_FOR_METHOD__CLASSMETHODTOTMETHODDEFINITION = 0;

	/**
	 * The operation id for the '<em>Handle Element Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_POSTPROCESSING___HANDLE_ELEMENT_REFERENCE__ELEMENTREFERENCE_TMETHODDEFINITION = 1;

	/**
	 * The operation id for the '<em>Creade And Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_POSTPROCESSING___CREADE_AND_LINK__CLASSMETHOD_TMEMBER = 2;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_POSTPROCESSING___GET_FULLY_QUALIFIED_NAME__COMPILATIONUNIT = 3;

	/**
	 * The operation id for the '<em>Create And Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_POSTPROCESSING___CREATE_AND_LINK__FIELD_TMEMBER = 4;

	/**
	 * The operation id for the '<em>Handle Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_POSTPROCESSING___HANDLE_ARGUMENTS__METHODCALL_TMETHODDEFINITION = 5;

	/**
	 * The number of operations of the '<em>TGG Postprocessing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_POSTPROCESSING_OPERATION_COUNT = 6;

	/**
	 * Returns the meta object for class '{@link GravityTGG.Postprocessing.MemberCorrespondence <em>Member Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Correspondence</em>'.
	 * @see GravityTGG.Postprocessing.MemberCorrespondence
	 * @generated
	 */
	EClass getMemberCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.Postprocessing.MemberCorrespondence#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GravityTGG.Postprocessing.MemberCorrespondence#getSource()
	 * @see #getMemberCorrespondence()
	 * @generated
	 */
	EReference getMemberCorrespondence_Source();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.Postprocessing.MemberCorrespondence#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GravityTGG.Postprocessing.MemberCorrespondence#getTarget()
	 * @see #getMemberCorrespondence()
	 * @generated
	 */
	EReference getMemberCorrespondence_Target();

	/**
	 * Returns the meta object for class '{@link GravityTGG.Postprocessing.TGGPostprocessing <em>TGG Postprocessing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGG Postprocessing</em>'.
	 * @see GravityTGG.Postprocessing.TGGPostprocessing
	 * @generated
	 */
	EClass getTGGPostprocessing();

	/**
	 * Returns the meta object for the containment reference list '{@link GravityTGG.Postprocessing.TGGPostprocessing#getMemberCorrespondences <em>Member Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member Correspondences</em>'.
	 * @see GravityTGG.Postprocessing.TGGPostprocessing#getMemberCorrespondences()
	 * @see #getTGGPostprocessing()
	 * @generated
	 */
	EReference getTGGPostprocessing_MemberCorrespondences();

	/**
	 * Returns the meta object for the reference '{@link GravityTGG.Postprocessing.TGGPostprocessing#getPg <em>Pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pg</em>'.
	 * @see GravityTGG.Postprocessing.TGGPostprocessing#getPg()
	 * @see #getTGGPostprocessing()
	 * @generated
	 */
	EReference getTGGPostprocessing_Pg();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Postprocessing.TGGPostprocessing#createAccessEdgesForMethod(GravityTGG.ClassMethodToTMethodDefinition) <em>Create Access Edges For Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Access Edges For Method</em>' operation.
	 * @see GravityTGG.Postprocessing.TGGPostprocessing#createAccessEdgesForMethod(GravityTGG.ClassMethodToTMethodDefinition)
	 * @generated
	 */
	EOperation getTGGPostprocessing__CreateAccessEdgesForMethod__ClassMethodToTMethodDefinition();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Postprocessing.TGGPostprocessing#handleElementReference(org.emftext.language.java.references.ElementReference, TypeGraphBasic.TMethodDefinition) <em>Handle Element Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Handle Element Reference</em>' operation.
	 * @see GravityTGG.Postprocessing.TGGPostprocessing#handleElementReference(org.emftext.language.java.references.ElementReference, TypeGraphBasic.TMethodDefinition)
	 * @generated
	 */
	EOperation getTGGPostprocessing__HandleElementReference__ElementReference_TMethodDefinition();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Postprocessing.TGGPostprocessing#creadeAndLink(org.emftext.language.java.members.ClassMethod, TypeGraphBasic.TMember) <em>Creade And Link</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Creade And Link</em>' operation.
	 * @see GravityTGG.Postprocessing.TGGPostprocessing#creadeAndLink(org.emftext.language.java.members.ClassMethod, TypeGraphBasic.TMember)
	 * @generated
	 */
	EOperation getTGGPostprocessing__CreadeAndLink__ClassMethod_TMember();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Postprocessing.TGGPostprocessing#getFullyQualifiedName(org.emftext.language.java.containers.CompilationUnit) <em>Get Fully Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Fully Qualified Name</em>' operation.
	 * @see GravityTGG.Postprocessing.TGGPostprocessing#getFullyQualifiedName(org.emftext.language.java.containers.CompilationUnit)
	 * @generated
	 */
	EOperation getTGGPostprocessing__GetFullyQualifiedName__CompilationUnit();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Postprocessing.TGGPostprocessing#createAndLink(org.emftext.language.java.members.Field, TypeGraphBasic.TMember) <em>Create And Link</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create And Link</em>' operation.
	 * @see GravityTGG.Postprocessing.TGGPostprocessing#createAndLink(org.emftext.language.java.members.Field, TypeGraphBasic.TMember)
	 * @generated
	 */
	EOperation getTGGPostprocessing__CreateAndLink__Field_TMember();

	/**
	 * Returns the meta object for the '{@link GravityTGG.Postprocessing.TGGPostprocessing#handleArguments(org.emftext.language.java.references.MethodCall, TypeGraphBasic.TMethodDefinition) <em>Handle Arguments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Handle Arguments</em>' operation.
	 * @see GravityTGG.Postprocessing.TGGPostprocessing#handleArguments(org.emftext.language.java.references.MethodCall, TypeGraphBasic.TMethodDefinition)
	 * @generated
	 */
	EOperation getTGGPostprocessing__HandleArguments__MethodCall_TMethodDefinition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PostprocessingFactory getPostprocessingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link GravityTGG.Postprocessing.impl.MemberCorrespondenceImpl <em>Member Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.Postprocessing.impl.MemberCorrespondenceImpl
		 * @see GravityTGG.Postprocessing.impl.PostprocessingPackageImpl#getMemberCorrespondence()
		 * @generated
		 */
		EClass MEMBER_CORRESPONDENCE = eINSTANCE.getMemberCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_CORRESPONDENCE__SOURCE = eINSTANCE
				.getMemberCorrespondence_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_CORRESPONDENCE__TARGET = eINSTANCE
				.getMemberCorrespondence_Target();

		/**
		 * The meta object literal for the '{@link GravityTGG.Postprocessing.impl.TGGPostprocessingImpl <em>TGG Postprocessing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GravityTGG.Postprocessing.impl.TGGPostprocessingImpl
		 * @see GravityTGG.Postprocessing.impl.PostprocessingPackageImpl#getTGGPostprocessing()
		 * @generated
		 */
		EClass TGG_POSTPROCESSING = eINSTANCE.getTGGPostprocessing();

		/**
		 * The meta object literal for the '<em><b>Member Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGG_POSTPROCESSING__MEMBER_CORRESPONDENCES = eINSTANCE
				.getTGGPostprocessing_MemberCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Pg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGG_POSTPROCESSING__PG = eINSTANCE.getTGGPostprocessing_Pg();

		/**
		 * The meta object literal for the '<em><b>Create Access Edges For Method</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TGG_POSTPROCESSING___CREATE_ACCESS_EDGES_FOR_METHOD__CLASSMETHODTOTMETHODDEFINITION = eINSTANCE
				.getTGGPostprocessing__CreateAccessEdgesForMethod__ClassMethodToTMethodDefinition();

		/**
		 * The meta object literal for the '<em><b>Handle Element Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TGG_POSTPROCESSING___HANDLE_ELEMENT_REFERENCE__ELEMENTREFERENCE_TMETHODDEFINITION = eINSTANCE
				.getTGGPostprocessing__HandleElementReference__ElementReference_TMethodDefinition();

		/**
		 * The meta object literal for the '<em><b>Creade And Link</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TGG_POSTPROCESSING___CREADE_AND_LINK__CLASSMETHOD_TMEMBER = eINSTANCE
				.getTGGPostprocessing__CreadeAndLink__ClassMethod_TMember();

		/**
		 * The meta object literal for the '<em><b>Get Fully Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TGG_POSTPROCESSING___GET_FULLY_QUALIFIED_NAME__COMPILATIONUNIT = eINSTANCE
				.getTGGPostprocessing__GetFullyQualifiedName__CompilationUnit();

		/**
		 * The meta object literal for the '<em><b>Create And Link</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TGG_POSTPROCESSING___CREATE_AND_LINK__FIELD_TMEMBER = eINSTANCE
				.getTGGPostprocessing__CreateAndLink__Field_TMember();

		/**
		 * The meta object literal for the '<em><b>Handle Arguments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TGG_POSTPROCESSING___HANDLE_ARGUMENTS__METHODCALL_TMETHODDEFINITION = eINSTANCE
				.getTGGPostprocessing__HandleArguments__MethodCall_TMethodDefinition();

	}

} //PostprocessingPackage
