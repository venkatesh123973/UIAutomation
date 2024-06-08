package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/features",
glue = {"stepDefinition"},
dryRun = false,
monochrome = true,
//        plugin = {"rerun:target/failedscenarios.txt","usage","html:target/cucumber-report/report.html",
//        "json:target/cucumber-report/jsonreport.json","junit:target/cucumber-report/xmlreport.xml"}
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}


)
public class Runner {

}
