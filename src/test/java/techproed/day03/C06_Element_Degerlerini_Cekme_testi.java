package techproed.day03;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import basetest.ApiDemos;

import java.net.MalformedURLException;

import static basetest.ApiDemos.driver;


public class C06_Element_Degerlerini_Cekme_testi {
    @Test
    public void elemanDegerleriniCekme() throws MalformedURLException {
        ApiDemos.setup("ApiDemos-debug.apk");

        By accessbility = AppiumBy.accessibilityId("Accessibility");
        System.out.println("Get text: "+driver.findElement(accessbility).getText());
        System.out.println("Get Attribute: "+driver.findElement(accessbility).getAttribute("package"));
        System.out.println("Get Attribute: "+driver.findElement(accessbility).getAttribute("checkable"));
        System.out.println("Get isSelected: "+driver.findElement(accessbility).isSelected());
        System.out.println("Get isDisplayed: "+driver.findElement(accessbility).isDisplayed());
        System.out.println(driver.findElement(accessbility).getSize());
        System.out.println(driver.findElement(accessbility).getLocation());

    }
}
