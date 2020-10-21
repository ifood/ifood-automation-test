package stepsDefinitions;

import core.DriverFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.PageFactory;

public class Hooks extends DriverFactory {

    @Before
    public void start(){
        initDriver("android");
    }

    @After
    public void quitDriver(){
        driver.quit();
    }

}
