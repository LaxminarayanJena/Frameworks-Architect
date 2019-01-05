package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarSearchPageLocators {

	@FindBy(how=How.XPATH, using=".//*[@id='makes']")
	public static WebElement CarMakeDropDown;
	
	
	@FindBy(how=How.XPATH, using=".//*[@id='models']")
	public static WebElement ModelDropDown;
	
	
	@FindBy(how=How.XPATH, using=".//*[@id='locations']")
	public static WebElement LocationDropDown;
	
	@FindBy(how=How.XPATH, using=".//*[@id='search-submit']")
	public static WebElement FindMyNextCar;
	
	

}
