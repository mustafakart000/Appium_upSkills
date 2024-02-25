package techproed.day02;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class C02_Capabilities {

    @Test
    public void testuiAutomator2OptionsCalculator() throws MalformedURLException {
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
    }
}
