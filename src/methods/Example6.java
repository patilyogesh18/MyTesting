package methods;

public class Example6 {

	public static void main(String[] args)
	{
		//Calling Non-Static method--> Need to create object
		// Creating Object
	Example6 e4=new Example6();
	e4.test1();
	e4.test2();	
		
	}
	public void test1() //Non static method --> Because it don't have static keyword
	{
		System.out.println("HI THIS IS NON STATIC TEST1 METHOD IS RUNNING");
	}
	public void test2()
	{
		System.out.println("HI THIS IS NON STATIC TEST1 METHOD IS RUNNING");
		
	}
	
}
