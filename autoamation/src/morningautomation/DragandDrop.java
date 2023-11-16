package morningautomation;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

	public class DragandDrop {
		
		@Test
		public void drag () throws InterruptedException{

	//	public static void main(String[] args) throws InterruptedException {

	    WebDriver driver=new ChromeDriver();
	      driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);	
		  
		  Actions a= new Actions(driver);
		  
		  WebElement  Stockholm = driver.findElement(By.xpath("//*[@id=\"box2\"]"));
		  
		  Thread.sleep(2000);
		  
		  WebElement taget1= driver.findElement(By.xpath("//*[@id=\"box102\"]"));
		  
		  Thread.sleep(4000);
		  
		  a.dragAndDrop(Stockholm, taget1).release().build().perform();
		  
 WebElement  Oslo = driver.findElement(By.xpath(" //*[@id=\"box1\"]"));
		  
		  Thread.sleep(2000);
		  
		  WebElement taget2= driver.findElement(By.xpath("//*[@id=\"box101\"]"));
		  
		  Thread.sleep(4000);
		  
		  a.dragAndDrop(Oslo, taget2).release().build().perform();
		  
		  
 WebElement  Washington= driver.findElement(By.xpath("//*[@id=\"box3\"]"));
		  
		  Thread.sleep(2000);
		  
		  WebElement taget3= driver.findElement(By.xpath("//*[@id=\"box103\"]"));
		  
		  Thread.sleep(4000);
		  
		  a.dragAndDrop(Washington, taget3).release().build().perform();
		  
		  
 WebElement  Seoal = driver.findElement(By.xpath("//*[@id=\"box5\"]"));
		  
		  Thread.sleep(2000);
		  
		  WebElement taget4= driver.findElement(By.xpath("//*[@id=\"box105\"]"));
		  
		  Thread.sleep(4000);
		  
		  a.dragAndDrop(Seoal, taget4).release().build().perform();
		  
		  
 WebElement  Rome = driver.findElement(By.xpath("//*[@id=\"box6\"]"));
		  
		  Thread.sleep(2000);
		  
		  WebElement taget5= driver.findElement(By.xpath("//*[@id=\"box106\"]"));
		  
		  Thread.sleep(4000);
		  
		  a.dragAndDrop(Rome, taget5).release().build().perform();
		  
		  
 WebElement  Madrid = driver.findElement(By.xpath("//*[@id=\"box7\"]"));
		  
		  Thread.sleep(2000);
		  
		  WebElement taget6= driver.findElement(By.xpath("//*[@id=\"box107\"]"));
		  
		  Thread.sleep(2000);
		  
		  a.dragAndDrop(Madrid, taget6).release().build().perform();
		  
		  
 WebElement  Copenhagen = driver.findElement(By.xpath("//*[@id=\"box4\"]"));
		  
		  Thread.sleep(2000);
		  
		  WebElement taget7= driver.findElement(By.xpath("//*[@id=\"box104\"]"));
		  
		  Thread.sleep(2000);
		  
		  a.dragAndDrop(Copenhagen, taget7).release().build().perform();
		  
		  
	
		  Thread.sleep(2000);
		  
		  
		  driver.close();
		  
		  
		  
		  
		  
		}  
		  
		  
		  
		  
		  
		}
	