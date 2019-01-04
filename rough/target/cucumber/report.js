$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("aa.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: LaxmiNarayanJena"
    }
  ],
  "line": 3,
  "name": "Acceptance testing to validate search cars page is working",
  "description": "In order to validate that the search cars page is working fine\r\nwe will do the acceptance testing",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Search-Cars"
    }
  ]
});
formatter.scenario({
  "line": 8,
  "name": "Validate Search Cars Page",
  "description": "",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working;validate-search-cars-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Search-Cars-Positive"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on the Home Page \"https://www.carsguide.com.au\" of CarsGuide Website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I move to the Menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ],
      "line": 11
    },
    {
      "cells": [
        "Buy+Sale"
      ],
      "line": 12
    },
    {
      "cells": [
        "reviews"
      ],
      "line": 13
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "click on \"Search Cars\" link",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "select carbrand as \"BMW\" from AnyMake dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "select \"1 SERIES\" as car model",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "select location as \"Australia\" from SelectLocation dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "click on Find_My_Next_Car button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I should see list of searched cars",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "the page title should be \"Bmw 1 Series for Sale | carsguide\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});