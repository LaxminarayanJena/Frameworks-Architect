package com.pol.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pol.base.Page;

public class HomePage extends Page {
	
	/*WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		//value passed to global driver
	}
	
	*/
	public void goToSupoort()
	{
		driver.findElement(By.cssSelector(".zh-support")).click();
	}
	
	public void doSignUp()
	{
		driver.findElement(By.cssSelector("#signuplink>a")).click();
	}
	
	public LoginPage goToLogin()
	{
		
		click("loginlink_CSS");
		return new  LoginPage();
	}
	
	public void goToZohoEdu()
	{
		
	}
	
	public void goToLearnMore()
	{
		
	}
	
	public void validateFooterLinks()
	{
		
	}

}
