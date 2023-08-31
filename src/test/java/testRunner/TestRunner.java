package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		 features = {"C:\\Users\\yolukoya\\workspace\\Robert_Lee\\src\\test\\resource\\features" },
//		features = { "C:\\Users\\yolukoya\\workspace\\Robert_Lee\\src\\test\\resource\\features\\KenAnson.feature" },

		glue = { "stepDefinitions", "appHooks" }, dryRun = false,
		// tags = "@sanity", //scenarios tagged with @sanity
		// tags = "@sanity and @regression", //scenarios tagged with @sanity and
		// @regression
		// tags = "@sanity or @regression", //scenarios tagged with @sanity or
		// @regression
		// tags = "@sanity and not @regression", // scenarios tagged with
		// @sanity but not @regression

		// tags = "not @UAT", // if you want to skip a scenario,

		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/", "rerun:target/rerun.txt" }, monochrome = true

)

public class TestRunner {

}
