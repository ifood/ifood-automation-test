package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.List;
import java.util.Optional;

public interface IUtils {

    static Logger getLogger() {
        return LogManager.getLogger(IUtils.class);
    }

    static Optional<AppiumDriver> aDriver() {
        return Optional.empty();
    }

    static FluentWait fwait() {
        return null;
    }

    default boolean hasElement(By element) {
        try {
            return getDriver().findElement(element).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    void write(MobileElement element, String value);

    void waitForElement(MobileElement element);

    default void tapOnElement(MobileElement element) {
        waitForElement(element);
        element.click();
    }

    default void clickOnElements(List<MobileElement> elements) {
        elements.forEach(this::tapOnElement);
    }

    default void clickOnElements(MobileElement... elements) {
        for (MobileElement el : elements) {
            tapOnElement(el);
        }
    }

    default void sendKeysOnElement(MobileElement element, String value) {
        getWait().until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }

    default AppiumDriver getDriver() {
        assert aDriver().isPresent();
        return aDriver().get();
    }

    default FluentWait getWait() {
        return fwait();
    }
}
