package com.pol.pages;

import org.openqa.selenium.By;

import com.pol.base.Page;

public class LoginPage extends Page {
	
	
	public ZohoAppPage doLogin(String username,String password)
	{
		
		type("username_CSS",username);
		type("password_CSS",password);
		click("sign_CSS");
		
		return new ZohoAppPage();
	}
	
	public void gotoSalesAndMarketing()
	{
		
	}
	
	public void gotoFinance()
	{
		
	}

}
