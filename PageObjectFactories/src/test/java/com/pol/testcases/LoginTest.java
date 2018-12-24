package com.pol.testcases;

import org.testng.annotations.Test;

import com.pol.base.Page;
import com.pol.pages.actions.SignInPage;

class LoginTest {
	
	@Test
	public void loginTest() throws InterruptedException
	{	
		Page.initConfiguration();
		SignInPage signin=Page.topNav.gotoSignIn();
		Thread.sleep(2000);
		signin.doLogin("abc@gmail.com", "1234");
		Thread.sleep(1500);
		Page.quitBrowser();
	}

}
