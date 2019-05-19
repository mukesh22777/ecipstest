package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="H:\\New folder\\workspace\\Mevan_Demo\\src\\main\\java\\Feature\\Login.feature",
glue= {"steapdefination"})

public class Testrunner {

}
