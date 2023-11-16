package autoamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement link1=driver.findElement(By.linkText("Forgot Your Password?"));
      
		
		 System.out.println(link1.isDisplayed());
		 
		 //to check whether link  is visible or not 
		 
		 System.out.println(link1.isEnabled());
		 
		        //to verify if link is ready to accept the command
		 // clickable or not 
		 
		System.out.println(link1.getText());
		 
		//link1.click();
		
	//System.out.println	(link1.getText());
		
 WebElement link2=driver.findElement(By.partialLinkText("Use Custom "));
 
 //link2.click();
 
 System.out.println(link2.isDisplayed());
 
 //to check whether link  is visible or not 
 
 System.out.println(link2.isEnabled());
 
        //to verify if link is ready to accept the command
 // clickable or not 
 
System.out.println(link2.getText());
 
	}

}
