package String_Study;

public class Substring {
	 static public void main(String[] args) 
		{
			String s1="velocity";
			String s2=new String("Dandekar");
			
			System.out.println(s1.substring(6));//index-1
			System.out.println(s2.substring(2, 7));//index-1
			System.out.println(s1.subSequence(3, 8));//
		}

}
