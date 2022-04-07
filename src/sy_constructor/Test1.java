package sy_constructor;

public class Test1 {

	public static void main(String[] args) 
	{
		Variable_Call VC=new Variable_Call(); //Create object of another class
		
		System.out.println("Value of a is "+VC.a); // Calling Non-Static variable fron another class
		System.out.println("Value of b is "+Variable_Call.b); // Calling Static variable fron another class
		System.out.println("Value of c is "+VC.name); // Calling Non-Static variable from another class
		
		
	}

}
