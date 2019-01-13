package com.pol.zoho.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.pol.zoho.PageObjects.ZohoHomePage;
import com.pol.zoho.PageObjects.ZohoLoginPage;
import com.pol.zoho.SetUp.BaseTest;
import com.pol.zoho.utilities.DataProviders;
import com.pol.zoho.utilities.DriverManager;

public class TestCase2 extends BaseTest  {
	
	
	@Test(dataProviderClass=DataProviders.class,dataProvider="masterDP")
	public void LoginTest(Hashtable<String,String> data ) throws InterruptedException
	{
		
		openBrowser(data.get("browser"));
		
		ZohoHomePage home = new ZohoHomePage();
		ZohoLoginPage login =home.gotoLogin();		
		login.doLogin(data.get("username"), data.get("password"));
		closeBrowser();
		
		
		
	}
	
	

}
