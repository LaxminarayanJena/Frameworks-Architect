package com.pol.rough;

import com.pol.base.Page;
import com.pol.pages.actions.SignInPage;

class LoginTest {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		Page.initConfiguration();
		SignInPage signin=Page.topNav.gotoSignIn();
		Thread.sleep(2000);
		signin.doLogin("abc@gmail.com", "1234");
		Thread.sleep(1500);
		Page.quitBrowser();
	}

}
