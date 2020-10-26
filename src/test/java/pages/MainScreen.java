package pages;

import core.CommonsBasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

public class MainScreen extends CommonsBasePage {
    static String idInsertedStudent = "";

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
    @AndroidFindBy(id = "android:id/alertTitle")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert")
    MobileElement fillFieldAlert;

    public MainScreen(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void validateMainScreen() {
        validateElement(inputIdStudent);
        validateElement(inputNameStudent);
        validateElement(buttonSave);
        validateElement(buttonCancel);
        validateElement(studentsList);
    }

    public void inputIdStudent() {
        String idStudent = "123";
        sendKeysToElement(inputIdStudent, idStudent);
        idInsertedStudent = idStudent;
    }

    public void inputNameStudent() {
        sendKeysToElement(inputNameStudent, "Raul Tomaz");
    }

    public void clickSaveButton() {
        clickElement(buttonSave);
    }

    public void scrollToLastElement() {
        if (Objects.requireNonNull(driver.getPlatformName()).equalsIgnoreCase("ios")) {
            iosScrollToAnElement(studentsList, idInsertedStudent);
        } else {
            androidScrollToAnElementByText(idInsertedStudent);
        }

    }

    public void assertRecordInserted(){
        MobileElement assertionElement;
        if(Objects.requireNonNull(driver.getPlatformName()).equalsIgnoreCase("android"))
        {
            assertionElement = studentsList.findElementByXPath("//android.view.ViewGroup[@content-desc=" +
                    "\""+idInsertedStudent+"\"]/android.widget.TextView");
        }
        else
        {
            assertionElement = studentsList.findElementById(idInsertedStudent);
        }

        assertConditionTrue("The element was not inserted", assertionElement.getText().contains("123"));

    }

    public void assertBlankFieldsMessage(){
        assertElementsEqual("Os campos devem ser preenchidos!", fillFieldAlert.getText());
    }

}
