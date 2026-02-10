package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\Features\\login.feature",glue= {"StepDefinitions"},
monochrome=true, plugin= {"pretty","html:target/loginpage.html"})
public class testRunner extends AbstractTestNGCucumberTests {

}
