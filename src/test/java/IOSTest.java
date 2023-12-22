import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class IOSTest {
    @Test
    public void iOSLaunchTest() throws MalformedURLException {
        XCUITestOptions options = new XCUITestOptions();
        options.setApp(System.getProperty("user.dir")+"/apps/iOS-Simulator-MyRNDemoApp.1.3.0-162.zip");
        options.setDeviceName("iPhone 15 Pro Max");

        IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723"),options);

    }
}
