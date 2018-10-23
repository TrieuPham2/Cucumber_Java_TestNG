package spark.actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import spark.steps.UserSteps;

/**
 * Created by pchien on 10/21/15.
 */
public class ChangeLanguage {
    UserSteps userSteps = new UserSteps();

    @Given("^Currently selected language is English$")
    public void Currently_selected_language_is_English() throws Throwable {
        //Do nothing
    }

    @When("^I go to Options screen$")
    public void I_go_to_Options_screen() throws Throwable {
        userSteps.go_to_options_page();
    }

    @When("^I go to Language screen$")
    public void I_go_to_Language_screen() throws Throwable {
        userSteps.go_to_language_screen();
    }

    @And("^I change the language from English to Vietnamese$")
    public void I_change_the_language_from_English_to_Vietnamese() throws Throwable {
        userSteps.change_language("Vietnamese");
    }

    @Then("^Language is changed to Vietnamese$")
    public void Language_is_changed_to_Vietnamese() throws Throwable {
        userSteps.verify_language("Tiếng Việt");
    }

    @Given("^Currently selected language is Vietnamese$")
    public void Currently_selected_language_is_Vietnamese() throws Throwable {
        //Do nothing
    }

    @And("^I change the language from Vietnamese to English$")
    public void I_change_the_language_from_Vietnamese_to_English() throws Throwable {
        userSteps.change_language("English");
    }

    @Then("^Language is changed to English$")
    public void Language_is_changed_to_English() throws Throwable {
        userSteps.verify_language("English");
    }
}
