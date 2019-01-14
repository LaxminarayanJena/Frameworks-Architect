package com.pol.zoho.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.pol.zoho.PageObjects.ZohoHomePage;
import com.pol.zoho.PageObjects.ZohoLoginPage;
import com.pol.zoho.SetUp.BaseTest;
import com.pol.zoho.utilities.Constants;
import com.pol.zoho.utilities.DataProviders;
import com.pol.zoho.utilities.DataUtil;
import com.pol.zoho.utilities.DriverManager;
import com.pol.zoho.utilities.ExcelReader;

public class LoginTest extends BaseTest {
	
	
	
	@Test(dataProviderClass=DataProviders.class,dataProvider="masterDP")
	public void loginTest(Hashtable<String,String> data ) throws InterruptedException
	{
		
		
		ExcelReader excel = new ExcelReader(Constants.SUITE1_XL_PATH);
		DataUtil.checkExecution("master", "LoginTest", data.get("Runmode"), excel);
		openBrowser(data.get("browser"));
		ZohoHomePage home = new ZohoHomePage().open("https://www.zoho.com/");
		ZohoLoginPage login =home.gotoLogin();		
		login.doLogin(data.get("username"), data.get("password"));
		//Assert.fail("failing the login test");
		
				
	}
	
	@AfterMethod
	public void tearDown()
	{
		closeBrowser();
	}
	

}
