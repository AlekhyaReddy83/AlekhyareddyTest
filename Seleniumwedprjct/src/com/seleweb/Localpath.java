package com.seleweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Localpath {
	
	 static WebDriver driver;

	public static void play(String browser, String url)
	{
		// TODO Auto-generated method stub
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			//System.out.println("if statement");
			
		}
		
		else if(browser.equalsIgnoreCase("IE")) {
			
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else
		{
		  
		   System.setProperty("webdriver.firefox.marionette",System.getProperty("user.dir")); 
		   driver = new FirefoxDriver();
		  
		  }
		
		driver.get(url);
	}

}
