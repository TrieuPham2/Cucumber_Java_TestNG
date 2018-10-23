$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ChangeLanguage.feature");
formatter.feature({
  "line": 2,
  "name": "Change language of Spark application",
  "description": "As a user I want to change the displayed language",
  "id": "change-language-of-spark-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    },
    {
      "line": 1,
      "name": "@ChangeLanguage"
    }
  ]
});
formatter.before({
  "duration": 6450997529,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I didnt install Facebook application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Sign in with Facebook button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter \"axon.spark.test1@gmail.com\" and \"fortesting\" then click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click Ok to authorize the app",
  "keyword": "And "
});
formatter.match({
  "location": "Login.i_didnt_install_Facebook_application()"
});
formatter.result({
  "duration": 410859637,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_click_on_Sign_in_with_Facebook_button()"
});
formatter.result({
  "duration": 4290204953,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "axon.spark.test1@gmail.com",
      "offset": 9
    },
    {
      "val": "fortesting",
      "offset": 42
    }
  ],
  "location": "Login.I_enter_and_then_click_Login_button(String,String)"
});
formatter.result({
  "duration": 29024563337,
  "status": "passed"
});
formatter.match({
  "location": "Login.I_click_Ok_to_authorize_the_app()"
});
formatter.result({
  "duration": 3233599119,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User changes from English to Vietnamese",
  "description": "",
  "id": "change-language-of-spark-application;user-changes-from-english-to-vietnamese",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@before"
    },
    {
      "line": 11,
      "name": "@after"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Currently selected language is English",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I go to Options screen",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I go to Language screen",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I change the language from English to Vietnamese",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Language is changed to Vietnamese",
  "keyword": "Then "
});
formatter.match({
  "location": "ChangeLanguage.Currently_selected_language_is_English()"
});
formatter.result({
  "duration": 142164,
  "status": "passed"
});
formatter.match({
  "location": "ChangeLanguage.I_go_to_Options_screen()"
});
formatter.result({
  "duration": 2374742696,
  "status": "passed"
});
formatter.match({
  "location": "ChangeLanguage.I_go_to_Language_screen()"
});
formatter.result({
  "duration": 1455823287,
  "status": "passed"
});
formatter.match({
  "location": "ChangeLanguage.I_change_the_language_from_English_to_Vietnamese()"
});
formatter.result({
  "duration": 4148728644,
  "status": "passed"
});
formatter.match({
  "location": "ChangeLanguage.Language_is_changed_to_Vietnamese()"
});
formatter.result({
  "duration": 581879176,
  "status": "passed"
});
formatter.after({
  "duration": 13034455752,
  "status": "passed"
});
formatter.before({
  "duration": 4270016253,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I didnt install Facebook application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Sign in with Facebook button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter \"axon.spark.test1@gmail.com\" and \"fortesting\" then click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click Ok to authorize the app",
  "keyword": "And "
});
formatter.match({
  "location": "Login.i_didnt_install_Facebook_application()"
});
formatter.result({
  "duration": 121054,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_click_on_Sign_in_with_Facebook_button()"
});
formatter.result({
  "duration": 4201111173,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "axon.spark.test1@gmail.com",
      "offset": 9
    },
    {
      "val": "fortesting",
      "offset": 42
    }
  ],
  "location": "Login.I_enter_and_then_click_Login_button(String,String)"
});
formatter.result({
  "duration": 29104918123,
  "status": "passed"
});
formatter.match({
  "location": "Login.I_click_Ok_to_authorize_the_app()"
});
formatter.result({
  "duration": 2606829421,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User changes from Vietnamese to English",
  "description": "",
  "id": "change-language-of-spark-application;user-changes-from-vietnamese-to-english",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@before"
    },
    {
      "line": 19,
      "name": "@after"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "Currently selected language is Vietnamese",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I go to Options screen",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I go to Language screen",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I change the language from Vietnamese to English",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Language is changed to English",
  "keyword": "Then "
});
formatter.match({
  "location": "ChangeLanguage.Currently_selected_language_is_Vietnamese()"
});
formatter.result({
  "duration": 124286,
  "status": "passed"
});
formatter.match({
  "location": "ChangeLanguage.I_go_to_Options_screen()"
});
formatter.result({
  "duration": 3209442595,
  "status": "passed"
});
formatter.match({
  "location": "ChangeLanguage.I_go_to_Language_screen()"
});
formatter.result({
  "duration": 1417353779,
  "status": "passed"
});
formatter.match({
  "location": "ChangeLanguage.I_change_the_language_from_Vietnamese_to_English()"
});
formatter.result({
  "duration": 3367779575,
  "status": "passed"
});
formatter.match({
  "location": "ChangeLanguage.Language_is_changed_to_English()"
});
formatter.result({
  "duration": 865796551,
  "status": "passed"
});
formatter.after({
  "duration": 12981002987,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Cucumber study",
  "description": "As a user I want to login to Spark",
  "id": "cucumber-study",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    },
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "User login Spark without Facebook installation",
  "description": "",
  "id": "cucumber-study;user-login-spark-without-facebook-installation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@before"
    },
    {
      "line": 5,
      "name": "@after"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I didnt install Facebook application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on Sign in with Facebook button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" then click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click Ok to authorize the app",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "The Main screen should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "cucumber-study;user-login-spark-without-facebook-installation;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "cucumber-study;user-login-spark-without-facebook-installation;;1"
    },
    {
      "cells": [
        "axon.spark.test1@gmail.com",
        "fortesting"
      ],
      "line": 14,
      "id": "cucumber-study;user-login-spark-without-facebook-installation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4495403020,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User login Spark without Facebook installation",
  "description": "",
  "id": "cucumber-study;user-login-spark-without-facebook-installation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 5,
      "name": "@after"
    },
    {
      "line": 5,
      "name": "@before"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I didnt install Facebook application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on Sign in with Facebook button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter \"axon.spark.test1@gmail.com\" and \"fortesting\" then click Login button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click Ok to authorize the app",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "The Main screen should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.i_didnt_install_Facebook_application()"
});
formatter.result({
  "duration": 141913,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_click_on_Sign_in_with_Facebook_button()"
});
formatter.result({
  "duration": 5734922853,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "axon.spark.test1@gmail.com",
      "offset": 9
    },
    {
      "val": "fortesting",
      "offset": 42
    }
  ],
  "location": "Login.I_enter_and_then_click_Login_button(String,String)"
});
formatter.result({
  "duration": 28901786412,
  "status": "passed"
});
formatter.match({
  "location": "Login.I_click_Ok_to_authorize_the_app()"
});
formatter.result({
  "duration": 2594995044,
  "status": "passed"
});
formatter.match({
  "location": "Login.the_Main_screen_should_be_displayed()"
});
formatter.result({
  "duration": 10527286851,
  "status": "passed"
});
formatter.after({
  "duration": 3736165527,
  "status": "passed"
});
});