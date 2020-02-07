package Tests;

import Infrastructure.DriverFactory;
import Pages.LogInPage;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

public class LogInTest {

    private static LogInPage loginPage;

    @BeforeClass
    public static void ClassSetUp(){
        loginPage = new LogInPage();
    }

    @Test
    public void LoginWithSuccess() throws InterruptedException {
        loginPage.Login("teste@teste.com", "123456");
    }

    @After
    public void TestTearDown(){
        //DriverFactory.getDriver().resetApp();
    }
}
