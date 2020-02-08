package Pages;

import Infrastructure.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class LogInPage extends BasePage {

    // Element Mapper
    //================================================================================

    public MobileElement EmailInput() {
        return FindElement(MobileBy.xpath("//android.widget.EditText[@text='E-mail']"));
    }

    public MobileElement SenhaInput() {
        return FindElement(MobileBy.xpath("//android.widget.EditText[@text='Senha']"));
    }

    public MobileElement EntrarButton() {
        return FindElement(MobileBy.xpath("//android.widget.TextView[@text='Entrar']"));
    }

    public MobileElement ErrorMessage() {
        return FindElement(MobileBy.xpath("//android.widget.TextView[@content-desc='lognFail']"));
    }

    //================================================================================

    // Element Iterators
    //================================================================================

    public void InsertEmail(String email) {
        EmailInput().sendKeys((email));
    }

    public void InsertSenha(String senha) {
        SenhaInput().sendKeys((senha));
    }

    public void ClickEntrar() {
        EntrarButton().click();
    }

    //================================================================================

    // Page Behaviors
    //================================================================================

    public void Login(String email, String senha) {
        InsertEmail(email);
        InsertSenha(senha);
        ClickEntrar();
    }
}
