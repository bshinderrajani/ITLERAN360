package com.itlearn360Frameworks.TestCase;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.itlearn360Frameworks.pages.loginPage;
import com.itlearn360Frameworks.utility.ReadDataFromExcel;
import com.itlearn360Frameworks.utility.configDataProvider;

public class loginTest extends baseTest {

	String  fileName=System.getProperty("user.dir")+"\\Data\\TestInfo.xlsx";
	String Expectedtittle=configDataProvider.homePagetitke();
	@Test(priority = 1,enabled = true)
	void verifyLogin()
	{
		loginPage lp=new loginPage(driver);
		lp.click_login();
		lp.set_username(configDataProvider.username());
		lp.set_pass(configDataProvider.password());
		lp.click_login_button();
		
		
		System.out.println(driver.getTitle());
		Assert.assertTrue(Expectedtittle.contentEquals(driver.getTitle()),"Test is fail");
		//Assert.assertEquals(driver.getTitle(), Expectedtittle);
	}
	
	@Test(priority = 2,enabled = true,dataProvider = "LoginDataProvider")
	void verifyLogin_dataDriven(String username,String password,String type)
	{
		String expectedtittle1=configDataProvider.wrongusernamepass();
		loginPage lp=new loginPage(driver);
		lp.click_login();
		lp.set_username(username);
		lp.set_pass(password);
		lp.click_login_button();
		
		if(type.contentEquals("valid"))
		{
			Assert.assertTrue(Expectedtittle.contentEquals(driver.getTitle()),"Test is pass");
			lp.Click_logoutImg();
			lp.Click_logout();
		}
		else if(type.contentEquals("Invalid"))
		{
			Assert.assertFalse(expectedtittle1.contentEquals(driver.getTitle()),"Test is pass");
			lp.btn_goto_method();
		}
			
	
	}
	
	@DataProvider(name="LoginDataProvider") 
	public String[][] LoginDataProvider()
	{
		int rowcount=ReadDataFromExcel.getRowCount(fileName, "LoginData");
		int colcount=ReadDataFromExcel.getColCount(fileName,"LoginData");
		
		String data[][]=new String[rowcount-1][colcount];
		
		for(int i=1;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				data[i-1][j]=ReadDataFromExcel.getCellValue(fileName,"LoginData", i, j);
			}
		}
		return data;
	}
	
	


	
	}

