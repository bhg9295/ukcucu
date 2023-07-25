package uk.visa.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",
        glue ="uk/visa",
        tags = "@regression",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html",
              }
)
public class RegressionRunner {

    @AfterClass
    public static void setUp() {


    }


}
