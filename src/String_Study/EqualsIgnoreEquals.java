package String_Study;

public class EqualsIgnoreEquals {
	public static void main(String[] args) 
	{
		String s="Yogesh";
		String s1=new String("yogesh");
		
		System.out.println(s.equals(s1));
		
		String s2="Pune";
		String s3=new String("pUNE");
		
		System.out.println(s2.equalsIgnoreCase(s3));
		
		
	}

}
