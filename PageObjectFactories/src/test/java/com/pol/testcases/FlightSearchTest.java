package com.pol.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pol.base.Page;
import com.pol.errorcollectors.ErrorCollector;
import com.pol.pages.actions.HomePage;

class FlightSearchTest {
	
	
	@Test
	public void flightSearchTest()
	{
		
		Page.initConfiguration();
		HomePage home = new HomePage();
		//Assert.assertEquals(home.findTabCount(), 5);
		ErrorCollector.verifyEquals(home.findTabCount(), 7);
		ErrorCollector.verifyEquals(home.findTabCount(), 8);
		home.gotoFlights().bookAFlight("Bengaluru, India (BLR-Kempegowda Intl.)", "Mumbai, India (BOM-Chhatrapati Shivaji Intl.)", "15/11/2019", "16/11/2019", "1", "0");
		Page.quitBrowser();
	}

}
