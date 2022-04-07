package contructor;

public class Test1 {

	public static void main(String[] args) 
	{
		Variable_call vc =new Variable_call(); // Creating object of another call
		
		System.out.println("Value of a is "+vc.a); // Calling non static method of another class
	 	System.out.println("Value of b is "+Variable_call.b); // Calling from static method from another class
		

	}

}
