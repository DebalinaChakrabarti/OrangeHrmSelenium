package driverFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.ConfigReader;

public class DriverFactory {
	public static ThreadLocal <WebDriver> tlDriver = new ThreadLocal<>();
	public WebDriver init_driver () {
		String browser = ConfigReader.getBrowser();
		//String URL = ConfigReader.getUrl();
		System.out.println("browser value is: " + browser);
		
		if (browser.equalsIgnoreCase("chrome")) {
			tlDriver.set(new ChromeDriver());
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			tlDriver.set(new FirefoxDriver());
		}
		else if (browser.equalsIgnoreCase("edge")) {
			tlDriver.set(new EdgeDriver());
		}
		else  {
			System.out.println("Please pass the correct browser value: " + browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//getDriver().get(URL);
		return getDriver();
	}
	/**
	 * this method is used to get the driver with ThreadLocal
	 * synchronized keyword is used to synchronize the multiple WebDriver if they run parallel
	 * @return
	 */
	public synchronized WebDriver getDriver() {
		return tlDriver.get();
	}

}
