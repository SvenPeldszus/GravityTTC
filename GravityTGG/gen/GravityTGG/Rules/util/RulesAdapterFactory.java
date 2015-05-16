/**
 */
package GravityTGG.Rules.util;

import GravityTGG.Rules.*;

import TGGRuntime.AbstractRule;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see GravityTGG.Rules.RulesPackage
 * @generated
 */
public class RulesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
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
	protected RulesSwitch<Adapter> modelSwitch = new RulesSwitch<Adapter>() {
		@Override
		public Adapter caseClassDefault(ClassDefault object) {
			return createClassDefaultAdapter();
		}

		@Override
		public Adapter caseParameterTypeLibCreate(ParameterTypeLibCreate object) {
			return createParameterTypeLibCreateAdapter();
		}

		@Override
		public Adapter caseFieldNameExisting(FieldNameExisting object) {
			return createFieldNameExistingAdapter();
		}

		@Override
		public Adapter caseParameterTypeLibLink(ParameterTypeLibLink object) {
			return createParameterTypeLibLinkAdapter();
		}

		@Override
		public Adapter caseMethodDefinitionLinkSignature(
				MethodDefinitionLinkSignature object) {
			return createMethodDefinitionLinkSignatureAdapter();
		}

		@Override
		public Adapter caseMethodLinkClass(MethodLinkClass object) {
			return createMethodLinkClassAdapter();
		}

		@Override
		public Adapter caseInheritance(Inheritance object) {
			return createInheritanceAdapter();
		}

		@Override
		public Adapter caseParameterListLinkFirst(ParameterListLinkFirst object) {
			return createParameterListLinkFirstAdapter();
		}

		@Override
		public Adapter caseParameterTypeUserDefined(
				ParameterTypeUserDefined object) {
			return createParameterTypeUserDefinedAdapter();
		}

		@Override
		public Adapter caseMethodSignatureLinkDefinition(
				MethodSignatureLinkDefinition object) {
			return createMethodSignatureLinkDefinitionAdapter();
		}

		@Override
		public Adapter caseParameterLinkListNext(ParameterLinkListNext object) {
			return createParameterLinkListNextAdapter();
		}

		@Override
		public Adapter caseFieldNameCreate(FieldNameCreate object) {
			return createFieldNameCreateAdapter();
		}

		@Override
		public Adapter caseMethodNameCreate(MethodNameCreate object) {
			return createMethodNameCreateAdapter();
		}

		@Override
		public Adapter caseClass1(Class1 object) {
			return createClass1Adapter();
		}

		@Override
		public Adapter caseMethodSignatureCreate(MethodSignatureCreate object) {
			return createMethodSignatureCreateAdapter();
		}

		@Override
		public Adapter casePackageRoot(PackageRoot object) {
			return createPackageRootAdapter();
		}

		@Override
		public Adapter casePackageChild(PackageChild object) {
			return createPackageChildAdapter();
		}

		@Override
		public Adapter caseProgramGraphCreate(ProgramGraphCreate object) {
			return createProgramGraphCreateAdapter();
		}

		@Override
		public Adapter caseReturnTypeUserDefined(ReturnTypeUserDefined object) {
			return createReturnTypeUserDefinedAdapter();
		}

		@Override
		public Adapter caseReturnTypeFromLibCreate(
				ReturnTypeFromLibCreate object) {
			return createReturnTypeFromLibCreateAdapter();
		}

		@Override
		public Adapter caseReturnTypeFromLibLink(ReturnTypeFromLibLink object) {
			return createReturnTypeFromLibLinkAdapter();
		}

		@Override
		public Adapter caseParameterCreateNew(ParameterCreateNew object) {
			return createParameterCreateNewAdapter();
		}

		@Override
		public Adapter caseAbstractRule(AbstractRule object) {
			return createAbstractRuleAdapter();
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
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.ClassDefault <em>Class Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.ClassDefault
	 * @generated
	 */
	public Adapter createClassDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.ParameterTypeLibCreate <em>Parameter Type Lib Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.ParameterTypeLibCreate
	 * @generated
	 */
	public Adapter createParameterTypeLibCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.FieldNameExisting <em>Field Name Existing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.FieldNameExisting
	 * @generated
	 */
	public Adapter createFieldNameExistingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.ParameterTypeLibLink <em>Parameter Type Lib Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.ParameterTypeLibLink
	 * @generated
	 */
	public Adapter createParameterTypeLibLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.MethodDefinitionLinkSignature <em>Method Definition Link Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.MethodDefinitionLinkSignature
	 * @generated
	 */
	public Adapter createMethodDefinitionLinkSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.MethodLinkClass <em>Method Link Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.MethodLinkClass
	 * @generated
	 */
	public Adapter createMethodLinkClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.Inheritance
	 * @generated
	 */
	public Adapter createInheritanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.ParameterListLinkFirst <em>Parameter List Link First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.ParameterListLinkFirst
	 * @generated
	 */
	public Adapter createParameterListLinkFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.ParameterTypeUserDefined <em>Parameter Type User Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.ParameterTypeUserDefined
	 * @generated
	 */
	public Adapter createParameterTypeUserDefinedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.MethodSignatureLinkDefinition <em>Method Signature Link Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.MethodSignatureLinkDefinition
	 * @generated
	 */
	public Adapter createMethodSignatureLinkDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.ParameterLinkListNext <em>Parameter Link List Next</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.ParameterLinkListNext
	 * @generated
	 */
	public Adapter createParameterLinkListNextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.FieldNameCreate <em>Field Name Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.FieldNameCreate
	 * @generated
	 */
	public Adapter createFieldNameCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.MethodNameCreate <em>Method Name Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.MethodNameCreate
	 * @generated
	 */
	public Adapter createMethodNameCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.Class1 <em>Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.Class1
	 * @generated
	 */
	public Adapter createClass1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.MethodSignatureCreate <em>Method Signature Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.MethodSignatureCreate
	 * @generated
	 */
	public Adapter createMethodSignatureCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.PackageRoot <em>Package Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.PackageRoot
	 * @generated
	 */
	public Adapter createPackageRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.PackageChild <em>Package Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.PackageChild
	 * @generated
	 */
	public Adapter createPackageChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.ProgramGraphCreate <em>Program Graph Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.ProgramGraphCreate
	 * @generated
	 */
	public Adapter createProgramGraphCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.ReturnTypeUserDefined <em>Return Type User Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.ReturnTypeUserDefined
	 * @generated
	 */
	public Adapter createReturnTypeUserDefinedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.ReturnTypeFromLibCreate <em>Return Type From Lib Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.ReturnTypeFromLibCreate
	 * @generated
	 */
	public Adapter createReturnTypeFromLibCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.ReturnTypeFromLibLink <em>Return Type From Lib Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.ReturnTypeFromLibLink
	 * @generated
	 */
	public Adapter createReturnTypeFromLibLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GravityTGG.Rules.ParameterCreateNew <em>Parameter Create New</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GravityTGG.Rules.ParameterCreateNew
	 * @generated
	 */
	public Adapter createParameterCreateNewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TGGRuntime.AbstractRule <em>Abstract Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TGGRuntime.AbstractRule
	 * @generated
	 */
	public Adapter createAbstractRuleAdapter() {
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

} //RulesAdapterFactory
