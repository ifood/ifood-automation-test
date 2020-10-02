package features.pages.android;

import features.elements_mapping.android.LoginMapping;
import features.pages.AppiumActions;
import features.utils.ReadJsonFile;

public class LoginPage extends AppiumActions {

    public LoginMapping loginMapping;

    public LoginPage(){
        this.loginMapping = new LoginMapping();
    }

    public void login(String actor) {
        waitUntilElementVisible(loginMapping.getUserField());
        loginMapping.getUserField().sendKeys(
                ReadJsonFile.getReadJsonByPath(new String[]{"users",actor.toLowerCase(),"user"}));
        loginMapping.getPasswordField().sendKeys(
                ReadJsonFile.getReadJsonByPath(new String[]{"users",actor.toLowerCase(),"password"}));
        loginMapping.getEnterButton().click();
    }

    public void fillTheLoginFieldsByActorName(String actor) {
        waitUntilElementVisible(loginMapping.getUserField());
        loginMapping.getUserField().sendKeys(
                ReadJsonFile.getReadJsonByPath(new String[]{"users",actor.toLowerCase(),"user"}));
        loginMapping.getPasswordField().sendKeys(
                ReadJsonFile.getReadJsonByPath(new String[]{"users",actor.toLowerCase(),"password"}));
    }
}
