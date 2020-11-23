$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Get In Touch",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Data Driven Empty Fields",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "name": "I Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepsDefinitions.stepsDefinitionLogin.i_Launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "A user is in the homepage \"https://decemberlabs.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepsDefinitions.stepsDefinitionLogin.i_open_orange_hrm_homepage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "Then "
});
formatter.match({
  "location": "stepsDefinitions.stepsDefinitionLogin.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User leaves fields empty",
  "keyword": "And "
});
formatter.match({
  "location": "stepsDefinitions.BlogSteps.user_Enter_Email_as_and_password_as()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepsDefinitions.stepsDefinitionLogin.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Data Driven",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "name": "I Launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "name": "A user is in the homepage \"https://decemberlabs.com/\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "name": "User fill the fields \"\u003cname\u003e\" and \"\u003cemail\u003e\" and \"\u003ccompany\u003e\" and \"\u003cmessage\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Page Should send correctly",
  "keyword": "Then "
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "email",
        "company",
        "message"
      ]
    },
    {
      "cells": [
        "Test",
        "test@decemberlabs.com",
        "Test",
        "Test"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Data Driven",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "name": "I Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepsDefinitions.stepsDefinitionLogin.i_Launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "A user is in the homepage \"https://decemberlabs.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepsDefinitions.stepsDefinitionLogin.i_open_orange_hrm_homepage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepsDefinitions.stepsDefinitionLogin.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fill the fields \"Test\" and \"test@decemberlabs.com\" and \"Test\" and \"Test\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepsDefinitions.BlogSteps.user_Enter_Email_as_and_password_as(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Should send correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "stepsDefinitions.BlogSteps.pageShouldSendCorrectly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepsDefinitions.stepsDefinitionLogin.close_browser()"
});
formatter.result({
  "status": "passed"
});
});