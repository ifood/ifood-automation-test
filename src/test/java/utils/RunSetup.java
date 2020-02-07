package utils;

import io.appium.java_client.AppiumDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class RunSetup  extends Capabilities {

    private AppiumDriver driver;
    private final Logger logger = LogManager.getLogger(RunSetup.class.getName());


    @BeforeMethod
    @Parameters({"platform", "bundleId", "udid", "app", "device", "url"})
    public void beforeRunTests(String platform,
                               @Optional("bundleId") String bundleId,
                               @Optional("udid") String udid,
                               @Optional("app") String app,
                               @Optional("device") String device,
                               @Optional("url") String url) throws
            IllegalAccessException,
            InstantiationException {

        Capabilities caps;

        if(platform.isEmpty()) {
            caps = new Capabilities();
        } else {
            caps = new Capabilities(platform, bundleId, udid, app, device, url);
        }
        driver = caps.getDriver();
    }

    @AfterMethod
    public void afterRunTests() {

        try {
            driver.quit();
        } catch (NullPointerException e) {
            e.printStackTrace();
            logger.error(e);
        }
    }

    public AppiumDriver getDriver(){
        return driver;
    }

    /*
    * If you have installed the appium server on your machine, you can run it "automatically", via code. I'll leave here a piece of code as a demonstration
    * public AppiumDriverLocalService appiumDriverLocalService() {

        return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .usingPort(4722));
    * And then start on the Before : appiumDriverLocalService().start();
    * And them inform this on the caps: urlService = appiumDriverLocalService().getUrl().toString();
    * And at last, put this on the After: appiumDriverLocalService().stop();
    * When using this strategy, it is recommended to road as BeforeClass and not BeforeMethod. This is because it will increase the total execution time
    */

}
