package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ContactDetails;
import utilities.TextContextSetUp;

public class ContactDetails_Test {
	ContactDetails contactdetails;
	TextContextSetUp context;

	public ContactDetails_Test() {
		if (context == null) {
			context = new TextContextSetUp();
		}
		contactdetails = context.getPageObjectManager().getContactDetails();
	}

	@Test(priority = 0)
	public void getMyInfo() {
		contactdetails.clickMyInfo();
	}

	@Test(priority = 1)
	public void getContctDetails() {
		contactdetails.clickCntctDetails();
	}

	@Test(priority = 2)
	public void getCntctDetailsForm() {
		contactdetails.fillngCntctDetailsForm("street1", "street2", "Irving", "Texas", "78654", "4563423456");
	}

	@Test(priority = 3)
	public void getContry() {
		contactdetails.selectngCntry("China");
	}
    @Test(priority = 4)
	public void clickSave() {
		contactdetails.clickSave();
	}
    @Test(priority = 5)
    public void verifySucesMsg() {
    	String expctdMsg = "Successfully Updated";
    	Assert.assertTrue(contactdetails.successMsg().contains(expctdMsg));
    }

}
