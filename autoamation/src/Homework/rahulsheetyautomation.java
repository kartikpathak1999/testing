package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rahulsheetyautomation {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
 WebElement radio1=driver.findElement(By.xpath("//input[@value='radio1']"));
 
 System.out.println(radio1.isEnabled());
 System.out.println(radio1.isDisplayed());
 radio1.click();
 System.out.println(radio1.isSelected());
 
 
 Thread.sleep(1000);
 
 
 WebElement radio11=driver.findElement(By.xpath("//input[@value='radio1']"));
 
 System.out.println(radio11.isEnabled());
 System.out.println(radio11.isDisplayed());
 radio11.click();
 System.out.println(radio11.isSelected());
 
 
 Thread.sleep(1000);
 
 WebElement radio2=driver.findElement(By.xpath("//input[@value='radio2']"));
 
 System.out.println(radio2.isEnabled());
 System.out.println(radio2.isDisplayed());
 radio2.click();
 System.out.println(radio2.isSelected());
 
 
 Thread.sleep(1000);
 
 WebElement radio3=driver.findElement(By.xpath("//input[@value='radio3']"));
 
 System.out.println(radio3.isEnabled());
 System.out.println(radio3.isDisplayed());
 
 radio3.click();
 System.out.println(radio3.isSelected());
 
 
 Thread.sleep(1000);

 driver.quit();
}
}