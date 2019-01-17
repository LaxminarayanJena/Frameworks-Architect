package com.Jena.zoho.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZohoLoginPage extends BasePage{

	
	
	@FindBy(xpath="//*[@id='lid']") 
	public WebElement email;
	
	@FindBy(xpath=".//*[@id='pwd']")
	public WebElement password;
	
	@FindBy(xpath="//*[@id='signin_submit']")
	public WebElement signin;
	
	public ZohoLoginPage doLoginAsInvalidUser(String username,String userpassword)
	{		
		//email.sendKeys(username);
		type(email, username, "UserName TextBox");
		password.sendKeys(userpassword);
		signin.click();
		return this;
	
	}
	
	public ZohoAppPage doLoginAsValidUser(String username,String userpassword)
	{		
		//email.sendKeys(username);
		type(email, username, "UserName TextBox");
		password.sendKeys(userpassword);
		signin.click();
		return (ZohoAppPage) openPage(ZohoAppPage.class);
	}

	@Override
	protected ExpectedCondition getPageLoadCondition() {
		// TODO Auto-generated method stub
		return ExpectedConditions.visibilityOf(email);
	}



}
