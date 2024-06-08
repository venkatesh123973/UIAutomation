package Utilities;

import com.constants.constants;
import com.driver_initialization.driversetup;
import com.page_objects.DirectorypageObjects;
import com.page_objects.Loginpage;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import stepDefinition.browserinitialization;
import stepDefinition.com_step_loginPage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class commonutils {
    private static final Logger LOGGER = LogManager.getLogger(commonutils.class);
    public static commonutils instance;
    private commonutils(){

    }

    public static commonutils getInstance(){

        if(instance==null){
            instance = new commonutils();
        }

        return instance;

    }
    public static void loadproperties() throws FileNotFoundException {

        FileReader reader = new FileReader("configinput.properties");
        Properties prop = new Properties();
        try {

            prop.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        constants.APP_URL=prop.getProperty("APP_URL");
        constants.Browsername=prop.getProperty("Browser");
//        constants.Username=prop.getProperty("UserName");
//        constants.password=prop.getProperty("Password");
    }

  public static void initelements(){
      PageFactory.initElements(driversetup.getDriver(), Loginpage.getInstance());
      PageFactory.initElements(driversetup.getDriver(), DirectorypageObjects.getInstance());
  }

    public static void dropdown(String dropdownvalues) {
        driversetup.getDriver().findElement(By.xpath("//span[normalize-space()='" + dropdownvalues + "']")).click();
    }

    @AfterStep
    public static void takescreenshot(Scenario scenario) {
        if(scenario.isFailed()) {
             byte[] screenshot = ((TakesScreenshot) driversetup.getDriver()).getScreenshotAs(OutputType.BYTES);
             scenario.attach(screenshot,"image/png","Error Screen");
        }
    }
}
