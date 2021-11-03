package Steps;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Feature"},
        tags = "@createNew",
        glue = {"Steps"}

)
public class TestRunner {

}
