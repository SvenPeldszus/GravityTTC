/**
 */
package GravityTGG.util;

import GravityTGG.*;

import TGGRuntime.AbstractCorrespondence;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see GravityTGG.GravityTGGPackage
 * @generated
 */
public class GravityTGGAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GravityTGGPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GravityTGGAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GravityTGGPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GravityTGGSwitch<Adapter> modelSwitch = new GravityTGGSwitch<Adapter>() {
		@Override
		public Adapter caseMemberToTMember(MemberToTMember object) {
			return createMemberToTMemberAdapter();
		}

		@Override
		public Adapter caseClassMethodToTMethod(ClassMethodToTMethod object) {
			return createClassMethodToTMethodAdapter();
		}

		@Override
		public Adapter caseClassMethodToTMethodDefinition(
				ClassMethodToTMethodDefinition object) {
			return createClassMethodToTMethodDefinitionAdapter();
		}

		@Override
		public Adapter caseClassMethodToTMethodSignature(
				ClassMethodToTMethodSignature object) {
			return createClassMethodToTMethodSignatureAdapter();
		}

		@Override
		public Adapter caseClassToTClass(ClassToTClass object) {
			return createClassToTClassAdapter();
		}

		@Override
		public Adapter caseCompilationUnitToTClass(
				CompilationUnitToTClass object) {
			return createCompilationUnitToTClassAdapter();
		}

		@Override
		public Adapter caseExtendedJamoppJavaContainerToTypeGraph(
				ExtendedJamoppJavaContainerToTypeGraph object) {
			return createExtendedJamoppJavaContainerToTypeGraphAdapter();
		}

		@Override
		public Adapter caseExtendedJamoppPackageElementToTPackage(
				ExtendedJamoppPackageElementToTPackage object) {
			return createExtendedJamoppPackageElementToTPackageAdapter();
		}

		@Override
		public Adapter caseExtendedParameterListToTClass(
				ExtendedParameterListToTClass object) {
			return createExtendedParameterListToTClassAdapter();
		}

		@Override
		public Adapter caseExtendedParameterListToTParameter(
				ExtendedParameterListToTParameter object) {
			return createExtendedParameterListToTParameterAdapter();
		}

		@Override
		public Adapter caseExtendedParameterListToTParameterList(
				ExtendedParameterListToTParameterList object) {
			return createExtendedParameterListToTParameterListAdapter();
		}

		@Override
		public Adapter caseExtendedParameterToTParameter(
				ExtendedParameterToTParameter object) {
			return createExtendedParameterToTParameterAdapter();
		}

		@Override
		public Adapter caseFieldToTField(FieldToTField object) {
			return createFieldToTFieldAdapter();
		}

		@Override
		public Adapter caseFieldToTFieldDefinition(
				FieldToTFieldDefinition object) {
			return createFieldToTFieldDefinitionAdapter();
		}

		@Override
		public Adapter caseFieldToTFieldSignature(FieldToTFieldSignature object) {
			return createFieldToTFieldSignatureAdapter();
		}

		@Override
		public Adapter caseTypeToTClass(TypeToTClass object) {
			return createTypeToTClassAdapter();
		}

		@Override
		public Adapter caseExtendedParameterToTypeGraph(
				ExtendedParameterToTypeGraph object) {
			return createExtendedParameterToTypeGraphAdapter();
		}

		@Override
		public Adapter caseExtendedTypeToTypeGraph(
				ExtendedTypeToTypeGraph object) {
			return createExtendedTypeToTypeGraphAdapter();
		}

		@Override
		public Adapter caseExtendedTypeToTClass(ExtendedTypeToTClass object) {
			return createExtendedTypeToTClassAdapter();
		}

		@Override
		public Adapter caseExtendedParameterListToTMethodSignature(
				ExtendedParameterListToTMethodSignature object) {
			return createExtendedParameterListToTMethodSignatureAdapter();
		}

		@Override
		public Adapter caseIdentifierReferenceToTMethodDefinition(
				IdentifierReferenceToTMethodDefinition object) {
			return createIdentifierReferenceToTMethodDefinitionAdapter();
		}

		@Override
		public Adapter caseExtendedMethodNameToTMethod(
				ExtendedMethodNameToTMethod object) {
			return createExtendedMethodNameToTMethodAdapter();
		}

