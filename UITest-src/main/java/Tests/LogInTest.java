package Tests;

import Infrastructure.DriverFactory;
import Pages.CreateAlunoPage;
import Pages.LogInPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LogInTest {

    private static LogInPage loginPage;
    private static CreateAlunoPage studentPage;

    @BeforeClass
    public static void ClassSetUp(){
        loginPage = new LogInPage();
        studentPage = new CreateAlunoPage();
    }

    @Test
    public void LoginWithSuccess() {
        loginPage.Login("teste@teste.com", "123456");
        Assert.assertTrue(studentPage.LogOutButton().isDisplayed());
    }

    @Test
    public void LoginWithIncorrectCredentials() {
        loginPage.Login("incorrect_email@teste.com", "incorrect_pass");
        Assert.assertEquals(
                "Incorrect error message",
                loginPage.ErrorMessage().getText(),
                "Erro no login! :(");
    }

    @Test
    public void LoginEmptyFields() {
        loginPage.Login("", "");
        Assert.assertEquals(
                "Incorrect error message",
                loginPage.ErrorMessage().getText(),
                "Erro no login! :(");
    }

    @After
    public void TestTearDown(){
        DriverFactory.getDriver().resetApp();
    }
}
