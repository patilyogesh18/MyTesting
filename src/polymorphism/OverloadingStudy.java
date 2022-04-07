package polymorphism;

public class OverloadingStudy {

	public static void main(String[] args) 
	{
		
		OverloadingStudy o=new OverloadingStudy();
		o.add();
		o.add(10, 50);
		o.add(10.20f, 20.548f);
		
		

	}
	public void add() // Method with zero parameter
	{
		int a=10;
		int b=20;
		int sum=a+b;
	System.out.println("Sum is "+sum);	
	
	}
	
	public void add(int a,int b) // Method with two integer parameter
	{
		int sum=a+b;
		System.out.println("Sum is "+sum);
		
	}
	public void add(float a,float b) // Method with two float parameter
		{
			float sum=a+b;
			System.out.println("Sum is "+sum);
		}
		
	

}
