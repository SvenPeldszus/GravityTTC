package org.moflon.tie;

import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.moflon.util.eMoflonEMFUtil;
import org.moflon.ide.debug.DebugSynchronizationHelper;

import org.moflon.tgg.algorithm.modelgenerator.ModelGenerator;
import org.moflon.tgg.algorithm.modelgenerator.controller.*;

import GravityTGG.GravityTGGPackage;


public class GravityTGGModelGen extends DebugSynchronizationHelper {

	public GravityTGGModelGen() throws IOException {
		// Register packages
		eMoflonEMFUtil.init(GravityTGGPackage.eINSTANCE);

                
        // Load rules and set correspondence
		setCorrPackage(GravityTGGPackage.eINSTANCE);
		loadRulesFromProject("..");
	}
	
	public static void main(String[] args) throws IOException {
		// Set up logging
		BasicConfigurator.configure();

		AbstractModelGenerationController controller = new DefaultModelGenController();
		controller.addContinuationController(new MaxRulePerformCounterController(20));
      	controller.addContinuationController(new TimeoutController(5000));
      	controller.setRuleSelector(new LimitedRandomRuleSelector().addRuleLimit("<enter rule name>", 1));

		ModelGenerator gen = new ModelGenerator(GravityTGGPackage.eINSTANCE, controller);
		gen.generate();
	}
}