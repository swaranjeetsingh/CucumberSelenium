package stepDefinitions;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageObjects.AddAccount;
import pageObjects.LoginPage;
import utils.CaptureScreenShot;

public class steps extends TestHelper {
	WebDriver driver;
	LoginPage loginPage;
	AddAccount addAccount;
	CaptureScreenShot captureScreenShot;
	
	@Before
	public void setup() {
		logger = Logger.getLogger("cucumber_framework");
		PropertyConfigurator.configure("log4j.properties");
	}
	    
	@Given("Open chorme browser")
	public void open_chorme_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
	}

	@Then("Enter valid url {string} to open application")
	public void enter_valid_url_to_open_application(String string) {
		logger.info("open application using url: " + string);
		driver.get(string);
	}

	@When("After launching application enter username {string} and password {string}")
	public void after_launching_application_enter_username_and_password(String string, String string2) {
		logger.info("enter login credentials");
		loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login(string, string2);
	}

	@When("After that enter click on login button")
	public void after_that_enter_click_on_login_button() {
		logger.info("click on login button");
		loginPage.loginButtonElement();
	}

	@Then("Get title of the current page {string}")
	public void get_title_of_the_current_page(String string) {
		logger.info("validation of page title");
		Assert.assertEquals(driver.getTitle(), string);
	}

	@Then("Close the application and browser")
	public void close_the_application_and_browser() {
		logger.info("close browser");
		 driver.close();
	}

// add new account
	@Then("Click on new account link")
	public void click_on_new_account_link() {
		logger.info("click on new account link");
		addAccount = PageFactory.initElements(driver, AddAccount.class);
		addAccount.setNewAccountLink();
	}

	@Then("fill new account form")
	public void fill_new_account_form() {
		logger.info("fill new account details");
		addAccount.setCustomerIDTextBox("77329");
		addAccount.setAccountTypeDropDown("Savings");
		addAccount.setInitialAmountTextBox("1000");
	}

	@Then("Click on submit button")
	public void click_on_submit_button() {
		logger.info("click on add account button");
		addAccount.setSubmitButton();
	}

	@Then("Verify success message with {string}")
	public void verify_success_message_with(String string) {
		logger.info("validation test of successfull added account");
		Assert.assertTrue(driver.getPageSource().contains(string));
	}
	
	@When("After test is complete capture screenshot")
	public void after_test_is_complete_capture_screenshot() {
		logger.info("capture screenshot");
	   captureScreenShot = PageFactory.initElements(driver, CaptureScreenShot.class);
	   captureScreenShot.takeScreenShot();
	}

}
