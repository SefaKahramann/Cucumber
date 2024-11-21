package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles"}, // klasördeki bütün feature lar
        glue ={"StepDefinitions"}
        ,plugin= {"json:target/cucumber/cucumber.json"}
)
public class _03_TestRunnerAll extends AbstractTestNGCucumberTests {
}
