package com.Sample.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppBrowserFactory {
	
	
	
	public static String weburl = "https://www.mycontactform.com/";
	public static WebDriver driver;
	
	
	
	public static WebDriver getbrowser(String browsername,String appurl) {
	
		if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","./mydrivers/chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","./mydrivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(browsername.equals("edge")) {
			System.setProperty("webdriver.edge.driver","./mydrivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}
			
		
		
		driver.get(appurl);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		return driver;
		
		
	}
	//Ending for one method
	
	
	
	

	//Creating method for closing browser
	public static void closbrowser() {
		driver.close();
	}
	
	
}
