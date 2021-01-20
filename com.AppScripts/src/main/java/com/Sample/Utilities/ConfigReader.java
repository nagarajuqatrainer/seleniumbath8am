package com.Sample.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	public static Properties prop;
	
	public ConfigReader() {
		
		try {
			
			File file = new File("./properties/login.properties");
			FileInputStream fis = new FileInputStream(file);
			prop=new Properties();
			prop.load(fis);
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	
	
	
	
	//Crate a method for chromebrowser
	public  String getchromebrowser() {
		return prop.getProperty("chromebrowser");
	}
	
	
	
	//Create a method for chromedriverpath
	public static String getchromedriver() {
		return prop.getProperty("chromedriverpath");
	}
	
	public static String getchromepath() {
		return prop.getProperty("chromepath");
	}
	
	
	//create a method for firefoxpath
	public static String getfirefoxpath() {
		return prop.getProperty("firefoxpath");
	}
	
	
	public static String getedgedriverpath() {
		return prop.getProperty("edgedriverpath");
	}
	
	
	
	
	
	public  String getbrowserurl() {
		return prop.getProperty("browserurl");
	}
	
	
	public  String getusername() {
		return prop.getProperty("username");
	}
	
	
	public  String getpassword() {
		return prop.getProperty("password");
	}
	
	
	
	//Repositories
	
	
	public static String getunelement() {
		return prop.getProperty("unameelement");
	}
	
	public static String getpwelemenet() {
		return prop.getProperty("passwordelement");
	}
	
	public static String getloginbuttonelement() {
		return prop.getProperty("loginbutton");
	}
	
	
	public static String getsignoutelement() {
		return prop.getProperty("signout");
	}
	
}
