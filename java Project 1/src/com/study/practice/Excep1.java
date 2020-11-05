package com.study.practice;

import java.util.Scanner;

public class Excep1 extends Exception
{

	public Excep1(String string)
	{
		super(string);
	}

	public static void main(String[] args)
	{
		String name;
		Scanner sc= new Scanner(System.in);
		
		while(true)
		{
			System.out.println(" Enter the string: ");
			
			name=sc.next();
			
		
		try {
			if( name.length()!=10)
			{
			throw new Excep1("String should be 10  character"); 
			}
			else
			{
				System.out.println(name);
				
			}
		} 
		catch (Excep1 e) 
		{
			
			e.printStackTrace();
		}
	}
	}
}