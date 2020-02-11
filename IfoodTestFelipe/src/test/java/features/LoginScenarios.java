package features;

import config.TestConfig;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


import steps.LoginSteps;
import steps.MainSteps;

public class LoginScenarios {

    public AndroidDriver<MobileElement> driver;
    public LoginSteps loginSteps;
    public MainSteps mainSteps;

    @BeforeSuite
    public void setup() throws MalformedURLException {
        TestConfig testConfig = TestConfig.getInstance();
        driver = testConfig.getDriver();

        loginSteps = new LoginSteps(driver);
        mainSteps = new MainSteps(driver);

    }

    @Test(enabled=true) public void loginUser() throws InterruptedException {
        loginSteps.login_user("teste@teste.com","123456");
        mainSteps.code_input_should_be_visible();
        mainSteps.student_input_should_be_visible();

        //test teardown
        mainSteps.logout_user();
    }

    @Test(enabled=true) public void loginWithInvalidUser() throws InterruptedException {
        loginSteps.login_user("invalid@teste.com","123456");
        loginSteps.login_user_should_fail_with_message("Erro no login! :(");

        //test teardown
        loginSteps.clearInputTexts();
    }
}
