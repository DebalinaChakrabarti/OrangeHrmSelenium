package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	static Properties prop;
	static FileInputStream fis;
	public static String getGlobalValue (String key) {
		try {
			prop = new Properties();
			fis = new FileInputStream("./src/test/resources/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
	public static String getBrowser() {
		return getGlobalValue ("browser");
	}
	public static String getUrl() {
		return getGlobalValue ("baseUrl");
	}

}
