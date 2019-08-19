package com.seleweb;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;


public class SeleniumFirstdriver {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\Sys1\\Desktop\\geckodriver-v0.24.0-win64");
		
		//FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://accounts.google.com");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sys1\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		//ChromeDriver driver = new ChromeDriver();
		//driver.get("https://accounts.google.com");
		
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Sys1\\Desktop\\edgedriver_win64\\edgedriver.exe");
		
		
		  //WebDriver driver = new ChromeDriver(); 
		  WebDriver driver1 = new		  FirefoxDriver(); 
		  //driver.get("https://www.youtube.com");
		  driver1.get("https://www.youtube.com");
		 
		
		
		
		/*
		 * driver = new ChromeDriver(); driver.get("https://www.guru99.com"); driver =
		 * new FirefoxDriver(); driver.get("https://www.yahoo.com");
		 */
		/*
		 * driver = new EdgeDriver(); driver.get("https://github.com");
		 */
		 
		
	}

}
