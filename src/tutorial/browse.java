package tutorial;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;
import org.testng.asserts.*;
public class browse extends baseChrome{

	@SuppressWarnings("deprecation")
	public static void main (String [] args) throws MalformedURLException, InterruptedException

	{
		System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver.exe");
		
		
		RemoteWebDriver driver = capabilities();
		
		/*
		 * driver.get("https://facebook.com");
		 * driver.findElement(By.id("m_login_email")).sendKeys("truefalseqa@gmail.com");
		 * driver.findElement(By.id("m_login_password")).sendKeys("password2291");
		 * driver.findElement(By.name("login")).click(); Thread.sleep(5000);
		 * driver.findElement(By.cssSelector("button[type=submit][value=OK]")).click();
		 */		
		
		
		driver.get("http://cricbuzz.com/");
		 System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@href='#menu']")).click();
		driver.findElement(By.cssSelector("a[title='Cricbuzz Home']")).click();
		 System.out.println(driver.getTitle());
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("window.scrollBy(0, 480)","");
	
		/*
		 * SoftAssert sf = new SoftAssert();
		 * sf.assertTrue(!driver.findElement(By.xpath("//h4[text() ='Top Stories']")).
		 * getAttribute("class").contains("header"),"Verihgtfvgttfied" );
		 * //org.testng.Assert.assertTrue(!driver.findElement(By.
		 * xpath("//h4[text() ='Top Stories']")).getAttribute("class").contains("header"
		 * ),"Verihgtfvgttfied" ); //Assert.assertTrue("Verified",driver.findElement(By.
		 * xpath("//h4[text() ='Top Stories']")).getAttribute("class").contains("header"
		 * )); System.out.println("Swati"); sf.assertAll();
		 */
	}
}
