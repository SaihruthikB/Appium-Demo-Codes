package appiumDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebApps {
	
	public static void main(String[] args) throws MalformedURLException {
		
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Hruthik");
	cap.setCapability("chromedriverExecutable", "C:\\Users\\RSTL022\\eclipse-workspace\\MobileAppTesting\\src\\chromedriver.exe");
	//cap.setCapability("chromedriverExecutable", "C:\\Users\\RSTL022\\eclipse-workspace\\MobileAppTesting\\src\\chromedriver1.exe");
	cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
	//cap.setCapability(MobileCapabilityType.BROWSER_VERSION,"69.0");
	AndroidDriver<AndroidElement> d1 = new AndroidDriver<>(new URL("http://127.0.1.1:4723/wd/hub"),cap);
	d1.get("https://www.facebook.com/");
	d1.findElementByXPath("//*[@id=\"m_login_email\"]").sendKeys("hruthik");
	d1.findElementByXPath("//*[@id=\"m_login_password\"]").sendKeys("Password");
	d1.findElementByXPath("//button[@value='Log In']").click();
	} 

}
