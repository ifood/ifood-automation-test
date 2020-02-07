package Pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import Infrastructure.BasePage;

public class CreateStudentPage extends BasePage{

    // Element Mapper
    //================================================================================

    protected MobileElement LogOutButton() {
        return FindElement(MobileBy.xpath(""));
    }

    protected MobileElement CodigoInput() {
        return FindElement(MobileBy.xpath(""));
    }

    protected MobileElement NomeInput() {
        return FindElement(MobileBy.xpath(""));
    }

    protected MobileElement SalvarButton() {
        return FindElement(MobileBy.xpath(""));
    }

    protected MobileElement CancelarButton() {
        return FindElement(MobileBy.xpath(""));
    }

    protected MobileElement AlertMessage() {
        return FindElement(MobileBy.xpath(""));
    }

    protected MobileElement AlunosListContainer() {
        return FindElement(MobileBy.xpath(""));
    }

    //================================================================================

    // Element Iterators
    //================================================================================

    protected void LogOut() {
        LogOutButton().click();
    }

    protected void InsertCodigo(String codigo) {
        CodigoInput().sendKeys((codigo));
    }

    protected void InsertName(String name) {
        NomeInput().sendKeys((name));
    }

    protected void ClickSalvar() {
        SalvarButton().click();
    }

    protected void ClickCancelar() {
        CancelarButton().click();
    }

    //================================================================================
}
