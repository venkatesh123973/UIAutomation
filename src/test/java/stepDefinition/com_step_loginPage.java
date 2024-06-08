package stepDefinition;

import Utilities.commonutils;
import com.constants.constants;
import com.driver_initialization.driversetup;
import com.page_objects.Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class com_step_loginPage {
    private static final Logger LOGGER = LogManager.getLogger(com_step_loginPage.class);
    @Given("the user is login to the application")
    public void the_user_is_login_to_the_application() {
        try {
            driversetup.getDriver().get(constants.APP_URL);
            driversetup.getDriver().manage().window().maximize();
        }
        catch(Exception e){
            LOGGER.error(e);
            Assert.fail(e.getMessage());
        }

    }
    @When("the user is entering the {string} and {string} in the fields")
    public void the_user_is_entering_the_and_in_the_fields(String Username, String Password) {
        try {
            Loginpage.getInstance().enterUsername(Username);
            Loginpage.getInstance().enterPassword(Password);

        }
        catch(Exception e){
            LOGGER.error(e);
            Assert.fail(e.getMessage());
        }
    }
    @Then("user is clicking the submit button")
    public void user_is_clicking_the_submit_button() {
        try {
            Loginpage.getInstance().submitbutton();

        }

        catch(Exception e){
            LOGGER.error(e);
            Assert.fail(e.getMessage());
        }
    }
    @Then("user should navigate to the Dashboard page")
    public void user_should_navigate_to_the_dashboard_page() {
        try {
            String url = driversetup.getDriver().getCurrentUrl();
            if (url.contains("dashboard")) {
                LOGGER.info("Application launched to the Dashboard page successfully");
            } else {
                LOGGER.info("Application  is not launched successfully");
            }
        }
        catch(Exception e){
            LOGGER.error(e);
            Assert.fail(e.getMessage());
        }
    }



}
