package String_Study;

public class StringTypes {

	public static void main(String[] args) {
		String s="velocity";
		String s1="training";
		String s2="velocity";
		String a=new String("velocity");
		String b=new String("Velocity");
		String c="VELOCIT";
		
		System.out.println(s.equals(a));//
		
		System.out.println(s==a);//==
		
		System.out.println(s.length());
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s1.toLowerCase());
		
		
		System.out.println(s.equalsIgnoreCase(a));  // true
		
		
		System.out.println(s.equalsIgnoreCase(c));  // true
		
		System.out.println(s.equalsIgnoreCase(c)); // false
		
		
		System.out.println(s.contains("VEL"));  // FALSE
		
		System.out.println(s.contains("Vel")); // FALSE
		
		System.out.println();
		
		String d=" ";
		String e="";
	
		System.out.println(e.isEmpty()); //true
		
		System.out.println(d.isBlank());  // true
		
		
		
		String j="Yogesh";
		
		System.out.println(s.charAt(3));
		
		System.out.println(j.endsWith("Yo"));
		
		System.out.println(j.startsWith("Yo"));
		
		
		System.out.println(j.replace("Yogesh","Yogita"));
		
		System.out.println(j.indexOf('g'));
		
		System.out.println(j.substring(3));
		
		System.out.println(j.substring(2,5));
		
		System.out.println("==================================");
			

	}

}
