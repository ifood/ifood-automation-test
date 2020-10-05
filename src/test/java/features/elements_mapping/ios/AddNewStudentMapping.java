package features.elements_mapping.ios;

import features.pages.AppiumActions;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;

public class AddNewStudentMapping extends AppiumActions {
    private final By codeField = By.xpath(
            "//XCUIElementTypeOther[@name='codigo']/XCUIElementTypeTextField[@name='RNE__Input__text-input']");

    private final By studentField = By.xpath(
            "//XCUIElementTypeOther[@name='aluno']/XCUIElementTypeTextField[@name='RNE__Input__text-input']");

    private final By saveButton = By.name("salvar");

    private final By cancelButton = By.name("cancelar");

    private final By studentCodeAndNameList = By.xpath(
            "//XCUIElementTypeScrollView/*/XCUIElementTypeOther");

  private final By successfulMessage = By.xpath(
          "//XCUIElementTypeOther[@name='logout']/following-sibling::XCUIElementTypeOther[last()]");

    private final By requiredFieldMessage = By.xpath(
            "//XCUIElementTypeScrollView[1]/descendant::XCUIElementTypeStaticText");

    private final By closeRequiredFieldModal = By.xpath(
            "//XCUIElementTypeScrollView/descendant::XCUIElementTypeButton");

  private final By errorMessageAboutAlreadyAddedStudent = By.name("haveCode");

  private final By logoutOption = By.xpath("//XCUIElementTypeOther[@name='logout']");

    public MobileElement getCodeField(){
        return driver.findElement(codeField);
    }

    public MobileElement getStudentField(){
        return driver.findElement(studentField);
    }

    public MobileElement getSaveButton(){
        return driver.findElement(saveButton);
    }

    public MobileElement getCancelButton(){
        return driver.findElement(cancelButton);
    }

    public List<MobileElement> getStudentCodeAndNameList(){
        return driver.findElements(studentCodeAndNameList);
    }

    public MobileElement getSuccessfulMessage(){
        return driver.findElement(successfulMessage);
    }

    public MobileElement getRequiredFieldMessage(){
        return driver.findElement(requiredFieldMessage);
    }

    public MobileElement getCloseRequiredFieldModal(){
        return driver.findElement(closeRequiredFieldModal);
    }

    public MobileElement getErrorMessageAboutAlreadyAddedStudent() {
        return driver.findElement(errorMessageAboutAlreadyAddedStudent);
    }

    public MobileElement getLogoutOption() {
        return driver.findElement(logoutOption);
    }
}
