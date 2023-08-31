package stepDefinitions;

import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.RobertLeeHomePage;

public class RobertLeeHomeStep {
	
	RobertLeeHomePage robertLeeHomePage = new RobertLeeHomePage(DriverFactory.getDriver());

	@Given("user launch the browser")
	public void user_launch_the_browser() {
		DriverFactory.getDriver().get("https://www.robertleespine.co.uk/");

	   
	}
	@Then("home page title should be Home | Robert Lee")
	public void home_page_title_should_be_home_robert_lee() {
		Assert.assertEquals(robertLeeHomePage.getRobertLeeHomePageTitle(), "Home | Robert Lee");
	   
	}
	@Then("there is Request an appointment tab")
	public void there_is_request_an_appointment_tab() {
		Assert.assertTrue(robertLeeHomePage.isRequestAnAppointmentTab());
	   
	}
	@Then("a search field")
	public void a_search_field() {
		Assert.assertTrue(robertLeeHomePage.isSearchFieldDisplayed());
	    
	}
	@Then("About Mr Lee tab")
	public void about_mr_lee_tab() {
	    
	}
	@Then("Treatments tab")
	public void treatments_tab() {
		Assert.assertTrue(robertLeeHomePage.isTreatmentTabDisplayed());

	}
	@Then("Research tab")
	public void research_tab() {
		Assert.assertTrue(robertLeeHomePage.isResearchTabDisplayed());

	    
	}
	@Then("{int} review links")
	public void review_links(Integer int1) {
		
	   
	}
	@Then("Contact us tab")
	public void contact_us_tab() {
		Assert.assertTrue(robertLeeHomePage.isContactUsTabDisplayed());
	}
	@Then("{int} footer links")
	public void footer_links(Integer footerLinker) {
		Assert.assertTrue(robertLeeHomePage.getFooterLinksCount()==footerLinker);

	   
	}




}
