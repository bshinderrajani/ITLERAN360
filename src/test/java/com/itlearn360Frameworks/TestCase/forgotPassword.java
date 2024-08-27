package com.itlearn360Frameworks.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.itlearn360Frameworks.pages.loginPage;
import com.itlearn360Frameworks.utility.configDataProvider;

public class forgotPassword extends baseTest{

	@Test(priority = 1, enabled = true)
	void Test_Forgotpass()

	{
		loginPage lp=new loginPage(driver);
		lp.click_login();
		lp.click_forgotpassword_link();
		System.out.println(driver.getTitle());

		Assert.assertEquals(configDataProvider.forgotPassworPagetitle().contentEquals(driver.getTitle()),true);

	}
}
