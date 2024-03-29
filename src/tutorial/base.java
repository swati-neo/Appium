package tutorial;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException
	{
		 File f = new File("src");
	     File fs = new File(f, "ApiDemos-debug.apk");
	   
		DesiredCapabilities cap = new DesiredCapabilities();
	     
	     cap.setCapability(MobileCapabilityType.DEVICE_NAME, "device");
	     cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	     cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
	     AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	      return driver;
		}
	}
	


