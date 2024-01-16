package newScenarios;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import org.testng.annotations.Test;

import driverSession.CreateSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Performance {
  @Test
  public void f() throws MalformedURLException 
  { 
	  AppiumDriver driver=CreateSession.initializeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	  
	  
	  
	  
	  List<String> performanceTypes = ((AndroidDriver)driver).getSupportedPerformanceDataTypes();
	  System.out.println(performanceTypes);
	  
	  
	  
	  
	  
	  // Java
			List<List<Object>> cpuInfo=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis", "cpuinfo", 5);
			//List<Object> test=((Object)driver).startPerformanceRecording("io.appium.android.apis");

			System.out.println(cpuInfo);
			
			System.out.println("****************************************");			
			
			List<List<Object>> memoryInfo=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis", "memoryinfo", 10);
			//List<Object> test=((Object)driver).startPerformanceRecording("io.appium.android.apis");

			System.out.println(memoryInfo);
			System.out.println("****************************************");
			
			List<List<Object>> networkInfo=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis", "networkinfo", 10);
			//List<Object> test=((Object)driver).startPerformanceRecording("io.appium.android.apis");

			System.out.println(networkInfo);
			
			System.out.println("****************************************");
			
			
			
			List<List<Object>> batteryInfo=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis", "batteryinfo", 10);
			//List<Object> test=((Object)driver).startPerformanceRecording("io.appium.android.apis");

			System.out.println(batteryInfo);
			
			
			
			System.out.println("****************************************");
			
			
			
			//System.out.println(((AndroidDriver)driver).getLogcatClient());
			

  }
}
