package morningautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		
	   //there are various methods for entering into frame
		
		//firstly like we can call by using web Element
		
		//secondly by using index of frame
		//third by using name of frame 
		
		// fourth by using value of frame 
		
		driver.switchTo().frame(0);
		
		Thread.sleep(1000);
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		Thread.sleep(1000);
		
		Actions a= new Actions(driver);
		
		a.clickAndHold(frame).moveByOffset(20, 50).release().build().perform();
	}

}
