package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDRiver= new ThreadLocal<>();
	
	public WebDriver ini_driver(String browser) {
		
		System.out.println("browser value is:"+browser);
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tlDRiver.set(new ChromeDriver());
			
		}else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDRiver.set(new FirefoxDriver());
	    
		}else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			tlDRiver.set(new EdgeDriver());
					
		}else {
			
			System.out.println("Please pass the correct browser");
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		
		return getDriver();
		
		
	}
	
	public static synchronized WebDriver getDriver() {
		
		return tlDRiver.get();
		
		
	}
	
	
	
}
