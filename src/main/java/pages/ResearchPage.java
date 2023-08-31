package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class ResearchPage {
	WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);

	public ResearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	// Click research link
	@FindBy(xpath = "//a[text()=\"Research\"]")
	WebElement researchLink;

	@SuppressWarnings("static-access")
	public void clickResearchLink() {
		waitHelper.WaitForElementToBeClickable(driver, researchLink, 30);
		js.javaScriptClick(driver, researchLink);

	}

	// Get page title
	public String getTreatmentsPageTitle() {
		return driver.getTitle();
	}

}
