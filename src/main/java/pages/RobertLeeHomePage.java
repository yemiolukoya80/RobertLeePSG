package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class RobertLeeHomePage {

	WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);

	public RobertLeeHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	// Request an appointment tab
	@FindBy(xpath = "//span[text()=\"Request an appointment\"]")
	WebElement requestAnAppointmentTab;

	public boolean isRequestAnAppointmentTab()

	{
		try {
			return (requestAnAppointmentTab.isDisplayed());
		} catch (Exception e) {
			return (false);
		}

	}

	// Get page title
	public String getRobertLeeHomePageTitle() {
		return driver.getTitle();
	}

	// Search field
	@FindBy(xpath = "//div[@class=\"site-header__button site-header__button-search\"]")
	WebElement searchField;

	public boolean isSearchFieldDisplayed()

	{
		try {
			return (searchField.isDisplayed());
		} catch (Exception e) {
			return (false);
		}

	}

	// treatment tab
	@FindBy(xpath = "//a[@href=\"/treatments\"][@class=\"bttn bttn-secondary bttn-primary-diff\"]")
	WebElement treatmentTab;

	public boolean isTreatmentTabDisplayed()

	{
		try {
			return (treatmentTab.isDisplayed());
		} catch (Exception e) {
			return (false);
		}

	}

	// contact us tab
	@FindBy(xpath = "//div[@class=\"landing-cta__container_bottom\"]//a[text()=\"Contact us\"]")
	WebElement contactUsTab;

	public boolean isContactUsTabDisplayed()

	{
		try {
			return (contactUsTab.isDisplayed());
		} catch (Exception e) {
			return (false);
		}

	}

	// research tab
	@FindBy(xpath = "//a[text()=\" Research \"]")
	WebElement researchTab;

	public boolean isResearchTabDisplayed()

	{
		try {
			return (researchTab.isDisplayed());
		} catch (Exception e) {
			return (false);
		}

	}

	// Getting footer count
	public int getFooterLinksCount() {
		return driver.findElements(By.xpath("//div[@class=\"row\"]//li")).size();
	}

	// Getting review links count
	public int getReviewLinksCount() {
		return driver.findElements(By.xpath("//div[@class=\"row\"]//li")).size();
	}

}
