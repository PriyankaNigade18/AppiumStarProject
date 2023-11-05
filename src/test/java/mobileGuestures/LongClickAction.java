package mobileGuestures;

import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import driverSession.CreateSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LongClickAction {

	public static void main(String[] args) throws MalformedURLException
	{

		AppiumDriver driver=CreateSession.initializeDriver();
		
		//click on view
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		//drag and drop ele
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		
		
		//first circle
		WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
		
		
		//long click()
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele).getId(),
			    "duration",2000
			));
		
		System.out.println("Long click is completed!");		
		
		
		
	}

}
