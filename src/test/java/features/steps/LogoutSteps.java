package features.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.pages.android.PagesAndroid;
import features.pages.ios.PagesIos;
import features.utils.GlobalVariables;
import org.junit.Assert;

public class LogoutSteps {
    @When("^he clicks on the logout option$")
    public void heClicksOnTheLogoutOption() {
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            PagesAndroid.addNewStudentPage().waitUntilElementVisible(
                    PagesAndroid.addNewStudentPage().addNewStudentMapping.getLogoutOption());
            PagesAndroid.addNewStudentPage().addNewStudentMapping.getLogoutOption().click();
        }else{
            PagesIos.addNewStudentPage().waitUntilElementVisible(
                    PagesIos.addNewStudentPage().addNewStudentMapping.getLogoutOption());
            PagesIos.addNewStudentPage().addNewStudentMapping.getLogoutOption().click();
        }
    }

    @Then("^the login screen should be displayed$")
    public void theLoginScreenShouldBeDisplayed() {
        if (System.getProperty("platform").toLowerCase().equals("android")) {
            Assert.assertTrue(PagesAndroid.loginPage().loginMapping.getUserField().isDisplayed());
        }else{
            Assert.assertTrue(PagesIos.loginPage().loginMapping.getUserField().isDisplayed());
        }
    }
}
