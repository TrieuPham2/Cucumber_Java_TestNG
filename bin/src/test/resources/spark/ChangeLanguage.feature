@Regression @ChangeLanguage
  Feature: Change language of Spark application
    As a user I want to change the displayed language

    Background:
      Given I didnt install Facebook application
      When I click on Sign in with Facebook button
      And I enter "axon.spark.test1@gmail.com" and "fortesting" then click Login button
      And I click Ok to authorize the app

    @before @after
    Scenario: User changes from English to Vietnamese
      Given Currently selected language is English
      When I go to Options screen
      When I go to Language screen
      And I change the language from English to Vietnamese
      Then Language is changed to Vietnamese

    @before @after
    Scenario: User changes from Vietnamese to English
      Given Currently selected language is Vietnamese
      When I go to Options screen
      When I go to Language screen
      And I change the language from Vietnamese to English
      Then Language is changed to English