package runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com/features/lecc/orange-jsbuttons.feature",
glue = "stepsdefinition")

public class RunTest {
}






