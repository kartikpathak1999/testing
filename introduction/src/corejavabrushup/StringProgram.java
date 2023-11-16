package corejavabrushup;

public class StringProgram {
	public static void main(String[] args) {
		
	
	
	//String is a group of character its just a small  english meaning  but in  programming 
	//its totally different 
	String s2=new String ("Welcome");
	String s3=new String ("Welcome");
	
	
	String s="Rahul Sheety Acadmemy ";
	String[] splittedString =s.split("Sheety");
	System.out.println(splittedString[0]);
	System.out.println(splittedString[1]);
	//System.out.println(splittedString[2]);
	 System.out.println(splittedString[1].trim());
	
	// for (int i=0 ; i<s.length();i++)
	 
	 for(int i=s.length()-1;i>=0;i--)
		 
	 {
		 
		System.out.println(s.charAt(i));
		 
	 }
	
	}

}
