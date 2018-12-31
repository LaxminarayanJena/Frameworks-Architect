$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("carSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Validation of car search page",
  "description": "In order to validate car search\r\nas a buyer\r\nI navigate https://www.carsguide.com.au/",
  "id": "validation-of-car-search-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4012608203,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Searching for a new car",
  "description": "",
  "id": "validation-of-car-search-page;searching-for-a-new-car",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "i am on the homepage https://www.carsguide.com.au/ website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "i move to buy+sale menu",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on search cars",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "i select make as \"BMW\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select model as \"1 SERIES\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select location as \"Australia\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on Find My next car button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should see list of searched cars from \"BMW\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "the page title should be \"Bmw 1 Series for Sale | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarsSearchStep.i_am_on_the_homepage_https_www_carsguide_com_au_website()"
});
formatter.result({
  "duration": 17270882641,
  "status": "passed"
});
formatter.match({
  "location": "CarsSearchStep.i_move_to_buy_sale_menu()"
});
formatter.result({
  "duration": 425861570,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\".//*[@id\u003d\u0027u_H\u0027]/div/div[1]/ul/li[1]/a1\"}\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 411 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027SELENIUM-PC\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_91\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb), userDataDir\u003dC:\\Users\\selenium\\AppData\\Local\\Temp\\scoped_dir5352_9764}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d71.0.3578.98, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: fbb60b2f89a56b07a6a3127b46ba3247\n*** Element info: {Using\u003dxpath, value\u003d.//*[@id\u003d\u0027u_H\u0027]/div/div[1]/ul/li[1]/a1}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:410)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:509)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:402)\r\n\tat steps.CarsSearchStep.i_move_to_buy_sale_menu(CarsSearchStep.java:55)\r\n\tat ✽.When i move to buy+sale menu(carSearch.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CarsSearchStep.i_click_on_search_cars()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 18
    }
  ],
  "location": "CarsSearchStep.i_select_make_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1 SERIES",
      "offset": 19
    }
  ],
  "location": "CarsSearchStep.i_select_model_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Australia",
      "offset": 20
    }
  ],
  "location": "CarsSearchStep.select_location_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CarsSearchStep.i_click_on_Find_My_next_car_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 41
    }
  ],
  "location": "CarsSearchStep.i_should_see_list_of_searched_cars(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Bmw 1 Series for Sale | carsguide",
      "offset": 26
    }
  ],
  "location": "CarsSearchStep.the_page_title_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2334472754,
  "status": "passed"
});
});