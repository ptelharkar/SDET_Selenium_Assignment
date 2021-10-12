package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDef {
	@Given("Navigate to Google Search Application$")
	public void navigate_to_Google_Search_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Navigate to Google Search Application$");
	}

	@When("I enter search keyword$")
	public void i_enter_search_keyword() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("^I enter search keyword$");
	}

	@Then("^Click on First Search Result$")
	public void click_on_First_Search_Result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on First Search Result$");
	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Close browser$");
	}

}
