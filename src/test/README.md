# Project test ifood-app

Project made to test the application informed for the test.

## Setup

You'll need:
```bash
Java 11
Android SDK or Android Studio
XCode and XCode utilities
Appium server
```

These items must already be pre-installed on the machine which will run the tests.
(or in the container where the appium server will be run)

## Tests

For this test, I chose to evaluate only 3 flows
- Correct login
- Incorrect login
- User registration

To run the tests, you need to run the follow command:

For Android
```gradle clean test -DsuiteXML="src/test/java/suites/android/DemoTest.xml"```

For iOS:
```gradle clean test -DsuiteXML="src/test/java/suites/ios/DemoiOSTest.xml"```


The execution of the tests are based on the devices being already connected to the grid, for execution.
The suites report only one device. But it is possible to create others with other information to execute. (depends on the infra and quantity you want to perform)
On the suites, now appium server run on a local machine, is the property `url`

For the moment, leave the iOS version set to 13.3. it is an item to refactor in the future.

The project uses Appium, Gradle and TestNG as the executor.
The versions can be found in ```gradle.properties```

Ther artifacts used was taken from this repository: https://github.com/ifood/ifood-automation-test

