package com.pol.zoho.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.pol.zoho.utilities.DriverManager;

public class ZohoHomePage extends BasePage {
	
	

	@FindBy(xpath="html/body/div[2]/div[2]/div/a[4]")
	public WebElement logIn;
	
	public ZohoHomePage open(String url)
	{
		DriverManager.getDriver().navigate().to(url);
		return (ZohoHomePage) openPage(ZohoHomePage.class);
				
	}
	public ZohoLoginPage gotoLogin()
	{
		
		logIn.click();
		//return new ZohoLoginPage(driver);
		
		return (ZohoLoginPage) openPage(ZohoLoginPage.class);
			
	
		
	}


	@Override
	protected ExpectedCondition getPageLoadCondition() {
		
		return ExpectedConditions.visibilityOf(logIn);
	}
	
	
	
}
