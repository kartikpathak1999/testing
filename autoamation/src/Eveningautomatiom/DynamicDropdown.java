package Eveningautomatiom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		WebElement from =driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']"));
		
		
		from.click();
		
		//List<WebElement>city=driver.findElements(null)
		
		WebElement banglore=driver.findElement(By.xpath("(//a[@value='BLR'])[1]"));
		
		banglore.click();
		
	WebElement Mumbai =driver.findElement(By.xpath("(//a[@value='BOM'])[2]"));
		
		Mumbai.click();
		
		
		
		
	}
	

}
