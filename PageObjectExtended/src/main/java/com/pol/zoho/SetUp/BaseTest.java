package com.pol.zoho.SetUp;

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
		
		getDriver().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
		getDriver().manage().window().maximize();
		getDriver().get("https://www.zoho.com/");
	}
	
	public void closeBrowser()
	{
		getDriver().quit();
	}
}
