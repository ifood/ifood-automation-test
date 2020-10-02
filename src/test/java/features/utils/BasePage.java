package features.utils;

import capabilities.CapsAndroid;
import capabilities.CapsIOS;
import cucumber.api.Scenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class BasePage {
    public static AppiumDriver<MobileElement> driver;
    public static WebDriverWait wait;
    public static String platform = null;
    public static int LONG_TIMEOUT = 45;
    public static int SHORT_TIMEOUT = 30;

    public BasePage(){
        platform = System.getProperty("platform");
    }


    protected AppiumDriver<MobileElement> getDriver(){
        return driver;
    }

    protected WebDriverWait getWait(){
        return new WebDriverWait(driver, LONG_TIMEOUT);
    }

    public void setUp() throws MalformedURLException {
        driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), getCapsByPlatform(platform));
        driver.manage().timeouts().implicitlyWait(SHORT_TIMEOUT, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, LONG_TIMEOUT);
    }

    public static DesiredCapabilities getCapsByPlatform(String platform){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        if (platform.toLowerCase().equals("android")){
            capabilities = CapsAndroid.getCaps();
        }else if(platform.toLowerCase().equals("ios")){
            capabilities = CapsIOS.getCaps();
        }
        return capabilities;
    }

    public void tearDown(){
        driver.quit();
    }
}
