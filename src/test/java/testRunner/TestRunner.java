package testRunner;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

@Test
@RunWith(Cucumber.class)
@CucumberOptions(
        features =("src/test/resources/features/Login.feature"),
        glue = "stepsDefinitions",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:test-output",
                "rerun:target/rerun.txt"},
        strict = true,
        tags = {"@SmokeTest", "@RegressionTest"}


)
public class TestRunner extends AbstractTestNGCucumberTests
{

}
