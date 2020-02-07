package Pages;

import Infrastructure.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class LogInPage extends BasePage {

    // Element Mapper
    //================================================================================

    protected MobileElement EmailInput() {
        return FindElement(MobileBy.xpath("//android.widget.EditText[@text='E-mail']"));
    }

    protected MobileElement SenhaInput() {
        return FindElement(MobileBy.xpath("//android.widget.EditText[@text='Senha']"));
    }

    protected MobileElement EntrarButton() {
        return FindElement(MobileBy.xpath("//android.widget.TextView[@text='Entrar']"));
    }

    protected MobileElement ErrorMessage() {
        return FindElement(MobileBy.xpath("//android.widget.TextView[@content-desc='lognFail']"));
    }

    //================================================================================

    // Element Iterators
    //================================================================================

    private void InsertEmail(String email) {
        EmailInput().sendKeys((email));
    }

    private void InsertSenha(String senha) {
        SenhaInput().sendKeys((senha));
    }

    private void ClickEntrar() {
        EntrarButton().click();
    }

    //================================================================================

    // Page Behaviors
    //================================================================================

    public void Login(String email, String senha) throws InterruptedException {
        Thread.sleep(10000);
        InsertEmail(email);
        InsertSenha(senha);
        ClickEntrar();
    }
}
