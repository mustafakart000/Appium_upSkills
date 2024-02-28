package techproed.day03;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import basetest.ApiDemos;

import java.net.MalformedURLException;

import static basetest.ApiDemos.driver;

public class C05_Temel_Eylemler {
    @Test
    public void testTemelEylemler() throws MalformedURLException, InterruptedException {
        ApiDemos.setup("ApiDemos-debug.apk");
        By app = AppiumBy.accessibilityId("App");
        By activity = AppiumBy.accessibilityId("Activity");
        By customTitle = AppiumBy.accessibilityId("Custom Title");
        By leftTextBox = AppiumBy.id("io.appium.android.apis:id/left_text_edit");
        By rightTextBox = AppiumBy.id("io.appium.android.apis:id/right_text_edit");
        By leftButton = AppiumBy.accessibilityId("Change Left");
        By rightButton = AppiumBy.accessibilityId("Change Right");

        driver.findElement(app).click();
        driver.findElement(activity).click();
        driver.findElement(customTitle).click();

        driver.findElement(leftTextBox).clear();
        driver.findElement(leftTextBox).sendKeys("Mustafa");
        driver.findElement(leftButton).click();

        driver.findElement(rightTextBox).clear();
        driver.findElement(rightTextBox).sendKeys("Kart");
        driver.findElement(rightButton).click();


        // İleri geri almak gibi navigate() 'un kullanılacagı methodları KeyEvent class' ile de yapabiliriz
        KeyEvent back = new KeyEvent(AndroidKey.BACK);
        KeyEvent home = new KeyEvent(AndroidKey.HOME);

        driver.pressKey(back);
        Thread.sleep(2000);
        driver.pressKey(home);

        // setClickBoardText and getClickBoardText, ctrl + c ctrl +v işlemini gerçekleştiriyor.



    }
}
