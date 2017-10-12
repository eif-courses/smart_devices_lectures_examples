package facebook;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {
        "json:target/fb/index.json",
        "html:target/fb/index.html",
        "pretty"
}, features = {"classpath:facebook.feature"})
public class FacebookTest { }

