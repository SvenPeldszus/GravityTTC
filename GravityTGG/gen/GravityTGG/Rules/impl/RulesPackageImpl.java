/**
 */
package GravityTGG.Rules.impl;

import ExtendedJamopp.ExtendedJamoppPackage;

import GravityTGG.GravityTGGPackage;

import GravityTGG.Postprocessing.PostprocessingPackage;

import GravityTGG.Postprocessing.impl.PostprocessingPackageImpl;

import GravityTGG.Rules.RulesFactory;
import GravityTGG.Rules.RulesPackage;

import GravityTGG.impl.GravityTGGPackageImpl;

import TGGLanguage.TGGLanguagePackage;

import TypeGraphBasic.TypeGraphBasicPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesPackageImpl extends EPackageImpl implements RulesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterTypeLibCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldNameExistingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterTypeLibLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodDefinitionLinkSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodLinkClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterListLinkFirstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterTypeUserDefinedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodSignatureLinkDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterLinkListNextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldNameCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodNameCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodSignatureCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programGraphCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnTypeUserDefinedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnTypeFromLibCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnTypeFromLibLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterCreateNewEClass = null;

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
	 * @see GravityTGG.Rules.RulesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RulesPackageImpl() {
		super(eNS_URI, RulesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RulesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static RulesPackage init() {
		if (isInited)
			return (RulesPackage) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI);

		// Obtain or create and register package
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new RulesPackageImpl());

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
		PostprocessingPackageImpl thePostprocessingPackage = (PostprocessingPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PostprocessingPackage.eNS_URI) instanceof PostprocessingPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(PostprocessingPackage.eNS_URI)
				: PostprocessingPackage.eINSTANCE);

		// Load packages
		theGravityTGGPackage.loadPackage();

		// Fix loaded packages
		theRulesPackage.fixPackageContents();
		theGravityTGGPackage.fixPackageContents();
		thePostprocessingPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theRulesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RulesPackage.eNS_URI, theRulesPackage);
		return theRulesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassDefault() {
		if (classDefaultEClass == null) {
			classDefaultEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(0);
		}
		return classDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__IsAppropriate_FWD__Match_CompilationUnit_Class_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement() {
		return getClassDefault().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__Perform_FWD__IsApplicableMatch() {
		return getClassDefault().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__IsApplicable_FWD__Match() {
		return getClassDefault().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__RegisterObjectsToMatch_FWD__Match_CompilationUnit_Class_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement() {
		return getClassDefault().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__IsAppropriate_solveCsp_FWD__Match_CompilationUnit_Class_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement() {
		return getClassDefault().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__IsAppropriate_checkCsp_FWD__CSP() {
		return getClassDefault().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__IsApplicable_solveCsp_FWD__IsApplicableMatch_CompilationUnit_Class_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement_ExtendedJamoppPackageElementToTPackage_TPackage_TypeGraph_ExtendedJamoppJavaContainerToTypeGraph() {
		return getClassDefault().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__IsApplicable_checkCsp_FWD__CSP() {
		return getClassDefault().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassDefault().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__CheckTypes_FWD__Match() {
		return getClassDefault().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__IsAppropriate_BWD__Match_TClass_TPackage_TypeGraph() {
		return getClassDefault().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__Perform_BWD__IsApplicableMatch() {
		return getClassDefault().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__IsApplicable_BWD__Match() {
		return getClassDefault().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__RegisterObjectsToMatch_BWD__Match_TClass_TPackage_TypeGraph() {
		return getClassDefault().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__IsAppropriate_solveCsp_BWD__Match_TClass_TPackage_TypeGraph() {
		return getClassDefault().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__IsAppropriate_checkCsp_BWD__CSP() {
		return getClassDefault().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement_ExtendedJamoppPackageElementToTPackage_TClass_TPackage_TypeGraph_ExtendedJamoppJavaContainerToTypeGraph() {
		return getClassDefault().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__IsApplicable_checkCsp_BWD__CSP() {
		return getClassDefault().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassDefault().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__CheckTypes_BWD__Match() {
		return getClassDefault().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge() {
		return getClassDefault().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__IsAppropriate_FWD_EMoflonEdge_1__EMoflonEdge() {
		return getClassDefault().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__IsAppropriate_FWD_EMoflonEdge_2__EMoflonEdge() {
		return getClassDefault().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__IsAppropriate_BWD_EMoflonEdge_0__EMoflonEdge() {
		return getClassDefault().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__IsAppropriate_BWD_EMoflonEdge_1__EMoflonEdge() {
		return getClassDefault().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__IsAppropriate_BWD_EMoflonEdge_2__EMoflonEdge() {
		return getClassDefault().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__CheckAttributes_FWD__TripleMatch() {
		return getClassDefault().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassDefault__CheckAttributes_BWD__TripleMatch() {
		return getClassDefault().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterTypeLibCreate() {
		if (parameterTypeLibCreateEClass == null) {
			parameterTypeLibCreateEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(1);
		}
		return parameterTypeLibCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__IsAppropriate_FWD__Match_ExtendedParameter_ExtendedType() {
		return getParameterTypeLibCreate().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__Perform_FWD__IsApplicableMatch() {
		return getParameterTypeLibCreate().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__IsApplicable_FWD__Match() {
		return getParameterTypeLibCreate().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__RegisterObjectsToMatch_FWD__Match_ExtendedParameter_ExtendedType() {
		return getParameterTypeLibCreate().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__IsAppropriate_solveCsp_FWD__Match_ExtendedParameter_ExtendedType() {
		return getParameterTypeLibCreate().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__IsAppropriate_checkCsp_FWD__CSP() {
		return getParameterTypeLibCreate().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedParameter_TParameter_ExtendedParameterToTParameter_ExtendedType_TypeGraph_TMethodSignature_TMethod_ExtendedParameterToTypeGraph_TParameterList() {
		return getParameterTypeLibCreate().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__IsApplicable_checkCsp_FWD__CSP() {
		return getParameterTypeLibCreate().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterTypeLibCreate().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__CheckTypes_FWD__Match() {
		return getParameterTypeLibCreate().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__IsAppropriate_BWD__Match_TParameter_TClass_TypeGraph_TMethodSignature_TMethod_TParameterList() {
		return getParameterTypeLibCreate().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__Perform_BWD__IsApplicableMatch() {
		return getParameterTypeLibCreate().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__IsApplicable_BWD__Match() {
		return getParameterTypeLibCreate().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__RegisterObjectsToMatch_BWD__Match_TParameter_TClass_TypeGraph_TMethodSignature_TMethod_TParameterList() {
		return getParameterTypeLibCreate().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__IsAppropriate_solveCsp_BWD__Match_TParameter_TClass_TypeGraph_TMethodSignature_TMethod_TParameterList() {
		return getParameterTypeLibCreate().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__IsAppropriate_checkCsp_BWD__CSP() {
		return getParameterTypeLibCreate().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExtendedParameter_TParameter_ExtendedParameterToTParameter_TClass_TypeGraph_TMethodSignature_TMethod_ExtendedParameterToTypeGraph_TParameterList() {
		return getParameterTypeLibCreate().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__IsApplicable_checkCsp_BWD__CSP() {
		return getParameterTypeLibCreate().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterTypeLibCreate().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__CheckTypes_BWD__Match() {
		return getParameterTypeLibCreate().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__IsAppropriate_FWD_EMoflonEdge_3__EMoflonEdge() {
		return getParameterTypeLibCreate().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__IsAppropriate_BWD_EMoflonEdge_3__EMoflonEdge() {
		return getParameterTypeLibCreate().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__IsAppropriate_BWD_EMoflonEdge_4__EMoflonEdge() {
		return getParameterTypeLibCreate().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__CheckAttributes_FWD__TripleMatch() {
		return getParameterTypeLibCreate().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibCreate__CheckAttributes_BWD__TripleMatch() {
		return getParameterTypeLibCreate().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldNameExisting() {
		if (fieldNameExistingEClass == null) {
			fieldNameExistingEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(2);
		}
		return fieldNameExistingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__IsAppropriate_FWD__Match_Class_Field() {
		return getFieldNameExisting().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__Perform_FWD__IsApplicableMatch() {
		return getFieldNameExisting().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__IsApplicable_FWD__Match() {
		return getFieldNameExisting().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__RegisterObjectsToMatch_FWD__Match_Class_Field() {
		return getFieldNameExisting().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__IsAppropriate_solveCsp_FWD__Match_Class_Field() {
		return getFieldNameExisting().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__IsAppropriate_checkCsp_FWD__CSP() {
		return getFieldNameExisting().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__IsApplicable_solveCsp_FWD__IsApplicableMatch_Class_Field_TypeGraph_TClass_ClassToTClass_TField() {
		return getFieldNameExisting().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__IsApplicable_checkCsp_FWD__CSP() {
		return getFieldNameExisting().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldNameExisting().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__CheckTypes_FWD__Match() {
		return getFieldNameExisting().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__IsAppropriate_BWD__Match_TypeGraph_TClass_TField_TFieldDefinition_TFieldSignature() {
		return getFieldNameExisting().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__Perform_BWD__IsApplicableMatch() {
		return getFieldNameExisting().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__IsApplicable_BWD__Match() {
		return getFieldNameExisting().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass_TField_TFieldDefinition_TFieldSignature() {
		return getFieldNameExisting().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass_TField_TFieldDefinition_TFieldSignature() {
		return getFieldNameExisting().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__IsAppropriate_checkCsp_BWD__CSP() {
		return getFieldNameExisting().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__IsApplicable_solveCsp_BWD__IsApplicableMatch_Class_TypeGraph_TClass_ClassToTClass_TField_TFieldDefinition_TFieldSignature() {
		return getFieldNameExisting().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__IsApplicable_checkCsp_BWD__CSP() {
		return getFieldNameExisting().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldNameExisting().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__CheckTypes_BWD__Match() {
		return getFieldNameExisting().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__IsAppropriate_FWD_EMoflonEdge_4__EMoflonEdge() {
		return getFieldNameExisting().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__IsAppropriate_BWD_EMoflonEdge_5__EMoflonEdge() {
		return getFieldNameExisting().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__IsAppropriate_BWD_EMoflonEdge_6__EMoflonEdge() {
		return getFieldNameExisting().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__IsAppropriate_BWD_EMoflonEdge_7__EMoflonEdge() {
		return getFieldNameExisting().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__IsAppropriate_BWD_EMoflonEdge_8__EMoflonEdge() {
		return getFieldNameExisting().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__IsAppropriate_BWD_EMoflonEdge_9__EMoflonEdge() {
		return getFieldNameExisting().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__IsAppropriate_BWD_EMoflonEdge_10__EMoflonEdge() {
		return getFieldNameExisting().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__CheckAttributes_FWD__TripleMatch() {
		return getFieldNameExisting().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameExisting__CheckAttributes_BWD__TripleMatch() {
		return getFieldNameExisting().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterTypeLibLink() {
		if (parameterTypeLibLinkEClass == null) {
			parameterTypeLibLinkEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(3);
		}
		return parameterTypeLibLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__IsAppropriate_FWD__Match_ExtendedType_ExtendedParameter() {
		return getParameterTypeLibLink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__Perform_FWD__IsApplicableMatch() {
		return getParameterTypeLibLink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__IsApplicable_FWD__Match() {
		return getParameterTypeLibLink().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__RegisterObjectsToMatch_FWD__Match_ExtendedType_ExtendedParameter() {
		return getParameterTypeLibLink().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__IsAppropriate_solveCsp_FWD__Match_ExtendedType_ExtendedParameter() {
		return getParameterTypeLibLink().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__IsAppropriate_checkCsp_FWD__CSP() {
		return getParameterTypeLibLink().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__IsApplicable_solveCsp_FWD__IsApplicableMatch_TClass_ExtendedType_TypeGraph_ExtendedParameter_TParameter_ExtendedParameterToTParameter_TMethodSignature_TMethod_TParameterList_ExtendedParameterToTypeGraph() {
		return getParameterTypeLibLink().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__IsApplicable_checkCsp_FWD__CSP() {
		return getParameterTypeLibLink().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterTypeLibLink().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__CheckTypes_FWD__Match() {
		return getParameterTypeLibLink().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__IsAppropriate_BWD__Match_TClass_TypeGraph_TParameter_TMethodSignature_TMethod_TParameterList() {
		return getParameterTypeLibLink().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__Perform_BWD__IsApplicableMatch() {
		return getParameterTypeLibLink().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__IsApplicable_BWD__Match() {
		return getParameterTypeLibLink().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__RegisterObjectsToMatch_BWD__Match_TClass_TypeGraph_TParameter_TMethodSignature_TMethod_TParameterList() {
		return getParameterTypeLibLink().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__IsAppropriate_solveCsp_BWD__Match_TClass_TypeGraph_TParameter_TMethodSignature_TMethod_TParameterList() {
		return getParameterTypeLibLink().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__IsAppropriate_checkCsp_BWD__CSP() {
		return getParameterTypeLibLink().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__IsApplicable_solveCsp_BWD__IsApplicableMatch_TClass_TypeGraph_ExtendedParameter_TParameter_ExtendedParameterToTParameter_TMethodSignature_TMethod_TParameterList_ExtendedParameterToTypeGraph() {
		return getParameterTypeLibLink().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__IsApplicable_checkCsp_BWD__CSP() {
		return getParameterTypeLibLink().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterTypeLibLink().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__CheckTypes_BWD__Match() {
		return getParameterTypeLibLink().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__IsAppropriate_FWD_EMoflonEdge_5__EMoflonEdge() {
		return getParameterTypeLibLink().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__IsAppropriate_BWD_EMoflonEdge_11__EMoflonEdge() {
		return getParameterTypeLibLink().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__CheckAttributes_FWD__TripleMatch() {
		return getParameterTypeLibLink().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeLibLink__CheckAttributes_BWD__TripleMatch() {
		return getParameterTypeLibLink().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodDefinitionLinkSignature() {
		if (methodDefinitionLinkSignatureEClass == null) {
			methodDefinitionLinkSignatureEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(4);
		}
		return methodDefinitionLinkSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__IsAppropriate_FWD__Match_ExtendedClassMethod_ExtendedMethodName_ExtendedParameterList_ExtendedJamoppJavaContainer() {
		return getMethodDefinitionLinkSignature().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__Perform_FWD__IsApplicableMatch() {
		return getMethodDefinitionLinkSignature().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__IsApplicable_FWD__Match() {
		return getMethodDefinitionLinkSignature().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__RegisterObjectsToMatch_FWD__Match_ExtendedClassMethod_ExtendedMethodName_ExtendedParameterList_ExtendedJamoppJavaContainer() {
		return getMethodDefinitionLinkSignature().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__IsAppropriate_solveCsp_FWD__Match_ExtendedClassMethod_ExtendedMethodName_ExtendedParameterList_ExtendedJamoppJavaContainer() {
		return getMethodDefinitionLinkSignature().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodDefinitionLinkSignature().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedClassMethod_TMethodSignature_ClassMethodToTMethodSignature_ExtendedMethodName_TMethod_ExtendedMethodNameToTMethod_ExtendedParameterList_ExtendedParameterListToTMethodSignature_ExtendedJamoppJavaContainer() {
		return getMethodDefinitionLinkSignature().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodDefinitionLinkSignature().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodDefinitionLinkSignature().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__CheckTypes_FWD__Match() {
		return getMethodDefinitionLinkSignature().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__IsAppropriate_BWD__Match_TMethodSignature_TMethod() {
		return getMethodDefinitionLinkSignature().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__Perform_BWD__IsApplicableMatch() {
		return getMethodDefinitionLinkSignature().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__IsApplicable_BWD__Match() {
		return getMethodDefinitionLinkSignature().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__RegisterObjectsToMatch_BWD__Match_TMethodSignature_TMethod() {
		return getMethodDefinitionLinkSignature().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__IsAppropriate_solveCsp_BWD__Match_TMethodSignature_TMethod() {
		return getMethodDefinitionLinkSignature().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodDefinitionLinkSignature().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExtendedClassMethod_TMethodSignature_ClassMethodToTMethodSignature_ExtendedMethodName_TMethod_ExtendedMethodNameToTMethod_ExtendedParameterList_ExtendedParameterListToTMethodSignature_ExtendedJamoppJavaContainer() {
		return getMethodDefinitionLinkSignature().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodDefinitionLinkSignature().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodDefinitionLinkSignature().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__CheckTypes_BWD__Match() {
		return getMethodDefinitionLinkSignature().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__IsAppropriate_FWD_EMoflonEdge_6__EMoflonEdge() {
		return getMethodDefinitionLinkSignature().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__IsAppropriate_FWD_EMoflonEdge_7__EMoflonEdge() {
		return getMethodDefinitionLinkSignature().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__IsAppropriate_BWD_EMoflonEdge_12__EMoflonEdge() {
		return getMethodDefinitionLinkSignature().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__IsAppropriate_BWD_EMoflonEdge_13__EMoflonEdge() {
		return getMethodDefinitionLinkSignature().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__IsAppropriate_FWD_EMoflonEdge_8__EMoflonEdge() {
		return getMethodDefinitionLinkSignature().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__CheckAttributes_FWD__TripleMatch() {
		return getMethodDefinitionLinkSignature().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinitionLinkSignature__CheckAttributes_BWD__TripleMatch() {
		return getMethodDefinitionLinkSignature().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodLinkClass() {
		if (methodLinkClassEClass == null) {
			methodLinkClassEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(5);
		}
		return methodLinkClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__IsAppropriate_FWD__Match_ExtendedClassMethod_Class_ExtendedParameterList() {
		return getMethodLinkClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__Perform_FWD__IsApplicableMatch() {
		return getMethodLinkClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__IsApplicable_FWD__Match() {
		return getMethodLinkClass().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__RegisterObjectsToMatch_FWD__Match_ExtendedClassMethod_Class_ExtendedParameterList() {
		return getMethodLinkClass().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__IsAppropriate_solveCsp_FWD__Match_ExtendedClassMethod_Class_ExtendedParameterList() {
		return getMethodLinkClass().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodLinkClass().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__IsApplicable_solveCsp_FWD__IsApplicableMatch_TMethodDefinition_ExtendedClassMethod_TMethodSignature_ClassMethodToTMethodSignature_ClassMethodToTMethodDefinition_Class_TClass_ClassToTClass_ExtendedParameterList_ExtendedParameterListToTMethodSignature() {
		return getMethodLinkClass().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodLinkClass().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodLinkClass().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__CheckTypes_FWD__Match() {
		return getMethodLinkClass().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__IsAppropriate_BWD__Match_TMethodDefinition_TMethodSignature_TClass() {
		return getMethodLinkClass().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__Perform_BWD__IsApplicableMatch() {
		return getMethodLinkClass().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__IsApplicable_BWD__Match() {
		return getMethodLinkClass().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__RegisterObjectsToMatch_BWD__Match_TMethodDefinition_TMethodSignature_TClass() {
		return getMethodLinkClass().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__IsAppropriate_solveCsp_BWD__Match_TMethodDefinition_TMethodSignature_TClass() {
		return getMethodLinkClass().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodLinkClass().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__IsApplicable_solveCsp_BWD__IsApplicableMatch_TMethodDefinition_ExtendedClassMethod_TMethodSignature_ClassMethodToTMethodSignature_ClassMethodToTMethodDefinition_Class_TClass_ClassToTClass_ExtendedParameterList_ExtendedParameterListToTMethodSignature() {
		return getMethodLinkClass().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodLinkClass().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodLinkClass().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__CheckTypes_BWD__Match() {
		return getMethodLinkClass().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__IsAppropriate_FWD_EMoflonEdge_9__EMoflonEdge() {
		return getMethodLinkClass().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__IsAppropriate_BWD_EMoflonEdge_14__EMoflonEdge() {
		return getMethodLinkClass().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__IsAppropriate_BWD_EMoflonEdge_15__EMoflonEdge() {
		return getMethodLinkClass().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__CheckAttributes_FWD__TripleMatch() {
		return getMethodLinkClass().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodLinkClass__CheckAttributes_BWD__TripleMatch() {
		return getMethodLinkClass().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritance() {
		if (inheritanceEClass == null) {
			inheritanceEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(6);
		}
		return inheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__IsAppropriate_FWD__Match_ClassifierReference_Class_Class_NamespaceClassifierReference() {
		return getInheritance().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__Perform_FWD__IsApplicableMatch() {
		return getInheritance().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__IsApplicable_FWD__Match() {
		return getInheritance().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__RegisterObjectsToMatch_FWD__Match_ClassifierReference_Class_Class_NamespaceClassifierReference() {
		return getInheritance().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__IsAppropriate_solveCsp_FWD__Match_ClassifierReference_Class_Class_NamespaceClassifierReference() {
		return getInheritance().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__IsAppropriate_checkCsp_FWD__CSP() {
		return getInheritance().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__IsApplicable_solveCsp_FWD__IsApplicableMatch_ClassifierReference_Class_ClassToTClass_Class_ClassToTClass_NamespaceClassifierReference_TypeGraph_TClass_TClass() {
		return getInheritance().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__IsApplicable_checkCsp_FWD__CSP() {
		return getInheritance().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInheritance().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__CheckTypes_FWD__Match() {
		return getInheritance().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__IsAppropriate_BWD__Match_TypeGraph_TClass_TClass() {
		return getInheritance().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__Perform_BWD__IsApplicableMatch() {
		return getInheritance().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__IsApplicable_BWD__Match() {
		return getInheritance().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass_TClass() {
		return getInheritance().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass_TClass() {
		return getInheritance().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__IsAppropriate_checkCsp_BWD__CSP() {
		return getInheritance().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__IsApplicable_solveCsp_BWD__IsApplicableMatch_Class_ClassToTClass_Class_ClassToTClass_TypeGraph_TClass_TClass() {
		return getInheritance().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__IsApplicable_checkCsp_BWD__CSP() {
		return getInheritance().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInheritance().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__CheckTypes_BWD__Match() {
		return getInheritance().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__IsAppropriate_FWD_EMoflonEdge_10__EMoflonEdge() {
		return getInheritance().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__IsAppropriate_FWD_EMoflonEdge_11__EMoflonEdge() {
		return getInheritance().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__IsAppropriate_FWD_EMoflonEdge_12__EMoflonEdge() {
		return getInheritance().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__IsAppropriate_BWD_EMoflonEdge_16__EMoflonEdge() {
		return getInheritance().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__IsAppropriate_BWD_EMoflonEdge_17__EMoflonEdge() {
		return getInheritance().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__CheckAttributes_FWD__TripleMatch() {
		return getInheritance().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInheritance__CheckAttributes_BWD__TripleMatch() {
		return getInheritance().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterListLinkFirst() {
		if (parameterListLinkFirstEClass == null) {
			parameterListLinkFirstEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(7);
		}
		return parameterListLinkFirstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__IsAppropriate_FWD__Match_ExtendedParameter_ExtendedParameterList() {
		return getParameterListLinkFirst().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__Perform_FWD__IsApplicableMatch() {
		return getParameterListLinkFirst().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__IsApplicable_FWD__Match() {
		return getParameterListLinkFirst().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__RegisterObjectsToMatch_FWD__Match_ExtendedParameter_ExtendedParameterList() {
		return getParameterListLinkFirst().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__IsAppropriate_solveCsp_FWD__Match_ExtendedParameter_ExtendedParameterList() {
		return getParameterListLinkFirst().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__IsAppropriate_checkCsp_FWD__CSP() {
		return getParameterListLinkFirst().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedParameter_ExtendedParameterList_ExtendedParameterListToTParameterList_ExtendedParameterToTParameter_TParameter_TParameterList() {
		return getParameterListLinkFirst().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__IsApplicable_checkCsp_FWD__CSP() {
		return getParameterListLinkFirst().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterListLinkFirst().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__CheckTypes_FWD__Match() {
		return getParameterListLinkFirst().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__IsAppropriate_BWD__Match_TParameter_TParameterList() {
		return getParameterListLinkFirst().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__Perform_BWD__IsApplicableMatch() {
		return getParameterListLinkFirst().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__IsApplicable_BWD__Match() {
		return getParameterListLinkFirst().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__RegisterObjectsToMatch_BWD__Match_TParameter_TParameterList() {
		return getParameterListLinkFirst().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__IsAppropriate_solveCsp_BWD__Match_TParameter_TParameterList() {
		return getParameterListLinkFirst().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__IsAppropriate_checkCsp_BWD__CSP() {
		return getParameterListLinkFirst().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExtendedParameter_ExtendedParameterList_ExtendedParameterListToTParameterList_ExtendedParameterToTParameter_TParameter_TParameterList() {
		return getParameterListLinkFirst().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__IsApplicable_checkCsp_BWD__CSP() {
		return getParameterListLinkFirst().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterListLinkFirst().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__CheckTypes_BWD__Match() {
		return getParameterListLinkFirst().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__IsAppropriate_FWD_EMoflonEdge_13__EMoflonEdge() {
		return getParameterListLinkFirst().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__IsAppropriate_BWD_EMoflonEdge_18__EMoflonEdge() {
		return getParameterListLinkFirst().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__CheckAttributes_FWD__TripleMatch() {
		return getParameterListLinkFirst().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterListLinkFirst__CheckAttributes_BWD__TripleMatch() {
		return getParameterListLinkFirst().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterTypeUserDefined() {
		if (parameterTypeUserDefinedEClass == null) {
			parameterTypeUserDefinedEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(8);
		}
		return parameterTypeUserDefinedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__IsAppropriate_FWD__Match_ExtendedType_ExtendedParameter_Class() {
		return getParameterTypeUserDefined().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__Perform_FWD__IsApplicableMatch() {
		return getParameterTypeUserDefined().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__IsApplicable_FWD__Match() {
		return getParameterTypeUserDefined().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__RegisterObjectsToMatch_FWD__Match_ExtendedType_ExtendedParameter_Class() {
		return getParameterTypeUserDefined().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__IsAppropriate_solveCsp_FWD__Match_ExtendedType_ExtendedParameter_Class() {
		return getParameterTypeUserDefined().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__IsAppropriate_checkCsp_FWD__CSP() {
		return getParameterTypeUserDefined().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__IsApplicable_solveCsp_FWD__IsApplicableMatch_TClass_ExtendedType_ExtendedParameter_TParameter_ExtendedParameterToTParameter_Class_ClassToTClass() {
		return getParameterTypeUserDefined().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__IsApplicable_checkCsp_FWD__CSP() {
		return getParameterTypeUserDefined().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterTypeUserDefined().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__CheckTypes_FWD__Match() {
		return getParameterTypeUserDefined().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__IsAppropriate_BWD__Match_TClass_TParameter() {
		return getParameterTypeUserDefined().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__Perform_BWD__IsApplicableMatch() {
		return getParameterTypeUserDefined().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__IsApplicable_BWD__Match() {
		return getParameterTypeUserDefined().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__RegisterObjectsToMatch_BWD__Match_TClass_TParameter() {
		return getParameterTypeUserDefined().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__IsAppropriate_solveCsp_BWD__Match_TClass_TParameter() {
		return getParameterTypeUserDefined().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__IsAppropriate_checkCsp_BWD__CSP() {
		return getParameterTypeUserDefined().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__IsApplicable_solveCsp_BWD__IsApplicableMatch_TClass_ExtendedParameter_TParameter_ExtendedParameterToTParameter_Class_ClassToTClass() {
		return getParameterTypeUserDefined().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__IsApplicable_checkCsp_BWD__CSP() {
		return getParameterTypeUserDefined().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterTypeUserDefined().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__CheckTypes_BWD__Match() {
		return getParameterTypeUserDefined().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__IsAppropriate_FWD_EMoflonEdge_14__EMoflonEdge() {
		return getParameterTypeUserDefined().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__IsAppropriate_FWD_EMoflonEdge_15__EMoflonEdge() {
		return getParameterTypeUserDefined().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__IsAppropriate_BWD_EMoflonEdge_19__EMoflonEdge() {
		return getParameterTypeUserDefined().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__CheckAttributes_FWD__TripleMatch() {
		return getParameterTypeUserDefined().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeUserDefined__CheckAttributes_BWD__TripleMatch() {
		return getParameterTypeUserDefined().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodSignatureLinkDefinition() {
		if (methodSignatureLinkDefinitionEClass == null) {
			methodSignatureLinkDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(9);
		}
		return methodSignatureLinkDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__IsAppropriate_FWD__Match_ExtendedClassMethod_ExtendedParameterList() {
		return getMethodSignatureLinkDefinition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__Perform_FWD__IsApplicableMatch() {
		return getMethodSignatureLinkDefinition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__IsApplicable_FWD__Match() {
		return getMethodSignatureLinkDefinition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__RegisterObjectsToMatch_FWD__Match_ExtendedClassMethod_ExtendedParameterList() {
		return getMethodSignatureLinkDefinition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__IsAppropriate_solveCsp_FWD__Match_ExtendedClassMethod_ExtendedParameterList() {
		return getMethodSignatureLinkDefinition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodSignatureLinkDefinition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedClassMethod_ExtendedParameterList_TMethodDefinition_ClassMethodToTMethodDefinition_ExtendedParameterListToTParameterList_TMethodSignature_TParameterList() {
		return getMethodSignatureLinkDefinition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodSignatureLinkDefinition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodSignatureLinkDefinition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__CheckTypes_FWD__Match() {
		return getMethodSignatureLinkDefinition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__IsAppropriate_BWD__Match_TMethodDefinition_TMethodSignature_TParameterList() {
		return getMethodSignatureLinkDefinition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__Perform_BWD__IsApplicableMatch() {
		return getMethodSignatureLinkDefinition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__IsApplicable_BWD__Match() {
		return getMethodSignatureLinkDefinition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__RegisterObjectsToMatch_BWD__Match_TMethodDefinition_TMethodSignature_TParameterList() {
		return getMethodSignatureLinkDefinition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__IsAppropriate_solveCsp_BWD__Match_TMethodDefinition_TMethodSignature_TParameterList() {
		return getMethodSignatureLinkDefinition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodSignatureLinkDefinition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExtendedClassMethod_ExtendedParameterList_TMethodDefinition_ClassMethodToTMethodDefinition_ExtendedParameterListToTParameterList_TMethodSignature_TParameterList() {
		return getMethodSignatureLinkDefinition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodSignatureLinkDefinition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodSignatureLinkDefinition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__CheckTypes_BWD__Match() {
		return getMethodSignatureLinkDefinition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__IsAppropriate_FWD_EMoflonEdge_16__EMoflonEdge() {
		return getMethodSignatureLinkDefinition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__IsAppropriate_FWD_EMoflonEdge_17__EMoflonEdge() {
		return getMethodSignatureLinkDefinition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__IsAppropriate_BWD_EMoflonEdge_20__EMoflonEdge() {
		return getMethodSignatureLinkDefinition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__IsAppropriate_BWD_EMoflonEdge_21__EMoflonEdge() {
		return getMethodSignatureLinkDefinition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__CheckAttributes_FWD__TripleMatch() {
		return getMethodSignatureLinkDefinition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureLinkDefinition__CheckAttributes_BWD__TripleMatch() {
		return getMethodSignatureLinkDefinition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterLinkListNext() {
		if (parameterLinkListNextEClass == null) {
			parameterLinkListNextEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(10);
		}
		return parameterLinkListNextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__IsAppropriate_FWD__Match_ExtendedParameter_ExtendedParameter() {
		return getParameterLinkListNext().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__Perform_FWD__IsApplicableMatch() {
		return getParameterLinkListNext().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__IsApplicable_FWD__Match() {
		return getParameterLinkListNext().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__RegisterObjectsToMatch_FWD__Match_ExtendedParameter_ExtendedParameter() {
		return getParameterLinkListNext().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__IsAppropriate_solveCsp_FWD__Match_ExtendedParameter_ExtendedParameter() {
		return getParameterLinkListNext().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__IsAppropriate_checkCsp_FWD__CSP() {
		return getParameterLinkListNext().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedParameter_ExtendedParameter_ExtendedParameterToTParameter_ExtendedParameterToTParameter_TParameter_TParameter() {
		return getParameterLinkListNext().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__IsApplicable_checkCsp_FWD__CSP() {
		return getParameterLinkListNext().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterLinkListNext().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__CheckTypes_FWD__Match() {
		return getParameterLinkListNext().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__IsAppropriate_BWD__Match_TParameter_TParameter() {
		return getParameterLinkListNext().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__Perform_BWD__IsApplicableMatch() {
		return getParameterLinkListNext().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__IsApplicable_BWD__Match() {
		return getParameterLinkListNext().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__RegisterObjectsToMatch_BWD__Match_TParameter_TParameter() {
		return getParameterLinkListNext().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__IsAppropriate_solveCsp_BWD__Match_TParameter_TParameter() {
		return getParameterLinkListNext().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__IsAppropriate_checkCsp_BWD__CSP() {
		return getParameterLinkListNext().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExtendedParameter_ExtendedParameter_ExtendedParameterToTParameter_ExtendedParameterToTParameter_TParameter_TParameter() {
		return getParameterLinkListNext().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__IsApplicable_checkCsp_BWD__CSP() {
		return getParameterLinkListNext().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterLinkListNext().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__CheckTypes_BWD__Match() {
		return getParameterLinkListNext().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__IsAppropriate_FWD_EMoflonEdge_18__EMoflonEdge() {
		return getParameterLinkListNext().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__IsAppropriate_FWD_EMoflonEdge_19__EMoflonEdge() {
		return getParameterLinkListNext().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__IsAppropriate_BWD_EMoflonEdge_22__EMoflonEdge() {
		return getParameterLinkListNext().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__IsAppropriate_BWD_EMoflonEdge_23__EMoflonEdge() {
		return getParameterLinkListNext().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__CheckAttributes_FWD__TripleMatch() {
		return getParameterLinkListNext().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterLinkListNext__CheckAttributes_BWD__TripleMatch() {
		return getParameterLinkListNext().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldNameCreate() {
		if (fieldNameCreateEClass == null) {
			fieldNameCreateEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(11);
		}
		return fieldNameCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__IsAppropriate_FWD__Match_Class_Field() {
		return getFieldNameCreate().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__Perform_FWD__IsApplicableMatch() {
		return getFieldNameCreate().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__IsApplicable_FWD__Match() {
		return getFieldNameCreate().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__RegisterObjectsToMatch_FWD__Match_Class_Field() {
		return getFieldNameCreate().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__IsAppropriate_solveCsp_FWD__Match_Class_Field() {
		return getFieldNameCreate().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__IsAppropriate_checkCsp_FWD__CSP() {
		return getFieldNameCreate().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__IsApplicable_solveCsp_FWD__IsApplicableMatch_Class_TClass_Field_TypeGraph_ClassToTClass() {
		return getFieldNameCreate().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__IsApplicable_checkCsp_FWD__CSP() {
		return getFieldNameCreate().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldNameCreate().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__CheckTypes_FWD__Match() {
		return getFieldNameCreate().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__IsAppropriate_BWD__Match_TFieldSignature_TFieldDefinition_TClass_TypeGraph_TField() {
		return getFieldNameCreate().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__Perform_BWD__IsApplicableMatch() {
		return getFieldNameCreate().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__IsApplicable_BWD__Match() {
		return getFieldNameCreate().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__RegisterObjectsToMatch_BWD__Match_TFieldSignature_TFieldDefinition_TClass_TypeGraph_TField() {
		return getFieldNameCreate().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__IsAppropriate_solveCsp_BWD__Match_TFieldSignature_TFieldDefinition_TClass_TypeGraph_TField() {
		return getFieldNameCreate().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__IsAppropriate_checkCsp_BWD__CSP() {
		return getFieldNameCreate().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__IsApplicable_solveCsp_BWD__IsApplicableMatch_TFieldSignature_TFieldDefinition_Class_TClass_TypeGraph_TField_ClassToTClass() {
		return getFieldNameCreate().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__IsApplicable_checkCsp_BWD__CSP() {
		return getFieldNameCreate().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldNameCreate().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__CheckTypes_BWD__Match() {
		return getFieldNameCreate().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__IsAppropriate_BWD_EMoflonEdge_24__EMoflonEdge() {
		return getFieldNameCreate().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__IsAppropriate_BWD_EMoflonEdge_25__EMoflonEdge() {
		return getFieldNameCreate().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__IsAppropriate_BWD_EMoflonEdge_26__EMoflonEdge() {
		return getFieldNameCreate().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__IsAppropriate_BWD_EMoflonEdge_27__EMoflonEdge() {
		return getFieldNameCreate().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__IsAppropriate_FWD_EMoflonEdge_20__EMoflonEdge() {
		return getFieldNameCreate().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__IsAppropriate_BWD_EMoflonEdge_28__EMoflonEdge() {
		return getFieldNameCreate().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__IsAppropriate_BWD_EMoflonEdge_29__EMoflonEdge() {
		return getFieldNameCreate().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__IsAppropriate_BWD_EMoflonEdge_30__EMoflonEdge() {
		return getFieldNameCreate().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__CheckAttributes_FWD__TripleMatch() {
		return getFieldNameCreate().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldNameCreate__CheckAttributes_BWD__TripleMatch() {
		return getFieldNameCreate().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodNameCreate() {
		if (methodNameCreateEClass == null) {
			methodNameCreateEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(12);
		}
		return methodNameCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__IsAppropriate_FWD__Match_ExtendedMethodName_ExtendedJamoppJavaContainer() {
		return getMethodNameCreate().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__Perform_FWD__IsApplicableMatch() {
		return getMethodNameCreate().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__IsApplicable_FWD__Match() {
		return getMethodNameCreate().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__RegisterObjectsToMatch_FWD__Match_ExtendedMethodName_ExtendedJamoppJavaContainer() {
		return getMethodNameCreate().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__IsAppropriate_solveCsp_FWD__Match_ExtendedMethodName_ExtendedJamoppJavaContainer() {
		return getMethodNameCreate().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodNameCreate().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedMethodName_TypeGraph_ExtendedJamoppJavaContainer_ExtendedJamoppJavaContainerToTypeGraph() {
		return getMethodNameCreate().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodNameCreate().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodNameCreate().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__CheckTypes_FWD__Match() {
		return getMethodNameCreate().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__IsAppropriate_BWD__Match_TMethod_TypeGraph() {
		return getMethodNameCreate().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__Perform_BWD__IsApplicableMatch() {
		return getMethodNameCreate().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__IsApplicable_BWD__Match() {
		return getMethodNameCreate().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__RegisterObjectsToMatch_BWD__Match_TMethod_TypeGraph() {
		return getMethodNameCreate().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__IsAppropriate_solveCsp_BWD__Match_TMethod_TypeGraph() {
		return getMethodNameCreate().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodNameCreate().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__IsApplicable_solveCsp_BWD__IsApplicableMatch_TMethod_TypeGraph_ExtendedJamoppJavaContainer_ExtendedJamoppJavaContainerToTypeGraph() {
		return getMethodNameCreate().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodNameCreate().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodNameCreate().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__CheckTypes_BWD__Match() {
		return getMethodNameCreate().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__IsAppropriate_BWD_EMoflonEdge_31__EMoflonEdge() {
		return getMethodNameCreate().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__IsAppropriate_FWD_EMoflonEdge_21__EMoflonEdge() {
		return getMethodNameCreate().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__CheckAttributes_FWD__TripleMatch() {
		return getMethodNameCreate().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodNameCreate__CheckAttributes_BWD__TripleMatch() {
		return getMethodNameCreate().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass1() {
		if (class1EClass == null) {
			class1EClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(13);
		}
		return class1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_FWD__Match_ExtendedClassMethod() {
		return getClass1().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__Perform_FWD__IsApplicableMatch() {
		return getClass1().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsApplicable_FWD__Match() {
		return getClass1().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__RegisterObjectsToMatch_FWD__Match_ExtendedClassMethod() {
		return getClass1().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_solveCsp_FWD__Match_ExtendedClassMethod() {
		return getClass1().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_checkCsp_FWD__CSP() {
		return getClass1().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedClassMethod() {
		return getClass1().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsApplicable_checkCsp_FWD__CSP() {
		return getClass1().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getClass1().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__CheckTypes_FWD__Match() {
		return getClass1().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_BWD__Match_TMethodDefinition() {
		return getClass1().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__Perform_BWD__IsApplicableMatch() {
		return getClass1().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsApplicable_BWD__Match() {
		return getClass1().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__RegisterObjectsToMatch_BWD__Match_TMethodDefinition() {
		return getClass1().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_solveCsp_BWD__Match_TMethodDefinition() {
		return getClass1().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_checkCsp_BWD__CSP() {
		return getClass1().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsApplicable_solveCsp_BWD__IsApplicableMatch_TMethodDefinition() {
		return getClass1().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsApplicable_checkCsp_BWD__CSP() {
		return getClass1().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getClass1().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__CheckTypes_BWD__Match() {
		return getClass1().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_FWD_ExtendedClassMethod_0__ExtendedClassMethod() {
		return getClass1().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_BWD_TMethodDefinition_0__TMethodDefinition() {
		return getClass1().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__CheckAttributes_FWD__TripleMatch() {
		return getClass1().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__CheckAttributes_BWD__TripleMatch() {
		return getClass1().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodSignatureCreate() {
		if (methodSignatureCreateEClass == null) {
			methodSignatureCreateEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(14);
		}
		return methodSignatureCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__IsAppropriate_FWD__Match_ExtendedParameterList() {
		return getMethodSignatureCreate().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__Perform_FWD__IsApplicableMatch() {
		return getMethodSignatureCreate().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__IsApplicable_FWD__Match() {
		return getMethodSignatureCreate().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__RegisterObjectsToMatch_FWD__Match_ExtendedParameterList() {
		return getMethodSignatureCreate().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__IsAppropriate_solveCsp_FWD__Match_ExtendedParameterList() {
		return getMethodSignatureCreate().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodSignatureCreate().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedParameterList() {
		return getMethodSignatureCreate().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodSignatureCreate().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject() {
		return getMethodSignatureCreate().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__CheckTypes_FWD__Match() {
		return getMethodSignatureCreate().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__IsAppropriate_BWD__Match_TMethodSignature_TParameterList() {
		return getMethodSignatureCreate().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__Perform_BWD__IsApplicableMatch() {
		return getMethodSignatureCreate().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__IsApplicable_BWD__Match() {
		return getMethodSignatureCreate().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__RegisterObjectsToMatch_BWD__Match_TMethodSignature_TParameterList() {
		return getMethodSignatureCreate().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__IsAppropriate_solveCsp_BWD__Match_TMethodSignature_TParameterList() {
		return getMethodSignatureCreate().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodSignatureCreate().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__IsApplicable_solveCsp_BWD__IsApplicableMatch_TMethodSignature_TParameterList() {
		return getMethodSignatureCreate().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodSignatureCreate().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject() {
		return getMethodSignatureCreate().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__CheckTypes_BWD__Match() {
		return getMethodSignatureCreate().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__IsAppropriate_FWD_ExtendedParameterList_0__ExtendedParameterList() {
		return getMethodSignatureCreate().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__IsAppropriate_BWD_EMoflonEdge_32__EMoflonEdge() {
		return getMethodSignatureCreate().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__CheckAttributes_FWD__TripleMatch() {
		return getMethodSignatureCreate().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignatureCreate__CheckAttributes_BWD__TripleMatch() {
		return getMethodSignatureCreate().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageRoot() {
		if (packageRootEClass == null) {
			packageRootEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(15);
		}
		return packageRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__IsAppropriate_FWD__Match_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement() {
		return getPackageRoot().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__Perform_FWD__IsApplicableMatch() {
		return getPackageRoot().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__IsApplicable_FWD__Match() {
		return getPackageRoot().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__RegisterObjectsToMatch_FWD__Match_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement() {
		return getPackageRoot().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__IsAppropriate_solveCsp_FWD__Match_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement() {
		return getPackageRoot().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__IsAppropriate_checkCsp_FWD__CSP() {
		return getPackageRoot().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement_TypeGraph_ExtendedJamoppJavaContainerToTypeGraph() {
		return getPackageRoot().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__IsApplicable_checkCsp_FWD__CSP() {
		return getPackageRoot().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPackageRoot().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__CheckTypes_FWD__Match() {
		return getPackageRoot().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__IsAppropriate_BWD__Match_TPackage_TypeGraph() {
		return getPackageRoot().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__Perform_BWD__IsApplicableMatch() {
		return getPackageRoot().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__IsApplicable_BWD__Match() {
		return getPackageRoot().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__RegisterObjectsToMatch_BWD__Match_TPackage_TypeGraph() {
		return getPackageRoot().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__IsAppropriate_solveCsp_BWD__Match_TPackage_TypeGraph() {
		return getPackageRoot().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__IsAppropriate_checkCsp_BWD__CSP() {
		return getPackageRoot().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExtendedJamoppJavaContainer_TPackage_TypeGraph_ExtendedJamoppJavaContainerToTypeGraph() {
		return getPackageRoot().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__IsApplicable_checkCsp_BWD__CSP() {
		return getPackageRoot().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPackageRoot().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__CheckTypes_BWD__Match() {
		return getPackageRoot().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__IsAppropriate_FWD_EMoflonEdge_22__EMoflonEdge() {
		return getPackageRoot().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__IsAppropriate_FWD_EMoflonEdge_23__EMoflonEdge() {
		return getPackageRoot().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__IsAppropriate_BWD_EMoflonEdge_33__EMoflonEdge() {
		return getPackageRoot().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__CheckAttributes_FWD__TripleMatch() {
		return getPackageRoot().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageRoot__CheckAttributes_BWD__TripleMatch() {
		return getPackageRoot().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageChild() {
		if (packageChildEClass == null) {
			packageChildEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(16);
		}
		return packageChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__IsAppropriate_FWD__Match_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement_ExtendedJamoppPackageElement() {
		return getPackageChild().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__Perform_FWD__IsApplicableMatch() {
		return getPackageChild().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__IsApplicable_FWD__Match() {
		return getPackageChild().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__RegisterObjectsToMatch_FWD__Match_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement_ExtendedJamoppPackageElement() {
		return getPackageChild().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__IsAppropriate_solveCsp_FWD__Match_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement_ExtendedJamoppPackageElement() {
		return getPackageChild().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__IsAppropriate_checkCsp_FWD__CSP() {
		return getPackageChild().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement_ExtendedJamoppPackageElement_TPackage_ExtendedJamoppPackageElementToTPackage() {
		return getPackageChild().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__IsApplicable_checkCsp_FWD__CSP() {
		return getPackageChild().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPackageChild().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__CheckTypes_FWD__Match() {
		return getPackageChild().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__IsAppropriate_BWD__Match_TPackage_TPackage() {
		return getPackageChild().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__Perform_BWD__IsApplicableMatch() {
		return getPackageChild().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__IsApplicable_BWD__Match() {
		return getPackageChild().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__RegisterObjectsToMatch_BWD__Match_TPackage_TPackage() {
		return getPackageChild().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__IsAppropriate_solveCsp_BWD__Match_TPackage_TPackage() {
		return getPackageChild().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__IsAppropriate_checkCsp_BWD__CSP() {
		return getPackageChild().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExtendedJamoppJavaContainer_ExtendedJamoppPackageElement_TPackage_ExtendedJamoppPackageElementToTPackage_TPackage() {
		return getPackageChild().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__IsApplicable_checkCsp_BWD__CSP() {
		return getPackageChild().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPackageChild().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__CheckTypes_BWD__Match() {
		return getPackageChild().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__IsAppropriate_FWD_EMoflonEdge_24__EMoflonEdge() {
		return getPackageChild().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__IsAppropriate_FWD_EMoflonEdge_25__EMoflonEdge() {
		return getPackageChild().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__IsAppropriate_FWD_EMoflonEdge_26__EMoflonEdge() {
		return getPackageChild().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__IsAppropriate_BWD_EMoflonEdge_34__EMoflonEdge() {
		return getPackageChild().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__IsAppropriate_BWD_EMoflonEdge_35__EMoflonEdge() {
		return getPackageChild().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__CheckAttributes_FWD__TripleMatch() {
		return getPackageChild().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageChild__CheckAttributes_BWD__TripleMatch() {
		return getPackageChild().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramGraphCreate() {
		if (programGraphCreateEClass == null) {
			programGraphCreateEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(17);
		}
		return programGraphCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__IsAppropriate_FWD__Match_ExtendedJamoppJavaContainer() {
		return getProgramGraphCreate().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__Perform_FWD__IsApplicableMatch() {
		return getProgramGraphCreate().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__IsApplicable_FWD__Match() {
		return getProgramGraphCreate().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__RegisterObjectsToMatch_FWD__Match_ExtendedJamoppJavaContainer() {
		return getProgramGraphCreate().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__IsAppropriate_solveCsp_FWD__Match_ExtendedJamoppJavaContainer() {
		return getProgramGraphCreate().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__IsAppropriate_checkCsp_FWD__CSP() {
		return getProgramGraphCreate().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedJamoppJavaContainer() {
		return getProgramGraphCreate().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__IsApplicable_checkCsp_FWD__CSP() {
		return getProgramGraphCreate().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getProgramGraphCreate().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__CheckTypes_FWD__Match() {
		return getProgramGraphCreate().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__IsAppropriate_BWD__Match_TypeGraph() {
		return getProgramGraphCreate().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__Perform_BWD__IsApplicableMatch() {
		return getProgramGraphCreate().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__IsApplicable_BWD__Match() {
		return getProgramGraphCreate().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__RegisterObjectsToMatch_BWD__Match_TypeGraph() {
		return getProgramGraphCreate().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__IsAppropriate_solveCsp_BWD__Match_TypeGraph() {
		return getProgramGraphCreate().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__IsAppropriate_checkCsp_BWD__CSP() {
		return getProgramGraphCreate().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeGraph() {
		return getProgramGraphCreate().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__IsApplicable_checkCsp_BWD__CSP() {
		return getProgramGraphCreate().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getProgramGraphCreate().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__CheckTypes_BWD__Match() {
		return getProgramGraphCreate().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__IsAppropriate_FWD_ExtendedJamoppJavaContainer_0__ExtendedJamoppJavaContainer() {
		return getProgramGraphCreate().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__IsAppropriate_BWD_TypeGraph_0__TypeGraph() {
		return getProgramGraphCreate().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__CheckAttributes_FWD__TripleMatch() {
		return getProgramGraphCreate().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgramGraphCreate__CheckAttributes_BWD__TripleMatch() {
		return getProgramGraphCreate().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnTypeUserDefined() {
		if (returnTypeUserDefinedEClass == null) {
			returnTypeUserDefinedEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(18);
		}
		return returnTypeUserDefinedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__IsAppropriate_FWD__Match_ExtendedMethodName_ExtendedClassMethod_ExtendedType_Class_ExtendedParameterList() {
		return getReturnTypeUserDefined().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__Perform_FWD__IsApplicableMatch() {
		return getReturnTypeUserDefined().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__IsApplicable_FWD__Match() {
		return getReturnTypeUserDefined().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__RegisterObjectsToMatch_FWD__Match_ExtendedMethodName_ExtendedClassMethod_ExtendedType_Class_ExtendedParameterList() {
		return getReturnTypeUserDefined().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__IsAppropriate_solveCsp_FWD__Match_ExtendedMethodName_ExtendedClassMethod_ExtendedType_Class_ExtendedParameterList() {
		return getReturnTypeUserDefined().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__IsAppropriate_checkCsp_FWD__CSP() {
		return getReturnTypeUserDefined().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedMethodName_TMethodDefinition_ExtendedClassMethod_ClassMethodToTMethodDefinition_ExtendedType_Class_TClass_ClassToTClass_ExtendedParameterList() {
		return getReturnTypeUserDefined().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__IsApplicable_checkCsp_FWD__CSP() {
		return getReturnTypeUserDefined().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getReturnTypeUserDefined().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__CheckTypes_FWD__Match() {
		return getReturnTypeUserDefined().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__IsAppropriate_BWD__Match_TMethodDefinition_TClass() {
		return getReturnTypeUserDefined().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__Perform_BWD__IsApplicableMatch() {
		return getReturnTypeUserDefined().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__IsApplicable_BWD__Match() {
		return getReturnTypeUserDefined().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__RegisterObjectsToMatch_BWD__Match_TMethodDefinition_TClass() {
		return getReturnTypeUserDefined().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__IsAppropriate_solveCsp_BWD__Match_TMethodDefinition_TClass() {
		return getReturnTypeUserDefined().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__IsAppropriate_checkCsp_BWD__CSP() {
		return getReturnTypeUserDefined().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExtendedMethodName_TMethodDefinition_ExtendedClassMethod_ClassMethodToTMethodDefinition_Class_TClass_ClassToTClass_ExtendedParameterList() {
		return getReturnTypeUserDefined().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__IsApplicable_checkCsp_BWD__CSP() {
		return getReturnTypeUserDefined().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getReturnTypeUserDefined().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__CheckTypes_BWD__Match() {
		return getReturnTypeUserDefined().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__IsAppropriate_BWD_EMoflonEdge_36__EMoflonEdge() {
		return getReturnTypeUserDefined().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__IsAppropriate_FWD_EMoflonEdge_27__EMoflonEdge() {
		return getReturnTypeUserDefined().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__IsAppropriate_FWD_EMoflonEdge_28__EMoflonEdge() {
		return getReturnTypeUserDefined().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__CheckAttributes_FWD__TripleMatch() {
		return getReturnTypeUserDefined().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeUserDefined__CheckAttributes_BWD__TripleMatch() {
		return getReturnTypeUserDefined().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnTypeFromLibCreate() {
		if (returnTypeFromLibCreateEClass == null) {
			returnTypeFromLibCreateEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(19);
		}
		return returnTypeFromLibCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__IsAppropriate_FWD__Match_Class_ExtendedType_ExtendedClassMethod() {
		return getReturnTypeFromLibCreate().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__Perform_FWD__IsApplicableMatch() {
		return getReturnTypeFromLibCreate().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__IsApplicable_FWD__Match() {
		return getReturnTypeFromLibCreate().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__RegisterObjectsToMatch_FWD__Match_Class_ExtendedType_ExtendedClassMethod() {
		return getReturnTypeFromLibCreate().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__IsAppropriate_solveCsp_FWD__Match_Class_ExtendedType_ExtendedClassMethod() {
		return getReturnTypeFromLibCreate().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__IsAppropriate_checkCsp_FWD__CSP() {
		return getReturnTypeFromLibCreate().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__IsApplicable_solveCsp_FWD__IsApplicableMatch_Class_TClass_ClassToTClass_ExtendedType_TMethodDefinition_ExtendedClassMethod_ClassMethodToTMethodDefinition_TypeGraph() {
		return getReturnTypeFromLibCreate().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__IsApplicable_checkCsp_FWD__CSP() {
		return getReturnTypeFromLibCreate().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getReturnTypeFromLibCreate().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__CheckTypes_FWD__Match() {
		return getReturnTypeFromLibCreate().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__IsAppropriate_BWD__Match_TClass_TClass_TMethodDefinition_TypeGraph() {
		return getReturnTypeFromLibCreate().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__Perform_BWD__IsApplicableMatch() {
		return getReturnTypeFromLibCreate().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__IsApplicable_BWD__Match() {
		return getReturnTypeFromLibCreate().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__RegisterObjectsToMatch_BWD__Match_TClass_TClass_TMethodDefinition_TypeGraph() {
		return getReturnTypeFromLibCreate().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__IsAppropriate_solveCsp_BWD__Match_TClass_TClass_TMethodDefinition_TypeGraph() {
		return getReturnTypeFromLibCreate().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__IsAppropriate_checkCsp_BWD__CSP() {
		return getReturnTypeFromLibCreate().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__IsApplicable_solveCsp_BWD__IsApplicableMatch_Class_TClass_ClassToTClass_TClass_TMethodDefinition_ExtendedClassMethod_ClassMethodToTMethodDefinition_TypeGraph() {
		return getReturnTypeFromLibCreate().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__IsApplicable_checkCsp_BWD__CSP() {
		return getReturnTypeFromLibCreate().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getReturnTypeFromLibCreate().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__CheckTypes_BWD__Match() {
		return getReturnTypeFromLibCreate().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__IsAppropriate_BWD_EMoflonEdge_37__EMoflonEdge() {
		return getReturnTypeFromLibCreate().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__IsAppropriate_FWD_EMoflonEdge_29__EMoflonEdge() {
		return getReturnTypeFromLibCreate().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__IsAppropriate_BWD_EMoflonEdge_38__EMoflonEdge() {
		return getReturnTypeFromLibCreate().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__CheckAttributes_FWD__TripleMatch() {
		return getReturnTypeFromLibCreate().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibCreate__CheckAttributes_BWD__TripleMatch() {
		return getReturnTypeFromLibCreate().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnTypeFromLibLink() {
		if (returnTypeFromLibLinkEClass == null) {
			returnTypeFromLibLinkEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(20);
		}
		return returnTypeFromLibLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__IsAppropriate_FWD__Match_Class_ExtendedType_ExtendedClassMethod() {
		return getReturnTypeFromLibLink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__Perform_FWD__IsApplicableMatch() {
		return getReturnTypeFromLibLink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__IsApplicable_FWD__Match() {
		return getReturnTypeFromLibLink().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__RegisterObjectsToMatch_FWD__Match_Class_ExtendedType_ExtendedClassMethod() {
		return getReturnTypeFromLibLink().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__IsAppropriate_solveCsp_FWD__Match_Class_ExtendedType_ExtendedClassMethod() {
		return getReturnTypeFromLibLink().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__IsAppropriate_checkCsp_FWD__CSP() {
		return getReturnTypeFromLibLink().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__IsApplicable_solveCsp_FWD__IsApplicableMatch_Class_TClass_ClassToTClass_TypeGraph_TClass_ExtendedType_TMethodDefinition_ExtendedClassMethod_ClassMethodToTMethodDefinition() {
		return getReturnTypeFromLibLink().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__IsApplicable_checkCsp_FWD__CSP() {
		return getReturnTypeFromLibLink().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getReturnTypeFromLibLink().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__CheckTypes_FWD__Match() {
		return getReturnTypeFromLibLink().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__IsAppropriate_BWD__Match_TClass_TypeGraph_TClass_TMethodDefinition() {
		return getReturnTypeFromLibLink().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__Perform_BWD__IsApplicableMatch() {
		return getReturnTypeFromLibLink().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__IsApplicable_BWD__Match() {
		return getReturnTypeFromLibLink().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__RegisterObjectsToMatch_BWD__Match_TClass_TypeGraph_TClass_TMethodDefinition() {
		return getReturnTypeFromLibLink().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__IsAppropriate_solveCsp_BWD__Match_TClass_TypeGraph_TClass_TMethodDefinition() {
		return getReturnTypeFromLibLink().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__IsAppropriate_checkCsp_BWD__CSP() {
		return getReturnTypeFromLibLink().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__IsApplicable_solveCsp_BWD__IsApplicableMatch_Class_TClass_ClassToTClass_TypeGraph_TClass_TMethodDefinition_ExtendedClassMethod_ClassMethodToTMethodDefinition() {
		return getReturnTypeFromLibLink().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__IsApplicable_checkCsp_BWD__CSP() {
		return getReturnTypeFromLibLink().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getReturnTypeFromLibLink().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__CheckTypes_BWD__Match() {
		return getReturnTypeFromLibLink().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__IsAppropriate_BWD_EMoflonEdge_39__EMoflonEdge() {
		return getReturnTypeFromLibLink().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__IsAppropriate_FWD_EMoflonEdge_30__EMoflonEdge() {
		return getReturnTypeFromLibLink().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__CheckAttributes_FWD__TripleMatch() {
		return getReturnTypeFromLibLink().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnTypeFromLibLink__CheckAttributes_BWD__TripleMatch() {
		return getReturnTypeFromLibLink().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterCreateNew() {
		if (parameterCreateNewEClass == null) {
			parameterCreateNewEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(21);
		}
		return parameterCreateNewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__IsAppropriate_FWD__Match_ExtendedJamoppJavaContainer_ExtendedMethodName_ExtendedParameter_ExtendedParameterList() {
		return getParameterCreateNew().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__Perform_FWD__IsApplicableMatch() {
		return getParameterCreateNew().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__IsApplicable_FWD__Match() {
		return getParameterCreateNew().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__RegisterObjectsToMatch_FWD__Match_ExtendedJamoppJavaContainer_ExtendedMethodName_ExtendedParameter_ExtendedParameterList() {
		return getParameterCreateNew().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__IsAppropriate_solveCsp_FWD__Match_ExtendedJamoppJavaContainer_ExtendedMethodName_ExtendedParameter_ExtendedParameterList() {
		return getParameterCreateNew().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__IsAppropriate_checkCsp_FWD__CSP() {
		return getParameterCreateNew().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExtendedJamoppJavaContainer_TypeGraph_ExtendedJamoppJavaContainerToTypeGraph_TMethodSignature_ExtendedParameterListToTMethodSignature_ExtendedMethodName_TMethod_ExtendedParameter_TParameterList_ExtendedParameterList_ExtendedParameterListToTParameterList_ExtendedMethodNameToTMethod() {
		return getParameterCreateNew().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__IsApplicable_checkCsp_FWD__CSP() {
		return getParameterCreateNew().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterCreateNew().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__CheckTypes_FWD__Match() {
		return getParameterCreateNew().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__IsAppropriate_BWD__Match_TypeGraph_TMethodSignature_TMethod_TParameter_TParameterList() {
		return getParameterCreateNew().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__Perform_BWD__IsApplicableMatch() {
		return getParameterCreateNew().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__IsApplicable_BWD__Match() {
		return getParameterCreateNew().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__RegisterObjectsToMatch_BWD__Match_TypeGraph_TMethodSignature_TMethod_TParameter_TParameterList() {
		return getParameterCreateNew().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TMethodSignature_TMethod_TParameter_TParameterList() {
		return getParameterCreateNew().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__IsAppropriate_checkCsp_BWD__CSP() {
		return getParameterCreateNew().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExtendedJamoppJavaContainer_TypeGraph_ExtendedJamoppJavaContainerToTypeGraph_TMethodSignature_ExtendedParameterListToTMethodSignature_ExtendedMethodName_TMethod_TParameter_TParameterList_ExtendedParameterList_ExtendedParameterListToTParameterList_ExtendedMethodNameToTMethod() {
		return getParameterCreateNew().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__IsApplicable_checkCsp_BWD__CSP() {
		return getParameterCreateNew().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterCreateNew().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__CheckTypes_BWD__Match() {
		return getParameterCreateNew().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__IsAppropriate_BWD_EMoflonEdge_40__EMoflonEdge() {
		return getParameterCreateNew().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__IsAppropriate_FWD_EMoflonEdge_31__EMoflonEdge() {
		return getParameterCreateNew().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__CheckAttributes_FWD__TripleMatch() {
		return getParameterCreateNew().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterCreateNew__CheckAttributes_BWD__TripleMatch() {
		return getParameterCreateNew().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactory getRulesFactory() {
		return (RulesFactory) getEFactoryInstance();
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
			eClassifier.setInstanceClassName("GravityTGG.Rules."
					+ eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //RulesPackageImpl
