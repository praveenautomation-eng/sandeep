package com.Praveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
	
	public static void main(String[] args) {
		WebDriver driver; 
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");

		 driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe" );
          driver=new FirefoxDriver();
          driver.get("https://www.google.com");
		
		
		
}
}