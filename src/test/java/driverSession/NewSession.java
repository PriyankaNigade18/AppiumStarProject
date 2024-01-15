package driverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class NewSession {
  //@Test
  public void newUpadated() throws MalformedURLException
  {
	  
	  
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setCapability("platformName","Android" );
	  cap.setCapability("appium:automationName","uiautomator2");
	  cap.setCapability("appium:deviceName","pixel_6");
	  cap.setCapability("appium:udid","emulator-5554");
	  
	  String appPath=System.getProperty("user.dir")+"/src/test/resources/ApiDemos-debug.apk";
	  cap.setCapability("appium:app",appPath);
	  
	  //url to connect
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  
	  //to create session
	  AppiumDriver driver=new AndroidDriver(url,cap);
	  System.out.println(driver.getSessionId());
	  
	  
  }
  
  
  @Test
  public void driversession() throws MalformedURLException
  {
	  
	  UiAutomator2Options options=new UiAutomator2Options();
			  
	  options.setPlatformName("Android");
	  
	  String appPath=System.getProperty("user.dir")+"/src/test/resources/ApiDemos-debug.apk";
	  options.setCapability("appium:app",appPath);
	  
	//url to connect
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  
	  //to create session
	  AppiumDriver driver=new AndroidDriver(url,options);
	  System.out.println(driver.getSessionId());
	  
  }
  
}
