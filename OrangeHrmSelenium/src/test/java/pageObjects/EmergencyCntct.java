package pageObjects;

import org.openqa.selenium.By;

import driverFactory.DriverFactory;

public class EmergencyCntct {
	DriverFactory driverFactory = new DriverFactory();
	By emrgncyCntctBtn = By.linkText("Emergency Contacts");
	By addEmrgncyCntct = By.xpath("//div/div[2]/div[1]/div/button/i");
	By nameBox = By.xpath("//form/div[1]/div/div[1]/div/div[2]/input");
	By reltnShipBox = By.xpath("//form/div[1]/div/div[2]/div/div[2]/input");
	By mobBox = By.xpath("//form/div[2]/div/div[2]/div/div[2]/input");
	By saveBtn = By.xpath("//button[contains(@type,'sub')]");
	
	public void clickEmrgncyCntctBtn() {
		driverFactory.getDriver().findElement(emrgncyCntctBtn).click();
	}
	
	public void clickAddEmrgncyCntctBtn() {
		driverFactory.getDriver().findElement(addEmrgncyCntct).click();
	}
	
	public void fillEmrgncyCntctDetails(String name, String relatnShip, String mob) {
		driverFactory.getDriver().findElement(nameBox).sendKeys(name);
		driverFactory.getDriver().findElement(reltnShipBox).sendKeys(relatnShip);
		driverFactory.getDriver().findElement(mobBox).sendKeys(mob);
	}
	
	public void clickSaveBtn() {
		driverFactory.getDriver().findElement(saveBtn).click();
	}

}
