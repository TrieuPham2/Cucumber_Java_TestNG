@Regression @Login
Feature: Cucumber study
  As a user I want to login to Spark

  @before @after
  Scenario Outline: User login Spark without Facebook installation
    Given I didnt install Facebook application
    When I click on Sign in with Facebook button
    And I enter "<username>" and "<password>" then click Login button
    And I click Ok to authorize the app
    Then The Main screen should be displayed
    Examples:
      | username | password |
      |axon.spark.test1@gmail.com|fortesting|