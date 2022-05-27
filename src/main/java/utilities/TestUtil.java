package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.TestBase;

public class TestUtil extends TestBase {
	
	static long Page_loadout_time=10;
	static long Implicit_Wait = 20;
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Tejas\\Desktop\\Selenium\\Selenium_WorkSpace\\PageObjectModel_CIBC\\Screenshot.png"));
	}

}
