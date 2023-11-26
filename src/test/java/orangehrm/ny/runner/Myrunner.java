package orangehrm.ny.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "./Features/" }, glue = "orangehrm.ny.stepdefintions"

)

public class Myrunner extends AbstractTestNGCucumberTests {

}
