package config;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestConfig {

    private static TestConfig configInstance = null;

    private URL url;
    private DesiredCapabilities capabilities;
    private AndroidDriver<MobileElement> driver;

    public AndroidDriver<MobileElement> getDriver() {
        return driver;
    }

    public TestConfig() {

        //Config inputs should be either a config file or arguments passed when executing the tests
        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";

        try {
            url = new URL(URL_STRING);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.APP, "/home/felipe-laptop/Documents/IfoodTestFelipe/ifood-test.apk");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);

        //Test platform should be an argument and a factory would define which driver to use.
        // This test framework is limited to AndroidDriver only
        driver = new AndroidDriver<MobileElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.resetApp();
    }

    public static TestConfig getInstance()
    {
        if (configInstance == null)
            configInstance = new TestConfig();

        return configInstance;
    }
}
