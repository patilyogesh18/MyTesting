package Control_statements;

public class Else_if_Study {

	public static void main(String[] args) 
	{
		// if my marks are
		//
		//
		// >40-60--> 2nd class
		// >60->75--> 1st class 
		// >=75--> Distinction
		
		
		int marks=60;
		
		if (marks>40 & marks>60)
		{
			System.out.println("i am in 2nd class");	
		}
		
		else if (marks>=60 & marks<75) 	
		{
			System.out.println("i am in 1st class");
		}
		
		else if (marks>=75)
		{
			System.out.println("i am in Distinction");
		}
		
		else
		{
			System.out.println("i am fail");
		}
		
	}

}
