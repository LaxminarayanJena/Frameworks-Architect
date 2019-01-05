package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsSearchPageActions {
	
	CarSearchPageLocators carsSearchPageLocators =null;
	
	public CarsSearchPageActions()
	{
		this.carsSearchPageLocators=new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsSearchPageLocators);		
				
	}
	
	public void selectCarMaker(String carBrand)
	{
		Select selectCarMaker=new Select(CarSearchPageLocators.CarMakeDropDown);
		selectCarMaker.selectByVisibleText(carBrand);
		
	}
	
	public void selectCarModel(String carModel)
	{
		Select selectCarModel=new Select(CarSearchPageLocators.ModelDropDown);
		selectCarModel.selectByVisibleText(carModel);
	}
	public void selectLocation(String location)
	{
		Select selectLocation=new Select(CarSearchPageLocators.LocationDropDown);
		selectLocation.selectByVisibleText(location);
	}
	
	
	public void clickOnFindMyNextCarButton()
	{
		CarSearchPageLocators.FindMyNextCar.click();
		
	}

}
