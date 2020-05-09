package stepDefinitions;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestHelper {
	public static Logger logger;
	public static Properties properties;
	public static WebDriver driver;
	
	public WebDriver setBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/drivers/chromedriver");
			driver = new ChromeDriver();
			System.out.println(browserName);
		}
		else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "/drivers/geckodriver");
			driver = new FirefoxDriver();
		}
		return driver;
	}
}
