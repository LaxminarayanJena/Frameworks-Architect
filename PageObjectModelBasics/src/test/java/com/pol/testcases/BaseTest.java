package com.pol.testcases;

import org.testng.annotations.AfterSuite;

import com.pol.base.Page;

public class BaseTest {
	
	@AfterSuite
	public void tearDown()
	{
		Page.quit();
	}

}
