package spark.steps;

import core.SystemPropertiesConfiguration;
import spark.pages.*;

/**
 * Created by pchien on 10/5/15.
 */

public class UserSteps {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    OptionsPage optionsPage = new OptionsPage();
    IntroPage introPage = new IntroPage();
    LanguagePage languagePage = new LanguagePage();

    //Steps on Login page
    public void click_sign_in() throws InterruptedException{
        loginPage.click_sign_in();
    }

    public void login(String username, String password) throws InterruptedException{
        loginPage.login(username,password);
        loginPage.click_log_in();
        Thread.sleep(5000);
    }

    public void authorize_facebook() throws InterruptedException {
        loginPage.authorize_facebook();
        Thread.sleep(2000);
    }

    //Steps on Main page
    public void verify_main_page_display() throws InterruptedException {
        mainPage.isDisplayed();
    }

    public void go_to_options_page() throws InterruptedException {
        mainPage.click_menu();
    }

    //Steps on Options page
    public void sign_out() throws InterruptedException {
        if(mainPage.isDisplayed())
            mainPage.click_menu();

        optionsPage.sign_out();
    }

    public void verify_language(String language){
        optionsPage.verify_language(language);
    }

    //Steps on Intro page
    public void view_intro_screen(String screen) throws InterruptedException {
        introPage.view_intro_screen(screen);
    }

    public void skip_intro_screen() throws InterruptedException {
        introPage.click_skip_intro();
    }

    //Steps on Options page
    public void go_to_language_screen() throws InterruptedException {
        optionsPage.go_to_language_screen();
    }

    public void change_language(String language){
        languagePage.change_language(language);
    }
}