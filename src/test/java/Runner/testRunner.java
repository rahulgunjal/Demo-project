package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "/Cucumber_javaSelenium/src/test/java/features",
		glue= "/Cucumber_javaSelenium/src/test/java/seleniumgluecode",
		//plugin = "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html", 
		monochrome = true
)

public class testRunner 
{
	

}