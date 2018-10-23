@Regression @Login
Feature: Login to DOne
  As a user I want to login to DOne

  @before
  Scenario Outline: User logs into DOne with wrong Password
    Given I have an invalid email and password
    When I navigate Done website
    And I enter "<username>" and "<password>" then click Login button
    Then Wrong password error is displayed
    Examples:
      | username | password |
      | sally-dev@dac.co.jp | invalidpass |

  Scenario Outline: User logs into DOne with wrong Email
    Given I have an invalid email and password
    When I navigate Done website
    And I enter "<username>" and "<password>" then click Login button
    Then Wrong password error is displayed
    Examples:
      | username | password |
      | sally-dev@dac.co.jp123 | 123456 |

  Scenario Outline: User login DOne without Facebook installation
    Given I didnt install Facebook application
    When I click on Sign in with Facebook button
    And I enter "<username>" and "<password>" then click Login button
    And I click Ok to authorize the app
    Then The Main screen should be displayed
    Examples:
      | username | password |
      |axon.DOne.test1@gmail.com|fortesting|