package com.seleweb;

import org.openqa.selenium.By;

public class Sample extends Localpath{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * Localpath.play("firefox", "http://www.redbooks.ibm.com");
		 * Localpath.play("chrome", "https://docs.oracle.com"); 
		 * Localpath.play("ie","http://www.msn.com");
		 */
		
		play("firefox", "http://www.redbooks.ibm.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(1000);
		driver.quit();
		
		play("chrome", "https://docs.oracle.com");
		
		driver.manage().window().maximize();
		String title1 = driver.getTitle();
		System.out.println(title1);
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.findElement(By.id("u02main")).click();
		driver.quit();
		
		play("ie","http://www.msn.com");
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		Thread.sleep(1000);
		driver.quit();
	}

}
