package PatternPrograming;

public class TriangleLeftDescending {

	public static void main(String[] args) {
		// Step 1 : Count rows=5   Count columns=5
		
		int star = 5; // no of star present in first rows
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}

	}

}
