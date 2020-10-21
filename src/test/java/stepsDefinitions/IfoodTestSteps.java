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

    @Given("the user is at the main screen for adding students")
    public void the_user_is_at_the_main_screen_for_adding_students() {
        loginScreen.inputUsername();
        loginScreen.inputPassword();
        loginScreen.clickButtonEntrar();
        mainScreen.validateMainScreen();
    }

    @Given("the user types a new id")
    public void the_user_types_a_new_id() {
        mainScreen.inputIdStudent();
    }

    @Given("the user types a new student")
    public void the_user_types_a_new_student() {
        mainScreen.inputNameStudent();
    }

    @When("the user clicks on save button")
    public void the_user_clicks_on_save_button() {
        mainScreen.clickSaveButton();
    }

    @Then("the app displays the record on the bottom of the list")
    public void the_app_displays_the_record_on_the_bottom_of_the_list() {
        mainScreen.scrollToLastElement();
        mainScreen.assertRecordInserted();
    }

    @When("the user clicks on save button before filling the information")
    public void the_user_clicks_on_save_button_before_filling_the_information() {
        mainScreen.clickSaveButton();
    }

    @Then("the app displays the alert message for filling the information")
    public void the_app_displays_the_alert_message_for_filling_the_information() {
        mainScreen.assertBlankFieldsMessage();
    }

}
