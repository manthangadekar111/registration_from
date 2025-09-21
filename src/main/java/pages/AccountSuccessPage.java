package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountSuccessPage {
	public static WebDriver driver;

	By successMsg = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");

	public AccountSuccessPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isRegistrationSuccess() {
		return driver.findElement(successMsg).isDisplayed();

	}
}
