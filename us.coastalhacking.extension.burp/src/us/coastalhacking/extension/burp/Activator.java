/**
 * 
 */
package us.coastalhacking.extension.burp;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * @author jonpasski
 *
 */
public class Activator implements BundleActivator {

	/* (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
        System.out.println("Starting bundle and burp...");
		burp.StartBurp.main(new String[]{"--diagnostics", "--use-defaults"});
        System.out.println("... burp started.");
	}

	/* (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
        System.out.println("Stopping bundle.");
	}

}
