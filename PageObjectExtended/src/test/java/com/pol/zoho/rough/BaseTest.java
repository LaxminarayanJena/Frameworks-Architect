package com.pol.zoho.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

public static ThreadLocal<WebDriver>dr = new ThreadLocal<WebDriver>();
   private WebDriver driver;
	public WebDriver getDriver()
	{
		return dr.get();
		
	}
	
	public void setWebDriver(WebDriver driver)
	{
		dr.set(driver);
	}
	
	public void openBrowser(String browser)
	{

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
		setWebDriver(driver);
		
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		getDriver().manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
		getDriver().manage().window().maximize();
		getDriver().get("https://www.zoho.com/");
	}
	
	public void closeBrowser()
	{
		getDriver().quit();
	}
}
