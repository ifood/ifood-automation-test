package Pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import Infrastructure.BasePage;

public class CreateAlunoPage extends BasePage{

    // Element Mapper
    //================================================================================

    public MobileElement LogOutButton() {
        return FindElement(MobileBy.xpath("//android.widget.TextView[@content-desc='logout']/android.widget.TextView"));
    }

    public MobileElement CodigoInput() {
        return FindElement(MobileBy.xpath("//android.widget.EditText[@=content-desc='codigo']"));
    }

    public MobileElement AlunoInput() {
        return FindElement(MobileBy.xpath("//android.widget.EditText[@content-desc='aluno']"));
    }

    public MobileElement SalvarButton() {
        return FindElement(MobileBy.xpath("//android.widget.TextView[@text='Salvar']"));
    }

    public MobileElement CancelarButton() {
        return FindElement(MobileBy.xpath("//android.widget.TextView[@text='Cancelar']"));
    }

    public MobileElement RequiredFieldsAlertMessage() {
        return FindElement(MobileBy.id("android:id/alertTitle"));
    }

    public MobileElement AlunosListItem(String aluno) {
        return FindElement(MobileBy.xpath("//android.widget.TextView[@text='" + aluno + "']"));
    }

    public MobileElement SuccessToastHeader() {
        return FindElement(MobileBy.xpath("//android.view.ViewGroup/android.widget.TextView[1]"));
    }

    public MobileElement SuccessToastMessage() {
        return FindElement(MobileBy.xpath("//android.view.ViewGroup/android.widget.TextView[2]"));
    }

    // Simulei a existencia deste elemento para automatizar um cenario cujo encontrei um bug
    public MobileElement DuplicatedCodeAlertMessage() {
        return FindElement(MobileBy.id("android:id/alertMessage"));
    }


    //================================================================================

    // Element Iterators
    //================================================================================

    public void ClickLogOut() {
        LogOutButton().click();
    }

    public void InsertCodigo(String codigo) {
        CodigoInput().sendKeys((codigo));
    }

    public void InsertAluno(String aluno) {
        AlunoInput().sendKeys((aluno));
    }

    public void ClickSalvar() {
        SalvarButton().click();
    }

    public void ClickCancelar() {
        CancelarButton().click();
    }

    //================================================================================

    // Page Behaviors
    //================================================================================

    public void CreateAluno(String codigo, String aluno){
        InsertCodigo(codigo);
        InsertAluno(aluno);
        ClickSalvar();
    }

    public void CancelAlunoCreation(String codigo, String aluno){
        InsertCodigo(codigo);
        InsertAluno(aluno);
        ClickCancelar();
    }
}
