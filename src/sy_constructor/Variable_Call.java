package sy_constructor;

public class Variable_Call {

	int a=10; //Non static variable
	static int b=20; // static variable
	String name="Velocity";
	
	
	public static void main(String[] args) 
	{
	Variable_Call v=new Variable_Call(); // Creating object

	System.out.println("value of variable a is "+v.a); //Calling Non-Static variable
	System.out.println("value of variable b is "+b); // Calling static variable
	System.out.println("value of name is "+v.name);
	
	}

}
