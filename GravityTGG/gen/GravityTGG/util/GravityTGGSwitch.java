/**
 */
package GravityTGG.util;

import GravityTGG.*;

import TGGRuntime.AbstractCorrespondence;

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
 * @see GravityTGG.GravityTGGPackage
 * @generated
 */
public class GravityTGGSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GravityTGGPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GravityTGGSwitch() {
		if (modelPackage == null) {
			modelPackage = GravityTGGPackage.eINSTANCE;
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
		case GravityTGGPackage.MEMBER_TO_TMEMBER: {
			MemberToTMember memberToTMember = (MemberToTMember) theEObject;
			T result = caseMemberToTMember(memberToTMember);
			if (result == null)
				result = caseAbstractCorrespondence(memberToTMember);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GravityTGGPackage.CLASS_METHOD_TO_TMETHOD: {
			ClassMethodToTMethod classMethodToTMethod = (ClassMethodToTMethod) theEObject;
			T result = caseClassMethodToTMethod(classMethodToTMethod);
			if (result == null)
				result = caseAbstractCorrespondence(classMethodToTMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GravityTGGPackage.CLASS_METHOD_TO_TMETHOD_DEFINITION: {
			ClassMethodToTMethodDefinition classMethodToTMethodDefinition = (ClassMethodToTMethodDefinition) theEObject;
			T result = caseClassMethodToTMethodDefinition(classMethodToTMethodDefinition);
			if (result == null)
				result = caseAbstractCorrespondence(classMethodToTMethodDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GravityTGGPackage.CLASS_METHOD_TO_TMETHOD_SIGNATURE: {
			ClassMethodToTMethodSignature classMethodToTMethodSignature = (ClassMethodToTMethodSignature) theEObject;
			T result = caseClassMethodToTMethodSignature(classMethodToTMethodSignature);
			if (result == null)
				result = caseAbstractCorrespondence(classMethodToTMethodSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GravityTGGPackage.CLASS_TO_TCLASS: {
			ClassToTClass classToTClass = (ClassToTClass) theEObject;
			T result = caseClassToTClass(classToTClass);
			if (result == null)
				result = caseAbstractCorrespondence(classToTClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GravityTGGPackage.COMPILATION_UNIT_TO_TCLASS: {
			CompilationUnitToTClass compilationUnitToTClass = (CompilationUnitToTClass) theEObject;
			T result = caseCompilationUnitToTClass(compilationUnitToTClass);
			if (result == null)
				result = caseAbstractCorrespondence(compilationUnitToTClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GravityTGGPackage.EXTENDED_JAMOPP_JAVA_CONTAINER_TO_TYPE_GRAPH: {
			ExtendedJamoppJavaContainerToTypeGraph extendedJamoppJavaContainerToTypeGraph = (ExtendedJamoppJavaContainerToTypeGraph) theEObject;
			T result = caseExtendedJamoppJavaContainerToTypeGraph(extendedJamoppJavaContainerToTypeGraph);
			if (result == null)
				result = caseAbstractCorrespondence(extendedJamoppJavaContainerToTypeGraph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GravityTGGPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE: {
			ExtendedJamoppPackageElementToTPackage extendedJamoppPackageElementToTPackage = (ExtendedJamoppPackageElementToTPackage) theEObject;
			T result = caseExtendedJamoppPackageElementToTPackage(extendedJamoppPackageElementToTPackage);
			if (result == null)
				result = caseAbstractCorrespondence(extendedJamoppPackageElementToTPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TCLASS: {
			ExtendedParameterListToTClass extendedParameterListToTClass = (ExtendedParameterListToTClass) theEObject;
			T result = caseExtendedParameterListToTClass(extendedParameterListToTClass);
			if (result == null)
				result = caseAbstractCorrespondence(extendedParameterListToTClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TPARAMETER: {
			ExtendedParameterListToTParameter extendedParameterListToTParameter = (ExtendedParameterListToTParameter) theEObject;
			T result = caseExtendedParameterListToTParameter(extendedParameterListToTParameter);
			if (result == null)
				result = caseAbstractCorrespondence(extendedParameterListToTParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TPARAMETER_LIST: {
			ExtendedParameterListToTParameterList extendedParameterListToTParameterList = (ExtendedParameterListToTParameterList) theEObject;
			T result = caseExtendedParameterListToTParameterList(extendedParameterListToTParameterList);
			if (result == null)
				result = caseAbstractCorrespondence(extendedParameterListToTParameterList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GravityTGGPackage.EXTENDED_PARAMETER_TO_TPARAMETER: {
			ExtendedParameterToTParameter extendedParameterToTParameter = (ExtendedParameterToTParameter) theEObject;
			T result = caseExtendedParameterToTParameter(extendedParameterToTParameter);
			if (result == null)
				result = caseAbstractCorrespondence(extendedParameterToTParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GravityTGGPackage.FIELD_TO_TFIELD: {
			FieldToTField fieldToTField = (FieldToTField) theEObject;
			T result = caseFieldToTField(fieldToTField);
			if (result == null)
				result = caseAbstractCorrespondence(fieldToTField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GravityTGGPackage.FIELD_TO_TFIELD_DEFINITION: {
			FieldToTFieldDefinition fieldToTFieldDefinition = (FieldToTFieldDefinition) theEObject;
			T result = caseFieldToTFieldDefinition(fieldToTFieldDefinition);
			if (result == null)
				result = caseAbstractCorrespondence(fieldToTFieldDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GravityTGGPackage.FIELD_TO_TFIELD_SIGNATURE: {
			FieldToTFieldSignature fieldToTFieldSignature = (FieldToTFieldSignature) theEObject;
			T result = caseFieldToTFieldSignature(fieldToTFieldSignature);
			if (result == null)
				result = caseAbstractCorrespondence(fieldToTFieldSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GravityTGGPackage.TYPE_TO_TCLASS: {
			TypeToTClass typeToTClass = (TypeToTClass) theEObject;
			T result = caseTypeToTClass(typeToTClass);
			if (result == null)
				result = caseAbstractCorrespondence(typeToTClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GravityTGGPackage.EXTENDED_PARAMETER_TO_TYPE_GRAPH: {
			ExtendedParameterToTypeGraph extendedParameterToTypeGraph = (ExtendedParameterToTypeGraph) theEObject;
			T result = caseExtendedParameterToTypeGraph(extendedParameterToTypeGraph);
			if (result == null)
				result = caseAbstractCorrespondence(extendedParameterToTypeGraph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GravityTGGPackage.EXTENDED_TYPE_TO_TYPE_GRAPH: {
			ExtendedTypeToTypeGraph extendedTypeToTypeGraph = (ExtendedTypeToTypeGraph) theEObject;
			T result = caseExtendedTypeToTypeGraph(extendedTypeToTypeGraph);
			if (result == null)
				result = caseAbstractCorrespondence(extendedTypeToTypeGraph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GravityTGGPackage.EXTENDED_TYPE_TO_TCLASS: {
			ExtendedTypeToTClass extendedTypeToTClass = (ExtendedTypeToTClass) theEObject;
			T result = caseExtendedTypeToTClass(extendedTypeToTClass);
			if (result == null)
				result = caseAbstractCorrespondence(extendedTypeToTClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE: {
			ExtendedParameterListToTMethodSignature extendedParameterListToTMethodSignature = (ExtendedParameterListToTMethodSignature) theEObject;
			T result = caseExtendedParameterListToTMethodSignature(extendedParameterListToTMethodSignature);
			if (result == null)
				result = caseAbstractCorrespondence(extendedParameterListToTMethodSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GravityTGGPackage.IDENTIFIER_REFERENCE_TO_TMETHOD_DEFINITION: {
			IdentifierReferenceToTMethodDefinition identifierReferenceToTMethodDefinition = (IdentifierReferenceToTMethodDefinition) theEObject;
			T result = caseIdentifierReferenceToTMethodDefinition(identifierReferenceToTMethodDefinition);
			if (result == null)
				result = caseAbstractCorrespondence(identifierReferenceToTMethodDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GravityTGGPackage.EXTENDED_METHOD_NAME_TO_TMETHOD: {
			ExtendedMethodNameToTMethod extendedMethodNameToTMethod = (ExtendedMethodNameToTMethod) theEObject;
			T result = caseExtendedMethodNameToTMethod(extendedMethodNameToTMethod);
			if (result == null)
				result = caseAbstractCorrespondence(extendedMethodNameToTMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member To TMember</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member To TMember</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberToTMember(MemberToTMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Method To TMethod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Method To TMethod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassMethodToTMethod(ClassMethodToTMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Method To TMethod Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Method To TMethod Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassMethodToTMethodDefinition(
			ClassMethodToTMethodDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Method To TMethod Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Method To TMethod Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassMethodToTMethodSignature(
			ClassMethodToTMethodSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class To TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassToTClass(ClassToTClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit To TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationUnitToTClass(CompilationUnitToTClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Jamopp Java Container To Type Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Jamopp Java Container To Type Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedJamoppJavaContainerToTypeGraph(
			ExtendedJamoppJavaContainerToTypeGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Jamopp Package Element To TPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Jamopp Package Element To TPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedJamoppPackageElementToTPackage(
			ExtendedJamoppPackageElementToTPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Parameter List To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Parameter List To TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedParameterListToTClass(
			ExtendedParameterListToTClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Parameter List To TParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Parameter List To TParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedParameterListToTParameter(
			ExtendedParameterListToTParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Parameter List To TParameter List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Parameter List To TParameter List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedParameterListToTParameterList(
			ExtendedParameterListToTParameterList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Parameter To TParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Parameter To TParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedParameterToTParameter(
			ExtendedParameterToTParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field To TField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field To TField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldToTField(FieldToTField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field To TField Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field To TField Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldToTFieldDefinition(FieldToTFieldDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field To TField Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field To TField Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldToTFieldSignature(FieldToTFieldSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type To TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeToTClass(TypeToTClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Parameter To Type Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Parameter To Type Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedParameterToTypeGraph(
			ExtendedParameterToTypeGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Type To Type Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Type To Type Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedTypeToTypeGraph(ExtendedTypeToTypeGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Type To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Type To TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedTypeToTClass(ExtendedTypeToTClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Parameter List To TMethod Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Parameter List To TMethod Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedParameterListToTMethodSignature(
			ExtendedParameterListToTMethodSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Reference To TMethod Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Reference To TMethod Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierReferenceToTMethodDefinition(
			IdentifierReferenceToTMethodDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Method Name To TMethod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Method Name To TMethod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedMethodNameToTMethod(ExtendedMethodNameToTMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCorrespondence(AbstractCorrespondence object) {
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

} //GravityTGGSwitch
