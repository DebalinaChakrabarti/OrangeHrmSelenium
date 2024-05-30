package tests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import driverFactory.DriverFactory;
import utilities.ConfigReader;
import utilities.TextContextSetUp;

public class HomePage_Test {
	 DriverFactory driverFactory;
	 TextContextSetUp context ;
	
	public HomePage_Test() {
	    context = new TextContextSetUp();
	    driverFactory = context.getDriverFactory();
    }
	@BeforeSuite
	public void launchBrowser() {
		System.out.println("Test Started");
		driverFactory.init_driver();
	}
	@Test
	public void getUrl () {
		driverFactory.getDriver().get(ConfigReader.getUrl());
	}

}
