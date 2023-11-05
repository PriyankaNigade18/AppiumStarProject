package mobileGuestures;

import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import driverSession.CreateSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class SwipeAction {

	public static void main(String[] args) throws MalformedURLException {
		AppiumDriver driver=CreateSession.initializeDriver();
		
		//view
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		//list of options for second page
		
		//WebElement ele=driver.findElement(AppiumBy.id("android:id/list"));
		
		
		//ele-Gallery
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		
		//photos
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		
		
		WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
		
		//swipe code
			
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId",((RemoteWebElement) ele).getId(),
			    //"left", 100, "top", 100, "width", 200, "height", 200,
			    "direction","left",
			    "percent", 0.75
			));
		
		
		System.out.println("Swipe done!");
		
		
	}

}
