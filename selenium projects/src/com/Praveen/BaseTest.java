package com.Praveen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public static WebDriver driver;
	public static String projectPath=System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties e;
	public static Properties envprop;
	
	public static void init() throws Exception
	{
		System.out.println("properties is loading.....");
		fis=new FileInputStream(projectPath+"//data.properties");
		p=new Properties();
		p.load(fis);
		
		fis=new FileInputStream(projectPath+"//environment.properties");
		e=new Properties();
		e.load(fis);
		String str = e.getProperty("env");
		System.out.println(str);
		
		fis=new FileInputStream(projectPath+"//"+str+".properties");
		envprop=new Properties();
		envprop.load(fis);
		System.out.println(envprop.getProperty("amazomurl"));
		
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome")) 
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(p.getProperty(browser).equals("firefox")) 
		{
			//System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe" );
			//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
	        driver=new FirefoxDriver();
		}
		
	}
	
	
	public static void navigateUrl(String url)
	{
		driver.get(envprop.getProperty(url));
		
		
	}
}
