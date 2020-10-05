package features.elements_mapping.android;

import features.pages.AppiumActions;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;

public class AddNewStudentMapping extends AppiumActions {
    private final By codeField = By.xpath(
            "//android.widget.EditText[@content-desc='codigo']");

    private final By studentField = By.xpath(
            "//android.widget.EditText[@content-desc='aluno']");

    private final By saveButton = By.xpath(
            "//android.view.ViewGroup[@content-desc='salvar']");

    private final By cancelButton = By.xpath(
            "//android.view.ViewGroup[@content-desc='cancelar']");

    private final By studentCodeAndNameList = By.xpath("//android.widget.ScrollView/descendant::android.widget.TextView");

  private final By successfulMessageTitle = By.xpath(
          "//android.view.ViewGroup[@content-desc='cancelar']/following-sibling::android.view.ViewGroup/descendant::android.widget.TextView[1]");

    private final By successfulMessage = By.xpath(
            "//android.view.ViewGroup[@content-desc='cancelar']/following-sibling::android.view.ViewGroup/descendant::android.widget.TextView[last()]");

    private final By requiredFieldMessage = By.xpath(
            "//*[contains(@resource-id,'alertTitle')]");

    private final By closeRequiredFieldModal = By.xpath(
            "//*[contains(@resource-id,'button1')]");

    private final By errorMessageAboutAlreadyAddedStudent =
            By.xpath("//android.widget.TextView[@content-desc='haveCode']");

  private final By logoutOption =
      By.xpath("//android.view.ViewGroup[@content-desc='logout']/android.widget.TextView");

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

    public MobileElement getSuccessfulMessageTitle(){
        return driver.findElement(successfulMessageTitle);
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
