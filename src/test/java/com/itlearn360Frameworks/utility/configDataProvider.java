package com.itlearn360Frameworks.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configDataProvider {
	
	 static Properties pro;
	
	public configDataProvider()
	{
		File src=new File("./Confugration/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			try {
				pro.load(fis);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public String getBrowser()
	{
		return pro.getProperty("browser");
	}
	
	public String getUrl()
	{
		return pro.getProperty("testurl");
	}
	
	public static  String homePagetitke()
	{
		return pro.getProperty("Homepagetitle");
	}

	public static String forgotPassworPagetitle()
	{
		return pro.getProperty("Forgotpasswordtittle");
	}
	
	public static String username()
	{
		return pro.getProperty("username");
	}
	public static String password()
	{
		return pro.getProperty("password");
	}
	public static String wrongusernamepass()
	{
		return pro.getProperty("inviduseranamepasswordpagetittle");
	}
	
}

