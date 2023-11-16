package morningautomation;


	


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
   
	public class Handlinglinks {

	public static void main(String[] args) throws InterruptedException {
			
			
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://login.salesforce.com/?locale=in");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			WebElement link1=driver.findElement(By.linkText("Forgot Your Password?"));
			
			System.out.println(link1.isSelected());
			
			System.out.println(link1.isDisplayed());
			
			System.out.println(link1.isEnabled());
			
			// here full content/spelling is required
			// case sensitive
			
			WebElement link2=driver.findElement(By.partialLinkText("Use Custom"));
			
			//link2.click();
			
			System.out.println(link2.isDisplayed());
			
			System.out.println(link2.isEnabled());
			
			System.out.println(link2.isSelected());
			
			//link2.click();
			
			//parent xpath  child tag name in this way parent child sibling is work  
			WebElement checkBox=driver.findElement(By.xpath("//div[@class='w0 pr ln3 p16 remember']/input"));
			
			checkBox.click();
			
			Thread.sleep(3000);
			
			checkBox.click();
			
			driver.close();
			
		}

	}

