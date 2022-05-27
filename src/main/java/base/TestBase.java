//@Gautam Changed in Branch
package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import utilities.WebEventListener;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;

	public TestBase()  {
		try {
	prop = new Properties();
	FileInputStream f = new FileInputStream("C:\\Users\\Tejas\\Desktop\\Selenium\\Selenium_WorkSpace\\PageObjectModel_ScotiaBank\\src\\main\\java\\cofigurations\\config.properties");
	prop.load(f);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}
	
	public static void initialization() {
		
		String browser = prop.getProperty("browser");

		if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tejas\\Desktop\\Selenium\\SeleniumJars\\geckodriver.exe");
			driver= new FirefoxDriver();
			
		} else if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas\\Desktop\\Selenium\\SeleniumJars\\chromedriver.exe");
			driver= new ChromeDriver();
			
		} else {
			System.setProperty("webdriver.safari.driver", "C:\\Users\\Tejas\\Desktop\\Selenium\\SeleniumJars\\safaridriver.exe");
			driver= new SafariDriver();
		}
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
	}

	
	
}


   
