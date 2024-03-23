package RunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue="stepDefinitions",monochrome=true,
//tags="@Smoke or @Regression",
plugin={"pretty","json:target/json-report/cucumber.json","html:target/htmlreport/cucumber.html",
 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TestRunnerTestNG extends AbstractTestNGCucumberTests {

}
