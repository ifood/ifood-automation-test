import cucumber.api.CucumberOptions;
import features.utils.BasePage;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/requirements/",
        plugin = {"pretty","junit:target/cucumber/result.xml",
                "json:target/cucumber/test.json","html:target/cucumber-reports"}, monochrome = true)
public class CucumberRunTest {
}