package com.sdet.cucumberBDD;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/webFeatures",
        glue = {"com/sdet/cucumberBDD", "com/sdet/cucumberBDD/WebHooks"},
        plugin = "pretty",
        tags = "@LT5"

)
public class WebRunner extends AbstractTestNGCucumberTests {


}
