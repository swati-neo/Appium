package tutorial;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
 
public class chromeTest {
 
	
	static AppiumDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "device");
		cap.setCapability(MobileCapabilityType.VERSION, "8.0.1");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	//	cap.setCapability("chromedriverExecutable", "D:\\Software\\chromedriver.exe");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("http://facebook.com");
 
		driver.findElement(By.id("m_login_email")).sendKeys("appiumqa22@gmail.com");
		driver.findElement(By.id("m_login_password")).sendKeys("password2291");
		
		driver.hideKeyboard();
 
		driver.findElement(By.name("login")).click();
		
	}
	
}