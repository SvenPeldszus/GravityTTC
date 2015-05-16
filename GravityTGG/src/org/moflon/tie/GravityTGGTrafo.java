package org.moflon.tie;

import java.io.IOException;
import org.moflon.core.utilities.eMoflonEMFUtil;
import org.moflon.ide.debug.DebugSynchronizationHelper;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.JavaPackage;

import GravityTGG.GravityTGGPackage;


public class GravityTGGTrafo extends DebugSynchronizationHelper {

	public GravityTGGTrafo() throws IOException {
		// Register packages
		eMoflonEMFUtil.init(GravityTGGPackage.eINSTANCE);

                
        // Load rules and set correspondence
		setCorrPackage(GravityTGGPackage.eINSTANCE);
		loadRulesFromProject("..");
	}

	public GravityTGGTrafo(String path) throws IOException {
		// Register packages
		eMoflonEMFUtil.init(GravityTGGPackage.eINSTANCE);
		eMoflonEMFUtil.init(JavaPackage.eINSTANCE);

		// Load rules and set correspondence
		setCorrPackage(GravityTGGPackage.eINSTANCE);
		loadRulesFromProject(path);
	}

	public void performForward(EObject srcModel) {
		setSrc(srcModel);
		integrateForward();
	}
}