package testcases;

import java.util.UUID;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AccountSuccessPage;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterTest extends BaseTest {
	@BeforeMethod
    public void setUp() {
        launchBrowser();
    }

    @Test
    public void testRegistration() {
        HomePage home = new HomePage(driver);
        home.goToRegister();

        RegisterPage register = new RegisterPage(driver);
        String email = "manthan" + UUID.randomUUID().toString().substring(0, 5) + "@test.com";
        register.fillForm("Manthan", "Gadekar", email, "9876543210", "Test@123");

        AccountSuccessPage success = new AccountSuccessPage(driver);
        Assert.assertTrue(success.isRegistrationSuccess(), "❌ Registration failed");
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
}
