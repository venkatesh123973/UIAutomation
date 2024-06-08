package stepDefinition;

import Utilities.commonutils;
import com.page_objects.DirectorypageObjects;
import io.cucumber.java.en.Then;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class com_step_Directorypage {
//  private static Logger LOGGER = LogManager.getLogger(com_step_Directorypage.class);
  private static Logger LOGGER = LogManager.getLogger(com_step_Directorypage.class);
    @Then("user clicks on the Directory link")
    public void user_clicks_on_the_directory_link() {
      try {
        DirectorypageObjects.getInstance().clickDirectoryLink();
        LOGGER.info("Directory page navigated successfully");
      }

      catch(Exception e){
        LOGGER.error(e);

        Assert.fail(e.getMessage());
      }
    }

    @Then("user navigated to the Directory page and click on the Job title drop down")
    public void user_navigated_to_the_directory_page_and_click_on_the_job_title_drop_down() {
      try {
        DirectorypageObjects.getInstance().jobTitleDropdownactions();
        LOGGER.info("Job title Drop down button is clicked successfully");

      }

      catch(Exception e){
        LOGGER.error(e);

        Assert.fail(e.getMessage());
      }
    }

    @Then("user clicks on the {string} value from the Job title")
    public void user_clicks_on_the_value_from_the_job_title(String string) {
      try {
        commonutils.dropdown(string);
        LOGGER.info("Job title Drop down value is selected successfully");
      }

      catch(Exception e){
        LOGGER.error(e);

        Assert.fail(e.getMessage());
      }

    }

    @Then("user clicks on the {string} value from the Location option")
    public void user_clicks_on_the_value_from_the_location_option(String locationvalue) {
      try {
        DirectorypageObjects.getInstance().locationDropdownactions();
        LOGGER.info("Location Drop down button is clicked successfully");
        commonutils.dropdown(locationvalue);
        LOGGER.info("Location Drop down value is selected successfully");
      }
      catch(Exception e){
        LOGGER.error(e);

        Assert.fail(e.getMessage());
      }
    }


    @Then("user clicks on the search button")
    public void user_clicks_on_the_location_dropdown() {
      try {
        DirectorypageObjects.getInstance().submitbuttonaction();
        LOGGER.info("Submit button is clicked successfully");
      }

      catch(Exception e){
        LOGGER.error(e);

        Assert.fail(e.getMessage());
      }
    }


}
