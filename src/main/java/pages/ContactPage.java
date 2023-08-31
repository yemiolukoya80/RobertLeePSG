package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class ContactPage {
	WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);

	public ContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	// Click contact link
	@FindBy(xpath = "//a[text()=\"Contact\"]")
	WebElement contactLink;

	@SuppressWarnings("static-access")
	public void clickContactLink() {
		waitHelper.WaitForElementToBeClickable(driver, contactLink, 30);
		js.javaScriptClick(driver, contactLink);

	}

	// Get contact title
	public String getContactPageTitle() {
		return driver.getTitle();
	}

	// Location list
	public int getLocationCount() {
		return driver.findElements(By.xpath("//div[@class=\"map-multiple-locations-details-container\"]//li")).size();
	}

}
