package com.itlearn360Frameworks.listners;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.chaintest.plugins.ChainTestListener;

public class Mylistner implements ITestListener{

	public static WebDriver driver;
	@Override
	public void onTestFailure(ITestResult result) {
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		ChainTestListener.embed(screenshot,"image/png");
	}

}
