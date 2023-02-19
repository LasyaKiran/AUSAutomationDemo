package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/appfeatures/"},glue={"stepdefinitions.pages","apphooks"},
monochrome=true,
plugin = {"pretty","json:target/JSONReportsreport.json"}, tags="@Regression"
)
public class TestRunner {

}

