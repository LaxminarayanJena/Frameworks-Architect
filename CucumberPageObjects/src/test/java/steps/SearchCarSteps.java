package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import utils.SeleniumDriver;

import java.util.List;

import cucumber.api.java.en.And;

public class SearchCarSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarsSearchPageActions carSearchPageActions= new CarsSearchPageActions();
	
	@Given("I am on the Home Page {string} of CarsGuide Website")
	public void i_am_on_the_Home_Page_of_CarsGuide_Website(String WebSiteUrl) {
	    SeleniumDriver.openPage(WebSiteUrl);
	}

	@When("I move to the Menu")
	public void i_move_to_the_Menu(List<String> list) {
	    
	  String menu= list.get(1);
	  System.out.println("Menu-->"+menu);
	  carsGuideHomePageActions.moveTobuyandsaleMenu();
	}

	@And("click on {string} link")
	public void click_on_link(String searchCars) {
	    
		carsGuideHomePageActions.clickOnSearchCarsMenu();

	}

	@And("select carbrand as {string} from AnyMake dropdown")
	public void select_carbrand_as_from_AnyMake_dropdown(String carBrand) {
	   
		carSearchPageActions.selectCarMaker(carBrand);
		System.out.println("Car Brand selected");

	}

	@And("select {string} as car model")
	public void select_as_car_model(String carModel) {
	    
		carSearchPageActions.selectCarModel(carModel);
	}

	@And("select location as {string} from SelectLocation dropdown")
	public void select_location_as_from_SelectLocation_dropdown(String location) {
	    
		carSearchPageActions.selectLocation(location);
	}

	@And("click on Find_My_Next_Car button")
	public void click_on_Find_My_Next_Car_button() {
	    
		carSearchPageActions.clickOnFindMyNextCarButton();
	}

	@Then("I should see list of searched cars")
	public void i_should_see_list_of_searched_cars() {
	    

	}

	@Then("the page title should be {string}")
	public void the_page_title_should_be(String string) {
	    

	}


}
