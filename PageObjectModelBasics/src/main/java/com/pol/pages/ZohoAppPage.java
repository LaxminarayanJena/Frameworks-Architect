package com.pol.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pol.base.Page;
import com.pol.pages.crm.CRMHomePage;

public class ZohoAppPage  extends Page{
	
	
	/*public ZohoAppPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	*/
	public void gotoChat()
	{
		
	}
	
	public CRMHomePage gotoCRM() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[text()='Close']")).click();
		driver.findElement(By.cssSelector(".zicon-apps-crm.zicon-apps-96")).click();
		
		return new CRMHomePage();
		
		
		
		//*[text()="Close"]
	}
	
	public void gotoSalesIQ()
	{
		driver.findElement(By.cssSelector(".zicon-apps-salesiq.zicon-apps-96")).click();
	}
	

}
