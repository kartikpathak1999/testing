package Eveningautomatiom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButton {

	
	public static void main(String[] args) throws InterruptedException {
		
		
Thread.sleep(1000);
		
		WebDriver driver= new ChromeDriver();
		
		

		driver.manage().window().maximize();
		
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		WebElement male= driver.findElement(By.xpath("//input[@value='Male']"));
		
	    WebElement Female=driver.findElement(By.xpath("//input[@value='Female']"));
	    
	 System.out.println(male.isDisplayed());
	 System.out.println(Female.isDisplayed());

	    
	    male.click();
	    System.out.println(male.isEnabled());
	    
	 
	    
	    System.out.println(Female.isEnabled());
		 System.out.println(Female.isEnabled());
		 
		 Thread.sleep(1000);
		    
		    Female.click();
		    System.out.println(Female.isSelected());
		    
		 
		    driver.quit();
	    
	    
		
		
	}
}
