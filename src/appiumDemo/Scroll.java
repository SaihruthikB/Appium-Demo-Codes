package appiumDemo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Scroll { 
	
	public static void main(String[] args) throws MalformedURLException {
		
		
		File f1 = new File("src");
		File f2 = new File(f1, "APIDemos.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Hruthik");
		cap.setCapability(MobileCapabilityType.APP,f2.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.1.1:4723/wd/hub"),cap);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
		
		
	}   
}