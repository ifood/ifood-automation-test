package pages;

import core.CommonsBasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen extends CommonsBasePage {

    @AndroidFindBy(accessibility = "email")
    @iOSXCUITFindBy(id = "email")
    MobileElement username;
    @AndroidFindBy(accessibility = "senha")
    @iOSXCUITFindBy(id = "senha")
    MobileElement password;
    @AndroidFindBy(accessibility = "entrar")
    @iOSXCUITFindBy(id = "entrar")
    MobileElement buttonLogin;

    public LoginScreen(AppiumDriver<?> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void validateLoginScreen(){
        validateElement(username);
        validateElement(password);
        validateElement(buttonLogin);
    }

    public void inputUsername(){
        sendKeysToElement(username, "teste@teste.com");
    }

    public void inputPassword(){
        sendKeysToElement(password, "123456");
    }

    public void clickButtonEntrar(){
        clickElement(buttonLogin);
    }

}
