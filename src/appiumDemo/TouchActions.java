package appiumDemo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.TouchAction;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class TouchActions{ 

	public static void main(String[] args) throws MalformedURLException {
		
	
		File f1 = new File("src");
		File f2 = new File(f1, "APIDemos.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Hruthik");
		cap.setCapability(MobileCapabilityType.APP,f2.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.1.1:4723/wd/hub"),cap);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		WebElement e1=driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
		TouchAction t1 = new TouchAction(driver);
		t1.tap(tapOptions().withElement(element(e1))).perform();
		WebElement e2=driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")");
		t1.tap(tapOptions().withElement(element(e2))).perform();
		WebElement e3=driver.findElementByAndroidUIAutomator("text(\"People Names\")");
		t1.longPress(longPressOptions().withElement(element(e3)).withDuration(ofSeconds(2000))).release().perform();
		System.out.println(driver.findElementByAndroidUIAutomator("text(\"Sample menu\")").getText());
		
		
		
		
		
		
		
	}
}
