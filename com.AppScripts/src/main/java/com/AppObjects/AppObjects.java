package com.AppObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Sample.Utilities.ConfigReader;





public class AppObjects {
	public static WebDriver driver;
	public static ConfigReader login;
	
	
	
	public AppObjects(WebDriver driver) {
		AppObjects.driver=driver;
	}
	
	
	public static void getusername(String un) {
		login=new ConfigReader();
		driver.findElement(By.name(ConfigReader.getunelement())).sendKeys(un);
	}
	
	
	
	
	public static void getpassword(String pw) {
		driver.findElement(By.name(ConfigReader.getpwelemenet())).sendKeys(pw);
	}
	
	
	public static void clickbutton () {
		WebElement loginbutton = driver.findElement(By.name(ConfigReader.getloginbuttonelement()));
		if(loginbutton.isEnabled()) {
			loginbutton.click();
			System.out.println("Login button performed successfully");
		}
		else
		{
			System.out.println("Does not performed");
		}
	}
	
	
	public static void signout() {
		
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"user_bar\"]/ul/li[1]/a"));
		if(logout.isEnabled()) {
			logout.click();
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Login fail");
		}
		
		
	}
	
	
	
}
