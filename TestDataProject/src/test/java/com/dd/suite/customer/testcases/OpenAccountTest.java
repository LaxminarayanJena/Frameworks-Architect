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
		
		ExcelReader excel = new ExcelReader(Constants.SUITE2_XL_PATH);
		DataUtil.checkExecution("BankManagerSuite", "OpenAccountTest", data.get("Runmode"), excel);
	}
	
}
