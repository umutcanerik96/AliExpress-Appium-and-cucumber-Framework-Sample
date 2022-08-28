package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver extends DesiredCapabilities{


    public static MobileDriver getDriver() throws MalformedURLException {

        private AndroidDriver androidDriver;


        protected void preparation() throws{
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability("platformVersion", "7.1.1");
                capabilities.setCapability("deviceName", "EPHUT21127014464");
                capabilities.setCapability("appPackage", "com.alibaba.aliexpresshd");
                capabilities.setCapability("appActivity", "com.alibaba.aliexpresshd.home.ui.MainActivity");
                capabilities.setCapability("deviceOrientation", "Portrait");


                private AppiumDriverLocalService service;

                service = AppiumDriverLocalService.buildDefaultService();
                service.start();
                String service_url = service.getUrl().toString();
                System.out.println("Appium Service Address: " + service_url);
                androidDriver = new AndroidDriver(new URL(service_url), capabilities);
                androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        return androidDriver;
    }
    }

    public void stopServer() {
        service.stop();
    }

    public static void closeDriver() {

        boolean androidDriver;
        if (androidDriver != null) {
            androidDriver.quit();
            androidDriver = null;
        }
    }
}