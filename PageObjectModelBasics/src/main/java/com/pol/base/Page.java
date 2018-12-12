package com.pol.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pol.utilities.ExcelReader;
import com.pol.utilities.ExtentManger;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class Page {
	
	
	public static WebDriver driver;
	public static TopMenu menu;
	public Properties config =new Properties();
	public static Properties OR= new Properties();
	public static FileInputStream fis;
	public static Logger log =Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel= new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\com\\pol\\excel\\TestData.xlsx");
	public static WebDriverWait wait;
	public static String browser;
	//import from apachelog4j only
	public ExtentReports rep= ExtentManger.getInstance();
	public static ExtentTest test;
	public static WebElement dropdown;

  public Page() 
  {
	  if(driver==null)
	  {
			
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\com\\pol\\properties\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\com\\pol\\properties\\OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				OR.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			log.debug("Config file loaded");  
		  
			
			//Jenkins config
			if(System.getenv("browser")!=null && !System.getenv("browser").isEmpty()){
				
				browser = System.getenv("browser");
			}else{
				
				browser = config.getProperty("browser");
				
			}
			
			config.setProperty("browser", browser);		
			
			if(config.getProperty("browser").equals("chrome"))
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
			
			if(config.getProperty("browser").equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\com\\pol\\executables\\geckodriver.exe");
				System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true"); 
				System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null"); 		
				 driver = new FirefoxDriver();	
			}
			
			if(config.getProperty("browser").equals("edge"))
			{
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\com\\pol\\executables\\MicrosoftWebDriver.exe");
				 driver=new EdgeDriver();
			}
			
			
			
	
	  
	 
	  
	
	  driver.get("https://www.zoho.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  menu = new TopMenu(driver);
  }
}
  
  public static void quit()
  {
	  driver.quit();
  }
  
  
//Common Keywords
	public static void click(String locator) {

		if (locator.endsWith("_CSS")) {
			driver.findElement(By.cssSelector(OR.getProperty(locator))).click();
		} else if (locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(OR.getProperty(locator))).click();
		} else if (locator.endsWith("_ID")) {
			driver.findElement(By.id(OR.getProperty(locator))).click();
		}
		log.debug("Clicking on an Element : "+locator);
		test.log(LogStatus.INFO, "Clicking on : " + locator);
	}
  
	public static void type(String locator, String value) {

		if (locator.endsWith("_CSS")) {
			driver.findElement(By.cssSelector(OR.getProperty(locator))).sendKeys(value);
		} else if (locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(OR.getProperty(locator))).sendKeys(value);
		} else if (locator.endsWith("_ID")) {
			driver.findElement(By.id(OR.getProperty(locator))).sendKeys(value);
		}

		log.debug("Typing in an Element : "+locator+" entered value as : "+value);
		
		test.log(LogStatus.INFO, "Typing in : " + locator + " entered value as " + value);

	}
  
  
  
  
  
  
  
}