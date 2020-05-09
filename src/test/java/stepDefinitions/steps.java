package stepDefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.junit.Assert;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import pageObjects.addAccount;
import pageObjects.Deposit;
import pageObjects.LoginPage;

import utils.CaptureScreenShot;

public class steps extends TestHelper {
	LoginPage loginPage;
	addAccount addAccount;
	Deposit deposit;
	CaptureScreenShot captureScreenShot;

	@Before
	public void setup() throws IOException {
		logger = Logger.getLogger("cucumber_framework");
		PropertyConfigurator.configure("log4j.properties");
		FileInputStream fileInputStream = new FileInputStream(
				new File(System.getProperty("user.dir") + "/config.properties"));
		properties = new Properties();
		properties.load(fileInputStream);
		driver = setBrowser(properties.getProperty("browser"));
	}

	@Given("Open chorme browser")
	public void open_chorme_browser() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
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

// add new addAccount
	@Then("Click on new addAccount link")
	public void click_on_new_account_link() {
		logger.info("click on new addAccount link");
		addAccount = PageFactory.initElements(driver, addAccount.class);
		addAccount.setNewAccountLink();
	}

	@Then("fill new addAccount form")
	public void fill_new_account_form() {
		logger.info("fill new addAccount details");
		addAccount.setCustomerIDTextBox("77329");
		addAccount.setAccountTypeDropDown("Savings");
		addAccount.setInitialAmountTextBox("1000");
	}

	@Then("Click on submit button")
	public void click_on_submit_button() {
		logger.info("click on add addAccount button");
		addAccount.setSubmitButton();
	}

	@Then("Verify success message with {string}")
	public void verify_success_message_with(String string) {
		logger.info("validation test of successfull added addAccount");
		Assert.assertTrue(driver.getPageSource().contains(string));
	}

	@When("After test is complete capture screenshot")
	public void after_test_is_complete_capture_screenshot() {
		logger.info("capture screenshot");
		captureScreenShot = PageFactory.initElements(driver, CaptureScreenShot.class);
		captureScreenShot.takeScreenShot();
	}

	@When("Click on deposit link")
	public void click_on_deposit_link() {
		logger.info("click on deposit link");
		deposit = PageFactory.initElements(driver, Deposit.class);
		deposit.setDepositLink();
	}

	@Then("Add details of amount to be submitted")
	public void add_details_of_amount_to_be_submitted() {
		logger.info("enter account number");
		deposit.setAccountNumber("78183");
		logger.info("add amount to be deposited");
		deposit.setAmount("1000");
		logger.info("added description");
		deposit.addDescription("by cash");
	}

	@Then("Click on deposit submit button")
	public void click_on_deposit_submit_button() {
		logger.info("click on add deposit button");
		deposit.setDepositSubmitButton();
	}
	
}
