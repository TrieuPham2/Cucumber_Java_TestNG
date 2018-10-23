@Regression @Login
Feature: Login to Spark
  As a user I want to login to Spark

  @before
  Scenario Outline: User logs into Spark with wrong Email
    Given I didnt install Facebook application
    When I click on Sign in with Facebook button
    And I enter "<username>" and "<password>" then click Login button
    Then Wrong password error is displayed
    Examples:
      | username | password |
      | axpon.spark.test1 | fortesting |

  Scenario Outline: User logs into Spark with wrong Email
    Given I didnt install Facebook application
    When I click on Sign in with Facebook button
    And I enter "<username>" and "<password>" then click Login button
    Then Wrong email error is displayed
    Examples:
      | username | password |
      | axpon.spark.test1@gmail.com | 123456 |

  Scenario Outline: User login Spark without Facebook installation
    Given I didnt install Facebook application
    When I click on Sign in with Facebook button
    And I enter "<username>" and "<password>" then click Login button
    And I click Ok to authorize the app
    Then The Main screen should be displayed
    Examples:
      | username | password |
      |axon.spark.test1@gmail.com|fortesting|