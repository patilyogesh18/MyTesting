package exception;

public class multiple {

	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		
		try
		{
			int div=a/b;
			System.out.println();
		}
		catch(NullPointerException e)
		{
			System.out.println("Cant perform actions on null value");
		}
		catch(StringIndexOutOfBoundsException)
		{
			System.out.println("Check string index");
		}
	}

}
