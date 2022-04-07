package Inheritance;

public class Hierarchical {

	public static void main(String[] args) 
	{
		Son1 s1=new Son1();  // Creating object of sub class
		s1.mobile(); // Calling own method
		s1.money();  // Calling super class method using subclass object
		
		Son2 s2=new Son2();  // Creating object of sub class
		s2.laptop(); // Calling own method
		s2.money();  // Calling super class method using subclass object
		
		Father.test();
		Son1.test();
		Son2.test();
		
	}

}
