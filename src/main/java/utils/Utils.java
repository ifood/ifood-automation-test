package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.function.BiConsumer;

public class Utils implements IUtils {

    private final AppiumDriver driver;
    private final FluentWait wait;

    public Utils(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(40))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class)
                .ignoring(TimeoutException.class);
    }

    public BiConsumer<MobileElement, MobileElement> clicks = (a, b) -> clickOnElements(a,b);



    @Override
    public void write(MobileElement element, String value) {
        waitForElement(element);
        element.sendKeys(value);
    }

    @Override
    public void waitForElement(MobileElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public boolean isAndroid() {

        return (driver instanceof AndroidDriver
                || driver.getAutomationName().equalsIgnoreCase("UIAutomator2")); //TODO : consuming this from a json or other file
    }

    public void verticalSwipeElement(MobileElement element, int amount) { //TODO : Handle this on the interface first
        TouchAction touchAction = new TouchAction(driver);
        Point stuff = element.getLocation();

        for(int i = 0; i <= amount; i++){
            int centerY = (driver.manage().window().getSize().height)/2;
            touchAction.longPress(PointOption.point(stuff.getX(), stuff.getY()))
                    .moveTo(PointOption.point(0, centerY/2))
                    .release()
                    .perform();
        }
    }

    public void verticalSwipe(int amount) {
        TouchAction touchAction = new TouchAction(driver);
        for(int i = 0; i <= amount; i++) {
            int centerY = (driver.manage().window().getSize().height)/2;
            int centerX = (driver.manage().window().getSize().width)/2;
            touchAction.longPress(PointOption.point(centerX, centerY))
                    .moveTo(PointOption.point(0, centerY/2))
                    .release()
                    .perform();
        }
    }

    @Override
    public FluentWait getWait() {
        return  wait;
    }
}
