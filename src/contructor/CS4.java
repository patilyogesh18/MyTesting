package contructor;

public class CS4 {
	
	int a; // Variable Declaration
	int b; // Variable Declaration
	int c; // Variable Declaration
	
	public CS4() // Zero parameter constructor
	{
		a=100;
		b=200;
		c=300;
		
		System.out.println("RUNNING ZERO PARAMETER CONSTRUCTOR");
		
	}
	
	public CS4(int num1) // Constructor with one parameter
		
	{
		a= num1;
		// int num1=100;
		
		System.out.println("VALUE OF a is "+a);
		System.out.println("RUNNING ONE PARAMETER CONSTRUCTOR");
		
	}
	
	public CS4(int num1,int num2) // Constructor with two parameter
	
	{
		
		a=num1;
		b=num2;
		System.out.println("Running constructor with two parameters");
			
	}
	
	
	public CS4(int num1,int num2,int num3) // Constructor with three parameter
	
	{
		
		a=num1;
		b=num2;
		c=num3;
		System.out.println("Running constructor with three parameters");
			
	}
	
	
	public static void main(String[] args) 
	
	{
		CS4 c40= new CS4();// created object
		c40.addition();
		
		CS4 c41= new CS4(800);// created object
		c41.addition();
		
		CS4 c42= new CS4(30, 60);
		c42.addition();
		
		CS4 c43= new CS4(10, 90, 100);
		c43.addition();
	
	}
	
	public void addition()
	{
		int sum=a+b+c;
		System.out.println("Addition is "+sum);
	}

}
