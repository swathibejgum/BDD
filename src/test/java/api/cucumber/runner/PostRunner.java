
package api.cucumber.runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/api/cucumber/features/posts.feature"},glue = {"api.cucumber.steps","api.cucumber.hooks"},
        plugin = {"pretty","html:target/HtmlReport"})
        //plugin = {"pretty","json:target/report.json"})
        //plugin = {"pretty","junit:target/report.xml"})
public class PostRunner {
}
