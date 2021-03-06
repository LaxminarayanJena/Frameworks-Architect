package com.ddf.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.ddf.base.TestBase;
import com.ddf.utilities.TestUtil;

public class OpenAccountTest extends TestBase {
	

	
	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void OpenAccount(Hashtable<String,String> data) throws InterruptedException {
		 
		if(!(TestUtil.isTestRunnable("OpenAccountTest", excel)))
		{
			throw new SkipException("Skipping the test" +"Skipped the test case as run mode is set to NO");
		}
		
		
		click("OpenAccountTest");	
		select("customerName",data.get("customer"));
		select("currencyname",data.get("Currency"));
		click("process");
	
	}

	
}