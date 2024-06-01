package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driverFactory.DriverFactory;

public class ContactDetails {
	DriverFactory driverFactory = new DriverFactory();
	By myInfoBtn = By.linkText("My Info");
	By cntctDetailsBtn = By.linkText("Contact Details");
	By street1Btn = By.xpath("//form//div[1]//div//div[1]//div//div[2]//input");
	By street2Btn = By.xpath("//form//div[1]//div//div[2]//div//div[2]//input");
	By cityBtn = By.xpath("//form//div[1]//div//div[3]//div//div[2]//input");
	By stateBtn = By.xpath("//form//div[1]//div//div[4]//div//div[2]//input");
	By zipBtn = By.xpath("//form//div[1]//div//div[5]//div//div[2]//input");
	By mobileBtn = By.xpath("//form/div[2]/div/div[2]/div/div[2]/input");
    By cntryDrpDwnBtn = By.xpath("//div[@class='oxd-select-text--after']//i");
    By saveBtn = By.xpath("//button[contains(@type,'sub')]");
    By toastMsg = By.xpath("//div[@class='oxd-toast-content oxd-toast-content--success']");

	public void clickMyInfo() {
		driverFactory.getDriver().findElement(myInfoBtn).click();
	}

	public void clickCntctDetails() {
		driverFactory.getDriver().findElement(cntctDetailsBtn).click();
	}
	
	public void fillngCntctDetailsForm(String strt1, String strt2, String city, String state, 
			String zip, String mob) {
		driverFactory.getDriver().findElement(street1Btn).clear();
		driverFactory.getDriver().findElement(street1Btn).sendKeys(strt1);
		driverFactory.getDriver().findElement(street2Btn).clear();
		driverFactory.getDriver().findElement(street2Btn).sendKeys(strt2);
		driverFactory.getDriver().findElement(cityBtn).clear();
		driverFactory.getDriver().findElement(cityBtn).sendKeys(city);
		driverFactory.getDriver().findElement(stateBtn).clear();
		driverFactory.getDriver().findElement(stateBtn).sendKeys(state);
		driverFactory.getDriver().findElement(zipBtn).clear();
		driverFactory.getDriver().findElement(zipBtn).sendKeys(zip);
		driverFactory.getDriver().findElement(mobileBtn).clear();
		driverFactory.getDriver().findElement(mobileBtn).sendKeys(mob);
	}
	
	public void selectngCntry(String value) {
		WebElement cntryDrpDwn = driverFactory.getDriver().findElement(cntryDrpDwnBtn);
		cntryDrpDwn.click();
		WebElement getCntryName = driverFactory.getDriver()
				.findElement(By.xpath("//div[@class='oxd-select-text-input']"));
		String cntryName;
		Actions keyDown=new Actions(driverFactory.getDriver());
		do {
			keyDown.sendKeys(Keys.DOWN).perform();
			cntryName = getCntryName.getText();
			if (cntryName.equalsIgnoreCase(value)) {
				keyDown.sendKeys(Keys.ENTER).perform();
				break;
			}
		}
		while (!cntryName.equalsIgnoreCase("Zimbabwe"));
	}
	
	public void clickSave() {
		driverFactory.getDriver().findElement(saveBtn).click();
		System.out.println(driverFactory.getDriver().findElement(toastMsg).getText());
	}
	
	public String successMsg() {
		return driverFactory.getDriver().findElement(toastMsg).getText();
	}

}
