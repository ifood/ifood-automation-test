package Infrastructure;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Infrastructure.DriverFactory.getDriver;
import Infrastructure.AppSettings;

public class BasePage {

    public static MobileElement FindElement(By selector)
    {
        return (MobileElement) DriverWaiter().until(ExpectedConditions.presenceOfElementLocated(selector));
    }

    private static WebDriverWait DriverWaiter()
    {
        return new WebDriverWait(getDriver(), AppSettings.SECONDS_TO_WAIT);
    }

    public static void GetItemOnList(int index, MobileBy selector)
    {
        Select oSelect = new Select(FindElement(selector));
        oSelect.selectByIndex(index);
    }

    public static void GetItemOnList(String itemText, MobileBy selector)
    {
        Select oSelect = new Select(FindElement(selector));
        oSelect.selectByVisibleText(itemText);
    }

    public static MobileElement GetInnerElementByText(MobileElement optionsContainer, String innerElementText)
    {
        return optionsContainer.findElement(By.xpath("//*[text()='" + innerElementText + "']"));
    }
}
