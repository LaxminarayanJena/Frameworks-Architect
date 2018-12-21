package com.pol.pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath="//*[@id='tab-flight-tab-hp']")
	WebElement flightTab;
	
	public void gotoFlights()
	{
		flightTab.click();
	}
	
	public void gotoHotels()
	{
		
	}
	
	public void gotoFlightsAndHotels()
	{
		
	}
	
	public void bookAFlight(String from, String to, String departing, String returning, String noOfAdults, String  noOfChildren)
	{
		
	}

}
