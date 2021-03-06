package com.ddf.testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ddf.base.TestBase;
import com.ddf.utilities.TestUtil;

public class AddCustomerTest extends TestBase {
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
			
	public void AddCustomer(Hashtable<String,String> data) throws InterruptedException{
		
        if(!data.get("RunMode").equals("Y")){			
			throw new SkipException("Skipping the test case as the Run mode for data set is NO");
		}
		
		
		//driver.findElement(By.xpath(OR.getProperty("addCustBtn"))).click();
		click("addCustBtn");
		type("firstName",data.get("firstname"));
		//driver.findElement(By.xpath(OR.getProperty("firstName"))).sendKeys(firstName);
		driver.findElement(By.xpath(OR.getProperty("lastName"))).sendKeys(data.get("lastname"));
		driver.findElement(By.xpath(OR.getProperty("postCode"))).sendKeys(data.get("postcode"));
		
		driver.findElement(By.xpath(OR.getProperty("addcust"))).click();
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertTrue(alert.getText().contains(data.get("alerttext")));
		alert.accept();
		//Assert.fail("customer not added sucessfully");
	//Customer added successfully with customer id :7	
	}

	
}