package com.Jena.zoho.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ZohoCRMPage extends BasePage{
	
	
	@FindBy(xpath="//*[contains(text(),'Welcome)]")
	public WebElement WelcomeText;

	@Override
	protected ExpectedCondition getPageLoadCondition() {
		// TODO Auto-generated method stub
		return ExpectedConditions.visibilityOf(WelcomeText);
	}

}
