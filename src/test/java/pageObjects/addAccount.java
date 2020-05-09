package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import utils.WaitHelper;

public class addAccount {
	WebDriver driver;
    WaitHelper waitHelper;
    
    public addAccount(WebDriver driver) {
        this.driver = driver;
        waitHelper = new WaitHelper(driver);
    }

    @FindBy(how = How.LINK_TEXT, using = "New addAccount")@CacheLookup
    WebElement newAccountLink;
    @FindBy(how = How.NAME, using = "cusid")@CacheLookup WebElement customerIDTextBox;
    @FindBy(how = How.NAME, using = "selaccount")@CacheLookup WebElement accountTypeDropDown;
    @FindBy(how = How.NAME, using = "inideposit")@CacheLookup WebElement initialAmountTextBox;
    @FindBy(how = How.NAME, using = "button2")@CacheLookup WebElement submitButton;

    public void setNewAccountLink(){
        waitHelper.explicitWaitTime(newAccountLink, 30);
        newAccountLink.click();
    }
    public void setCustomerIDTextBox(String customerId){
        waitHelper.explicitWaitTime(customerIDTextBox, 10);
        customerIDTextBox.sendKeys(customerId);
    }
    public void setAccountTypeDropDown(String accountTypeValue){
        waitHelper.explicitWaitTime(accountTypeDropDown, 10);
        Select select = new Select(accountTypeDropDown);
        select.selectByVisibleText(accountTypeValue);
    }
    public void setInitialAmountTextBox(String initialAmount){
        waitHelper.explicitWaitTime(initialAmountTextBox, 10);
        initialAmountTextBox.sendKeys(initialAmount);
    }
    public void setSubmitButton(){
        waitHelper.explicitWaitTime(submitButton, 10);
        submitButton.click();
    }

}
