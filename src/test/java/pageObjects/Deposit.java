package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utils.WaitHelper;

public class Deposit {
	WaitHelper waitHelper;
	WebDriver driver;
	
	public Deposit(WebDriver driver) {
		this.driver = driver;
		waitHelper = new WaitHelper(driver);
	}

	private @FindBy(how = How.LINK_TEXT, using = "Deposit")@CacheLookup WebElement depositLinkElement;
	private @FindBy(how = How.NAME, using = "accountno")@CacheLookup WebElement accountNumberInputBoxElement;
	private @FindBy(how = How.NAME, using = "ammount")@CacheLookup WebElement amountInputBoxElement;
	private @FindBy(how = How.NAME, using = "desc")@CacheLookup WebElement descriptionInputBoxElement;
	private @FindBy(how = How.NAME, using = "AccSubmit")@CacheLookup WebElement depositSubmitButtonElement;
	
	public void setDepositLink() {
		waitHelper.explicitWaitTime(depositLinkElement, 10);
		depositLinkElement.click();
	}
	public void setAccountNumber(String accountNo) {
		waitHelper.explicitWaitTime(accountNumberInputBoxElement, 10);
		accountNumberInputBoxElement.sendKeys(accountNo);
	}
	public void setAmount(String amount) {
		waitHelper.explicitWaitTime(amountInputBoxElement, 10);
		amountInputBoxElement.sendKeys(amount);		
	}
	public void addDescription(String description) {
		waitHelper.explicitWaitTime(descriptionInputBoxElement, 10);
		descriptionInputBoxElement.sendKeys(description);			
	}
	
	public void setDepositSubmitButton() {
		waitHelper.explicitWaitTime(depositSubmitButtonElement, 10);
		depositSubmitButtonElement.click();
	}
}
