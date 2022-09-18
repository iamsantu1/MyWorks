package com.actitime.StepsDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.pageobjects.ActitimeLogIn;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	
	public WebDriver driver;
	public ActitimeLogIn lp;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  
	  lp=new ActitimeLogIn(driver);
	  driver.manage().window().maximize();
	
	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
	   
		driver.get(string);
		
	}

	@When("User enters Username as {string} and password  as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
	   
		lp.SetUserName(string);
		lp.SetPassword(string2);
		
	}

	@And("Click on Login")
	public void click_on_login() {
	   lp.clickLoginButton();
	   
	   
	}

	@When("Click on Logout")
	public void click_on_logout() {
	    lp.clickLogOutButton();
	}

	@When("close browser")
	public void close_browser() {
	   driver.close();
	}

	
	
}
