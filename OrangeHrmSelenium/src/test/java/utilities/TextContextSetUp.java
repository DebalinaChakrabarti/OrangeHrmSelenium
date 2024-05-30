package utilities;

import driverFactory.DriverFactory;

public class TextContextSetUp {
	private DriverFactory driverFactory;
	
	public TextContextSetUp() {
		driverFactory = new DriverFactory();
	}
	public DriverFactory getDriverFactory() {
		return driverFactory;
	}
	
	
}
