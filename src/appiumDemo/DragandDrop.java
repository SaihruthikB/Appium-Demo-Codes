package appiumDemo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.remote.MobileCapabilityType;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

public class DragandDrop {
	
	public static void main(String[] args) throws MalformedURLException {
		
	
	File f1 = new File("src");
	File f2 = new File(f1, "APIDemos.apk");
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Hruthik");
	cap.setCapability(MobileCapabilityType.APP,f2.getAbsolutePath());
	AndroidDriver<AndroidElement> d1 = new AndroidDriver<>(new URL("http://127.0.1.1:4723/wd/hub"),cap);
	d1.findElementByAndroidUIAutomator("text(\"Views\")").click();
	d1.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
	WebElement e1=d1.findElementsByClassName("android.view.View").get(0);
	WebElement e2=d1.findElementsByClassName("android.view.View").get(1);
	TouchAction t1 = new TouchAction(d1);
	t1.longPress(longPressOptions().withElement(element(e1))).moveTo(element(e2)).release().perform();

	
	
	
	
	


}}
