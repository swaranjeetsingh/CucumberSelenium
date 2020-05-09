package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./features/account.feature",
				strict = true,
				dryRun = false, 
				monochrome = true,
				glue = "stepDefinitions",
				plugin = {"pretty", "html:reports"},
				tags = "@execute")
public class testRunner {
}
