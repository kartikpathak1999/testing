package dropddown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {
	
	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		//selecting checkboxes 
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//Assert.assertFalse(false);
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	
	//ui-state-default ui-state-active
	
	
//	System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
	//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//	System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
  System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
  System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
  
  if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
	  
	  
	  System.out.println("its enabled");
	  Assert.assertTrue(true);
	  
  }
  
  else {
	  
	  Assert.assertTrue(false);
  }
	
	
	//count the no of checkboxes 
	
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	
driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000L);
	
		
		
//		driver.findElement(By.id("hrefIncAdt")).click();
//		driver.findElement(By.id("hrefIncAdt")).click();
//		driver.findElement(By.id("hrefIncAdt")).click();
//		driver.findElement(By.id("hrefIncAdt")).click();
//		
//		driver.findElement(By.id("btnclosepaxoption")).click();
		//let say its a requirement to select 5 adults 
		
		//but its not good ur lead will simply reject ur code
		
		//very easily
		//4 times
		
		
		//instant u will get comment from leds and ur leads 
		// will reject ur  code beacause ur repeating many lines 
	    // in that case we need to use  loop 
		//int  i=1;
		//while (i<5 )
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//			  
//		}
	
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			
for(int i=1;i<4;i++) {	

	driver.findElement(By.id("hrefIncAdt")).click();
}
	
	
		
	driver.findElement(By.id("btnclosepaxoption")).click();
	
	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

}

	}

