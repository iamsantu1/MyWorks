package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLogIn {
	
	public WebDriver ldriver;
	
	public ActitimeLogIn(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="username")
	@CacheLookup
	WebElement Username;
	
	@FindBy(name="pwd")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath ="//*[@id='loginButton']/div")
	@CacheLookup
	WebElement btnlogin;
	
	@FindBy(id="logoutLink")
	@CacheLookup
	WebElement btnlogout;
	
	public void SetUserName(String uname)
	{
		Username.sendKeys(uname);
	}
	
	public void SetPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickLoginButton()
	{
		 btnlogin.click();
	}
	
	public void clickLogOutButton()
	{
		 btnlogout.click();
	}
}
