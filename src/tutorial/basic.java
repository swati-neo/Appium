package tutorial;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basic extends base 
{
	public static void main (String [] args) throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	driver.findElementById("android:id/checkbox").click();
	driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
	driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
	driver.findElementsByClassName("android.widget.Button").get(1).click();
	
	
	}
	
	

}
