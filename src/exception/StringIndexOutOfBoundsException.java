package exception;

public class StringIndexOutOfBoundsException {

	public static void main(String[] args) {
		String name="Velocity";
		//System.out.println(name.charAt(10));
		try {
			name.charAt(11);
			} 
		catch (Exception e) 
		{
			System.out.println("Enter charAT agreement between 0-7");	
		}
		System.out.println("Hi All");
	}

}
