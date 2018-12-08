package com.pol.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ZohoAppPage {
	WebDriver driver;
	public ZohoAppPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void gotoChat()
	{
		
	}
	
	public void gotoCRM()
	{
		driver.findElement(By.cssSelector(".zicon-apps-crm.zicon-apps-96")).click();
	}
	
	public void gotoSalesIQ()
	{
		driver.findElement(By.cssSelector(".zicon-apps-salesiq.zicon-apps-96")).click();
	}
	

}
