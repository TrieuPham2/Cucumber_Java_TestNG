package spark.actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import spark.pages.LoginPage;
import spark.steps.UserSteps;

/**
 * Created by pchien on 10/5/15.
 */

public class Login {
    UserSteps userSteps = new UserSteps();
    LoginPage loginPage = new LoginPage();

    @Given("^I have an invalid email and password$")
    public void i_have_an_invalid_email_and_password() throws Throwable {
    }

    @When("^I navigate Done website$")
    public void i_navigate_done_website() throws Throwable {
    	loginPage.login("", "");
        userSteps.click_sign_in();
    }

    @And("^I enter \"([^\"]*)\" and \"([^\"]*)\" then click Login button$")
    public void I_enter_and_then_click_Login_button(String username, String password) throws Throwable {
        userSteps.login(username, password);
    }

    @And("^I click Ok to authorize the app$")
    public void I_click_Ok_to_authorize_the_app() throws Throwable {
        userSteps.authorize_facebook();
    }

    @Then("^The Main screen should be displayed$")
    public void the_Main_screen_should_be_displayed() throws Throwable {
        userSteps.skip_intro_screen();
        userSteps.verify_main_page_display();
    }

    @Then("^Wrong password error is displayed$")
    public void Wrong_password_error_is_displayed() throws Throwable {

    }

    @Then("^Wrong email error is displayed$")
    public void Wrong_email_error_is_displayed() throws Throwable {

    }
}
