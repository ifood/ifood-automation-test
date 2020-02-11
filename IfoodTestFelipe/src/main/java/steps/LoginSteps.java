package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_objects.LoginPO;

public class LoginSteps {

    private final AndroidDriver<MobileElement> driver;
    private final LoginPO loginPO;

    public LoginSteps(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        this.loginPO = new LoginPO(driver);

    }

    public void login_user(String email, String password) {

        MobileElement emailInput = loginPO.getEmailInput();
        emailInput.sendKeys(email);

        MobileElement passwordInput = loginPO.getPasswordInput();
        passwordInput.sendKeys(password);

        MobileElement loginButton = loginPO.getLoginButton();
        loginButton.click();
    }

    public void login_user_should_fail_with_message(String errorMessage) {

        MobileElement loginErrorTextView = loginPO.getLoginErrorTextView();

        WebDriverWait elementShouldBeVisible = new WebDriverWait(driver, 10); //Timeout should be a config
        elementShouldBeVisible.until(ExpectedConditions.visibilityOf(loginErrorTextView));

        String actualErrorMessage = loginErrorTextView.getText();
        assert actualErrorMessage.equals(errorMessage);
    }

    public void clearInputTexts() {
        MobileElement emailInput = loginPO.getEmailInput();
        emailInput.clear();
        MobileElement passwordInput = loginPO.getPasswordInput();
        passwordInput.clear();
    }
}
