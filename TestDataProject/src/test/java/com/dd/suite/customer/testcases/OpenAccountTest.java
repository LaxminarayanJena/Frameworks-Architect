package com.dd.suite.customer.testcases;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.Constants;
import utilities.DataProviders;
import utilities.DataUtil;
import utilities.ExcelReader;

public class OpenAccountTest {
	
	
	@Test(dataProviderClass=DataProviders.class,dataProvider="customerDP")
	public void OpenAccountTest(Hashtable<String,String> data)
	{
		
	}
	
}
