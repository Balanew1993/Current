$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginProfile.feature");
formatter.feature({
  "line": 2,
  "name": "LoginProfile",
  "description": "",
  "id": "loginprofile",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginProfile"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "## @author Bala"
    }
  ],
  "line": 6,
  "name": "Validation of the Login",
  "description": "",
  "id": "loginprofile;validation-of-the-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I am on the Page \"\u003cURL\u003e\" with \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "Given "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "loginprofile;validation-of-the-login;",
  "rows": [
    {
      "cells": [
        "URL",
        "Username",
        "Password"
      ],
      "line": 10,
      "id": "loginprofile;validation-of-the-login;;1"
    },
    {
      "cells": [
        "http://automationpractice.com/index.php?controller\u003dauthentication\u0026back\u003dmy-account",
        "balasubramaniant1993@outlook.com",
        "Bal@202"
      ],
      "line": 11,
      "id": "loginprofile;validation-of-the-login;;2"
    },
    {
      "cells": [
        "http://automationpractice.com/index.php?controller\u003dauthentication\u0026back\u003dmy-account",
        "balasubramaniant1993@outlook.com",
        "Bal@20204"
      ],
      "line": 12,
      "id": "loginprofile;validation-of-the-login;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 10152622100,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Validation of the Login",
  "description": "",
  "id": "loginprofile;validation-of-the-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@LoginProfile"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the Page \"http://automationpractice.com/index.php?controller\u003dauthentication\u0026back\u003dmy-account\" with \"balasubramaniant1993@outlook.com\" and \"Bal@202\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php?controller\u003dauthentication\u0026back\u003dmy-account",
      "offset": 18
    },
    {
      "val": "balasubramaniant1993@outlook.com",
      "offset": 107
    },
    {
      "val": "Bal@202",
      "offset": 146
    }
  ],
  "location": "SamplePageSD.i_am_on_the_page_on_URL(String,String,String)"
});
formatter.result({
  "duration": 10254837500,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@class\u003d\u0027logout\u0027]\"}\n  (Session info: chrome\u003d83.0.4103.97)\n  (Driver info: chromedriver\u003d2.41.578737 (49da6702b16031c40d63e5618de03a32ff6c197e),platform\u003dWindows NT 10.0.19041 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027LAPTOP-QMCOBSTM\u0027, ip: \u0027192.168.43.187\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.41.578737 (49da6702b16031..., userDataDir: C:\\Users\\Bala\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:50481}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 83.0.4103.97, webStorageEnabled: true}\nSession ID: 79dbf73a9774cf433c5e6aaa48bd31e3\n*** Element info: {Using\u003dxpath, value\u003d//a[@class\u003d\u0027logout\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.isDisplayed(Unknown Source)\r\n\tat com.cucumberFramework.page_objectrepository.SamplePagePR.Login(SamplePagePR.java:76)\r\n\tat com.cucumberFramework.step_definitions.SamplePageSD.i_am_on_the_page_on_URL(SamplePageSD.java:27)\r\n\tat ✽.Given I am on the Page \"http://automationpractice.com/index.php?controller\u003dauthentication\u0026back\u003dmy-account\" with \"balasubramaniant1993@outlook.com\" and \"Bal@202\"(LoginProfile.feature:7)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1118211900,
  "status": "passed"
});
formatter.before({
  "duration": 9320640000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Validation of the Login",
  "description": "",
  "id": "loginprofile;validation-of-the-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@LoginProfile"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the Page \"http://automationpractice.com/index.php?controller\u003dauthentication\u0026back\u003dmy-account\" with \"balasubramaniant1993@outlook.com\" and \"Bal@20204\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php?controller\u003dauthentication\u0026back\u003dmy-account",
      "offset": 18
    },
    {
      "val": "balasubramaniant1993@outlook.com",
      "offset": 107
    },
    {
      "val": "Bal@20204",
      "offset": 146
    }
  ],
  "location": "SamplePageSD.i_am_on_the_page_on_URL(String,String,String)"
});
formatter.result({
  "duration": 11460853700,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 1120843900,
  "status": "passed"
});
formatter.uri("LoginProfile2.feature");
formatter.feature({
  "line": 2,
  "name": "LoginProfile2",
  "description": "",
  "id": "loginprofile2",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginProfile"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "## @author Bala"
    }
  ],
  "line": 6,
  "name": "Validation of the Login Profile2",
  "description": "",
  "id": "loginprofile2;validation-of-the-login-profile2",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I am on the Page \"\u003cURL\u003e\" with \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "Given "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "loginprofile2;validation-of-the-login-profile2;",
  "rows": [
    {
      "cells": [
        "URL",
        "Username",
        "Password"
      ],
      "line": 10,
      "id": "loginprofile2;validation-of-the-login-profile2;;1"
    },
    {
      "cells": [
        "http://automationpractice.com/index.php?controller\u003dauthentication\u0026back\u003dmy-account",
        "balasubramaniant1993@outlook.com",
        "Bal@20204"
      ],
      "line": 11,
      "id": "loginprofile2;validation-of-the-login-profile2;;2"
    },
    {
      "cells": [
        "http://automationpractice.com/index.php?controller\u003dauthentication\u0026back\u003dmy-account",
        "balasubramaniant1993@outlook.com",
        "Bal@20204"
      ],
      "line": 12,
      "id": "loginprofile2;validation-of-the-login-profile2;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9338701400,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Validation of the Login Profile2",
  "description": "",
  "id": "loginprofile2;validation-of-the-login-profile2;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@LoginProfile"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the Page \"http://automationpractice.com/index.php?controller\u003dauthentication\u0026back\u003dmy-account\" with \"balasubramaniant1993@outlook.com\" and \"Bal@20204\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php?controller\u003dauthentication\u0026back\u003dmy-account",
      "offset": 18
    },
    {
      "val": "balasubramaniant1993@outlook.com",
      "offset": 107
    },
    {
      "val": "Bal@20204",
      "offset": 146
    }
  ],
  "location": "SamplePageSD.i_am_on_the_page_on_URL(String,String,String)"
});
formatter.result({
  "duration": 12809043500,
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 1032405400,
  "status": "passed"
});
formatter.before({
  "duration": 9337550900,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Validation of the Login Profile2",
  "description": "",
  "id": "loginprofile2;validation-of-the-login-profile2;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@LoginProfile"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the Page \"http://automationpractice.com/index.php?controller\u003dauthentication\u0026back\u003dmy-account\" with \"balasubramaniant1993@outlook.com\" and \"Bal@20204\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php?controller\u003dauthentication\u0026back\u003dmy-account",
      "offset": 18
    },
    {
      "val": "balasubramaniant1993@outlook.com",
      "offset": 107
    },
    {
      "val": "Bal@20204",
      "offset": 146
    }
  ],
  "location": "SamplePageSD.i_am_on_the_page_on_URL(String,String,String)"
});
formatter.result({
  "duration": 10353836200,
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 1133618300,
  "status": "passed"
});
});