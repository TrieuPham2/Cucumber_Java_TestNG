package spark.actions;

import core.SystemPropertiesConfiguration;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import spark.steps.UserSteps;

/**
 * Created by pchien on 10/20/15.
 */

public class Hooks {
    UserSteps userSteps = new UserSteps();

    @Before("@before")
    public void before() {
        if (SystemPropertiesConfiguration.getDriver() == null) {
            SystemPropertiesConfiguration.openDriver();
        }
    }

    @After("@after")
    public void after() throws InterruptedException {
        userSteps.sign_out();
        if (SystemPropertiesConfiguration.driver != null) {
            SystemPropertiesConfiguration.closeDriver();
            System.out.print("Driver closed!!!\n");
                //driver.quit();
        }
    }
}