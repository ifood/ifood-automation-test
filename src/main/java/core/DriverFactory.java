package core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    public static AppiumDriver<MobileElement> driver;

    public DesiredCapabilities androidCapabilities() {
        DesiredCapabilities androidCapability = new DesiredCapabilities();
        File appFile = new File("applications/android/ifood-test.apk");
        androidCapability.setCapability(MobileCapabilityType.APP, appFile.getAbsolutePath());
        androidCapability.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "android");
        androidCapability.setCapability(MobileCapabilityType.DEVICE_NAME, "android-emulator");
        androidCapability.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiAutomator2");

        return androidCapability;
    }

    public DesiredCapabilities iosCapabilities() {
        DesiredCapabilities iosCapability = new DesiredCapabilities();
        File appFile = new File("applications/ios/ifood-test.app");
        iosCapability.setCapability(MobileCapabilityType.APP, appFile.getAbsolutePath());
        iosCapability.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
        iosCapability.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        iosCapability.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.7");
        iosCapability.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        iosCapability.setCapability(IOSMobileCapabilityType.SEND_KEY_STRATEGY, "grouped");

        return iosCapability;
    }

    public void initDriver(String platform) {
        try {
            if (platform.equalsIgnoreCase("android")) {
                driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), androidCapabilities());
            } else if (platform.equalsIgnoreCase("ios")) {
                driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), iosCapabilities());
            }
        } catch (MalformedURLException malformedURLException) {
            System.out.println("could not start session: " + malformedURLException.getMessage());
        }

    }

    public AppiumDriver<MobileElement> getDriver(){
        return driver;
    }

}
