package com.pol.pages.crm.accounts;

import org.openqa.selenium.By;

import com.pol.base.Page;

public class AccountsPage extends Page{
	
	
	
	public void gotoCreateAccounts()
	{
		driver.findElement(By.xpath(".//*[@id='submenu_Accounts']/button")).click();
	}
	
	public void gotoImportAccounts()
	{
		
	}

}
