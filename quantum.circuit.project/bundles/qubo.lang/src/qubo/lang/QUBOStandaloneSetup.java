/*
 * generated by Xtext 2.26.0
 */
package qubo.lang;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class QUBOStandaloneSetup extends QUBOStandaloneSetupGenerated {

	public static void doSetup() {
		new QUBOStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
