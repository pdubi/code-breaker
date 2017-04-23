package pl.home.cb.test.suites;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "junit:target/cucumber-report/junitResults.xml",
        "json:target/cucumber-report/cucumberResults.json"},
        glue = {"pl.home.cb.test.steps", "pl.home.cb.test.utils"},
        tags = {"@WIP", "~@Ignore"},
        features = "src/test/resources/Features/",
        monochrome = true,
        dryRun = false)
public class DevelopmentTestSuite {
}
