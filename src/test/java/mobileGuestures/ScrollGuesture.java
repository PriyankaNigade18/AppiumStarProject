package mobileGuestures;

import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import driverSession.CreateSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ScrollGuesture {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
 AppiumDriver driver=CreateSession.initializeDriver();
		
		//view
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		//list of options for second page
		
		WebElement ele=driver.findElement(AppiumBy.id("android:id/list"));
		
		//scroll
		boolean scrollDown = (Boolean)((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			   "elementId",((RemoteWebElement)ele).getId(),
				// "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction","down",
			    "percent", 0.75
			));
		
		System.out.println("Scrolling down!");
		Thread.sleep(3000);
		
		boolean scrollUp = (Boolean)((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				   "elementId",((RemoteWebElement)ele).getId(),
					// "left", 100, "top", 100, "width", 200, "height", 200,
				    "direction","up",
				    "percent", 0.75
				));
			
			System.out.println("Scrolling up!");
		
	}

}
