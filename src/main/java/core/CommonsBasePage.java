package core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Objects;

public class CommonsBasePage extends DriverFactory{
    private final WebDriverWait wait = new WebDriverWait(getDriver(), 10);
    private JavascriptExecutor js;
    private final HashMap<String, String> scrollObject = new HashMap<>();

    public void validateElement(MobileElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickElement(MobileElement element){
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

    public void sendKeysToElement(MobileElement element, CharSequence value){
        if(Objects.requireNonNull(driver.getPlatformName()).equalsIgnoreCase("ios"))
            clickElement(element);
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(value);
    }

    void iosScrollToAnElement(MobileElement el) {
        scrollObject.put("direction", "down");
        scrollObject.put("element", el.getId());
        js.executeScript("mobile: swipe", scrollObject);
    }

    void androidScrollToAnElementByText(String text) {
        try {
            ((AndroidDriver<?>)driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + text + "\").instance(0))");
        } catch (Exception e) {
            throw new NoSuchElementException("No element" + e);
        }
    }

}
