package morningautomation;

import java.util.List;

//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class checkboxclick {
//
//	public static void main(String[] args) throws InterruptedException {
//		
//		WebDriver driver = new ChromeDriver();
//		
//		
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		
//		driver.manage().window().maximize();
//		
//		
//		WebElement checkbox1=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
//		
//		System.out.println(checkbox1.isDisplayed());
//		System.out.println(checkbox1.isEnabled());
//		checkbox1.click();
//		
//		Thread.sleep(1000);
//		
//		System.out.println(checkbox1.isSelected());
//		
//		
//WebElement checkbox2=driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
//		
//		System.out.println(checkbox2.isDisplayed());
//		System.out.println(checkbox2.isEnabled());
//		checkbox2.click();
//		
//		Thread.sleep(1000);
//		
//		System.out.println(checkbox2.isSelected());
//	
//		
//WebElement checkbox3=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
//		
//		System.out.println(checkbox3.isDisplayed());
//		System.out.println(checkbox3.isEnabled());
//		checkbox3.click();
//		
//		Thread.sleep(1000);
//		
//		System.out.println(checkbox3.isSelected());
//		
//		
//		//if u want to select all checkbox in one shot 
//		
//		List<WebElement>a=driver.findElements(By.xpath("//input[@type='checkbox']"));
//		
////		 for(int i=0;i<a.size();i++) {
////			 
////			 Thread.sleep(1000);
////			 
////			 a.get(i).click();
////			 
////		 }
//		
//		
//  for (WebElement s:a) {
//	  
//	  s.click();
//	  
//	  Thread.sleep(4000);
//	  
//	  
//  }
//		
//	}
//
//}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxclick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
	WebElement checkbox1= driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
	
	
	System.out.println(checkbox1.isDisplayed());
	System.out.println(checkbox1.isEnabled());
     checkbox1.click();
	Thread.sleep(1000);
//	System.out.println(checkbox1.isSelected());
	
WebElement checkbox2= driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
	
	
	System.out.println(checkbox2.isDisplayed());
	System.out.println(checkbox2.isEnabled());
     checkbox2.click();
	Thread.sleep(2000);
	System.out.println(checkbox2.isSelected());
	
	
WebElement checkbox3= driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
	
	
	System.out.println(checkbox3.isDisplayed());
	System.out.println(checkbox3.isEnabled());
     checkbox3.click();
	Thread.sleep(2000);
	System.out.println(checkbox3.isSelected());
	
	//for selecting all checkbox in oneshot 
	
	List<WebElement>k=driver.findElements(By.xpath("//input[@type='checkbox']"));
	
//	for (int i=0;i<k.size();i++) {
//		
//		k.get(i).click();
//		Thread.sleep(3000);
//	
	//way 2 
		
		for (WebElement b: k) {
			
			Thread.sleep(2000);
			b.click();
			
			
		}
	}
	
	}
