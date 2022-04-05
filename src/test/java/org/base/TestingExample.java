package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingExample {
	public static void main(String[] args)  {
			
		WebDriverManager.chromedriver().setup();
		WebDriver dv = new ChromeDriver();
		dv.get("https://www.facebook.com/");
		
		WebElement user = dv.findElement(By.id("email"));
		user.sendKeys("haneesh@gmail.com");
		WebElement passs = dv.findElement(By.id("pass"));
		passs.sendKeys("7539392929");
		
	}

}
