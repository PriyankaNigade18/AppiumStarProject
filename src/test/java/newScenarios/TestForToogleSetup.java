package newScenarios;

import java.net.MalformedURLException;

import org.testng.annotations.Test;


import driverSession.CreateSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
/*
  // Toggle Airplane Mode
driver.toggleAirplaneMode();

// Toggle Data
driver.toggleData();

// Toggle Wi-Fi
driver.toggleWifi();

 */
public class TestForToogleSetup {
  @Test
  public void networkconfig() throws InterruptedException, MalformedURLException 
  {
	  AppiumDriver driver=CreateSession.initializeDriver();
	  
	  //off-->on
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  System.out.println("Device switched to airplanemode");
	  
	  Thread.sleep(2000);
	  
	  //on--->off
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  System.out.println("Device switched to normal mode");
	  
	  	  //To enable and disable wifi
	  //Toggle Wi-Fi
	  ((AndroidDriver)driver).toggleWifi();
	  
	  System.out.println("Active Wifi get disable");
	  
	  Thread.sleep(2000);
	  
	//Toggle Wi-Fi
	  ((AndroidDriver)driver).toggleWifi();
	  System.out.println("Disabled wifi gets enabled");
	  
	  
	  //// Toggle Data
	  ((AndroidDriver)driver).toggleData();
	  
	  
  }
}
