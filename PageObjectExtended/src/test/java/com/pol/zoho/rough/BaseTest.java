package com.pol.zoho.rough;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

public static ThreadLocal<RemoteWebDriver>dr = new ThreadLocal<RemoteWebDriver>();
   private RemoteWebDriver driver;
	public WebDriver getDriver()
	{
		return dr.get();
		
	}
	
	public void setWebDriver(RemoteWebDriver driver)
	{
		dr.set(driver);
	}
	
	public void openBrowser(String browser)
	{
/*
		if(browser.equals("chrome"))
		{
			System.out.println("launching :" + browser);
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");			
			 driver = new ChromeDriver();		
		}
		
		if(browser.equals("firefox"))
		{
			System.out.println("launching :" + browser);
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\geckodriver.exe");
			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true"); 
			driver= new FirefoxDriver();
			
		}
		*/
		DesiredCapabilities cap =null;
		if(browser.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.ANY);
		}
		
		else if(browser.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}
		
		else if(browser.equals("ie"))
		{
			cap=DesiredCapabilities.internetExplorer();
			cap.setBrowserName("iexplore");
			cap.setPlatform(Platform.WINDOWS);
		}
		
		try {
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setWebDriver(driver);
		
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		getDriver().manage().window().maximize();
		
	}
	
	public void closeBrowser()
	{
		getDriver().quit();
	}
}
