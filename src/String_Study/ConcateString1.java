package String_Study;

public class ConcateString1 {

	public static void main(String[] args) 
	{
		String s1="Yogesh ";
		String s3=new String("Patil");
		String s2="Chhagan ";
		
		System.out.println((s1).concat(s2).concat(s3));
		
		String finalString=s1.concat(s2).concat(s3);
		System.out.println("Combination of All String is--->> "+finalString);
	}

}