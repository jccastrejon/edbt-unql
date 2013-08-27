
package fr.imag;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class UnqlStandaloneSetup extends UnqlStandaloneSetupGenerated{

	public static void doSetup() {
		new UnqlStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

