package methods;

public class Example2 {
	
	public static void main(String[] args) 
	{
		test1(); // Calling static method form same classs
		Example3.test3(); // Calling static method form another class
		//Syntax : classname.methodname();
		Example3.test3();
			
	}
	

	
	public static void test1() 
	{
		System.out.println("Running static method form EX2");
		System.out.println("Static Method Done");
	}
	
	
	
}