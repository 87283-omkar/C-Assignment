package cdac;

public class matrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=2,col=2;
		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]= {{7,8},{9,10},{11,12}};
		int result[][]=new int[row][col];
		int sum=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				for(int k=0;k<3;k++)
				{
					sum=sum+a[i][k]*b[k][j];
				}
				result[i][j]=sum;
				sum=0;
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
