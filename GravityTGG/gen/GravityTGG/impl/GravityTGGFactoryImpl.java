/**
 */
package GravityTGG.impl;

import GravityTGG.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GravityTGGFactoryImpl extends EFactoryImpl implements
		GravityTGGFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GravityTGGFactory init() {
		try {
			GravityTGGFactory theGravityTGGFactory = (GravityTGGFactory) EPackage.Registry.INSTANCE
					.getEFactory(GravityTGGPackage.eNS_URI);
			if (theGravityTGGFactory != null) {
				return theGravityTGGFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GravityTGGFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GravityTGGFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GravityTGGPackage.MEMBER_TO_TMEMBER:
			return createMemberToTMember();
		case GravityTGGPackage.CLASS_METHOD_TO_TMETHOD:
			return createClassMethodToTMethod();
		case GravityTGGPackage.CLASS_METHOD_TO_TMETHOD_DEFINITION:
			return createClassMethodToTMethodDefinition();
		case GravityTGGPackage.CLASS_METHOD_TO_TMETHOD_SIGNATURE:
			return createClassMethodToTMethodSignature();
		case GravityTGGPackage.CLASS_TO_TCLASS:
			return createClassToTClass();
		case GravityTGGPackage.COMPILATION_UNIT_TO_TCLASS:
			return createCompilationUnitToTClass();
		case GravityTGGPackage.EXTENDED_JAMOPP_JAVA_CONTAINER_TO_TYPE_GRAPH:
			return createExtendedJamoppJavaContainerToTypeGraph();
		case GravityTGGPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE:
			return createExtendedJamoppPackageElementToTPackage();
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TCLASS:
			return createExtendedParameterListToTClass();
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TPARAMETER:
			return createExtendedParameterListToTParameter();
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TPARAMETER_LIST:
			return createExtendedParameterListToTParameterList();
		case GravityTGGPackage.EXTENDED_PARAMETER_TO_TPARAMETER:
			return createExtendedParameterToTParameter();
		case GravityTGGPackage.FIELD_TO_TFIELD:
			return createFieldToTField();
		case GravityTGGPackage.FIELD_TO_TFIELD_DEFINITION:
			return createFieldToTFieldDefinition();
		case GravityTGGPackage.FIELD_TO_TFIELD_SIGNATURE:
			return createFieldToTFieldSignature();
		case GravityTGGPackage.TYPE_TO_TCLASS:
			return createTypeToTClass();
		case GravityTGGPackage.EXTENDED_PARAMETER_TO_TYPE_GRAPH:
			return createExtendedParameterToTypeGraph();
		case GravityTGGPackage.EXTENDED_TYPE_TO_TYPE_GRAPH:
			return createExtendedTypeToTypeGraph();
		case GravityTGGPackage.EXTENDED_TYPE_TO_TCLASS:
			return createExtendedTypeToTClass();
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE:
			return createExtendedParameterListToTMethodSignature();
		case GravityTGGPackage.IDENTIFIER_REFERENCE_TO_TMETHOD_DEFINITION:
			return createIdentifierReferenceToTMethodDefinition();
		case GravityTGGPackage.EXTENDED_METHOD_NAME_TO_TMETHOD:
			return createExtendedMethodNameToTMethod();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberToTMember createMemberToTMember() {
		MemberToTMemberImpl memberToTMember = new MemberToTMemberImpl();
		return memberToTMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMethodToTMethod createClassMethodToTMethod() {
		ClassMethodToTMethodImpl classMethodToTMethod = new ClassMethodToTMethodImpl();
		return classMethodToTMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMethodToTMethodDefinition createClassMethodToTMethodDefinition() {
		ClassMethodToTMethodDefinitionImpl classMethodToTMethodDefinition = new ClassMethodToTMethodDefinitionImpl();
		return classMethodToTMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMethodToTMethodSignature createClassMethodToTMethodSignature() {
		ClassMethodToTMethodSignatureImpl classMethodToTMethodSignature = new ClassMethodToTMethodSignatureImpl();
		return classMethodToTMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassToTClass createClassToTClass() {
		ClassToTClassImpl classToTClass = new ClassToTClassImpl();
		return classToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnitToTClass createCompilationUnitToTClass() {
		CompilationUnitToTClassImpl compilationUnitToTClass = new CompilationUnitToTClassImpl();
		return compilationUnitToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedJamoppJavaContainerToTypeGraph createExtendedJamoppJavaContainerToTypeGraph() {
		ExtendedJamoppJavaContainerToTypeGraphImpl extendedJamoppJavaContainerToTypeGraph = new ExtendedJamoppJavaContainerToTypeGraphImpl();
		return extendedJamoppJavaContainerToTypeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedJamoppPackageElementToTPackage createExtendedJamoppPackageElementToTPackage() {
		ExtendedJamoppPackageElementToTPackageImpl extendedJamoppPackageElementToTPackage = new ExtendedJamoppPackageElementToTPackageImpl();
		return extendedJamoppPackageElementToTPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedParameterListToTClass createExtendedParameterListToTClass() {
		ExtendedParameterListToTClassImpl extendedParameterListToTClass = new ExtendedParameterListToTClassImpl();
		return extendedParameterListToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedParameterListToTParameter createExtendedParameterListToTParameter() {
		ExtendedParameterListToTParameterImpl extendedParameterListToTParameter = new ExtendedParameterListToTParameterImpl();
		return extendedParameterListToTParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedParameterListToTParameterList createExtendedParameterListToTParameterList() {
		ExtendedParameterListToTParameterListImpl extendedParameterListToTParameterList = new ExtendedParameterListToTParameterListImpl();
		return extendedParameterListToTParameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedParameterToTParameter createExtendedParameterToTParameter() {
		ExtendedParameterToTParameterImpl extendedParameterToTParameter = new ExtendedParameterToTParameterImpl();
		return extendedParameterToTParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldToTField createFieldToTField() {
		FieldToTFieldImpl fieldToTField = new FieldToTFieldImpl();
		return fieldToTField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldToTFieldDefinition createFieldToTFieldDefinition() {
		FieldToTFieldDefinitionImpl fieldToTFieldDefinition = new FieldToTFieldDefinitionImpl();
		return fieldToTFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldToTFieldSignature createFieldToTFieldSignature() {
		FieldToTFieldSignatureImpl fieldToTFieldSignature = new FieldToTFieldSignatureImpl();
		return fieldToTFieldSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTClass createTypeToTClass() {
		TypeToTClassImpl typeToTClass = new TypeToTClassImpl();
		return typeToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedParameterToTypeGraph createExtendedParameterToTypeGraph() {
		ExtendedParameterToTypeGraphImpl extendedParameterToTypeGraph = new ExtendedParameterToTypeGraphImpl();
		return extendedParameterToTypeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedTypeToTypeGraph createExtendedTypeToTypeGraph() {
		ExtendedTypeToTypeGraphImpl extendedTypeToTypeGraph = new ExtendedTypeToTypeGraphImpl();
		return extendedTypeToTypeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedTypeToTClass createExtendedTypeToTClass() {
		ExtendedTypeToTClassImpl extendedTypeToTClass = new ExtendedTypeToTClassImpl();
		return extendedTypeToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedParameterListToTMethodSignature createExtendedParameterListToTMethodSignature() {
		ExtendedParameterListToTMethodSignatureImpl extendedParameterListToTMethodSignature = new ExtendedParameterListToTMethodSignatureImpl();
		return extendedParameterListToTMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierReferenceToTMethodDefinition createIdentifierReferenceToTMethodDefinition() {
		IdentifierReferenceToTMethodDefinitionImpl identifierReferenceToTMethodDefinition = new IdentifierReferenceToTMethodDefinitionImpl();
		return identifierReferenceToTMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedMethodNameToTMethod createExtendedMethodNameToTMethod() {
		ExtendedMethodNameToTMethodImpl extendedMethodNameToTMethod = new ExtendedMethodNameToTMethodImpl();
		return extendedMethodNameToTMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GravityTGGPackage getGravityTGGPackage() {
		return (GravityTGGPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GravityTGGPackage getPackage() {
		return GravityTGGPackage.eINSTANCE;
	}

} //GravityTGGFactoryImpl
