package ListAnddTable;
import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginProdStep {

	
	@Given("^user naviagtes to facebook website$")
	public void user_naviagtes_to_facebook_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user entered \"([^\"]*)\" username$")
	public void user_entered_username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user entered \"([^\"]*)\" password$")
	public void user_entered_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@Then("^user select the age category$")
	public void user_select_the_age_category(DataTable table) throws Throwable {
	   
		List<Map<String,String>> data= table.asMaps(String.class, String.class);
		System.out.println("@And -user select the age category :"  +data.get(1).get("Age") + "selected location as : "+ data.get(1).get("location"));
	}

	@Then("^user validates the captcha image$")
	public void user_validates_the_captcha_image() throws Throwable {
	    
	    
	}
	



	@Then("^user \"([^\"]*)\" sucessfully logged in$")
	public void user_sucessfully_logged_in(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
