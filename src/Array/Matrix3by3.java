package Array;

public class Matrix3by3 {

	public static void main(String[] args) {
		int YP[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i=0;i<=YP.length-1;i++) {
			for(int j=0;j<=YP.length-1;j++) {
				System.out.print(YP[i][j]+" ");
			}System.out.println();
		}
	
	}

}
