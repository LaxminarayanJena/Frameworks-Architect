package com.ddf.testcases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ddf.base.TestBase;

public class BankMangerLogin extends TestBase {
	
	@Test
	public void bankMangerLogin() throws IOException
	{
		
		//verifyEquals("abc", "xyz");
		driver.findElement(By.xpath(OR.getProperty("bmlbtn"))).click();		
	
		Assert.assertTrue("Login not sucessfull" ,isElementPresent(By.xpath(OR.getProperty("addCustBtn"))));
		log.debug("logged in sucessfully");
		Reporter.log("Login sucessfully executed");
		//Assert.fail("login not found");
	}

}
