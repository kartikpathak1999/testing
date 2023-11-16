package autoamation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenderButton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		WebElement male=driver.findElement(By.xpath("//input[@value='Male']"));
		
		WebElement female=driver.findElement(By.xpath("//input[@value='Female']"));
		
		
		System.out.println(male.isDisplayed());
		                     // true
		
		System.out.println(female.isDisplayed());
		                     // true
		
		System.out.println(male.isEnabled());
		                     // true
		
		System.out.println(female.isEnabled());
		                     // true
		
		male.click();
		
		System.out.println(male.isSelected());
		     // true
		
		System.out.println(female.isSelected());
		     // false
		
		female.click();
		
		System.out.println(male.isSelected());
		      // false
		
		System.out.println(female.isSelected());
		      // true
		
		
		
	}

}