package com.pol.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void doLogin(String username,String password)
	{
		
		driver.findElement(By.cssSelector("#lid")).sendKeys(username);
		driver.findElement(By.cssSelector("#pwd")).sendKeys(password);
		driver.findElement(By.cssSelector("#signin_submit")).click();
	}
	
	public void gotoSalesAndMarketing()
	{
		
	}
	
	public void gotoFinance()
	{
		
	}

}
