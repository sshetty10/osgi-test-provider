# osgi-test-provider
A Test OSGi provider with maven deployable in Karaf
###Maven Goal
mvn clean install 

This will add the project to your local repository.


###Commands to Deploy on Karaf
bundle:install mvn:biz.neustar.osgi/osgi-test-provider/1.5.0 (Pulls the bundle jar and installs it on karaf and returns a bundleID)
bundle:list  (will show you your bundle was installed or not)
bundle:start ${bundleID}

###Check errors
log:display

###To remove a bundle
bundle:stop ${bundleID}
bundle:uninstall ${bundleID}
