package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepdef"},
        dryRun = false,
        monochrome = true,
//		tags = "@AddPlace",
        plugin = {"pretty", "html:target/report.html"}
)
public class TestRunner {

}
