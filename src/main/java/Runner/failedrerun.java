package Runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
glue = {"StepDefination"},
plugin = {"pretty", "html:target/Cucumber.reports",
          "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",

"rerun:target/failedrerun.txt"},
features = {"@target/failedrerun.txt"},

		
monochrome = true   )

public class failedrerun {

}
