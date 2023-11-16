package morningautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderHomework {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/#colorpicker");
		
		
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(0);
		
		
		Actions a= new Actions(driver);
		
		
		Thread.sleep(1000);
		WebElement redslider= driver.findElement(By.xpath("//*[@id=\"red\"]/span"));
		

	   Thread.sleep(1000);
       a.clickAndHold(redslider).moveByOffset(-300, 0).release().build().perform();
       
       
       Thread.sleep(1000);
		
	   a.clickAndHold(redslider).moveByOffset(200, 0).release().build().perform();
       
	   
	   Thread.sleep(2000);
	   
		WebElement greenslider= driver.findElement(By.xpath("//*[@id=\"green\"]/div"));
		
		Thread.sleep(1000);
	       a.clickAndHold(greenslider).moveByOffset(-300, 0).release().build().perform();
	       
	       
	       Thread.sleep(1000);
			
		   a.clickAndHold(redslider).moveByOffset(200, 0).release().build().perform();
	       
		   
		   Thread.sleep(2000);
		   
			WebElement blueslider= driver.findElement(By.xpath(" //*[@id=\"blue\"] "));
			

			   Thread.sleep(1000);
		       a.clickAndHold(blueslider).moveByOffset(-300, 0).release().build().perform();
		       
		       
		       Thread.sleep(1000);
				
			   a.clickAndHold(redslider).moveByOffset(200, 0).release().build().perform();
		       
	           
	   Thread.sleep(1000);
	   
	   driver.quit();
		
		
		
	}

}
