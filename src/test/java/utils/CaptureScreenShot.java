package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenShot {
	WebDriver driver;
	public CaptureScreenShot(WebDriver driver) {
		this.driver = driver;
	}
	
	public void takeScreenShot() {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/screenshots/screenshot.png";
		File destinationFolder = new File(destination);
		try {
			FileUtils.copyFile(srcFile, destinationFolder);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
