package com.driver_initialization;

import com.constants.constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driversetup {
    private static WebDriver driver = null;

    public static WebDriver getDriver() {
        return driver;
    }

    private static Logger LOGGER = LogManager.getLogger(driversetup.class);
    public static void launchbrowser() {

        try {
            LOGGER.info("Browser loaded");
            switch (constants.Browsername) {
                case "chrome":
                    LOGGER.info("Launching" + constants.Browsername);
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    LOGGER.info("Launching" + constants.Browsername);
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    LOGGER.info("Launching" + constants.Browsername);
                    driver = new FirefoxDriver();
                    break;

                default:
                    LOGGER.info("Enter the correct browser");
                    break;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}