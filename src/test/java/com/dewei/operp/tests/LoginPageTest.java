package com.dewei.operp.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dewei.operp.webpages.HomePage;

public class LoginPageTest {
	WebDriver driver;
	
	
	
//	@BeforeClass
//	    public void beforeClass() {
//	        System.out.println("this is before class");
//	    }
	
//	 @AfterClass
//	    public void afterClass() {
//	        System.out.println("this is after class");
//	    }
	 
    @Test
    public void loginTest() {
        System.out.println("this is TestNG test case");
        HomePage home = new HomePage(driver);
        home.login("330110001", "330110001", "1", "0000");
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }

  
	
//    @BeforeTest
//    public void beforeTest() {
//        System.out.println("this is  before test");
//    }
    
//    @AfterTest
//    public void afterTest() {
//        System.out.println("this is after test");
//      
//    }
    
    
//    @BeforeGroups
//    public void beforeGroups() {
//        System.out.println("this is before groups");
//    }
    
   
    
//    @AfterGroups
//    public void afterGroups() {
//        System.out.println("this is after groups");
//    }
    
    @BeforeMethod
    public void setup() {
    	
//    	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//    	capabilities.setCapability("marionette", true);
    	
        System.out.println("this is before method");
//        System.setProperty("webdriver.firefox.bin", "C:/Program Files (x86)/Mozilla Firefox/firefox.exe");
//        driver = new RemoteWebDriver(capabilities);
        System.setProperty("webdriver.firefox.marionette","C:/Program Files (x86)/Mozilla Firefox/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @AfterMethod
    public void afterMethod() {
        System.out.println("this is after method");
        driver.quit();
    }
    
}
