package Infrastructure;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Infrastructure.DriverFactory.getDriver;

public class BasePage {

    public static MobileElement FindElement(By selector)
    {
        return (MobileElement) DriverWaiter().until(ExpectedConditions.presenceOfElementLocated(selector));
    }

    private static WebDriverWait DriverWaiter()
    {
        return new WebDriverWait(getDriver(), AppSettings.SECONDS_TO_WAIT);
    }

}
