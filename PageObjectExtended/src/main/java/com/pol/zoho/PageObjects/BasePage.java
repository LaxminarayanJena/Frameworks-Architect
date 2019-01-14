package com.pol.zoho.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pol.zoho.ExtentListeners.ExtentListeners;
import com.pol.zoho.utilities.DriverManager;

public abstract class BasePage<T> { 
	//generic class T means it can hold any type of objects
	
	protected WebDriver driver;

	public BasePage()
	{
		this.driver=DriverManager.getDriver();
	}
	
	public T openPage(Class<T> clazz)
	{
		T page =null;
		DriverManager.getDriver();
		AjaxElementLocatorFactory ajaxElemFactory = new AjaxElementLocatorFactory(driver,10);
		page= PageFactory.initElements(driver, clazz);
		PageFactory.initElements(ajaxElemFactory, page);
		ExpectedCondition pageLoadCondition =((BasePage) page).getPageLoadCondition();
		waitForPageToLoad(pageLoadCondition);
		return page;
		/*
		 * 1st- init pagefactory elements
		 * 2nd page load condition
		 * 
		 */
		
	}
	
	 public void click(WebElement element, String elementName)
	   {
		   element.click();
		   ExtentListeners.testReport.get().info("clicking on : " + elementName); 
	   }
	   
	   public void type(WebElement element,String value,String elementName)
	   {
		   element.sendKeys(value);
		   ExtentListeners.testReport.get().info("Typing in : " + elementName + "enetered the value as :" + value); 
	   }

	
	private void waitForPageToLoad(ExpectedCondition pageLoadCondition)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(pageLoadCondition);
		
	}
	
	protected abstract ExpectedCondition getPageLoadCondition();
	

}
