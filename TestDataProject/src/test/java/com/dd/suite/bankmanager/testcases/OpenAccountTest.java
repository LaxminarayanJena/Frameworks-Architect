package com.dd.suite.bankmanager.testcases;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.Constants;
import utilities.DataUtil;
import utilities.ExcelReader;

public class OpenAccountTest {
	
	
	@Test(dataProvider="getData")
	public void addCustomerTest(Hashtable<String,String> data)
	{
		
	}
	@DataProvider
	public Object[][] getData() {
		return DataUtil.getData("OpenAccountTest", new ExcelReader(System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\BankManagerSuite.xlsx"));

		
	}
}
