package sy_constructor;

public class SYCONSTRUCTOR {
	// Example for default constructor
	// Complier will create constructor for us--> Default constructor
	
	
	public static void main(String[] args) 
	{
		SYCONSTRUCTOR C1=new SYCONSTRUCTOR(); // Creating object
		C1.test1(); // Calling Non-static method
	}

	public void test1()
	{
		System.out.println("Hi this is test1 Non-static method ");
	}
	
	
}
