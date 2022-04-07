package String_Study;

public class String_use {

	public static void main(String[] args) 
	{
	     String a="PUNE";
		//int a1=10;
	
		String m="VELOCITY";//
		String m1="Velocity";
		
		String n= new String("Velocity");//with using new keyword
		String n1=new String("Velocity");
		String n2=new String("Velocity Pune");
	
		System.out.println(m==m1);//FALSE
		
	    System.out.println(m==n);//FALSE
	    System.out.println(n.equals(n1));//true
	    
		System.out.println(m.equals(n));//false
		
	     System.out.println(n.equals(n1));//true
	
		System.out.println(m.length());//8
		
		System.out.println("length is "+n2.length());
		
		 int lengthOfn2 = n2.length();
		 
    	System.out.println("length is "+lengthOfn2);
		
		System.out.println(n2.toUpperCase());
		
		String n23 = n2.toUpperCase();
		
		System.out.println(n23.toLowerCase());
		
		
		
		
		String a2 ="velocity";
		String b="pune";
		
		System.out.println(a.equals(b));
		
		System.out.println(a.equalsIgnoreCase(b));
		
		System.out.println(a.contains("ve"));
		
		System.out.println(a.contains("n"));
		
		
		
		

	}


	

}

