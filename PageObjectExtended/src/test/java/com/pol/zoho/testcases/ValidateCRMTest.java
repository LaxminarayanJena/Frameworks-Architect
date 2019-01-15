package com.pol.zoho.testcases;

import java.util.Hashtable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.pol.zoho.PageObjects.ZohoAppPage;
import com.pol.zoho.PageObjects.ZohoHomePage;
import com.pol.zoho.PageObjects.ZohoLoginPage;
import com.pol.zoho.SetUp.BaseTest;
import com.pol.zoho.utilities.Constants;
import com.pol.zoho.utilities.DataProviders;
import com.pol.zoho.utilities.DataUtil;
import com.pol.zoho.utilities.ExcelReader;

public class ValidateCRMTest extends BaseTest{


	@Test(dataProviderClass=DataProviders.class,dataProvider="masterDP")
	public void validateCRMTest(Hashtable<String,String> data ) throws InterruptedException
	{
		
		
		ExcelReader excel = new ExcelReader(Constants.SUITE1_XL_PATH);
		DataUtil.checkExecution("master", "ValidateCRMTest", data.get("Runmode"), excel);
		log.info("InsideLoginTest");
		openBrowser(data.get("browser"));
		logInfo("launched browser : " + data.get("browser"));
		ZohoHomePage home = new ZohoHomePage().open("https://www.zoho.com/");
		ZohoLoginPage login =home.gotoLogin();		
		ZohoAppPage app=login.doLoginAsValidUser(getDefaultUserName(), getDefaultPassword());
		logInfo("username entered as " + getDefaultUserName() + " and password entered as "+ getDefaultPassword() );
		app.gotoCRM();
		//Assert.fail("failing the login test");
				
	}
	
	@AfterMethod
	public void tearDown()
	{
		
		closeBrowser();
		logInfo("Test completed");
	}
	

}
