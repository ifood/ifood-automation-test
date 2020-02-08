package Infrastructure;

import org.junit.After;
import static Infrastructure.DriverFactory.killDriver;

public class BaseTest {

    @After
    public void TestCleanup()
    {
        if (AppSettings.CLOSE_DRIVER_BETWEEN_TESTS){
            killDriver();
        }
    }
}
