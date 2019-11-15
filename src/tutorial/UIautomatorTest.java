package tutorial;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;



public class UIautomatorTest extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

	AndroidDriver <AndroidElement> driver = Capabilities();	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	// driver.findElementByAndroidUIAutomator(attribute(value))  ---> Syntax
	
		/*
		 * // --------Tap on different interconnected links --------
		 * //driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		 * //driver.findElementByAndroidUIAutomator("text(\"Events\")").click();
		 */
	
		/*
		 * //----------------Find out non click-able links---------------
		 * //driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		 * //System.out.println(driver.
		 * findElementByAndroidUIAutomator("new UiSelector().clickable(false)").getSize(
		 * ));
		 */
	
	
		/*
		 * //------------------Taping and long press event------------------------
		 * driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		 * TouchAction t = new TouchAction(driver); WebElement expandList = driver.
		 * findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		 * t.tap(tapOptions().withElement(element(expandList))).perform();
		 */
	
	
	
		/*
		 * //-----------------long-press-----------------------
		 * driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		 * TouchAction t = new TouchAction(driver); 
		 * WebElement expandList = driver.
		 * findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		 * t.tap(tapOptions().withElement(element(expandList))).perform(); driver.
		 * findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").
		 * click(); WebElement longPress =
		 * driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		 * t.longPress(longPressOptions().withElement(element(longPress)).withDuration(ofSeconds(2))).release().perform();
		 */
	
	
		
		
		/*
		 * //------------ swipe event-------
		 * driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		 * driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		 * driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		 * //driver.findElementByAndroidUIAutomator("//tag-name[@attributes=value]")---
		 * Syntax driver.findElementByXPath("//*[@content-desc= '9']").click();
		 * TouchAction t = new TouchAction(driver); //-------long-press on element
		 * for1sec ---- move to another element ----- release WebElement swipe1
		 * =driver.findElementByXPath(
		 * "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='15']"
		 * ); WebElement swipe2 = driver.findElementByXPath(
		 * "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='45']"
		 * ); t.longPress(longPressOptions().withElement(element(swipe1)).withDuration(
		 * ofSeconds(2))).moveTo(element(swipe2)).release().perform();
		 */		 
	
	
	
		
		
		/*
		 * // ----------------------scrolling event---------------
		 * driver.findElementByAndroidUIAutomator("text(\"Views\")").click(); //
		 * ---Android API code executing inside function driver.
		 * findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"
		 * ).click();
		 */
		 
	
	
		
		  //--------- Drag and Drop----------
		  
		  driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click(); 
		  driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]").click(); 
		  // longpress---- move----release 
		  TouchAction t= new TouchAction(driver);
		  WebElement drag1 = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		  WebElement drag2 = driver.findElementById("io.appium.android.apis:id/drag_dot_2");
		  WebElement drag3 = driver.findElementById("io.appium.android.apis:id/drag_dot_3");
		  t.longPress(element(drag1)).moveTo(element(drag2)).release().perform();
	
	
	
	
	}

}
