package com.pol.zoho.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pol.zoho.SetUp.BaseTest;

public class ZohoHomePage  {
	
	WebDriver driver;
	
	
	public ZohoHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="html/body/div[2]/div[2]/div/a[4]")
	public WebElement logIn;
	
	
	public ZohoLoginPage gotoLogin()
	{
		
		logIn.click();
		return new ZohoLoginPage(driver);
		
			
	
		
	}
}
