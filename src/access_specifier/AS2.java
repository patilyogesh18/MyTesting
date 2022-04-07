package access_specifier;

public class AS2 {

	public static void main(String[] args) 
	{
		AS1 S1=new AS1(); // object of AS1 class
		// S1.test4(); --> Private member are visible only within class
		S1.test1(); // Public method of AS1 class
		S1.test2(); // Default method of AS1 class
		S1.test3(); // Protected method of AS1 class
		
		System.out.println("Calling default member of AS1 class "+S1.a);
		System.out.println("Calling public member of AS1 class "+S1.b);
		System.out.println("Calling protected member of AS1 class "+S1.c);
		//System.out.println("Calling private member of AS1 class is not possible "+S1.d);
		
	}

}
