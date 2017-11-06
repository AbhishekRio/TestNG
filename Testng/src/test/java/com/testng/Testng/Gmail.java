package com.testng.Testng;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class Gmail extends Url {
	//WebDriver driver;
	EventFiringWebDriver dr;
	
	@Test
	public void login() throws InterruptedException{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaishali\\workspace\\Testng\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();*/
		dr=new EventFiringWebDriver(driver);
		//dr.get("https://gmail.com");
		
		long start = System.currentTimeMillis();
		
		dr.get("https://gmail.com");
		
		long end=System.currentTimeMillis();
		 
		long execution=end-start;
		
		System.out.println("Execution time for page Load is:- "+" "+execution);
		dr.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		ArrayList<String> tabs = new ArrayList<String> (dr.getWindowHandles());
		dr.switchTo().window(tabs.get(0));
		dr.get("http://seleniumsubbu.blogspot.in/");
		//HELLO bROTHER
	}
}
