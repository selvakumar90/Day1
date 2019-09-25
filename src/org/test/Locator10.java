package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sam\\eclipse-workspace-sele\\Locators\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement userId=driver.findElement(By.id("username"));
		userId.sendKeys("BruceWayne");
		
		WebElement pWd=driver.findElement(By.id("password"));
		pWd.sendKeys("iambatman");
	}
}
