package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id="card-number-1b4721de")
	WebElement username;
	
	@FindBy(id="password-1b4721de")
	WebElement password;
	
	@FindBy(id="button-1520360371595")
	WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
    public String VerifyHomePageTitle() {
	return driver.getTitle();
    }
	
	public HomePage SignInButtonClick(String name, String pass) {
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginButton.click();
		return new HomePage();	
	}
	
}



