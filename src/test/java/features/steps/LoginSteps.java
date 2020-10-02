package features.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.pages.android.PagesAndroid;
import features.pages.ios.PagesIos;
import features.utils.GlobalVariables;
import features.utils.ReadJsonFile;
import org.junit.Assert;

import java.util.Map;

public class LoginSteps {
    @Given("^\"([^\"]*)\" is in the login screen$")
    public void is_in_the_login_screen(String actor) {
        GlobalVariables.stringStringMap.put("actor",actor);
        if(System.getProperty("platform").toLowerCase().equals("android")){
            PagesAndroid.loginPage().waitUntilElementVisible(PagesAndroid.loginPage().loginMapping.getUserField());
        }else{
            PagesIos.loginPage().waitUntilElementVisible(PagesIos.loginPage().loginMapping.getUserField());
        }
    }

    @Given("^she fills the login fields with the following values$")
    public void she_fills_the_fields_with_the_following_values(Map<String,String> credentials) {
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            PagesAndroid.loginPage().loginMapping.getUserField().sendKeys(credentials.get("user"));
            PagesAndroid.loginPage()
                    .loginMapping
                    .getPasswordField()
                    .sendKeys(credentials.get("password"));
        }else{
            PagesIos.loginPage().loginMapping.getUserField().sendKeys(credentials.get("user"));
            PagesIos.loginPage()
                    .loginMapping
                    .getPasswordField()
                    .sendKeys(credentials.get("password"));
        }

    }

    @When("^she triggers the log in option$")
    public void she_triggers_the_log_in_option() {
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            PagesAndroid.loginPage().loginMapping.getEnterButton().click();
        }else{
            PagesIos.loginPage().loginMapping.getEnterButton().click();
        }
    }

    @Then("^the include new student section should be displayed$")
    public void the_include_new_student_section_should_be_displayed() {
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            PagesAndroid.addNewStudentPage().waitUntilElementVisible(
                    PagesAndroid.addNewStudentPage().addNewStudentMapping.getSaveButton());
            Assert.assertTrue(PagesAndroid.addNewStudentPage().addNewStudentMapping.getCancelButton().isDisplayed());
        }else{
            PagesIos.addNewStudentPage().waitUntilElementVisible(
                    PagesIos.addNewStudentPage().addNewStudentMapping.getSaveButton());
            Assert.assertTrue(PagesIos.addNewStudentPage().addNewStudentMapping.getCancelButton().isDisplayed());
        }
    }

    @Then("^the error message related the login error should be displayed$")
    public void the_error_message_related_the_login_error_should_be_displayed() {
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            PagesAndroid.loginPage().waitUntilElementVisible(PagesAndroid.loginPage().loginMapping.getErrorLoginMessage());
            Assert.assertEquals(ReadJsonFile.getReadJsonByPath(new String[]{"messages","login","error"}),
                    PagesAndroid.loginPage().loginMapping.getErrorLoginMessage().getText());
        }else{
            PagesIos.loginPage().waitUntilElementVisible(PagesIos.loginPage().loginMapping.getErrorLoginMessage());
            Assert.assertTrue("The element contained the error message was not displayed",
                    PagesIos.loginPage().loginMapping.getErrorLoginMessage().isDisplayed());
        }
    }

    @And("^she fills the login fields with valid values$")
    public void sheFillsTheLoginFieldsWithValidValues() {
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            PagesAndroid.loginPage().fillTheLoginFieldsByActorName(GlobalVariables.stringStringMap.get("actor"));
        }else{
            PagesIos.loginPage().fillTheLoginFieldsByActorName(GlobalVariables.stringStringMap.get("actor"));
        }
    }
}
