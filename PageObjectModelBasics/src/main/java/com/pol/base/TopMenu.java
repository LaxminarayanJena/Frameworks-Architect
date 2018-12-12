package com.pol.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pol.pages.crm.accounts.AccountsPage;

public class TopMenu {

	//HomePage has a topmenu  then encapsulation takes palce
	//is a -inheritance
	
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
	
	public AccountsPage gotoAccounts()
	{
		driver.findElement(By.xpath(".//*[@id='menuContent']/crm-tab/div/div/lyte-yield[4]/div/a")).click();
		return new AccountsPage();
	}
	
	public void gotoContacts()
	{
		
	}
	public void signOut()
	{
		
	}
}
