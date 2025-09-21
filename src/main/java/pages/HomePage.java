package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class HomePage extends BaseTest {
	WebDriver driver;

	By myAccount = By.xpath("//span[text()='My Account']");
	By register = By.linkText("Register");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void goToRegister() {
		driver.findElement(myAccount).click();
		driver.findElement(register).click();
	}
}
