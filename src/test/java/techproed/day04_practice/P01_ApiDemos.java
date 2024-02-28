package techproed.day04_practice;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import basetest.ApiDemos;

public class P01_ApiDemos extends ApiDemos {
    @Test
    public void testpractice01() {
        By preference = AppiumBy.accessibilityId("Preference");
        By preferenceDependencies = AppiumBy.accessibilityId("3. Preference dependencies");
        By wifiClick = AppiumBy.id("android:id/checkbox");
//        By wifiSetting = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"WiFi settings\"]");
        By wifiSetting = AppiumBy.androidUIAutomator("new UiSelector().text(\"WiFi settings\")");
        By alertWifiSetting = AppiumBy.id("android:id/alertTitle");
        By sendKeysWifiAlert = AppiumBy.id("android:id/edit");
        By wifiAlertButton = AppiumBy.id("android:id/button1");

        driver.findElement(preference).click();
        driver.findElement(preferenceDependencies).click();
        driver.findElement(wifiClick).click();
        driver.findElement(wifiSetting).click();
        assert driver.findElement(alertWifiSetting).isDisplayed();
        driver.findElement(sendKeysWifiAlert).sendKeys("mustafa");
        driver.findElement(wifiAlertButton).click();


    }
}
