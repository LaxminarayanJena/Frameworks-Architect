package com.pol.testcases;

import org.testng.annotations.Test;

import com.pol.base.Page;
import com.pol.pages.actions.HomePage;

class FlightSearchTest {
	
	
	@Test
	public void flightSearchTest()
	{
		
		Page.initConfiguration();
		HomePage home = new HomePage();
		home.gotoFlights();
		home.bookAFlight("Bengaluru, India (BLR-Kempegowda Intl.)", "Mumbai, India (BOM-Chhatrapati Shivaji Intl.)", "15/11/2019", "16/11/2019", "1", "0");
		Page.quitBrowser();
	}

}
