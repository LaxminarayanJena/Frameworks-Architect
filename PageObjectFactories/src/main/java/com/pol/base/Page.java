package com.pol.base;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pol.pages.actions.TopNavigation;
import com.pol.utilities.ExcelReader;
import com.pol.utilities.ExtentManger;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Page {
	
	/*
	 * Webdriver
	 * excelreader
	 * logs,webdriverwait ,extentreports
	 */
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Logger log =Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel= new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\com\\pol\\excel\\TestData.xlsx");
	public static WebDriverWait wait;
	public static String browser;
	//import from apachelog4j only
	public ExtentReports rep= ExtentManger.getInstance();
	public static ExtentTest test;
	public static WebElement dropdown;
	public static TopNavigation topNav;
	
	public static void initConfiguration()
	{
		if(Constants.browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\com\\pol\\executables\\geckodriver.exe");
			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true"); 
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null"); 		
			 driver = new FirefoxDriver();	
		}
		else if(Constants.browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\com\\pol\\executables\\chromedriver.exe");
			 Map<String, Object> prefs = new HashMap<String, Object>();
				prefs.put("profile.default_content_setting_values.notifications", 2);
				prefs.put("credentials_enable_service", false);
				prefs.put("profile.password_manager_enabled", false);
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("prefs", prefs);
				options.addArguments("--disable-extensions");
				options.addArguments("--disable-infobars");

				driver = new ChromeDriver(options);
			   log.debug("Chrome launched");
		}
		else if(Constants.browser.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\com\\pol\\executables\\MicrosoftWebDriver.exe");
			 driver=new EdgeDriver();
			 log.debug("edge launched");
		}
		else if(Constants.browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\com\\pol\\executables\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
		}
		
		driver.get(Constants.testsiteurl);
		driver.manage().window().maximize();
	/*	driver.manage().timeouts().implicitlyWait(Constants.implicitwait, TimeUnit.SECONDS);
		wait= new WebDriverWait();
		
		*/
		topNav= new TopNavigation(driver);
	}
	
	public static void quitBrowser()
	{
		driver.quit();
	}
	
	
}
