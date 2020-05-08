package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.*;
import pageObjects.AddAccount;
import pageObjects.LoginPage;
import utils.CaptureScreenShot;

public class steps {
	WebDriver driver;
	LoginPage loginPage;
	AddAccount addAccount;
	CaptureScreenShot captureScreenShot;
	    
	@Given("Open chorme browser")
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


	@Then("Click on new account link")
	public void click_on_new_account_link() {
		addAccount = PageFactory.initElements(driver, AddAccount.class);
		addAccount.setNewAccountLink();
	}

	@Then("fill new account form")
	public void fill_new_account_form() {
		addAccount.setCustomerIDTextBox("77329");
		addAccount.setAccountTypeDropDown("Savings");
		addAccount.setInitialAmountTextBox("1000");
	}

	@Then("Click on submit button")
	public void click_on_submit_button() {
		addAccount.setSubmitButton();
	}

	@Then("Verify success message with {string}")
	public void verify_success_message_with(String string) {
		Assert.assertTrue(driver.getPageSource().contains(string));
	}
	
	@When("After test is complete capture screenshot")
	public void after_test_is_complete_capture_screenshot() {
	   captureScreenShot = PageFactory.initElements(driver, CaptureScreenShot.class);
	   captureScreenShot.takeScreenShot();
	}

}
