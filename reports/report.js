$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/addAccount.feature");
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
  "name": "Add new account",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Click on new account link",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.steps.click_on_new_account_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fill new account form",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.steps.fill_new_account_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.steps.click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify success message with \"Account Generated Successfully!!!\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.steps.verify_success_message_with(java.lang.String)"
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