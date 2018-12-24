package com.pol.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageLocators {
	
	
	@FindBy(xpath="//*[@id='gss-signin-email']")
	public WebElement email;
	
	@FindBy(xpath="//*[@id='gss-signin-password']")
	public WebElement password;
	
	@FindBy(xpath="//*[@id='gss-signin-submit']")
	public WebElement submit;

}
