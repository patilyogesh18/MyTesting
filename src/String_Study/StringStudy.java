package String_Study;

public class StringStudy {
	public static void main(String[] args) 
	{
		String s1="Yogesh";
		String s2="Yogesh";
		
		System.out.println(s1==s2); //true because == deals with memory location-->constant pool area (String without new keyword)
		System.out.println(s1.equals(s2));// true bcoz s1.equals(s2) deals with case sensitive "content"-->constant pool area (String without new keyword)
		
		String s3=new String("Nilesh");
		String s4=new String("Nilesh");
		
		System.out.println(s3==s4);//false because == deals with memory location-->non constant pool area (String with new keyword)
		System.out.println(s3.equals(s4));//true bcoz s3.equals(s4) deals with case sensitive "content"-->non constant pool area (String with new keyword)
		
		System.out.println(s1==s3);//false, because memory location is different and == deals with memory location
		System.out.println(s2.equals(s4));//false, because content in s2 is not same as s4 and obj.equals(obj)-->deals with content
		
	}

}
