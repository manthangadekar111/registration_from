package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class Searchproduct extends BaseTest {

	public WebDriver driver;

	By SearchItem = By.xpath("//input[@name='search']");
	By clickProduct = By.xpath("//span[@class='input-group-btn']");

	public Searchproduct(WebDriver driver) {
		this.driver = driver;
	}

	public void search() {
		driver.findElement(SearchItem).sendKeys("iphone");

		driver.findElement(clickProduct).click();
	}

}
