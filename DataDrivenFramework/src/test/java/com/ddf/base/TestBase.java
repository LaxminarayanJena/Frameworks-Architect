package com.ddf.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.ddf.utilities.ExcelReader;
import com.ddf.utilities.ExtentManger;
import com.ddf.utilities.TestUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestBase {

	/*
	 * WebDriver
	 * Properties
	 * Logs-log4j jar, .log, log4j.properties
	 * ExtentsRepots
	 * DB
	 * Excel
	 * Mail
	 *ExtentReport,ReportNG
	 *Jenkins
	 */
	
	public static WebDriver driver;
	public Properties config =new Properties();
	public static Properties OR= new Properties();
	public static FileInputStream fis;
	public static Logger log =Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel= new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\excel\\TestData.xlsx");
	
	public static WebDriverWait wait;
	//import from apachelog4j only
	public ExtentReports rep= ExtentManger.getInstance();
	public static ExtentTest test;
	public static WebElement dropdown;
	public static String browser;
	
	
	
	@BeforeSuite
	public void setUp() throws IOException
	{
		if(driver==null)
		{
			FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
		config.load(fis);
		
		fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
		OR.load(fis);
		log.debug("Config file loaded");
		
	}
		
		if(System.getenv("browser")!=null && !System.getenv("browser").isEmpty()){
			
			browser = System.getenv("browser");
		}else{
			
			browser = config.getProperty("browser");
			
		}
		
		config.setProperty("browser", browser);		
		
		if(config.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
			 driver = new ChromeDriver();
			 log.debug("Chrome launched");
		}
		
		if(config.getProperty("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\geckodriver.exe");
			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true"); 
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null"); 		
			 driver = new FirefoxDriver();	
		}
		
		if(config.getProperty("browser").equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\MicrosoftWebDriver.exe");
			 driver=new EdgeDriver();
		}
		
		driver.get(config.getProperty("testsiteurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("ImplicitWait")), TimeUnit.SECONDS);
		wait= new WebDriverWait(driver,5);
	}
	
	public void click(String locator)
	
	{
		driver.findElement(By.xpath(OR.getProperty(locator))).click();
		test.log(LogStatus.INFO, "Clicking on :" + locator);
	}
	
	public void type(String locator, String value)
	{
		driver.findElement(By.xpath(OR.getProperty(locator))).sendKeys(value);
		test.log(LogStatus.INFO, "Typing in :" +locator+" entered value as" + value);
	}
	
	public void select(String locator,String value)
	{
		
		dropdown = driver.findElement(By.xpath(OR.getProperty(locator)));
		Select select = new Select(dropdown);
		select.selectByVisibleText(value);
		test.log(LogStatus.INFO, "Selecting from dropdown : " + locator + " value as " + value);

			
		
	}
	public boolean isElementPresent(By by)
	{
		
		try
		{
			driver.findElement(by);
			return true;
		}
		catch(NoSuchElementException e)
		{
			return false;
		}
		
	}
	
	public static void verifyEquals(String expected, String actual) throws IOException {

		try {

			Assert.assertEquals(actual, expected);

		} catch (Throwable t) {

			TestUtil.captureScreenshot();
			// ReportNG
			Reporter.log("<br>" + "Verification failure : " + t.getMessage() + "<br>");
			Reporter.log("<a target=\"_blank\" href=" + TestUtil.screenshotName + "><img src=" + TestUtil.screenshotName
					+ " height=200 width=200></img></a>");
			Reporter.log("<br>");
			Reporter.log("<br>");
			// Extent Reports
			test.log(LogStatus.FAIL, " Verification failed with exception : " + t.getMessage());
			test.log(LogStatus.FAIL, test.addScreenCapture(TestUtil.screenshotName));

		}

	}
	
	@AfterSuite
	public void tearDown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
		
	}
}
