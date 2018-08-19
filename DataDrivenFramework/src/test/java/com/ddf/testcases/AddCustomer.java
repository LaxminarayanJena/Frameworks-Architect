package com.ddf.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ddf.base.TestBase;

public class AddCustomer extends TestBase {
	
	@Test(dataProvider="getData")
	public void addCustomer(String firstName,String lastName,String postCode,String alerttext) throws InterruptedException
	{
		driver.findElement(By.xpath(OR.getProperty("addCustBtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("firstName"))).sendKeys(firstName);
		driver.findElement(By.xpath(OR.getProperty("lastName"))).sendKeys(lastName);
		driver.findElement(By.xpath(OR.getProperty("postCode"))).sendKeys(postCode);
		
		driver.findElement(By.xpath(OR.getProperty("addcust"))).click();
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertTrue(alert.getText().contains(alerttext));
		alert.accept();
		Assert.fail("customer not added sucessfully");
	//Customer added successfully with customer id :7	
	}

	@DataProvider
	public Object[][] getData()
	{				
		String sheetName="AddCustomer";
		int rows= excel.getRowCount(sheetName);
		int cols= excel.getColumnCount(sheetName);
		
		System.out.println("Total rows are" + rows);
		System.out.println("Total columns are" + cols);				
		Object [][] data= new Object[rows-1][cols];
		
		for(int rowNum =2 ; rowNum<=rows; rowNum++)
		{
			for(int colNum = 0; colNum< cols; colNum++)	
			{
				data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
			}
		}
				
		return data;
		 
	}
}