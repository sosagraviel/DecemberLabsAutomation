$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/OrangeHRM.feature");
formatter.feature({
  "name": "Logging Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepsDefinitions.OrangeHRMsteps.user_Launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User open url \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepsDefinitions.OrangeHRMsteps.user_open_url(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat stepsDefinitions.OrangeHRMsteps.user_open_url(OrangeHRMsteps.java:37)\n\tat ✽.User open url \"http://admin-demo.nopcommerce.com/login\"(file:///home/graviel/IdeaProjects/uruPago/Feature/OrangeHRM.feature:5)\n",
  "status": "failed"
});
formatter.step({
  "name": "User Enter Email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepsDefinitions.OrangeHRMsteps.user_Enter_Email_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepsDefinitions.OrangeHRMsteps.click_on_Login()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepsDefinitions.OrangeHRMsteps.page_Title_should_be(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click on log out link",
  "keyword": "When "
});
formatter.match({
  "location": "stepsDefinitions.OrangeHRMsteps.user_click_on_log_out_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Page Title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepsDefinitions.OrangeHRMsteps.page_Title_should_be(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepsDefinitions.OrangeHRMsteps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});