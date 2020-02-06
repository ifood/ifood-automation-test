package Infrastructure;


import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

import static Infrastructure.DriverFactory.killDriver;

public class BaseTest {


    @After
    public void TestCleanup()
    {
        killDriver();
    }
}
