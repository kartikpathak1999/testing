package OtherPrograms;
import org.testng.annotations.Test;

public class DependsOnMethodDemo {
	
	@Test
	public void enterUrl()
	{
		System.out.println("code to open/lauch url");
	}
	
	@Test(dependsOnMethods = "enterUrl")
	public void closeBrowser()
	{
		System.out.println("code to close the current browser");
	}

}


