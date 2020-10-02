package features.elements_mapping.android;

import features.pages.AppiumActions;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class LoginMapping extends AppiumActions {

    public final By userField = By.xpath(
            "//android.widget.EditText[@content-desc='email']");

    public final By passwordField = By.xpath(
            "//android.widget.EditText[@content-desc='senha']");

    public final By enterButton = By.xpath(
            "//android.view.ViewGroup[@content-desc='entrar']");

    public final By errorLoginMessage =
            By.xpath(
                    "//android.widget.TextView[@content-desc='lognFail']");

    public MobileElement getUserField(){
        return driver.findElement(userField);
    }

    public MobileElement getPasswordField(){
        return driver.findElement(passwordField);
    }
    public MobileElement getEnterButton(){
        return driver.findElement(enterButton);
    }
    public MobileElement getErrorLoginMessage(){
        return driver.findElement(errorLoginMessage);
    }

}
