package features.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.pages.android.PagesAndroid;
import features.pages.ios.PagesIos;
import features.utils.ReadJsonFile;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Map;

public class AddNewStudentSteps {
    private ArrayList<String> oldStudentList = null;
    private String newStudentCode = null;
    private String newStudentName = null;

    @Given("^\"([^\"]*)\" is logged in the application$")
    public void is_logged_in_the_application(String actor) {
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            PagesAndroid.loginPage().login(actor);
        }else{
            PagesIos.loginPage().login(actor);
        }
    }

    @Given("^she fills the fields with the following values$")
    public void she_fills_the_fields_with_the_following_values(Map<String,String> newUserInfo) {
        newStudentCode = newUserInfo.get("code");
        newStudentName = newUserInfo.get("student name");
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            oldStudentList = PagesAndroid.addNewStudentPage().getTheCurrentStudentList();
            PagesAndroid.addNewStudentPage()
                    .fillTheAddNewStudentFieldsWithTheFollowingValues(newUserInfo);
        }else{
            oldStudentList = PagesIos.addNewStudentPage().getTheCurrentStudentList();
            PagesIos.addNewStudentPage()
                    .fillTheAddNewStudentFieldsWithTheFollowingValues(newUserInfo);
            PagesIos.addNewStudentPage().addNewStudentMapping.getCodeField().click();
        }
    }

    @When("^she triggers the save option$")
    public void she_triggers_the_save_option() {
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            PagesAndroid.addNewStudentPage().addNewStudentMapping.getSaveButton().click();
        }else{
            PagesIos.addNewStudentPage().addNewStudentMapping.getSaveButton().click();

        }
    }

    @Then("^the student added should be displayed in the list$")
    public void the_student_added_should_be_displayed_in_the_list() {
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            Assert.assertTrue(
                    "The added student is not being displayed in the list",
                    PagesAndroid.addNewStudentPage()
                            .checkIfTheStudentAddedIsDisplayedInTheList(newStudentCode, newStudentName));
        }else{
            Assert.assertTrue(
                    "The added student is not being displayed in the list",
                    PagesIos.addNewStudentPage()
                            .checkIfTheStudentAddedIsDisplayedInTheList(newStudentCode, newStudentName));
        }
    }

    @Then("^the list should contain the old students$")
    public void the_list_should_contain_the_old_students() {
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            Assert.assertTrue(
                    "The old students is not being displayed in the list",
                    PagesAndroid.addNewStudentPage()
                            .checkIfTheCurrentListContainAllOldStudents(oldStudentList));
        }else{
            Assert.assertTrue(
                    "The old students is not being displayed in the list",
                    PagesIos.addNewStudentPage()
                            .checkIfTheCurrentListContainAllOldStudents(oldStudentList));
        }
    }

    @Then("^the list size should be increased by one item$")
    public void the_list_size_should_be_increased_by_one_item() {
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            Assert.assertEquals(
                    oldStudentList.size() + 1,
                    PagesAndroid.addNewStudentPage().getTheCurrentStudentList().size());
        }else{
            Assert.assertEquals(oldStudentList.size() + 1,
                    PagesIos.addNewStudentPage().getTheCurrentStudentList().size() );

        }
    }

    @When("^she triggers the cancel option$")
    public void she_triggers_the_cancel_option() {
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            PagesAndroid.addNewStudentPage().addNewStudentMapping.getCancelButton().click();
        }else{
            PagesIos.addNewStudentPage().addNewStudentMapping.getCancelButton().click();

        }
    }

    @Then("^the both fields should be cleared$")
    public void the_both_fields_should_be_cleared() {
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            Assert.assertTrue(
                    "The code field is not clear!",
                    PagesAndroid.addNewStudentPage().addNewStudentMapping.getCodeField().getText().isEmpty());
            Assert.assertTrue(
                    "The name field is not clear!",
                    PagesAndroid.addNewStudentPage()
                            .addNewStudentMapping
                            .getStudentField()
                            .getText()
                            .isEmpty());
        }else{
            Assert.assertTrue(
                    "The code field is not clear!",
                    PagesIos.addNewStudentPage().addNewStudentMapping.getCodeField().getText().toLowerCase()
                            .equals("codigo"));
            Assert.assertTrue(
                    "The name field is not clear!",
                    PagesIos.addNewStudentPage().addNewStudentMapping.getStudentField().getText().toLowerCase()
                            .equals("aluno"));
        }
    }

    @Then("^the error message about the required field should be displayed$")
    public void the_error_message_about_the_required_field_should_be_displayed() {
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            Assert.assertEquals(
                    ReadJsonFile.getReadJsonByPath(
                            new String[] {"messages", "add-new-student", "error-required-fields"}),
                    PagesAndroid.addNewStudentPage().addNewStudentMapping.getRequiredFieldMessage()
                            .getText());
            PagesAndroid.addNewStudentPage().addNewStudentMapping.getCloseRequiredFieldModal().click();
        }else{
//            Assert.assertEquals(
//                    ReadJsonFile.getReadJsonByPath(
//                            new String[] {"messages", "add-new-student", "error-required-fields"}),
//                    PagesIos.addNewStudentPage().addNewStudentMapping.getRequiredFieldMessage()
//                            .getText());
//            PagesIos.addNewStudentPage().addNewStudentMapping.getCloseRequiredFieldModal().click();
        }
    }

    @Then("^the new student is not added to the list$")
    public void the_new_student_is_not_added_to_the_list() {
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            Assert.assertTrue(
                    "The new student was added in the list!",
                    PagesAndroid.addNewStudentPage()
                            .checkIfTheCurrentListIsEqualToTheOldList(oldStudentList));
        }else{
            PagesIos.addNewStudentPage().waitUntilElementVisible(
                    PagesIos.addNewStudentPage().addNewStudentMapping.getSaveButton());
            Assert.assertTrue(
                    "The new student was added in the list!",
                    PagesIos.addNewStudentPage()
                            .checkIfTheCurrentListIsEqualToTheOldList(oldStudentList));
        }
    }

    @Then("^the completed field should remain with the written value$")
    public void the_completed_field_should_remain_with_the_written_value() {
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            Assert.assertEquals(newStudentCode,
                    PagesAndroid.addNewStudentPage().addNewStudentMapping.getCodeField().getText());
            Assert.assertEquals(newStudentName,
                    PagesAndroid.addNewStudentPage().addNewStudentMapping.getStudentField().getText());
        }else{
            newStudentCode = newStudentCode.isEmpty() ? "codigo" : newStudentCode;
            newStudentName = newStudentName.isEmpty() ? "aluno" : newStudentName;
            Assert.assertEquals(newStudentCode,
                    PagesIos.addNewStudentPage().addNewStudentMapping.getCodeField().getText());
            Assert.assertEquals(newStudentName,
                    PagesIos.addNewStudentPage().addNewStudentMapping.getStudentField().getText());
        }

    }

    @Then("^a successful message should be displayed$")
    public void aSuccessfulMessageShouldBeDisplayed() {
        String expectedMessageTitle =  ReadJsonFile.getReadJsonByPath(new String[] {"messages", "add-new-student", "successful-title"});
        String expectedSuccessfulMessage = ReadJsonFile.getReadJsonByPath(new String[] {"messages", "add-new-student", "successful"});
        String currentMessage, currentTitle;
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            currentTitle = PagesAndroid.addNewStudentPage().addNewStudentMapping.getSuccessfulMessageTitle().getText();
            currentMessage = PagesAndroid.addNewStudentPage().addNewStudentMapping.getSuccessfulMessage().getText();
            Assert.assertEquals(expectedMessageTitle, currentTitle);
            Assert.assertEquals(expectedSuccessfulMessage, currentMessage);
        }else{
            Assert.assertEquals(expectedMessageTitle +" "+expectedSuccessfulMessage,
                    PagesIos.addNewStudentPage().addNewStudentMapping.getSuccessfulMessage().getText());
        }
    }

    @And("^she fills the fields with an added student$")
    public void sheFillsTheFieldsWithAnAddedStudent() {
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            PagesAndroid.addNewStudentPage().fillTheFieldsWithAddedStudent();
        }else{
            PagesIos.addNewStudentPage().fillTheFieldsWithAddedStudent();
        }
    }

    @Then("^the error message about student already added should be displayed$")
    public void theErrorMessageAboutStudentAlreadyAddedShouldBeDisplayed() {
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            PagesAndroid.addNewStudentPage()
                    .waitUntilElementVisible(
                            PagesAndroid.addNewStudentPage().addNewStudentMapping.getErrorMessageAboutAlreadyAddedStudent());
            Assert.assertEquals(
                    ReadJsonFile.getReadJsonByPath(
                            new String[] {"messages", "add-new-student", "error-already-added"}),
                    PagesAndroid.addNewStudentPage().addNewStudentMapping.getErrorMessageAboutAlreadyAddedStudent().getText());
        }else{
            PagesIos.addNewStudentPage().waitUntilElementVisible(PagesIos.addNewStudentPage().addNewStudentMapping.getErrorMessageAboutAlreadyAddedStudent());
            Assert.assertTrue("The error message about already  added student was not displayed",
                    PagesIos.addNewStudentPage().addNewStudentMapping.getErrorMessageAboutAlreadyAddedStudent().isDisplayed());
        }
    }

    @Given("^she adds a student with the following value$")
    public void she_adds_a_student_with_the_following_value(Map<String,String> credentials) {
        newStudentCode = credentials.get("code");
        newStudentName = credentials.get("student name");
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            PagesAndroid.addNewStudentPage().addNewStudentByCredential(newStudentCode,newStudentName);
        }else{
            PagesIos.addNewStudentPage().addNewStudentByCredential(newStudentCode,newStudentName);
        }
    }

    @When("^she tries to add the same student added using the same credentials$")
    public void she_tries_to_add_the_same_student_added_using_the_same_credentials() {
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            PagesAndroid.addNewStudentPage().addNewStudentByCredential(newStudentCode, newStudentName);
        }else{
            PagesIos.addNewStudentPage().addNewStudentByCredential(newStudentCode, newStudentName);
        }
    }

}
