package example;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestNGParallel {
	
	
	 public static final String USERNAME = "bhagyeshnanwani4";
	  
	 public static final String AUTOMATE_KEY = "bQc9V5scoYwsAqxRnUvc";
	  
	 public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	@Test
	public void test1() throws Exception {
		
		 DesiredCapabilities caps = new DesiredCapabilities();
		    
		    caps.setCapability("os", "Windows");
		   
		    caps.setCapability("os_version", "10");
		    
		    caps.setCapability("browser", "Chrome");
		    
		    caps.setCapability("browser_version", "80");
		    
		    caps.setCapability("name", "demotesting4's First Test");

			caps.setCapability("project", "Amazon");
		      
		    caps.setCapability("build", "V1.2");
		    
		    
		    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		    
		    JavascriptExecutor jse = (JavascriptExecutor)driver;
		 
				
				driver.manage().window().maximize();
				
				driver.get("https://www.amazon.com/");
				
				WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
				
				search.sendKeys("iPhone X");
				
				search.sendKeys(Keys.ENTER);
				
				WebDriverWait wait1 = new WebDriverWait(driver,20);
				
				WebElement ios = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"p_n_feature_twenty_browse-bin/17881878011\"]/span/a/span")));
				
				ios.click();
				
				
				//WebDriverWait wait2 = new WebDriverWait(driver,20);
				
				//WebElement done = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div[2]/span/span/span/button")));
				
				//done.click();
				
				
				WebDriverWait wait3 = new WebDriverWait(driver,20);
				
				WebElement sortby = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.className("a-dropdown-prompt")));
				
				sortby.click();
				
				WebDriverWait wait4 = new WebDriverWait(driver,20);
				
				WebElement HightoLow = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.id("s-result-sort-select_2")));
				
				HightoLow.click();
				
				System.out.println("Name");
				
				
				try {
					
					WebDriverWait wait5 = new WebDriverWait(driver, 10);
					
					List<WebElement> names = wait5.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("a-size-medium")));
					
					for(WebElement webElement: names) {
						
					String temp = webElement.getText();
					
					System.out.println(temp); 
					
					}
					
					}
				
					catch(Exception e) { 
						
						System.out.println(e.getMessage());
					
					}
				
				
					System.out.println("Links");
				
					try {
					
					WebDriverWait wait5 = new WebDriverWait(driver, 10);
					
					List<WebElement> links = wait5.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a")));
					
					for(WebElement webElement: links) {
						
					String temp = webElement.getAttribute("href");
					
					System.out.println(temp); 
					
					}
					
					}
				
					catch(Exception e) { 
						
						System.out.println(e.getMessage());
					
					}
					
					System.out.println(driver.getTitle());
					
						if (driver.getTitle().equals("Amazon.com : iPhone X")) {
					      jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Title matched!\"}}");
					    }
						
						
					    else {
					      jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Title not matched\"}}");
					    }
					
					
					driver.quit();
					
					
				
				
		  
		  
	  }


		
		
	
	@Test
	public void test2() throws Exception {
		
		
		 DesiredCapabilities caps = new DesiredCapabilities();
		    
		  
		 caps.setCapability("os_version", "11");
		 
		 caps.setCapability("device", "iPhone 8 Plus");
		 
		 caps.setCapability("real_mobile", "true");

		 caps.setCapability("project", "Amazon");
		      
		    caps.setCapability("build", "V1.2");
		 
		 WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		    
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 
				
				//driver.manage().window().maximize();
				
		 driver.get("http://www.amazon.com");
		    
		    WebDriverWait wait = new WebDriverWait(driver,20);
		    
		    
		    WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("k"))));
		   
		    search.sendKeys("iPhone X");
			
		    search.sendKeys(Keys.ENTER);
		    
			WebDriverWait wait1 = new WebDriverWait(driver,20);
			
			WebElement cellphones = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"s-all-filters\"]")));
			
			cellphones.click();
			
			
			WebDriverWait wait2 = new WebDriverWait(driver,20);
			
			WebElement ios = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("p_n_feature_twenty_browse-bin/17881878011")));
			
			ios.click();
			
			
			System.out.println("Names");
			
			try {
				
				WebDriverWait wait5 = new WebDriverWait(driver, 10);
				
				List<WebElement> names = wait5.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"search\"]/span[3]/div[2]/div/div/div/div/div[1]/div/div/div/a[1]/div[1]/h2/span")));
				
				for(WebElement webElement: names) {
					
				String temp = webElement.getText();
				
				System.out.println(temp); 
				
				}
				
				}
			
				catch(Exception e) { 
					
					System.out.println(e.getMessage());
				
				}
			
			
				System.out.println("Links");
			
				try {
				
				WebDriverWait wait5 = new WebDriverWait(driver, 10);
				
				List<WebElement> links = wait5.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"search\"]/span[3]/div[2]/div/div/div/div/div[1]/div/div/div/a[1]")));
				
				for(WebElement webElement: links) {
					
				String temp = webElement.getAttribute("href");
				
				System.out.println(temp); 
				
				}
				
				}
			
				catch(Exception e) { 
					
					System.out.println(e.getMessage());
				
				}
				
				System.out.println("Price");
			
				
				try {
					
					WebDriverWait wait5 = new WebDriverWait(driver, 10);
					
					List<WebElement> names = wait5.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"search\"]/span[3]/div[2]/div/div/div/div/div[1]/div/div/div/a[2]/div[1]/div/div/div/span[1]/span[2]/span[2]")));
					
					for(WebElement webElement: names) {
						
					String temp = webElement.getText();
					
					System.out.println(temp); 
					
					}
					
					}
				
					catch(Exception e) { 
						
						System.out.println(e.getMessage());
					
					}
				
				
				driver.quit();
				
				
			
			
					
				
				
		  
		  
	  }
	

	@Test
	public void test3() throws Exception {
		
		 DesiredCapabilities caps = new DesiredCapabilities();
		    
		 caps.setCapability("os_version", "9.0");
		 
		 caps.setCapability("device", "Samsung Galaxy S10");
		 
		 caps.setCapability("real_mobile", "true");
		 
		 caps.setCapability("browserstack.local", "false");


		 caps.setCapability("project", "Amazon");
		      
		    caps.setCapability("build", "V1.2");
		 
		 WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		    
		 driver.get("http://www.amazon.com");
			    
			    WebDriverWait wait = new WebDriverWait(driver,20);
			    
			    JavascriptExecutor jse = (JavascriptExecutor)driver;
			    
			    WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("k"))));
			   
			    search.sendKeys("iPhone X");
				
			    search.sendKeys(Keys.ENTER);
			    
				WebDriverWait wait1 = new WebDriverWait(driver,20);
				
				WebElement cellphones = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"s-all-filters\"]")));
				
				cellphones.click();
				
				
				WebDriverWait wait2 = new WebDriverWait(driver,20);
				
				WebElement ios = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("p_n_feature_twenty_browse-bin/17881878011")));
				
				ios.click();
				
				
				
				
				try {
					
					WebDriverWait wait5 = new WebDriverWait(driver, 10);
					
					List<WebElement> names = wait5.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"search\"]/span[3]/div[2]/div/div/div/div/div[1]/div/div/div/a[1]/div[1]/h2/span")));
					
					for(WebElement webElement: names) {
						
					String temp = webElement.getText();
					
					System.out.println(temp); 
					
					}
					
					}
				
					catch(Exception e) { 
						
						System.out.println(e.getMessage());
					
					}
				
				
					System.out.println("Links");
				
					try {
					
					WebDriverWait wait5 = new WebDriverWait(driver, 10);
					
					List<WebElement> links = wait5.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"search\"]/span[3]/div[2]/div/div/div/div/div[1]/div/div/div/a[1]")));
					
					for(WebElement webElement: links) {
						
					String temp = webElement.getAttribute("href");
					
					System.out.println(temp); 
					
					}
					
					}
				
					catch(Exception e) { 
						
						System.out.println(e.getMessage());
					
					}
					
					
					System.out.println("Price");
			
				
				try {
					
					WebDriverWait wait5 = new WebDriverWait(driver, 10);
					
					List<WebElement> names = wait5.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"search\"]/span[3]/div[2]/div/div/div/div/div[1]/div/div/div/a[2]/div[1]/div/div/div/span[1]/span[2]/span[2]")));
					
					for(WebElement webElement: names) {
						
					String temp = webElement.getText();
					
					System.out.println(temp); 
					
					}
					
					}
				
					catch(Exception e) { 
						
						System.out.println(e.getMessage());
					
					}
				
					
					
					
					
					driver.quit();
					
					
				
				
		  
		  
	  }
	
	
	
	@Test
	public void test4() throws Exception {
		
		 DesiredCapabilities caps = new DesiredCapabilities();
		    
		 caps.setCapability("os", "OS X");
		 
		 caps.setCapability("os_version", "Big Sur");
		 
		 caps.setCapability("browser", "Chrome");
		 
		 caps.setCapability("browser_version", "84.0");
		 
		 caps.setCapability("browserstack.local", "false");

		 caps.setCapability("project", "Amazon");
		      
		    caps.setCapability("build", "V1.2");
		    
		    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		    JavascriptExecutor jse = (JavascriptExecutor)driver;
		 
				
				driver.manage().window().maximize();
				
				driver.get("https://www.amazon.com/");
				
				WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
				
				search.sendKeys("iPhone X");
				
				search.sendKeys(Keys.ENTER);
				
				WebDriverWait wait1 = new WebDriverWait(driver,20);
				
				WebElement ios = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"p_n_feature_twenty_browse-bin/17881878011\"]/span/a/span")));
				
				ios.click();
				
				/*
				WebDriverWait wait2 = new WebDriverWait(driver,20);
				
				WebElement done = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div[2]/span/span/span/button")));
				
				done.click();
				*/
				
				
				WebDriverWait wait3 = new WebDriverWait(driver,20);
				
				WebElement sortby = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.className("a-dropdown-prompt")));
				
				sortby.click();
				
				WebDriverWait wait4 = new WebDriverWait(driver,20);
				
				WebElement HightoLow = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.id("s-result-sort-select_2")));
				
				HightoLow.click();
				
				System.out.println("Name");
				
				
				try {
					
					WebDriverWait wait5 = new WebDriverWait(driver, 10);
					
					List<WebElement> names = wait5.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("a-size-medium")));
					
					for(WebElement webElement: names) {
						
					String temp = webElement.getText();
					
					System.out.println(temp); 
					
					}
					
					}
				
					catch(Exception e) { 
						
						System.out.println(e.getMessage());
					
					}
				
				
					System.out.println("Links");
				
					try {
					
					WebDriverWait wait5 = new WebDriverWait(driver, 10);
					
					List<WebElement> links = wait5.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a")));
					
					for(WebElement webElement: links) {
						
					String temp = webElement.getAttribute("href");
					
					System.out.println(temp); 
					
					}
					
					}
				
					catch(Exception e) { 
						
						System.out.println(e.getMessage());
					
					}
					
					System.out.println(driver.getTitle());
					
						if (driver.getTitle().equals("Amazon.com : iPhone X")) {
					      jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Title matched!\"}}");
					    }
						
						
					    else {
					      jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Title not matched\"}}");
					    }
					
					
					driver.quit();

		
		
	}

	
	
	
	
	

}
