package com.ddf.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ddf.base.TestBase;
import com.ddf.utilities.TestUtil;

public class AddCustomerTest extends TestBase {
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void AddCustomer(String firstName,String lastName,String postCode,String alerttext) throws InterruptedException
	{
		//driver.findElement(By.xpath(OR.getProperty("addCustBtn"))).click();
		click("addCustBtn");
		type("firstName",firstName);
		//driver.findElement(By.xpath(OR.getProperty("firstName"))).sendKeys(firstName);
		driver.findElement(By.xpath(OR.getProperty("lastName"))).sendKeys(lastName);
		driver.findElement(By.xpath(OR.getProperty("postCode"))).sendKeys(postCode);
		
		driver.findElement(By.xpath(OR.getProperty("addcust"))).click();
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertTrue(alert.getText().contains(alerttext));
		alert.accept();
		//Assert.fail("customer not added sucessfully");
	//Customer added successfully with customer id :7	
	}

	
}