package com.pol.zoho.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZohoLoginPage {

	WebDriver driver;
	public ZohoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=".//*[@id='lid']")
	public WebElement email;
	
	@FindBy(xpath=".//*[@id='pwd']")
	public WebElement password;
	
	@FindBy(xpath="//*[@id='signin_submit']")
	public WebElement signin;
	
	public void doLogin(String username,String userpassword)
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		email.sendKeys(username);
		password.sendKeys(userpassword);
		signin.click();
	}



}
