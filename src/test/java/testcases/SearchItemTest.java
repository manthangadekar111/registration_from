package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Searchproduct;

public class SearchItemTest extends BaseTest {
	@BeforeMethod
	public void setUp() throws InterruptedException {
		launchBrowser();
		Thread.sleep(5000);
	}

	@Test
	public void testsearchitem() {
		Searchproduct sr = new Searchproduct(driver);
		sr.search();
	}

	@AfterMethod
	public void tearDown() {
		 closeBrowser();
	}
}
