package com.pol.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindAll;;
public class HomePageLocators {

	//anyone is correct it will work	
	@FindBys({
	@FindBy(xpath=".//*[@id='wizard-tabs']/div[1]/ul"),
	@FindBy(xpath="//*[@id='tab-flight-tab-hp']")
	})
	public WebElement flightTab;
	
	//within 1stfindby it will search second findby
	

	
	
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
	
	
	//anyone is correct it will work	
	@FindAll({
	@FindBy(xpath="//*[@id='gss-signin-submit1']"),
	@FindBy(id="gss-signin-submit")
	})
	public WebElement submit;
	
	
	@FindBy(xpath=".//li[@class='tab ']")
	public List<WebElement> tabCount;
}

