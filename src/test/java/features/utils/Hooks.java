package features.utils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BasePage {

    @Before
    public void setup() throws Exception {
        setUp();
    }

    @After
    public void teardown(){
        tearDown();
    }
}
