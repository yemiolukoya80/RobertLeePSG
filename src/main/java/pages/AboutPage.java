package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class AboutPage {
	WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);

	public AboutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	// Click burger menu
	@FindBy(xpath = "//span[@class=\"hamburger-inner\"]")
	WebElement burgerMenuIcon;

	@SuppressWarnings("static-access")
	public void clickBurgerMenuIcon() {
		waitHelper.WaitForElementToBeClickable(driver, burgerMenuIcon, 30);
		js.javaScriptClick(driver, burgerMenuIcon);

	}

	// Click about link
	@FindBy(xpath = "//a[text()=\"About\"]")
	WebElement aboutLink;

	@SuppressWarnings("static-access")
	public void clickAboutLink() {
		waitHelper.WaitForElementToBeClickable(driver, aboutLink, 30);
		js.javaScriptClick(driver, aboutLink);

	}
	
	// Get page title
		public String getAboutPageTitle() {
			return driver.getTitle();
		}
}
