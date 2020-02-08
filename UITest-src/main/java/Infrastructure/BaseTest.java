package Infrastructure;


import org.junit.After;

import static Infrastructure.DriverFactory.killDriver;

public class BaseTest {

    @After
    public void TestCleanup()
    {
        killDriver();
    }
}
