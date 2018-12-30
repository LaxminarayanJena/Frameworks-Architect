$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ListAndDatable.feature");
formatter.feature({
  "line": 2,
  "name": "Login to Production",
  "description": "\r\nIn order to perform sucessfull login to Production\r\nAs a user\r\nI want to enter correct username and password",
  "id": "login-to-production",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "In order to verify login to facebook production",
  "description": "",
  "id": "login-to-production;in-order-to-verify-login-to-facebook-production",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "user navigates to facebook website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user validates the homepage title",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user entered \"\u003cusername\u003e\" username",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user entered \"\u003cpassword\u003e\" password",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user select the age category",
  "rows": [
    {
      "cells": [
        "Age",
        "location"
      ],
      "line": 14
    },
    {
      "cells": [
        "below18",
        "india"
      ],
      "line": 15
    },
    {
      "cells": [
        "above18",
        "germany"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user \"\u003cloginType\u003e\" sucessfully logged in",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "login-to-production;in-order-to-verify-login-to-facebook-production;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "loginType"
      ],
      "line": 20,
      "id": "login-to-production;in-order-to-verify-login-to-facebook-production;;1"
    },
    {
      "cells": [
        "valid",
        "valid",
        "should"
      ],
      "line": 21,
      "id": "login-to-production;in-order-to-verify-login-to-facebook-production;;2"
    },
    {
      "cells": [
        "invalid",
        "invalid",
        "shouldnot"
      ],
      "line": 22,
      "id": "login-to-production;in-order-to-verify-login-to-facebook-production;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 351525,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "In order to verify login to facebook production",
  "description": "",
  "id": "login-to-production;in-order-to-verify-login-to-facebook-production;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user navigates to facebook website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user validates the homepage title",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user entered \"valid\" username",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user entered \"valid\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user select the age category",
  "rows": [
    {
      "cells": [
        "Age",
        "location"
      ],
      "line": 14
    },
    {
      "cells": [
        "below18",
        "india"
      ],
      "line": 15
    },
    {
      "cells": [
        "above18",
        "germany"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user \"should\" sucessfully logged in",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginProdStep.user_navigates_to_facebook_website()"
});
formatter.result({
  "duration": 157492461,
  "status": "passed"
});
formatter.match({
  "location": "LoginProdStep.user_validates_the_homepage_title()"
});
formatter.result({
  "duration": 298155,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 14
    }
  ],
  "location": "LoginProdStep.user_entered_username(String)"
});
formatter.result({
  "duration": 3922712,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 14
    }
  ],
  "location": "LoginProdStep.user_entered_password(String)"
});
formatter.result({
  "duration": 163703,
  "status": "passed"
});
formatter.match({
  "location": "LoginProdStep.user_select_the_age_category(DataTable)"
});
formatter.result({
  "duration": 1888485,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "should",
      "offset": 6
    }
  ],
  "location": "LoginProdStep.user_sucessfully_logged_in(String)"
});
formatter.result({
  "duration": 354091,
  "status": "passed"
});
formatter.after({
  "duration": 312010,
  "status": "passed"
});
formatter.before({
  "duration": 303286,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "In order to verify login to facebook production",
  "description": "",
  "id": "login-to-production;in-order-to-verify-login-to-facebook-production;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user navigates to facebook website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user validates the homepage title",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user entered \"invalid\" username",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user entered \"invalid\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user select the age category",
  "rows": [
    {
      "cells": [
        "Age",
        "location"
      ],
      "line": 14
    },
    {
      "cells": [
        "below18",
        "india"
      ],
      "line": 15
    },
    {
      "cells": [
        "above18",
        "germany"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user \"shouldnot\" sucessfully logged in",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginProdStep.user_navigates_to_facebook_website()"
});
formatter.result({
  "duration": 83647,
  "status": "passed"
});
formatter.match({
  "location": "LoginProdStep.user_validates_the_homepage_title()"
});
formatter.result({
  "duration": 80569,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 14
    }
  ],
  "location": "LoginProdStep.user_entered_username(String)"
});
formatter.result({
  "duration": 148821,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 14
    }
  ],
  "location": "LoginProdStep.user_entered_password(String)"
});
formatter.result({
  "duration": 139070,
  "status": "passed"
});
formatter.match({
  "location": "LoginProdStep.user_select_the_age_category(DataTable)"
});
formatter.result({
  "duration": 172940,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shouldnot",
      "offset": 6
    }
  ],
  "location": "LoginProdStep.user_sucessfully_logged_in(String)"
});
formatter.result({
  "duration": 157545,
  "status": "passed"
});
formatter.after({
  "duration": 81082,
  "status": "passed"
});
});