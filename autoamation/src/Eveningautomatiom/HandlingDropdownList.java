package Eveningautomatiom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownList {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		
		
driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");		
		

Thread.sleep(1000);
WebElement continents=driver.findElement(By.xpath("//select[@name='continents']"));

//Thread.sleep(1000);
//continents.click();

Select s=new Select(continents);

Thread.sleep(1000);
s.selectByIndex(2);

Thread.sleep(1000);

s.selectByVisibleText("Australia");

//to print all option on console window

List<WebElement>e=s.getOptions();
for(int i=0;i<e.size();i++) {
	
	System.out.println(e.get(i).getText());
}

//2nd approach to print all the web element 

System.out.println();

for(WebElement k:e) {
	
System.out.println(k.getText());
	
}

driver.close();
	
	}
	
}

