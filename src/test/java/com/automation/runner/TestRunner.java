package com.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.automation.steps",
        plugin = "json:target/cucumber.json",
        dryRun = true
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
