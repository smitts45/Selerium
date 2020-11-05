package ArraysPrac;

import java.util.Scanner;

public class Ar2S 
{
	
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println(" Array size:");
	int aSize = sc.nextInt();
	
	int[] a= new int[aSize];
	int sum=0;
	System.out.println(" Enter the Array elements:");
	for( int i=0; i< a.length; i++)
	{
		a[i]= sc.nextInt();
		System.out.println("a[" + i +"]="+ a[i]);
		sum=sum+a[i];
	}
	System.out.println("Sum of Array elements="+ sum);
			
	
}
}
