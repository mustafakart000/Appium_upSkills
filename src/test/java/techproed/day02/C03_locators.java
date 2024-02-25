package techproed.day02;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class C03_locators {

    @Test
    public void testuiAutomator2OptionsLocators() throws MalformedURLException {
        String appUrl = System.getProperty("user.dir") + File.separator +
                "src" + File.separator
                + "test" + File.separator
                +"resources" + File.separator
                + "ApiDemos-debug.apk";
        UiAutomator2Options options = new UiAutomator2Options();

        options
//        .setUdid("320057c547bac507")
                .setApp(appUrl) //çalıştırılacak uygulamayı seçmek içim
                //com.google.android.calculator/com.android.calculator2.Calculator
//                .setAppPackage("com.englishtestsonline.leveltests") //çalıştırılacak uygulamayı seçmek için ikinci yöntem bu yontem setAppActivity method'u ile birlikte kullanılır
//                .setAppActivity("com.englishtestsonline.leveltests.testsinif")
//               .setAvd("320057c547bac507") // kapalı emulatörü açmak için
                .setAvdLaunchTimeout(Duration.ofMinutes(4)) //Emülator açılışında süre tanımlaması yapmak için
        ;
        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url,options);

        //1- AccessibilityId ile webElement'i alalım
        WebElement element=driver.findElement(AppiumBy.accessibilityId("Accessibility"));
        System.out.println(element.getText());

        //2- id

        WebElement element2 = driver.findElement(AppiumBy.id("android:id/text1"));
        System.out.println("android:id/text1: "+ element2.getText());
        //3- className
        WebElement element3 = driver.findElement(AppiumBy.className("android.widget.TextView"));
        System.out.println("className: "+ element3.getText());

        //4- AndroidUIAutomator
        WebElement element4 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Accessibility\")"));
        System.out.println("Android UI Automator "+ element4.getText());
        //5- xpath
        WebElement element5 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
        WebElement element6 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Accessibility\"]"));
        System.out.println("xpath content-desc:  "+ element5.getText());
        System.out.println("xpath text:  "+ element6.getText());


    }

}
