$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Feature_Login_functionalities.feature");
formatter.feature({
  "name": "Login functionalities of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.TestDef_Login_Functionalities.i_am_in_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login Menu",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.TestDef_Login_Functionalities.i_click_on_login_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify I am in Employee login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.TestDef_Login_Functionalities.verify_I_am_in_Employee_login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter login Id",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.TestDef_Login_Functionalities.i_enter_login_Id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.TestDef_Login_Functionalities.i_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.TestDef_Login_Functionalities.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will be in HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.TestDef_Login_Functionalities.i_will_be_in_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});