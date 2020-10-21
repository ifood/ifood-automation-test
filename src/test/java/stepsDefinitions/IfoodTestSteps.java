package stepsDefinitions;

import core.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginScreen;
import pages.MainScreen;

public class IfoodTestSteps{

    LoginScreen loginScreen = new LoginScreen(new DriverFactory().getDriver());
    MainScreen mainScreen = new MainScreen(new DriverFactory().getDriver());

    @Given("the user is at the login screen")
    public void the_user_is_at_the_login_screen() {
        loginScreen.validateLoginScreen();
    }

    @When("the user types the username")
    public void the_user_types_the_username() {
        loginScreen.inputUsername();
    }

    @When("the user types password")
    public void the_user_types_password() {
        loginScreen.inputPassword();
    }

    @When("the user clicks on the button Entrar")
    public void the_user_clicks_on_the_button_Entrar() {
        loginScreen.clickButtonEntrar();
    }

    @Then("the app displays the main screen for adding students")
    public void the_app_displays_the_main_screen_for_adding_students() {
        mainScreen.validateMainScreen();
    }

}
