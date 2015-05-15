/**
 */
package ExtendedJamopp.util;

import ExtendedJamopp.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.java.arrays.ArrayTypeable;

import org.emftext.language.java.commons.Commentable;
import org.emftext.language.java.commons.NamedElement;

import org.emftext.language.java.generics.TypeParametrizable;

import org.emftext.language.java.members.ClassMethod;
import org.emftext.language.java.members.ExceptionThrower;
import org.emftext.language.java.members.Member;
import org.emftext.language.java.members.Method;

import org.emftext.language.java.modifiers.AnnotableAndModifiable;

import org.emftext.language.java.parameters.Parametrizable;

import org.emftext.language.java.references.ReferenceableElement;

import org.emftext.language.java.statements.StatementListContainer;

import org.emftext.language.java.types.TypedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ExtendedJamopp.ExtendedJamoppPackage
 * @generated
 */
public class ExtendedJamoppAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExtendedJamoppPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedJamoppAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExtendedJamoppPackage.eINSTANCE;
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
	protected ExtendedJamoppSwitch<Adapter> modelSwitch = new ExtendedJamoppSwitch<Adapter>() {
		@Override
		public Adapter caseExtendedClassMethod(ExtendedClassMethod object) {
			return createExtendedClassMethodAdapter();
		}

		@Override
		public Adapter caseExtendedJamoppJavaContainer(
				ExtendedJamoppJavaContainer object) {
			return createExtendedJamoppJavaContainerAdapter();
		}

		@Override
		public Adapter caseExtendedJamoppPackageElement(
				ExtendedJamoppPackageElement object) {
			return createExtendedJamoppPackageElementAdapter();
		}

		@Override
		public Adapter caseExtendedParameter(ExtendedParameter object) {
			return createExtendedParameterAdapter();
		}

		@Override
		public Adapter caseExtendedParameterList(ExtendedParameterList object) {
			return createExtendedParameterListAdapter();
		}

		@Override
		public Adapter caseExtendedType(ExtendedType object) {
			return createExtendedTypeAdapter();
		}

		@Override
		public Adapter caseExtendedMethodName(ExtendedMethodName object) {
			return createExtendedMethodNameAdapter();
		}

		@Override
		public Adapter caseCommentable(Commentable object) {
			return createCommentableAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseMember(Member object) {
			return createMemberAdapter();
		}

		@Override
		public Adapter caseTypedElement(TypedElement object) {
			return createTypedElementAdapter();
		}

		@Override
		public Adapter caseArrayTypeable(ArrayTypeable object) {
			return createArrayTypeableAdapter();
		}

		@Override
		public Adapter caseTypeParametrizable(TypeParametrizable object) {
			return createTypeParametrizableAdapter();
		}

		@Override
		public Adapter caseParametrizable(Parametrizable object) {
			return createParametrizableAdapter();
		}

		@Override
		public Adapter caseReferenceableElement(ReferenceableElement object) {
			return createReferenceableElementAdapter();
		}

		@Override
		public Adapter caseExceptionThrower(ExceptionThrower object) {
			return createExceptionThrowerAdapter();
		}

		@Override
		public Adapter caseAnnotableAndModifiable(AnnotableAndModifiable object) {
			return createAnnotableAndModifiableAdapter();
		}

		@Override
		public Adapter caseMethod(Method object) {
			return createMethodAdapter();
		}

		@Override
		public Adapter caseStatementListContainer(StatementListContainer object) {
			return createStatementListContainerAdapter();
		}

		@Override
		public Adapter caseClassMethod(ClassMethod object) {
			return createClassMethodAdapter();
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
	 * Creates a new adapter for an object of class '{@link ExtendedJamopp.ExtendedClassMethod <em>Extended Class Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExtendedJamopp.ExtendedClassMethod
	 * @generated
	 */
	public Adapter createExtendedClassMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExtendedJamopp.ExtendedJamoppJavaContainer <em>Java Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExtendedJamopp.ExtendedJamoppJavaContainer
	 * @generated
	 */
	public Adapter createExtendedJamoppJavaContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExtendedJamopp.ExtendedJamoppPackageElement <em>Package Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExtendedJamopp.ExtendedJamoppPackageElement
	 * @generated
	 */
	public Adapter createExtendedJamoppPackageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExtendedJamopp.ExtendedParameter <em>Extended Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExtendedJamopp.ExtendedParameter
	 * @generated
	 */
	public Adapter createExtendedParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExtendedJamopp.ExtendedParameterList <em>Extended Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExtendedJamopp.ExtendedParameterList
	 * @generated
	 */
	public Adapter createExtendedParameterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExtendedJamopp.ExtendedType <em>Extended Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExtendedJamopp.ExtendedType
	 * @generated
	 */
	public Adapter createExtendedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExtendedJamopp.ExtendedMethodName <em>Extended Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExtendedJamopp.ExtendedMethodName
	 * @generated
	 */
	public Adapter createExtendedMethodNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.commons.Commentable <em>Commentable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.commons.Commentable
	 * @generated
	 */
	public Adapter createCommentableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.commons.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.commons.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.members.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.members.Member
	 * @generated
	 */
	public Adapter createMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.types.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.types.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.arrays.ArrayTypeable <em>Array Typeable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.arrays.ArrayTypeable
	 * @generated
	 */
	public Adapter createArrayTypeableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.generics.TypeParametrizable <em>Type Parametrizable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.generics.TypeParametrizable
	 * @generated
	 */
	public Adapter createTypeParametrizableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.parameters.Parametrizable <em>Parametrizable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.parameters.Parametrizable
	 * @generated
	 */
	public Adapter createParametrizableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.references.ReferenceableElement <em>Referenceable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.references.ReferenceableElement
	 * @generated
	 */
	public Adapter createReferenceableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.members.ExceptionThrower <em>Exception Thrower</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.members.ExceptionThrower
	 * @generated
	 */
	public Adapter createExceptionThrowerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.modifiers.AnnotableAndModifiable <em>Annotable And Modifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.modifiers.AnnotableAndModifiable
	 * @generated
	 */
	public Adapter createAnnotableAndModifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.members.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.members.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.statements.StatementListContainer <em>Statement List Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.statements.StatementListContainer
	 * @generated
	 */
	public Adapter createStatementListContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.java.members.ClassMethod <em>Class Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.java.members.ClassMethod
	 * @generated
	 */
	public Adapter createClassMethodAdapter() {
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

} //ExtendedJamoppAdapterFactory
