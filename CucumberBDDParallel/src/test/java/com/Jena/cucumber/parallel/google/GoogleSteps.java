package com.Jena.cucumber.parallel.google;



import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Jena.cucumber.parallel.extent.ExtentManager;
import com.Jena.cucumber.parallel.extent.ExtentTestManager;
import com.aventstack.extentreports.Status;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSteps extends BaseTest{
	
	protected Scenario scenario;
	static String scenarioName;
	
	@Before
	public void before(Scenario scenario)
	{
		this.scenario=scenario;
		scenarioName=scenario.getName();
		ExtentTestManager.startTest(scenario.getName());
		ExtentTestManager.getTest().log(Status.INFO,"scenario started :-" +scenario.getName() );
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
		stopWebDriver();
	}
	
	@Given("launch browser '(.*?)'$")
	public void launch_browser(String browserName) {
	    
		ExtentTestManager.logInfo("launching browser" +browserName);
		startWebDriver(browserName);
		
	}

	@When("user navigates to {string}")
	public void user_navigates_to(String url) {
	    
		navigate(url);
		ExtentTestManager.logInfo("navigating to url" +url);
	}

	@Then("user enters search term {string}")
	public void user_enters_search_term(String searchText) throws InterruptedException {
	    
		getDriver().findElement(By.name("q")).sendKeys(searchText);
	    
	}

	@Then("clicks on search button")
	public void clicks_on_search_button() throws InterruptedException {
		
		Thread.sleep(3500);
		ExtentTestManager.logInfo("clicking search button" );
		getDriver().findElement(By.xpath(".//*[@id='tsf']/div[2]/div/div[3]/center/input[1]")).click();
		
	    
	    
	}


}
