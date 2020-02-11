package page_objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MainPO {

    private AndroidDriver<MobileElement> driver;

    public MainPO(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public MobileElement getCodeInput() {
        return driver.findElementByAccessibilityId("codigo");
    }

    public MobileElement getStudentInput() {
        return driver.findElementByAccessibilityId("aluno");
    }

    public MobileElement getLogoutButton() {
        return driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"logout\"]/android.widget.TextView");
    }

    public MobileElement getCancelButton() {
        return driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"cancelar\"]/android.view.ViewGroup");
    }

    public MobileElement getSaveButton() {
        return driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"salvar\"]/android.view.ViewGroup");
    }

    public MobileElement getListItem(String code) {
        return driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\""+code+"\"]");
    }

    public MobileElement getExistingStudentMessage() {
        return driver.findElementByAccessibilityId("haveCode");
    }
}
