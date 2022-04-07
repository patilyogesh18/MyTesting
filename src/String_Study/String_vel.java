package String_Study;

public class String_vel {
	public static void main(String[] args) {
		String a="PUNE";
		String ab="";
		String cd=" ";
		String pq="Velocity";
		
		System.out.println(a.isEmpty());//false string is not empty
		
		System.out.println(ab.isEmpty());//true no space
		
		System.out.println(cd.isEmpty());//false due to space
		
		System.out.println("ab isBlank ? "+ab.isBlank());//true no char
		
		System.out.println("cd isBlank ? "+cd.isBlank());//true no char / space is allowed
		
		System.out.println("length of pq is "+pq.length());//8
		
		char output = pq.charAt(7);
		
		System.out.println("charAT 7 is "+output);//y
		
		System.out.println("char at index 1 " +pq.charAt(1));//e
		
		//String ef=null;
		//try {
       //	System.out.println(ef.length());
		//}catch(NullPointerException e){
		//	System.out.println("exception handled");
		//}
		
		
		String mn="Velocity";
		
		System.out.println(mn.startsWith("Vel"));
		
		System.out.println(mn.endsWith("ty"));
		
		String subString = mn.substring(4);
		
		System.out.println("Substring is "+subString);
		
		System.out.println(mn.substring(2, 7));
		System.out.println("=============================================");
		
		String p="Velocity ";
		String q="Corporate ";
		String r="Training ";
		String s="Center ";

		System.out.println(p.concat(q).concat(r).concat(s));
		
		String FinalString = p.concat(q).concat(r).concat(s);
		
		System.out.println("Combination of all string is--> "+FinalString);
	
		System.out.println(FinalString.indexOf('o'));
		System.out.println(FinalString.lastIndexOf('o'));
		
		System.out.println(FinalString.replace('o', 'i'));
		
		String k="NITIN";
		System.out.println(k.replace("NI", "SA"));
		
		String pl="I LOVE MY INDIA";
		System.out.println(pl.length());
	

	}


}

