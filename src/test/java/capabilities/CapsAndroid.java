package capabilities;

import features.utils.BasePage;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CapsAndroid extends BasePage {

    public static DesiredCapabilities getCaps(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Awsomedroid");
        capabilities.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        capabilities.setCapability( "unicodeKeyboard" , true);
        capabilities.setCapability(  "resetKeyboard" , true);
        capabilities.setCapability("autoWebviewTimeout",4);
        capabilities.setCapability("app",System.getProperty("user.dir")+
                "/src/test/java/apps/android/ifood-test.apk");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability("appPackage", "com.ifood.testqa");
        capabilities.setCapability("appActivity", "host.exp.exponent.MainActivity");
        capabilities.setCapability("unicodeKeyboard", "true");
        capabilities.setCapability("resetKeyboard", "true");
        return capabilities;
    }
}
