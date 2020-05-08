package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	   WebDriver driver;
	    public WaitHelper(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void explicitWaitTime(WebElement element, long waitTime){
	        WebDriverWait webDriverWait = new WebDriverWait(driver, waitTime);
	        webDriverWait.until(ExpectedConditions.visibilityOf(element));
	    }

}
