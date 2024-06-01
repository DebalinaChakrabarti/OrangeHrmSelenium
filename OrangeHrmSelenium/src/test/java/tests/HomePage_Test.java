package tests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import driverFactory.DriverFactory;
import pageObjects.HomePage;
import utilities.ConfigReader;
import utilities.TextContextSetUp;

public class HomePage_Test {
	DriverFactory driverFactory;
	TextContextSetUp context;
	HomePage homepage;

	public HomePage_Test() {
		if (context == null) {
			context = new TextContextSetUp();
		}
		driverFactory = context.getDriverFactory();
		homepage = context.getPageObjectManager().getHomePage();
	}

	@BeforeSuite
	public void launchBrowser() {
		System.out.println("Test Started");
		driverFactory.init_driver();
	}

	@Test(priority = 0)
	public void getUrl() {
		driverFactory.getDriver().get(ConfigReader.getUrl());
	}

	@Test(priority = 1)
	public void getUsername() {
		System.out.println("typing username");
		homepage.setUserName("Admin");
	}

	@Test(priority = 2)
	public void getPassword() {
		homepage.setPassword("admin123");
	}

	@Test(priority = 3)
	public void doLogin() {
		homepage.clickLogin();
	}

}
