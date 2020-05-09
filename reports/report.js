$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/account.feature");
formatter.feature({
  "name": "Manager login options",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "login steps",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Open chorme browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.steps.open_chorme_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter valid url \"http://demo.guru99.com/V4/\" to open application",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.steps.enter_valid_url_to_open_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "After launching application enter username \"mngr259062\" and password \"UsuhagY\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.steps.after_launching_application_enter_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "After that enter click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.steps.after_that_enter_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Deposit into account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@execute"
    }
  ]
});
formatter.step({
  "name": "Click on deposit link",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.steps.click_on_deposit_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add details of amount to be submitted",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.steps.add_details_of_amount_to_be_submitted()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on deposit submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.steps.click_on_deposit_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "After test is complete capture screenshot",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.steps.after_test_is_complete_capture_screenshot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the application and browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.steps.close_the_application_and_browser()"
});
formatter.result({
  "status": "passed"
});
});