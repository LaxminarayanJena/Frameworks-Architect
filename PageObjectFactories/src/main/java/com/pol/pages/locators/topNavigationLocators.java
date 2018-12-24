package com.pol.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class topNavigationLocators {
	
	
	@FindBy(xpath="//*[@id='header-account-menu']")
	public WebElement account;
	
	@FindBy(xpath="//*[@id='account-signin']")
	public WebElement signin;
	
	@FindBy(xpath="//*[@id='header-trip-menu']")
	public WebElement managetrip;
	
	@FindBy(xpath="//*[@id='header-itineraries']")
	public WebElement itineraries;

}
