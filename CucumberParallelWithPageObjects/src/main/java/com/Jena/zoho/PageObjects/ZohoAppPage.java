package com.Jena.zoho.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ZohoAppPage extends BasePage {
	
	@FindBy(xpath="//*[contains(text(),'Cliq')]")
	public WebElement cliq;
	
	@FindBy(xpath="//*[contains(text(),'Connect)]")
	public WebElement Connect;

	
	@FindBy(xpath="//*[contains(text(),'CRM')]")
	public WebElement CRM;

	
	@FindBy(xpath="//*[contains(text(),'SalesIQ')]")
	public WebElement SalesIQ;
	
	@FindBy(xpath="//*[contains(text(),'People')]")
	public WebElement People;


	@Override
	protected ExpectedCondition getPageLoadCondition() {
		// TODO Auto-generated method stub
		return ExpectedConditions.visibilityOf(CRM);
	}
	
	
	
	public ZohoCRMPage gotoCRM()
	{
		click(CRM, "CRM Link");
		return (ZohoCRMPage) openPage(ZohoCRMPage.class);
	}
	
	public CliqPage gotocliq()
	{
		click(cliq, "cliq Link");
		return (CliqPage) openPage(CliqPage.class);
	}
	
	public ConnectPage gotoConnect()
	{
		click(Connect, "Connect Link");
		return (ConnectPage) openPage(ConnectPage.class);
	}
	
	public SalesIQPage gotoSalesIQ()
	{
		click(SalesIQ, "SalesIQ Link");
		return (SalesIQPage) openPage(SalesIQPage.class);
	}

	public PeoplePage gotoPeople()
	{
		click(People, "People Link");
		return (PeoplePage) openPage(PeoplePage.class);
	}

}
