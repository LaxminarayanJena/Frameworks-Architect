package com.pol.testcases;

import org.testng.annotations.Test;

import com.pol.base.Page;
import com.pol.pages.HomePage;
import com.pol.pages.LoginPage;
import com.pol.pages.ZohoAppPage;
import com.pol.pages.crm.accounts.AccountsPage;
import com.pol.pages.crm.accounts.CreateAccountPage;

public class LoginTest extends BaseTest {
	
	
	@Test
	public void loginTest()
	{
		HomePage home = new HomePage();
		// the call of constructor of superclass -page
		
//		home.goToLogin();	
//		LoginPage login = new LoginPage();	
		
		LoginPage lp=home.goToLogin();	
		ZohoAppPage zp= lp.doLogin("seleniumtesterbangalore@gmail.com", "123selenium*");
		
		 
		
	}

}
