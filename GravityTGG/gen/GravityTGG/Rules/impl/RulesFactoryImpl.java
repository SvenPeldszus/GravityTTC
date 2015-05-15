/**
 */
package GravityTGG.Rules.impl;

import GravityTGG.Rules.*;

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
public class RulesFactoryImpl extends EFactoryImpl implements RulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RulesFactory init() {
		try {
			RulesFactory theRulesFactory = (RulesFactory) EPackage.Registry.INSTANCE
					.getEFactory(RulesPackage.eNS_URI);
			if (theRulesFactory != null) {
				return theRulesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactoryImpl() {
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
		case RulesPackage.CLASS_DEFAULT:
			return createClassDefault();
		case RulesPackage.PARAMETER_TYPE_LIB_CREATE:
			return createParameterTypeLibCreate();
		case RulesPackage.FIELD_NAME_EXISTING:
			return createFieldNameExisting();
		case RulesPackage.PARAMETER_TYPE_LIB_LINK:
			return createParameterTypeLibLink();
		case RulesPackage.METHOD_DEFINITION_LINK_SIGNATURE:
			return createMethodDefinitionLinkSignature();
		case RulesPackage.METHOD_LINK_CLASS:
			return createMethodLinkClass();
		case RulesPackage.INHERITANCE:
			return createInheritance();
		case RulesPackage.PARAMETER_LIST_LINK_FIRST:
			return createParameterListLinkFirst();
		case RulesPackage.PARAMETER_TYPE_USER_DEFINED:
			return createParameterTypeUserDefined();
		case RulesPackage.METHOD_SIGNATURE_LINK_DEFINITION:
			return createMethodSignatureLinkDefinition();
		case RulesPackage.PARAMETER_LINK_LIST_NEXT:
			return createParameterLinkListNext();
		case RulesPackage.FIELD_NAME_CREATE:
			return createFieldNameCreate();
		case RulesPackage.METHOD_NAME_CREATE:
			return createMethodNameCreate();
		case RulesPackage.CLASS1:
			return createClass1();
		case RulesPackage.METHOD_SIGNATURE_CREATE:
			return createMethodSignatureCreate();
		case RulesPackage.PACKAGE_ROOT:
			return createPackageRoot();
		case RulesPackage.PACKAGE_CHILD:
			return createPackageChild();
		case RulesPackage.PROGRAM_GRAPH_CREATE:
			return createProgramGraphCreate();
		case RulesPackage.RETURN_TYPE_USER_DEFINED:
			return createReturnTypeUserDefined();
		case RulesPackage.RETURN_TYPE_FROM_LIB_CREATE:
			return createReturnTypeFromLibCreate();
		case RulesPackage.RETURN_TYPE_FROM_LIB_LINK:
			return createReturnTypeFromLibLink();
		case RulesPackage.PARAMETER_CREATE_NEW:
			return createParameterCreateNew();
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
	public ClassDefault createClassDefault() {
		ClassDefaultImpl classDefault = new ClassDefaultImpl();
		return classDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterTypeLibCreate createParameterTypeLibCreate() {
		ParameterTypeLibCreateImpl parameterTypeLibCreate = new ParameterTypeLibCreateImpl();
		return parameterTypeLibCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldNameExisting createFieldNameExisting() {
		FieldNameExistingImpl fieldNameExisting = new FieldNameExistingImpl();
		return fieldNameExisting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterTypeLibLink createParameterTypeLibLink() {
		ParameterTypeLibLinkImpl parameterTypeLibLink = new ParameterTypeLibLinkImpl();
		return parameterTypeLibLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodDefinitionLinkSignature createMethodDefinitionLinkSignature() {
		MethodDefinitionLinkSignatureImpl methodDefinitionLinkSignature = new MethodDefinitionLinkSignatureImpl();
		return methodDefinitionLinkSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodLinkClass createMethodLinkClass() {
		MethodLinkClassImpl methodLinkClass = new MethodLinkClassImpl();
		return methodLinkClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inheritance createInheritance() {
		InheritanceImpl inheritance = new InheritanceImpl();
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterListLinkFirst createParameterListLinkFirst() {
		ParameterListLinkFirstImpl parameterListLinkFirst = new ParameterListLinkFirstImpl();
		return parameterListLinkFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterTypeUserDefined createParameterTypeUserDefined() {
		ParameterTypeUserDefinedImpl parameterTypeUserDefined = new ParameterTypeUserDefinedImpl();
		return parameterTypeUserDefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodSignatureLinkDefinition createMethodSignatureLinkDefinition() {
		MethodSignatureLinkDefinitionImpl methodSignatureLinkDefinition = new MethodSignatureLinkDefinitionImpl();
		return methodSignatureLinkDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterLinkListNext createParameterLinkListNext() {
		ParameterLinkListNextImpl parameterLinkListNext = new ParameterLinkListNextImpl();
		return parameterLinkListNext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldNameCreate createFieldNameCreate() {
		FieldNameCreateImpl fieldNameCreate = new FieldNameCreateImpl();
		return fieldNameCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodNameCreate createMethodNameCreate() {
		MethodNameCreateImpl methodNameCreate = new MethodNameCreateImpl();
		return methodNameCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class1 createClass1() {
		Class1Impl class1 = new Class1Impl();
		return class1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodSignatureCreate createMethodSignatureCreate() {
		MethodSignatureCreateImpl methodSignatureCreate = new MethodSignatureCreateImpl();
		return methodSignatureCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRoot createPackageRoot() {
		PackageRootImpl packageRoot = new PackageRootImpl();
		return packageRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageChild createPackageChild() {
		PackageChildImpl packageChild = new PackageChildImpl();
		return packageChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramGraphCreate createProgramGraphCreate() {
		ProgramGraphCreateImpl programGraphCreate = new ProgramGraphCreateImpl();
		return programGraphCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnTypeUserDefined createReturnTypeUserDefined() {
		ReturnTypeUserDefinedImpl returnTypeUserDefined = new ReturnTypeUserDefinedImpl();
		return returnTypeUserDefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnTypeFromLibCreate createReturnTypeFromLibCreate() {
		ReturnTypeFromLibCreateImpl returnTypeFromLibCreate = new ReturnTypeFromLibCreateImpl();
		return returnTypeFromLibCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnTypeFromLibLink createReturnTypeFromLibLink() {
		ReturnTypeFromLibLinkImpl returnTypeFromLibLink = new ReturnTypeFromLibLinkImpl();
		return returnTypeFromLibLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterCreateNew createParameterCreateNew() {
		ParameterCreateNewImpl parameterCreateNew = new ParameterCreateNewImpl();
		return parameterCreateNew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesPackage getRulesPackage() {
		return (RulesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RulesPackage getPackage() {
		return RulesPackage.eINSTANCE;
	}

} //RulesFactoryImpl
