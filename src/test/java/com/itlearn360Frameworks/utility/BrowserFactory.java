package com.itlearn360Frameworks.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

	public static WebDriver startApplication(WebDriver driver,String browername,String appUrl)
	{
		if(browername.equals("Edge"))
		{
			EdgeOptions op=new EdgeOptions();
			op.addArguments("--remote-allow-origins=*");
			driver=new EdgeDriver();
		}
		else if(browername.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}

		else if(browername.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browername.equals("IE"))
		{
			driver=new InternetExplorerDriver();
		}
		else if(browername.equals("Safari"))
		{
			driver=new SafariDriver();
		}
		else
		{
			System.out.println("we do not support this driver please enter valid browser name ");
		}

		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;

	}

	public static  void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}


}
