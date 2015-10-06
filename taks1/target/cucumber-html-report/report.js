$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("fundtransfer.feature");
formatter.feature({
  "line": 1,
  "name": "Customer Posts on Facebook",
  "description": "     As a customer,\r\n     I want to post on facebook \r\n     so that my friends and family could see it",
  "id": "customer-posts-on-facebook",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11321862686,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Facebook post",
  "description": "",
  "id": "customer-posts-on-facebook;facebook-post",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "the user is on Facebook LoginPage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "he enters \"12bstoyanov@gmail.com\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "he enters \"password5\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "he clicks login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "he enters \"cool\" as post",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "ensure the post \"cool\" is posted",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookStepDefs.The_user_is_on_login_page()"
});
formatter.result({
  "duration": 6456130181,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12bstoyanov@gmail.com",
      "offset": 11
    }
  ],
  "location": "FacebookStepDefs.He_enters_username(String)"
});
formatter.result({
  "duration": 375363073,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password5",
      "offset": 11
    }
  ],
  "location": "FacebookStepDefs.He_enters_pass(String)"
});
formatter.result({
  "duration": 510622566,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDefs.He_clicks_login()"
});
formatter.result({
  "duration": 17185307753,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cool",
      "offset": 11
    }
  ],
  "location": "FacebookStepDefs.He_enters_a_post(String)"
});
formatter.result({
  "duration": 30220198069,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cool",
      "offset": 17
    }
  ],
  "location": "FacebookStepDefs.Ensure_the_post_is_posed(String)"
});
formatter.result({
  "duration": 182312577,
  "status": "passed"
});
formatter.after({
  "duration": 1475331524,
  "status": "passed"
});
});