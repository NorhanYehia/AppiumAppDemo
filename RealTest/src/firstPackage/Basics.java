package firstPackage;

import POM.HomePage;
import POM.Preferences;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Basics  extends Base{

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);

        HomePage h = new HomePage(driver);

        h.Preferences.click();
        Preferences p = new Preferences(driver);
        p.dependencies.click();
       // driver.findElementByXPath("//android.widget.TextView[@text= 'Preference']").click();
       // driver.findElementByXPath("//android.widget.TextView[@text = '3. Preference dependencies']").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("Hello");
       // driver.findElementsByClassName("android.widget.Button").get(1).click();
        p.buttons.get(1).click();

    }

}
