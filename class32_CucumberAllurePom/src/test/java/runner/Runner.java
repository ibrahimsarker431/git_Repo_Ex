package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src//test//resources//features"},
	
	// To add multiple features write like-
	//{"src//test//resources//features", "src//test//resources//features2", "src//test//resources//features3"},
	// Then right click on src//test//resources --> new --> package. Name the package
	
	glue = "step_definitions",
	monochrome = true,
	dryRun = false,
	plugin = {"pretty", "html:test-output", "json:target/cucumber-report/cucumber.json" })
public class Runner {

}

