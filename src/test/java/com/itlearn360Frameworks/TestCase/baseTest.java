package com.itlearn360Frameworks.TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.itlearn360Frameworks.utility.BrowserFactory;
import com.itlearn360Frameworks.utility.configDataProvider;

public class baseTest {

	public static WebDriver driver;
	static configDataProvider config=new configDataProvider();
	@BeforeClass
	public static void BrowserLaunch()
	{
		driver=BrowserFactory.startApplication(driver,config.getBrowser() ,config.getUrl());
	}

	@AfterClass
	public static  void closeBrowser()
	{
		BrowserFactory.quitBrowser(driver);
	}
}
