package com.corp.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.corp.qa.PageLayer.HomePage;
import com.corp.qa.PageLayer.LoginPageNew;
import com.corp.qa.base.Base;

public class LoginPageTest1 extends Base {
	
	public LoginPageNew lp;
	HomePage homePage;
	//Step 1
	public LoginPageTest1() throws IOException {
		super();
		
	}
	//Step2
	
	@BeforeMethod
	public void SSSetUp() throws IOException {
		/*
		 * Setting up browser and website to execute test scripts
		 */
		initialization();
		/*
		 * To access all login elements and actions we made an object of LoginPageNew
		 * class
		 */
		lp=new LoginPageNew();	
	}
	@Test
	public void validateLoginnnn() throws IOException
	{
		homePage=lp.login22(prop.getProperty("username"), prop.getProperty("password"));
	
	}
}
