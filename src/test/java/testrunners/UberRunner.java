package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty",
				"html:target/MyReports/report.html",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/report.xml"},
		features = { "src/test/resources/Features/Uber.feature" }, 
		glue = {"stepdefinitions"},
		publish = true

)
public class UberRunner {

}
