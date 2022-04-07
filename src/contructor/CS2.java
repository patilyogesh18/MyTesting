package contructor;

public class CS2 {
	
	public CS2() // This is user defined zero parameter constructor
	{
		System.out.println("Running zero parameter constuctor");
	}
	public static void main(String[] args) 
	{
		CS2 C2 = new CS2(); // Creating object
		C2.test1(); // Calling Non static method
	}
	
	public void test1() // This is non static method
	{
		System.out.println("Non static method is called");
	}

}
