package Runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\login.feature",glue = {"StepDefinition"} , 

plugin = { "html:target/cucumber-reports.html"},dryRun = false,monochrome = true)

public class TestRunner {

}
