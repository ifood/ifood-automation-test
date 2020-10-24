# UI Automation - Appium/Java

Programming language:
- Java

Tools that I have used:
- Java Development Kit 14;
- Appium;
- Maven;
- Cucumber;
- Jenkins (With maven plugin and cucumber reports)
- Xcode iPhone 11 simulator (version 13.7);
- Android Studio's emulator (Nexus 5x api 29)

### Run tests (Locally)

Prerequisites:
- Appium server must be turned on;
- The emulator (android) or simulator (ios) must be turned on. For iOS, it must be precisely iPhone 11. For android it can be whichever the executor choose.

For executing these tests locally, You must be at the root of the project's folder in order to execute maven. Once you're in there through CLI, type the following line:

````
mvn test -Dplatform=<can be android or ios>
````

Once this line is typed, the automation will catch the platform value of choice and send as a parameter to a method inside the project at Hooks.java class and initiate appium driver accordingly to its platform before the tests run:

````
@Before
    public void start(){
        initDriver(System.getProperty("platform"));
    }
````

Once this method is executed, the tests are interpreted through cucumber annotations (given, when, then) inside stepsDefinitions package from test directory. This steps calls for methods in the CommonsBasePage.java class inside pages package that is located in main folder and uses the concept of page objects and inits the elements for each screen from the application.

At the end of execution, a cucumber report is generated in both .html and .json formats in the folder **target** through a plugin parameter inside runner class (located in test folder):

````
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
                 strict = true,
                 glue = "stepsDefinitions",
                 plugin = {"pretty", "html:target/report-html", "json:target/cucumber.json"})
public class Runner {
}
````
--------------------------------------

### Run tests (Jenkins)

Prerequisites:
- Jenkins must be installed and with a static IP in URL for accessing through a node machine (slave);
- maven plugin and cucumber reports must be installed in jenkins pipeline in order to execute through jenkinsfile. You can install it by going into **Manage jenkins > Manage plugins > Available** once the jenkins server is accessible;
- A mac machine must be configured as a slave node in order for the tests to run in there. For doing this, you can access the [official jenkins documentation for configuring a node agent](https://wiki.jenkins.io/display/JENKINS/Step+by+step+guide+to+set+up+master+and+agent+machines+on+Windows). When the agent is configured, a jenkins folder must be created somewhere in the agent so jenkins can acknowledge the node and create a default workspace that is going to storage the pipeline in execution;
- For tests to run, both Appium and the emulated platform (android/ios) must be on. If not, the pipeline will fail.
**Obs: It was used a mac machine as a node for making it possible to run ios tests.**

For executing the jenkinsfile code, it must be created a new job in jenkins server as a pipeline type and give it a name. Once in the configuration steps, scroll it to the bottom to the pipeline section and add the **pipelineAppiumTest.jenkinsfile** code in there and click on save. After that, it's just a matter of running the build. The pipeline code will clone the repository into the workspace, clean the project before running, running using the **platform informed in the groovy variable from pipeline code** (must be changed if wanted to another platform to run), generate a report if tests failed or pass, and then clean workspace.

-------------------------------------------------

### Encountered bugs

**1 - Existent user message only appears for the last record in the list**

Impact: Medium

Platform:

Android - Nexus 5x api 29
iOS - iPhone 11 version 13.7

Description:

Given the user is logged in the application
And user types a student's code that already exists in the list
But the existing student's code is not the last one in the list
And user types a student's name that exists or not in the list
When user clicks on save button
Then the existent code message does not appear

Steps to reproduce:

- User types a code that already exists in the list, but is not the last inserted record;
- User types any name in the student's field;
- User clicks on save button;
- The error message for "this code already exists: does not appear, leaving the app with no feedback for the user to what happened.

**2 - Empty value can be saved in the list**

Impact: High

Platform:

Android - Nexus 5x api 29
iOS - iPhone 11 version 13.7

Description:

Given the user is logged in the application
When user types a student's id
And user types a student's name
And user wipes any of this fields
And user clicks on save
Then the app allows the insertion
And the list displays a blank field (id, name of both)

Steps to reproduce:

- User types a code (student's id);
- User types a student's name
- User wipes any of the fields (id, name or both);
- User clicks on save button;
- The app inserts the data, leaving the last inserted record with blank field(s).
