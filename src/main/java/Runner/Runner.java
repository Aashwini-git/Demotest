package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"features/submit.feature"},
glue = {"StepDefination"},
plugin = {"pretty", "html:target/Cucumber.reports",
          "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",

"rerun:target/failedrerun.txt"},
tags = "@smoke",
		
monochrome = true   )
				

public class Runner extends AbstractTestNGCucumberTests {
	
	

}
