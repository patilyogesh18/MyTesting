package methods;

public class Example4 {

	public static void main(String[] args) 
	{
		// Calling Non-Static method--> Need to create object
		// Creating object
		
		// Syntax to Create Object
		// --> Classname Objectname=new Classname();
		
		demo();
		Example4 y1=new Example4();
		y1.demo1();
		
	}
	
     static void demo() 
     {
    	 System.out.println("THIS IS STATIC DEMO METHOD");
     }
     
     void demo1() {
    	 System.out.println("THIS IS NON STATIC DEMO1 METHOD");
     }
	
}
