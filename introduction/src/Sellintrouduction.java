
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sellintrouduction {
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\Downloads\\geckodriver-v0.33.0-win32\\geckodriver.exe");
	//	System.setProperty("webdriver.edge.driver", "D:\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		//invoking browser 
		
		
	//WebDriver driver=new ChromeDriver();
	//Firefox launch
		
	//geckodriver 
	
	//WebDriver driver= new FirefoxDriver();
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}

//after release of feature of 4.6.0 this feature is optional which feature u taking about
// i mean this one  
// System.setProperty this one is optional 

// beacause of selenium manager 
//we can directly start our program at chromeDriver 
