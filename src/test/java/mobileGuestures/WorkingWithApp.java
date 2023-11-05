package mobileGuestures;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;

import driverSession.CreateSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class WorkingWithApp {

	public static void main(String[] args) throws MalformedURLException
	{
		
		AppiumDriver driver=CreateSession.initializeDriver();
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		//current status
		System.out.println("Current status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
				
//		boolean status=((AndroidDriver)driver).terminateApp("io.appium.android.apis");
//		
//		System.out.println("After termination status is: "+status);
//				
//		System.out.println("Current status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

		//Application Background Execution
		
		((AndroidDriver)driver).runAppInBackground(Duration.ofMillis(5000));
		System.out.println("Application running for 5sec in background!");
		System.out.println("Current status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

		//Un installation any app
		((AndroidDriver)driver).removeApp("io.appium.android.apis");
		System.out.println("Application removed!");
		System.out.println("Current status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

		
		//install
		
		//Application path
		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\ApiDemos-debug.apk";
		((AndroidDriver)driver).installApp(path);
		System.out.println("Current status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
		System.out.println("application install!");


		



	}

}
