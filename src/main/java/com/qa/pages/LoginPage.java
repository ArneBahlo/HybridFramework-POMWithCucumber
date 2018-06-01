package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.util.TestBase;

public class LoginPage extends TestBase {

	//PageFactory -OR
	
		@FindBy(name="username")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement loginBtn;
		
		
		//Initialise the pageobjects
		public LoginPage()
		{
			PageFactory.initElements(driver, this);
			//PageFactory.initElements(driver, LoginPage.class);
		}
		public String validateLoginPageTitle()
		{
			return driver.getTitle();
		}
		
	
		
		public HomePage login(String un, String pwd) throws InterruptedException
		{
			Thread.sleep(5000);
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
			return  new HomePage();
		}

	}
