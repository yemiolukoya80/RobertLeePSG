package stepDefinitions;

import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.ContactPage;

public class ContactStep {
	
	
	ContactPage contactPage = new ContactPage(DriverFactory.getDriver());


	@When("click Contact link")
	public void click_contact_link() {
		contactPage.clickContactLink();
	}
	@Then("page title should be Contact | Robert Lee")
	public void page_title_should_be_contact_robert_lee() {
		Assert.assertEquals(contactPage.getContactPageTitle(), "Contact | Robert Lee");
	   
	}




}
