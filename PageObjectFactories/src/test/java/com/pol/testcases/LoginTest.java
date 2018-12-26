package com.pol.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pol.base.Page;
import com.pol.pages.actions.SignInPage;
import com.pol.utilities.Utilities;

class LoginTest {
	
	
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void loginTest(Hashtable<String,String> data) throws InterruptedException 
	{	
		
        if(data.get("runmode").equalsIgnoreCase("N")){			
			throw new SkipException("Skipping the test as the Run mode is NO");				
		}
        
        Page.initConfiguration();
        
		SignInPage signin=Page.topNav.gotoSignIn();
		Thread.sleep(2000);
		signin.doLogin(data.get("username"), data.get("password"));
		Thread.sleep(1500);
		
	}

	@AfterMethod
	public void tearDown()
	{
		Page.quitBrowser();
	}
}
