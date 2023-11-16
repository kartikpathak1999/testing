package morningautomation;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class SimpleOperations {

		public static void main(String[] args) throws InterruptedException {
			
			
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(3000);
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			/*
			driver.manage().window().minimize();
			
	        Thread.sleep(3000);
			
			driver.manage().window().maximize();
			*/
			
			System.out.println(driver.getTitle());
			
			System.out.println(driver.getCurrentUrl());
			
			Thread.sleep(2000);
			
			driver.navigate().to("https://login.salesforce.com/?locale=in");
			
			System.out.println(driver.getTitle());
			
			System.out.println(driver.getCurrentUrl());
			
			//Thread.sleep(4000);
			
			//driver.navigate().back();
			
			System.out.println("done");
			
			//Thread.sleep(2000);
			
			//driver.navigate().forward();
			
			System.out.println("done");

			//driver.close();
			
			driver.quit();

		}

	}


