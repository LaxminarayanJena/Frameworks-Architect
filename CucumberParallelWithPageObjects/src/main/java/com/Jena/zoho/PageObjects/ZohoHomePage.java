package com.Jena.zoho.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Jena.zoho.utilities.DriverManager;


public class ZohoHomePage extends BasePage {
	
	

	@FindBy(xpath="//*[text()='Login']")
	public WebElement logIn;
	
	public ZohoHomePage open(String url)
	{
		DriverManager.getDriver().navigate().to(url);
		return (ZohoHomePage) openPage(ZohoHomePage.class);
				
	}
	public ZohoLoginPage gotoLogin()
	{
		
		//logIn.click();
		click(logIn, "Login Link");
		//return new ZohoLoginPage(driver);
		
		return (ZohoLoginPage) openPage(ZohoLoginPage.class);
			
	
		
	}


	@Override
	protected ExpectedCondition getPageLoadCondition() {
		
		return ExpectedConditions.visibilityOf(logIn);
	}
	
	
	
}
