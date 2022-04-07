package String_Study;

public class CharAt {
	public static void main(String[] args)
	{
		String s1="velocity";
		String s2=new String("Dnyaneshwar");
		
		String S1="I love testing";
		
		char output=s1.charAt(6);
		System.out.println("Character at 6 is "+output);//Return character
		
		System.out.println(s2.charAt(9));
		//System.out.println(s2.charAt(15));//exception is run time error
		//System.out.println(s2.charAt(-1));
	}

}

