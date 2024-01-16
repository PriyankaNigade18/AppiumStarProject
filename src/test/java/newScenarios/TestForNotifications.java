package newScenarios;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import driverSession.CreateSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestForNotifications 
{
	
	public static void getNotificationValue(AppiumDriver driver,int frameno)
	{
		String text=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout["+frameno+"]/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")).getText();
		  System.out.println(text);
	}
  @Test
  public void testNotification() throws MalformedURLException 
  {
	  
	  AppiumDriver driver=CreateSession.initializeDriver();
	  System.out.println(driver.getSessionId());
	  
	   
	  // open notification notifications
	  ((AndroidDriver)driver).openNotifications();
	  
	  getNotificationValue(driver,1);
	  getNotificationValue(driver,2);
	  
	 
//	  String text=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")).getText();
//	  System.out.println(text);
//	  WebElement ele=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView"));
//	  String notificationtext=ele.getText();
//	  
}
}