package stepDefinitions;

import org.junit.Assert;
import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.AboutPage;

public class AboutStep {

	AboutPage aboutPage = new AboutPage(DriverFactory.getDriver());


	@When("user click burger menu")
	public void user_click_burger_menu() {
		aboutPage.clickBurgerMenuIcon();
	}
	@When("click about link")
	public void click_about_link() {
		aboutPage.clickAboutLink();
	}
	@Then("page title should be About | Robert Lee")
	public void page_title_should_be_about_robert_lee() {
	    Assert.assertEquals(aboutPage.getAboutPageTitle(), "About | Robert Lee");
	}



}
