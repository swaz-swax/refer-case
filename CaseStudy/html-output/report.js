$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/basicform.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Swarup"
    }
  ],
  "line": 3,
  "name": "Check basic form input",
  "description": "",
  "id": "check-basic-form-input",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#Scenario null"
    }
  ],
  "line": 7,
  "name": "Name is null",
  "description": "",
  "id": "check-basic-form-input;name-is-null",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@null-checking"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "check user name",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "enter empty value in user name text box",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "print error message for name field",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefBasicForm.check_user_name()"
});
formatter.result({
  "duration": 2763124278,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBasicForm.enter_empty_value_in_user_name_text_box()"
});
formatter.result({
  "duration": 204635481,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBasicForm.print_error_message_for_name_field()"
});
formatter.result({
  "duration": 4922481001,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Test city",
  "description": "",
  "id": "check-basic-form-input;test-city",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@null-checking"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "check user city",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "enter empty value in city text box",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "print error message for city field",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefBasicForm.check_user_city()"
});
formatter.result({
  "duration": 1438326988,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBasicForm.enter_empty_value_in_city_text_box()"
});
formatter.result({
  "duration": 290943395,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBasicForm.print_error_message_for_city_field()"
});
formatter.result({
  "duration": 4115512418,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Test password",
  "description": "",
  "id": "check-basic-form-input;test-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@null-checking"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "check user password",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "enter empty value in password text box",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "print error message for password field",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefBasicForm.check_user_password()"
});
formatter.result({
  "duration": 1280208452,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBasicForm.enter_empty_value_in_password_text_box()"
});
formatter.result({
  "duration": 352962008,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBasicForm.print_error_message_for_password_field()"
});
formatter.result({
  "duration": 4158991496,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Test gender",
  "description": "",
  "id": "check-basic-form-input;test-gender",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@null-checking"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "check user gender",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "user forgot to select gender",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "print error message for gender field",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefBasicForm.check_user_gender()"
});
formatter.result({
  "duration": 1438623521,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBasicForm.user_forgot_to_select_gender()"
});
formatter.result({
  "duration": 354480515,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBasicForm.print_error_message_for_gender_field()"
});
formatter.result({
  "duration": 4122307091,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Test language",
  "description": "",
  "id": "check-basic-form-input;test-language",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@null-checking"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "check user language",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "user forgot to check language check box",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "print error message for language field",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefBasicForm.check_user_language()"
});
formatter.result({
  "duration": 1357788465,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBasicForm.user_forgot_to_check_language_check_box()"
});
formatter.result({
  "duration": 426913645,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBasicForm.print_error_message_for_language_field()"
});
formatter.result({
  "duration": 4115901113,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Test country",
  "description": "",
  "id": "check-basic-form-input;test-country",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@null-checking"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "check user country",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "user forgot to select country from drop down",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "print error message for country field",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefBasicForm.check_user_country()"
});
formatter.result({
  "duration": 1327976813,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBasicForm.user_forgot_to_select_country_from_drop_down()"
});
formatter.result({
  "duration": 562480694,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBasicForm.print_error_message_for_country_field()"
});
formatter.result({
  "duration": 4131354139,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Test My Number",
  "description": "",
  "id": "check-basic-form-input;test-my-number",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@null-checking"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "check user MyNumber",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "enter empty value in My number text box",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "print error message for My number field",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefBasicForm.check_user_MyNumber()"
});
formatter.result({
  "duration": 1367673487,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBasicForm.enter_empty_value_in_My_number_text_box()"
});
formatter.result({
  "duration": 818505231,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBasicForm.print_error_message_for_My_number_field()"
});
formatter.result({
  "duration": 4129093230,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Test email",
  "description": "",
  "id": "check-basic-form-input;test-email",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 41,
      "name": "@null-checking"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "check user email",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "enter empty value in email text box",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "print error message for email field",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefBasicForm.check_user_email()"
});
formatter.result({
  "duration": 1394962684,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBasicForm.enter_empty_value_in_email_text_box()"
});
formatter.result({
  "duration": 867917541,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBasicForm.print_error_message_for_email_field()"
});
formatter.result({
  "duration": 4113260470,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "Test Mobile Number",
  "description": "",
  "id": "check-basic-form-input;test-mobile-number",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 46,
      "name": "@null-checking"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "check user Mobile Number",
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "enter empty value in Mobile number text box",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "print error message for Mobile number field",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefBasicForm.check_user_Mobile_Number()"
});
formatter.result({
  "duration": 1497251411,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBasicForm.enter_empty_value_in_Mobile_number_text_box()"
});
formatter.result({
  "duration": 1002825816,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBasicForm.print_error_message_for_Mobile_number_field()"
});
formatter.result({
  "duration": 4098830591,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 94,
      "value": "#Scenario-valid datas"
    }
  ],
  "line": 96,
  "name": "Registration successful",
  "description": "",
  "id": "check-basic-form-input;registration-successful",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 95,
      "name": "@null-checking"
    }
  ]
});
formatter.step({
  "line": 97,
  "name": "check user details",
  "keyword": "Given "
});
formatter.step({
  "line": 98,
  "name": "entered all valid datas",
  "keyword": "When "
});
formatter.step({
  "line": 99,
  "name": "print success message",
  "keyword": "Then "
});
formatter.step({
  "line": 100,
  "name": "navigate to login page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefBasicForm.check_user_details()"
});
formatter.result({
  "duration": 1462449888,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBasicForm.entered_all_valid_datas()"
});
formatter.result({
  "duration": 977656728,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBasicForm.print_success_message()"
});
formatter.result({
  "duration": 4104191235,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBasicForm.navigate_to_login_page()"
});
formatter.result({
  "duration": 275145621,
  "error_message": "org.openqa.selenium.NoSuchSessionException: invalid session id\n  (Driver info: chromedriver\u003d2.44.609538 (b655c5a60b0b544917107a59d4153d4bf78e1b90),platform\u003dWindows NT 6.2.9200 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.13.0\u0027, revision: \u00272f0d292\u0027, time: \u00272018-06-25T15:24:21.231Z\u0027\nSystem info: host: \u0027SWARUP\u0027, ip: \u0027192.168.29.104\u0027, os.name: \u0027Windows 8\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.2\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.44.609538 (b655c5a60b0b54..., userDataDir: C:\\Users\\SWARUP~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:64014}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 70.0.3538.110, webStorageEnabled: true}\nSession ID: 076d65b4b759df8aabe068ca5739f1bb\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteNavigation.to(RemoteWebDriver.java:853)\r\n\tat com.cg.trg.casestudy.StepDefBasicForm.navigate_to_login_page(StepDefBasicForm.java:363)\r\n\tat ✽.And navigate to login page(features/basicform.feature:100)\r\n",
  "status": "failed"
});
});