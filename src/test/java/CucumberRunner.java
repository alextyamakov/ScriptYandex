import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"}, glue = {""}, tags = {"@Test1"},
        plugin = {
            "util.AllureReporter",
        }
)
public class CucumberRunner {

}
