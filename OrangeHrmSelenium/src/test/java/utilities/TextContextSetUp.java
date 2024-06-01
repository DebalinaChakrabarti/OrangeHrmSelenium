package utilities;

import driverFactory.DriverFactory;
import pageObjects.PageObjectManager;

public class TextContextSetUp {
	private DriverFactory driverFactory;
	private PageObjectManager pageobjectmanager;
	
	public TextContextSetUp() {
		driverFactory = new DriverFactory();
		pageobjectmanager = new PageObjectManager();
	}
	public DriverFactory getDriverFactory() {
		return driverFactory;
	}
	public PageObjectManager getPageObjectManager() {
		return pageobjectmanager; 
	}
	
	
}
