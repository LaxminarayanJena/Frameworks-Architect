package com.pol.zoho.testcases;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pol.zoho.PageObjects.ZohoHomePage;
import com.pol.zoho.PageObjects.ZohoLoginPage;
import com.pol.zoho.SetUp.BaseTest;

public class TestCase1 extends BaseTest {
	
	
	
	@Test(dataProvider="getData")
	public void doLogin(String username,String password,String browser ) throws InterruptedException
	{
		
		openBrowser(browser);
		
		ZohoHomePage home = new ZohoHomePage(getDriver());
		ZohoLoginPage login =home.gotoLogin();
		login.doLogin("seleniumtesterbangalore@gmail.com", "123sele");
		closeBrowser();
		
	}
	
	@DataProvider(parallel =true)
	public Object[][] getData(Method m)
	{
		System.out.println(m.getName());
		Object[][] data = new Object[2][3];
		data[0][0]="seleniumtesterbangalore@gmail.com";
		data[0][1]="123selenium";
		data[0][2]="chrome";
		
		data[1][0]="ramesh@gmail.com";
		data[1][1]="123sele";
		data[1][2]="firefox";
		
		return data;
	}

}
