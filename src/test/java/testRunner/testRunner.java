package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./features/addAccount.feature",
				strict = true,
				dryRun = false, 
				monochrome = true,
				glue = "stepDefinitions",
				plugin = {"pretty", "html:reports"})
public class testRunner {

}
