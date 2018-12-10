package com.pol.rough;

import com.pol.base.Page;
import com.pol.pages.HomePage;
import com.pol.pages.LoginPage;
import com.pol.pages.ZohoAppPage;
import com.pol.pages.crm.accounts.AccountsPage;
import com.pol.pages.crm.accounts.CreateAccountPage;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
	
/*	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\com\\pol\\executables\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.zoho.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
*/
	HomePage home = new HomePage();
	// the call of constructor of superclass -page
	home.goToLogin();
	
	LoginPage login = new LoginPage();
	
	login.doLogin("seleniumtesterbangalore@gmail.com", "123selenium*");
	
	ZohoAppPage zp= new ZohoAppPage();
	
	 zp.gotoCRM();
	 Page.menu.gotoAccounts();
	 AccountsPage account = new AccountsPage();
	 account.gotoCreateAccounts();
	 
	 CreateAccountPage cap = new CreateAccountPage();
	 cap.createAccount("sel1");
	 
	}

}
