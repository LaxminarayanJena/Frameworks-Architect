package com.Jena.cucumber.zoho.steps;


import com.Jena.zoho.ExtentListeners.ExtentTestManager;
import com.Jena.zoho.PageObjects.ZohoHomePage;
import com.aventstack.extentreports.Status;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class ZohoSteps  extends BaseStep{
public ZohoHomePage home;

protected Scenario scenario;
static String scenarioName;
static int x=0;
	
	@Before
	public void before(Scenario scenario)
	{
		x=x+1;
		this.scenario=scenario;
		scenarioName=scenario.getName();
		ExtentTestManager.startTest("Scenario no :"+x+scenario.getName());
		ExtentTestManager.getTest().log(Status.INFO,"scenario started :-" +scenario.getName() );
	}
	
	
}
