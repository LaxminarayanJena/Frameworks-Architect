package com.Jena.cucumber.zoho.steps;



import com.Jena.zoho.ExtentListeners.ExtentManager;
import com.Jena.zoho.ExtentListeners.ExtentTestManager;
import com.Jena.zoho.PageObjects.ZohoHomePage;
import com.aventstack.extentreports.Status;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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
		setUpFramework();
	}
	
	@After
	public void after(Scenario scenario)
	{
		
		if(scenario.isFailed())
		{
			ExtentTestManager.logFail("Scenario Failed");
			ExtentTestManager.addScreenShotsOnFailure();
		}
		
		else
		{
			ExtentTestManager.logPass("Scenario passed");
		}
		ExtentManager.getReporter().flush();
		closeBrowser();
	}
	
	
	@Given("launch browser {string}")
	public void launch_browser(String browserName) {
	    
		openBrowser(browserName);
		ExtentTestManager.logInfo("Browser Opened" +browserName );
	}

	@When("user navigates to the URL {string}")
	public void user_navigates_to_the_URL(String URL) {
		
	    home= new ZohoHomePage().open(URL);
	    
	}

	@Then("user click on login")
	public void user_click_on_login() {
	    
	    
	}


}
