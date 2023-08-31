package stepDefinitions;

import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.TreatmentPage;

public class TreatmentsStep {
	
	TreatmentPage treatmentPage = new TreatmentPage(DriverFactory.getDriver());


	@When("click Treatments link")
	public void click_treatments_link() {
		treatmentPage.clickTreatmentsLink();
	}
	@Then("page title should be Treatments | Robert Lee")
	public void page_title_should_be_treatments_robert_lee() {
		
		Assert.assertEquals(treatmentPage.getTreatmentsPageTitle(), "Treatments | Robert Lee");
	}




}
