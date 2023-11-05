package driverSession;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LocatorDemo {

	public static void main(String[] args) throws MalformedURLException
	{

		AppiumDriver driver=CreateSession.initializeDriver();
		
		//mobile element
		WebElement ele1=driver.findElement(AppiumBy.accessibilityId("Accessibility"));
		
		System.out.println("Text is: "+ele1.getText());
		ele1.click();
		
		//element 2-accessibilityId
		//driver.findElement(AppiumBy.accessibilityId("Accessibility Service")).click();
		
		//class name
		//driver.findElement(AppiumBy.className("android.widget.TextView")).click();
		
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(3).click();
		
		System.out.println("Using classname element Cliked!");
		
		driver.navigate().back();
		
		//xpath
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility Service\"]")).click();
		
		System.out.println("Using xpath Element clicked!");
		
		driver.navigate().back();
		
		//resource-id
		driver.findElement(AppiumBy.id("android:id/text1")).click();//first element
		
		driver.navigate().back();
		//third element
		driver.findElements(AppiumBy.id("android:id/text1")).get(2).click();
		
		
		
		
		
		
		

	}

}
