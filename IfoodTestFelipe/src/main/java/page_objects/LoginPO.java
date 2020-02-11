package page_objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginPO {


    private AndroidDriver<MobileElement> driver;

    public LoginPO(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public MobileElement getEmailInput() {
        return driver.findElementByAccessibilityId("email");
    }

    public MobileElement getPasswordInput() {
        return driver.findElementByAccessibilityId("senha");
    }

    public MobileElement getLoginButton() {
        return driver.findElementByAccessibilityId("entrar");
    }

    public MobileElement getLoginErrorTextView() {
        return driver.findElementByXPath("//android.widget.TextView[@content-desc=\"lognFail\"]");
    }
}
