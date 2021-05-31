package cucumberOptions;
import org.junit.*;
import org.junit.runner.RunWith;

import cucumber.api.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinations"
		)


public class TestRunner {

}
