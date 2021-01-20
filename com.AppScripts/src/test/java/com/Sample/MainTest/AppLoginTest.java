package com.Sample.MainTest;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.AppObjects.AppObjects;
import com.Sample.Utilities.AppBrowserFactory;
import com.Sample.Utilities.ConfigReader;

public class AppLoginTest 
{
	
	public static WebDriver driver;
	public static ConfigReader config;
	public static AppBrowserFactory browser;
	public static Properties prop;
	public static AppObjects login;
	
	// Run this test project from eclipse to jenkins
	
	@BeforeSuite
	public void appBase() {
		browser=new AppBrowserFactory();
    	prop=new Properties();
    	config=new ConfigReader();
    	//login=new LoginAppObjects(driver);
	}
	
	@BeforeTest
	public void launchBrowser() {
		AppBrowserFactory.getbrowser(config.getchromebrowser(),config.getbrowserurl());
    	System.out.println("Launching browser");
	}
  
    @Test
    public void logintest() throws Exception
    {
      
    	login=new AppObjects(driver);
    	login.getusername("tester");
    	login.getpassword("admin");
    	login.clickbutton();
    }
    
    
    @AfterTest
    public void closebrowser() {
    	AppBrowserFactory.closbrowser();
    	System.out.println("Closing Browser");
    }
    
    
    
}
