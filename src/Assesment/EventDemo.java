package Assesment;

public class EventDemo{
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try 
		{int c=a/b;
		System.out.println("c value is "+c);
		}catch(ArithmeticException e) {
			System.out.println("exception handled");
		}
	}	
}
