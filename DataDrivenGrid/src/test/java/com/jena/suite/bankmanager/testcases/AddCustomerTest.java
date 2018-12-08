package com.jena.suite.bankmanager.testcases;

import java.net.MalformedURLException;
import java.util.Hashtable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.jena.datadriven.base.TestBase;
import com.jena.utilities.Constants;
import com.jena.utilities.DataProviders;
import com.jena.utilities.DataUtil;
import com.jena.utilities.ExcelReader;




public class AddCustomerTest extends TestBase {
	
	

	@Test(dataProviderClass=DataProviders.class,dataProvider="bankManagerDP")
	public void addCustomerTest(Hashtable<String,String> data) throws MalformedURLException
	{
		test = rep.startTest("Add Customer Test"+"   "+data.get("browser"));
		ExcelReader excel = new ExcelReader(Constants.SUITE1_XL_PATH);
		DataUtil.checkExecution("BankManagerSuite", "AddCustomerTest", data.get("Runmode"), excel);
		openBrowser(data.get("browser"));
		navigate("testsiteurl");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		
	}
	

}
