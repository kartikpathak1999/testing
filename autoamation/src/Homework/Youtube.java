package Homework;

	
	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		
    WebDriver driver=new ChromeDriver();
		
	 driver.get("https://www.youtube.com/watch?v=ltMMYyVqFbI");
	 
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	WebElement videoplay= driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[29]/div[2]/div[1]/button"));
   
	videoplay.click();
	System.out.println("Done");
	
	Thread.sleep(700000);
	
	driver.close();
	
	}
}

