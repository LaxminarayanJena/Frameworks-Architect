package com.pol.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	
	@FindBy(xpath="//*[@id='tab-flight-tab-hp']")
	public WebElement flightTab;
	
	@FindBy(xpath="//*[@id='flight-origin-hp-flight']")
	public WebElement fromCity;

	@FindBy(xpath="//*[@id='flight-destination-hp-flight']")
	public WebElement toCity;

	@FindBy(xpath="//*[@id='flight-departing-hp-flight']")
	public WebElement departFlight;
	
	@FindBy(xpath="//*[@id='flight-returning-hp-flight']")
	public WebElement returnFlight;

	
	@FindBy(xpath="//*[@id='flight-adults-hp-flight']")
	public WebElement adultCount;
	
	@FindBy(xpath="//*[@id='flight-children-hp-flight']")
	public WebElement childCount;
	
	@FindBy(xpath="//*[@id='gcw-flights-form-hp-flight']/div[9]/label/button")
	public WebElement search;
	
	@FindBy(xpath="//*[@id='gss-signin-email']")
	public WebElement email;
	
	@FindBy(xpath="//*[@id='gss-signin-password']")
	public WebElement password;
	
	@FindBy(xpath="//*[@id='gss-signin-submit']")
	public WebElement submit;
	

}

