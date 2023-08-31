package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class TreatmentPage {
	WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);

	public TreatmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	// Click treatments link
	@FindBy(xpath = "//a[text()=\"Treatments\"]")
	WebElement treatmentsLink;

	@SuppressWarnings("static-access")
	public void clickTreatmentsLink() {
		waitHelper.WaitForElementToBeClickable(driver, treatmentsLink, 30);
		js.javaScriptClick(driver, treatmentsLink);

	}

	// Get page title
	public String getTreatmentsPageTitle() {
		return driver.getTitle();
	}

}
