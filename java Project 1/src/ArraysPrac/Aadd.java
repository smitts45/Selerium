package ArraysPrac;

public class Aadd 
{
	public static void main(String[] args) 
	{
		
	
		int [] a={100,200,300,101,45};
		float sum = 0;
		
		for(int i=0;i<a.length;i++)
		{
			sum= sum + a[i];
		}
		System.out.println(" The total of array is: " +sum);
		}
}
