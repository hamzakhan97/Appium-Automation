import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstAndroidCase {
    AppiumDriver driver;
    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "android");
        caps.setCapability("platformVersion", "14");
        caps.setCapability("deviceName", "Google Pixel 7 pro");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.lillydoo.app.android.lillydoonamesfinderapp");
        caps.setCapability("appActivity", "com.lillydoo.app.android.lillydoonamesfinderapp.activities.cart.CartActivity");
        caps.setCapability("udid", "29061FDH300QD9");
        caps.setCapability("appWaitForLaunch", false);
        caps.setCapability("appWaitActivity", "com.lillydoo.app.android.lillydoonamesfinderapp.activities.cart.CartActivity");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
    }

    @Test
    public void click_App_Button() {
        driver.findElement(By.id("btn_consent_accept_all")).click();

    }

    //@AfterTest
   // public void tearDown() {
       // if (driver != null) {
         //   driver.quit();


    public static void main(String[] args) {
        BasicConfigurator.configure();
        FirstAndroidCase test = new FirstAndroidCase();
        try {
            test.setUp();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
