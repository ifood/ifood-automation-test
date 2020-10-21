package pages;

import core.CommonsBasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class MainScreen extends CommonsBasePage {

    @AndroidFindBy(accessibility = "codigo")
    @iOSXCUITFindBy(xpath = "//*[@label='codigo']")
    MobileElement inputIdStudent;
    @AndroidFindBy(accessibility = "aluno")
    @iOSXCUITFindBy(xpath = "//*[@label='aluno']")
    MobileElement inputNameStudent;
    @AndroidFindBy(accessibility = "salvar")
    @iOSXCUITFindBy(id = "salvar")
    MobileElement buttonSave;
    @AndroidFindBy(accessibility = "cancelar")
    @iOSXCUITFindBy(id = "cancelar")
    MobileElement buttonCancel;
    @AndroidFindBy(xpath = "//android.widget.ScrollView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView")
    MobileElement studentsList;

    public MainScreen(AppiumDriver<?> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void validateMainScreen(){
        validateElement(inputIdStudent);
        validateElement(inputNameStudent);
        validateElement(buttonSave);
        validateElement(buttonCancel);
        validateElement(studentsList);
    }

    public void inputIdStudent(){
        sendKeysToElement(inputIdStudent, "123");
    }

}
