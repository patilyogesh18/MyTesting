package contructor;

public class CS3 {
	// example for user defined constructor with parameters
	
	int num1;
	int num2;
	int num3;
	
		public CS3() // user defined without parameters
		{
			num1=10;
			num2=20;
			num3=30;
		}
		public CS3(int a)// user defined with single parameter constructor
		{
			num1=a;
		}
		public CS3(int a, int b)// user defined with two parameter constructor
		{
			num1=a;
			num2=b;
		}
		public CS3(int a, int b, int c)
		{
			num1=a;
			num2=b;
			num3=c;
		}
		public static void main(String[] args) 
		{
		
			CS3 C1=new CS3(); // object created with default value zero
			C1.addition();
			
			CS3 C2=new CS3(100); // user defined with single parameter constructor 
			C2.addition();
			
			CS3 C3=new CS3(80,90); // user defined with double parameter constructor
			C3.addition();
			
			CS3 c4= new CS3(70, 80, 90); // user defined with three parameter constructor 
			c4.addition();
			
			
				
		}
		
		public void addition() // non static method
		{
			int sum= num1+num2+num3;
			System.out.println("Addition is "+sum);
		}
		
	}


