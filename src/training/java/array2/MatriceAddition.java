package training.java.array2;

public class MatriceAddition {
	public static void main(String[] args) {
	
		int matrice1[][]= {{1,2,3},{4,5,6}};
		int matrice2[][]= {{1,1,1},{2,2,2}};
		int matrice3[][]=new int[2][3];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				matrice3[i][j]=matrice1[i][j]+matrice2[i][j];
			}
		}
		System.out.println("Sum of 2 Matrices :");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matrice3[i][j]+"  ");
			}
			System.out.println();
		}
	
}
}
		
		
	


