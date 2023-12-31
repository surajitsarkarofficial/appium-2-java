import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidTest {

    @Test
    public void androidLaunchTest() throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");//optional
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);//optional
        options.setDeviceName("suro-test-device");
        options.setApp(System.getProperty("user.dir")+"/apps/Android-MyDemoAppRN.1.3.0.build-244.apk");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);

        driver.findElement(AppiumBy.accessibilityId("open menu")).click();
        driver.findElement(AppiumBy.accessibilityId("menu item log in")).click();
        driver.findElement(AppiumBy.accessibilityId("Username input field")).sendKeys("bob@example.com");
        driver.findElement(AppiumBy.accessibilityId("Password input field")).sendKeys("10203040");
        driver.findElement(AppiumBy.accessibilityId("Login button")).click();
        driver.close();
        driver.quit();






    }
}
