/**
 */
package Refactorings.Containers.impl;

import Refactorings.Containers.*;

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
public class ContainersFactoryImpl extends EFactoryImpl implements
		ContainersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContainersFactory init() {
		try {
			ContainersFactory theContainersFactory = (ContainersFactory) EPackage.Registry.INSTANCE
					.getEFactory(ContainersPackage.eNS_URI);
			if (theContainersFactory != null) {
				return theContainersFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContainersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainersFactoryImpl() {
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
		case ContainersPackage.CSC_CONTAINER:
			return createCSCContainer();
		case ContainersPackage.PUM_CONTAINER:
			return createPUMContainer();
		case ContainersPackage.TACCESS_CONTAINER:
			return createTAccessContainer();
		case ContainersPackage.TCLASS_CONTAINER:
			return createTClassContainer();
		case ContainersPackage.TMETHOD_DEFINITION_CONTAINER:
			return createTMethodDefinitionContainer();
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
	public CSCContainer createCSCContainer() {
		CSCContainerImpl cscContainer = new CSCContainerImpl();
		return cscContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PUMContainer createPUMContainer() {
		PUMContainerImpl pumContainer = new PUMContainerImpl();
		return pumContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAccessContainer createTAccessContainer() {
		TAccessContainerImpl tAccessContainer = new TAccessContainerImpl();
		return tAccessContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClassContainer createTClassContainer() {
		TClassContainerImpl tClassContainer = new TClassContainerImpl();
		return tClassContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodDefinitionContainer createTMethodDefinitionContainer() {
		TMethodDefinitionContainerImpl tMethodDefinitionContainer = new TMethodDefinitionContainerImpl();
		return tMethodDefinitionContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainersPackage getContainersPackage() {
		return (ContainersPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContainersPackage getPackage() {
		return ContainersPackage.eINSTANCE;
	}

} //ContainersFactoryImpl
