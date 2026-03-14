package com.sdet.CucumberBDD;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/webFeatures",
        glue = {"com/sdet/CucumberBDD", "com/sdet/CucumberBDD/WebHooks"},
        plugin = "pretty",
        tags = "@LT5"

)
public class WebRunner extends AbstractTestNGCucumberTests {


}
