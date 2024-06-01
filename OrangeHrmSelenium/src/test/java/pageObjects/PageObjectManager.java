package pageObjects;

import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;

public class PageObjectManager {
	private HomePage homepage;
	//private DriverFactory driverFactory = new DriverFactory();
	private ContactDetails contactdetails;
    private EmergencyCntct emergncyCntct;
	
	public HomePage getHomePage() {
		if (homepage==null) {
		   homepage = new HomePage();
		}
		return homepage;
	}
	public ContactDetails getContactDetails() {
		if (contactdetails==null) {
			contactdetails = new ContactDetails();
		}
		return contactdetails;
	}
	public EmergencyCntct getEmergencyCntct() {
		if (emergncyCntct==null) {
			emergncyCntct = new EmergencyCntct(); 
		}
		return emergncyCntct;
	}

}