		@Override
		public Adapter caseAbstractCorrespondence(AbstractCorrespondence object) {
			return createAbstractCorrespondenceAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.MemberToTMember <em>Member To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.MemberToTMember
	 * @generated
	 */
	public Adapter createMemberToTMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.ClassMethodToTMethod <em>Class Method To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.ClassMethodToTMethod
	 * @generated
	 */
	public Adapter createClassMethodToTMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.ClassMethodToTMethodDefinition <em>Class Method To TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.ClassMethodToTMethodDefinition
	 * @generated
	 */
	public Adapter createClassMethodToTMethodDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.ClassMethodToTMethodSignature <em>Class Method To TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.ClassMethodToTMethodSignature
	 * @generated
	 */
	public Adapter createClassMethodToTMethodSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.ClassToTClass <em>Class To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.ClassToTClass
	 * @generated
	 */
	public Adapter createClassToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.CompilationUnitToTClass <em>Compilation Unit To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.CompilationUnitToTClass
	 * @generated
	 */
	public Adapter createCompilationUnitToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.ExtendedJamoppJavaContainerToTypeGraph <em>Extended Jamopp Java Container To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.ExtendedJamoppJavaContainerToTypeGraph
	 * @generated
	 */
	public Adapter createExtendedJamoppJavaContainerToTypeGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.ExtendedJamoppPackageElementToTPackage <em>Extended Jamopp Package Element To TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.ExtendedJamoppPackageElementToTPackage
	 * @generated
	 */
	public Adapter createExtendedJamoppPackageElementToTPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.ExtendedParameterListToTClass <em>Extended Parameter List To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.ExtendedParameterListToTClass
	 * @generated
	 */
	public Adapter createExtendedParameterListToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.ExtendedParameterListToTParameter <em>Extended Parameter List To TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.ExtendedParameterListToTParameter
	 * @generated
	 */
	public Adapter createExtendedParameterListToTParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.ExtendedParameterListToTParameterList <em>Extended Parameter List To TParameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.ExtendedParameterListToTParameterList
	 * @generated
	 */
	public Adapter createExtendedParameterListToTParameterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.ExtendedParameterToTParameter <em>Extended Parameter To TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.ExtendedParameterToTParameter
	 * @generated
	 */
	public Adapter createExtendedParameterToTParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.FieldToTField <em>Field To TField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.FieldToTField
	 * @generated
	 */
	public Adapter createFieldToTFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.FieldToTFieldDefinition <em>Field To TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.FieldToTFieldDefinition
	 * @generated
	 */
	public Adapter createFieldToTFieldDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.FieldToTFieldSignature <em>Field To TField Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.FieldToTFieldSignature
	 * @generated
	 */
	public Adapter createFieldToTFieldSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.TypeToTClass <em>Type To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.TypeToTClass
	 * @generated
	 */
	public Adapter createTypeToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.ExtendedParameterToTypeGraph <em>Extended Parameter To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.ExtendedParameterToTypeGraph
	 * @generated
	 */
	public Adapter createExtendedParameterToTypeGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.ExtendedTypeToTypeGraph <em>Extended Type To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.ExtendedTypeToTypeGraph
	 * @generated
	 */
	public Adapter createExtendedTypeToTypeGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.ExtendedTypeToTClass <em>Extended Type To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.ExtendedTypeToTClass
	 * @generated
	 */
	public Adapter createExtendedTypeToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.ExtendedParameterListToTMethodSignature <em>Extended Parameter List To TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.ExtendedParameterListToTMethodSignature
	 * @generated
	 */
	public Adapter createExtendedParameterListToTMethodSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.IdentifierReferenceToTMethodDefinition <em>Identifier Reference To TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.IdentifierReferenceToTMethodDefinition
	 * @generated
	 */
	public Adapter createIdentifierReferenceToTMethodDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.ExtendedMethodNameToTMethod <em>Extended Method Name To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.ExtendedMethodNameToTMethod
	 * @generated
	 */
	public Adapter createExtendedMethodNameToTMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TGGRuntime.AbstractCorrespondence <em>Abstract Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TGGRuntime.AbstractCorrespondence
	 * @generated
	 */
	public Adapter createAbstractCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GravityTGGAdapterFactory
