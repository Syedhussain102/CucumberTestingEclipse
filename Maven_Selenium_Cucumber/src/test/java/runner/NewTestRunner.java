package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
// in the latest jar they upgraded Cucumber.Options into CucumberOption 

@CucumberOptions(
		features="features",
        glue= {"stepDefination"},
        plugin= {"html:target/cucumber-html-reprt"})
public class NewTestRunner {
}
