package com.pol.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenu {

	//HomePage has a topmenu  then encapsulation takes palce
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver)
	{
		this.driver=driver;
	}
	public void gotoHome()
	{
		
	}
	
	public void gotoLeads()
	{
		
	}
	
	public void gotoAccounts()
	{
		driver.findElement(By.xpath(".//*[@id='menuContent']/crm-tab/div/div/lyte-yield[4]/div/a")).click();
	}
	
	public void gotoContacts()
	{
		
	}
	public void signOut()
	{
		
	}
}
