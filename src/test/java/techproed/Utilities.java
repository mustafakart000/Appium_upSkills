package techproed;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Utilities {

    public static AndroidDriver driver;


    public static AndroidDriver pathAndDriver(String appName) throws MalformedURLException {
        String setApp= System.getProperty("user.dir"+
                File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources" + File.separator + appName);
        UiAutomator2Options options = new UiAutomator2Options()
                .setApp(setApp)
                .setAvdLaunchTimeout(Duration.ofMinutes(4));
        URL url = new URL("http://0.0.0.0:4723");
        driver = new AndroidDriver(url,options);
        return driver;
    }
    public static void back() throws MalformedURLException {
        driver.navigate().back();
    }
}
