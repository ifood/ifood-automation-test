package features.pages.ios;

import features.elements_mapping.ios.LoginMapping;
import features.pages.AppiumActions;
import features.utils.ReadJsonFile;

public class LoginPageIos extends AppiumActions {

    public LoginMapping loginMapping;

    public LoginPageIos(){
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
