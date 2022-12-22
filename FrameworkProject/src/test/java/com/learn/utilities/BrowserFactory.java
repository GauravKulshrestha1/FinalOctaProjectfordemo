package com.learn.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	
	public static WebDriver startApplication(WebDriver driver,String browserName, String appURL) throws InterruptedException 
	{ 
		if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
			driver = new ChromeDriver();
			Thread.sleep(3000);
			

		}
		else if(browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", ".//Driver//geckodriver.exe");
			driver = new FirefoxDriver();
			Thread.sleep(3000);
			
		}
		else if (browserName.equals("IE")) {
			
		}
		else  {
			System.out.println("Sorry We do not support this browser");
		}
		driver.manage().window().maximize();
		driver.get(appURL); 
		Thread.sleep(3000);
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver) 
	{
		driver.quit();
	}
}

