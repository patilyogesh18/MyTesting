package exception;

public class arithmaticException 
{
	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
			int div=a/b;
			} 
		catch (ArithmeticException e) 
		{
			System.out.println("Cannot divide by Zero");
		}
		System.out.println("Hi All");
	
	}
}
