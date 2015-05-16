/**
 */
package GravityTGG.Postprocessing;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see GravityTGG.Postprocessing.PostprocessingPackage
 * @generated
 */
public interface PostprocessingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PostprocessingFactory eINSTANCE = GravityTGG.Postprocessing.impl.PostprocessingFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Member Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member Correspondence</em>'.
	 * @generated
	 */
	MemberCorrespondence createMemberCorrespondence();

	/**
	 * Returns a new object of class '<em>TGG Postprocessing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TGG Postprocessing</em>'.
	 * @generated
	 */
	TGGPostprocessing createTGGPostprocessing();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PostprocessingPackage getPostprocessingPackage();

} //PostprocessingFactory
