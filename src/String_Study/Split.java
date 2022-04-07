package String_Study;

public class Split {

	public static void main(String[] args) {
	
		String h="velocity corporate tranining centre";
		
		String l=" ";
		
		String[] output = h.split(l);
		
		for(int i=0;i<=output.length-1;i++)
		{
			System.out.println(output[i]);
		}
		
	}

}
