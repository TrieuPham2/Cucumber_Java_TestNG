$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Example.feature");
formatter.feature({
  "line": 2,
  "name": "Just an example",
  "description": "Just an example",
  "id": "just-an-example",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Example"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "I want to execute a specific feature",
  "description": "",
  "id": "just-an-example;i-want-to-execute-a-specific-feature",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Maven plugin is awesome",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I already installed Jenkins",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I use Maven command to control Cucumber",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I know how to operate the test",
  "keyword": "Then "
});
formatter.match({
  "location": "Example.Maven_plugin_is_awesome()"
});
formatter.result({
  "duration": 11278372500,
  "status": "passed"
});
formatter.match({
  "location": "Example.I_already_installed_Jenkins()"
});
formatter.result({
  "duration": 30500,
  "status": "passed"
});
formatter.match({
  "location": "Example.I_use_Maven_command_to_control_Cucumber()"
});
formatter.result({
  "duration": 19600,
  "status": "passed"
});
formatter.match({
  "location": "Example.I_know_how_to_operate_the_test()"
});
formatter.result({
  "duration": 41300,
  "status": "passed"
});
});