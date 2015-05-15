/**
 */
package ExtendedJamopp.impl;

import ExtendedJamopp.*;

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
public class ExtendedJamoppFactoryImpl extends EFactoryImpl implements
		ExtendedJamoppFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExtendedJamoppFactory init() {
		try {
			ExtendedJamoppFactory theExtendedJamoppFactory = (ExtendedJamoppFactory) EPackage.Registry.INSTANCE
					.getEFactory(ExtendedJamoppPackage.eNS_URI);
			if (theExtendedJamoppFactory != null) {
				return theExtendedJamoppFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExtendedJamoppFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedJamoppFactoryImpl() {
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
		case ExtendedJamoppPackage.EXTENDED_CLASS_METHOD:
			return createExtendedClassMethod();
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER:
			return createExtendedJamoppJavaContainer();
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT:
			return createExtendedJamoppPackageElement();
		case ExtendedJamoppPackage.EXTENDED_PARAMETER:
			return createExtendedParameter();
		case ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST:
			return createExtendedParameterList();
		case ExtendedJamoppPackage.EXTENDED_TYPE:
			return createExtendedType();
		case ExtendedJamoppPackage.EXTENDED_METHOD_NAME:
			return createExtendedMethodName();
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
	public ExtendedClassMethod createExtendedClassMethod() {
		ExtendedClassMethodImpl extendedClassMethod = new ExtendedClassMethodImpl();
		return extendedClassMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedJamoppJavaContainer createExtendedJamoppJavaContainer() {
		ExtendedJamoppJavaContainerImpl extendedJamoppJavaContainer = new ExtendedJamoppJavaContainerImpl();
		return extendedJamoppJavaContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedJamoppPackageElement createExtendedJamoppPackageElement() {
		ExtendedJamoppPackageElementImpl extendedJamoppPackageElement = new ExtendedJamoppPackageElementImpl();
		return extendedJamoppPackageElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedParameter createExtendedParameter() {
		ExtendedParameterImpl extendedParameter = new ExtendedParameterImpl();
		return extendedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedParameterList createExtendedParameterList() {
		ExtendedParameterListImpl extendedParameterList = new ExtendedParameterListImpl();
		return extendedParameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedType createExtendedType() {
		ExtendedTypeImpl extendedType = new ExtendedTypeImpl();
		return extendedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedMethodName createExtendedMethodName() {
		ExtendedMethodNameImpl extendedMethodName = new ExtendedMethodNameImpl();
		return extendedMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedJamoppPackage getExtendedJamoppPackage() {
		return (ExtendedJamoppPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExtendedJamoppPackage getPackage() {
		return ExtendedJamoppPackage.eINSTANCE;
	}

} //ExtendedJamoppFactoryImpl
