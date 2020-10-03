$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/requirements/add_new_student.feature");
formatter.feature({
  "name": "Add new student",
  "description": "  As a logged user\n  Daniela would like to add new students\n  To increase her contacts and found the students by id",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@add_new_student"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "\"Daniela\" is logged in the application",
  "keyword": "Given "
});
formatter.match({
  "location": "AddNewStudentSteps.is_logged_in_the_application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Try to add a student already present in the list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@add_new_student"
    },
    {
      "name": "@negative"
    },
    {
      "name": "@android"
    },
    {
      "name": "@ios"
    },
    {
      "name": "@bug-android"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "she fills the fields with an added student",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.sheFillsTheFieldsWithAnAddedStudent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she triggers the save option",
  "keyword": "When "
});
formatter.match({
  "location": "AddNewStudentSteps.she_triggers_the_save_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message about student already added should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddNewStudentSteps.theErrorMessageAboutStudentAlreadyAddedShouldBeDisplayed()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters.\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Diogos-MacBook-Pro.local\u0027, ip: \u00272804:431:cfc7:54d:a979:ce39:48aa:b693%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.1\u0027, java.version: \u002713.0.1\u0027\nDriver info: io.appium.java_client.AppiumDriver\nCapabilities {app: /Users/diogodourado/Projeto..., autoLaunch: true, browserName: , databaseEnabled: false, deviceName: iPhone 8, javascriptEnabled: true, launchTimeout: 20000, locationContextEnabled: false, networkConnectionEnabled: false, newCommandTimeout: 18000, platform: MAC, platformName: MAC, platformVersion: 13.3, takesScreenshot: true, udid: DE30F58D-9255-46BA-BC67-4AB..., webStorageEnabled: false, xcodeOrgId: 42BJ74CFXP, xcodeSigningId: iPhone Developer}\nSession ID: 2688611f-a5cb-4e0b-bd6b-18e18710c941\n*** Element info: {Using\u003dname, value\u003dhaveCode}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:239)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:62)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:404)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByName(DefaultGenericMobileDriver.java:118)\n\tat io.appium.java_client.AppiumDriver.findElementByName(AppiumDriver.java:1)\n\tat org.openqa.selenium.By$ByName.findElement(By.java:284)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:58)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat features.elements_mapping.ios.AddNewStudentMapping.getErrorMessageAboutAlreadyAddedStudent(AddNewStudentMapping.java:69)\n\tat features.steps.AddNewStudentSteps.theErrorMessageAboutStudentAlreadyAddedShouldBeDisplayed(AddNewStudentSteps.java:223)\n\tat ✽.the error message about student already added should be displayed(src/test/resources/requirements/add_new_student.feature:58)\n",
  "status": "failed"
});
formatter.step({
  "name": "the new student is not added to the list",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.the_new_student_is_not_added_to_the_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the completed field should remain with the written value",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.the_completed_field_should_remain_with_the_written_value()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});