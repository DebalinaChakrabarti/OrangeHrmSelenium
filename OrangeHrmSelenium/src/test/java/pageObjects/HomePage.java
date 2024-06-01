package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import driverFactory.DriverFactory;

public class HomePage  {
	private DriverFactory driverFactory = new DriverFactory();
	By userName = By.name("username");
	By pswd = By.name("password");
	By logn = By.xpath("//button[@type='submit']");
	
	public void setUserName(String username) {
		WebElement usrnam = driverFactory.getDriver().findElement(userName);
		usrnam.sendKeys(username);
	}
	public void setPassword(String password) {
		driverFactory.getDriver().findElement(pswd).sendKeys(password);
	}
	public void clickLogin() {
		driverFactory.getDriver().findElement(logn).click();
	}

}
