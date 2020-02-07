package tests;

import objects.Demo;
import static org.assertj.core.api.Assertions.assertThat;
import org.testng.annotations.Test;
import utils.RunSetup;

public class DemoTest extends RunSetup {

    @Test(description = "Teste de Login Incorreto",
            testName = "Teste Dados Incorretos para o Device testado", priority = 1)
    public void incorrectLogin() {

        Demo demo = new Demo(getDriver());
        demo.insertLoginInformation("xpto@teste.com.br", "123456"); //TODO : consuming this from a json or other file
        demo.tapLoginButton();
        demo.waitForElement(demo.failMessage);
        assertThat(demo.failMessage.isDisplayed()).isTrue();

    }

    @Test(description = "Teste de Login Correto",
            testName = "Teste Dados Correto para o Device testado", priority = 1)
    public void correctLogin() {

        Demo demo = new Demo(getDriver());
        demo.insertLoginInformation("teste@teste.com", "123456"); //TODO : consuming this from a json or other file
        demo.tapLoginButton();
        demo.waitForElement(demo.logoutButton);
        assertThat(demo.logoutButton.isDisplayed()).isTrue();


    }

    @Test(description = "Teste de Cadastro de dados Corretamente",
            testName = "Cadastro de dados de modo Correto", priority = 1)
    public void correctInputInformation() {

        Demo demo = new Demo(getDriver());
        demo.insertLoginInformation("teste@teste.com", "123456"); //TODO : consuming this from a json or other file
        demo.tapLoginButton();
        demo.insertRegisterInformation("01", "Ramses Almeida"); //TODO : consuming this from a json or other file
        demo.saveData();
        demo.searchFixedItemOnList();
        demo.validationRegisterTestItem();

    }
}
