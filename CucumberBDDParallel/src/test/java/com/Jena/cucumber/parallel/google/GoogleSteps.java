package com.Jena.cucumber.parallel.google;



import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSteps extends BaseTest{
	
	@Before
	public void before()
	{
		
	}
	
	@After
	public void after()
	{
		stopWebDriver();
	}
	
	@Given("launch browser '(.*?)'$")
	public void launch_browser(String browserName) {
	    
		startWebDriver(browserName);
	}

	@When("user navigates to {string}")
	public void user_navigates_to(String url) {
	    
		navigate(url);
	    
	}

	@Then("user enters search term {string}")
	public void user_enters_search_term(String searchText) throws InterruptedException {
	    
	    driver.findElement(By.name("q")).sendKeys(searchText);
	    
	}

	@Then("clicks on search button")
	public void clicks_on_search_button() throws InterruptedException {
		
		Thread.sleep(3500);
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div/div[3]/center/input[1]")).click();
		
	    
	    
	}


}
