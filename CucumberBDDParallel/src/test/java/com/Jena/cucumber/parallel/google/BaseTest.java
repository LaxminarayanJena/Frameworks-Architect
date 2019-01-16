package com.Jena.cucumber.parallel.google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	private WebDriver driver;
	public static ThreadLocal<WebDriver> dr= new ThreadLocal<WebDriver>();
	
	

	public static WebDriver getDriver() {
		return dr.get();
	}

	public static void setWebDriver(WebDriver driver) {
		dr.set(driver);
	}

	protected void startWebDriver(String browser)
	{
		if(browser.equals("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\com\\Jena\\executables\\geckodriver.exe");
			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true"); 
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null"); 		
			 driver = new FirefoxDriver();	
			
		}
		else if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\com\\Jena\\executables\\chromedriver.exe");			
			driver= new ChromeDriver();
			
		}
		
		setWebDriver(driver);
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	protected void navigate(String url)
	{
		getDriver().navigate().to(url);
	}

	protected void stopWebDriver()
	{
		getDriver().quit();
	}
}
