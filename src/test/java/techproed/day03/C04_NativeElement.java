package techproed.day03;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import java.net.MalformedURLException;

import static basetest.ApiDemos.*;

public class C04_NativeElement {

    @Test
    public void testWebElemenet() throws MalformedURLException {
        setup("ApiDemos-debug.apk");
       WebElement elementApp= driver.findElement(AppiumBy.accessibilityId("App"));
        elementApp.click();
      WebElement elementAlarm=  driver.findElement(AppiumBy.accessibilityId("Alarm"));
      elementAlarm.click();
        WebElement elementController=  driver.findElement(AppiumBy.accessibilityId("Alarm Controller"));
      elementController.click();
      back();

    }
    @Test
    public void testBy() throws MalformedURLException {
        setup("ApiDemos-debug.apk");

        //-------------------------------------------------------------------
        By app = AppiumBy.accessibilityId("App");
        By alarm = AppiumBy.accessibilityId("Alarm");
        By alarmController = AppiumBy.accessibilityId("Alarm Controller");
        //-------------------------------------------------------------------
       driver.findElement(app).click();
      driver.findElement(alarm).click();
      driver.findElement(alarmController).click();
      //findElement action bekler yani gidip sayfa da o element var mı yok mu tespit eder bu yüzden bir sonraki locate
        // için bir menu içine girilmesi gerekiyorsa bu adım gerçekleşmeli yoksa 2. adımda findElement lcoate bulamaz
        //By class'ını kullanarak bunu pasif bir kullanım hale getirebiliriz

      back();

    }

}
