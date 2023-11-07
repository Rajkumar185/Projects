package cucumber2;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/cucumber2",glue="cucumber2",
monochrome=true,plugin= {"html:target/Amazoncucumber.html"})
public class RunnerAmazon extends AbstractTestNGCucumberTests{
}
