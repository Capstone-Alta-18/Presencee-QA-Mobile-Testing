import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginFail {
    public static void main(String[] args) throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("emulator-5554")
                .setApp("/Users/LENOVO/app/app-release.apk");
        AndroidDriver driver = new AndroidDriver(
                // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
                new URL("http://127.0.0.1:4723"), options
        );
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            // Login Gagal
            // User Login with Invalid Email and Invalid Password
            WebElement emailnimField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
            emailnimField.click();
            emailnimField.sendKeys("fakeakun@gmail.com");
            WebElement passwordField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
            passwordField.click();
            passwordField.sendKeys("12345salah");
            driver.navigate().back();
            WebElement masukButton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Masuk\"]"));
            masukButton.click();
            driver.getPageSource();

        } finally {
            driver.quit();
        }

    }
}
