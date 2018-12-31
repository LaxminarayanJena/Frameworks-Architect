package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CarsSearchStep {

	
	WebDriver driver;
	@Before
	public void setUp()
	{
		driver= new ChromeDriver();
	}
	
	@After
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			byte[] screenshotBytes=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotBytes, "image/png");
		}
		
		if(driver!=null)
		{
			driver.quit();
		}
	}
	
	@Given("^i am on the homepage https://www\\.carsguide\\.com\\.au/ website$")
	public void i_am_on_the_homepage_https_www_carsguide_com_au_website() {

		driver.get("https://www.carsguide.com.au");
		driver.manage().window().maximize();
	}

	@When("^i move to buy\\+sale menu$")
	public void i_move_to_buy_sale_menu() {

		WebElement menu= driver.findElement(By.xpath(".//*[@id='u_H']/div/div[1]/ul/li[1]/a"));
		new Actions(driver).moveToElement(menu).perform();
	}

	@Then("^I click on search cars$")
	public void i_click_on_search_cars() {

		driver.findElement(By.xpath(".//*[@id='u_H']/div/div[1]/ul/li[1]/div/div/div[1]/ul/li[1]/a")).click();
	}

	@Then("^i select make as \"([^\"]*)\"$")
	public void i_select_make_as(String make) throws InterruptedException {
		
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(".//*[@id='makes']"))).selectByVisibleText(make);

	}

	@Then("^I select model as \"([^\"]*)\"$")
	public void i_select_model_as(String model) throws InterruptedException {
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(".//*[@id='models']"))).selectByVisibleText(model);
	}

	@Then("^select location as \"([^\"]*)\"$")
	public void select_location_as(String location) throws InterruptedException {

		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(".//*[@id='locations']"))).selectByVisibleText(location);
	}

	@Then("^I click on Find My next car button$")
	public void i_click_on_Find_My_next_car_button() {

		driver.findElement(By.xpath(".//*[@id='search-submit']")).click();
	}

	@Then("^I should see list of searched cars from \"([^\"]*)\"$")
	public void i_should_see_list_of_searched_cars(String cars) {

		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='pos0']/div[2]/div[2]/div[1]/div[1]/h5")).getText().contains(cars));
	}

	@Then("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String expected) {

		Assert.assertEquals(expected, driver.getTitle());
	}

}
