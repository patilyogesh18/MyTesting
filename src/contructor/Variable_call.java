package contructor;

public class Variable_call {
	
	int a=10; // 1,2 --> Non static Variable
	static int b=20; // static variable
	String name="Velocity"; 

	public static void main(String[] args)
	{
		Variable_call v =new Variable_call();
		
		System.out.println("Value of variable a is "+v.a); // Calling non static variable 
		System.out.println("Value of variable b is "+b); // Calling static variable
		System.out.println("Value of name is "+v.name);
		
	}

}
