package morningautomation;

import java.util.List;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\sel new files\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement country=driver.findElement(By.xpath("//input[@id='autosuggest']"));

		country.click();
		
		country.sendKeys("ind");
		
		Thread.sleep(1000);
		/*
		country.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(1000);
		
		country.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(1000);
		
		country.sendKeys(Keys.ENTER);
		*/
		
	   List<WebElement> a=driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		
	   Thread.sleep(1000);
	   
	   for(int i=0; i<a.size(); i++)
	   {
		   if(a.get(i).getText().equalsIgnoreCase("india"))
		   {
			   a.get(i).click();
		   }
	   }
	}

}