package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_objects.LoginPO;
import page_objects.MainPO;

public class MainSteps {

    private final AndroidDriver<MobileElement> driver;
    private final MainPO mainPO;

    public MainSteps(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        this.mainPO = new MainPO(driver);
    }

    public void code_input_should_be_visible() {
        MobileElement codeInput = mainPO.getCodeInput();
        WebDriverWait elementShouldBeVisible = new WebDriverWait(driver, 10);
        elementShouldBeVisible.until(ExpectedConditions.visibilityOf(codeInput));

    }

    public void student_input_should_be_visible() {
        MobileElement studentInput = mainPO.getStudentInput();
        WebDriverWait elementShouldBeVisible = new WebDriverWait(driver, 10);
        elementShouldBeVisible.until(ExpectedConditions.visibilityOf(studentInput));
    }

    public void logout_user() {
        MobileElement logoutButton = mainPO.getLogoutButton();
        logoutButton.click();
    }

    public void type_student(String name) {
        MobileElement studentInput = mainPO.getStudentInput();
        studentInput.sendKeys(name);
    }

    public void type_code(String code) {
        MobileElement codeInput = mainPO.getCodeInput();
        codeInput.sendKeys(code);
    }

    public void add_student(String code, String name) {
        type_code(code);
        type_student(name);
        press_save_button();
    }

    public void press_cancel_button() {
        MobileElement cancelButton = mainPO.getCancelButton();
        cancelButton.click();
    }

    public void press_save_button() {
        MobileElement saveButton = mainPO.getSaveButton();
        saveButton.click();
    }

    public void code_and_student_inputs_should_be_empty() {
        MobileElement studentInput = mainPO.getStudentInput();
        MobileElement codeInput = mainPO.getCodeInput();

        System.out.println(studentInput.getText());
        assert studentInput.getText().equals("");

        System.out.println(codeInput.getText());
        assert codeInput.getText().equals("");
    }

    public void student_should_be_listed(String code) {

        MobileElement studentListItem = mainPO.getListItem(code);
        WebDriverWait elementShouldBeVisible = new WebDriverWait(driver, 10);
        elementShouldBeVisible.until(ExpectedConditions.visibilityOf(studentListItem));
    }

    public void existing_student_message_should_show(String errorMessage) {
        MobileElement existingUserTextItem = mainPO.getExistingStudentMessage();
        WebDriverWait elementShouldBeVisible = new WebDriverWait(driver, 10);
        elementShouldBeVisible.until(ExpectedConditions.visibilityOf(existingUserTextItem));

        String actualErrorMessage = existingUserTextItem.getText();
        assert actualErrorMessage.equals(errorMessage);
    }

    public void clearInputTexts() {
        MobileElement studentInput = mainPO.getStudentInput();
        studentInput.clear();

        MobileElement codeInput = mainPO.getCodeInput();
        codeInput.clear();
    }
}
