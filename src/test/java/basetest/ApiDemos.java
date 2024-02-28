package basetest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class ApiDemos {

    public static AndroidDriver driver;


    public static void setup(String appName) throws MalformedURLException {
        String setApp= System.getProperty("user.dir"+
                File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources" + File.separator + appName);
        UiAutomator2Options options = new UiAutomator2Options()
                .setApp(setApp)
                .setAvdLaunchTimeout(Duration.ofMinutes(4));
        URL url = new URL("http://0.0.0.0:4723");
        driver = new AndroidDriver(url,options);
    }
    @BeforeClass
    public static void setup() throws MalformedURLException {
        String setApp= System.getProperty("user.dir"+
                File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources" + File.separator + "ApiDemos-debug.apk");
        UiAutomator2Options options = new UiAutomator2Options()
                .setApp(setApp)
                .setAvdLaunchTimeout(Duration.ofMinutes(4));
        URL url = new URL("http://0.0.0.0:4723");
        driver = new AndroidDriver(url,options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    public static void back() throws MalformedURLException {
        driver.navigate().back();
    }
}
