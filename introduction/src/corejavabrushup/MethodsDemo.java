package corejavabrushup;

public class MethodsDemo {
	
	public static void main(String[] args) {
		
	
		
	
	MethodsDemo d= new MethodsDemo();
	
	// here we are capturing  method which is string based  and we add in a string  
	String name=d.getdata();
	System.out.println(name);
	//for acessing method from another class we have to create object of that class 
	MethodDemo2 d1= new MethodDemo2();
	d1.getUserData(); 
	getdata2();
	}



 public  static String getdata()
 {
	 
	 System.out.println("hello world");
	 
	 return "rahul sheety";
 }
 
 
 public  static String getdata2()
 {
	 
	 System.out.println("hello world");
	 
	 return "rahul sheety";
 }
 }