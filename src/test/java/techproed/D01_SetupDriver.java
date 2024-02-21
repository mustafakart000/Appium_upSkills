package techproed;

import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class D01_SetupDriver {
    @Test
    public void testDesiredCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","android");
        capabilities.setCapability("automationName","uiautomator2");
    }

    @Test
    public void testUiAutomator2Options() {
        UiAutomator2Options options = new UiAutomator2Options();
    }
}
