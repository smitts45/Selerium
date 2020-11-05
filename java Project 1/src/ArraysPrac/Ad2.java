package ArraysPrac;

public class Ad2 
{
	public static void main(String[] args) {
		
	
	int row=2 ,  col=3;
	 int a[][]= {{10,20,30}, { 40,50,60} };
	 int b[][]= {{1,2,3},{4,5,6}};
	 int [][]sum = new int[row][col];
	 
	 
	 for (int i=0;i<row; i++)
	 {
		 for (int j=0; j<col;j++) 
		 {
			 sum[i][j]= a[i][j] + b[i][j];
		 }
	 }	 
	 System.out.println("sum of aray:");
	 for(int[] r:sum) 
	 {
		 for(int g:r) 
		 {
			System.out.print(g+ " "); 
		 }
		 System.out.println();
	 }
	}
}