package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import base.BaseTest;

public class CameraFunctionality extends BaseTest {
	WebDriver driver;

	By choosecamera = By.linkText("Cameras");
	By dropdown = By.id("input-sort");
	By selectshow = By.id("input-limit");

	public CameraFunctionality(WebDriver driver) {
		this.driver = driver;
	}

	public void selectcamera() {
		driver.findElement(choosecamera).click();

		WebElement sortDropdown = driver.findElement(dropdown);
		Select sortSelect = new Select(sortDropdown);
		sortSelect.selectByVisibleText("Price (High > Low)");

		WebElement showDropdown = driver.findElement(selectshow);
		Select showSelect = new Select(showDropdown);
		showSelect.selectByVisibleText("100");
	}
}
