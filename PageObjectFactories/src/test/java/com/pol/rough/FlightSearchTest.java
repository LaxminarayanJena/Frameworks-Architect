package com.pol.rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.pol.pages.actions.HomePage;

class FlightSearchTest {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\com\\pol\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.co.in/");
		driver.manage().window().maximize();
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.gotoFlights();
	}

}
