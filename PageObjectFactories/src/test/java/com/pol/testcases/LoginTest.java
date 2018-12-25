package com.pol.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pol.base.Page;
import com.pol.pages.actions.SignInPage;

class LoginTest {
	
	@BeforeTest
	public void setUp()
	{
		Page.initConfiguration();
	}
	
	@Test
	public void loginTest() throws InterruptedException
	{	
		
		SignInPage signin=Page.topNav.gotoSignIn();
		Thread.sleep(2000);
		signin.doLogin("abc@gmail.com", "1234");
		Thread.sleep(1500);
		
	}

	@AfterTest
	public void tearDown()
	{
		Page.quitBrowser();
	}
}
