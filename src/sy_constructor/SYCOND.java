package sy_constructor;

public class SYCOND {
	
	public SYCOND() // this is user defined zero parameter constructor
	{
		System.out.println("Running zero parameter constructor");
	}
	
	public static void main(String[] args) 
	{
		SYCOND S1=new SYCOND(); // Creating object of a class
		S1.test1(); //Calling Non-static method
	}

	public void test1() // This is Non-Static method
	{
		System.out.println("Non-static method is called");
	}
}
