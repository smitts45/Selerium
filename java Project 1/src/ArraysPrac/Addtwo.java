package ArraysPrac;

public class Addtwo 
{
	public static void main(String[] args) 
	{
		int rows=2,col=2;
		int [][]a= { {10,20},{30,40}};
		/*
		 * a[0][0]=10; a[0][1]=20; a[1][0]=30; a[1][1]=40;
		 */
		
		int [][]b= { {1,2}, {3,4}};
		/*
		 * b[0][0]=1; b[0][1]=2; b[1][0]=3; b[1][1]=4;
		 */
		
		int  sum [][]= new int [rows][col];
		
		for (int i=0;i<rows;i++) 
		{
			for ( int j=0; j<col;j++) 
			{
				
			 sum [i][j] = a[i][j]+b[i][j];
			}
				
			}
		System.out.println("sum is");
		for( int[] r:sum)
		{
			for(int g:r)
			{
				System.out.print(g + " ");
			}
			System.out.println();
		}
	}
}
		
		/*
		 * int c,d,e,f; c= a[0][0]+ b[0][0]; d= a[0][1]+ b[0][1]; e= a[1][0]+ b[1][0];
		 * f= a[1][1]+ b[1][1];
		 * 
		 * System.out.println(c+ " "+ d); System.out.println(e+ " "+ f);
		 */
		
		
		
		/*for(int i=0;i<a.length;i++) 
		{
			for (int j=0;j<a.length; j++)
			{
				sum =  a[i,j] + b[i,j]
			}
		}*/
		


