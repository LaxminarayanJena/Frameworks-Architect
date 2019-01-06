package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.UsedCarSearchPageLocators;
import utils.SeleniumDriver;

public class UsedCarsSearchPageActions {
	
	UsedCarSearchPageLocators usedcarsSearchPageLocators =null;
	
	public UsedCarsSearchPageActions()
	{
		this.usedcarsSearchPageLocators=new UsedCarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedcarsSearchPageLocators);		
				
	}
	
	public void selectCarMaker(String carBrand)
	{
		Select selectCarMaker=new Select(UsedCarSearchPageLocators.CarMakeDropDown);
		selectCarMaker.selectByVisibleText(carBrand);
		
	}
	
	public void selectCarModel(String carModel)
	{
		Select selectCarModel=new Select(UsedCarSearchPageLocators.ModelDropDown);
		selectCarModel.selectByVisibleText(carModel);
	}
	public void selectLocation(String location)
	{
		Select selectLocation=new Select(UsedCarSearchPageLocators.LocationDropDown);
		selectLocation.selectByVisibleText(location);
	}
	
	
	public void clickOnFindMyNextCarButton()
	{
		UsedCarSearchPageLocators.FindMyNextCar.click();
		
	}

}
