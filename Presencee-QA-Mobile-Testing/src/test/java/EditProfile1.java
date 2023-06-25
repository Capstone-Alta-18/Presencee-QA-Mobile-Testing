import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class EditProfile1 {
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
            // User want Change Profile with Galeri
            WebElement emailnimField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
            emailnimField.click();
            emailnimField.sendKeys("anton@gmail.com");
            WebElement passwordField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
            passwordField.click();
            passwordField.sendKeys("123456");
            driver.navigate().back();
            WebElement masukButton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Masuk\"]"));
            masukButton.click();
            WebElement profilButton = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Profil\n" +
                    "Tab 3 of 3\"]"));
            profilButton.click();
            WebElement editprofilButton = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button/android.widget.Button"));
            editprofilButton.click();
            WebElement galeryButton = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button[2]"));
            galeryButton.click();
            WebElement recentimageWidget = driver.findElement(AppiumBy.xpath("//android.widget.LinearLayout[@content-desc=\"IMG_20230616_232143.jpg, 145 kB, Jun 16\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[2]"));
            recentimageWidget.click();

            driver.getPageSource();

        } finally {
            driver.quit();
        }

    }
}
