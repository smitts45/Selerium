
package logic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Airplane {
	public static int D;
	public static int A;
	public static int M;
	public static String con;
	
	public static void rev()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to Delhi Airport: Please choose a destination corresponding number");
		System.out.println("Options: 1)Paris,2)Goa ");
		D = sc.nextInt();
	
		
	}
	public static void pay()
	{
		
		Scanner cc = new Scanner(System.in);
		System.out.println("                  ");
		
		System.out.println("Please put your 4 digit Credit Card number:->");
		M=cc.nextInt();
	
		Scanner cc1 = new Scanner(System.in);

		System.out.println("You have entered : " +  M + "  Is it Correct?");
		System.out.println("Enter Y for yes or N for NO :");
		con=cc1.next();
		if(con.equalsIgnoreCase("Y")) 
		{
			System.out.println("Your flight is confirmed. ENJOY!");
				
		}
		if(con.equalsIgnoreCase("N")) 
		{
			System.out.println("Please enter your Credit card number again");
			pay();
		}
			}
		
		
	
	public static void conditions()
	{
		if (D==1) 
			{
				Scanner	sc1= new Scanner(System.in);
				System.out.println("Please choose an Airline corresponding Number");
				System.out.println("Options: 1)USAirline, 2)Spicejet");
				A= sc1.nextInt();
					if(A==1) 
					{
						System.out.println("choice paris usair, price $2000");
						pay();
						
						
					}if(A==2)
						{
						System.out.println("choice paris spicejet, price $1800");
						pay();
						
						}
				}
					
				if (D==2) 
					{
					Scanner	sc1= new Scanner(System.in);
					System.out.println("Please choose an Airline corresponding number");
					System.out.println("Options: 1)USAirline, 2)Spicejet");
					A= sc1.nextInt();
			
				
					if(A==1) 
					{
						System.out.println("choice Goa usair, price $200");
						pay();
						
					}if(A==2)
						{
						System.out.println("choice Goa spicejet, price $180");
						pay();
						
						}
			
			}
	
					else if(A>2){
						System.out.println("incorrect input");
						rev();
						conditions();
						}
			
	}
						
	
	public static void main(String[] Args)
	{
		rev();
		if(D<3)
		{
			conditions();
			
		}
			else 
			{

				System.out.println("incorrect input");
				rev();
				conditions();

			}
	}
		
	}		
		
			
		
	
				
					
			
			
	
	


