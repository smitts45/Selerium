package com.study.practice;

public class HdfcR implements Rbi_Inter

{
	int a= 10, b= 5, result;
	void sum()
	{
		result = a+b;
		System.out.println(" a+b in Hdfc =" + result);
	}
	
	public static void main(String[] args)
	{
		HdfcR i= new HdfcR();
		i.withdraw();
		i.deposit();
		i.sum();
	}

	@Override
	public void deposit()
	{
		char g='a';
		System.out.println(g);
		System.out.println(" This is Hdfc deposit");// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw()
	{
		System.out.println(" This is Hdfc withdraw");
		
	}

}
