package techproed.day02;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class D01_SetupDriver {
    @Test
    public void testDesiredCapabilities() throws MalformedURLException {

        //adb shell dumpsys window | find "mCurrentFocus"   CMD=> package and activity
//        mCurrentFocus=null
//        mCurrentFocus=Window{ba2e0bb u0 com.google.android.apps.nexuslauncher/com.google.android.apps.nexuslauncher.NexusLauncherActivity}

        //Chrome CMD=> com.android.chrome/com.google.android.apps.chrome.Main
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","android");
        capabilities.setCapability("automationName","uiautomator2");
        capabilities.setCapability("udid","emulator-5554");
//        capabilities.setCapability("app", "C:\\Users\\mstf-\\OneDrive\\Documents\\GitHub\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk");
        capabilities.setCapability("appPackage", "com.google.android.apps.nexuslauncher");
        capabilities.setCapability("appActivity","com.google.android.apps.nexuslauncher.NexusLauncherActivity" );
        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url,capabilities);
    }

    @Test
    public void testuiAutomator2Options() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();

        options.setUdid("emulator-5554")
//                .setApp("C:\\Users\\mstf-\\OneDrive\\Documents\\GitHub\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk")
                .setAppPackage("com.android.chrome")
                .setAppActivity("com.google.android.apps.chrome.Main")
        ;
        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url,options);


    }
    @Test
    public void testuiAutomator2OptionsCalculator() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();

        options.setUdid("320057c547bac507")
//                .setApp("C:\\Users\\mstf-\\OneDrive\\Documents\\GitHub\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk")
                //com.google.android.calculator/com.android.calculator2.Calculator
                .setAppPackage("com.englishtestsonline.leveltests")
                .setAppActivity("com.englishtestsonline.leveltests.testsinif")
        ;
        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url,options);
    }
}
