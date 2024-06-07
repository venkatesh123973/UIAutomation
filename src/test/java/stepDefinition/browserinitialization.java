package stepDefinition;

import Utilities.commonutils;
import com.driver_initialization.driversetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.time.Duration;


public class browserinitialization {

    public static WebDriver driver;
    public static String scenarioname;

    public static String getScenarioname() {
        return scenarioname;
    }

    private static final Logger LOGGER = LogManager.getLogger(browserinitialization.class);
    @Before
    public void beforeScenario(Scenario scenario){
        try{
            scenarioname=scenario.getName();
            LOGGER.info("Execution Started");

            LOGGER.info("Properties file loaded");
            commonutils.getInstance().loadproperties();

            if(driver==null){
                driversetup.launchbrowser();
                LOGGER.info("Browser is launched");
                commonutils.getInstance().initelements();
                driversetup.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            }
        }

        catch(Exception e){
         e.printStackTrace();
        }
    }

    @After
    public void teardown(){
        driversetup.getDriver().quit();
    }

        }

