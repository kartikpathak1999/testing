package morningautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		WebElement alert = driver.findElement(By.xpath("//input[@value='Alert']"));
		
		alert.click();
		
		Thread.sleep(1000);
	
String Message=	driver.switchTo().alert().getText();

System.out.println(Message);

Thread.sleep(1000);
driver.switchTo().alert().accept();

Thread.sleep(1000);

driver.close();


	
	
	
	
	
	
	
		
		
		
		
		
		
	}

}
