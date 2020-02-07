package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.events.EventFiringWebDriverFactory;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import listeners.AppiumDriverListener;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Optional;

import java.net.MalformedURLException;
import java.net.URL;

public class Capabilities {

    private AppiumDriver driver;

    private final DesiredCapabilities caps = new DesiredCapabilities();

    Capabilities(String platform,
                 @Optional("bundleId") String bundleId,
                 @Optional("udid") String udid,
                 @Optional("app") String app,
                 @Optional("device") String device,
                 @Optional("url") String url)  throws
            IllegalAccessException,
            InstantiationException {

        if(platform.equalsIgnoreCase("iosSimulator")) { //TODO: better handle for the simulator
            capsiOS(bundleId, udid, device, url);
        } else {
            capsAndroid(app, udid, device, url);
        }
    }

    Capabilities(){ }

    private void capsiOS(String bundleId,
                         String udid,
                         String device,
                         String url) throws
            IllegalAccessException,
            InstantiationException {

        this.caps.setCapability(IOSMobileCapabilityType.BUNDLE_ID, bundleId);
        this.caps.setCapability(MobileCapabilityType.DEVICE_NAME, device);
        this.caps.setCapability(MobileCapabilityType.UDID, udid);
        this.caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.3"); //TODO: better way to make more controlable
        this.caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        this.caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        this.caps.setCapability(IOSMobileCapabilityType.SEND_KEY_STRATEGY, "setValue");
        this.caps.setCapability(IOSMobileCapabilityType.USE_NEW_WDA, false);
        this.caps.setCapability(IOSMobileCapabilityType.RESET_ON_SESSION_START_ONLY, true);

        try {
            driver = new IOSDriver(new URL(url), caps);
            setListener();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private void capsAndroid(String app,
                             String udid,
                             String device,
                             String url)  throws
            IllegalAccessException,
            InstantiationException {

        this.caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, app);
        this.caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, udid);
        this.caps.setCapability(MobileCapabilityType.DEVICE_NAME, device);
        this.caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        this.caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
        this.caps.setCapability(AndroidMobileCapabilityType.DISABLE_ANDROID_WATCHERS, true);

        try {
            driver = new AndroidDriver(new URL(url), caps);
            setListener();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    void setListener() throws
            IllegalAccessException,
            InstantiationException {

        driver = EventFiringWebDriverFactory
                .getEventFiringWebDriver(getDriver(), AppiumDriverListener.class.newInstance());

    }

    public AppiumDriver getDriver(){
        return driver;
    }



}
