package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By phone = By.id("input-telephone");
    By password = By.id("input-password");
    By confirmPassword = By.id("input-confirm");
    By agreePolicy = By.name("agree");
    By continueBtn = By.xpath("//input[@value='Continue']");

    public void fillForm(String fname, String lname, String emailVal, String phoneVal, String pass) {
        driver.findElement(firstName).sendKeys(fname);
        driver.findElement(lastName).sendKeys(lname);
        driver.findElement(email).sendKeys(emailVal);
        driver.findElement(phone).sendKeys(phoneVal);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(confirmPassword).sendKeys(pass);
        driver.findElement(agreePolicy).click();
        driver.findElement(continueBtn).click();
    }
}
