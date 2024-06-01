package tests;

import org.testng.annotations.Test;

import pageObjects.EmergencyCntct;
import utilities.TextContextSetUp;

public class EmergencyCntct_Test {
	TextContextSetUp context;
	EmergencyCntct emergncyCntct;
	
	public EmergencyCntct_Test() {
		if (context == null) {
			context = new TextContextSetUp();
		}
		emergncyCntct = context.getPageObjectManager().getEmergencyCntct();
	}
	@Test(priority = 0)
	public void clickEmergncyCntct() {
		emergncyCntct.clickEmrgncyCntctBtn();
	}
	@Test(priority = 1)
	public void clickAddEmergncyCntct() {
		emergncyCntct.clickAddEmrgncyCntctBtn();
	}
	@Test(priority = 2)
	public void fillEmrgncyDtailForm() {
		emergncyCntct.fillEmrgncyCntctDetails("Henry", "Father", "5678456734");
	}
	@Test(priority = 3)
	public void clickSave() {
		emergncyCntct.clickSaveBtn();
	}
}
