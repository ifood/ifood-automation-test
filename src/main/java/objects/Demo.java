package objects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import java.time.Duration;
import java.util.List;


public class Demo extends Utils {

    public Demo(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(40)),
                this);
    }

    @iOSXCUITFindBy(iOSNsPredicate = "value CONTAINS 'E-mail'")
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"email\")")
    public MobileElement usernameCampo;

    @iOSXCUITFindBy(iOSNsPredicate = "value CONTAINS 'Senha'")
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"senha\")")
    public MobileElement passwordField;

    @iOSXCUITFindBy(accessibility = "entrar")
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"entrar\")")
    public MobileElement loginButton;

    @iOSXCUITFindBy(accessibility = "lognFail")
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"lognFail\")")
    public MobileElement failMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"codigo\")")
    public MobileElement codigoField;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"aluno\")")
    public MobileElement alunoField;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'RNE__Input__text-input'")
    public List<MobileElement> codigoAlunoFields;

    @iOSXCUITFindBy(accessibility = "salvar")
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"salvar\")")
    public MobileElement saveButton;

    @iOSXCUITFindBy(accessibility = "cancelar")
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"cancelar\")")
    public MobileElement cancelButton;

    @iOSXCUITFindBy(accessibility = "logout")
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"logout\")")
    public MobileElement logoutButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == \"XCUIElementTypeOther\" AND name == \"01\"")
    public List<MobileElement> savedItem;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"01 - Ramses Almeida\")")
    public MobileElement itemSaved;

    public void insertLoginInformation(String user, String pass) {
        write(usernameCampo, user);
        write(passwordField, pass);
    }

    public void insertRegisterInformation(String codigo, String aluno) {
        if(isAndroid()) {
            write(codigoField, codigo);
            write(alunoField, aluno);
        } else {
            write(codigoAlunoFields.get(0), codigo);
            write(codigoAlunoFields.get(1), aluno);
        }
    }

    public void tapLoginButton() {
        tapOnElement(loginButton);
    }

    public void tapLogoutButton() {
        tapOnElement(logoutButton);
    }

    public void saveData() {
        tapOnElement(saveButton);
    }

    public void cancelData() {
        tapOnElement(cancelButton);
    }

    public void searchFixedItemOnList() {
        if(isAndroid()) {
            waitForElement(itemSaved);
        } else {
            verticalSwipe( 2);
        }
    }

    public void validationRegisterTestItem() {
        if(isAndroid()) {
            waitForElement(itemSaved);
            assert itemSaved.isDisplayed();
        } else {
            waitForElement(savedItem.get(1));
            assert savedItem.get(1).isDisplayed();
        }
    }
}
