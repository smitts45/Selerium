package ArraysPrac;

import java.util.Scanner;

public class Ar3 {

	public static void main(String[] args) 
	{
		int mark[]= new int[4];
		int i;
		float sum=0, avg;
		Scanner scan= new Scanner(System.in);
		System.out.println(" Enter marks in subjects:");
		
		for( i=0; i<4; i++)
		{
		mark[i]=scan.nextInt();
		sum= sum+ mark[i];
		}
		System.out.println(" Sum of your marks :" + sum);
		
		avg= sum/4;
		System.out.println(" Your average marks are:" + avg);
			
	if (avg>80)
	{
	System.out.println(" Your grade is: A");
	}
	else if ( avg> 60 && avg<=80)
	{
	System.out.println(" Your grade is : B");
	}
	else if( avg>40 && avg<= 60)
	{
	System.out.println(" Your grade is : C");
	}
	
	else
	{
		System.out.println(" Your grade is:D");
	}
	}

}
