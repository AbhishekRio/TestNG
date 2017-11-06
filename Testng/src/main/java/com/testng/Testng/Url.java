package com.testng.Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Url {
	public WebDriver driver;
	
	
	@BeforeMethod
public void launchBrowser1(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaishali\\workspace\\Testng\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
		
		
	}
	
	@AfterMethod
public void launchBrowser11(){
		
		driver.quit();
		 
		
		
	}

}
