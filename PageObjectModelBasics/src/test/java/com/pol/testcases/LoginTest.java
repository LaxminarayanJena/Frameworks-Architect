package com.pol.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pol.base.Page;
import com.pol.pages.HomePage;
import com.pol.pages.LoginPage;
import com.pol.pages.ZohoAppPage;
import com.pol.pages.crm.accounts.AccountsPage;
import com.pol.pages.crm.accounts.CreateAccountPage;
import com.pol.utilities.Utilities;

public class LoginTest extends BaseTest {
	
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void loginTest(Hashtable<String,String> data)
	{
		HomePage home = new HomePage();
		// the call of constructor of superclass -page
		
//		home.goToLogin();	
//		LoginPage login = new LoginPage();	
		
		LoginPage lp=home.goToLogin();	
		//ZohoAppPage zp= lp.doLogin( data.get("username"), data.get("password"));
		lp.doLogin( data.get("username"), data.get("password"));
		
		Assert.fail("Login Test  failed");
		
		 
		
	}

}
