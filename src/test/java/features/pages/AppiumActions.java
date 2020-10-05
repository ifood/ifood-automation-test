package features.pages;

import features.utils.BasePage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AppiumActions extends BasePage {

    public void waitUntilElementVisible(MobileElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
