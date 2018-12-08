package com.jena.datadriven.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.jena.utilities.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestBase {

	
	public static ThreadLocal<RemoteWebDriver> dr = new ThreadLocal<RemoteWebDriver>();
	
	public RemoteWebDriver driver =null;
	public Properties OR= new Properties();
	public Properties Config = new Properties();
	public FileInputStream fis;
	public Logger log= Logger.getLogger("devpinoyLogger");
	public WebDriverWait wait;
	public static WebElement dropdown;
	public ExtentReports rep = ExtentManager.getInstance();
	public ExtentTest test;
	public static ThreadLocal<ExtentTest> exTest = new ThreadLocal<ExtentTest>();
	public String browser;
	
	
	public WebDriver getDriver()
	{
		return dr.get();
	}
	public void setWebDriver(RemoteWebDriver driver)
	{
		dr.set(driver);
	}
	
	
	public void setExtentTest(ExtentTest et){
		
		exTest.set(et);
	}
	
	public ExtentTest getExtTest(){
		
		
		return exTest.get();
	}
	
	
	
	public String getThreadValue(Object value){
		
		String text = value.toString();
		String[] nextText = text.split(" ");
		String text2 = nextText[nextText.length-1].replace("(", "").replace(")", "");
		String[] newText2 = text2.split("-");
		String reqText = newText2[newText2.length-1];
		return reqText;
	}
	
	
	
	
	public void openBrowser(String browser) throws MalformedURLException
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
		
		else if(browser.equals("edge"))
		{
			cap=DesiredCapabilities.edge();
			cap.setBrowserName("edge");
			cap.setPlatform(Platform.ANY);
		}
		
		driver= new RemoteWebDriver(new URL("http://192.168.99.100:4445/wd/hub"),cap);
		setWebDriver(driver);
		getDriver().manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("ImplicitWait")), TimeUnit.SECONDS);
		getDriver().manage().window().maximize();
		test.log(LogStatus.INFO, "Browser openend successfully"+browser);
	}
	
public void reportPass(String msg){
		
		test.log(LogStatus.PASS, msg);
	}

public void reportFailure(String msg){
	
	test.log(LogStatus.FAIL, msg);
	//captureScreenshot();
	Assert.fail(msg);
}

	public void navigate(String url)
	{
		getDriver().get(Config.getProperty("testsiteurl"));
		test.log(LogStatus.INFO, "Navigating to "+Config.getProperty("testsiteurl"));
	}
	
	
	
public void click(String locator)
	
	{
	getDriver().findElement(By.xpath(OR.getProperty(locator))).click();
		
	}
	
	public void type(String locator, String value)
	{
		getDriver().findElement(By.xpath(OR.getProperty(locator))).sendKeys(value);
		
	}
	
	public void select(String locator,String value)
	{
		
		dropdown = driver.findElement(By.xpath(OR.getProperty(locator)));
		Select select = new Select(dropdown);
		select.selectByVisibleText(value);
	
			
		
	}
	public boolean isElementPresent(By by)
	{
		
		try
		{
			getDriver().findElement(by);
			return true;
		}
		catch(NoSuchElementException e)
		{
			return false;
		}
		
	}
	@BeforeSuite
	public void setUp() throws IOException
	{
		if(driver==null)
		{
			FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
		Config.load(fis);
		
		fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
		OR.load(fis);
		}
		
		
	}
	
	@AfterSuite
	public void tearDown()
	{
		
		getDriver().quit();
	}
	
	
}
