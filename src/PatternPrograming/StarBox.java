package PatternPrograming;

public class StarBox {

	public static void main(String[] args) {
		// Star Box
		
//		*****  // Rows=3
//		*****  // Column= 5
//		*****	// Always Start with Rows(Outer loop)

		
		for(int i=1;i<=3;i++)
		{ 
			// Outer for loop for rows(Count rows) Here 
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
