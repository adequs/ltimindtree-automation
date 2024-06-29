package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.ConfigReader;
import utils.DriverFactory;

public class BaseTest {
    protected WebDriver driver;
    private ConfigReader configReader;

    @BeforeClass
    public void setUp() {
        configReader = new ConfigReader();
        driver = DriverFactory.getDriver(configReader.getBrowser());
        driver.get(configReader.getBaseUrl());
    }

    @AfterClass
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
