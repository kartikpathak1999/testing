package autoamation;
	
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class locatorsmorning {

		public static void main(String[] args) throws InterruptedException {
			
			
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			// to enter url/open
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			WebElement UN=driver.findElement(By.name("username"));
			   //locate username by using id locator
			
			UN.click();
			  //to perform click operation
			
			UN.sendKeys("ktpathak2871@gmail.com");
			
		    Thread.sleep(2000);
		    
		    WebElement PWD=driver.findElement(By.name("password"));
		    
		    PWD.click();
		    
		    PWD.sendKeys("cC40234567");
		    
		    Thread.sleep(2000);
		    
		    WebElement logIn=driver.findElement(By.xpath("//button[@type='submit']"));
		    
		    logIn.click();
		    
		    Thread.sleep(3000);
		    driver.close();
		}

	}


