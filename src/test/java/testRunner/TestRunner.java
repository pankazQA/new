package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "Features",
		glue = "stepDef"
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
