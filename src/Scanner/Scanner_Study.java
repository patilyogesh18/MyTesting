package Scanner;

import java.util.Scanner;
public class Scanner_Study {

	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		boolean b=true;
		while(b) {
		System.out.println("ENTER AGE");
		double age=sc1.nextDouble();
		if (age>=18)
		{
			System.out.println("Eligible for vaccination");
			
		}
		else
		{
			System.out.println("Not eligibal for vaccinatoin");
		}
		}
	}

}
