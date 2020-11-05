package logic;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" Give some numbers:");
		int num = sc.nextInt();
		
		//using Algorithm
	/*	int rev=0;
		while ( num!=0)
		{
			rev= rev*10 + num%10;
			num= num/10;
		}
		
		*/
		
		//usingStringBuffer
		StringBuffer rev;
		StringBuffer sb= new StringBuffer(String.valueOf(num));
		rev= sb.reverse();
		
		//using StringBuilder
		/*
		 * StringBuilder sb= new StringBuilder(); sb.append(num); StringBuilder rev=
		 * sb.reverse();
		 * 
		 */
		
		
		System.out.println("Reverse :" + rev);
		
		
	}

		
}
