package Homework;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	
	WebElement option11=driver.findElement(By.xpath("//select [@id='dropdown-class-example']"));
	
System.out.println(option11.isDisplayed());

System.out.println(option11.isEnabled());
	
option11.click();

System.out.println(option11.isSelected());


WebElement option1=driver.findElement(By.xpath("//option [@value='option1']"));

System.out.println(option1.isDisplayed());

System.out.println(option1.isEnabled());

Thread.sleep(1000);
option1.click();

System.out.println(option1.isSelected());

WebElement option2=driver.findElement(By.xpath("//option [@value='option2']"));

System.out.println(option2.isDisplayed());

System.out.println(option2.isEnabled());

Thread.sleep(1000);
option2.click();

System.out.println(option2.isSelected());



WebElement option3=driver.findElement(By.xpath("//option [@value='option3']"));

System.out.println(option3.isDisplayed());

System.out.println(option3.isEnabled());

Thread.sleep(1000);

option3.click();

System.out.println(option3.isSelected());

List<WebElement>Dropdown=driver.findElements(By.xpath("//select[@id='dropdown-class-example']"));

for(int i=0;i<Dropdown.size();i++)
{
	 Dropdown.get(i).click();
}

for(WebElement v:Dropdown)
{
	 v.click();
}

driver.close();




}




}

