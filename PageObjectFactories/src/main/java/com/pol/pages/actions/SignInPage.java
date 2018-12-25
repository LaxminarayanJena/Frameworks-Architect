package com.pol.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.pol.base.Page;
import com.pol.pages.locators.SignInPageLocators;

public class SignInPage extends Page {
	
public SignInPageLocators signinpage ;
	
	
	
	public  SignInPage() {
		this.signinpage= new SignInPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.signinpage);
	}

	
	public void doLogin(String username, String password)
	{
		 signinpage.email.sendKeys(username);
		// signinpage.password.sendKeys(password);
		 
		 type(signinpage.password, password);
		//signinpage.submit.click();
		click(signinpage.submit);
	}
	
	

}
