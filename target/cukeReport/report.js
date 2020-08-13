$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Resource/Features/GoogleLogin.feature");
formatter.feature({
  "line": 4,
  "name": "I want to test Login Feature in gmail",
  "description": "",
  "id": "i-want-to-test-login-feature-in-gmail",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Login Feature",
  "description": "",
  "id": "i-want-to-test-login-feature-in-gmail;login-feature",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I enter Username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on Next button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter Password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on Next Button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "i am not able to login successfully with Message \"\u003cerrorrmessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "i-want-to-test-login-feature-in-gmail;login-feature;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "errorrmessage"
      ],
      "line": 17,
      "id": "i-want-to-test-login-feature-in-gmail;login-feature;;1"
    },
    {
      "cells": [
        "hdahir2",
        "rwer",
        "Please enter the password for your Microsoft account."
      ],
      "line": 18,
      "id": "i-want-to-test-login-feature-in-gmail;login-feature;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9684361200,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "I am on Login Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 18,
  "name": "Login Feature",
  "description": "",
  "id": "i-want-to-test-login-feature-in-gmail;login-feature;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I enter Username as \"hdahir2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on Next button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter Password \"rwer\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on Next Button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "i am not able to login successfully with Message \"Please enter the password for your Microsoft account.\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "hdahir2",
      "offset": 21
    }
  ],
  "location": "MyStepDef.i_enter_Username_as(String)"
});
formatter.result({
  "duration": 375558100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.i_click_on_Next_button()"
});
formatter.result({
  "duration": 277077800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rwer",
      "offset": 18
    }
  ],
  "location": "MyStepDef.i_enter_Password(String)"
});
formatter.result({
  "duration": 1298314100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.i_click_on_Next_Button()"
});
formatter.result({
  "duration": 1276050599,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please enter the password for your Microsoft account.",
      "offset": 50
    }
  ],
  "location": "MyStepDef.i_am_not_able_to_login_successfully_with_Message(String)"
});
formatter.result({
  "duration": 153690099,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[The account or password is incorrect. Please try again].\u003e but was:\u003c[Please enter the password for your Microsoft account].\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat org.example.MyStepDef.i_am_not_able_to_login_successfully_with_Message(MyStepDef.java:34)\r\n\tat ✽.Then i am not able to login successfully with Message \"Please enter the password for your Microsoft account.\"(src/Resource/Features/GoogleLogin.feature:14)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 191920000,
  "status": "passed"
});
});