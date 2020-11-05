package com.study.practice;

public class IciciR implements Rbi_Inter



{

	public static void main(String[] args) 
	{
		IciciR i= new IciciR();
		i.withdraw();
		i.deposit();

	}

	@Override
	public void deposit() 
	{
		System.out.println(" This is Icici deposit");
		
	}

	@Override
	public void withdraw() 
	{
		System.out.println(" This is Icici withdraw");
		
	}

}
