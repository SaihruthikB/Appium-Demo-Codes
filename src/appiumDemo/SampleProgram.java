package appiumDemo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class SampleProgram {
	public static void main(String[] args) throws MalformedURLException {
		
		File f1 = new File("src");
		File f2 = new File(f1, "APIDemos.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Hruthik");
		cap.setCapability(MobileCapabilityType.APP,f2.getAbsolutePath());
		AndroidDriver<AndroidElement> d1 = new AndroidDriver<>(new URL("http://127.0.1.1:4723/wd/hub"),cap);
		d1.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		d1.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		d1.findElementById("android:id/checkbox").click();
		d1.findElementsByXPath("(//android.widget.RelativeLayout)").get(1).click();
		d1.findElementById("android:id/edit").sendKeys("hruthik");
		d1.findElementByAndroidUIAutomator("text(\"OK\")").click(); 
		
		
		
		
	
		
		
	}

}
