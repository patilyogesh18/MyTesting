package String_Study;

public class IsEmptyIsBlank {
	public static void main(String[] args) 
	{
		String ab="";
		String cd=" ";
		String pq="Velocity";
		System.out.println(ab.isEmpty());//This method returns true because String length is always '0'
		System.out.println(cd.isEmpty());//false, because string length is non zero.
	
		System.out.println(ab.isBlank());//returns true, as String ab contains ""
	
		System.out.println(cd.isBlank());//returns true, as String cd contains whitespace
		System.out.println(pq.isBlank());//returns false, as String pq contains String
	}

}
