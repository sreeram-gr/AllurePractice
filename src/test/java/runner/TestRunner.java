package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/TestFeature.feature",
        glue = "stepdefinition",
        publish = true,
        plugin = {"pretty", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"})

public class TestRunner {
}
