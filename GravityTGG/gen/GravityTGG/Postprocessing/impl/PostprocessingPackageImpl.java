/**
 */
package GravityTGG.Postprocessing.impl;

import ExtendedJamopp.ExtendedJamoppPackage;

import GravityTGG.GravityTGGPackage;

import GravityTGG.Postprocessing.PostprocessingFactory;
import GravityTGG.Postprocessing.PostprocessingPackage;

import GravityTGG.Rules.RulesPackage;

import GravityTGG.Rules.impl.RulesPackageImpl;

import GravityTGG.impl.GravityTGGPackageImpl;

import TGGLanguage.TGGLanguagePackage;

import TypeGraphBasic.TypeGraphBasicPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PostprocessingPackageImpl extends EPackageImpl implements
		PostprocessingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tggPostprocessingEClass = null;

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
	 * @see GravityTGG.Postprocessing.PostprocessingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PostprocessingPackageImpl() {
		super(eNS_URI, PostprocessingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PostprocessingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static PostprocessingPackage init() {
		if (isInited)
			return (PostprocessingPackage) EPackage.Registry.INSTANCE
					.getEPackage(PostprocessingPackage.eNS_URI);

		// Obtain or create and register package
		PostprocessingPackageImpl thePostprocessingPackage = (PostprocessingPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof PostprocessingPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new PostprocessingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypeGraphBasicPackage.eINSTANCE.eClass();
		ExtendedJamoppPackage.eINSTANCE.eClass();
		TGGLanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		GravityTGGPackageImpl theGravityTGGPackage = (GravityTGGPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(GravityTGGPackage.eNS_URI) instanceof GravityTGGPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(GravityTGGPackage.eNS_URI)
				: GravityTGGPackage.eINSTANCE);
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);

		// Load packages
		theGravityTGGPackage.loadPackage();

		// Fix loaded packages
		thePostprocessingPackage.fixPackageContents();
		theGravityTGGPackage.fixPackageContents();
		theRulesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		thePostprocessingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PostprocessingPackage.eNS_URI,
				thePostprocessingPackage);
		return thePostprocessingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemberCorrespondence() {
		if (memberCorrespondenceEClass == null) {
			memberCorrespondenceEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(PostprocessingPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return memberCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberCorrespondence_Source() {
		return (EReference) getMemberCorrespondence().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberCorrespondence_Target() {
		return (EReference) getMemberCorrespondence().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTGGPostprocessing() {
		if (tggPostprocessingEClass == null) {
			tggPostprocessingEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(PostprocessingPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return tggPostprocessingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTGGPostprocessing_MemberCorrespondences() {
		return (EReference) getTGGPostprocessing().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTGGPostprocessing_Pg() {
		return (EReference) getTGGPostprocessing().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTGGPostprocessing__CreateAccessEdgesForMethod__ClassMethodToTMethodDefinition() {
		return getTGGPostprocessing().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTGGPostprocessing__HandleElementReference__ElementReference_TMethodDefinition() {
		return getTGGPostprocessing().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTGGPostprocessing__CreadeAndLink__ClassMethod_TMember() {
		return getTGGPostprocessing().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTGGPostprocessing__GetFullyQualifiedName__CompilationUnit() {
		return getTGGPostprocessing().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTGGPostprocessing__CreateAndLink__Field_TMember() {
		return getTGGPostprocessing().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTGGPostprocessing__HandleArguments__MethodCall_TMethodDefinition() {
		return getTGGPostprocessing().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostprocessingFactory getPostprocessingFactory() {
		return (PostprocessingFactory) getEFactoryInstance();
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
			eClassifier.setInstanceClassName("GravityTGG.Postprocessing."
					+ eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //PostprocessingPackageImpl
