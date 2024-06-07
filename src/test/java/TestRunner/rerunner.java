package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "@target/failedscenarios.txt",
        glue = {"stepDefinition"},
        dryRun = false,
        monochrome = true

)


public class rerunner {
}
