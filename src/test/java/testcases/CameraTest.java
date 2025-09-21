package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.BaseTest;
import pages.CameraFunctionality;
import utils.ExtentReportManager;

public class CameraTest extends BaseTest {
    private static ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void setupReport() {
        // Initialize Extent Report only once per test class
        extent = ExtentReportManager.getReporter();
    }

    @BeforeMethod
    public void setUp() {
        launchBrowser();
    }

    @Test
    public void testRegistration() {
        test = extent.createTest("Camera Functionality Test");

        try {
            CameraFunctionality fn = new CameraFunctionality(driver);
            fn.selectcamera();

            test.log(Status.PASS, "Camera functionality executed successfully.");
        } catch (Exception e) {
            test.log(Status.FAIL, "Test failed due to exception: " + e.getMessage());
        }
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }

    @AfterClass
    public void flushReport() {
        if (extent != null) {
            extent.flush();
        }
    }
}
