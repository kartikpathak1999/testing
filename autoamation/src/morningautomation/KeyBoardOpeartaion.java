package morningautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardOpeartaion{
	
	public static void main(String [] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		Thread.sleep(2000);
		WebElement username =driver.findElement(By.xpath("//input[@name='username']"));
		
		
		username.sendKeys("Admin");
		
		Thread.sleep(1000);
		
		username.sendKeys(Keys.CONTROL+"a");
		//to select the entire text 
		
		Thread.sleep(1000);
		
		username.sendKeys(Keys.CONTROL+"c");
		
		
		username.sendKeys(Keys.TAB);
		
		Thread.sleep(1000);
		

		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		
		password.sendKeys(Keys.CONTROL+"v");
		
		Thread.sleep(1000);
		
		password.sendKeys(Keys.BACK_SPACE);
		
	Thread.sleep(1000);
		
		password.sendKeys(Keys.BACK_SPACE);
		
	Thread.sleep(1000);
		
		password.sendKeys(Keys.BACK_SPACE);
		
	Thread.sleep(1000);
		
		password.sendKeys(Keys.BACK_SPACE);
		
	Thread.sleep(1000);
		
		password.sendKeys(Keys.BACK_SPACE);
		
		
		Thread.sleep(1000);
		
		driver.quit();
	}
		
	}
	
