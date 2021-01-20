package com.AppObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Sample.Utilities.ConfigReader;

public class LoginAppObjects  {
	
	
	public static WebDriver driver;
	public static ConfigReader pageconfig;
	
	
	
	public LoginAppObjects(WebDriver driver) {
		LoginAppObjects.driver=driver;
	}
	
	
	public void verifyusername(String un) {
		// pageconfig = new ConfigReader();
		driver.findElement(By.name(ConfigReader.getunelement())).sendKeys(un);
		
	}
	
	
	public void verifypassword(String pw) {
		driver.findElement(By.name(ConfigReader.getpwelemenet())).sendKeys(pw);
	}
	
	
	public void clicksignout() {
		
		WebElement logout = driver.findElement(By.xpath(ConfigReader.getsignoutelement()));
		if(logout.isEnabled()) {
			logout.click();
			System.out.println("Login success");
			
		}
		else
		{
			System.out.println("Login fail");
			
		}
	}
	
	
	
	public void clickbutton() {
		WebElement loginbutton = driver.findElement(By.name(ConfigReader.getloginbuttonelement()));
		if(loginbutton.isEnabled()) {
			loginbutton.click();
			System.out.println("Button performed successfully");
		}
		else
		{
			System.out.println("Does not performed");
		}
	}

}
