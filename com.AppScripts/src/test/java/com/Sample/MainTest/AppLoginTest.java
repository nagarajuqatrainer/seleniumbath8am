package com.Sample.MainTest;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.AppObjects.LoginAppObjects;
import com.Sample.Utilities.AppBrowserFactory;
import com.Sample.Utilities.ConfigReader;

public class AppLoginTest 
{
	
	public static WebDriver driver;
	public static ConfigReader config;
	public static AppBrowserFactory browser;
	public static Properties prop;
	public static LoginAppObjects login;
	
	// Run this test project from eclipse to jenkins
	
  
    @Test
    public void logintest() throws Exception
    {
      
    	browser=new AppBrowserFactory();
    	prop=new Properties();
    	config=new ConfigReader();
    	
    	
    	AppBrowserFactory.getbrowser(config.getchromebrowser(),config.getbrowserurl());
    	System.out.println("Launching browser");
    	
    	
    	
    	AppBrowserFactory.closbrowser();
    	System.out.println("Closing Browser");
    	
    }
}
