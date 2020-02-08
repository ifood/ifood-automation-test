package Tests;

import Infrastructure.DriverFactory;
import Pages.CreateAlunoPage;
import Pages.LogInPage;
import org.junit.*;

public class CreateStudentTest {

    // Pages
    private static LogInPage loginPage;
    private static CreateAlunoPage alunoPage;

    // Tests data
    private static String codigo;
    private static String aluno;

    @BeforeClass
    public static void ClassSetUp(){
        loginPage = new LogInPage();
        alunoPage = new CreateAlunoPage();
        aluno = "Thiago Grespi";
        codigo = "123";
    }

    @Before
    public void TestSetUp(){
        loginPage.Login("teste@teste.com", "123456");
    }

    @Test
    public void CreateAlunoWithSuccess(){
        alunoPage.CreateAluno(codigo, aluno);
        Assert.assertEquals(
                "Aluno creation header incorrect",
                alunoPage.SuccessToastHeader().getText(),
                "Salvo!");
        Assert.assertEquals(
                "Aluno creation message incorrect",
                alunoPage.SuccessToastMessage().getText(),
                "Dados salvos!");
        Assert.assertTrue(
                "Aluno not created",
                alunoPage.AlunosListItem(codigo + " - " + aluno).isDisplayed());
    }

    @Test
    public void CreateAlunoWithEmptyFields(){
        alunoPage.CreateAluno("", "");
        Assert.assertEquals(
                "Incorrect error message",
                alunoPage.RequiredFieldsAlertMessage().getText(),
                "Os campos devem ser preenchidos!");
    }

    @Test
    public void CreateAlunoWithDuplicatedCodigo(){
        alunoPage.CreateAluno(codigo, aluno);
        Assert.assertEquals(
                "Codigo cant be inserted twice",
                alunoPage.DuplicatedCodeAlertMessage().getText(),
                "Este código já existe!");
    }

    @Test
    public void CancelAlunoCreation(){
        alunoPage.CancelAlunoCreation(codigo, aluno);
        Assert.assertTrue(
                "Codigo field remains with value",
                alunoPage.CodigoInput().getText() == null || alunoPage.CodigoInput().getText().equals(""));
        Assert.assertTrue(
                "Aluno field remains with value",
                alunoPage.AlunoInput().getText() == null || alunoPage.AlunoInput().getText().equals(""));
    }

    @Test
    public void LogOutWIthSuccess(){
        alunoPage.ClickLogOut();
        Assert.assertFalse(
                "App remains on Create Aluno Page",
                alunoPage.LogOutButton().isDisplayed());
        Assert.assertTrue(
                "App not redirected to LogIn Page",
                loginPage.EmailInput().isDisplayed());
    }

}
