/**
 */
package GravityTGG.Postprocessing.impl;

import GravityTGG.Postprocessing.*;

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
public class PostprocessingFactoryImpl extends EFactoryImpl implements
		PostprocessingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PostprocessingFactory init() {
		try {
			PostprocessingFactory thePostprocessingFactory = (PostprocessingFactory) EPackage.Registry.INSTANCE
					.getEFactory(PostprocessingPackage.eNS_URI);
			if (thePostprocessingFactory != null) {
				return thePostprocessingFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PostprocessingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostprocessingFactoryImpl() {
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
		case PostprocessingPackage.MEMBER_CORRESPONDENCE:
			return createMemberCorrespondence();
		case PostprocessingPackage.TGG_POSTPROCESSING:
			return createTGGPostprocessing();
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
	public MemberCorrespondence createMemberCorrespondence() {
		MemberCorrespondenceImpl memberCorrespondence = new MemberCorrespondenceImpl();
		return memberCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TGGPostprocessing createTGGPostprocessing() {
		TGGPostprocessingImpl tggPostprocessing = new TGGPostprocessingImpl();
		return tggPostprocessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostprocessingPackage getPostprocessingPackage() {
		return (PostprocessingPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PostprocessingPackage getPackage() {
		return PostprocessingPackage.eINSTANCE;
	}

} //PostprocessingFactoryImpl
