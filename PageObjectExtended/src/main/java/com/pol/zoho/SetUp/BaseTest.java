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

import com.pol.zoho.utilities.DriverManager;

public class BaseTest {

   private RemoteWebDriver driver;
	
	
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
		DriverManager.setWebDriver(driver);
		
		DriverManager.getDriver().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
		DriverManager.getDriver().manage().window().maximize();
		DriverManager.getDriver().get("https://www.zoho.com/");
	}
	
	public void closeBrowser()
	{
		DriverManager.getDriver().quit();
	}
}
