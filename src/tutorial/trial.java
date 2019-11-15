package tutorial;

import java.net.MalformedURLException;
import java.net.URL;
 
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
 
public class trial {
	
	public static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "device");
		caps.setCapability("udid", "ZY3227NQXT");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "8.1.0");
		caps.setCapability("appPackage", "com.google.android.apps.maps");
		caps.setCapability("appActivity", "com.google.android.maps.MapsActivity");
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Driver
		try {
			driver= new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}
 
}