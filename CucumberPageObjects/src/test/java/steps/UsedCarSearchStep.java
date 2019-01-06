package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.UsedCarsSearchPageActions;
import utils.SeleniumDriver;

import java.util.List;

import org.testng.Assert;

import cucumber.api.java.en.And;

public class UsedCarSearchStep {
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	UsedCarsSearchPageActions usedcarSearchPageActions= new UsedCarsSearchPageActions();
	
	
	@Given("I navigate to the  HomePage {string} of CarsGuide Website")
	public void i_navigate_to_the_HomePage_of_CarsGuide_Website(String WebSiteUrl) {
		 SeleniumDriver.openPage(WebSiteUrl);
	    
	}

	@When("I move to the topMenu")
	public void i_move_to_the_topMenu(List<String> list) {
    
		 String menu= list.get(1);
		  System.out.println("Menu-->"+menu);
		  carsGuideHomePageActions.moveTobuyandsaleMenu();
	}

	@When("click on the sub menu {string} link")
	public void click_on_the_sub_menu_link(String searchCars) {
		carsGuideHomePageActions.clickOnSearchCarsMenu();
	    
	}

	@When("select carmake as {string} from AnyMake dropdown")
	public void select_carmake_as_from_AnyMake_dropdown(String carBrand) {
		usedcarSearchPageActions.selectCarMaker(carBrand);
		System.out.println("Car Brand selected");

	    
	}

	@When("select the CarModel")
	public void select_the_CarModel(List<String> list) {
		
		 String carModel= list.get(1);
		usedcarSearchPageActions.selectCarModel(carModel);
	    
	}

	@When("select location  from SelectLocation dropdown as {string}")
	public void select_location_from_SelectLocation_dropdown_as(String location) {
		usedcarSearchPageActions.selectLocation(location);
	    
	}

	@When("click on FindMyNextCar button")
	public void click_on_FindMyNextCar_button() {
		usedcarSearchPageActions.clickOnFindMyNextCarButton();
	    
	}

	@Then("I should see list of used cars")
	public void i_should_see_list_of_used_cars() {
		System.out.println("Car List Found");
	    
	}

	@Then("the page title should match expected title {string}")
	public void the_page_title_should_match_expected_title(String expectedPageTitle) {
	    
		 String ActualPageTitle= SeleniumDriver.getDriver().getTitle();
		    System.out.println("Actual page title-->"+ActualPageTitle);
		    System.out.println("Expected page title-->"+expectedPageTitle);
		    Assert.assertEquals(expectedPageTitle, ActualPageTitle);
	}


}
