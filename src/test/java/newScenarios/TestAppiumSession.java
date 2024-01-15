package newScenarios;

import java.net.MalformedURLException;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import driverSession.CreateSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestAppiumSession {
  @Test
  public void testFirstSession() throws InterruptedException, MalformedURLException 
  {
	  AppiumDriver driver=CreateSession.initializeDriver();
	  System.out.println(driver.getSessionId());
	  
	  
	 // refer document-word file
	  
	  //rotation 
	  ((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);
	//disable
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  
	  Thread.sleep(2000);
	  
	  //enable
	 // ((AndroidDriver)driver).toggleAirplaneMode();
	  
	  //notifications
	  ((AndroidDriver)driver).openNotifications();
	  
	  
	  
  }
  
}
