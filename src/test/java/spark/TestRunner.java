package spark;

import cucumber.api.CucumberOptions;


import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (       features={"src/test/resources/spark"},
                format={"pretty","html:cucumber-html-reports",
                        "json:cucumber-html-reports/cucumber.json"},
                dryRun=false,
                glue="spark.actions"
        )
public class TestRunner {

}
