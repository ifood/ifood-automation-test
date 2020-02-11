package features;

import config.TestConfig;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.*;
import steps.LoginSteps;
import steps.MainSteps;
import java.net.MalformedURLException;


public class MainScenarios {

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


    @Test(enabled=true, priority = 1) public void addAlreadyExistingStudent() throws InterruptedException {
        loginSteps.login_user("teste@teste.com","123456");
        mainSteps.add_student("98839", "Igor Resende");
        mainSteps.existing_student_message_should_show("Já existe um aluno com este código!");
        //test teardown
        mainSteps.clearInputTexts();
    }

    @Test(enabled=true, priority = 2) public void addNewStudent() throws InterruptedException {
        //student could be an object
        mainSteps.add_student("1234", "Felipe Alves");
        mainSteps.student_should_be_listed("1234");
    }

    @Test(enabled=true, priority = 3) public void cancelButtonShouldClearInputs() throws InterruptedException {
        mainSteps.type_code("1234");
        mainSteps.type_student("felipe");
        mainSteps.press_cancel_button();
        mainSteps.code_and_student_inputs_should_be_empty();
    }
}
