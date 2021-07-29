package example;

import org.testng.annotations.Test;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Local {
	
	
	 public static final String USERNAME = "bhagyeshnanwani4";
	  
	 public static final String AUTOMATE_KEY = "bQc9V5scoYwsAqxRnUvc";
	  
	 public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	 public static final String buildName = System.getenv("BROWSERSTACK_BUILD_NAME");

         public static final String browserstackLocal = System.getenv("BROWSERSTACK_LOCAL");

	 public static final String browserstackLocalIdentifier = System.getenv("BROWSERSTACK_LOCAL_IDENTIFIER");
	
	
	
  @Test
  public void f() throws Exception {
	  
	  
	  DesiredCapabilities caps = new DesiredCapabilities();
	  
	  caps.setCapability("browserstack.local", "true");
	  
	  caps.setCapability("os_version", "7.0");
	  
	  caps.setCapability("device", "Samsung Galaxy S8");
	  
	  caps.setCapability("real_mobile", "true");
	  
	  caps.setCapability("project", "Amazon");
		      
	  caps.setCapability("build", buildName);

	  caps.setCapability("browserstack.local", browserstackLocal);

	  caps.setCapability("browserstack.localIdentifier", browserstackLocalIdentifier);
	  
	  WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	  
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	 
			
	
			
	  driver.get("http://localhost:45454/");
	  
	 
	  
	  if (driver.getTitle().equals("BrowserStack Local")) {
		  
	      jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Title matched!\"}}");
	      
	    }
		
		
	    else {
	    	
	      jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Title not matched\"}}");
	      
	    }
	  
	  driver.quit();
	  
  }
}
