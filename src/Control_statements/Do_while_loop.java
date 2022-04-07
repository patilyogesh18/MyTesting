package Control_statements;

public class Do_while_loop {

	public static void main(String[] args) 
	{
	// i want to print Velocity 3 times
		int i=1;
		do
		{
			System.out.println("Velocity"); // 1,2,3-->4
			i++;
			
		}
		while(i<=3);
		// i want to print 50-1 numbers
		
		int j=2;
		do
		{
			System.out.println(j); //2,1
			j--; // 1,0
		}
		while(j>=1);
	}

}
