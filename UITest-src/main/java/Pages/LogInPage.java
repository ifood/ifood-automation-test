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

    protected void InsertEmail(String email) {
        EmailInput().sendKeys((email));
    }

    protected void InsertSenha(String senha) {
        SenhaInput().sendKeys((senha));
    }

    protected void ClickEntrar() {
        EntrarButton().click();
    }

    //================================================================================
}
