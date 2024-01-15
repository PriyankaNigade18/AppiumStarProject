package newScenarios;

import java.net.MalformedURLException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import driverSession.CreateSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AlertHandling {
  @Test
  public void alertHandle() throws MalformedURLException 
  {
	  
	  AppiumDriver driver=CreateSession.initializeDriver();
	  
	  driver.findElement(AppiumBy.accessibilityId("App")).click();
	  
	  //alert dialogs
	  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	  
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
	  
	  
	  	Alert alt1=driver.switchTo().alert();
	  	System.out.println(alt1.getText());
	  	alt1.accept();
	  	System.out.println("Alert handled successfully");
	  	  
	  
	  	driver.findElement(AppiumBy.accessibilityId("Text Entry dialog")).click();
	  	Alert alt2=driver.switchTo().alert();
	  	driver.findElement(AppiumBy.id("io.appium.android.apis:id/username_edit")).sendKeys("Priyanka");
	  	
	  	driver.findElement(AppiumBy.id("io.appium.android.apis:id/password_edit")).sendKeys("Priyanka");
	  	System.out.println(alt2.getText());
	  	alt2.accept();
	  
  }
  
  
  //@Test
  public void toggleButton() throws MalformedURLException
  {
	  AppiumDriver driver=CreateSession.initializeDriver();
	  
	  //click on views
	  	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //click on buttons
	  	  driver.findElement(AppiumBy.accessibilityId("Buttons")).click();
	  
	  	  //click on off
	  	  WebElement ele=driver.findElement(AppiumBy.accessibilityId("Toggle"));
	  	  System.out.println(ele.getText());
	  	  
	  	((AndroidDriver)driver).toggleData();
	  	  
	  	  ele.click();
	  	  
	  	  System.out.println(ele.getText());
	  	  
	  	  
  }
}
