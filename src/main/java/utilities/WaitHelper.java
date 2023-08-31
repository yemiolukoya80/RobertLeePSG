package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

	public WebDriver driver;

	public WaitHelper(WebDriver driver) {
		this.driver = driver;

	}

	// public static WebElement WaitForElementToBeVisible(WebDriver driver,
	// WebElement ele, long timeOutInSeconds) {
	// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

	// WebElement element=
	// wait.until(ExpectedConditions.presenceOfElementLocated(ele));
	// return element;
	// }

	public static WebElement WaitForElementToBeClickable(WebDriver driver, WebElement webElement,
			long timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElement));
		return element;

	}

}
