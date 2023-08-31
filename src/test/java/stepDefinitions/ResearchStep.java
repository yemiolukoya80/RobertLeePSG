package stepDefinitions;

import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.ResearchPage;

public class ResearchStep {

	ResearchPage researchPage = new ResearchPage(DriverFactory.getDriver());


	@When("click Research link")
	public void click_research_link() {
		researchPage.clickResearchLink();
	 
	}
	@Then("page title should be Research | Robert Lee")
	public void page_title_should_be_research_robert_lee() {
	    Assert.assertEquals(researchPage.getTreatmentsPageTitle(), "Research | Robert Lee");
	}



}
