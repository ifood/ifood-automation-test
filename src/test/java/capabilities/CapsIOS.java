package capabilities;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CapsIOS {

    public static DesiredCapabilities getCaps(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability("platformVersion", "13.3");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
        capabilities.setCapability("udid", "auto");
        capabilities.setCapability("app",System.getProperty("user.dir")+"/src/test/java/apps/ios/ifood-test.app");
        capabilities.setCapability("xcodeSigningId", "iPhone Developer");
        capabilities.setCapability("xcodeOrgId", "42BJ74CFXP");
        capabilities.setCapability("newCommandTimeout","18000");
        capabilities.setCapability("launchTimeout","20000");
        capabilities.setCapability("autoLaunch","true");
//        capabilities.setCapability("autoAcceptAlerts",false);
        return capabilities;
    }
}
