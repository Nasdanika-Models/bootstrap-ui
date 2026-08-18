import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.ui.bootstrap.capability.BootstrapEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.ui.bootstrap {
	
	exports org.nasdanika.models.ui.bootstrap;
	exports org.nasdanika.models.ui.bootstrap.impl;
	exports org.nasdanika.models.ui.bootstrap.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.ui;
		
	provides CapabilityFactory with 
		BootstrapEPackageResourceSetCapabilityFactory;
	
}