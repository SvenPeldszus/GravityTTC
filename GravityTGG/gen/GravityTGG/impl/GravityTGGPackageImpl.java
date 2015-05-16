/**
 */
package GravityTGG.impl;

import ExtendedJamopp.ExtendedJamoppPackage;

import GravityTGG.GravityTGGFactory;
import GravityTGG.GravityTGGPackage;

import GravityTGG.Postprocessing.PostprocessingPackage;

import GravityTGG.Postprocessing.impl.PostprocessingPackageImpl;

import GravityTGG.Rules.RulesPackage;

import GravityTGG.Rules.impl.RulesPackageImpl;

import TGGLanguage.TGGLanguagePackage;

import TypeGraphBasic.TypeGraphBasicPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GravityTGGPackageImpl extends EPackageImpl implements
		GravityTGGPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "GravityTGG.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberToTMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classMethodToTMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classMethodToTMethodDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classMethodToTMethodSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classToTClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnitToTClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedJamoppJavaContainerToTypeGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedJamoppPackageElementToTPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedParameterListToTClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedParameterListToTParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedParameterListToTParameterListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedParameterToTParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldToTFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldToTFieldDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldToTFieldSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeToTClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedParameterToTypeGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedTypeToTypeGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedTypeToTClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedParameterListToTMethodSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierReferenceToTMethodDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedMethodNameToTMethodEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see GravityTGG.GravityTGGPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GravityTGGPackageImpl() {
		super(eNS_URI, GravityTGGFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GravityTGGPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static GravityTGGPackage init() {
		if (isInited)
			return (GravityTGGPackage) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI);

		// Obtain or create and register package
		GravityTGGPackageImpl theGravityTGGPackage = (GravityTGGPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof GravityTGGPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new GravityTGGPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypeGraphBasicPackage.eINSTANCE.eClass();
		ExtendedJamoppPackage.eINSTANCE.eClass();
		TGGLanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
		PostprocessingPackageImpl thePostprocessingPackage = (PostprocessingPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PostprocessingPackage.eNS_URI) instanceof PostprocessingPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(PostprocessingPackage.eNS_URI)
				: PostprocessingPackage.eINSTANCE);

		// Load packages
		theGravityTGGPackage.loadPackage();

		// Fix loaded packages
		theGravityTGGPackage.fixPackageContents();
		theRulesPackage.fixPackageContents();
		thePostprocessingPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theGravityTGGPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GravityTGGPackage.eNS_URI,
				theGravityTGGPackage);
		return theGravityTGGPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemberToTMember() {
		if (memberToTMemberEClass == null) {
			memberToTMemberEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(0);
		}
		return memberToTMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberToTMember_Source() {
		return (EReference) getMemberToTMember().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberToTMember_Target() {
		return (EReference) getMemberToTMember().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassMethodToTMethod() {
		if (classMethodToTMethodEClass == null) {
			classMethodToTMethodEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(1);
		}
		return classMethodToTMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassMethodToTMethod_Target() {
		return (EReference) getClassMethodToTMethod().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassMethodToTMethod_Source() {
		return (EReference) getClassMethodToTMethod().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassMethodToTMethodDefinition() {
		if (classMethodToTMethodDefinitionEClass == null) {
			classMethodToTMethodDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(2);
		}
		return classMethodToTMethodDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassMethodToTMethodDefinition_Source() {
		return (EReference) getClassMethodToTMethodDefinition()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassMethodToTMethodDefinition_Target() {
		return (EReference) getClassMethodToTMethodDefinition()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassMethodToTMethodSignature() {
		if (classMethodToTMethodSignatureEClass == null) {
			classMethodToTMethodSignatureEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(3);
		}
		return classMethodToTMethodSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassMethodToTMethodSignature_Target() {
		return (EReference) getClassMethodToTMethodSignature()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassMethodToTMethodSignature_Source() {
		return (EReference) getClassMethodToTMethodSignature()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassToTClass() {
		if (classToTClassEClass == null) {
			classToTClassEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(4);
		}
		return classToTClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassToTClass_Target() {
		return (EReference) getClassToTClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassToTClass_Source() {
		return (EReference) getClassToTClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilationUnitToTClass() {
		if (compilationUnitToTClassEClass == null) {
			compilationUnitToTClassEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(5);
		}
		return compilationUnitToTClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnitToTClass_Target() {
		return (EReference) getCompilationUnitToTClass()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnitToTClass_Source() {
		return (EReference) getCompilationUnitToTClass()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedJamoppJavaContainerToTypeGraph() {
		if (extendedJamoppJavaContainerToTypeGraphEClass == null) {
			extendedJamoppJavaContainerToTypeGraphEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(6);
		}
		return extendedJamoppJavaContainerToTypeGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedJamoppJavaContainerToTypeGraph_Target() {
		return (EReference) getExtendedJamoppJavaContainerToTypeGraph()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedJamoppJavaContainerToTypeGraph_Source() {
		return (EReference) getExtendedJamoppJavaContainerToTypeGraph()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedJamoppPackageElementToTPackage() {
		if (extendedJamoppPackageElementToTPackageEClass == null) {
			extendedJamoppPackageElementToTPackageEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(7);
		}
		return extendedJamoppPackageElementToTPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedJamoppPackageElementToTPackage_Target() {
		return (EReference) getExtendedJamoppPackageElementToTPackage()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedJamoppPackageElementToTPackage_Source() {
		return (EReference) getExtendedJamoppPackageElementToTPackage()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedParameterListToTClass() {
		if (extendedParameterListToTClassEClass == null) {
			extendedParameterListToTClassEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(8);
		}
		return extendedParameterListToTClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedParameterListToTClass_Target() {
		return (EReference) getExtendedParameterListToTClass()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedParameterListToTClass_Source() {
		return (EReference) getExtendedParameterListToTClass()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedParameterListToTParameter() {
		if (extendedParameterListToTParameterEClass == null) {
			extendedParameterListToTParameterEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(9);
		}
		return extendedParameterListToTParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedParameterListToTParameter_Source() {
		return (EReference) getExtendedParameterListToTParameter()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedParameterListToTParameter_Target() {
		return (EReference) getExtendedParameterListToTParameter()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedParameterListToTParameterList() {
		if (extendedParameterListToTParameterListEClass == null) {
			extendedParameterListToTParameterListEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(10);
		}
		return extendedParameterListToTParameterListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedParameterListToTParameterList_Target() {
		return (EReference) getExtendedParameterListToTParameterList()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedParameterListToTParameterList_Source() {
		return (EReference) getExtendedParameterListToTParameterList()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedParameterToTParameter() {
		if (extendedParameterToTParameterEClass == null) {
			extendedParameterToTParameterEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(11);
		}
		return extendedParameterToTParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedParameterToTParameter_Source() {
		return (EReference) getExtendedParameterToTParameter()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedParameterToTParameter_Target() {
		return (EReference) getExtendedParameterToTParameter()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldToTField() {
		if (fieldToTFieldEClass == null) {
			fieldToTFieldEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(12);
		}
		return fieldToTFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldToTField_Source() {
		return (EReference) getFieldToTField().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldToTField_Target() {
		return (EReference) getFieldToTField().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldToTFieldDefinition() {
		if (fieldToTFieldDefinitionEClass == null) {
			fieldToTFieldDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(13);
		}
		return fieldToTFieldDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldToTFieldDefinition_Target() {
		return (EReference) getFieldToTFieldDefinition()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldToTFieldDefinition_Source() {
		return (EReference) getFieldToTFieldDefinition()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldToTFieldSignature() {
		if (fieldToTFieldSignatureEClass == null) {
			fieldToTFieldSignatureEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(14);
		}
		return fieldToTFieldSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldToTFieldSignature_Target() {
		return (EReference) getFieldToTFieldSignature()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldToTFieldSignature_Source() {
		return (EReference) getFieldToTFieldSignature()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeToTClass() {
		if (typeToTClassEClass == null) {
			typeToTClassEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(15);
		}
		return typeToTClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeToTClass_Source() {
		return (EReference) getTypeToTClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeToTClass_Target() {
		return (EReference) getTypeToTClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedParameterToTypeGraph() {
		if (extendedParameterToTypeGraphEClass == null) {
			extendedParameterToTypeGraphEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(16);
		}
		return extendedParameterToTypeGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedParameterToTypeGraph_Source() {
		return (EReference) getExtendedParameterToTypeGraph()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedParameterToTypeGraph_Target() {
		return (EReference) getExtendedParameterToTypeGraph()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedTypeToTypeGraph() {
		if (extendedTypeToTypeGraphEClass == null) {
			extendedTypeToTypeGraphEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(17);
		}
		return extendedTypeToTypeGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedTypeToTypeGraph_Source() {
		return (EReference) getExtendedTypeToTypeGraph()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedTypeToTypeGraph_Target() {
		return (EReference) getExtendedTypeToTypeGraph()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedTypeToTClass() {
		if (extendedTypeToTClassEClass == null) {
			extendedTypeToTClassEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(18);
		}
		return extendedTypeToTClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedTypeToTClass_Source() {
		return (EReference) getExtendedTypeToTClass().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedTypeToTClass_Target() {
		return (EReference) getExtendedTypeToTClass().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedParameterListToTMethodSignature() {
		if (extendedParameterListToTMethodSignatureEClass == null) {
			extendedParameterListToTMethodSignatureEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(19);
		}
		return extendedParameterListToTMethodSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedParameterListToTMethodSignature_Source() {
		return (EReference) getExtendedParameterListToTMethodSignature()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedParameterListToTMethodSignature_Target() {
		return (EReference) getExtendedParameterListToTMethodSignature()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifierReferenceToTMethodDefinition() {
		if (identifierReferenceToTMethodDefinitionEClass == null) {
			identifierReferenceToTMethodDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(20);
		}
		return identifierReferenceToTMethodDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentifierReferenceToTMethodDefinition_Source() {
		return (EReference) getIdentifierReferenceToTMethodDefinition()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentifierReferenceToTMethodDefinition_Target() {
		return (EReference) getIdentifierReferenceToTMethodDefinition()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedMethodNameToTMethod() {
		if (extendedMethodNameToTMethodEClass == null) {
			extendedMethodNameToTMethodEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GravityTGGPackage.eNS_URI).getEClassifiers()
					.get(21);
		}
		return extendedMethodNameToTMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedMethodNameToTMethod_Source() {
		return (EReference) getExtendedMethodNameToTMethod()
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedMethodNameToTMethod_Target() {
		return (EReference) getExtendedMethodNameToTMethod()
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GravityTGGFactory getGravityTGGFactory() {
		return (GravityTGGFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded)
			return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: "
					+ packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents()
				.get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("GravityTGG."
					+ eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //GravityTGGPackageImpl
