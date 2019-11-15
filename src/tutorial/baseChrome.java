package tutorial;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import org.testng.asserts.*;



public class baseChrome {

	public static RemoteWebDriver capabilities() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "My Phone");
		cap.setCapability("udid", "ZY3227NQXT"); //Give Device ID of your mobile phone
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("browserName", "Chrome");
//		cap.setCapability("appPackage", "com.android.chrome");
//		cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		cap.setCapability("chromedriverExecutable", "D:\\Software\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		cap.setCapability("noReset", true);
		RemoteWebDriver driver = new RemoteWebDriver (new URL("http://127.0.0.1:4723/wd/hub"), cap);
		 
	      return driver;	
	}
	}
	


