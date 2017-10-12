package annotation;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
    @CucumberOptions(format = {
                            "json:target/cucumber/wikipedia.json",
                            "html:target/cucumber/wikipedia.html",
                            "pretty"
    }, features = {"classpath:annotation.feature"})
    public class RunTest { }


