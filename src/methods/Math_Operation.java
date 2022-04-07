package methods;

public class Math_Operation {

	public void addition() 
	{
		//int a // Variable Declaration
		//a=20 // Variable Initialization
		
		int a=10;
		int b=20;
		int sum=a+b;
		
		System.out.println("ADDITION IS "+sum);
		
	}
	
	public static void main(String[] args)
	{
		// Created object from same class
		Math_Operation m=new Math_Operation(); 
		
		// Calling non-static method addition from same class
		m.addition();
		
		// Calling static method subtraction from same class
		subtraction();
			
	}
	
	public static void subtraction()
	{
	
		int a=20;
		int b=10;
		int sub=a-b;
		
		System.out.println("SUBTRACTION IS "+sub);
		
	}
}
