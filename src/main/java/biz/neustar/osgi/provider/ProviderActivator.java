package biz.neustar.osgi.provider;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

/**
 * Created by sshetty on 12/12/16.
 */
public class ProviderActivator implements BundleActivator{
    private ServiceRegistration registration;

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        registration = bundleContext.registerService(
                HelloWorldService.class.getName(),
                new HelloWorldServiceImpl(),
                null);
    }
    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        registration.unregister();
    }
}

