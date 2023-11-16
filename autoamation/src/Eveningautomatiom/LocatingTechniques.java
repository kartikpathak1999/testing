package Eveningautomatiom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingTechniques {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
	    Thread.sleep(1000);
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		
		username.click();
		username.sendKeys("kartikeya");
		
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		
		password.click();
		password.sendKeys("08111999");
		
		driver.quit();
		
		
		
		
	}

}
