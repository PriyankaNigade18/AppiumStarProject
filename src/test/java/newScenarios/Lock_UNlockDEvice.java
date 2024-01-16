package newScenarios;

import java.net.MalformedURLException;
import java.time.Duration;

import org.testng.annotations.Test;

import driverSession.CreateSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Lock_UNlockDEvice {
  @Test
  public void testLockUnlock() throws MalformedURLException
  
  {
	  
	  
	  AppiumDriver driver=CreateSession.initializeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  ((AndroidDriver)driver).lockDevice();
	  System.out.println("This device is locked?: "+((AndroidDriver)driver).isDeviceLocked());
	  
	  ((AndroidDriver)driver).unlockDevice();
	  System.out.println("This device is locked?: "+((AndroidDriver)driver).isDeviceLocked());

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
