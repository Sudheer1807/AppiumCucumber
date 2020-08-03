$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/tests/cucumberTests/features/AbhiBus.feature");
formatter.feature({
  "line": 1,
  "name": "Verify User is able to search Bus",
  "description": "",
  "id": "verify-user-is-able-to-search-bus",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "Create an instance of android or ios driver before each scenario",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#  Given User has launched Abhibus \"android\" app"
    }
  ],
  "line": 6,
  "name": "User should be able to select bus",
  "description": "",
  "id": "verify-user-is-able-to-search-bus;user-should-be-able-to-select-bus",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User has launched Abhibus \"android\" app",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters Leaving from as \"Bangalore\" place",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters going to as \"Chennai\" place",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User selects departure date",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on Search button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should be able to scroll for search bus",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "android",
      "offset": 27
    }
  ],
  "location": "BaseSteps.UserLaunchAbhiBusApp(String)"
});
formatter.result({
  "duration": 43490714700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bangalore",
      "offset": 29
    }
  ],
  "location": "LoginSteps.userEntersSourceplace(String)"
});
formatter.result({
  "duration": 15180686100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chennai",
      "offset": 25
    }
  ],
  "location": "LoginSteps.userEntersdestinatinplace(String)"
});
formatter.result({
  "duration": 9683674500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userSelectsDepartureDate()"
});
formatter.result({
  "duration": 4033760500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userclickonSearchbutton()"
});
formatter.result({
  "duration": 1599964200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userShouldBeAbleToScrollforsearchbus()"
});
formatter.result({
  "duration": 10935008800,
  "status": "passed"
});
});