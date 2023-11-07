package cucumber1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/cucumber1",glue="cucumber1",
monochrome=true,plugin= {"html:target/cucumber.html"})
public class RunnerIrctc extends AbstractTestNGCucumberTests{

}
