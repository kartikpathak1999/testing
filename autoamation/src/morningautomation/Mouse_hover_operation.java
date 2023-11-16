package morningautomation;

	
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Mouse_hover_operation {

		public static void main(String[] args) throws InterruptedException {
			
			

			WebDriver driver=new ChromeDriver();
			
			driver.get("http://www.unipune.ac.in/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			// create object of Actions class
			
			Actions a=new Actions(driver);
			
			WebElement Abouttheuniverstity=driver.findElement(By.xpath("//span[ @id='stUI5_txt']"));
			
			Thread.sleep(2000);
			
			a.moveToElement(Abouttheuniverstity).build().perform();
			
	        Thread.sleep(2000);
	        
	        

			WebElement Academics =driver.findElement(By.xpath("//span[@id='stUI42_txt']"));
			
			Thread.sleep(2000);
			
			a.moveToElement(Academics).build().perform();
			
	        Thread.sleep(2000);
	        
	        

			WebElement Research =driver.findElement(By.xpath("//span[@id='stUI184_txt']"));
			
			Thread.sleep(2000);
			
			a.moveToElement(Research).build().perform();
			
	        Thread.sleep(2000);
	        
	        
	        
	WebElement Administration =driver.findElement(By.xpath("//span[@id='stUI194_txt']"));
			
			Thread.sleep(2000);
			
			a.moveToElement(Administration).build().perform();
			
	        Thread.sleep(2000);
	        
	  
	        
	        
	        
	WebElement BOD =driver.findElement(By.xpath("//span[ @id='stUI215_txt']"));
			
			Thread.sleep(2000);
			
			a.moveToElement(BOD).build().perform();
			
	        Thread.sleep(2000);
	        
	        
	        
	        
	WebElement StudentsCorner =driver.findElement(By.xpath("//span[@id='stUI229_txt']"));
			
			Thread.sleep(2000);
			
			a.moveToElement(StudentsCorner).build().perform();
			
	        Thread.sleep(2000);
	               
	        
	        
	        
WebElement UsefulLinks =driver.findElement(By.xpath("//span[@id='stUI253_txt']"));
	    			
	    			Thread.sleep(2000);
	    			
	    			a.moveToElement(UsefulLinks).build().perform();
	    			
	    	        Thread.sleep(2000);        
	    	        
	  WebElement ELearning =driver.findElement(By.xpath("//span[@id='stUI277_txt']"));
	    	    			
	    	    			Thread.sleep(2000);
	    	    			
	    	    			a.moveToElement(ELearning).build().perform();
	    	    			
	    	    	        Thread.sleep(2000);
	    	    	        
	    	    	        
	    	    	         	    	        
	    	        
	    	    	        
	  WebElement Feedback =driver.findElement(By.xpath("//span[@id='stUI286_txt']"));
	    	    	  	    	    			
	    	  Thread.sleep(2000);
	    	    	  	    	    			
	 a.moveToElement(Feedback).build().perform();
	    	    	  	    	    			
	   Thread.sleep(2000);  
	    	    	  	    	    	        
	  WebElement Contact =driver.findElement(By.xpath("//span[@id='stUI288_txt']"));
	    	    	  	    	    	  	    	    			
	    	   Thread.sleep(2000);
	    	    	  	    	    	  	    	    			
	  a.moveToElement(Contact).build().perform();
	    	    	  	    	    	  	    	    			
	     Thread.sleep(2000);  
	    	    	  	    	    	  	    	    	         	  	    	    	        
	    	    	  	    	    	        
	    	    	  	    	    	        
	    	    	  	    	    	        
	    	    	  	    	    	        	    	  	    	    	        
	    	        
	        
	        /*
	        mouseHover.sendKeys(Keys.ARROW_DOWN);
	        
	        Thread.sleep(1000);
	        
	        mouseHover.sendKeys(Keys.ARROW_DOWN);
	        
	        Thread.sleep(1000);
	        
	        mouseHover.sendKeys(Keys.ENTER);
	        
	        */
	        
	        
		}

	}


