package com.pol.pages.crm.accounts;

import org.openqa.selenium.By;

import com.pol.base.Page;

public class CreateAccountPage extends Page{

	
	
	public CreateAccountPage createAccount(String accountname) {
		
		driver.findElement(By.xpath(".//*[@id='Crm_Accounts_ACCOUNTNAME']")).sendKeys(accountname);
		
		return new CreateAccountPage();
	}
}
