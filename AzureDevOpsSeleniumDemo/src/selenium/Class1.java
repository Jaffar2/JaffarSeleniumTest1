/**
 * 
 */
package selenium;

/**
 * @author jaffa
 *
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import java.util.concurrent.TimeUnit;


/**
 * @author jaffa
 *
 */
public class Class1 {
	
	
	   //static String url;
	   
	   static WebDriver  driver;
	   
	
	   
	   @BeforeMethod
	   
	   public void beforeMethod() {
		   
			// System.setProperty("webdriver.chrome.driver","C:\\Users\\jaffa\\Documents\\drivers\\chromedriver.exe");
		   
	         //WebDriverManager.chromedriver().setup();
		   
		     WebDriverManager.firefoxdriver().setup();

            // driver = new ChromeDriver();
             
             driver = new FirefoxDriver();
	 
			 driver.get("https://www.saucedemo.com/");
			 
			 System.out.println("=====================> Browser Started");
		   
	   }
	  
	
	   @Test 
	   public void test1() {
		   
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 
		 System.out.println("=====================> Captured Username");
		 
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 
		 System.out.println("=====================> Captured Password");
		 
		 driver.findElement(By.id("login-button")).click();
		 
		 System.out.println("=====================> Click on login button");
	 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  		 
		 //url = driver.getCurrentUrl();
		 
		 //System.out.println("=====================> Current url is :" + url);
		 
		 System.out.println(driver.getCurrentUrl());
		 
		 //System.out.println("=====================> Browser Closed");
		 
		 //driver.close();
		
		// System.out.println("=====================> Test Passed");

	}

	   @Test
	   public void test2() {
		   
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		 
		 System.out.println("=====================> Captured Username");
		 
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 
		 System.out.println("=====================> Captured Password");
		 
		 driver.findElement(By.id("login-button")).click();
		 
		 System.out.println("=====================> Click on login button");
	 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  		 
		/*
		 * url = driver.getCurrentUrl();
		 * 
		 * System.out.println("=====================> Current url is :" + url);
		 */
		 
		 System.out.println(driver.getCurrentUrl());
		 
		 //System.out.println("=====================> Browser Closed");
		 
		 //driver.close();
		
		// System.out.println("=====================> Test Passed");

	}
 
	   
	   @Test
	   public void test3() {
		   
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("user-name")).sendKeys("problem_user");
		 
		 System.out.println("=====================> Captured Username");
		 
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 
		 System.out.println("=====================> Captured Password");
		 
		 driver.findElement(By.id("login-button")).click();
		 
		 System.out.println("=====================> Click on login button");
	 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  		 
		/*
		 * url = driver.getCurrentUrl();
		 * 
		 * System.out.println("=====================> Current url is :" + url);
		 */
		 
		 System.out.println(driver.getCurrentUrl());
		 
		 //System.out.println("=====================> Browser Closed");
		 
		// driver.close();
		
		 //System.out.println("=====================> Test Passed");

	}
   
	
	   @Test
	   public void test4() {
		   
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
		 
		 System.out.println("=====================> Captured Username");
		 
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 
		 System.out.println("=====================> Captured Password");
		 
		 driver.findElement(By.id("login-button")).click();
		 
		 System.out.println("=====================> Click on login button");
	 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  		 
		/*
		 * url = driver.getCurrentUrl();
		 * 
		 * System.out.println("=====================> Current url is :" + url);
		 */
	
		 System.out.println(driver.getCurrentUrl());


	}
   
	   @AfterMethod
	   
	   public void afterMethod() {
		   
		 
		driver.quit();
		
		System.out.println("=====================> Browser Closed");
				
		System.out.println("=====================> Test Passed");
	   
}
}
