package com.ddf.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ddf.base.TestBase;

public class Login extends TestBase {
	
	@Test
	public void loginAsBankManager()
	{
		
		driver.findElement(By.xpath(OR.getProperty("bmlbtn"))).click();
		log.debug("logged in sucessfully");
	}

}
