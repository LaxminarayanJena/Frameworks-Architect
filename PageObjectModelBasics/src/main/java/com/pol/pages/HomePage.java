package com.pol.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		//value passed to global driver
	}
	public void goToSupoort()
	{
		driver.findElement(By.cssSelector(".zh-support")).click();
	}
	
	public void doSignUp()
	{
		driver.findElement(By.cssSelector("#signuplink>a")).click();
	}
	
	public void goToLogin()
	{
		
		driver.findElement(By.cssSelector(".zh-login")).click();
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
