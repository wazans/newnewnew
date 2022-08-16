package com.corp.qa.PageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.corp.qa.base.Base;



public class LoginPageNew extends Base {

	/*
	 * Identifying elements present on  Login Page such as username ,password
	 * Login button
	 */

	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//*[contains(@type,'submit')]")
	WebElement LoginButton;
	
	
	@FindBy(xpath="//li[@id='Pharmacy']")
	WebElement LocationChoose;
	

	//Initializing the Page Objects:
	public LoginPageNew() throws IOException {
	PageFactory.initElements(driver, this);
	}
	
	
	//Action - validate Login and action on Elements
	public HomePage login22(String un, String pwd) throws IOException{
		/*
		 * Performing actions on identified objects
		 */
		username.sendKeys(un);
		password.sendKeys(pwd);
		LocationChoose.click();
		LoginButton.click();
		return new HomePage();
		
	}
}
