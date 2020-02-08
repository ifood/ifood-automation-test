package Infrastructure;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static Infrastructure.AppSettings.remoteURL;

public class DriverFactory {

    private static AndroidDriver<MobileElement> driver;

    public static AndroidDriver<MobileElement> getDriver() {
        if(driver == null) {
//			createDriver();
            createDriver();
        }
        return driver;
    }

    private static void createDriver() {
        try {
            driver = new AndroidDriver<MobileElement>(new URL(remoteURL), CreateCapabilities());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        SetImplicitlyWait();

    }

    public static void killDriver() {
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }

    private static DesiredCapabilities CreateCapabilities(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("appiumVersion", "1.16.0");
        desiredCapabilities.setCapability("appPackage", "com.ifood.testqa");
        desiredCapabilities.setCapability("appActivity", "host.exp.exponent.MainActivity");

        return desiredCapabilities;
    }

    private static void SetImplicitlyWait(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
