package com.pol.testcases;

import java.util.Hashtable;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.pol.base.Page;
import com.pol.pages.HomePage;
import com.pol.pages.LoginPage;
import com.pol.pages.ZohoAppPage;
import com.pol.pages.crm.accounts.AccountsPage;
import com.pol.pages.crm.accounts.CreateAccountPage;
import com.pol.utilities.Utilities;

public class CreateAccountTest extends BaseTest {
	
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void createAccountTest (Hashtable<String,String> data) throws InterruptedException
	{
		ZohoAppPage zp= new ZohoAppPage();
		 zp.gotoCRM();
		 
		 AccountsPage account= Page.menu.gotoAccounts();
		 CreateAccountPage cap= account.gotoCreateAccounts();
		 
		//cap.createAccount("sel1");
		 cap.createAccount(data.get("accountname"));
				
		 Page.menu.signOut();
		 
		 Assert.fail("Create account test failed");
		 
		
	}

}
