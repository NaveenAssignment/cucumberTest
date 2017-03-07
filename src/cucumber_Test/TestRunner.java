package cucumber_Test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith (Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue = {"stepDefinations"}
		)

public class TestRunner {
	
	

}
