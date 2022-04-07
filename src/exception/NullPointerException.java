package exception;

public class NullPointerException {

	public static void main(String[] args) {
		String name=null;
		//System.out.println(name.charAt(2));
		try {
			name.charAt(2);
			} 
		catch (Exception e) 
		{
		System.out.println("Cannot perform action on null value");	
		}
		System.out.println("Hi All");
	}

}
