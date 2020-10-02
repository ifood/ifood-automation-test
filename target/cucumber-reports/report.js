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
formatter.scenarioOutline({
  "name": "Add new student",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@positive"
    },
    {
      "name": "@android"
    },
    {
      "name": "@ios"
    }
  ]
});
formatter.step({
  "name": "she fills the fields with the following values",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "code",
        "\u003ccode\u003e"
      ]
    },
    {
      "cells": [
        "student name",
        "\u003cstudent_name\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "she triggers the save option",
  "keyword": "When "
});
formatter.step({
  "name": "a successful message should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "the student added should be displayed in the list",
  "keyword": "And "
});
formatter.step({
  "name": "the list should contain the old students",
  "keyword": "And "
});
formatter.step({
  "name": "the list size should be increased by one item",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "code",
        "student_name"
      ]
    },
    {
      "cells": [
        "1",
        "Daniela"
      ]
    },
    {
      "cells": [
        "2",
        "Fernando"
      ]
    },
    {
      "cells": [
        "3",
        "Dourado"
      ]
    },
    {
      "cells": [
        "4",
        "Samuel"
      ]
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
  "name": "Add new student",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@add_new_student"
    },
    {
      "name": "@positive"
    },
    {
      "name": "@android"
    },
    {
      "name": "@ios"
    }
  ]
});
formatter.step({
  "name": "she fills the fields with the following values",
  "rows": [
    {
      "cells": [
        "code",
        "1"
      ]
    },
    {
      "cells": [
        "student name",
        "Daniela"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.she_fills_the_fields_with_the_following_values(String,String\u003e)"
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
  "name": "a successful message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddNewStudentSteps.aSuccessfulMessageShouldBeDisplayed()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cSalv[ar]\u003e but was:\u003cSalv[o]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat features.steps.AddNewStudentSteps.aSuccessfulMessageShouldBeDisplayed(AddNewStudentSteps.java:192)\n\tat ✽.a successful message should be displayed(src/test/resources/requirements/add_new_student.feature:16)\n",
  "status": "failed"
});
formatter.step({
  "name": "the student added should be displayed in the list",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.the_student_added_should_be_displayed_in_the_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the list should contain the old students",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.the_list_should_contain_the_old_students()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the list size should be increased by one item",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.the_list_size_should_be_increased_by_one_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
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
  "name": "Add new student",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@add_new_student"
    },
    {
      "name": "@positive"
    },
    {
      "name": "@android"
    },
    {
      "name": "@ios"
    }
  ]
});
formatter.step({
  "name": "she fills the fields with the following values",
  "rows": [
    {
      "cells": [
        "code",
        "2"
      ]
    },
    {
      "cells": [
        "student name",
        "Fernando"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.she_fills_the_fields_with_the_following_values(String,String\u003e)"
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
  "name": "a successful message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddNewStudentSteps.aSuccessfulMessageShouldBeDisplayed()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cSalv[ar]\u003e but was:\u003cSalv[o]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat features.steps.AddNewStudentSteps.aSuccessfulMessageShouldBeDisplayed(AddNewStudentSteps.java:192)\n\tat ✽.a successful message should be displayed(src/test/resources/requirements/add_new_student.feature:16)\n",
  "status": "failed"
});
formatter.step({
  "name": "the student added should be displayed in the list",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.the_student_added_should_be_displayed_in_the_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the list should contain the old students",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.the_list_should_contain_the_old_students()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the list size should be increased by one item",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.the_list_size_should_be_increased_by_one_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
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
  "name": "Add new student",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@add_new_student"
    },
    {
      "name": "@positive"
    },
    {
      "name": "@android"
    },
    {
      "name": "@ios"
    }
  ]
});
formatter.step({
  "name": "she fills the fields with the following values",
  "rows": [
    {
      "cells": [
        "code",
        "3"
      ]
    },
    {
      "cells": [
        "student name",
        "Dourado"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.she_fills_the_fields_with_the_following_values(String,String\u003e)"
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
  "name": "a successful message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddNewStudentSteps.aSuccessfulMessageShouldBeDisplayed()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cSalv[ar]\u003e but was:\u003cSalv[o]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat features.steps.AddNewStudentSteps.aSuccessfulMessageShouldBeDisplayed(AddNewStudentSteps.java:192)\n\tat ✽.a successful message should be displayed(src/test/resources/requirements/add_new_student.feature:16)\n",
  "status": "failed"
});
formatter.step({
  "name": "the student added should be displayed in the list",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.the_student_added_should_be_displayed_in_the_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the list should contain the old students",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.the_list_should_contain_the_old_students()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the list size should be increased by one item",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.the_list_size_should_be_increased_by_one_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
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
  "error_message": "org.openqa.selenium.WebDriverException: An unknown server-side error occurred while processing the command. Original error: Could not proxy command to remote server. Original error: Error: socket hang up\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Diogos-MacBook-Pro.local\u0027, ip: \u00272804:431:cfd6:17a2:c0ae:46bd:ad51:79b3%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.1\u0027, java.version: \u002713.0.1\u0027\nDriver info: io.appium.java_client.AppiumDriver\nCapabilities {app: /Users/diogodourado/Projeto..., appActivity: host.exp.exponent.MainActivity, appPackage: com.ifood.testqa, autoWebviewTimeout: 4, automationName: UiAutomator2, databaseEnabled: false, desired: {app: /Users/diogodourado/Projeto..., appActivity: host.exp.exponent.MainActivity, appPackage: com.ifood.testqa, autoWebviewTimeout: 4, automationName: UiAutomator2, deviceName: Awsomedroid, platformName: android, resetKeyboard: true, udid: emulator-5554, unicodeKeyboard: true}, deviceApiLevel: 29, deviceManufacturer: Google, deviceModel: Android SDK built for x86, deviceName: emulator-5554, deviceScreenDensity: 560, deviceScreenSize: 1440x2560, deviceUDID: emulator-5554, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, pixelRatio: 3.5, platform: LINUX, platformName: LINUX, platformVersion: 10, resetKeyboard: true, statBarHeight: 84, takesScreenshot: true, udid: emulator-5554, unicodeKeyboard: true, viewportRect: {height: 2308, left: 0, top: 84, width: 1440}, warnings: {}, webStorageEnabled: false}\nSession ID: 3256a5e6-67da-4854-a434-25305e5f516e\n*** Element info: {Using\u003dxpath, value\u003d//android.widget.EditText[@content-desc\u003d\u0027email\u0027]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:239)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:62)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByXPath(DefaultGenericMobileDriver.java:152)\n\tat io.appium.java_client.AppiumDriver.findElementByXPath(AppiumDriver.java:1)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:58)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat features.elements_mapping.android.LoginMapping.getUserField(LoginMapping.java:23)\n\tat features.pages.android.LoginPage.login(LoginPage.java:16)\n\tat features.steps.AddNewStudentSteps.is_logged_in_the_application(AddNewStudentSteps.java:23)\n\tat ✽.\"Daniela\" is logged in the application(src/test/resources/requirements/add_new_student.feature:8)\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Add new student",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@add_new_student"
    },
    {
      "name": "@positive"
    },
    {
      "name": "@android"
    },
    {
      "name": "@ios"
    }
  ]
});
formatter.step({
  "name": "she fills the fields with the following values",
  "rows": [
    {
      "cells": [
        "code",
        "4"
      ]
    },
    {
      "cells": [
        "student name",
        "Samuel"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.she_fills_the_fields_with_the_following_values(String,String\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "she triggers the save option",
  "keyword": "When "
});
formatter.match({
  "location": "AddNewStudentSteps.she_triggers_the_save_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "a successful message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddNewStudentSteps.aSuccessfulMessageShouldBeDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the student added should be displayed in the list",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.the_student_added_should_be_displayed_in_the_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the list should contain the old students",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.the_list_should_contain_the_old_students()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the list size should be increased by one item",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.the_list_size_should_be_increased_by_one_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Cancel the add action after fill the field(s)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@positive"
    },
    {
      "name": "@android"
    },
    {
      "name": "@ios"
    }
  ]
});
formatter.step({
  "name": "she fills the fields with the following values",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "code",
        "\u003ccode\u003e"
      ]
    },
    {
      "cells": [
        "student name",
        "\u003cstudent_name\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "she triggers the cancel option",
  "keyword": "When "
});
formatter.step({
  "name": "the both fields should be cleared",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "code",
        "student_name"
      ]
    },
    {
      "cells": [
        "059",
        ""
      ]
    },
    {
      "cells": [
        "",
        "0ADouradoZ9"
      ]
    },
    {
      "cells": [
        "059",
        "0ADouradoZ9"
      ]
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
  "name": "Cancel the add action after fill the field(s)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@add_new_student"
    },
    {
      "name": "@positive"
    },
    {
      "name": "@android"
    },
    {
      "name": "@ios"
    }
  ]
});
formatter.step({
  "name": "she fills the fields with the following values",
  "rows": [
    {
      "cells": [
        "code",
        "059"
      ]
    },
    {
      "cells": [
        "student name",
        ""
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.she_fills_the_fields_with_the_following_values(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she triggers the cancel option",
  "keyword": "When "
});
formatter.match({
  "location": "AddNewStudentSteps.she_triggers_the_cancel_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the both fields should be cleared",
  "keyword": "Then "
});
formatter.match({
  "location": "AddNewStudentSteps.the_both_fields_should_be_cleared()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "Cancel the add action after fill the field(s)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@add_new_student"
    },
    {
      "name": "@positive"
    },
    {
      "name": "@android"
    },
    {
      "name": "@ios"
    }
  ]
});
formatter.step({
  "name": "she fills the fields with the following values",
  "rows": [
    {
      "cells": [
        "code",
        ""
      ]
    },
    {
      "cells": [
        "student name",
        "0ADouradoZ9"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.she_fills_the_fields_with_the_following_values(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she triggers the cancel option",
  "keyword": "When "
});
formatter.match({
  "location": "AddNewStudentSteps.she_triggers_the_cancel_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the both fields should be cleared",
  "keyword": "Then "
});
formatter.match({
  "location": "AddNewStudentSteps.the_both_fields_should_be_cleared()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "Cancel the add action after fill the field(s)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@add_new_student"
    },
    {
      "name": "@positive"
    },
    {
      "name": "@android"
    },
    {
      "name": "@ios"
    }
  ]
});
formatter.step({
  "name": "she fills the fields with the following values",
  "rows": [
    {
      "cells": [
        "code",
        "059"
      ]
    },
    {
      "cells": [
        "student name",
        "0ADouradoZ9"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.she_fills_the_fields_with_the_following_values(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she triggers the cancel option",
  "keyword": "When "
});
formatter.match({
  "location": "AddNewStudentSteps.she_triggers_the_cancel_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the both fields should be cleared",
  "keyword": "Then "
});
formatter.match({
  "location": "AddNewStudentSteps.the_both_fields_should_be_cleared()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Try to add a new student with some empty fields",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
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
      "name": "@bug-ios"
    }
  ]
});
formatter.step({
  "name": "she fills the fields with the following values",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "code",
        "\u003ccode\u003e"
      ]
    },
    {
      "cells": [
        "student name",
        "\u003cstudent_name\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "she triggers the save option",
  "keyword": "When "
});
formatter.step({
  "name": "the error message about the required field should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "the new student is not added to the list",
  "keyword": "And "
});
formatter.step({
  "name": "the completed field should remain with the written value",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "code",
        "student_name"
      ]
    },
    {
      "cells": [
        "",
        "test"
      ]
    },
    {
      "cells": [
        "12344",
        ""
      ]
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
  "name": "Try to add a new student with some empty fields",
  "description": "",
  "keyword": "Scenario Outline",
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
      "name": "@bug-ios"
    }
  ]
});
formatter.step({
  "name": "she fills the fields with the following values",
  "rows": [
    {
      "cells": [
        "code",
        ""
      ]
    },
    {
      "cells": [
        "student name",
        "test"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.she_fills_the_fields_with_the_following_values(String,String\u003e)"
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
  "name": "the error message about the required field should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddNewStudentSteps.the_error_message_about_the_required_field_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the new student is not added to the list",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.the_new_student_is_not_added_to_the_list()"
});
formatter.result({
  "error_message": "org.openqa.selenium.StaleElementReferenceException: Cached elements \u0027By.xpath: //android.widget.ScrollView/descendant::android.widget.TextView\u0027 do not exist in DOM anymore\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Diogos-MacBook-Pro.local\u0027, ip: \u00272804:431:cfd6:17a2:c0ae:46bd:ad51:79b3%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.1\u0027, java.version: \u002713.0.1\u0027\nDriver info: io.appium.java_client.AppiumDriver\nCapabilities {app: /Users/diogodourado/Projeto..., appActivity: host.exp.exponent.MainActivity, appPackage: com.ifood.testqa, autoWebviewTimeout: 4, automationName: UiAutomator2, databaseEnabled: false, desired: {app: /Users/diogodourado/Projeto..., appActivity: host.exp.exponent.MainActivity, appPackage: com.ifood.testqa, autoWebviewTimeout: 4, automationName: UiAutomator2, deviceName: Awsomedroid, platformName: android, resetKeyboard: true, udid: emulator-5554, unicodeKeyboard: true}, deviceApiLevel: 29, deviceManufacturer: Google, deviceModel: Android SDK built for x86, deviceName: emulator-5554, deviceScreenDensity: 560, deviceScreenSize: 1440x2560, deviceUDID: emulator-5554, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, pixelRatio: 3.5, platform: LINUX, platformName: LINUX, platformVersion: 10, resetKeyboard: true, statBarHeight: 84, takesScreenshot: true, udid: emulator-5554, unicodeKeyboard: true, viewportRect: {height: 2308, left: 0, top: 84, width: 1440}, warnings: {}, webStorageEnabled: false}\nSession ID: 7d61d514-7cdc-4e1a-9d8e-de7a086167ed\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:239)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat io.appium.java_client.DefaultGenericMobileElement.execute(DefaultGenericMobileElement.java:45)\n\tat io.appium.java_client.MobileElement.execute(MobileElement.java:1)\n\tat io.appium.java_client.android.AndroidElement.execute(AndroidElement.java:1)\n\tat org.openqa.selenium.remote.RemoteWebElement.getText(RemoteWebElement.java:166)\n\tat features.pages.android.AddNewStudent.checkIfTheCurrentListIsEqualToTheOldList(AddNewStudent.java:57)\n\tat features.steps.AddNewStudentSteps.the_new_student_is_not_added_to_the_list(AddNewStudentSteps.java:158)\n\tat ✽.the new student is not added to the list(src/test/resources/requirements/add_new_student.feature:47)\n",
  "status": "failed"
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
  "name": "Try to add a new student with some empty fields",
  "description": "",
  "keyword": "Scenario Outline",
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
      "name": "@bug-ios"
    }
  ]
});
formatter.step({
  "name": "she fills the fields with the following values",
  "rows": [
    {
      "cells": [
        "code",
        "12344"
      ]
    },
    {
      "cells": [
        "student name",
        ""
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.she_fills_the_fields_with_the_following_values(String,String\u003e)"
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
  "name": "the error message about the required field should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddNewStudentSteps.the_error_message_about_the_required_field_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the new student is not added to the list",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.the_new_student_is_not_added_to_the_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the completed field should remain with the written value",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.the_completed_field_should_remain_with_the_written_value()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
      "name": "@bug-android"
    },
    {
      "name": "@ios-blocked"
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
  "error_message": "org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters.\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Diogos-MacBook-Pro.local\u0027, ip: \u00272804:431:cfd6:17a2:c0ae:46bd:ad51:79b3%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.1\u0027, java.version: \u002713.0.1\u0027\nDriver info: io.appium.java_client.AppiumDriver\nCapabilities {app: /Users/diogodourado/Projeto..., appActivity: host.exp.exponent.MainActivity, appPackage: com.ifood.testqa, autoWebviewTimeout: 4, automationName: UiAutomator2, databaseEnabled: false, desired: {app: /Users/diogodourado/Projeto..., appActivity: host.exp.exponent.MainActivity, appPackage: com.ifood.testqa, autoWebviewTimeout: 4, automationName: UiAutomator2, deviceName: Awsomedroid, platformName: android, resetKeyboard: true, udid: emulator-5554, unicodeKeyboard: true}, deviceApiLevel: 29, deviceManufacturer: Google, deviceModel: Android SDK built for x86, deviceName: emulator-5554, deviceScreenDensity: 560, deviceScreenSize: 1440x2560, deviceUDID: emulator-5554, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, pixelRatio: 3.5, platform: LINUX, platformName: LINUX, platformVersion: 10, resetKeyboard: true, statBarHeight: 84, takesScreenshot: true, udid: emulator-5554, unicodeKeyboard: true, viewportRect: {height: 2308, left: 0, top: 84, width: 1440}, warnings: {}, webStorageEnabled: false}\nSession ID: 550f8b42-5f90-48d8-842e-785705c51514\n*** Element info: {Using\u003dxpath, value\u003d//android.widget.TextView[@content-desc\u003d\u0027haveCode\u0027]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:239)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:62)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByXPath(DefaultGenericMobileDriver.java:152)\n\tat io.appium.java_client.AppiumDriver.findElementByXPath(AppiumDriver.java:1)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:58)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat features.elements_mapping.android.AddNewStudentMapping.getErrorMessageAboutAlreadyAddedStudent(AddNewStudentMapping.java:80)\n\tat features.steps.AddNewStudentSteps.theErrorMessageAboutStudentAlreadyAddedShouldBeDisplayed(AddNewStudentSteps.java:219)\n\tat ✽.the error message about student already added should be displayed(src/test/resources/requirements/add_new_student.feature:58)\n",
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
  "name": "Try to add the same student twice",
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
    }
  ]
});
formatter.step({
  "name": "she adds a student with the following value",
  "rows": [
    {
      "cells": [
        "code",
        "a059z"
      ]
    },
    {
      "cells": [
        "student name",
        "Dourado"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.she_adds_a_student_with_the_following_value(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she tries to add the same student added using the same credentials",
  "keyword": "When "
});
formatter.match({
  "location": "AddNewStudentSteps.she_tries_to_add_the_same_student_added_using_the_same_credentials()"
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
  "status": "passed"
});
formatter.step({
  "name": "the completed field should remain with the written value",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewStudentSteps.the_completed_field_should_remain_with_the_written_value()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/requirements/login.feature");
formatter.feature({
  "name": "Login",
  "description": "  As a user\n  Daniela would like to access her account\n  To have accesses her student list",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
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
  "name": "\"Daniela\" is in the login screen",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.is_in_the_login_screen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "login successful",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@positive"
    },
    {
      "name": "@android"
    },
    {
      "name": "@ios"
    }
  ]
});
formatter.step({
  "name": "she fills the login fields with valid values",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.sheFillsTheLoginFieldsWithValidValues()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she triggers the log in option",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.she_triggers_the_log_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the include new student section should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_include_new_student_section_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Try login with invalid values",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@negative"
    },
    {
      "name": "@android"
    },
    {
      "name": "@ios"
    }
  ]
});
formatter.step({
  "name": "she fills the login fields with the following values",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "user",
        "\u003cuser\u003e"
      ]
    },
    {
      "cells": [
        "password",
        "\u003cpass\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "she triggers the log in option",
  "keyword": "When "
});
formatter.step({
  "name": "the error message related the login error should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "pass"
      ]
    },
    {
      "cells": [
        "teste@teste.com",
        ""
      ]
    },
    {
      "cells": [
        "",
        "123456"
      ]
    },
    {
      "cells": [
        "test@ts.com",
        ""
      ]
    },
    {
      "cells": [
        "teste@.com",
        "123456"
      ]
    },
    {
      "cells": [
        "teste@teste.com",
        "12345"
      ]
    },
    {
      "cells": [
        "teste@te.com",
        "123456"
      ]
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
  "name": "\"Daniela\" is in the login screen",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.is_in_the_login_screen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Try login with invalid values",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@negative"
    },
    {
      "name": "@android"
    },
    {
      "name": "@ios"
    }
  ]
});
formatter.step({
  "name": "she fills the login fields with the following values",
  "rows": [
    {
      "cells": [
        "user",
        "teste@teste.com"
      ]
    },
    {
      "cells": [
        "password",
        ""
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.she_fills_the_fields_with_the_following_values(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she triggers the log in option",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.she_triggers_the_log_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message related the login error should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_error_message_related_the_login_error_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "\"Daniela\" is in the login screen",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.is_in_the_login_screen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Try login with invalid values",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@negative"
    },
    {
      "name": "@android"
    },
    {
      "name": "@ios"
    }
  ]
});
formatter.step({
  "name": "she fills the login fields with the following values",
  "rows": [
    {
      "cells": [
        "user",
        ""
      ]
    },
    {
      "cells": [
        "password",
        "123456"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.she_fills_the_fields_with_the_following_values(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she triggers the log in option",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.she_triggers_the_log_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message related the login error should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_error_message_related_the_login_error_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "\"Daniela\" is in the login screen",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.is_in_the_login_screen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Try login with invalid values",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@negative"
    },
    {
      "name": "@android"
    },
    {
      "name": "@ios"
    }
  ]
});
formatter.step({
  "name": "she fills the login fields with the following values",
  "rows": [
    {
      "cells": [
        "user",
        "test@ts.com"
      ]
    },
    {
      "cells": [
        "password",
        ""
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.she_fills_the_fields_with_the_following_values(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she triggers the log in option",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.she_triggers_the_log_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message related the login error should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_error_message_related_the_login_error_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "\"Daniela\" is in the login screen",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.is_in_the_login_screen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Try login with invalid values",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@negative"
    },
    {
      "name": "@android"
    },
    {
      "name": "@ios"
    }
  ]
});
formatter.step({
  "name": "she fills the login fields with the following values",
  "rows": [
    {
      "cells": [
        "user",
        "teste@.com"
      ]
    },
    {
      "cells": [
        "password",
        "123456"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.she_fills_the_fields_with_the_following_values(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she triggers the log in option",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.she_triggers_the_log_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message related the login error should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_error_message_related_the_login_error_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "\"Daniela\" is in the login screen",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.is_in_the_login_screen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Try login with invalid values",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@negative"
    },
    {
      "name": "@android"
    },
    {
      "name": "@ios"
    }
  ]
});
formatter.step({
  "name": "she fills the login fields with the following values",
  "rows": [
    {
      "cells": [
        "user",
        "teste@teste.com"
      ]
    },
    {
      "cells": [
        "password",
        "12345"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.she_fills_the_fields_with_the_following_values(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she triggers the log in option",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.she_triggers_the_log_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message related the login error should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_error_message_related_the_login_error_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "\"Daniela\" is in the login screen",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.is_in_the_login_screen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Try login with invalid values",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@negative"
    },
    {
      "name": "@android"
    },
    {
      "name": "@ios"
    }
  ]
});
formatter.step({
  "name": "she fills the login fields with the following values",
  "rows": [
    {
      "cells": [
        "user",
        "teste@te.com"
      ]
    },
    {
      "cells": [
        "password",
        "123456"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.she_fills_the_fields_with_the_following_values(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she triggers the log in option",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.she_triggers_the_log_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message related the login error should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_error_message_related_the_login_error_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/requirements/logout.feature");
formatter.feature({
  "name": "Logout",
  "description": "  As a logged user\n  Daniela would like exit of the application\n  To protect her account",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@logout"
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
  "name": "Logout",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@logout"
    },
    {
      "name": "@positive"
    },
    {
      "name": "@android"
    },
    {
      "name": "@ios"
    }
  ]
});
formatter.step({
  "name": "he clicks on the logout option",
  "keyword": "When "
});
formatter.match({
  "location": "LogoutSteps.heClicksOnTheLogoutOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the login screen should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LogoutSteps.theLoginScreenShouldBeDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});