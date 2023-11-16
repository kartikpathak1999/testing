package morningautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


		 
		 
		 public class Slider {

				public static void main(String[] args) throws InterruptedException {
					
				//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\sel new files\\chromedriver-win64\\chromedriver.exe");

					WebDriver driver=new ChromeDriver();
					
					driver.get("https://jqueryui.com/slider/");
					
					driver.manage().window().maximize();
					
					Thread.sleep(2000);
					
				//	WebElement f=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
				
			Thread.sleep(1000);
					
					driver.switchTo().frame(0);
					
					Thread.sleep(1000);
					
					WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
					
					Thread.sleep(1000);
					
					Actions a=new Actions(driver);
					
					a.clickAndHold(slider).moveByOffset(200, 0).release().build().perform();
				
					
					
					

				}

			
		 
		 
		 
		 
		 
	    
		 
	
		 

		 
		
		 
		
		
		
		
	}

