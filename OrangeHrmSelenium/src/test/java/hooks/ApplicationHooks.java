package hooks;

import org.testng.annotations.BeforeSuite;

import driverFactory.DriverFactory;
import utilities.TextContextSetUp;

public class ApplicationHooks {
	
	private static DriverFactory driverFactory;
	private TextContextSetUp context;
	
	public ApplicationHooks () {
		context = new TextContextSetUp();
	    driverFactory = context.getDriverFactory();
	}
	
	@BeforeSuite
	public void launchBrowser() {
		System.out.println("Test Started");
		driverFactory.init_driver();
	}
}
