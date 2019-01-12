package com.pol.zoho.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pol.zoho.PageObjects.ZohoHomePage;
import com.pol.zoho.PageObjects.ZohoLoginPage;
import com.pol.zoho.SetUp.BaseTest;

public class TestCase2 extends BaseTest  {
	
	
	@Test(dataProvider="getData")
	public void doLogin(String username,String password,String browser ) throws InterruptedException
	{
		
		openBrowser(browser);
		
		ZohoHomePage home = new ZohoHomePage(getDriver());
		ZohoLoginPage login =home.gotoLogin();		
		login.doLogin(username, password);
		closeBrowser();
		
		
		
	}
	
	@DataProvider(parallel =true)
	public Object[][] getData()
	{
		Object[][] data = new Object[1][3];
		data[0][0]="seleniumtesterbangalore@gmail.com";
		data[0][1]="123selenium";
		data[0][2]="chrome";
		
		return data;
	}

}
