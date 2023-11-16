package morningautomation;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.switchTo().frame(0);
		
		Thread.sleep(1000);
		
		List <WebElement> item = driver.findElements(By.xpath("//li[@class='ui-widget-content ui-selectee']"));
		 
		for(int i=0;i<item.size();i++) {
			
			
			Thread.sleep(1000);
			
	      
	               item.get(i).click();
	               
	               Thread.sleep(1000);
	               
	             
	              System.out.println(item.get(i).getText());
		}
	
		
		
		
		
	
		
	  //  System.out.println(item.get(i).getText());
	    
		
		
	    
		
		System.out.println("Cogrtualation");
		
		Thread.sleep(1000);
		
		driver.close();
		
	
		
		
		
		
	}

}
