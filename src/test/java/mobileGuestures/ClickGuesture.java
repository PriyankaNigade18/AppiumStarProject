package mobileGuestures;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import driverSession.CreateSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ClickGuesture {

	public static void main(String[] args) throws MalformedURLException
	{
		AppiumDriver driver=CreateSession.initializeDriver();
		
		
		//element
		WebElement ele=driver.findElement(AppiumBy.accessibilityId("Views"));

		//click
		
      ((AndroidDriver)driver).executeScript("mobile: clickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele).getId()
				));
		
		

	}

}
