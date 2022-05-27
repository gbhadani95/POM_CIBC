package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{
	
	
	
	@FindBy(xpath="//a[text()='View Account Details']")
	WebElement username1;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public AccountDetailsPage ClickOnViewAccountDetails() {
		username1.click();
		return new AccountDetailsPage();
	}

}
