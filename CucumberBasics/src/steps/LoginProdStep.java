package steps;
import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginProdStep {

	@Before("@Sanity")
	public void setUp()
	{
		System.out.println("launch browser");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("quit browser");
	}
	@Given("^user navigates to facebook website$")
	public void user_navigates_to_facebook_website() throws Throwable {
	    
		System.out.println("user navigates to facebook website");
	}

	@When("^user validates the homepage title$")
	public void user_validates_the_homepage_title() throws Throwable {
	    
		System.out.println("user validates the homepage title");
	}


	@Then("^user entered \"([^\"]*)\" username$")
	public void user_entered_username(String arg1) throws Throwable {
		System.out.println("user entered username");
	    
	}

	@Then("^user entered \"([^\"]*)\" password$")
	public void user_entered_password(String arg1) throws Throwable {
		System.out.println("user entered password");
	    
	}
	
	@Then("^user select the age category$")
	public void user_select_the_age_category(DataTable table) throws Throwable {
	   
		List<Map<String,String>> data= table.asMaps(String.class, String.class);
		System.out.println("user select the age category :"  +data.get(1).get("Age") + "selected location as : "+ data.get(1).get("location"));
	}

	@Then("^user validates the captcha image$")
	public void user_validates_the_captcha_image() throws Throwable {
	    
		System.out.println("user validates the captcha");
	}
	



	@Then("^user \"([^\"]*)\" sucessfully logged in$")
	public void user_sucessfully_logged_in(String arg1) throws Throwable {
		System.out.println("user logged in");
	    
	}


}
