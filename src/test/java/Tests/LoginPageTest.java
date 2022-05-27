package Tests;

import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;
import org.testng.annotations.BeforeMethod;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() {
		super();
	}
	
  @BeforeMethod
  public void beforeMethod() throws IOException { 
	  initialization();
	  loginpage = new LoginPage();
	  homepage = new HomePage();
	  
	   
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
 
  
  @Test (priority=1)
  public void VerifyHomePageTitleTest()  {
	  String Actual=loginpage.VerifyHomePageTitle();
	  Assert.assertEquals(Actual,  prop.getProperty("title"));
  }

  @Test (priority=2)
  public void SignInButtonClickTest()  {
	  
	  homepage = loginpage.SignInButtonClick(prop.getProperty("username"),prop.getProperty("password"));
	  
  }

}
