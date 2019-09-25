package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sam\\eclipse-workspace-sele\\BrowserLaunch\\drivers\\chromedriver_1.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement textUserLogin= driver.findElement(By.id("email"));
		textUserLogin.sendKeys("sam2selva@gmail.com");
		
		WebElement textUserPass= driver.findElement(By.id("pass"));
		textUserPass.sendKeys("imbatman");
		
		WebElement lgBtn= driver.findElement(By.id("u_0_b"));
		lgBtn.click();
		
		Thread.sleep(500);		
				
		WebElement textUserPass1= driver.findElement(By.xpath("//input[@name='pass']"));
		textUserPass1.sendKeys("8300406075");
		
		WebElement lgBtn1= driver.findElement(By.id("loginbutton"));
		lgBtn1.click();
		
		WebElement textUserPass2= driver.findElement(By.xpath("//input[@name='pass']"));
		textUserPass2.sendKeys("8300406095");
		
		WebElement lgBtn2= driver.findElement(By.id("loginbutton"));
		lgBtn2.click();
	}
}