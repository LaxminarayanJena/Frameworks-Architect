package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {

	CarsGuideHomePageLocators carsGuideHomePageLocators =null;
	
	
	public CarsGuideHomePageActions()
	{
		this.carsGuideHomePageLocators=new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);		
				
	}
	

	public void moveTobuyandsaleMenu()
	{
		Actions action= new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.buyandsaleLink).perform();
	}
	public void clickOnSearchCarsMenu()
	{
		//moveToCarsForSaleMenu();
		carsGuideHomePageLocators.SearchCars.click();
		
	}
	public void clickOnUsedSearchCarsMenu()
	{
		//moveToCarsForSaleMenu();
		carsGuideHomePageLocators.usedSearchCars.click();
		
	}

}
