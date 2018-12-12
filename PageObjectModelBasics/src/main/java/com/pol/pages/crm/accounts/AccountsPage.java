package com.pol.pages.crm.accounts;

import org.openqa.selenium.By;

import com.pol.base.Page;

public class AccountsPage extends Page{
	
	
	
	public CreateAccountPage gotoCreateAccounts()
	{
		driver.findElement(By.xpath(".//*[@id='submenu_Accounts']/button")).click();
		return new CreateAccountPage();
	}
	
	public void gotoImportAccounts()
	{
		
	}

}
