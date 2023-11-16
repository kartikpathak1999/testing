package OtherPrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;


public class A {
	
	@BeforeClass
	
	public void c()
	
	{
		System.out.println("this code will execute before class");
	}
	
	@AfterClass
	
	
	public void d()
	{
		System.out.println("this code will execute after the class");
	}

	@Test
	
	public void b() 
	{
		
		System.out.println("Hello");
		
	
		
	}

	
}