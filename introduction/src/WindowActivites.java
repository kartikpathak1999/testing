import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivites {
	public static void main(String[] args) {
		
	

	System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/search?q=google&oq=google&aqs=chrome..69i57j69i60j69i61j69i60j69i65.4040j0j7&sourceid=chrome&ie=UTF-8");
	
	driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
 
	driver.navigate().back();
	
	driver.navigate().forward();
}
}