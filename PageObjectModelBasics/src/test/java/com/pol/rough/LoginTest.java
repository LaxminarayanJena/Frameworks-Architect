package com.pol.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pol.pages.HomePage;
import com.pol.pages.LoginPage;
import com.pol.pages.ZohoAppPage;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\com\\pol\\executables\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.zoho.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	HomePage home = new HomePage(driver);
	home.goToLogin();
	
	LoginPage login = new LoginPage(driver);
	
	login.doLogin("seleniumtesterbangalore@gmail.com", "123selenium*");
	
	ZohoAppPage zp= new ZohoAppPage(driver);
	zp.gotoCRM();
	}

}
