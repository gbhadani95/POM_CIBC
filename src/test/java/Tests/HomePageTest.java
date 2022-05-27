package Tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AccountDetailsPage;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	AccountDetailsPage accountdetailspage;
	

	public HomePageTest() {
		super();
	}


@BeforeMethod
public void beforeMethod() throws IOException { 
	  initialization();
	  loginpage = new LoginPage();
	  accountdetailspage = new AccountDetailsPage();
	  homepage = loginpage.SignInButtonClick(prop.getProperty("username"),prop.getProperty("password"));}

@AfterMethod
public void afterMethod() {
	  driver.close();
}

@Test
public void ClickOnViewAccountDetailsTest()  {
	accountdetailspage = homepage.ClickOnViewAccountDetails();
	
}

}

