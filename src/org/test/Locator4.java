package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sam\\eclipse-workspace-sele\\Locators\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement logIn=driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		logIn.sendKeys("I am a Billionaire");
		
		WebElement passId=driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		passId.sendKeys("0987654");
	}
	
}
