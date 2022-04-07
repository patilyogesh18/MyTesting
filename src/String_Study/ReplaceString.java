package String_Study;

public class ReplaceString {
	public static void main(String[] args) 
	{
		String name="Yogita";
		System.out.println(name.replace('Y', 'N'));
		System.out.println(name.replace("Yogita", "Chetan"));
		
		System.out.println(name.replace("Yog", "G"));
		
		String OutputAfterReplace = name.replace("ita", "esh");//Output Store in Reference Variable
		
		System.out.println(OutputAfterReplace);
	}

}
