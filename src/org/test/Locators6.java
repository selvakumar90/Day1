package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators6 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sam\\eclipse-workspace-sele\\Locators\\drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	
	String title=driver.getTitle();
	System.out.println(title);
	
	String currentUrl=driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	WebElement loc=driver.findElement(By.id("location"));
	loc.sendKeys("Coimbatore");
	}
}
