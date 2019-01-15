package com.pol.zoho.SetUp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;

import com.pol.zoho.ExtentListeners.ExtentListeners;
import com.pol.zoho.utilities.DriverFactory;
import com.pol.zoho.utilities.DriverManager;

public class BaseTest {

   private WebDriver driver;
   private Properties config = new Properties();
   private FileInputStream fis;
   public Logger log = Logger.getLogger(BaseTest.class);
   public boolean grid=false;
   
   private String defaultUserName;
   private String defaultPassword;
   
   public String getDefaultUserName() {
	return defaultUserName;
}


public void setDefaultUserName(String defaultUserName) {
	this.defaultUserName = defaultUserName;
}


public String getDefaultPassword() {
	return defaultPassword;
}


public void setDefaultPassword(String defaultPassword) {
	this.defaultPassword = defaultPassword;
}


@BeforeSuite
   public void setUpFramework()
   {
	   configureLogging();
	   DriverFactory.setGridPath("http://localhost:4444/wd/hub");
	   DriverFactory.setConfigPropertyFile(System.getProperty("user.dir") +"//src//test//resources//properties//config.properties");
	   if(System.getProperty("os.name").contains("mac"))
		   
	   {
		   DriverFactory.setChromeDriverExePath(System.getProperty("user.dir") +"//src//test//resources//executables//chromedriver");	    
		   DriverFactory.setGeckoDriverExePath(System.getProperty("user.dir") +"//src//test//resources//executables//geckodriver");  
	   }
	   
	   else
	   {
		   DriverFactory.setChromeDriverExePath(System.getProperty("user.dir") +"//src//test//resources//executables//chromedriver.exe");	    
		   DriverFactory.setGeckoDriverExePath(System.getProperty("user.dir") +"//src//test//resources//executables//geckodriver.exe");
	   }
	   
	   try {
		fis= new FileInputStream(DriverFactory.getConfigPropertyFile());
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   try {
		config.load(fis);
		log.info("config file loaded");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	    
   }
   
     
   public void logInfo(String message)
   {
	   ExtentListeners.testReport.get().info(message);
   }
   public void configureLogging()
   {
	   String log4jConfigFile=System.getProperty("user.dir") +"//src//test//resources//properties//log4j.properties";
	   PropertyConfigurator.configure(log4jConfigFile);
   }
	
	
	public void openBrowser(String browser)
			
	{
		if(System.getenv("ExecutionType")!=null && System.getenv("ExecutionType").equals("Grid"))
		{
			grid=true;
		}
		
		DriverFactory.setRemote(grid);
		
		
		if(DriverFactory.isRemote())
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
				log.info("starting the sesssion on grid");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			if(browser.equals("chrome"))
			{
				System.out.println("launching :" + browser);
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");			
				 driver = new ChromeDriver();
				 log.info("chrome browser launched");
			}
			
			if(browser.equals("firefox"))
			{
				System.out.println("launching :" + browser);
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\geckodriver.exe");
				System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true"); 
				driver= new FirefoxDriver();
				log.info("firefox browser launched");
			}
		}
		
		DriverManager.setWebDriver(driver);
		
		DriverManager.getDriver().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
		DriverManager.getDriver().manage().window().maximize();
		DriverManager.getDriver().get("https://www.zoho.com/");
		setDefaultUserName(config.getProperty("defaultUserName"));
		setDefaultPassword(config.getProperty("defaultPassword"));
	}
	
	public void closeBrowser()
	{
		DriverManager.getDriver().quit();
	}
}
