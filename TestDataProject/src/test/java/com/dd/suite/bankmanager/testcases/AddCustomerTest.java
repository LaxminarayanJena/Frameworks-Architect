package com.dd.suite.bankmanager.testcases;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.Constants;
import utilities.DataProviders;
import utilities.DataUtil;
import utilities.ExcelReader;

public class AddCustomerTest {
	
	
	@Test(dataProviderClass=DataProviders.class,dataProvider="bankManagerDP")
	public void addCustomerTest(Hashtable<String,String> data)
	{
		
	}
	

}
