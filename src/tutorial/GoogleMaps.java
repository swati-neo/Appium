package tutorial;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
//import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class GoogleMaps {
	
	public static AppiumDriver<MobileElement> driver;
	public static AppiumDriverLocalService service;
	
	public void setup(String platform, String udid, String systemPort) {
		
		String[] platformInfo = platform.split(" ");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "device");
		caps.setCapability("udid", "ZY3227NQXT");
		caps.setCapability("platformName", platformInfo[0]);
		caps.setCapability("platformVersion", platformInfo[1]);
		//caps.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, systemPort);
		caps.setCapability("appPackage", "com.pronto.passenger");
		caps.setCapability("appActivity", "com.karru.splash.first.SplashActivity");
		caps.setCapability("noReset", "true");
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public void search() {
		driver.findElementById("search_omnibox_text_box").sendKeys("sion circle");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		List<MobileElement> list  = driver.findElementsByClassName("android.widget.TextView");
		
		for (MobileElement mobileElement : list) {
			System.out.println(mobileElement.getText());
			if((mobileElement.getText()).equalsIgnoreCase("DIRECTIONS")) {
				mobileElement.click();
				break;
			}
			
		}
		
		List<MobileElement> ele  = driver.findElementsByClassName("android.widget.TextView");
		System.out.println(ele.size());
		for (MobileElement element : ele) {
			//System.out.println(element.getText());
			if((element.getText()).equalsIgnoreCase("Choose starting point")) {
				System.out.println(element.getText());
				//mobileElement.click();
				TouchActions action = new TouchActions((WebDriver)driver);
				action.singleTap((WebElement)element);
				action.perform();
				element.sendKeys("Business Arcade Tower, Plot no- 584, Sayani Rd, Lokmanya Nagar, Dighe Nagar, Parel, Mumbai, Maharashtra 400012");
				
				//System.out.println(mobileElement.getText());
				break;
			}
			break;
		}
		
	}
	
	@BeforeSuite
	public void extentSetup() {
		service = AppiumDriverLocalService.buildDefaultService();
		System.out.println("Appium server started");
		service.start();	
	}
	@BeforeTest(alwaysRun = true)
	@Parameters({"platform", "udid", "systemPort"})
	public void setup1(String platform, String udid, String systemPort) {
		GoogleMaps gMaps = new GoogleMaps();
		gMaps.setup(platform,udid,systemPort);
	}
	@Test
	public void testMethod() {
		GoogleMaps gMaps = new GoogleMaps();
		//gMaps.setup();
		gMaps.search();

	}
	
	@AfterSuite
	public void afterSuite() {		
		service.stop();
		System.out.println("Appium server stopped");
	}

}
