package features.elements_mapping.ios;

import features.pages.AppiumActions;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class LoginMapping extends AppiumActions {

    public final By userField = By.xpath(
                    "//XCUIElementTypeTextField[@name='email']");

    public final By passwordField = By.xpath(
                    "//XCUIElementTypeSecureTextField[@name='senha']");

    public final By enterButton = By.xpath(
                    "//XCUIElementTypeOther[@name='entrar']");

    public final By errorLoginMessage = By.xpath(
                            "//XCUIElementTypeStaticText[@name='lognFail']");

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
