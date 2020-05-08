package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class steps {
	WebDriver driver;
	LoginPage loginPage;
	    
	@Given("open chorme browser")
	public void open_chorme_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
	}

	@Then("Enter valid url {string} to open application")
	public void enter_valid_url_to_open_application(String string) {
		driver.get(string);
	}

	@When("After launching application enter username {string} and password {string}")
	public void after_launching_application_enter_username_and_password(String string, String string2) {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login(string, string2);
	}

	@When("After that enter click on login button")
	public void after_that_enter_click_on_login_button() {
		loginPage.loginButtonElement();
	}

	@Then("Get title of the current page {string}")
	public void get_title_of_the_current_page(String string) {
		Assert.assertEquals(driver.getTitle(), string);
	}

	@Then("Close the application and browser")
	public void close_the_application_and_browser() {
		 driver.close();
	}

}
