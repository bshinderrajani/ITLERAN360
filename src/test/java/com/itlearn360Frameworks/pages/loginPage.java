package com.itlearn360Frameworks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver driver;
	public loginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id='loginlabel']")
	private WebElement loginbutton;
	
	@FindBy(xpath = "//input[@id='user_login']")
	private WebElement txt_username;
	
	@FindBy(xpath = "//input[@id='user_pass']")
	private WebElement txt_pass;
	
	@FindBy(xpath ="//input[@id='wp-submit']")
	private WebElement btn_login;
	
	
	@FindBy(xpath = "//a[@title='Password Lost and Found']")
	private WebElement forgotpass_link;
	
	public void click_login()
	{
		loginbutton.click();
	}
	public void set_username(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void set_pass(String password)
	{
		txt_pass.sendKeys(password);
	}
	
	public void click_login_button()
	{
		btn_login.click();
	}
	
	public void click_forgotpassword_link()
	{
		forgotpass_link.click();
	}
}
