package methods;

public class Example7 {

	public static void main(String[] args)
	{
	Example7 e5=new Example7(); // Created object of a class
	e5.demo();	// Calling non-static method from same class
	Example6 e4=new Example6(); //Created object of another class
	e4.test2(); // Calling non-static method from another class
		
		
	}
	public void demo() 
	{
	System.out.println("HI THIS IS NON STATIC DEMO METHOD");
		
	}
	
}
 