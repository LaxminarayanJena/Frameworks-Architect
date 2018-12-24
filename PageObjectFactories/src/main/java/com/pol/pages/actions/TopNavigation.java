package com.pol.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.pol.pages.locators.topNavigationLocators;

public class TopNavigation {
public topNavigationLocators topNavigation;
	
	
	
	public TopNavigation(WebDriver driver) {
		this.topNavigation= new topNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.topNavigation);
	}

	public SignInPage gotoSignIn()
	{
		topNavigation.account.click();
		topNavigation.signin.click();
		return new SignInPage();
		//once it returns object of signin page a constructor is called
	}
	
	public void gotoManageTrips()
	{
		
	}
	
	public void gotoList()
	{
		
	}
	
	public void gotoHome()
	{
		
	}
	
	

}
