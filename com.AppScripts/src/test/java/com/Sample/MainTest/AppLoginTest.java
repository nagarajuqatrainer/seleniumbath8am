package com.Sample.MainTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppLoginTest 
{
	
	public static WebDriver driver;
	
	// Run this test project from eclipse to jenkins
	
  
    @Test
    public void logintest() throws Exception
    {
      //If i wan to work with Git hub server>Download git exe>Install> copy the path from installation location
    	//go to jenkins>go to configuretools>setpath in git location
    	
    	//open browser>go to github
    	
    	
    	System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
    	
    	driver = new ChromeDriver();
    	
    	driver.get("https://www.mycontactform.com/samples.php");
    	System.out.println("Launching browser");
    	
    	driver.manage().window().maximize();
    	System.out.println("Maximizing screen");
    	
    	
    	
    	Thread.sleep(3000);
    	System.out.println("Waiting page");
    	
    	driver.close();
    	System.out.println("Closing browser");
    	
    }
}
