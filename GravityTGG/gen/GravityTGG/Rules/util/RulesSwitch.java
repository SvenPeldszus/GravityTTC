/**
 */
package GravityTGG.Rules.util;

import GravityTGG.Rules.*;

import TGGRuntime.AbstractRule;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see GravityTGG.Rules.RulesPackage
 * @generated
 */
public class RulesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesSwitch() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RulesPackage.CLASS_DEFAULT: {
			ClassDefault classDefault = (ClassDefault) theEObject;
			T result = caseClassDefault(classDefault);
			if (result == null)
				result = caseAbstractRule(classDefault);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE: {
			ParameterTypeLibCreate parameterTypeLibCreate = (ParameterTypeLibCreate) theEObject;
			T result = caseParameterTypeLibCreate(parameterTypeLibCreate);
			if (result == null)
				result = caseAbstractRule(parameterTypeLibCreate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_NAME_EXISTING: {
			FieldNameExisting fieldNameExisting = (FieldNameExisting) theEObject;
			T result = caseFieldNameExisting(fieldNameExisting);
			if (result == null)
				result = caseAbstractRule(fieldNameExisting);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARAMETER_TYPE_LIB_LINK: {
			ParameterTypeLibLink parameterTypeLibLink = (ParameterTypeLibLink) theEObject;
			T result = caseParameterTypeLibLink(parameterTypeLibLink);
			if (result == null)
				result = caseAbstractRule(parameterTypeLibLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE: {
			MethodDefinitionLinkSignature methodDefinitionLinkSignature = (MethodDefinitionLinkSignature) theEObject;
			T result = caseMethodDefinitionLinkSignature(methodDefinitionLinkSignature);
			if (result == null)
				result = caseAbstractRule(methodDefinitionLinkSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_LINK_CLASS: {
			MethodLinkClass methodLinkClass = (MethodLinkClass) theEObject;
			T result = caseMethodLinkClass(methodLinkClass);
			if (result == null)
				result = caseAbstractRule(methodLinkClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INHERITANCE: {
			Inheritance inheritance = (Inheritance) theEObject;
			T result = caseInheritance(inheritance);
			if (result == null)
				result = caseAbstractRule(inheritance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARAMETER_LIST_LINK_FIRST: {
			ParameterListLinkFirst parameterListLinkFirst = (ParameterListLinkFirst) theEObject;
			T result = caseParameterListLinkFirst(parameterListLinkFirst);
			if (result == null)
				result = caseAbstractRule(parameterListLinkFirst);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED: {
			ParameterTypeUserDefined parameterTypeUserDefined = (ParameterTypeUserDefined) theEObject;
			T result = caseParameterTypeUserDefined(parameterTypeUserDefined);
			if (result == null)
				result = caseAbstractRule(parameterTypeUserDefined);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION: {
			MethodSignatureLinkDefinition methodSignatureLinkDefinition = (MethodSignatureLinkDefinition) theEObject;
			T result = caseMethodSignatureLinkDefinition(methodSignatureLinkDefinition);
			if (result == null)
				result = caseAbstractRule(methodSignatureLinkDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARAMETER_LINK_LIST_NEXT: {
			ParameterLinkListNext parameterLinkListNext = (ParameterLinkListNext) theEObject;
			T result = caseParameterLinkListNext(parameterLinkListNext);
			if (result == null)
				result = caseAbstractRule(parameterLinkListNext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_NAME_CREATE: {
			FieldNameCreate fieldNameCreate = (FieldNameCreate) theEObject;
			T result = caseFieldNameCreate(fieldNameCreate);
			if (result == null)
				result = caseAbstractRule(fieldNameCreate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_NAME_CREATE: {
			MethodNameCreate methodNameCreate = (MethodNameCreate) theEObject;
			T result = caseMethodNameCreate(methodNameCreate);
			if (result == null)
				result = caseAbstractRule(methodNameCreate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CLASS1: {
			Class1 class1 = (Class1) theEObject;
			T result = caseClass1(class1);
			if (result == null)
				result = caseAbstractRule(class1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_SIGNATURE_CREATE: {
			MethodSignatureCreate methodSignatureCreate = (MethodSignatureCreate) theEObject;
			T result = caseMethodSignatureCreate(methodSignatureCreate);
			if (result == null)
				result = caseAbstractRule(methodSignatureCreate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PACKAGE_ROOT: {
			PackageRoot packageRoot = (PackageRoot) theEObject;
			T result = casePackageRoot(packageRoot);
			if (result == null)
				result = caseAbstractRule(packageRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PACKAGE_CHILD: {
			PackageChild packageChild = (PackageChild) theEObject;
			T result = casePackageChild(packageChild);
			if (result == null)
				result = caseAbstractRule(packageChild);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PROGRAM_GRAPH_CREATE: {
			ProgramGraphCreate programGraphCreate = (ProgramGraphCreate) theEObject;
			T result = caseProgramGraphCreate(programGraphCreate);
			if (result == null)
				result = caseAbstractRule(programGraphCreate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.RETURN_TYPE_USER_DEFINED: {
			ReturnTypeUserDefined returnTypeUserDefined = (ReturnTypeUserDefined) theEObject;
			T result = caseReturnTypeUserDefined(returnTypeUserDefined);
			if (result == null)
				result = caseAbstractRule(returnTypeUserDefined);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE: {
			ReturnTypeFromLibCreate returnTypeFromLibCreate = (ReturnTypeFromLibCreate) theEObject;
			T result = caseReturnTypeFromLibCreate(returnTypeFromLibCreate);
			if (result == null)
				result = caseAbstractRule(returnTypeFromLibCreate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.RETURN_TYPE_FROM_LIB_LINK: {
			ReturnTypeFromLibLink returnTypeFromLibLink = (ReturnTypeFromLibLink) theEObject;
			T result = caseReturnTypeFromLibLink(returnTypeFromLibLink);
			if (result == null)
				result = caseAbstractRule(returnTypeFromLibLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARAMETER_CREATE_NEW: {
			ParameterCreateNew parameterCreateNew = (ParameterCreateNew) theEObject;
			T result = caseParameterCreateNew(parameterCreateNew);
			if (result == null)
				result = caseAbstractRule(parameterCreateNew);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Default</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDefault(ClassDefault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type Lib Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type Lib Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterTypeLibCreate(ParameterTypeLibCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Name Existing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Name Existing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldNameExisting(FieldNameExisting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type Lib Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type Lib Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterTypeLibLink(ParameterTypeLibLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Definition Link Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Definition Link Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDefinitionLinkSignature(
			MethodDefinitionLinkSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Link Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Link Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodLinkClass(MethodLinkClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inheritance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritance(Inheritance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter List Link First</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter List Link First</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterListLinkFirst(ParameterListLinkFirst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type User Defined</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type User Defined</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterTypeUserDefined(ParameterTypeUserDefined object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Signature Link Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Signature Link Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodSignatureLinkDefinition(
			MethodSignatureLinkDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Link List Next</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Link List Next</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterLinkListNext(ParameterLinkListNext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Name Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Name Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldNameCreate(FieldNameCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Name Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Name Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodNameCreate(MethodNameCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass1(Class1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Signature Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Signature Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodSignatureCreate(MethodSignatureCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageRoot(PackageRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageChild(PackageChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Graph Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Graph Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramGraphCreate(ProgramGraphCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type User Defined</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type User Defined</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnTypeUserDefined(ReturnTypeUserDefined object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type From Lib Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type From Lib Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnTypeFromLibCreate(ReturnTypeFromLibCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type From Lib Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type From Lib Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnTypeFromLibLink(ReturnTypeFromLibLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Create New</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Create New</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterCreateNew(ParameterCreateNew object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRule(AbstractRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RulesSwitch
