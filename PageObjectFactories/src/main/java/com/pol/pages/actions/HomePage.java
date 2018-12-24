package com.pol.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.pol.base.Page;
import com.pol.pages.locators.HomePageLocators;

public class HomePage extends Page {
	
	public HomePageLocators home;
	
	public HomePage()
	{
		this.home= new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.home);
	}
	
	public HomePage gotoFlights()
	{
		home.flightTab.click();
		return this;
	}
	
	
	
	public void gotoFlightsAndHotels()
	{
		
	}
	
	public void bookAFlight(String from, String to, String departing, String returning, String noOfAdults, String  noOfChildren)
	{
		home.fromCity.sendKeys(from);
		home.toCity.sendKeys(to);
		home.departFlight.sendKeys(departing);
		home.returnFlight.sendKeys(returning);
		home.adultCount.sendKeys(noOfAdults);
		home.childCount.sendKeys(noOfChildren);
		home.search.click();
		
	}
	
	

}
