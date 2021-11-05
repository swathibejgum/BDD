package api.cucumber.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/api/cucumber/features/LoginDemo.feature"},glue = {"api.cucumber.steps"},monochrome = true,
        plugin = {"pretty","html:target/HtmlReport",
   "json:target/report.json",
    "junit:target/report.xml"})
public class LoginDemoRunner {
}


