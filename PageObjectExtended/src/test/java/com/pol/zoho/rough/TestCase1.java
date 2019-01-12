package com.pol.zoho.rough;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pol.zoho.PageObjects.ZohoHomePage;
import com.pol.zoho.PageObjects.ZohoLoginPage;

public class TestCase1 extends BaseTest {
	
	
	
	@Test(dataProvider="getData")
	public void doLogin(String username,String password,String browser ) throws InterruptedException
	{
		
		openBrowser(browser);
		
		
		WebDriverWait wait = new WebDriverWait(getDriver(),40);		
		getDriver().findElement(By.xpath("html/body/div[2]/div[2]/div/a[4]")).click();				
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='lid']")));	
		getDriver().findElement(By.xpath(".//*[@id='lid']")).sendKeys(username);
		getDriver().findElement(By.xpath(".//*[@id='pwd']")).sendKeys(password);
		getDriver().findElement(By.xpath(".//*[@id='signin_submit']")).click();
		
		closeBrowser();
		
	}
	
	@DataProvider(parallel =true)
	public Object[][] getData()
	{
		Object[][] data = new Object[2][3];
		data[0][0]="seleniumtesterbangalore@gmail.com";
		data[0][1]="123selenium";
		data[0][2]="chrome";
		
		data[1][0]="ramesh@gmail.com";
		data[1][1]="123sele";
		data[1][2]="firefox";
		
		return data;
	}

}
