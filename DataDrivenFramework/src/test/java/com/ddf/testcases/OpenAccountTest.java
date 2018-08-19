package com.ddf.testcases;

import org.testng.annotations.Test;

import com.ddf.base.TestBase;
import com.ddf.utilities.TestUtil;

public class OpenAccountTest extends TestBase {
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void OpenAccount(String customer,String currency) throws InterruptedException
	{
		                                        
		click("OpenAccountTest");	
		select("customerName",customer);
		select("currencyname",currency);
		click("process");
	
	}

	
}