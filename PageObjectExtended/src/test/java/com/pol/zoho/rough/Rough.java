package com.pol.zoho.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rough {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true"); 
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.zoho.com/");
		driver.findElement(By.xpath("html/body/div[2]/div[2]/div/a[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='lid']")).sendKeys("ddd");
		driver.findElement(By.xpath(".//*[@id='pwd']")).sendKeys("DDDD");
		driver.findElement(By.xpath(".//*[@id='signin_submit']")).click();
		
		//driver.quit();	

	}

}
