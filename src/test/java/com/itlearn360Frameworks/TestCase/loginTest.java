package com.itlearn360Frameworks.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.itlearn360Frameworks.pages.loginPage;
import com.itlearn360Frameworks.utility.configDataProvider;

public class loginTest extends baseTest {

	@Test(priority = 1,enabled = true)
	void verifyLogin()
	{
		loginPage lp=new loginPage(driver);
		lp.click_login();
		lp.set_username("Demo12");
		lp.set_pass("Test123456$");
		lp.click_login_button();
		
		String Expectedtittle=configDataProvider.homePagetitke();
		System.out.println(driver.getTitle());
		Assert.assertTrue(Expectedtittle.contentEquals(driver.getTitle()),"Test is fail");
		//Assert.assertEquals(driver.getTitle(), Expectedtittle);
	}


	
	}

