package core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Objects;

public class CommonsBasePage extends DriverFactory{
    private final WebDriverWait wait = new WebDriverWait(getDriver(), 10);
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

    public void iosScrollToAnElement(MobileElement el, String label) {
        scrollObject.put("direction", "down");
        scrollObject.put("element", el.getId());
        scrollObject.put("predicateString", "label == '"+label+"'");
        driver.executeScript("mobile:scroll", scrollObject);
    }

    public void androidScrollToAnElementByText(String text) {
        try {
            ((AndroidDriver<?>)driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\""+text+"\"))");
        } catch (Exception e) {
            throw new NoSuchElementException("No element" + e);
        }
    }

    public void assertConditionTrue(String message, Object condition){
        assertTrue(message, (Boolean) condition);
    }

    public void assertElementsEqual(String expected, String actual){
        assertEquals(expected, actual);
    }

}
